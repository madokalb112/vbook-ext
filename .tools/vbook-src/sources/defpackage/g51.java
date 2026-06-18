package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g51 implements ib4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ ib4 d;

    public /* synthetic */ g51(ib4 ib4Var, a07 a07Var, a07 a07Var2) {
        this.d = ib4Var;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        ib4 ib4Var = this.d;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = Boolean.FALSE;
                a07Var2.setValue(bool);
                a07Var.setValue(bool);
                ib4Var.invoke();
                return heb.a;
            default:
                return new nk7((ac4) a07Var2.getValue(), (kb4) a07Var.getValue(), ((Number) ib4Var.invoke()).intValue());
        }
    }

    public /* synthetic */ g51(a07 a07Var, a07 a07Var2, ib4 ib4Var) {
        this.b = a07Var;
        this.c = a07Var2;
        this.d = ib4Var;
    }
}
