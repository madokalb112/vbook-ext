package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iu2 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;

    public iu2(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
    }

    public static iu2 a(iu2 iu2Var, boolean z, boolean z2, String str, List list, int i) {
        if ((i & 1) != 0) {
            z = iu2Var.a;
        }
        if ((i & 2) != 0) {
            z2 = iu2Var.b;
        }
        if ((i & 4) != 0) {
            str = iu2Var.c;
        }
        if ((i & 8) != 0) {
            list = iu2Var.d;
        }
        iu2Var.getClass();
        list.getClass();
        return new iu2(str, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu2)) {
            return false;
        }
        iu2 iu2Var = (iu2) obj;
        return this.a == iu2Var.a && this.b == iu2Var.b && this.c.equals(iu2Var.c) && lc5.Q(this.d, iu2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("DiscoveryGenreContentState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", genres=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
