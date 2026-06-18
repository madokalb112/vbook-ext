package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o79 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final vl5 d;

    public o79(boolean z, boolean z2, String str, vl5 vl5Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = vl5Var;
    }

    public static o79 a(o79 o79Var, boolean z, boolean z2, String str, vl5 vl5Var, int i) {
        if ((i & 1) != 0) {
            z = o79Var.a;
        }
        if ((i & 2) != 0) {
            z2 = o79Var.b;
        }
        if ((i & 4) != 0) {
            str = o79Var.c;
        }
        if ((i & 8) != 0) {
            vl5Var = o79Var.d;
        }
        o79Var.getClass();
        o79Var.getClass();
        str.getClass();
        return new o79(z, z2, str, vl5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o79)) {
            return false;
        }
        o79 o79Var = (o79) obj;
        return this.a == o79Var.a && this.b == o79Var.b && this.c.equals(o79Var.c) && lc5.Q(this.d, o79Var.d);
    }

    public final int hashCode() {
        int iA = j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        vl5 vl5Var = this.d;
        return (iA + (vl5Var == null ? 0 : vl5Var.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sbR = j39.r("SettingState(isDeveloperModeEnabled=", this.a, ", isDeveloperModeActive=", this.b, ", networkIP=");
        sbR.append(this.c);
        sbR.append(", currentLanguage=");
        sbR.append(this.d);
        sbR.append(", systemLanguage=null)");
        return sbR.toString();
    }
}
