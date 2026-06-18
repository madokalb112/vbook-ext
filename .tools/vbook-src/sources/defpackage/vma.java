package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vma implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;

    public /* synthetic */ vma(vx1 vx1Var, int i, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.b = vx1Var;
        this.c = i;
        this.d = a07Var;
        this.e = a07Var2;
        this.f = a07Var3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = this.b;
        switch (i) {
            case 0:
                ur9 ur9Var = zma.a;
                Boolean bool = Boolean.FALSE;
                a07 a07Var = this.d;
                a07Var.setValue(bool);
                ah1.J(vx1Var, null, null, new j47(true, this.c, this.e, this.f, a07Var, null), 3);
                break;
            default:
                ur9 ur9Var2 = zma.a;
                ah1.J(vx1Var, null, null, new j47(true, this.c, this.d, this.e, this.f, null), 3);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ vma(a07 a07Var, vx1 vx1Var, int i, a07 a07Var2, a07 a07Var3) {
        this.d = a07Var;
        this.b = vx1Var;
        this.c = i;
        this.e = a07Var2;
        this.f = a07Var3;
    }
}
