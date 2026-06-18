package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a14 extends l28 {
    public static final a14 c = new a14(g14.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        z04 z04Var = (z04) obj;
        z04Var.getClass();
        float fE = am1Var.e(this.b, i);
        z04Var.b(z04Var.d() + 1);
        float[] fArr = z04Var.a;
        int i2 = z04Var.b;
        z04Var.b = i2 + 1;
        fArr[i2] = fE;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        z04 z04Var = new z04();
        z04Var.a = fArr;
        z04Var.b = fArr.length;
        z04Var.b(10);
        return z04Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new float[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        md2Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.M(this.b, i2, fArr[i2]);
        }
    }
}
