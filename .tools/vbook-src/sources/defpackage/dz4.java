package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dz4 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t27 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ dz4(t27 t27Var, a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = t27Var;
        this.c = a07Var;
        this.d = a07Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        a07 a07Var2 = this.c;
        t27 t27Var = this.b;
        switch (i) {
            case 0:
                a07Var2.setValue(Boolean.FALSE);
                gx1.R(t27Var, ((ny4) a07Var.getValue()).e, ((ny4) a07Var.getValue()).a);
                break;
            case 1:
                a07Var2.setValue(Boolean.FALSE);
                gx1.R(t27Var, ((fba) a07Var.getValue()).e, ((fba) a07Var.getValue()).h);
                break;
            case 2:
                a07Var2.setValue(Boolean.FALSE);
                y86.T(t27Var, ((fba) a07Var.getValue()).a);
                break;
            case 3:
                a07Var2.setValue(Boolean.FALSE);
                String str = ((fba) a07Var.getValue()).a;
                t27Var.getClass();
                t27Var.a.d(new cd8(str));
                break;
            default:
                a07Var2.setValue(Boolean.FALSE);
                String str2 = ((fba) a07Var.getValue()).a;
                t27Var.getClass();
                t27Var.a.d(new zd8(str2));
                break;
        }
        return hebVar;
    }
}
