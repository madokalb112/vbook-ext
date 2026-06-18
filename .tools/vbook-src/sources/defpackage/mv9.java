package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class mv9 extends l1 {
    public final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv9(String str, cf5 cf5Var) {
        super(cf5Var);
        str.getClass();
        this.s = str;
    }

    @Override // defpackage.l1
    public int A() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.s;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.l1
    public boolean e() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.s;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return l1.v(cCharAt);
            }
            i++;
        }
    }

    @Override // defpackage.l1
    public final String g() {
        j('\"');
        int i = this.b;
        String str = this.s;
        int iW = bw9.W(str, '\"', i, 4);
        if (iW == -1) {
            n();
            int i2 = this.b;
            l1.s(this, xv5.p("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iW; i3++) {
            if (str.charAt(i3) == '\\') {
                return m(str, this.b, i3);
            }
        }
        this.b = iW + 1;
        return str.substring(i, iW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // defpackage.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte h() {
        /*
            r4 = this;
            int r0 = r4.b
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.s
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.b = r1
            byte r4 = defpackage.kc5.t(r0)
            return r4
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv9.h():byte");
    }

    @Override // defpackage.l1
    public void j(char c) {
        int i = this.b;
        if (i == -1) {
            E(c);
            throw null;
        }
        while (true) {
            String str = this.s;
            if (i >= str.length()) {
                this.b = -1;
                E(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.l1
    public final CharSequence u() {
        return this.s;
    }

    @Override // defpackage.l1
    public final String w(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (h() == 6 && lc5.Q(y(z), str)) {
                this.c = null;
                if (h() == 5) {
                    return y(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.c = null;
        }
    }

    @Override // defpackage.l1
    public final int z(int i) {
        if (i < this.s.length()) {
            return i;
        }
        return -1;
    }
}
