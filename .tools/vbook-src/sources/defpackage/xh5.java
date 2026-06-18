package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xh5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public xh5(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh5)) {
            return false;
        }
        xh5 xh5Var = (xh5) obj;
        return this.a == xh5Var.a && this.b == xh5Var.b && this.c == xh5Var.c && this.d == xh5Var.d && this.e == xh5Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "KF8Header(fdst=", ", numFdst=", ", frag=");
        ky0.u(this.c, this.d, ", skel=", ", guide=", sbT);
        return tw2.q(sbT, this.e, ")");
    }
}
