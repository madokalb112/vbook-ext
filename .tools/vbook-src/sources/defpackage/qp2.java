package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qp2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir2 b;

    public /* synthetic */ qp2(ir2 ir2Var, int i) {
        this.a = i;
        this.b = ir2Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        ir2 ir2Var = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                za1 za1VarA = vtb.a(ir2Var);
                aj2 aj2Var = rw2.a;
                ir2Var.g(za1VarA, nh2.c, new et1(ir2Var, num, null, 11));
                return heb.a;
            default:
                ux5 ux5Var = (ux5) obj;
                ux5Var.getClass();
                ir2Var.k();
                return new lb0(ux5Var, ir2Var, 4);
        }
    }
}
