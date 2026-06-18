package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class v4a {
    public static final u4a Companion = new u4a();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;

    public /* synthetic */ v4a(int i, String str, String str2, String str3, int i2, int i3, long j, long j2) {
        if (127 != (i & Token.SWITCH)) {
            qu1.w0(i, Token.SWITCH, t4a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4a)) {
            return false;
        }
        v4a v4aVar = (v4a) obj;
        return lc5.Q(this.a, v4aVar.a) && lc5.Q(this.b, v4aVar.b) && lc5.Q(this.c, v4aVar.c) && this.d == v4aVar.d && this.e == v4aVar.e && this.f == v4aVar.f && this.g == v4aVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + xv5.b(tw2.d(this.e, tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncQtWord(id=", this.a, ", word=", this.b, ", trans=");
        dx1.t(this.d, this.c, ", type=", ", mode=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", createAt=");
        sbQ.append(this.f);
        return dx1.l(sbQ, ", updateAt=", this.g, ")");
    }

    public v4a(String str, String str2, String str3, int i, int i2, long j, long j2) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
    }
}
