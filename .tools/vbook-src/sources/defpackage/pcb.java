package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pcb extends l28 {
    public static final pcb c = new pcb(qcb.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        return ((ncb) obj).a.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        ocb ocbVar = (ocb) obj;
        ocbVar.getClass();
        long jV = am1Var.a(this.b, i).v();
        ocbVar.b(ocbVar.d() + 1);
        long[] jArr = ocbVar.a;
        int i2 = ocbVar.b;
        ocbVar.b = i2 + 1;
        jArr[i2] = jV;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        long[] jArr = ((ncb) obj).a;
        ocb ocbVar = new ocb();
        ocbVar.a = jArr;
        ocbVar.b = jArr.length;
        ocbVar.b(10);
        return ocbVar;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new ncb(new long[0]);
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        long[] jArr = ((ncb) obj).a;
        md2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.O(this.b, i2).R(jArr[i2]);
        }
    }
}
