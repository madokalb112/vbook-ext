package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lnb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public lnb(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        j39.w(str, str2, str3, str4, str5);
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnb)) {
            return false;
        }
        lnb lnbVar = (lnb) obj;
        return lc5.Q(this.a, lnbVar.a) && lc5.Q(this.b, lnbVar.b) && lc5.Q(this.c, lnbVar.c) && lc5.Q(this.d, lnbVar.d) && lc5.Q(this.e, lnbVar.e) && this.f == lnbVar.f && lc5.Q(this.g, lnbVar.g) && this.h == lnbVar.h && this.i == lnbVar.i && this.j == lnbVar.j && this.k == lnbVar.k && this.l == lnbVar.l && this.m == lnbVar.m && this.n == lnbVar.n && this.o == lnbVar.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(tw2.d(this.f, j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("VideoBookState(bookId=", this.a, ", name=", this.b, ", author=");
        j39.y(sbQ, this.c, ", cover=", this.d, ", path=");
        dx1.t(this.f, this.e, ", type=", ", description=", sbQ);
        j39.z(sbQ, this.g, ", isNfsw=", this.h, ", isOngoing=");
        ky0.D(sbQ, this.i, ", isInShelf=", this.j, ", isFollow=");
        ky0.D(sbQ, this.k, ", isSupportShowDetail=", this.l, ", isSupportDownload=");
        ky0.D(sbQ, this.m, ", isSupportReload=", this.n, ", isSupportShowEpisodeName=");
        return xv5.q(")", sbQ, this.o);
    }
}
