package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class cm6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ br9 d;

    public /* synthetic */ cm6(a07 a07Var, a07 a07Var2, br9 br9Var, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = br9Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        br9 br9Var = this.d;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && !((List) a07Var.getValue()).isEmpty()) {
                    int iS = gc1.S((List) a07Var.getValue());
                    int iIntValue = ((Number) br9Var.getValue()).intValue();
                    if (iIntValue >= 0 && iIntValue < iS) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && !((List) a07Var.getValue()).isEmpty()) {
                    int iS2 = gc1.S((List) a07Var.getValue());
                    int iIntValue2 = ((Number) br9Var.getValue()).intValue();
                    if (iIntValue2 >= 0 && iIntValue2 < iS2) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                if (((wga) a07Var2.getValue()).a.b.length() == 0 && !((List) a07Var.getValue()).isEmpty()) {
                    int iS3 = gc1.S((List) a07Var.getValue());
                    int iIntValue3 = ((Number) br9Var.getValue()).intValue();
                    if (iIntValue3 >= 0 && iIntValue3 < iS3) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
