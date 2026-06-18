package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wj5 {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public wj5(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj5)) {
            return false;
        }
        wj5 wj5Var = (wj5) obj;
        return Float.compare(this.a, wj5Var.a) == 0 && Float.compare(this.b, wj5Var.b) == 0 && Float.compare(this.c, wj5Var.c) == 0 && this.d == wj5Var.d && this.e == wj5Var.e && this.f == wj5Var.f && Float.compare(this.g, wj5Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + j39.c(j39.c(j39.c(tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", unadjustedOffset=");
        sb.append(this.c);
        sb.append(", isFocal=");
        sb.append(this.d);
        sb.append(", isAnchor=");
        sb.append(this.e);
        sb.append(", isPivot=");
        sb.append(this.f);
        sb.append(", cutoff=");
        return dx1.i(sb, this.g, ')');
    }
}
