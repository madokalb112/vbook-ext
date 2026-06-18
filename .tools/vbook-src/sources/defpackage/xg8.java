package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xg8 extends om8 implements yb4 {
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i21 e;
    public final /* synthetic */ zy2 f;
    public final /* synthetic */ pg8 s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg8(i21 i21Var, zy2 zy2Var, pg8 pg8Var, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = i21Var;
        this.f = zy2Var;
        this.s = pg8Var;
        this.t = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        xg8 xg8Var = new xg8(this.e, this.f, this.s, this.t, jt1Var);
        xg8Var.d = obj;
        return xg8Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((xg8) create((b39) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        String str = this.f.b;
        b39 b39Var = (b39) this.d;
        int i = this.c;
        pg8 pg8Var = this.s;
        if (i == 0) {
            e11.e0(obj);
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.b;
            e11.e0(obj);
            pg8Var.a = i2;
        }
        int iU = bw9.U(this.e, str, pg8Var.a, this.t);
        if (iU == -1) {
            return heb.a;
        }
        int length = str.length() + iU;
        h96 h96Var = new h96(iU, length - 1);
        this.d = b39Var;
        this.b = length;
        this.c = 1;
        b39Var.e(this, h96Var);
        return xx1.a;
    }
}
