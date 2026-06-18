package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class g3a {
    public static final f3a Companion = new f3a();
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public /* synthetic */ g3a(int i, long j, long j2, String str, String str2) {
        if (15 != (i & 15)) {
            qu1.w0(i, 15, e3a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3a)) {
            return false;
        }
        g3a g3aVar = (g3a) obj;
        return lc5.Q(this.a, g3aVar.a) && lc5.Q(this.b, g3aVar.b) && this.c == g3aVar.c && this.d == g3aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncEmojiCategory(id=", this.a, ", thumb=", this.b, ", count=");
        sbQ.append(this.c);
        return dx1.l(sbQ, ", position=", this.d, ")");
    }

    public g3a(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }
}
