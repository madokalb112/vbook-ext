package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iq9 {
    public final float a;

    public iq9(float f) {
        this.a = f;
        if (x13.b(f, 0.0f) > 0) {
            return;
        }
        t75.a("invalid minSize");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iq9) {
            return x13.c(this.a, ((iq9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
