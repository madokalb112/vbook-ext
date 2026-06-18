package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qsb {
    public final fr9 a;
    public final fr9 b;
    public final fr9 c;
    public final fr9 d;
    public final fr9 e;
    public final fe8 f;
    public final fe8 g;
    public final fe8 h;
    public final fe8 i;
    public final fe8 j;
    public final fe8 k;
    public final fe8 l;
    public final fe8 m;
    public gqb n;
    public iw0 o;
    public Float p;
    public Boolean q;
    public Float r;
    public final ea9 s;

    public qsb() {
        iw0 iw0VarO = wx1.o();
        fr9 fr9VarA = gr9.a(hv7.a);
        this.a = fr9VarA;
        fr9 fr9VarA2 = gr9.a(0L);
        this.b = fr9VarA2;
        fr9 fr9VarA3 = gr9.a(0L);
        this.c = fr9VarA3;
        fr9 fr9VarA4 = gr9.a(new na5(0L));
        this.d = fr9VarA4;
        this.e = gr9.a(Float.valueOf(0.0f));
        this.f = new fe8(fr9VarA);
        this.g = new fe8(fr9VarA2);
        this.h = new fe8(fr9VarA3);
        this.i = new fe8(fr9VarA4);
        lsb lsbVar = new lsb(fr9VarA, 0);
        Boolean bool = Boolean.FALSE;
        qt7 qt7Var = hb9.a;
        this.j = cx1.s0(lsbVar, iw0VarO, qt7Var, bool);
        this.k = cx1.s0(new lsb(fr9VarA, 1), iw0VarO, qt7Var, bool);
        this.l = cx1.s0(new lsb(fr9VarA, 2), iw0VarO, qt7Var, bool);
        this.m = cx1.s0(new lsb(fr9VarA, 3), iw0VarO, qt7Var, Boolean.TRUE);
        this.s = fa9.a(1, 4, null);
    }

    public final void a() {
        gqb gqbVar = this.n;
        if (gqbVar != null) {
            gqbVar.q();
        }
    }

    public final void b(long j) {
        gqb gqbVar = this.n;
        if (gqbVar != null) {
            gqbVar.l(j);
        }
    }

    public final void c(long j) {
        gqb gqbVar = this.n;
        if (gqbVar != null) {
            gqbVar.g(j);
        }
    }

    public final void d() {
        iw0 iw0Var = this.o;
        if (iw0Var != null) {
            wx1.K(iw0Var, null);
        }
        this.o = null;
        this.n = null;
        fr9 fr9Var = this.a;
        fr9Var.getClass();
        fr9Var.l(null, hv7.a);
        fr9 fr9Var2 = this.b;
        fr9Var2.getClass();
        fr9Var2.l(null, 0L);
        fr9 fr9Var3 = this.c;
        fr9Var3.getClass();
        fr9Var3.l(null, 0L);
        na5 na5Var = new na5(0L);
        fr9 fr9Var4 = this.d;
        fr9Var4.getClass();
        fr9Var4.l(null, na5Var);
        Float fValueOf = Float.valueOf(0.0f);
        fr9 fr9Var5 = this.e;
        fr9Var5.getClass();
        fr9Var5.l(null, fValueOf);
    }
}
