package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class in9 {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public in9(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
    }

    public static in9 a(in9 in9Var, boolean z, List list, int i) {
        if ((i & 1) != 0) {
            z = in9Var.a;
        }
        boolean z2 = in9Var.b;
        if ((i & 4) != 0) {
            list = in9Var.c;
        }
        boolean z3 = (i & 8) != 0 ? in9Var.d : true;
        in9Var.getClass();
        list.getClass();
        return new in9(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in9)) {
            return false;
        }
        in9 in9Var = (in9) obj;
        return this.a == in9Var.a && this.b == in9Var.b && lc5.Q(this.c, in9Var.c) && this.d == in9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.d(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("SourceSuggestState(isLoading=", this.a, ", hasMore=", this.b, ", items=");
        sbR.append(this.c);
        sbR.append(", isError=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
