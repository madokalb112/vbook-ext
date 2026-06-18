package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m24 extends o1a implements zb4 {
    public rg8 a;
    public h11 b;
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;
    public final /* synthetic */ a62 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m24(long j, a62 a62Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.f = j;
        this.s = a62Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        m24 m24Var = new m24(this.f, this.s, (jt1) obj3);
        m24Var.d = (vx1) obj;
        m24Var.e = (c24) obj2;
        return m24Var.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        h11 h11Var;
        rg8 rg8Var;
        c24 c24Var;
        h11 h11VarT;
        int i = this.c;
        jt1 jt1Var = null;
        if (i == 0) {
            e11.e0(obj);
            vx1 vx1Var = (vx1) this.d;
            c24 c24Var2 = (c24) this.e;
            o38 o38VarT = rw1.T(vx1Var, -1, new yw3(this.s, (jt1) null, 7), 1);
            h11Var = o38VarT;
            rg8Var = new rg8();
            c24Var = c24Var2;
            h11VarT = rw1.T(vx1Var, 0, new em(this.f, null), 1);
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h11VarT = this.b;
            rg8Var = this.a;
            h11Var = (h11) this.e;
            c24Var = (c24) this.d;
            e11.e0(obj);
        }
        while (rg8Var.a != y97.c) {
            g09 g09Var = new g09(getContext());
            g09Var.g(h11Var.c(), new ti(rg8Var, h11VarT, jt1Var, 8));
            g09Var.g(h11VarT.b(), new yw3(rg8Var, c24Var, (jt1) null, 6));
            this.d = c24Var;
            this.e = h11Var;
            this.a = rg8Var;
            this.b = h11VarT;
            this.c = 1;
            Object objD = g09Var.h() ? g09Var.d(this) : g09Var.e(this);
            xx1 xx1Var = xx1.a;
            if (objD == xx1Var) {
                return xx1Var;
            }
        }
        return heb.a;
    }
}
