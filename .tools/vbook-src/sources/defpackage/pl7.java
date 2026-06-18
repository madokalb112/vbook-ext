package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pl7 extends o1a implements yb4 {
    public sw8 a;
    public int b;
    public int c;
    public final /* synthetic */ sw8 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ oy0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl7(sw8 sw8Var, int i, oy0 oy0Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = sw8Var;
        this.e = i;
        this.f = oy0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new pl7(this.d, this.e, this.f, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((pl7) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i;
        sw8 sw8Var;
        bi1 bi1Var;
        int i2 = this.c;
        if (i2 == 0) {
            e11.e0(obj);
            sw8 sw8Var2 = this.d;
            if (((Long) sw8Var2.l.getValue()) != null) {
                this.a = sw8Var2;
                i = this.e;
                this.b = i;
                this.c = 1;
                Object objA = this.f.a(this);
                xx1 xx1Var = xx1.a;
                if (objA == xx1Var) {
                    return xx1Var;
                }
                obj = objA;
                sw8Var = sw8Var2;
            }
            return heb.a;
        }
        if (i2 != 1) {
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.b;
        sw8Var = this.a;
        e11.e0(obj);
        tc tcVar = (tc) obj;
        if (i == -1) {
            sw8Var.r = -1;
            sw8Var.j = tcVar;
        } else if (i == 0) {
            sw8Var.q = -1;
            sw8Var.h = tcVar;
        } else if (i == 1) {
            sw8Var.s = -1;
            sw8Var.i = tcVar;
        }
        if (sw8Var.q == -1 && sw8Var.s == -1 && sw8Var.r == -1 && (bi1Var = sw8Var.t) != null) {
            bi1Var.Q(Boolean.TRUE);
        }
        return heb.a;
    }
}
