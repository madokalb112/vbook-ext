package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class geb implements hyb {
    public final hyb a;
    public final hyb b;

    public geb(hyb hybVar, hyb hybVar2) {
        this.a = hybVar;
        this.b = hybVar2;
    }

    public final int a(pn2 pn2Var) {
        return Math.max(this.a.a(pn2Var), this.b.a(pn2Var));
    }

    public final int b(pn2 pn2Var, zm5 zm5Var) {
        return Math.max(this.a.b(pn2Var, zm5Var), this.b.b(pn2Var, zm5Var));
    }

    public final int c(pn2 pn2Var) {
        return Math.max(this.a.c(pn2Var), this.b.c(pn2Var));
    }

    public final int d(pn2 pn2Var, zm5 zm5Var) {
        return Math.max(this.a.d(pn2Var, zm5Var), this.b.d(pn2Var, zm5Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geb)) {
            return false;
        }
        geb gebVar = (geb) obj;
        return lc5.Q(gebVar.a, this.a) && lc5.Q(gebVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
