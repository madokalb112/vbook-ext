package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lr6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pn2 d;

    public /* synthetic */ lr6(hk9 hk9Var, int i, pn2 pn2Var, int i2) {
        this.a = i2;
        this.b = hk9Var;
        this.c = i;
        this.d = pn2Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        pn2 pn2Var = this.d;
        int i2 = this.c;
        hk9 hk9Var = this.b;
        switch (i) {
            case 0:
                hk9Var.set(i2, new x13(pn2Var.Y((int) (((na5) obj).a >> 32))));
                break;
            default:
                qha qhaVar = (qha) obj;
                qhaVar.getClass();
                hk9Var.set(i2, new x13(pn2Var.Y((int) (qhaVar.c >> 32))));
                break;
        }
        return hebVar;
    }
}
