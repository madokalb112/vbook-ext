package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p2a implements xd4 {
    public static final p2a a;
    private static final m39 descriptor;

    static {
        p2a p2aVar = new p2a();
        a = p2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncChapter", p2aVar, 11);
        hx7Var.k("id", false);
        hx7Var.k("path_id", false);
        hx7Var.k("position", false);
        hx7Var.k("path", false);
        hx7Var.k("count", false);
        hx7Var.k("downloaded", false);
        hx7Var.k("pay", false);
        hx7Var.k("lock", false);
        hx7Var.k("last_read", false);
        hx7Var.k("create_at", false);
        hx7Var.k("update_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        r2a r2aVar = (r2a) obj;
        r2aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, r2aVar.a);
        md2VarV.Z(m39Var, 1, r2aVar.b);
        md2VarV.Q(2, r2aVar.c, m39Var);
        md2VarV.Z(m39Var, 3, r2aVar.d);
        md2VarV.Q(4, r2aVar.e, m39Var);
        md2VarV.F(m39Var, 5, r2aVar.f);
        md2VarV.F(m39Var, 6, r2aVar.g);
        md2VarV.F(m39Var, 7, r2aVar.h);
        md2VarV.S(m39Var, 8, r2aVar.i);
        md2VarV.S(m39Var, 9, r2aVar.j);
        md2VarV.S(m39Var, 10, r2aVar.k);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z4 = true;
        while (z4) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z4 = false;
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
                    z = am1VarT.z(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = am1VarT.z(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = am1VarT.z(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    jD = am1VarT.D(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    jD2 = am1VarT.D(m39Var, 9);
                    i |= 512;
                    break;
                case 10:
                    jD3 = am1VarT.D(m39Var, 10);
                    i |= 1024;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new r2a(i, strK, strK2, iR, strK3, iR2, z, z2, z3, jD, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        mm0 mm0Var = mm0.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, tv9Var, la5Var, tv9Var, la5Var, mm0Var, mm0Var, mm0Var, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
