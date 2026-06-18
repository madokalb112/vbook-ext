package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v55 implements o62, xta, xv1 {
    public final u55 a;
    public final w55 b;

    public v55(u55 u55Var, w55 w55Var) {
        this.a = u55Var;
        this.b = w55Var;
    }

    @Override // defpackage.xta
    public final void a(pd2 pd2Var) {
        this.b.a(pd2Var);
    }

    @Override // defpackage.xta
    public final v9 b() {
        return this.b.c;
    }

    public final Object c() {
        u55 u55Var = this.a;
        z55 z55Var = u55Var.a;
        u55 u55Var2 = new u55(new z55(z55Var.a, z55Var.b), u55Var.b, u55Var.c, u55Var.d);
        w55 w55Var = this.b;
        return new v55(u55Var2, new w55(w55Var.a, w55Var.b, w55Var.c, w55Var.d, w55Var.e, w55Var.f));
    }

    @Override // defpackage.xta
    public final void d(Integer num) {
        this.b.b = num;
    }

    @Override // defpackage.xta
    public final void e(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.f4c
    public final void f(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.xta
    public final Integer g() {
        return this.b.d;
    }

    @Override // defpackage.xta
    public final void h(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.f4c
    public final Integer i() {
        return this.a.a.a;
    }

    @Override // defpackage.o62
    public final Integer j() {
        return this.a.c;
    }

    @Override // defpackage.xta
    public final pd2 k() {
        return this.b.k();
    }

    @Override // defpackage.xta
    public final Integer l() {
        return this.b.f;
    }

    @Override // defpackage.xta
    public final Integer m() {
        return this.b.b;
    }

    @Override // defpackage.o62
    public final Integer n() {
        return this.a.b;
    }

    @Override // defpackage.o62
    public final void o(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.xta
    public final void p(v9 v9Var) {
        this.b.c = v9Var;
    }

    @Override // defpackage.o62
    public final Integer q() {
        return this.a.d;
    }

    @Override // defpackage.f4c
    public final void r(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.f4c
    public final Integer s() {
        return this.a.a.b;
    }

    @Override // defpackage.o62
    public final void t(Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.xta
    public final void u(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.xta
    public final Integer v() {
        return this.b.a;
    }

    @Override // defpackage.xta
    public final Integer w() {
        return this.b.e;
    }

    @Override // defpackage.xta
    public final void x(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.o62
    public final void y(Integer num) {
        this.a.d = num;
    }
}
