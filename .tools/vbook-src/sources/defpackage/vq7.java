package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vq7 {
    public final bi5 a;
    public final uq7 b;

    public vq7(bi5 bi5Var, uq7 uq7Var) {
        bi5Var.getClass();
        this.a = bi5Var;
        this.b = uq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq7)) {
            return false;
        }
        vq7 vq7Var = (vq7) obj;
        return lc5.Q(this.a, vq7Var.a) && this.b == vq7Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingImport(file=" + this.a + ", kind=" + this.b + ")";
    }
}
