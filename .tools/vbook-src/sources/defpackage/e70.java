package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e70 extends nz1 {
    public final List a;
    public final jz1 b;
    public final bz1 c;
    public final h70 d;
    public final List e;

    public e70(List list, g70 g70Var, bz1 bz1Var, h70 h70Var, List list2) {
        this.a = list;
        this.b = g70Var;
        this.c = bz1Var;
        this.d = h70Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        List list = this.a;
        if (list == null) {
            if (((e70) nz1Var).a != null) {
                return false;
            }
        } else if (!list.equals(((e70) nz1Var).a)) {
            return false;
        }
        jz1 jz1Var = this.b;
        if (jz1Var == null) {
            if (((e70) nz1Var).b != null) {
                return false;
            }
        } else if (!jz1Var.equals(((e70) nz1Var).b)) {
            return false;
        }
        bz1 bz1Var = this.c;
        if (bz1Var == null) {
            if (((e70) nz1Var).c != null) {
                return false;
            }
        } else if (!bz1Var.equals(((e70) nz1Var).c)) {
            return false;
        }
        e70 e70Var = (e70) nz1Var;
        return this.d.equals(e70Var.d) && this.e.equals(e70Var.e);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        jz1 jz1Var = this.b;
        int iHashCode2 = (iHashCode ^ (jz1Var == null ? 0 : jz1Var.hashCode())) * 1000003;
        bz1 bz1Var = this.c;
        return this.e.hashCode() ^ (((((bz1Var != null ? bz1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return tw2.t(sb, this.e, "}");
    }
}
