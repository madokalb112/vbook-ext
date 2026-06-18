package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f43 extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zk4 d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ vx1 t;
    public final /* synthetic */ a07 u;
    public final /* synthetic */ ib4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(boolean z, zk4 zk4Var, yb4 yb4Var, kb4 kb4Var, a07 a07Var, vx1 vx1Var, a07 a07Var2, ib4 ib4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = z;
        this.d = zk4Var;
        this.e = yb4Var;
        this.f = kb4Var;
        this.s = a07Var;
        this.t = vx1Var;
        this.u = a07Var2;
        this.v = ib4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        f43 f43Var = new f43(this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, jt1Var);
        f43Var.b = obj;
        return f43Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((f43) create((zx7) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        zx7 zx7Var = (zx7) this.b;
        if (this.c) {
            kb4 kb4Var = this.f;
            a07 a07Var = this.s;
            vx1 vx1Var = this.t;
            a07 a07Var2 = this.u;
            d43 d43Var = new d43(kb4Var, a07Var, vx1Var, a07Var2);
            ib4 ib4Var = this.v;
            e43 e43Var = new e43(ib4Var, a07Var2, vx1Var, a07Var, 0);
            e43 e43Var2 = new e43(ib4Var, a07Var2, vx1Var, a07Var, 1);
            this.a = 1;
            Object objH = m33.h(zx7Var, d43Var, e43Var, e43Var2, this.e, this);
            xx1 xx1Var = xx1.a;
            if (objH != xx1Var) {
                objH = hebVar;
            }
            if (objH == xx1Var) {
                return xx1Var;
            }
        }
        return hebVar;
    }
}
