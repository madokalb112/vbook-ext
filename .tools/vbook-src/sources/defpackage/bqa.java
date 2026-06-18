package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bqa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ hra c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqa(hra hraVar, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = hraVar;
        this.d = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new bqa(this.c, this.d, jt1Var, 0);
            case 1:
                return new bqa(this.c, this.d, jt1Var, 1);
            case 2:
                return new bqa(this.c, this.d, jt1Var, 2);
            case 3:
                return new bqa(this.c, this.d, jt1Var, 3);
            default:
                return new bqa(this.c, this.d, jt1Var, 4);
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
        return ((bqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.d;
        xx1 xx1Var = xx1.a;
        hra hraVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ((xba) hraVar.L).a.m.e(zia.A[14], Float.valueOf(f));
                    fr9 fr9Var = hraVar.j0;
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, yba.a((yba) value, null, null, null, null, null, null, false, null, this.d, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -257, 1)));
                    }
                    this.b = 1;
                    if (hra.L(hraVar, this) == xx1Var) {
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
                    ((xba) hraVar.L).a.q.e(zia.A[18], Float.valueOf(f));
                    fr9 fr9Var2 = hraVar.j0;
                    if (fr9Var2 != null) {
                        do {
                            value2 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value2, yba.a((yba) value2, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, this.d, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -4097, 1)));
                    }
                    this.b = 1;
                    if (hra.L(hraVar, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    ((xba) hraVar.L).a.o.e(zia.A[16], Float.valueOf(f));
                    fr9 fr9Var3 = hraVar.j0;
                    if (fr9Var3 != null) {
                        do {
                            value3 = fr9Var3.getValue();
                        } while (!fr9Var3.j(value3, yba.a((yba) value3, null, null, null, null, null, null, false, null, 0.0f, 0.0f, this.d, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -1025, 1)));
                    }
                    this.b = 1;
                    if (hra.L(hraVar, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    ((xba) hraVar.L).a.p.e(zia.A[17], Float.valueOf(f));
                    fr9 fr9Var4 = hraVar.j0;
                    if (fr9Var4 != null) {
                        do {
                            value4 = fr9Var4.getValue();
                        } while (!fr9Var4.j(value4, yba.a((yba) value4, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, this.d, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -2049, 1)));
                    }
                    this.b = 1;
                    if (hra.L(hraVar, this) == xx1Var) {
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
                    ((xba) hraVar.L).a.n.e(zia.A[15], Float.valueOf(f));
                    fr9 fr9Var5 = hraVar.j0;
                    if (fr9Var5 != null) {
                        do {
                            value5 = fr9Var5.getValue();
                        } while (!fr9Var5.j(value5, yba.a((yba) value5, null, null, null, null, null, null, false, null, 0.0f, this.d, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -513, 1)));
                    }
                    this.b = 1;
                    if (hra.L(hraVar, this) == xx1Var) {
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
