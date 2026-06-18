package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class va8 implements wa8 {
    public final Object b;

    public final boolean equals(Object obj) {
        if (obj instanceof va8) {
            return lc5.Q(this.b, ((va8) obj).b);
        }
        return false;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Value(value=" + this.b + ')';
    }
}
