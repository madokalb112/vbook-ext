package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b40 implements ja7 {
    public static final b40 a = new b40();
    public static final ru3 b = ru3.c("pid");
    public static final ru3 c = ru3.c("processName");
    public static final ru3 d = ru3.c("reasonCode");
    public static final ru3 e = ru3.c("importance");
    public static final ru3 f = ru3.c("pss");
    public static final ru3 g = ru3.c("rss");
    public static final ru3 h = ru3.c("timestamp");
    public static final ru3 i = ru3.c("traceFile");
    public static final ru3 j = ru3.c("buildIdMappingForArch");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        bz1 bz1Var = (bz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((q60) bz1Var).a);
        q60 q60Var = (q60) bz1Var;
        ka7Var.add(c, q60Var.b);
        ka7Var.add(d, q60Var.c);
        ka7Var.add(e, q60Var.d);
        ka7Var.add(f, q60Var.e);
        ka7Var.add(g, q60Var.f);
        ka7Var.add(h, q60Var.g);
        ka7Var.add(i, q60Var.h);
        ka7Var.add(j, q60Var.i);
    }
}
