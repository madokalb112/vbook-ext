package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n4a implements xd4 {
    public static final n4a a;
    private static final m39 descriptor;

    static {
        n4a n4aVar = new n4a();
        a = n4aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncQtDictionary", n4aVar, 6);
        hx7Var.k("id", false);
        hx7Var.k("name", false);
        hx7Var.k("name_dictionary", false);
        hx7Var.k("vp_dictionary", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        p4a p4aVar = (p4a) obj;
        p4aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, p4aVar.a);
        md2VarV.Z(m39Var, 1, p4aVar.b);
        tv9 tv9Var = tv9.a;
        md2VarV.U(m39Var, 2, tv9Var, p4aVar.c);
        md2VarV.U(m39Var, 3, tv9Var, p4aVar.d);
        md2VarV.S(m39Var, 4, p4aVar.e);
        md2VarV.S(m39Var, 5, p4aVar.f);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        Object obj = null;
        int i = 0;
        String strK = null;
        String strK2 = null;
        String str = null;
        long jD = 0;
        long jD2 = 0;
        boolean z = true;
        String str2 = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strK = am1VarT.k(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK2 = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) am1VarT.x(m39Var, 2, tv9.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) am1VarT.x(m39Var, 3, tv9.a, str2);
                    i |= 8;
                    break;
                case 4:
                    jD = am1VarT.D(m39Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    jD2 = am1VarT.D(m39Var, 5);
                    i |= 32;
                    continue;
                default:
                    sy3.c(iF);
                    return obj;
            }
            obj = null;
        }
        am1VarT.n(m39Var);
        return new p4a(i, jD, jD2, strK, strK2, str, str2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        oi5 oi5VarJ0 = s32.J0(tv9Var);
        oi5 oi5VarJ02 = s32.J0(tv9Var);
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, tv9Var, oi5VarJ0, oi5VarJ02, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
