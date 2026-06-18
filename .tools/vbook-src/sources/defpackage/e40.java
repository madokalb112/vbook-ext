package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e40 implements ja7 {
    public static final e40 a = new e40();
    public static final ru3 b = ru3.c("files");
    public static final ru3 c = ru3.c("orgId");

    @Override // defpackage.wc3
    public final void encode(Object obj, Object obj2) {
        ez1 ez1Var = (ez1) obj;
        ka7 ka7Var = (ka7) obj2;
        ka7Var.add(b, ((t60) ez1Var).a);
        ka7Var.add(c, ((t60) ez1Var).b);
    }
}
