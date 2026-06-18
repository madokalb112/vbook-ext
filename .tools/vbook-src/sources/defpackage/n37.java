package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n37 {
    public static final float a = ah1.p0;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final fn1 h = new fn1(new av6(1));

    public static final void a(ou6 ou6Var, long j, long j2, float f2, hyb hybVar, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        long jA;
        dd4Var.h0(1054099326);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.c(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(hybVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                jA = dd1.a(((q96) dd4Var.j(s96.a)).a, j);
            } else {
                dd4Var.Y();
                jA = j2;
            }
            dd4Var.r();
            ((ki2) dd4Var.j(h)).a(new o37(ou6Var, j, jA, f2, hybVar, rj1Var), dd4Var, 0);
        } else {
            dd4Var.Y();
            jA = j2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l37(ou6Var, j, jA, f2, hybVar, rj1Var, i);
        }
    }

    public static final void b(fq8 fq8Var, boolean z, ib4 ib4Var, rj1 rj1Var, ou6 ou6Var, yb4 yb4Var, boolean z2, g37 g37Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2;
        ou6 ou6Var2;
        boolean z3;
        g37 g37Var2;
        int i3;
        int i4;
        ou6 ou6Var3;
        g37 g37Var3;
        boolean z4;
        rj1 rj1VarG;
        dd4Var.h0(974293026);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(fq8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        int i6 = 1;
        if ((196608 & i) == 0) {
            i5 |= dd4Var.g(true) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i5 |= dd4Var.h(yb4Var) ? 1048576 : 524288;
        }
        int i7 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i5;
        }
        int i8 = 805306368 | i7;
        if (dd4Var.V(i8 & 1, (306783379 & i8) != 306783378)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
                g37 g37Var4 = ad1Var.d0;
                if (g37Var4 == null) {
                    long jD = dd1.d(ad1Var, ah1.j0);
                    long jD2 = dd1.d(ad1Var, ah1.m0);
                    long jD3 = dd1.d(ad1Var, ah1.k0);
                    cd1 cd1Var = ah1.n0;
                    long jD4 = dd1.d(ad1Var, cd1Var);
                    i3 = -234881025;
                    cd1 cd1Var2 = ah1.o0;
                    g37 g37Var5 = new g37(jD, jD2, jD3, jD4, dd1.d(ad1Var, cd1Var2), lc1.c(0.38f, dd1.d(ad1Var, cd1Var)), lc1.c(0.38f, dd1.d(ad1Var, cd1Var2)));
                    ad1Var.d0 = g37Var5;
                    g37Var4 = g37Var5;
                } else {
                    i3 = -234881025;
                }
                i4 = i8 & i3;
                ou6Var3 = lu6.a;
                g37Var3 = g37Var4;
                z4 = true;
            } else {
                dd4Var.Y();
                ou6Var3 = ou6Var;
                z4 = z2;
                i4 = i8 & (-234881025);
                g37Var3 = g37Var;
            }
            dd4Var.r();
            dd4Var.f0(-224975399);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = ky0.i(dd4Var);
            }
            yy6 yy6Var = (yy6) objQ;
            dd4Var.q(false);
            tv6 tv6Var = tv6.c;
            by3 by3VarG0 = i12.g0(tv6Var, dd4Var);
            g37 g37Var6 = g37Var3;
            boolean z5 = z4;
            rj1 rj1VarG2 = jf0.G(-876637252, new sp0(g37Var3, z, by3VarG0, yb4Var, z4, rj1Var), dd4Var);
            if (yb4Var == null) {
                dd4Var.f0(-224048562);
                dd4Var.q(false);
                rj1VarG = null;
            } else {
                dd4Var.f0(-224048561);
                rj1VarG = jf0.G(802208206, new i90(g37Var6, z, by3VarG0, yb4Var), dd4Var);
                dd4Var.q(false);
            }
            rj1 rj1Var2 = rj1VarG;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm7(0);
                dd4Var.p0(objQ2);
            }
            zm7 zm7Var = (zm7) objQ2;
            ou6 ou6Var4 = ou6Var3;
            ou6Var2 = ou6Var4;
            ou6 ou6VarB = fq8Var.b(1.0f, tg9.b(t96.O(ou6Var4, z, yy6Var, null, true, new uo8(4), ib4Var), 0.0f, a, 1), true);
            Object objQ3 = dd4Var.Q();
            int i9 = 18;
            if (objQ3 == obj) {
                objQ3 = new zs5(zm7Var, i9);
                dd4Var.p0(objQ3);
            }
            ou6 ou6VarJ = m79.J(ou6VarB, (kb4) objQ3);
            ha6 ha6VarD = pn0.d(bv4.f, true);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarJ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            br9 br9VarB = an.b(z ? 1.0f : 0.0f, i12.g0(tv6Var, dd4Var), (String) null, dd4Var, 0, 28);
            br9 br9VarB2 = an.b(z ? 1.0f : 0.0f, i12.g0(tv6.b, dd4Var), (String) null, dd4Var, 0, 28);
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            boolean zF = dd4Var.f(pn2Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new vf6(29, pn2Var, zm7Var);
                dd4Var.p0(objQ4);
            }
            ib4 ib4Var2 = (ib4) objQ4;
            boolean zF2 = dd4Var.f(yy6Var) | dd4Var.f(ib4Var2);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new v86(yy6Var, ib4Var2);
                dd4Var.p0(objQ5);
            }
            rj1 rj1VarG3 = jf0.G(-2082182507, new w27((v86) objQ5, i6), dd4Var);
            rj1 rj1VarG4 = jf0.G(-799524251, new xp5(25, br9VarB, g37Var6), dd4Var);
            boolean zF3 = dd4Var.f(br9VarB);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new op0(br9VarB, 19);
                dd4Var.p0(objQ6);
            }
            ib4 ib4Var3 = (ib4) objQ6;
            boolean zF4 = dd4Var.f(br9VarB2);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new op0(br9VarB2, 18);
                dd4Var.p0(objQ7);
            }
            c(rj1VarG3, rj1VarG4, rj1VarG2, rj1Var2, z5, ib4Var3, (ib4) objQ7, dd4Var, ((i4 >> 9) & 57344) | 438);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            z3 = z5;
            g37Var2 = g37Var6;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
            z3 = z2;
            g37Var2 = g37Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ss1(fq8Var, z, ib4Var, rj1Var, ou6Var2, yb4Var, z3, g37Var2, i);
        }
    }

    public static final void c(rj1 rj1Var, rj1 rj1Var2, rj1 rj1Var3, yb4 yb4Var, boolean z, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        yb4 yb4Var2 = yb4Var;
        ib4 ib4Var3 = ib4Var;
        dd4Var.h0(-1019541078);
        if ((i & 6) == 0) {
            i2 = (dd4Var.h(rj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(rj1Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(rj1Var3) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(yb4Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(ib4Var2) ? 1048576 : 524288;
        }
        if (dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            vj1 vj1Var = new vj1(25);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarZ = kl8.Z(lu6Var, vj1Var);
            int i3 = 57344 & i2;
            boolean z5 = ((i2 & 7168) == 2048) | ((i2 & 3670016) == 1048576) | (i3 == 16384);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (z5 || objQ == fu6Var) {
                objQ = new m37(ib4Var2, yb4Var2, z, 0);
                dd4Var.p0(objQ);
            }
            ha6 ha6Var = (ha6) objQ;
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarZ);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6Var);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            int i4 = i2;
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            rj1Var.invoke(dd4Var, Integer.valueOf(i4 & 14));
            rj1Var2.invoke(dd4Var, Integer.valueOf((i4 >> 3) & 14));
            ou6 ou6VarX0 = h67.x0(lu6Var, "icon");
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarX0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            rj1Var3.invoke(dd4Var, Integer.valueOf((i4 >> 6) & 14));
            dd4Var.q(true);
            if (yb4Var != null) {
                dd4Var.f0(-660471321);
                ou6 ou6VarX02 = h67.x0(lu6Var, "label");
                boolean z6 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objQ2 = dd4Var.Q();
                if (z6 || objQ2 == fu6Var) {
                    z2 = z;
                    ib4Var3 = ib4Var;
                    z4 = false;
                    objQ2 = new h37(0, ib4Var3, z2);
                    dd4Var.p0(objQ2);
                } else {
                    z2 = z;
                    ib4Var3 = ib4Var;
                    z4 = false;
                }
                ou6 ou6VarW = kl8.W(ou6VarX02, (kb4) objQ2);
                ha6 ha6VarD2 = pn0.d(xf0Var, z4);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD2);
                un9.s(jmVar2, dd4Var, lr7VarL3);
                ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL03);
                yb4Var2 = yb4Var;
                z3 = true;
                xv5.w((i4 >> 9) & 14, yb4Var2, dd4Var, true, false);
            } else {
                yb4Var2 = yb4Var;
                z2 = z;
                ib4Var3 = ib4Var;
                z3 = true;
                dd4Var.f0(-660200319);
                dd4Var.q(false);
            }
            dd4Var.q(z3);
        } else {
            z2 = z;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i37(rj1Var, rj1Var2, rj1Var3, yb4Var2, z2, ib4Var3, ib4Var2, i, 0);
        }
    }
}
