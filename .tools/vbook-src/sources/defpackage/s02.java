package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s02 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final Set h;
    public final List i;

    public s02(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, Set set, List list) {
        set.getClass();
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = str2;
        this.h = set;
        this.i = list;
    }

    public static s02 a(s02 s02Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, Set set, List list, int i) {
        if ((i & 1) != 0) {
            z = s02Var.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = s02Var.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = s02Var.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = s02Var.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = s02Var.e;
        }
        boolean z10 = z5;
        String str3 = (i & 32) != 0 ? s02Var.f : str;
        String str4 = (i & 64) != 0 ? s02Var.g : str2;
        Set set2 = (i & Token.CASE) != 0 ? s02Var.h : set;
        List list2 = (i & 256) != 0 ? s02Var.i : list;
        s02Var.getClass();
        str3.getClass();
        str4.getClass();
        set2.getClass();
        list2.getClass();
        return new s02(z6, z7, z8, z9, z10, str3, str4, set2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s02)) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return this.a == s02Var.a && this.b == s02Var.b && this.c == s02Var.c && this.d == s02Var.d && this.e == s02Var.e && this.f.equals(s02Var.f) && this.g.equals(s02Var.g) && lc5.Q(this.h, s02Var.h) && lc5.Q(this.i, s02Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + j39.a(j39.a(j39.c(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("CreateGroupConversationState(isLoading=", this.a, ", isError=", this.b, ", isCreating=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", isAdmin=");
        sbR.append(this.e);
        sbR.append(", groupName=");
        sbR.append(this.f);
        sbR.append(", visibility=");
        sbR.append(this.g);
        sbR.append(", selectedUserIds=");
        sbR.append(this.h);
        sbR.append(", users=");
        return tw2.t(sbR, this.i, ")");
    }
}
