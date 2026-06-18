package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zt1 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ ls9 c;

    public /* synthetic */ zt1(kb4 kb4Var, ls9 ls9Var, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = ls9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        ls9 ls9Var = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                kb4Var.invoke(Integer.valueOf(ls9Var.d));
                break;
            case 1:
                kb4Var.invoke(ls9Var.e);
                break;
            case 2:
                kb4Var.invoke(Integer.valueOf(ls9Var.d));
                break;
            default:
                kb4Var.invoke(ls9Var.e);
                break;
        }
        return hebVar;
    }
}
