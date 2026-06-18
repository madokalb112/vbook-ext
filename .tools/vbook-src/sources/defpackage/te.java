package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class te implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ te(long j, pj7 pj7Var, zb4 zb4Var) {
        this.a = 1;
        this.b = j;
        this.c = pj7Var;
        this.d = zb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xe.a((qb7) obj4, (ou6) obj3, this.b, (dd4) obj, qu1.x0(1));
                break;
            case 1:
                pj7 pj7Var = (pj7) obj4;
                zb4 zb4Var = (zb4) obj3;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    vw1.o(this.b, ((q96) dd4Var.j(s96.a)).b.m, jf0.G(417635459, new il6(10, pj7Var, zb4Var), dd4Var), dd4Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h67.S((String) obj4, (String) obj3, this.b, (dd4) obj, qu1.x0(1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ te(Object obj, Object obj2, long j, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
