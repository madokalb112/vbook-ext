package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class h71 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ h71(String str, boolean z, boolean z2, ib4 ib4Var, ib4 ib4Var2, int i, int i2) {
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = ib4Var;
        this.s = ib4Var2;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.s;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(this.d | 1);
                vo1.e(this.b, (kb4) obj5, (ou6) obj4, this.c, (g71) obj3, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(3073);
                sdc.Z((String) obj5, this.b, this.c, (ib4) obj4, (ib4) obj3, (dd4) obj, iX02, this.d);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ h71(boolean z, kb4 kb4Var, ou6 ou6Var, boolean z2, g71 g71Var, int i) {
        this.b = z;
        this.e = kb4Var;
        this.f = ou6Var;
        this.c = z2;
        this.s = g71Var;
        this.d = i;
    }
}
