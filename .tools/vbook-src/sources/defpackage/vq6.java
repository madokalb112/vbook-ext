package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vq6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vq6(String str, boolean z, ou6 ou6Var, int i, int i2) {
        this.e = str;
        this.b = z;
        this.f = ou6Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                y86.j(this.b, this.c, this.d, (kb4) obj4, (kb4) obj3, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(this.c | 1);
                zk9.f((String) obj4, this.b, (ou6) obj3, (dd4) obj, iX02, this.d);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ vq6(boolean z, int i, int i2, kb4 kb4Var, kb4 kb4Var2, int i3) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = kb4Var;
        this.f = kb4Var2;
    }
}
