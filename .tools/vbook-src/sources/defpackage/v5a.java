package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class v5a implements xd4 {
    public static final v5a a;
    private static final m39 descriptor;

    static {
        v5a v5aVar = new v5a();
        a = v5aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncTocLink", v5aVar, 7);
        hx7Var.k("id", false);
        hx7Var.k("title", false);
        hx7Var.k("path", false);
        hx7Var.k("parent_id", false);
        hx7Var.k("position", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        x5a x5aVar = (x5a) obj;
        x5aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        dp5[] dp5VarArr = x5a.h;
        md2VarV.Z(m39Var, 0, x5aVar.a);
        md2VarV.V(m39Var, 1, (oi5) dp5VarArr[1].getValue(), x5aVar.b);
        tv9 tv9Var = tv9.a;
        md2VarV.U(m39Var, 2, tv9Var, x5aVar.c);
        md2VarV.U(m39Var, 3, tv9Var, x5aVar.d);
        md2VarV.Q(4, x5aVar.e, m39Var);
        md2VarV.S(m39Var, 5, x5aVar.f);
        md2VarV.S(m39Var, 6, x5aVar.g);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        dp5[] dp5VarArr = x5a.h;
        int i = 0;
        int iR = 0;
        String strK = null;
        Map map = null;
        String str = null;
        String str2 = null;
        long jD = 0;
        long jD2 = 0;
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
                    map = (Map) am1VarT.q(m39Var, 1, (oi5) dp5VarArr[1].getValue(), map);
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
                    iR = am1VarT.r(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jD = am1VarT.D(m39Var, 5);
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
        return new x5a(i, strK, map, str, str2, iR, jD, jD2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xd4
    public final oi5[] d() {
        dp5[] dp5VarArr = x5a.h;
        tv9 tv9Var = tv9.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, dp5VarArr[1].getValue(), s32.J0(tv9Var), s32.J0(tv9Var), la5.a, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
