package defpackage;

import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class lc5 {
    public static final rj1 B;
    public static final rj1 C;
    public static final rj1 D;
    public static final rj1 E;
    public static final rj1 n;
    public static final rj1 p;
    public static final rj1 q;
    public static final rj1 v;
    public static final rj1 w;
    public static final rj1 y;
    public static final ro a = new ro(Float.POSITIVE_INFINITY);
    public static final so b = new so(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final to c = new to(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final uo d = new uo(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ro e = new ro(Float.NEGATIVE_INFINITY);
    public static final so f = new so(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final to g = new to(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final uo h = new uo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[][] i = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] j = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] k = {95.047f, 100.0f, 108.883f};
    public static final float[][] l = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final rj1 m = new rj1(new k7(19), false, -1918046270);
    public static final rj1 o = new rj1(new k7(20), false, -1311240969);
    public static final rj1 r = new rj1(new ck1(24), false, -909420696);
    public static final rj1 s = new rj1(new ck1(25), false, 826877739);
    public static final rj1 t = new rj1(new dk1(22), false, 1384851171);
    public static final rj1 u = new rj1(new dk1(23), false, -459485734);
    public static final rj1 x = new rj1(new lk1(6), false, -781142669);
    public static final rj1 z = new rj1(new lk1(8), false, -1178002492);
    public static final rj1 A = new rj1(new mk1(26), false, 214558939);
    public static final rj1 F = new rj1(new nk1(9), false, 1203121548);
    public static final rj1 G = new rj1(new nk1(10), false, 162784336);
    public static final rj1 H = new rj1(new nk1(11), false, 113984761);
    public static final rj1 I = new rj1(new nk1(12), false, -22042536);
    public static final rj1 J = new rj1(new nk1(13), false, -158069833);
    public static final yw2 K = new yw2();
    public static final oi5[] L = new oi5[0];
    public static final elb M = new elb(23);

    static {
        int i2 = 0;
        int i3 = 7;
        n = new rj1(new uj1(i3), false, -722942138);
        int i4 = 27;
        p = new rj1(new uj1(i4), false, -868693768);
        int i5 = 28;
        q = new rj1(new uj1(i5), false, 1301177531);
        int i6 = 29;
        v = new rj1(new hk1(i6), false, 1314660729);
        w = new rj1(new kk1(i2), false, -64372752);
        y = new rj1(new lk1(i3), false, -2069077114);
        B = new rj1(new mk1(i4), false, 1433068285);
        C = new rj1(new mk1(i5), false, 572530910);
        D = new rj1(new mk1(i6), false, 38369312);
        E = new rj1(new pk1(i2), false, 396682760);
    }

    public static final void A(boolean z2, xr xrVar, String str, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        xrVar.getClass();
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-638739068);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.d(xrVar.ordinal()) ? 32 : 16) | (dd4Var.f(str) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (!dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-1970208420);
            sdc.e(tg9.c, null, jf0.G(-639612749, new si6(z2, kb4Var, xrVar, str, kb4Var2), dd4Var), dd4Var, 3078, 6);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1969445138);
            fw.r(z2, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(1164280399, new ev0(xrVar, str, kb4Var2, kb4Var, 24), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 6) & Token.ASSIGN_MOD), 500);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(z2, xrVar, str, kb4Var, kb4Var2, i2);
        }
    }

    public static final void B(x77 x77Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        String str;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1412439754);
        int i3 = i2 | (dd4Var2.h(x77Var) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var2).d);
            long jG = dd1.g(s00.o(dd4Var2), 2.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL0 = gjb.l0(fw.J(null, ib4Var, fe.L(ou6VarW, jG, lp4Var), false, 15), 12.0f);
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
            ou6 ou6VarH = ky0.h(dd4Var2, 8.0f, t96.w(tg9.n(lu6Var, 40.0f), tp8.a), lp4Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarH);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            mx4.a(i25.c((m53) f53.O.getValue(), dd4Var2, 0), (String) null, gjb.l0(lu6Var, 8.0f).e(tg9.c), 0L, dd4Var2, 432, 8);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.n(lu6Var, 12.0f));
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            g87 g87Var = x77Var.c;
            if (g87Var instanceof e87) {
                dd4Var2.f0(360763370);
                e87 e87Var = (e87) g87Var;
                String str2 = e87Var.b;
                str = str2 + " - " + wn9.L(e87Var.c == 4 ? (pv9) mu9.h.getValue() : (pv9) mu9.i.getValue(), new Object[]{Integer.valueOf(e87Var.d)}, dd4Var2);
                dd4Var2.q(false);
            } else {
                if (!(g87Var instanceof f87)) {
                    throw j39.e(11634827, dd4Var2, false);
                }
                dd4Var2.f0(11646167);
                dd4Var2.q(false);
                str = ((f87) g87Var).a;
            }
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 48, 24960, 110588);
            un9.a(dd4Var, tg9.h(lu6Var, 6.0f));
            ri9.f(x77Var.e, (ou6) null, false, s00.o(dd4Var).s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 0, 131062);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            if (x77Var.d) {
                dd4Var2.f0(-1098835864);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1098865655);
                yb0.a(0, 15, 0L, 0L, null, dd4Var, null);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xp5(x77Var, ib4Var, i2, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(ou6 ou6Var, dd4 dd4Var, int i2) {
        vf0 vf0Var = bv4.z;
        dd4Var.h0(1292866130);
        int i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        int i4 = 0;
        boolean z2 = true;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            int i5 = 6;
            ie1 ie1VarA = ge1.a(new mv(8.0f, true, new gp(5)), vf0Var, dd4Var, 6);
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
            dd4Var.f0(-239958162);
            int i6 = 0;
            while (i6 < i5) {
                lu6 lu6Var = lu6.a;
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                ur9 ur9Var = s96.a;
                ou6 ou6VarL02 = gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 2.0f), jf0.G), 12.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, i4);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL02);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var, eq8VarA);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var, lr7VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var, ou6VarL03);
                int i7 = i6;
                ah1.r(tg9.n(lu6Var, 40.0f), tp8.a, dd4Var, i5, i4);
                un9.a(dd4Var, tg9.n(lu6Var, 12.0f));
                bp5 bp5Var = new bp5(1.0f, true);
                ie1 ie1VarA2 = ge1.a(pv.c, vf0Var, dd4Var, i4);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, bp5Var);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ie1VarA2);
                un9.s(jmVar2, dd4Var, lr7VarL3);
                ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL04);
                ah1.r(tg9.h(tg9.f(lu6Var, 0.7f), 16.0f), null, dd4Var, 6, 2);
                ah1.r(tg9.h(xv5.h(lu6Var, 10.0f, dd4Var, lu6Var, 0.3f), 12.0f), null, dd4Var, 6, 2);
                dd4Var.q(true);
                dd4Var.q(true);
                i6 = i7 + 1;
                i5 = 6;
                z2 = true;
                i4 = 0;
            }
            dd4Var.q(i4);
            dd4Var.q(z2);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 19);
        }
    }

    public static final void D(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(1346618500);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            c97 c97Var = (c97) ((qtb) qx1.N(ug8.a(c97.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(c97Var.d, dd4Var);
            boolean zF = dd4Var.f(c97Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new zs5(c97Var, 21);
                dd4Var.p0(objQ);
            }
            j(c97Var, (kb4) objQ, dd4Var);
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) mu9.g.getValue(), dd4Var), tg9.c, false, jf0.G(-2094697984, new n74(t27Var, 17), dd4Var), jf0.G(13783145, new qz0(24, c97Var, a07VarB), dd4Var), jf0.G(867140942, new ak0(9, (Object) a07VarB, (Object) c97Var, (Object) t27Var), dd4Var), dd4Var2, 224304, 4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 16, t27Var);
        }
    }

    public static final void E(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1053650706);
        int i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
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
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 56.0f));
            p35 p35VarC = i25.c((m53) a53.K.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 40.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            nha.c(wn9.K((pv9) eu9.s.getValue(), dd4Var2), gjb.n0(lu6Var, 24.0f, 0.0f, 2), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var2, 48, 0, 130040);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            i3 = 1;
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.r0.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var, (i4 << 21) & 234881024, 252);
            dd4Var2 = dd4Var;
            xv5.A(lu6Var, 56.0f, dd4Var2, true);
        } else {
            i3 = 1;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var, ib4Var, i2, i3);
        }
    }

    public static final void F(py8 py8Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        float f2;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2040369444);
        int i3 = i2 | (dd4Var2.f(py8Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
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
            ou6 ou6Var3 = lu6.a;
            un9.a(dd4Var2, tg9.h(ou6Var3, 44.0f));
            mx4.a(i25.c((m53) a53.K.getValue(), dd4Var2, 0), (String) null, tg9.n(ou6Var3, 40.0f), s00.o(dd4Var2).q, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(ou6Var3, 24.0f));
            if (py8Var.d != null) {
                dd4Var2.f0(510057590);
                ou6Var2 = ou6Var3;
                nha.c(wn9.K((pv9) eu9.r.getValue(), dd4Var2), gjb.n0(ou6Var3, 24.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(ou6Var2, 8.0f));
                nha.c(py8Var.c, gjb.n0(ou6Var2, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(ou6Var2, 24.0f));
                nha.c(wn9.K((pv9) iu9.L0.getValue(), dd4Var), gjb.n0(ou6Var2, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(ou6Var2, 8.0f));
                nha.c(py8Var.d, gjb.n0(ou6Var2, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
                z2 = true;
                f2 = 44.0f;
            } else {
                ou6Var2 = ou6Var3;
                dd4Var2.f0(511474011);
                nha.c(wn9.K((pv9) eu9.s.getValue(), dd4Var2), gjb.n0(ou6Var2, 24.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                un9.a(dd4Var2, tg9.h(ou6Var2, 12.0f));
                kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.r0.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 18) & 234881024, 252);
                f2 = 44.0f;
                xv5.A(ou6Var2, 44.0f, dd4Var2, false);
                z2 = true;
            }
            xv5.A(ou6Var2, f2, dd4Var2, z2);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cu1(py8Var, ou6Var, ib4Var, i2, 0);
        }
    }

    public static final void G(ls9 ls9Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1980268004);
        int i3 = i2 | (dd4Var2.f(ls9Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
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
            String str = ls9Var.c;
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.j;
            long jX = wn9.x(20);
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), 0L, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 24624, 0, 130028);
            dd4Var2 = dd4Var;
            if (ls9Var.f) {
                dd4Var2.f0(-1028717208);
                sdc.y(tg9.n(gjb.n0(lu6Var, 0.0f, 12.0f, 1), 32.0f), 0L, null, dd4Var2, 6, 6);
                dd4Var2.q(false);
                z2 = true;
            } else {
                int i4 = 0;
                if (ls9Var.g) {
                    dd4Var2.f0(-1028500611);
                    dd4Var2.f0(105372007);
                    String strK = ls9Var.h;
                    if (strK == null) {
                        strK = "";
                    }
                    if (strK.length() == 0) {
                        strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
                    }
                    dd4Var2.q(false);
                    nha.c(strK, gjb.l0(lu6Var, 24.0f), 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 24624, 0, 130028);
                    dd4Var2 = dd4Var;
                    p35 p35VarC = i25.c((m53) f53.d0.getValue(), dd4Var2, 0);
                    String strK2 = wn9.K((pv9) mu9.Q.getValue(), dd4Var2);
                    int i5 = i3 & 14;
                    boolean z3 = (i5 == 4) | ((i3 & 896) == 256);
                    Object objQ = dd4Var2.Q();
                    Object obj = vl1.a;
                    if (z3 || objQ == obj) {
                        objQ = new zt1(kb4Var, ls9Var, i4);
                        dd4Var2.p0(objQ);
                    }
                    kc5.n(p35VarC, strK2, false, null, null, null, null, null, (ib4) objQ, dd4Var2, 0, 252);
                    un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                    p35 p35VarC2 = i25.c((m53) f53.C.getValue(), dd4Var2, 0);
                    String strK3 = wn9.K((pv9) mu9.z.getValue(), dd4Var2);
                    boolean z4 = (i5 == 4) | ((i3 & 7168) == 2048);
                    Object objQ2 = dd4Var2.Q();
                    if (z4 || objQ2 == obj) {
                        objQ2 = new zt1(kb4Var2, ls9Var, 1);
                        dd4Var2.p0(objQ2);
                    }
                    kc5.n(p35VarC2, strK3, false, null, null, null, null, null, (ib4) objQ2, dd4Var2, 0, 252);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-1027648204);
                    dd4Var2.q(false);
                }
                z2 = true;
            }
            dd4Var2.q(z2);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new au1(ls9Var, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void H(ib4 ib4Var, dd4 dd4Var) {
        ah7 ah7Var = dd4Var.M.b.a;
        ah7Var.f0(og7.c);
        tw1.g0(ah7Var, 0, ib4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(ou6 r32, boolean r33, float r34, dd4 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc5.I(ou6, boolean, float, dd4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(defpackage.ib4 r22, ou6 r23, boolean r24, t89 r25, defpackage.bs0 r26, pj7 r27, defpackage.zb4 r28, dd4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc5.J(ib4, ou6, boolean, t89, bs0, pj7, zb4, dd4, int, int):void");
    }

    public static final void K(bja bjaVar, pj7 pj7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        int i3;
        bja bjaVar2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(108411676);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(bjaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var4) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 599187) != 599186)) {
            ou6 ou6VarQ = kc5.Q(h67.f0(ou6Var.e(tg9.c), null, 3), kc5.J(dd4Var2), 14);
            vf0 vf0Var = bv4.z;
            ie1 ie1VarA = ge1.a(pv.c, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
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
            un9.a(dd4Var2, gjb.k0(lu6Var, pj7Var));
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) ev9.a.getValue(), dd4Var2), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA2 = ge1.a(new mv(4.0f, true, new gp(5)), vf0Var, dd4Var, 6);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            d6a d6aVar = fv9.b;
            String strL = wn9.L((pv9) d6aVar.getValue(), new Object[]{Integer.valueOf(bjaVar.b)}, dd4Var);
            ou6 ou6VarW2 = t96.w(lu6Var, s00.p(dd4Var).a);
            long jG = dd1.g(s00.o(dd4Var), 1.0f);
            lp4 lp4Var = jf0.G;
            e11.v(null, "Name", strL, gjb.l0(fe.L(ou6VarW2, jG, lp4Var), 16.0f), ib4Var, dd4Var, ((i4 << 3) & 57344) | 48, 1);
            e11.v(null, "VietPhrase", wn9.L((pv9) d6aVar.getValue(), new Object[]{Integer.valueOf(bjaVar.a)}, dd4Var), tw2.g(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), ib4Var2, dd4Var, (i4 & 57344) | 48, 1);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            nha.c(wn9.K((pv9) zu9.w0.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            dd4Var2 = dd4Var;
            ou6 ou6VarW3 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var2).d);
            ie1 ie1VarA3 = ge1.a(new mv(4.0f, true, new gp(5)), vf0Var, dd4Var2, 6);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarW3);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA3);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            bjaVar2 = bjaVar;
            e11.v(null, "Name", wn9.L((pv9) d6aVar.getValue(), new Object[]{Integer.valueOf(bjaVar2.d)}, dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var3, dd4Var2, ((i4 >> 3) & 57344) | 48, 1);
            e11.v(null, "VietPhrase", wn9.L((pv9) d6aVar.getValue(), new Object[]{Integer.valueOf(bjaVar2.c)}, dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var4, dd4Var2, ((i4 >> 6) & 57344) | 48, 1);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            bjaVar2 = bjaVar;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(bjaVar2, pj7Var, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2, 8);
        }
    }

    public static final void L(final String str, final t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-675855959);
        int i3 = 16;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        final int i5 = 1;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            boolean z2 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ho4(str, 19);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                final a07 a07VarB = bx1.B(((eja) ((qtb) qx1.N(ug8.a(eja.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var))).e, dd4Var);
                gx1.p(wn9.K((pv9) zt9.u0.getValue(), dd4Var), tg9.c, false, jf0.G(-2040027867, new oe9(t27Var, i3), dd4Var), fw.o, jf0.G(459045747, new ac4() { // from class: wb9
                    @Override // defpackage.ac4
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        dd4 dd4Var2;
                        int i6 = i5;
                        heb hebVar = heb.a;
                        Object obj5 = vl1.a;
                        br9 br9Var = a07VarB;
                        String str2 = str;
                        t27 t27Var2 = t27Var;
                        switch (i6) {
                            case 0:
                                pj7 pj7Var = (pj7) obj2;
                                dd4 dd4Var3 = (dd4) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((yn0) obj).getClass();
                                pj7Var.getClass();
                                if ((iIntValue & 48) == 0) {
                                    iIntValue |= dd4Var3.f(pj7Var) ? 32 : 16;
                                }
                                if (!dd4Var3.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                                    dd4Var3.Y();
                                } else {
                                    rj7 rj7VarD = yib.d(14, dd4Var3, false);
                                    boolean zF = ((iIntValue & Token.ASSIGN_MOD) == 32) | dd4Var3.f(rj7VarD);
                                    Object objQ2 = dd4Var3.Q();
                                    if (zF || objQ2 == obj5) {
                                        objQ2 = yib.w(yib.w(yib.w(pj7Var, rj7VarD), new rj7(12.0f, 12.0f, 12.0f, 12.0f)), gjb.q(0.0f, 0.0f, 0.0f, 64.0f, 7));
                                        dd4Var3.p0(objQ2);
                                    }
                                    pj7 pj7Var2 = (pj7) objQ2;
                                    px3 px3Var = tg9.c;
                                    ha6 ha6VarD = pn0.d(bv4.b, false);
                                    int iHashCode = Long.hashCode(dd4Var3.T);
                                    lr7 lr7VarL = dd4Var3.l();
                                    ou6 ou6VarL0 = s32.L0(dd4Var3, px3Var);
                                    ml1.k.getClass();
                                    um1 um1Var = ll1.b;
                                    dd4Var3.j0();
                                    if (dd4Var3.S) {
                                        dd4Var3.k(um1Var);
                                    } else {
                                        dd4Var3.s0();
                                    }
                                    un9.s(ll1.f, dd4Var3, ha6VarD);
                                    un9.s(ll1.e, dd4Var3, lr7VarL);
                                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                                    un9.r(dd4Var3, ll1.h);
                                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                                    if (((gd9) br9Var.getValue()).a) {
                                        dd4Var3.f0(-1756887418);
                                        dd4Var3.q(false);
                                    } else if (!((gd9) br9Var.getValue()).b.isEmpty()) {
                                        dd4Var3.f0(-1756456270);
                                        Object[] objArr = new Object[0];
                                        Object objQ3 = dd4Var3.Q();
                                        if (objQ3 == obj5) {
                                            objQ3 = new aa9(7);
                                            dd4Var3.p0(objQ3);
                                        }
                                        a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ3, dd4Var3, 48);
                                        Object[] objArr2 = new Object[0];
                                        Object objQ4 = dd4Var3.Q();
                                        if (objQ4 == obj5) {
                                            objQ4 = new aa9(8);
                                            dd4Var3.p0(objQ4);
                                        }
                                        a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ4, dd4Var3, 48);
                                        gd9 gd9Var = (gd9) br9Var.getValue();
                                        szb szbVarV = yib.v(pj7Var2, gjb.q(0.0f, 0.0f, 8.0f, 0.0f, 11));
                                        boolean zF2 = dd4Var3.f(t27Var2);
                                        Object objQ5 = dd4Var3.Q();
                                        if (zF2 || objQ5 == obj5) {
                                            objQ5 = new cl0(t27Var2, 13);
                                            dd4Var3.p0(objQ5);
                                        }
                                        kb4 kb4Var = (kb4) objQ5;
                                        boolean zF3 = dd4Var3.f(a07Var2) | dd4Var3.f(a07Var);
                                        Object objQ6 = dd4Var3.Q();
                                        if (zF3 || objQ6 == obj5) {
                                            objQ6 = new rl0(a07Var2, a07Var, 22);
                                            dd4Var3.p0(objQ6);
                                        }
                                        sdc.S(gd9Var, pj7Var2, szbVarV, px3Var, kb4Var, (kb4) objQ6, dd4Var3, 3072);
                                        dd4Var2 = dd4Var3;
                                        String str3 = (String) a07Var2.getValue();
                                        boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
                                        boolean zF4 = dd4Var2.f(a07Var);
                                        Object objQ7 = dd4Var2.Q();
                                        int i7 = 18;
                                        if (zF4 || objQ7 == obj5) {
                                            objQ7 = new hp8(a07Var, 18);
                                            dd4Var2.p0(objQ7);
                                        }
                                        kb4 kb4Var2 = (kb4) objQ7;
                                        boolean zF5 = dd4Var2.f(a07Var) | dd4Var2.f(t27Var2);
                                        Object objQ8 = dd4Var2.Q();
                                        if (zF5 || objQ8 == obj5) {
                                            objQ8 = new v03(t27Var2, a07Var, 3);
                                            dd4Var2.p0(objQ8);
                                        }
                                        yb4 yb4Var = (yb4) objQ8;
                                        boolean zF6 = dd4Var2.f(a07Var) | dd4Var2.f(t27Var2);
                                        Object objQ9 = dd4Var2.Q();
                                        if (zF6 || objQ9 == obj5) {
                                            objQ9 = new wt2(t27Var2, a07Var, 17);
                                            dd4Var2.p0(objQ9);
                                        }
                                        kb4 kb4Var3 = (kb4) objQ9;
                                        boolean zF7 = dd4Var2.f(a07Var) | dd4Var2.f(t27Var2);
                                        Object objQ10 = dd4Var2.Q();
                                        if (zF7 || objQ10 == obj5) {
                                            objQ10 = new wt2(t27Var2, a07Var, i7);
                                            dd4Var2.p0(objQ10);
                                        }
                                        kb4 kb4Var4 = (kb4) objQ10;
                                        boolean zF8 = dd4Var2.f(a07Var) | dd4Var2.f(t27Var2);
                                        Object objQ11 = dd4Var2.Q();
                                        if (zF8 || objQ11 == obj5) {
                                            objQ11 = new wt2(t27Var2, a07Var, 19);
                                            dd4Var2.p0(objQ11);
                                        }
                                        kb4 kb4Var5 = (kb4) objQ11;
                                        boolean zF9 = dd4Var2.f(str2) | dd4Var2.f(a07Var) | dd4Var2.f(t27Var2);
                                        Object objQ12 = dd4Var2.Q();
                                        if (zF9 || objQ12 == obj5) {
                                            objQ12 = new fb3(str2, t27Var2, a07Var);
                                            dd4Var2.p0(objQ12);
                                        }
                                        qu1.g(zBooleanValue, str3, kb4Var2, yb4Var, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ12, dd4Var2, 0);
                                        dd4Var2.q(false);
                                        dd4Var2.q(true);
                                    } else {
                                        dd4Var3.f0(-1756813700);
                                        ou6 ou6VarK0 = gjb.k0(px3Var, pj7Var2);
                                        Object objQ13 = dd4Var3.Q();
                                        if (objQ13 == obj5) {
                                            objQ13 = new dh1(1);
                                            dd4Var3.p0(objQ13);
                                        }
                                        bx1.b(48, (ib4) objQ13, dd4Var3, ou6VarK0);
                                        dd4Var3.q(false);
                                    }
                                    dd4Var2 = dd4Var3;
                                    dd4Var2.q(true);
                                }
                                break;
                            default:
                                pj7 pj7Var3 = (pj7) obj2;
                                dd4 dd4Var4 = (dd4) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((yn0) obj).getClass();
                                pj7Var3.getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= dd4Var4.f(pj7Var3) ? 32 : 16;
                                }
                                if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                                    dd4Var4.Y();
                                } else {
                                    bja bjaVar = (bja) br9Var.getValue();
                                    int i8 = iIntValue2;
                                    px3 px3Var2 = tg9.c;
                                    boolean zF10 = dd4Var4.f(t27Var2) | dd4Var4.f(str2);
                                    Object objQ14 = dd4Var4.Q();
                                    if (zF10 || objQ14 == obj5) {
                                        objQ14 = new fq2(t27Var2, str2, 1);
                                        dd4Var4.p0(objQ14);
                                    }
                                    ib4 ib4Var2 = (ib4) objQ14;
                                    boolean zF11 = dd4Var4.f(t27Var2) | dd4Var4.f(str2);
                                    Object objQ15 = dd4Var4.Q();
                                    if (zF11 || objQ15 == obj5) {
                                        objQ15 = new fq2(t27Var2, str2, 2);
                                        dd4Var4.p0(objQ15);
                                    }
                                    ib4 ib4Var3 = (ib4) objQ15;
                                    boolean zF12 = dd4Var4.f(t27Var2);
                                    Object objQ16 = dd4Var4.Q();
                                    if (zF12 || objQ16 == obj5) {
                                        objQ16 = new ne9(t27Var2, 13);
                                        dd4Var4.p0(objQ16);
                                    }
                                    ib4 ib4Var4 = (ib4) objQ16;
                                    boolean zF13 = dd4Var4.f(t27Var2);
                                    Object objQ17 = dd4Var4.Q();
                                    if (zF13 || objQ17 == obj5) {
                                        objQ17 = new ne9(t27Var2, 14);
                                        dd4Var4.p0(objQ17);
                                    }
                                    lc5.K(bjaVar, pj7Var3, px3Var2, ib4Var2, ib4Var3, ib4Var4, (ib4) objQ17, dd4Var4, (i8 & Token.ASSIGN_MOD) | 384);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var), dd4Var, 224304, 4);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, i3);
        }
    }

    public static final void M(List list, st5 st5Var, ou6 ou6Var, float f2, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        nv nvVar;
        dd4Var.h0(-412300293);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(st5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.c(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(yb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i3 & 1, (i3 & 306783379) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            o7c o7cVarN = mi9.n(null, dd4Var, 1);
            boolean zF = dd4Var.f(o7cVarN);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new lu1(o7cVarN, null, 1);
                dd4Var.p0(objQ);
            }
            u((yb4) objQ, dd4Var, o7cVarN);
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            dv5 dv5Var = (fyb) dd4Var.j(xm1.u);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x(new x13(a23.a(dv5Var.a())));
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            a07 a07VarA = dk9.A(list, dd4Var);
            boolean zF2 = dd4Var.f(pn2Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new bu1(pn2Var, a07Var, 1);
                dd4Var.p0(objQ3);
            }
            ou6 ou6VarJ = m79.J(ou6Var, (kb4) objQ3);
            int i5 = i3 & Token.ASSIGN_MOD;
            int i6 = i5 ^ 48;
            boolean zF3 = ((i6 > 32 && dd4Var.f(st5Var)) || (i3 & 48) == 32) | ((458752 & i3) == 131072) | dd4Var.f(a07VarA);
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                objQ4 = new gu1(st5Var, yb4Var2, a07VarA, 2);
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var3 = (kb4) objQ4;
            boolean z3 = (i6 > 32 && dd4Var.f(st5Var)) || (i3 & 48) == 32;
            int i7 = 57344 & i3;
            boolean zF4 = z3 | (i7 == 16384) | dd4Var.f(a07VarA);
            Object objQ5 = dd4Var.Q();
            if (zF4 || objQ5 == obj) {
                i4 = i5;
                objQ5 = new gu1(st5Var, yb4Var, a07VarA, 3);
                dd4Var.p0(objQ5);
            } else {
                i4 = i5;
            }
            ou6VarJ.getClass();
            o7cVarN.getClass();
            ou6 ou6VarE = ou6VarJ.e(new r6c(o7cVarN, false, kb4Var3, (kb4) objQ5));
            boolean zF5 = dd4Var.f(o7cVarN);
            Object objQ6 = dd4Var.Q();
            if (zF5 || objQ6 == obj) {
                objQ6 = new nl9(o7cVarN, 8);
                dd4Var.p0(objQ6);
            }
            ou6 ou6VarZ = kl8.Z(ou6VarE, (zb4) objQ6);
            boolean zF6 = dd4Var.f(o7cVarN);
            Object objQ7 = dd4Var.Q();
            if (zF6 || objQ7 == obj) {
                z2 = false;
                objQ7 = new ut1(o7cVarN, 0);
                dd4Var.p0(objQ7);
            } else {
                z2 = false;
            }
            ou6 ou6VarE2 = kl8.W(ou6VarZ, (kb4) objQ7).e(tg9.c);
            nv mvVar = new mv(f2, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((3670016 & i3) == 1048576 ? true : z2) | (i7 == 16384 ? true : z2) | ((29360128 & i3) == 8388608 ? true : z2) | ((234881024 & i3) == 67108864 ? true : z2) | ((1879048192 & i3) == 536870912 ? true : z2) | ((i3 & 896) == 256 ? true : z2);
            Object objQ8 = dd4Var.Q();
            if (zH || objQ8 == obj) {
                nvVar = mvVar;
                wt1 wt1Var = new wt1(list, zb4Var, yb4Var, ib4Var, kb4Var, kb4Var2, ou6Var, a07Var, 0);
                dd4Var.p0(wt1Var);
                objQ8 = wt1Var;
            } else {
                nvVar = mvVar;
            }
            rw1.j(ou6VarE2, st5Var, null, false, nvVar, null, null, false, null, (kb4) objQ8, dd4Var, i4, 492);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xt1(list, st5Var, ou6Var, f2, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, i2);
        }
    }

    public static final void N(ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1090521195);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 32 : 16;
        }
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = ef.b;
                dd4Var.p0(objQ);
            }
            ha6 ha6Var = (ha6) objQ;
            int i4 = ((i3 << 3) & Token.ASSIGN_MOD) | ((i3 >> 3) & 14) | 384;
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            int i5 = ((i4 << 6) & 896) | 6;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6Var);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            yb4Var.invoke(dd4Var, Integer.valueOf((i5 >> 6) & 14));
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ff(ou6Var, yb4Var, i2);
        }
    }

    public static final ExecutorService O(boolean z2) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new tn1(z2));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static boolean P(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean Q(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final String R(xr xrVar, dd4 dd4Var) {
        xrVar.getClass();
        switch (xrVar.ordinal()) {
            case 0:
                dd4Var.f0(257197487);
                String strK = wn9.K((pv9) mu9.x0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK;
            case 1:
                dd4Var.f0(257199976);
                String strK2 = wn9.K((pv9) vt9.K.getValue(), dd4Var);
                dd4Var.q(false);
                return strK2;
            case 2:
                dd4Var.f0(257202322);
                String strK3 = wn9.K((pv9) mu9.t0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK3;
            case 3:
                dd4Var.f0(257204879);
                String strK4 = wn9.K((pv9) mu9.u0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK4;
            case 4:
                dd4Var.f0(257207343);
                String strK5 = wn9.K((pv9) mu9.w0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK5;
            case 5:
                dd4Var.f0(257209972);
                String strK6 = wn9.K((pv9) mu9.y0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK6;
            case 6:
                dd4Var.f0(257212624);
                String strK7 = wn9.K((pv9) mu9.z0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK7;
            case 7:
                dd4Var.f0(257215185);
                String strK8 = wn9.K((pv9) mu9.A0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK8;
            case 8:
                dd4Var.f0(257217711);
                String strK9 = wn9.K((pv9) mu9.B0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK9;
            case 9:
                dd4Var.f0(257220208);
                String strK10 = wn9.K((pv9) mu9.C0.getValue(), dd4Var);
                dd4Var.q(false);
                return strK10;
            default:
                throw j39.e(257196774, dd4Var, false);
        }
    }

    public static void S(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            w58.g(i4, xv5.t(i2, i3, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            gp.l(xv5.o("startIndex: ", i2, i3, " > endIndex: "));
        }
    }

    public static void T(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            w58.g(i4, xv5.t(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            gp.l(xv5.o("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public static final void U(AutoCloseable autoCloseable, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    j39.t(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    i12.r(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    w58.p();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static int V(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int W(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static void X(k2b k2bVar, int i2, BlurMaskFilter blurMaskFilter, int i3) {
        long j2 = lc1.b;
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        int i4 = (i3 & 8) != 0 ? 0 : 1;
        k2bVar.m(j2);
        k2bVar.l(i2);
        k2bVar.u(i4);
        ((Paint) k2bVar.b).setMaskFilter(blurMaskFilter);
    }

    public static void Y(int i2, int i3, int i4, float[] fArr) {
        float fB;
        float fAbs;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float f4 = i4 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            fB = 0.0f;
            fAbs = 0.0f;
        } else {
            fB = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? dx1.b(f4, f2, f5, 2.0f) : dx1.b(f2, f3, f5, 4.0f);
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (fB * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = wx1.P(f7, 0.0f, 360.0f);
        fArr[1] = wx1.P(fAbs, 0.0f, 1.0f);
        fArr[2] = wx1.P(f6, 0.0f, 1.0f);
    }

    public static final vx1 Z(dd4 dd4Var) {
        return new yh8(dd4Var.R);
    }

    public static final ym a(float f2, float f3) {
        return new ym(Float.valueOf(f2), ah1.t0, Float.valueOf(f3), 8);
    }

    public static final String a0(int i2) {
        return dx1.f(i2, "appWidget-");
    }

    public static final void b(xr xrVar, String str, kb4 kb4Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-54012614);
        int i3 = i2 | (dd4Var2.d(xrVar.ordinal()) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
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
            String strK = wn9.K((pv9) mu9.s0.getValue(), dd4Var2);
            uka ukaVar = ((q96) dd4Var2.j(s96.a)).b.h;
            lu6 lu6Var = lu6.a;
            nha.c(strK, gjb.m0(lu6Var, 24.0f, 12.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 48, 0, 131068);
            dd4Var2 = dd4Var;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            le3 le3Var = xr.f;
            boolean zH = dd4Var2.h(le3Var) | ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var2.Q();
            if (zH || objQ == vl1.a) {
                objQ = new um(le3Var, xrVar, kb4Var, str, 16);
                dd4Var2.p0(objQ);
            }
            rw1.j(ou6VarF, null, null, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var2, 24582, 494);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(xrVar, str, kb4Var, ou6Var, i2, 25);
        }
    }

    public static int b0(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = k;
        return de1.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final void c(xr xrVar, String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-906593016);
        int i3 = i2 | (dd4Var2.d(xrVar.ordinal()) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.p;
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6Var, j2, lp4Var);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
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
            switch (xrVar.ordinal()) {
                case 0:
                    dd4Var2.f0(-2107183182);
                    pn0.a(fe.L(tg9.c, ((q96) dd4Var2.j(ur9Var)).a.r, lp4Var), dd4Var2, 0);
                    dd4Var2.q(false);
                    break;
                case 1:
                    dd4Var2.f0(-897944140);
                    if (bw9.a0(str)) {
                        dd4Var2.f0(-897657235);
                        ou6 ou6VarL2 = fe.L(tg9.c, ((q96) dd4Var2.j(ur9Var)).a.r, lp4Var);
                        ha6 ha6VarD2 = pn0.d(xf0Var, false);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL2);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ha6VarD2);
                        un9.s(jmVar2, dd4Var2, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL02);
                        mx4.a(i25.c((m53) f53.n.getValue(), dd4Var2, 0), (String) null, tg9.n(zn0.a.a(lu6.a, bv4.f), 18.0f), ((q96) dd4Var2.j(ur9Var)).a.s, dd4Var2, 48, 0);
                        dd4Var2 = dd4Var2;
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-897921603);
                        w05.a(new nl8(str), ra1.d, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(false);
                    break;
                case 2:
                    dd4Var2.f0(-2107143869);
                    y(tg9.c, dd4Var2, 6);
                    dd4Var2.q(false);
                    break;
                case 3:
                    dd4Var2.f0(-2107140977);
                    m79.m(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                case 4:
                    dd4Var2.f0(-2107136721);
                    fz1.t(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                case 5:
                    dd4Var2.f0(-2107132300);
                    fe.x(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                case 6:
                    dd4Var2.f0(-2107127903);
                    z(tg9.c, dd4Var2, 6);
                    dd4Var2.q(false);
                    break;
                case 7:
                    dd4Var2.f0(-2107125007);
                    fw.x(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                case 8:
                    dd4Var2.f0(-2107120689);
                    jv3.l(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                case 9:
                    dd4Var2.f0(-2107116400);
                    I(tg9.c, false, 0.8f, dd4Var2, 438, 0);
                    dd4Var2.q(false);
                    break;
                default:
                    throw j39.e(-2107182823, dd4Var2, false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(xrVar, str, ou6Var, i2, 22);
        }
    }

    public static float c0(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ib4 r25, ou6 r26, boolean r27, t89 r28, defpackage.bs0 r29, defpackage.fs0 r30, wm0 r31, pj7 r32, defpackage.zb4 r33, dd4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc5.d(ib4, ou6, boolean, t89, bs0, fs0, wm0, pj7, zb4, dd4, int, int):void");
    }

    public static final ou6 d0(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new hj5(kb4Var, (kb4) null));
    }

    public static final void e(final hz0 hz0Var, final yb4 yb4Var, final pj7 pj7Var, final ou6 ou6Var, final float f2, final hj9 hj9Var, final boolean z2, final rj1 rj1Var, dd4 dd4Var, final int i2) {
        int i3;
        hj9 hj9Var2;
        dd4Var.h0(-2077912500);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(hz0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.d(1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.d(2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.c(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            hj9Var2 = hj9Var;
            i3 |= dd4Var.f(hj9Var2) ? 8388608 : 4194304;
        } else {
            hj9Var2 = hj9Var;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var.g(z2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i3 & 1, (306783379 & i3) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            dd4Var.f0(-143525276);
            ur9 ur9Var = xm1.n;
            float fW = gjb.W(pj7Var, (zm5) dd4Var.j(ur9Var));
            dd4Var.q(false);
            ur9 ur9Var2 = xm1.h;
            float fK0 = ((pn2) dd4Var.j(ur9Var2)).k0(fW);
            dd4Var.f0(-1907957079);
            float fV = gjb.V(pj7Var, (zm5) dd4Var.j(ur9Var));
            dd4Var.q(false);
            float fK02 = ((pn2) dd4Var.j(ur9Var2)).k0(fV);
            boolean z3 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new ez0(yb4Var, fK0, fK02);
                dd4Var.p0(objQ);
            }
            ez0 ez0Var = (ez0) objQ;
            uf4 uf4Var = new uf4(ez0Var, 25);
            dd4Var.f0(273336201);
            gz0 gz0Var = hz0Var.a;
            rj7 rj7VarQ = gjb.q(0.0f, pj7Var.d(), 0.0f, pj7Var.a(), 5);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new vi0(16);
                dd4Var.p0(objQ2);
            }
            e11.e(gz0Var, a29.c(ou6Var, false, (kb4) objQ2), rj7VarQ, ez0Var, 2, f2, null, hj9Var2, z2, null, uf4Var, null, jf0.G(-1817116752, new ak0(22, hz0Var, ez0Var, rj1Var), dd4Var), dd4Var, (57344 & i3) | ((i3 >> 3) & 458752) | (29360128 & i3) | (i3 & 234881024), 11840);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: wy0
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    lc5.e(hz0Var, yb4Var, pj7Var, ou6Var, f2, hj9Var, z2, rj1Var, (dd4) obj2, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final ou6 e0(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new hj5((kb4) null, kb4Var));
    }

    public static final void f(ou6 ou6Var, xp4 xp4Var, boolean z2, kb4 kb4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        int i3;
        kb4Var.getClass();
        dd4Var.h0(-144183536);
        int i4 = i2 | (dd4Var.f(xp4Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(xp4Var);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            boolean z3 = (((i4 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.f(xp4Var)) || (i4 & 48) == 32;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new pg(xp4Var, a07Var, null, 5);
                dd4Var.p0(objQ2);
            }
            u((yb4) objQ2, dd4Var, xp4Var);
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
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            bp5 bp5Var = new bp5(0.8f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, bp5Var);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            bp5 bp5VarG = ky0.g(dd4Var, ou6VarL02, jmVar4, 0.8f, true);
            xp4 xp4Var2 = (xp4) a07Var.getValue();
            boolean zF = dd4Var.f(a07VarA);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                i3 = 0;
                objQ3 = new i91(a07Var, a07VarA, i3);
                dd4Var.p0(objQ3);
            } else {
                i3 = 0;
            }
            fz1.B(bp5VarG, xp4Var2, (yb4) objQ3, dd4Var, i3);
            lu6 lu6Var = lu6.a;
            if (z2) {
                ky0.z(dd4Var, 1892404204, lu6Var, 8.0f, dd4Var);
                ou6 ou6VarH = tg9.h(lu6Var, 32.0f);
                xp4 xp4Var3 = (xp4) a07Var.getValue();
                boolean zF2 = dd4Var.f(a07VarA);
                Object objQ4 = dd4Var.Q();
                if (zF2 || objQ4 == obj) {
                    objQ4 = new rl0(a07Var, a07VarA, 2);
                    dd4Var.p0(objQ4);
                }
                fz1.a(ou6VarH, xp4Var3, (kb4) objQ4, dd4Var, 6);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1892865484);
                dd4Var.q(false);
            }
            ky0.A(dd4Var, true, lu6Var, 8.0f, dd4Var);
            ou6 ou6VarR = tg9.r(lu6Var, 32.0f);
            xp4 xp4Var4 = (xp4) a07Var.getValue();
            boolean zF3 = dd4Var.f(a07VarA);
            Object objQ5 = dd4Var.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new rl0(a07Var, a07VarA, 3);
                dd4Var.p0(objQ5);
            }
            jf0.g(ou6VarR, xp4Var4, (kb4) objQ5, dd4Var, 6);
            dd4Var.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(ou6Var2, xp4Var, z2, kb4Var, i2, 3);
        }
    }

    public static void f0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final void g(j15 j15Var, ou6 ou6Var, ou6 ou6Var2, ou6 ou6Var3, zb4 zb4Var, dd4 dd4Var, int i2) {
        int i3;
        Object obj;
        kd kdVar;
        yb4 yb4Var;
        a83 a83Var;
        f9 f9Var;
        yb4 yb4Var2;
        kd kdVar2;
        yb4 yb4Var3;
        yb4 yb4Var4;
        ib4 ib4Var;
        jm jmVar;
        yb4 yb4Var5;
        a15 a15Var;
        Object obj2;
        int i4;
        boolean z2;
        boolean z3;
        zn7 zn7Var;
        yb4 yb4Var6;
        zn7 zn7Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-506306942);
        int i5 = i2 | (dd4Var2.f(j15Var) ? 4 : 2) | (dd4Var2.f(ou6Var2) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var3) ? 2048 : 1024) | (dd4Var2.h(zb4Var) ? 16384 : 8192);
        int i6 = 0;
        if (dd4Var2.V(i5 & 1, (i5 & 9363) != 9362)) {
            a07 a07VarA = dk9.A(zb4Var, dd4Var);
            a15 a15Var2 = (a15) dd4Var2.j(c15.a);
            String str = j15Var.f;
            int i7 = j15Var.c;
            boolean zF = dd4Var2.f(a15Var2) | dd4Var2.f(str);
            Object objQ = dd4Var2.Q();
            Object obj3 = vl1.a;
            if (zF || objQ == obj3) {
                objQ = a15Var2.f(new z15(new m35(i7, str, j15Var.j, j15Var.g), str, i7 + "-" + str));
                dd4Var2.p0(objQ);
            }
            a07 a07VarZ = bx1.z((b24) objQ, k25.a, dd4Var2);
            int i8 = i5 & 14;
            boolean zF2 = dd4Var2.f(a15Var2) | (i8 == 4);
            Object objQ2 = dd4Var2.Q();
            if (zF2 || objQ2 == obj3) {
                objQ2 = new du1(a15Var2, j15Var, i6);
                dd4Var2.p0(objQ2);
            }
            j(a15Var2, (kb4) objQ2, dd4Var2);
            m25 m25Var = (m25) a07VarZ.getValue();
            l25 l25Var = m25Var instanceof l25 ? (l25) m25Var : null;
            int i9 = i5 >> 3;
            f9 f9Var2 = bv4.b;
            ha6 ha6VarD = pn0.d(f9Var2, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var7 = ll1.f;
            un9.s(yb4Var7, dd4Var2, ha6VarD);
            yb4 yb4Var8 = ll1.e;
            un9.s(yb4Var8, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar3 = ll1.h;
            un9.r(dd4Var2, kdVar3);
            yb4 yb4Var9 = ll1.d;
            un9.s(yb4Var9, dd4Var2, ou6VarL0);
            if (l25Var != null) {
                zn7 zn7Var3 = l25Var.a;
                dd4Var2.f0(507402400);
                boolean zF3 = dd4Var2.f(zn7Var3);
                Object objQ3 = dd4Var2.Q();
                if (zF3 || objQ3 == obj3) {
                    zn7Var3.getClass();
                    objQ3 = new mv3(zn7Var3);
                    dd4Var2.p0(objQ3);
                }
                mv3 mv3Var = (mv3) objQ3;
                boolean zF4 = dd4Var2.f(zn7Var3);
                Object objQ4 = dd4Var2.Q();
                if (zF4 || objQ4 == obj3) {
                    zn7Var = zn7Var3;
                    int i10 = l25Var.d;
                    yb4Var6 = yb4Var8;
                    int i11 = l25Var.e;
                    yb4Var = yb4Var9;
                    l35 l35Var = l25Var.c;
                    String str2 = l35Var != null ? l35Var.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objQ4 = new q05(rw1.i(i10, i11), str2);
                    dd4Var2.p0(objQ4);
                } else {
                    zn7Var = zn7Var3;
                    yb4Var6 = yb4Var8;
                    yb4Var = yb4Var9;
                }
                q05 q05Var = (q05) objQ4;
                Object objQ5 = dd4Var2.Q();
                if (objQ5 == obj3) {
                    objQ5 = new f04();
                    dd4Var2.p0(objQ5);
                }
                ah8 ah8Var = (ah8) objQ5;
                mv3Var.getClass();
                q05Var.getClass();
                ah8Var.getClass();
                ita itaVar = new ita();
                boolean zF5 = dd4Var2.f(mv3Var.b) | dd4Var2.f(q05Var) | dd4Var2.f(ah8Var) | dd4Var2.f(itaVar);
                Object objQ6 = dd4Var2.Q();
                if (zF5 || objQ6 == obj3) {
                    objQ6 = new kta(mv3Var, q05Var, ah8Var, itaVar);
                    dd4Var2.p0(objQ6);
                }
                kta ktaVar = (kta) objQ6;
                Object objQ7 = dd4Var2.Q();
                if (objQ7 == obj3) {
                    objQ7 = Z(dd4Var2);
                    dd4Var2.p0(objQ7);
                }
                vx1 vx1Var = (vx1) objQ7;
                boolean zF6 = dd4Var2.f(ktaVar) | dd4Var2.h(vx1Var);
                Object objQ8 = dd4Var2.Q();
                if (zF6 || objQ8 == obj3) {
                    objQ8 = new k49(22, ktaVar, vx1Var);
                    dd4Var2.p0(objQ8);
                }
                j(ktaVar, (kb4) objQ8, dd4Var2);
                boolean zF7 = dd4Var2.f(a07VarA) | (i8 == 4) | dd4Var2.h(l25Var);
                Object objQ9 = dd4Var2.Q();
                if (zF7 || objQ9 == obj3) {
                    i3 = i8;
                    obj = obj3;
                    f9Var = f9Var2;
                    yb4Var2 = yb4Var6;
                    a83Var = null;
                    kdVar = kdVar3;
                    zn7Var2 = zn7Var;
                    ti tiVar = new ti((Object) j15Var, (Object) l25Var, (Object) a07VarA, (jt1) a83Var, 6);
                    dd4Var2.p0(tiVar);
                    objQ9 = tiVar;
                } else {
                    i3 = i8;
                    obj = obj3;
                    f9Var = f9Var2;
                    yb4Var2 = yb4Var6;
                    a83Var = null;
                    kdVar = kdVar3;
                    zn7Var2 = zn7Var;
                }
                u((yb4) objQ9, dd4Var2, zn7Var2);
                xg9.a(ktaVar, ou6Var2, 0, dd4Var2, i9 & Token.ASSIGN_MOD);
                dd4Var2.q(false);
            } else {
                i3 = i8;
                obj = obj3;
                kdVar = kdVar3;
                yb4Var = yb4Var9;
                a83Var = null;
                f9Var = f9Var2;
                yb4Var2 = yb4Var8;
                dd4Var2.f0(508330726);
                dd4Var2.q(false);
            }
            boolean z4 = ((m25) a07VarZ.getValue()) instanceof k25;
            ou6 ou6VarI = yb0.I(ou6Var3, ((Number) an.b(z4 ? 1.0f : 0.0f, ah1.a0(150, 0, a83Var, 6), (String) null, dd4Var2, 48, 28).getValue()).floatValue());
            ha6 ha6VarD2 = pn0.d(f9Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarI);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var7, dd4Var2, ha6VarD2);
            un9.s(yb4Var2, dd4Var2, lr7VarL2);
            kd kdVar4 = kdVar;
            ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar4);
            yb4 yb4Var10 = yb4Var;
            un9.s(yb4Var10, dd4Var2, ou6VarL02);
            lu6 lu6Var = lu6.a;
            if (z4) {
                dd4Var2.f0(-1691949967);
                yb4 yb4Var11 = yb4Var2;
                ib4Var = ib4Var2;
                kdVar2 = kdVar4;
                yb4Var3 = yb4Var10;
                z2 = true;
                a15Var = a15Var2;
                obj2 = obj;
                i4 = i3;
                d75 d75VarT = fx1.t(fx1.G0(dd4Var2, 1), 0.2f, 1.0f, ah1.H(ah1.a0(500, 0, b83.d, 2), sj8.b, 0L, 4), dd4Var2, 4536, 8);
                String strValueOf = String.valueOf(j15Var.d + 1);
                ur9 ur9Var = s96.a;
                jmVar = jmVar2;
                yb4Var4 = yb4Var11;
                yb4Var5 = yb4Var7;
                nha.c(strValueOf, yb0.I(zn0.a.a(lu6Var, bv4.f), ((Number) d75VarT.c.getValue()).floatValue()), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.b, dd4Var, 0, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                kdVar2 = kdVar4;
                yb4Var3 = yb4Var10;
                yb4Var4 = yb4Var2;
                ib4Var = ib4Var2;
                jmVar = jmVar2;
                yb4Var5 = yb4Var7;
                a15Var = a15Var2;
                obj2 = obj;
                i4 = i3;
                z2 = true;
                dd4Var2.f0(-1691185972);
                dd4Var2.q(false);
            }
            dd4Var2.q(z2);
            if (((m25) a07VarZ.getValue()) instanceof j25) {
                dd4Var2.f0(509542361);
                ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6Var3);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(ib4Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var5, dd4Var2, ie1VarA);
                un9.s(yb4Var4, dd4Var2, lr7VarL3);
                ky0.v(iHashCode3, dd4Var2, jmVar, dd4Var2, kdVar2);
                un9.s(yb4Var3, dd4Var2, ou6VarL03);
                String strK = wn9.K((pv9) eu9.H.getValue(), dd4Var2);
                ur9 ur9Var2 = s96.a;
                nha.c(strK, gjb.l0(lu6Var, 12.0f), ((q96) dd4Var2.j(ur9Var2)).a.q, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var2)).b.j, dd4Var, 24624, 0, 130024);
                p35 p35VarC = i25.c((m53) f53.d0.getValue(), dd4Var, 0);
                String strK2 = wn9.K((pv9) mu9.Q.getValue(), dd4Var);
                boolean zF8 = dd4Var.f(a15Var) | (i4 == 4);
                Object objQ10 = dd4Var.Q();
                if (zF8 || objQ10 == obj2) {
                    objQ10 = new eu1(a15Var, j15Var, 0);
                    dd4Var.p0(objQ10);
                }
                kc5.n(p35VarC, strK2, false, null, null, null, null, null, (ib4) objQ10, dd4Var, 0, 252);
                dd4Var2 = dd4Var;
                z3 = true;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                z3 = true;
                dd4Var2.f0(510415910);
                dd4Var2.q(false);
            }
            dd4Var2.q(z3);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(j15Var, ou6Var, ou6Var2, ou6Var3, zb4Var, i2, 3);
        }
    }

    public static final ou6 g0(ou6 ou6Var, jx8 jx8Var, lh7 lh7Var, ag agVar, boolean z2, boolean z3, s04 s04Var, yy6 yy6Var, jk7 jk7Var) {
        lh7 lh7Var2 = lh7.a;
        lu6 lu6Var = lu6.a;
        return ou6Var.e(lh7Var == lh7Var2 ? t96.w(lu6Var, lp4.c) : t96.w(lu6Var, lp4.b)).e(new xw8(agVar, jk7Var, s04Var, yy6Var, lh7Var, jx8Var, z2, z3, false));
    }

    public static final void h(final float f2, final int i2, final int i3, final int i4, final ib4 ib4Var, final kb4 kb4Var, final kb4 kb4Var2, final yb4 yb4Var, final yb4 yb4Var2, final zb4 zb4Var, dd4 dd4Var, final st5 st5Var, final ou6 ou6Var, final List list) {
        int i5;
        int i6;
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        yb4Var.getClass();
        yb4Var2.getClass();
        zb4Var.getClass();
        ib4Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-2136189106);
        if ((i3 & 6) == 0) {
            i5 = (dd4Var2.d(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dd4Var.f(st5Var) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var2.c(f2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= dd4Var2.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i3) == 0) {
            i5 |= dd4Var2.h(yb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= dd4Var2.h(zb4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= dd4Var2.h(ib4Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= dd4Var2.h(kb4Var) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (dd4Var2.h(kb4Var2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (dd4Var2.V(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            dd4Var2.a0();
            if ((i3 & 1) != 0 && !dd4Var2.C()) {
                dd4Var2.Y();
            }
            dd4Var2.r();
            if (i2 == 0) {
                dd4Var2.f0(-677594809);
                M(list, st5Var, ou6Var, f2, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, dd4Var2, ((i5 >> 3) & 268435454) | ((i6 << 27) & 1879048192));
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else if (i2 == 1) {
                dd4Var2.f0(-678736322);
                int i7 = i5 >> 3;
                t(list, st5Var, false, ou6Var, f2, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, dd4Var2, (i7 & Token.ASSIGN_MOD) | (i7 & 14) | 384 | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (234881024 & i5) | (i5 & 1879048192), i6 & 14);
                dd4Var2.q(false);
            } else if (i2 != 2) {
                dd4Var2.f0(-677115084);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-678166945);
                int i8 = i5 >> 3;
                t(list, st5Var, true, ou6Var, f2, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, dd4Var2, (i8 & 14) | 384 | (i8 & Token.ASSIGN_MOD) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), i6 & 14);
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: tt1
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i3 | 1);
                    int iX02 = qu1.x0(i4);
                    lc5.h(f2, i2, iX0, iX02, ib4Var, kb4Var, kb4Var2, yb4Var, yb4Var2, zb4Var, (dd4) obj, st5Var, ou6Var, list);
                    return heb.a;
                }
            };
        }
    }

    public static final ou6 h0(ou6 ou6Var) {
        return ou6Var.e(new a7a());
    }

    public static final void i(ib4 ib4Var, xr2 xr2Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(826668973);
        int i3 = 2;
        int i4 = i2 | (dd4Var.h(ib4Var) ? 4 : 2) | (dd4Var.f(xr2Var) ? 32 : 16);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            View view = (View) dd4Var.j(he.f);
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
            bd4 bd4VarH0 = fe.h0(dd4Var);
            a07 a07VarA = dk9.A(rj1Var, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = ge.s;
                dd4Var.p0(objQ);
            }
            UUID uuid = (UUID) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            boolean zD = dd4Var.d(xr2Var.g) | dd4Var.f(view) | dd4Var.f(pn2Var) | dd4Var.f((Object) null);
            Object objQ2 = dd4Var.Q();
            if (zD || objQ2 == fu6Var) {
                zr2 zr2Var = new zr2(ib4Var, xr2Var, view, zm5Var, pn2Var, uuid);
                rj1 rj1Var2 = new rj1(new j0(a07VarA, i3), true, -1338939603);
                wr2 wr2Var = zr2Var.t;
                wr2Var.setParentCompositionContext(bd4VarH0);
                wr2Var.w.setValue(rj1Var2);
                wr2Var.A = true;
                wr2Var.d();
                dd4Var.p0(zr2Var);
                objQ2 = zr2Var;
            }
            zr2 zr2Var2 = (zr2) objQ2;
            boolean zH = dd4Var.h(zr2Var2);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == fu6Var) {
                objQ3 = new bf(zr2Var2, 0);
                dd4Var.p0(objQ3);
            }
            j(zr2Var2, (kb4) objQ3, dd4Var);
            boolean zH2 = dd4Var.h(zr2Var2) | ((i4 & 14) == 4) | ((i4 & Token.ASSIGN_MOD) == 32) | dd4Var.d(zm5Var.ordinal());
            Object objQ4 = dd4Var.Q();
            if (zH2 || objQ4 == fu6Var) {
                a5 a5Var = new a5(zr2Var2, ib4Var, xr2Var, zm5Var, 1);
                dd4Var.p0(a5Var);
                objQ4 = a5Var;
            }
            H((ib4) objQ4, dd4Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cf(ib4Var, xr2Var, rj1Var, i2, 0);
        }
    }

    public static void i0(String str) {
        fi1 fi1Var = new fi1(xv5.p("lateinit property ", str, " has not been initialized"));
        f0(fi1Var, lc5.class.getName());
        throw fi1Var;
    }

    public static final void j(Object obj, kb4 kb4Var, dd4 dd4Var) {
        boolean zF = dd4Var.f(obj);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new ww2(kb4Var);
            dd4Var.p0(objQ);
        }
    }

    public static float j0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void k(Object obj, Object obj2, kb4 kb4Var, dd4 dd4Var) {
        boolean zF = dd4Var.f(obj) | dd4Var.f(obj2);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new ww2(kb4Var);
            dd4Var.p0(objQ);
        }
    }

    public static final void l(Object[] objArr, kb4 kb4Var, dd4 dd4Var) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= dd4Var.f(obj);
        }
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            dd4Var.p0(new ww2(kb4Var));
        }
    }

    public static final void m(ib4 ib4Var, ou6 ou6Var, boolean z2, t89 t89Var, bs0 bs0Var, fs0 fs0Var, pj7 pj7Var, dd4 dd4Var, int i2) {
        boolean z3;
        t89 t89Var2;
        bs0 bs0Var2;
        fs0 fs0Var2;
        pj7 pj7Var2;
        bs0 bs0Var3;
        fs0 fs0Var3;
        int i3;
        pj7 pj7Var3;
        boolean z4;
        bs0 bs0Var4;
        t89 t89Var3;
        rj1 rj1Var = vm7.k;
        dd4Var.h0(-102343472);
        int i4 = i2 | (dd4Var.h(ib4Var) ? 4 : 2) | 114894208;
        if (dd4Var.V(i4 & 1, (306783379 & i4) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                rj7 rj7Var = cs0.a;
                t89 t89VarA = n99.a(s32.c, dd4Var);
                ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
                bs0 bs0Var5 = ad1Var.X;
                if (bs0Var5 == null) {
                    bs0Var3 = new bs0(dd1.d(ad1Var, s32.C), dd1.d(ad1Var, s32.G), lc1.c(0.12f, dd1.d(ad1Var, s32.D)), lc1.c(0.38f, dd1.d(ad1Var, s32.E)));
                    ad1Var.X = bs0Var3;
                } else {
                    bs0Var3 = bs0Var5;
                }
                fs0Var3 = new fs0(s32.F);
                i3 = i4 & (-523265);
                pj7Var3 = cs0.a;
                z4 = true;
                bs0Var4 = bs0Var3;
                t89Var3 = t89VarA;
            } else {
                dd4Var.Y();
                i3 = i4 & (-523265);
                z4 = z2;
                t89Var3 = t89Var;
                bs0Var4 = bs0Var;
                fs0Var3 = fs0Var;
                pj7Var3 = pj7Var;
            }
            dd4Var.r();
            d(ib4Var, ou6Var, z4, t89Var3, bs0Var4, fs0Var3, null, pj7Var3, rj1Var, dd4Var, i3 & 2147483646, 0);
            z3 = z4;
            t89Var2 = t89Var3;
            bs0Var2 = bs0Var4;
            fs0Var2 = fs0Var3;
            pj7Var2 = pj7Var3;
        } else {
            dd4Var.Y();
            z3 = z2;
            t89Var2 = t89Var;
            bs0Var2 = bs0Var;
            fs0Var2 = fs0Var;
            pj7Var2 = pj7Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ut3(ib4Var, ou6Var, z3, t89Var2, bs0Var2, fs0Var2, pj7Var2, i2);
        }
    }

    public static final void n(o54 o54Var, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        boolean z2;
        ou6 ou6Var2;
        long jC;
        kb4 kb4Var2 = kb4Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1022179478);
        int i3 = i2 | (dd4Var2.f(o54Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6VarW = t96.w(ou6Var, s00.p(dd4Var2).d);
            long jG = dd1.g(s00.o(dd4Var2), 1.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6VarW, jG, lp4Var);
            boolean z3 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new xf3(9, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 14.0f, 12.0f);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
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
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarE0 = sdc.e0(0.6666667f, t96.w(tg9.r(ou6Var3, 56.0f), s00.p(dd4Var2).c), false);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
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
            String str = o54Var.a;
            String str2 = o54Var.b;
            boolean z4 = o54Var.f;
            w05.c(str, str2, o54Var.c, o54Var.d, ra1.d, tg9.c, dd4Var, 221184);
            dd4 dd4Var3 = dd4Var;
            if (o54Var.g > 0) {
                dd4Var3.f0(-647428055);
                z2 = z4;
                ou6Var2 = ou6Var3;
                yb0.a(3072, 6, 0L, 0L, jf0.G(1589172132, new nl9(o54Var, 16), dd4Var3), dd4Var, zn0.a.a(gjb.l0(ou6Var3, 4.0f), bv4.d));
                dd4Var3 = dd4Var;
                dd4Var3.q(false);
            } else {
                z2 = z4;
                ou6Var2 = ou6Var3;
                dd4Var3.f0(-647169546);
                dd4Var3.q(false);
            }
            dd4Var3.q(true);
            un9.a(dd4Var3, tg9.r(ou6Var2, 12.0f));
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
            int iHashCode3 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL3 = dd4Var3.l();
            ou6 ou6VarL03 = s32.L0(dd4Var3, bp5Var);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar, dd4Var3, ie1VarA);
            un9.s(jmVar2, dd4Var3, lr7VarL3);
            ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
            un9.s(jmVar4, dd4Var3, ou6VarL03);
            nha.c(str2, tg9.f(ou6Var2, 1.0f), 0L, (g60) null, 0L, (t74) null, a84.u, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var, 1572912, 24960, 109500);
            nha.c(o54Var.d, tg9.f(ou6Var2, 1.0f), lc1.c(0.55f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 48, 24960, 109560);
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var, 0);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            nha.c(wn9.K((pv9) ev9.S.getValue(), dd4Var), ou6Var2, lc1.c(0.55f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 48, 24960, 109560);
            un9.a(dd4Var, tg9.r(ou6Var2, 6.0f));
            ri9.f(o54Var.h, (ou6) null, false, lc1.c(0.55f, s00.o(dd4Var).q), 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 0, 131062);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(ou6Var2, 12.0f));
            p35 p35VarC = i25.c(z2 ? (m53) f53.P.getValue() : (m53) f53.Q.getValue(), dd4Var2, 0);
            if (z2) {
                dd4Var2.f0(-1491591441);
                jC = s00.o(dd4Var2).a;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1491520358);
                jC = lc1.c(0.5f, s00.o(dd4Var2).q);
                dd4Var2.q(false);
            }
            long j2 = jC;
            ou6 ou6VarH = ky0.h(dd4Var2, 6.0f, t96.w(tg9.n(ou6Var2, 40.0f), tp8.a), lp4Var);
            boolean z5 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objQ2 = dd4Var2.Q();
            if (z5 || objQ2 == obj) {
                kb4Var2 = kb4Var;
                objQ2 = new al3(8, kb4Var2, o54Var);
                dd4Var2.p0(objQ2);
            } else {
                kb4Var2 = kb4Var;
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarH, false, 15), 8.0f), j2, dd4Var2, 48, 0);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(o54Var, ou6Var, ib4Var, kb4Var2, i2, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(List list, szb szbVar, szb szbVar2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        int i3;
        ou6 ou6Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1485185348);
        int i4 = i2 | (dd4Var2.h(list) ? 4 : 2) | (dd4Var2.f(szbVar) ? 32 : 16) | (dd4Var2.f(szbVar2) ? 256 : Token.CASE) | 3072 | (dd4Var2.h(kb4Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i4 & 1, (599187 & i4) != 599186)) {
            boolean zIsEmpty = list.isEmpty();
            ou6 ou6Var4 = lu6.a;
            if (zIsEmpty) {
                dd4Var2.f0(1596687778);
                bx1.d(lx1.m0(dd4Var2), wn9.K((pv9) eu9.c.getValue(), dd4Var2), wn9.K((pv9) eu9.d.getValue(), dd4Var2), gjb.k0(tg9.c, szbVar), wn9.K((pv9) zt9.v0.getValue(), dd4Var2), ib4Var, dd4Var2, (i4 >> 3) & 458752, 0);
                dd4Var2.q(false);
                ou6Var3 = ou6Var4;
            } else {
                dd4Var2.f0(1597107642);
                yh4 yh4Var = new yh4(360.0f);
                mv mvVar = new mv(8.0f, true, new gp(5));
                mv mvVar2 = new mv(8.0f, true, new gp(5));
                boolean zH = ((57344 & i4) == 16384) | dd4Var2.h(list) | ((i4 & 458752) == 131072);
                Object objQ = dd4Var2.Q();
                if (zH || objQ == vl1.a) {
                    i3 = 0;
                    objQ = new q54(list, kb4Var, kb4Var2, i3);
                    dd4Var2.p0(objQ);
                } else {
                    i3 = 0;
                }
                ou6Var3 = ou6Var4;
                gx1.i(yh4Var, ou6Var3, null, szbVar, mvVar2, mvVar, null, false, 0L, 0L, szbVar2, 0.0f, (kb4) objQ, dd4Var, 1769520 | ((i4 << 6) & 7168), (i4 >> 3) & Token.ASSIGN_MOD, 6036);
                dd4Var2 = dd4Var;
                dd4Var2.q(i3);
            }
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(list, szbVar, szbVar2, ou6Var2, kb4Var, kb4Var2, ib4Var, i2, 1);
        }
    }

    public static final void p(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        dd4 dd4Var2 = dd4Var;
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var2.h0(-890189322);
        int i3 = i2 | (dd4Var2.f(t27Var) ? 4 : 2) | (dd4Var2.f(pj7Var) ? 32 : 16) | (dd4Var2.f(szbVar) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        final int i4 = 0;
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var2);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            jt1 jt1Var = null;
            final y54 y54Var = (y54) ((qtb) qx1.N(ug8.a(y54.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var2), null));
            a07 a07VarB = bx1.B(y54Var.s, dd4Var2);
            lva lvaVar = (lva) dd4Var2.j(nva.a);
            pp1 pp1Var = y54Var.t;
            boolean zF = dd4Var2.f(lvaVar);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new xa(lvaVar, jt1Var, 14);
                dd4Var2.p0(objQ);
            }
            wx1.e(pp1Var, null, (zb4) objQ, dd4Var2, 0);
            if (((v54) a07VarB.getValue()).a) {
                dd4Var2.f0(1793828170);
                dd4Var2.q(false);
            } else if (((v54) a07VarB.getValue()).d.isEmpty() && ((v54) a07VarB.getValue()).e.isEmpty()) {
                dd4Var2.f0(1793943304);
                bx1.d(lx1.m0(dd4Var2), wn9.K((pv9) eu9.c.getValue(), dd4Var2), wn9.K((pv9) eu9.d.getValue(), dd4Var2), gjb.k0(tg9.c, pj7Var), wn9.K((pv9) zt9.v0.getValue(), dd4Var2), ib4Var, dd4Var2, (i3 << 3) & 458752, 0);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1794393021);
                v54 v54Var = (v54) a07VarB.getValue();
                boolean zF2 = dd4Var2.f(y54Var);
                Object objQ2 = dd4Var2.Q();
                if (zF2 || objQ2 == obj) {
                    objQ2 = new kb4() { // from class: p54
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj2) {
                            int i5 = i4;
                            heb hebVar = heb.a;
                            y54 y54Var2 = y54Var;
                            switch (i5) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                    za1 za1VarA = vtb.a(y54Var2);
                                    aj2 aj2Var = rw2.a;
                                    y54Var2.g(za1VarA, nh2.c, new lk0(y54Var2, zBooleanValue, null, 4));
                                    break;
                                default:
                                    String str = (String) obj2;
                                    str.getClass();
                                    za1 za1VarA2 = vtb.a(y54Var2);
                                    aj2 aj2Var2 = rw2.a;
                                    y54Var2.g(za1VarA2, nh2.c, new j90(y54Var2, str, null));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ2);
                }
                kb4 kb4Var = (kb4) objQ2;
                boolean z2 = (i3 & 14) == 4;
                Object objQ3 = dd4Var2.Q();
                if (z2 || objQ3 == obj) {
                    objQ3 = new cl0(t27Var, 7);
                    dd4Var2.p0(objQ3);
                }
                kb4 kb4Var2 = (kb4) objQ3;
                boolean zF3 = dd4Var2.f(y54Var);
                Object objQ4 = dd4Var2.Q();
                if (zF3 || objQ4 == obj) {
                    final int i5 = 1;
                    objQ4 = new kb4() { // from class: p54
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj2) {
                            int i52 = i5;
                            heb hebVar = heb.a;
                            y54 y54Var2 = y54Var;
                            switch (i52) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                    za1 za1VarA = vtb.a(y54Var2);
                                    aj2 aj2Var = rw2.a;
                                    y54Var2.g(za1VarA, nh2.c, new lk0(y54Var2, zBooleanValue, null, 4));
                                    break;
                                default:
                                    String str = (String) obj2;
                                    str.getClass();
                                    za1 za1VarA2 = vtb.a(y54Var2);
                                    aj2 aj2Var2 = rw2.a;
                                    y54Var2.g(za1VarA2, nh2.c, new j90(y54Var2, str, null));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ4);
                }
                q(v54Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, (kb4) objQ4, ib4Var, dd4Var2, (i3 & 8176) | ((i3 << 9) & 29360128));
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, pj7Var, szbVar, ou6Var, ib4Var, i2, 1);
        }
    }

    public static final void q(v54 v54Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var4;
        v54 v54Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-558735564);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(v54Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(szbVar) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            kb4Var4 = kb4Var3;
            i3 |= dd4Var2.h(kb4Var4) ? 1048576 : 524288;
        } else {
            kb4Var4 = kb4Var3;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 8388608 : 4194304;
        }
        if (dd4Var2.V(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = Z(dd4Var2);
                dd4Var2.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new tl3(i4);
                dd4Var2.p0(objQ2);
            }
            int i5 = i3;
            pi2 pi2VarB = cl7.b(0, (ib4) objQ2, dd4Var2, 384, 3);
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
            g78 g78VarB = z68.b(dd4Var2);
            px3 px3Var = tg9.c;
            boolean z2 = v54Var.c;
            boolean zF = ((i5 & 57344) == 16384) | dd4Var2.f(pi2VarB);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new al3(9, kb4Var, pi2VarB);
                dd4Var2.p0(objQ3);
            }
            rj1 rj1VarG = jf0.G(1158647315, new c41(18, g78VarB, v54Var, pj7Var), dd4Var2);
            el0 el0Var = new el0(pi2VarB, v54Var, pj7Var, szbVar, kb4Var2, kb4Var4, ib4Var);
            v54Var2 = v54Var;
            int i6 = 4;
            z68.a(z2, (ib4) objQ3, px3Var, g78VarB, (f9) null, rj1VarG, false, 0.0f, jf0.G(-1588095978, el0Var, dd4Var2), dd4Var2, 100860288);
            dd4Var2 = dd4Var2;
            int size = v54Var2.d.size();
            int size2 = v54Var2.e.size();
            ou6 ou6VarK0 = gjb.k0(tg9.f(lu6.a, 1.0f), pj7Var);
            boolean zH = dd4Var2.h(vx1Var) | dd4Var2.f(pi2VarB);
            Object objQ4 = dd4Var2.Q();
            if (zH || objQ4 == obj) {
                objQ4 = new bh1(i6, vx1Var, pi2VarB);
                dd4Var2.p0(objQ4);
            }
            r(pi2VarB, size, size2, ou6VarK0, (kb4) objQ4, dd4Var2, 0);
            dd4Var2.q(true);
        } else {
            v54Var2 = v54Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(v54Var2, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, kb4Var3, ib4Var, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(zk7 r16, int r17, int r18, ou6 r19, defpackage.kb4 r20, dd4 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc5.r(zk7, int, int, ou6, kb4, dd4, int):void");
    }

    public static final void s(final hz0 hz0Var, final ou6 ou6Var, final float f2, final float f3, final hj9 hj9Var, boolean z2, float f4, float f5, pj7 pj7Var, final rj1 rj1Var, dd4 dd4Var, final int i2) {
        int i3;
        float f6;
        final boolean z3;
        final float f7;
        final float f8;
        final pj7 pj7Var2;
        float f9;
        pj7 rj7Var;
        float f10;
        boolean z4;
        float f11;
        float f12;
        dd4Var.h0(1493031269);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(hz0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f6 = f2;
            i3 |= dd4Var.c(f6) ? 256 : Token.CASE;
        } else {
            f6 = f2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.c(f3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(hj9Var) ? 16384 : 8192;
        }
        int i4 = i3 | 115015680;
        if ((805306368 & i2) == 0) {
            i4 |= dd4Var.h(rj1Var) ? 536870912 : 268435456;
        }
        int i5 = i4;
        if (dd4Var.V(i5 & 1, (306783379 & i5) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                f9 = 40.0f;
                rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
                f10 = 56.0f;
                z4 = true;
            } else {
                dd4Var.Y();
                z4 = z2;
                f9 = f4;
                rj7Var = pj7Var;
                f10 = f5;
            }
            dd4Var.r();
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            boolean zF = ((i5 & 3670016) == 1048576) | dd4Var.f(pn2Var) | ((i5 & 896) == 256) | dd4Var.h(hz0Var) | ((i5 & 29360128) == 8388608);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                uy0 uy0Var = new uy0(pn2Var, f6, hz0Var, f9, f10);
                f11 = f9;
                f12 = f10;
                dd4Var.p0(uy0Var);
                objQ = uy0Var;
            } else {
                f11 = f9;
                f12 = f10;
            }
            int i6 = i5 << 9;
            int i7 = (i5 & 14) | 24624 | ((i5 >> 15) & 7168) | ((i5 << 12) & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (1879048192 & i5);
            z3 = z4;
            pj7 pj7Var3 = rj7Var;
            e(hz0Var, (yb4) objQ, pj7Var3, ou6Var, f3, hj9Var, z3, rj1Var, dd4Var, i7);
            pj7Var2 = pj7Var3;
            f7 = f11;
            f8 = f12;
        } else {
            dd4Var.Y();
            z3 = z2;
            f7 = f4;
            f8 = f5;
            pj7Var2 = pj7Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: vy0
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lc5.s(hz0Var, ou6Var, f2, f3, hj9Var, z3, f7, f8, pj7Var2, rj1Var, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void t(final List list, final st5 st5Var, final boolean z2, final ou6 ou6Var, final float f2, final yb4 yb4Var, final yb4 yb4Var2, final zb4 zb4Var, final ib4 ib4Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        int i5;
        a07 a07Var;
        kv kvVar;
        int i6;
        dd4Var.h0(-1394573463);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(st5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.c(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i4 |= dd4Var.h(yb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= dd4Var.h(zb4Var) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (dd4Var.h(kb4Var2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (dd4Var.V(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            o7c o7cVarN = mi9.n(null, dd4Var, 1);
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            dv5 dv5Var = (fyb) dd4Var.j(xm1.u);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(new x13(a23.b(dv5Var.a())));
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) objQ;
            a07 a07VarA = dk9.A(list, dd4Var);
            boolean zF = dd4Var.f(o7cVarN);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new lu1(o7cVarN, null, 0);
                dd4Var.p0(objQ2);
            }
            u((yb4) objQ2, dd4Var, o7cVarN);
            boolean zF2 = dd4Var.f(pn2Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new bu1(pn2Var, a07Var2, 0);
                dd4Var.p0(objQ3);
            }
            ou6 ou6VarJ = m79.J(ou6Var, (kb4) objQ3);
            int i7 = i4 & Token.ASSIGN_MOD;
            int i8 = i7 ^ 48;
            boolean zF3 = ((i8 > 32 && dd4Var.f(st5Var)) || (i4 & 48) == 32) | ((3670016 & i4) == 1048576) | dd4Var.f(a07VarA);
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                objQ4 = new gu1(st5Var, yb4Var2, a07VarA, 0);
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var3 = (kb4) objQ4;
            boolean z3 = (i8 > 32 && dd4Var.f(st5Var)) || (i4 & 48) == 32;
            int i9 = 458752 & i4;
            boolean zF4 = z3 | (i9 == 131072) | dd4Var.f(a07VarA);
            Object objQ5 = dd4Var.Q();
            if (zF4 || objQ5 == obj) {
                a07Var = a07Var2;
                objQ5 = new gu1(st5Var, yb4Var, a07VarA, 1);
                dd4Var.p0(objQ5);
            } else {
                a07Var = a07Var2;
            }
            ou6VarJ.getClass();
            o7cVarN.getClass();
            ou6 ou6VarE = ou6VarJ.e(new r6c(o7cVarN, false, kb4Var3, (kb4) objQ5));
            ou6VarE.getClass();
            ou6 ou6VarE2 = xg9.q(ou6VarE, o7cVarN, false).e(tg9.c);
            kv mvVar = new mv(f2, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((29360128 & i4) == 8388608) | (i9 == 131072) | ((234881024 & i4) == 67108864) | ((1879048192 & i4) == 536870912) | ((i5 & 14) == 4) | ((i4 & 7168) == 2048);
            Object objQ6 = dd4Var.Q();
            if (zH || objQ6 == obj) {
                kvVar = mvVar;
                i6 = i4;
                wt1 wt1Var = new wt1(list, zb4Var, yb4Var, ib4Var, kb4Var, kb4Var2, ou6Var, a07Var, 1);
                dd4Var.p0(wt1Var);
                objQ6 = wt1Var;
            } else {
                i6 = i4;
                kvVar = mvVar;
            }
            rw1.k(ou6VarE2, st5Var, null, z2, kvVar, null, null, false, null, (kb4) objQ6, dd4Var, ((i6 << 3) & 7168) | i7, 484);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ju1
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    lc5.t(list, st5Var, z2, ou6Var, f2, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void u(yb4 yb4Var, dd4 dd4Var, Object obj) {
        jx1 jx1Var = dd4Var.R;
        boolean zF = dd4Var.f(obj);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new mm5(jx1Var, yb4Var);
            dd4Var.p0(objQ);
        }
    }

    public static final void v(Object obj, Object obj2, yb4 yb4Var, dd4 dd4Var) {
        jx1 jx1Var = dd4Var.R;
        boolean zF = dd4Var.f(obj) | dd4Var.f(obj2);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new mm5(jx1Var, yb4Var);
            dd4Var.p0(objQ);
        }
    }

    public static final void w(Object obj, Object obj2, Object obj3, yb4 yb4Var, dd4 dd4Var) {
        jx1 jx1Var = dd4Var.R;
        boolean zF = dd4Var.f(obj) | dd4Var.f(obj2) | dd4Var.f(obj3);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new mm5(jx1Var, yb4Var);
            dd4Var.p0(objQ);
        }
    }

    public static final void x(Object[] objArr, yb4 yb4Var, dd4 dd4Var) {
        jx1 jx1Var = dd4Var.R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= dd4Var.f(obj);
        }
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            dd4Var.p0(new mm5(jx1Var, yb4Var));
        }
    }

    public static final void y(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1134043616);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.a;
            long j3 = ((q96) dd4Var.j(ur9Var)).a.f;
            long j4 = ((q96) dd4Var.j(ur9Var)).a.j;
            boolean zE = dd4Var.e(j2) | dd4Var.e(j4) | dd4Var.e(j3);
            Object objQ = dd4Var.Q();
            if (zE || objQ == vl1.a) {
                ti6 ti6Var = new ti6(0, j2, j4, j3);
                dd4Var.p0(ti6Var);
                objQ = ti6Var;
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 13);
        }
    }

    public static final void z(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1339619456);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.a;
            long j3 = ((q96) dd4Var.j(ur9Var)).a.f;
            long j4 = ((q96) dd4Var.j(ur9Var)).a.j;
            boolean zE = dd4Var.e(j2) | dd4Var.e(j3) | dd4Var.e(j4);
            Object objQ = dd4Var.Q();
            if (zE || objQ == vl1.a) {
                ti6 ti6Var = new ti6(1, j2, j3, j4);
                dd4Var.p0(ti6Var);
                objQ = ti6Var;
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 12);
        }
    }
}
