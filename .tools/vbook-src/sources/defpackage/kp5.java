package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kp5 implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ br9 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ br9 e;
    public final /* synthetic */ jx8 f;

    public /* synthetic */ kp5(st5 st5Var, br9 br9Var, float f, br9 br9Var2, br9 br9Var3) {
        this.f = st5Var;
        this.b = br9Var;
        this.d = f;
        this.c = br9Var2;
        this.e = br9Var3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        ot5 ot5Var;
        qu5 qu5Var;
        int i = this.a;
        float f = 0.0f;
        br9 br9Var = this.e;
        float f2 = this.d;
        br9 br9Var2 = this.c;
        br9 br9Var3 = this.b;
        uu5 uu5Var = this.f;
        switch (i) {
            case 0:
                st5 st5Var = (st5) uu5Var;
                nt5 nt5VarJ = st5Var.j();
                if (nt5VarJ.n != 0 && !nt5VarJ.k.isEmpty() && (ot5Var = (ot5) br9Var3.getValue()) != null) {
                    float f3 = ot5Var.a;
                    int i2 = st5Var.i();
                    int i3 = ot5Var.q;
                    float f4 = ((i3 == 0 ? 0.0f : i2 / i3) + f3) / nt5VarJ.n;
                    float fP = wx1.P(1.0f - ((Number) br9Var2.getValue()).floatValue(), 0.0f, 1.0f);
                    if (((Number) br9Var2.getValue()).floatValue() >= f2) {
                        f = ((Boolean) br9Var.getValue()).booleanValue() ? fP - f4 : f4;
                    } else {
                        float f5 = 1.0f - f2;
                        if (((Boolean) br9Var.getValue()).booleanValue()) {
                            f4 = fP - f4;
                        }
                        f = (f4 * f5) / fP;
                    }
                }
                return Float.valueOf(f);
            default:
                uu5 uu5Var2 = uu5Var;
                ou5 ou5VarG = uu5Var2.g();
                if (ou5VarG.l != 0 && !ou5VarG.m.isEmpty() && (qu5Var = (qu5) br9Var3.getValue()) != null) {
                    float fIntValue = qu5Var.a / ((Number) br9Var2.getValue()).intValue();
                    int iH = ((zm7) uu5Var2.c.f).h();
                    int i4 = (int) (qu5Var.s & 4294967295L);
                    float fIntValue2 = ((i4 == 0 ? 0.0f : iH / i4) + fIntValue) / (ou5VarG.l / ((Number) br9Var2.getValue()).intValue());
                    float fP2 = wx1.P(1.0f - ((Number) br9Var.getValue()).floatValue(), 0.0f, 1.0f);
                    ((Number) br9Var.getValue()).floatValue();
                    f = ((1.0f - f2) * fIntValue2) / fP2;
                }
                return Float.valueOf(f);
        }
    }

    public /* synthetic */ kp5(uu5 uu5Var, br9 br9Var, br9 br9Var2, float f, br9 br9Var3) {
        this.f = uu5Var;
        this.b = br9Var;
        this.c = br9Var2;
        this.d = f;
        this.e = br9Var3;
    }
}
