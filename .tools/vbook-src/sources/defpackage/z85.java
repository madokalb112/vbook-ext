package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z85 implements pj7 {
    public final hyb a;
    public final pn2 b;

    public z85(hyb hybVar, pn2 pn2Var) {
        this.a = hybVar;
        this.b = pn2Var;
    }

    public final float a() {
        hyb hybVar = this.a;
        pn2 pn2Var = this.b;
        return pn2Var.Y(hybVar.c(pn2Var));
    }

    public final float b(zm5 zm5Var) {
        hyb hybVar = this.a;
        pn2 pn2Var = this.b;
        return pn2Var.Y(hybVar.d(pn2Var, zm5Var));
    }

    public final float c(zm5 zm5Var) {
        hyb hybVar = this.a;
        pn2 pn2Var = this.b;
        return pn2Var.Y(hybVar.b(pn2Var, zm5Var));
    }

    public final float d() {
        hyb hybVar = this.a;
        pn2 pn2Var = this.b;
        return pn2Var.Y(hybVar.a(pn2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z85)) {
            return false;
        }
        z85 z85Var = (z85) obj;
        return lc5.Q(this.a, z85Var.a) && lc5.Q(this.b, z85Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
