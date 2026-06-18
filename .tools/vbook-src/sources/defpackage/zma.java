package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zma {
    public static final ur9 a = new ur9(new nda(10));

    public static final void a(p35 p35Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(2118750039);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(p35Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.g(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarW = t96.w(tg9.n(lu6.a, 44.0f), tp8.a);
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new oda(25, ib4Var);
                dd4Var.p0(objQ);
            }
            mx4.a(p35Var, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, true, 14), 8.0f), lc1.c(1.0f, ((q96) dd4Var.j(s96.a)).a.q), dd4Var, (i2 & 14) | 48, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) p35Var, false, (Object) ib4Var, i, 26);
        }
    }

    public static final void b(boolean z, boolean z2, boolean z3, za9 za9Var, co coVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        int i2;
        boolean z4;
        int i3;
        ib4 ib4Var6 = ib4Var5;
        lp4 lp4Var = jf0.G;
        dd4Var.h0(-347815526);
        int i4 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.g(z3) ? 256 : 128) | (dd4Var.g(true) ? 2048 : 1024) | (dd4Var.g(true) ? 16384 : 8192) | (dd4Var.f(za9Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(coVar) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 67108864 : 33554432) | (dd4Var.h(ib4Var2) ? 536870912 : 268435456);
        int i5 = (dd4Var.h(ib4Var3) ? 4 : 2) | (dd4Var.h(ib4Var4) ? 32 : 16) | (dd4Var.h(ib4Var6) ? 256 : 128);
        if (dd4Var.V(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & Token.EXPR_VOID) == 146) ? false : true)) {
            ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
            eq8 eq8VarA = dq8.a(pv.f, bv4.x, dd4Var, 54);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            p35 p35VarC = i25.c((m53) a53.X.getValue(), dd4Var, 0);
            int i6 = (i4 >> 9) & Token.ASSIGN_MOD;
            a(p35VarC, ib4Var, dd4Var, i6 | ((i4 >> 18) & 896));
            a(i25.c((m53) f53.p0.getValue(), dd4Var, 0), ib4Var2, dd4Var, i6 | ((i4 >> 21) & 896));
            dd4Var.f0(328415270);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 72.0f);
            za9Var.getClass();
            ou6 ou6VarF2 = za9.f(za9Var, ou6VarN, za9.d("tts_play", dd4Var), coVar);
            dd4Var.q(false);
            xf0 xf0Var = bv4.f;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF2);
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
            zn0 zn0Var = zn0.a;
            if (z) {
                dd4Var.f0(1073879664);
                i2 = i5;
                z4 = true;
                sdc.y(zn0Var.a(tg9.n(lu6Var, 68.0f), xf0Var), ((q96) dd4Var.j(s96.a)).a.o, null, dd4Var, 0, 4);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
                i3 = 0;
            } else {
                dd4Var2 = dd4Var;
                i2 = i5;
                z4 = true;
                Object obj = vl1.a;
                if (z3) {
                    dd4Var2.f0(1074207272);
                    p35 p35VarC2 = i25.c((m53) a53.R.getValue(), dd4Var2, 0);
                    ou6 ou6VarN2 = tg9.n(zn0Var.a(lu6Var, xf0Var), 72.0f);
                    g83 g83Var = o96.a;
                    ou6 ou6VarW = t96.w(ou6VarN2, rw1.k0(g83.r(), dd4Var2));
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(ou6VarW, ((q96) dd4Var2.j(ur9Var)).a.a, lp4Var);
                    boolean z5 = (i2 & 14) == 4;
                    Object objQ = dd4Var2.Q();
                    if (z5 || objQ == obj) {
                        objQ = new oda(18, ib4Var3);
                        dd4Var2.p0(objQ);
                    }
                    i3 = 0;
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 14.0f), ((q96) dd4Var2.j(ur9Var)).a.b, dd4Var2, 48, 0);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(1074879538);
                    p35 p35VarC3 = i25.c(z2 ? (m53) f53.T.getValue() : (m53) f53.X.getValue(), dd4Var2, 0);
                    ou6 ou6VarN3 = tg9.n(zn0Var.a(lu6Var, xf0Var), 72.0f);
                    g83 g83Var2 = o96.a;
                    ou6 ou6VarW2 = t96.w(ou6VarN3, rw1.k0(g83.r(), dd4Var2));
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarL2 = fe.L(ou6VarW2, ((q96) dd4Var2.j(ur9Var2)).a.a, lp4Var);
                    boolean z6 = (i2 & 14) == 4;
                    Object objQ2 = dd4Var2.Q();
                    if (z6 || objQ2 == obj) {
                        objQ2 = new oda(19, ib4Var3);
                        dd4Var2.p0(objQ2);
                    }
                    i3 = 0;
                    mx4.a(p35VarC3, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarL2, false, 15), 14.0f), ((q96) dd4Var2.j(ur9Var2)).a.b, dd4Var2, 48, 0);
                    dd4Var2.q(false);
                }
            }
            dd4Var2.q(z4);
            p35 p35VarC4 = i25.c((m53) f53.o0.getValue(), dd4Var2, i3);
            int i7 = (i4 >> 6) & Token.ASSIGN_MOD;
            a(p35VarC4, ib4Var4, dd4Var2, ((i2 << 3) & 896) | i7);
            ib4Var6 = ib4Var5;
            a(i25.c((m53) a53.W.getValue(), dd4Var2, 0), ib4Var6, dd4Var2, (i2 & 896) | i7);
            dd4Var2.q(z4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kn6(z, z2, z3, za9Var, coVar, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var6, i);
        }
    }

    public static final void c(p35 p35Var, String str, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2019138001);
        int i2 = i | (dd4Var2.f(p35Var) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            ur9 ur9Var = s96.a;
            long j = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            mx4.a(p35Var, str, tg9.n(lu6Var, 24.0f), j, dd4Var2, (i2 & 14) | 384 | (i2 & Token.ASSIGN_MOD), 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            nha.c(str, kf0.v(tg9.f(lu6Var, 1.0f)), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, ((i2 >> 3) & 14) | 48, 24576, 113656);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f47(p35Var, str, ou6Var, i, 9);
        }
    }

    public static final void d(String str, String str2, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(386905372);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16);
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.h;
            lu6 lu6Var = lu6.a;
            nha.c(str, kf0.v(tg9.f(lu6Var, 1.0f)), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var2, (i2 & 14) | 48, 24576, 113656);
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            nha.c(str2, tg9.f(lu6Var, 1.0f), lc1.c(0.8f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var2, ((i2 >> 3) & 14) | 48, 0, 130040);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ys6(str, str2, ou6Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final boolean z, final boolean z2, final boolean z3, final int i, final ou6 ou6Var, final ib4 ib4Var, dd4 dd4Var, final int i2) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.f;
        dd4Var2.h0(-1683850740);
        int i5 = i2 | (dd4Var2.g(z) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.d(i) ? 2048 : 1024) | (dd4Var2.f(ou6Var) ? 16384 : 8192) | (dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var2.V(i5 & 1, (74899 & i5) != 74898)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            zn0 zn0Var = zn0.a;
            if (z) {
                dd4Var2.f0(-266847079);
                sdc.y(zn0Var.a(tg9.n(lu6Var, 34.0f), xf0Var), ((q96) dd4Var2.j(s96.a)).a.q, null, dd4Var, 0, 4);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                fu6 fu6Var = vl1.a;
                if (z3) {
                    dd4Var2.f0(-266559399);
                    p35 p35VarC = i25.c((m53) a53.R.getValue(), dd4Var2, 0);
                    ou6 ou6VarW = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean z4 = (i5 & 458752) == 131072;
                    Object objQ = dd4Var2.Q();
                    Object obj3 = objQ;
                    if (z4 || objQ == fu6Var) {
                        oda odaVar = new oda(14, ib4Var);
                        dd4Var2.p0(odaVar);
                        obj3 = odaVar;
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) obj3, ou6VarW, false, 15), 8.0f), ((q96) dd4Var2.j(s96.a)).a.q, dd4Var2, 48, 0);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-266067801);
                    ou6 ou6VarA = zn0Var.a(tg9.n(lu6Var, 34.0f), xf0Var);
                    ur9 ur9Var = s96.a;
                    long j = ((q96) dd4Var2.j(ur9Var)).a.q;
                    long jC = lc1.c(0.2f, ((q96) dd4Var2.j(ur9Var)).a.q);
                    boolean z5 = (i5 & 7168) == 2048;
                    Object objQ2 = dd4Var2.Q();
                    if (z5 || objQ2 == fu6Var) {
                        i3 = 0;
                        rma rmaVar = new rma(i, i3);
                        dd4Var2.p0(rmaVar);
                        obj = rmaVar;
                    } else {
                        i3 = 0;
                        obj = objQ2;
                    }
                    boolean z6 = i3;
                    h48.b((ib4) obj, ou6VarA, j, 2.0f, jC, 1, 0.0f, dd4Var2, 3072, 64);
                    dd4Var2 = dd4Var2;
                    p35 p35VarC2 = i25.c(z2 ? (m53) f53.T.getValue() : (m53) f53.X.getValue(), dd4Var2, z6 ? 1 : 0);
                    long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean z7 = (i5 & 458752) == 131072 ? true : z6 ? 1 : 0;
                    Object objQ3 = dd4Var2.Q();
                    if (z7 || objQ3 == fu6Var) {
                        i4 = 15;
                        oda odaVar2 = new oda(15, ib4Var);
                        dd4Var2.p0(odaVar2);
                        obj2 = odaVar2;
                    } else {
                        i4 = 15;
                        obj2 = objQ3;
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) obj2, ou6VarW2, z6, i4), 6.0f), j2, dd4Var2, 48, 0);
                    dd4Var2.q(z6);
                }
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, z3, i, ou6Var, ib4Var, i2) { // from class: sma
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ ou6 e;
                public final /* synthetic */ ib4 f;

                @Override // defpackage.yb4
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iX0 = qu1.x0(1);
                    zma.e(this.a, this.b, this.c, this.d, this.e, this.f, (dd4) obj4, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void f(boolean z, String str, int i, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(398837868);
        int i3 = i2 | (dd4Var2.g(z) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.d(i) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = dk9.x(Float.valueOf(i));
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            br9 br9VarB = an.b(((Number) a07Var.getValue()).floatValue(), (ko) null, (String) null, dd4Var2, 0, 30);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            float fFloatValue = ((Number) br9VarB.getValue()).floatValue();
            bb1 bb1Var = new bb1(0.0f, 100.0f);
            int i4 = i3 & 14;
            boolean zF = (i4 == 4) | dd4Var2.f(a07Var);
            Object objQ2 = dd4Var2.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new hb0(z, a07Var, 5);
                dd4Var2.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF2 = (i4 == 4) | ((57344 & i3) == 16384) | dd4Var2.f(a07Var);
            Object objQ3 = dd4Var2.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new zi6(z, kb4Var, a07Var, 3);
                dd4Var2.p0(objQ3);
            }
            yb0.u(fFloatValue, kb4Var2, null, false, (ib4) objQ3, null, null, 0, null, jf0.G(-182748839, new zm3(z, a07Var, 1), dd4Var2), bb1Var, dd4Var, 805306368, 0, 492);
            ur9 ur9Var = s96.a;
            nha.c(str, tg9.f(lu6.a, 1.0f), lc1.c(0.6f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, ((i3 >> 3) & 14) | 48, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kl6(z, str, i, ou6Var, kb4Var, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    public static final void g(final boolean z, final long j, ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, dd4 dd4Var, final int i) {
        ou6 ou6Var2;
        int i2;
        ?? r5;
        String strK;
        dd4Var.h0(-242869396);
        int i3 = i | (dd4Var.e(j) ? 32 : 16) | (dd4Var.h(ib4Var) ? 2048 : 1024) | (dd4Var.h(ib4Var2) ? 16384 : 8192) | (dd4Var.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var4) ? 1048576 : 524288) | (dd4Var.h(ib4Var5) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6Var2 = ou6Var;
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var2);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ou6 ou6Var3 = lu6.a;
            Object obj = vl1.a;
            hq8 hq8Var = hq8.a;
            if (z) {
                dd4Var.f0(-282408186);
                p35 p35VarC = i25.c((m53) f53.Y.getValue(), dd4Var, 0);
                String strK2 = wn9.K((pv9) zu9.D.getValue(), dd4Var);
                ou6 ou6VarB = hq8Var.b(1.0f, ou6Var3, true);
                boolean z2 = (i3 & 7168) == 2048;
                Object objQ = dd4Var.Q();
                if (z2 || objQ == obj) {
                    objQ = new oda(20, ib4Var);
                    dd4Var.p0(objQ);
                }
                i2 = i3;
                r5 = 0;
                c(p35VarC, strK2, fw.J(null, (ib4) objQ, ou6VarB, false, 15), dd4Var, 0);
                dd4Var.q(false);
            } else {
                i2 = i3;
                r5 = 0;
                dd4Var.f0(-282119886);
                dd4Var.q(false);
            }
            p35 p35VarC2 = i25.c((m53) f53.q0.getValue(), dd4Var, r5);
            if (j > 0) {
                dd4Var.f0(-281990771);
                dd4Var.q((boolean) r5);
                strK = bv4.v(j);
            } else {
                dd4Var.f0(-281916402);
                strK = wn9.K((pv9) ev9.M.getValue(), dd4Var);
                dd4Var.q((boolean) r5);
            }
            ou6 ou6VarB2 = hq8Var.b(1.0f, ou6Var3, true);
            boolean z3 = (i2 & 57344) == 16384;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new oda(21, ib4Var2);
                dd4Var.p0(objQ2);
            }
            c(p35VarC2, strK, fw.J(null, (ib4) objQ2, ou6VarB2, false, 15), dd4Var, 0);
            p35 p35VarC3 = i25.c((m53) h53.a.getValue(), dd4Var, 0);
            String strK3 = wn9.K((pv9) ev9.L.getValue(), dd4Var);
            ou6 ou6VarB3 = hq8Var.b(1.0f, ou6Var3, true);
            boolean z4 = (i2 & 458752) == 131072;
            Object objQ3 = dd4Var.Q();
            if (z4 || objQ3 == obj) {
                objQ3 = new oda(22, ib4Var3);
                dd4Var.p0(objQ3);
            }
            c(p35VarC3, strK3, fw.J(null, (ib4) objQ3, ou6VarB3, false, 15), dd4Var, 0);
            p35 p35VarC4 = i25.c((m53) f53.A.getValue(), dd4Var, 0);
            String strK4 = wn9.K((pv9) ev9.o.getValue(), dd4Var);
            ou6 ou6VarB4 = hq8Var.b(1.0f, ou6Var3, true);
            boolean z5 = (i2 & 3670016) == 1048576;
            Object objQ4 = dd4Var.Q();
            if (z5 || objQ4 == obj) {
                objQ4 = new oda(23, ib4Var4);
                dd4Var.p0(objQ4);
            }
            c(p35VarC4, strK4, fw.J(null, (ib4) objQ4, ou6VarB4, false, 15), dd4Var, 0);
            p35 p35VarC5 = i25.c((m53) f53.m0.getValue(), dd4Var, 0);
            String strK5 = wn9.K((pv9) mu9.o0.getValue(), dd4Var);
            ou6 ou6VarB5 = hq8Var.b(1.0f, ou6Var3, true);
            boolean z6 = (i2 & 29360128) == 8388608;
            Object objQ5 = dd4Var.Q();
            if (z6 || objQ5 == obj) {
                objQ5 = new oda(24, ib4Var5);
                dd4Var.p0(objQ5);
            }
            c(p35VarC5, strK5, fw.J(null, (ib4) objQ5, ou6VarB5, false, 15), dd4Var, 0);
            dd4Var.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final ou6 ou6Var4 = ou6Var2;
            ye8VarU.d = new yb4(z, j, ou6Var4, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, i) { // from class: tma
                public final /* synthetic */ boolean a;
                public final /* synthetic */ long b;
                public final /* synthetic */ ou6 c;
                public final /* synthetic */ ib4 d;
                public final /* synthetic */ ib4 e;
                public final /* synthetic */ ib4 f;
                public final /* synthetic */ ib4 s;
                public final /* synthetic */ ib4 t;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(391);
                    zma.g(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void h(joa joaVar, za9 za9Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        za9 za9Var2;
        ou6 ou6Var2;
        dd4Var.h0(-1446868147);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(joaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            za9Var2 = za9Var;
            i2 |= dd4Var.f(za9Var2) ? 32 : 16;
        } else {
            za9Var2 = za9Var;
        }
        if ((i & 384) == 0) {
            ou6Var2 = ou6Var;
            i2 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            a07 a07VarB = bx1.B(joaVar.v, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new nda(8);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new nda(9);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                float fJ = j(a07Var);
                objQ3 = dk9.x(Boolean.valueOf(!(0.0f <= fJ && fJ <= 1.0f)));
                dd4Var.p0(objQ3);
            }
            kf0.d(!((gna) a07VarB.getValue()).g && ((gna) a07VarB.getValue()).h, (ou6) null, wd3.c((by3) null, 3), wd3.d((by3) null, 3), (String) null, jf0.G(-1643010523, new el0(ou6Var2, a07Var, a07Var2, (a07) objQ3, joaVar, za9Var2, a07VarB, 8), dd4Var), dd4Var, 200064, 18);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(joaVar, za9Var, ou6Var, i, 22);
        }
    }

    public static final long i(a07 a07Var) {
        return ((na5) a07Var.getValue()).a;
    }

    public static final float j(a07 a07Var) {
        return ((Number) a07Var.getValue()).floatValue();
    }

    public static final void k(rla rlaVar, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i) {
        rlaVar.getClass();
        t27Var.getClass();
        dd4Var.h0(1961566808);
        int i2 = i | (dd4Var.f(rlaVar) ? 4 : 2) | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            joa joaVar = (joa) ((qtb) qx1.N(ug8.a(joa.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            ad1 ad1Var = (ad1) rlaVar.a.getValue();
            if (ad1Var == null) {
                dd4Var.f0(-424931229);
                ad1Var = ((q96) dd4Var.j(s96.a)).a;
            } else {
                dd4Var.f0(-424932655);
            }
            dd4Var.q(false);
            s96.b(ad1Var, null, null, jf0.G(-192791292, new f47(10, t27Var, joaVar, ou6Var), dd4Var), dd4Var, 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f47(rlaVar, t27Var, ou6Var, i, 11);
        }
    }

    public static final void l(t27 t27Var, joa joaVar, za9 za9Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(657346842);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(t27Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(joaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(za9Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            sdc.e(ou6Var, null, jf0.G(-1602882064, new u97(joaVar, t27Var, bx1.B(joaVar.v, dd4Var), za9Var, kb4Var, bx1.B(joaVar.x, dd4Var), bx1.B(joaVar.w, dd4Var), bx1.B(joaVar.y, dd4Var), bx1.B(joaVar.z, dd4Var)), dd4Var), dd4Var, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(t27Var, joaVar, za9Var, ou6Var, kb4Var, i);
        }
    }

    public static final void m(final gna gnaVar, ana anaVar, tla tlaVar, sna snaVar, final za9 za9Var, final co coVar, ou6 ou6Var, ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final ib4 ib4Var7, final ib4 ib4Var8, final ib4 ib4Var9, final ib4 ib4Var10, final ib4 ib4Var11, final ib4 ib4Var12, final ib4 ib4Var13, final kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        ana anaVar2;
        sna snaVar2;
        ib4 ib4Var14;
        dd4Var.h0(-1454897445);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(gnaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            anaVar2 = anaVar;
            i2 |= dd4Var.f(anaVar2) ? 32 : 16;
        } else {
            anaVar2 = anaVar;
        }
        if ((i & 3072) == 0) {
            snaVar2 = snaVar;
            i2 |= dd4Var.f(snaVar2) ? 2048 : 1024;
        } else {
            snaVar2 = snaVar;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(za9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(coVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            ib4Var14 = ib4Var;
            i2 |= dd4Var.h(ib4Var14) ? 8388608 : 4194304;
        } else {
            ib4Var14 = ib4Var;
        }
        if ((i & 100663296) == 0) {
            i2 |= dd4Var.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= dd4Var.h(ib4Var3) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i2 & 1, ((i2 & 306783251) == 306783250 && (306783379 & (((((((3462 | (dd4Var.h(ib4Var5) ? ' ' : (char) 16)) | (dd4Var.h(ib4Var8) ? 16384 : 8192)) | (dd4Var.h(ib4Var9) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var10) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var11) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var12) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var13) ? (char) 0 : (char) 0))) == 306783378 && ((dd4Var.h(kb4Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            za9Var.getClass();
            final ana anaVar3 = anaVar2;
            final sna snaVar3 = snaVar2;
            final ib4 ib4Var15 = ib4Var14;
            j1a.a(za9.e(za9Var, ou6Var, za9.d("tts_container", dd4Var), coVar), (t89) null, 0L, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-460340170, new yb4() { // from class: qma
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarN0 = gjb.n0(yib.B(yn2.y(dd4Var2, lu6Var), 15), 24.0f, 0.0f, 2);
                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        jm jmVar = ll1.f;
                        un9.s(jmVar, dd4Var2, ie1VarA);
                        jm jmVar2 = ll1.e;
                        un9.s(jmVar2, dd4Var2, lr7VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        jm jmVar3 = ll1.g;
                        un9.s(jmVar3, dd4Var2, numValueOf);
                        kd kdVar = ll1.h;
                        un9.r(dd4Var2, kdVar);
                        jm jmVar4 = ll1.d;
                        un9.s(jmVar4, dd4Var2, ou6VarL0);
                        ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                        eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN02);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, eq8VarA);
                        un9.s(jmVar2, dd4Var2, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL02);
                        sw1.r(i25.c((m53) f53.s.getValue(), dd4Var2, 0), (ou6) null, 0L, ib4Var15, dd4Var2, 0, 6);
                        un9.a(dd4Var2, new bp5(1.0f, true));
                        sw1.r(i25.c((m53) a53.w.getValue(), dd4Var2, 0), (ou6) null, 0L, ib4Var2, dd4Var2, 0, 6);
                        dd4Var2.q(true);
                        ou6 ou6VarF = xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true);
                        ha6 ha6VarD = pn0.d(bv4.b, false);
                        int iHashCode3 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL3 = dd4Var2.l();
                        ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ha6VarD);
                        un9.s(jmVar2, dd4Var2, lr7VarL3);
                        ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL03);
                        dd4Var2.f0(-1337715595);
                        gna gnaVar2 = gnaVar;
                        String str = gnaVar2.a;
                        String str2 = gnaVar2.b;
                        String str3 = gnaVar2.f;
                        String str4 = gnaVar2.e;
                        qr1 qr1Var = ra1.d;
                        ou6 ou6VarA = zn0.a.a(gjb.l0(tg9.c, 24.0f), bv4.f);
                        za9 za9Var2 = za9Var;
                        za9Var2.getClass();
                        wa9 wa9VarD = za9.d("tts_cover", dd4Var2);
                        co coVar2 = coVar;
                        ou6 ou6VarF2 = za9.f(za9Var2, ou6VarA, wa9VarD, coVar2);
                        ib4 ib4Var16 = ib4Var3;
                        boolean zF = dd4Var2.f(ib4Var16);
                        Object objQ = dd4Var2.Q();
                        Object obj3 = vl1.a;
                        if (zF || objQ == obj3) {
                            objQ = new oda(16, ib4Var16);
                            dd4Var2.p0(objQ);
                        }
                        w05.c(str, str2, str3, str4, qr1Var, y86.d0(t96.w(yn2.s(ou6VarF2, false, 0.0f, (ib4) objQ, 3), ((q96) dd4Var2.j(s96.a)).c.c), 4.0f, null, 30), dd4Var2, 24576);
                        un9.a(dd4Var2, xv5.g(dd4Var2, false, true, lu6Var, 12.0f));
                        zma.d(str2, gnaVar2.c, tg9.f(lu6Var, 1.0f), dd4Var2, 384);
                        un9.a(dd4Var2, tg9.h(lu6Var, 32.0f));
                        ana anaVar4 = anaVar3;
                        boolean z = anaVar4.a;
                        String str5 = gnaVar2.d;
                        sna snaVar4 = snaVar3;
                        int i3 = snaVar4.a;
                        ou6 ou6VarN03 = gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2);
                        kb4 kb4Var2 = kb4Var;
                        boolean zF2 = dd4Var2.f(kb4Var2);
                        Object objQ2 = dd4Var2.Q();
                        if (zF2 || objQ2 == obj3) {
                            objQ2 = new mj(28, kb4Var2);
                            dd4Var2.p0(objQ2);
                        }
                        zma.f(z, str5, i3, ou6VarN03, (kb4) objQ2, dd4Var2, 3072);
                        un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
                        zma.b(anaVar4.a, anaVar4.b, anaVar4.c, za9Var2, coVar2, tg9.f(lu6Var, 1.0f), ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, dd4Var2, 12582912);
                        un9.a(dd4Var2, tg9.h(lu6Var, 32.0f));
                        zma.g(true, snaVar4.b, tg9.f(lu6Var, 1.0f), ib4Var4, ib4Var7, ib4Var5, ib4Var6, ib4Var8, dd4Var2, 390);
                        xv5.A(lu6Var, 12.0f, dd4Var2, true);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 12582912, Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new st6(gnaVar, anaVar, tlaVar, snaVar, za9Var, coVar, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, kb4Var, i);
        }
    }

    public static final void n(final gna gnaVar, final ana anaVar, final tla tlaVar, final sna snaVar, final boa boaVar, final za9 za9Var, final co coVar, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final ib4 ib4Var7, final ib4 ib4Var8, final ib4 ib4Var9, final ib4 ib4Var10, final ib4 ib4Var11, final ib4 ib4Var12, final ib4 ib4Var13, final kb4 kb4Var, final yb4 yb4Var, dd4 dd4Var, final int i) {
        int i2;
        ana anaVar2;
        sna snaVar2;
        boa boaVar2;
        ib4 ib4Var14;
        dd4Var.h0(-1641169604);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(gnaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            anaVar2 = anaVar;
            i2 |= dd4Var.f(anaVar2) ? 32 : 16;
        } else {
            anaVar2 = anaVar;
        }
        if ((i & 3072) == 0) {
            snaVar2 = snaVar;
            i2 |= dd4Var.f(snaVar2) ? 2048 : 1024;
        } else {
            snaVar2 = snaVar;
        }
        if ((i & 24576) == 0) {
            boaVar2 = boaVar;
            i2 |= dd4Var.f(boaVar2) ? 16384 : 8192;
        } else {
            boaVar2 = boaVar;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.f(za9Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(coVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ib4Var14 = ib4Var;
            i2 |= dd4Var.h(ib4Var14) ? 67108864 : 33554432;
        } else {
            ib4Var14 = ib4Var;
        }
        if ((i & 805306368) == 0) {
            i2 |= dd4Var.h(ib4Var2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (dd4Var.V(i3 & 1, ((i3 & 306783251) == 306783250 && (306783379 & (((((((27696 | (dd4Var.h(ib4Var3) ? (char) 4 : (char) 2)) | (dd4Var.h(ib4Var5) ? 256 : 128)) | (dd4Var.h(ib4Var8) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var9) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var10) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var11) ? (char) 0 : (char) 0)) | (dd4Var.h(ib4Var12) ? (char) 0 : (char) 0))) == 306783378 && ((((dd4Var.h(ib4Var13) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var) ? ' ' : (char) 16)) | (dd4Var.h(yb4Var) ? (char) 256 : (char) 128)) & Token.EXPR_VOID) == 146) ? false : true)) {
            za9Var.getClass();
            final ana anaVar3 = anaVar2;
            final sna snaVar3 = snaVar2;
            final boa boaVar3 = boaVar2;
            final ib4 ib4Var15 = ib4Var14;
            j1a.a(za9.e(za9Var, ou6Var, za9.d("tts_container", dd4Var), coVar), (t89) null, 0L, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-1648650025, new yb4() { // from class: oma
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ou6 ou6Var2 = lu6.a;
                        ou6 ou6VarL0 = gjb.l0(yib.B(yn2.y(dd4Var2, tg9.f(ou6Var2, 1.0f)), 15), 12.0f);
                        wf0 wf0Var = bv4.w;
                        iv ivVar = pv.a;
                        eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 0);
                        int iHashCode = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL = dd4Var2.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        jm jmVar = ll1.f;
                        un9.s(jmVar, dd4Var2, eq8VarA);
                        jm jmVar2 = ll1.e;
                        un9.s(jmVar2, dd4Var2, lr7VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        jm jmVar3 = ll1.g;
                        un9.s(jmVar3, dd4Var2, numValueOf);
                        kd kdVar = ll1.h;
                        un9.r(dd4Var2, kdVar);
                        jm jmVar4 = ll1.d;
                        un9.s(jmVar4, dd4Var2, ou6VarL02);
                        boa boaVar4 = boaVar3;
                        String str = boaVar4.a;
                        List list = boaVar4.b;
                        hq8 hq8Var = hq8.a;
                        sdc.a0(str, list, null, tg9.c(hq8Var.b(1.0f, ou6Var2, true), 1.0f), yb4Var, dd4Var2, 0, 4);
                        un9.a(dd4Var2, tg9.r(ou6Var2, 12.0f));
                        ou6 ou6VarC = tg9.c(hq8Var.b(1.0f, ou6Var2, true), 1.0f);
                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarC);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ie1VarA);
                        un9.s(jmVar2, dd4Var2, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL03);
                        ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
                        xf0 xf0Var = bv4.b;
                        ha6 ha6VarD = pn0.d(xf0Var, false);
                        int iHashCode3 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL3 = dd4Var2.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarF);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ha6VarD);
                        un9.s(jmVar2, dd4Var2, lr7VarL3);
                        ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL04);
                        gna gnaVar2 = gnaVar;
                        zma.d(gnaVar2.b, gnaVar2.c, tg9.f(gjb.n0(ou6Var2, 24.0f, 0.0f, 2), 1.0f), dd4Var2, 384);
                        ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
                        eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 0);
                        int iHashCode4 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL4 = dd4Var2.l();
                        ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarF2);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, eq8VarA2);
                        un9.s(jmVar2, dd4Var2, lr7VarL4);
                        ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL05);
                        sw1.r(i25.c((m53) f53.s.getValue(), dd4Var2, 0), (ou6) null, 0L, ib4Var15, dd4Var2, 0, 6);
                        un9.a(dd4Var2, hq8Var.b(1.0f, ou6Var2, true));
                        sw1.r(i25.c((m53) a53.w.getValue(), dd4Var2, 0), (ou6) null, 0L, ib4Var2, dd4Var2, 0, 6);
                        dd4Var2.q(true);
                        dd4Var2.q(true);
                        ou6 ou6VarX = t96.x(gjb.n0(tg9.f(ou6Var2, 1.0f), 24.0f, 0.0f, 2).e(new bp5(1.0f, false)));
                        ha6 ha6VarD2 = pn0.d(xf0Var, false);
                        int iHashCode5 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL5 = dd4Var2.l();
                        ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarX);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ha6VarD2);
                        un9.s(jmVar2, dd4Var2, lr7VarL5);
                        ky0.v(iHashCode5, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL06);
                        dd4Var2.f0(-1275644893);
                        String str2 = gnaVar2.a;
                        String str3 = gnaVar2.b;
                        String str4 = gnaVar2.f;
                        String str5 = gnaVar2.e;
                        qr1 qr1Var = ra1.d;
                        ou6 ou6VarA = zn0.a.a(t96.x(sdc.e0(0.6666667f, gjb.n0(tg9.c(ou6Var2, 1.0f), 0.0f, 32.0f, 1), true)), bv4.f);
                        za9 za9Var2 = za9Var;
                        za9Var2.getClass();
                        wa9 wa9VarD = za9.d("tts_cover", dd4Var2);
                        co coVar2 = coVar;
                        ou6 ou6VarF3 = za9.f(za9Var2, ou6VarA, wa9VarD, coVar2);
                        ib4 ib4Var16 = ib4Var3;
                        boolean zF = dd4Var2.f(ib4Var16);
                        Object objQ = dd4Var2.Q();
                        Object obj3 = vl1.a;
                        if (zF || objQ == obj3) {
                            objQ = new oda(17, ib4Var16);
                            dd4Var2.p0(objQ);
                        }
                        w05.c(str2, str3, str4, str5, qr1Var, y86.d0(t96.w(yn2.s(ou6VarF3, false, 0.0f, (ib4) objQ, 3), ((q96) dd4Var2.j(s96.a)).c.c), 4.0f, null, 30), dd4Var2, 24576);
                        dd4Var2.q(false);
                        dd4Var2.q(true);
                        ana anaVar4 = anaVar3;
                        boolean z = anaVar4.a;
                        String str6 = gnaVar2.d;
                        sna snaVar4 = snaVar3;
                        int i4 = snaVar4.a;
                        ou6 ou6VarF4 = tg9.f(ou6Var2, 1.0f);
                        kb4 kb4Var2 = kb4Var;
                        boolean zF2 = dd4Var2.f(kb4Var2);
                        Object objQ2 = dd4Var2.Q();
                        if (zF2 || objQ2 == obj3) {
                            objQ2 = new mj(29, kb4Var2);
                            dd4Var2.p0(objQ2);
                        }
                        zma.f(z, str6, i4, ou6VarF4, (kb4) objQ2, dd4Var2, 3072);
                        un9.a(dd4Var2, tg9.h(ou6Var2, 24.0f));
                        zma.b(anaVar4.a, anaVar4.b, anaVar4.c, za9Var2, coVar2, tg9.f(ou6Var2, 1.0f), ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, dd4Var2, 12582912);
                        un9.a(dd4Var2, tg9.h(ou6Var2, 24.0f));
                        zma.g(false, snaVar4.b, tg9.f(ou6Var2, 1.0f), ib4Var4, ib4Var6, ib4Var5, ib4Var7, ib4Var8, dd4Var2, 390);
                        dd4Var2.q(true);
                        dd4Var2.q(true);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 12582912, Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: pma
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i | 1);
                    zma.n(gnaVar, anaVar, tlaVar, snaVar, boaVar, za9Var, coVar, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, kb4Var, yb4Var, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }
}
