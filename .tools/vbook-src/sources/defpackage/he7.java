package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class he7 implements xd4 {
    public static final he7 a;
    private static final m39 descriptor;

    static {
        he7 he7Var = new he7();
        a = he7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncTrash", he7Var, 3);
        hx7Var.k("find", true);
        hx7Var.k("regex", true);
        hx7Var.k("enable", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        je7 je7Var = (je7) obj;
        je7Var.getClass();
        boolean z = je7Var.c;
        boolean z2 = je7Var.b;
        String str = je7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 0, str);
        }
        if (md2VarV.r0(m39Var) || z2) {
            md2VarV.F(m39Var, 1, z2);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 2, z);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String strK = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                z2 = am1VarT.z(m39Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    sy3.c(iF);
                    return null;
                }
                z3 = am1VarT.z(m39Var, 2);
                i |= 4;
            }
        }
        am1VarT.n(m39Var);
        return new je7(strK, i, z2, z3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        mm0 mm0Var = mm0.a;
        return new oi5[]{tv9.a, mm0Var, mm0Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
