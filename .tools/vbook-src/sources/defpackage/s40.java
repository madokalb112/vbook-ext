package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s40 implements ja7 {
    public static final s40 a = new s40();
    public static final ru3 b = ru3.c("batteryLevel");
    public static final ru3 c = ru3.c("batteryVelocity");
    public static final ru3 d = ru3.c("proximityOn");
    public static final ru3 e = ru3.c("orientation");
    public static final ru3 f = ru3.c("ramUsed");
    public static final ru3 g = ru3.c("diskUsed");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        qz1 qz1Var = (qz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((o70) qz1Var).a);
        o70 o70Var = (o70) qz1Var;
        ka7Var.add(c, o70Var.b);
        ka7Var.add(d, o70Var.c);
        ka7Var.add(e, o70Var.d);
        ka7Var.add(f, o70Var.e);
        ka7Var.add(g, o70Var.f);
    }
}
