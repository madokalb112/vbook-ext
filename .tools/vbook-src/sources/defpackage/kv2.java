package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kv2 {
    public final boolean a;
    public final to3 b;

    public kv2(boolean z, to3 to3Var) {
        this.a = z;
        this.b = to3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv2)) {
            return false;
        }
        kv2 kv2Var = (kv2) obj;
        return this.a == kv2Var.a && lc5.Q(this.b, kv2Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        to3 to3Var = this.b;
        return iHashCode + (to3Var == null ? 0 : to3Var.hashCode());
    }

    public final String toString() {
        return "DiscoveryState(isLoading=" + this.a + ", currentExtension=" + this.b + ")";
    }
}
