package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i40 implements ja7 {
    public static final i40 a = new i40();
    public static final ru3 b = ru3.c("arch");
    public static final ru3 c = ru3.c("model");
    public static final ru3 d = ru3.c("cores");
    public static final ru3 e = ru3.c("ram");
    public static final ru3 f = ru3.c("diskSpace");
    public static final ru3 g = ru3.c("simulator");
    public static final ru3 h = ru3.c("state");
    public static final ru3 i = ru3.c("manufacturer");
    public static final ru3 j = ru3.c("modelClass");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        hz1 hz1Var = (hz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((a70) hz1Var).a);
        a70 a70Var = (a70) hz1Var;
        ka7Var.add(c, a70Var.b);
        ka7Var.add(d, a70Var.c);
        ka7Var.add(e, a70Var.d);
        ka7Var.add(f, a70Var.e);
        ka7Var.add(g, a70Var.f);
        ka7Var.add(h, a70Var.g);
        ka7Var.add(i, a70Var.h);
        ka7Var.add(j, a70Var.i);
    }
}
