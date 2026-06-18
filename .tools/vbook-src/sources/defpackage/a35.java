package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class a35 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ a35(int i, int i2, int i3, ou6 ou6Var) {
        this.c = i;
        this.d = i2;
        this.b = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        int i3 = this.c;
        ou6 ou6Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vv1.c(i3, i2, ou6Var, dd4Var, qu1.x0(1));
                break;
            default:
                zk9.b(qu1.x0(i3 | 1), i2, dd4Var, ou6Var);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ a35(ou6 ou6Var, int i, int i2) {
        this.b = ou6Var;
        this.c = i;
        this.d = i2;
    }
}
