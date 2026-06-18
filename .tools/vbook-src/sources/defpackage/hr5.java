package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class hr5 extends tu6 {
    public final lr5 b;
    public final ho0 c;
    public final boolean d;
    public final lh7 e;

    public hr5(lr5 lr5Var, ho0 ho0Var, boolean z, lh7 lh7Var) {
        this.b = lr5Var;
        this.c = ho0Var;
        this.d = z;
        this.e = lh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5)) {
            return false;
        }
        hr5 hr5Var = (hr5) obj;
        return lc5.Q(this.b, hr5Var.b) && lc5.Q(this.c, hr5Var.c) && this.d == hr5Var.d && this.e == hr5Var.e;
    }

    public final nu6 f() {
        kr5 kr5Var = new kr5();
        kr5Var.A = this.b;
        kr5Var.B = this.c;
        kr5Var.C = this.d;
        kr5Var.D = this.e;
        return kr5Var;
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.c((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final void j(nu6 nu6Var) {
        kr5 kr5Var = (kr5) nu6Var;
        kr5Var.A = this.b;
        kr5Var.B = this.c;
        kr5Var.C = this.d;
        kr5Var.D = this.e;
    }

    public final void i(e95 e95Var) {
    }
}
