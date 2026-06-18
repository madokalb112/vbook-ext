package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gca implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ sw8 c;
    public final /* synthetic */ yba d;

    public /* synthetic */ gca(vx1 vx1Var, sw8 sw8Var, yba ybaVar, int i) {
        this.a = i;
        this.b = vx1Var;
        this.c = sw8Var;
        this.d = ybaVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        sw8 sw8Var = this.c;
        yba ybaVar = this.d;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new lca(sw8Var, ybaVar, (jt1) null, 3), 3);
                break;
            case 1:
                ah1.J(vx1Var, null, null, new lca(sw8Var, ybaVar, (jt1) null, 0), 3);
                break;
            case 2:
                ah1.J(vx1Var, null, null, new lca(ybaVar, sw8Var, (jt1) null, 1), 3);
                break;
            default:
                ah1.J(vx1Var, null, null, new lca(ybaVar, sw8Var, (jt1) null, 2), 3);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ gca(vx1 vx1Var, yba ybaVar, sw8 sw8Var, int i) {
        this.a = i;
        this.b = vx1Var;
        this.d = ybaVar;
        this.c = sw8Var;
    }
}
