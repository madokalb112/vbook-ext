package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e43 extends rl5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ vx1 d;
    public final /* synthetic */ a07 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e43(ib4 ib4Var, a07 a07Var, vx1 vx1Var, a07 a07Var2, int i) {
        super(0);
        this.a = i;
        this.b = ib4Var;
        this.c = a07Var;
        this.d = vx1Var;
        this.e = a07Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.b;
        vx1 vx1Var = this.d;
        a07 a07Var = this.c;
        a07 a07Var2 = this.e;
        switch (i) {
            case 0:
                v33 v33Var = (v33) a07Var.getValue();
                if (v33Var != null) {
                    ah1.J(vx1Var, null, null, new c43(v33Var, null, 2), 3);
                }
                if (((Boolean) a07Var2.getValue()).booleanValue()) {
                    ib4Var.invoke();
                }
                a07Var2.setValue(Boolean.FALSE);
                break;
            default:
                v33 v33Var2 = (v33) a07Var.getValue();
                if (v33Var2 != null) {
                    ah1.J(vx1Var, null, null, new c43(v33Var2, null, 3), 3);
                }
                if (((Boolean) a07Var2.getValue()).booleanValue()) {
                    ib4Var.invoke();
                }
                a07Var2.setValue(Boolean.FALSE);
                break;
        }
        return hebVar;
    }
}
