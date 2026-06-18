package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a89 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b89 b;

    public /* synthetic */ a89(b89 b89Var, int i) {
        this.a = i;
        this.b = b89Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        heb hebVar = heb.a;
        b89 b89Var = this.b;
        switch (i) {
            case 0:
                v49 v49Var = (v49) obj;
                fr9 fr9Var = b89Var.d;
                if (v49Var instanceof t49) {
                    if (fr9Var == null) {
                        return hebVar;
                    }
                    do {
                        value2 = fr9Var.getValue();
                    } while (!fr9Var.j(value2, o79.a((o79) value2, false, true, ((t49) v49Var).a, null, 25)));
                    return hebVar;
                }
                if (!lc5.Q(v49Var, u49.a)) {
                    mn5.g();
                    return null;
                }
                if (fr9Var == null) {
                    return hebVar;
                }
                do {
                    value = fr9Var.getValue();
                } while (!fr9Var.j(value, o79.a((o79) value, false, false, "", null, 25)));
                return hebVar;
            default:
                vl5 vl5Var = (vl5) obj;
                fr9 fr9Var2 = b89Var.d;
                if (fr9Var2 != null) {
                    do {
                        value3 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value3, o79.a((o79) value3, false, false, null, vl5Var, 23)));
                }
                return hebVar;
        }
    }
}
