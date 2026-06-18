package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n40 implements ja7 {
    public static final n40 a = new n40();
    public static final ru3 b = ru3.c("type");
    public static final ru3 c = ru3.c("reason");
    public static final ru3 d = ru3.c("frames");
    public static final ru3 e = ru3.c("causedBy");
    public static final ru3 f = ru3.c("overflowCount");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        jz1 jz1Var = (jz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((g70) jz1Var).a);
        g70 g70Var = (g70) jz1Var;
        ka7Var.add(c, g70Var.b);
        ka7Var.add(d, g70Var.c);
        ka7Var.add(e, g70Var.d);
        ka7Var.add(f, g70Var.e);
    }
}
