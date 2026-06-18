package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class op0 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;

    public /* synthetic */ op0(br9 br9Var, int i) {
        this.a = i;
        this.b = br9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        z = false;
        boolean z = false;
        br9 br9Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue() / 100.0f);
            case 1:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue() / 100.0f);
            case 2:
                return Integer.valueOf(((kr3) br9Var.getValue()).h.isEmpty() ? 0 : ((kr3) br9Var.getValue()).e.size() + ((kr3) br9Var.getValue()).g.size() + ((kr3) br9Var.getValue()).c.size() + (!((kr3) br9Var.getValue()).b ? 1 : 0));
            case 3:
                return Boolean.valueOf((((ox) br9Var.getValue()) instanceof kx) || (((ox) br9Var.getValue()) instanceof mx));
            case 4:
                return Boolean.valueOf(((ox) br9Var.getValue()) instanceof lx);
            case 5:
                return Integer.valueOf(((Number) br9Var.getValue()).intValue());
            case 6:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 7:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 8:
                return Integer.valueOf(((Number) br9Var.getValue()).intValue());
            case 9:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 10:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 11:
                Boolean bool = (Boolean) br9Var.getValue();
                bool.getClass();
                return bool;
            case 12:
                Boolean bool2 = (Boolean) br9Var.getValue();
                bool2.getClass();
                return bool2;
            case 13:
                Boolean bool3 = (Boolean) br9Var.getValue();
                bool3.getClass();
                return bool3;
            case 14:
                Boolean bool4 = (Boolean) br9Var.getValue();
                bool4.getClass();
                return bool4;
            case 15:
                return Integer.valueOf(((Number) br9Var.getValue()).intValue());
            case 16:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 17:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 18:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 19:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 20:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 21:
                return Float.valueOf(((Number) br9Var.getValue()).floatValue());
            case 22:
                return new eb7(((eb7) br9Var.getValue()).a);
            case 23:
                so soVar = m19.a;
                return new eb7(((eb7) br9Var.getValue()).a);
            case 24:
                return Float.valueOf(br9Var != null ? ((Number) br9Var.getValue()).floatValue() : 1.0f);
            case 25:
                return Float.valueOf(br9Var != null ? ((Number) br9Var.getValue()).floatValue() : 0.0f);
            case 26:
                return Float.valueOf(br9Var != null ? ((Number) br9Var.getValue()).floatValue() : 0.0f);
            case 27:
                return Boolean.valueOf((br9Var != null ? ((Number) br9Var.getValue()).floatValue() : 0.0f) > 0.0f);
            case 28:
                return Boolean.valueOf((br9Var != null ? ((Number) br9Var.getValue()).floatValue() : 0.0f) > 0.0f);
            default:
                if (((gna) br9Var.getValue()).g && ((gna) br9Var.getValue()).h) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
