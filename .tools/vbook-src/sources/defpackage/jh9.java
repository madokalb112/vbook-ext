package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jh9 implements xd4 {
    public static final jh9 a;
    private static final m39 descriptor;

    static {
        jh9 jh9Var = new jh9();
        a = jh9Var;
        hx7 hx7Var = new hx7("com.reader.data.reader.text.core.tts.model.SkipWordRuleDto", jh9Var, 3);
        hx7Var.k("word", false);
        hx7Var.k("replace", true);
        hx7Var.k("ignoreCase", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        lh9 lh9Var = (lh9) obj;
        lh9Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        String str = lh9Var.a;
        boolean z = lh9Var.c;
        String str2 = lh9Var.b;
        md2VarV.Z(m39Var, 0, str);
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 1, str2);
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
        String strK = null;
        String strK2 = null;
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
            } else {
                if (iF != 2) {
                    sy3.c(iF);
                    return null;
                }
                z2 = am1VarT.z(m39Var, 2);
                i |= 4;
            }
        }
        am1VarT.n(m39Var);
        return new lh9(i, strK, strK2, z2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, tv9Var, mm0.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
