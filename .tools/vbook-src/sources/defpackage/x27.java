package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x27 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x27(Object obj, float f, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = f;
        this.e = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new x27((iz8) this.d, this.c, (mu8) obj2, jt1Var, 0);
            case 1:
                return new x27((as0) this.d, this.c, (ko) obj2, jt1Var, 1);
            default:
                x27 x27Var = new x27((p3b) obj2, jt1Var);
                x27Var.d = obj;
                return x27Var;
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
        return ((x27) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        float fR;
        vx1 vx1Var;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.e;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (((iz8) this.d).P(this.c, (mu8) obj2, this) == xx1Var) {
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
                    if (ym.b((ym) ((as0) this.d).c, new Float(this.c), (ko) obj2, null, this, 12) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    vx1 vx1Var2 = (vx1) this.d;
                    fR = uj9.r(vx1Var2.q());
                    vx1Var = vx1Var2;
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fR = this.c;
                    vx1Var = (vx1) this.d;
                    e11.e0(obj);
                }
                while (wx1.k0(vx1Var)) {
                    v27 v27Var = new v27(fR, 2, (p3b) obj2);
                    this.d = vx1Var;
                    this.c = fR;
                    this.b = 1;
                    if (ny1.J(getContext()).g0(v27Var, this) == xx1Var) {
                        break;
                    }
                }
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x27(p3b p3bVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 2;
        this.e = p3bVar;
    }
}
