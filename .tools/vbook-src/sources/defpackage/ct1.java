package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ct1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct1(ft1 ft1Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = ft1Var;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.c;
        ft1 ft1Var = this.b;
        switch (i) {
            case 0:
                return new ct1(ft1Var, z, jt1Var, 0);
            default:
                return new ct1(ft1Var, z, jt1Var, 1);
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
                ((ct1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((ct1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        ft1 ft1Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((xba) ft1Var.c).a.x.e(zia.A[25], Boolean.valueOf(z));
                fr9 fr9Var = ft1Var.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, zs1.a((zs1) value, false, z, null, 5)));
                }
                break;
            default:
                e11.e0(obj);
                ((xba) ft1Var.c).a.w.e(zia.A[24], Boolean.valueOf(z));
                fr9 fr9Var2 = ft1Var.d;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, zs1.a((zs1) value2, z, false, null, 6)));
                }
                break;
        }
        return hebVar;
    }
}
