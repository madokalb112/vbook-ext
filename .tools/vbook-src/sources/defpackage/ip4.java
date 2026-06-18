package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ip4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ kp4 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip4(kp4 kp4Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.c = kp4Var;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new ip4(this.c, this.d, jt1Var, 0);
            default:
                return new ip4(this.c, this.d, jt1Var, 1);
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
        return ((ip4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = this.d;
        kp4 kp4Var = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    st5 st5VarI = kp4Var.i();
                    this.b = 1;
                    if (yn2.W(st5VarI, j07.c, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            e11.e0(obj);
                            return heb.a;
                        }
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                st5 st5VarI2 = kp4Var.i();
                this.b = 2;
                rt8 rt8Var = st5.y;
                if (st5VarI2.l(i3, 0, this) == xx1Var) {
                    return xx1Var;
                }
                return heb.a;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                ip4 ip4Var = new ip4(kp4Var, i3, jt1Var, i2);
                this.b = 1;
                Object objP = zib.p(100L, ip4Var, this);
                return objP == xx1Var ? xx1Var : objP;
        }
    }
}
