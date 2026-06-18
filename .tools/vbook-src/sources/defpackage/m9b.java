package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m9b extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9b b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9b(o9b o9bVar, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = o9bVar;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new m9b(this.b, this.c, jt1Var, 0);
            case 1:
                return new m9b(this.b, this.c, jt1Var, 1);
            case 2:
                return new m9b(this.b, this.c, jt1Var, 2);
            default:
                return new m9b(this.b, this.c, jt1Var, 3);
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
                ((m9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((m9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((m9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((m9b) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        heb hebVar = heb.a;
        boolean z = this.c;
        o9b o9bVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.j.e(zc8.q[8], Boolean.valueOf(z));
                fr9 fr9Var = o9bVar.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, l9b.a((l9b) value, 0, 0, false, this.c, false, false, 55)));
                }
                break;
            case 1:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.k.e(zc8.q[9], Boolean.valueOf(z));
                fr9 fr9Var2 = o9bVar.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, l9b.a((l9b) value2, 0, 0, false, false, this.c, false, 47)));
                }
                break;
            case 2:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.i.e(zc8.q[7], Boolean.valueOf(z));
                fr9 fr9Var3 = o9bVar.d;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, l9b.a((l9b) value3, 0, 0, this.c, false, false, false, 59)));
                }
                break;
            default:
                e11.e0(obj);
                ((sd8) o9bVar.c).a.n.e(zc8.q[12], Boolean.valueOf(z));
                fr9 fr9Var4 = o9bVar.d;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, l9b.a((l9b) value4, 0, 0, false, false, false, this.c, 31)));
                }
                break;
        }
        return hebVar;
    }
}
