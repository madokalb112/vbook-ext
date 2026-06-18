package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p14 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p14(long j, uka ukaVar, float f, yb4 yb4Var) {
        this.c = j;
        this.d = ukaVar;
        this.b = f;
        this.e = yb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                uka ukaVar = (uka) obj4;
                yb4 yb4Var = (yb4) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (!dd4Var.V(1 & iIntValue, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    vw1.o(this.c, ukaVar, jf0.G(-1767363041, new r14(this.b, yb4Var, i2), dd4Var), dd4Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((zk4) obj4).b((ou6) obj3, this.b, this.c, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ p14(zk4 zk4Var, ou6 ou6Var, float f, long j, int i) {
        this.d = zk4Var;
        this.e = ou6Var;
        this.b = f;
        this.c = j;
    }
}
