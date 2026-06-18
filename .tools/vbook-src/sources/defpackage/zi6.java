package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zi6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ zi6(boolean z, kb4 kb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        kb4 kb4Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    kb4Var.invoke(((wga) a07Var.getValue()).a.b);
                }
                break;
            case 1:
                if (!z) {
                    kb4Var.invoke(((wga) a07Var.getValue()).a.b);
                }
                break;
            case 2:
                if (!z) {
                    kb4Var.invoke(Float.valueOf(((Number) a07Var.getValue()).floatValue()));
                }
                break;
            default:
                if (!z) {
                    kb4Var.invoke(Integer.valueOf((int) ((Number) a07Var.getValue()).floatValue()));
                }
                break;
        }
        return hebVar;
    }
}
