package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fcb extends l28 {
    public static final fcb c = new fcb(gcb.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        return ((dcb) obj).a.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        ecb ecbVar = (ecb) obj;
        ecbVar.getClass();
        byte bA = am1Var.a(this.b, i).A();
        ecbVar.b(ecbVar.d() + 1);
        byte[] bArr = ecbVar.a;
        int i2 = ecbVar.b;
        ecbVar.b = i2 + 1;
        bArr[i2] = bA;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        byte[] bArr = ((dcb) obj).a;
        ecb ecbVar = new ecb();
        ecbVar.a = bArr;
        ecbVar.b = bArr.length;
        ecbVar.b(10);
        return ecbVar;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new dcb(new byte[0]);
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        byte[] bArr = ((dcb) obj).a;
        md2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.O(this.b, i2).G(bArr[i2]);
        }
    }
}
