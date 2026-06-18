package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bp4 extends z50 {
    public sw8 i;
    public oq9 j;

    @Override // defpackage.z50
    public final void a() {
        oq9 oq9Var = this.j;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
    }

    @Override // defpackage.z50
    public final boolean d() {
        return false;
    }

    @Override // defpackage.z50
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        oq9 oq9Var = this.j;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
    }

    @Override // defpackage.z50
    public final void f() {
        this.f.setValue(Boolean.TRUE);
        this.j = ah1.J(this.c, null, null, new ap4(this, null, 0), 3);
    }

    @Override // defpackage.z50
    public final void g(float f) {
        cn7 cn7Var = this.g;
        cn7Var.setValue(Float.valueOf(((-f) / ((int) (this.i.j() & 4294967295L))) + ((Number) cn7Var.getValue()).floatValue()));
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
        if (this.i.g()) {
            ah1.J(this.c, null, null, new l64(this, (jt1) null, 6), 3);
        }
    }

    @Override // defpackage.z50
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
