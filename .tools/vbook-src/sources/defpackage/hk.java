package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hk implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ rj1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ hk(ou6 ou6Var, rj1 rj1Var, int i, int i2) {
        this.a = i2;
        this.b = ou6Var;
        this.c = rj1Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        rj1 rj1Var = this.c;
        ou6 ou6Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                sdc.K(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 1:
                sdc.L(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 2:
                ak2.d(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 3:
                fx1.b(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 4:
                e11.z(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                e11.y(ou6Var, rj1Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
