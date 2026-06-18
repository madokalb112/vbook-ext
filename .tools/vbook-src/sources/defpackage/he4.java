package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he4 {
    public long a = -1;
    public long b = 9205357640488583168L;
    public long c = 9205357640488583168L;
    public long d = 9205357640488583168L;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he4)) {
            return false;
        }
        he4 he4Var = (he4) obj;
        return tx7.a(this.a, he4Var.a) && eb7.c(this.b, he4Var.b) && eb7.c(this.c, he4Var.c) && eb7.c(this.d, he4Var.d) && this.e == he4Var.e && this.f == he4Var.f && this.g == he4Var.g && this.h == he4Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j39.c(j39.c(tw2.d(this.f, tw2.d(this.e, xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strB = tx7.b(this.a);
        String strJ = eb7.j(this.b);
        String strJ2 = eb7.j(this.c);
        String strJ3 = eb7.j(this.d);
        int i = this.e;
        int i2 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        StringBuilder sbQ = j39.q("GestureData(dragId=", strB, ", firstPos=", strJ, ", pos=");
        j39.y(sbQ, strJ2, ", nextPos=", strJ3, ", pointers=");
        ky0.u(i, i2, ", maxPointers=", ", isDrag=", sbQ);
        sbQ.append(z);
        sbQ.append(", isZoom=");
        sbQ.append(z2);
        sbQ.append(", isTap=false)");
        return sbQ.toString();
    }
}
