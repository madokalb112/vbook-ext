package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o11 extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q11 d;
    public final /* synthetic */ c24 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(q11 q11Var, c24 c24Var, Object obj, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = q11Var;
        this.e = c24Var;
        this.c = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        c24 c24Var = this.e;
        q11 q11Var = this.d;
        switch (i) {
            case 0:
                return new o11(q11Var, c24Var, this.c, jt1Var);
            default:
                o11 o11Var = new o11(q11Var, c24Var, jt1Var);
                o11Var.c = obj;
                return o11Var;
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
        return ((o11) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    zb4 zb4Var = this.d.e;
                    Object obj2 = this.c;
                    this.b = 1;
                    if (zb4Var.c(this.e, obj2, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    vx1 vx1Var = (vx1) this.c;
                    rg8 rg8Var = new rg8();
                    q11 q11Var = this.d;
                    b24 b24Var = q11Var.d;
                    oe0 oe0Var = new oe0(rg8Var, vx1Var, q11Var, this.e, 1);
                    this.b = 1;
                    if (b24Var.a(oe0Var, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(q11 q11Var, c24 c24Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = q11Var;
        this.e = c24Var;
    }
}
