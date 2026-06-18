package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p27 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kqb b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ int d;

    public /* synthetic */ p27(kqb kqbVar, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = kqbVar;
        this.c = ou6Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        ou6 ou6Var = this.c;
        kqb kqbVar = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vw1.n(kqbVar, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 1:
                mi9.c(kqbVar, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                ri9.g(kqbVar, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
