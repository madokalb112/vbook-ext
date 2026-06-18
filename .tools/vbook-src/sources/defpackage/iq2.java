package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iq2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ iq2(int i, int i2, pj7 pj7Var, ou6 ou6Var, int i3) {
        this.a = 2;
        this.b = i;
        this.c = i2;
        this.e = pj7Var;
        this.f = ou6Var;
        this.d = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        heb hebVar = heb.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                String str = (String) obj4;
                ou6 ou6Var = (ou6) obj3;
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                fw.p(this.b, iX0, this.d, (dd4) obj, ou6Var, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                mt5.c((st5) obj4, this.b, (ib4) obj3, (dd4) obj, iX02, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(this.d | 1);
                e11.m(this.b, this.c, (pj7) obj4, (ou6) obj3, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ iq2(Object obj, int i, Object obj2, int i2, int i3, int i4) {
        this.a = i4;
        this.e = obj;
        this.b = i;
        this.f = obj2;
        this.c = i2;
        this.d = i3;
    }
}
