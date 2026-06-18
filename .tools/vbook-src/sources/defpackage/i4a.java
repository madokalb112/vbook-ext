package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class i4a {
    public static final h4a Companion = new h4a();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;

    public /* synthetic */ i4a(int i, String str, String str2, String str3, boolean z, long j) {
        if (31 != (i & 31)) {
            qu1.w0(i, 31, g4a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4a)) {
            return false;
        }
        i4a i4aVar = (i4a) obj;
        return lc5.Q(this.a, i4aVar.a) && lc5.Q(this.b, i4aVar.b) && lc5.Q(this.c, i4aVar.c) && this.d == i4aVar.d && this.e == i4aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j39.c(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncName(id=", this.a, ", word=", this.b, ", replace=");
        j39.z(sbQ, this.c, ", ignoreCase=", this.d, ", createAt=");
        return xv5.n(this.e, ")", sbQ);
    }

    public i4a(String str, String str2, String str3, boolean z, long j) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
    }
}
