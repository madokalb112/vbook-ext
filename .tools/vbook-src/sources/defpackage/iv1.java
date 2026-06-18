package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class iv1 {
    public static final hv1 Companion = new hv1();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final jf6 f;
    public final int g;
    public final int h;
    public final boolean i;
    public final hhb j;
    public final long k;
    public final long l;

    public /* synthetic */ iv1(int i, long j, String str, String str2, String str3, String str4, jf6 jf6Var, int i2, int i3, boolean z, hhb hhbVar, long j2, long j3) {
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
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = jf6Var;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0;
        } else {
            this.h = i3;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = hhbVar;
        }
        if ((i & 1024) == 0) {
            this.k = 0L;
        } else {
            this.k = j2;
        }
        if ((i & 2048) == 0) {
            this.l = 0L;
        } else {
            this.l = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv1)) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        return this.a == iv1Var.a && lc5.Q(this.b, iv1Var.b) && lc5.Q(this.c, iv1Var.c) && lc5.Q(this.d, iv1Var.d) && lc5.Q(this.e, iv1Var.e) && lc5.Q(this.f, iv1Var.f) && this.g == iv1Var.g && this.h == iv1Var.h && this.i == iv1Var.i && lc5.Q(this.j, iv1Var.j) && this.k == iv1Var.k && this.l == iv1Var.l;
    }

    public final int hashCode() {
        int iA = j39.a(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iA2 = j39.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        jf6 jf6Var = this.f;
        int iC = j39.c(tw2.d(this.h, tw2.d(this.g, (iA2 + (jf6Var == null ? 0 : jf6Var.hashCode())) * 31, 31), 31), 31, this.i);
        hhb hhbVar = this.j;
        return Long.hashCode(this.l) + xv5.b((iC + (hhbVar != null ? hhbVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationDto(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        j39.y(sb, ", name=", this.c, ", image=", this.d);
        sb.append(", visibility=");
        sb.append(this.e);
        sb.append(", latestMessage=");
        sb.append(this.f);
        tw2.v(this.g, this.h, ", unreadCount=", ", memberCount=", sb);
        sb.append(", isJoined=");
        sb.append(this.i);
        sb.append(", createdBy=");
        sb.append(this.j);
        dx1.z(sb, ", updatedAt=", this.k, ", createdAt=");
        return xv5.n(this.l, ")", sb);
    }
}
