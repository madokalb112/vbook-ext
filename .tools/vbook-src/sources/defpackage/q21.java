package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q21 extends l28 {
    public static final q21 c = new q21(d31.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        j21 j21Var = (j21) obj;
        j21Var.getClass();
        char cH = am1Var.h(this.b, i);
        j21Var.b(j21Var.d() + 1);
        char[] cArr = j21Var.a;
        int i2 = j21Var.b;
        j21Var.b = i2 + 1;
        cArr[i2] = cH;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        j21 j21Var = new j21();
        j21Var.a = cArr;
        j21Var.b = cArr.length;
        j21Var.b(10);
        return j21Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new char[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        md2Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            k28 k28Var = this.b;
            k28Var.getClass();
            md2Var.J(k28Var, i2);
            md2Var.H(c2);
        }
    }
}
