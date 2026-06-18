package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yz2 {
    public final int a;
    public final int b;
    public final double c;

    public yz2(int i, int i2) {
        int iL;
        this.a = i;
        this.b = i2;
        int iX = kc5.x(i2, 9, 7) + 1980;
        int iX2 = kc5.x(i2, 5, 4);
        int i3 = 0;
        int iX3 = kc5.x(i2, 0, 5);
        int iX4 = kc5.x(i, 11, 5);
        int iX5 = kc5.x(i, 5, 6);
        int iX6 = kc5.x(i, 0, 5) * 2;
        int i4 = (iX6 / 60) + iX5;
        int iL2 = rw1.L(iX6, 0, 59);
        int i5 = (i4 / 60) + iX4;
        int iL3 = rw1.L(i4, 0, 59);
        int iL4 = (i5 / 24) + iX3;
        int iL5 = rw1.L(i5, 0, 23);
        while (true) {
            int iA = qw1.a(iX2, qw1.b(iX));
            int i6 = ((iL4 - 1) / iA) + iX2;
            iL4 = rw1.L(iL4, 1, iA);
            iX += (i6 - 1) / 12;
            iL = rw1.L(i6, 1, 12);
            if (rw1.L(iL4, 1, qw1.a(iL, qw1.b(iX))) == iL4) {
                break;
            } else {
                iX2 = iL;
            }
        }
        int i7 = iX - 1;
        int i8 = i7 * 365;
        if (iX < 1) {
            for (int i9 = 1; i9 >= iX; i9--) {
                if (qw1.b(i9)) {
                    i3--;
                }
            }
        } else {
            i3 = ((i7 / 4) - (i7 / 100)) + (i7 / 400);
        }
        this.c = (((double) iL2) * 1000.0d) + (((double) iL3) * 60000.0d) + (((double) iL5) * 3600000.0d) + ((((double) ((((i8 + i3) + ((int[][]) qw1.a.getValue())[qw1.b(iX) ? 1 : 0][(iL - 1) % 12]) + iL4) - 1)) * 8.64E7d) - 6.21355968E13d) + 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz2)) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        return this.a == yz2Var.a && this.b == yz2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DosFileDateTime(dosTime=");
        sb.append(this.a);
        sb.append(", dosDate=");
        return tw2.p(sb, this.b, ')');
    }
}
