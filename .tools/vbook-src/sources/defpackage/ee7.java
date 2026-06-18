package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ee7 implements xd4 {
    public static final ee7 a;
    private static final m39 descriptor;

    static {
        ee7 ee7Var = new ee7();
        a = ee7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncQtVietPhrase", ee7Var, 5);
        hx7Var.k("src", true);
        hx7Var.k("dest", true);
        hx7Var.k("type", true);
        hx7Var.k("word_type", true);
        hx7Var.k("timestamp", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        ge7 ge7Var = (ge7) obj;
        ge7Var.getClass();
        long j = ge7Var.e;
        int i = ge7Var.d;
        int i2 = ge7Var.c;
        String str = ge7Var.b;
        String str2 = ge7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 0, str2);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 1, str);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(2, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(3, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 4, j);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String strK = null;
        String strK2 = null;
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
                iR = am1VarT.r(m39Var, 2);
                i |= 4;
            } else if (iF == 3) {
                iR2 = am1VarT.r(m39Var, 3);
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
        return new ge7(i, iR, iR2, jD, strK, strK2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        return new oi5[]{tv9Var, tv9Var, la5Var, la5Var, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
