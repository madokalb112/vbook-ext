package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pt1 extends z50 {
    public oq9 i;

    @Override // defpackage.z50
    public final void a() {
        oq9 oq9Var = this.i;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
    }

    @Override // defpackage.z50
    public final boolean b() {
        return true;
    }

    @Override // defpackage.z50
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        oq9 oq9Var = this.i;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        ah1.J(this.c, null, null, new nt1(this, jt1Var, 0), 3);
    }

    @Override // defpackage.z50
    public final void f() {
        Boolean bool = Boolean.TRUE;
        this.e.setValue(bool);
        this.f.setValue(bool);
        oq9 oq9Var = this.i;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        this.i = ah1.J(this.c, null, null, new nt1(this, jt1Var, 1), 3);
    }

    @Override // defpackage.z50
    public final void g(float f) {
        ah1.J(this.c, null, null, new el(this, f, null, 1), 3);
    }

    @Override // defpackage.z50
    public final void i(float f) {
        this.h.setValue(Float.valueOf(f));
        if (c()) {
            f();
        }
    }

    @Override // defpackage.z50
    public final void j() {
        f();
    }

    @Override // defpackage.z50
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
