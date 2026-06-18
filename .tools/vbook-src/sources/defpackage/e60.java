package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e60 implements ja7 {
    public static final e60 a = new e60();
    public static final ru3 b = ru3.c("eventType");
    public static final ru3 c = ru3.c("sessionData");
    public static final ru3 d = ru3.c("applicationInfo");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        j59 j59Var = (j59) obj;
        ka7 ka7Var = (ka7) obj2;
        j59Var.getClass();
        ka7Var.add(b, xh3.SESSION_START);
        ka7Var.add(c, j59Var.a);
        ka7Var.add(d, j59Var.b);
    }
}
