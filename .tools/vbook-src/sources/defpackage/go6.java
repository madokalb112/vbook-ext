package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class go6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ub4 c;

    public /* synthetic */ go6(long j, ib4 ib4Var, int i) {
        this.b = j;
        this.c = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.c;
        switch (i) {
            case 0:
                kb4 kb4Var = (kb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    i12.o(this.b, (ou6) null, kb4Var, dd4Var, 0, 2);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                gjb.G(this.b, (ib4) ub4Var, (dd4) obj, qu1.x0(49));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ go6(long j, kb4 kb4Var) {
        this.b = j;
        this.c = kb4Var;
    }
}
