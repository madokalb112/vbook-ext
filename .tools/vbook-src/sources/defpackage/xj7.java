package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xj7 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ ib4 c;
    public final /* synthetic */ int d;

    public /* synthetic */ xj7(ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = ou6Var;
        this.c = ib4Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        ib4 ib4Var = this.c;
        ou6 ou6Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t1c.C(qu1.x0(i2 | 1), ib4Var, dd4Var, ou6Var);
                break;
            case 1:
                sw1.a(qu1.x0(i2 | 1), ib4Var, dd4Var, ou6Var);
                break;
            default:
                ql9.b(qu1.x0(i2 | 1), ib4Var, dd4Var, ou6Var);
                break;
        }
        return hebVar;
    }
}
