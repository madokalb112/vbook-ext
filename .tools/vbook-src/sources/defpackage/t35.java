package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t35 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i45 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t35(i45 i45Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = i45Var;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new t35(this.b, this.c, jt1Var, 0);
            case 1:
                return new t35(this.b, this.c, jt1Var, 1);
            case 2:
                return new t35(this.b, this.c, jt1Var, 2);
            case 3:
                return new t35(this.b, this.c, jt1Var, 3);
            case 4:
                return new t35(this.b, this.c, jt1Var, 4);
            default:
                return new t35(this.b, this.c, jt1Var, 5);
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
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((t35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        Object value5;
        Object value6;
        int i = this.a;
        heb hebVar = heb.a;
        boolean z = this.c;
        i45 i45Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((yy4) i45Var.v).a.h.e(zc8.q[6], Boolean.valueOf(z));
                fr9 fr9Var = i45Var.M;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, zy4.a((zy4) value, 0, 0, 0.0f, 0, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, this.c, false, false, false, 1966079)));
                }
                break;
            case 1:
                e11.e0(obj);
                ((yy4) i45Var.v).a.f.e(zc8.q[4], Boolean.valueOf(z));
                fr9 fr9Var2 = i45Var.M;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, zy4.a((zy4) value2, 0, 0, 0.0f, 0, 0, false, false, false, this.c, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2096895)));
                }
                break;
            case 2:
                e11.e0(obj);
                ((yy4) i45Var.v).b.h.e(m15.k[7], Boolean.valueOf(z));
                fr9 fr9Var3 = i45Var.M;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, zy4.a((zy4) value3, 0, 0, 0.0f, 0, 0, false, false, this.c, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097023)));
                }
                break;
            case 3:
                e11.e0(obj);
                ((yy4) i45Var.v).b.g.e(m15.k[6], Boolean.valueOf(z));
                fr9 fr9Var4 = i45Var.M;
                if (fr9Var4 != null) {
                    do {
                        value4 = fr9Var4.getValue();
                    } while (!fr9Var4.j(value4, zy4.a((zy4) value4, 0, 0, 0.0f, 0, 0, false, this.c, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097087)));
                }
                break;
            case 4:
                e11.e0(obj);
                ((yy4) i45Var.v).b.f.e(m15.k[5], Boolean.valueOf(z));
                fr9 fr9Var5 = i45Var.M;
                if (fr9Var5 != null) {
                    do {
                        value5 = fr9Var5.getValue();
                    } while (!fr9Var5.j(value5, zy4.a((zy4) value5, 0, 0, 0.0f, 0, 0, this.c, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097119)));
                }
                break;
            default:
                e11.e0(obj);
                ((yy4) i45Var.v).b.i.e(m15.k[8], Boolean.valueOf(z));
                fr9 fr9Var6 = i45Var.M;
                if (fr9Var6 != null) {
                    do {
                        value6 = fr9Var6.getValue();
                    } while (!fr9Var6.j(value6, zy4.a((zy4) value6, 0, 0, 0.0f, 0, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, this.c, false, false, 1835007)));
                }
                break;
        }
        return hebVar;
    }
}
