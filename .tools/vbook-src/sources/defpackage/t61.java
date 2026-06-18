package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t61 {
    public final String A;
    public final int B;
    public final gf6 C;
    public final List D;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final fv1 e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final List y;
    public final Set z;

    public t61(boolean z, boolean z2, boolean z3, boolean z4, fv1 fv1Var, List list, String str, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list2, Set set, String str5, int i, gf6 gf6Var, List list3) {
        list.getClass();
        list2.getClass();
        set.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = fv1Var;
        this.f = list;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
        this.p = z11;
        this.q = str4;
        this.r = z12;
        this.s = z13;
        this.t = z14;
        this.u = z15;
        this.v = z16;
        this.w = z17;
        this.x = z18;
        this.y = list2;
        this.z = set;
        this.A = str5;
        this.B = i;
        this.C = gf6Var;
        this.D = list3;
    }

    public static t61 a(t61 t61Var, boolean z, boolean z2, boolean z3, boolean z4, fv1 fv1Var, List list, String str, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, List list2, Set set, String str5, int i, gf6 gf6Var, List list3, int i2) {
        boolean z19 = (i2 & 1) != 0 ? t61Var.a : z;
        boolean z20 = (i2 & 2) != 0 ? t61Var.b : z2;
        boolean z21 = (i2 & 4) != 0 ? t61Var.c : z3;
        boolean z22 = (i2 & 8) != 0 ? t61Var.d : z4;
        fv1 fv1Var2 = (i2 & 16) != 0 ? t61Var.e : fv1Var;
        List list4 = (i2 & 32) != 0 ? t61Var.f : list;
        String str6 = (i2 & 64) != 0 ? t61Var.g : str;
        String str7 = (i2 & Token.CASE) != 0 ? t61Var.h : str2;
        String str8 = (i2 & 256) != 0 ? t61Var.i : str3;
        boolean z23 = (i2 & 512) != 0 ? t61Var.j : z5;
        boolean z24 = (i2 & 1024) != 0 ? t61Var.k : z6;
        boolean z25 = (i2 & 2048) != 0 ? t61Var.l : z7;
        boolean z26 = (i2 & 4096) != 0 ? t61Var.m : z8;
        t61Var.getClass();
        boolean z27 = (i2 & 16384) != 0 ? t61Var.n : z9;
        boolean z28 = (i2 & 32768) != 0 ? t61Var.o : z10;
        boolean z29 = (i2 & Parser.ARGC_LIMIT) != 0 ? t61Var.p : z11;
        String str9 = (i2 & 131072) != 0 ? t61Var.q : str4;
        boolean z30 = (i2 & 262144) != 0 ? t61Var.r : z12;
        boolean z31 = (i2 & 524288) != 0 ? t61Var.s : z13;
        boolean z32 = (i2 & 1048576) != 0 ? t61Var.t : z14;
        boolean z33 = (i2 & 2097152) != 0 ? t61Var.u : z15;
        boolean z34 = (i2 & 4194304) != 0 ? t61Var.v : z16;
        boolean z35 = (i2 & 8388608) != 0 ? t61Var.w : z17;
        boolean z36 = (i2 & 16777216) != 0 ? t61Var.x : z18;
        List list5 = (i2 & 33554432) != 0 ? t61Var.y : list2;
        Set set2 = (i2 & 67108864) != 0 ? t61Var.z : set;
        String str10 = (i2 & 134217728) != 0 ? t61Var.A : str5;
        int i3 = (i2 & 268435456) != 0 ? t61Var.B : i;
        gf6 gf6Var2 = (i2 & 536870912) != 0 ? t61Var.C : gf6Var;
        List list6 = (i2 & 1073741824) != 0 ? t61Var.D : list3;
        t61Var.getClass();
        list4.getClass();
        str7.getClass();
        list5.getClass();
        set2.getClass();
        str10.getClass();
        list6.getClass();
        return new t61(z19, z20, z21, z22, fv1Var2, list4, str6, str7, str8, z23, z24, z25, z26, z27, z28, z29, str9, z30, z31, z32, z33, z34, z35, z36, list5, set2, str10, i3, gf6Var2, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t61)) {
            return false;
        }
        t61 t61Var = (t61) obj;
        return this.a == t61Var.a && this.b == t61Var.b && this.c == t61Var.c && this.d == t61Var.d && lc5.Q(this.e, t61Var.e) && lc5.Q(this.f, t61Var.f) && this.g.equals(t61Var.g) && this.h.equals(t61Var.h) && this.i.equals(t61Var.i) && this.j == t61Var.j && this.k == t61Var.k && this.l == t61Var.l && this.m == t61Var.m && this.n == t61Var.n && this.o == t61Var.o && this.p == t61Var.p && this.q.equals(t61Var.q) && this.r == t61Var.r && this.s == t61Var.s && this.t == t61Var.t && this.u == t61Var.u && this.v == t61Var.v && this.w == t61Var.w && this.x == t61Var.x && lc5.Q(this.y, t61Var.y) && lc5.Q(this.z, t61Var.z) && this.A.equals(t61Var.A) && this.B == t61Var.B && lc5.Q(this.C, t61Var.C) && lc5.Q(this.D, t61Var.D);
    }

    public final int hashCode() {
        int iC = j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        fv1 fv1Var = this.e;
        int iD = tw2.d(this.B, j39.a((this.z.hashCode() + j39.d(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.c(j39.a(j39.a(j39.a(j39.d((iC + (fv1Var == null ? 0 : fv1Var.hashCode())) * 31, this.f, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, false), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), this.y, 31)) * 31, 31, this.A), 31);
        gf6 gf6Var = this.C;
        return this.D.hashCode() + ((iD + (gf6Var != null ? gf6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ChatState(isLoading=", this.a, ", isLoadingMore=", this.b, ", isError=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", conversation=");
        sbR.append(this.e);
        sbR.append(", conversationMembers=");
        sbR.append(this.f);
        sbR.append(", currentUserId=");
        j39.y(sbR, this.g, ", groupName=", this.h, ", groupAvatar=");
        j39.z(sbR, this.i, ", isDirectConversation=", this.j, ", isPublic=");
        ky0.D(sbR, this.k, ", isJoined=", this.l, ", isJoining=");
        ky0.D(sbR, this.m, ", isBlocked=false, isLogin=", this.n, ", canSendMessages=");
        ky0.D(sbR, this.o, ", isAppAdmin=", this.p, ", myMemberRole=");
        j39.z(sbR, this.q, ", canManageConversation=", this.r, ", canInviteMembers=");
        ky0.D(sbR, this.s, ", canKickMembers=", this.t, ", canLeaveConversation=");
        ky0.D(sbR, this.u, ", isActionLoading=", this.v, ", isInviteLoading=");
        ky0.D(sbR, this.w, ", hasMoreInviteUsers=", this.x, ", inviteUsers=");
        sbR.append(this.y);
        sbR.append(", selectedInviteUserIds=");
        sbR.append(this.z);
        sbR.append(", memberActionUserId=");
        dx1.t(this.B, this.A, ", newMessageCount=", ", quote=", sbR);
        sbR.append(this.C);
        sbR.append(", messageList=");
        sbR.append(this.D);
        sbR.append(")");
        return sbR.toString();
    }
}
