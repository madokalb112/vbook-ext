package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n9b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9b b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9b(o9b o9bVar, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = o9bVar;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new n9b(this.b, this.c, jt1Var, 0);
            default:
                return new n9b(this.b, this.c, jt1Var, 1);
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
                ((n9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((n9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        int i2 = this.c;
        o9b o9bVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.m.e(zc8.q[11], Integer.valueOf(i2));
                fr9 fr9Var = o9bVar.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, l9b.a((l9b) value, 0, this.c, false, false, false, false, 61)));
                }
                break;
            default:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.l.e(zc8.q[10], Integer.valueOf(i2));
                fr9 fr9Var2 = o9bVar.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, l9b.a((l9b) value2, this.c, 0, false, false, false, false, 62)));
                }
                break;
        }
        return hebVar;
    }
}
