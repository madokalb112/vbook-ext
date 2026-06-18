package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w4a implements xd4 {
    public static final w4a a;
    private static final m39 descriptor;

    static {
        w4a w4aVar = new w4a();
        a = w4aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncReadHistory", w4aVar, 4);
        hx7Var.k("id", false);
        hx7Var.k("read_time", true);
        hx7Var.k("listen_time", true);
        hx7Var.k("create_at", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        y4a y4aVar = (y4a) obj;
        y4aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        String str = y4aVar.a;
        long j = y4aVar.d;
        long j2 = y4aVar.c;
        long j3 = y4aVar.b;
        md2VarV.Z(m39Var, 0, str);
        if (md2VarV.r0(m39Var) || j3 != 0) {
            md2VarV.S(m39Var, 1, j3);
        }
        if (md2VarV.r0(m39Var) || j2 != 0) {
            md2VarV.S(m39Var, 2, j2);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 3, j);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        String strK = null;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jD = am1VarT.D(m39Var, 1);
                i |= 2;
            } else if (iF == 2) {
                jD2 = am1VarT.D(m39Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    sy3.c(iF);
                    return null;
                }
                jD3 = am1VarT.D(m39Var, 3);
                i |= 8;
            }
        }
        am1VarT.n(m39Var);
        return new y4a(i, strK, jD, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        e66 e66Var = e66.a;
        return new oi5[]{tv9.a, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
