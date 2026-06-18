package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ys6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ou6 d;

    public /* synthetic */ ys6(String str, String str2, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ou6 ou6Var = this.d;
        String str = this.c;
        String str2 = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ex1.p(str2, str, ou6Var, dd4Var, qu1.x0(1));
                break;
            default:
                zma.d(str2, str, ou6Var, dd4Var, qu1.x0(385));
                break;
        }
        return hebVar;
    }
}
