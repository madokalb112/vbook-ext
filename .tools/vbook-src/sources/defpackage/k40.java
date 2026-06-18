package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k40 implements ja7 {
    public static final k40 a = new k40();
    public static final ru3 b = ru3.c("execution");
    public static final ru3 c = ru3.c("customAttributes");
    public static final ru3 d = ru3.c("internalKeys");
    public static final ru3 e = ru3.c("background");
    public static final ru3 f = ru3.c("currentProcessDetails");
    public static final ru3 g = ru3.c("appProcessDetails");
    public static final ru3 h = ru3.c("uiOrientation");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        pz1 pz1Var = (pz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((d70) pz1Var).a);
        d70 d70Var = (d70) pz1Var;
        ka7Var.add(c, d70Var.b);
        ka7Var.add(d, d70Var.c);
        ka7Var.add(e, d70Var.d);
        ka7Var.add(f, d70Var.e);
        ka7Var.add(g, d70Var.f);
        ka7Var.add(h, d70Var.g);
    }
}
