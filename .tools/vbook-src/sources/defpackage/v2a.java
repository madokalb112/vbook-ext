package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v2a implements xd4 {
    public static final v2a a;
    private static final m39 descriptor;

    static {
        v2a v2aVar = new v2a();
        a = v2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncDomain", v2aVar, 7);
        hx7Var.k("id", false);
        hx7Var.k("domain", false);
        hx7Var.k("replace", false);
        hx7Var.k("enabled", false);
        hx7Var.k("position", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        x2a x2aVar = (x2a) obj;
        x2aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, x2aVar.a);
        md2VarV.Z(m39Var, 1, x2aVar.b);
        md2VarV.Z(m39Var, 2, x2aVar.c);
        md2VarV.F(m39Var, 3, x2aVar.d);
        md2VarV.S(m39Var, 4, x2aVar.e);
        md2VarV.S(m39Var, 5, x2aVar.f);
        md2VarV.S(m39Var, 6, x2aVar.g);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        boolean z = false;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z2 = true;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    strK = am1VarT.k(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK2 = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK3 = am1VarT.k(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    z = am1VarT.z(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jD = am1VarT.D(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jD2 = am1VarT.D(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    jD3 = am1VarT.D(m39Var, 6);
                    i |= 64;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new x2a(i, strK, strK2, strK3, z, jD, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, mm0.a, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
