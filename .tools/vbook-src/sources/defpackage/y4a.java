package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class y4a {
    public static final x4a Companion = new x4a();
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ y4a(int i, String str, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            qu1.w0(i, 1, w4a.a.e());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4a)) {
            return false;
        }
        y4a y4aVar = (y4a) obj;
        return lc5.Q(this.a, y4aVar.a) && this.b == y4aVar.b && this.c == y4aVar.c && this.d == y4aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xv5.b(xv5.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncReadHistory(id=");
        sb.append(this.a);
        sb.append(", readTime=");
        sb.append(this.b);
        dx1.z(sb, ", listenTime=", this.c, ", createAt=");
        return xv5.n(this.d, ")", sb);
    }

    public y4a(String str, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
