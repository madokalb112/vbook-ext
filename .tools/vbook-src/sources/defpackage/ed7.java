package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ed7 implements xd4 {
    public static final ed7 a;
    private static final m39 descriptor;

    static {
        ed7 ed7Var = new ed7();
        a = ed7Var;
        hx7 hx7Var = new hx7("com.reader.data.sync.impl.model.OldSyncDownload", ed7Var, 8);
        hx7Var.k("book_id", true);
        hx7Var.k("name", true);
        hx7Var.k("cover", true);
        hx7Var.k("download_status", true);
        hx7Var.k("downloaded", true);
        hx7Var.k("chapter_count", true);
        hx7Var.k("from_last_read", true);
        hx7Var.k("timestamp", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        gd7 gd7Var = (gd7) obj;
        gd7Var.getClass();
        long j = gd7Var.h;
        boolean z = gd7Var.g;
        int i = gd7Var.f;
        int i2 = gd7Var.e;
        int i3 = gd7Var.d;
        String str = gd7Var.c;
        String str2 = gd7Var.b;
        String str3 = gd7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 0, str3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 1, str2);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 2, str);
        }
        if (md2VarV.r0(m39Var) || i3 != 0) {
            md2VarV.Q(3, i3, m39Var);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(4, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(5, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 6, z);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 7, j);
        }
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
        boolean z = false;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        long jD = 0;
        boolean z2 = true;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z2 = false;
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
                    iR = am1VarT.r(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iR2 = am1VarT.r(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iR3 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    z = am1VarT.z(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jD = am1VarT.D(m39Var, 7);
                    i |= Token.CASE;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new gd7(i, strK, strK2, strK3, iR, iR2, iR3, z, jD);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        la5 la5Var = la5.a;
        return new oi5[]{tv9Var, tv9Var, tv9Var, la5Var, la5Var, la5Var, mm0.a, e66.a};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
