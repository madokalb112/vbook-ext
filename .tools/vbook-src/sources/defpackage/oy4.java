package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oy4 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final long i;

    public oy4(String str, String str2, int i, String str3, String str4, String str5, int i2, int i3, long j) {
        tw2.A(str, str2, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = i3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4)) {
            return false;
        }
        oy4 oy4Var = (oy4) obj;
        return lc5.Q(this.a, oy4Var.a) && lc5.Q(this.b, oy4Var.b) && this.c == oy4Var.c && this.d.equals(oy4Var.d) && lc5.Q(this.e, oy4Var.e) && lc5.Q(this.f, oy4Var.f) && this.g == oy4Var.g && this.h == oy4Var.h && this.i == oy4Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + tw2.d(this.h, tw2.d(this.g, j39.a(j39.a(j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ImageBookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        ky0.w(this.c, ", chapterName=", this.d, ", content=", sbQ);
        j39.y(sbQ, this.e, ", description=", this.f, ", startPosition=");
        ky0.u(this.g, this.h, ", endPosition=", ", createAt=", sbQ);
        return xv5.n(this.i, ")", sbQ);
    }
}
