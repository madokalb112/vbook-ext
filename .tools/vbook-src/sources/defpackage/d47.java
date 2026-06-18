package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class d47 {
    public static final float a = fz1.K;
    public static final float b = 56.0f;
    public static final float c = 4.0f;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final fn1 g;

    static {
        float f2 = vo1.z;
        float f3 = (56.0f - f2) / 2.0f;
        d = f3;
        e = (32.0f - f2) / 2.0f;
        f = f3;
        g = new fn1(new av6(2));
    }

    public static final void a(ou6 ou6Var, long j, long j2, hyb hybVar, rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(331386280);
        int i2 = i | (dd4Var.f(ou6Var) ? 4 : 2) | (dd4Var.e(j2) ? 256 : Token.CASE) | 3072 | (dd4Var.f(hybVar) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            ((li2) dd4Var.j(g)).a(new e47(ou6Var, j, j2, hybVar, rj1Var), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t8(ou6Var, j, j2, hybVar, rj1Var, i);
        }
    }

    public static final void b(boolean z, ib4 ib4Var, rj1 rj1Var, ou6 ou6Var, boolean z2, boolean z3, c47 c47Var, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        ou6 ou6Var2;
        boolean z4;
        boolean z5;
        c47 c47Var2;
        c47 c47Var3;
        boolean z6;
        boolean z7;
        c47 c47Var4;
        ou6 ou6Var3;
        dd4Var.h0(-1620317701);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | 106654720;
        if (dd4Var.V(i2 & 1, (38347923 & i2) != 38347922)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
                c47 c47Var5 = ad1Var.e0;
                if (c47Var5 == null) {
                    long jD = dd1.d(ad1Var, s32.L);
                    long jD2 = dd1.d(ad1Var, s32.N);
                    long jD3 = dd1.d(ad1Var, s32.M);
                    cd1 cd1Var = s32.O;
                    long jD4 = dd1.d(ad1Var, cd1Var);
                    cd1 cd1Var2 = s32.P;
                    c47Var3 = new c47(jD, jD2, jD3, jD4, dd1.d(ad1Var, cd1Var2), lc1.c(0.38f, dd1.d(ad1Var, cd1Var)), lc1.c(0.38f, dd1.d(ad1Var, cd1Var2)));
                    ad1Var.e0 = c47Var3;
                } else {
                    c47Var3 = c47Var5;
                }
                z6 = true;
                z7 = true;
                c47Var4 = c47Var3;
                ou6Var3 = lu6.a;
            } else {
                dd4Var.Y();
                ou6Var3 = ou6Var;
                z6 = z2;
                z7 = z3;
                c47Var4 = c47Var;
            }
            dd4Var.r();
            dd4Var.f0(253276704);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = ky0.i(dd4Var);
            }
            yy6 yy6Var = (yy6) objQ;
            dd4Var.q(false);
            tv6 tv6Var = tv6.c;
            boolean z8 = z7;
            rj1 rj1VarG = jf0.G(206057749, new mm6(c47Var4, z, z6, i12.g0(tv6Var, dd4Var), z8, rj1Var), dd4Var);
            dd4Var.f0(254203944);
            dd4Var.q(false);
            boolean z9 = z6;
            ou6 ou6Var4 = ou6Var3;
            c47 c47Var6 = c47Var4;
            ou6 ou6VarT = tg9.t(tg9.b(t96.O(ou6Var4, z, yy6Var, null, z9, new uo8(4), ib4Var), 0.0f, b, 1), a, 0.0f, 2);
            ha6 ha6VarD = pn0.d(bv4.f, true);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarT);
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
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ma(pn2Var, 1);
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var2 = (ib4) objQ2;
            boolean zF2 = dd4Var.f(yy6Var) | dd4Var.f(ib4Var2);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new v86(yy6Var, ib4Var2);
                dd4Var.p0(objQ3);
            }
            dd4Var.f0(-1825440690);
            t89 t89VarA = n99.a(y89.c, dd4Var);
            dd4Var.q(false);
            rj1 rj1VarG2 = jf0.G(455696046, new xp5(26, t89VarA, (v86) objQ3), dd4Var);
            rj1 rj1VarG3 = jf0.G(2137606782, new mt(br9VarB, c47Var6, t89VarA), dd4Var);
            boolean zF3 = dd4Var.f(br9VarB);
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                objQ4 = new op0(br9VarB, 20);
                dd4Var.p0(objQ4);
            }
            ib4 ib4Var3 = (ib4) objQ4;
            boolean zF4 = dd4Var.f(br9VarB2);
            Object objQ5 = dd4Var.Q();
            if (zF4 || objQ5 == obj) {
                objQ5 = new op0(br9VarB2, 21);
                dd4Var.p0(objQ5);
            }
            c(rj1VarG2, rj1VarG3, rj1VarG, null, z8, ib4Var3, (ib4) objQ5, dd4Var, 25014);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            z5 = z8;
            z4 = z9;
            ou6Var2 = ou6Var4;
            c47Var2 = c47Var6;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
            z4 = z2;
            z5 = z3;
            c47Var2 = c47Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yc9(z, ib4Var, rj1Var, ou6Var2, z4, z5, c47Var2, i);
        }
    }

    public static final void c(rj1 rj1Var, rj1 rj1Var2, rj1 rj1Var3, yb4 yb4Var, boolean z, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        yb4 yb4Var2 = yb4Var;
        ib4 ib4Var3 = ib4Var;
        dd4Var.h0(-759267492);
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
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 3670016) == 1048576) | (i3 == 16384);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (z4 || objQ == fu6Var) {
                objQ = new m37(ib4Var2, yb4Var2, z, 1);
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
                dd4Var.f0(773116085);
                ou6 ou6VarX02 = h67.x0(lu6Var, "label");
                boolean z5 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objQ2 = dd4Var.Q();
                if (z5 || objQ2 == fu6Var) {
                    z2 = z;
                    ib4Var3 = ib4Var;
                    objQ2 = new h37(1, ib4Var3, z2);
                    dd4Var.p0(objQ2);
                } else {
                    z2 = z;
                    ib4Var3 = ib4Var;
                }
                ou6 ou6VarW = kl8.W(ou6VarX02, (kb4) objQ2);
                ha6 ha6VarD2 = pn0.d(xf0Var, false);
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
                dd4Var.f0(773387087);
                dd4Var.q(false);
            }
            dd4Var.q(z3);
        } else {
            z2 = z;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i37(rj1Var, rj1Var2, rj1Var3, yb4Var2, z2, ib4Var3, ib4Var2, i, 1);
        }
    }
}
