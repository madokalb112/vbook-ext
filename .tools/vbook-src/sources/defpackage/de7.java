package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class de7 {
    public static final ce7 Companion = new ce7();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ de7(int i, String str, String str2, int i2, long j) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de7)) {
            return false;
        }
        de7 de7Var = (de7) obj;
        return lc5.Q(this.a, de7Var.a) && lc5.Q(this.b, de7Var.b) && this.c == de7Var.c && this.d == de7Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("OldSyncQtName(src=", this.a, ", dest=", this.b, ", type=");
        sbQ.append(this.c);
        sbQ.append(", timestamp=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
