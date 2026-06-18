package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o51 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ x31 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o51(a07 a07Var, x31 x31Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = a07Var;
        this.d = x31Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        x31 x31Var = this.d;
        a07 a07Var = this.c;
        switch (i) {
            case 0:
                return new o51(a07Var, x31Var, jt1Var, 0);
            default:
                return new o51(a07Var, x31Var, jt1Var, 1);
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
        return ((o51) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        x31 x31Var = this.d;
        a07 a07Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    b24 b24VarL = cx1.L(dk9.C(new ik(a07Var, 23)));
                    n51 n51Var = new n51(x31Var, 0);
                    this.b = 1;
                    if (b24VarL.a(n51Var, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    b24 b24VarL2 = cx1.L(dk9.C(new gpa(a07Var, 11)));
                    n51 n51Var2 = new n51(x31Var, 1);
                    this.b = 1;
                    if (b24VarL2.a(n51Var2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
