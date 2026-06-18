package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class d3a {
    public static final c3a Companion = new c3a();
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public /* synthetic */ d3a(int i, long j, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qu1.w0(i, 15, b3a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3a)) {
            return false;
        }
        d3a d3aVar = (d3a) obj;
        return lc5.Q(this.a, d3aVar.a) && lc5.Q(this.b, d3aVar.b) && lc5.Q(this.c, d3aVar.c) && this.d == d3aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncEmoji(id=", this.a, ", category=", this.b, ", url=");
        sbQ.append(this.c);
        sbQ.append(", lastUse=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }

    public d3a(long j, String str, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }
}
