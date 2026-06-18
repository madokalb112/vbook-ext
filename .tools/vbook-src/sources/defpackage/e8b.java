package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e8b {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public e8b(String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static e8b a(e8b e8bVar, String str, int i, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            str = e8bVar.a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i = e8bVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = e8bVar.c;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = e8bVar.d;
        }
        boolean z5 = z;
        if ((i2 & 16) != 0) {
            z2 = e8bVar.e;
        }
        boolean z6 = z2;
        if ((i2 & 32) != 0) {
            z3 = e8bVar.f;
        }
        boolean z7 = z3;
        if ((i2 & 64) != 0) {
            z4 = e8bVar.g;
        }
        e8bVar.getClass();
        str3.getClass();
        str4.getClass();
        return new e8b(str3, i3, str4, z5, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8b)) {
            return false;
        }
        e8b e8bVar = (e8b) obj;
        return lc5.Q(this.a, e8bVar.a) && this.b == e8bVar.b && lc5.Q(this.c, e8bVar.c) && this.d == e8bVar.d && this.e == e8bVar.e && this.f == e8bVar.f && this.g == e8bVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + j39.c(j39.c(j39.c(j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("Info(bookId=", this.a, ", chapterIndex=", ", chapterName=", this.b);
        j39.z(sbN, this.c, ", isExpand=", this.d, ", isLoading=");
        ky0.D(sbN, this.e, ", isPlaying=", this.f, ", isError=");
        return xv5.q(")", sbN, this.g);
    }

    public /* synthetic */ e8b() {
        this("", 0, "", false, false, false, false);
    }
}
