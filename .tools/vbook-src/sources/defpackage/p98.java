package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p98 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u98 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p98(u98 u98Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = u98Var;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new p98(this.b, this.c, jt1Var, 0);
            default:
                return new p98(this.b, this.c, jt1Var, 1);
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
                ((p98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((p98) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        u98 u98Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                c98 c98Var = (c98) u98Var.c;
                c98Var.c.l.e(x78.q[11], Boolean.valueOf(z));
                c98Var.S();
                fr9 fr9Var = u98Var.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, o98.a((o98) value, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, this.c, false, 49151)));
                }
                break;
            default:
                e11.e0(obj);
                ((c98) u98Var.c).c.o.e(x78.q[14], Boolean.valueOf(z));
                fr9 fr9Var2 = u98Var.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, o98.a((o98) value2, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, this.c, 32767)));
                }
                break;
        }
        return hebVar;
    }
}
