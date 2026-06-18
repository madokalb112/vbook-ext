package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class mn1 {
    public static final zy2 a = new zy2("CLOSED", 6);

    public static final Object a(pz8 pz8Var, long j, yb4 yb4Var) {
        while (true) {
            if (pz8Var.e >= j && !pz8Var.g()) {
                return pz8Var;
            }
            Object objE = pz8Var.e();
            zy2 zy2Var = a;
            if (objE == zy2Var) {
                return zy2Var;
            }
            pz8 pz8Var2 = (pz8) ((nn1) objE);
            if (pz8Var2 == null) {
                pz8Var2 = (pz8) yb4Var.invoke(Long.valueOf(pz8Var.e + 1), pz8Var);
                if (pz8Var.j(pz8Var2)) {
                    if (pz8Var.g()) {
                        pz8Var.i();
                    }
                }
            }
            pz8Var = pz8Var2;
        }
    }
}
