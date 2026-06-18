package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ypa extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hra b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypa(float f, hra hraVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = f;
        this.b = hraVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new ypa(this.c, this.b, jt1Var);
            default:
                return new ypa(this.b, this.c, jt1Var);
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
                ((ypa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((ypa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
        float f = this.c;
        hra hraVar = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                if (f < 0.0f) {
                    ((sd8) hraVar.K).a.f.e(zc8.q[4], Boolean.TRUE);
                    fr9 fr9Var = hraVar.j0;
                    if (fr9Var != null) {
                        do {
                            value2 = fr9Var.getValue();
                        } while (!fr9Var.j(value2, yba.a((yba) value2, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, true, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -32769, 1)));
                    }
                } else {
                    km0 km0Var = ((sd8) hraVar.K).a.f;
                    ni5[] ni5VarArr = zc8.q;
                    km0Var.e(ni5VarArr[4], Boolean.FALSE);
                    ((sd8) hraVar.K).a.g.e(ni5VarArr[5], Float.valueOf(f));
                    fr9 fr9Var2 = hraVar.j0;
                    if (fr9Var2 != null) {
                        do {
                            value = fr9Var2.getValue();
                        } while (!fr9Var2.j(value, yba.a((yba) value, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, this.c, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -98305, 1)));
                    }
                }
                break;
            default:
                e11.e0(obj);
                ((xba) hraVar.L).a.e.e(zia.A[6], Float.valueOf(f));
                fr9 fr9Var3 = hraVar.j0;
                if (fr9Var3 != null) {
                    do {
                        value3 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value3, yba.a((yba) value3, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, this.c, 0, 0, 0, 0, -268435457, 1)));
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypa(hra hraVar, float f, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = hraVar;
        this.c = f;
    }
}
