package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d43 extends rl5 implements kb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ ub4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(ib4 ib4Var, a07 a07Var, a07 a07Var2, vx1 vx1Var) {
        super(1);
        this.e = ib4Var;
        this.b = a07Var;
        this.d = a07Var2;
        this.c = vx1Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        ub4 ub4Var = this.e;
        vx1 vx1Var = this.c;
        a07 a07Var = this.d;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                ((yw2) obj).getClass();
                return new ie2((ib4) ub4Var, a07Var2, a07Var, vx1Var);
            default:
                long j = ((eb7) obj).a;
                a07Var2.setValue(Boolean.TRUE);
                v33 v33Var = new v33();
                ah1.J(vx1Var, null, null, new c43(v33Var, null, 1), 3);
                a07Var.setValue(v33Var);
                ((kb4) ub4Var).invoke(new eb7(j));
                return heb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(kb4 kb4Var, a07 a07Var, vx1 vx1Var, a07 a07Var2) {
        super(1);
        this.e = kb4Var;
        this.b = a07Var;
        this.c = vx1Var;
        this.d = a07Var2;
    }
}
