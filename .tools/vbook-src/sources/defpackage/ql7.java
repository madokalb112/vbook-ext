package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ql7 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw8 b;

    public /* synthetic */ ql7(sw8 sw8Var, int i) {
        this.a = i;
        this.b = sw8Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        sw8 sw8Var = this.b;
        switch (i) {
            case 0:
                ot5 ot5Var = (ot5) fc1.z0(sw8Var.i().j().k);
                if (ot5Var != null) {
                    return Integer.valueOf(ot5Var.a);
                }
                return null;
            case 1:
                return Boolean.valueOf(sw8Var.k());
            default:
                sw8Var.c();
                return heb.a;
        }
    }
}
