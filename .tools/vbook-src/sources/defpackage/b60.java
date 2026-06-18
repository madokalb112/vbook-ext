package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b60 implements ja7 {
    public static final b60 a = new b60();
    public static final ru3 b = ru3.c("appId");
    public static final ru3 c = ru3.c("deviceModel");
    public static final ru3 d = ru3.c("sessionSdkVersion");
    public static final ru3 e = ru3.c("osVersion");
    public static final ru3 f = ru3.c("logEnvironment");
    public static final ru3 g = ru3.c("androidAppInfo");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        qu quVar = (qu) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, quVar.a);
        ka7Var.add(c, Build.MODEL);
        ka7Var.add(d, "3.0.5");
        ka7Var.add(e, Build.VERSION.RELEASE);
        ka7Var.add(f, u36.LOG_ENVIRONMENT_PROD);
        ka7Var.add(g, quVar.b);
    }
}
