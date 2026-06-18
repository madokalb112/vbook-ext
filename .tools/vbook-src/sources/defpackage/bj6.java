package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bj6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb8 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ bj6(vb8 vb8Var, a07 a07Var, int i) {
        this.a = i;
        this.b = vb8Var;
        this.c = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        vb8 vb8Var = this.b;
        switch (i) {
            case 0:
                a07Var.setValue(new xp4((float) vb8Var.c(360.0d), (float) vb8Var.c(1.0d), (float) vb8Var.c(1.0d), 1.0f));
                break;
            default:
                a07Var.setValue(new xp4((float) vb8Var.c(360.0d), (float) vb8Var.c(1.0d), (float) vb8Var.c(1.0d), 1.0f));
                break;
        }
        return hebVar;
    }
}
