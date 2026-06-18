package defpackage;

import android.content.ClipData;
import android.content.ComponentCallbacks;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.koin.android.scope.ScopeService;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vm7 {
    public static final rj1 k;
    public static final rj1 q;
    public static final ybb a = ybb.a;
    public static final rj1 b = new rj1(new k7(24), false, 1647339584);
    public static final rj1 c = new rj1(new ak1(22), false, -864380380);
    public static final rj1 d = new rj1(new ck1(1), false, -857313435);
    public static final rj1 e = new rj1(new ck1(2), false, -1254284670);
    public static final rj1 f = new rj1(new ak1(23), false, 1386020734);
    public static final rj1 g = new rj1(new ak1(24), false, 2057746506);
    public static final rj1 h = new rj1(new hk1(0), false, 771215476);
    public static final rj1 i = new rj1(new dk1(25), false, -1088884368);
    public static final rj1 j = new rj1(new dk1(26), false, 692378934);
    public static final rj1 l = new rj1(new kk1(28), false, 1464024338);
    public static final rj1 m = new rj1(new lk1(14), false, 771255958);
    public static final rj1 n = new rj1(new lk1(15), false, -1341217741);
    public static final rj1 o = new rj1(new kk1(29), false, -1613168713);
    public static final rj1 p = new rj1(new pk1(3), false, -728973153);
    public static final rj1 r = new rj1(new pk1(5), false, 971362596);
    public static final xx1 s = xx1.a;
    public static final di t = new di(17);
    public static final di u = new di(19);
    public static final ss6 v = new ss6(29);
    public static final zj1 w = new zj1(2);
    public static final kf8 x = new kf8(0.0f, 0.0f, 10.0f, 10.0f);
    public static final b23 y = new b23();

    static {
        int i2 = 4;
        k = new rj1(new kk1(i2), false, -2116408057);
        q = new rj1(new pk1(i2), false, 1096018555);
    }

    public static final void A(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(135635912);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarM0 = gjb.m0(ou6Var3, 16.0f, 12.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarM0, ((q96) dd4Var.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.h, dd4Var, i3 & 14, 0, 131064);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i2, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final zk7 r18, final int r19, final int r20, final ou6 r21, final defpackage.kb4 r22, dd4 r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.B(zk7, int, int, ou6, kb4, dd4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0554  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(defpackage.wra r58, ou6 r59, pj7 r60, defpackage.kb4 r61, defpackage.kb4 r62, defpackage.kb4 r63, defpackage.kb4 r64, defpackage.kb4 r65, defpackage.ib4 r66, defpackage.kb4 r67, defpackage.kb4 r68, defpackage.kb4 r69, defpackage.kb4 r70, defpackage.kb4 r71, defpackage.kb4 r72, defpackage.kb4 r73, defpackage.kb4 r74, dd4 r75, int r76) {
        /*
            Method dump skipped, instruction units count: 3304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.C(wra, ou6, pj7, kb4, kb4, kb4, kb4, kb4, ib4, kb4, kb4, kb4, kb4, kb4, kb4, kb4, kb4, dd4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(int r48, int r49, defpackage.kb4 r50, dd4 r51, ou6 r52) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.D(int, int, kb4, dd4, ou6):void");
    }

    public static final void E(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(9123650);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            csa csaVar = (csa) ((qtb) qx1.N(ug8.a(csa.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            int i4 = 19;
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.n.getValue(), dd4Var), tg9.c, false, jf0.G(702495046, new oe9(t27Var, i4), dd4Var), null, jf0.G(-1969778760, new ak0(i4, csaVar, t27Var, bx1.B(csaVar.d, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 20, t27Var);
        }
    }

    public static final void F(d35 d35Var, boolean z, boolean z2, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        ib4 ib4Var2;
        d35 d35Var2;
        yb4 yb4Var;
        long j2;
        jm jmVar;
        yb4 yb4Var2;
        yb4 yb4Var3;
        long j3;
        fu6 fu6Var;
        yb4 yb4Var4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        boolean z6;
        fu6 fu6Var2;
        Object obj2;
        dd4 dd4Var2 = dd4Var;
        long j4 = d35Var.j;
        dd4Var2.h0(-1278124600);
        int i3 = i2 | (dd4Var2.f(d35Var) ? 4 : 2) | (dd4Var2.g(z) ? 32 : 16) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
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
            yb4 yb4Var5 = ll1.f;
            un9.s(yb4Var5, dd4Var2, eq8VarA);
            yb4 yb4Var6 = ll1.e;
            un9.s(yb4Var6, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            yb4 yb4Var7 = ll1.d;
            un9.s(yb4Var7, dd4Var2, ou6VarL0);
            if (z) {
                dd4Var2.f0(1852392453);
                yb4Var = yb4Var6;
                j2 = ((q96) dd4Var2.j(s96.a)).a.a;
                dd4Var2.q(false);
            } else {
                yb4Var = yb4Var6;
                dd4Var2.f0(1852455011);
                j2 = ((q96) dd4Var2.j(s96.a)).a.q;
                dd4Var2.q(false);
            }
            p35 p35VarC = i25.c((m53) f53.K.getValue(), dd4Var2, 0);
            lu6 lu6Var = lu6.a;
            long j5 = j2;
            yb4 yb4Var8 = yb4Var;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 14.0f), j5, dd4Var2, 432, 0);
            ou6 ou6VarN0 = gjb.n0(j39.f(lu6Var, 8.0f, dd4Var2, 1.0f, true), 0.0f, 6.0f, 1);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var5, dd4Var2, ie1VarA);
            un9.s(yb4Var8, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar);
            un9.s(yb4Var7, dd4Var2, ou6VarL02);
            String str = d35Var.b;
            int i4 = d35Var.f;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarF, j5, (g60) null, 0L, new t74(z ? 1 : 0), z ? a84.w : a84.t, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 0, 129944);
            dd4Var2 = dd4Var;
            fu6 fu6Var3 = vl1.a;
            if (i4 > 0) {
                dd4Var2.f0(-1686517376);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF2);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var5, dd4Var2, eq8VarA2);
                un9.s(yb4Var8, dd4Var2, lr7VarL3);
                ky0.v(iHashCode3, dd4Var2, jmVar2, dd4Var2, kdVar);
                un9.s(yb4Var7, dd4Var2, ou6VarL03);
                jmVar = jmVar2;
                yb4Var4 = yb4Var7;
                j3 = j5;
                yb4Var2 = yb4Var5;
                yb4Var3 = yb4Var8;
                nha.c(wn9.L((pv9) iu9.r.getValue(), new Object[]{Integer.valueOf(i4)}, dd4Var2), (ou6) null, lc1.c(0.5f, j5), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 0, 130042);
                dd4Var2 = dd4Var;
                if (j4 > 0) {
                    xv5.y(dd4Var2, -734538259, lu6Var, 8.0f, dd4Var2);
                    mx4.a(i25.c((m53) f53.i.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 14.0f), lc1.c(0.5f, j3), dd4Var2, 432, 0);
                    un9.a(dd4Var2, tg9.r(lu6Var, 2.0f));
                    boolean zE = dd4Var2.e(j4);
                    Object objQ = dd4Var2.Q();
                    if (zE) {
                        fu6Var2 = fu6Var3;
                    } else {
                        fu6Var2 = fu6Var3;
                        obj2 = objQ;
                        if (objQ == fu6Var2) {
                        }
                        fu6Var = fu6Var2;
                        nha.c((String) obj2, (ou6) null, lc1.c(0.5f, j3), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 24576, 113658);
                        dd4Var2 = dd4Var;
                        z4 = false;
                        dd4Var2.q(false);
                    }
                    String strI = zk4.i(j4, "HH:mm dd/MM/yyyy");
                    dd4Var2.p0(strI);
                    obj2 = strI;
                    fu6Var = fu6Var2;
                    nha.c((String) obj2, (ou6) null, lc1.c(0.5f, j3), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 24576, 113658);
                    dd4Var2 = dd4Var;
                    z4 = false;
                    dd4Var2.q(false);
                } else {
                    fu6Var = fu6Var3;
                    z4 = false;
                    dd4Var2.f0(-733609933);
                    dd4Var2.q(false);
                }
                z3 = true;
                dd4Var2.q(true);
                dd4Var2.q(z4);
            } else {
                jmVar = jmVar2;
                yb4Var2 = yb4Var5;
                yb4Var3 = yb4Var8;
                j3 = j5;
                fu6Var = fu6Var3;
                yb4Var4 = yb4Var7;
                z3 = true;
                z4 = false;
                dd4Var2.f0(-1685052812);
                dd4Var2.q(false);
            }
            dd4Var2.q(z3);
            d35Var2 = d35Var;
            if (d35Var2.g) {
                ib4Var2 = ib4Var;
                z5 = true;
                dd4Var2.f0(1855750590);
                dd4Var2.q(z4);
            } else {
                xv5.y(dd4Var2, 1854918364, lu6Var, 6.0f, dd4Var2);
                ha6 ha6VarD = pn0.d(bv4.b, z4);
                int iHashCode4 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL4 = dd4Var2.l();
                ou6 ou6VarL04 = s32.L0(dd4Var2, lu6Var);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var2, dd4Var2, ha6VarD);
                un9.s(yb4Var3, dd4Var2, lr7VarL4);
                ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
                un9.s(yb4Var4, dd4Var2, ou6VarL04);
                p35 p35VarC2 = i25.c((m53) a53.x.getValue(), dd4Var2, 0);
                ou6 ou6VarW = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                boolean z7 = (i3 & 57344) == 16384;
                Object objQ2 = dd4Var2.Q();
                if (z7 || objQ2 == fu6Var) {
                    ib4Var2 = ib4Var;
                    i35 i35Var = new i35(26, ib4Var2);
                    dd4Var2.p0(i35Var);
                    obj = i35Var;
                } else {
                    ib4Var2 = ib4Var;
                    obj = objQ2;
                }
                long j6 = j3;
                mx4.a(p35VarC2, wn9.K((pv9) zt9.x0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) obj, ou6VarW, false, 15), lc1.c(0.1f, j3), jf0.G), 4.0f), j6, dd4Var2, 0, 0);
                if (z2) {
                    dd4Var2.f0(-1324558131);
                    l16.a(0.0f, 384, 2, j6, dd4Var2, gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f));
                    z6 = false;
                    dd4Var2.q(false);
                } else {
                    z6 = false;
                    dd4Var2.f0(-1324369217);
                    dd4Var2.q(false);
                }
                z5 = true;
                dd4Var2.q(true);
                dd4Var2.q(z6);
            }
            dd4Var2.q(z5);
        } else {
            ib4Var2 = ib4Var;
            d35Var2 = d35Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mm6(d35Var2, z, z2, ou6Var, ib4Var2, i2, 0);
        }
    }

    public static final void G(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-942643802);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            dd4Var2.f0(1302187218);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var, 24576, 0, 130030);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, 100663296, 252);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ib4Var, ou6Var, i2, 18);
        }
    }

    public static final void H(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        ib4 ib4Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(78031450);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            uka ukaVar = ((q96) dd4Var2.j(s96.a)).b.g;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130044);
            sdc.y(tg9.n(lu6Var, 48.0f), ((lc1) dd4Var.j(oq1.a)).a, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                ib4Var2 = ib4Var;
                objQ = new i5c(2, ib4Var2);
                dd4Var.p0(objQ);
            } else {
                ib4Var2 = ib4Var;
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var, 0, 4);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var2, i2, 17);
        }
    }

    public static final void I(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(835570860);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new ho4(str, 29);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(x5c.class);
            x5c x5cVar = (x5c) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(x5cVar);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new nx9(x5cVar, 20);
                dd4Var.p0(objQ2);
            }
            lx1.g(x5cVar, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(x5cVar.Y, dd4Var);
            a07 a07VarB2 = bx1.B(x5cVar.M, dd4Var);
            fx1.p(((zy4) a07VarB2.getValue()).e, ((zy4) a07VarB2.getValue()).q, ((zy4) a07VarB2.getValue()).i, ((zy4) a07VarB2.getValue()).j, dd4Var, 0);
            dd4Var2 = dd4Var;
            lw1.e((zy4) a07VarB2.getValue(), jf0.G(-1323801496, new ev0(ou6Var, t27Var, x5cVar, a07VarB, 6), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 12);
        }
    }

    public static final void J(int i2, List list, int i3) {
        int iO = O(i2, list);
        if (iO < 0) {
            iO = -(iO + 1);
        }
        while (iO < list.size() && ((zc5) list.get(iO)).b < i3) {
        }
    }

    public static final Object K(List list, jt1 jt1Var) {
        return list.isEmpty() ? lc3.a : new ha0((ml2[]) list.toArray(new ml2[0])).a(jt1Var);
    }

    public static final Object L(ml2[] ml2VarArr, o1a o1aVar) {
        return ml2VarArr.length == 0 ? lc3.a : new ha0(ml2VarArr).a(o1aVar);
    }

    public static final void M(ni9 ni9Var, ArrayList arrayList, int i2) {
        boolean zL = ni9Var.l(i2);
        int[] iArr = ni9Var.b;
        if (zL) {
            arrayList.add(ni9Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            M(ni9Var, arrayList, i4);
        }
    }

    public static final uw1 N(int i2, int i3, dd4 dd4Var) {
        if (i3 <= 1) {
            dd4Var.f0(192977863);
            uw1 uw1Var = ((q96) dd4Var.j(s96.a)).c.d;
            dd4Var.q(false);
            return uw1Var;
        }
        if (i2 == 0) {
            dd4Var.f0(1687402259);
            ur9 ur9Var = s96.a;
            uw1 uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var.j(ur9Var)).c.a.c, ((q96) dd4Var.j(ur9Var)).c.a.d, 3);
            dd4Var.q(false);
            return uw1VarD;
        }
        if (i2 != i3 - 1) {
            dd4Var.f0(192991052);
            uw1 uw1Var2 = ((q96) dd4Var.j(s96.a)).c.a;
            dd4Var.q(false);
            return uw1Var2;
        }
        dd4Var.f0(192985923);
        ur9 ur9Var2 = s96.a;
        uw1 uw1VarD2 = uw1.d(((q96) dd4Var.j(ur9Var2)).c.d, ((q96) dd4Var.j(ur9Var2)).c.a.a, ((q96) dd4Var.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
        dd4Var.q(false);
        return uw1VarD2;
    }

    public static final int O(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iV = lc5.V(((zc5) list.get(i4)).b, i2);
            if (iV < 0) {
                i3 = i4 + 1;
            } else {
                if (iV <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final a82 P(f2a f2aVar) {
        f2aVar.getClass();
        String str = f2aVar.a;
        Map map = f2aVar.b;
        Map map2 = f2aVar.c;
        String str2 = f2aVar.d;
        int i2 = f2aVar.e;
        int i3 = f2aVar.f;
        List list = f2aVar.g;
        String str3 = f2aVar.h;
        String str4 = f2aVar.i;
        String str5 = f2aVar.j;
        String str6 = f2aVar.k;
        String str7 = f2aVar.l;
        int i4 = f2aVar.m;
        int i5 = f2aVar.n;
        Map map3 = f2aVar.o;
        boolean z = f2aVar.p;
        String str8 = f2aVar.q;
        String str9 = f2aVar.r;
        int i6 = f2aVar.s;
        return new a82(f2aVar.t, i2, i3, i4, i5, i6, f2aVar.u, f2aVar.B, f2aVar.v, f2aVar.w, f2aVar.E, f2aVar.F, f2aVar.G, f2aVar.H, f2aVar.I, str, str2, str3, str4, str5, str6, str7, str8, str9, list, map, map2, map3, f2aVar.C, f2aVar.D, z, f2aVar.x, f2aVar.y, f2aVar.z, f2aVar.A);
    }

    public static final wy6 Q(g29 g29Var, kb4 kb4Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            d29 d29VarA = g29Var.a();
            sn5 sn5Var = d29VarA.c;
            if (sn5Var.L() && sn5Var.K()) {
                kf8 kf8VarG = d29VarA.g();
                wy6 wy6Var = new wy6(48);
                uc6 uc6Var = new uc6(11);
                uc6Var.M(lw1.R(kf8VarG));
                T(kb4Var, new uc6(11), uc6Var, wy6Var, d29VarA, d29VarA);
                return wy6Var;
            }
            wy6 wy6Var2 = da5.a;
            wy6Var2.getClass();
            return wy6Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void R(kb4 kb4Var, uc6 uc6Var, uc6 uc6Var2, wy6 wy6Var, d29 d29Var, d29 d29Var2) {
        uc6 uc6Var3 = uc6Var;
        Region region = (Region) uc6Var3.a;
        uc6 uc6Var4 = uc6Var2;
        Region region2 = (Region) uc6Var4.a;
        sn5 sn5Var = d29Var2.c;
        sn5 sn5Var2 = d29Var2.c;
        if (!sn5Var.L() || !sn5Var2.K() || region2.isEmpty()) {
            if (d29Var2.o()) {
                S(wy6Var, d29Var, d29Var2);
                return;
            }
            return;
        }
        kf8 kf8VarM = d29Var2.m();
        if (kf8VarM.i()) {
            nu6 nu6VarF = d29Var2.f();
            if (nu6VarF == null) {
                x75 x75Var = (x75) sn5Var2.S.d;
                kf8VarM = e11.K(x75Var).O(x75Var, false);
            } else {
                nu6 nu6Var = nu6VarF.a;
                Object objG = d29Var2.d.a.g(u19.b);
                if (objG == null) {
                    objG = null;
                }
                kf8VarM = vw1.y(nu6Var, objG != null, false);
            }
        }
        ia5 ia5VarR = lw1.R(kf8VarM);
        uc6Var3.M(ia5VarR);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = d29Var2.f;
            d29 d29Var3 = d29Var;
            if (i2 == d29Var3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            f29 f29Var = new f29(d29Var2, new ia5(bounds.left, bounds.top, bounds.right, bounds.bottom));
            wy6 wy6Var2 = wy6Var;
            wy6Var2.i(i2, f29Var);
            List listJ = d29.j(4, d29Var2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) kb4Var.invoke(listJ.get(size))).booleanValue()) {
                    R(kb4Var, uc6Var3, uc6Var4, wy6Var2, d29Var3, (d29) listJ.get(size));
                }
                size--;
                uc6Var3 = uc6Var;
                uc6Var4 = uc6Var2;
                wy6Var2 = wy6Var;
                d29Var3 = d29Var;
            }
            if (X(d29Var2)) {
                region2.op(ia5VarR.a, ia5VarR.b, ia5VarR.c, ia5VarR.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void S(wy6 wy6Var, d29 d29Var, d29 d29Var2) {
        sn5 sn5Var;
        d29 d29VarL = d29Var2.l();
        kf8 kf8VarG = (d29VarL == null || (sn5Var = d29VarL.c) == null || !sn5Var.L()) ? x : d29VarL.g();
        int i2 = d29Var2.f;
        if (i2 == d29Var.f) {
            i2 = -1;
        }
        wy6Var.i(i2, new f29(d29Var2, lw1.R(kf8VarG)));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T(defpackage.kb4 r17, uc6 r18, uc6 r19, wy6 r20, d29 r21, d29 r22) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.T(kb4, uc6, uc6, wy6, d29, d29):void");
    }

    public static final ev8 U(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof ScopeService) {
            throw null;
        }
        if (!(componentCallbacks instanceof fk5)) {
            nc1 nc1Var = fu6.B;
            if (nc1Var != null) {
                return (ev8) ((s16) nc1Var.d).e;
            }
            gp.j("KoinApplication has not been started");
            return null;
        }
        nc1 nc1Var2 = fu6.B;
        if (nc1Var2 != null) {
            return (ev8) ((s16) nc1Var2.d).e;
        }
        gp.j("KoinApplication has not been started");
        return null;
    }

    public static final String V(ur1 ur1Var) {
        ur1Var.getClass();
        if (ur1Var.equals(tr1.d)) {
            return "FillWidth";
        }
        if (ur1Var.equals(tr1.c)) {
            return "FillHeight";
        }
        if (ur1Var.equals(tr1.g)) {
            return "FillBounds";
        }
        if (ur1Var.equals(tr1.b)) {
            return "Fit";
        }
        if (ur1Var.equals(tr1.a)) {
            return "Crop";
        }
        if (ur1Var.equals(tr1.e)) {
            return "Inside";
        }
        if (ur1Var.equals(tr1.f)) {
            return "None";
        }
        return "Unknown ContentScaleCompat: " + ur1Var;
    }

    public static final boolean W(d29 d29Var) {
        x67 x67VarD = d29Var.d();
        tz6 tz6Var = d29Var.d.a;
        return (x67VarD != null ? x67VarD.n1() : false) || tz6Var.c(j29.q) || tz6Var.c(j29.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean X(d29 r14) {
        /*
            boolean r0 = W(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            w19 r14 = r14.d
            boolean r0 = r14.c
            if (r0 != 0) goto L59
            tz6 r14 = r14.a
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            m29 r11 = (m29) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.X(d29):boolean");
    }

    public static final n1 Y(Object[] objArr) {
        objArr.getClass();
        return new n1(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(java.util.List r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.la0
            if (r0 == 0) goto L13
            r0 = r5
            la0 r0 = (defpackage.la0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            la0 r0 = new la0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.a
            defpackage.e11.e0(r5)
            goto L35
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            yd5 r5 = (defpackage.yd5) r5
            r0.a = r4
            r0.c = r2
            java.lang.Object r5 = r5.join(r0)
            xx1 r1 = defpackage.xx1.a
            if (r5 != r1) goto L35
            return r1
        L4e:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.Z(java.util.List, kt1):java.lang.Object");
    }

    public static final void a(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(273555873);
        if (dd4Var2.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            p35 p35VarC = i25.c((m53) f53.L.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            long jC = lc1.c(0.5f, ((q96) dd4Var2.j(ur9Var)).a.q);
            lu6 lu6Var = lu6.a;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 80.0f), jC, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) zt9.I0.getValue(), dd4Var2), (ou6) null, lc1.c(0.5f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(defpackage.yd5[] r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ka0
            if (r0 == 0) goto L13
            r0 = r7
            ka0 r0 = (defpackage.ka0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ka0 r0 = new ka0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r6 = r0.c
            int r1 = r0.b
            java.lang.Object[] r3 = r0.a
            yd5[] r3 = (defpackage.yd5[]) r3
            defpackage.e11.e0(r7)
            r7 = r3
            goto L52
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L35:
            defpackage.e11.e0(r7)
            int r7 = r6.length
            r1 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L3d:
            if (r1 >= r6) goto L54
            r3 = r7[r1]
            r0.a = r7
            r0.b = r1
            r0.c = r6
            r0.e = r2
            java.lang.Object r3 = r3.join(r0)
            xx1 r4 = defpackage.xx1.a
            if (r3 != r4) goto L52
            return r4
        L52:
            int r1 = r1 + r2
            goto L3d
        L54:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.a0(yd5[], kt1):java.lang.Object");
    }

    public static final void b(oy4 oy4Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(-669618692);
        int i3 = 2;
        int i4 = i2 | (dd4Var.f(oy4Var) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024);
        int i5 = 0;
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            pb pbVarS = kf0.S(dd4Var);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            ur9 ur9Var = s96.a;
            kf0.a(fe.L(fw.G(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.b), 1.0f, dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd1.g(((q96) dd4Var.j(ur9Var)).a, 3.0f), jf0.G), pbVarS, (x1a) null, 44.0f, jf0.G(1943583274, new nm6(i5, pbVarS, (vx1) objQ, ib4Var2), dd4Var), jf0.G(2143440074, new mq2(i3, ib4Var, oy4Var), dd4Var), dd4Var, 14352384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(oy4Var, ou6Var, ib4Var, ib4Var2, i2, 27);
        }
    }

    public static final ou6 b0(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new rb7(kb4Var, new mj(22, kb4Var)));
    }

    public static ir0 c(int i2, int i3, ar0 ar0Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        ar0 ar0Var2 = ar0.a;
        if (i4 != 0) {
            ar0Var = ar0Var2;
        }
        if (i2 == -2) {
            if (ar0Var != ar0Var2) {
                return new vn1(1, ar0Var, null);
            }
            h11.i.getClass();
            return new ir0(g11.b, null);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? ar0Var == ar0Var2 ? new ir0(i2, null) : new vn1(i2, ar0Var, null) : new ir0(Integer.MAX_VALUE, null) : ar0Var == ar0Var2 ? new ir0(0, null) : new vn1(1, ar0Var, null);
        }
        if (ar0Var == ar0Var2) {
            return new vn1(1, ar0.b, null);
        }
        gp.l("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static ou6 c0(ou6 ou6Var, float f2) {
        return ou6Var.e(new gb7(f2, new fa(2, f2)));
    }

    public static final void d(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-318555826);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            nha.c(str, ou6Var, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.h, dd4Var, i3 & Token.ELSE, 0, 130044);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var, i2, 8);
        }
    }

    public static final void d0(si9 si9Var, int i2, Object obj) {
        int iH = si9Var.h(i2);
        Object[] objArr = si9Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = vl1.a;
        if (obj == obj2) {
            return;
        }
        zl1.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void e(o19 o19Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-614342087);
        int i3 = 4;
        int i4 = (dd4Var.h(o19Var) ? 4 : 2) | i2;
        int i5 = 0;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            dd4Var.f0(-1009319487);
            jt1 jt1Var = null;
            e11.z(s32.U0(ah1.U(new l64(o19Var, jt1Var, 27)), o19Var.g, new ju0(o19Var, jt1Var, i3), null, new v09(o19Var, 3)), rj1Var, dd4Var, 48);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jg1(o19Var, rj1Var, i2, i5);
        }
    }

    public static final Object e0(ga1 ga1Var, String str, o1a o1aVar) {
        ClipData clipDataNewPlainText = ClipData.newPlainText("plain text", str);
        clipDataNewPlainText.getClass();
        Object objC = ga1Var.c(new fa1(clipDataNewPlainText), o1aVar);
        return objC == xx1.a ? objC : heb.a;
    }

    public static final void f(kga kgaVar, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        lu6 lu6VarU0;
        dd4Var.h0(1533506138);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(kgaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 32 : 16;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            dd4Var.f0(-885604480);
            if (kgaVar.k()) {
                jt1 jt1Var = null;
                lu6VarU0 = s32.U0(ah1.U(new fga(kgaVar, (jt1) null, 0)), kgaVar.y, new ju0(kgaVar, jt1Var, 5), new gga(kgaVar, jt1Var, i4), new gw1(kgaVar, 2));
            } else {
                lu6VarU0 = lu6.a;
            }
            e11.z(lu6VarU0, rj1Var, dd4Var, i3 & Token.ASSIGN_MOD);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ig1(kgaVar, rj1Var, i2, i4);
        }
    }

    public static final ou6 f0(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        if ((i2 & 2) != 0) {
            ib4Var = null;
        }
        ou6 ou6VarE = ou6Var.e(lu6.a);
        ur9 ur9Var = s96.a;
        ou6 ou6VarL = fe.L(t96.w(ou6VarE, ((q96) dd4Var.j(ur9Var)).c.a), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G);
        if (ib4Var != null) {
            ou6VarL = fw.J(null, ib4Var, ou6VarL, false, 15);
        }
        return gjb.l0(ou6VarL, 16.0f);
    }

    public static final void g(final fv1 fv1Var, boolean z, ou6 ou6Var, final ib4 ib4Var, dd4 dd4Var, int i2) {
        final bp bpVar;
        bp bpVar2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-638046722);
        int i3 = i2 | (dd4Var2.h(fv1Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1155) != 1154)) {
            String str = fv1Var.c;
            if (str == null) {
                str = "";
            }
            String strK = wn9.K((pv9) zt9.I.getValue(), dd4Var2);
            gf6 gf6Var = fv1Var.f;
            if (gf6Var instanceof ef6) {
                dd4Var2.f0(1017435557);
                dd4Var2.q(false);
                bpVar2 = ((ef6) gf6Var).b;
            } else if (gf6Var instanceof cf6) {
                dd4Var2.f0(1017436788);
                bpVar2 = new bp(wn9.K((pv9) vt9.q0.getValue(), dd4Var2));
                dd4Var2.q(false);
            } else if (gf6Var instanceof df6) {
                dd4Var2.f0(1475950677);
                df6 df6Var = (df6) gf6Var;
                String str2 = df6Var.b;
                switch (df6Var.c) {
                    case 100:
                        dd4Var2.f0(1017444467);
                        bpVar2 = new bp(wn9.K((pv9) zt9.z.getValue(), dd4Var2));
                        dd4Var2.q(false);
                        break;
                    case Token.ASSIGN_LOGICAL_OR /* 101 */:
                        dd4Var2.f0(1017448718);
                        bpVar2 = new bp(wn9.K((pv9) zt9.F.getValue(), dd4Var2));
                        dd4Var2.q(false);
                        break;
                    case Token.ASSIGN_BITXOR /* 102 */:
                        dd4Var2.f0(1017453012);
                        bpVar2 = new bp(wn9.K((pv9) zt9.D.getValue(), dd4Var2));
                        dd4Var2.q(false);
                        break;
                    case Token.ASSIGN_BITAND /* 103 */:
                        dd4Var2.f0(1017457343);
                        dd4Var2.q(false);
                        if (!bw9.a0(str2)) {
                            strK = dx1.h(strK, ": ", str2);
                        }
                        bpVar2 = new bp(strK);
                        break;
                    default:
                        dd4Var2.f0(1017461041);
                        dd4Var2.q(false);
                        bpVar2 = new bp("");
                        break;
                }
                dd4Var2.q(false);
            } else {
                if (gf6Var != null) {
                    throw j39.e(1017433783, dd4Var2, false);
                }
                dd4Var2.f0(1017462545);
                dd4Var2.q(false);
                bpVar = new bp("");
                final String str3 = str;
                final int i4 = 0;
                j1a.a(fw.J(null, ib4Var, ou6Var, false, 15), (t89) null, lc1.c(0.0f, ((q96) dd4Var2.j(s96.a)).a.p), 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-445014247, new yb4() { // from class: o41
                    @Override // defpackage.yb4
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        heb hebVar = heb.a;
                        iv ivVar = pv.a;
                        ou6 ou6Var2 = lu6.a;
                        fv1 fv1Var2 = fv1Var;
                        switch (i5) {
                            case 0:
                                dd4 dd4Var3 = (dd4) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!dd4Var3.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    dd4Var3.Y();
                                } else {
                                    ou6 ou6VarM0 = gjb.m0(tg9.f(ou6Var2, 1.0f), 16.0f, 10.0f);
                                    wf0 wf0Var = bv4.x;
                                    eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), wf0Var, dd4Var3, 54);
                                    int iHashCode = Long.hashCode(dd4Var3.T);
                                    lr7 lr7VarL = dd4Var3.l();
                                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarM0);
                                    ml1.k.getClass();
                                    um1 um1Var = ll1.b;
                                    dd4Var3.j0();
                                    if (dd4Var3.S) {
                                        dd4Var3.k(um1Var);
                                    } else {
                                        dd4Var3.s0();
                                    }
                                    jm jmVar = ll1.f;
                                    un9.s(jmVar, dd4Var3, eq8VarA);
                                    jm jmVar2 = ll1.e;
                                    un9.s(jmVar2, dd4Var3, lr7VarL);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    jm jmVar3 = ll1.g;
                                    un9.s(jmVar3, dd4Var3, numValueOf);
                                    kd kdVar = ll1.h;
                                    un9.r(dd4Var3, kdVar);
                                    jm jmVar4 = ll1.d;
                                    un9.s(jmVar4, dd4Var3, ou6VarL0);
                                    String str4 = fv1Var2.d;
                                    String str5 = str4 == null ? "" : str4;
                                    ou6 ou6VarN = tg9.n(ou6Var2, 44.0f);
                                    String str6 = str3;
                                    sg9.a(str5, str6, ou6VarN, ib4Var, dd4Var3, 384, 0);
                                    hq8 hq8Var = hq8.a;
                                    ou6 ou6VarB = hq8Var.b(1.0f, ou6Var2, true);
                                    ie1 ie1VarA = ge1.a(new mv(2.0f, true, new gp(5)), bv4.z, dd4Var3, 6);
                                    int iHashCode2 = Long.hashCode(dd4Var3.T);
                                    lr7 lr7VarL2 = dd4Var3.l();
                                    ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarB);
                                    dd4Var3.j0();
                                    if (dd4Var3.S) {
                                        dd4Var3.k(um1Var);
                                    } else {
                                        dd4Var3.s0();
                                    }
                                    un9.s(jmVar, dd4Var3, ie1VarA);
                                    un9.s(jmVar2, dd4Var3, lr7VarL2);
                                    ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                                    un9.s(jmVar4, dd4Var3, ou6VarL02);
                                    ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
                                    eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                                    lr7 lr7VarL3 = dd4Var3.l();
                                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarF);
                                    dd4Var3.j0();
                                    if (dd4Var3.S) {
                                        dd4Var3.k(um1Var);
                                    } else {
                                        dd4Var3.s0();
                                    }
                                    un9.s(jmVar, dd4Var3, eq8VarA2);
                                    un9.s(jmVar2, dd4Var3, lr7VarL3);
                                    ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                                    un9.s(jmVar4, dd4Var3, ou6VarL03);
                                    nha.c(str6, hq8Var.b(1.0f, ou6Var2, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var3).i, dd4Var3, 0, 24960, 110588);
                                    if (fv1Var2.k > 0) {
                                        xv5.y(dd4Var3, -1853179981, ou6Var2, 8.0f, dd4Var3);
                                        ri9.f(fv1Var2.k, (ou6) null, false, s00.o(dd4Var3).s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).o, dd4Var3, 384, 0, 131058);
                                        dd4Var3.q(false);
                                    } else {
                                        dd4Var3.f0(-1852791737);
                                        dd4Var3.q(false);
                                    }
                                    dd4Var3.q(true);
                                    ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
                                    eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                                    int iHashCode4 = Long.hashCode(dd4Var3.T);
                                    lr7 lr7VarL4 = dd4Var3.l();
                                    ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarF2);
                                    dd4Var3.j0();
                                    if (dd4Var3.S) {
                                        dd4Var3.k(um1Var);
                                    } else {
                                        dd4Var3.s0();
                                    }
                                    un9.s(jmVar, dd4Var3, eq8VarA3);
                                    un9.s(jmVar2, dd4Var3, lr7VarL4);
                                    ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
                                    un9.s(jmVar4, dd4Var3, ou6VarL04);
                                    i12.d(bpVar, false, uka.a(s00.q(dd4Var3).l, s00.o(dd4Var3).s, 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646142), 0, 0, 2, 2, hq8Var.b(1.0f, ou6Var2, true), (kb4) null, (kb4) null, (yb4) null, dd4Var3, 1769520, 1816);
                                    if (fv1Var2.g > 0) {
                                        xv5.y(dd4Var3, -47375476, ou6Var2, 8.0f, dd4Var3);
                                        yb0.a(3072, 5, s00.o(dd4Var3).a, 0L, jf0.G(1935014844, new nl9(fv1Var2, 7), dd4Var3), dd4Var3, null);
                                        dd4Var3.q(false);
                                    } else {
                                        dd4Var3.f0(-47112162);
                                        dd4Var3.q(false);
                                    }
                                    tw2.x(dd4Var3, true, true, true);
                                }
                                break;
                            default:
                                dd4 dd4Var4 = (dd4) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    dd4Var4.Y();
                                } else {
                                    ou6 ou6VarM02 = gjb.m0(tg9.f(ou6Var2, 1.0f), 16.0f, 12.0f);
                                    wf0 wf0Var2 = bv4.x;
                                    eq8 eq8VarA4 = dq8.a(new mv(12.0f, true, new gp(5)), wf0Var2, dd4Var4, 54);
                                    int iHashCode5 = Long.hashCode(dd4Var4.T);
                                    lr7 lr7VarL5 = dd4Var4.l();
                                    ou6 ou6VarL05 = s32.L0(dd4Var4, ou6VarM02);
                                    ml1.k.getClass();
                                    um1 um1Var2 = ll1.b;
                                    dd4Var4.j0();
                                    if (dd4Var4.S) {
                                        dd4Var4.k(um1Var2);
                                    } else {
                                        dd4Var4.s0();
                                    }
                                    jm jmVar5 = ll1.f;
                                    un9.s(jmVar5, dd4Var4, eq8VarA4);
                                    jm jmVar6 = ll1.e;
                                    un9.s(jmVar6, dd4Var4, lr7VarL5);
                                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                                    jm jmVar7 = ll1.g;
                                    un9.s(jmVar7, dd4Var4, numValueOf2);
                                    kd kdVar2 = ll1.h;
                                    un9.r(dd4Var4, kdVar2);
                                    jm jmVar8 = ll1.d;
                                    un9.s(jmVar8, dd4Var4, ou6VarL05);
                                    String str7 = fv1Var2.d;
                                    String str8 = str7 == null ? "" : str7;
                                    ou6 ou6VarN2 = tg9.n(ou6Var2, 44.0f);
                                    String str9 = str3;
                                    sg9.a(str8, str9, ou6VarN2, ib4Var, dd4Var4, 384, 0);
                                    if (1.0f <= 0.0d) {
                                        o75.a("invalid weight; must be greater than zero");
                                    }
                                    bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                    ie1 ie1VarA2 = ge1.a(new mv(2.0f, true, new gp(5)), bv4.z, dd4Var4, 6);
                                    int iHashCode6 = Long.hashCode(dd4Var4.T);
                                    lr7 lr7VarL6 = dd4Var4.l();
                                    ou6 ou6VarL06 = s32.L0(dd4Var4, bp5Var);
                                    dd4Var4.j0();
                                    if (dd4Var4.S) {
                                        dd4Var4.k(um1Var2);
                                    } else {
                                        dd4Var4.s0();
                                    }
                                    un9.s(jmVar5, dd4Var4, ie1VarA2);
                                    un9.s(jmVar6, dd4Var4, lr7VarL6);
                                    ky0.v(iHashCode6, dd4Var4, jmVar7, dd4Var4, kdVar2);
                                    un9.s(jmVar8, dd4Var4, ou6VarL06);
                                    ou6 ou6VarF3 = tg9.f(ou6Var2, 1.0f);
                                    eq8 eq8VarA5 = dq8.a(ivVar, wf0Var2, dd4Var4, 48);
                                    int iHashCode7 = Long.hashCode(dd4Var4.T);
                                    lr7 lr7VarL7 = dd4Var4.l();
                                    ou6 ou6VarL07 = s32.L0(dd4Var4, ou6VarF3);
                                    dd4Var4.j0();
                                    if (dd4Var4.S) {
                                        dd4Var4.k(um1Var2);
                                    } else {
                                        dd4Var4.s0();
                                    }
                                    un9.s(jmVar5, dd4Var4, eq8VarA5);
                                    un9.s(jmVar6, dd4Var4, lr7VarL7);
                                    ky0.v(iHashCode7, dd4Var4, jmVar7, dd4Var4, kdVar2);
                                    un9.s(jmVar8, dd4Var4, ou6VarL07);
                                    ur9 ur9Var = s96.a;
                                    uka ukaVar = ((q96) dd4Var4.j(ur9Var)).b.i;
                                    if (1.0f <= 0.0d) {
                                        o75.a("invalid weight; must be greater than zero");
                                    }
                                    nha.c(str9, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var4, 0, 24960, 110588);
                                    if (fv1Var2.k > 0) {
                                        dd4Var4.f0(536592776);
                                        un9.a(dd4Var4, tg9.n(ou6Var2, 8.0f));
                                        ri9.f(fv1Var2.k, (ou6) null, false, ((q96) dd4Var4.j(ur9Var)).a.s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var)).b.o, dd4Var4, 384, 0, 131058);
                                        dd4Var4.q(false);
                                    } else {
                                        dd4Var4.f0(536980059);
                                        dd4Var4.q(false);
                                    }
                                    dd4Var4.q(true);
                                    bp bpVar3 = bpVar;
                                    if (bw9.a0(bpVar3.b)) {
                                        bpVar3 = null;
                                    }
                                    if (bpVar3 == null) {
                                        dd4Var4.f0(-1111712227);
                                        bpVar3 = new bp(wn9.L((pv9) zt9.m.getValue(), new Object[]{Integer.valueOf(fv1Var2.h)}, dd4Var4));
                                        dd4Var4.q(false);
                                    } else {
                                        dd4Var4.f0(-1111713591);
                                        dd4Var4.q(false);
                                    }
                                    i12.d(bpVar3, false, uka.a(((q96) dd4Var4.j(ur9Var)).b.l, ((q96) dd4Var4.j(ur9Var)).a.s, 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646142), 0, 0, 2, 2, (ou6) null, (kb4) null, (kb4) null, (yb4) null, dd4Var4, 1769520, 1944);
                                    dd4Var4.q(true);
                                    dd4Var4.q(true);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var2), dd4Var, 12582912, Token.FUNCTION);
                dd4Var2 = dd4Var;
            }
            bpVar = bpVar2;
            final String str32 = str;
            final int i42 = 0;
            j1a.a(fw.J(null, ib4Var, ou6Var, false, 15), (t89) null, lc1.c(0.0f, ((q96) dd4Var2.j(s96.a)).a.p), 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-445014247, new yb4() { // from class: o41
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i42;
                    heb hebVar = heb.a;
                    iv ivVar = pv.a;
                    ou6 ou6Var2 = lu6.a;
                    fv1 fv1Var2 = fv1Var;
                    switch (i5) {
                        case 0:
                            dd4 dd4Var3 = (dd4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!dd4Var3.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                                dd4Var3.Y();
                            } else {
                                ou6 ou6VarM0 = gjb.m0(tg9.f(ou6Var2, 1.0f), 16.0f, 10.0f);
                                wf0 wf0Var = bv4.x;
                                eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), wf0Var, dd4Var3, 54);
                                int iHashCode = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL = dd4Var3.l();
                                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarM0);
                                ml1.k.getClass();
                                um1 um1Var = ll1.b;
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                jm jmVar = ll1.f;
                                un9.s(jmVar, dd4Var3, eq8VarA);
                                jm jmVar2 = ll1.e;
                                un9.s(jmVar2, dd4Var3, lr7VarL);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                jm jmVar3 = ll1.g;
                                un9.s(jmVar3, dd4Var3, numValueOf);
                                kd kdVar = ll1.h;
                                un9.r(dd4Var3, kdVar);
                                jm jmVar4 = ll1.d;
                                un9.s(jmVar4, dd4Var3, ou6VarL0);
                                String str4 = fv1Var2.d;
                                String str5 = str4 == null ? "" : str4;
                                ou6 ou6VarN = tg9.n(ou6Var2, 44.0f);
                                String str6 = str32;
                                sg9.a(str5, str6, ou6VarN, ib4Var, dd4Var3, 384, 0);
                                hq8 hq8Var = hq8.a;
                                ou6 ou6VarB = hq8Var.b(1.0f, ou6Var2, true);
                                ie1 ie1VarA = ge1.a(new mv(2.0f, true, new gp(5)), bv4.z, dd4Var3, 6);
                                int iHashCode2 = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL2 = dd4Var3.l();
                                ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarB);
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(jmVar, dd4Var3, ie1VarA);
                                un9.s(jmVar2, dd4Var3, lr7VarL2);
                                ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                                un9.s(jmVar4, dd4Var3, ou6VarL02);
                                ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
                                eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                                int iHashCode3 = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL3 = dd4Var3.l();
                                ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarF);
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(jmVar, dd4Var3, eq8VarA2);
                                un9.s(jmVar2, dd4Var3, lr7VarL3);
                                ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                                un9.s(jmVar4, dd4Var3, ou6VarL03);
                                nha.c(str6, hq8Var.b(1.0f, ou6Var2, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var3).i, dd4Var3, 0, 24960, 110588);
                                if (fv1Var2.k > 0) {
                                    xv5.y(dd4Var3, -1853179981, ou6Var2, 8.0f, dd4Var3);
                                    ri9.f(fv1Var2.k, (ou6) null, false, s00.o(dd4Var3).s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).o, dd4Var3, 384, 0, 131058);
                                    dd4Var3.q(false);
                                } else {
                                    dd4Var3.f0(-1852791737);
                                    dd4Var3.q(false);
                                }
                                dd4Var3.q(true);
                                ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
                                eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                                int iHashCode4 = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL4 = dd4Var3.l();
                                ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarF2);
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(jmVar, dd4Var3, eq8VarA3);
                                un9.s(jmVar2, dd4Var3, lr7VarL4);
                                ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
                                un9.s(jmVar4, dd4Var3, ou6VarL04);
                                i12.d(bpVar, false, uka.a(s00.q(dd4Var3).l, s00.o(dd4Var3).s, 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646142), 0, 0, 2, 2, hq8Var.b(1.0f, ou6Var2, true), (kb4) null, (kb4) null, (yb4) null, dd4Var3, 1769520, 1816);
                                if (fv1Var2.g > 0) {
                                    xv5.y(dd4Var3, -47375476, ou6Var2, 8.0f, dd4Var3);
                                    yb0.a(3072, 5, s00.o(dd4Var3).a, 0L, jf0.G(1935014844, new nl9(fv1Var2, 7), dd4Var3), dd4Var3, null);
                                    dd4Var3.q(false);
                                } else {
                                    dd4Var3.f0(-47112162);
                                    dd4Var3.q(false);
                                }
                                tw2.x(dd4Var3, true, true, true);
                            }
                            break;
                        default:
                            dd4 dd4Var4 = (dd4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dd4Var4.Y();
                            } else {
                                ou6 ou6VarM02 = gjb.m0(tg9.f(ou6Var2, 1.0f), 16.0f, 12.0f);
                                wf0 wf0Var2 = bv4.x;
                                eq8 eq8VarA4 = dq8.a(new mv(12.0f, true, new gp(5)), wf0Var2, dd4Var4, 54);
                                int iHashCode5 = Long.hashCode(dd4Var4.T);
                                lr7 lr7VarL5 = dd4Var4.l();
                                ou6 ou6VarL05 = s32.L0(dd4Var4, ou6VarM02);
                                ml1.k.getClass();
                                um1 um1Var2 = ll1.b;
                                dd4Var4.j0();
                                if (dd4Var4.S) {
                                    dd4Var4.k(um1Var2);
                                } else {
                                    dd4Var4.s0();
                                }
                                jm jmVar5 = ll1.f;
                                un9.s(jmVar5, dd4Var4, eq8VarA4);
                                jm jmVar6 = ll1.e;
                                un9.s(jmVar6, dd4Var4, lr7VarL5);
                                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                                jm jmVar7 = ll1.g;
                                un9.s(jmVar7, dd4Var4, numValueOf2);
                                kd kdVar2 = ll1.h;
                                un9.r(dd4Var4, kdVar2);
                                jm jmVar8 = ll1.d;
                                un9.s(jmVar8, dd4Var4, ou6VarL05);
                                String str7 = fv1Var2.d;
                                String str8 = str7 == null ? "" : str7;
                                ou6 ou6VarN2 = tg9.n(ou6Var2, 44.0f);
                                String str9 = str32;
                                sg9.a(str8, str9, ou6VarN2, ib4Var, dd4Var4, 384, 0);
                                if (1.0f <= 0.0d) {
                                    o75.a("invalid weight; must be greater than zero");
                                }
                                bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                ie1 ie1VarA2 = ge1.a(new mv(2.0f, true, new gp(5)), bv4.z, dd4Var4, 6);
                                int iHashCode6 = Long.hashCode(dd4Var4.T);
                                lr7 lr7VarL6 = dd4Var4.l();
                                ou6 ou6VarL06 = s32.L0(dd4Var4, bp5Var);
                                dd4Var4.j0();
                                if (dd4Var4.S) {
                                    dd4Var4.k(um1Var2);
                                } else {
                                    dd4Var4.s0();
                                }
                                un9.s(jmVar5, dd4Var4, ie1VarA2);
                                un9.s(jmVar6, dd4Var4, lr7VarL6);
                                ky0.v(iHashCode6, dd4Var4, jmVar7, dd4Var4, kdVar2);
                                un9.s(jmVar8, dd4Var4, ou6VarL06);
                                ou6 ou6VarF3 = tg9.f(ou6Var2, 1.0f);
                                eq8 eq8VarA5 = dq8.a(ivVar, wf0Var2, dd4Var4, 48);
                                int iHashCode7 = Long.hashCode(dd4Var4.T);
                                lr7 lr7VarL7 = dd4Var4.l();
                                ou6 ou6VarL07 = s32.L0(dd4Var4, ou6VarF3);
                                dd4Var4.j0();
                                if (dd4Var4.S) {
                                    dd4Var4.k(um1Var2);
                                } else {
                                    dd4Var4.s0();
                                }
                                un9.s(jmVar5, dd4Var4, eq8VarA5);
                                un9.s(jmVar6, dd4Var4, lr7VarL7);
                                ky0.v(iHashCode7, dd4Var4, jmVar7, dd4Var4, kdVar2);
                                un9.s(jmVar8, dd4Var4, ou6VarL07);
                                ur9 ur9Var = s96.a;
                                uka ukaVar = ((q96) dd4Var4.j(ur9Var)).b.i;
                                if (1.0f <= 0.0d) {
                                    o75.a("invalid weight; must be greater than zero");
                                }
                                nha.c(str9, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var4, 0, 24960, 110588);
                                if (fv1Var2.k > 0) {
                                    dd4Var4.f0(536592776);
                                    un9.a(dd4Var4, tg9.n(ou6Var2, 8.0f));
                                    ri9.f(fv1Var2.k, (ou6) null, false, ((q96) dd4Var4.j(ur9Var)).a.s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(ur9Var)).b.o, dd4Var4, 384, 0, 131058);
                                    dd4Var4.q(false);
                                } else {
                                    dd4Var4.f0(536980059);
                                    dd4Var4.q(false);
                                }
                                dd4Var4.q(true);
                                bp bpVar3 = bpVar;
                                if (bw9.a0(bpVar3.b)) {
                                    bpVar3 = null;
                                }
                                if (bpVar3 == null) {
                                    dd4Var4.f0(-1111712227);
                                    bpVar3 = new bp(wn9.L((pv9) zt9.m.getValue(), new Object[]{Integer.valueOf(fv1Var2.h)}, dd4Var4));
                                    dd4Var4.q(false);
                                } else {
                                    dd4Var4.f0(-1111713591);
                                    dd4Var4.q(false);
                                }
                                i12.d(bpVar3, false, uka.a(((q96) dd4Var4.j(ur9Var)).b.l, ((q96) dd4Var4.j(ur9Var)).a.s, 0L, (a84) null, (c64) null, 0L, spa.c, (iy5) null, 16646142), 0, 0, 2, 2, (ou6) null, (kb4) null, (kb4) null, (yb4) null, dd4Var4, 1769520, 1944);
                                dd4Var4.q(true);
                                dd4Var4.q(true);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var2), dd4Var, 12582912, Token.FUNCTION);
            dd4Var2 = dd4Var;
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(fv1Var, z, ou6Var, ib4Var, i2, 2);
        }
    }

    public static final ou6 g0(boolean z, boolean z2, ib4 ib4Var) {
        sx9 sx9Var = lu6.a;
        if (!z || !rx9.a) {
            return sx9Var;
        }
        if (z2) {
            sx9Var = new sx9(y);
        }
        return sx9Var.e(new px9(ib4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(ou6 r28, defpackage.kb4 r29, defpackage.ib4 r30, dd4 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.h(ou6, kb4, ib4, dd4, int):void");
    }

    public static void h0(bg9 bg9Var, byte[] bArr) {
        int length = bArr.length;
        bg9Var.getClass();
        bArr.getClass();
        bg9Var.b0(length, bArr);
    }

    public static final void i(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1692774168);
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                ArrayList arrayList = new ArrayList(8);
                for (int i4 = 0; i4 < 8; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                dd4Var.p0(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            szb szbVarW = yib.w(yib.e(dd4Var, 14), gjb.q(0.0f, 68.0f, 0.0f, 92.0f, 5));
            ou6 ou6VarE = yn2.E(ou6Var, dd4Var, 6);
            szb szbVarW2 = yib.w(szbVarW, gjb.o(2, 16.0f));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zH = dd4Var.h(list);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == fu6Var) {
                objQ2 = new m41(i3, list);
                dd4Var.p0(objQ2);
            }
            rw1.j(ou6VarE, null, szbVarW2, false, mvVar, null, null, false, null, (kb4) objQ2, dd4Var, 12607488, 362);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 1);
        }
    }

    public static final void j(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(-1502049473);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            j1a.a((ou6) null, (t89) null, 0L, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-1330888892, new q41(t27Var, i4), dd4Var), dd4Var, 12582912, Token.SWITCH);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 5, t27Var);
        }
    }

    public static final void k(final String str, final ib4 ib4Var, dd4 dd4Var, final int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-934402734);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6.a, 1.0f), 3), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 6.0f, 5);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarP0);
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
            sw1.a(i3 & Token.ASSIGN_MOD, ib4Var, dd4Var2, (ou6) null);
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.g, dd4Var, i3 & 14, 0, 131068);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            final int i4 = 0;
            ye8VarU.d = new yb4(i2, i4, ib4Var, str) { // from class: r41
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ ib4 c;

                {
                    this.a = i4;
                    this.b = str;
                    this.c = ib4Var;
                }

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    heb hebVar = heb.a;
                    ib4 ib4Var2 = this.c;
                    String str2 = this.b;
                    dd4 dd4Var3 = (dd4) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            vm7.k(str2, ib4Var2, dd4Var3, qu1.x0(1));
                            break;
                        default:
                            bx1.q(str2, ib4Var2, dd4Var3, qu1.x0(1));
                            break;
                    }
                    return hebVar;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(wga r14, ou6 r15, java.lang.String r16, defpackage.kb4 r17, defpackage.ib4 r18, dd4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm7.l(wga, ou6, java.lang.String, kb4, ib4, dd4, int, int):void");
    }

    public static final void m(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str, boolean z) {
        long jG;
        dd4Var.h0(-1966426679);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z) ? 32 : 16;
        }
        int i4 = i3 | (dd4Var.f(ou6Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var) ? 2048 : 1024);
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarJ = fw.J(null, ib4Var, t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.d), false, 15);
            if (z) {
                dd4Var.f0(1537023650);
                jG = lc1.c(0.7f, ((q96) dd4Var.j(ur9Var)).a.h);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1537115658);
                jG = dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f);
                dd4Var.q(false);
            }
            j1a.a(ou6VarJ, (t89) null, jG, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-1145811932, new z31(str, 3), dd4Var), dd4Var, 12582912, Token.FUNCTION);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p41(str, z, ou6Var, ib4Var, i2);
        }
    }

    public static final void n(int i2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-517431602);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(2015114624);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            boolean z = false;
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 261118);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, 100663296, 252);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            if ((i3 & 7168) == 2048) {
                z = true;
            }
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new xf3(1, ib4Var2);
                dd4Var2.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var2, 0, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ou6Var, ib4Var, ib4Var2, i2, 3);
        }
    }

    public static final void o(String str, String str2, String str3, String str4, ou6 ou6Var, boolean z, ac4 ac4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        ib4 ib4Var2;
        br9 br9Var;
        lu6 lu6Var;
        kd kdVar;
        int i3;
        br9 br9Var2;
        int i4;
        ib4 ib4Var3;
        boolean z2;
        yb4 yb4Var;
        br9 br9Var3;
        aw3 aw3Var;
        Object obj;
        a07 a07Var;
        yb4 yb4Var2;
        a07 a07Var2;
        dd4 dd4Var3;
        String str5;
        String str6;
        br9 br9Var4;
        Object obj2;
        qr1 qr1Var = ra1.d;
        dd4Var.h0(24056214);
        int i5 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(str4) ? 2048 : 1024) | (dd4Var.f(ou6Var) ? 16384 : 8192) | (dd4Var.g(z) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ac4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i5 & 1, (i5 & 4793491) != 4793490)) {
            Object[] objArr = new Object[0];
            int i6 = i5 & Token.ASSIGN_MOD;
            boolean z3 = i6 == 32;
            Object objQ = dd4Var.Q();
            Object obj3 = vl1.a;
            if (z3 || objQ == obj3) {
                objQ = new wj0(str2, 20);
                dd4Var.p0(objQ);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            boolean z4 = (i5 & 896) == 256;
            Object objQ2 = dd4Var.Q();
            if (z4 || objQ2 == obj3) {
                objQ2 = new wj0(str3, 18);
                dd4Var.p0(objQ2);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 0);
            Object[] objArr3 = new Object[0];
            boolean z5 = (i5 & 7168) == 2048;
            Object objQ3 = dd4Var.Q();
            if (z5 || objQ3 == obj3) {
                objQ3 = new wj0(str4, 19);
                dd4Var.p0(objQ3);
            }
            br9 br9Var5 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 0);
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj3) {
                objQ4 = dk9.x((Object) null);
                dd4Var.p0(objQ4);
            }
            br9 br9Var6 = (a07) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj3) {
                objQ5 = new wf3(br9Var6, 1);
                dd4Var.p0(objQ5);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ5, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj3) {
                br9Var = br9Var6;
                objQ6 = new g53(28);
                dd4Var.p0(objQ6);
            } else {
                br9Var = br9Var6;
            }
            a07 a07Var5 = (a07) ww1.b0(objArr4, (ib4) objQ6, dd4Var, 48);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            yb4 yb4Var3 = ll1.f;
            un9.s(yb4Var3, dd4Var, ha6VarD);
            yb4 yb4Var4 = ll1.e;
            un9.s(yb4Var4, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar = ll1.g;
            un9.s(jmVar, dd4Var, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var, kdVar2);
            jm jmVar2 = ll1.d;
            un9.s(jmVar2, dd4Var, ou6VarL0);
            lu6 lu6Var2 = lu6.a;
            ou6 ou6VarQ = kc5.Q(yn2.E(zn0.a.a(tg9.c(lu6Var2, 1.0f), bv4.c), dd4Var, 0), kc5.J(dd4Var), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ie1VarA);
            un9.s(yb4Var4, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL02);
            un9.a(dd4Var, tg9.h(lu6Var2, 44.0f));
            ou6 ou6VarW = t96.w(tg9.o(lu6Var2, 120.0f, 180.0f), s00.p(dd4Var).b);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ha6VarD2);
            un9.s(yb4Var4, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL03);
            if (((bi5) br9Var.getValue()) == null) {
                dd4Var.f0(-1383938675);
                kdVar = kdVar2;
                i3 = 0;
                lu6Var = lu6Var2;
                br9Var2 = br9Var;
                i4 = i5;
                w05.c(str, str2, "", "", qr1Var, tg9.c, dd4Var, (i5 & 14) | 224640 | i6);
                dd4Var.q(false);
                yb4Var = yb4Var3;
                ib4Var3 = ib4Var4;
                br9Var3 = br9Var5;
                z2 = true;
                aw3Var = aw3VarC0;
                obj = obj3;
                a07Var2 = a07Var4;
                a07Var = a07Var3;
                dd4Var3 = dd4Var;
                yb4Var2 = yb4Var4;
            } else {
                lu6Var = lu6Var2;
                kdVar = kdVar2;
                i3 = 0;
                br9Var2 = br9Var;
                i4 = i5;
                dd4Var.f0(-1383556755);
                bi5 bi5Var = (bi5) br9Var2.getValue();
                if (bi5Var == null) {
                    dd4Var.f0(-1383556756);
                    dd4Var.q(false);
                    yb4Var = yb4Var3;
                    ib4Var3 = ib4Var4;
                    br9Var3 = br9Var5;
                    z2 = true;
                    aw3Var = aw3VarC0;
                    obj = obj3;
                    a07Var2 = a07Var4;
                    a07Var = a07Var3;
                    dd4Var3 = dd4Var;
                    yb4Var2 = yb4Var4;
                } else {
                    dd4Var.f0(-1383556755);
                    ib4Var3 = ib4Var4;
                    z2 = true;
                    yb4Var = yb4Var3;
                    br9Var3 = br9Var5;
                    aw3Var = aw3VarC0;
                    obj = obj3;
                    a07Var = a07Var3;
                    yb4Var2 = yb4Var4;
                    a07Var2 = a07Var4;
                    w05.a(bi5Var, qr1Var, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
                    dd4Var3 = dd4Var;
                    dd4Var3.q(false);
                }
                dd4Var3.q(false);
            }
            lu6 lu6Var3 = lu6Var;
            xv5.z(dd4Var3, z2, lu6Var3, 8.0f, dd4Var3);
            p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var3, i3);
            String strK = wn9.K((pv9) vt9.d0.getValue(), dd4Var3);
            boolean zF = dd4Var3.f(aw3Var);
            Object objQ7 = dd4Var3.Q();
            if (zF || objQ7 == obj) {
                str5 = strK;
                objQ7 = new k51(aw3Var, 4);
                dd4Var3.p0(objQ7);
            } else {
                str5 = strK;
            }
            kc5.n(p35VarC, str5, false, null, null, null, null, null, (ib4) objQ7, dd4Var, 0, 252);
            String str7 = (String) tw2.l(lu6Var3, 12.0f, dd4Var, a07Var);
            uw1 uw1Var = s00.p(dd4Var).b;
            ou6 ou6VarN0 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ8 = dd4Var.Q();
            if (zF2 || objQ8 == obj) {
                objQ8 = new wf3(a07Var, 2);
                dd4Var.p0(objQ8);
            }
            lx1.m(str7, (kb4) objQ8, ou6VarN0, false, false, null, md2.g, null, null, null, false, null, null, null, false, 0, 0, uw1Var, null, dd4Var, 1573248, 0, 6291384);
            String str8 = (String) tw2.l(lu6Var3, 12.0f, dd4Var, a07Var2);
            uw1 uw1Var2 = s00.p(dd4Var).b;
            a07 a07Var6 = a07Var;
            ou6 ou6VarN02 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF3 = dd4Var.f(a07Var2);
            Object objQ9 = dd4Var.Q();
            if (zF3 || objQ9 == obj) {
                objQ9 = new wf3(a07Var2, 3);
                dd4Var.p0(objQ9);
            }
            lx1.m(str8, (kb4) objQ9, ou6VarN02, false, false, null, md2.h, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var, 1573248, 0, 6291384);
            un9.a(dd4Var, tg9.h(lu6Var3, 12.0f));
            nha.c(wn9.K((pv9) iu9.g0.getValue(), dd4Var), lu6Var3, s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).i, dd4Var, 48, 0, 131064);
            un9.a(dd4Var, tg9.h(lu6Var3, 6.0f));
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(tg9.t(tg9.h(lu6Var3, 56.0f), 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2), s00.p(dd4Var).b);
            boolean zF4 = dd4Var.f(a07Var5);
            Object objQ10 = dd4Var.Q();
            if (zF4 || objQ10 == obj) {
                objQ10 = new bv1(a07Var5, 24);
                dd4Var.p0(objQ10);
            }
            ou6 ou6VarN03 = gjb.n0(fw.G(fw.J(null, (ib4) objQ10, ou6VarW2, false, 15), 1.5f, s00.o(dd4Var).A, s00.p(dd4Var).b), 12.0f, 0.0f, 2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN03);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var3);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var, dd4Var, eq8VarA);
            un9.s(yb4Var2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar, dd4Var, kdVar);
            un9.s(jmVar2, dd4Var, ou6VarL04);
            boolean zF5 = dd4Var.f((String) br9Var3.getValue());
            Object objQ11 = dd4Var.Q();
            Object obj4 = objQ11;
            if (zF5 || objQ11 == obj) {
                str6 = "";
                String strA = str6;
                if (((String) br9Var3.getValue()).length() != 0) {
                    f36 f36VarL = sw1.L((String) br9Var3.getValue());
                    String strB = f36VarL != null ? f36VarL.b(sw1.N()) : null;
                    strA = j39.A(strB != null ? strB : "", " (", (String) br9Var3.getValue(), ")");
                }
                dd4Var.p0(strA);
                obj4 = strA;
            }
            String strK2 = (String) obj4;
            dd4Var.f0(2101561550);
            if (strK2.length() == 0) {
                strK2 = wn9.K((pv9) eu9.n.getValue(), dd4Var);
            }
            dd4Var.q(false);
            nha.c(strK2, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262140);
            Object obj5 = obj;
            a07 a07Var7 = a07Var2;
            br9 br9Var7 = br9Var3;
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, 0), (String) null, gjb.p0(lu6Var3, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, dd4Var, 432, 8);
            xv5.z(dd4Var, true, lu6Var3, 12.0f, dd4Var);
            if (z) {
                dd4Var.f0(-1144061473);
                sdc.y(tg9.n(lu6Var3, 28.0f), 0L, null, dd4Var, 6, 6);
                dd4Var.q(false);
                br9Var4 = br9Var7;
                obj2 = obj5;
                dd4Var2 = dd4Var;
            } else {
                dd4Var.f0(-1143876000);
                p35 p35VarC2 = i25.c((m53) f53.g0.getValue(), dd4Var, 0);
                String strK3 = wn9.K((pv9) iu9.v.getValue(), dd4Var);
                ou6 ou6VarN04 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
                boolean z6 = ((String) a07Var6.getValue()).length() > 0 && ((String) br9Var7.getValue()).length() > 0;
                boolean zF6 = ((i4 & 3670016) == 1048576) | dd4Var.f(a07Var6) | dd4Var.f(a07Var7) | dd4Var.f(br9Var7);
                Object objQ12 = dd4Var.Q();
                if (zF6 || objQ12 == obj5) {
                    objQ12 = new sx2(ac4Var, a07Var6, a07Var7, br9Var7, br9Var2, 2);
                    br9Var4 = br9Var7;
                    dd4Var.p0(objQ12);
                } else {
                    br9Var4 = br9Var7;
                }
                obj2 = obj5;
                kc5.n(p35VarC2, strK3, z6, null, ou6VarN04, null, null, null, (ib4) objQ12, dd4Var, 24576, 232);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            boolean zBooleanValue = ((Boolean) a07Var5.getValue()).booleanValue();
            boolean zF7 = dd4Var2.f(a07Var5);
            Object objQ13 = dd4Var2.Q();
            if (zF7 || objQ13 == obj2) {
                objQ13 = new wf3(a07Var5, 0);
                dd4Var2.p0(objQ13);
            }
            kb4 kb4Var = (kb4) objQ13;
            boolean zF8 = dd4Var2.f(br9Var4) | dd4Var2.f(a07Var5);
            Object objQ14 = dd4Var2.Q();
            if (zF8 || objQ14 == obj2) {
                objQ14 = new rl0(br9Var4, a07Var5, 9);
                dd4Var2.p0(objQ14);
            }
            kl8.y(zBooleanValue, kb4Var, (kb4) objQ14, dd4Var2, 0);
            p35 p35VarC3 = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            boolean z7 = (i4 & 29360128) == 8388608;
            Object objQ15 = dd4Var2.Q();
            if (z7 || objQ15 == obj2) {
                ib4Var2 = ib4Var;
                objQ15 = new mh1(29, ib4Var2);
                dd4Var2.p0(objQ15);
            } else {
                ib4Var2 = ib4Var;
            }
            sw1.r(p35VarC3, lu6Var3, 0L, (ib4) objQ15, dd4Var2, 48, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qx2(str, str2, str3, str4, ou6Var, z, ac4Var, ib4Var2, i2, 1);
        }
    }

    public static final void p(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1661059062);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130040);
            sdc.y(tg9.n(lu6Var, 48.0f), ((q96) dd4Var.j(ur9Var)).a.q, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new xf3(0, ib4Var);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var, 0, 4);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 5);
        }
    }

    public static final void q(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-925805020);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new wj0(str, 17);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(vf3.class);
            vf3 vf3Var = (vf3) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(vf3Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new rx2(vf3Var, 5);
                dd4Var.p0(objQ2);
            }
            lx1.g(vf3Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(vf3Var.j0, dd4Var);
            a07 a07VarB2 = bx1.B(vf3Var.U0, dd4Var);
            ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
            boolean zF2 = dd4Var.f((yba) a07VarB.getValue()) | dd4Var.f(ad1Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                boolean z2 = ((yba) a07VarB.getValue()).a.length() == 0;
                objQ3 = dk9.x(new lra(z2, ((yba) a07VarB.getValue()).g, z2 ? ad1Var.q : kf0.H(((yba) a07VarB.getValue()).d), z2 ? ad1Var.p : kf0.H(((yba) a07VarB.getValue()).e), ((yba) a07VarB.getValue()).f, qu1.X(((yba) a07VarB.getValue()).h)));
                dd4Var.p0(objQ3);
            }
            a07 a07Var = (a07) objQ3;
            a07 a07VarB3 = bx1.B(vf3Var.p0, dd4Var);
            WeakHashMap weakHashMap = pzb.w;
            z85 z85VarR = jv3.r(ju7.i(dd4Var).b, dd4Var);
            boolean zF3 = dd4Var.f((yba) a07VarB.getValue());
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                rj7 rj7Var = new rj7(((yba) a07VarB.getValue()).D, ((yba) a07VarB.getValue()).F, ((yba) a07VarB.getValue()).E, ((yba) a07VarB.getValue()).G);
                dd4Var.p0(rj7Var);
                objQ4 = rj7Var;
            }
            a07 a07VarB4 = bx1.B(vf3Var.q0, dd4Var);
            fx1.p(((yba) a07VarB.getValue()).o, ((yba) a07VarB.getValue()).r, ((yba) a07VarB.getValue()).p, ((yba) a07VarB.getValue()).q, dd4Var, 0);
            lra lraVar = (lra) a07Var.getValue();
            dd4Var2 = dd4Var;
            hn9.h(lraVar, jf0.G(-738317196, new yf3(vf3Var, ou6Var, z85VarR, t27Var, str, (pj7) objQ4, a07Var, a07VarB2, a07VarB3, a07VarB, a07VarB4), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 3);
        }
    }

    public static final void r(List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        br9 br9Var;
        Object rm6Var;
        int i3;
        Object obj;
        wga wgaVar;
        Object obj2;
        int i4;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        int i5;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1232120409);
        int i6 = i2 | (dd4Var2.h(list) ? 4 : 2) | (dd4Var2.f(pj7Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var2.V(i6 & 1, (66707 & i6) != 66706)) {
            Object objQ = dd4Var2.Q();
            Object obj3 = vl1.a;
            if (objQ == obj3) {
                objQ = dk9.x(mc3.a);
                dd4Var2.p0(objQ);
            }
            br9 br9Var2 = (a07) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var2.Q();
            int i7 = 9;
            if (objQ2 == obj3) {
                objQ2 = new uj6(i7);
                dd4Var2.p0(objQ2);
            }
            a07 a07VarA0 = ww1.a0(objArr, (ib4) objQ2, dd4Var2, 384);
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj3) {
                objQ3 = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ3);
            }
            br9 br9Var3 = (a07) objQ3;
            wga wgaVar2 = (wga) a07VarA0.getValue();
            Boolean bool = (Boolean) br9Var3.getValue();
            bool.booleanValue();
            boolean zH = dd4Var2.h(list) | dd4Var2.f(a07VarA0);
            Object objQ4 = dd4Var2.Q();
            if (zH || objQ4 == obj3) {
                br9Var = br9Var3;
                i3 = i6;
                obj = obj3;
                wgaVar = wgaVar2;
                rm6Var = new rm6(list, br9Var, a07VarA0, br9Var2, null);
                dd4Var2.p0(rm6Var);
            } else {
                i3 = i6;
                obj = obj3;
                br9Var = br9Var3;
                rm6Var = objQ4;
                wgaVar = wgaVar2;
            }
            lc5.w(list, wgaVar, bool, (yb4) rm6Var, dd4Var2);
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
            if (list.size() > 5) {
                dd4Var2.f0(-2014319137);
                br9 br9Var4 = br9Var;
                br9 br9VarB = an.b(((Boolean) br9Var.getValue()).booleanValue() ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var2, 0, 30);
                wga wgaVar3 = (wga) a07VarA0.getValue();
                String strL = wn9.L((pv9) mu9.X.getValue(), new Object[]{Integer.valueOf(list.size())}, dd4Var2);
                long jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f);
                rj1 rj1VarG = jf0.G(-350622964, new lt(2, br9Var4, br9VarB), dd4Var2);
                ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(lu6.a, 1.0f), 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean zF = dd4Var2.f(a07VarA0);
                Object objQ5 = dd4Var2.Q();
                if (zF || objQ5 == obj) {
                    i5 = 3;
                    objQ5 = new cl6(a07VarA0, i5);
                    dd4Var2.p0(objQ5);
                } else {
                    i5 = 3;
                }
                obj2 = obj;
                f2 = 1.0f;
                i4 = i3;
                z2 = false;
                f3 = 0.0f;
                br9Var2 = br9Var2;
                z = true;
                e11.A(wgaVar3, strL, 0L, jG, rj1VarG, null, ou6VarP0, (kb4) objQ5, null, dd4Var2, 1597440, 292);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                obj2 = obj;
                i4 = i3;
                z = true;
                z2 = false;
                f2 = 1.0f;
                f3 = 0.0f;
                dd4Var2.f0(-2013242817);
                dd4Var2.q(false);
            }
            if (((Map) br9Var2.getValue()).isEmpty()) {
                dd4Var2.f0(-2013209833);
                a(tg9.c, dd4Var2, 6);
                dd4Var2.q(z2);
            } else {
                dd4Var2.f0(-2013140641);
                dd4Var2.q(z2);
            }
            bp5 bp5Var = new bp5(f2, z);
            szb szbVarW = yib.w(pj7Var, gjb.q(f3, f3, 4.0f, f3, 11));
            boolean z3 = (i4 & 7168) == 2048 ? z : z2;
            if ((458752 & i4) == 131072) {
                z2 = z;
            }
            boolean z4 = z2 | z3;
            Object objQ6 = dd4Var2.Q();
            if (z4 || objQ6 == obj2) {
                objQ6 = new fb3(9, br9Var2, kb4Var, kb4Var3);
                dd4Var2.p0(objQ6);
            }
            gx1.h(bp5Var, null, pj7Var, null, null, null, false, szbVarW, 0L, 0L, 0.0f, (kb4) objQ6, dd4Var2, (i4 << 3) & 896, 0, 3834);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fm6(list, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void s(ny4 ny4Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var, dd4 dd4Var, int i2) {
        ib4 ib4Var5;
        ib4 ib4Var6;
        lp4 lp4Var;
        Object obj;
        ?? r5;
        int i3;
        ny4 ny4Var2 = ny4Var;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var2 = jf0.G;
        dd4Var2.h0(-144032930);
        int i4 = i2 | (dd4Var2.f(ny4Var2) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024) | (dd4Var2.h(ib4Var3) ? 16384 : 8192) | (dd4Var2.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i4 & 1, (599187 & i4) != 599186)) {
            ou6 ou6VarP0 = gjb.p0(ou6Var, 24.0f, 0.0f, 24.0f, 0.0f, 10);
            wf0 wf0Var = bv4.w;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarP0);
            ml1.k.getClass();
            ib4 ib4Var7 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
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
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            String str = ny4Var2.a;
            String str2 = ny4Var2.b;
            String str3 = ny4Var2.d;
            String str4 = ny4Var2.e;
            qr1 qr1Var = ra1.d;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarH = tg9.h(tg9.r(lu6Var, 50.0f), 75.0f);
            boolean z = ny4Var2.n;
            boolean z2 = (i4 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (z2 || objQ == obj2) {
                objQ = new i35(25, ib4Var);
                dd4Var2.p0(objQ);
            }
            w05.c(str, str2, str3, str4, qr1Var, t96.w(yn2.s(ou6VarH, z, 0.0f, (ib4) objQ, 2), s00.p(dd4Var2).a), dd4Var2, 24576);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            ou6 ou6VarH2 = tg9.h(lu6Var, 75.0f);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarE = ou6VarH2.e(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ie1 ie1VarA = ge1.a(pv.e, bv4.z, dd4Var2, 6);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE);
            dd4Var2.j0();
            if (dd4Var2.S) {
                ib4Var6 = ib4Var7;
                dd4Var2.k(ib4Var6);
            } else {
                ib4Var6 = ib4Var7;
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ib4 ib4Var8 = ib4Var6;
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            int i5 = i4;
            nha.c(str2, xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 0, 24960, 109560);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var8);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ny4Var2 = ny4Var;
            String str5 = ny4Var2.c;
            long j2 = s00.o(dd4Var).q;
            uka ukaVar = s00.q(dd4Var).l;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(str5, yb0.I(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.8f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24960, 109560);
            dd4Var2 = dd4Var;
            if (ny4Var2.p) {
                dd4Var2.f0(863820273);
                p35 p35VarC = i25.c((m53) f53.a0.getValue(), dd4Var2, 0);
                ou6 ou6VarW = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                boolean z3 = (i5 & 7168) == 2048;
                Object objQ2 = dd4Var2.Q();
                if (z3 || objQ2 == obj2) {
                    objQ2 = new i35(28, ib4Var2);
                    dd4Var2.p0(objQ2);
                }
                ou6 ou6VarL04 = gjb.l0(fe.L(fw.J(null, (ib4) objQ2, ou6VarW, false, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var2), 4.0f);
                r5 = 0;
                i5 = i5;
                lp4Var = lp4Var2;
                obj = obj2;
                mx4.a(p35VarC, "", ou6VarL04, 0L, dd4Var2, 48, 8);
                dd4Var2.q(false);
            } else {
                lp4Var = lp4Var2;
                obj = obj2;
                r5 = 0;
                dd4Var2.f0(864315746);
                dd4Var2.q(false);
            }
            if (ny4Var2.l) {
                dd4Var2.f0(864963553);
                if (ny4Var2.k) {
                    dd4Var2.f0(865032466);
                    p35 p35VarC2 = i25.c(ny4Var2.m ? (m53) f53.P.getValue() : (m53) f53.Q.getValue(), dd4Var2, r5);
                    ou6 ou6VarW2 = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                    int i6 = ((i5 & 14) == 4 ? 1 : r5) | ((i5 & 3670016) == 1048576 ? 1 : r5);
                    Object objQ3 = dd4Var2.Q();
                    if (i6 != 0 || objQ3 == obj) {
                        i3 = 15;
                        objQ3 = new vf6(i3, kb4Var, ny4Var2);
                        dd4Var2.p0(objQ3);
                    } else {
                        i3 = 15;
                    }
                    mx4.a(p35VarC2, wn9.K((pv9) eu9.I0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ3, ou6VarW2, r5, i3), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                    dd4Var2.q((boolean) r5);
                } else {
                    dd4Var2.f0(865684706);
                    dd4Var2.q((boolean) r5);
                }
                dd4Var2.q((boolean) r5);
            } else {
                dd4Var2.f0(864402732);
                p35 p35VarC3 = i25.c((m53) f53.Z.getValue(), dd4Var2, r5);
                ou6 ou6VarW3 = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                ?? r15 = (i5 & 458752) == 131072 ? 1 : r5;
                Object objQ4 = dd4Var2.Q();
                if (r15 != 0 || objQ4 == obj) {
                    objQ4 = new i35(29, ib4Var4);
                    dd4Var2.p0(objQ4);
                }
                mx4.a(p35VarC3, wn9.K((pv9) vt9.u.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ4, ou6VarW3, r5, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                dd4Var2.q((boolean) r5);
            }
            if (ny4Var2.o) {
                dd4Var2.f0(865790664);
                p35 p35VarC4 = i25.c((m53) a53.x.getValue(), dd4Var2, r5);
                ou6 ou6VarW4 = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                ?? r152 = (i5 & 57344) == 16384 ? 1 : r5;
                Object objQ5 = dd4Var2.Q();
                if (r152 != 0 || objQ5 == obj) {
                    ib4Var5 = ib4Var3;
                    objQ5 = new pm6(r5, ib4Var5);
                    dd4Var2.p0(objQ5);
                } else {
                    ib4Var5 = ib4Var3;
                }
                mx4.a(p35VarC4, wn9.K((pv9) zt9.x0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ5, ou6VarW4, r5, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                dd4Var2.q((boolean) r5);
            } else {
                ib4Var5 = ib4Var3;
                dd4Var2.f0(866325538);
                dd4Var2.q((boolean) r5);
            }
            tw2.x(dd4Var2, true, true, true);
        } else {
            ib4Var5 = ib4Var3;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(ny4Var2, ou6Var, ib4Var, ib4Var2, ib4Var5, ib4Var4, kb4Var, i2, 5);
        }
    }

    public static final void t(String str, List list, Set set, pj7 pj7Var, ou6 ou6Var, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        a07 a07Var;
        Object rm6Var;
        a07 a07Var2;
        boolean z;
        Object obj;
        boolean z2;
        List list2;
        br9 br9Var;
        int i3;
        Object obj2;
        int i4;
        boolean z3;
        st5 st5Var;
        br9 br9Var2;
        a07 a07Var3;
        int i5;
        Object obj3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        br9 br9Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(18587238);
        int i7 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.h(set) ? 256 : Token.CASE) | (dd4Var2.f(pj7Var) ? 2048 : 1024) | (dd4Var2.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var) ? 1048576 : 524288);
        int i8 = 0;
        if (dd4Var2.V(i7 & 1, (i7 & 599187) != 599186)) {
            Object objQ = dd4Var2.Q();
            Object obj4 = vl1.a;
            if (objQ == obj4) {
                objQ = lc5.Z(dd4Var2);
                dd4Var2.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            st5 st5VarA = ut5.a(0, dd4Var2, 0, 3);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj4) {
                objQ2 = dk9.x(-1);
                dd4Var2.p0(objQ2);
            }
            a07 a07Var4 = (a07) objQ2;
            Object[] objArr = new Object[0];
            Object objQ3 = dd4Var2.Q();
            int i9 = 8;
            if (objQ3 == obj4) {
                objQ3 = new uj6(i9);
                dd4Var2.p0(objQ3);
            }
            a07 a07VarA0 = ww1.a0(objArr, (ib4) objQ3, dd4Var2, 384);
            Object objQ4 = dd4Var2.Q();
            if (objQ4 == obj4) {
                objQ4 = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ4);
            }
            a07 a07Var5 = (a07) objQ4;
            Object objQ5 = dd4Var2.Q();
            if (objQ5 == obj4) {
                objQ5 = dk9.x(list);
                dd4Var2.p0(objQ5);
            }
            br9 br9Var4 = (a07) objQ5;
            Object objQ6 = dd4Var2.Q();
            if (objQ6 == obj4) {
                objQ6 = dk9.n(new e51(st5VarA, 7));
                dd4Var2.p0(objQ6);
            }
            br9 br9Var5 = (br9) objQ6;
            Object objQ7 = dd4Var2.Q();
            if (objQ7 == obj4) {
                objQ7 = dk9.n(new e51(st5VarA, 8));
                dd4Var2.p0(objQ7);
            }
            br9 br9Var6 = (br9) objQ7;
            Object objQ8 = dd4Var2.Q();
            if (objQ8 == obj4) {
                a07Var = a07Var4;
                objQ8 = dk9.n(new am6(a07VarA0, a07Var4, br9Var6, br9Var5, 0));
                dd4Var2.p0(objQ8);
            } else {
                a07Var = a07Var4;
            }
            a07 a07Var6 = a07VarA0;
            br9 br9Var7 = (br9) objQ8;
            Object objQ9 = dd4Var2.Q();
            if (objQ9 == obj4) {
                objQ9 = dk9.n(new bm6(0, a07Var6, br9Var5));
                dd4Var2.p0(objQ9);
            }
            br9 br9Var8 = (br9) objQ9;
            Object objQ10 = dd4Var2.Q();
            if (objQ10 == obj4) {
                objQ10 = dk9.n(new cm6(a07Var6, br9Var4, br9Var6, i8));
                dd4Var2.p0(objQ10);
            }
            br9 br9Var9 = (br9) objQ10;
            Object objQ11 = dd4Var2.Q();
            if (objQ11 == obj4) {
                objQ11 = dk9.n(new x41(br9Var4, a07Var, 14));
                dd4Var2.p0(objQ11);
            }
            br9 br9Var10 = (br9) objQ11;
            Boolean bool = (Boolean) a07Var5.getValue();
            bool.booleanValue();
            boolean zF = dd4Var2.f(a07Var6) | dd4Var2.h(list);
            Object objQ12 = dd4Var2.Q();
            if (zF || objQ12 == obj4) {
                a07Var2 = a07Var;
                z = false;
                obj = obj4;
                z2 = true;
                rm6Var = new rm6(a07Var6, list, a07Var5, br9Var4, null, 1);
                list2 = list;
                br9Var = br9Var4;
                a07Var6 = a07Var6;
                dd4Var2.p0(rm6Var);
            } else {
                br9Var = br9Var4;
                z = false;
                a07Var2 = a07Var;
                rm6Var = objQ12;
                z2 = true;
                list2 = list;
                obj = obj4;
            }
            lc5.v(bool, list2, (yb4) rm6Var, dd4Var2);
            Integer numValueOf = Integer.valueOf(((List) br9Var.getValue()).size());
            d35 d35Var = (d35) fc1.z0((List) br9Var.getValue());
            String str2 = d35Var != null ? d35Var.a : null;
            Boolean bool2 = (Boolean) a07Var5.getValue();
            bool2.getClass();
            Object[] objArr2 = {str, numValueOf, str2, bool2};
            int i10 = i7 & 14;
            boolean zF2 = (i10 == 4 ? z2 : z) | dd4Var2.f(st5VarA);
            Object objQ13 = dd4Var2.Q();
            if (zF2 || objQ13 == obj) {
                i3 = 4;
                obj2 = obj;
                i4 = i10;
                a07 a07Var7 = a07Var2;
                br9 br9Var11 = br9Var;
                z3 = false;
                objQ13 = new xm6(st5VarA, br9Var11, str, a07Var7, null, 0);
                st5Var = st5VarA;
                br9Var2 = br9Var11;
                a07Var3 = a07Var7;
                dd4Var2.p0(objQ13);
            } else {
                st5Var = st5VarA;
                obj2 = obj;
                i4 = i10;
                i3 = 4;
                a07Var3 = a07Var2;
                br9Var2 = br9Var;
                z3 = false;
            }
            lc5.x(objArr2, (yb4) objQ13, dd4Var2);
            ha6 ha6VarD = pn0.d(bv4.b, z3);
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
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf2);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            br9 br9Var12 = br9Var2;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            br9 br9VarB = an.b(((Boolean) a07Var5.getValue()).booleanValue() ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var2, 0, 30);
            if (list.size() > 10) {
                dd4Var2.f0(-558745617);
                wga wgaVar = (wga) a07Var6.getValue();
                String strL = wn9.L((pv9) mu9.Y.getValue(), new Object[]{Integer.valueOf(list.size())}, dd4Var2);
                long jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f);
                rj1 rj1VarG = jf0.G(-1887367271, new lt(1, a07Var5, br9VarB), dd4Var2);
                ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean zF3 = dd4Var2.f(a07Var6);
                Object objQ14 = dd4Var2.Q();
                if (zF3) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    if (objQ14 == obj3) {
                    }
                    kb4 kb4Var2 = (kb4) objQ14;
                    i6 = 7;
                    z4 = true;
                    i5 = i3;
                    z5 = false;
                    e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6VarP0, kb4Var2, null, dd4Var2, 1597440, 292);
                    dd4Var2 = dd4Var2;
                    dd4Var2.q(false);
                }
                objQ14 = new cl6(a07Var6, 2);
                dd4Var2.p0(objQ14);
                kb4 kb4Var22 = (kb4) objQ14;
                i6 = 7;
                z4 = true;
                i5 = i3;
                z5 = false;
                e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6VarP0, kb4Var22, null, dd4Var2, 1597440, 292);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                i5 = i3;
                obj3 = obj2;
                i6 = 7;
                z4 = true;
                z5 = false;
                dd4Var2.f0(-557714464);
                dd4Var2.q(false);
            }
            ou6 ou6VarF2 = xv5.f(1.0f, tg9.f(lu6Var, 1.0f), z4);
            szb szbVarW = yib.w(pj7Var, gjb.q(0.0f, 0.0f, 4.0f, 96.0f, 3));
            szb szbVarW2 = yib.w(pj7Var, gjb.q(0.0f, 0.0f, 0.0f, 96.0f, i6));
            boolean zF4 = dd4Var2.f(a07Var6) | (i4 == i5 ? z4 : z5) | dd4Var2.h(set) | ((i7 & 458752) == 131072 ? z4 : z5) | ((i7 & 3670016) == 1048576 ? z4 : z5);
            Object objQ15 = dd4Var2.Q();
            if (zF4 || objQ15 == obj3) {
                z6 = z4;
                br9Var3 = br9Var12;
                em6 em6Var = new em6(a07Var6, br9Var3, str, set, yb4Var, kb4Var, 0);
                dd4Var2.p0(em6Var);
                objQ15 = em6Var;
            } else {
                z6 = z4;
                br9Var3 = br9Var12;
            }
            st5 st5Var2 = st5Var;
            dd4 dd4Var3 = dd4Var2;
            gx1.h(ou6VarF2, st5Var2, szbVarW2, null, null, null, false, szbVarW, 0L, 0L, 0.0f, (kb4) objQ15, dd4Var3, 0, 0, 3832);
            dd4Var2 = dd4Var3;
            dd4Var2.q(z6);
            boolean zBooleanValue = ((Boolean) br9Var7.getValue()).booleanValue();
            xf0 xf0Var = bv4.t;
            zn0 zn0Var = zn0.a;
            br9 br9Var13 = br9Var3;
            kf0.d(zBooleanValue, gjb.p0(gjb.k0(zn0Var.a(lu6Var, xf0Var), pj7Var), 16.0f, 0.0f, 72.0f, 8.0f, 2), wd3.c((by3) null, 3).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, 3).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(-86248124, new yl6(vx1Var, st5Var2, a07Var3, br9Var13, br9Var10, 0), dd4Var2), dd4Var2, 200064, 16);
            kf0.d(((Boolean) br9Var8.getValue()).booleanValue() || ((Boolean) br9Var9.getValue()).booleanValue(), gjb.p0(gjb.k0(zn0Var.a(lu6Var, bv4.v), pj7Var), 0.0f, 0.0f, 16.0f, 8.0f, 3), wd3.c((by3) null, 3).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, 3).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(-1532917957, new zl6(vx1Var, st5Var2, br9Var8, br9Var13, br9Var9, 0), dd4Var2), dd4Var2, 200064, 16);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(str, list, set, pj7Var, ou6Var, yb4Var, kb4Var, i2, 4);
        }
    }

    public static final void u(vx1 vx1Var, a07 a07Var, st5 st5Var, int i2) {
        if (i2 < 0 || i2 >= ((List) a07Var.getValue()).size()) {
            return;
        }
        ah1.J(vx1Var, null, null, new qz4(st5Var, i2, (jt1) null, 2), 3);
    }

    public static final void v(final int i2, final int i3, final ou6 ou6Var, final zk7 zk7Var, final rj1 rj1Var, final rj1 rj1Var2, dd4 dd4Var, final int i4) {
        dd4Var.h0(-742408938);
        int i5 = i4 | (dd4Var.d(i2) ? 4 : 2) | (dd4Var.d(i3) ? 32 : 16) | (dd4Var.f(zk7Var) ? 2048 : 1024);
        if (dd4Var.V(i5 & 1, (74899 & i5) != 74898)) {
            dd4Var.a0();
            if ((i4 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            ou6 ou6VarM0 = gjb.m0(tg9.f(lu6Var, 1.0f), 18.0f, 8.0f);
            boolean zH = ((((i5 & 7168) ^ 3072) > 2048 && dd4Var.f(zk7Var)) || (i5 & 3072) == 2048) | dd4Var.h(vx1Var);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new bh1(7, vx1Var, zk7Var);
                dd4Var.p0(objQ2);
            }
            int i6 = (i5 >> 9) & 14;
            int i7 = i5 << 3;
            B(zk7Var, i2, i3, ou6VarM0, (kb4) objQ2, dd4Var, i6 | 3072 | (i7 & Token.ASSIGN_MOD) | (i7 & 896));
            final int i8 = 0;
            e11.e(zk7Var, xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true), null, null, 0, 0.0f, null, null, false, null, null, null, jf0.G(2141456717, new ac4() { // from class: ul6
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i9 = i8;
                    heb hebVar = heb.a;
                    rj1 rj1Var3 = rj1Var2;
                    rj1 rj1Var4 = rj1Var;
                    rk7 rk7Var = (rk7) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dd4 dd4Var2 = (dd4) obj4;
                    ((Integer) obj5).getClass();
                    switch (i9) {
                        case 0:
                            rk7Var.getClass();
                            if (iIntValue == 0) {
                                dd4Var2.f0(650571780);
                                rj1Var4.invoke(dd4Var2, 0);
                                dd4Var2.q(false);
                            } else if (iIntValue == 1) {
                                dd4Var2.f0(650573214);
                                rj1Var3.invoke(dd4Var2, 0);
                                dd4Var2.q(false);
                            } else {
                                dd4Var2.f0(-1307036619);
                                dd4Var2.q(false);
                            }
                            break;
                        default:
                            rk7Var.getClass();
                            if (iIntValue == 0) {
                                dd4Var2.f0(1343189816);
                                rj1Var4.invoke(dd4Var2, 0);
                                dd4Var2.q(false);
                            } else if (iIntValue == 1) {
                                dd4Var2.f0(1343191250);
                                rj1Var3.invoke(dd4Var2, 0);
                                dd4Var2.q(false);
                            } else {
                                dd4Var2.f0(-1310713983);
                                dd4Var2.q(false);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, i6, 16380);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final int i9 = 0;
            ye8VarU.d = new yb4(i2, i3, ou6Var, zk7Var, rj1Var, rj1Var2, i4, i9) { // from class: vl6
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ zk7 e;
                public final /* synthetic */ rj1 f;
                public final /* synthetic */ rj1 s;

                {
                    this.a = i9;
                }

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    int i10 = this.a;
                    heb hebVar = heb.a;
                    switch (i10) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iX0 = qu1.x0(221569);
                            vm7.v(this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj2, iX0);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iX02 = qu1.x0(221569);
                            wm9.f(this.b, this.c, this.d, this.e, this.f, this.s, (dd4) obj2, iX02);
                            break;
                    }
                    return hebVar;
                }
            };
        }
    }

    public static final void w(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z) {
        dd4Var.h0(2021338140);
        int i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        if (!dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-2051708901);
            z(i3 & 8190, rj1Var, rj1Var2, kb4Var, dd4Var, z);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-2051501542);
            y(i3 & 8190, rj1Var, rj1Var2, kb4Var, dd4Var, z);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z, kb4Var, rj1Var, rj1Var2, i2, 2);
        }
    }

    public static final void x(boolean z, ny4 ny4Var, String str, Set set, List list, List list2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, yb4 yb4Var, kb4 kb4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, dd4 dd4Var, int i2) {
        ny4Var.getClass();
        str.getClass();
        set.getClass();
        list.getClass();
        list2.getClass();
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        yb4Var.getClass();
        kb4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        kb4Var6.getClass();
        dd4Var.h0(-1952105471);
        int i3 = i2 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(ny4Var) ? 32 : 16) | (dd4Var.f(str) ? 256 : Token.CASE) | (dd4Var.h(set) ? 2048 : 1024) | (dd4Var.h(list) ? 16384 : 8192) | (dd4Var.h(list2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304) | (dd4Var.h(ib4Var2) ? 67108864 : 33554432) | (dd4Var.h(yb4Var) ? 536870912 : 268435456);
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & ((((27648 | (dd4Var.h(kb4Var2) ? (char) 4 : (char) 2)) | (dd4Var.h(ib4Var3) ? 32 : 16)) | (dd4Var.h(ib4Var4) ? 256 : Token.CASE)) | (dd4Var.h(kb4Var6) ? (char) 0 : (char) 0))) == 599186) ? false : true)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new tl3(16);
                dd4Var.p0(objQ);
            }
            w((i3 & 14) | 3456 | ((i3 >> 15) & Token.ASSIGN_MOD), jf0.G(-327021038, new uq6(ny4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, kb4Var6, 7), dd4Var), jf0.G(1762303891, new xl6(list, list2, cl7.b(0, (ib4) objQ, dd4Var, 384, 3), str, set, yb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, 0), dd4Var), kb4Var, dd4Var, z);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dm6(z, ny4Var, str, set, list, list2, kb4Var, ib4Var, ib4Var2, yb4Var, kb4Var2, ib4Var3, ib4Var4, kb4Var3, kb4Var4, kb4Var5, kb4Var6, i2);
        }
    }

    public static final void y(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z) {
        kb4 kb4Var2;
        dd4Var.h0(-1216459736);
        int i3 = i2 | (dd4Var.g(z) ? 4 : 2);
        if ((i2 & 48) == 0) {
            kb4Var2 = kb4Var;
            i3 |= dd4Var.h(kb4Var2) ? 32 : 16;
        } else {
            kb4Var2 = kb4Var;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            fw.r(z, kb4Var2, null, false, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(278289111, new sl6(rj1Var, rj1Var2, i4), dd4Var), dd4Var, (i3 & 14) | 805309440 | (i3 & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z, kb4Var, rj1Var, rj1Var2, i2, 0);
        }
    }

    public static final void z(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z) {
        dd4Var.h0(794832128);
        int i3 = (dd4Var.g(z) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            sdc.e(tg9.c, null, jf0.G(-1428746410, new wl6(z, kb4Var, rj1Var, rj1Var2, 0), dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z, kb4Var, rj1Var, rj1Var2, i2, 1);
        }
    }
}
