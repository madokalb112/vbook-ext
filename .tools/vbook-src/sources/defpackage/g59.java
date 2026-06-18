package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g59 implements xd4 {
    public static final g59 a;
    private static final m39 descriptor;

    static {
        g59 g59Var = new g59();
        a = g59Var;
        hx7 hx7Var = new hx7("com.google.firebase.sessions.SessionDetails", g59Var, 4);
        hx7Var.k("sessionId", false);
        hx7Var.k("firstSessionId", false);
        hx7Var.k("sessionIndex", false);
        hx7Var.k("sessionStartTimestampUs", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.xd4
    public final oi5[] a() {
        return lc5.L;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        i59 i59Var = (i59) obj;
        i59Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, i59Var.a);
        md2VarV.Z(m39Var, 1, i59Var.b);
        md2VarV.Q(2, i59Var.c, m39Var);
        md2VarV.S(m39Var, 3, i59Var.d);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        String strK = null;
        String strK2 = null;
        long jD = 0;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strK2 = am1VarT.k(m39Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iR = am1VarT.r(m39Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    sy3.c(iF);
                    return null;
                }
                jD = am1VarT.D(m39Var, 3);
                i |= 8;
            }
        }
        am1VarT.n(m39Var);
        return new i59(i, strK, strK2, iR, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, tv9Var, la5.a, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
