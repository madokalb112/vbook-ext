package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jm0 extends l28 {
    public static final jm0 c = new jm0(mm0.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        im0 im0Var = (im0) obj;
        im0Var.getClass();
        boolean z = am1Var.z(this.b, i);
        im0Var.b(im0Var.d() + 1);
        boolean[] zArr = im0Var.a;
        int i2 = im0Var.b;
        im0Var.b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        im0 im0Var = new im0();
        im0Var.a = zArr;
        im0Var.b = zArr.length;
        im0Var.b(10);
        return im0Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new boolean[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        md2Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.F(this.b, i2, zArr[i2]);
        }
    }
}
