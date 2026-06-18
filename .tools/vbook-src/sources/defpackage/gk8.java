package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gk8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public gk8(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static gk8 a(gk8 gk8Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = gk8Var.a;
        }
        if ((i & 2) != 0) {
            z2 = gk8Var.b;
        }
        boolean z3 = gk8Var.c;
        List list = gk8Var.d;
        gk8Var.getClass();
        list.getClass();
        return new gk8(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk8)) {
            return false;
        }
        gk8 gk8Var = (gk8) obj;
        return this.a == gk8Var.a && this.b == gk8Var.b && this.c == gk8Var.c && lc5.Q(this.d, gk8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ReportTopicState(isLoading=", this.a, ", isError=", this.b, ", hasMore=");
        sbR.append(this.c);
        sbR.append(", reportList=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
