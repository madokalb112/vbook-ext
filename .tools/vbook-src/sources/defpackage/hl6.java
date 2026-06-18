package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hl6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zy4 c;
    public final /* synthetic */ i45 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ hl6(boolean z, zy4 zy4Var, i45 i45Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = zy4Var;
        this.d = i45Var;
        this.e = kb4Var;
        this.f = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iX0 = qu1.x0(i2 | 1);
                h67.G(this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iX02 = qu1.x0(i2 | 1);
                h67.H(this.b, this.c, this.d, this.e, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).intValue();
                int iX03 = qu1.x0(i2 | 1);
                h67.I(this.b, this.c, this.d, this.e, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}
