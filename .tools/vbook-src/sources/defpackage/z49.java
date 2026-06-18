package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z49 implements xd4 {
    public static final z49 a;
    private static final m39 descriptor;

    static {
        z49 z49Var = new z49();
        a = z49Var;
        hx7 hx7Var = new hx7("com.google.firebase.sessions.settings.SessionConfigs", z49Var, 5);
        hx7Var.k("sessionsEnabled", false);
        hx7Var.k("sessionSamplingRate", false);
        hx7Var.k("sessionTimeoutSeconds", false);
        hx7Var.k("cacheDurationSeconds", false);
        hx7Var.k("cacheUpdatedTimeSeconds", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.xd4
    public final oi5[] a() {
        return lc5.L;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        b59 b59Var = (b59) obj;
        b59Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.U(m39Var, 0, mm0.a, b59Var.a);
        md2VarV.U(m39Var, 1, o03.a, b59Var.b);
        la5 la5Var = la5.a;
        md2VarV.U(m39Var, 2, la5Var, b59Var.c);
        md2VarV.U(m39Var, 3, la5Var, b59Var.d);
        md2VarV.U(m39Var, 4, e66.a, b59Var.e);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) am1VarT.x(m39Var, 0, mm0.a, bool);
                i |= 1;
            } else if (iF == 1) {
                d = (Double) am1VarT.x(m39Var, 1, o03.a, d);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) am1VarT.x(m39Var, 2, la5.a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) am1VarT.x(m39Var, 3, la5.a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    sy3.c(iF);
                    return null;
                }
                l = (Long) am1VarT.x(m39Var, 4, e66.a, l);
                i |= 16;
            }
        }
        am1VarT.n(m39Var);
        return new b59(i, bool, d, num, num2, l);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        oi5 oi5VarJ0 = s32.J0(mm0.a);
        oi5 oi5VarJ02 = s32.J0(o03.a);
        la5 la5Var = la5.a;
        return new oi5[]{oi5VarJ0, oi5VarJ02, s32.J0(la5Var), s32.J0(la5Var), s32.J0(e66.a)};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
