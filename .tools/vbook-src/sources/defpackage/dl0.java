package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dl0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t27 b;
    public final /* synthetic */ pj7 c;
    public final /* synthetic */ szb d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ou6 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ dl0(t27 t27Var, pj7 pj7Var, szb szbVar, String str, boolean z, ou6 ou6Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = t27Var;
        this.c = pj7Var;
        this.d = szbVar;
        this.e = str;
        this.f = z;
        this.s = ou6Var;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.t;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                ah1.b(this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj, iX0, this.u);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                fe.h(this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj, iX02, this.u);
                break;
        }
        return hebVar;
    }
}
