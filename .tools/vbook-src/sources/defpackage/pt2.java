package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pt2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;

    public pt2(boolean z, boolean z2, boolean z3, boolean z4, String str, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = list;
    }

    public static pt2 a(pt2 pt2Var, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
        if ((i & 2) != 0) {
            z2 = pt2Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = pt2Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = pt2Var.d;
        }
        boolean z7 = z4;
        String str = pt2Var.e;
        if ((i & 32) != 0) {
            list = pt2Var.f;
        }
        List list2 = list;
        pt2Var.getClass();
        list2.getClass();
        return new pt2(z, z5, z6, z7, str, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt2)) {
            return false;
        }
        pt2 pt2Var = (pt2) obj;
        return this.a == pt2Var.a && this.b == pt2Var.b && this.c == pt2Var.c && this.d == pt2Var.d && this.e.equals(pt2Var.e) && lc5.Q(this.f, pt2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j39.a(j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("DiscoveryContentState(isLoading=", this.a, ", hasGenre=", this.b, ", hasExplore=");
        ky0.D(sbR, this.c, ", isError=", this.d, ", errorMessage=");
        sbR.append(this.e);
        sbR.append(", tabs=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
