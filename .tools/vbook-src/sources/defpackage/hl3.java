package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hl3 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final fl3 d;

    public hl3(boolean z, boolean z2, String str, fl3 fl3Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = fl3Var;
    }

    public static hl3 a(hl3 hl3Var, boolean z, boolean z2, String str, fl3 fl3Var, int i) {
        if ((i & 4) != 0) {
            str = hl3Var.c;
        }
        if ((i & 8) != 0) {
            fl3Var = hl3Var.d;
        }
        hl3Var.getClass();
        fl3Var.getClass();
        return new hl3(z, z2, str, fl3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl3)) {
            return false;
        }
        hl3 hl3Var = (hl3) obj;
        return this.a == hl3Var.a && this.b == hl3Var.b && this.c.equals(hl3Var.c) && this.d.equals(hl3Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ExploreState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        sbR.append(this.c);
        sbR.append(", page=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
