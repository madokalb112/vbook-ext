package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class blb {
    public final float a;
    public final float b;
    public final float c;

    public blb(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb)) {
            return false;
        }
        blb blbVar = (blb) obj;
        return Float.compare(this.a, blbVar.a) == 0 && Float.compare(this.b, blbVar.b) == 0 && Float.compare(this.c, blbVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tw2.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Vec3(x=" + this.a + ", y=" + this.b + ", z=" + this.c + ")";
    }
}
