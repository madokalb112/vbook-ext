package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class y33<T> extends tu6 {
    public final ob b;
    public final yb4 c;
    public final lh7 d;

    public y33(ob obVar, yb4 yb4Var, lh7 lh7Var) {
        obVar.getClass();
        yb4Var.getClass();
        this.b = obVar;
        this.c = yb4Var;
        this.d = lh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y33)) {
            return false;
        }
        y33 y33Var = (y33) obj;
        return lc5.Q(this.b, y33Var.b) && this.c == y33Var.c && this.d == y33Var.d;
    }

    public final nu6 f() {
        ob obVar = this.b;
        obVar.getClass();
        yb4 yb4Var = this.c;
        yb4Var.getClass();
        z33 z33Var = new z33();
        z33Var.A = obVar;
        z33Var.B = yb4Var;
        z33Var.C = this.d;
        return z33Var;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final void j(nu6 nu6Var) {
        z33 z33Var = (z33) nu6Var;
        z33Var.getClass();
        ob obVar = this.b;
        obVar.getClass();
        z33Var.A = obVar;
        yb4 yb4Var = this.c;
        yb4Var.getClass();
        z33Var.B = yb4Var;
        z33Var.C = this.d;
    }

    public final void i(e95 e95Var) {
    }
}
