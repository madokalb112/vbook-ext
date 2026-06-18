package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h25 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m53 d;
    public final /* synthetic */ lf2 e;
    public final /* synthetic */ pn2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h25(m53 m53Var, lf2 lf2Var, pn2 pn2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = m53Var;
        this.e = lf2Var;
        this.f = pn2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                h25 h25Var = new h25(this.d, this.e, this.f, jt1Var, 0);
                h25Var.c = obj;
                return h25Var;
            default:
                h25 h25Var2 = new h25(this.d, this.e, this.f, jt1Var, 1);
                h25Var2.c = obj;
                return h25Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        gl8 gl8Var = (gl8) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((h25) create(gl8Var, jt1Var)).invokeSuspend(hebVar);
                return xx1.a;
            default:
                return ((h25) create(gl8Var, jt1Var)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        m53 m53Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                gl8 gl8Var = (gl8) this.c;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    String str = jl8.a(m53Var, gl8Var).b;
                    this.c = null;
                    this.b = 1;
                    c85 c85Var = i25.d;
                    x42 x42Var = new x42(new fz4(4), this.e, str, null, 3);
                    c85Var.getClass();
                    obj = wx1.a0(new yw(c85Var, str, x42Var, (jt1) null), this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                obj.getClass();
                j31.j();
                return null;
            default:
                gl8 gl8Var2 = (gl8) this.c;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    String str2 = jl8.a(m53Var, gl8Var2).b;
                    pn2 pn2Var = this.f;
                    this.c = null;
                    this.b = 1;
                    c85 c85Var2 = i25.d;
                    x42 x42Var2 = new x42(new rx2(pn2Var, 24), this.e, str2, null, 3);
                    c85Var2.getClass();
                    obj = wx1.a0(new yw(c85Var2, str2, x42Var2, (jt1) null), this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                obj.getClass();
                return ((vy4) obj).a;
        }
    }
}
