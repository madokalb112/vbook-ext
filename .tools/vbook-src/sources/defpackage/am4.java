package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class am4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ cm4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am4(cm4 cm4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = cm4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        cm4 cm4Var = this.c;
        switch (i) {
            case 0:
                return new am4(cm4Var, jt1Var, 0);
            case 1:
                return new am4(cm4Var, jt1Var, 1);
            default:
                return new am4(cm4Var, jt1Var, 2);
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
        return ((am4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        cm4 cm4Var = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    aw5 aw5Var = cm4Var.e;
                    long jC = r95.a.k().c() - 2592000000L;
                    this.b = 1;
                    if (((uw5) aw5Var).e(jC, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) cm4Var.d).b();
                    pp1 pp1VarR = qx1.R(((uw5) cm4Var.e).a.b.b0(0));
                    aj2 aj2Var = rw2.a;
                    tg3 tg3VarI = cx1.I(fe8VarB, new kb3(qx1.E(pp1VarR, nh2.c), 9), ((j4b) cm4Var.c).i(), new a01(4, 3, jt1Var));
                    sg sgVar = new sg(cm4Var, 21);
                    this.b = 1;
                    if (tg3VarI.a(sgVar, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    aw5 aw5Var2 = cm4Var.e;
                    this.b = 1;
                    if (((uw5) aw5Var2).b(this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
