package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xm8 extends ee5 {
    public final ge5 t;

    public xm8(ge5 ge5Var) {
        this.t = ge5Var;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return false;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        Object objH = p().H();
        boolean z = objH instanceof ei1;
        ge5 ge5Var = this.t;
        if (z) {
            ge5Var.resumeWith(e11.I(((ei1) objH).a));
        } else {
            ge5Var.resumeWith(qe5.a(objH));
        }
    }
}
