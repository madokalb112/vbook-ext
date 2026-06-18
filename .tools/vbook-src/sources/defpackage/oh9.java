package defpackage;

import android.app.Activity;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class oh9 {
    public static final void a(final float f, final float f2, final rj1 rj1Var, final ou6 ou6Var, dd4 dd4Var, final int i) {
        int i2;
        dd4Var.h0(-701397194);
        if ((i & 6) == 0) {
            i2 = (dd4Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.c(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            uw1 uw1Var = ((q96) dd4Var.j(s96.a)).c.c;
            ou6 ou6VarU = tg9.u(ou6Var);
            if (f != 1.0f || f != 1.0f) {
                ou6VarU = kl8.X(ou6VarU, f, f, 0.0f, 0.0f, 0.0f, null, false, 524284);
            }
            kc5.e(gjb.p0(ou6VarU, 16.0f, 0.0f, 16.0f, f2, 2).e(ou6Var), uw1Var, null, jv3.v(62), jf0.G(57969064, new lv8(rj1Var, 6), dd4Var), dd4Var, 196608);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: zp9
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oh9.a(f, f2, rj1Var, ou6Var, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void b(final wp9 wp9Var, float f, float f2, final ib4 ib4Var, ou6 ou6Var, dd4 dd4Var, final int i) {
        float f3;
        dd4 dd4Var2;
        final float f4;
        final ou6 ou6Var2;
        dd4Var.h0(2570796);
        int i2 = (dd4Var.f(wp9Var) ? 4 : 2) | i | (dd4Var.c(f) ? 32 : 16) | (dd4Var.c(f2) ? 256 : Token.CASE) | (dd4Var.h(ib4Var) ? 2048 : 1024) | (dd4Var.f(ou6Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            f3 = f2;
            dd4Var2 = dd4Var;
            a(f, f3, jf0.G(307230189, new w27(wp9Var, ib4Var), dd4Var), ou6Var, dd4Var2, (i3 & 14) | 384 | (i3 & Token.ASSIGN_MOD) | (i3 & 7168));
            f4 = f;
            ou6Var2 = ou6Var;
        } else {
            f3 = f2;
            dd4Var2 = dd4Var;
            f4 = f;
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            final float f5 = f3;
            ye8VarU.d = new yb4(f4, f5, ib4Var, ou6Var2, i) { // from class: yp9
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ ib4 d;
                public final /* synthetic */ ou6 e;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    oh9.b(this.a, this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void c(sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-477152587);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(sw8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new iy1(sw8Var, i3);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, (i2 >> 3) & 14);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy1(sw8Var, ou6Var, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, vp9 vp9Var, ib4 ib4Var, boolean z, ou6 ou6Var, dd4 dd4Var, int i) {
        List list2;
        int i2;
        ib4 ib4Var2;
        final wp9 wp9Var;
        final br9 br9Var;
        boolean z2;
        int i3;
        be3 be3Var;
        cj3 cj3VarO;
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        vp9Var.getClass();
        ko koVar = vp9Var.b;
        ib4Var.getClass();
        dd4Var2.h0(532895194);
        if ((i & 6) == 0) {
            list2 = list;
            i2 = (dd4Var2.h(list2) ? 4 : 2) | i;
        } else {
            list2 = list;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.d(Integer.MAX_VALUE) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.d(vp9Var.ordinal()) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            ib4Var2 = ib4Var;
            i2 |= dd4Var2.h(ib4Var2) ? 2048 : 1024;
        } else {
            ib4Var2 = ib4Var;
        }
        boolean z3 = z;
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i4 = 0;
        if (dd4Var2.V(i2 & 1, (74899 & i2) != 74898)) {
            final int size = list2.size();
            ha6 ha6VarD = pn0.d(bv4.c, false);
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
            dd4Var2.f0(635711045);
            int i5 = 0;
            for (Object obj : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    gc1.i0();
                    throw null;
                }
                wp9 wp9Var2 = (wp9) obj;
                int i7 = size - 1;
                float fAbs = Math.abs(i5 - i7);
                final br9 br9VarB = an.b(1.0f - (0.05f * fAbs), koVar, (String) null, dd4Var2, 0, 28);
                final br9 br9VarB2 = an.b(0.0f, koVar, (String) null, dd4Var, 6, 28);
                ko koVar2 = koVar;
                br9 br9VarA = an.a((fAbs * 6.0f) + 6.0f, vp9Var.a, (String) null, dd4Var, 0, 12);
                Object objQ = dd4Var.Q();
                Object obj2 = vl1.a;
                if (objQ == obj2) {
                    objQ = dk9.x(Float.valueOf(-1.0f));
                    dd4Var.p0(objQ);
                }
                final a07 a07Var = (a07) objQ;
                if (i7 == i5) {
                    wp9Var = wp9Var2;
                    br9Var = br9VarA;
                    z2 = z3;
                } else {
                    wp9Var = wp9Var2;
                    br9Var = br9VarA;
                    z2 = true;
                }
                by3 by3Var = vp9Var.c;
                Object objQ2 = dd4Var.Q();
                if (objQ2 == obj2) {
                    objQ2 = new qc9(23);
                    dd4Var.p0(objQ2);
                }
                be3 be3VarJ = wd3.j(by3Var, (kb4) objQ2);
                if (((Number) a07Var.getValue()).floatValue() == -1.0f) {
                    dd4Var.f0(-1501789910);
                    by3 by3Var2 = vp9Var.d;
                    Object objQ3 = dd4Var.Q();
                    if (objQ3 == obj2) {
                        objQ3 = new qc9(24);
                        dd4Var.p0(objQ3);
                    }
                    cj3VarO = wd3.n(by3Var2, (kb4) objQ3);
                    i3 = 0;
                    dd4Var.q(false);
                    be3Var = be3VarJ;
                } else {
                    i3 = 0;
                    dd4Var.f0(-1501560541);
                    be3Var = be3VarJ;
                    p9b p9bVarA0 = ah1.a0(0, 0, b83.d, 3);
                    Object objQ4 = dd4Var.Q();
                    if (objQ4 == obj2) {
                        objQ4 = new aq9(a07Var, i3);
                        dd4Var.p0(objQ4);
                    }
                    cj3VarO = wd3.o(p9bVarA0, (kb4) objQ4);
                    dd4Var.q(false);
                }
                cj3 cj3Var = cj3VarO;
                final int i8 = i5;
                int i9 = i3;
                final ib4 ib4Var3 = ib4Var2;
                final List list3 = list2;
                kf0.d(z2, (ou6) null, be3Var, cj3Var, (String) null, jf0.G(-292673573, new zb4() { // from class: xp9
                    @Override // defpackage.zb4
                    public final Object c(Object obj3, Object obj4, Object obj5) {
                        dd4 dd4Var3 = (dd4) obj4;
                        ((Integer) obj5).getClass();
                        ((co) obj3).getClass();
                        int iS = gc1.S(list3);
                        ou6 ou6VarA = lu6.a;
                        int i10 = i8;
                        ib4 ib4Var4 = ib4Var3;
                        Object obj6 = vl1.a;
                        if (iS == i10) {
                            dd4Var3.f0(-254577518);
                            Object objQ5 = dd4Var3.Q();
                            a07 a07Var2 = a07Var;
                            if (objQ5 == obj6) {
                                objQ5 = new hp8(a07Var2, 28);
                                dd4Var3.p0(objQ5);
                            }
                            ou6 ou6VarB0 = vm7.b0(ou6VarA, (kb4) objQ5);
                            Object objQ6 = dd4Var3.Q();
                            if (objQ6 == obj6) {
                                objQ6 = new hp8(a07Var2, 29);
                                dd4Var3.p0(objQ6);
                            }
                            k43 k43VarB = h43.b((kb4) objQ6, dd4Var3, 6);
                            boolean zF = dd4Var3.f(ib4Var4);
                            br9 br9Var2 = br9VarB2;
                            boolean zF2 = zF | dd4Var3.f(br9Var2);
                            Object objQ7 = dd4Var3.Q();
                            if (zF2 || objQ7 == obj6) {
                                objQ7 = new p51(ib4Var4, a07Var2, br9Var2, null);
                                dd4Var3.p0(objQ7);
                            }
                            ou6VarA = h43.a(ou6VarB0, k43VarB, lh7.b, false, (yy6) null, false, (zb4) null, (zb4) objQ7, false, 188);
                            dd4Var3.q(false);
                        } else {
                            dd4Var3.f0(-253917001);
                            dd4Var3.q(false);
                        }
                        ou6 ou6Var2 = ou6VarA;
                        float fFloatValue = size - i10 > Integer.MAX_VALUE ? 0.0f : ((Number) br9VarB.getValue()).floatValue();
                        wp9 wp9Var3 = wp9Var;
                        if (!(wp9Var3 instanceof wp9)) {
                            throw j39.e(-2086390839, dd4Var3, false);
                        }
                        dd4Var3.f0(-253045901);
                        float f = ((x13) br9Var.getValue()).a;
                        boolean zF3 = dd4Var3.f(ib4Var4) | dd4Var3.f(wp9Var3);
                        Object objQ8 = dd4Var3.Q();
                        if (zF3 || objQ8 == obj6) {
                            objQ8 = new e67(16, ib4Var4, wp9Var3);
                            dd4Var3.p0(objQ8);
                        }
                        oh9.b(wp9Var3, fFloatValue, f, (ib4) objQ8, ou6Var2, dd4Var3, 0);
                        dd4Var3.q(false);
                        return heb.a;
                    }
                }, dd4Var), dd4Var, 196608, 18);
                list2 = list;
                i4 = i9;
                dd4Var2 = dd4Var;
                size = size;
                i5 = i6;
                koVar = koVar2;
                ib4Var2 = ib4Var;
                z3 = z;
            }
            dd4Var2.q(i4);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(list, vp9Var, ib4Var, z, ou6Var, i);
        }
    }

    public static final void e(final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final int i3, final int i4, final int i5, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, dd4 dd4Var, final int i6, final int i7) {
        int i8;
        boolean z4;
        int i9;
        int i10;
        dd4 dd4Var2;
        boolean z5;
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        dd4Var.h0(118537239);
        if ((i6 & 6) == 0) {
            i8 = (dd4Var.g(z) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            z4 = z3;
            i8 |= dd4Var.g(z4) ? 256 : Token.CASE;
        } else {
            z4 = z3;
        }
        if ((i6 & 3072) == 0) {
            i8 |= dd4Var.d(i) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 = i2;
            i8 |= dd4Var.d(i9) ? 16384 : 8192;
        } else {
            i9 = i2;
        }
        if ((i6 & 196608) == 0) {
            i8 |= dd4Var.d(i3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i6 & 1572864) == 0) {
            i8 |= dd4Var.d(i4) ? 1048576 : 524288;
        }
        if ((i6 & 12582912) == 0) {
            i8 |= dd4Var.d(i5) ? 8388608 : 4194304;
        }
        if ((i6 & 100663296) == 0) {
            i8 |= dd4Var.f(ou6Var) ? 67108864 : 33554432;
        }
        if ((i6 & 805306368) == 0) {
            i8 |= dd4Var.h(ib4Var) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            i10 = i7 | (dd4Var.h(ib4Var2) ? 4 : 2);
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= dd4Var.h(ib4Var3) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= dd4Var.h(ib4Var4) ? 256 : Token.CASE;
        }
        if ((i7 & 3072) == 0) {
            i10 |= dd4Var.h(ib4Var5) ? 2048 : 1024;
        }
        int i11 = i10;
        if (dd4Var.V(i8 & 1, ((i8 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            int i12 = i8;
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            if (z2) {
                dd4Var2 = dd4Var;
                z5 = true;
                dd4Var2.f0(273559061);
                dd4Var2.q(false);
            } else {
                dd4Var.f0(273329382);
                z5 = true;
                dk9.f(z, z4, 0L, (ko) null, new xo4(bv4.B), ib4Var3, dd4Var, (i12 & 14) | ((i12 >> 3) & Token.ASSIGN_MOD) | ((i11 << 12) & 458752));
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new h1a(15);
                dd4Var2.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new h1a(16);
                dd4Var2.p0(objQ2);
            }
            kf0.e(z, ou6VarF, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-152216219, new sy4(ib4Var5, ib4Var2, i9, i3, i4, i5, i, ib4Var, ib4Var4, 1), dd4Var2), dd4Var2, 1600902 | ((i12 << 3) & Token.ASSIGN_MOD), 16);
            dd4Var2.q(z5);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: uaa
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i6 | 1);
                    int iX02 = qu1.x0(i7);
                    oh9.e(z, z2, z3, i, i2, i3, i4, i5, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void f(ib4 ib4Var, ib4 ib4Var2, boolean z, rx8 rx8Var, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i) {
        boolean zBooleanValue;
        ou6 ou6Var2 = ou6Var;
        dd4 dd4Var2 = dd4Var;
        ib4Var.getClass();
        ib4Var2.getClass();
        rx8Var.getClass();
        float f = rx8Var.d;
        int i2 = rx8Var.a;
        float f2 = rx8Var.b;
        ou6Var2.getClass();
        dd4Var2.h0(-670190828);
        int i3 = i | (dd4Var2.h(ib4Var) ? 4 : 2) | (dd4Var2.h(ib4Var2) ? 32 : 16) | (dd4Var2.g(z) ? 256 : Token.CASE) | (dd4Var2.f(rx8Var) ? 2048 : 1024) | (dd4Var2.f(ou6Var2) ? 16384 : 8192) | (dd4Var2.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var2.V(i3 & 1, (74899 & i3) != 74898)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.valueOf(z));
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 7168;
            boolean z2 = ((i3 & 896) == 256) | (i4 == 2048);
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new qk0(z, a07Var, rx8Var, (jt1) null);
                dd4Var2.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var2, boolValueOf);
            int iOrdinal = rx8Var.g.ordinal();
            if (iOrdinal == 0) {
                zBooleanValue = true;
            } else {
                if (iOrdinal != 1) {
                    mn5.g();
                    return;
                }
                zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            }
            br9 br9VarB = an.b(z ? 1.0f : 0.0f, ah1.a0(z ? 75 : 500, z ? 0 : i2, null, 4), "scrollbar alpha value", dd4Var2, 3072, 20);
            dd4Var2 = dd4Var;
            br9 br9VarA = an.a(z ? 0.0f : 14.0f, ah1.a0(z ? 75 : 500, z ? 0 : i2, null, 4), "scrollbar displacement value", dd4Var2, 384, 8);
            boolean zF = (i4 == 2048) | ((i3 & 14) == 4) | ((i3 & Token.ASSIGN_MOD) == 32) | dd4Var2.f(br9VarA);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new qmb(ib4Var, ib4Var2, rx8Var, br9VarA);
                dd4Var2.p0(objQ3);
            }
            ha6 ha6Var = (ha6) objQ3;
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var2, lu6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6Var);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            sx8 sx8Var = rx8Var.f;
            boolean z3 = zBooleanValue;
            pn0.a(yb0.U(fe.L(tg9.r(t96.w(yb0.I(gjb.p0(lu6Var, sx8Var == sx8.a ? f2 : 0.0f, 0.0f, sx8Var == sx8.b ? f2 : 0.0f, 0.0f, 10), ((Number) br9VarB.getValue()).floatValue()), rx8Var.c), f), rx8Var.e, jf0.G), "scrollbarThumb"), dd4Var2, 0);
            if (yb4Var == null) {
                dd4Var2.f0(1979123914);
                pn0.a(lu6Var, dd4Var2, 6);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1979125366);
                ou6 ou6VarI = yb0.I(yb0.U(lu6Var, "scrollbarIndicator"), ((Number) br9VarB.getValue()).floatValue());
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarI);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, ha6VarD);
                un9.s(jmVar2, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL02);
                xv5.w((i3 >> 15) & 14, yb4Var, dd4Var2, true, false);
            }
            ou6 ou6VarR = tg9.r(tg9.c(lu6Var, 1.0f), (f2 * 2.0f) + f);
            ou6Var2 = ou6Var;
            if (z3) {
                ou6VarR = ou6VarR.e(ou6Var2);
            }
            pn0.a(yb0.U(ou6VarR, "scrollbarContainer"), dd4Var2, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(ib4Var, ib4Var2, z, rx8Var, ou6Var2, yb4Var, i);
        }
    }

    public static final float g(float f) {
        float f2 = f * 10.0f;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return i / 10.0f;
    }

    public static final eyb h(dd4 dd4Var) {
        eyb eybVar;
        dd4Var.f0(1744179571);
        Activity activity = (Activity) dd4Var.j(o16.a);
        if (activity == null) {
            eybVar = new eyb(0.0f, 0.0f);
        } else {
            dd4Var.j(he.a);
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            a0c.a.getClass();
            b0c b0cVar = zzb.b;
            b0cVar.getClass();
            int i = Build.VERSION.SDK_INT;
            long jT = pn2Var.t(vv1.Z((i >= 34 ? rn2.b : i >= 30 ? kn0.b : wfc.A).b(activity, b0cVar.b).a()).f());
            eybVar = new eyb(a23.b(jT), a23.a(jT));
        }
        dd4Var.q(false);
        return eybVar;
    }

    public static final bz9 i(o7c o7cVar, dd4 dd4Var) {
        o7cVar.getClass();
        px5 px5VarI = ((mx5) dd4Var.j(r26.a)).i();
        boolean zF = dd4Var.f(o7cVar) | dd4Var.f(px5VarI);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new bz9(o7cVar, px5VarI);
            dd4Var.p0(objQ);
        }
        return (bz9) objQ;
    }

    public static final kk j(dd4 dd4Var) {
        b64 b64Var = (b64) dd4Var.j(xm1.k);
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
        boolean zF = dd4Var.f(b64Var) | dd4Var.f(pn2Var) | dd4Var.d(zm5Var.ordinal());
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            b64Var.getClass();
            pn2Var.getClass();
            objQ = new kk(b64Var, pn2Var, zm5Var);
            dd4Var.p0(objQ);
        }
        return (kk) objQ;
    }

    public static w7b k(w7b w7bVar, String[] strArr, Map map) {
        int i = 0;
        if (w7bVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (w7b) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                w7b w7bVar2 = new w7b();
                int length = strArr.length;
                while (i < length) {
                    w7bVar2.a((w7b) map.get(strArr[i]));
                    i++;
                }
                return w7bVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                w7bVar.a((w7b) map.get(strArr[0]));
                return w7bVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    w7bVar.a((w7b) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return w7bVar;
    }

    public static String l(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    public static final sgb m(hhb hhbVar) {
        hhbVar.getClass();
        String str = hhbVar.g;
        String str2 = hhbVar.a;
        String str3 = hhbVar.b;
        String str4 = hhbVar.c;
        int i = hhbVar.d;
        boolean z = hhbVar.e;
        List listY = hhbVar.h;
        if (listY.isEmpty()) {
            listY = str.length() > 0 ? gc1.Y(str) : lc3.a;
        }
        return new sgb(str2, str3, str4, i, z, listY);
    }

    public static void n(Object obj, int i) {
        if (obj != null) {
            return;
        }
        k27.n(tw2.r(new StringBuilder(String.valueOf(i).length() + 9), "at index ", i));
    }
}
