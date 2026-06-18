package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zrb {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;

    public zrb(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrb)) {
            return false;
        }
        zrb zrbVar = (zrb) obj;
        return lc5.Q(this.a, zrbVar.a) && this.b.equals(zrbVar.b) && this.c == zrbVar.c && lc5.Q(this.d, zrbVar.d) && this.e == zrbVar.e && this.f == zrbVar.f && this.g == zrbVar.g && this.h == zrbVar.h && this.i == zrbVar.i;
    }

    public final int hashCode() {
        int iD = tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return Long.hashCode(this.i) + j39.c(j39.c(j39.c(tw2.d(this.e, tw2.d(0, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("VideoTocLink(id=", this.a, ", title=", this.b, ", episodeIndex=");
        ky0.w(this.c, ", parentId=", this.d, ", level=0, count=", sbQ);
        j39.x(sbQ, this.e, ", downloaded=", this.f, ", locked=");
        ky0.D(sbQ, this.g, ", pay=", this.h, ", lastRead=");
        return xv5.n(this.i, ")", sbQ);
    }
}
