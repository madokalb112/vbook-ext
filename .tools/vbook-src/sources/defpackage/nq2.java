package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nq2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t27 d;

    public /* synthetic */ nq2(String str, String str2, t27 t27Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = t27Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        t27 t27Var = this.d;
        String str = this.c;
        String str2 = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fw.m(str2, str, t27Var, dd4Var, qu1.x0(1));
                break;
            default:
                e11.b(str2, str, t27Var, dd4Var, qu1.x0(1));
                break;
        }
        return hebVar;
    }
}
