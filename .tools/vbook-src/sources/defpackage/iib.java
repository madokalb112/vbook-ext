package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iib {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final int g;
    public final String h;
    public final boolean i;
    public final int j;
    public final int k;

    public iib(boolean z, String str, String str2, String str3, List list, boolean z2, int i, String str4, boolean z3, int i2, int i3) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = z2;
        this.g = i;
        this.h = str4;
        this.i = z3;
        this.j = i2;
        this.k = i3;
    }

    public static iib a(iib iibVar, boolean z, String str, String str2, String str3, List list, boolean z2, int i, String str4, boolean z3, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            z = iibVar.a;
        }
        boolean z4 = z;
        if ((i4 & 2) != 0) {
            str = iibVar.b;
        }
        String str5 = str;
        if ((i4 & 4) != 0) {
            str2 = iibVar.c;
        }
        String str6 = str2;
        String str7 = (i4 & 8) != 0 ? iibVar.d : str3;
        List list2 = (i4 & 16) != 0 ? iibVar.e : list;
        boolean z5 = (i4 & 32) != 0 ? iibVar.f : z2;
        int i5 = (i4 & 64) != 0 ? iibVar.g : i;
        String str8 = (i4 & Token.CASE) != 0 ? iibVar.h : str4;
        boolean z6 = (i4 & 256) != 0 ? iibVar.i : z3;
        int i6 = (i4 & 512) != 0 ? iibVar.j : i2;
        int i7 = (i4 & 1024) != 0 ? iibVar.k : i3;
        iibVar.getClass();
        list2.getClass();
        return new iib(z4, str5, str6, str7, list2, z5, i5, str8, z6, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iib)) {
            return false;
        }
        iib iibVar = (iib) obj;
        return this.a == iibVar.a && this.b.equals(iibVar.b) && this.c.equals(iibVar.c) && this.d.equals(iibVar.d) && lc5.Q(this.e, iibVar.e) && this.f == iibVar.f && this.g == iibVar.g && this.h.equals(iibVar.h) && this.i == iibVar.i && this.j == iibVar.j && this.k == iibVar.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + tw2.d(this.j, j39.c(j39.a(tw2.d(this.g, j39.c(j39.d(j39.a(j39.a(j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31, this.f), 31), 31, this.h), 31, this.i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserState(isLogin=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        j39.y(sb, this.c, ", email=", this.d, ", colors=");
        sb.append(this.e);
        sb.append(", isPremium=");
        sb.append(this.f);
        sb.append(", role=");
        ky0.w(this.g, ", avatar=", this.h, ", verified=", sb);
        sb.append(this.i);
        sb.append(", messageUnreadCount=");
        sb.append(this.j);
        sb.append(", notificationUnreadCount=");
        return tw2.q(sb, this.k, ")");
    }
}
