package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class wc8 extends l1 {
    public final pb5 s;
    public final char[] t;
    public int u;
    public final tv v;

    public wc8(pb5 pb5Var, char[] cArr, cf5 cf5Var) {
        super(cf5Var);
        this.s = pb5Var;
        this.t = cArr;
        this.u = Token.CASE;
        this.v = new tv(cArr);
        F(0);
    }

    @Override // defpackage.l1
    public int A() {
        int iZ;
        char c;
        int i = this.b;
        while (true) {
            iZ = z(i);
            if (iZ == -1 || !((c = this.v.a[iZ]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iZ + 1;
        }
        this.b = iZ;
        return iZ;
    }

    @Override // defpackage.l1
    public final String B(int i, int i2) {
        tv tvVar = this.v;
        return iw9.y(tvVar.a, i, Math.min(i2, tvVar.b));
    }

    public final void F(int i) {
        tv tvVar = this.v;
        char[] cArr = tvVar.a;
        if (i != 0) {
            int i2 = this.b;
            fw.S(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = tvVar.b;
        while (true) {
            if (i == i3) {
                break;
            }
            int iA = this.s.a(cArr, i, i3 - i);
            if (iA == -1) {
                tvVar.b = Math.min(tvVar.a.length, i);
                this.u = -1;
                break;
            }
            i += iA;
        }
        this.b = 0;
    }

    public final void G() {
        n21 n21Var = n21.c;
        n21Var.getClass();
        char[] cArr = this.t;
        cArr.getClass();
        if (cArr.length == 16384) {
            n21Var.D(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // defpackage.l1
    public final void d(int i, int i2) {
        ((StringBuilder) this.f).append(this.v.a, i, i2 - i);
    }

    @Override // defpackage.l1
    public boolean e() {
        p();
        int i = this.b;
        while (true) {
            int iZ = z(i);
            if (iZ == -1) {
                this.b = iZ;
                return false;
            }
            char c = this.v.a[iZ];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = iZ;
                return l1.v(c);
            }
            i = iZ + 1;
        }
    }

    @Override // defpackage.l1
    public final String g() {
        j('\"');
        int i = this.b;
        tv tvVar = this.v;
        int i2 = tvVar.b;
        char[] cArr = tvVar.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iZ = z(i);
            int i4 = this.b;
            if (iZ != -1) {
                return m(tvVar, i4, iZ);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            l1.s(this, xv5.p("Expected quotation mark '\"', but had '", (i4 == tvVar.b || i5 < 0) ? "EOF" : String.valueOf(tvVar.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return m(tvVar, this.b, i6);
            }
        }
        this.b = i3 + 1;
        return iw9.y(cArr, i, Math.min(i3, tvVar.b));
    }

    @Override // defpackage.l1
    public byte h() {
        p();
        int i = this.b;
        while (true) {
            int iZ = z(i);
            if (iZ == -1) {
                this.b = iZ;
                return (byte) 10;
            }
            int i2 = iZ + 1;
            byte bT = kc5.t(this.v.a[iZ]);
            if (bT != 3) {
                this.b = i2;
                return bT;
            }
            i = i2;
        }
    }

    @Override // defpackage.l1
    public void j(char c) {
        p();
        int i = this.b;
        while (true) {
            int iZ = z(i);
            if (iZ == -1) {
                this.b = iZ;
                E(c);
                throw null;
            }
            int i2 = iZ + 1;
            char c2 = this.v.a[iZ];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                E(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.l1
    public final void p() {
        int i = this.v.b - this.b;
        if (i > this.u) {
            return;
        }
        F(i);
    }

    @Override // defpackage.l1
    public final CharSequence u() {
        return this.v;
    }

    @Override // defpackage.l1
    public final String w(String str, boolean z) {
        str.getClass();
        return null;
    }

    @Override // defpackage.l1
    public final int z(int i) {
        tv tvVar = this.v;
        if (i < tvVar.b) {
            return i;
        }
        this.b = i;
        p();
        return (this.b != 0 || tvVar.length() == 0) ? -1 : 0;
    }
}
