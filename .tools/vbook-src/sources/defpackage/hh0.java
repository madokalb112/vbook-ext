package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class hh0 extends tu6 {
    public final kb4 b;

    public hh0(kb4 kb4Var) {
        this.b = kb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hh0) {
            return this.b == ((hh0) obj).b;
        }
        return false;
    }

    public final nu6 f() {
        return new ih0(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        e95Var.b.c(this.b, "block");
    }

    public final void j(nu6 nu6Var) {
        ih0 ih0Var = (ih0) nu6Var;
        kb4 kb4Var = this.b;
        ih0Var.A = kb4Var;
        pu1.z0(ih0Var, kb4Var);
    }
}
