package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oq0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(rq0 rq0Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rq0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        rq0 rq0Var = this.c;
        switch (i) {
            case 0:
                return new oq0(rq0Var, jt1Var, 0);
            case 1:
                return new oq0(rq0Var, jt1Var, 1);
            case 2:
                return new oq0(rq0Var, jt1Var, 2);
            default:
                return new oq0(rq0Var, jt1Var, 3);
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
        return ((oq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        rq0 rq0Var = this.c;
        xx1 xx1Var = xx1.a;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarR = qx1.R(((cq3) rq0Var.c).a.x.c0());
                    aj2 aj2Var = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR, nh2.c);
                    nq0 nq0Var = new nq0(rq0Var, 0);
                    this.b = 1;
                    Object objA = y34VarE.a(new gm0(nq0Var, 12), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    kb3 kb3VarF = ((cq3) rq0Var.c).f();
                    nq0 nq0Var2 = new nq0(rq0Var, i2);
                    this.b = 1;
                    if (kb3VarF.a(nq0Var2, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    n92 n92Var = ((ip0) rq0Var.d).a.d;
                    n92Var.getClass();
                    m92 m92Var = m92.a;
                    pp1 pp1VarR2 = qx1.R(new j92(n92Var, new hu1(25)));
                    aj2 aj2Var2 = rw2.a;
                    y34 y34VarE2 = qx1.E(pp1VarR2, nh2.c);
                    nq0 nq0Var3 = new nq0(rq0Var, 2);
                    this.b = 1;
                    Object objA2 = y34VarE2.a(new gm0(nq0Var3, i2), this);
                    if (objA2 != xx1Var) {
                        objA2 = hebVar;
                    }
                    if (objA2 == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    b6 b6Var = rq0Var.e;
                    this.b = 1;
                    if (((f6) b6Var).a(this) == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
