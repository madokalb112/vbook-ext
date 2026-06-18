package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class r2a {
    public static final q2a Companion = new q2a();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;

    public /* synthetic */ r2a(int i, String str, String str2, int i2, String str3, int i3, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
        if (2047 != (i & 2047)) {
            qu1.w0(i, 2047, p2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2a)) {
            return false;
        }
        r2a r2aVar = (r2a) obj;
        return lc5.Q(this.a, r2aVar.a) && lc5.Q(this.b, r2aVar.b) && this.c == r2aVar.c && lc5.Q(this.d, r2aVar.d) && this.e == r2aVar.e && this.f == r2aVar.f && this.g == r2aVar.g && this.h == r2aVar.h && this.i == r2aVar.i && this.j == r2aVar.j && this.k == r2aVar.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + xv5.b(xv5.b(j39.c(j39.c(j39.c(tw2.d(this.e, j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncChapter(id=", this.a, ", pathId=", this.b, ", position=");
        ky0.w(this.c, ", path=", this.d, ", count=", sbQ);
        j39.x(sbQ, this.e, ", downloaded=", this.f, ", pay=");
        ky0.D(sbQ, this.g, ", lock=", this.h, ", lastRead=");
        sbQ.append(this.i);
        dx1.z(sbQ, ", createAt=", this.j, ", updateAt=");
        return xv5.n(this.k, ")", sbQ);
    }

    public r2a(String str, String str2, int i, String str3, int i2, boolean z, boolean z2, boolean z3, long j, long j2, long j3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = j;
        this.j = j2;
        this.k = j3;
    }
}
