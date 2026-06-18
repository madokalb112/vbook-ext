package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k59 {
    public static final k59 a = new k59();
    public static final lp8 b;

    static {
        hf5 hf5Var = new hf5();
        hf5Var.registerEncoder(j59.class, e60.a);
        hf5Var.registerEncoder(p59.class, f60.a);
        hf5Var.registerEncoder(u32.class, c60.a);
        hf5Var.registerEncoder(qu.class, b60.a);
        hf5Var.registerEncoder(vb.class, a60.a);
        hf5Var.registerEncoder(e38.class, d60.a);
        hf5Var.d = true;
        b = new lp8(hf5Var, 21);
    }

    public static qu a(gy3 gy3Var) throws PackageManager.NameNotFoundException {
        gy3Var.a();
        Context context = gy3Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gy3Var.a();
        String str = gy3Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        gy3Var.a();
        e38 e38VarE = y3.e(context);
        gy3Var.a();
        return new qu(str, new vb(packageName, str2, strValueOf, e38VarE, y3.a(context)));
    }
}
