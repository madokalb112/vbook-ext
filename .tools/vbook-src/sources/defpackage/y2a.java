package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class y2a implements xd4 {
    public static final y2a a;
    private static final m39 descriptor;

    static {
        y2a y2aVar = new y2a();
        a = y2aVar;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.SyncDownload", y2aVar, 12);
        hx7Var.k("id", false);
        hx7Var.k("book_id", false);
        hx7Var.k("title", false);
        hx7Var.k("image", false);
        hx7Var.k("path", false);
        hx7Var.k("start", false);
        hx7Var.k("end", false);
        hx7Var.k("downloaded", false);
        hx7Var.k("total", false);
        hx7Var.k("type", false);
        hx7Var.k("status", false);
        hx7Var.k("create_at", false);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        a3a a3aVar = (a3a) obj;
        a3aVar.getClass();
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        md2VarV.Z(m39Var, 0, a3aVar.a);
        md2VarV.Z(m39Var, 1, a3aVar.b);
        md2VarV.Z(m39Var, 2, a3aVar.c);
        md2VarV.Z(m39Var, 3, a3aVar.d);
        md2VarV.Z(m39Var, 4, a3aVar.e);
        md2VarV.Q(5, a3aVar.f, m39Var);
        md2VarV.Q(6, a3aVar.g, m39Var);
        md2VarV.Q(7, a3aVar.h, m39Var);
        md2VarV.Q(8, a3aVar.i, m39Var);
        md2VarV.Q(9, a3aVar.j, m39Var);
        md2VarV.Q(10, a3aVar.k, m39Var);
        md2VarV.S(m39Var, 11, a3aVar.l);
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        int iR6 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
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
                    strK3 = am1VarT.k(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strK4 = am1VarT.k(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strK5 = am1VarT.k(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iR = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iR2 = am1VarT.r(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iR3 = am1VarT.r(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    iR4 = am1VarT.r(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iR5 = am1VarT.r(m39Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iR6 = am1VarT.r(m39Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    jD = am1VarT.D(m39Var, 11);
                    i |= 2048;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new a3a(i, strK, strK2, strK3, strK4, strK5, iR, iR2, iR3, iR4, iR5, iR6, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, tv9Var, tv9Var, la5Var, la5Var, la5Var, la5Var, la5Var, la5Var, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
