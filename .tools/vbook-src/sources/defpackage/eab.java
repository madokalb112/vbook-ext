package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class eab implements xd4 {
    public static final eab a;
    private static final m39 descriptor;

    static {
        eab eabVar = new eab();
        a = eabVar;
        hx7 hx7Var = new hx7("com.reader.data.rule.model.TxtRuleDto", eabVar, 5);
        hx7Var.k("id", true);
        hx7Var.k("enabled", true);
        hx7Var.k("name", false);
        hx7Var.k("rule", false);
        hx7Var.k("example", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        gab gabVar = (gab) obj;
        gabVar.getClass();
        boolean z = gabVar.b;
        String str = gabVar.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 0, str);
        }
        if (md2VarV.r0(m39Var) || !z) {
            md2VarV.F(m39Var, 1, z);
        }
        String str2 = gabVar.c;
        String str3 = gabVar.e;
        md2VarV.Z(m39Var, 2, str2);
        md2VarV.Z(m39Var, 3, gabVar.d);
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 4, str3);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
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
            } else if (iF == 2) {
                strK2 = am1VarT.k(m39Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strK3 = am1VarT.k(m39Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    sy3.c(iF);
                    return null;
                }
                strK4 = am1VarT.k(m39Var, 4);
                i |= 16;
            }
        }
        am1VarT.n(m39Var);
        return new gab(strK, strK2, z2, strK3, i, strK4);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, mm0.a, tv9Var, tv9Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
