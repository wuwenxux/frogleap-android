# FrogLeap Android

FrogLeap 官方 Android 客户端，基于 sing-box for Android 1.14.4 原生界面维护。

## 当前版本

- 保留 sing-box 原生 Dashboard、Profiles、Groups、Logs 和设置界面。
- 应用名、包名、图标改为 FrogLeap，深色黑绿、浅色白绿，关闭动态配色。
- 邮箱或官网链接可直接唤起 App，并进入原生远程配置导入确认页。
- 不增加登录、注册、支付或设备资料收集；购买和续费仍在官网完成。
- 禁止系统备份订阅配置，签名密钥和本地构建产物不入库。

## 构建

在 Mac mini 上通过 `ssh mac` 维护，工具链位于 `~/Projects/frogleap-toolchain`：

```bash
./gradlew testOtherDebugUnitTest assembleOtherRelease
```

通用安装包输出到 `app/build/outputs/apk/other/release/FrogLeap-1.14.4-universal.apk`。

`./scripts/publish-build.sh -n release` 可同步已有构建产物到构建服务器。

## 第三方许可

sing-box / SFA 使用 GPLv3 or later，固定版本与构建信息见 `THIRD_PARTY_LICENSES.md`。
