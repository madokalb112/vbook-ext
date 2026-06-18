package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class p4a {
    public static final o4a Companion = new o4a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    public /* synthetic */ p4a(int i, long j, long j2, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            qu1.w0(i, 63, n4a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4a)) {
            return false;
        }
        p4a p4aVar = (p4a) obj;
        return lc5.Q(this.a, p4aVar.a) && lc5.Q(this.b, p4aVar.b) && lc5.Q(this.c, p4aVar.c) && lc5.Q(this.d, p4aVar.d) && this.e == p4aVar.e && this.f == p4aVar.f;
    }

    public final int hashCode() {
        int iA = j39.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Long.hashCode(this.f) + xv5.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncQtDictionary(id=", this.a, ", name=", this.b, ", nameDictionary=");
        j39.y(sbQ, this.c, ", vpDictionary=", this.d, ", createAt=");
        sbQ.append(this.e);
        return dx1.l(sbQ, ", updateAt=", this.f, ")");
    }

    public p4a(String str, String str2, String str3, String str4, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
    }
}
