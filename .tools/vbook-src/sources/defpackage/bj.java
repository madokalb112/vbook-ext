package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bj implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bj(yy6 yy6Var, ou6 ou6Var, rh9 rh9Var, boolean z, long j, int i) {
        this.e = yy6Var;
        this.b = ou6Var;
        this.f = rh9Var;
        this.c = z;
        this.d = j;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ftb ftbVar = (ftb) obj4;
                qb7 qb7Var = (qb7) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(1 & iIntValue, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    jv3.e(xm1.t.a(ftbVar), jf0.G(1260045569, new dj(this.d, this.c, this.b, qb7Var), dd4Var), dd4Var, 56);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                yb0.v((yy6) obj4, this.b, (rh9) obj3, this.c, this.d, (dd4) obj, qu1.x0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                gjb.a((sgb) obj4, this.d, this.c, this.b, (String) obj3, (dd4) obj, qu1.x0(393));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ bj(sgb sgbVar, long j, boolean z, ou6 ou6Var, String str, int i) {
        this.e = sgbVar;
        this.d = j;
        this.c = z;
        this.b = ou6Var;
        this.f = str;
    }

    public /* synthetic */ bj(ftb ftbVar, long j, boolean z, ou6 ou6Var, qb7 qb7Var) {
        this.e = ftbVar;
        this.d = j;
        this.c = z;
        this.b = ou6Var;
        this.f = qb7Var;
    }
}
