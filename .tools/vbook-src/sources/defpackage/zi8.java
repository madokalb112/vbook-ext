package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zi8 extends rl5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi8(gj8 gj8Var, int i) {
        super(0);
        this.a = i;
        this.b = gj8Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        long j;
        int i = this.a;
        float fQ = 0.0f;
        gj8 gj8Var = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(gj8Var.k.getValue() != null);
            case 1:
                return gj8Var.a.c();
            case 2:
                fp5 fp5VarD = gj8Var.d();
                if (fp5VarD != null) {
                    float fG = gj8Var.a.c().g();
                    long jB = fp5VarD.b();
                    fQ = (fG - uj9.q(qu1.j((int) (jB >> 32), (int) (jB & 4294967295L)), gj8Var.f())) - 1.0f;
                }
                return Float.valueOf(fQ);
            default:
                fp5 fp5VarD2 = gj8Var.d();
                if (fp5VarD2 != null) {
                    long jB2 = fp5VarD2.b();
                    float fQ2 = uj9.q(qu1.j((int) (jB2 >> 32), (int) (jB2 & 4294967295L)), gj8Var.f());
                    long jA = fp5VarD2.a();
                    lh7 lh7VarF = gj8Var.f();
                    lh7VarF.getClass();
                    int iOrdinal = lh7VarF.ordinal();
                    if (iOrdinal == 0) {
                        j = jA & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            mn5.g();
                            return null;
                        }
                        j = jA >> 32;
                    }
                    fQ = (fQ2 + ((int) j)) - 1.0f;
                }
                return Float.valueOf(fQ);
        }
    }
}
