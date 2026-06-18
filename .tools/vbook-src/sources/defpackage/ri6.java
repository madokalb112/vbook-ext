package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ri6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb4 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ ri6(zb4 zb4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, int i) {
        this.a = i;
        this.b = zb4Var;
        this.c = a07Var;
        this.d = a07Var2;
        this.e = a07Var3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.e;
        a07 a07Var2 = this.d;
        a07 a07Var3 = this.c;
        zb4 zb4Var = this.b;
        switch (i) {
            case 0:
                zb4Var.c(kf0.X(((lc1) a07Var3.getValue()).a, true, false), kf0.X(((lc1) a07Var2.getValue()).a, true, false), (bi5) a07Var.getValue());
                break;
            case 1:
                zb4Var.c((String) a07Var3.getValue(), (String) a07Var2.getValue(), (String) a07Var.getValue());
                break;
            default:
                String str = (String) a07Var3.getValue();
                Boolean bool = (Boolean) a07Var2.getValue();
                bool.booleanValue();
                Boolean bool2 = (Boolean) a07Var.getValue();
                bool2.booleanValue();
                zb4Var.c(str, bool, bool2);
                break;
        }
        return hebVar;
    }
}
