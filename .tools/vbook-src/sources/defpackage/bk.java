package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bk implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk b;
    public final /* synthetic */ rca c;

    public /* synthetic */ bk(gk gkVar, rca rcaVar, int i) {
        this.a = i;
        this.b = gkVar;
        this.c = rcaVar;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        rca rcaVar = this.c;
        gk gkVar = this.b;
        switch (i) {
            case 0:
                ak akVar = gkVar.f;
                ub ubVar = new ub(rcaVar, 9);
                rg8 rg8Var = new rg8();
                gkVar.e.d("dataBuilder", akVar, new y6(6, rg8Var, ubVar));
                Object obj = rg8Var.a;
                if (obj != null) {
                    return (qca) obj;
                }
                lc5.i0("result");
                throw null;
            case 1:
                ak akVar2 = gkVar.g;
                bk bkVar = new bk(gkVar, rcaVar, 2);
                rg8 rg8Var2 = new rg8();
                gkVar.e.d("positioner", akVar2, new y6(6, rg8Var2, bkVar));
                Object obj2 = rg8Var2.a;
                if (obj2 != null) {
                    return (kf8) obj2;
                }
                lc5.i0("result");
                throw null;
            default:
                Object objInvoke = gkVar.c.invoke();
                ym5 ym5Var = (ym5) (((ym5) objInvoke).l() ? objInvoke : null);
                return ym5Var == null ? kf8.e : rcaVar.n(ym5Var).l(ym5Var.P(0L));
        }
    }
}
