package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l25 extends m25 {
    public final zn7 a;
    public final long b;
    public final l35 c;
    public final int d;
    public final int e;

    public l25(zn7 zn7Var, long j, l35 l35Var, int i, int i2) {
        zn7Var.getClass();
        this.a = zn7Var;
        this.b = j;
        this.c = l35Var;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l25)) {
            return false;
        }
        l25 l25Var = (l25) obj;
        return lc5.Q(this.a, l25Var.a) && this.b == l25Var.b && this.c == l25Var.c && this.d == l25Var.d && this.e == l25Var.e;
    }

    public final int hashCode() {
        int iB = xv5.b(this.a.a.hashCode() * 31, 31, this.b);
        l35 l35Var = this.c;
        return Integer.hashCode(this.e) + tw2.d(this.d, (iB + (l35Var == null ? 0 : l35Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "Success(path=" + this.a + ", length=" + this.b + ", imageType=" + this.c + ", width=" + this.d + ", height=" + this.e + ")";
    }
}
