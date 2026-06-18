package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lz3 {
    public final t07 a;
    public py1 b = null;

    public lz3(t07 t07Var) {
        this.a = t07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lz3) {
            lz3 lz3Var = (lz3) obj;
            if (this.a == lz3Var.a && lc5.Q(this.b, lz3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        py1 py1Var = this.b;
        return iHashCode + (py1Var == null ? 0 : py1Var.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
