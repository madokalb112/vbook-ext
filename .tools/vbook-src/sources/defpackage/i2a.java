package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class i2a {
    public static final h2a Companion = new h2a();
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final long j;

    public /* synthetic */ i2a(int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, long j, long j2, long j3) {
        if (1023 != (i & 1023)) {
            qu1.w0(i, 1023, g2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = i3;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2a)) {
            return false;
        }
        i2a i2aVar = (i2a) obj;
        return lc5.Q(this.a, i2aVar.a) && this.b == i2aVar.b && lc5.Q(this.c, i2aVar.c) && this.d == i2aVar.d && lc5.Q(this.e, i2aVar.e) && lc5.Q(this.f, i2aVar.f) && lc5.Q(this.g, i2aVar.g) && this.h == i2aVar.h && this.i == i2aVar.i && this.j == i2aVar.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + xv5.b(xv5.b(j39.a(j39.a(j39.a(tw2.d(this.d, j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("SyncBookmark(id=", this.a, ", chapterIndex=", ", chapterName=", this.b);
        dx1.t(this.d, this.c, ", type=", ", content=", sbN);
        j39.y(sbN, this.e, ", description=", this.f, ", color=");
        sbN.append(this.g);
        sbN.append(", startPosition=");
        sbN.append(this.h);
        dx1.z(sbN, ", endPosition=", this.i, ", createAt=");
        return xv5.n(this.j, ")", sbN);
    }

    public i2a(String str, int i, String str2, int i2, String str3, String str4, String str5, long j, long j2, long j3) {
        j39.w(str, str2, str3, str4, str5);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = j3;
    }
}
