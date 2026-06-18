package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xt extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ float b;
    public final /* synthetic */ zt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt(zt ztVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ztVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        zt ztVar = this.c;
        switch (i) {
            case 0:
                xt xtVar = new xt(ztVar, jt1Var, 0);
                xtVar.b = ((Number) obj).floatValue();
                return xtVar;
            case 1:
                xt xtVar2 = new xt(ztVar, jt1Var, 1);
                xtVar2.b = ((Number) obj).floatValue();
                return xtVar2;
            case 2:
                xt xtVar3 = new xt(ztVar, jt1Var, 2);
                xtVar3.b = ((Number) obj).floatValue();
                return xtVar3;
            default:
                xt xtVar4 = new xt(ztVar, jt1Var, 3);
                xtVar4.b = ((Number) obj).floatValue();
                return xtVar4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        float fFloatValue = ((Number) obj).floatValue();
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((xt) create(Float.valueOf(fFloatValue), jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((xt) create(Float.valueOf(fFloatValue), jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((xt) create(Float.valueOf(fFloatValue), jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((xt) create(Float.valueOf(fFloatValue), jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        zt ztVar = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                fr9 fr9Var = ztVar.u;
                if (fr9Var != null) {
                    while (true) {
                        Object value2 = fr9Var.getValue();
                        float f2 = f;
                        if (!fr9Var.j(value2, dsa.a((dsa) value2, 0L, null, 0, false, false, false, 0, 0.0d, 0.0f, 0.0f, null, 0, null, f2, 16383))) {
                            f = f2;
                        }
                    }
                }
                break;
            case 1:
                e11.e0(obj);
                fr9 fr9Var2 = ztVar.u;
                if (fr9Var2 != null) {
                    do {
                        value = fr9Var2.getValue();
                    } while (!fr9Var2.j(value, dsa.a((dsa) value, 0L, null, 0, false, false, false, 0, f, 0.0f, 0.0f, null, 0, null, 0.0f, 32639)));
                }
                break;
            case 2:
                e11.e0(obj);
                fr9 fr9Var3 = ztVar.u;
                if (fr9Var3 != null) {
                    while (true) {
                        Object value3 = fr9Var3.getValue();
                        float f3 = f;
                        if (!fr9Var3.j(value3, dsa.a((dsa) value3, 0L, null, 0, false, false, false, 0, 0.0d, f3, 0.0f, null, 0, null, 0.0f, 32255))) {
                            f = f3;
                        }
                    }
                }
                break;
            default:
                e11.e0(obj);
                fr9 fr9Var4 = ztVar.u;
                if (fr9Var4 != null) {
                    while (true) {
                        Object value4 = fr9Var4.getValue();
                        float f4 = f;
                        if (!fr9Var4.j(value4, dsa.a((dsa) value4, 0L, null, 0, false, false, false, 0, 0.0d, 0.0f, f4, null, 0, null, 0.0f, 31743))) {
                            f = f4;
                        }
                    }
                }
                break;
        }
        return hebVar;
    }
}
