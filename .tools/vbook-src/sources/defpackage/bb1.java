package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bb1 {
    public final float a;
    public final float b;

    public bb1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static boolean a(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb1)) {
            return false;
        }
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            bb1 bb1Var = (bb1) obj;
            if (bb1Var.a > bb1Var.b) {
                return true;
            }
        }
        bb1 bb1Var2 = (bb1) obj;
        return f == bb1Var2.a && f2 == bb1Var2.b;
    }

    public final int hashCode() {
        float f = this.a;
        float f2 = this.b;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
