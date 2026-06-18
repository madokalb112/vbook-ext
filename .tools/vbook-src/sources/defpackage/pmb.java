package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pmb extends sw8 {
    public oq9 u;

    @Override // defpackage.sw8
    public final boolean k() {
        return i().j.a();
    }

    @Override // defpackage.sw8
    public final heb l(boolean z, eb7 eb7Var) {
        oq9 oq9Var = this.u;
        heb hebVar = heb.a;
        if (oq9Var != null && oq9Var.isActive()) {
            return hebVar;
        }
        vx1 vx1Var = this.b;
        this.u = vx1Var != null ? ah1.J(vx1Var, null, null, new omb(z, this, null, 0), 3) : null;
        return hebVar;
    }

    @Override // defpackage.sw8
    public final heb m(boolean z, eb7 eb7Var) {
        oq9 oq9Var = this.u;
        int i = 1;
        heb hebVar = heb.a;
        if (oq9Var != null && oq9Var.isActive()) {
            return hebVar;
        }
        vx1 vx1Var = this.b;
        this.u = vx1Var != null ? ah1.J(vx1Var, null, null, new omb(z, this, null, i), 3) : null;
        return hebVar;
    }

    @Override // defpackage.sw8
    public final void c() {
    }

    @Override // defpackage.sw8
    public final void b(float f, float f2) {
    }

    @Override // defpackage.sw8
    public final void p(float f, float f2) {
    }
}
