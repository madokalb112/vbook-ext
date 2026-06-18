package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e38 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public e38(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e38)) {
            return false;
        }
        e38 e38Var = (e38) obj;
        return this.a.equals(e38Var.a) && this.b == e38Var.b && this.c == e38Var.c && this.d == e38Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
