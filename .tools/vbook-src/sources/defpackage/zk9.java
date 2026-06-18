package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RemoteViews;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zk9 {
    public static final void a(io2 io2Var, ib4 ib4Var, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        String str = io2Var.e;
        String str2 = io2Var.a;
        ib4Var.getClass();
        dd4Var2.h0(970410875);
        int i2 = i | (dd4Var2.f(io2Var) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 32 : 16) | 384;
        if (dd4Var2.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
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
            ou6 ou6VarL = fe.L(t96.w(tg9.f(ou6Var3, 1.0f), s00.p(dd4Var2).c), dd1.g(s00.o(dd4Var2), 7.0f), jf0.G);
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new hpa(7, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarL02 = gjb.l0(yn2.s(ou6VarL, false, 0.98f, (ib4) objQ, 1), 10.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarL02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            w05.d(str2, io2Var.b, io2Var.d, ra1.d, t96.w(tg9.h(tg9.r(ou6Var3, 48.0f), 72.0f), s00.p(dd4Var2).b), dd4Var2, 3072);
            bp5 bp5VarF = j39.f(ou6Var3, 12.0f, dd4Var2, 1.0f, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, bp5VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            nha.c(str2, tg9.f(ou6Var3, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).i, dd4Var, 48, 24960, 109564);
            un9.a(dd4Var, tg9.h(ou6Var3, 4.0f));
            nha.c(io2Var.c, tg9.f(ou6Var3, 1.0f), s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 48, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
            if (str.length() > 0) {
                ky0.z(dd4Var2, 1014950492, ou6Var3, 12.0f, dd4Var2);
                nha.c(str, tg9.f(ou6Var3, 1.0f), lc1.c(0.88f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1015308945);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f47(io2Var, ib4Var, ou6Var2, i, 14);
        }
    }

    public static final void b(int i, int i2, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(241701980);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (dd4Var.f(ou6Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 3) != 2)) {
            ou6 ou6Var3 = i4 != 0 ? lu6.a : ou6Var;
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), lc1.c(0.05f, ((q96) dd4Var2.j(ur9Var)).a.a), jf0.G), 12.0f, 14.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
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
            nha.c(wn9.K((pv9) vt9.K0.getValue(), dd4Var2), (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.s, (g60) null, 0L, new t74(1), a84.t, (c64) null, 0L, jda.d, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 806879232, 0, 130458);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new a35(ou6Var2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.util.List r41, boolean r42, ou6 r43, defpackage.kb4 r44, defpackage.kb4 r45, defpackage.yb4 r46, dd4 r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk9.c(java.util.List, boolean, ou6, kb4, kb4, yb4, dd4, int, int):void");
    }

    public static final void d(mo2 mo2Var, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        long j;
        ou6 ou6Var3;
        dd4 dd4Var2 = dd4Var;
        int i2 = mo2Var.b;
        dd4Var2.h0(-708638944);
        int i3 = i | (dd4Var2.f(mo2Var) ? 4 : 2) | 48;
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6Var4 = lu6.a;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(tg9.f(ou6Var4, 1.0f), s00.p(dd4Var2).d), lc1.c(0.88f, s00.o(dd4Var2).p), jf0.G), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
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
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6Var4);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            String strK = wn9.K(s(i2), dd4Var2);
            uka ukaVar = s00.q(dd4Var2).m;
            if (i2 == 5) {
                dd4Var2.f0(1944219167);
                j = s00.o(dd4Var2).a;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1944297814);
                j = s00.o(dd4Var2).s;
                dd4Var2.q(false);
            }
            nha.c(strK, (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131066);
            un9.a(dd4Var, new bp5(1.0f, true));
            nha.c(mo2Var.a.b, (ou6) null, s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).m, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            if (bw9.a0(mo2Var.c)) {
                ou6Var3 = ou6Var4;
                dd4Var2.f0(-369746388);
                dd4Var2.q(false);
            } else {
                ky0.z(dd4Var2, -370011624, ou6Var4, 8.0f, dd4Var2);
                ou6Var3 = ou6Var4;
                nha.c(mo2Var.c, (ou6) null, lc1.c(0.84f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 0, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(mo2Var, ou6Var2, i, 16);
        }
    }

    public static final void e(no2 no2Var, ou6 ou6Var, dd4 dd4Var, int i) {
        no2 no2Var2;
        ou6 ou6Var2;
        int i2;
        pv9 pv9Var;
        dd4 dd4Var2 = dd4Var;
        int i3 = no2Var.b;
        dd4Var2.h0(-1390260552);
        int i4 = i | (dd4Var2.f(no2Var) ? 4 : 2) | 48;
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var3);
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
            ou6Var2 = ou6Var3;
            nha.c(no2Var.a, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, wn9.t(1.15d), 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var, 1572864, 48, 128958);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(ou6Var2, 10.0f));
            eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(5)), bv4.w, dd4Var2, 6);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6Var2);
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
            no2Var2 = no2Var;
            int i5 = no2Var2.c;
            if (i5 == 1) {
                i2 = 4;
                pv9Var = (pv9) iu9.f0.getValue();
            } else if (i5 == 2) {
                i2 = 4;
                pv9Var = (pv9) eu9.H0.getValue();
            } else if (i5 != 3) {
                i2 = 4;
                pv9Var = i5 != 4 ? (pv9) iu9.f0.getValue() : (pv9) vu9.D0.getValue();
            } else {
                i2 = 4;
                pv9Var = (pv9) vu9.E0.getValue();
            }
            f(wn9.K(pv9Var, dd4Var2), false, null, dd4Var2, 48, 4);
            f(wn9.K(s(i3), dd4Var2), i3 == i2, null, dd4Var2, 0, 4);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            no2Var2 = no2Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(no2Var2, ou6Var2, i, 17);
        }
    }

    public static final void f(String str, boolean z, ou6 ou6Var, dd4 dd4Var, int i, int i2) {
        ou6 ou6Var2;
        int i3;
        dd4 dd4Var2;
        ou6 ou6Var3;
        long jG;
        long jC;
        long j;
        str.getClass();
        dd4Var.h0(1282193106);
        int i4 = i | (dd4Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= dd4Var.g(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            ou6Var2 = ou6Var;
        } else {
            ou6Var2 = ou6Var;
            i3 = i4 | (dd4Var.f(ou6Var2) ? 256 : Token.CASE);
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var4 = i5 != 0 ? lu6.a : ou6Var2;
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6Var4, rp8Var);
            if (z) {
                dd4Var.f0(-1624089645);
                jG = lc1.c(0.14f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1623991375);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
                dd4Var.q(false);
            }
            ou6 ou6VarL = fe.L(ou6VarW, jG, jf0.G);
            if (z) {
                dd4Var.f0(-1623793068);
                jC = lc1.c(0.2f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1623695759);
                jC = lc1.c(0.08f, ((q96) dd4Var.j(s96.a)).a.q);
                dd4Var.q(false);
            }
            ou6 ou6VarM0 = gjb.m0(fw.G(ou6VarL, 1.0f, jC, rp8Var), 10.0f, 6.0f);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.m;
            if (z) {
                dd4Var.f0(1701556233);
                j = ((q96) dd4Var.j(ur9Var)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(1701626944);
                j = ((q96) dd4Var.j(ur9Var)).a.s;
                dd4Var.q(false);
            }
            ou6Var3 = ou6Var4;
            nha.c(str, (ou6) null, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i3 & 14, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            ou6Var3 = ou6Var2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vq6(str, z, ou6Var3, i, i2);
        }
    }

    public static final void g(boolean z, boolean z2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        boolean z3;
        dd4 dd4Var2;
        kb4 kb4Var2;
        ou6 ou6Var2;
        boolean z4;
        dd4Var.h0(-1339656121);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        byte b = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            rj1 rj1VarG = jf0.G(656998539, new e41(z, 6, b), dd4Var);
            int i4 = (i3 & 14) | 3072 | ((i3 >> 6) & Token.ASSIGN_MOD) | (i3 & 896) | ((i3 << 9) & 57344);
            ou6 ou6Var3 = lu6.a;
            z3 = z;
            dd4Var2 = dd4Var;
            z1a.a(z3, kb4Var, ou6Var3, rj1VarG, true, null, dd4Var2, i4, 96);
            kb4Var2 = kb4Var;
            ou6Var2 = ou6Var3;
            z4 = true;
        } else {
            z3 = z;
            dd4Var2 = dd4Var;
            kb4Var2 = kb4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
            z4 = z2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new w14(z3, z4, ou6Var2, kb4Var2, i);
        }
    }

    public static final long h(int i, int i2) {
        if (i < 0 || i2 < 0) {
            r75.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = pja.c;
        return j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void i(rcb rcbVar, StringBuilder sb) {
        List listY;
        sb.append(rcbVar.d().a);
        String str = rcbVar.d().a;
        boolean z = false;
        switch (str.hashCode()) {
            case -1081572750:
                if (str.equals("mailto")) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = rcbVar.e;
                    String str3 = rcbVar.f;
                    if (str2 != null) {
                        sb2.append(str2);
                        if (str3 != null) {
                            sb2.append(':');
                            sb2.append(str3);
                        }
                        sb2.append("@");
                    }
                    CharSequence string = sb2.toString();
                    CharSequence charSequence = rcbVar.a;
                    sb.append(":");
                    sb.append(string);
                    sb.append(charSequence);
                    return;
                }
                break;
            case 114715:
                if (str.equals("tel")) {
                    CharSequence charSequence2 = rcbVar.a;
                    sb.append(":");
                    sb.append(charSequence2);
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    CharSequence charSequence3 = rcbVar.a;
                    sb.append(":");
                    sb.append(charSequence3);
                    return;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    CharSequence charSequence4 = rcbVar.a;
                    String strP = p(rcbVar);
                    sb.append("://");
                    sb.append(charSequence4);
                    strP.getClass();
                    if (strP.length() > 0 && gjb.c0(strP.charAt(0), '/', false)) {
                        z = true;
                    }
                    if (!z) {
                        sb.append('/');
                    }
                    sb.append((CharSequence) strP);
                    return;
                }
                break;
            case 92611469:
                if (str.equals("about")) {
                    CharSequence charSequence5 = rcbVar.a;
                    sb.append(":");
                    sb.append(charSequence5);
                    return;
                }
                break;
        }
        sb.append("://");
        sb.append(o(rcbVar));
        String strP2 = p(rcbVar);
        qm7 qm7Var = rcbVar.i;
        boolean z2 = rcbVar.b;
        strP2.getClass();
        qm7Var.getClass();
        if (!bw9.a0(strP2) && !iw9.K(strP2, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) strP2);
        if (!((Map) ((yf1) qm7Var).a).isEmpty() || z2) {
            sb.append("?");
        }
        Set setB = qm7Var.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = setB.iterator();
        while (true) {
            int i = 10;
            if (!it.hasNext()) {
                fc1.C0(arrayList, sb, "&", new t3b(i), 60);
                if (rcbVar.g.length() > 0) {
                    sb.append('#');
                    sb.append(rcbVar.g);
                    return;
                }
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listY = gc1.Y(new xl7(str4, null));
            } else {
                ArrayList arrayList2 = new ArrayList(gc1.M(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new xl7(str4, (String) it2.next()));
                }
                listY = arrayList2;
            }
            fc1.p0(arrayList, listY);
        }
    }

    public static al9 j(List list, List list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            int size = list3.size();
            int i = 0;
            while (i < size) {
                int iIntValue = ((Number) list3.get(i)).intValue();
                i++;
                int iIntValue2 = ((Number) list3.get(i % list3.size())).intValue();
                linkedHashSet.add(iIntValue < iIntValue2 ? new xl7(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)) : new xl7(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue)));
            }
        }
        return new al9(list, list2, fc1.Z0(linkedHashSet));
    }

    public static final ds9 k(List list, kb4 kb4Var, mua muaVar) {
        int i = 0;
        List<oc8> listR0 = f39.r0(new vx3(new jc1(list, i), true, new k49(3, muaVar, kb4Var)));
        ArrayList arrayList = new ArrayList(gc1.M(listR0, 10));
        for (oc8 oc8Var : listR0) {
            arrayList.add(new bs9(oc8Var.c, oc8Var.a, oc8Var.b));
        }
        int size = arrayList.size();
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j2 += ((bs9) obj).b;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            j += ((bs9) obj2).c;
        }
        ix2 ix2Var = new ix2(new jh(new r04(new jc1(listR0, i), new hy7(muaVar, 29))), new f48(22));
        while (ix2Var.hasNext()) {
            ix2Var.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return new ds9(j2, j, i < 1 ? 1 : i, arrayList);
    }

    public static final int l(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final long m(int i, long j) {
        int i2 = pja.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : h(i4, i);
    }

    public static final mx5 n(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131362476);
            mx5 mx5Var = tag instanceof mx5 ? (mx5) tag : null;
            if (mx5Var != null) {
                return mx5Var;
            }
            Object objS = dk9.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final String o(rcb rcbVar) {
        rcbVar.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = rcbVar.e;
        String str2 = rcbVar.f;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        sb.append(sb2.toString());
        sb.append(rcbVar.a);
        int i = rcbVar.c;
        if (i != 0 && i != rcbVar.d().b) {
            sb.append(":");
            sb.append(String.valueOf(rcbVar.c));
        }
        return sb.toString();
    }

    public static final String p(rcb rcbVar) {
        List list = rcbVar.h;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) fc1.x0(list)).length() == 0 ? "/" : (String) fc1.x0(list) : fc1.D0(list, "/", null, null, null, 62);
    }

    public static final int q(RemoteViews remoteViews, o5b o5bVar, int i, int i2, Integer num) {
        if (i == -1) {
            gp.l("viewStubId must not be View.NO_ID");
            return 0;
        }
        int iIntValue = num != null ? num.intValue() : o5bVar.g.incrementAndGet();
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static final void r(Context context) {
        Map mapSingletonMap;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            cp4.k().d(h1c.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = h1c.b;
            int iO = y86.O(strArr.length);
            if (iO < 16) {
                iO = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath2, noBackupFilesDir);
                mapSingletonMap.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        cp4.k().p(h1c.a, "Over-writing contents of " + file2);
                    }
                    cp4.k().d(h1c.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final pv9 s(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? (pv9) zt9.R.getValue() : (pv9) zt9.T.getValue() : (pv9) zt9.S.getValue() : (pv9) zt9.P.getValue() : (pv9) zt9.Q.getValue();
    }

    public static final void t(rcb rcbVar, String str) {
        rcbVar.getClass();
        str.getClass();
        List arrayList = bw9.a0(str) ? lc3.a : str.equals("/") ? scb.a : new ArrayList(bw9.o0(str, new char[]{'/'}, 0, 6));
        arrayList.getClass();
        rcbVar.h = arrayList;
    }

    public static Object u(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            mn5.k(e);
            return null;
        }
    }
}
