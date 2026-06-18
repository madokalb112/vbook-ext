package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class du4 {
    public final k21 a;
    public int b;
    public int c;
    public hk4 d;

    public du4(k21 k21Var) {
        k21Var.getClass();
        this.a = k21Var;
        this.d = (hk4) eu4.b.G();
    }

    public final i21 a(String str) {
        if (this.b == 0) {
            return null;
        }
        int i = i31.a;
        int iAbs = Math.abs(i31.a(str, 0, str.length()));
        int i2 = this.c;
        while (true) {
            int i3 = iAbs % i2;
            int i4 = i3 * 6;
            if (this.d.a(i4) == -1) {
                return null;
            }
            if (b(str, i4)) {
                return (i21) this.a.subSequence(this.d.a(i4 + 3), this.d.a(i4 + 4));
            }
            iAbs = i3 + 1;
            i2 = this.c;
        }
    }

    public final boolean b(CharSequence charSequence, int i) {
        int iA = this.d.a(i + 1);
        int iA2 = this.d.a(i + 2);
        int i2 = i31.a;
        k21 k21Var = this.a;
        k21Var.getClass();
        if (iA2 - iA != charSequence.length()) {
            return false;
        }
        for (int i3 = iA; i3 < iA2; i3++) {
            int iCharAt = k21Var.charAt(i3);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence.charAt(i3 - iA);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        double d = i6;
        int i7 = this.c;
        if (d >= ((double) i7) * 0.75d) {
            hk4 hk4Var = this.d;
            this.b = 0;
            this.c = (i7 * 2) | Token.CASE;
            hk4 hk4Var2 = (hk4) eu4.b.G();
            int size = (hk4Var.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                hk4Var2.a.add(eu4.a.G());
            }
            this.d = hk4Var2;
            b39 b39VarY = ex1.Y(new gk4(hk4Var, null));
            while (b39VarY.hasNext()) {
                int iIntValue = ((Number) b39VarY.next()).intValue();
                c(hk4Var.a(iIntValue + 1), hk4Var.a(iIntValue + 2), hk4Var.a(iIntValue + 3), hk4Var.a(iIntValue + 4));
            }
            eu4.b.C0(hk4Var);
            if (i6 != this.b) {
                gp.l("Failed requirement.");
                return;
            }
        }
        k21 k21Var = this.a;
        int iAbs = Math.abs(i31.a(k21Var, i, i2));
        CharSequence charSequenceSubSequence = k21Var.subSequence(i, i2);
        int i9 = iAbs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(charSequenceSubSequence, i5)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.b(i5, iAbs);
        this.d.b(i5 + 1, i);
        this.d.b(i5 + 2, i2);
        this.d.b(i5 + 3, i3);
        this.d.b(i5 + 4, i4);
        this.d.b(i5 + 5, -1);
        if (i10 != -1) {
            this.d.b((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final void d() {
        this.b = 0;
        this.c = 0;
        qs0 qs0Var = eu4.b;
        qs0Var.C0(this.d);
        this.d = (hk4) qs0Var.G();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        qs0 qs0Var = eu4.a;
        hk4 hk4Var = this.d;
        hk4Var.getClass();
        b39 b39VarY = ex1.Y(new gk4(hk4Var, null));
        while (b39VarY.hasNext()) {
            int iIntValue = ((Number) b39VarY.next()).intValue();
            sb.append((CharSequence) "");
            int iA = this.d.a(iIntValue + 1);
            int iA2 = this.d.a(iIntValue + 2);
            sb.append(this.a.subSequence(iA, iA2));
            sb.append((CharSequence) " => ");
            sb.append(r5.subSequence(this.d.a(iIntValue + 3), this.d.a(iIntValue + 4)));
            sb.append((CharSequence) "\n");
        }
        return sb.toString();
    }
}
