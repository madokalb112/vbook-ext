package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vw3 extends ww3 {
    public final zn7 a;
    public final long b;
    public final mx3 c;
    public final String d;

    public vw3(zn7 zn7Var, long j, mx3 mx3Var, String str) {
        this.a = zn7Var;
        this.b = j;
        this.c = mx3Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3)) {
            return false;
        }
        vw3 vw3Var = (vw3) obj;
        return this.a.equals(vw3Var.a) && this.b == vw3Var.b && this.c == vw3Var.c && lc5.Q(this.d, vw3Var.d);
    }

    public final int hashCode() {
        int iB = xv5.b(this.a.a.hashCode() * 31, 31, this.b);
        mx3 mx3Var = this.c;
        int iHashCode = (iB + (mx3Var == null ? 0 : mx3Var.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Success(path=" + this.a + ", length=" + this.b + ", fileType=" + this.c + ", mimeType=" + this.d + ")";
    }
}
