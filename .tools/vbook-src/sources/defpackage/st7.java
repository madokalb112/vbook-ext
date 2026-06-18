package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class st7 implements rn7 {
    public final String a;

    public st7(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            gp.l("Empty string is not allowed");
            throw null;
        }
        if (dk9.u(str.charAt(0))) {
            gp.k(xv5.p("String '", str, "' starts with a digit"));
            throw null;
        }
        if (dk9.u(str.charAt(str.length() - 1))) {
            gp.k(xv5.p("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    public final Object a(xv1 xv1Var, final String str, final int i) {
        String str2 = this.a;
        if (str2.length() + i > str.length()) {
            return new jn7(i, new wn6(this, 10));
        }
        int length = str2.length();
        for (final int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i + i2) != str2.charAt(i2)) {
                return new jn7(i, new ib4() { // from class: rt7
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(this.a.a);
                        sb.append(" but got ");
                        int i3 = i;
                        sb.append(str.subSequence(i3, i2 + i3 + 1).toString());
                        return sb.toString();
                    }
                });
            }
        }
        return Integer.valueOf(str2.length() + i);
    }

    public final String toString() {
        return xv5.s(new StringBuilder("'"), this.a, '\'');
    }
}
