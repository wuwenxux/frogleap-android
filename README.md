# FrogLeap Android

FrogLeap 官方 Android 客户端，目标是让用户在官网购买后，通过一键导入订阅即可直接连接使用。

## 首版范围

- 官网一键唤起 App 并自动导入本人订阅。
- 手动粘贴 FrogLeap 官方订阅链接作为兜底。
- 一键连接与断开，自动选择最优节点。
- 启动时自动更新订阅。
- 深色黑绿、浅色白绿，跟随系统主题。
- 支持 VLESS + WebSocket、Reality、Hysteria2 和现有 CN 分流规则。

首版不包含 App 内购买、邮箱登录、设备管理、手动选节点或设置页；购买与续费统一在官网完成。

## 安全与构建

- 不在 APK 中写死公共订阅。订阅链接是用户私密凭证，只从 FrogLeap 官方域名导入并保存在应用私有目录。
- `local.properties`、签名密钥、构建工具链、AAR 和 APK 均不提交。
- VPN 核心使用 sing-box libbox，固定版本与构建方式见 `THIRD_PARTY_LICENSES.md`。

## 许可证

GNU General Public License v3.0 or later，见 `LICENSE`。
