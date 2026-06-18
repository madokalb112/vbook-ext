package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g40 implements ja7 {
    public static final g40 a = new g40();
    public static final ru3 b = ru3.c("identifier");
    public static final ru3 c = ru3.c("version");
    public static final ru3 d = ru3.c("displayVersion");
    public static final ru3 e = ru3.c("organization");
    public static final ru3 f = ru3.c("installationUuid");
    public static final ru3 g = ru3.c("developmentPlatform");
    public static final ru3 h = ru3.c("developmentPlatformVersion");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        gz1 gz1Var = (gz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((x60) gz1Var).a);
        x60 x60Var = (x60) gz1Var;
        ka7Var.add(c, x60Var.b);
        ka7Var.add(d, x60Var.c);
        ka7Var.add(e, (Object) null);
        ka7Var.add(f, x60Var.d);
        ka7Var.add(g, x60Var.e);
        ka7Var.add(h, x60Var.f);
    }
}
