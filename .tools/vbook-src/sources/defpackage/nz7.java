package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nz7 implements xd4 {
    public static final nz7 a;
    private static final m39 descriptor;

    static {
        nz7 nz7Var = new nz7();
        a = nz7Var;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.PostDto", nz7Var, 11);
        hx7Var.k("id", true);
        hx7Var.k("topic_id", true);
        hx7Var.k("user", true);
        hx7Var.k("content", true);
        hx7Var.k("quote", true);
        hx7Var.k("status", true);
        hx7Var.k("like_count", true);
        hx7Var.k("updated_at", true);
        hx7Var.k("created_at", true);
        hx7Var.k("liked", true);
        hx7Var.k("likes", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        int i;
        pz7 pz7Var = (pz7) obj;
        pz7Var.getClass();
        int i2 = pz7Var.k;
        boolean z = pz7Var.j;
        long j = pz7Var.i;
        long j2 = pz7Var.h;
        int i3 = pz7Var.g;
        int i4 = pz7Var.f;
        pz7 pz7Var2 = pz7Var.e;
        String str = pz7Var.d;
        hhb hhbVar = pz7Var.c;
        int i5 = pz7Var.b;
        long j3 = pz7Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (!md2VarV.r0(m39Var) && j3 == 0) {
            i = i2;
        } else {
            i = i2;
            md2VarV.S(m39Var, 0, j3);
        }
        if (md2VarV.r0(m39Var) || i5 != 0) {
            md2VarV.Q(1, i5, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(hhbVar, new hhb())) {
            md2VarV.V(m39Var, 2, fhb.a, hhbVar);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 3, str);
        }
        if (md2VarV.r0(m39Var) || pz7Var2 != null) {
            md2VarV.U(m39Var, 4, a, pz7Var2);
        }
        if (md2VarV.r0(m39Var) || i4 != 0) {
            md2VarV.Q(5, i4, m39Var);
        }
        if (md2VarV.r0(m39Var) || i3 != 0) {
            md2VarV.Q(6, i3, m39Var);
        }
        if (md2VarV.r0(m39Var) || j2 != 0) {
            md2VarV.S(m39Var, 7, j2);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 8, j);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 9, z);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(10, i, m39Var);
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
        int iR4 = 0;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        hhb hhbVar = null;
        String strK = null;
        pz7 pz7Var = null;
        boolean z2 = true;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    jD = am1VarT.D(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iR = am1VarT.r(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    hhbVar = (hhb) am1VarT.q(m39Var, 2, fhb.a, hhbVar);
                    i |= 4;
                    break;
                case 3:
                    strK = am1VarT.k(m39Var, 3);
                    i |= 8;
                    break;
                case 4:
                    pz7Var = (pz7) am1VarT.x(m39Var, 4, a, pz7Var);
                    i |= 16;
                    break;
                case 5:
                    iR2 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iR3 = am1VarT.r(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jD2 = am1VarT.D(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    jD3 = am1VarT.D(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    z = am1VarT.z(m39Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iR4 = am1VarT.r(m39Var, 10);
                    i |= 1024;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new pz7(i, jD, iR, hhbVar, strK, pz7Var, iR2, iR3, jD2, jD3, z, iR4);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        oi5 oi5VarJ0 = s32.J0(a);
        e66 e66Var = e66.a;
        la5 la5Var = la5.a;
        return new oi5[]{e66Var, la5Var, fhb.a, tv9.a, oi5VarJ0, la5Var, la5Var, e66Var, e66Var, mm0.a, la5Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
