package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t40 implements ja7 {
    public static final t40 a = new t40();
    public static final ru3 b = ru3.c("timestamp");
    public static final ru3 c = ru3.c("type");
    public static final ru3 d = ru3.c("app");
    public static final ru3 e = ru3.c("device");
    public static final ru3 f = ru3.c("log");
    public static final ru3 g = ru3.c("rollouts");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        vz1 vz1Var = (vz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((c70) vz1Var).a);
        c70 c70Var = (c70) vz1Var;
        ka7Var.add(c, c70Var.b);
        ka7Var.add(d, c70Var.c);
        ka7Var.add(e, c70Var.d);
        ka7Var.add(f, c70Var.e);
        ka7Var.add(g, c70Var.f);
    }
}
