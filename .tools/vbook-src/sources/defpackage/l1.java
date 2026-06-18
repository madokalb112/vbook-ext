package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class l1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public l1(cf5 cf5Var) {
        this.a = 0;
        this.d = cf5Var;
        this.e = new fv4(cf5Var);
        this.f = new StringBuilder();
    }

    public static /* synthetic */ void s(l1 l1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = l1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        l1Var.r(i, str, str2);
        throw null;
    }

    public static boolean v(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public abstract int A();

    public String B(int i, int i2) {
        return u().subSequence(i, i2).toString();
    }

    public boolean C() {
        int iA = A();
        CharSequence charSequenceU = u();
        if (iA >= charSequenceU.length() || iA == -1 || charSequenceU.charAt(iA) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean D(boolean z) {
        int iZ = z(A());
        int length = u().length() - iZ;
        if (length >= 4 && iZ != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != u().charAt(iZ + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || kc5.t(u().charAt(iZ + 4)) != 0) {
                    if (z) {
                        this.b = iZ + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void E(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strN = n();
                this.b = i;
                if (lc5.Q(strN, "null")) {
                    r(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strN2 = kc5.N(kc5.t(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        s(this, tw2.o("Expected ", strN2, ", but had '", (i2 == u().length() || i3 < 0) ? "EOF" : String.valueOf(u().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public void a() {
        this.c = (Map.Entry) this.f;
        Iterator it = (Iterator) this.e;
        this.f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public int c(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (t(charSequence, i + 3) + (t(charSequence, i) << 12) + (t(charSequence, i + 1) << 8) + (t(charSequence, i + 2) << 4)));
            return i2;
        }
        this.b = i;
        p();
        if (this.b + 4 < charSequence.length()) {
            return c(charSequence, this.b);
        }
        s(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void d(int i, int i2) {
        ((StringBuilder) this.f).append(u(), i, i2);
    }

    public abstract boolean e();

    public void f(int i, String str) {
        if (u().length() - i < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (u().charAt(i + i2) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + n() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String g();

    public abstract byte h();

    public boolean hasNext() {
        return ((Map.Entry) this.f) != null;
    }

    public byte i(byte b) {
        byte bH = h();
        if (bH == b) {
            return bH;
        }
        String strN = kc5.N(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        s(this, tw2.o("Expected ", strN, ", but had '", (i == u().length() || i2 < 0) ? "EOF" : String.valueOf(u().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void j(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        s(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b4, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bb, code lost:
    
        defpackage.mn5.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bf, code lost:
    
        if (r21 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c6, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c9, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        s(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        s(r22, "Expected numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
    
        s(r22, "Unexpected symbol '" + r7 + "' in numeric literal", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        if (r21 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0156, code lost:
    
        if (u().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0158, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015b, code lost:
    
        s(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0163, code lost:
    
        s(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
    
        r22.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016c, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0171, code lost:
    
        if (r8 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0173, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017b, code lost:
    
        if (r8 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017d, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0182, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k() {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1.k():long");
    }

    public String l() {
        String str = (String) this.c;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.c = null;
        return str;
    }

    public String m(CharSequence charSequence, int i, int i2) {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        charSequence.getClass();
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                d(i, i2);
                int iZ = z(i2 + 1);
                if (iZ == -1) {
                    s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iC = iZ + 1;
                char cCharAt2 = u().charAt(iZ);
                if (cCharAt2 == 'u') {
                    iC = c(u(), iC);
                } else {
                    char c = cCharAt2 < 'u' ? s21.a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        s(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = z(iC);
                if (i == -1) {
                    s(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    d(i, i2);
                    i = z(i2);
                    if (i == -1) {
                        s(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            d(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = B(i, i2);
        }
        this.b = i2 + 1;
        return string;
    }

    public String n() {
        String strB;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.c;
        if (str != null) {
            str.getClass();
            this.c = null;
            return str;
        }
        int iA = A();
        if (iA >= u().length() || iA == -1) {
            s(this, "EOF", iA, null, 4);
            throw null;
        }
        byte bT = kc5.t(u().charAt(iA));
        if (bT == 1) {
            return l();
        }
        if (bT != 0) {
            s(this, "Expected beginning of the string, but got " + u().charAt(iA), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (kc5.t(u().charAt(iA)) == 0) {
            iA++;
            if (iA >= u().length()) {
                d(this.b, iA);
                int iZ = z(iA);
                if (iZ == -1) {
                    this.b = iA;
                    d(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iA = iZ;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            d(i, iA);
            String string2 = sb.toString();
            sb.setLength(0);
            strB = string2;
        } else {
            strB = B(i, iA);
        }
        this.b = iA;
        return strB;
    }

    public String o() {
        String strN = n();
        if (!lc5.Q(strN, "null") || u().charAt(this.b - 1) == '\"') {
            return strN;
        }
        s(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void q() {
        if (h() == 10) {
            return;
        }
        s(this, "Expected EOF after parsing, but had " + u().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void r(int i, String str, String str2) {
        String strB = ((fv4) this.e).b();
        CharSequence charSequenceU = u();
        charSequenceU.getClass();
        throw new kf5(ny1.E(str, strB, str2, ((cf5) this.d).m ? ny1.Q(charSequenceU, i).toString() : null, i));
    }

    public void remove() {
        jk9 jk9Var = (jk9) this.d;
        if (jk9Var.f().d != this.b) {
            gp.d();
            return;
        }
        Map.Entry entry = (Map.Entry) this.c;
        if (entry == null) {
            j31.d();
            return;
        }
        jk9Var.remove(entry.getKey());
        this.c = null;
        this.b = jk9Var.f().d;
    }

    public int t(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        s(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) u());
                sb.append("', currentPosition=");
                return tw2.p(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public abstract CharSequence u();

    public abstract String w(String str, boolean z);

    public byte x() {
        CharSequence charSequenceU = u();
        int i = this.b;
        while (true) {
            int iZ = z(i);
            if (iZ == -1) {
                this.b = iZ;
                return (byte) 10;
            }
            char cCharAt = charSequenceU.charAt(iZ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iZ;
                return kc5.t(cCharAt);
            }
            i = iZ + 1;
        }
    }

    public String y(boolean z) {
        String strL;
        byte bX = x();
        if (z) {
            if (bX != 1 && bX != 0) {
                return null;
            }
            strL = n();
        } else {
            if (bX != 1) {
                return null;
            }
            strL = l();
        }
        this.c = strL;
        return strL;
    }

    public abstract int z(int i);

    public l1(gi8 gi8Var, int i, gi8 gi8Var2, int[] iArr, String str) {
        this.a = 1;
        iArr.getClass();
        this.d = gi8Var;
        this.b = i;
        this.e = gi8Var2;
        this.f = iArr;
        this.c = str;
    }

    public l1(jk9 jk9Var, Iterator it) {
        this.a = 2;
        this.d = jk9Var;
        this.e = it;
        this.b = jk9Var.f().d;
        a();
    }

    public void p() {
    }
}
