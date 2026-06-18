package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v54 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final List d;
    public final List e;

    public v54(boolean z, int i, boolean z2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = list;
        this.e = list2;
    }

    public static v54 a(v54 v54Var, int i, boolean z, ArrayList arrayList, ArrayList arrayList2, int i2) {
        boolean z2 = (i2 & 1) != 0 ? v54Var.a : false;
        if ((i2 & 2) != 0) {
            i = v54Var.b;
        }
        if ((i2 & 4) != 0) {
            z = v54Var.c;
        }
        List list = arrayList;
        if ((i2 & 8) != 0) {
            list = v54Var.d;
        }
        List list2 = arrayList2;
        if ((i2 & 16) != 0) {
            list2 = v54Var.e;
        }
        List list3 = list2;
        v54Var.getClass();
        list.getClass();
        list3.getClass();
        List list4 = list;
        return new v54(z2, i, z, list4, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v54)) {
            return false;
        }
        v54 v54Var = (v54) obj;
        return this.a == v54Var.a && this.b == v54Var.b && this.c == v54Var.c && lc5.Q(this.d, v54Var.d) && lc5.Q(this.e, v54Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.d(j39.c(tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowState(isLoading=");
        sb.append(this.a);
        sb.append(", shelfSize=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", followBooks=");
        sb.append(this.d);
        sb.append(", notFollowBooks=");
        return tw2.t(sb, this.e, ")");
    }
}
