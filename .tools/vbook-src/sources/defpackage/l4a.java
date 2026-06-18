package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class l4a {
    public static final k4a Companion = new k4a();
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final long e;

    public /* synthetic */ l4a(int i, String str, int i2, String str2, boolean z, long j) {
        if (23 != (i & 23)) {
            qu1.w0(i, 23, j4a.a.e());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4a)) {
            return false;
        }
        l4a l4aVar = (l4a) obj;
        return lc5.Q(this.a, l4aVar.a) && this.b == l4aVar.b && lc5.Q(this.c, l4aVar.c) && this.d == l4aVar.d && this.e == l4aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j39.c(j39.a(tw2.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("SyncNotification(id=", this.a, ", type=", ", content=", this.b);
        j39.z(sbN, this.c, ", read=", this.d, ", createAt=");
        return xv5.n(this.e, ")", sbN);
    }

    public l4a(int i, long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = j;
    }
}
