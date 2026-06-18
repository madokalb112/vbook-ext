package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w87 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ x87 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w87(x87 x87Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.c = x87Var;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        int i2 = this.d;
        x87 x87Var = this.c;
        switch (i) {
            case 0:
                return new w87(x87Var, i2, jt1Var, 0);
            default:
                return new w87(x87Var, i2, jt1Var, 1);
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
        return ((w87) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        int i = this.a;
        int i2 = this.d;
        xx1 xx1Var = xx1.a;
        x87 x87Var = this.c;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
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
                    r87 r87Var = x87Var.c;
                    this.b = 1;
                    s87 s87Var = (s87) r87Var;
                    s87Var.a.B.e(qt.T[26], Integer.valueOf(i2));
                    fr9 fr9Var = s87Var.f;
                    Integer num = new Integer(i2);
                    fr9Var.getClass();
                    fr9Var.l(null, num);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var2 = x87Var.e;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, z87.a((z87) value, false, false, false, false, this.d, 0, 47)));
                }
                break;
            default:
                vfb vfbVar = x87Var.d;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                    } else if (i4 == 2) {
                        e11.e0(obj);
                        this.b = 3;
                        ((wfb) vfbVar).a();
                        if (hebVar == xx1Var) {
                        }
                    } else if (i4 != 3) {
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
                    s87Var2.a.C.e(qt.T[27], Integer.valueOf(i2));
                    fr9 fr9Var3 = s87Var2.g;
                    Integer num2 = new Integer(i2);
                    fr9Var3.getClass();
                    fr9Var3.l(null, num2);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var4 = x87Var.e;
                if (fr9Var4 != null) {
                    do {
                        value2 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value2, z87.a((z87) value2, false, false, false, false, 0, this.d, 31)));
                }
                this.b = 2;
                r1c r1cVarB = r1c.b(((wfb) vfbVar).a.a);
                wfc wfcVar = r1cVarB.b.m;
                String strConcat = "CancelWorkByName_".concat("book_update_work");
                q39 q39Var = r1cVarB.d.a;
                q39Var.getClass();
                rw1.R(wfcVar, strConcat, q39Var, new yx0(r1cVarB, 0));
                if (hebVar == xx1Var) {
                }
                this.b = 3;
                ((wfb) vfbVar).a();
                if (hebVar == xx1Var) {
                }
                break;
        }
        return hebVar;
    }
}
