package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ud9 extends l28 {
    public static final ud9 c = new ud9(vd9.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        td9 td9Var = (td9) obj;
        td9Var.getClass();
        short sM = am1Var.m(this.b, i);
        td9Var.b(td9Var.d() + 1);
        short[] sArr = td9Var.a;
        int i2 = td9Var.b;
        td9Var.b = i2 + 1;
        sArr[i2] = sM;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        td9 td9Var = new td9();
        td9Var.a = sArr;
        td9Var.b = sArr.length;
        td9Var.b(10);
        return td9Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new short[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        md2Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            k28 k28Var = this.b;
            k28Var.getClass();
            md2Var.J(k28Var, i2);
            md2Var.X(s);
        }
    }
}
