package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xx3 extends rw1 {
    public final int e;
    public final String f;

    public xx3(int i, String str) {
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx3)) {
            return false;
        }
        xx3 xx3Var = (xx3) obj;
        return this.e == xx3Var.e && this.f.equals(xx3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Integer.hashCode(this.e) * 31);
    }

    public final String toString() {
        return "Delete(position=" + this.e + ", text=" + this.f + ")";
    }
}
