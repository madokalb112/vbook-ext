package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fj implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ ib4 e;

    public /* synthetic */ fj(int i, ou6 ou6Var, boolean z, ib4 ib4Var, int i2) {
        this.a = 4;
        this.c = i;
        this.d = ou6Var;
        this.b = z;
        this.e = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        ou6 ou6Var = this.d;
        ib4 ib4Var = this.e;
        boolean z = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t1c.G(qu1.x0(i2 | 1), ib4Var, (dd4) obj, ou6Var, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                kl8.v(this.c, iX0, this.e, (dd4) obj, this.d, this.b);
                break;
            case 2:
                ((Integer) obj2).getClass();
                kl8.h(qu1.x0(i2 | 1), ib4Var, (dd4) obj, ou6Var, z);
                break;
            case 3:
                ((Integer) obj2).getClass();
                fw.u(qu1.x0(i2 | 1), ib4Var, (dd4) obj, ou6Var, z);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                vo1.M(this.c, iX02, this.e, (dd4) obj, this.d, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                vo1.z(qu1.x0(i2 | 1), ib4Var, (dd4) obj, ou6Var, z);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ fj(ou6 ou6Var, ib4 ib4Var, boolean z, int i) {
        this.a = 0;
        this.d = ou6Var;
        this.e = ib4Var;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ fj(boolean z, int i, ou6 ou6Var, ib4 ib4Var, int i2) {
        this.a = 1;
        this.b = z;
        this.c = i;
        this.d = ou6Var;
        this.e = ib4Var;
    }

    public /* synthetic */ fj(boolean z, ib4 ib4Var, ou6 ou6Var, int i) {
        this.a = 5;
        this.b = z;
        this.e = ib4Var;
        this.d = ou6Var;
        this.c = i;
    }

    public /* synthetic */ fj(boolean z, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = ou6Var;
        this.e = ib4Var;
        this.c = i;
    }
}
