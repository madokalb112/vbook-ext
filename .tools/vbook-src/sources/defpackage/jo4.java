package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jo4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public jo4(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static jo4 a(jo4 jo4Var, boolean z, boolean z2, boolean z3, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = jo4Var.a;
        }
        if ((i & 2) != 0) {
            z2 = jo4Var.b;
        }
        if ((i & 4) != 0) {
            z3 = jo4Var.c;
        }
        List list = arrayList;
        if ((i & 8) != 0) {
            list = jo4Var.d;
        }
        jo4Var.getClass();
        list.getClass();
        return new jo4(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo4)) {
            return false;
        }
        jo4 jo4Var = (jo4) obj;
        return this.a == jo4Var.a && this.b == jo4Var.b && this.c == jo4Var.c && lc5.Q(this.d, jo4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("HomeSearchState(isSearching=", this.a, ", isShowAll=", this.b, ", isShowOnlyHasResult=");
        sbR.append(this.c);
        sbR.append(", extensionBooks=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
