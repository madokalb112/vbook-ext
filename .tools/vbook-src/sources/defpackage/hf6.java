package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hf6 implements xd4 {
    public static final hf6 a;
    private static final m39 descriptor;

    static {
        hf6 hf6Var = new hf6();
        a = hf6Var;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.MessageDto", hf6Var, 8);
        hx7Var.k("id", true);
        hx7Var.k("content", true);
        hx7Var.k("type", true);
        hx7Var.k("user", true);
        hx7Var.k("quote", true);
        hx7Var.k("status", true);
        hx7Var.k("updated_at", true);
        hx7Var.k("created_at", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        jf6 jf6Var = (jf6) obj;
        jf6Var.getClass();
        long j = jf6Var.h;
        long j2 = jf6Var.g;
        int i = jf6Var.f;
        jf6 jf6Var2 = jf6Var.e;
        hhb hhbVar = jf6Var.d;
        int i2 = jf6Var.c;
        String str = jf6Var.b;
        long j3 = jf6Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || j3 != 0) {
            md2VarV.S(m39Var, 0, j3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 1, str);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(2, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(hhbVar, new hhb())) {
            md2VarV.V(m39Var, 3, fhb.a, hhbVar);
        }
        if (md2VarV.r0(m39Var) || jf6Var2 != null) {
            md2VarV.U(m39Var, 4, a, jf6Var2);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(5, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || j2 != 0) {
            md2VarV.S(m39Var, 6, j2);
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
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        String strK = null;
        hhb hhbVar = null;
        jf6 jf6Var = null;
        boolean z = true;
        while (z) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jD = am1VarT.D(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iR = am1VarT.r(m39Var, 2);
                    i |= 4;
                    break;
                case 3:
                    hhbVar = (hhb) am1VarT.q(m39Var, 3, fhb.a, hhbVar);
                    i |= 8;
                    break;
                case 4:
                    jf6Var = (jf6) am1VarT.x(m39Var, 4, a, jf6Var);
                    i |= 16;
                    break;
                case 5:
                    iR2 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    jD2 = am1VarT.D(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jD3 = am1VarT.D(m39Var, 7);
                    i |= Token.CASE;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new jf6(i, jD, strK, iR, hhbVar, jf6Var, iR2, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        oi5 oi5VarJ0 = s32.J0(a);
        e66 e66Var = e66.a;
        la5 la5Var = la5.a;
        return new oi5[]{e66Var, tv9.a, la5Var, fhb.a, oi5VarJ0, la5Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
