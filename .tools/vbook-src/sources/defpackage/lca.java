package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lca extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yba c;
    public final /* synthetic */ sw8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lca(sw8 sw8Var, yba ybaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = sw8Var;
        this.c = ybaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        yba ybaVar = this.c;
        sw8 sw8Var = this.d;
        switch (i) {
            case 0:
                return new lca(sw8Var, ybaVar, jt1Var, 0);
            case 1:
                return new lca(ybaVar, sw8Var, jt1Var, 1);
            case 2:
                return new lca(ybaVar, sw8Var, jt1Var, 2);
            default:
                return new lca(sw8Var, ybaVar, jt1Var, 3);
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
        return ((lca) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        yba ybaVar = this.c;
        sw8 sw8Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    boolean z = ybaVar.A;
                    this.b = 1;
                    if (sw8Var.m(z, null) == xx1Var) {
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
                    boolean z2 = ybaVar.y;
                    boolean z3 = ybaVar.A;
                    if (z2) {
                        this.b = 1;
                        if (sw8Var.l(z3, null) != xx1Var) {
                        }
                    } else {
                        this.b = 2;
                        if (sw8Var.m(z3, null) != xx1Var) {
                        }
                    }
                } else if (i3 == 1 || i3 == 2) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    boolean z4 = ybaVar.y;
                    boolean z5 = ybaVar.A;
                    if (z4) {
                        this.b = 1;
                        if (sw8Var.m(z5, null) != xx1Var) {
                        }
                    } else {
                        this.b = 2;
                        if (sw8Var.l(z5, null) != xx1Var) {
                        }
                    }
                } else if (i4 == 1 || i4 == 2) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    boolean z6 = ybaVar.A;
                    this.b = 1;
                    if (sw8Var.l(z6, null) == xx1Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lca(yba ybaVar, sw8 sw8Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ybaVar;
        this.d = sw8Var;
    }
}
