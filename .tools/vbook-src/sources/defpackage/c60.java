package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c60 implements ja7 {
    public static final c60 a = new c60();
    public static final ru3 b = ru3.c("performance");
    public static final ru3 c = ru3.c("crashlytics");
    public static final ru3 d = ru3.c("sessionSamplingRate");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        u32 u32Var = (u32) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, u32Var.a);
        ka7Var.add(c, u32Var.b);
        ka7Var.add(d, u32Var.c);
    }
}
