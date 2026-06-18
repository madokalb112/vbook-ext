package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mk6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ mk6(String str, boolean z, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.d;
        boolean z = this.c;
        String str = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                y86.l(str, z, ib4Var, dd4Var, qu1.x0(1));
                break;
            default:
                sp6.h(str, z, ib4Var, dd4Var, qu1.x0(1));
                break;
        }
        return hebVar;
    }
}
