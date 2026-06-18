package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v87 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ x87 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v87(x87 x87Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = x87Var;
        this.d = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.d;
        x87 x87Var = this.c;
        switch (i) {
            case 0:
                return new v87(x87Var, z, jt1Var, 0);
            case 1:
                return new v87(x87Var, z, jt1Var, 1);
            case 2:
                return new v87(x87Var, z, jt1Var, 2);
            default:
                return new v87(x87Var, z, jt1Var, 3);
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
        return ((v87) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        x87 x87Var = this.c;
        boolean z = this.d;
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
                    r87 r87Var = x87Var.c;
                    this.b = 1;
                    s87 s87Var = (s87) r87Var;
                    s87Var.a.x.e(qt.T[22], Boolean.valueOf(z));
                    fr9 fr9Var = s87Var.b;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    fr9Var.getClass();
                    fr9Var.l(null, boolValueOf);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var2 = x87Var.e;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, z87.a((z87) value, this.d, false, false, false, 0, 0, 62)));
                }
                break;
            case 1:
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
                    r87 r87Var2 = x87Var.c;
                    this.b = 1;
                    s87 s87Var2 = (s87) r87Var2;
                    s87Var2.a.y.e(qt.T[23], Boolean.valueOf(z));
                    fr9 fr9Var3 = s87Var2.c;
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    fr9Var3.getClass();
                    fr9Var3.l(null, boolValueOf2);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var4 = x87Var.e;
                if (fr9Var4 != null) {
                    do {
                        value2 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value2, z87.a((z87) value2, false, this.d, false, false, 0, 0, 61)));
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    r87 r87Var3 = x87Var.c;
                    this.b = 1;
                    s87 s87Var3 = (s87) r87Var3;
                    s87Var3.a.z.e(qt.T[24], Boolean.valueOf(z));
                    fr9 fr9Var5 = s87Var3.d;
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    fr9Var5.getClass();
                    fr9Var5.l(null, boolValueOf3);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var6 = x87Var.e;
                if (fr9Var6 != null) {
                    do {
                        value3 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value3, z87.a((z87) value3, false, false, this.d, false, 0, 0, 59)));
                }
                break;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e11.e0(obj);
                    } else if (i5 == 2 || i5 == 3) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    r87 r87Var4 = x87Var.c;
                    this.b = 1;
                    s87 s87Var4 = (s87) r87Var4;
                    s87Var4.a.A.e(qt.T[25], Boolean.valueOf(z));
                    fr9 fr9Var7 = s87Var4.e;
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    fr9Var7.getClass();
                    fr9Var7.l(null, boolValueOf4);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var8 = x87Var.e;
                if (fr9Var8 != null) {
                    do {
                        value4 = fr9Var8.getValue();
                    } while (!fr9Var8.j(value4, z87.a((z87) value4, false, false, false, this.d, 0, 0, 55)));
                }
                vfb vfbVar = x87Var.d;
                if (z) {
                    this.b = 2;
                    ((wfb) vfbVar).a();
                    if (hebVar == xx1Var) {
                    }
                } else {
                    this.b = 3;
                    r1c r1cVarB = r1c.b(((wfb) vfbVar).a.a);
                    wfc wfcVar = r1cVarB.b.m;
                    String strConcat = "CancelWorkByName_".concat("book_update_work");
                    q39 q39Var = r1cVarB.d.a;
                    q39Var.getClass();
                    rw1.R(wfcVar, strConcat, q39Var, new yx0(r1cVarB, 0));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}
