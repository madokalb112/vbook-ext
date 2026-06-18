package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class e3a implements xd4 {
    public static final e3a a;
    private static final m39 descriptor;

    static {
        e3a e3aVar = new e3a();
        a = e3aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncEmojiCategory", e3aVar, 4);
        hx7Var.k("id", false);
        hx7Var.k("thumb", false);
        hx7Var.k("count", false);
        hx7Var.k("position", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        g3a g3aVar = (g3a) obj;
        g3aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, g3aVar.a);
        md2VarV.Z(m39Var, 1, g3aVar.b);
        md2VarV.S(m39Var, 2, g3aVar.c);
        md2VarV.S(m39Var, 3, g3aVar.d);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        String strK = null;
        String strK2 = null;
        long jD = 0;
        long jD2 = 0;
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
                jD = am1VarT.D(m39Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    sy3.c(iF);
                    return null;
                }
                jD2 = am1VarT.D(m39Var, 3);
                i |= 8;
            }
        }
        am1VarT.n(m39Var);
        return new g3a(i, jD, jD2, strK, strK2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, tv9Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
