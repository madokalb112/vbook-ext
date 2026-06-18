package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class l2a {
    public static final k2a Companion = new k2a();
    public final String a;
    public final String b;
    public final long c;

    public /* synthetic */ l2a(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            qu1.w0(i, 7, j2a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2a)) {
            return false;
        }
        l2a l2aVar = (l2a) obj;
        return lc5.Q(this.a, l2aVar.a) && lc5.Q(this.b, l2aVar.b) && this.c == l2aVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.n(this.c, ")", j39.q("SyncBrowserHistory(url=", this.a, ", title=", this.b, ", createAt="));
    }

    public l2a(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
