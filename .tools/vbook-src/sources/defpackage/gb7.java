package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class gb7 extends tu6 {
    public final float b;
    public final fa c;

    public gb7(float f, fa faVar) {
        this.b = f;
        this.c = faVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gb7 gb7Var = obj instanceof gb7 ? (gb7) obj : null;
        return gb7Var != null && x13.c(this.b, gb7Var.b) && x13.c(0.0f, 0.0f);
    }

    public final nu6 f() {
        pb7 pb7Var = new pb7();
        pb7Var.A = this.b;
        pb7Var.B = true;
        return pb7Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tw2.c(0.0f, Float.hashCode(this.b) * 31, 31);
    }

    public final void i(e95 e95Var) {
        this.c.invoke(e95Var);
    }

    public final void j(nu6 nu6Var) {
        pb7 pb7Var = (pb7) nu6Var;
        float f = pb7Var.A;
        float f2 = this.b;
        if (!x13.c(f, f2) || !x13.c(0.0f, 0.0f) || !pb7Var.B) {
            vw1.S(pb7Var).X(false);
        }
        pb7Var.A = f2;
        pb7Var.B = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) x13.d(this.b)) + ", y=" + ((Object) x13.d(0.0f)) + ", rtlAware=true)";
    }
}
