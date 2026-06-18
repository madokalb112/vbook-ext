package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hq0 {
    public final String a;
    public final String b;
    public final String c;

    public hq0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0Var = (hq0) obj;
        return this.a.equals(hq0Var.a) && this.b.equals(hq0Var.b) && this.c.equals(hq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ky0.s(this.c, ")", j39.q("BrowserSearchEngine(id=", this.a, ", name=", this.b, ", url="));
    }
}
