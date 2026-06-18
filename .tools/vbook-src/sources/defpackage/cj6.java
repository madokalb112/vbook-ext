package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cj6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ ga1 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ cj6(vx1 vx1Var, ga1 ga1Var, a07 a07Var, int i) {
        this.a = i;
        this.b = vx1Var;
        this.c = ga1Var;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        a07 a07Var = this.d;
        ga1 ga1Var = this.c;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new dj6(ga1Var, a07Var, jt1Var, 0), 3);
                break;
            default:
                ah1.J(vx1Var, null, null, new dj6(ga1Var, a07Var, jt1Var, 1), 3);
                break;
        }
        return hebVar;
    }
}
