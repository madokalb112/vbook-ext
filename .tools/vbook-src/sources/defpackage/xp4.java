package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xp4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public xp4(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static xp4 a(xp4 xp4Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = xp4Var.a;
        }
        if ((i & 2) != 0) {
            f2 = xp4Var.b;
        }
        if ((i & 4) != 0) {
            f3 = xp4Var.c;
        }
        if ((i & 8) != 0) {
            f4 = xp4Var.d;
        }
        xp4Var.getClass();
        return new xp4(f, f2, f3, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp4)) {
            return false;
        }
        xp4 xp4Var = (xp4) obj;
        return Float.compare(this.a, xp4Var.a) == 0 && Float.compare(this.b, xp4Var.b) == 0 && Float.compare(this.c, xp4Var.c) == 0 && Float.compare(this.d, xp4Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "HsvColor(hue=" + this.a + ", saturation=" + this.b + ", value=" + this.c + ", alpha=" + this.d + ")";
    }
}
