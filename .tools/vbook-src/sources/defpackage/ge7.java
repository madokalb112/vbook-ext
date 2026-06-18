package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class ge7 {
    public static final fe7 Companion = new fe7();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public /* synthetic */ ge7(int i, int i2, int i3, long j, String str, String str2) {
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
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge7)) {
            return false;
        }
        ge7 ge7Var = (ge7) obj;
        return lc5.Q(this.a, ge7Var.a) && lc5.Q(this.b, ge7Var.b) && this.c == ge7Var.c && this.d == ge7Var.d && this.e == ge7Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("OldSyncQtVietPhrase(src=", this.a, ", dest=", this.b, ", type=");
        ky0.u(this.c, this.d, ", wordType=", ", timestamp=", sbQ);
        return xv5.n(this.e, ")", sbQ);
    }
}
