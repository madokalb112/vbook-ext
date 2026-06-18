package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class a4a implements xd4 {
    public static final a4a a;
    private static final m39 descriptor;

    static {
        a4a a4aVar = new a4a();
        a = a4aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncInfo", a4aVar, 6);
        hx7Var.k("device_id", false);
        hx7Var.k("device_name", false);
        hx7Var.k("device_type", false);
        hx7Var.k("app_version", false);
        hx7Var.k("backup_version", false);
        hx7Var.k("create_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        c4a c4aVar = (c4a) obj;
        c4aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, c4aVar.a);
        md2VarV.Z(m39Var, 1, c4aVar.b);
        md2VarV.Q(2, c4aVar.c, m39Var);
        md2VarV.Z(m39Var, 3, c4aVar.d);
        md2VarV.Q(4, c4aVar.e, m39Var);
        md2VarV.S(m39Var, 5, c4aVar.f);
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
        String strK3 = null;
        long jD = 0;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strK = am1VarT.k(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK2 = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iR = am1VarT.r(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strK3 = am1VarT.k(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iR2 = am1VarT.r(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jD = am1VarT.D(m39Var, 5);
                    i |= 32;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new c4a(i, strK, strK2, iR, strK3, iR2, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        return new oi5[]{tv9Var, tv9Var, la5Var, tv9Var, la5Var, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
