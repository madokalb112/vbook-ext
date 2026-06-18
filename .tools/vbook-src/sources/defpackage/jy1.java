package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jy1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw8 b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ int d;

    public /* synthetic */ jy1(int i, sw8 sw8Var, ou6 ou6Var, int i2) {
        this.a = 2;
        this.d = i;
        this.b = sw8Var;
        this.c = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        ou6 ou6Var = this.c;
        sw8 sw8Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ky1.a(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 1:
                cx1.o(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 2:
                p7c.u(i2, sw8Var, ou6Var, dd4Var, qu1.x0(385));
                break;
            case 3:
                e11.B(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 4:
                e11.B(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 5:
                ef9.a(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                oh9.c(sw8Var, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ jy1(sw8 sw8Var, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = sw8Var;
        this.c = ou6Var;
        this.d = i;
    }
}
