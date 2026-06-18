package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n81 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    public /* synthetic */ n81(boolean z, float f, ou6 ou6Var, int i) {
        this.a = 2;
        this.c = z;
        this.d = f;
        this.b = ou6Var;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        ou6 ou6Var = this.b;
        float f = this.d;
        boolean z = this.c;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                m79.d(f, qu1.x0(i2 | 1), dd4Var, ou6Var, z);
                break;
            case 1:
                kf0.q(f, qu1.x0(i2 | 1), dd4Var, ou6Var, z);
                break;
            default:
                vo1.g(f, qu1.x0(i2 | 1), dd4Var, ou6Var, z);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ n81(ou6 ou6Var, boolean z, float f, int i, int i2) {
        this.a = i2;
        this.b = ou6Var;
        this.c = z;
        this.d = f;
        this.e = i;
    }
}
