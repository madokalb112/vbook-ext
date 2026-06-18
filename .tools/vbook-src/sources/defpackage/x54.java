package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x54 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y54 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x54(y54 y54Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = y54Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        y54 y54Var = this.c;
        switch (i) {
            case 0:
                return new x54(y54Var, jt1Var, 0);
            default:
                return new x54(y54Var, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                return ((x54) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            default:
                ((x54) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1.a;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        y54 y54Var = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                aw5 aw5Var = y54Var.e;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) y54Var.d).b();
                    pp1 pp1VarR = qx1.R(((uw5) aw5Var).a.b.Z(true));
                    aj2 aj2Var = rw2.a;
                    nh2 nh2Var = nh2.c;
                    tg3 tg3VarH = cx1.H(fe8VarB, new kb3(qx1.E(pp1VarR, nh2Var), 8), new kb3(new y34(qx1.R(((uw5) aw5Var).a.b.Z(false)), nh2Var, 0), 18), ((j4b) y54Var.c).i(), new or3(5, i2, jt1Var));
                    w54 w54Var = new w54(y54Var, 0);
                    this.b = 1;
                    if (tg3VarH.a(w54Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        if2.c();
                    }
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var = ((wfb) y54Var.f).c;
                w54 w54Var2 = new w54(y54Var, i2);
                this.b = 1;
                fr9Var.a(w54Var2, this);
                return xx1Var;
        }
    }
}
