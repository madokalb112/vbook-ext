package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fs0 {
    public final float a;

    public fs0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fs0)) {
            return false;
        }
        return x13.c(0.0f, 0.0f) && x13.c(0.0f, 0.0f) && x13.c(0.0f, 0.0f) && x13.c(this.a, ((fs0) obj).a) && x13.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + tw2.c(this.a, tw2.c(0.0f, tw2.c(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
