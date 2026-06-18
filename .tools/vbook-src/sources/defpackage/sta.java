package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sta implements xd4 {
    public static final sta a;
    private static final m39 descriptor;

    static {
        sta staVar = new sta();
        a = staVar;
        hx7 hx7Var = new hx7("com.google.firebase.sessions.Time", staVar, 3);
        hx7Var.k("ms", false);
        hx7Var.k("us", true);
        hx7Var.k("seconds", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.xd4
    public final oi5[] a() {
        return lc5.L;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        uta utaVar = (uta) obj;
        utaVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        long j = utaVar.a;
        long j2 = utaVar.c;
        long j3 = utaVar.b;
        md2VarV.S(m39Var, 0, j);
        if (md2VarV.r0(m39Var) || j3 != j * 1000) {
            md2VarV.S(m39Var, 1, j3);
        }
        if (md2VarV.r0(m39Var) || j2 != j / 1000) {
            md2VarV.S(m39Var, 2, j2);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jD = am1VarT.D(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jD2 = am1VarT.D(m39Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    sy3.c(iF);
                    return null;
                }
                jD3 = am1VarT.D(m39Var, 2);
                i |= 4;
            }
        }
        am1VarT.n(m39Var);
        return new uta(i, jD, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        e66 e66Var = e66.a;
        return new oi5[]{e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
