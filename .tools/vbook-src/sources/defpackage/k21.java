package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k21 implements CharSequence, Appendable {
    public final pa7 a;
    public ArrayList b;
    public char[] c;
    public String d;
    public boolean e;
    public int f;
    public int s;

    public k21() {
        pa7 pa7Var = p21.a;
        pa7Var.getClass();
        this.a = pa7Var;
    }

    public final char[] a(int i) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            char[] cArr = this.c;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            e(i);
            throw null;
        }
        char[] cArr2 = this.c;
        if (cArr2 != null) {
            return cArr2;
        }
        e(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrD = d();
            int length = cArrD.length;
            int i4 = this.f;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrD[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f -= iMin;
        }
        this.d = null;
        this.s = (i2 - i) + this.s;
        return this;
    }

    public final CharSequence b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrA = a(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrA[iMax]);
            }
        }
        return sb;
    }

    public final char c(int i) {
        char[] cArrA = a(i);
        char[] cArr = this.c;
        cArr.getClass();
        return cArrA[i % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            gp.k(dx1.f(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.s) {
            return c(i);
        }
        gp.k(tw2.p(xv5.u(i, "index ", " is not in range [0, "), this.s, ')'));
        return (char) 0;
    }

    public final char[] d() {
        if (this.f != 0) {
            char[] cArr = this.c;
            cArr.getClass();
            return cArr;
        }
        char[] cArr2 = (char[]) this.a.G();
        char[] cArr3 = this.c;
        this.c = cArr2;
        this.f = cArr2.length;
        this.e = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    public final void e(int i) {
        if (this.e) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.c;
        cArr.getClass();
        sb.append(cArr.length - this.f);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.s == charSequence.length()) {
                int i = this.s;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.s;
        int iC = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iC = (iC * 31) + c(i2);
        }
        return iC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.s;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            gp.f(i, "startIndex (", ") should be less or equal to endIndex (", i2);
            return null;
        }
        if (i < 0) {
            gp.k(dx1.f(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.s) {
            return new i21(this, i, i2);
        }
        gp.k(tw2.p(xv5.u(i2, "endIndex (", ") is greater than length ("), this.s, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String string = b(0, this.s).toString();
        this.d = string;
        return string;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrD = d();
        char[] cArr = this.c;
        cArr.getClass();
        int length = cArr.length;
        int i = this.f;
        cArrD[length - i] = c;
        this.d = null;
        this.f = i - 1;
        this.s++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
