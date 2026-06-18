package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class x2a {
    public static final w2a Companion = new w2a();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;

    public /* synthetic */ x2a(int i, String str, String str2, String str3, boolean z, long j, long j2, long j3) {
        if (127 != (i & Token.SWITCH)) {
            qu1.w0(i, Token.SWITCH, v2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2a)) {
            return false;
        }
        x2a x2aVar = (x2a) obj;
        return lc5.Q(this.a, x2aVar.a) && lc5.Q(this.b, x2aVar.b) && lc5.Q(this.c, x2aVar.c) && this.d == x2aVar.d && this.e == x2aVar.e && this.f == x2aVar.f && this.g == x2aVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + xv5.b(xv5.b(j39.c(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncDomain(id=", this.a, ", domain=", this.b, ", replace=");
        j39.z(sbQ, this.c, ", enabled=", this.d, ", position=");
        sbQ.append(this.e);
        dx1.z(sbQ, ", createAt=", this.f, ", updateAt=");
        return xv5.n(this.g, ")", sbQ);
    }

    public x2a(String str, String str2, String str3, boolean z, long j, long j2, long j3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }
}
