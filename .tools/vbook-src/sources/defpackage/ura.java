package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ura implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ura(int i, kb4 kb4Var, ou6 ou6Var, int i2) {
        this.b = i;
        this.d = kb4Var;
        this.c = ou6Var;
        this.e = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        kb4 kb4Var = this.d;
        ou6 ou6Var = this.c;
        int i3 = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vm7.D(i3, qu1.x0(i2 | 1), kb4Var, dd4Var, ou6Var);
                break;
            default:
                ql9.g(i3, qu1.x0(i2 | 1), kb4Var, dd4Var, ou6Var);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ura(int i, ou6 ou6Var, kb4 kb4Var, int i2) {
        this.b = i;
        this.c = ou6Var;
        this.d = kb4Var;
        this.e = i2;
    }
}
