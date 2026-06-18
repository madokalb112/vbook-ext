package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ri5 {
    public static final ri5 c = new ri5(null, null);
    public final ti5 a;
    public final pi5 b;

    public ri5(ti5 ti5Var, fbb fbbVar) {
        String str;
        this.a = ti5Var;
        this.b = fbbVar;
        if ((ti5Var == null) == (fbbVar == null)) {
            return;
        }
        if (ti5Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + ti5Var + " requires type to be specified.";
        }
        gp.k(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri5)) {
            return false;
        }
        ri5 ri5Var = (ri5) obj;
        return this.a == ri5Var.a && lc5.Q(this.b, ri5Var.b);
    }

    public final int hashCode() {
        ti5 ti5Var = this.a;
        int iHashCode = (ti5Var == null ? 0 : ti5Var.hashCode()) * 31;
        pi5 pi5Var = this.b;
        return iHashCode + (pi5Var != null ? pi5Var.hashCode() : 0);
    }

    public final String toString() {
        ti5 ti5Var = this.a;
        int i = ti5Var == null ? -1 : qi5.a[ti5Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        pi5 pi5Var = this.b;
        if (i == 1) {
            return String.valueOf(pi5Var);
        }
        if (i == 2) {
            return "in " + pi5Var;
        }
        if (i != 3) {
            mn5.g();
            return null;
        }
        return "out " + pi5Var;
    }
}
