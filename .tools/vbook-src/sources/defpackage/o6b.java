package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class o6b extends tu6 {
    public final ms5 b;

    public o6b(ms5 ms5Var) {
        this.b = ms5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6b) && lc5.Q(this.b, ((o6b) obj).b);
    }

    public final nu6 f() {
        p6b p6bVar = new p6b();
        p6bVar.A = this.b;
        return p6bVar;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i(e95 e95Var) {
        e95Var.a = this.b;
    }

    public final void j(nu6 nu6Var) {
        ((p6b) nu6Var).A = this.b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
