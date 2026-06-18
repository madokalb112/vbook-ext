package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l40 implements ja7 {
    public static final l40 a = new l40();
    public static final ru3 b = ru3.c("baseAddress");
    public static final ru3 c = ru3.c("size");
    public static final ru3 d = ru3.c("name");
    public static final ru3 e = ru3.c("uuid");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        iz1 iz1Var = (iz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((f70) iz1Var).a);
        f70 f70Var = (f70) iz1Var;
        ka7Var.add(c, f70Var.b);
        ka7Var.add(d, f70Var.c);
        String str = f70Var.d;
        ka7Var.add(e, str != null ? str.getBytes(zz1.a) : null);
    }
}
