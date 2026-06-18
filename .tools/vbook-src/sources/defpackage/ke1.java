package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ke1 {
    public static final ke1 a = new ke1();

    public static ou6 b(ou6 ou6Var, float f) {
        if (f <= 0.0d) {
            o75.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return ou6Var.e(new bp5(f, true));
    }

    public final ou6 a(ou6 ou6Var, vf0 vf0Var) {
        return ou6Var.e(new xo4(vf0Var));
    }
}
