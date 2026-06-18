package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vd7 implements xd4 {
    public static final vd7 a;
    private static final m39 descriptor;

    static {
        vd7 vd7Var = new vd7();
        a = vd7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncNote", vd7Var, 7);
        hx7Var.k("id", true);
        hx7Var.k("book_id", true);
        hx7Var.k("content", true);
        hx7Var.k("title", true);
        hx7Var.k("chap_index", true);
        hx7Var.k("position", true);
        hx7Var.k("timestamp", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        xd7 xd7Var = (xd7) obj;
        xd7Var.getClass();
        long j = xd7Var.g;
        float f = xd7Var.f;
        int i = xd7Var.e;
        String str = xd7Var.d;
        String str2 = xd7Var.c;
        String str3 = xd7Var.b;
        long j2 = xd7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || j2 != 0) {
            md2VarV.S(m39Var, 0, j2);
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
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(4, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || Float.compare(f, 0.0f) != 0) {
            md2VarV.M(m39Var, 5, f);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 6, j);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        long jD = 0;
        long jD2 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        float fE = 0.0f;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jD = am1VarT.D(m39Var, 0);
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
                    strK3 = am1VarT.k(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iR = am1VarT.r(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    fE = am1VarT.e(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    jD2 = am1VarT.D(m39Var, 6);
                    i |= 64;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new xd7(i, jD, strK, strK2, strK3, iR, fE, jD2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        e66 e66Var = e66.a;
        tv9 tv9Var = tv9.a;
        return new oi5[]{e66Var, tv9Var, tv9Var, tv9Var, la5.a, g14.a, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
