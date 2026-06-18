package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class tca extends tu6 {
    public final yb4 b;

    public tca(yb4 yb4Var) {
        this.b = yb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tca) {
            return this.b == ((tca) obj).b;
        }
        return false;
    }

    public final nu6 f() {
        return new vca(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        e95Var.b.c(this.b, "onPreShowContextMenu");
    }

    public final void j(nu6 nu6Var) {
        ((vca) nu6Var).C = this.b;
    }
}
