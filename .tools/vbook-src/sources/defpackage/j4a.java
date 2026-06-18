package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j4a implements xd4 {
    public static final j4a a;
    private static final m39 descriptor;

    static {
        j4a j4aVar = new j4a();
        a = j4aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncNotification", j4aVar, 5);
        hx7Var.k("id", false);
        hx7Var.k("type", false);
        hx7Var.k("content", false);
        hx7Var.k("read", true);
        hx7Var.k("create_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        l4a l4aVar = (l4a) obj;
        l4aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        String str = l4aVar.a;
        boolean z = l4aVar.d;
        md2VarV.Z(m39Var, 0, str);
        md2VarV.Q(1, l4aVar.b, m39Var);
        md2VarV.Z(m39Var, 2, l4aVar.c);
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 3, z);
        }
        md2VarV.S(m39Var, 4, l4aVar.e);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        boolean z = false;
        String strK = null;
        String strK2 = null;
        long jD = 0;
        boolean z2 = true;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z2 = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iR = am1VarT.r(m39Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strK2 = am1VarT.k(m39Var, 2);
                i |= 4;
            } else if (iF == 3) {
                z = am1VarT.z(m39Var, 3);
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
        return new l4a(i, strK, iR, strK2, z, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, la5.a, tv9Var, mm0.a, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
