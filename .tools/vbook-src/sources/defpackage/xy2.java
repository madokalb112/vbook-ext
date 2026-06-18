package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xy2 extends lx3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy2(String str, m62 m62Var, int i) {
        super(str, m62Var);
        this.d = i;
    }

    @Override // defpackage.kka
    public final oka f() {
        switch (this.d) {
            case 0:
                return new oka("docx", "docx", mc3.a, false, false);
            case 1:
                return new oka("fb2", "fb2", mc3.a, false, false);
            case 2:
                return new oka("html", "html", mc3.a, false, false);
            case 3:
                return new oka("mobi", "mobi", mc3.a, false, false);
            case 4:
                return new oka("umd", "umd", mc3.a, false, false);
            default:
                return new oka("zip", "zip", mc3.a, false, false);
        }
    }
}
