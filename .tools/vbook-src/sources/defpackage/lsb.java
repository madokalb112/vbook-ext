package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lsb implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr9 b;

    public /* synthetic */ lsb(fr9 fr9Var, int i) {
        this.a = i;
        this.b = fr9Var;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        fr9 fr9Var = this.b;
        switch (i) {
            case 0:
                fr9Var.a(new pw5(c24Var, 29), jt1Var);
                break;
            case 1:
                fr9Var.a(new nsb(c24Var, 0), jt1Var);
                break;
            case 2:
                fr9Var.a(new nsb(c24Var, 1), jt1Var);
                break;
            default:
                fr9Var.a(new nsb(c24Var, 2), jt1Var);
                break;
        }
        return xx1Var;
    }
}
