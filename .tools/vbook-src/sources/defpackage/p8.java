package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p8 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ub4 e;

    public /* synthetic */ p8(long j, uka ukaVar, rj1 rj1Var, int i) {
        this.a = 0;
        this.b = j;
        this.d = ukaVar;
        this.e = rj1Var;
        this.c = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(this.c | 1);
                z8.e(this.b, (uka) obj3, (rj1) ub4Var, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                i12.o(this.b, (ou6) obj3, (kb4) ub4Var, (dd4) obj, iX02, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(385);
                tw1.m(this.b, (ou6) obj3, (rj1) ub4Var, (dd4) obj, iX03, this.c);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ p8(long j, ou6 ou6Var, ub4 ub4Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j;
        this.d = ou6Var;
        this.e = ub4Var;
        this.c = i2;
    }
}
