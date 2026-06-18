package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tn3 {
    public final boolean a;
    public final to3 b;
    public final gn3 c;
    public final fn3 d;
    public final dr3 e;
    public final cr3 f;
    public final xo3 g;

    public tn3(boolean z, to3 to3Var, gn3 gn3Var, fn3 fn3Var, dr3 dr3Var, cr3 cr3Var, xo3 xo3Var) {
        this.a = z;
        this.b = to3Var;
        this.c = gn3Var;
        this.d = fn3Var;
        this.e = dr3Var;
        this.f = cr3Var;
        this.g = xo3Var;
    }

    public static tn3 a(tn3 tn3Var, to3 to3Var, gn3 gn3Var, fn3 fn3Var, dr3 dr3Var, cr3 cr3Var, xo3 xo3Var, int i) {
        boolean z = (i & 1) != 0 ? tn3Var.a : false;
        if ((i & 2) != 0) {
            to3Var = tn3Var.b;
        }
        if ((i & 4) != 0) {
            gn3Var = tn3Var.c;
        }
        if ((i & 8) != 0) {
            fn3Var = tn3Var.d;
        }
        if ((i & 16) != 0) {
            dr3Var = tn3Var.e;
        }
        if ((i & 32) != 0) {
            cr3Var = tn3Var.f;
        }
        if ((i & 64) != 0) {
            xo3Var = tn3Var.g;
        }
        xo3 xo3Var2 = xo3Var;
        tn3Var.getClass();
        cr3 cr3Var2 = cr3Var;
        dr3 dr3Var2 = dr3Var;
        fn3 fn3Var2 = fn3Var;
        return new tn3(z, to3Var, gn3Var, fn3Var2, dr3Var2, cr3Var2, xo3Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn3)) {
            return false;
        }
        tn3 tn3Var = (tn3) obj;
        return this.a == tn3Var.a && lc5.Q(this.b, tn3Var.b) && this.c.equals(tn3Var.c) && lc5.Q(this.d, tn3Var.d) && this.e.equals(tn3Var.e) && lc5.Q(this.f, tn3Var.f) && lc5.Q(this.g, tn3Var.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        to3 to3Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (to3Var == null ? 0 : to3Var.hashCode())) * 31)) * 31;
        fn3 fn3Var = this.d;
        int iB = j39.b((iHashCode2 + (fn3Var == null ? 0 : fn3Var.hashCode())) * 31, 31, this.e.a);
        cr3 cr3Var = this.f;
        int iHashCode3 = (iB + (cr3Var == null ? 0 : cr3Var.a.hashCode())) * 31;
        xo3 xo3Var = this.g;
        return iHashCode3 + (xo3Var != null ? xo3Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ExtensionDetailState(isLoading=" + this.a + ", extension=" + this.b + ", extensionConnectionConfig=" + this.c + ", extensionConnection=" + this.d + ", extensionSettingConfig=" + this.e + ", extensionSetting=" + this.f + ", extensionLocalStorage=" + this.g + ")";
    }
}
