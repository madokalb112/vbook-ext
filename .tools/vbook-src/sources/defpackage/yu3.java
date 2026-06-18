package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yu3 {
    public final String a;
    public final int b;
    public final int c;

    public yu3(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3)) {
            return false;
        }
        yu3 yu3Var = (yu3) obj;
        return lc5.Q(this.a, yu3Var.a) && this.b == yu3Var.b && this.c == yu3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tw2.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return tw2.q(dx1.n("FileChapterContent(title=", this.a, ", offset=", ", length=", this.b), this.c, ")");
    }
}
