package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gv1 implements xd4 {
    public static final gv1 a;
    private static final m39 descriptor;

    static {
        gv1 gv1Var = new gv1();
        a = gv1Var;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.ConversationDto", gv1Var, 12);
        hx7Var.k("id", true);
        hx7Var.k("type", true);
        hx7Var.k("name", true);
        hx7Var.k("image", true);
        hx7Var.k("visibility", true);
        hx7Var.k("latest_message", true);
        hx7Var.k("unread_count", true);
        hx7Var.k("member_count", true);
        hx7Var.k("is_joined", true);
        hx7Var.k("created_by", true);
        hx7Var.k("updated_at", true);
        hx7Var.k("created_at", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        iv1 iv1Var = (iv1) obj;
        iv1Var.getClass();
        long j = iv1Var.l;
        long j2 = iv1Var.k;
        hhb hhbVar = iv1Var.j;
        boolean z = iv1Var.i;
        int i = iv1Var.h;
        int i2 = iv1Var.g;
        jf6 jf6Var = iv1Var.f;
        String str = iv1Var.e;
        String str2 = iv1Var.d;
        String str3 = iv1Var.c;
        String str4 = iv1Var.b;
        long j3 = iv1Var.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || j3 != 0) {
            md2VarV.S(m39Var, 0, j3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str4, "")) {
            md2VarV.Z(m39Var, 1, str4);
        }
        if (md2VarV.r0(m39Var) || str3 != null) {
            md2VarV.U(m39Var, 2, tv9.a, str3);
        }
        if (md2VarV.r0(m39Var) || str2 != null) {
            md2VarV.U(m39Var, 3, tv9.a, str2);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 4, str);
        }
        if (md2VarV.r0(m39Var) || jf6Var != null) {
            md2VarV.U(m39Var, 5, hf6.a, jf6Var);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(6, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(7, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 8, z);
        }
        if (md2VarV.r0(m39Var) || hhbVar != null) {
            md2VarV.U(m39Var, 9, fhb.a, hhbVar);
        }
        if (md2VarV.r0(m39Var) || j2 != 0) {
            md2VarV.S(m39Var, 10, j2);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 11, j);
        }
        md2VarV.a0(m39Var);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39Var = descriptor;
        am1 am1VarT = yd2Var.t(m39Var);
        Object obj = null;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean z = false;
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        hhb hhbVar = null;
        String strK = null;
        String str = null;
        String str2 = null;
        String strK2 = null;
        jf6 jf6Var = null;
        boolean z2 = true;
        while (z2) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    jD = am1VarT.D(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK = am1VarT.k(m39Var, 1);
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
                    strK2 = am1VarT.k(m39Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jf6Var = (jf6) am1VarT.x(m39Var, 5, hf6.a, jf6Var);
                    i |= 32;
                    break;
                case 6:
                    iR = am1VarT.r(m39Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iR2 = am1VarT.r(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    z = am1VarT.z(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    hhbVar = (hhb) am1VarT.x(m39Var, 9, fhb.a, hhbVar);
                    i |= 512;
                    break;
                case 10:
                    jD2 = am1VarT.D(m39Var, 10);
                    i |= 1024;
                    continue;
                case 11:
                    jD3 = am1VarT.D(m39Var, 11);
                    i |= 2048;
                    continue;
                default:
                    sy3.c(iF);
                    return obj;
            }
            obj = null;
        }
        am1VarT.n(m39Var);
        return new iv1(i, jD, strK, str, str2, strK2, jf6Var, iR, iR2, z, hhbVar, jD2, jD3);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        tv9 tv9Var = tv9.a;
        oi5 oi5VarJ0 = s32.J0(tv9Var);
        oi5 oi5VarJ02 = s32.J0(tv9Var);
        oi5 oi5VarJ03 = s32.J0(hf6.a);
        oi5 oi5VarJ04 = s32.J0(fhb.a);
        e66 e66Var = e66.a;
        la5 la5Var = la5.a;
        return new oi5[]{e66Var, tv9Var, oi5VarJ0, oi5VarJ02, tv9Var, oi5VarJ03, la5Var, la5Var, mm0.a, oi5VarJ04, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
