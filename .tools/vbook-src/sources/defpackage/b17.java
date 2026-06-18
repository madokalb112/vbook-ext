package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b17 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ c17 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b17(c17 c17Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = c17Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        c17 c17Var = this.c;
        switch (i) {
            case 0:
                return new b17(c17Var, jt1Var, 0);
            default:
                return new b17(c17Var, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((b17) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        c17 c17Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    pp1 pp1VarR = qx1.R(((c98) c17Var.c).a.E.P());
                    aj2 aj2Var = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR, nh2.c);
                    sg sgVar = new sg(c17Var, 25);
                    this.b = 1;
                    Object objA = y34VarE.a(new pw5(sgVar, 8), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                }
                break;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    y78 y78Var = c17Var.c;
                    this.b = 1;
                    n92 n92Var = ((c98) y78Var).a.E;
                    ((qj) ((yf1) n92Var).a).q(514993798, "DELETE FROM DbQtNameSkip", (kb4) null);
                    n92Var.w(514993798, new pb2(14));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}
