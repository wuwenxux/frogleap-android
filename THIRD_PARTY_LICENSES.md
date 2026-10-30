# 第三方组件

## sing-box for Android / libbox

- 原生界面：https://github.com/SagerNet/sing-box-for-android （1.14.4，VERSION_CODE 746）
- 核心源码：https://github.com/SagerNet/sing-box （v1.14.4，commit c005f35300ce76427dc285481ec5695f5b179cd2）
- 保留内容：Dashboard、Profiles、Groups、Logs、设置及 VLESS、Reality、Hysteria2、TUN 和分流能力。
- 核心构建：`gomobile bind -target android/arm64 -androidapi 24 -javapkg=io.nekohasekai -libname=box -ldflags=-checklinkname=0 -tags with_gvisor,with_quic,with_utls,with_clash_api,badlinkname,tfogo_checklinkname0 ./experimental/libbox`。
- 许可证：GNU General Public License v3.0 or later，完整文本见 `LICENSE-sing-box`。

FrogLeap 使用独立品牌，不使用 SFA 名称或暗示其官方关联。原生源码与修改均在本仓库公开。
