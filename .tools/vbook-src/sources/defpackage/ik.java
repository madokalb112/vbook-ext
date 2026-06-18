package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ik implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ ik(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                ym5 ym5Var = (ym5) a07Var.getValue();
                if (ym5Var == null) {
                    t75.d("Required value was null.");
                    if2.c();
                }
                break;
            case 1:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 2:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 3:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 4:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 5:
                ((ib4) a07Var.getValue()).invoke();
                break;
            case 6:
                ym5 ym5Var2 = (ym5) a07Var.getValue();
                if (ym5Var2 == null) {
                    t75.d("Required value was null.");
                    if2.c();
                }
                break;
            case 7:
                if (a07Var != null) {
                }
                break;
            case 8:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 9:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 10:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 11:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 12:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 13:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 14:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 15:
                a07Var.setValue(Boolean.FALSE);
                break;
            case 16:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 17:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 18:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 19:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 20:
                break;
            case 21:
                kl8.g(a07Var, true);
                break;
            case 22:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
            case 23:
                break;
            case 24:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 25:
                fe.d(a07Var, true);
                break;
            case 26:
                a07Var.setValue(Boolean.TRUE);
                break;
            case 27:
                fe.d(a07Var, true);
                break;
            case 28:
                a07Var.setValue(Boolean.FALSE);
                break;
            default:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                break;
        }
        return hebVar;
    }
}
