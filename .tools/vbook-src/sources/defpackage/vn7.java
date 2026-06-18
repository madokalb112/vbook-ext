package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vn7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;

    public vn7(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn7)) {
            return false;
        }
        vn7 vn7Var = (vn7) obj;
        return Float.compare(this.a, vn7Var.a) == 0 && Float.compare(this.b, vn7Var.b) == 0 && Float.compare(this.c, vn7Var.c) == 0 && Float.compare(this.d, vn7Var.d) == 0 && Float.compare(this.e, vn7Var.e) == 0 && this.f == vn7Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Particle(x=" + this.a + ", y=" + this.b + ", vx=" + this.c + ", vy=" + this.d + ", radius=" + this.e + ", colorIndex=" + this.f + ")";
    }
}
