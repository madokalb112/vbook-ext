package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xm3 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final to3 d;
    public final boolean e;
    public final List f;

    public xm3(boolean z, boolean z2, String str, to3 to3Var, boolean z3, List list) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = to3Var;
        this.e = z3;
        this.f = list;
    }

    public static xm3 a(xm3 xm3Var, boolean z, boolean z2, boolean z3, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = xm3Var.a;
        }
        boolean z4 = z;
        String str = xm3Var.c;
        to3 to3Var = xm3Var.d;
        if ((i & 16) != 0) {
            z3 = xm3Var.e;
        }
        boolean z5 = z3;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = xm3Var.f;
        }
        xm3Var.getClass();
        str.getClass();
        to3Var.getClass();
        return new xm3(z4, z2, str, to3Var, z5, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm3)) {
            return false;
        }
        xm3 xm3Var = (xm3) obj;
        return this.a == xm3Var.a && this.b == xm3Var.b && lc5.Q(this.c, xm3Var.c) && lc5.Q(this.d, xm3Var.d) && this.e == xm3Var.e && lc5.Q(this.f, xm3Var.f);
    }

    public final int hashCode() {
        int iC = j39.c((this.d.hashCode() + j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        List list = this.f;
        return iC + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ExtensionBook(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", extension=");
        sbR.append(this.d);
        sbR.append(", hasMore=");
        sbR.append(this.e);
        sbR.append(", books=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ xm3(to3 to3Var) {
        this(false, false, "", to3Var, false, null);
    }
}
