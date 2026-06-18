package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bc9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public bc9(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc9)) {
            return false;
        }
        bc9 bc9Var = (bc9) obj;
        return this.a == bc9Var.a && this.b == bc9Var.b && this.c == bc9Var.c && this.d == bc9Var.d && this.e == bc9Var.e && this.f == bc9Var.f && this.g == bc9Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + j39.c(j39.c(tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "ShelfConfigState(shelfType=", ", columnSize=", ", sortBy=");
        ky0.u(this.c, this.d, ", sortOrder=", ", isShowReadPercent=", sbT);
        ky0.D(sbT, this.e, ", isShowTotalChapter=", this.f, ", isShowNewChapter=");
        return xv5.q(")", sbT, this.g);
    }
}
