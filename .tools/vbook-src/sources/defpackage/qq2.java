package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qq2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ wq2 d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq2(a07 a07Var, wq2 wq2Var, a07 a07Var2, a07 a07Var3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = a07Var;
        this.d = wq2Var;
        this.e = a07Var2;
        this.f = a07Var3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new qq2(this.c, this.d, this.e, this.f, jt1Var, 0);
            default:
                return new qq2(this.c, this.d, this.e, this.f, jt1Var, 1);
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
        return ((qq2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    b24 b24VarJ = cx1.J(dk9.C(new bv1(a07Var, 9)), 150L);
                    pq2 pq2Var = new pq2(this.d, this.e, this.f, null, 0);
                    this.b = 1;
                    if (cx1.G(b24VarJ, pq2Var, this) == xx1Var) {
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
                    b24 b24VarJ2 = cx1.J(dk9.C(new bv1(a07Var, 10)), 150L);
                    pq2 pq2Var2 = new pq2(this.d, this.e, this.f, null, 1);
                    this.b = 1;
                    if (cx1.G(b24VarJ2, pq2Var2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
