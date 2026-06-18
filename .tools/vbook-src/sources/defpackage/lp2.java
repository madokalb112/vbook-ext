package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lp2 implements xd4 {
    public static final lp2 a;
    private static final m39 descriptor;

    static {
        lp2 lp2Var = new lp2();
        a = lp2Var;
        hx7 hx7Var = new hx7("com.reader.app.ui.screen.detail.DetailRoute", lp2Var, 2);
        hx7Var.k("path", false);
        hx7Var.k("extensionId", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        np2 np2Var = (np2) obj;
        np2Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        String str = np2Var.a;
        String str2 = np2Var.b;
        md2VarV.Z(m39Var, 0, str);
        if (md2VarV.r0(m39Var) || str2 != null) {
            md2VarV.U(m39Var, 1, tv9.a, str2);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        String strK = null;
        String str = null;
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
                str = (String) am1VarT.x(m39Var, 1, tv9.a, str);
                i |= 2;
            }
        }
        am1VarT.n(m39Var);
        return new np2(i, strK, str);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, s32.J0(tv9Var)};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
