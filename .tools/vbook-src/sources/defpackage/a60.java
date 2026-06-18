package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a60 implements ja7 {
    public static final a60 a = new a60();
    public static final ru3 b = ru3.c("packageName");
    public static final ru3 c = ru3.c("versionName");
    public static final ru3 d = ru3.c("appBuildVersion");
    public static final ru3 e = ru3.c("deviceManufacturer");
    public static final ru3 f = ru3.c("currentProcessDetails");
    public static final ru3 g = ru3.c("appProcessDetails");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        vb vbVar = (vb) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, vbVar.a);
        ka7Var.add(c, vbVar.b);
        ka7Var.add(d, vbVar.c);
        ka7Var.add(e, Build.MANUFACTURER);
        ka7Var.add(f, vbVar.d);
        ka7Var.add(g, vbVar.e);
    }
}
