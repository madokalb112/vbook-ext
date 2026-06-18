package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lv1 implements xd4 {
    public static final lv1 a;
    private static final m39 descriptor;

    static {
        lv1 lv1Var = new lv1();
        a = lv1Var;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.ConversationMemberDto", lv1Var, 2);
        hx7Var.k("user", true);
        hx7Var.k("role", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        nv1 nv1Var = (nv1) obj;
        nv1Var.getClass();
        String str = nv1Var.b;
        hhb hhbVar = nv1Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(hhbVar, new hhb())) {
            md2VarV.V(m39Var, 0, fhb.a, hhbVar);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 1, str);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        boolean z = true;
        int i = 0;
        hhb hhbVar = null;
        String strK = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hhbVar = (hhb) am1VarT.q(m39Var, 0, fhb.a, hhbVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    sy3.c(iF);
                    return null;
                }
                strK = am1VarT.k(m39Var, 1);
                i |= 2;
            }
        }
        am1VarT.n(m39Var);
        return new nv1(i, hhbVar, strK);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{fhb.a, tv9.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
