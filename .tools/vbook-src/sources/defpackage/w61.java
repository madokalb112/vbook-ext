package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w61 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e71 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w61(e71 e71Var, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = e71Var;
        this.e = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                w61 w61Var = new w61(this.d, this.e, jt1Var, 0);
                w61Var.c = obj;
                return w61Var;
            default:
                w61 w61Var2 = new w61(this.d, this.e, jt1Var, 1);
                w61Var2.c = obj;
                return w61Var2;
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
        return ((w61) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        Object value3;
        Object pm8Var2;
        Object value4;
        Object value5;
        Object value6;
        int i = this.a;
        t51 t51Var = t51.a;
        long j = this.e;
        xx1 xx1Var = xx1.a;
        e71 e71Var = this.d;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                fr9 fr9Var = e71Var.s;
                int i2 = this.b;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            e11.e0(obj);
                        }
                        break;
                    } else {
                        e11.e0(obj);
                        if (fr9Var != null) {
                            do {
                                value3 = fr9Var.getValue();
                            } while (!fr9Var.j(value3, t61.a((t61) value3, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, true, false, false, null, null, null, 0, null, null, 2143289343)));
                        }
                        z51 z51Var = e71Var.e;
                        this.c = null;
                        this.b = 1;
                        Object objG = ((p61) z51Var).a.d.g(j, this);
                        if (objG != xx1Var) {
                            objG = hebVar;
                        }
                        if (objG == xx1Var) {
                        }
                    }
                    pm8Var = hebVar;
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                if (!(pm8Var instanceof pm8)) {
                    if (fr9Var != null) {
                        do {
                            value2 = fr9Var.getValue();
                        } while (!fr9Var.j(value2, t61.a((t61) value2, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2143289343)));
                    }
                    e71Var.i(e71Var.t, t51Var);
                }
                Throwable thA = qm8.a(pm8Var);
                if (thA != null) {
                    thA.printStackTrace();
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, t61.a((t61) value, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2143289343)));
                    }
                }
                break;
            default:
                fr9 fr9Var2 = e71Var.s;
                int i3 = this.b;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            gp.j("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            e11.e0(obj);
                        }
                        break;
                    } else {
                        e11.e0(obj);
                        if (fr9Var2 != null) {
                            do {
                                value6 = fr9Var2.getValue();
                            } while (!fr9Var2.j(value6, t61.a((t61) value6, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, true, false, false, null, null, null, 0, null, null, 2143289343)));
                        }
                        z51 z51Var2 = e71Var.e;
                        this.c = null;
                        this.b = 1;
                        Object objB = ((p61) z51Var2).a.d.B(j, this);
                        if (objB != xx1Var) {
                            objB = hebVar;
                        }
                        if (objB == xx1Var) {
                        }
                    }
                    pm8Var2 = hebVar;
                } catch (Throwable th2) {
                    pm8Var2 = new pm8(th2);
                }
                if (!(pm8Var2 instanceof pm8)) {
                    if (fr9Var2 != null) {
                        do {
                            value5 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value5, t61.a((t61) value5, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2143289343)));
                    }
                    e71Var.i(e71Var.t, t51Var);
                }
                Throwable thA2 = qm8.a(pm8Var2);
                if (thA2 != null) {
                    thA2.printStackTrace();
                    if (fr9Var2 != null) {
                        do {
                            value4 = fr9Var2.getValue();
                        } while (!fr9Var2.j(value4, t61.a((t61) value4, false, false, false, false, null, null, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, 0, null, null, 2143289343)));
                    }
                }
                break;
        }
        return hebVar;
    }
}
