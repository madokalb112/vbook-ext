package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ru5 implements qs5 {
    public final /* synthetic */ uu5 a;

    public ru5(uu5 uu5Var) {
        this.a = uu5Var;
    }

    public final int a() {
        uu5 uu5Var = this.a;
        return (int) (uu5Var.g().u == lh7.a ? uu5Var.g().n & 4294967295L : uu5Var.g().n >> 32);
    }

    public final float b() {
        uu5 uu5Var = this.a;
        return (((zm7) uu5Var.c.d).h() * 500) + ((zm7) uu5Var.c.f).h();
    }

    public final Object c(int i, tl0 tl0Var) {
        rt8 rt8Var = uu5.x;
        Object objI = this.a.i(i, 0, tl0Var);
        return objI == xx1.a ? objI : heb.a;
    }

    public final int d() {
        uu5 uu5Var = this.a;
        return uu5Var.g().q + uu5Var.g().r;
    }

    public final float e() {
        uu5 uu5Var = this.a;
        int iH = ((zm7) uu5Var.c.d).h();
        int iH2 = ((zm7) uu5Var.c.f).h();
        return uu5Var.c() ? (iH * 500) + iH2 + 100.0f : (iH * 500) + iH2;
    }

    public final cc1 f() {
        return new cc1(-1, -1);
    }
}
