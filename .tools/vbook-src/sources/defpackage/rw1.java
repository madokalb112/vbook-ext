package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class rw1 {
    public static p35 a;
    public static ng b;
    public static rc c;
    public static hy0 d;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03bd A[LOOP:1: B:141:0x03bb->B:142:0x03bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03dc A[LOOP:2: B:144:0x03da->B:145:0x03dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0400 A[LOOP:3: B:147:0x03fe->B:148:0x0400, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0427 A[LOOP:4: B:150:0x0423->B:152:0x0427, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x045b A[LOOP:5: B:154:0x0459->B:155:0x045b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044c A[EDGE_INSN: B:187:0x044c->B:153:0x044c BREAK  A[LOOP:4: B:150:0x0423->B:152:0x0427], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final defpackage.s5b r43, final int r44, final int r45, final ou6 r46, final defpackage.zb4 r47, defpackage.kb4 r48, dd4 r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.A(s5b, int, int, ou6, zb4, kb4, dd4, int, int):void");
    }

    public static final void B(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t89 t89Var, uka ukaVar, String str, boolean z) {
        ou6 ou6Var2;
        t89 t89Var2;
        uka ukaVar2;
        t89 t89Var3;
        int i2;
        ou6 ou6Var3;
        uka ukaVar3;
        long j;
        long jG;
        long jC;
        dd4Var.h0(1652411205);
        int i3 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | 9600 | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                ur9 ur9Var = s96.a;
                uka ukaVar4 = ((q96) dd4Var.j(ur9Var)).b.k;
                t89Var3 = ((q96) dd4Var.j(ur9Var)).c.c;
                i2 = i3 & (-64513);
                ou6Var3 = lu6.a;
                ukaVar3 = ukaVar4;
            } else {
                dd4Var.Y();
                t89Var3 = t89Var;
                ukaVar3 = ukaVar;
                i2 = i3 & (-64513);
                ou6Var3 = ou6Var;
            }
            dd4Var.r();
            if (z) {
                dd4Var.f0(-1932617001);
                j = ((q96) dd4Var.j(s96.a)).a.i;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1932541950);
                j = ((q96) dd4Var.j(s96.a)).a.q;
                dd4Var.q(false);
            }
            boolean z2 = (458752 & i2) == 131072;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new i35(20, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarW = t96.w(yn2.s(ou6Var3, false, 0.0f, (ib4) objQ, 3), t89Var3);
            if (z) {
                dd4Var.f0(-1932326903);
                jG = ((q96) dd4Var.j(s96.a)).a.h;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1932237282);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 4.0f);
                dd4Var.q(false);
            }
            ou6 ou6VarL = fe.L(ou6VarW, jG, t89Var3);
            if (z) {
                dd4Var.f0(-1932008471);
                jC = ((q96) dd4Var.j(s96.a)).a.h;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1931918850);
                jC = lc1.c(0.08f, ((q96) dd4Var.j(s96.a)).a.q);
                dd4Var.q(false);
            }
            ou6 ou6Var4 = ou6Var3;
            nha.c(str, gjb.m0(fw.G(ou6VarL, 1.0f, jC, t89Var3), 12.0f, 6.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar3, dd4Var, i2 & 14, 0, 131064);
            t89Var2 = t89Var3;
            ukaVar2 = ukaVar3;
            ou6Var2 = ou6Var4;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            t89Var2 = t89Var;
            ukaVar2 = ukaVar;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(i, ib4Var, ou6Var2, t89Var2, ukaVar2, str, z);
        }
    }

    public static final void C(int i, int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, List list) {
        dd4 dd4Var2;
        kb4Var.getClass();
        dd4Var.h0(1689800523);
        int i3 = (dd4Var.d(i) ? 4 : 2) | i2 | (dd4Var.h(list) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var2 = dd4Var;
            sdc.e(ou6Var, null, jf0.G(690098613, new ll6(i, list, kb4Var, i4), dd4Var), dd4Var2, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new in6(i, list, kb4Var, ou6Var, i2);
        }
    }

    public static final void D(List list, ou6 ou6Var, yb4 yb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        lu6 lu6Var;
        Object obj;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1659848749);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(yb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
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
            ou6 ou6VarA = kc5.A(ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true), kc5.J(dd4Var2), 14);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(1057685664);
            int size = list.size();
            int i3 = 0;
            while (true) {
                lu6Var = lu6.a;
                obj = vl1.a;
                if (i3 >= size) {
                    break;
                }
                cpa cpaVar = (cpa) list.get(i3);
                String str = cpaVar.a;
                ur9 ur9Var = s96.a;
                uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
                long j = ((q96) dd4Var2.j(ur9Var)).a.q;
                ou6 ou6VarW = t96.w(lu6Var, ((q96) dd4Var2.j(ur9Var)).c.b);
                boolean zF = ((i2 & 896) == 256) | dd4Var2.f(cpaVar);
                Object objQ = dd4Var2.Q();
                if (zF || objQ == obj) {
                    objQ = new vf6(22, yb4Var, cpaVar);
                    dd4Var2.p0(objQ);
                }
                nha.c(str, gjb.m0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f, 2.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131064);
                i3++;
                dd4Var2 = dd4Var;
                i2 = i2;
            }
            int i4 = i2;
            dd4 dd4Var3 = dd4Var2;
            dd4Var3.q(false);
            dd4Var3.q(true);
            p35 p35VarC = i25.c((m53) f53.m0.getValue(), dd4Var3, 0);
            long j2 = ((q96) dd4Var3.j(s96.a)).a.q;
            ou6 ou6VarW2 = t96.w(tg9.n(gjb.p0(lu6Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), tp8.a);
            boolean z = (i4 & 7168) == 2048;
            Object objQ2 = dd4Var3.Q();
            if (z || objQ2 == obj) {
                objQ2 = new pm6(27, ib4Var);
                dd4Var3.p0(objQ2);
            }
            dd4Var2 = dd4Var3;
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 4.0f), j2, dd4Var2, 48, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50((Object) list, ou6Var, (ub4) yb4Var, (ub4) ib4Var, i, 11);
        }
    }

    public static final void E(List list, ou6 ou6Var, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i) {
        int i2;
        kb4 kb4Var2;
        Object obj;
        f9 f9Var;
        f9 f9Var2;
        int i3;
        List list2 = list;
        dd4 dd4Var2 = dd4Var;
        f9 f9Var3 = bv4.d;
        f9 f9Var4 = bv4.f;
        dd4Var2.h0(512055462);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.h(list2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(yb4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
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
            ou6 ou6VarA = kc5.A(ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true), kc5.J(dd4Var2), 14);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var2, 0);
            f9 f9Var5 = f9Var4;
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(2040774038);
            int size = list2.size();
            int i4 = 0;
            while (true) {
                obj = vl1.a;
                if (i4 >= size) {
                    break;
                }
                bpa bpaVar = (bpa) list2.get(i4);
                uw1 uw1Var = s00.p(dd4Var2).b;
                lu6 lu6Var = lu6.a;
                ou6 ou6VarH = tg9.h(t96.w(lu6Var, uw1Var), 30.0f);
                boolean zF = ((i2 & 7168) == 2048) | dd4Var2.f(bpaVar);
                Object objQ = dd4Var2.Q();
                if (zF || objQ == obj) {
                    objQ = new xn6(yb4Var, bpaVar, 1);
                    dd4Var2.p0(objQ);
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarH, false, 15);
                xf0 xf0Var = bv4.b;
                ha6 ha6VarD = pn0.d(xf0Var, false);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarJ);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var2.j0();
                int i5 = size;
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var2);
                } else {
                    dd4Var2.s0();
                }
                jm jmVar5 = ll1.f;
                un9.s(jmVar5, dd4Var2, ha6VarD);
                jm jmVar6 = ll1.e;
                un9.s(jmVar6, dd4Var2, lr7VarL3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                jm jmVar7 = ll1.g;
                un9.s(jmVar7, dd4Var2, numValueOf2);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var2, kdVar2);
                jm jmVar8 = ll1.d;
                un9.s(jmVar8, dd4Var2, ou6VarL03);
                String str = bpaVar.a;
                int i6 = i4;
                String str2 = bpaVar.a;
                int length = str.length();
                zn0 zn0Var = zn0.a;
                if (length <= 0 || lc5.Q(str2, "qt")) {
                    f9Var = f9Var5;
                    int i7 = i2;
                    f9 f9Var6 = f9Var3;
                    if (bpaVar.b.length() > 0) {
                        dd4Var2.f0(-1975342930);
                        ou6 ou6VarN0 = gjb.n0(tg9.h(lu6Var, 30.0f), 4.0f, 0.0f, 2);
                        ha6 ha6VarD2 = pn0.d(xf0Var, false);
                        int iHashCode4 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL4 = dd4Var2.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarN0);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var2);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar5, dd4Var2, ha6VarD2);
                        un9.s(jmVar6, dd4Var2, lr7VarL4);
                        ky0.v(iHashCode4, dd4Var2, jmVar7, dd4Var2, kdVar2);
                        un9.s(jmVar8, dd4Var2, ou6VarL04);
                        String str3 = bpaVar.b;
                        uka ukaVar = s00.q(dd4Var2).k;
                        long j = s00.o(dd4Var2).q;
                        ou6 ou6VarN02 = gjb.n0(zn0Var.a(lu6Var, f9Var), 4.0f, 0.0f, 2);
                        i3 = i7;
                        f9Var2 = f9Var6;
                        f9Var = f9Var;
                        nha.c(str3, ou6VarN02, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131064);
                        nha.c(bpaVar.c, zn0Var.a(lu6Var, f9Var2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).o, dd4Var, 0, 0, 131064);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                    } else {
                        f9Var2 = f9Var6;
                        i3 = i7;
                        dd4Var2.f0(-1974238834);
                        String upperCase = bpaVar.c.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        nha.c(upperCase, gjb.n0(zn0Var.a(lu6Var, f9Var), 8.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 0, 0, 130040);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(false);
                        dd4Var2.q(true);
                        list2 = list;
                        f9Var3 = f9Var2;
                        i4 = i6 + 1;
                        size = i5;
                        i2 = i3;
                        f9Var5 = f9Var;
                    }
                } else {
                    dd4Var2.f0(-1976584728);
                    int i8 = i2;
                    ou6 ou6VarO = tg9.o(gjb.n0(lu6Var, 4.0f, 0.0f, 2), 40.0f, 30.0f);
                    ha6 ha6VarD3 = pn0.d(xf0Var, false);
                    int iHashCode5 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL5 = dd4Var2.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarO);
                    dd4Var2.j0();
                    f9 f9Var7 = f9Var5;
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar5, dd4Var2, ha6VarD3);
                    un9.s(jmVar6, dd4Var2, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var2, jmVar7, dd4Var2, kdVar2);
                    un9.s(jmVar8, dd4Var2, ou6VarL05);
                    f9Var = f9Var7;
                    w05.a(new po3(str2), ra1.d, false, null, null, t96.w(tg9.n(zn0Var.a(lu6Var, f9Var7), 20.0f), tp8.a), null, dd4Var, 100663344, 188);
                    nha.c(bpaVar.c, zn0Var.a(lu6Var, f9Var3), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).o, dd4Var, 0, 0, 131064);
                    dd4Var2 = dd4Var;
                    dd4Var2.q(true);
                    dd4Var2.q(false);
                    i3 = i8;
                    f9Var2 = f9Var3;
                }
                dd4Var2.q(true);
                list2 = list;
                f9Var3 = f9Var2;
                i4 = i6 + 1;
                size = i5;
                i2 = i3;
                f9Var5 = f9Var;
            }
            dd4Var2.q(false);
            dd4Var2.q(true);
            int i9 = i2 & 896;
            boolean z = i9 == 256;
            Object objQ2 = dd4Var2.Q();
            if (z || objQ2 == obj) {
                kb4Var2 = kb4Var;
                objQ2 = new tk6(29, kb4Var2);
                dd4Var2.p0(objQ2);
            } else {
                kb4Var2 = kb4Var;
            }
            a("aa", 0, null, (ib4) objQ2, dd4Var2, 54);
            boolean z2 = i9 == 256;
            Object objQ3 = dd4Var2.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new ir6(0, kb4Var2);
                dd4Var2.p0(objQ3);
            }
            a("Aa", 1, null, (ib4) objQ3, dd4Var2, 54);
            boolean z3 = i9 == 256;
            Object objQ4 = dd4Var2.Q();
            if (z3 || objQ4 == obj) {
                objQ4 = new ir6(1, kb4Var2);
                dd4Var2.p0(objQ4);
            }
            a("Aa", 2, null, (ib4) objQ4, dd4Var2, 54);
            boolean z4 = i9 == 256;
            Object objQ5 = dd4Var2.Q();
            if (z4 || objQ5 == obj) {
                objQ5 = new ir6(2, kb4Var2);
                dd4Var2.p0(objQ5);
            }
            a("Aa", 0, null, (ib4) objQ5, dd4Var2, 54);
            boolean z5 = i9 == 256;
            Object objQ6 = dd4Var2.Q();
            if (z5 || objQ6 == obj) {
                objQ6 = new ir6(3, kb4Var2);
                dd4Var2.p0(objQ6);
            }
            a("AA", 0, null, (ib4) objQ6, dd4Var2, 54);
            dd4Var2.q(true);
        } else {
            kb4Var2 = kb4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50((Object) list, ou6Var, (ub4) kb4Var2, (ub4) yb4Var, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final boolean r38, final boolean r39, final boolean r40, final boolean r41, final ou6 r42, defpackage.yb4 r43, final defpackage.yb4 r44, final defpackage.ib4 r45, dd4 r46, final int r47) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.F(boolean, boolean, boolean, boolean, ou6, yb4, yb4, ib4, dd4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(java.util.List r39, ou6 r40, final defpackage.kb4 r41, defpackage.ib4 r42, dd4 r43, int r44) {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.G(java.util.List, ou6, kb4, ib4, dd4, int):void");
    }

    public static final void H(String str, List list, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1296763688);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? (dd4Var.f(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                hk9 hk9Var = new hk9();
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    hk9Var.add(new x13(0.0f));
                }
                dd4Var.p0(hk9Var);
                obj = hk9Var;
            }
            hk9 hk9Var2 = (hk9) obj;
            boolean zF = dd4Var.f(list) | ((i3 & 14) == 4);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == fu6Var) {
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    bpa bpaVar = (bpa) it.next();
                    if ((bpaVar.a + "-" + bpaVar.c).equals(str)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i5);
                if (i5 < 0) {
                    numValueOf = null;
                }
                objQ2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
                dd4Var.p0(objQ2);
            }
            int iIntValue = ((Number) objQ2).intValue();
            qx8.d(iIntValue, ou6Var, lc1.i, 0L, 0.0f, jf0.G(870757368, new h51(iIntValue, hk9Var2, i2), dd4Var), fz1.m, jf0.G(1977795064, new yi(list, iIntValue, yb4Var, hk9Var2), dd4Var), dd4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 14377344, 8);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(str, list, ou6Var, yb4Var, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.o38 r4, defpackage.ib4 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.m38
            if (r0 == 0) goto L13
            r0 = r6
            m38 r0 = (defpackage.m38) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            m38 r0 = new m38
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ib4 r5 = r0.a
            defpackage.e11.e0(r6)     // Catch: java.lang.Throwable -> L28
            goto L62
        L28:
            r4 = move-exception
            goto L68
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L30:
            defpackage.e11.e0(r6)
            jx1 r6 = r0.getContext()
            s00 r1 = defpackage.s00.s
            hx1 r6 = r6.get(r1)
            if (r6 != r4) goto L6c
            r0.a = r5     // Catch: java.lang.Throwable -> L28
            r0.c = r3     // Catch: java.lang.Throwable -> L28
            ay0 r6 = new ay0     // Catch: java.lang.Throwable -> L28
            jt1 r0 = bx1.J(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.u()     // Catch: java.lang.Throwable -> L28
            l76 r0 = new l76     // Catch: java.lang.Throwable -> L28
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            ir0 r4 = r4.f     // Catch: java.lang.Throwable -> L28
            r4.C(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L28
            xx1 r6 = defpackage.xx1.a
            if (r4 != r6) goto L62
            return r6
        L62:
            r5.invoke()
            heb r4 = defpackage.heb.a
            return r4
        L68:
            r5.invoke()
            throw r4
        L6c:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            gp.j(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.I(o38, ib4, kt1):java.lang.Object");
    }

    public static wp8 J(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float fCos = 1.0f / ((float) Math.cos(kjb.b / f));
        yw1 yw1Var = new yw1(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jX = y86.X(kjb.d(fCos, (kjb.b / f) * 2.0f * i4), d14.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = y86.H(jX);
            i3 += 2;
            fArr[i5] = y86.I(jX);
        }
        return bx1.r(fArr, yw1Var, (AbstractList) null, 0.0f, 0.0f);
    }

    public static b74 K(Context context) {
        ProviderInfo providerInfo;
        z64 z64Var;
        ApplicationInfo applicationInfo;
        int i = 21;
        mc8 ng2Var = Build.VERSION.SDK_INT >= 28 ? new ng2(i) : new mc8(i);
        PackageManager packageManager = context.getPackageManager();
        lx1.B(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            z64Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrW = ng2Var.w(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrW) {
                    arrayList.add(signature.toByteArray());
                }
                z64Var = new z64(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), (String) null, (String) null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                z64Var = null;
            }
        }
        if (z64Var == null) {
            return null;
        }
        return new b74(new a74(context, z64Var));
    }

    public static final int L(int i, int i2, int i3) {
        int i4 = (i3 - i2) + 1;
        int i5 = (i - i2) % i4;
        if (i5 == 0) {
            i5 = 0;
        }
        if (i5 < 0) {
            i5 += i4;
        }
        return i5 + i2;
    }

    public static fh6 M(fh6 fh6Var, zm5 zm5Var, uka ukaVar, pn2 pn2Var, b64 b64Var) {
        if (fh6Var != null && zm5Var == fh6Var.a && tl9.p(ukaVar, zm5Var).equals(fh6Var.b) && pn2Var.b() == fh6Var.c.a && b64Var == fh6Var.d) {
            return fh6Var;
        }
        fh6 fh6Var2 = fh6.h;
        if (fh6Var2 != null && zm5Var == fh6Var2.a && tl9.p(ukaVar, zm5Var).equals(fh6Var2.b) && pn2Var.b() == fh6Var2.c.a && b64Var == fh6Var2.d) {
            return fh6Var2;
        }
        fh6 fh6Var3 = new fh6(zm5Var, tl9.p(ukaVar, zm5Var), new sn2(pn2Var.b(), pn2Var.g0()), b64Var);
        fh6.h = fh6Var3;
        return fh6Var3;
    }

    public static final int N() {
        if (((Boolean) xo8.f.getValue()).booleanValue()) {
            return 1001;
        }
        if (((Boolean) xo8.g.getValue()).booleanValue()) {
            return 1002;
        }
        if (((Boolean) xo8.h.getValue()).booleanValue()) {
            return 1003;
        }
        if (((Boolean) xo8.i.getValue()).booleanValue()) {
            return 1004;
        }
        if (((Boolean) xo8.j.getValue()).booleanValue()) {
            return 1005;
        }
        if (((Boolean) xo8.k.getValue()).booleanValue()) {
            return 1006;
        }
        if (((Boolean) xo8.l.getValue()).booleanValue()) {
            return 1007;
        }
        if (((Boolean) xo8.m.getValue()).booleanValue()) {
            return 1008;
        }
        if (((Boolean) xo8.n.getValue()).booleanValue()) {
            return 1009;
        }
        if (((Boolean) xo8.o.getValue()).booleanValue()) {
            return 1010;
        }
        if (((Boolean) xo8.p.getValue()).booleanValue()) {
            return 1011;
        }
        if (((Boolean) xo8.q.getValue()).booleanValue()) {
            return 1012;
        }
        if (((Boolean) xo8.r.getValue()).booleanValue()) {
            return 1013;
        }
        return ((Boolean) xo8.s.getValue()).booleanValue() ? 1014 : 1000;
    }

    public static final boolean O(long j) {
        int i = oa5.c;
        return ((int) (j >> 32)) <= 0 || ((int) (j & 4294967295L)) <= 0;
    }

    public static final boolean P(long j) {
        int i = oa5.c;
        return ((int) (j >> 32)) > 0 && ((int) (j & 4294967295L)) > 0;
    }

    public static final boolean Q(yv4 yv4Var) {
        yv4Var.getClass();
        int i = yv4Var.a;
        return 200 <= i && i < 300;
    }

    public static final lp8 R(wfc wfcVar, String str, Executor executor, ib4 ib4Var) {
        heb hebVar = heb.a;
        wfcVar.getClass();
        executor.getClass();
        zy6 zy6Var = new zy6(0);
        mx0 mx0Var = new mx0();
        mx0Var.c = new zk8();
        px0 px0Var = new px0(mx0Var);
        mx0Var.b = px0Var;
        mx0Var.a = dx1.class;
        try {
            executor.execute(new ze0(wfcVar, str, ib4Var, zy6Var, mx0Var));
            mx0Var.a = hebVar;
        } catch (Exception e) {
            px0Var.b.j(e);
        }
        return new lp8(1, zy6Var, px0Var);
    }

    public static final w16 S(w16 w16Var, v62 v62Var) {
        int i = v62Var.b;
        if (i != Integer.MIN_VALUE && ((int) (v62Var.f() % 12)) != Integer.MIN_VALUE) {
            return b26.b(w16Var, new v62(-((int) (v62Var.f() / 12)), -((int) (v62Var.f() % 12)), -i));
        }
        int iF = (int) (v62Var.f() / 12);
        s72.Companion.getClass();
        p72 p72Var = s72.c;
        p72Var.getClass();
        w16 w16VarA = b26.a(w16Var, -iF, p72Var);
        int iF2 = (int) (v62Var.f() % 12);
        p72 p72Var2 = s72.b;
        p72Var2.getClass();
        w16 w16VarA2 = b26.a(w16VarA, -iF2, p72Var2);
        n72 n72Var = s72.a;
        n72Var.getClass();
        return b26.a(w16VarA2, -i, n72Var);
    }

    public static o38 T(vx1 vx1Var, int i, yb4 yb4Var, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        o38 o38Var = new o38(lx1.q0(vx1Var, hc3.a), vm7.c(i, 4, ar0.a));
        o38Var.r0(zx1.a, o38Var, yb4Var);
        return o38Var;
    }

    public static final void U(int i, List list, int i2) {
        list.getClass();
        int i3 = i2 - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            list.remove(i3);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public static bbc V(Class cls) {
        return new bbc(new ie6(cls, null, he6.a), 24);
    }

    public static bbc W(Object obj) {
        boolean z = obj instanceof a91;
        he6 he6Var = he6.a;
        return z ? new bbc(new ie6(tu1.M((a91) obj), obj, he6Var), 24) : obj instanceof Class ? new bbc(new ie6((Class) obj, obj, he6Var), 24) : new bbc(new ie6(obj.getClass(), obj, he6Var), 24);
    }

    public static final long X(int i, long j) {
        if (i % 180 == 0) {
            return j;
        }
        int i2 = oa5.c;
        return i((int) (4294967295L & j), (int) (j >> 32));
    }

    public static void Y(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            ae9.z(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            ae9.z(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            a0(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            a0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            a0(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        a0(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void Z(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            v83.d(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static final void a(String str, int i, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1322551023);
        int i3 = i2 | 384 | (dd4Var2.h(ib4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ur9 ur9Var = s96.a;
            uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.b;
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(ou6Var3, uw1Var);
            boolean z = (i3 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new pm6(29, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarN0 = gjb.n0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 4.0f, 0.0f, 2);
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
            long j = ((q96) dd4Var2.j(ur9Var)).a.q;
            xf0 xf0Var = bv4.f;
            zn0 zn0Var = zn0.a;
            nha.c(str, gjb.l0(zn0Var.a(ou6Var3, xf0Var), 4.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var2, 6, 0, 131064);
            if (i > 0) {
                dd4Var2.f0(1400873061);
                nha.c(String.valueOf(i), zn0Var.a(ou6Var3, bv4.d), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var2, 0, 0, 131064);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                dd4Var2 = dd4Var2;
                dd4Var2.f0(1401117465);
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
            ye8VarU.d = new mr6(str, ib4Var, ou6Var2, i, i2);
        }
    }

    public static void a0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final z12 b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new z12(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    public static wp8 b0(int i, float f, yw1 yw1Var) {
        yw1Var.getClass();
        if (f <= 0.0f) {
            gp.l("Star radii must both be greater than 0");
            return null;
        }
        if (f >= 1.0f) {
            gp.l("innerRadius must be less than radius");
            return null;
        }
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = kjb.b / i;
            long jD = kjb.d(1.0f, 2.0f * f2 * i3);
            fArr[i2] = y86.H(jD) + 0.0f;
            fArr[i2 + 1] = y86.I(jD) + 0.0f;
            long jD2 = kjb.d(f, f2 * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = y86.H(jD2) + 0.0f;
            i2 += 4;
            fArr[i4] = y86.I(jD2) + 0.0f;
        }
        return bx1.r(fArr, yw1Var, (AbstractList) null, 0.0f, 0.0f);
    }

    public static final void c(kr3 kr3Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, dd4 dd4Var, int i) {
        dd4Var.h0(1712745999);
        int i2 = 4;
        int i3 = 16;
        int i4 = i | (dd4Var.f(kr3Var) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192) | (dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i4 & 1, (74899 & i4) != 74898)) {
            int i5 = 3;
            ou6 ou6VarN0 = gjb.n0(h67.f0(kc5.Q(ou6Var, kc5.J(dd4Var), 14), null, 3), 16.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(new mv(12.0f, true, new gp(5)), bv4.z, dd4Var, 6);
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
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            Set set = kr3Var.d;
            d(wn9.K((pv9) ev9.R.getValue(), dd4Var), null, jf0.G(534192588, new rk6(kr3Var.c, kb4Var, set, i5), dd4Var), dd4Var, 384, 2);
            d(wn9.K((pv9) iu9.g0.getValue(), dd4Var), null, jf0.G(-147739005, new rk6(kr3Var.e, kb4Var2, kr3Var.f, i2), dd4Var), dd4Var, 384, 2);
            d(wn9.K((pv9) vt9.F.getValue(), dd4Var), null, jf0.G(1118331780, new rk6(kr3Var.g, kb4Var3, kr3Var.h, 5), dd4Var), dd4Var, 384, 2);
            d(null, null, jf0.G(-1910564731, new qz0(i3, kr3Var, kb4Var4), dd4Var), dd4Var, 384, 3);
            xv5.A(lu6Var, 24.0f, dd4Var, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(kr3Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, i);
        }
    }

    public static Object c0(is4 is4Var, String str, pm7 pm7Var, kt1 kt1Var) {
        xu4 xu4Var = new xu4();
        xu4Var.d(gu4.c);
        xu4Var.d = new pk2(pm7Var);
        xu4Var.b(null);
        j00 j00Var = yu4.a;
        scb.b(xu4Var.a, str);
        return new rg2(xu4Var, is4Var).H(kt1Var);
    }

    public static final void d(String str, ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i, int i2) {
        String str2;
        int i3;
        rj1 rj1Var2;
        ou6 ou6Var2;
        String str3;
        ou6 ou6Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1325172740);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            i3 = i | (dd4Var2.f(str2) ? 4 : 2);
        }
        int i5 = i3 | 48;
        if (dd4Var2.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            String str4 = i4 != 0 ? null : str2;
            ou6 ou6Var4 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var4, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G);
            ie1 ie1VarA = ge1.a(new mv(6.0f, true, new gp(5)), bv4.z, dd4Var2, 6);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarL);
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
            if (str4 == null || str4.length() == 0) {
                ou6Var3 = ou6Var4;
                dd4Var2.f0(740660720);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(740448339);
                ou6Var3 = ou6Var4;
                String str5 = str4;
                nha.c(str5, gjb.n0(gjb.p0(ou6Var4, 0.0f, 12.0f, 0.0f, 0.0f, 13), 14.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, (i5 & 14) | 48, 0, 131068);
                str4 = str5;
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            rj1Var2 = rj1Var;
            rj1Var2.c(ke1.a, dd4Var2, 54);
            dd4Var2.q(true);
            str3 = str4;
            ou6Var2 = ou6Var3;
        } else {
            rj1Var2 = rj1Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
            str3 = str2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nn3(str3, ou6Var2, rj1Var2, i, i2);
        }
    }

    public static final boolean d0(rl3 rl3Var) {
        rl3Var.getClass();
        int iOrdinal = rl3Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    mn5.g();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final int r73, final int r74, int r75, defpackage.yb4 r76, dd4 r77, ou6 r78, final java.lang.String r79) {
        /*
            Method dump skipped, instruction units count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.e(int, int, int, yb4, dd4, ou6, java.lang.String):void");
    }

    public static final boolean e0(rl3 rl3Var) {
        rl3Var.getClass();
        int iOrdinal = rl3Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    mn5.g();
                }
            }
            return false;
        }
        return true;
    }

    public static final void f(final boolean z, final int i, final int i2, final ou6 ou6Var, final ib4 ib4Var, dd4 dd4Var, final int i3) {
        int i4;
        ib4Var.getClass();
        dd4Var.h0(664991470);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.g(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.d(i2) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        final int i5 = 0;
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z2 = z && i2 > 0;
            int i6 = 3;
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new e4(i6);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.l((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new e4(i6);
                dd4Var.p0(objQ2);
            }
            kf0.d(z2, ou6Var, be3VarA, cj3VarD.a(wd3.p((kb4) objQ2)), (String) null, jf0.G(-2123185722, new zb4() { // from class: j35
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    int i7 = i5;
                    heb hebVar = heb.a;
                    iv ivVar = pv.a;
                    lu6 lu6Var = lu6.a;
                    Object obj5 = vl1.a;
                    int i8 = i2;
                    int i9 = i;
                    ib4 ib4Var2 = ib4Var;
                    switch (i7) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj3;
                            ((Integer) obj4).getClass();
                            ((co) obj2).getClass();
                            ou6 ou6VarL0 = gjb.l0(lu6Var, 12.0f);
                            rp8 rp8Var = tp8.a;
                            ou6 ou6VarW = t96.w(ou6VarL0, rp8Var);
                            boolean zF = dd4Var2.f(ib4Var2);
                            Object objQ3 = dd4Var2.Q();
                            if (zF || objQ3 == obj5) {
                                objQ3 = new xf3(29, ib4Var2);
                                dd4Var2.p0(objQ3);
                            }
                            ou6 ou6VarJ = fw.J(null, (ib4) objQ3, ou6VarW, false, 15);
                            ur9 ur9Var = s96.a;
                            ou6 ou6VarM0 = gjb.m0(fe.L(fw.G(ou6VarJ, 1.0f, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f), rp8Var), lc1.c(0.9f, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 4.0f)), jf0.G), 12.0f, 4.0f);
                            eq8 eq8VarA = dq8.a(ivVar, bv4.w, dd4Var2, 0);
                            int iHashCode = Long.hashCode(dd4Var2.T);
                            lr7 lr7VarL = dd4Var2.l();
                            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarM0);
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
                            boolean zD = dd4Var2.d(i9) | dd4Var2.d(i8);
                            Object objQ4 = dd4Var2.Q();
                            if (zD || objQ4 == obj5) {
                                objQ4 = (i9 + 1) + "/" + i8;
                                dd4Var2.p0(objQ4);
                            }
                            nha.c((String) objQ4, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var2, 0, 0, 131066);
                            dd4Var2.q(true);
                            break;
                        default:
                            dd4 dd4Var3 = (dd4) obj3;
                            ((Integer) obj4).getClass();
                            ((co) obj2).getClass();
                            ou6 ou6VarL03 = gjb.l0(lu6Var, 12.0f);
                            rp8 rp8Var2 = tp8.a;
                            ou6 ou6VarW2 = t96.w(ou6VarL03, rp8Var2);
                            boolean zF2 = dd4Var3.f(ib4Var2);
                            Object objQ5 = dd4Var3.Q();
                            if (zF2 || objQ5 == obj5) {
                                objQ5 = new oda(8, ib4Var2);
                                dd4Var3.p0(objQ5);
                            }
                            ou6 ou6VarJ2 = fw.J(null, (ib4) objQ5, ou6VarW2, false, 15);
                            ur9 ur9Var2 = s96.a;
                            ou6 ou6VarM02 = gjb.m0(fe.L(fw.G(ou6VarJ2, 1.0f, dd1.g(((q96) dd4Var3.j(ur9Var2)).a, 6.0f), rp8Var2), lc1.c(0.95f, dd1.g(((q96) dd4Var3.j(ur9Var2)).a, 4.0f)), jf0.G), 12.0f, 4.0f);
                            eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var3, 0);
                            int iHashCode2 = Long.hashCode(dd4Var3.T);
                            lr7 lr7VarL2 = dd4Var3.l();
                            ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarM02);
                            ml1.k.getClass();
                            um1 um1Var2 = ll1.b;
                            dd4Var3.j0();
                            if (dd4Var3.S) {
                                dd4Var3.k(um1Var2);
                            } else {
                                dd4Var3.s0();
                            }
                            un9.s(ll1.f, dd4Var3, eq8VarA2);
                            un9.s(ll1.e, dd4Var3, lr7VarL2);
                            un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode2));
                            un9.r(dd4Var3, ll1.h);
                            un9.s(ll1.d, dd4Var3, ou6VarL04);
                            boolean zD2 = dd4Var3.d(i9) | dd4Var3.d(i8);
                            Object objQ6 = dd4Var3.Q();
                            if (zD2 || objQ6 == obj5) {
                                objQ6 = (i9 + 1) + "/" + i8;
                                dd4Var3.p0(objQ6);
                            }
                            nha.c((String) objQ6, (ou6) null, ((q96) dd4Var3.j(ur9Var2)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var2)).b.k, dd4Var3, 0, 0, 131066);
                            dd4Var3.q(true);
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, ((i4 >> 6) & Token.ASSIGN_MOD) | 200064, 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final int i7 = 0;
            ye8VarU.d = new yb4() { // from class: e35
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    int i8 = i7;
                    heb hebVar = heb.a;
                    int i9 = i3;
                    switch (i8) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iX0 = qu1.x0(i9 | 1);
                            rw1.f(z, i, i2, ou6Var, ib4Var, (dd4) obj2, iX0);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iX02 = qu1.x0(i9 | 1);
                            dk9.g(z, i, i2, ou6Var, ib4Var, (dd4) obj2, iX02);
                            break;
                    }
                    return hebVar;
                }
            };
        }
    }

    public static final boolean f0(rl3 rl3Var) {
        rl3Var.getClass();
        int iOrdinal = rl3Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return true;
        }
        mn5.g();
        return false;
    }

    public static final void g(boolean z, String str, String str2, int i, int i2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, dd4 dd4Var, int i3) {
        int i4;
        dd4 dd4Var2 = dd4Var;
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        ib4Var6.getClass();
        dd4Var2.h0(-1201252972);
        if ((i3 & 6) == 0) {
            i4 = i3 | (dd4Var2.g(z) ? 4 : 2);
        } else {
            i4 = i3;
        }
        int i5 = i4 | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(str2) ? 256 : Token.CASE) | (dd4Var2.d(i) ? 2048 : 1024) | (dd4Var2.d(i2) ? 16384 : 8192) | (dd4Var2.h(ib4Var) ? 1048576 : 524288) | (dd4Var2.h(ib4Var2) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var3) ? 67108864 : 33554432);
        int i6 = (dd4Var2.h(ib4Var5) ? 4 : 2) | (dd4Var2.h(ib4Var6) ? 32 : 16);
        if (dd4Var2.V(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new fz4(5);
                dd4Var2.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var2.Q();
            int i7 = 6;
            if (objQ2 == obj) {
                objQ2 = new fz4(i7);
                dd4Var2.p0(objQ2);
            }
            kf0.e(z, ou6VarF, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-1000244986, new el0(ib4Var5, ib4Var, ib4Var2, ib4Var3, ib4Var4, str, str2, 5), dd4Var2), dd4Var2, ((i5 << 3) & Token.ASSIGN_MOD) | 1600902, 16);
            dd4Var2 = dd4Var2;
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF2);
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
            int i8 = i5 >> 6;
            f(z, i, i2, zn0.a.a(lu6Var, bv4.d), ib4Var6, dd4Var2, (i5 & 14) | (i8 & Token.ASSIGN_MOD) | (i8 & 896) | ((i6 << 9) & 57344));
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f35(z, str, str2, i, i2, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i3);
        }
    }

    public static final boolean g0(rl3 rl3Var) {
        rl3Var.getClass();
        int iOrdinal = rl3Var.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    mn5.g();
                }
            }
            return false;
        }
        return true;
    }

    public static final void h(final boolean z, final String str, final String str2, final int i, final int i2, final int i3, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final kb4 kb4Var, final ib4 ib4Var6, dd4 dd4Var, final int i4, final int i5) {
        int i6;
        ib4 ib4Var7;
        int i7;
        kb4 kb4Var2;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        kb4Var.getClass();
        ib4Var6.getClass();
        dd4Var2.h0(-1339084474);
        if ((i4 & 6) == 0) {
            i6 = i4 | (dd4Var2.g(z) ? 4 : 2);
        } else {
            i6 = i4;
        }
        int i8 = i6 | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(str2) ? 256 : Token.CASE) | (dd4Var2.d(i) ? 2048 : 1024) | (dd4Var2.d(i2) ? 16384 : 8192) | (dd4Var2.d(i3) ? 131072 : Parser.ARGC_LIMIT);
        if ((i4 & 12582912) == 0) {
            i8 |= dd4Var2.h(ib4Var) ? 8388608 : 4194304;
        }
        int i9 = i8 | (dd4Var2.h(ib4Var2) ? 67108864 : 33554432);
        if ((i4 & 805306368) == 0) {
            i9 |= dd4Var2.h(ib4Var3) ? 536870912 : 268435456;
        }
        int i10 = i9;
        if ((i5 & 6) == 0) {
            ib4Var7 = ib4Var4;
            i7 = i5 | (dd4Var2.h(ib4Var7) ? 4 : 2);
        } else {
            ib4Var7 = ib4Var4;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= dd4Var2.h(ib4Var5) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            kb4Var2 = kb4Var;
            i7 |= dd4Var2.h(kb4Var2) ? 256 : Token.CASE;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((i5 & 3072) == 0) {
            i7 |= dd4Var2.h(ib4Var6) ? 2048 : 1024;
        }
        int i11 = i7;
        if (dd4Var2.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                ou6Var2 = ou6VarF;
                objQ = new fz4(7);
                dd4Var2.p0(objQ);
            } else {
                ou6Var2 = ou6VarF;
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new fz4(8);
                dd4Var2.p0(objQ2);
            }
            final ib4 ib4Var8 = ib4Var7;
            final kb4 kb4Var3 = kb4Var2;
            kf0.e(z, ou6Var2, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-1406769864, new zb4() { // from class: g35
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    dd4 dd4Var3 = (dd4) obj3;
                    ((Integer) obj4).getClass();
                    ((co) obj2).getClass();
                    lu6 lu6Var2 = lu6.a;
                    ou6 ou6VarF2 = tg9.f(lu6Var2, 1.0f);
                    ie1 ie1VarA2 = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode2 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL2 = dd4Var3.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarF2);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var3, ie1VarA2);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var3, lr7VarL2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode2);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var3, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var3, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var3, ou6VarL02);
                    ou6 ou6VarY = yn2.y(dd4Var3, tg9.f(lu6Var2, 1.0f));
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarM0 = gjb.m0(yib.B(fe.L(ou6VarY, lc1.c(0.9f, dd1.g(((q96) dd4Var3.j(ur9Var)).a, 4.0f)), jf0.G), 7), 12.0f, 6.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var3, 48);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarM0);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar5, dd4Var3, eq8VarA);
                    un9.s(jmVar6, dd4Var3, lr7VarL3);
                    dx1.r(iHashCode3, dd4Var3, jmVar7, dd4Var3, kdVar2);
                    un9.s(jmVar8, dd4Var3, ou6VarL03);
                    tu1.a(i25.c(a53.a(), dd4Var3, 0), null, ib4Var, dd4Var3, 0, 2);
                    un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                    tu1.a(i25.c((m53) h53.f.getValue(), dd4Var3, 0), null, ib4Var2, dd4Var3, 0, 2);
                    un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                    tu1.a(i25.c((m53) f53.d0.getValue(), dd4Var3, 0), null, ib4Var3, dd4Var3, 0, 2);
                    bp5 bp5Var = new bp5(1.0f, true);
                    ie1 ie1VarA3 = ge1.a(pv.e, bv4.A, dd4Var3, 54);
                    int iHashCode4 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL4 = dd4Var3.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var3, bp5Var);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar5, dd4Var3, ie1VarA3);
                    un9.s(jmVar6, dd4Var3, lr7VarL4);
                    dx1.r(iHashCode4, dd4Var3, jmVar7, dd4Var3, kdVar2);
                    un9.s(jmVar8, dd4Var3, ou6VarL04);
                    nha.c(str, tg9.f(lu6Var2, 1.0f), ((q96) dd4Var3.j(ur9Var)).a.q, (g60) null, wn9.x(14), (t74) null, a84.w, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var3, 1597488, 24960, 240552);
                    nha.c(str2, tg9.f(lu6Var2, 1.0f), ((q96) dd4Var3.j(ur9Var)).a.q, (g60) null, wn9.x(12), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var3, 24624, 24960, 240616);
                    dd4Var3.q(true);
                    un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                    boolean zR = ww1.R(dd4Var3);
                    int i12 = i3;
                    p35 p35VarC = i25.c(i12 != 0 ? i12 != 2 ? a53.b() : f53.b() : zR ? f53.b() : a53.b(), dd4Var3, 0);
                    kb4 kb4Var4 = kb4Var3;
                    boolean zF = dd4Var3.f(kb4Var4) | dd4Var3.d(i12) | dd4Var3.g(zR);
                    Object objQ3 = dd4Var3.Q();
                    if (zF || objQ3 == vl1.a) {
                        objQ3 = new cu2(i12, 2, kb4Var4, zR);
                        dd4Var3.p0(objQ3);
                    }
                    tu1.a(p35VarC, null, (ib4) objQ3, dd4Var3, 0, 2);
                    un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                    tu1.a(i25.c((m53) f53.m0.getValue(), dd4Var3, 0), null, ib4Var8, dd4Var3, 0, 2);
                    un9.a(dd4Var3, tg9.r(lu6Var2, 12.0f));
                    tu1.a(i25.c((m53) f53.J.getValue(), dd4Var3, 0), null, ib4Var5, dd4Var3, 0, 2);
                    dd4Var3.q(true);
                    y86.c(0.0f, 6, 2, dd1.g(((q96) dd4Var3.j(ur9Var)).a, 6.0f), dd4Var3, tg9.f(lu6Var2, 1.0f));
                    dd4Var3.q(true);
                    return heb.a;
                }
            }, dd4Var2), dd4Var2, 1600902 | ((i10 << 3) & Token.ASSIGN_MOD), 16);
            dd4Var2 = dd4Var2;
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF2);
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
            int i12 = i10 >> 6;
            dk9.g(z, i, i2, zn0.a.a(yib.B(lu6Var, 4), bv4.d), ib4Var6, dd4Var2, (i10 & 14) | (i12 & Token.ASSIGN_MOD) | (i12 & 896) | (57344 & (i11 << 3)));
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: h35
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i4 | 1);
                    int iX02 = qu1.x0(i5);
                    rw1.h(z, str, str2, i, i2, i3, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, kb4Var, ib4Var6, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final long h0(long j, long j2) {
        int i = oa5.c;
        return i(t96.M(eu8.b(j2) * ((int) (j >> 32))), t96.M(eu8.c(j2) * ((int) (j & 4294967295L))));
    }

    public static final long i(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = oa5.c;
        return j;
    }

    public static final ArrayList i0(List list) {
        list.getClass();
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(ou6 r20, st5 r21, pj7 r22, boolean r23, nv r24, vf0 r25, s04 r26, boolean r27, ag r28, defpackage.kb4 r29, dd4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.j(ou6, st5, pj7, boolean, nv, vf0, s04, boolean, ag, kb4, dd4, int, int):void");
    }

    public static final void j0(mx7 mx7Var, long j, kb4 kb4Var, boolean z) {
        MotionEvent motionEventA = mx7Var.a();
        if (motionEventA == null) {
            gp.l("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        kb4Var.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(ou6 r20, st5 r21, pj7 r22, boolean r23, kv r24, wf0 r25, s04 r26, boolean r27, ag r28, defpackage.kb4 r29, dd4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.k(ou6, st5, pj7, boolean, kv, wf0, s04, boolean, ag, kb4, dd4, int, int):void");
    }

    public static final p96 k0(wp8 wp8Var, dd4 dd4Var) {
        boolean zF = dd4Var.f(wp8Var) | dd4Var.d(0);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new p96(wp8Var);
            dd4Var.p0(objQ);
        }
        return (p96) objQ;
    }

    public static final void l(uu5 uu5Var, final su5 su5Var, final ou6 ou6Var, final pj7 pj7Var, final s04 s04Var, final boolean z, final ag agVar, final float f, final float f2, final kb4 kb4Var, dd4 dd4Var, final int i, final int i2) {
        int i3;
        int i4;
        uu5 uu5Var2;
        uu5 uu5Var3;
        boolean z2;
        ou6 ou6VarH;
        dd4Var.h0(-1904835166);
        if ((i & 6) == 0) {
            i3 = (dd4Var.f(uu5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.d(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? dd4Var.f(su5Var) : dd4Var.h(su5Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= dd4Var.g(false) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= dd4Var.f(s04Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= dd4Var.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dd4Var.f(agVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= dd4Var.c(f) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (dd4Var.c(f2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        boolean z3 = true;
        if (dd4Var.V(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            int i6 = i5 & 14;
            int i7 = (i4 & Token.ASSIGN_MOD) | i6;
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            int i8 = i4;
            boolean z4 = (((i7 & 14) ^ 6) > 4 && dd4Var.f(uu5Var)) || (i7 & 6) == 4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (z4 || objQ == fu6Var) {
                ra1 ra1Var = ra1.C;
                objQ = new cq5(0, 3, br9.class, dk9.o(new al3(27, dk9.o(new lz4(a07VarA, 7), ra1Var), uu5Var), ra1Var), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                dd4Var.p0(objQ);
            }
            li5 li5Var = (li5) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var = (vx1) objQ2;
            gh4 gh4Var = (gh4) dd4Var.j(xm1.g);
            int i9 = i5 >> 6;
            int i10 = i5 >> 12;
            int i11 = (i9 & 7168) | (i9 & 896) | i6 | ((i5 << 9) & 57344) | (i10 & 458752) | ((i8 << 18) & 3670016) | ((i5 << 18) & 234881024);
            boolean zF = ((((i11 & 896) ^ 384) > 256 && dd4Var.f(pj7Var)) || (i11 & 384) == 256) | ((((i11 & 14) ^ 6) > 4 && dd4Var.f(uu5Var)) || (i11 & 6) == 4) | dd4Var.f(li5Var) | ((((i11 & 7168) ^ 3072) > 2048 && dd4Var.g(false)) || (i11 & 3072) == 2048) | ((((i11 & 57344) ^ 24576) > 16384 && dd4Var.d(0)) || (i11 & 24576) == 16384) | ((((i11 & 458752) ^ 196608) > 131072 && dd4Var.c(f)) || (i11 & 196608) == 131072) | ((((i11 & 3670016) ^ 1572864) > 1048576 && dd4Var.c(f2)) || (i11 & 1572864) == 1048576) | ((((i11 & 234881024) ^ 100663296) > 67108864 && dd4Var.f(su5Var)) || (i11 & 100663296) == 67108864) | dd4Var.f(gh4Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == fu6Var) {
                nu5 nu5Var = new nu5(uu5Var, su5Var, li5Var, pj7Var, f, vx1Var, gh4Var);
                uu5Var3 = uu5Var;
                dd4Var.p0(nu5Var);
                objQ3 = nu5Var;
            } else {
                uu5Var3 = uu5Var;
            }
            cs5 cs5Var = (cs5) objQ3;
            int i12 = (i10 & Token.ASSIGN_MOD) | i6;
            boolean z5 = ((((i12 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.g(false)) || (i12 & 48) == 32) | ((((i12 & 14) ^ 6) > 4 && dd4Var.f(uu5Var3)) || (i12 & 6) == 4);
            Object objQ4 = dd4Var.Q();
            if (z5 || objQ4 == fu6Var) {
                objQ4 = new ru5(uu5Var3);
                dd4Var.p0(objQ4);
            }
            ru5 ru5Var = (ru5) objQ4;
            lh7 lh7Var = lh7.a;
            if (z) {
                dd4Var.f0(-1834596342);
                if (((i6 ^ 6) <= 4 || !dd4Var.f(uu5Var3)) && (i5 & 6) != 4) {
                    z3 = false;
                }
                Object objQ5 = dd4Var.Q();
                if (z3 || objQ5 == fu6Var) {
                    objQ5 = new bu5(uu5Var3);
                    dd4Var.p0(objQ5);
                }
                z2 = false;
                ou6VarH = m79.H((bu5) objQ5, uu5Var3.k, false, lh7Var);
                dd4Var.q(false);
            } else {
                z2 = false;
                dd4Var.f0(-1834291488);
                dd4Var.q(false);
                ou6VarH = lu6.a;
            }
            ou6 ou6Var2 = ou6VarH;
            uu5 uu5Var4 = uu5Var3;
            ou6 ou6VarG0 = lc5.g0(t1c.c0(ou6Var.e(uu5Var3.i).e(uu5Var3.j), li5Var, ru5Var, lh7Var, z, z2).e(ou6Var2).e(uu5Var3.t.k), uu5Var4, lh7Var, agVar, z, z2, s04Var, uu5Var3.r, null);
            uu5Var2 = uu5Var4;
            qx1.e(li5Var, ou6VarG0, uu5Var2.m, cs5Var, dd4Var, 0, 0);
        } else {
            uu5Var2 = uu5Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final uu5 uu5Var5 = uu5Var2;
            ye8VarU.d = new yb4() { // from class: hu5
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rw1.l(uu5Var5, su5Var, ou6Var, pj7Var, s04Var, z, agVar, f, f2, kb4Var, (dd4) obj, qu1.x0(i | 1), qu1.x0(i2));
                    return heb.a;
                }
            };
        }
    }

    public static final String l0(long j) {
        StringBuilder sb = new StringBuilder();
        int i = oa5.c;
        sb.append((int) (j >> 32));
        sb.append('x');
        sb.append((int) (j & 4294967295L));
        return sb.toString();
    }

    public static final void m(boolean z, kr3 kr3Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, dd4 dd4Var, int i) {
        kr3Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        dd4Var.h0(-418946123);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(kr3Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192) | (dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var5) ? 1048576 : 524288);
        if (!dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(351351242);
            n(z, kr3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, dd4Var, i2 & 4194302);
            dd4Var.q(false);
        } else {
            dd4Var.f0(351740943);
            o(z, kr3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, dd4Var, i2 & 4194302);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qk6(z, kr3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, i, 0);
        }
    }

    public static final long m0(long j) {
        int i = oa5.c;
        return pg9.a((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final void n(boolean z, kr3 kr3Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, dd4 dd4Var, int i) {
        dd4Var.h0(1320056281);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(kr3Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192) | (dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var5) ? 1048576 : 524288);
        if (dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            fw.q(z, kb4Var, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1913367093, new m85(yib.e(dd4Var, 14), kr3Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5), dd4Var), dd4Var, (i2 & 14) | 3072 | ((i2 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qk6(z, kr3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, i, 2);
        }
    }

    public static final void o(boolean z, kr3 kr3Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, dd4 dd4Var, int i) {
        dd4Var.h0(-1024445306);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(kr3Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192) | (dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var5) ? 1048576 : 524288);
        if (dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            fw.r(z, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(405320309, new uq6(yib.e(dd4Var, 15), kr3Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5), dd4Var), dd4Var, (i2 & 14) | 805309440 | ((i2 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qk6(z, kr3Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(boolean r23, defpackage.oja r24, defpackage.kb4 r25, defpackage.yb4 r26, defpackage.yb4 r27, defpackage.zb4 r28, defpackage.yb4 r29, defpackage.zb4 r30, defpackage.ac4 r31, defpackage.ib4 r32, dd4 r33, int r34) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.p(boolean, oja, kb4, yb4, yb4, zb4, yb4, zb4, ac4, ib4, dd4, int):void");
    }

    public static final void q(boolean z, oja ojaVar, kb4 kb4Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, zb4 zb4Var2, ib4 ib4Var, yb4 yb4Var4, ib4 ib4Var2, dd4 dd4Var, int i, int i2) {
        ib4 ib4Var3;
        int i3;
        dd4Var.h0(-852352864);
        int i4 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(ojaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(yb4Var) ? 2048 : 1024) | (dd4Var.h(yb4Var2) ? 16384 : 8192) | (dd4Var.h(zb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(yb4Var3) ? 1048576 : 524288) | (dd4Var.h(zb4Var2) ? 8388608 : 4194304) | (dd4Var.h(ib4Var) ? 67108864 : 33554432) | (dd4Var.h(yb4Var4) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            ib4Var3 = ib4Var2;
            i3 = i2 | (dd4Var.h(ib4Var3) ? 4 : 2);
        } else {
            ib4Var3 = ib4Var2;
            i3 = i2;
        }
        if (dd4Var.V(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            xf0 xf0Var = bv4.u;
            ou6 ou6VarL0 = gjb.l0(yib.E(tg9.f(lu6.a, 1.0f), 15), 24.0f);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new zm6(22);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(23);
                dd4Var.p0(objQ2);
            }
            bx1.a(z, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarL0, jf0.G(1425442818, new yq6(ojaVar, kb4Var, yb4Var, yb4Var2, zb4Var, yb4Var3, zb4Var2, ib4Var, yb4Var4, ib4Var3, 0), dd4Var), dd4Var, (i4 & 14) | 805531008 | ((i4 >> 3) & Token.ASSIGN_MOD), 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zq6(z, ojaVar, kb4Var, yb4Var, yb4Var2, zb4Var, yb4Var3, zb4Var2, ib4Var, yb4Var4, ib4Var2, i, i2, 0);
        }
    }

    public static final void r(boolean z, oja ojaVar, kb4 kb4Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, zb4 zb4Var2, ib4 ib4Var, yb4 yb4Var4, ib4 ib4Var2, dd4 dd4Var, int i, int i2) {
        ib4 ib4Var3;
        int i3;
        dd4Var.h0(1959208605);
        int i4 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(ojaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(yb4Var) ? 2048 : 1024) | (dd4Var.h(yb4Var2) ? 16384 : 8192) | (dd4Var.h(zb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(yb4Var3) ? 1048576 : 524288) | (dd4Var.h(zb4Var2) ? 8388608 : 4194304) | (dd4Var.h(ib4Var) ? 67108864 : 33554432) | (dd4Var.h(yb4Var4) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            ib4Var3 = ib4Var2;
            i3 = i2 | (dd4Var.h(ib4Var3) ? 4 : 2);
        } else {
            ib4Var3 = ib4Var2;
            i3 = i2;
        }
        if (dd4Var.V(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            xf0 xf0Var = bv4.f;
            ou6 ou6VarL0 = gjb.l0(yib.E(tg9.t(lu6.a, 0.0f, 600.0f, 1), 15), 24.0f);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new zm6(19);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(20);
                dd4Var.p0(objQ2);
            }
            bx1.a(z, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarL0, jf0.G(-184071429, new yq6(ojaVar, kb4Var, yb4Var, yb4Var2, zb4Var, yb4Var3, zb4Var2, ib4Var, yb4Var4, ib4Var3, 1), dd4Var), dd4Var, (i4 & 14) | 818113920 | ((i4 >> 3) & Token.ASSIGN_MOD), 64);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zq6(z, ojaVar, kb4Var, yb4Var, yb4Var2, zb4Var, yb4Var3, zb4Var2, ib4Var, yb4Var4, ib4Var2, i, i2, 1);
        }
    }

    public static final void s(final String str, final boolean z, final boolean z2, ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, dd4 dd4Var, final int i) {
        String str2;
        int i2;
        final ou6 ou6Var2;
        long jG;
        ou6 ou6Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-743789421);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (dd4Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.g(z2) ? 256 : Token.CASE;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var2.V(i3 & 1, (74899 & i3) != 74898)) {
            if (z2) {
                dd4Var2.f0(-494093229);
                jG = lc1.c(0.2f, ((q96) dd4Var2.j(s96.a)).a.a);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-493995920);
                jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 1.0f);
                dd4Var2.q(false);
            }
            lp4 lp4Var = jf0.G;
            ou6 ou6Var4 = lu6.a;
            ou6 ou6VarM = fw.M(fe.L(ou6Var4, jG, lp4Var), ib4Var2, ib4Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
            long j = ((q96) dd4Var2.j(ur9Var)).a.q;
            xf0 xf0Var = bv4.f;
            zn0 zn0Var = zn0.a;
            nha.c(str2, gjb.m0(zn0Var.a(ou6Var4, xf0Var), 12.0f, 8.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, i3 & 14, 24576, 114680);
            dd4Var2 = dd4Var;
            if (z) {
                dd4Var2.f0(-1352649017);
                ou6Var3 = ou6Var4;
                mx4.a(i25.c((m53) f53.r.getValue(), dd4Var2, 0), (String) null, tg9.n(sw1.i0(gjb.l0(zn0Var.a(ou6Var3, bv4.d), 2.0f), 45.0f), 12.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 48, 0);
                dd4Var2.q(false);
            } else {
                ou6Var3 = ou6Var4;
                dd4Var2.f0(-1352298903);
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
            ye8VarU.d = new yb4() { // from class: hr6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rw1.s(str, z, z2, ou6Var2, ib4Var, ib4Var2, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void t(oja ojaVar, ou6 ou6Var, ib4 ib4Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, zb4 zb4Var2, ib4 ib4Var2, yb4 yb4Var4, ib4 ib4Var3, dd4 dd4Var, int i) {
        yb4 yb4Var5;
        Object obj;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1979972751);
        int i5 = i | (dd4Var2.f(ojaVar) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(yb4Var) ? 2048 : 1024) | (dd4Var2.h(yb4Var2) ? 16384 : 8192) | (dd4Var2.h(zb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(yb4Var3) ? 1048576 : 524288) | (dd4Var2.h(zb4Var2) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var2) ? 67108864 : 33554432) | (dd4Var2.h(yb4Var4) ? 536870912 : 268435456);
        int i6 = dd4Var2.h(ib4Var3) ? 4 : 2;
        if (dd4Var2.V(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP0);
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
            String strK = wn9.K((pv9) zu9.O.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, 0, 0, 131064);
            p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var, 0);
            long j = ((q96) dd4Var.j(ur9Var)).a.q;
            ou6 ou6VarW = t96.w(tg9.n(lu6Var, 32.0f), tp8.a);
            boolean z3 = (i5 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (z3 || objQ == obj2) {
                obj = obj2;
                objQ = new pm6(26, ib4Var);
                dd4Var.p0(objQ);
            } else {
                obj = obj2;
            }
            Object obj3 = obj;
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 6.0f), j, dd4Var, 48, 0);
            dd4Var.q(true);
            String str = ojaVar.a;
            boolean z4 = ojaVar.k;
            boolean z5 = ojaVar.j;
            String str2 = ojaVar.b;
            int i7 = ojaVar.c;
            int i8 = ojaVar.d;
            ou6 ou6VarG = fw.G(gjb.l0(lu6Var, 8.0f), 1.0f, dd1.g(((q96) dd4Var.j(ur9Var)).a, 4.0f), ((q96) dd4Var.j(ur9Var)).c.b);
            boolean z6 = (458752 & i5) == 131072;
            Object objQ2 = dd4Var.Q();
            if (z6 || objQ2 == obj3) {
                objQ2 = new jc0(zb4Var, 1);
                dd4Var.p0(objQ2);
            }
            e(i7, i8, 0, (yb4) objQ2, dd4Var, ou6VarG, str);
            int i9 = i5 & 14;
            boolean z7 = i9 == 4;
            Object objQ3 = dd4Var.Q();
            if (z7 || objQ3 == obj3) {
                objQ3 = new wn6(ojaVar, 1);
                dd4Var.p0(objQ3);
            }
            fo2 fo2VarN = dk9.n((ib4) objQ3);
            boolean zF = dd4Var.f(str2);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj3) {
                objQ4 = dk9.x(str2 == null ? "" : str2);
                dd4Var.p0(objQ4);
            }
            a07 a07Var = (a07) objQ4;
            String str3 = ojaVar.e;
            List list = ojaVar.i;
            s5b s5bVar = (s5b) fo2VarN.getValue();
            String str4 = (String) a07Var.getValue();
            int i10 = ojaVar.c;
            int i11 = ojaVar.d;
            if (str2 == null) {
                i2 = i11;
                z = true;
            } else {
                i2 = i11;
                z = false;
            }
            List list2 = ojaVar.g;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj3) {
                i3 = i2;
                objQ5 = new wo6(a07Var, 7);
                dd4Var.p0(objQ5);
            } else {
                i3 = i2;
            }
            kb4 kb4Var = (kb4) objQ5;
            boolean z8 = (i5 & 7168) == 2048;
            Object objQ6 = dd4Var.Q();
            if (z8 || objQ6 == obj3) {
                i4 = i5;
                objQ6 = new v8(yb4Var, 3, (byte) 0);
                dd4Var.p0(objQ6);
            } else {
                i4 = i5;
            }
            x(str3, list, s5bVar, z, str4, i10, i3, list2, ou6VarF, kb4Var, (yb4) objQ6, yb4Var2, zb4Var, ib4Var2, dd4Var, 100663808, ((i4 >> 15) & 7168) | ((i4 >> 9) & 1008));
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            boolean zG = dd4Var.g(z5);
            Object objQ7 = dd4Var.Q();
            if (zG || objQ7 == obj3) {
                objQ7 = dk9.x(Boolean.valueOf(z5));
                dd4Var.p0(objQ7);
            }
            a07 a07Var2 = (a07) objQ7;
            boolean zG2 = dd4Var.g(z4);
            Object objQ8 = dd4Var.Q();
            if (zG2 || objQ8 == obj3) {
                objQ8 = dk9.x(Boolean.valueOf(z4));
                dd4Var.p0(objQ8);
            }
            a07 a07Var3 = (a07) objQ8;
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            boolean z9 = ojaVar.j;
            boolean zBooleanValue2 = ((Boolean) a07Var3.getValue()).booleanValue();
            boolean z10 = ojaVar.k;
            ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
            boolean zF3 = dd4Var.f(a07Var2) | dd4Var.f(a07Var3);
            Object objQ9 = dd4Var.Q();
            if (zF3 || objQ9 == obj3) {
                objQ9 = new i91(a07Var2, a07Var3, 3);
                dd4Var.p0(objQ9);
            }
            yb4 yb4Var6 = (yb4) objQ9;
            boolean z11 = (i4 & 3670016) == 1048576;
            Object objQ10 = dd4Var.Q();
            if (z11 || objQ10 == obj3) {
                z2 = z9;
                objQ10 = new v8(yb4Var3, 4, (byte) 0);
                dd4Var.p0(objQ10);
            } else {
                z2 = z9;
            }
            yb4 yb4Var7 = (yb4) objQ10;
            boolean zF4 = ((i4 & 29360128) == 8388608) | dd4Var.f(a07Var) | dd4Var.f(a07Var2) | dd4Var.f(a07Var3);
            Object objQ11 = dd4Var.Q();
            if (zF4 || objQ11 == obj3) {
                objQ11 = new ri6(zb4Var2, a07Var, a07Var2, a07Var3, 2);
                dd4Var.p0(objQ11);
            }
            F(zBooleanValue, z2, zBooleanValue2, z10, ou6VarN0, yb4Var6, yb4Var7, (ib4) objQ11, dd4Var, 24576);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 6.0f));
            List list3 = ojaVar.h;
            ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
            boolean z12 = ((i4 & 1879048192) == 536870912) | (i9 == 4);
            Object objQ12 = dd4Var2.Q();
            if (z12 || objQ12 == obj3) {
                yb4Var5 = yb4Var4;
                objQ12 = new xp5(18, yb4Var5, ojaVar);
                dd4Var2.p0(objQ12);
            } else {
                yb4Var5 = yb4Var4;
            }
            D(list3, ou6VarN02, (yb4) objQ12, ib4Var3, dd4Var2, ((i6 << 9) & 7168) | 48);
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            yb4Var5 = yb4Var4;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ar6(ojaVar, ou6Var, ib4Var, yb4Var, yb4Var2, zb4Var, yb4Var3, zb4Var2, ib4Var2, yb4Var5, ib4Var3, i);
        }
    }

    public static final kf8 u(long j, long j2) {
        return new kf8(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final kf8 v(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new kf8(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final kf8 w(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new kf8(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0366  */
    /* JADX WARN: Type inference failed for: r15v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final java.lang.String r58, final java.util.List r59, final defpackage.s5b r60, final boolean r61, java.lang.String r62, final int r63, final int r64, final java.util.List r65, final ou6 r66, defpackage.kb4 r67, final defpackage.yb4 r68, final defpackage.yb4 r69, final defpackage.zb4 r70, final defpackage.ib4 r71, dd4 r72, final int r73, final int r74) {
        /*
            Method dump skipped, instruction units count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw1.x(java.lang.String, java.util.List, s5b, boolean, java.lang.String, int, int, java.util.List, ou6, kb4, yb4, yb4, zb4, ib4, dd4, int, int):void");
    }

    public static final int y(a07 a07Var) {
        return ((Number) a07Var.getValue()).intValue();
    }

    public static final int z(a07 a07Var) {
        return ((Number) a07Var.getValue()).intValue();
    }
}
