package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class qj7 extends tu6 {
    public final pj7 b;
    public final zs5 c;

    public qj7(pj7 pj7Var, zs5 zs5Var) {
        this.b = pj7Var;
        this.c = zs5Var;
    }

    public final boolean equals(Object obj) {
        qj7 qj7Var = obj instanceof qj7 ? (qj7) obj : null;
        if (qj7Var == null) {
            return false;
        }
        return lc5.Q(this.b, qj7Var.b);
    }

    public final nu6 f() {
        sj7 sj7Var = new sj7();
        sj7Var.A = this.b;
        return sj7Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        this.c.invoke(e95Var);
    }

    public final void j(nu6 nu6Var) {
        ((sj7) nu6Var).A = this.b;
    }
}
