package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o71 extends ee5 {
    public final ay0 t;

    public o71(ay0 ay0Var) {
        this.t = ay0Var;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return true;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        pe5 pe5VarP = p();
        ay0 ay0Var = this.t;
        Throwable thQ = ay0Var.q(pe5VarP);
        if (!ay0Var.y() ? false : ((kw2) ay0Var.d).p(thQ)) {
            return;
        }
        ay0Var.a(thQ);
        if (ay0Var.y()) {
            return;
        }
        ay0Var.o();
    }
}
