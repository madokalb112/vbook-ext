package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class d1b implements xd4 {
    public static final d1b a;
    private static final m39 descriptor;

    static {
        d1b d1bVar = new d1b();
        a = d1bVar;
        hx7 hx7Var = new hx7("com.reader.data.community.api.dto.TopicDto", d1bVar, 15);
        hx7Var.k("id", true);
        hx7Var.k("title", true);
        hx7Var.k("content", true);
        hx7Var.k("background", true);
        hx7Var.k("category", true);
        hx7Var.k("type", true);
        hx7Var.k("user", true);
        hx7Var.k("status", true);
        hx7Var.k("tag", true);
        hx7Var.k("likes", true);
        hx7Var.k("liked", true);
        hx7Var.k("pined", true);
        hx7Var.k("comments", true);
        hx7Var.k("updated_at", true);
        hx7Var.k("created_at", true);
        descriptor = hx7Var;
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        f1b f1bVar = (f1b) obj;
        f1bVar.getClass();
        long j = f1bVar.o;
        long j2 = f1bVar.n;
        int i = f1bVar.m;
        boolean z = f1bVar.l;
        boolean z2 = f1bVar.k;
        int i2 = f1bVar.j;
        String str = f1bVar.i;
        int i3 = f1bVar.h;
        hhb hhbVar = f1bVar.g;
        int i4 = f1bVar.f;
        int i5 = f1bVar.e;
        String str2 = f1bVar.d;
        String str3 = f1bVar.c;
        String str4 = f1bVar.b;
        int i6 = f1bVar.a;
        m39 m39Var = descriptor;
        md2 md2VarV = md2Var.v(m39Var);
        if (md2VarV.r0(m39Var) || i6 != 0) {
            md2VarV.Q(0, i6, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str4, "")) {
            md2VarV.Z(m39Var, 1, str4);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str3, "")) {
            md2VarV.Z(m39Var, 2, str3);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str2, "")) {
            md2VarV.Z(m39Var, 3, str2);
        }
        if (md2VarV.r0(m39Var) || i5 != 0) {
            md2VarV.Q(4, i5, m39Var);
        }
        if (md2VarV.r0(m39Var) || i4 != 0) {
            md2VarV.Q(5, i4, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(hhbVar, new hhb())) {
            md2VarV.V(m39Var, 6, fhb.a, hhbVar);
        }
        if (md2VarV.r0(m39Var) || i3 != 0) {
            md2VarV.Q(7, i3, m39Var);
        }
        if (md2VarV.r0(m39Var) || !lc5.Q(str, "")) {
            md2VarV.Z(m39Var, 8, str);
        }
        if (md2VarV.r0(m39Var) || i2 != 0) {
            md2VarV.Q(9, i2, m39Var);
        }
        if (md2VarV.r0(m39Var) || z2) {
            md2VarV.F(m39Var, 10, z2);
        }
        if (md2VarV.r0(m39Var) || z) {
            md2VarV.F(m39Var, 11, z);
        }
        if (md2VarV.r0(m39Var) || i != 0) {
            md2VarV.Q(12, i, m39Var);
        }
        if (md2VarV.r0(m39Var) || j2 != -1) {
            md2VarV.S(m39Var, 13, j2);
        }
        if (md2VarV.r0(m39Var) || j != 0) {
            md2VarV.S(m39Var, 14, j);
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
        int iR4 = 0;
        int iR5 = 0;
        boolean z = false;
        boolean z2 = false;
        int iR6 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        hhb hhbVar = null;
        String strK4 = null;
        long jD = 0;
        long jD2 = 0;
        boolean z3 = true;
        while (z3) {
            int iF = am1VarT.f(m39Var);
            switch (iF) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    iR = am1VarT.r(m39Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK = am1VarT.k(m39Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK2 = am1VarT.k(m39Var, 2);
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
                    iR3 = am1VarT.r(m39Var, 5);
                    i |= 32;
                    break;
                case 6:
                    hhbVar = (hhb) am1VarT.q(m39Var, 6, fhb.a, hhbVar);
                    i |= 64;
                    break;
                case 7:
                    iR4 = am1VarT.r(m39Var, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    strK4 = am1VarT.k(m39Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iR5 = am1VarT.r(m39Var, 9);
                    i |= 512;
                    break;
                case 10:
                    z = am1VarT.z(m39Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    z2 = am1VarT.z(m39Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    iR6 = am1VarT.r(m39Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    jD = am1VarT.D(m39Var, 13);
                    i |= 8192;
                    break;
                case 14:
                    jD2 = am1VarT.D(m39Var, 14);
                    i |= 16384;
                    break;
                default:
                    sy3.c(iF);
                    return null;
            }
        }
        am1VarT.n(m39Var);
        return new f1b(i, iR, strK, strK2, strK3, iR2, iR3, hhbVar, iR4, strK4, iR5, z, z2, iR6, jD, jD2);
    }

    @Override // defpackage.xd4
    public final oi5[] d() {
        la5 la5Var = la5.a;
        tv9 tv9Var = tv9.a;
        mm0 mm0Var = mm0.a;
        e66 e66Var = e66.a;
        return new oi5[]{la5Var, tv9Var, tv9Var, tv9Var, la5Var, la5Var, fhb.a, la5Var, tv9Var, la5Var, mm0Var, mm0Var, la5Var, e66Var, e66Var};
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return descriptor;
    }
}
