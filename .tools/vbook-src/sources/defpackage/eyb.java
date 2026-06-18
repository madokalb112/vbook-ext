package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eyb {
    public final float a;
    public final float b;

    public eyb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyb)) {
            return false;
        }
        eyb eybVar = (eyb) obj;
        return x13.c(this.a, eybVar.a) && x13.c(this.b, eybVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tw2.o("WindowInfo(screenWidthDp=", x13.d(this.a), ", screenHeightDp=", x13.d(this.b), ")");
    }
}
