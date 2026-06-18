package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ss0 extends l28 {
    public static final ss0 c = new ss0(pu0.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        ks0 ks0Var = (ks0) obj;
        ks0Var.getClass();
        byte bJ = am1Var.j(this.b, i);
        ks0Var.b(ks0Var.d() + 1);
        byte[] bArr = ks0Var.a;
        int i2 = ks0Var.b;
        ks0Var.b = i2 + 1;
        bArr[i2] = bJ;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ks0 ks0Var = new ks0();
        ks0Var.a = bArr;
        ks0Var.b = bArr.length;
        ks0Var.b(10);
        return ks0Var;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new byte[0];
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        md2Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            k28 k28Var = this.b;
            k28Var.getClass();
            md2Var.J(k28Var, i2);
            md2Var.G(b);
        }
    }
}
