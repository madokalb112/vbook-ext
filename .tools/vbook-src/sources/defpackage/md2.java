package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class md2 {
    public static Method I;
    public static Method J;
    public static boolean K;
    public static final di1 e;
    public static final rj1 g;
    public static final rj1 h;
    public static final rj1 j;
    public static final rj1 l;
    public static final rj1 m;
    public static final rj1 o;
    public static final rj1 q;
    public static final rj1 u;
    public static final rj1 v;
    public static final rj1 x;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final rj1 f = new rj1(new bk1(5), false, -708279179);
    public static final rj1 i = new rj1(new dk1(15), false, 1247030327);
    public static final rj1 k = new rj1(new dk1(16), false, 265981600);
    public static final rj1 n = new rj1(new ck1(20), false, 730804351);
    public static final rj1 p = new rj1(new ck1(21), false, -157233186);
    public static final rj1 r = new rj1(new ck1(22), false, -1045270723);
    public static final rj1 s = new rj1(new hk1(25), false, -1311972741);
    public static final rj1 t = new rj1(new hk1(26), false, -1708943976);
    public static final rj1 w = new rj1(new lk1(4), false, 1089886705);
    public static final yb5 y = new yb5(Float.MAX_VALUE, Float.MIN_VALUE, (Object) null);
    public static final StackTraceElement[] z = new StackTraceElement[0];
    public static final rt8 A = new rt8(new st8(25), new tt8(24));
    public static final rt8 B = new rt8(new st8(26), new tt8(25));
    public static final rt8 C = new rt8(new st8(27), new tt8(26));
    public static final rt8 D = new rt8(new st8(28), new tt8(27));
    public static final rt8 E = new rt8(new st8(29), new tt8(28));
    public static final int[] F = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final byte[] G = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] H = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    static {
        int i2 = 2;
        e = new di1(i2);
        int i3 = 17;
        g = new rj1(new ak1(i3), false, 1933057964);
        int i4 = 18;
        h = new rj1(new ak1(i4), false, -156134813);
        j = new rj1(new ck1(i4), false, 886427319);
        int i5 = 19;
        l = new rj1(new ck1(i5), false, 1618841888);
        m = new rj1(new dk1(i3), false, -622055937);
        o = new rj1(new dk1(i4), false, -1510093474);
        q = new rj1(new dk1(i5), false, 1896836285);
        u = new rj1(new jk1(i2), false, 931361428);
        int i6 = 24;
        v = new rj1(new kk1(i6), false, 2089456749);
        x = new rj1(new mk1(i6), false, -622028958);
    }

    public static final ou6 A(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new m43(kb4Var));
    }

    public static final ou6 B(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new u43(kb4Var));
    }

    public static final ou6 C(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new v43(kb4Var));
    }

    public static void D(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            gc.m(canvas, z2);
            return;
        }
        if (!K) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    I = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    J = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    I = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    J = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = I;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = J;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            K = true;
        }
        if (z2) {
            try {
                Method method4 = I;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = J) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static ch0 a(ky4 ky4Var, int i2) {
        ch0 ch0Var = new ch0(ky4Var, (((long) ((ng) ky4Var).a.getHeight()) & 4294967295L) | (((long) ((ng) ky4Var).a.getWidth()) << 32));
        ch0Var.t = i2;
        return ch0Var;
    }

    public static final void b(no1 no1Var, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        no1 no1Var2;
        kb4 kb4Var6;
        kb4 kb4Var7;
        kb4 kb4Var8;
        kb4 kb4Var9;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1774051774);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(no1Var) ? 4 : 2) | i2;
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
            i3 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i4 = i3 | 14155776;
        if ((100663296 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if (dd4Var2.V(i5 & 1, (i5 & 38347923) != 38347922)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new vd1(23);
                dd4Var2.p0(objQ);
            }
            kb4 kb4Var10 = (kb4) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new ss6(25);
                dd4Var2.p0(objQ2);
            }
            kb4 kb4Var11 = (kb4) objQ2;
            ou6 ou6VarQ = kc5.Q(yib.B(ou6Var, 6).e(tg9.c), kc5.J(dd4Var2), 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
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
            nha.c(wn9.K((pv9) ru9.h.getValue(), dd4Var2), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
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
            ou6 ou6VarW2 = t96.w(lu6Var, s00.p(dd4Var).a);
            long jG = dd1.g(s00.o(dd4Var), 1.0f);
            lp4 lp4Var = jf0.G;
            e11.t(wn9.K((pv9) ru9.k.getValue(), dd4Var), wm9.r((hv9) rv.j.getValue(), dd4Var), no1Var.b, gjb.l0(fe.L(ou6VarW2, jG, lp4Var), 16.0f), kb4Var, dd4Var, (i5 << 3) & 57344);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            e11.t(wn9.K((pv9) ru9.d.getValue(), dd4Var), wm9.r((hv9) rv.g.getValue(), dd4Var), no1Var.a, tw2.g(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), kb4Var2, dd4Var, i5 & 57344);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            e11.t(wn9.K((pv9) ru9.j.getValue(), dd4Var), wm9.r((hv9) rv.i.getValue(), dd4Var), no1Var.c, tw2.g(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f), kb4Var3, dd4Var, (i5 >> 3) & 57344);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            nha.c(wn9.K((pv9) ru9.i.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW3 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW3);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            dd4Var.f0(636592267);
            ou6 ou6VarG = tw2.g(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f);
            String strK = wn9.K((pv9) ru9.e.getValue(), dd4Var);
            List listR = wm9.r((hv9) rv.h.getValue(), dd4Var);
            no1Var2 = no1Var;
            int i6 = no1Var2.d;
            boolean z2 = (i5 & 3670016) == 1048576;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                kb4Var8 = kb4Var10;
                objQ3 = new mj(3, kb4Var8);
                dd4Var.p0(objQ3);
            } else {
                kb4Var8 = kb4Var10;
            }
            e11.t(strK, listR, i6, ou6VarG, (kb4) objQ3, dd4Var, 0);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            dd4Var.q(false);
            dd4Var.f0(637291999);
            ou6 ou6VarG2 = tw2.g(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var, 16.0f);
            boolean z3 = no1Var2.e;
            String strK2 = wn9.K((pv9) ru9.b.getValue(), dd4Var);
            String strK3 = wn9.K((pv9) ru9.c.getValue(), dd4Var);
            boolean z4 = (i5 & 29360128) == 8388608;
            Object objQ4 = dd4Var.Q();
            if (z4 || objQ4 == obj) {
                kb4Var9 = kb4Var11;
                objQ4 = new mj(4, kb4Var9);
                dd4Var.p0(objQ4);
            } else {
                kb4Var9 = kb4Var11;
            }
            e11.x(null, strK2, strK3, ou6VarG2, false, z3, (kb4) objQ4, dd4Var, 0, 17);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            dd4Var2.q(false);
            e11.v(null, wn9.K((pv9) ru9.l.getValue(), dd4Var2), wn9.K((pv9) ru9.m.getValue(), dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var, dd4Var2, (i5 >> 12) & 57344, 1);
            dd4Var2.q(true);
            un9.a(dd4Var2, yib.B(lu6Var, 14));
            dd4Var2.q(true);
            kb4Var6 = kb4Var8;
            kb4Var7 = kb4Var9;
        } else {
            no1Var2 = no1Var;
            dd4Var2.Y();
            kb4Var6 = kb4Var4;
            kb4Var7 = kb4Var5;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(no1Var2, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var6, kb4Var7, ib4Var, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b0(kb4 kb4Var) {
        di1 di1Var = e;
        try {
            lw2.a(bx1.J(kb4Var instanceof vc0 ? ((vc0) kb4Var).create(di1Var) : new mc5(kb4Var)), heb.a);
        } catch (Throwable th) {
            vo1.Q(di1Var, th);
            throw null;
        }
    }

    public static final void c(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(580636753);
        int i3 = 2;
        int i4 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            mo1 mo1Var = (mo1) ((qtb) qx1.N(ug8.a(mo1.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.M.getValue(), dd4Var), tg9.c, false, jf0.G(1355482573, new q41(t27Var, 7), dd4Var), null, jf0.G(-594494181, new ak0(i3, mo1Var, t27Var, bx1.B(mo1Var.d, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 8, t27Var);
        }
    }

    public static final String c0(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void d(final wga wgaVar, final bp bpVar, final kb4 kb4Var, final int i2, final int i3, final x83 x83Var, final int i4, final boolean z2, final boolean z3, final ww8 ww8Var, dd4 dd4Var, final int i5) {
        Object j47Var;
        z44 z44Var;
        fu6 fu6Var;
        boolean z4;
        kd kdVar;
        yb4 yb4Var;
        yb4 yb4Var2;
        yb4 yb4Var3;
        jm jmVar;
        z44 z44Var2;
        dd4 dd4Var2;
        long j2;
        x83 x83Var2;
        ib4 ib4Var;
        dd4 dd4Var3 = dd4Var;
        lp4 lp4Var = jf0.G;
        dd4Var3.h0(-1348332882);
        int i6 = i5 | (dd4Var3.f(wgaVar) ? 4 : 2) | (dd4Var3.f(bpVar) ? 32 : 16) | (dd4Var3.h(kb4Var) ? 256 : Token.CASE) | (dd4Var3.d(i2) ? 2048 : 1024) | (dd4Var3.d(i3) ? 16384 : 8192) | (dd4Var3.f(x83Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var3.d(i4) ? 1048576 : 524288) | (dd4Var3.g(z2) ? 8388608 : 4194304) | (dd4Var3.g(z3) ? 67108864 : 33554432) | (dd4Var3.f(ww8Var) ? 536870912 : 268435456);
        if (dd4Var3.V(i6 & 1, (306783379 & i6) != 306783378)) {
            final ww8 ww8VarJ = kc5.J(dd4Var3);
            Object objQ = dd4Var3.Q();
            fu6 fu6Var2 = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var2) {
                vx1 vx1VarZ = lc5.Z(dd4Var3);
                dd4Var3.p0(vx1VarZ);
                obj = vx1VarZ;
            }
            vx1 vx1Var = (vx1) obj;
            Object objQ2 = dd4Var3.Q();
            Object objF = objQ2;
            if (objQ2 == fu6Var2) {
                objF = ky0.f(dd4Var3);
            }
            z44 z44Var3 = (z44) objF;
            long jX = wn9.x(i4);
            final long jH = wn9.H(i4 * 1.5f, 4294967296L);
            pn2 pn2Var = (pn2) dd4Var3.j(xm1.h);
            WeakHashMap weakHashMap = pzb.w;
            boolean z5 = ju7.i(dd4Var3).c.e().d > 0;
            Integer numValueOf = Integer.valueOf(i3);
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zG = dd4Var3.g(z5) | ((i6 & 3670016) == 1048576) | dd4Var3.f(pn2Var) | ((i6 & 57344) == 16384) | dd4Var3.h(vx1Var) | ((i6 & 1879048192) == 536870912);
            Object objQ3 = dd4Var3.Q();
            if (zG || objQ3 == fu6Var2) {
                z44Var = z44Var3;
                fu6Var = fu6Var2;
                z4 = false;
                j47Var = new j47(z5, i4, pn2Var, i3, vx1Var, ww8Var, null);
                dd4Var3.p0(j47Var);
            } else {
                j47Var = objQ3;
                z44Var = z44Var3;
                fu6Var = fu6Var2;
                z4 = false;
            }
            lc5.v(numValueOf, boolValueOf, (yb4) j47Var, dd4Var3);
            Object objQ4 = dd4Var3.Q();
            Object obj2 = objQ4;
            if (objQ4 == fu6Var) {
                am3 am3Var = new am3(z44Var, null, 7);
                dd4Var3.p0(am3Var);
                obj2 = am3Var;
            }
            lc5.u((yb4) obj2, dd4Var3, heb.a);
            px3 px3Var = tg9.c;
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var3, z4 ? 1 : 0);
            int iHashCode = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL = dd4Var3.l();
            ou6 ou6VarL0 = s32.L0(dd4Var3, px3Var);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var2);
            } else {
                dd4Var3.s0();
            }
            yb4 yb4Var4 = ll1.f;
            un9.s(yb4Var4, dd4Var3, eq8VarA);
            yb4 yb4Var5 = ll1.e;
            un9.s(yb4Var5, dd4Var3, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var3, numValueOf2);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var3, kdVar2);
            yb4 yb4Var6 = ll1.d;
            un9.s(yb4Var6, dd4Var3, ou6VarL0);
            if (z2) {
                dd4Var3.f0(2055328035);
                long jL = ah1.l(x83Var.i);
                ou6 ou6VarP0 = gjb.p0(fe.L(tg9.c(jv3.O(lu6.a, fc5.a), 1.0f), ah1.l(x83Var.i), lp4Var), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                kdVar = kdVar2;
                yb4Var = yb4Var6;
                j2 = jX;
                rj1 rj1VarG = jf0.G(192481876, new g16(ww8Var, ww8VarJ, i2, x83Var, jX, jH), dd4Var3);
                jmVar = jmVar2;
                yb4Var3 = yb4Var5;
                yb4Var2 = yb4Var4;
                x83Var2 = x83Var;
                z44Var2 = z44Var;
                ib4Var = ib4Var2;
                j1a.a(ou6VarP0, (t89) null, jL, 0L, 0.0f, 0.0f, (wm0) null, rj1VarG, dd4Var3, 12582912, Token.FUNCTION);
                dd4Var2 = dd4Var3;
                z4 = false;
                dd4Var2.q(false);
            } else {
                kdVar = kdVar2;
                yb4Var = yb4Var6;
                yb4Var2 = yb4Var4;
                yb4Var3 = yb4Var5;
                jmVar = jmVar2;
                z44Var2 = z44Var;
                dd4Var2 = dd4Var3;
                j2 = jX;
                x83Var2 = x83Var;
                ib4Var = ib4Var2;
                dd4Var2.f0(2056526712);
                dd4Var2.q(z4);
            }
            ou6 ou6VarP02 = gjb.p0(fe.L(tg9.c(new bp5(1.0f, true), 1.0f), ah1.l(x83Var2.c), lp4Var), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            ha6 ha6VarD = pn0.d(bv4.b, z4);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var2, dd4Var2, ha6VarD);
            un9.s(yb4Var3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL02);
            p58 p58VarA = dka.a.a(new cka(ah1.l(x83Var2.j.a), lc1.c(0.4f, ah1.l(4282210944L))));
            final x83 x83Var3 = x83Var2;
            final z44 z44Var4 = z44Var2;
            final long j3 = j2;
            dd4Var3 = dd4Var;
            jv3.e(p58VarA, jf0.G(720557252, new yb4() { // from class: g47
                @Override // defpackage.yb4
                public final Object invoke(Object obj3, Object obj4) {
                    dd4 dd4Var4 = (dd4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (dd4Var4.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j4 = lc1.i;
                        final long j5 = j3;
                        ae4 ae4Var = c64.c;
                        final long j6 = jH;
                        uka ukaVar = new uka(j4, j5, (a84) null, (u74) null, ae4Var, 0L, 0L, 0, j6, (dha) null, (iy5) null, 16646108);
                        final x83 x83Var4 = x83Var3;
                        xk9 xk9Var = new xk9(ah1.l(x83Var4.j.a));
                        ou6 ou6VarB = jv3.B(gjb.n0(kc5.A(kc5.Q(tg9.c, ww8Var, 14), ww8VarJ, 14), 4.0f, 0.0f, 2), z44Var4);
                        final wga wgaVar2 = wgaVar;
                        final boolean z6 = z3;
                        final bp bpVar2 = bpVar;
                        te0.a(wgaVar2, kb4Var, ou6VarB, false, z6, ukaVar, (qj5) null, (nj5) null, false, 0, 0, (yub) null, (kb4) null, (yy6) null, xk9Var, jf0.G(-1120108825, new zb4() { // from class: i47
                            @Override // defpackage.zb4
                            public final Object c(Object obj5, Object obj6, Object obj7) {
                                yb4 yb4Var7;
                                yb4 yb4Var8;
                                kd kdVar3;
                                jm jmVar3;
                                ou6 ou6Var;
                                ib4 ib4Var3;
                                yb4 yb4Var9;
                                yb4 yb4Var10;
                                boolean z7;
                                f9 f9Var;
                                dd4 dd4Var5;
                                yb4 yb4Var11 = (yb4) obj5;
                                dd4 dd4Var6 = (dd4) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                yb4Var11.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= dd4Var6.h(yb4Var11) ? 4 : 2;
                                }
                                int i7 = iIntValue2;
                                if (dd4Var6.V(i7 & 1, (i7 & 19) != 18)) {
                                    f9 f9Var2 = bv4.b;
                                    ha6 ha6VarD2 = pn0.d(f9Var2, false);
                                    int iHashCode3 = Long.hashCode(dd4Var6.T);
                                    lr7 lr7VarL3 = dd4Var6.l();
                                    ou6 ou6Var2 = lu6.a;
                                    ou6 ou6VarL03 = s32.L0(dd4Var6, ou6Var2);
                                    ml1.k.getClass();
                                    ib4 ib4Var4 = ll1.b;
                                    dd4Var6.j0();
                                    if (dd4Var6.S) {
                                        dd4Var6.k(ib4Var4);
                                    } else {
                                        dd4Var6.s0();
                                    }
                                    yb4 yb4Var12 = ll1.f;
                                    un9.s(yb4Var12, dd4Var6, ha6VarD2);
                                    yb4 yb4Var13 = ll1.e;
                                    un9.s(yb4Var13, dd4Var6, lr7VarL3);
                                    Integer numValueOf3 = Integer.valueOf(iHashCode3);
                                    jm jmVar4 = ll1.g;
                                    un9.s(jmVar4, dd4Var6, numValueOf3);
                                    kd kdVar4 = ll1.h;
                                    un9.r(dd4Var6, kdVar4);
                                    yb4 yb4Var14 = ll1.d;
                                    un9.s(yb4Var14, dd4Var6, ou6VarL03);
                                    int length = wgaVar2.a.b.length();
                                    long j7 = j5;
                                    long j8 = j6;
                                    ae4 ae4Var2 = c64.c;
                                    if (length == 0) {
                                        dd4Var6.f0(-450454979);
                                        yb4Var8 = yb4Var13;
                                        yb4Var7 = yb4Var11;
                                        jmVar3 = jmVar4;
                                        yb4Var10 = yb4Var14;
                                        kdVar3 = kdVar4;
                                        ou6Var = ou6Var2;
                                        ib4Var3 = ib4Var4;
                                        yb4Var9 = yb4Var12;
                                        z7 = false;
                                        f9Var = f9Var2;
                                        nha.c(z6 ? "" : "Start typing...", (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, new uka(ah1.l(x83Var4.g), j7, (a84) null, (u74) null, ae4Var2, 0L, 0L, 0, j8, (dha) null, (iy5) null, 16646108), dd4Var6, 0, 0, 131070);
                                        dd4Var5 = dd4Var6;
                                        dd4Var5.q(false);
                                    } else {
                                        yb4Var7 = yb4Var11;
                                        yb4Var8 = yb4Var13;
                                        kdVar3 = kdVar4;
                                        jmVar3 = jmVar4;
                                        ou6Var = ou6Var2;
                                        ib4Var3 = ib4Var4;
                                        yb4Var9 = yb4Var12;
                                        yb4Var10 = yb4Var14;
                                        z7 = false;
                                        dd4Var6.f0(-449872861);
                                        f9Var = f9Var2;
                                        nha.d(bpVar2, (ou6) null, 0L, 0L, 0L, (vaa) null, 0L, 0, false, Integer.MAX_VALUE, 0, (Map) null, (kb4) null, new uka(0L, j7, (a84) null, (u74) null, ae4Var2, 0L, 0L, 0, j8, (dha) null, (iy5) null, 16646109), dd4Var6, 0, 27648, 237566);
                                        dd4Var5 = dd4Var6;
                                        dd4Var5.q(false);
                                    }
                                    ou6 ou6VarI = yb0.I(ou6Var, 1.0f);
                                    ha6 ha6VarD3 = pn0.d(f9Var, z7);
                                    int iHashCode4 = Long.hashCode(dd4Var5.T);
                                    lr7 lr7VarL4 = dd4Var5.l();
                                    ou6 ou6VarL04 = s32.L0(dd4Var5, ou6VarI);
                                    dd4Var5.j0();
                                    if (dd4Var5.S) {
                                        dd4Var5.k(ib4Var3);
                                    } else {
                                        dd4Var5.s0();
                                    }
                                    un9.s(yb4Var9, dd4Var5, ha6VarD3);
                                    un9.s(yb4Var8, dd4Var5, lr7VarL4);
                                    ky0.v(iHashCode4, dd4Var5, jmVar3, dd4Var5, kdVar3);
                                    un9.s(yb4Var10, dd4Var5, ou6VarL04);
                                    xv5.w(i7 & 14, yb4Var7, dd4Var5, true, true);
                                } else {
                                    dd4Var6.Y();
                                }
                                return heb.a;
                            }
                        }, dd4Var4), dd4Var4, 0, 196608, 16328);
                    } else {
                        dd4Var4.Y();
                    }
                    return heb.a;
                }
            }, dd4Var3), dd4Var3, 56);
            dd4Var3.q(true);
            dd4Var3.q(true);
        } else {
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(wgaVar, bpVar, kb4Var, i2, i3, x83Var, i4, z2, z3, ww8Var, i5) { // from class: h47
                public final /* synthetic */ wga a;
                public final /* synthetic */ bp b;
                public final /* synthetic */ kb4 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ x83 f;
                public final /* synthetic */ int s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ ww8 v;

                @Override // defpackage.yb4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iX0 = qu1.x0(1);
                    md2.d(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, (dd4) obj3, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final boolean d0(d29 d29Var) {
        Object objG = d29Var.d.a.g(j29.K);
        if (objG == null) {
            objG = null;
        }
        dwa dwaVar = (dwa) objG;
        tz6 tz6Var = d29Var.d.a;
        Object objG2 = tz6Var.g(j29.z);
        if (objG2 == null) {
            objG2 = null;
        }
        uo8 uo8Var = (uo8) objG2;
        boolean z2 = dwaVar != null;
        Object objG3 = tz6Var.g(j29.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (uo8Var != null && uo8Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final void e(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1047718606);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
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
            lu6 lu6Var = lu6.a;
            ah1.r(tg9.n(lu6Var, 30.0f), tp8.a, dd4Var, 6, 0);
            ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 6.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarN0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ah1.r(tg9.o(lu6Var, 100.0f, 16.0f), ((q96) dd4Var.j(s96.a)).c.a, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            rj1Var.invoke(dd4Var, 6);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var, i2, 3);
        }
    }

    public static final String e0(d29 d29Var, Resources resources) {
        w19 w19Var = d29Var.d;
        w19 w19Var2 = d29Var.d;
        Object objG = w19Var.a.g(j29.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        tz6 tz6Var = w19Var2.a;
        Object objG2 = tz6Var.g(j29.K);
        if (objG2 == null) {
            objG2 = null;
        }
        dwa dwaVar = (dwa) objG2;
        Object objG3 = tz6Var.g(j29.z);
        if (objG3 == null) {
            objG3 = null;
        }
        uo8 uo8Var = (uo8) objG3;
        if (dwaVar != null) {
            int iOrdinal = dwaVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        mn5.g();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(2131951825);
                    }
                } else if (uo8Var != null && uo8Var.a == 2 && objG == null) {
                    objG = resources.getString(2131952039);
                }
            } else if (uo8Var != null && uo8Var.a == 2 && objG == null) {
                objG = resources.getString(2131952040);
            }
        }
        Object objG4 = tz6Var.g(j29.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((uo8Var == null || uo8Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2131952034) : resources.getString(2131952013);
            }
        }
        Object objG5 = tz6Var.g(j29.c);
        if (objG5 == null) {
            objG5 = null;
        }
        x38 x38Var = (x38) objG5;
        if (x38Var != null) {
            if (x38Var != x38.d) {
                if (objG == null) {
                    bb1 bb1Var = x38Var.b;
                    float f2 = bb1Var.b;
                    float f3 = bb1Var.a;
                    float f4 = f2 - f3 == 0.0f ? 0.0f : (x38Var.a - f3) / (bb1Var.b - f3);
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1.0f) {
                        f4 = 1.0f;
                    }
                    objG = resources.getString(2131952045, Integer.valueOf(f4 == 0.0f ? 0 : f4 == 1.0f ? 100 : wx1.Q(Math.round(f4 * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(2131951824);
            }
        }
        m29 m29Var = j29.G;
        if (tz6Var.c(m29Var)) {
            tz6 tz6Var2 = new d29(d29Var.a, true, d29Var.c, w19Var2).k().a;
            Object objG6 = tz6Var2.g(j29.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = tz6Var2.g(j29.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = tz6Var2.g(m29Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(2131952038);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final void f(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(219609586);
        int i3 = i2 | (dd4Var.f(ou6Var) ? 4 : 2);
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            px3 px3Var = tg9.c;
            ou6 ou6VarE = ou6Var.e(px3Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6VarD);
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
            ou6 ou6VarE2 = yib.E(tg9.f(lu6Var, 1.0f), 14).e(px3Var);
            rj7 rj7VarQ = gjb.q(0.0f, 0.0f, 0.0f, 72.0f, 7);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new rv5(25);
                dd4Var.p0(objQ);
            }
            rw1.j(ou6VarE2, null, rj7VarQ, true, null, null, null, false, null, (kb4) objQ, dd4Var, 817892736, 370);
            ou6 ou6VarE3 = yib.E(gjb.m0(tg9.f(zn0.a.a(lu6Var, bv4.u), 1.0f), 12.0f, 10.0f), 14);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(y86.d0(ou6VarE3, 10.0f, rp8Var, 28), rp8Var);
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fw.G(fe.L(ou6VarW, lc1.c(0.98f, ((q96) dd4Var.j(ur9Var)).a.p), jf0.G), 1.0f, lc1.c(0.08f, ((q96) dd4Var.j(ur9Var)).a.a), rp8Var), 12.0f, 10.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarM0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ah1.r(tg9.n(lu6Var, 34.0f), rp8Var, dd4Var, 6, 0);
            ah1.r(tg9.h(j39.f(lu6Var, 10.0f, dd4Var, 1.0f, true), 42.0f), rp8Var, dd4Var, 0, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 10.0f));
            ah1.r(tg9.n(lu6Var, 40.0f), rp8Var, dd4Var, 6, 0);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 11);
        }
    }

    public static final bp f0(d29 d29Var) {
        Object objG = d29Var.d.a.g(j29.G);
        if (objG == null) {
            objG = null;
        }
        bp bpVar = (bp) objG;
        Object objG2 = d29Var.d.a.g(j29.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return bpVar == null ? list != null ? (bp) fc1.z0(list) : null : bpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x04d8 A[EDGE_INSN: B:362:0x04d8->B:254:0x04d8 BREAK  A[LOOP:8: B:227:0x046e->B:371:0x046e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.hb1 r47, defpackage.w83 r48, ou6 r49, dd4 r50, int r51) {
        /*
            Method dump skipped, instruction units count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.g(hb1, w83, ou6, dd4, int):void");
    }

    public static Object g0(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y3.g(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final void h(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(-435466793);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                l(wn9.K((pv9) mu9.G.getValue(), dd4Var), (gja) ((qtb) qx1.N(ug8.a(gja.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null)), t27Var, dd4Var, (i3 << 6) & 896);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 14, t27Var);
        }
    }

    public static final void i(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(759422694);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                l(wn9.K((pv9) mu9.I.getValue(), dd4Var), (hja) ((qtb) qx1.N(ug8.a(hja.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null)), t27Var, dd4Var, (i3 << 6) & 896);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 13, t27Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i0(java.lang.String r3, wx2 r4) {
        /*
            r3.getClass()
            r4.getClass()
            int r4 = r4.ordinal()
            r0 = 0
            java.lang.String r1 = "_"
            if (r4 == 0) goto L29
            r2 = 1
            if (r4 != r2) goto L25
            boolean r4 = m0(r3)
            if (r4 != 0) goto L3d
            yg8 r4 = i00.e
            java.lang.String r3 = r4.g(r3, r1)
            boolean r4 = m0(r3)
            if (r4 == 0) goto L3c
            return r3
        L25:
            defpackage.mn5.g()
            return r0
        L29:
            boolean r4 = l0(r3)
            if (r4 != 0) goto L3d
            yg8 r4 = i00.f
            java.lang.String r3 = r4.g(r3, r1)
            boolean r4 = l0(r3)
            if (r4 == 0) goto L3c
            return r3
        L3c:
            return r0
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.i0(java.lang.String, wx2):java.lang.String");
    }

    public static final void j(String str, t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1327290791);
        int i3 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ho4(str, 16);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            l(wn9.K((pv9) mu9.H.getValue(), dd4Var), (lja) ((qtb) qx1.N(ug8.a(lja.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var)), t27Var, dd4Var, (i3 << 3) & 896);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, 13);
        }
    }

    public static void j0(String str, String str2, a93 a93Var, xx2 xx2Var) {
        int i2;
        a93Var.getClass();
        a93Var.b(str);
        if (xx2Var.g == wx2.a) {
            if (str2 == null) {
                return;
            }
            if (str2.length() == 0 || str2.equalsIgnoreCase(str)) {
                String[] strArr = i00.d;
                int i3 = 0;
                int i4 = 29;
                while (true) {
                    if (i3 > i4) {
                        i2 = -(i3 + 1);
                        break;
                    }
                    i2 = (i3 + i4) >>> 1;
                    String str3 = strArr[i2];
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int iCompareTo = str3.compareTo(lowerCase);
                    if (iCompareTo >= 0) {
                        if (iCompareTo <= 0) {
                            break;
                        } else {
                            i4 = i2 - 1;
                        }
                    } else {
                        i3 = i2 + 1;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
        }
        a93Var.b("=\"");
        char[] cArr = ee3.a;
        if (str2 == null) {
            str2 = "";
        }
        ee3.c(a93Var, str2, xx2Var, 2);
        a93Var.a('\"');
    }

    public static final void k(String str, t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1789849208);
        int i3 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ho4(str, 17);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            l(wn9.K((pv9) mu9.J.getValue(), dd4Var), (nja) ((qtb) qx1.N(ug8.a(nja.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var)), t27Var, dd4Var, (i3 << 3) & 896);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, 14);
        }
    }

    public static boolean k0(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (F[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final void l(String str, ma8 ma8Var, t27 t27Var, dd4 dd4Var, int i2) {
        String str2;
        int i3;
        int i4;
        dd4Var.h0(325513791);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (dd4Var.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ma8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(t27Var) ? 256 : Token.CASE;
        }
        int i6 = i3;
        if (dd4Var.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
            a07 a07VarB = bx1.B((dr9) ma8Var.c.getValue(), dd4Var);
            Object[] objArr = new Object[0];
            rt8 rt8Var = q83.e;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uj6(i5);
                dd4Var.p0(objQ);
            }
            q83 q83Var = (q83) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (objQ2 == obj) {
                objQ2 = dk9.x((Object) null);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            ms7 ms7Var = new ms7(gc1.Y("txt"));
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new aq9(a07Var, 28);
                dd4Var.p0(objQ3);
            }
            aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ3, dd4Var, 56);
            Object[] objArr2 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new i5a(29);
                dd4Var.p0(objQ4);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ4, dd4Var, 48);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = ma8Var.d;
            boolean zF = dd4Var.f(m8Var);
            Object objQ5 = dd4Var.Q();
            if (zF || objQ5 == obj) {
                objQ5 = new xa(m8Var, jt1Var, 22);
                dd4Var.p0(objQ5);
            }
            wx1.e(pp1Var, null, (zb4) objQ5, dd4Var, 0);
            gx1.p(str2, tg9.c, false, jf0.G(420913851, new oe9(t27Var, 12), dd4Var), jf0.G(1033005668, new pda(0, (Object) a07Var2, (Object) ma8Var, (Object) aw3VarC0), dd4Var), jf0.G(1657129865, new ak0(16, q83Var, ma8Var, a07VarB), dd4Var), dd4Var, (i6 & 14) | 224304, 4);
            int i7 = i6 & Token.ASSIGN_MOD;
            boolean z2 = i7 == 32;
            Object objQ6 = dd4Var.Q();
            if (z2 || objQ6 == obj) {
                objQ6 = new w27(ma8Var, 19);
                dd4Var.p0(objQ6);
            }
            pu1.s(q83Var, (yb4) objQ6, dd4Var, 0);
            boolean z3 = ((bi5) a07Var.getValue()) != null;
            bi5 bi5Var = (bi5) a07Var.getValue();
            String name = bi5Var != null ? bi5Var.getName() : null;
            if (name == null) {
                name = "";
            }
            String str3 = name;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj) {
                i4 = 0;
                objQ7 = new qda(a07Var, i4);
                dd4Var.p0(objQ7);
            } else {
                i4 = 0;
            }
            kb4 kb4Var = (kb4) objQ7;
            int i8 = i7 != 32 ? i4 : 1;
            Object objQ8 = dd4Var.Q();
            if (i8 != 0 || objQ8 == obj) {
                objQ8 = new k49(a07Var, ma8Var, 10);
                dd4Var.p0(objQ8);
            }
            ex1.f(z3, str3, null, kb4Var, (kb4) objQ8, dd4Var, 3072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(str, ma8Var, t27Var, i2, 20);
        }
    }

    public static boolean l0(String str) {
        int length = str.length();
        if (length != 0) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt > 31 && ((127 > cCharAt || cCharAt >= 160) && cCharAt != ' ' && cCharAt != '\"' && cCharAt != '\'' && cCharAt != '/' && cCharAt != '=')) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void m(List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        boolean z2;
        Object obj;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1202179352);
        int i3 = (i2 & 6) == 0 ? (dd4Var2.h(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 16384 : 8192;
        }
        int i4 = 0;
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = new nda(i4);
                dd4Var2.p0(objQ);
            }
            a07 a07VarA0 = ww1.a0(objArr, (ib4) objQ, dd4Var2, 384);
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
            szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var2, 14)), gjb.q(0.0f, 0.0f, 0.0f, 80.0f, 7));
            boolean zF = dd4Var2.f(((wga) a07VarA0.getValue()).a.b) | dd4Var2.f(list);
            Object objQ2 = dd4Var2.Q();
            if (zF || objQ2 == obj2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    da8 da8Var = (da8) obj3;
                    if (bw9.O(da8Var.c, ((wga) a07VarA0.getValue()).a.b, true) || bw9.O(da8Var.d, ((wga) a07VarA0.getValue()).a.b, true)) {
                        arrayList.add(obj3);
                    }
                }
                z2 = true;
                dd4Var2.p0(arrayList);
                obj = arrayList;
            } else {
                z2 = true;
                obj = objQ2;
            }
            List list2 = (List) obj;
            boolean z3 = z2;
            yh4 yh4Var = new yh4(320.0f);
            int i5 = i3;
            szb szbVarW2 = yib.w(yib.m(szbVarW, 0.0f, 68.0f, 0.0f, 0.0f, dd4Var2, 384, 13), gjb.q(16.0f, 0.0f, 16.0f, 0.0f, 10));
            pj7 pj7VarM = yib.m(szbVarW, 0.0f, 68.0f, 4.0f, 0.0f, dd4Var, 3456, 9);
            mv mvVar = new mv(4.0f, z3, new gp(5));
            mv mvVar2 = new mv(8.0f, z3, new gp(5));
            boolean zH = dd4Var.h(list2) | ((i5 & 7168) == 2048 ? z3 : false) | ((57344 & i5) == 16384 ? z3 : false);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == obj2) {
                objQ3 = new q54(list2, kb4Var, kb4Var2, 2);
                dd4Var.p0(objQ3);
            }
            gx1.i(yh4Var, ou6Var, null, szbVarW2, mvVar, mvVar2, null, false, 0L, 0L, pj7VarM, 0.0f, (kb4) objQ3, dd4Var, ((i5 >> 3) & Token.ASSIGN_MOD) | 1769472, 0, 6036);
            wga wgaVar = (wga) a07VarA0.getValue();
            String strK = wn9.K((pv9) mu9.h0.getValue(), dd4Var);
            long jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
            ou6 ou6VarB = yib.B(gjb.m0(gjb.k0(lu6.a, pj7Var), 16.0f, 12.0f), 6);
            boolean zF2 = dd4Var.f(a07VarA0);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj2) {
                objQ4 = new aq9(a07VarA0, 29);
                dd4Var.p0(objQ4);
            }
            e11.A(wgaVar, strK, 0L, jG, null, null, ou6VarB, (kb4) objQ4, null, dd4Var, 0, 308);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t7a(list, pj7Var, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static boolean m0(String str) {
        char cCharAt;
        int length = str.length();
        if (length != 0 && (('a' <= (cCharAt = str.charAt(0)) && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == '_' || cCharAt == ':'))) {
            for (int i2 = 1; i2 < length; i2++) {
                char cCharAt2 = str.charAt(i2);
                if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void n(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(847416451);
        int i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarL0 = gjb.l0(ou6Var, 24.0f);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.I.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.f.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 21) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 12);
        }
    }

    public static final ou6 n0(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new h44(kb4Var));
    }

    public static final void o(boolean z2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        dd4Var.h0(-881596963);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(ib4Var2) ? 256 : Token.CASE) | (dd4Var.h(ib4Var3) ? 2048 : 1024) | (dd4Var.h(ib4Var4) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            gx1.a(z2, null, 0L, null, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var, jf0.G(668639825, new sp2(ib4Var3, ib4Var2, ib4Var4, 5), dd4Var), dd4Var, (i3 & 14) | 12779520 | ((i3 << 15) & 3670016), 30);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp2(z2, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2, 2);
        }
    }

    public static final boolean p(d29 d29Var) {
        w19 w19VarK = d29Var.k();
        return !w19VarK.a.c(j29.j);
    }

    public static final boolean q(d29 d29Var, Resources resources) {
        Object objG = d29Var.d.a.g(j29.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !vm7.W(d29Var) && (d29Var.d.c || (d29Var.q() && ((list != null ? (String) fc1.z0(list) : null) != null || f0(d29Var) != null || e0(d29Var, resources) != null || d0(d29Var))));
    }

    public static final String q0(lc1 lc1Var) {
        long j2 = lc1Var.a;
        return j2 == 16 ? "null" : String.valueOf(ah1.X(j2));
    }

    public static final int s(zo zoVar, fo8 fo8Var, on8 on8Var, int i2, cl3 cl3Var) {
        on8Var.getClass();
        int iK = zoVar.k(on8Var.g.d((vn9) on8Var.h.c().invoke(fo8Var.t)));
        try {
            on8Var.f = zk9.h(i2, on8Var.e.length() + i2);
            zoVar.f(on8Var.e);
            on8Var.h.a(zoVar, fo8Var);
            if (!(on8Var.h instanceof rn8)) {
                cl3Var.invoke(on8Var);
            }
            int length = i2 + on8Var.e.length();
            List list = on8Var.b;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                length = s(zoVar, fo8Var, (on8) list.get(i3), length, cl3Var);
            }
            zoVar.h(iK);
            return length;
        } catch (Throwable th) {
            zoVar.h(iK);
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static s95 s0(int i2, ms3 ms3Var, hn7 hn7Var) throws qn7 {
        s95 s95VarB = s95.b(ms3Var, hn7Var);
        while (true) {
            int i3 = s95VarB.a;
            if (i3 == i2) {
                return s95VarB;
            }
            dx1.s(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j2 = s95VarB.b;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw qn7.c("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            ms3Var.r((int) j3);
            s95VarB = s95.b(ms3Var, hn7Var);
        }
    }

    public static final int t(zo zoVar, on8 on8Var, int i2, long j2, yn8 yn8Var) throws Throwable {
        zo zoVar2;
        Throwable th;
        on8Var.getClass();
        yn8Var.getClass();
        int iK = zoVar.k(on8Var.g.d((vn9) on8Var.h.c().invoke(yn8Var)));
        try {
            on8Var.f = zk9.h(i2, on8Var.e.length() + i2);
            int i3 = 0;
            if (!pja.d(j2)) {
                try {
                    if (pja.g(j2) < on8Var.e.length() + i2 && pja.f(j2) > i2) {
                        zoVar.f(on8Var.e.substring(Math.max(0, pja.g(j2) - i2), Math.min(pja.f(j2) - i2, on8Var.e.length())));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zoVar2 = zoVar;
                    zoVar2.h(iK);
                    throw th;
                }
            }
            int length = i2 + on8Var.e.length();
            List list = on8Var.b;
            int size = list.size();
            int iT = length;
            while (i3 < size) {
                zoVar2 = zoVar;
                long j3 = j2;
                yn8 yn8Var2 = yn8Var;
                try {
                    iT = t(zoVar2, (on8) list.get(i3), iT, j3, yn8Var2);
                    i3++;
                    zoVar = zoVar2;
                    j2 = j3;
                    yn8Var = yn8Var2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    zoVar2.h(iK);
                    throw th;
                }
            }
            zoVar.h(iK);
            return iT;
        } catch (Throwable th4) {
            th = th4;
            zoVar2 = zoVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nk9 t0(ms3 ms3Var, boolean z2, boolean z3) {
        nk9 nk9Var;
        int i2;
        long j2;
        int i3;
        long jT;
        int i4;
        int i5;
        long j3;
        int i6;
        boolean z4;
        int[] iArr;
        long length = ms3Var.getLength();
        long j4 = -1;
        int i7 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i7 != 0 && length <= 4096) {
            j5 = length;
        }
        int i8 = (int) j5;
        hn7 hn7Var = new hn7(64);
        int i9 = 0;
        int i10 = 0;
        boolean z5 = false;
        while (i10 < i8) {
            hn7Var.J(8);
            if (!ms3Var.g(hn7Var.a, i9, 8, true)) {
                break;
            }
            long jB = hn7Var.B();
            int iM = hn7Var.m();
            if (jB == 1) {
                j2 = j4;
                ms3Var.w(hn7Var.a, 8, 8);
                i5 = 16;
                hn7Var.L(16);
                i3 = i10;
                jT = hn7Var.t();
                i4 = i7;
            } else {
                j2 = j4;
                if (jB == 0) {
                    long length2 = ms3Var.getLength();
                    if (length2 != j2) {
                        jB = (length2 - ms3Var.h()) + 8;
                    }
                }
                long j6 = jB;
                i3 = i10;
                jT = j6;
                i4 = i7;
                i5 = 8;
            }
            long j7 = i5;
            if (jT < j7) {
                nk9Var = null;
                if (iM != 1718773093 || i5 != 8) {
                    return new a00(iM, i5, jT);
                }
                jT = j7;
            } else {
                nk9Var = null;
            }
            int i11 = i3 + i5;
            if (iM == 1836019574 || iM == 1970628964) {
                i8 += (int) jT;
                if (i4 != 0 && i8 > length) {
                    i8 = (int) length;
                }
                if (iM == 1836019574) {
                    i10 = i11;
                    i7 = i4;
                    j4 = j2;
                    i9 = 0;
                }
            }
            if (iM != 1953653099 && iM != 1835297121 && iM != 1835626086) {
                if (iM != 1836019558 && iM != 1836475768) {
                    if (iM == 1835295092) {
                        z5 = true;
                    }
                    if (iM != 1937007212 || jT <= 1000000) {
                        j3 = length;
                        if ((((long) i11) + jT) - j7 < i8) {
                            int i12 = (int) (jT - j7);
                            i10 = i11 + i12;
                            if (iM != 1718909296) {
                                i6 = 0;
                                if (i12 != 0) {
                                    ms3Var.i(i12);
                                }
                            } else {
                                if (i12 < 8) {
                                    return new a00(iM, 8, i12);
                                }
                                hn7Var.J(i12);
                                i6 = 0;
                                ms3Var.w(hn7Var.a, 0, i12);
                                int iM2 = hn7Var.m();
                                if (k0(iM2, z3)) {
                                    z5 = true;
                                }
                                hn7Var.N(4);
                                int iA = hn7Var.a() / 4;
                                if (!z5 && iA > 0) {
                                    int[] iArr2 = new int[iA];
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= iA) {
                                            z4 = z5;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int iM3 = hn7Var.m();
                                        iArr2[i13] = iM3;
                                        if (k0(iM3, z3)) {
                                            z4 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i13++;
                                    }
                                } else {
                                    z4 = z5;
                                    iArr = nk9Var;
                                }
                                if (!z4) {
                                    return new ii1(iM2, iArr);
                                }
                                z5 = z4;
                            }
                        }
                    }
                    i2 = 0;
                    break;
                }
                i2 = 1;
                break;
            }
            j3 = length;
            i6 = 0;
            i10 = i11;
            i9 = i6;
            i7 = i4;
            j4 = j2;
            length = j3;
        }
        nk9Var = null;
        i2 = i9;
        return !z5 ? ra1.A : z2 != i2 ? i2 != 0 ? a65.c : a65.d : nk9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x010c A[Catch: all -> 0x00c7, TryCatch #3 {all -> 0x00c7, blocks: (B:21:0x009e, B:23:0x00ba, B:26:0x00cc, B:28:0x00fc, B:35:0x0113, B:37:0x011e, B:39:0x0126, B:30:0x0104, B:31:0x0107, B:34:0x010c, B:27:0x00f9), top: B:75:0x009e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int u(defpackage.zo r37, defpackage.fo8 r38, defpackage.on8 r39, java.util.List r40, int r41, java.lang.String r42, long r43, defpackage.cl3 r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.u(zo, fo8, on8, java.util.List, int, java.lang.String, long, cl3):int");
    }

    public static final String u0(jt1 jt1Var) {
        Object pm8Var;
        if (jt1Var instanceof kw2) {
            return ((kw2) jt1Var).toString();
        }
        try {
            pm8Var = jt1Var + '@' + c0(jt1Var);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (qm8.a(pm8Var) != null) {
            pm8Var = jt1Var.getClass().getName() + '@' + c0(jt1Var);
        }
        return (String) pm8Var;
    }

    public static final Object v0(bv0 bv0Var, byte[] bArr, int i2, kt1 kt1Var) {
        bv0Var.f().b0(i2, bArr);
        Object objJ0 = sdc.j0(bv0Var, kt1Var);
        return objJ0 == xx1.a ? objJ0 : heb.a;
    }

    public static boolean w(ms3 ms3Var) {
        hn7 hn7Var = new hn7(8);
        int i2 = s95.b(ms3Var, hn7Var).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        ms3Var.w(hn7Var.a, 0, 4);
        hn7Var.M(0);
        int iM = hn7Var.m();
        if (iM == 1463899717) {
            return true;
        }
        fe.R("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w0(defpackage.bv0 r6, defpackage.jl9 r7, defpackage.kt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.cv0
            if (r0 == 0) goto L13
            r0 = r8
            cv0 r0 = (defpackage.cv0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cv0 r0 = new cv0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            jl9 r6 = r0.b
            bv0 r7 = r0.a
            defpackage.e11.e0(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L36
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r8)
        L36:
            boolean r8 = r7.k()
            if (r8 != 0) goto L58
            bg9 r8 = r6.f()
            wq0 r1 = r7.b()
            long r3 = r1.c
            r8.q0(r7, r3)
            r0.a = r6
            r0.b = r7
            r0.d = r2
            java.lang.Object r8 = defpackage.sdc.j0(r6, r0)
            xx1 r1 = defpackage.xx1.a
            if (r8 != r1) goto L36
            return r1
        L58:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.w0(bv0, jl9, kt1):java.lang.Object");
    }

    public static final void x(bv0 bv0Var, Throwable th) {
        bv0Var.getClass();
        if (th != null) {
            bv0Var.a(th);
            return;
        }
        b0(new x(1, bv0Var, bv0.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2));
    }

    public static final wo9 x0(vx1 vx1Var, jx1 jx1Var, yb4 yb4Var) {
        vx1Var.getClass();
        jx1Var.getClass();
        jt0 jt0Var = new jt0(false);
        oq9 oq9VarJ = ah1.J(vx1Var, jx1Var, null, new ug(yb4Var, jt0Var, (jt1) null, 5), 2);
        oq9VarJ.invokeOnCompletion(new vt0(jt0Var, 1));
        return new wo9(21, jt0Var, oq9VarJ);
    }

    public static final Object y(rm1 rm1Var, n58 n58Var) {
        if (!((nu6) rm1Var).a.z) {
            q75.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        lr7 lr7Var = vw1.S(rm1Var).O;
        lr7Var.getClass();
        return kc5.G(lr7Var, n58Var);
    }

    public static /* synthetic */ wo9 y0(vx1 vx1Var, jx1 jx1Var, yb4 yb4Var, int i2) {
        if ((i2 & 1) != 0) {
            jx1Var = hc3.a;
        }
        return x0(vx1Var, jx1Var, yb4Var);
    }

    public static final lc1 z(String str) {
        str.getClass();
        if (str.equals("null")) {
            return null;
        }
        return new lc1(ah1.j(Integer.parseInt(str)));
    }

    public abstract void E(boolean z2);

    public void F(m39 m39Var, int i2, boolean z2) {
        m39Var.getClass();
        J(m39Var, i2);
        E(z2);
    }

    public abstract void G(byte b2);

    public abstract void H(char c2);

    public abstract void I(double d2);

    public abstract void J(m39 m39Var, int i2);

    public abstract void K(m39 m39Var, int i2);

    public abstract void L(float f2);

    public void M(m39 m39Var, int i2, float f2) {
        m39Var.getClass();
        J(m39Var, i2);
        L(f2);
    }

    public md2 N(m39 m39Var) {
        m39Var.getClass();
        return this;
    }

    public md2 O(k28 k28Var, int i2) {
        k28Var.getClass();
        J(k28Var, i2);
        return N(k28Var.i(i2));
    }

    public abstract void P(int i2);

    public void Q(int i2, int i3, m39 m39Var) {
        m39Var.getClass();
        J(m39Var, i2);
        P(i3);
    }

    public abstract void R(long j2);

    public void S(m39 m39Var, int i2, long j2) {
        m39Var.getClass();
        J(m39Var, i2);
        R(j2);
    }

    public abstract void T();

    public void U(m39 m39Var, int i2, oi5 oi5Var, Object obj) {
        m39Var.getClass();
        oi5Var.getClass();
        J(m39Var, i2);
        if (oi5Var.e().c()) {
            W(oi5Var, obj);
        } else if (obj == null) {
            T();
        } else {
            W(oi5Var, obj);
        }
    }

    public void V(m39 m39Var, int i2, oi5 oi5Var, Object obj) {
        m39Var.getClass();
        oi5Var.getClass();
        J(m39Var, i2);
        W(oi5Var, obj);
    }

    public abstract void W(oi5 oi5Var, Object obj);

    public abstract void X(short s2);

    public abstract void Y(String str);

    public void Z(m39 m39Var, int i2, String str) {
        m39Var.getClass();
        str.getClass();
        J(m39Var, i2);
        Y(str);
    }

    public void a0(m39 m39Var) {
        m39Var.getClass();
    }

    public abstract q32 h0();

    public int o0(int i2) {
        return 16 - (i2 % 16);
    }

    public int p0(byte[] bArr) {
        return bArr.length - (bArr[bArr.length - 1] & 255);
    }

    public abstract boolean r0(m39 m39Var);

    public abstract md2 v(m39 m39Var);

    public void r(byte[] bArr, int i2, int i3) {
    }
}
