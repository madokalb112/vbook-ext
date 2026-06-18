package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class n5a {
    public static final m5a Companion = new m5a();
    public final String a;
    public final long b;

    public /* synthetic */ n5a(int i, String str, long j) {
        if (3 != (i & 3)) {
            qu1.w0(i, 3, l5a.a.e());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5a)) {
            return false;
        }
        n5a n5aVar = (n5a) obj;
        return lc5.Q(this.a, n5aVar.a) && this.b == n5aVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SyncSearch(key=" + this.a + ", createAt=" + this.b + ")";
    }

    public n5a(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }
}
