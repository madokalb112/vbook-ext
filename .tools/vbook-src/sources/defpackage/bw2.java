package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bw2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public bw2(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }

    public static bw2 a(bw2 bw2Var, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = bw2Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = bw2Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = bw2Var.c;
        }
        boolean z6 = z3;
        boolean z7 = bw2Var.d;
        if ((i & 16) != 0) {
            list = bw2Var.e;
        }
        List list2 = list;
        bw2Var.getClass();
        list2.getClass();
        return new bw2(z4, z5, z6, z7, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw2)) {
            return false;
        }
        bw2 bw2Var = (bw2) obj;
        return this.a == bw2Var.a && this.b == bw2Var.b && this.c == bw2Var.c && this.d == bw2Var.d && lc5.Q(this.e, bw2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("DiscussTopicState(isLoading=", this.a, ", isError=", this.b, ", isSearchMode=");
        ky0.D(sbR, this.c, ", hasMore=", this.d, ", topicList=");
        return tw2.t(sbR, this.e, ")");
    }
}
