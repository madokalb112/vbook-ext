package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zr9 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds9 b;
    public final /* synthetic */ xr9 c;
    public final /* synthetic */ int d;

    public /* synthetic */ zr9(ds9 ds9Var, xr9 xr9Var, int i, int i2) {
        this.a = i2;
        this.b = ds9Var;
        this.c = xr9Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        xr9 xr9Var = this.c;
        ds9 ds9Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h67.v(ds9Var, xr9Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                h67.Z(ds9Var, xr9Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}
