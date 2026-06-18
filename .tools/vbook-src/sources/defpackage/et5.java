package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class et5 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ st5 c;
    public final /* synthetic */ pj7 d;
    public final /* synthetic */ s04 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ et5(ou6 ou6Var, st5 st5Var, pj7 pj7Var, Object obj, Object obj2, s04 s04Var, boolean z, kb4 kb4Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = ou6Var;
        this.c = st5Var;
        this.d = pj7Var;
        this.v = obj;
        this.w = obj2;
        this.e = s04Var;
        this.f = z;
        this.s = kb4Var;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.t;
        Object obj3 = this.w;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                pu1.l(this.b, this.c, this.d, (nv) obj4, (vf0) obj3, this.e, this.f, this.s, (dd4) obj, iX0, this.u);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                pu1.m(this.b, this.c, this.d, (kv) obj4, (wf0) obj3, this.e, this.f, this.s, (dd4) obj, iX02, this.u);
                break;
        }
        return hebVar;
    }
}
