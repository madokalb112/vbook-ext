package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class c59 implements xd4 {
    public static final c59 a;
    private static final m39 descriptor;

    static {
        c59 c59Var = new c59();
        a = c59Var;
        hx7 hx7Var = new hx7("com.google.firebase.sessions.SessionData", c59Var, 3);
        hx7Var.k("sessionDetails", false);
        hx7Var.k("backgroundTime", true);
        hx7Var.k("processDataMap", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.xd4
    public final oi5[] a() {
        return lc5.L;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        e59 e59Var = (e59) obj;
        e59Var.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        oi5[] oi5VarArr = e59.d;
        g59 g59Var = g59.a;
        i59 i59Var = e59Var.a;
        Map map = e59Var.c;
        uta utaVar = e59Var.b;
        md2VarV.V(m39Var, 0, g59Var, i59Var);
        if (md2VarV.r0(m39Var) || utaVar != null) {
            md2VarV.U(m39Var, 1, sta.a, utaVar);
        }
        if (md2VarV.r0(m39Var) || map != null) {
            md2VarV.U(m39Var, 2, oi5VarArr[2], map);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        oi5[] oi5VarArr = e59.d;
        boolean z = true;
        int i = 0;
        i59 i59Var = null;
        uta utaVar = null;
        Map map = null;
        while (z) {
            int iF = am1VarT.f(m39Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                i59Var = (i59) am1VarT.q(m39Var, 0, g59.a, i59Var);
                i |= 1;
            } else if (iF == 1) {
                utaVar = (uta) am1VarT.x(m39Var, 1, sta.a, utaVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    sy3.c(iF);
                    return null;
                }
                map = (Map) am1VarT.x(m39Var, 2, oi5VarArr[2], map);
                i |= 4;
            }
        }
        am1VarT.n(m39Var);
        return new e59(i, i59Var, utaVar, map);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        return new oi5[]{g59.a, s32.J0(sta.a), s32.J0(e59.d[2])};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
