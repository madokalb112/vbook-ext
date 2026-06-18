package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cz8 extends o1a implements kb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ iz8 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ p3b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz8(iz8 iz8Var, Object obj, p3b p3bVar, jt1 jt1Var) {
        super(1, jt1Var);
        this.c = iz8Var;
        this.d = obj;
        this.e = p3bVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new cz8(this.e, this.c, this.d, jt1Var);
            default:
                return new cz8(this.c, this.d, this.e, jt1Var);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((cz8) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        iz8 iz8Var = this.c;
        Object obj2 = this.d;
        p3b p3bVar = this.e;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ug ugVar = new ug(iz8Var, obj2, p3bVar, (jt1) null);
                    this.b = 1;
                    if (wx1.a0(ugVar, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                p3bVar.i();
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    iz8Var.N();
                    cn7 cn7Var = iz8Var.b;
                    iz8Var.y = Long.MIN_VALUE;
                    iz8Var.R(0.0f);
                    float f = lc5.Q(obj2, iz8Var.c.getValue()) ? -4.0f : lc5.Q(obj2, cn7Var.getValue()) ? -5.0f : -3.0f;
                    p3bVar.p(obj2);
                    p3bVar.n(0L);
                    cn7Var.setValue(obj2);
                    iz8Var.R(0.0f);
                    iz8Var.B(obj2);
                    p3bVar.j(f);
                    if (f == -3.0f) {
                        this.b = 1;
                        if (iz8.L(iz8Var, this) == xx1Var) {
                        }
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                p3bVar.i();
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz8(p3b p3bVar, iz8 iz8Var, Object obj, jt1 jt1Var) {
        super(1, jt1Var);
        this.e = p3bVar;
        this.c = iz8Var;
        this.d = obj;
    }
}
