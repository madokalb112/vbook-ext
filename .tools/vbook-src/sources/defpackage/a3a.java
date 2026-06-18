package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class a3a {
    public static final z2a Companion = new z2a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;

    public /* synthetic */ a3a(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        if (4095 != (i & 4095)) {
            qu1.w0(i, 4095, y2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3a)) {
            return false;
        }
        a3a a3aVar = (a3a) obj;
        return lc5.Q(this.a, a3aVar.a) && lc5.Q(this.b, a3aVar.b) && lc5.Q(this.c, a3aVar.c) && lc5.Q(this.d, a3aVar.d) && lc5.Q(this.e, a3aVar.e) && this.f == a3aVar.f && this.g == a3aVar.g && this.h == a3aVar.h && this.i == a3aVar.i && this.j == a3aVar.j && this.k == a3aVar.k && this.l == a3aVar.l;
    }

    public final int hashCode() {
        return Long.hashCode(this.l) + tw2.d(this.k, tw2.d(this.j, tw2.d(this.i, tw2.d(this.h, tw2.d(this.g, tw2.d(this.f, j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncDownload(id=", this.a, ", bookId=", this.b, ", title=");
        j39.y(sbQ, this.c, ", image=", this.d, ", path=");
        dx1.t(this.f, this.e, ", start=", ", end=", sbQ);
        ky0.u(this.g, this.h, ", downloaded=", ", total=", sbQ);
        ky0.u(this.i, this.j, ", type=", ", status=", sbQ);
        sbQ.append(this.k);
        sbQ.append(", createAt=");
        sbQ.append(this.l);
        sbQ.append(")");
        return sbQ.toString();
    }

    public a3a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        j39.w(str, str2, str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = j;
    }
}
