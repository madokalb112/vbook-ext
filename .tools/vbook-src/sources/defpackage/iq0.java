package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iq0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;

    public iq0(boolean z, boolean z2, boolean z3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
    }

    public static iq0 a(iq0 iq0Var, boolean z, boolean z2, boolean z3, List list, List list2, int i) {
        iq0Var.getClass();
        if ((i & 2) != 0) {
            z = iq0Var.a;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = iq0Var.b;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = iq0Var.c;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            list = iq0Var.d;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = iq0Var.e;
        }
        List list4 = list2;
        iq0Var.getClass();
        list3.getClass();
        list4.getClass();
        return new iq0(z4, z5, z6, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        return this.a == iq0Var.a && this.b == iq0Var.b && this.c == iq0Var.c && lc5.Q(this.d, iq0Var.d) && lc5.Q(this.e, iq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.d(j39.c(j39.c(j39.c(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("BrowserState(isLoading=false, hasDetail=", this.a, ", isAdblock=", this.b, ", isDesktopMode=");
        sbR.append(this.c);
        sbR.append(", extensionList=");
        sbR.append(this.d);
        sbR.append(", historyList=");
        return tw2.t(sbR, this.e, ")");
    }
}
