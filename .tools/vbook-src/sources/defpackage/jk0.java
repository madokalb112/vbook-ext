package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jk0 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public jk0(boolean z, String str, boolean z2, boolean z3, List list) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = list;
    }

    public static jk0 a(jk0 jk0Var, boolean z, String str, boolean z2, boolean z3, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = jk0Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            str = jk0Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z2 = jk0Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = jk0Var.d;
        }
        boolean z6 = z3;
        List list = arrayList;
        if ((i & 16) != 0) {
            list = jk0Var.e;
        }
        List list2 = list;
        jk0Var.getClass();
        str2.getClass();
        list2.getClass();
        return new jk0(z4, str2, z5, z6, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk0)) {
            return false;
        }
        jk0 jk0Var = (jk0) obj;
        return this.a == jk0Var.a && this.b.equals(jk0Var.b) && this.c == jk0Var.c && this.d == jk0Var.d && lc5.Q(this.e, jk0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c(j39.c(j39.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookMigrateSearchState(isSearching=");
        sb.append(this.a);
        sb.append(", searchKey=");
        sb.append(this.b);
        sb.append(", isShowAll=");
        ky0.D(sb, this.c, ", isShowOnlyHasResult=", this.d, ", books=");
        return tw2.t(sb, this.e, ")");
    }
}
