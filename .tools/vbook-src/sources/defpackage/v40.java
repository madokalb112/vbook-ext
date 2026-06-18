package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v40 implements ja7 {
    public static final v40 a = new v40();
    public static final ru3 b = ru3.c("rolloutVariant");
    public static final ru3 c = ru3.c("parameterKey");
    public static final ru3 d = ru3.c("parameterValue");
    public static final ru3 e = ru3.c("templateVersion");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        tz1 tz1Var = (tz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((r70) tz1Var).a);
        r70 r70Var = (r70) tz1Var;
        ka7Var.add(c, r70Var.b);
        ka7Var.add(d, r70Var.c);
        ka7Var.add(e, r70Var.d);
    }
}
