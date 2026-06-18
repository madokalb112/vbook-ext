package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t41 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final List g;

    public t41(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    public static t41 a(t41 t41Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, List list, int i) {
        if ((i & 1) != 0) {
            z = t41Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = t41Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = t41Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = t41Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = t41Var.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = t41Var.f;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            list = t41Var.g;
        }
        List list2 = list;
        t41Var.getClass();
        str4.getClass();
        list2.getClass();
        return new t41(z5, z6, z7, z8, str3, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t41)) {
            return false;
        }
        t41 t41Var = (t41) obj;
        return this.a == t41Var.a && this.b == t41Var.b && this.c == t41Var.c && this.d == t41Var.d && this.e.equals(t41Var.e) && this.f.equals(t41Var.f) && lc5.Q(this.g, t41Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + j39.a(j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ChatConversationState(isLoading=", this.a, ", isError=", this.b, ", isLoadingMore=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", currentUserId=");
        j39.y(sbR, this.e, ", searchKeyword=", this.f, ", conversations=");
        return tw2.t(sbR, this.g, ")");
    }
}
