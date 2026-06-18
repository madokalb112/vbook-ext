package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class jf6 {
    public static final if6 Companion = new if6();
    public final long a;
    public final String b;
    public final int c;
    public final hhb d;
    public final jf6 e;
    public final int f;
    public final long g;
    public final long h;

    public /* synthetic */ jf6(int i, long j, String str, int i2, hhb hhbVar, jf6 jf6Var, int i3, long j2, long j3) {
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = new hhb();
        } else {
            this.d = hhbVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = jf6Var;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0L;
        } else {
            this.h = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf6)) {
            return false;
        }
        jf6 jf6Var = (jf6) obj;
        return this.a == jf6Var.a && lc5.Q(this.b, jf6Var.b) && this.c == jf6Var.c && lc5.Q(this.d, jf6Var.d) && lc5.Q(this.e, jf6Var.e) && this.f == jf6Var.f && this.g == jf6Var.g && this.h == jf6Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + tw2.d(this.c, j39.a(Long.hashCode(this.a) * 31, 31, this.b), 31)) * 31;
        jf6 jf6Var = this.e;
        return Long.hashCode(this.h) + xv5.b(tw2.d(this.f, (iHashCode + (jf6Var == null ? 0 : jf6Var.hashCode())) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageDto(id=");
        sb.append(this.a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", user=");
        sb.append(this.d);
        sb.append(", quote=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        dx1.z(sb, ", updatedAt=", this.g, ", createdAt=");
        return xv5.n(this.h, ")", sb);
    }
}
