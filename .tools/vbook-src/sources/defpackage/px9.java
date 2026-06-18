package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class px9 extends tu6 {
    public final ib4 b;

    public px9(ib4 ib4Var) {
        this.b = ib4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof px9) {
            return this.b == ((px9) obj).b;
        }
        return false;
    }

    public final nu6 f() {
        return new qx9(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        e95Var.b.c(this.b, "onHandwritingSlopExceeded");
    }

    public final void j(nu6 nu6Var) {
        ((qx9) nu6Var).C = this.b;
    }
}
