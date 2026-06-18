package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k14 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public k14(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k14)) {
            return false;
        }
        k14 k14Var = (k14) obj;
        if (x13.c(this.a, k14Var.a) && x13.c(this.b, k14Var.b) && x13.c(this.c, k14Var.c)) {
            return x13.c(this.d, k14Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
