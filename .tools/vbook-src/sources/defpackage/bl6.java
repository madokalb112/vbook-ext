package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bl6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo4 b;

    public /* synthetic */ bl6(mo4 mo4Var, int i) {
        this.a = i;
        this.b = mo4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        mo4 mo4Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                za1 za1VarA = vtb.a(mo4Var);
                aj2 aj2Var = rw2.a;
                mo4Var.g(za1VarA, nh2.c, new lo4(mo4Var, str, null, 0));
                break;
            default:
                str.getClass();
                za1 za1VarA2 = vtb.a(mo4Var);
                aj2 aj2Var2 = rw2.a;
                mo4Var.g(za1VarA2, nh2.c, new lo4(mo4Var, str, null, 0));
                break;
        }
        return hebVar;
    }
}
