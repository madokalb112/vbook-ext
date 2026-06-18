package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i50 implements ja7 {
    public static final i50 a = new i50();
    public static final ru3 b = ru3.c("rolloutId");
    public static final ru3 c = ru3.c("parameterKey");
    public static final ru3 d = ru3.c("parameterValue");
    public static final ru3 e = ru3.c("variantId");
    public static final ru3 f = ru3.c("templateVersion");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        vo8 vo8Var = (vo8) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((s80) vo8Var).b);
        s80 s80Var = (s80) vo8Var;
        ka7Var.add(c, s80Var.c);
        ka7Var.add(d, s80Var.d);
        ka7Var.add(e, s80Var.e);
        ka7Var.add(f, s80Var.f);
    }
}
