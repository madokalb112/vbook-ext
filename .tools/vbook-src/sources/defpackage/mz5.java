package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz5 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ pz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz5(pz5 pz5Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = pz5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        pz5 pz5Var = this.c;
        switch (i) {
            case 0:
                return new mz5(pz5Var, jt1Var, 0);
            case 1:
                return new mz5(pz5Var, jt1Var, 1);
            case 2:
                return new mz5(pz5Var, jt1Var, 2);
            default:
                return new mz5(pz5Var, jt1Var, 3);
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
        return ((mz5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objN;
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        pz5 pz5Var = this.c;
        switch (i) {
            case 0:
                ww5 ww5Var = pz5Var.J;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) ww5Var).b();
                    this.b = 1;
                    objN = cx1.N(fe8VarB, this);
                    if (objN != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                objN = obj;
                ac9 ac9Var = (ac9) objN;
                fr9 fr9Var = pz5Var.N;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, lz5.a((lz5) value, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, null, 927)));
                }
                tg3 tg3VarI = cx1.I(pz5Var.S, new u31(pz5Var.T, 2), ((xw5) ww5Var).b(), new va(pz5Var, (jt1) null));
                this.b = 2;
                if (cx1.F(tg3VarI, this) != xx1Var) {
                    return hebVar;
                }
                return xx1Var;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    pz5Var.P = true;
                    this.b = 1;
                    if (pz5.D(pz5Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                pz5Var.P = false;
                return hebVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                wp3 wp3VarE = ((cq3) pz5Var.K).e(pz5Var.H);
                sg sgVar = new sg(pz5Var, 22);
                this.b = 1;
                return wp3VarE.a(sgVar, this) == xx1Var ? xx1Var : hebVar;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    pz5Var.V = r95.a.k().c();
                    pz5Var.P = true;
                    fr9 fr9Var2 = pz5Var.N;
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, lz5.a((lz5) value2, 0L, true, false, null, false, 0, 0, false, null, null, 893)));
                    }
                    pz5Var.O = "";
                    pz5Var.R.clear();
                    pz5Var.U.clear();
                    this.b = 1;
                    if (pz5.D(pz5Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                pz5Var.P = false;
                return hebVar;
        }
    }
}
