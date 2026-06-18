package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z56 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tda b;

    public /* synthetic */ z56(tda tdaVar, int i) {
        this.a = i;
        this.b = tdaVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        tda tdaVar = this.b;
        switch (i) {
            case 0:
                tdaVar.a(((eb7) obj).a, lr3.x);
                break;
            case 1:
                ux7 ux7Var = (ux7) obj;
                tdaVar.e(vv1.T(ux7Var, false));
                ux7Var.a();
                break;
            default:
                ux7 ux7Var2 = (ux7) obj;
                tdaVar.e(vv1.T(ux7Var2, false));
                ux7Var2.a();
                break;
        }
        return hebVar;
    }
}
