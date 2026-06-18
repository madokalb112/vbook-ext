package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k81 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final float e;
    public final float f;

    public k81(float f, float f2, float f3, long j, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k81)) {
            return false;
        }
        k81 k81Var = (k81) obj;
        return Float.compare(this.a, k81Var.a) == 0 && Float.compare(this.b, k81Var.b) == 0 && Float.compare(this.c, k81Var.c) == 0 && lc1.d(this.d, k81Var.d) && Float.compare(this.e, k81Var.e) == 0 && Float.compare(this.f, k81Var.f) == 0;
    }

    public final int hashCode() {
        int iC = tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
        int i = lc1.k;
        return Float.hashCode(this.f) + tw2.c(this.e, xv5.b(iC, 31, this.d), 31);
    }

    public final String toString() {
        return "CircleData(x=" + this.a + ", y=" + this.b + ", radius=" + this.c + ", color=" + lc1.j(this.d) + ", alpha=" + this.e + ", depth=" + this.f + ")";
    }
}
