package defpackage;

import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class sp6 {
    public static final List a = gc1.Z(4294967295L, 4294961979L, 4278248959L, 4294934699L, 4287349578L, 4294944550L);
    public static final List b = gc1.Z(0L, 4278190080L, 4282532418L, 4294967295L);

    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public static final void a(List list, long j, kb4 kb4Var, dd4 dd4Var, int i) {
        long jC;
        ?? r15;
        dd4Var.h0(76104456);
        int i2 = i | (dd4Var.h(list) ? 4 : 2) | (dd4Var.e(j) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        boolean z = true;
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(new mv(10.0f, true, new gp(5)), bv4.w, dd4Var, 6);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            dd4Var.f0(1327755804);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                boolean z2 = jLongValue == j ? z : false;
                long j2 = ah1.j((int) jLongValue);
                ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
                rp8 rp8Var = tp8.a;
                ou6 ou6VarL = fe.L(t96.w(ou6VarN, rp8Var), j2, jf0.G);
                float f = z2 ? 2.0f : 1.0f;
                if (z2) {
                    dd4Var.f0(-1675102718);
                    jC = ((q96) dd4Var.j(s96.a)).a.a;
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1675007827);
                    jC = lc1.c(0.3f, ((q96) dd4Var.j(s96.a)).a.q);
                    dd4Var.q(false);
                }
                ou6 ou6VarG = fw.G(ou6VarL, f, jC, rp8Var);
                boolean zE = dd4Var.e(jLongValue) | ((i2 & 896) == 256);
                Object objQ = dd4Var.Q();
                if (zE || objQ == vl1.a) {
                    r15 = 0;
                    objQ = new jp6(kb4Var, jLongValue, 0);
                    dd4Var.p0(objQ);
                } else {
                    r15 = 0;
                }
                pn0.a(fw.J(null, (ib4) objQ, ou6VarG, r15, 15), dd4Var, (int) r15);
                z = true;
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kp6(list, j, kb4Var, i, 0);
        }
    }

    public static final void b(String str, float f, bb1 bb1Var, String str2, kb4 kb4Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1403100186);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.c(f) ? 32 : 16) | (dd4Var2.f(bb1Var) ? 256 : Token.CASE) | (dd4Var2.f(str2) ? 2048 : 1024) | (dd4Var2.h(kb4Var) ? 16384 : 8192);
        if (dd4Var2.V(i2 & 1, (i2 & 9363) != 9362)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarF);
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
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, lu6Var);
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
            ur9 ur9Var = s96.a;
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, i2 & 14, 0, 131068);
            int i3 = i2 >> 9;
            nha.c(str2, (ou6) null, lc1.c(0.7f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, i3 & 14, 0, 131066);
            dd4Var.q(true);
            vh9 vh9Var = vh9.a;
            dd4Var2 = dd4Var;
            yb0.u(f, kb4Var, tg9.f(lu6Var, 1.0f), false, null, vh9.d(0L, 0L, lc1.c(0.2f, ((q96) dd4Var.j(ur9Var)).a.a), dd4Var, 1015), null, 0, null, null, bb1Var, dd4Var2, ((i2 >> 3) & 14) | 384 | (i3 & Token.ASSIGN_MOD), (i2 >> 6) & 14, 984);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lp6(str, f, bb1Var, str2, kb4Var, i);
        }
    }

    public static final void c(final boolean z, final boolean z2, final onb onbVar, final List list, final int i, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, final kb4 kb4Var9, dd4 dd4Var, final int i2) {
        dd4 dd4Var2 = dd4Var;
        onbVar.getClass();
        list.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        kb4Var6.getClass();
        kb4Var7.getClass();
        kb4Var8.getClass();
        kb4Var9.getClass();
        dd4Var2.h0(1325025655);
        int i3 = i2 | (dd4Var2.g(z) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.f(onbVar) ? 256 : Token.CASE) | (dd4Var2.h(list) ? 2048 : 1024) | (dd4Var2.d(i) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288) | (dd4Var2.h(kb4Var3) ? 8388608 : 4194304) | (dd4Var2.h(kb4Var4) ? 67108864 : 33554432) | (dd4Var2.h(kb4Var5) ? 536870912 : 268435456);
        boolean z3 = true;
        if (dd4Var2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (((((dd4Var2.h(kb4Var6) ? (char) 4 : (char) 2) | (dd4Var2.h(kb4Var7) ? ' ' : (char) 16)) | (dd4Var2.h(kb4Var8) ? 256 : Token.CASE)) | (dd4Var2.h(kb4Var9) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            if (z2) {
                dd4Var2.f0(-1204511858);
            } else {
                dd4Var2.f0(2039355189);
                z3 = !xzb.a(dd4Var2);
            }
            dd4Var2.q(false);
            if (z3) {
                dd4Var2.f0(-1204427093);
                fw.r(z, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(668386563, new yb4() { // from class: ip6
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj, Object obj2) {
                        dd4 dd4Var3 = (dd4) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (dd4Var3.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                            px3 px3Var = tg9.c;
                            ou6 ou6VarK0 = gjb.k0(px3Var, yib.d(13, dd4Var3, false));
                            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                            int iHashCode = Long.hashCode(dd4Var3.T);
                            lr7 lr7VarL = dd4Var3.l();
                            ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarK0);
                            ml1.k.getClass();
                            um1 um1Var = ll1.b;
                            dd4Var3.j0();
                            if (dd4Var3.S) {
                                dd4Var3.k(um1Var);
                            } else {
                                dd4Var3.s0();
                            }
                            un9.s(ll1.f, dd4Var3, ie1VarA);
                            un9.s(ll1.e, dd4Var3, lr7VarL);
                            un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                            un9.r(dd4Var3, ll1.h);
                            un9.s(ll1.d, dd4Var3, ou6VarL0);
                            sp6.e(dd4Var3, 0);
                            sp6.d(onbVar, list, i, kc5.Q(px3Var, kc5.J(dd4Var3), 14), kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, dd4Var3, 0);
                            dd4Var3.q(true);
                        } else {
                            dd4Var3.Y();
                        }
                        return heb.a;
                    }
                }, dd4Var2), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 12) & Token.ASSIGN_MOD), 500);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
            } else {
                dd4Var2.f0(-1203106059);
                px3 px3Var = tg9.c;
                rj1 rj1VarG = jf0.G(889463793, new zb4() { // from class: np6
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        co0 co0Var = (co0) obj;
                        dd4 dd4Var3 = (dd4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        co0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= dd4Var3.f(co0Var) ? 4 : 2;
                        }
                        if (dd4Var3.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ou6 ou6VarH = tg9.h(lu6.a, (co0Var.c() * 2.0f) / 3.0f);
                            long j = ((q96) dd4Var3.j(s96.a)).a.p;
                            rj1 rj1Var = jf0.u;
                            final onb onbVar2 = onbVar;
                            final List list2 = list;
                            final int i4 = i;
                            final kb4 kb4Var10 = kb4Var2;
                            final kb4 kb4Var11 = kb4Var3;
                            final kb4 kb4Var12 = kb4Var4;
                            final kb4 kb4Var13 = kb4Var5;
                            final kb4 kb4Var14 = kb4Var6;
                            final kb4 kb4Var15 = kb4Var7;
                            final kb4 kb4Var16 = kb4Var8;
                            final kb4 kb4Var17 = kb4Var9;
                            fw.q(z, kb4Var, ou6VarH, true, null, null, j, 0L, 0.0f, 0L, rj1Var, jf0.G(1053010765, new zb4() { // from class: rp6
                                @Override // defpackage.zb4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    dd4 dd4Var4 = (dd4) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((ke1) obj4).getClass();
                                    if (dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lu6 lu6Var = lu6.a;
                                        ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var4), 14);
                                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var4, 0);
                                        int iHashCode = Long.hashCode(dd4Var4.T);
                                        lr7 lr7VarL = dd4Var4.l();
                                        ou6 ou6VarL0 = s32.L0(dd4Var4, ou6VarQ);
                                        ml1.k.getClass();
                                        um1 um1Var = ll1.b;
                                        dd4Var4.j0();
                                        if (dd4Var4.S) {
                                            dd4Var4.k(um1Var);
                                        } else {
                                            dd4Var4.s0();
                                        }
                                        un9.s(ll1.f, dd4Var4, ie1VarA);
                                        un9.s(ll1.e, dd4Var4, lr7VarL);
                                        un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode));
                                        un9.r(dd4Var4, ll1.h);
                                        un9.s(ll1.d, dd4Var4, ou6VarL0);
                                        sp6.d(onbVar2, list2, i4, gjb.k0(tg9.f(lu6Var, 1.0f), yib.d(6, dd4Var4, false)), kb4Var10, kb4Var11, kb4Var12, kb4Var13, kb4Var14, kb4Var15, kb4Var16, kb4Var17, dd4Var4, 0);
                                        un9.a(dd4Var4, tg9.h(lu6Var, yib.z(dd4Var4) + 8.0f));
                                        dd4Var4.q(true);
                                    } else {
                                        dd4Var4.Y();
                                    }
                                    return heb.a;
                                }
                            }, dd4Var3), dd4Var3, 3072, 54, 944);
                        } else {
                            dd4Var3.Y();
                        }
                        return heb.a;
                    }
                }, dd4Var2);
                dd4Var2 = dd4Var2;
                sdc.e(px3Var, null, rj1VarG, dd4Var2, 3078, 6);
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, onbVar, list, i, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, i2) { // from class: op6
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ onb c;
                public final /* synthetic */ List d;
                public final /* synthetic */ int e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ kb4 t;
                public final /* synthetic */ kb4 u;
                public final /* synthetic */ kb4 v;
                public final /* synthetic */ kb4 w;
                public final /* synthetic */ kb4 x;
                public final /* synthetic */ kb4 y;
                public final /* synthetic */ kb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    sp6.c(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void d(final onb onbVar, final List list, final int i, ou6 ou6Var, final kb4 kb4Var, kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        dd4Var.h0(-2046640793);
        int i3 = i2 | (dd4Var.f(onbVar) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.d(i) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var3) ? 1048576 : 524288) | (dd4Var.h(kb4Var4) ? 8388608 : 4194304) | (dd4Var.h(kb4Var5) ? 67108864 : 33554432) | (dd4Var.h(kb4Var6) ? 536870912 : 268435456);
        if (dd4Var.V(i3 & 1, ((306783379 & i3) == 306783378 && (((dd4Var.h(kb4Var7) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var8) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 12.0f, 0.0f, 2);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL02 = gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 3.0f), jf0.G), 12.0f);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL02);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            g(onbVar.g, wn9.K((pv9) ev9.u0.getValue(), dd4Var), kb4Var2, dd4Var, (i3 >> 9) & 896);
            dd4Var.q(true);
            dd4Var2 = dd4Var;
            kf0.e(onbVar.g, (ou6) null, wd3.c((by3) null, 3).a(wd3.b()), wd3.d((by3) null, 3).a(wd3.i()), (String) null, jf0.G(-1629365835, new zb4() { // from class: pp6
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    lp4 lp4Var;
                    ou6 ou6Var2;
                    vf0 vf0Var2;
                    jv jvVar2;
                    yb4 yb4Var;
                    kd kdVar2;
                    jm jmVar5;
                    ib4 ib4Var;
                    yb4 yb4Var2;
                    yb4 yb4Var3;
                    boolean z;
                    ib4 ib4Var2;
                    lp4 lp4Var2 = jf0.G;
                    dd4 dd4Var3 = (dd4) obj2;
                    ((Integer) obj3).getClass();
                    ((co) obj).getClass();
                    ou6 ou6Var3 = lu6.a;
                    ou6 ou6VarF2 = tg9.f(ou6Var3, 1.0f);
                    vf0 vf0Var3 = bv4.z;
                    jv jvVar3 = pv.c;
                    ie1 ie1VarA3 = ge1.a(jvVar3, vf0Var3, dd4Var3, 0);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarF2);
                    ml1.k.getClass();
                    ib4 ib4Var3 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(ib4Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    yb4 yb4Var4 = ll1.f;
                    un9.s(yb4Var4, dd4Var3, ie1VarA3);
                    yb4 yb4Var5 = ll1.e;
                    un9.s(yb4Var5, dd4Var3, lr7VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    jm jmVar6 = ll1.g;
                    un9.s(jmVar6, dd4Var3, numValueOf2);
                    kd kdVar3 = ll1.h;
                    un9.r(dd4Var3, kdVar3);
                    yb4 yb4Var6 = ll1.d;
                    un9.s(yb4Var6, dd4Var3, ou6VarL04);
                    List list2 = list;
                    if (list2.isEmpty()) {
                        lp4Var = lp4Var2;
                        ou6Var2 = ou6Var3;
                        vf0Var2 = vf0Var3;
                        jvVar2 = jvVar3;
                        yb4Var = yb4Var5;
                        kdVar2 = kdVar3;
                        jmVar5 = jmVar6;
                        ib4Var = ib4Var3;
                        yb4Var2 = yb4Var4;
                        yb4Var3 = yb4Var6;
                        z = true;
                        dd4Var3.f0(-1372791529);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(-1373710245);
                        un9.a(dd4Var3, tg9.h(ou6Var3, 12.0f));
                        ou6 ou6VarF3 = tg9.f(ou6Var3, 1.0f);
                        ur9 ur9Var2 = s96.a;
                        ou6 ou6VarL05 = gjb.l0(fe.L(t96.w(ou6VarF3, ((q96) dd4Var3.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var3.j(ur9Var2)).a, 3.0f), lp4Var2), 12.0f);
                        ie1 ie1VarA4 = ge1.a(jvVar3, vf0Var3, dd4Var3, 0);
                        int iHashCode4 = Long.hashCode(dd4Var3.T);
                        lr7 lr7VarL4 = dd4Var3.l();
                        ou6 ou6VarL06 = s32.L0(dd4Var3, ou6VarL05);
                        dd4Var3.j0();
                        if (dd4Var3.S) {
                            dd4Var3.k(ib4Var3);
                        } else {
                            dd4Var3.s0();
                        }
                        un9.s(yb4Var4, dd4Var3, ie1VarA4);
                        un9.s(yb4Var5, dd4Var3, lr7VarL4);
                        dx1.r(iHashCode4, dd4Var3, jmVar6, dd4Var3, kdVar3);
                        un9.s(yb4Var6, dd4Var3, ou6VarL06);
                        ib4Var = ib4Var3;
                        yb4Var3 = yb4Var6;
                        jvVar2 = jvVar3;
                        vf0Var2 = vf0Var3;
                        yb4Var = yb4Var5;
                        kdVar2 = kdVar3;
                        jmVar5 = jmVar6;
                        yb4Var2 = yb4Var4;
                        lp4Var = lp4Var2;
                        nha.c(wn9.K((pv9) ev9.H0.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var2)).b.j, dd4Var3, 0, 0, 131070);
                        dd4Var3 = dd4Var3;
                        ou6Var2 = ou6Var3;
                        un9.a(dd4Var3, tg9.h(ou6Var2, 8.0f));
                        sp6.f(list2, i, kb4Var, dd4Var3, 0);
                        z = true;
                        dd4Var3.q(true);
                        dd4Var3.q(false);
                    }
                    un9.a(dd4Var3, tg9.h(ou6Var2, 12.0f));
                    lp4 lp4Var3 = lp4Var;
                    ou6 ou6VarL07 = gjb.l0(fe.L(t96.w(tg9.f(ou6Var2, 1.0f), s00.p(dd4Var3).c), dd1.g(s00.o(dd4Var3), 3.0f), lp4Var3), 12.0f);
                    vf0 vf0Var4 = vf0Var2;
                    jv jvVar4 = jvVar2;
                    ie1 ie1VarA5 = ge1.a(jvVar4, vf0Var4, dd4Var3, 0);
                    int iHashCode5 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL5 = dd4Var3.l();
                    ou6 ou6VarL08 = s32.L0(dd4Var3, ou6VarL07);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        ib4Var2 = ib4Var;
                        dd4Var3.k(ib4Var2);
                    } else {
                        ib4Var2 = ib4Var;
                        dd4Var3.s0();
                    }
                    boolean z2 = z;
                    yb4 yb4Var7 = yb4Var2;
                    un9.s(yb4Var7, dd4Var3, ie1VarA5);
                    un9.s(yb4Var, dd4Var3, lr7VarL5);
                    kd kdVar4 = kdVar2;
                    dx1.r(iHashCode5, dd4Var3, jmVar5, dd4Var3, kdVar4);
                    un9.s(yb4Var3, dd4Var3, ou6VarL08);
                    ou6 ou6Var4 = ou6Var2;
                    dd4 dd4Var4 = dd4Var3;
                    ib4 ib4Var4 = ib4Var2;
                    yb4 yb4Var8 = yb4Var;
                    jm jmVar7 = jmVar5;
                    yb4 yb4Var9 = yb4Var3;
                    nha.c(wn9.K((pv9) ev9.F0.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var4, 0, 0, 131070);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 8.0f));
                    List list3 = sp6.a;
                    onb onbVar2 = onbVar;
                    sp6.a(list3, onbVar2.j, kb4Var5, dd4Var4, 0);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 12.0f));
                    nha.c(wn9.K((pv9) ev9.x0.getValue(), dd4Var4), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var4).j, dd4Var4, 0, 0, 131070);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 8.0f));
                    sp6.a(sp6.b, onbVar2.k, kb4Var6, dd4Var4, 0);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 12.0f));
                    nha.c(wn9.K((pv9) ev9.C0.getValue(), dd4Var4), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var4).j, dd4Var4, 0, 0, 131070);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 8.0f));
                    Object objQ = dd4Var4.Q();
                    fu6 fu6Var = vl1.a;
                    Object obj4 = objQ;
                    if (objQ == fu6Var) {
                        List listZ = gc1.Z(0, Integer.valueOf(z2 ? 1 : 0), 2);
                        dd4Var4.p0(listZ);
                        obj4 = listZ;
                    }
                    List list4 = (List) obj4;
                    List listZ2 = gc1.Z(wn9.K((pv9) ev9.B0.getValue(), dd4Var4), wn9.K((pv9) ev9.A0.getValue(), dd4Var4), wn9.K((pv9) ev9.z0.getValue(), dd4Var4));
                    int iIndexOf = list4.indexOf(Integer.valueOf(onbVar2.l));
                    if (iIndexOf < 0) {
                        iIndexOf = 0;
                    }
                    kb4 kb4Var9 = kb4Var7;
                    boolean zF = dd4Var4.f(kb4Var9) | dd4Var4.h(list4);
                    Object objQ2 = dd4Var4.Q();
                    Object obj5 = objQ2;
                    if (zF || objQ2 == fu6Var) {
                        qp0 qp0Var = new qp0(kb4Var9, list4, 4);
                        dd4Var4.p0(qp0Var);
                        obj5 = qp0Var;
                    }
                    rw1.C(iIndexOf, 0, (kb4) obj5, dd4Var4, fe.L(t96.w(tg9.f(ou6Var4, 1.0f), s00.p(dd4Var4).c), dd1.g(s00.o(dd4Var4), 6.0f), lp4Var3), listZ2);
                    dd4Var4.q(z2);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 12.0f));
                    ou6 ou6VarL09 = gjb.l0(fe.L(t96.w(tg9.f(ou6Var4, 1.0f), s00.p(dd4Var4).c), dd1.g(s00.o(dd4Var4), 3.0f), lp4Var3), 12.0f);
                    ie1 ie1VarA6 = ge1.a(jvVar4, vf0Var4, dd4Var4, 0);
                    int iHashCode6 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL6 = dd4Var4.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var4, ou6VarL09);
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(ib4Var4);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(yb4Var7, dd4Var4, ie1VarA6);
                    un9.s(yb4Var8, dd4Var4, lr7VarL6);
                    dx1.r(iHashCode6, dd4Var4, jmVar7, dd4Var4, kdVar4);
                    un9.s(yb4Var9, dd4Var4, ou6VarL010);
                    String strK = wn9.K((pv9) ev9.G0.getValue(), dd4Var4);
                    float f = onbVar2.h;
                    sp6.b(strK, f, new bb1(0.5f, 2.5f), ((int) (f * 100.0f)) + "%", kb4Var3, dd4Var4, 0);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 8.0f));
                    sp6.b(wn9.K((pv9) ev9.y0.getValue(), dd4Var4), onbVar2.i, new bb1(0.0f, 1.0f), wn9.L(mu9.a(), new Object[]{Integer.valueOf((int) (onbVar2.i * 100.0f))}, dd4Var4), kb4Var4, dd4Var4, 0);
                    un9.a(dd4Var4, tg9.h(ou6Var4, 8.0f));
                    String strK2 = wn9.K((pv9) ev9.E0.getValue(), dd4Var4);
                    float f2 = onbVar2.m;
                    sp6.b(strK2, f2, new bb1(0.0f, 120.0f), ((int) f2) + "dp", kb4Var8, dd4Var4, 0);
                    dd4Var4.q(true);
                    dd4Var4.q(true);
                    return heb.a;
                }
            }, dd4Var), dd4Var2, 1600518, 18);
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new u03(onbVar, list, i, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, i2);
        }
    }

    public static final void e(dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(752083641);
        if (dd4Var2.V(i & 1, i != 0)) {
            ou6 ou6VarL0 = gjb.l0(tg9.f(lu6.a, 1.0f), 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.w0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var, 0, 0, 131070);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qp6(i, 0);
        }
    }

    public static final void f(List list, int i, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1099172698);
        int i3 = (dd4Var.h(list) ? 4 : 2) | i2 | (dd4Var.d(i) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            yn2.b(tg9.f(lu6.a, 1.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(1611164757, new mp6(i, kb4Var, wn9.K((pv9) ev9.D0.getValue(), dd4Var), list), dd4Var), dd4Var, 1573302);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ph1(i, i2, kb4Var, list);
        }
    }

    public static final void g(boolean z, String str, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1163059332);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 256 : Token.CASE;
        }
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            int i3 = i2 & 14;
            boolean z2 = (i3 == 4) | ((i2 & 896) == 256);
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ck0(10, kb4Var, z);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ, dd4Var2, ou6VarF, false);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarV);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var2, (i2 >> 3) & 14, 0, 131068);
            dd4Var2 = dd4Var;
            zk9.g(z, false, null, kb4Var, dd4Var2, i3 | ((i2 << 3) & 7168));
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uu1(z, str, kb4Var, i, 5);
        }
    }

    public static final void h(String str, boolean z, ib4 ib4Var, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        long jG;
        long jC;
        long j;
        dd4Var.h0(-1021932650);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            if (z) {
                dd4Var.f0(-1667255992);
                jG = lc1.c(0.2f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1667182491);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
                dd4Var.q(false);
            }
            if (z) {
                dd4Var.f0(-1667075448);
                jC = lc1.c(0.6f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1667002040);
                jC = lc1.c(0.2f, ((q96) dd4Var.j(s96.a)).a.A);
                dd4Var.q(false);
            }
            if (z) {
                dd4Var.f0(-1666900453);
                j = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1666845831);
                j = ((q96) dd4Var.j(s96.a)).a.q;
                dd4Var.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fw.J(null, ib4Var, fw.G(fe.L(t96.w(lu6.a, ((q96) dd4Var.j(ur9Var)).c.c), jG, jf0.G), 1.0f, jC, ((q96) dd4Var.j(ur9Var)).c.c), false, 15), 14.0f, 8.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM0);
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
            nha.c(str, (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, i2 & 14, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mk6(str, z, ib4Var, i, 1);
        }
    }
}
