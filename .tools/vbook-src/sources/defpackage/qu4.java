package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qu4 {
    public static final qu4 d = new qu4("HTTP", 3, 0);
    public static final qu4 e = new qu4("HTTP", 2, 0);
    public static final qu4 f = new qu4("HTTP", 1, 1);
    public static final qu4 g = new qu4("HTTP", 1, 0);
    public static final qu4 h = new qu4("SPDY", 3, 0);
    public static final qu4 i = new qu4("QUIC", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    public qu4(String str, int i2, int i3) {
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu4)) {
            return false;
        }
        qu4 qu4Var = (qu4) obj;
        return this.a.equals(qu4Var.a) && this.b == qu4Var.b && this.c == qu4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
