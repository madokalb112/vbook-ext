package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h5b implements b24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b24[] b;

    public /* synthetic */ h5b(b24[] b24VarArr, int i) {
        this.a = i;
        this.b = b24VarArr;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        b24[] b24VarArr = this.b;
        switch (i) {
            case 0:
                Object objM0 = h67.m0(jt1Var, c24Var, new r90(b24VarArr, 9), new g5b(3, 0, null), b24VarArr);
                return objM0 == xx1Var ? objM0 : hebVar;
            default:
                Object objM02 = h67.m0(jt1Var, c24Var, new zj(b24VarArr, 4), new g5b(3, 1, null), b24VarArr);
                return objM02 == xx1Var ? objM02 : hebVar;
        }
    }
}
