package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mp3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp3 b;

    public /* synthetic */ mp3(pp3 pp3Var, int i) {
        this.a = i;
        this.b = pp3Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        pp3 pp3Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                za1 za1VarA = vtb.a(pp3Var);
                aj2 aj2Var = rw2.a;
                pp3Var.g(za1VarA, nh2.c, new hl2(pp3Var, str, null, 15));
                break;
            default:
                str.getClass();
                za1 za1VarA2 = vtb.a(pp3Var);
                aj2 aj2Var2 = rw2.a;
                pp3Var.g(za1VarA2, nh2.c, new et1(pp3Var, str, null, 26));
                break;
        }
        return hebVar;
    }
}
