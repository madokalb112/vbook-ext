package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class md7 {
    public static final ld7 Companion = new ld7();
    public final long a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ md7(int i, long j, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md7)) {
            return false;
        }
        md7 md7Var = (md7) obj;
        return this.a == md7Var.a && lc5.Q(this.b, md7Var.b) && lc5.Q(this.c, md7Var.c) && lc5.Q(this.d, md7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldSyncExtensionSource(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        j39.y(sb, ", description=", this.c, ", author=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
