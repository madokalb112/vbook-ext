package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o91 implements zb4 {
    public final /* synthetic */ n65 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uo8 c;
    public final /* synthetic */ ib4 d;

    public o91(n65 n65Var, boolean z, uo8 uo8Var, ib4 ib4Var) {
        this.a = n65Var;
        this.b = z;
        this.c = uo8Var;
        this.d = ib4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        dd4 dd4Var = (dd4) obj2;
        ((Number) obj3).intValue();
        dd4Var.f0(-1525724089);
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = ky0.i(dd4Var);
        }
        yy6 yy6Var = (yy6) objQ;
        ou6 ou6VarE = k65.a(lu6.a, yy6Var, this.a).e(new n91(yy6Var, (n65) null, false, this.b, (String) null, this.c, this.d));
        dd4Var.q(false);
        return ou6VarE;
    }
}
