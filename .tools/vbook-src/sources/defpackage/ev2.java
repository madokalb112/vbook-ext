package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ev2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ jv2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev2(jv2 jv2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = jv2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        jv2 jv2Var = this.c;
        switch (i) {
            case 0:
                return new ev2(jv2Var, jt1Var, 0);
            case 1:
                return new ev2(jv2Var, jt1Var, 1);
            case 2:
                return new ev2(jv2Var, jt1Var, 2);
            default:
                return new ev2(jv2Var, jt1Var, 3);
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
        return ((ev2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objN;
        Object value;
        Object value2;
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        jv2 jv2Var = this.c;
        jt1 jt1Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
                ww5 ww5Var = jv2Var.I;
                int i4 = this.b;
                int i5 = 2;
                if (i4 == 0) {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) ww5Var).b();
                    this.b = 1;
                    objN = cx1.N(fe8VarB, this);
                    if (objN != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                objN = obj;
                ac9 ac9Var = (ac9) objN;
                fr9 fr9Var = jv2Var.M;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, lz5.a((lz5) value, 0L, false, false, null, false, ac9Var.b, ac9Var.c, false, null, null, 927)));
                }
                tg3 tg3VarI = cx1.I(jv2Var.S, new u31(jv2Var.T, 2), ((xw5) ww5Var).b(), new a01(4, i5, jt1Var));
                dv2 dv2Var = new dv2(jv2Var, i2);
                this.b = 2;
                if (tg3VarI.a(dv2Var, this) != xx1Var) {
                    return hebVar;
                }
                return xx1Var;
            case 1:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    jv2Var.P = true;
                    this.b = 1;
                    if (jv2.D(jv2Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                jv2Var.P = false;
                return hebVar;
            case 2:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                wp3 wp3VarE = ((cq3) jv2Var.K).e(jv2Var.H);
                dv2 dv2Var2 = new dv2(jv2Var, i3);
                this.b = 1;
                return wp3VarE.a(dv2Var2, this) == xx1Var ? xx1Var : hebVar;
            default:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    jv2Var.P = true;
                    fr9 fr9Var2 = jv2Var.M;
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, lz5.a((lz5) value2, 0L, true, false, null, false, 0, 0, false, null, null, 893)));
                    }
                    jv2Var.O = "";
                    jv2Var.R.clear();
                    jv2Var.U.clear();
                    this.b = 1;
                    if (jv2.D(jv2Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                jv2Var.P = false;
                return hebVar;
        }
    }
}
