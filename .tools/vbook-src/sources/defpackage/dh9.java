package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dh9 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public dh9(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh9)) {
            return false;
        }
        dh9 dh9Var = (dh9) obj;
        return this.a == dh9Var.a && this.b.equals(dh9Var.b) && this.c == dh9Var.c && this.d == dh9Var.d && this.e == dh9Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("Skeleton(index=", ", name=", this.b, ", numFrag=", this.a);
        ky0.u(this.c, this.d, ", offset=", ", length=", sbP);
        return tw2.q(sbP, this.e, ")");
    }
}
