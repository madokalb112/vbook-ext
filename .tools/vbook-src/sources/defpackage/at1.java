package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class at1 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ at1(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        xz6 xz6VarI;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ib4 ib4Var = (ib4) obj;
                if (z) {
                    ib4Var.invoke();
                }
                break;
            case 1:
                ib4 ib4Var2 = (ib4) obj;
                if (!z) {
                    ib4Var2.invoke();
                }
                break;
            default:
                wg wgVar = (wg) obj;
                if (z && (xz6VarI = wgVar.i()) != null) {
                    ((ea9) xz6VarI).f(hebVar);
                }
                break;
        }
        return hebVar;
    }
}
