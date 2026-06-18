package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz4 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ mz4(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    vo1.y(a07Var, false);
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = mt5.a;
                    ((ib4) a07Var.getValue()).invoke();
                }
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    int i3 = mt5.a;
                    ((ib4) a07Var.getValue()).invoke();
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    int i4 = mt5.a;
                    ((ib4) a07Var.getValue()).invoke();
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    ((ib4) a07Var.getValue()).invoke();
                }
                break;
            case 5:
                a07Var.setValue(Float.valueOf(((Number) obj).floatValue()));
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    rj9.c(a07Var, false);
                }
                break;
        }
        return hebVar;
    }
}
