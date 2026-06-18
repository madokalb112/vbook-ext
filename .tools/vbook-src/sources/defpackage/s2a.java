package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class s2a implements xd4 {
    public static final s2a a;
    private static final m39 descriptor;

    static {
        s2a s2aVar = new s2a();
        a = s2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncContent", s2aVar, 5);
        hx7Var.k("id", false);
        hx7Var.k("position", false);
        hx7Var.k("content", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        u2a u2aVar = (u2a) obj;
        u2aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = u2a.f;
        md2VarV.Z(m39Var, 0, u2aVar.a);
        md2VarV.Q(1, u2aVar.b, m39Var);
        md2VarV.V(m39Var, 2, (oi5) dp5VarArr[2].getValue(), u2aVar.c);
        md2VarV.S(m39Var, 3, u2aVar.d);
        md2VarV.S(m39Var, 4, u2aVar.e);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr = u2a.f;
        int i = 0;
        int iR = 0;
        String strK = null;
        Map map = null;
        long jD = 0;
        long jD2 = 0;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strK = am1VarT.k(m39Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iR = am1VarT.r(m39Var, 1);
                i |= 2;
            } else if (iF == 2) {
                map = (Map) am1VarT.q(m39Var, 2, (oi5) dp5VarArr[2].getValue(), map);
                i |= 4;
            } else if (iF == 3) {
                jD = am1VarT.D(m39Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    sy3.c(iF);
                    return null;
                }
                jD2 = am1VarT.D(m39Var, 4);
                i |= 16;
            }
        }
        am1VarT.n(m39Var);
        return new u2a(i, strK, iR, map, jD, jD2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = u2a.f;
        e66 e66Var = e66.a;
        return new oi5[]{tv9.a, la5.a, dp5VarArr[2].getValue(), e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
