package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class l8 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ou6 d;

    public /* synthetic */ l8(String str, int i, ou6 ou6Var, int i2) {
        this.a = 1;
        this.b = str;
        this.c = i;
        this.d = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.c;
        ou6 ou6Var = this.d;
        String str = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gc1.a(str, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 1:
                vo1.s(str, i2, ou6Var, dd4Var, qu1.x0(1));
                break;
            case 2:
                ww1.y(str, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            case 3:
                lw1.m(str, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                tl9.f(str, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ l8(String str, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = ou6Var;
        this.c = i;
    }
}
