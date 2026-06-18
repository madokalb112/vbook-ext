package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z8a {
    public final float a;
    public final float b;

    public z8a(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8a)) {
            return false;
        }
        z8a z8aVar = (z8a) obj;
        return x13.c(this.a, z8aVar.a) && x13.c(this.b, z8aVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        String strD = x13.d(f);
        float f2 = this.b;
        return ky0.s(x13.d(f2), ")", j39.q("TabPosition(left=", strD, ", right=", x13.d(f + f2), ", width="));
    }
}
