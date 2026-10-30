package io.nekohasekai.sfa.compose

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

object FrogLeapImport {
    suspend fun resolveMagicTicket(ticket: String): String = withContext(Dispatchers.IO) {
        val encoded = URLEncoder.encode(ticket, "UTF-8")
        val connection = URL("https://frogleap.click/api/tokens/magic/consume?ticket=$encoded")
            .openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.connectTimeout = 15_000
        connection.readTimeout = 30_000
        try {
            val status = connection.responseCode
            val body = (if (status in 200..299) connection.inputStream else connection.errorStream)
                .bufferedReader().use { it.readText() }
            if (status !in 200..299) error("订阅凭证验证失败 ($status)")
            val root = Json.parseToJsonElement(body).jsonObject
            val subUrl = root["data"]?.jsonObject?.get("sub_url")?.jsonPrimitive?.content
            if (subUrl.isNullOrBlank()) error("登录链接未返回订阅地址")
            subUrl
        } finally {
            connection.disconnect()
        }
    }
}
