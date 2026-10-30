# 第三方组件

## sing-box / libbox

- 项目：https://github.com/SagerNet/sing-box
- 固定版本：v1.14.4（commit c005f35300ce76427dc285481ec5695f5b179cd2）
- 用途：VLESS、Reality、Hysteria2、TUN 与分流核心。
- 构建方式：`gomobile bind -target android/arm64 -androidapi 26 -javapkg=io.nekohasekai -libname=box -tags 'with_gvisor,with_quic,with_utls,with_clash_api' ./experimental/libbox`，只保留 FrogLeap 所需协议。
- 许可证：GNU General Public License v3.0 or later，完整文本见 `LICENSE-sing-box`。

Android 平台接口实现参考了 sing-box for Android 的 `VPNService`、`PlatformInterfaceWrapper` 与 `BoxService`。该项目同样采用 GPLv3 或更高版本；FrogLeap 使用独立品牌，不使用 SFA 名称或暗示其官方关联。对应源码随本仓库提供。
