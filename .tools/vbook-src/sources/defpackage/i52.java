package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i52 implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b24 b;
    public final /* synthetic */ String c;

    public /* synthetic */ i52(b24 b24Var, String str, int i) {
        this.a = i;
        this.b = b24Var;
        this.c = str;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        String str = this.c;
        b24 b24Var = this.b;
        switch (i) {
            case 0:
                Object objA = b24Var.a(new h52(c24Var, str, 0), jt1Var);
                return objA == xx1Var ? objA : hebVar;
            case 1:
                Object objA2 = b24Var.a(new h52(c24Var, str, 1), jt1Var);
                return objA2 == xx1Var ? objA2 : hebVar;
            case 2:
                Object objA3 = b24Var.a(new h52(c24Var, str, 2), jt1Var);
                return objA3 == xx1Var ? objA3 : hebVar;
            case 3:
                Object objA4 = b24Var.a(new h52(c24Var, str, 3), jt1Var);
                return objA4 == xx1Var ? objA4 : hebVar;
            case 4:
                Object objA5 = b24Var.a(new h52(c24Var, str, 4), jt1Var);
                return objA5 == xx1Var ? objA5 : hebVar;
            default:
                Object objA6 = b24Var.a(new h52(c24Var, str, 5), jt1Var);
                return objA6 == xx1Var ? objA6 : hebVar;
        }
    }
}
