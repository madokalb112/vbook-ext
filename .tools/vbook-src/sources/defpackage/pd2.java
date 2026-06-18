package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pd2 implements Comparable {
    public final int a;
    public final int b;

    public pd2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        gp.k(dx1.f(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = vo1.y;
        int i2 = this.a;
        int i3 = this.b;
        return i == i3 ? i2 : i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        pd2 pd2Var = (pd2) obj;
        pd2Var.getClass();
        int iMax = Math.max(this.b, pd2Var.b);
        return lc5.V(a(iMax), pd2Var.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pd2)) {
            return false;
        }
        pd2 pd2Var = (pd2) obj;
        int iMax = Math.max(this.b, pd2Var.b);
        return lc5.V(a(iMax), pd2Var.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = vo1.y[this.b];
        int i2 = this.a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(bw9.k0(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
