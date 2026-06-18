package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o40 implements ja7 {
    public static final o40 a = new o40();
    public static final ru3 b = ru3.c("name");
    public static final ru3 c = ru3.c("code");
    public static final ru3 d = ru3.c("address");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        kz1 kz1Var = (kz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((h70) kz1Var).a);
        h70 h70Var = (h70) kz1Var;
        ka7Var.add(c, h70Var.b);
        ka7Var.add(d, h70Var.c);
    }
}
