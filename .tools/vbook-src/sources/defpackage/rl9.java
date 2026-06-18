package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rl9 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl9 b;

    public /* synthetic */ rl9(yl9 yl9Var, int i) {
        this.a = i;
        this.b = yl9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        yl9 yl9Var = this.b;
        switch (i) {
            case 0:
                za1 za1VarA = vtb.a(yl9Var);
                aj2 aj2Var = rw2.a;
                yl9Var.g(za1VarA, nh2.c, new vl9(yl9Var, jt1Var, 1));
                return hebVar;
            case 1:
                if (!yl9Var.O && yl9Var.P) {
                    za1 za1VarA2 = vtb.a(yl9Var);
                    aj2 aj2Var2 = rw2.a;
                    yl9Var.g(za1VarA2, nh2.c, new vl9(yl9Var, jt1Var, 0));
                }
                return hebVar;
            default:
                return fc1.D0(fc1.S0(yl9Var.Q, 5), " ", null, null, new qc9(19), 30);
        }
    }
}
