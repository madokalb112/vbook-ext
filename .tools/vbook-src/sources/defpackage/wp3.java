package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wp3 implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y34 b;

    public /* synthetic */ wp3(y34 y34Var, int i) {
        this.a = i;
        this.b = y34Var;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        y34 y34Var = this.b;
        switch (i) {
            case 0:
                Object objA = y34Var.a(new gm0(c24Var, 10), jt1Var);
                return objA == xx1Var ? objA : hebVar;
            case 1:
                Object objA2 = y34Var.a(new gm0(c24Var, 21), jt1Var);
                return objA2 == xx1Var ? objA2 : hebVar;
            default:
                Object objA3 = y34Var.a(new gm0(c24Var, 22), jt1Var);
                return objA3 == xx1Var ? objA3 : hebVar;
        }
    }
}
