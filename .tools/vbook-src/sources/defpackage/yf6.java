package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yf6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ym c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf6(ym ymVar, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ymVar;
        this.d = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new yf6(this.c, this.d, jt1Var, 0);
            default:
                return new yf6(this.c, this.d, jt1Var, 1);
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
        return ((yf6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        yf6 yf6Var;
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    Float f2 = new Float(f);
                    this.b = 1;
                    if (this.c.f(this, f2) == xx1Var) {
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
                    Float f3 = new Float(f);
                    p9b p9bVarA0 = ah1.a0(0, 0, null, 6);
                    this.b = 1;
                    yf6Var = this;
                    if (ym.b(this.c, f3, p9bVarA0, null, yf6Var, 12) != xx1Var) {
                    }
                } else if (i3 == 1) {
                    e11.e0(obj);
                    yf6Var = this;
                } else if (i3 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                Float f4 = new Float(0.0f);
                kp9 kp9VarW = ah1.W(0.5f, 200.0f, 4, null);
                yf6Var.b = 2;
                if (ym.b(yf6Var.c, f4, kp9VarW, null, yf6Var, 12) != xx1Var) {
                }
                break;
        }
        return xx1Var;
    }
}
