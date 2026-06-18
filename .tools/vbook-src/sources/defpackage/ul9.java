package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ul9 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public ul9(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
    }

    public static ul9 a(ul9 ul9Var, boolean z, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ul9Var.a;
        }
        boolean z3 = ul9Var.b;
        if ((i & 4) != 0) {
            list = ul9Var.c;
        }
        if ((i & 8) != 0) {
            z2 = ul9Var.d;
        }
        ul9Var.getClass();
        list.getClass();
        return new ul9(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul9)) {
            return false;
        }
        ul9 ul9Var = (ul9) obj;
        return this.a == ul9Var.a && this.b == ul9Var.b && lc5.Q(this.c, ul9Var.c) && this.d == ul9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.d(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("SourceCommentState(isLoading=", this.a, ", hasMore=", this.b, ", comments=");
        sbR.append(this.c);
        sbR.append(", isError=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
