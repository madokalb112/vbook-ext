package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class je5 extends ee5 {
    public final g09 t;
    public final /* synthetic */ pe5 u;

    public je5(pe5 pe5Var, g09 g09Var) {
        this.u = pe5Var;
        this.t = g09Var;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return false;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        pe5 pe5Var = this.u;
        Object objH = pe5Var.H();
        if (!(objH instanceof ei1)) {
            objH = qe5.a(objH);
        }
        this.t.j(pe5Var, objH);
    }
}
