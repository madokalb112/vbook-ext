package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ew3 extends gw3 {
    public final Object a;
    public final int b;

    public ew3(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew3)) {
            return false;
        }
        ew3 ew3Var = (ew3) obj;
        return lc5.Q(this.a, ew3Var.a) && this.b == ew3Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Integer.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Progress(processed=" + this.a + ", total=" + this.b + ")";
    }
}
