package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class no6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ub4 d;

    public /* synthetic */ no6(long j, ib4 ib4Var, boolean z, int i) {
        this.b = j;
        this.d = ib4Var;
        this.c = z;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fw.w(this.b, (ib4) ub4Var, this.c, (dd4) obj, qu1.x0(1));
                break;
            default:
                yb4 yb4Var = (yb4) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    cx1.t(this.b, this.c, null, yb4Var, dd4Var, 0, 4);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ no6(long j, boolean z, yb4 yb4Var) {
        this.b = j;
        this.c = z;
        this.d = yb4Var;
    }
}
