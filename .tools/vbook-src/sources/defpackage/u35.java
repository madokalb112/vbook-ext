package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u35 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i45 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u35(i45 i45Var, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = i45Var;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new u35(this.b, this.c, jt1Var, 0);
            default:
                return new u35(this.b, this.c, jt1Var, 1);
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
                ((u35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((u35) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        float f = this.c;
        i45 i45Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((yy4) i45Var.v).a.g.e(zc8.q[5], Float.valueOf(f));
                fr9 fr9Var = i45Var.M;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, zy4.a((zy4) value, 0, 0, 0.0f, 0, 0, false, false, false, false, this.c, 0, 0, false, false, false, false, false, false, false, false, 2096639)));
                }
                break;
            default:
                e11.e0(obj);
                ((yy4) i45Var.v).b.c.e(m15.k[2], Float.valueOf(f));
                fr9 fr9Var2 = i45Var.M;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, zy4.a((zy4) value2, 0, 0, this.c, 0, 0, false, false, false, false, 0.0f, 0, 0, false, false, false, false, false, false, false, false, 2097147)));
                }
                break;
        }
        return hebVar;
    }
}
