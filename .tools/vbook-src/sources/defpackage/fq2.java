package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fq2 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t27 b;
    public final /* synthetic */ String c;

    public /* synthetic */ fq2(t27 t27Var, String str, int i) {
        this.a = i;
        this.b = t27Var;
        this.c = str;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.c;
        t27 t27Var = this.b;
        switch (i) {
            case 0:
                yb0.T(t27Var, str);
                break;
            case 1:
                t27Var.getClass();
                str.getClass();
                t27Var.a.d(new hd8(str));
                break;
            default:
                t27Var.getClass();
                str.getClass();
                t27Var.a.d(new kd8(str));
                break;
        }
        return hebVar;
    }
}
