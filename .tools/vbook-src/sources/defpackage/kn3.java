package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kn3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int s;

    public /* synthetic */ kn3(String str, ou6 ou6Var, long j, long j2, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = ou6Var;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.s = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                t1c.w(this.b, this.c, this.d, this.e, (dd4) obj, iX0, this.s);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                gc1.o(this.b, this.c, this.d, this.e, (dd4) obj, iX02, this.s);
                break;
        }
        return hebVar;
    }
}
