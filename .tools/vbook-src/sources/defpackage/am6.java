package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class am6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ br9 d;
    public final /* synthetic */ br9 e;

    public /* synthetic */ am6(a07 a07Var, a07 a07Var2, br9 br9Var, br9 br9Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = br9Var;
        this.e = br9Var2;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        br9 br9Var = this.e;
        br9 br9Var2 = this.d;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && ((Number) a07Var.getValue()).intValue() >= 0 && ((Number) br9Var2.getValue()).intValue() >= 0) {
                    int iIntValue = ((Number) br9Var.getValue()).intValue();
                    int iIntValue2 = ((Number) br9Var2.getValue()).intValue();
                    int iIntValue3 = ((Number) a07Var.getValue()).intValue();
                    if (iIntValue > iIntValue3 || iIntValue3 > iIntValue2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && ((Number) a07Var.getValue()).intValue() >= 0 && ((Number) br9Var2.getValue()).intValue() >= 0) {
                    int iIntValue4 = ((Number) br9Var.getValue()).intValue();
                    int iIntValue5 = ((Number) br9Var2.getValue()).intValue();
                    int iIntValue6 = ((Number) a07Var.getValue()).intValue();
                    if (iIntValue4 > iIntValue6 || iIntValue6 > iIntValue5) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && ((Number) a07Var.getValue()).intValue() >= 0 && ((Number) br9Var2.getValue()).intValue() >= 0) {
                    int iIntValue7 = ((Number) br9Var.getValue()).intValue();
                    int iIntValue8 = ((Number) br9Var2.getValue()).intValue();
                    int iIntValue9 = ((Number) a07Var.getValue()).intValue();
                    if (iIntValue7 > iIntValue9 || iIntValue9 > iIntValue8) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
