package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d68 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final Set g;

    public d68(boolean z, boolean z2, String str, String str2, boolean z3, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = list;
        this.g = set;
    }

    public static d68 a(d68 d68Var, boolean z, boolean z2, String str, String str2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = d68Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = d68Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = d68Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = d68Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z3 = d68Var.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            list = d68Var.f;
        }
        List list2 = list;
        Set set = d68Var.g;
        d68Var.getClass();
        str3.getClass();
        list2.getClass();
        set.getClass();
        return new d68(z4, z5, str3, str4, z6, list2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d68)) {
            return false;
        }
        d68 d68Var = (d68) obj;
        return this.a == d68Var.a && this.b == d68Var.b && this.c.equals(d68Var.c) && this.d.equals(d68Var.d) && this.e == d68Var.e && lc5.Q(this.f, d68Var.f) && lc5.Q(this.g, d68Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + j39.d(j39.c(j39.a(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("PublicConversationListState(isLoading=", this.a, ", isError=", this.b, ", searchKeyword=");
        j39.y(sbR, this.c, ", currentUserId=", this.d, ", isAdmin=");
        sbR.append(this.e);
        sbR.append(", conversations=");
        sbR.append(this.f);
        sbR.append(", processingConversationIds=");
        sbR.append(this.g);
        sbR.append(")");
        return sbR.toString();
    }
}
