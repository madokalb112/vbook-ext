package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j40 implements ja7 {
    public static final j40 a = new j40();
    public static final ru3 b = ru3.c("generator");
    public static final ru3 c = ru3.c("identifier");
    public static final ru3 d = ru3.c("appQualitySessionId");
    public static final ru3 e = ru3.c("startedAt");
    public static final ru3 f = ru3.c("endedAt");
    public static final ru3 g = ru3.c("crashed");
    public static final ru3 h = ru3.c("app");
    public static final ru3 i = ru3.c("user");
    public static final ru3 j = ru3.c("os");
    public static final ru3 k = ru3.c("device");
    public static final ru3 l = ru3.c("events");
    public static final ru3 m = ru3.c("generatorType");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        yz1 yz1Var = (yz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((w60) yz1Var).a);
        w60 w60Var = (w60) yz1Var;
        ka7Var.add(c, w60Var.b.getBytes(zz1.a));
        ka7Var.add(d, w60Var.c);
        ka7Var.add(e, w60Var.d);
        ka7Var.add(f, w60Var.e);
        ka7Var.add(g, w60Var.f);
        ka7Var.add(h, w60Var.g);
        ka7Var.add(i, w60Var.h);
        ka7Var.add(j, w60Var.i);
        ka7Var.add(k, w60Var.j);
        ka7Var.add(l, w60Var.k);
        ka7Var.add(m, w60Var.l);
    }
}
