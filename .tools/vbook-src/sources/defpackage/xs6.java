package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xs6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ epa c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ yb4 f;

    public /* synthetic */ xs6(boolean z, epa epaVar, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = epaVar;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = yb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                ex1.h(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                ex1.i(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(1);
                ex1.j(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}
