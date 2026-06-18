package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hx implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hx(int i, int i2, ib4 ib4Var, String str) {
        this.a = 1;
        this.d = str;
        this.b = i;
        this.e = ib4Var;
        this.c = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        heb hebVar = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gc1.b((ux) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1), qu1.x0(i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                yb0.h((String) obj4, i3, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 2:
                dd4 dd4Var = (dd4) obj;
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                int i4 = this.b;
                int i5 = this.c;
                s32.G(i4, i5, iX0, dd4Var, (ou6) obj3, (String) obj4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                t1c.E(i3, (via) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ah1.q((jd9) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1), i2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ah1.r((ou6) obj3, (t89) obj4, (dd4) obj, qu1.x0(i3 | 1), i2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                gx1.q((ou6) obj3, (rj1) obj4, (dd4) obj, qu1.x0(i3 | 1), i2);
                break;
            default:
                ((Integer) obj2).getClass();
                xg9.a((kta) obj4, (ou6) obj3, i3, (dd4) obj, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ hx(int i, via viaVar, ou6 ou6Var, int i2) {
        this.a = 3;
        this.b = i;
        this.d = viaVar;
        this.e = ou6Var;
        this.c = i2;
    }

    public /* synthetic */ hx(ou6 ou6Var, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.e = ou6Var;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ hx(Object obj, ou6 ou6Var, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = ou6Var;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ hx(String str, int i, int i2, ou6 ou6Var, int i3) {
        this.a = 2;
        this.d = str;
        this.b = i;
        this.c = i2;
        this.e = ou6Var;
    }
}
