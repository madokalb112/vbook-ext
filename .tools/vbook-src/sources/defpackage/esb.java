package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class esb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h49 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esb(h49 h49Var, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = h49Var;
        this.c = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new esb(this.b, this.c, jt1Var, 0);
            default:
                return new esb(this.b, this.c, jt1Var, 1);
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
                ((esb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((esb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        long j = this.c;
        h49 h49Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((nnb) h49Var.s).a.j.e(mqb.t[12], Long.valueOf(j));
                fr9 fr9Var = h49Var.H;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, onb.a((onb) value, 0, 0, 0, false, false, false, false, 0.0f, 0.0f, 0L, this.c, 0, 0.0f, false, 0.0f, 0.0f, 0, 0, false, false, 0.0f, false, false, 8387583)));
                }
                break;
            default:
                e11.e0(obj);
                ((nnb) h49Var.s).a.i.e(mqb.t[11], Long.valueOf(j));
                fr9 fr9Var2 = h49Var.H;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, onb.a((onb) value2, 0, 0, 0, false, false, false, false, 0.0f, 0.0f, this.c, 0L, 0, 0.0f, false, 0.0f, 0.0f, 0, 0, false, false, 0.0f, false, false, 8388095)));
                }
                break;
        }
        return hebVar;
    }
}
