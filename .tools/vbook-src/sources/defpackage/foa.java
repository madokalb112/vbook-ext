package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class foa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ joa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ foa(float f, joa joaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = f;
        this.c = joaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new foa(this.c, this.b, jt1Var, 0);
            case 1:
                return new foa(this.b, this.c, jt1Var, 1);
            case 2:
                return new foa(this.b, this.c, jt1Var, 2);
            default:
                return new foa(this.c, this.b, jt1Var, 3);
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
                ((foa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((foa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((foa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((foa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.b;
        joa joaVar = this.c;
        switch (i) {
            case 0:
                e11.e0(obj);
                ((zna) joaVar.s).a.g.e(rna.m[6], Float.valueOf(f));
                fr9 fr9Var = joaVar.x;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, tla.a((tla) value, 0.0f, 0.0f, 0L, false, false, this.b, null, 191)));
                }
                joaVar.d.getClass();
                d6a d6aVar = vg3.a;
                vg3.a(ela.a);
                break;
            case 1:
                e11.e0(obj);
                float fP = wx1.P(f, 0.5f, 3.0f);
                fr9 fr9Var2 = joaVar.x;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, tla.a((tla) value2, 0.0f, fP, 0L, false, false, 0.0f, null, 253)));
                }
                ((zna) joaVar.s).v(fP);
                break;
            case 2:
                e11.e0(obj);
                float fP2 = wx1.P(f, 0.5f, 6.0f);
                fr9 fr9Var3 = joaVar.x;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, tla.a((tla) value3, fP2, 0.0f, 0L, false, false, 0.0f, null, 254)));
                }
                ((zna) joaVar.s).w(fP2);
                break;
            default:
                e11.e0(obj);
                joaVar.d.getClass();
                vg3.a(new mla(f));
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ foa(joa joaVar, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = joaVar;
        this.b = f;
    }
}
