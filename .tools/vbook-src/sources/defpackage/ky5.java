package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ky5 implements k74 {
    public final float a;

    public ky5(float f) {
        this.a = f;
    }

    public final float a(float f) {
        return f / this.a;
    }

    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky5) && Float.compare(this.a, ((ky5) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return dx1.i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
