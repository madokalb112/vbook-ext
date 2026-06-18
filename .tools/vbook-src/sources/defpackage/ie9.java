package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ie9 implements rn7 {
    public final w27 a;
    public final String b;

    public ie9(w27 w27Var, String str) {
        this.a = w27Var;
        this.b = str;
    }

    public final Object a(xv1 xv1Var, String str, int i) {
        if (i >= str.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = str.charAt(i);
        w27 w27Var = this.a;
        if (cCharAt == '-') {
            w27Var.invoke(xv1Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new jn7(i, new ib4() { // from class: he9
                @Override // defpackage.ib4
                public final Object invoke() {
                    return "Expected " + this.a.b + " but got " + cCharAt;
                }
            });
        }
        w27Var.invoke(xv1Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
