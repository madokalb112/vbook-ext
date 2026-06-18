package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f37 implements oi5 {
    public final p39 a = fx1.x("androidx.navigation.runtime.NavKey", new m39[0], new ss6(9));

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        e37 e37Var = (e37) obj;
        p39 p39Var = this.a;
        md2 md2VarV = md2Var.v(p39Var);
        md2VarV.Z(p39Var, 0, e37Var.getClass().getName());
        a91 a91VarA = ug8.a(e37Var.getClass());
        oi5 oi5VarR = yn2.R(a91VarA);
        if (oi5VarR == null) {
            kc5.L(a91VarA);
            throw null;
        }
        md2VarV.V(p39Var, 1, oi5VarR, e37Var);
        md2VarV.a0(p39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        p39 p39Var = this.a;
        am1 am1VarT = yd2Var.t(p39Var);
        a91 a91VarA = ug8.a(Class.forName(am1VarT.k(p39Var, am1VarT.f(p39Var))));
        oi5 oi5VarR = yn2.R(a91VarA);
        if (oi5VarR == null) {
            kc5.L(a91VarA);
            throw null;
        }
        Object objQ = am1VarT.q(p39Var, am1VarT.f(p39Var), oi5VarR, null);
        objQ.getClass();
        e37 e37Var = (e37) objQ;
        am1VarT.n(p39Var);
        return e37Var;
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return this.a;
    }
}
