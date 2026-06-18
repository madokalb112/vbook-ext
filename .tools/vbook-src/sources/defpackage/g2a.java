package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g2a implements xd4 {
    public static final g2a a;
    private static final m39 descriptor;

    static {
        g2a g2aVar = new g2a();
        a = g2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncBookmark", g2aVar, 10);
        hx7Var.k("id", false);
        hx7Var.k("chapter_index", false);
        hx7Var.k("chapter_name", false);
        hx7Var.k("type", false);
        hx7Var.k("content", false);
        hx7Var.k("description", false);
        hx7Var.k("color", false);
        hx7Var.k("start_position", false);
        hx7Var.k("end_position", false);
        hx7Var.k("create_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        i2a i2aVar = (i2a) obj;
        i2aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, i2aVar.a);
        md2VarV.Q(1, i2aVar.b, m39Var);
        md2VarV.Z(m39Var, 2, i2aVar.c);
        md2VarV.Q(3, i2aVar.d, m39Var);
        md2VarV.Z(m39Var, 4, i2aVar.e);
        md2VarV.Z(m39Var, 5, i2aVar.f);
        md2VarV.Z(m39Var, 6, i2aVar.g);
        md2VarV.S(m39Var, 7, i2aVar.h);
        md2VarV.S(m39Var, 8, i2aVar.i);
        md2VarV.S(m39Var, 9, i2aVar.j);
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
        String strK4 = null;
        String strK5 = null;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
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
                    iR = am1VarT.r(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK2 = am1VarT.k(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = am1VarT.r(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strK3 = am1VarT.k(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strK4 = am1VarT.k(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strK5 = am1VarT.k(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jD = am1VarT.D(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    jD2 = am1VarT.D(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    jD3 = am1VarT.D(m39Var, 9);
                    i |= 512;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new i2a(i, strK, iR, strK2, iR2, strK3, strK4, strK5, jD, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        e66 e66Var = e66.a;
        return new oi5[]{tv9Var, la5Var, tv9Var, la5Var, tv9Var, tv9Var, tv9Var, e66Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
