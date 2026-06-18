package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kcb extends l28 {
    public static final kcb c = new kcb(lcb.a);

    @Override // defpackage.h0
    public final int i(Object obj) {
        return ((icb) obj).a.length;
    }

    @Override // defpackage.dc1, defpackage.h0
    public final void k(am1 am1Var, int i, Object obj) {
        jcb jcbVar = (jcb) obj;
        jcbVar.getClass();
        int iL = am1Var.a(this.b, i).l();
        jcbVar.b(jcbVar.d() + 1);
        int[] iArr = jcbVar.a;
        int i2 = jcbVar.b;
        jcbVar.b = i2 + 1;
        iArr[i2] = iL;
    }

    @Override // defpackage.h0
    public final Object l(Object obj) {
        int[] iArr = ((icb) obj).a;
        jcb jcbVar = new jcb();
        jcbVar.a = iArr;
        jcbVar.b = iArr.length;
        jcbVar.b(10);
        return jcbVar;
    }

    @Override // defpackage.l28
    public final Object o() {
        return new icb(new int[0]);
    }

    @Override // defpackage.l28
    public final void p(md2 md2Var, Object obj, int i) {
        int[] iArr = ((icb) obj).a;
        md2Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            md2Var.O(this.b, i2).P(iArr[i2]);
        }
    }
}
