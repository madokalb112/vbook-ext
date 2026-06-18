package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hk7 extends z50 {
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
        return false;
    }

    @Override // defpackage.z50
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        oq9 oq9Var = this.i;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
    }

    @Override // defpackage.z50
    public final void f() {
        this.f.setValue(Boolean.TRUE);
        this.i = ah1.J(this.c, null, null, new ap4(this, null, 1), 3);
    }

    @Override // defpackage.z50
    public final void g(float f) {
        float f2;
        long jG;
        float fFloatValue = ((Number) this.g.getValue()).floatValue();
        boolean z = this.b.j().p == lh7.a;
        st5 st5Var = this.b;
        if (z) {
            f2 = -f;
            jG = st5Var.j().g() & 4294967295L;
        } else {
            f2 = -f;
            jG = st5Var.j().g() >> 32;
        }
        h(fFloatValue + (f2 / ((int) jG)));
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
        if (pu1.h0(this.b, false)) {
            ah1.J(this.c, null, null, new ne0(this, null, 17), 3);
        }
    }

    @Override // defpackage.z50
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
