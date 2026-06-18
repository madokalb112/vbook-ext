package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c03 extends l28 {
    public static final c03 c = new c03(o03.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        zz2 zz2Var = (zz2) obj;
        zz2Var.getClass();
        double dG = am1Var.g(this.b, i);
        zz2Var.b(zz2Var.d() + 1);
        double[] dArr = zz2Var.a;
        int i2 = zz2Var.b;
        zz2Var.b = i2 + 1;
        dArr[i2] = dG;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        zz2 zz2Var = new zz2();
        zz2Var.a = dArr;
        zz2Var.b = dArr.length;
        zz2Var.b(10);
        return zz2Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new double[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        md2Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            k28 k28Var = this.b;
            k28Var.getClass();
            md2Var.J(k28Var, i2);
            md2Var.I(d);
        }
    }
}
