package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p56 extends l28 {
    public static final p56 c = new p56(e66.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        o56 o56Var = (o56) obj;
        o56Var.getClass();
        long jD = am1Var.D(this.b, i);
        o56Var.b(o56Var.d() + 1);
        long[] jArr = o56Var.a;
        int i2 = o56Var.b;
        o56Var.b = i2 + 1;
        jArr[i2] = jD;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        o56 o56Var = new o56();
        o56Var.a = jArr;
        o56Var.b = jArr.length;
        o56Var.b(10);
        return o56Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new long[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        md2Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.S(this.b, i2, jArr[i2]);
        }
    }
}
