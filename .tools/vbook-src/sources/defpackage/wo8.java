package defpackage;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wo8 implements ib4 {
    public final /* synthetic */ int a;

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(e7a.b("ro.miui.ui.version.name").equals("V816"));
            case 1:
                return Boolean.valueOf(xo8.a("android.miui.R"));
            case 2:
                return Boolean.valueOf(xo8.a("com.vivo.VivoSystemFrameworkFactory"));
            case 3:
                return Boolean.valueOf(xo8.a("vivo.R"));
            case 4:
                if (!xo8.a("ohos.system.version.SystemVersion") || bw9.a0(e7a.b("ro.build.ohos.devicetype")) || (bw9.a0(e7a.b("ro.build.hide.matchers")) && bw9.a0(e7a.b("ro.build.hide.replacements")))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (((Boolean) xo8.f.getValue()).booleanValue() || (!xo8.a("androidhwext.R") && !xo8.a("com.huawei.android.app.HwActivityManager"))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf((!((Boolean) xo8.c.getValue()).booleanValue() || ((Boolean) xo8.a.getValue()).booleanValue() || ((Boolean) xo8.b.getValue()).booleanValue()) ? false : true);
            case 7:
                if (!((Boolean) xo8.c.getValue()).booleanValue() || (!((Boolean) xo8.a.getValue()).booleanValue() && !((Boolean) xo8.b.getValue()).booleanValue())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (!xo8.a("oppo.R") && !xo8.a("oplus.R") && !xo8.a("com.color.os.ColorBuild")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(((Boolean) xo8.e.getValue()).booleanValue() && !((Boolean) xo8.d.getValue()).booleanValue());
            case 10:
                return Boolean.valueOf(((Boolean) xo8.e.getValue()).booleanValue() && ((Boolean) xo8.d.getValue()).booleanValue());
            case 11:
                if (!xo8.a("flyme.app.IActivityManagerExt") && !xo8.a("flyme.config.FlymeFeature") && !xo8.a("com.meizu.server.AppOpsHandle")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (!xo8.a("com.samsung.android.ProductPackagesRune") && !xo8.a("com.samsung.epic.request") && !xo8.a("knox.security.keystore.KnoxAndroidKeyStoreSpi")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (!xo8.a("com.zui.internal.app.IAppFaceService") && !xo8.a("zuisdk.app.AlertActivity") && !xo8.a("zui.icon.ExtraResources") && !xo8.a("com.zui.internal.app.ZuiShutdownActivity")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (!xo8.a("cn.nubia.internal.R") && !xo8.a("com.nubia.internal.R") && !xo8.a("cn.nubia.tcsystem.INubiaTcSystemCallback") && !xo8.a("com.nubia.tcsystem.INubiaTcSystemCallback")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                return Boolean.valueOf((xo8.a("com.zte.PlatformConfig") || xo8.a("com.zte.zsdk.IPolicyManager") || xo8.a("zpub.res.R")) && xo8.a("nubia.util.BlurUtil"));
            case 16:
                if (!xo8.a("com.asus.cta.CtaAction") && !xo8.a("com.asus.ims.rogproxy.IRogProxy")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (!xo8.a("com.hmct.epd.EpdManager") && !xo8.a("com.hmct.facelock.IDetectedCallback") && !xo8.a("com.hmct.ThemeUtils.ConfigNotifier") && !xo8.a("com.hmct.ThemeUtils.FontUtil") && !xo8.a("com.hmct.ThemeUtils.FontUtilException") && !xo8.a("com.hmct.ThemeUtils.ThemeUtil")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                return new oq8();
            case 19:
                return new pq8();
            case 20:
                return new qq8();
            case 21:
                return new os8(new LinkedHashMap());
            case 22:
                ur9 ur9Var = ts8.a;
                return null;
            case 23:
                return new eu8(fu8.a(1.0f, 1.0f));
            case 24:
                return new HashSet();
            case 25:
                throw new IllegalStateException("No ScreenController provided");
            case 26:
                return new ww8(0);
            case 27:
                return new r19(1L);
            case 28:
                fn1 fn1Var = s19.a;
                return null;
            default:
                return dk9.x(Boolean.FALSE);
        }
    }
}
