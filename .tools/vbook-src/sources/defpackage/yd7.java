package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yd7 implements xd4 {
    public static final yd7 a;
    private static final m39 descriptor;

    static {
        yd7 yd7Var = new yd7();
        a = yd7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncPage", yd7Var, 2);
        hx7Var.k("id", true);
        hx7Var.k("url", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        ae7 ae7Var = (ae7) obj;
        ae7Var.getClass();
        String str = ae7Var.b;
        int i = ae7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(0, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 1, str);
        }
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
        return new ae7(i, iR, strK);
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
