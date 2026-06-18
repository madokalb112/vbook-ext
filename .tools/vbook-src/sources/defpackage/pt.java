package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pt implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ou6 f;

    public /* synthetic */ pt(float f, boolean z, kb4 kb4Var, kb4 kb4Var2, ou6 ou6Var, int i) {
        this.a = 2;
        this.e = f;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.f = ou6Var;
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
                int iX0 = qu1.x0(24577);
                fw.c(this.b, (xr) obj4, (String) obj3, this.e, this.f, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(24577);
                fw.c(this.b, (xr) obj4, (String) obj3, this.e, this.f, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(24577);
                h67.h(this.e, this.b, (kb4) obj4, (kb4) obj3, this.f, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ pt(boolean z, xr xrVar, String str, float f, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = xrVar;
        this.d = str;
        this.e = f;
        this.f = ou6Var;
    }
}
