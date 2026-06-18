package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x6c extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zx7 d;
    public final /* synthetic */ n7c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6c(zx7 zx7Var, n7c n7cVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = zx7Var;
        this.e = n7cVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        n7c n7cVar = this.e;
        zx7 zx7Var = this.d;
        switch (i) {
            case 0:
                x6c x6cVar = new x6c(zx7Var, n7cVar, jt1Var, 0);
                x6cVar.c = obj;
                return x6cVar;
            default:
                x6c x6cVar2 = new x6c(zx7Var, n7cVar, jt1Var, 1);
                x6cVar2.c = obj;
                return x6cVar2;
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
        return ((x6c) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n7c n7cVar = this.e;
        zx7 zx7Var = this.d;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                vx1 vx1Var = (vx1) this.c;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    sbb sbbVar = new sbb(14, vx1Var, n7cVar);
                    this.c = null;
                    this.b = 1;
                    Object objA0 = wx1.a0(new qoa(zx7Var, sbbVar, null, 29), this);
                    if (objA0 != xx1Var) {
                        objA0 = hebVar;
                    }
                    if (objA0 == xx1Var) {
                    }
                }
                break;
            default:
                vx1 vx1Var2 = (vx1) this.c;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    co6 co6Var = new co6(n7cVar, 1);
                    co6 co6Var2 = new co6(n7cVar, 2);
                    this.c = null;
                    this.b = 1;
                    Object objK = vv1.k(zx7Var, new le5(co6Var, new jca(4, n7cVar, vx1Var2), co6Var2, null, 5), this);
                    if (objK != xx1Var) {
                        objK = hebVar;
                    }
                    if (objK == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}
