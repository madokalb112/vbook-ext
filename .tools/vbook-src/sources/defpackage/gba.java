package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gba {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final long k;

    public gba(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, int i3, int i4, long j) {
        j39.w(str, str2, str4, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i3;
        this.j = i4;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gba)) {
            return false;
        }
        gba gbaVar = (gba) obj;
        return lc5.Q(this.a, gbaVar.a) && lc5.Q(this.b, gbaVar.b) && this.c == gbaVar.c && this.d.equals(gbaVar.d) && this.e == gbaVar.e && lc5.Q(this.f, gbaVar.f) && lc5.Q(this.g, gbaVar.g) && lc5.Q(this.h, gbaVar.h) && this.i == gbaVar.i && this.j == gbaVar.j && this.k == gbaVar.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + tw2.d(this.j, tw2.d(this.i, j39.a(j39.a(j39.a(tw2.d(this.e, j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("TextBookmark(id=", this.a, ", bookId=", this.b, ", chapterIndex=");
        ky0.w(this.c, ", chapterName=", this.d, ", type=", sbQ);
        ky0.w(this.e, ", content=", this.f, ", color=", sbQ);
        j39.y(sbQ, this.g, ", description=", this.h, ", startPosition=");
        ky0.u(this.i, this.j, ", endPosition=", ", createAt=", sbQ);
        return xv5.n(this.k, ")", sbQ);
    }
}
