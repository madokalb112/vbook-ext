package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cy8 extends tu6 {
    public final ww8 b;
    public final boolean c;

    public cy8(ww8 ww8Var, boolean z) {
        this.b = ww8Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cy8)) {
            return false;
        }
        cy8 cy8Var = (cy8) obj;
        return lc5.Q(this.b, cy8Var.b) && this.c == cy8Var.c;
    }

    public final nu6 f() {
        pw8 pw8Var = new pw8();
        pw8Var.A = this.b;
        pw8Var.B = this.c;
        return pw8Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + j39.c(this.b.hashCode() * 31, 31, false);
    }

    public final void i(e95 e95Var) {
        jc1 jc1Var = e95Var.b;
        jc1Var.c(this.b, "state");
        jc1Var.c(Boolean.FALSE, "reverseScrolling");
        jc1Var.c(Boolean.valueOf(this.c), "isVertical");
    }

    public final void j(nu6 nu6Var) {
        pw8 pw8Var = (pw8) nu6Var;
        pw8Var.A = this.b;
        pw8Var.B = this.c;
    }
}
