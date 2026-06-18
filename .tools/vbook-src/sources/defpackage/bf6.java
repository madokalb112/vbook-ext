package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bf6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public bf6(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6Var = (bf6) obj;
        return Float.compare(this.a, bf6Var.a) == 0 && Float.compare(this.b, bf6Var.b) == 0 && Float.compare(this.c, bf6Var.c) == 0 && Float.compare(this.d, bf6Var.d) == 0 && Float.compare(this.e, bf6Var.e) == 0 && Float.compare(this.f, bf6Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "MeshNode(baseX=" + this.a + ", baseY=" + this.b + ", offsetX=" + this.c + ", offsetY=" + this.d + ", baseDepth=" + this.e + ", zAmplitude=" + this.f + ")";
    }
}
