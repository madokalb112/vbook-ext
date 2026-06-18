package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ss5 implements qs5 {
    public final fo2 a;
    public final /* synthetic */ st5 b;
    public final /* synthetic */ boolean c;

    public ss5(st5 st5Var, boolean z) {
        this.b = st5Var;
        this.c = z;
        this.a = dk9.n(new e51(st5Var, 5));
    }

    public final int a() {
        st5 st5Var = this.b;
        return (int) (st5Var.j().p == lh7.a ? st5Var.j().g() & 4294967295L : st5Var.j().g() >> 32);
    }

    public final float b() {
        st5 st5Var = this.b;
        return (st5Var.h() * 500) + st5Var.i();
    }

    public final Object c(int i, tl0 tl0Var) {
        rt8 rt8Var = st5.y;
        Object objL = this.b.l(i, 0, tl0Var);
        return objL == xx1.a ? objL : heb.a;
    }

    public final int d() {
        st5 st5Var = this.b;
        return (-st5Var.j().l) + st5Var.j().q;
    }

    public final float e() {
        st5 st5Var = this.b;
        int iH = st5Var.h();
        int i = st5Var.i();
        return st5Var.c() ? (iH * 500) + i + 100.0f : (iH * 500) + i;
    }

    public final cc1 f() {
        boolean z = this.c;
        fo2 fo2Var = this.a;
        return z ? new cc1(((Number) fo2Var.getValue()).intValue(), 1) : new cc1(1, ((Number) fo2Var.getValue()).intValue());
    }
}
