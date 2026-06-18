package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class do4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zk7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do4(int i, jt1 jt1Var, zk7 zk7Var) {
        super(2, jt1Var);
        this.a = i;
        this.c = zk7Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new do4(0, jt1Var, this.c);
            case 1:
                return new do4(1, jt1Var, this.c);
            case 2:
                return new do4(2, jt1Var, this.c);
            default:
                return new do4(3, jt1Var, this.c);
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
        return ((do4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        int i = this.a;
        heb hebVar = heb.a;
        zk7 zk7Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (zk7.g(2, this, zk7Var) == xx1Var) {
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
                    this.b = 1;
                    bl7 bl7Var = cl7.a;
                    if (zk7Var.k() - 1 < 0 || (objG = zk7.g(zk7Var.k() - 1, this, zk7Var)) != xx1Var) {
                        objG = hebVar;
                    }
                    if (objG == xx1Var) {
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
                    this.b = 1;
                    bl7 bl7Var2 = cl7.a;
                    if (zk7Var.k() + 1 >= zk7Var.o() || (objG2 = zk7.g(zk7Var.k() + 1, this, zk7Var)) != xx1Var) {
                        objG2 = hebVar;
                    }
                    if (objG2 == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (yn2.W(zk7Var, j07.a, this) == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
