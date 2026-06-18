package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class rb7 extends tu6 {
    public final kb4 b;
    public final mj c;

    public rb7(kb4 kb4Var, mj mjVar) {
        this.b = kb4Var;
        this.c = mjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rb7 rb7Var = obj instanceof rb7 ? (rb7) obj : null;
        return rb7Var != null && this.b == rb7Var.b;
    }

    public final nu6 f() {
        sb7 sb7Var = new sb7();
        sb7Var.A = this.b;
        sb7Var.B = true;
        return sb7Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final void i(e95 e95Var) {
        this.c.invoke(e95Var);
    }

    public final void j(nu6 nu6Var) {
        sb7 sb7Var = (sb7) nu6Var;
        kb4 kb4Var = sb7Var.A;
        kb4 kb4Var2 = this.b;
        if (kb4Var != kb4Var2 || !sb7Var.B) {
            vw1.S(sb7Var).X(false);
        }
        sb7Var.A = kb4Var2;
        sb7Var.B = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.b + ", rtlAware=true)";
    }
}
