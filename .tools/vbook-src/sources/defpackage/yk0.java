package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yk0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj7 b;
    public final /* synthetic */ szb c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ int e;

    public /* synthetic */ yk0(pj7 pj7Var, szb szbVar, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = pj7Var;
        this.c = szbVar;
        this.d = ou6Var;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        ou6 ou6Var = this.d;
        szb szbVar = this.c;
        pj7 pj7Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ah1.f(pj7Var, szbVar, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                fe.n(pj7Var, szbVar, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
