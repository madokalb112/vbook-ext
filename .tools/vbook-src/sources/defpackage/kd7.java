package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kd7 implements xd4 {
    public static final kd7 a;
    private static final m39 descriptor;

    static {
        kd7 kd7Var = new kd7();
        a = kd7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncExtensionSource", kd7Var, 4);
        hx7Var.k("id", true);
        hx7Var.k("repository", true);
        hx7Var.k("description", true);
        hx7Var.k("author", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        md7 md7Var = (md7) obj;
        md7Var.getClass();
        String str = md7Var.d;
        String str2 = md7Var.c;
        String str3 = md7Var.b;
        long j = md7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 0, j);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 1, str3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 2, str2);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 3, str);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        long jD = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jD = am1VarT.D(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strK = am1VarT.k(m39Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strK2 = am1VarT.k(m39Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    sy3.c(iF);
                    return null;
                }
                strK3 = am1VarT.k(m39Var, 3);
                i |= 8;
            }
        }
        am1VarT.n(m39Var);
        return new md7(i, jD, strK, strK2, strK3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{e66.a, tv9Var, tv9Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
