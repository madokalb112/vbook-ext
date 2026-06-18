package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k15 extends ul7 {
    public final jy4 f;

    public k15(jy4 jy4Var) {
        this.f = jy4Var;
    }

    public final long i() {
        jy4 jy4Var = this.f;
        int iE = jy4Var.e();
        float f = iE > 0 ? iE : Float.NaN;
        int iD = jy4Var.d();
        return (((long) Float.floatToRawIntBits(iD > 0 ? iD : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public final void j(un5 un5Var) {
        hy0 hy0Var = un5Var.a;
        jy4 jy4Var = this.f;
        int iE = jy4Var.e();
        float fIntBitsToFloat = iE > 0 ? Float.intBitsToFloat((int) (hy0Var.f() >> 32)) / iE : 1.0f;
        int iD = jy4Var.d();
        float fIntBitsToFloat2 = iD > 0 ? Float.intBitsToFloat((int) (hy0Var.f() & 4294967295L)) / iD : 1.0f;
        y91 y91Var = hy0Var.b;
        long jG = y91Var.G();
        y91Var.x().i();
        try {
            ((lp8) y91Var.b).y(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            jy4Var.h(sc.a(hy0Var.b.x()));
        } finally {
            j39.s(y91Var, jG);
        }
    }
}
