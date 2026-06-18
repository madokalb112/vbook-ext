package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lta {
    public final int a;
    public final int b;
    public final int c;

    public lta(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lta)) {
            return false;
        }
        lta ltaVar = (lta) obj;
        return this.a == ltaVar.a && this.b == ltaVar.b && this.c == ltaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tw2.q(xv5.t(this.a, this.b, "TileKey(sampleSize=", ", col=", ", row="), this.c, ")");
    }
}
