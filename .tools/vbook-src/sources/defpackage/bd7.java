package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bd7 implements xd4 {
    public static final bd7 a;
    private static final m39 descriptor;

    static {
        bd7 bd7Var = new bd7();
        a = bd7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncChapter", bd7Var, 6);
        hx7Var.k("id", true);
        hx7Var.k("url", true);
        hx7Var.k("name", true);
        hx7Var.k("read", true);
        hx7Var.k("downloaded", true);
        hx7Var.k("name_trans", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        dd7 dd7Var = (dd7) obj;
        dd7Var.getClass();
        String str = dd7Var.f;
        boolean z = dd7Var.e;
        boolean z2 = dd7Var.d;
        String str2 = dd7Var.c;
        String str3 = dd7Var.b;
        int i = dd7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(0, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 1, str3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 2, str2);
        }
        if (md2VarV.r0(m39Var) || z2) {
            md2VarV.F(m39Var, 3, z2);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 4, z);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 5, str);
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
        boolean z2 = false;
        boolean z3 = false;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = am1VarT.r(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK2 = am1VarT.k(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = am1VarT.z(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = am1VarT.z(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strK3 = am1VarT.k(m39Var, 5);
                    i |= 32;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new dd7(i, iR, strK, strK2, z2, z3, strK3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        mm0 mm0Var = mm0.a;
        return new oi5[]{la5.a, tv9Var, tv9Var, mm0Var, mm0Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
