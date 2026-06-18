package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ry0 {
    public final float a;
    public final float b;

    public ry0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ry0)) {
            return false;
        }
        ry0 ry0Var = (ry0) obj;
        return x13.c(this.a, ry0Var.a) && x13.c(0.0f, 0.0f) && x13.c(0.0f, 0.0f) && x13.c(this.b, ry0Var.b) && x13.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + tw2.c(this.b, tw2.c(0.0f, tw2.c(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
