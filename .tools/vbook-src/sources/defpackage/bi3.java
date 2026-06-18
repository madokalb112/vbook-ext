package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bi3 implements hyb {
    public final hyb a;
    public final hyb b;

    public bi3(hyb hybVar, hyb hybVar2) {
        this.a = hybVar;
        this.b = hybVar2;
    }

    public final int a(pn2 pn2Var) {
        int iA = this.a.a(pn2Var) - this.b.a(pn2Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    public final int b(pn2 pn2Var, zm5 zm5Var) {
        int iB = this.a.b(pn2Var, zm5Var) - this.b.b(pn2Var, zm5Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    public final int c(pn2 pn2Var) {
        int iC = this.a.c(pn2Var) - this.b.c(pn2Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    public final int d(pn2 pn2Var, zm5 zm5Var) {
        int iD = this.a.d(pn2Var, zm5Var) - this.b.d(pn2Var, zm5Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi3)) {
            return false;
        }
        bi3 bi3Var = (bi3) obj;
        return bi3Var.a.equals(this.a) && lc5.Q(bi3Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
