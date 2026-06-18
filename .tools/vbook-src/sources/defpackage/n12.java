package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n12 {
    public final int a;
    public final long b;
    public final float c;

    public n12() {
        long j = lc1.e;
        this.a = 2;
        this.b = j;
        this.c = 0.7f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n12)) {
            return false;
        }
        n12 n12Var = (n12) obj;
        return this.a == n12Var.a && lc1.d(this.b, n12Var.b) && x13.c(this.c, n12Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        int i = lc1.k;
        return Float.hashCode(this.c) + xv5.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return ky0.s(x13.d(this.c), ")", j39.p("CropperStyleGuidelines(count=", ", color=", lc1.j(this.b), ", width=", this.a));
    }
}
