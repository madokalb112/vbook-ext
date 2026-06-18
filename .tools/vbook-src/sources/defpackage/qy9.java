package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qy9 extends tu6 {
    public final o7c b;
    public final bz9 c;

    public qy9(o7c o7cVar, bz9 bz9Var) {
        bz9Var.getClass();
        this.b = o7cVar;
        this.c = bz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qy9) {
            qy9 qy9Var = (qy9) obj;
            if (this.b == qy9Var.b && lc5.Q(this.c, qy9Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final nu6 f() {
        return new sy9(this.b, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final void j(nu6 nu6Var) {
        sy9 sy9Var = (sy9) nu6Var;
        sy9Var.getClass();
        bz9 bz9Var = this.c;
        bz9Var.getClass();
        sy9Var.A = this.b;
        sy9Var.B = bz9Var;
        ex1.U(sy9Var);
    }

    public final String toString() {
        return "SubsamplingDrawTilesElement(zoomable=" + this.b + ", subsampling=" + this.c + ")";
    }
}
