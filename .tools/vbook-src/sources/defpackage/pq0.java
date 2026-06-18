package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pq0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq0(rq0 rq0Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = rq0Var;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.c;
        rq0 rq0Var = this.b;
        switch (i) {
            case 0:
                return new pq0(rq0Var, z, jt1Var, 0);
            default:
                return new pq0(rq0Var, z, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((pq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((pq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        boolean z = this.c;
        rq0 rq0Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((ip0) rq0Var.d).b.a.e(cp0.d[0], Boolean.valueOf(z));
                fr9 fr9Var = rq0Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, iq0.a((iq0) value, false, this.c, false, null, null, 59)));
                }
                break;
            default:
                e11.e0(obj);
                ((ip0) rq0Var.d).b.b.e(cp0.d[1], Boolean.valueOf(z));
                fr9 fr9Var2 = rq0Var.s;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, iq0.a((iq0) value2, false, false, this.c, null, null, 55)));
                }
                break;
        }
        return hebVar;
    }
}
