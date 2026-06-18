package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class to4 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo4 b;

    public /* synthetic */ to4(vo4 vo4Var, int i) {
        this.a = i;
        this.b = vo4Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        int i = this.a;
        heb hebVar = heb.a;
        vo4 vo4Var = this.b;
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                fr9 fr9Var = vo4Var.s;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, so4.a((so4) value, 0, (int) jLongValue, null, 13)));
                }
                break;
            default:
                ac9 ac9Var = (ac9) obj;
                fr9 fr9Var2 = vo4Var.s;
                if (fr9Var2 != null) {
                    do {
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, so4.a((so4) value2, ac9Var.a, 0, null, 14)));
                }
                break;
        }
        return hebVar;
    }
}
