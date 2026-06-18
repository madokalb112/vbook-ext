package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nk6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ nk6(String str, int i, ib4 ib4Var, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = i;
        this.d = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.d;
        int i2 = this.c;
        String str = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                y86.a(str, i2, ib4Var, dd4Var, qu1.x0(55));
                break;
            default:
                ny1.a(str, i2, ib4Var, dd4Var, qu1.x0(55));
                break;
        }
        return hebVar;
    }
}
