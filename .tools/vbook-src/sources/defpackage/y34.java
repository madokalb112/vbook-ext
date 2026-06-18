package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y34 implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp1 b;
    public final /* synthetic */ jx1 c;

    public /* synthetic */ y34(pp1 pp1Var, jx1 jx1Var, int i) {
        this.a = i;
        this.b = pp1Var;
        this.c = jx1Var;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        jx1 jx1Var = this.c;
        pp1 pp1Var = this.b;
        switch (i) {
            case 0:
                Object objA = pp1Var.a(new x34(c24Var, jx1Var, 0), jt1Var);
                return objA == xx1Var ? objA : hebVar;
            case 1:
                Object objA2 = pp1Var.a(new x34(c24Var, jx1Var, 1), jt1Var);
                return objA2 == xx1Var ? objA2 : hebVar;
            default:
                Object objA3 = pp1Var.a(new x34(c24Var, jx1Var, 2), jt1Var);
                return objA3 == xx1Var ? objA3 : hebVar;
        }
    }
}
