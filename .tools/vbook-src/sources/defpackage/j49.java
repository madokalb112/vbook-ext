package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j49 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h49 b;

    public /* synthetic */ j49(h49 h49Var, int i) {
        this.a = i;
        this.b = h49Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        h49 h49Var = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                za1 za1VarA = vtb.a(h49Var);
                aj2 aj2Var = rw2.a;
                h49Var.g(za1VarA, nh2.c, new lk0(h49Var, zBooleanValue, null, 11));
                return heb.a;
            default:
                ux5 ux5Var = (ux5) obj;
                ux5Var.getClass();
                h49Var.getClass();
                h49Var.F = r95.a.k().c();
                return new lb0(ux5Var, h49Var, 16);
        }
    }
}
