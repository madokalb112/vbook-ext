package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zha implements xd4 {
    public static final zha a;
    private static final m39 descriptor;

    static {
        zha zhaVar = new zha();
        a = zhaVar;
        hx7 hx7Var = new hx7("com.reader.data.lookup.model.TextLookupDto", zhaVar, 3);
        hx7Var.k("id", true);
        hx7Var.k("name", false);
        hx7Var.k("url", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        bia biaVar = (bia) obj;
        biaVar.getClass();
        String str = biaVar.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 0, str);
        }
        md2VarV.Z(m39Var, 1, biaVar.b);
        md2VarV.Z(m39Var, 2, biaVar.c);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
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
                strK3 = am1VarT.k(m39Var, 2);
                i |= 4;
            }
        }
        am1VarT.n(m39Var);
        return new bia(strK, strK2, i, strK3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
