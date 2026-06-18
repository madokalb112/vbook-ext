package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wi6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ int e;

    public /* synthetic */ wi6(String str, ou6 ou6Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = ou6Var;
        this.d = kb4Var;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        kb4 kb4Var = this.d;
        ou6 ou6Var = this.c;
        String str = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ex1.b(str, ou6Var, kb4Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                tw1.e(str, ou6Var, kb4Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
