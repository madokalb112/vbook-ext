package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ap2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj7 b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ap2(ou6 ou6Var, pj7 pj7Var, int i) {
        this.a = 4;
        this.c = ou6Var;
        this.b = pj7Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        ou6 ou6Var = this.c;
        pj7 pj7Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fx1.a(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
            case 1:
                fx1.c(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
            case 2:
                fx1.d(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
            case 3:
                fx1.f(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
            case 4:
                p7c.j(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
            default:
                kf0.t(qu1.x0(i2 | 1), dd4Var, ou6Var, pj7Var);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ap2(pj7 pj7Var, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = pj7Var;
        this.c = ou6Var;
        this.d = i;
    }
}
