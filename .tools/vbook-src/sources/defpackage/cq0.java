package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cq0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fxb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq0(fxb fxbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = fxbVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        fxb fxbVar = this.c;
        switch (i) {
            case 0:
                return new cq0(fxbVar, jt1Var, 0);
            case 1:
                return new cq0(fxbVar, jt1Var, 1);
            case 2:
                return new cq0(fxbVar, jt1Var, 2);
            case 3:
                return new cq0(fxbVar, jt1Var, 3);
            case 4:
                return new cq0(fxbVar, jt1Var, 4);
            case 5:
                return new cq0(fxbVar, jt1Var, 5);
            case 6:
                return new cq0(fxbVar, jt1Var, 6);
            default:
                return new cq0(fxbVar, jt1Var, 7);
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
        return ((cq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        fxb fxbVar = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.k(this) == xx1Var) {
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
                    if (fxbVar.n(this) == xx1Var) {
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
                    if (fxbVar.k(this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.n(this) == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.g(this) == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 5:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.f(this) == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 6:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.g(this) == xx1Var) {
                    }
                } else if (i8 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i9 = this.b;
                if (i9 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (fxbVar.f(this) == xx1Var) {
                    }
                } else if (i9 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
