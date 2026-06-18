package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class b51 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x31 b;

    public /* synthetic */ b51(x31 x31Var, int i) {
        this.a = i;
        this.b = x31Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        x31 x31Var = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (!zBooleanValue) {
                    an2 an2Var = x31Var.c;
                    if (an2Var != null) {
                        an2Var.b();
                    }
                } else {
                    ah1.J(x31Var.b, null, null, new w31(x31Var, null, 1), 3);
                }
                break;
            default:
                if (!zBooleanValue) {
                    an2 an2Var2 = x31Var.c;
                    if (an2Var2 != null) {
                        an2Var2.b();
                    }
                } else {
                    ah1.J(x31Var.b, null, null, new w31(x31Var, null, 1), 3);
                }
                break;
        }
        return hebVar;
    }
}
