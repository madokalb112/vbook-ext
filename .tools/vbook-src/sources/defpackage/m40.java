package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m40 implements ja7 {
    public static final m40 a = new m40();
    public static final ru3 b = ru3.c("threads");
    public static final ru3 c = ru3.c("exception");
    public static final ru3 d = ru3.c("appExitInfo");
    public static final ru3 e = ru3.c("signal");
    public static final ru3 f = ru3.c("binaries");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        nz1 nz1Var = (nz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((e70) nz1Var).a);
        e70 e70Var = (e70) nz1Var;
        ka7Var.add(c, e70Var.b);
        ka7Var.add(d, e70Var.c);
        ka7Var.add(e, e70Var.d);
        ka7Var.add(f, e70Var.e);
    }
}
