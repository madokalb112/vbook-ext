package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qq9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;

    public qq9(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq9)) {
            return false;
        }
        qq9 qq9Var = (qq9) obj;
        return Float.compare(this.a, qq9Var.a) == 0 && Float.compare(this.b, qq9Var.b) == 0 && Float.compare(this.c, qq9Var.c) == 0 && Float.compare(this.d, qq9Var.d) == 0 && Float.compare(this.e, qq9Var.e) == 0 && Float.compare(this.f, qq9Var.f) == 0 && Float.compare(this.g, qq9Var.g) == 0 && this.h == qq9Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + tw2.c(this.g, tw2.c(this.f, tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "StarData(x=" + this.a + ", y=" + this.b + ", size=" + this.c + ", baseAlpha=" + this.d + ", depth=" + this.e + ", speed=" + this.f + ", initialOffset=" + this.g + ", lastRegen=" + this.h + ")";
    }
}
