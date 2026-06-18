package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v9a extends om8 implements yb4 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vx1 d;
    public final /* synthetic */ a28 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ zb4 t;
    public final /* synthetic */ kb4 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9a(vx1 vx1Var, a28 a28Var, kb4 kb4Var, kb4 kb4Var2, zb4 zb4Var, kb4 kb4Var3, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = vx1Var;
        this.e = a28Var;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = zb4Var;
        this.u = kb4Var3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        v9a v9aVar = new v9a(this.d, this.e, this.f, this.s, this.t, this.u, jt1Var);
        v9aVar.c = obj;
        return v9aVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((v9a) create((u1a) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            u1a u1aVar = (u1a) this.c;
            this.b = 1;
            Object objH = aaa.h(u1aVar, this.d, this.e, this.f, this.s, this.t, this.u, this);
            xx1 xx1Var = xx1.a;
            if (objH == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return heb.a;
    }
}
