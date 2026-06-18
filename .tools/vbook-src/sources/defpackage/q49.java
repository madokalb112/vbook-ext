package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q49 extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ qsb b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ a07 u;
    public final /* synthetic */ a07 v;
    public final /* synthetic */ a07 w;
    public final /* synthetic */ a07 x;
    public final /* synthetic */ a07 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q49(qsb qsbVar, a07 a07Var, kb4 kb4Var, long j, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5, a07 a07Var6, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = qsbVar;
        this.c = a07Var;
        this.d = kb4Var;
        this.e = j;
        this.f = kb4Var2;
        this.s = kb4Var3;
        this.t = kb4Var4;
        this.u = a07Var2;
        this.v = a07Var3;
        this.w = a07Var4;
        this.x = a07Var5;
        this.y = a07Var6;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new q49(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((q49) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            if (((w1b) this.c.getValue()) == null) {
                return heb.a;
            }
            qsb qsbVar = this.b;
            fe8 fe8Var = qsbVar.f;
            p49 p49Var = new p49(qsbVar, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
            this.a = 1;
            Object objA = fe8Var.a.a(p49Var, this);
            xx1 xx1Var = xx1.a;
            if (objA == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        if2.c();
        return null;
    }
}
