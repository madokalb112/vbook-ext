package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class gg9 extends tu6 {
    public final by3 b;

    public gg9(by3 by3Var) {
        this.b = by3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gg9) || !lc5.Q(((gg9) obj).b, this.b)) {
            return false;
        }
        xf0 xf0Var = bv4.b;
        return xf0Var.equals(xf0Var);
    }

    public final nu6 f() {
        return new jg9(this.b);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.b.hashCode() * 31)) * 31;
    }

    public final void i(e95 e95Var) {
        jc1 jc1Var = e95Var.b;
        jc1Var.c(this.b, "animationSpec");
        jc1Var.c(bv4.b, "alignment");
        jc1Var.c(null, "finishedListener");
    }

    public final void j(nu6 nu6Var) {
        ((jg9) nu6Var).B = this.b;
    }
}
