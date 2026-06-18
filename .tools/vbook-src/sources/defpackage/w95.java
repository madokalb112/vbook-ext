package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w95 extends l28 {
    public static final w95 c = new w95(la5.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        v95 v95Var = (v95) obj;
        v95Var.getClass();
        int iR = am1Var.r(this.b, i);
        v95Var.b(v95Var.d() + 1);
        int[] iArr = v95Var.a;
        int i2 = v95Var.b;
        v95Var.b = i2 + 1;
        iArr[i2] = iR;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        v95 v95Var = new v95();
        v95Var.a = iArr;
        v95Var.b = iArr.length;
        v95Var.b(10);
        return v95Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new int[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        md2Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.Q(i2, iArr[i2], this.b);
        }
    }
}
