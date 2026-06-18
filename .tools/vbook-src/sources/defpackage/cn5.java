package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class cn5 extends tu6 {
    public final Object b;

    public cn5(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn5) && this.b.equals(((cn5) obj).b);
    }

    public final nu6 f() {
        dn5 dn5Var = new dn5();
        dn5Var.A = this.b;
        return dn5Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        e95Var.a = this.b;
    }

    public final void j(nu6 nu6Var) {
        ((dn5) nu6Var).A = this.b;
    }

    public final String toString() {
        return xv5.r(new StringBuilder("LayoutIdElement(layoutId="), this.b, ')');
    }
}
