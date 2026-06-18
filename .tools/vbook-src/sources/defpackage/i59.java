package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class i59 {
    public static final h59 Companion = new h59();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ i59(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            qu1.w0(i, 15, g59.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i59)) {
            return false;
        }
        i59 i59Var = (i59) obj;
        return lc5.Q(this.a, i59Var.a) && lc5.Q(this.b, i59Var.b) && this.c == i59Var.c && this.d == i59Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return dx1.j(sb, this.d, ')');
    }

    public i59(int i, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
