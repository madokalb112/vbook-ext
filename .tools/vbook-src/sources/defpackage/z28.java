package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z28 implements xd4 {
    public static final z28 a;
    private static final m39 descriptor;

    static {
        z28 z28Var = new z28();
        a = z28Var;
        hx7 hx7Var = new hx7("com.google.firebase.sessions.ProcessData", z28Var, 2);
        hx7Var.k("pid", false);
        hx7Var.k("uuid", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.xd4
    public final oi5[] a() {
        return lc5.L;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        b38 b38Var = (b38) obj;
        b38Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Q(0, b38Var.a, m39Var);
        md2VarV.Z(m39Var, 1, b38Var.b);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strK = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iR = am1VarT.r(m39Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    sy3.c(iF);
                    return null;
                }
                strK = am1VarT.k(m39Var, 1);
                i |= 2;
            }
        }
        am1VarT.n(m39Var);
        return new b38(i, iR, strK);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{la5.a, tv9.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
