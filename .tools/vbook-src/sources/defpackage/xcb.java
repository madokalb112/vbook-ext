package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xcb extends l28 {
    public static final xcb c = new xcb(ycb.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        return ((vcb) obj).a.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        wcb wcbVar = (wcb) obj;
        wcbVar.getClass();
        short sB = am1Var.a(this.b, i).B();
        wcbVar.b(wcbVar.d() + 1);
        short[] sArr = wcbVar.a;
        int i2 = wcbVar.b;
        wcbVar.b = i2 + 1;
        sArr[i2] = sB;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        short[] sArr = ((vcb) obj).a;
        wcb wcbVar = new wcb();
        wcbVar.a = sArr;
        wcbVar.b = sArr.length;
        wcbVar.b(10);
        return wcbVar;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new vcb(new short[0]);
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        short[] sArr = ((vcb) obj).a;
        md2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.O(this.b, i2).X(sArr[i2]);
        }
    }
}
