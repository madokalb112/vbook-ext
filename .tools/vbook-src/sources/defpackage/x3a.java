package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x3a implements xd4 {
    public static final x3a a;
    private static final m39 descriptor;

    static {
        x3a x3aVar = new x3a();
        a = x3aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncExtensionSource", x3aVar, 5);
        hx7Var.k("id", false);
        hx7Var.k("path", false);
        hx7Var.k("author", false);
        hx7Var.k("description", false);
        hx7Var.k("create_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        z3a z3aVar = (z3a) obj;
        z3aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, z3aVar.a);
        md2VarV.Z(m39Var, 1, z3aVar.b);
        md2VarV.Z(m39Var, 2, z3aVar.c);
        md2VarV.Z(m39Var, 3, z3aVar.d);
        md2VarV.S(m39Var, 4, z3aVar.e);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
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
                strK3 = am1VarT.k(m39Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strK4 = am1VarT.k(m39Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    sy3.c(iF);
                    return null;
                }
                jD = am1VarT.D(m39Var, 4);
                i |= 16;
            }
        }
        am1VarT.n(m39Var);
        return new z3a(i, strK, strK2, strK3, strK4, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, tv9Var, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
