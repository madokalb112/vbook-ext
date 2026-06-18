package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class om6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ pb d;

    public /* synthetic */ om6(int i, pb pbVar, vx1 vx1Var, ib4 ib4Var) {
        this.a = i;
        this.b = vx1Var;
        this.c = ib4Var;
        this.d = pbVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        pb pbVar = this.d;
        ib4 ib4Var = this.c;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new qm6(pbVar, null, 0), 3);
                ib4Var.invoke();
                break;
            case 1:
                ah1.J(vx1Var, null, null, new qm6(pbVar, null, 1), 3);
                ib4Var.invoke();
                break;
            case 2:
                ah1.J(vx1Var, null, null, new qm6(pbVar, null, 2), 3);
                ib4Var.invoke();
                break;
            default:
                ah1.J(vx1Var, null, null, new qm6(pbVar, null, 3), 3);
                ib4Var.invoke();
                break;
        }
        return hebVar;
    }
}
