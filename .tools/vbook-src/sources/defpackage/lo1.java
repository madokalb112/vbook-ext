package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lo1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mo1 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo1(mo1 mo1Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.c = mo1Var;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new lo1(this.c, this.d, jt1Var, 0);
            case 1:
                return new lo1(this.c, this.d, jt1Var, 1);
            default:
                return new lo1(this.c, this.d, jt1Var, 2);
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
        return ((lo1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        mo1 mo1Var = this.c;
        heb hebVar = heb.a;
        int i2 = this.d;
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
                    ho1 ho1Var = mo1Var.c;
                    this.b = 1;
                    jo1 jo1Var = (jo1) ho1Var;
                    jo1Var.a.u.e(qt.T[19], Integer.valueOf(i2));
                    fr9 fr9Var = jo1Var.b;
                    Integer num = new Integer(i2);
                    fr9Var.getClass();
                    fr9Var.l(null, num);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var2 = mo1Var.d;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, no1.a((no1) value, i2, 0, 0, 30)));
                }
                break;
            case 1:
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
                    ho1 ho1Var2 = mo1Var.c;
                    this.b = 1;
                    jo1 jo1Var2 = (jo1) ho1Var2;
                    jo1Var2.a.w.e(qt.T[21], Integer.valueOf(i2));
                    fr9 fr9Var3 = jo1Var2.d;
                    Integer num2 = new Integer(i2);
                    fr9Var3.getClass();
                    fr9Var3.l(null, num2);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var4 = mo1Var.d;
                if (fr9Var4 != null) {
                    do {
                        value2 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value2, no1.a((no1) value2, 0, 0, i2, 27)));
                }
                break;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    ho1 ho1Var3 = mo1Var.c;
                    this.b = 1;
                    jo1 jo1Var3 = (jo1) ho1Var3;
                    jo1Var3.a.v.e(qt.T[20], Integer.valueOf(i2));
                    fr9 fr9Var5 = jo1Var3.c;
                    Integer num3 = new Integer(i2);
                    fr9Var5.getClass();
                    fr9Var5.l(null, num3);
                    if (hebVar == xx1Var) {
                    }
                }
                fr9 fr9Var6 = mo1Var.d;
                if (fr9Var6 != null) {
                    do {
                        value3 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value3, no1.a((no1) value3, 0, i2, 0, 29)));
                }
                break;
        }
        return hebVar;
    }
}
