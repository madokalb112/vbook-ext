package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q19 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ ib4 c;

    public /* synthetic */ q19(ib4 ib4Var, ib4 ib4Var2, int i) {
        this.a = i;
        this.b = ib4Var;
        this.c = ib4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.c;
        ib4 ib4Var2 = this.b;
        dda ddaVar = (dda) obj;
        switch (i) {
            case 0:
                ib4Var2.invoke();
                if (ib4Var != null ? ((Boolean) ib4Var.invoke()).booleanValue() : true) {
                    ddaVar.close();
                }
                break;
            default:
                ib4Var2.invoke();
                if (ib4Var != null ? ((Boolean) ib4Var.invoke()).booleanValue() : true) {
                    ddaVar.close();
                }
                break;
        }
        return hebVar;
    }
}
