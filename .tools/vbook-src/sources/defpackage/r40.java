package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r40 implements ja7 {
    public static final r40 a = new r40();
    public static final ru3 b = ru3.c("processName");
    public static final ru3 c = ru3.c("pid");
    public static final ru3 d = ru3.c("importance");
    public static final ru3 e = ru3.c("defaultProcess");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        oz1 oz1Var = (oz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((m70) oz1Var).a);
        m70 m70Var = (m70) oz1Var;
        ka7Var.add(c, m70Var.b);
        ka7Var.add(d, m70Var.c);
        ka7Var.add(e, m70Var.d);
    }
}
