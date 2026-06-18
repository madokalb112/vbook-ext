package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xk0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ou6 c;

    public /* synthetic */ xk0(ou6 ou6Var, boolean z, int i) {
        this.a = 2;
        this.c = ou6Var;
        this.b = z;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ou6 ou6Var = this.c;
        boolean z = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ah1.c(qu1.x0(1), dd4Var, ou6Var, z);
                break;
            case 1:
                fe.i(qu1.x0(1), dd4Var, ou6Var, z);
                break;
            case 2:
                bx1.o(qu1.x0(7), dd4Var, ou6Var, z);
                break;
            case 3:
                gc1.x(qu1.x0(1), dd4Var, ou6Var, z);
                break;
            case 4:
                gc1.w(qu1.x0(1), dd4Var, ou6Var, z);
                break;
            case 5:
                gc1.y(qu1.x0(1), dd4Var, ou6Var, z);
                break;
            default:
                gc1.z(qu1.x0(1), dd4Var, ou6Var, z);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ xk0(boolean z, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = ou6Var;
    }
}
