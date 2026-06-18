package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z85 b;
    public final /* synthetic */ zm5 c;
    public final /* synthetic */ z85 d;
    public final /* synthetic */ pn2 e;
    public final /* synthetic */ kk f;
    public final /* synthetic */ co0 s;
    public final /* synthetic */ hra t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ux2(z85 z85Var, zm5 zm5Var, z85 z85Var2, hra hraVar, pn2 pn2Var, kk kkVar, co0 co0Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = z85Var;
        this.c = zm5Var;
        this.d = z85Var2;
        this.t = hraVar;
        this.e = pn2Var;
        this.f = kkVar;
        this.s = co0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        hra hraVar = this.t;
        switch (i) {
            case 0:
                return new ux2(this.b, this.c, this.d, (px2) hraVar, this.e, this.f, this.s, jt1Var, 0);
            case 1:
                return new ux2(this.b, this.c, this.d, (vf3) hraVar, this.e, this.f, this.s, jt1Var, 1);
            case 2:
                return new ux2(this.b, this.c, this.d, (ys3) hraVar, this.e, this.f, this.s, jt1Var, 2);
            case 3:
                return new ux2(this.b, this.c, this.d, (xr4) hraVar, this.e, this.f, this.s, jt1Var, 3);
            case 4:
                return new ux2(this.b, this.c, this.d, (bi6) hraVar, this.e, this.f, this.s, jt1Var, 4);
            case 5:
                return new ux2(this.b, this.c, this.d, (s97) hraVar, this.e, this.f, this.s, jt1Var, 5);
            case 6:
                return new ux2(this.b, this.c, this.d, (rab) hraVar, this.e, this.f, this.s, jt1Var, 6);
            default:
                return new ux2(this.b, this.c, this.d, (h5c) hraVar, this.e, this.f, this.s, jt1Var, 7);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 5:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 6:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((ux2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kk kkVar = this.f;
        pn2 pn2Var = this.e;
        hra hraVar = this.t;
        z85 z85Var = this.d;
        zm5 zm5Var = this.c;
        z85 z85Var2 = this.b;
        co0 co0Var = this.s;
        switch (i) {
            case 0:
                e11.e0(obj);
                float fB = z85Var2.b(zm5Var);
                float fC = z85Var2.c(zm5Var);
                float fD = z85Var2.d();
                if (x13.b(fD, 0.0f) > 0) {
                    fD = ((x13) t1c.e0(new x13(fD), new x13(z85Var.d()))).a;
                }
                ((px2) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB) - fC, ((co0Var.c() - fD) - z85Var2.a()) - 40.0f);
                break;
            case 1:
                e11.e0(obj);
                float fB2 = z85Var2.b(zm5Var);
                float fC2 = z85Var2.c(zm5Var);
                float fD2 = z85Var2.d();
                if (x13.b(fD2, 0.0f) > 0) {
                    fD2 = ((x13) t1c.e0(new x13(fD2), new x13(z85Var.d()))).a;
                }
                ((vf3) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB2) - fC2, ((co0Var.c() - fD2) - z85Var2.a()) - 40.0f);
                break;
            case 2:
                e11.e0(obj);
                float fB3 = z85Var2.b(zm5Var);
                float fC3 = z85Var2.c(zm5Var);
                float fD3 = z85Var2.d();
                if (x13.b(fD3, 0.0f) > 0) {
                    fD3 = ((x13) t1c.e0(new x13(fD3), new x13(z85Var.d()))).a;
                }
                ((ys3) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB3) - fC3, ((co0Var.c() - fD3) - z85Var2.a()) - 40.0f);
                break;
            case 3:
                e11.e0(obj);
                float fB4 = z85Var2.b(zm5Var);
                float fC4 = z85Var2.c(zm5Var);
                float fD4 = z85Var2.d();
                if (x13.b(fD4, 0.0f) > 0) {
                    fD4 = ((x13) t1c.e0(new x13(fD4), new x13(z85Var.d()))).a;
                }
                ((xr4) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB4) - fC4, ((co0Var.c() - fD4) - z85Var2.a()) - 40.0f);
                break;
            case 4:
                e11.e0(obj);
                float fB5 = z85Var2.b(zm5Var);
                float fC5 = z85Var2.c(zm5Var);
                float fD5 = z85Var2.d();
                if (x13.b(fD5, 0.0f) > 0) {
                    fD5 = ((x13) t1c.e0(new x13(fD5), new x13(z85Var.d()))).a;
                }
                ((bi6) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB5) - fC5, ((co0Var.c() - fD5) - z85Var2.a()) - 40.0f);
                break;
            case 5:
                e11.e0(obj);
                float fB6 = z85Var2.b(zm5Var);
                float fC6 = z85Var2.c(zm5Var);
                float fD6 = z85Var2.d();
                if (x13.b(fD6, 0.0f) > 0) {
                    fD6 = ((x13) t1c.e0(new x13(fD6), new x13(z85Var.d()))).a;
                }
                ((s97) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB6) - fC6, ((co0Var.c() - fD6) - z85Var2.a()) - 40.0f);
                break;
            case 6:
                e11.e0(obj);
                float fB7 = z85Var2.b(zm5Var);
                float fC7 = z85Var2.c(zm5Var);
                float fD7 = z85Var2.d();
                if (x13.b(fD7, 0.0f) > 0) {
                    fD7 = ((x13) t1c.e0(new x13(fD7), new x13(z85Var.d()))).a;
                }
                ((rab) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB7) - fC7, ((co0Var.c() - fD7) - z85Var2.a()) - 40.0f);
                break;
            default:
                e11.e0(obj);
                float fB8 = z85Var2.b(zm5Var);
                float fC8 = z85Var2.c(zm5Var);
                float fD8 = z85Var2.d();
                if (x13.b(fD8, 0.0f) > 0) {
                    fD8 = ((x13) t1c.e0(new x13(fD8), new x13(z85Var.d()))).a;
                }
                ((h5c) hraVar).U(pn2Var, kkVar, (co0Var.d() - fB8) - fC8, ((co0Var.c() - fD8) - z85Var2.a()) - 40.0f);
                break;
        }
        return hebVar;
    }
}
