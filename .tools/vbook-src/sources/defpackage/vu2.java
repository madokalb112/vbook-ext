package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vu2 implements xd4 {
    public static final vu2 a;
    private static final m39 descriptor;

    static {
        vu2 vu2Var = new vu2();
        a = vu2Var;
        hx7 hx7Var = new hx7("com.reader.app.ui.screen.discovery.search.DiscoverySearchRoute", vu2Var, 2);
        hx7Var.k("extensionId", false);
        hx7Var.k("searchKey", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        xu2 xu2Var = (xu2) obj;
        xu2Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, xu2Var.a);
        md2VarV.Z(m39Var, 1, xu2Var.b);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        String strK = null;
        String strK2 = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    sy3.c(iF);
                    return null;
                }
                strK2 = am1VarT.k(m39Var, 1);
                i |= 2;
            }
        }
        am1VarT.n(m39Var);
        return new xu2(i, strK, strK2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
