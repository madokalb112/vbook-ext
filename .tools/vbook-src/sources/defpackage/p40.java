package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p40 implements ja7 {
    public static final p40 a = new p40();
    public static final ru3 b = ru3.c("name");
    public static final ru3 c = ru3.c("importance");
    public static final ru3 d = ru3.c("frames");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        mz1 mz1Var = (mz1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((i70) mz1Var).a);
        i70 i70Var = (i70) mz1Var;
        ka7Var.add(c, i70Var.b);
        ka7Var.add(d, i70Var.c);
    }
}
