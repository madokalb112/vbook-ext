package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b1b {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final xq2 f;
    public final List g;

    public b1b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, xq2 xq2Var, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = xq2Var;
        this.g = list;
    }

    public static b1b a(b1b b1bVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, xq2 xq2Var, List list, int i) {
        if ((i & 1) != 0) {
            z = b1bVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = b1bVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = b1bVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = b1bVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = b1bVar.e;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            xq2Var = b1bVar.f;
        }
        xq2 xq2Var2 = xq2Var;
        if ((i & 64) != 0) {
            list = b1bVar.g;
        }
        List list2 = list;
        b1bVar.getClass();
        list2.getClass();
        return new b1b(z6, z7, z8, z9, z10, xq2Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1b)) {
            return false;
        }
        b1b b1bVar = (b1b) obj;
        return this.a == b1bVar.a && this.b == b1bVar.b && this.c == b1bVar.c && this.d == b1bVar.d && this.e == b1bVar.e && lc5.Q(this.f, b1bVar.f) && lc5.Q(this.g, b1bVar.g);
    }

    public final int hashCode() {
        int iC = j39.c(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        xq2 xq2Var = this.f;
        return this.g.hashCode() + ((iC + (xq2Var == null ? 0 : xq2Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("TopicDetailState(isLoading=", this.a, ", isLoadingMore=", this.b, ", isError=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", isSendingReply=");
        sbR.append(this.e);
        sbR.append(", topic=");
        sbR.append(this.f);
        sbR.append(", posts=");
        return tw2.t(sbR, this.g, ")");
    }
}
