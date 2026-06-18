package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ra3 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v93 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ bc3 d;

    public /* synthetic */ ra3(v93 v93Var, kb4 kb4Var, bc3 bc3Var, int i) {
        this.a = i;
        this.b = v93Var;
        this.c = kb4Var;
        this.d = bc3Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        v93 v93Var = this.b;
        bc3 bc3Var = this.d;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                kb4Var.invoke(v93Var.c);
                za1 za1VarA = vtb.a(bc3Var);
                aj2 aj2Var = rw2.a;
                bc3Var.g(za1VarA, nh2.c, new et1(bc3Var, v93Var, null, 19));
                break;
            default:
                kb4Var.invoke(v93Var.c);
                za1 za1VarA2 = vtb.a(bc3Var);
                aj2 aj2Var2 = rw2.a;
                bc3Var.g(za1VarA2, nh2.c, new et1(bc3Var, v93Var, null, 19));
                break;
        }
        return hebVar;
    }
}
