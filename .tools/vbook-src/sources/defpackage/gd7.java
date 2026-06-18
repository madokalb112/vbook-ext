package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class gd7 {
    public static final fd7 Companion = new fd7();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final long h;

    public /* synthetic */ gd7(int i, String str, String str2, String str3, int i2, int i3, int i4, boolean z, long j) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd7)) {
            return false;
        }
        gd7 gd7Var = (gd7) obj;
        return lc5.Q(this.a, gd7Var.a) && lc5.Q(this.b, gd7Var.b) && lc5.Q(this.c, gd7Var.c) && this.d == gd7Var.d && this.e == gd7Var.e && this.f == gd7Var.f && this.g == gd7Var.g && this.h == gd7Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + j39.c(tw2.d(this.f, tw2.d(this.e, tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("OldSyncDownload(id=", this.a, ", name=", this.b, ", cover=");
        dx1.t(this.d, this.c, ", downloadStatus=", ", downloaded=", sbQ);
        ky0.u(this.e, this.f, ", chapterCount=", ", isFromLastRead=", sbQ);
        sbQ.append(this.g);
        sbQ.append(", timestamp=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
