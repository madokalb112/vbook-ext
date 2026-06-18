package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mz6 extends om8 implements yb4 {
    public yd4 b;
    public nz6 c;
    public long[] d;
    public int e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ nz6 t;
    public final /* synthetic */ yd4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz6(nz6 nz6Var, yd4 yd4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = nz6Var;
        this.u = yd4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        mz6 mz6Var = new mz6(this.t, this.u, jt1Var);
        mz6Var.s = obj;
        return mz6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((mz6) create((b39) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        b39 b39Var;
        nz6 nz6Var;
        long[] jArr;
        int i;
        yd4 yd4Var;
        int i2 = this.f;
        if (i2 == 0) {
            e11.e0(obj);
            b39Var = (b39) this.s;
            nz6Var = this.t;
            lz6 lz6Var = nz6Var.b;
            jArr = lz6Var.c;
            i = lz6Var.e;
            yd4Var = this.u;
        } else {
            if (i2 != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.e;
            jArr = this.d;
            nz6Var = this.c;
            yd4Var = this.b;
            b39Var = (b39) this.s;
            e11.e0(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return heb.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        yd4Var.b = i;
        Object obj2 = nz6Var.b.b[i];
        this.s = b39Var;
        this.b = yd4Var;
        this.c = nz6Var;
        this.d = jArr;
        this.e = i3;
        this.f = 1;
        b39Var.e(this, obj2);
        return xx1.a;
    }
}
