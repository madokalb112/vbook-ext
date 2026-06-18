package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d40 implements ja7 {
    public static final d40 a = new d40();
    public static final ru3 b = ru3.c("sdkVersion");
    public static final ru3 c = ru3.c("gmpAppId");
    public static final ru3 d = ru3.c("platform");
    public static final ru3 e = ru3.c("installationUuid");
    public static final ru3 f = ru3.c("firebaseInstallationId");
    public static final ru3 g = ru3.c("firebaseAuthenticationToken");
    public static final ru3 h = ru3.c("appQualitySessionId");
    public static final ru3 i = ru3.c("buildVersion");
    public static final ru3 j = ru3.c("displayVersion");
    public static final ru3 k = ru3.c("session");
    public static final ru3 l = ru3.c("ndkPayload");
    public static final ru3 m = ru3.c("appExitInfo");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        zz1 zz1Var = (zz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((n60) zz1Var).b);
        n60 n60Var = (n60) zz1Var;
        ka7Var.add(c, n60Var.c);
        ka7Var.add(d, n60Var.d);
        ka7Var.add(e, n60Var.e);
        ka7Var.add(f, n60Var.f);
        ka7Var.add(g, n60Var.g);
        ka7Var.add(h, n60Var.h);
        ka7Var.add(i, n60Var.i);
        ka7Var.add(j, n60Var.j);
        ka7Var.add(k, n60Var.k);
        ka7Var.add(l, n60Var.l);
        ka7Var.add(m, n60Var.m);
    }
}
