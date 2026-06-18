package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class u5a {
    public static final t5a Companion = new t5a();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;

    public /* synthetic */ u5a(int i, long j, long j2, String str, String str2, String str3, boolean z) {
        if (63 != (i & 63)) {
            qu1.w0(i, 63, s5a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5a)) {
            return false;
        }
        u5a u5aVar = (u5a) obj;
        return lc5.Q(this.a, u5aVar.a) && lc5.Q(this.b, u5aVar.b) && lc5.Q(this.c, u5aVar.c) && this.d == u5aVar.d && this.e == u5aVar.e && this.f == u5aVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + xv5.b(j39.c(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncTTSWord(id=", this.a, ", word=", this.b, ", replace=");
        j39.z(sbQ, this.c, ", ignoreCase=", this.d, ", createAt=");
        sbQ.append(this.e);
        return dx1.l(sbQ, ", updateAt=", this.f, ")");
    }

    public u5a(String str, String str2, String str3, boolean z, long j, long j2) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
    }
}
