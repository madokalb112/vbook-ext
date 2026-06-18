package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jf0 {
    public static final cd1 A;
    public static final float B;
    public static final float C;
    public static final float D;
    public static final float E;
    public static final hp F;
    public static final lp4 G;
    public static final cd1 H;
    public static final cd1 I;
    public static final float J;
    public static final cd1 K;
    public static final float L;
    public static final cd1 M;
    public static final float N;
    public static final cd1 O;
    public static final float P;
    public static final float Q;
    public static final cd1 R;
    public static final float S;
    public static final float T;
    public static final jt1[] a = new jt1[0];
    public static final cd1 b = cd1.a;
    public static final ybb c = ybb.d;
    public static final y89 d;
    public static final float e;
    public static final y89 f;
    public static final float g;
    public static final Object h;
    public static final rj1 i;
    public static final rj1 j;
    public static final rj1 k;
    public static final rj1 l;
    public static final rj1 m;
    public static final rj1 n;
    public static final rj1 o;
    public static final rj1 p;
    public static final rj1 q;
    public static final rj1 r;
    public static final rj1 s;
    public static final rj1 t;
    public static final rj1 u;
    public static final rj1 v;
    public static final rj1 w;
    public static final rj1 x;
    public static final cd1 y;
    public static final float z;

    static {
        y89 y89Var = y89.c;
        d = y89Var;
        e = 16.0f;
        f = y89Var;
        g = 6.0f;
        h = new Object();
        i = new rj1(new ak1(5), false, -1756335722);
        j = new rj1(new ak1(6), false, -1404998769);
        int i2 = 7;
        k = new rj1(new ak1(i2), false, -1113623624);
        int i3 = 8;
        l = new rj1(new ak1(i3), false, 597027223);
        m = new rj1(new ck1(i2), false, -1260742798);
        n = new rj1(new ck1(i3), false, -2144893977);
        new rj1(new bk1(11), false, 864412510);
        new rj1(new ck1(9), false, -1230873555);
        int i4 = 15;
        o = new rj1(new vj1(i4), false, 1893914501);
        p = new rj1(new vj1(16), false, 1113122853);
        q = new rj1(new hk1(19), false, -1434476760);
        r = new rj1(new ik1(13), false, 728904364);
        int i5 = 14;
        s = new rj1(new ik1(i5), false, -1776618128);
        t = new rj1(new ik1(i4), false, -1266646759);
        u = new rj1(new jk1(25), false, -863625956);
        v = new rj1(new mk1(3), false, -51699941);
        w = new rj1(new pk1(i5), false, -1236855399);
        x = new rj1(new pk1(i4), false, 785237613);
        y = cd1.t;
        z = 1.0f;
        A = cd1.v;
        B = 6.0f;
        C = 6.0f;
        D = 8.0f;
        E = 6.0f;
        F = new hp(1);
        G = new lp4(2);
        cd1 cd1Var = cd1.u;
        H = cd1Var;
        cd1 cd1Var2 = cd1.e;
        I = cd1Var2;
        J = 0.38f;
        K = cd1Var2;
        L = 0.38f;
        M = cd1Var2;
        N = 0.12f;
        O = cd1Var;
        P = 44.0f;
        Q = 4.0f;
        R = cd1.y;
        S = 16.0f;
        T = 4.0f;
    }

    public jf0(String str, Bundle bundle) {
        if (str.length() > 0) {
            return;
        }
        gp.l("type should not be empty");
        throw null;
    }

    public static void A(Throwable th) {
        th.getClass();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        if (pu.a()) {
            e46 e46Var = e46.b;
            k89 k89Var = k89.c;
            if (e46Var.a.a.compareTo(k89Var) <= 0) {
                e46Var.a(k89Var, "Log", message, th);
            }
        }
        gy3 gy3VarC = gy3.c();
        gy3VarC.a();
        ty3 ty3Var = (ty3) gy3VarC.d.a(ty3.class);
        if (ty3Var == null) {
            k27.n("FirebaseCrashlytics component is not present.");
            return;
        }
        xy1 xy1Var = ty3Var.a;
        Map map = Collections.EMPTY_MAP;
        ((f02) xy1Var.o.b).a(new g8(xy1Var, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable B(defpackage.ww r5, int r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.cy
            if (r0 == 0) goto L13
            r0 = r7
            cy r0 = (defpackage.cy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cy r0 = new cy
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r5 = r0.a
            defpackage.e11.e0(r7)
            goto L44
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.e11.e0(r7)
            byte[] r7 = new byte[r6]
            r0.a = r7
            r0.c = r2
            r1 = 0
            java.lang.Object r5 = r5.g(r7, r1, r6, r0)
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L41
            return r6
        L41:
            r4 = r7
            r7 = r5
            r5 = r4
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            int r6 = r7.intValue()
            if (r6 > 0) goto L4f
            byte[] r5 = defpackage.fw.Z
            return r5
        L4f:
            byte[] r5 = java.util.Arrays.copyOf(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.B(ww, int, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.yy r5, defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.dy
            if (r0 == 0) goto L13
            r0 = r6
            dy r0 = (defpackage.dy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dy r0 = new dy
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.e11.e0(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L31:
            defpackage.e11.e0(r6)
            r6 = 4
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L76
            r0.getClass()
            r5 = 3
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 2
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            r6 = r0[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L76:
            gp.e(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.C(yy, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.yy r5, defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.ey
            if (r0 == 0) goto L13
            r0 = r6
            ey r0 = (defpackage.ey) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ey r0 = new ey
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.e11.e0(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L31:
            defpackage.e11.e0(r6)
            r6 = 4
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L76
            r0.getClass()
            r5 = r0[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            r6 = 2
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r5 = r5 | r6
            r6 = 3
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L76:
            gp.e(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.D(yy, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.yy r4, int r5, defpackage.t1c r6, defpackage.kt1 r7) throws java.io.EOFException {
        /*
            boolean r0 = r7 instanceof defpackage.fy
            if (r0 == 0) goto L13
            r0 = r7
            fy r0 = (defpackage.fy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fy r0 = new fy
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            t1c r6 = r0.a
            defpackage.e11.e0(r7)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.c = r2
            java.io.Serializable r7 = defpackage.ql9.y(r4, r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            byte[] r7 = (byte[]) r7
            java.lang.String r4 = defpackage.k31.b(r7, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.E(yy, int, t1c, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.yy r5, defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.gy
            if (r0 == 0) goto L13
            r0 = r6
            gy r0 = (defpackage.gy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gy r0 = new gy
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            int r5 = r0.a
            byte[] r0 = r0.b
            defpackage.e11.e0(r6)
            goto L4a
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L31:
            defpackage.e11.e0(r6)
            r6 = 2
            byte[] r1 = new byte[r6]
            r0.b = r1
            r0.a = r6
            r0.d = r4
            java.lang.Object r5 = r5.g(r1, r3, r6, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L46
            return r0
        L46:
            r0 = r6
            r6 = r5
            r5 = r0
            r0 = r1
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r5) goto L66
            r0.getClass()
            r5 = r0[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L66:
            gp.e(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.F(yy, kt1):java.lang.Object");
    }

    public static final rj1 G(int i2, ub4 ub4Var, dd4 dd4Var) {
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new rj1(ub4Var, true, i2);
            dd4Var.p0(objQ);
        }
        rj1 rj1Var = (rj1) objQ;
        rj1Var.n(ub4Var);
        return rj1Var;
    }

    public static final l89 H(sq0 sq0Var) {
        if (sq0Var instanceof l89) {
            return (l89) sq0Var;
        }
        if (sq0Var instanceof xk9) {
            long j2 = ((xk9) sq0Var).a;
            return js8.x(gc1.Z(new lc1(j2), new lc1(j2)), 0.0f, 14);
        }
        mn5.g();
        return null;
    }

    public static final boolean I(Throwable th, ib4 ib4Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = jd5.a;
        pr2 pr2Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = zt7.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = lc3.a;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof pr2) {
                return false;
            }
        }
        try {
            il1 il1Var = (il1) ib4Var.invoke();
            if (il1Var != null) {
                boolean z3 = il1Var.b;
                List list = il1Var.a;
                if (z3) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((jl1) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z2 = true;
                }
            }
            if (z2) {
                il1Var.getClass();
                pr2Var = new pr2(il1Var);
            }
        } catch (Throwable th2) {
            pr2Var = th2;
        }
        if (pr2Var != null) {
            i12.r(th, pr2Var);
        }
        return z2;
    }

    public static final void J(y51 y51Var) {
        y51Var.getClass();
        y51Var.d = y51Var.d == dg6.a ? dg6.d : dg6.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0203  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r34, ky4 r35, java.lang.String r36, java.lang.String r37, java.util.List r38, ou6 r39, defpackage.ib4 r40, dd4 r41, int r42) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.a(java.lang.String, ky4, java.lang.String, java.lang.String, java.util.List, ou6, ib4, dd4, int):void");
    }

    public static final void b(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-390810090);
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
            ye8VarU.d = new ot(ou6Var, i2, 24);
        }
    }

    public static final void c(gba gbaVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(774058503);
        int i3 = i2 | (dd4Var.f(gbaVar) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024);
        int i4 = 1;
        int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            pb pbVarS = kf0.S(dd4Var);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            ur9 ur9Var = s96.a;
            kf0.a(fe.L(fw.G(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.b), 1.0f, dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd1.g(((q96) dd4Var.j(ur9Var)).a, 3.0f), G), pbVarS, (x1a) null, 44.0f, G(1906327477, new nm6(i4, pbVarS, (vx1) objQ, ib4Var2), dd4Var), G(-364733867, new hba(ib4Var, gbaVar, i5), dd4Var), dd4Var, 14352384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yn6(gbaVar, ou6Var, ib4Var, ib4Var2, i2, 4);
        }
    }

    public static final void d(boolean z2, int i2, wga wgaVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i3) {
        dd4Var.h0(2103901879);
        int i4 = i3 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.f(wgaVar) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.V(i4 & 1, (74899 & i4) != 74898)) {
            br9 br9VarB = an.b(z2 ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var, 0, 30);
            String strL = wn9.L((pv9) mu9.X.getValue(), new Object[]{Integer.valueOf(i2)}, dd4Var);
            long jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
            rj1 rj1VarG = G(679192915, new i41(kb4Var2, z2, br9VarB), dd4Var);
            boolean z3 = (57344 & i4) == 16384;
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new mj(27, kb4Var);
                dd4Var.p0(objQ);
            }
            e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6Var, (kb4) objQ, null, dd4Var, ((i4 >> 6) & 14) | 1597440, 292);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(z2, i2, wgaVar, ou6Var, kb4Var, kb4Var2, i3);
        }
    }

    public static final void e(int i2, int i3, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4Var.h0(2037250264);
        int i4 = i3 | (dd4Var.d(i2) ? 4 : 2);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(5)), bv4.w, dd4Var, 6);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var) {
                pv9[] pv9VarArr = {(pv9) vt9.D.getValue(), (pv9) vt9.W.getValue(), (pv9) mu9.e.getValue()};
                dd4Var.p0(pv9VarArr);
                obj = pv9VarArr;
            }
            pv9[] pv9VarArr2 = (pv9[]) obj;
            dd4Var.f0(1608735302);
            int length = pv9VarArr2.length;
            int i5 = 0;
            int i6 = 0;
            while (i6 < length) {
                pv9 pv9Var = pv9VarArr2[i6];
                int i7 = i5 + 1;
                boolean z2 = i5 == i2;
                String strK = wn9.K(pv9Var, dd4Var);
                boolean zD = dd4Var.d(i5);
                Object objQ2 = dd4Var.Q();
                if (zD || objQ2 == fu6Var) {
                    objQ2 = new bk0(kb4Var, i5, 13);
                    dd4Var.p0(objQ2);
                }
                fz1.C(0, (ib4) objQ2, dd4Var, null, null, null, strK, z2);
                i6++;
                i5 = i7;
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i2, ou6Var, kb4Var, i3, 9);
        }
    }

    public static final void f(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1674651703);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            nha.c(str, ou6Var, 0L, (g60) null, 0L, (t74) null, a84.w, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, (i3 & 14) | 1572864 | (i3 & Token.ASSIGN_MOD), 0, 129980);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var, i2, 12);
        }
    }

    public static final void g(ou6 ou6Var, xp4 xp4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        xp4Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(-645862604);
        int i3 = i2 | (dd4Var.f(xp4Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = js8.x(gc1.Z(new lc1(ah1.l(4294901824L)), new lc1(ah1.l(4294902015L)), new lc1(ah1.l(4286578943L)), new lc1(ah1.l(4278190335L)), new lc1(ah1.l(4278223103L)), new lc1(ah1.l(4278255615L)), new lc1(ah1.l(4278255488L)), new lc1(ah1.l(4278255360L)), new lc1(ah1.l(4286643968L)), new lc1(ah1.l(4294967040L)), new lc1(ah1.l(4294934528L)), new lc1(ah1.l(4294901760L))), 0.0f, 14);
                dd4Var.p0(objQ);
            }
            sq0 sq0Var = (sq0) objQ;
            ou6Var2 = ou6Var;
            ou6 ou6VarE = ou6Var2.e(tg9.c);
            boolean z2 = (i3 & 896) == 256;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new t9(1, kb4Var);
                dd4Var.p0(objQ2);
            }
            ou6 ou6VarB = r1a.b(ou6VarE, heb.a, (PointerInputEventHandler) objQ2);
            boolean z3 = (i3 & Token.ASSIGN_MOD) == 32;
            Object objQ3 = dd4Var.Q();
            if (z3 || objQ3 == obj) {
                objQ3 = new p9(sq0Var, xp4Var, 1);
                dd4Var.p0(objQ3);
            }
            s32.F(ou6VarB, (kb4) objQ3, dd4Var, 0);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q9(ou6Var2, xp4Var, kb4Var, i2, 1);
        }
    }

    public static final void h(List list, pj7 pj7Var, ou6 ou6Var, zb4 zb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-1392758667);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zF = dd4Var.f(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = dk9.x(list);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var, 14)), gjb.q(0.0f, 0.0f, 0.0f, 80.0f, 7));
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new xs1(a07Var, null, i4);
                dd4Var.p0(objQ2);
            }
            pj8 pj8VarU0 = lx1.u0(st5VarA, szbVarW, (ac4) objQ2, dd4Var);
            szb szbVarW2 = yib.w(szbVarW, gjb.q(16.0f, 0.0f, 16.0f, 0.0f, 10));
            szb szbVarW3 = yib.w(szbVarW, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zF3 = dd4Var.f(a07Var) | dd4Var.f(pj8VarU0) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                w66 w66Var = new w66(a07Var, pj8VarU0, zb4Var, kb4Var, 0);
                dd4Var.p0(w66Var);
                objQ3 = w66Var;
            }
            gx1.h(ou6Var, st5VarA, szbVarW2, mvVar, null, null, false, szbVarW3, 0L, 0L, 0.0f, (kb4) objQ3, dd4Var, ((i3 >> 6) & 14) | 24576, 0, 3816);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new x66(list, pj7Var, ou6Var, zb4Var, kb4Var, i2, 0);
        }
    }

    public static final void i(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(200878002);
        int i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
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
            nha.c(wn9.K((pv9) mu9.c.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            i3 = 3;
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.f.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i4 << 21) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            i3 = 3;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, i3);
        }
    }

    public static final void j(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(2052815590);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            a76 a76Var = (a76) ((qtb) qx1.N(ug8.a(a76.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(a76Var.d, dd4Var);
            p83 p83VarA0 = i12.a0(dd4Var);
            gx1.p(wn9.K((pv9) zu9.A0.getValue(), dd4Var), tg9.c, false, G(-1427562774, new n74(t27Var, 12), dd4Var), null, G(-1893564836, new ak0(8, p83VarA0, a76Var, a07VarB), dd4Var), dd4Var, 199728, 20);
            boolean zF = dd4Var.f(a76Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new nl9(a76Var, 20);
                dd4Var.p0(objQ);
            }
            i12.k(p83VarA0, (zb4) objQ, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 11, t27Var);
        }
    }

    public static final void k(w78 w78Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1585510580);
        int i3 = i2 | (dd4Var2.f(w78Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.b), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), G), 12.0f, 8.0f);
            eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), bv4.x, dd4Var2, 54);
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
            nha.c(w78Var.b, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 0, 0, 131064);
            dd4Var2 = dd4Var;
            sw1.r(i25.c((m53) a53.H.getValue(), dd4Var2, 0), (ou6) null, 0L, ib4Var, dd4Var2, (i3 << 3) & 7168, 6);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(w78Var, ou6Var, ib4Var, i2, 28);
        }
    }

    public static final void l(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(673305493);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            c17 c17Var = (c17) ((qtb) qx1.N(ug8.a(c17.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(c17Var.d, dd4Var);
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) iu9.I0.getValue(), dd4Var), tg9.c, false, G(-2024170991, new n74(t27Var, 14), dd4Var), G(-1918037958, new qz0(23, c17Var, a07VarB), dd4Var), G(948876767, new z07(a07VarB, c17Var), dd4Var), dd4Var2, 224304, 4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 15, t27Var);
        }
    }

    public static final void m(final gba gbaVar, ou6 ou6Var, ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, dd4 dd4Var, int i2) {
        dd4Var.h0(1917066639);
        int i3 = i2 | (dd4Var.f(gbaVar) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            final vx1 vx1Var = (vx1) objQ;
            final pb pbVarS = kf0.S(dd4Var);
            ur9 ur9Var = s96.a;
            kf0.a(fe.L(fw.G(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.b), 1.0f, dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd1.g(((q96) dd4Var.j(ur9Var)).a, 3.0f), G), pbVarS, (x1a) null, 88.0f, G(159363261, new bc4() { // from class: iba
                @Override // defpackage.bc4
                public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    String str = gbaVar.g;
                    ((Float) obj3).getClass();
                    dd4 dd4Var2 = (dd4) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((fq8) obj).getClass();
                    ((pb) obj2).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                        p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var2, 0);
                        long j2 = lc1.b;
                        boolean zF = dd4Var2.f(str);
                        Object objQ2 = dd4Var2.Q();
                        Object obj6 = vl1.a;
                        if (zF || objQ2 == obj6) {
                            objQ2 = new lc1(kf0.H(str));
                            dd4Var2.p0(objQ2);
                        }
                        long j3 = ((lc1) objQ2).a;
                        lp4 lp4Var = jf0.G;
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarL = fe.L(lu6Var, j3, lp4Var);
                        vx1 vx1Var2 = vx1Var;
                        boolean zH = dd4Var2.h(vx1Var2);
                        pb pbVar = pbVarS;
                        boolean zF2 = zH | dd4Var2.f(pbVar);
                        ib4 ib4Var4 = ib4Var2;
                        boolean zF3 = zF2 | dd4Var2.f(ib4Var4);
                        Object objQ3 = dd4Var2.Q();
                        if (zF3 || objQ3 == obj6) {
                            objQ3 = new om6(2, pbVar, vx1Var2, ib4Var4);
                            dd4Var2.p0(objQ3);
                        }
                        mx4.a(p35VarC, (String) null, tg9.c(gjb.l0(tg9.r(fw.J(null, (ib4) objQ3, ou6VarL, false, 15), 44.0f), 12.0f), 1.0f), j2, dd4Var2, 3120, 0);
                        p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
                        long j4 = lc1.e;
                        ou6 ou6VarL2 = fe.L(lu6Var, lc1.f, lp4Var);
                        boolean zH2 = dd4Var2.h(vx1Var2) | dd4Var2.f(pbVar);
                        ib4 ib4Var5 = ib4Var3;
                        boolean zF4 = zH2 | dd4Var2.f(ib4Var5);
                        Object objQ4 = dd4Var2.Q();
                        if (zF4 || objQ4 == obj6) {
                            objQ4 = new om6(3, pbVar, vx1Var2, ib4Var5);
                            dd4Var2.p0(objQ4);
                        }
                        mx4.a(p35VarC2, (String) null, tg9.c(gjb.l0(tg9.r(fw.J(null, (ib4) objQ4, ou6VarL2, false, 15), 44.0f), 12.0f), 1.0f), j4, dd4Var2, 3120, 0);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), G(22778717, new hba(ib4Var, gbaVar, i4), dd4Var), dd4Var, 14352384);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(gbaVar, ou6Var, ib4Var, ib4Var2, ib4Var3, i2, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(java.util.List r22, pj7 r23, ou6 r24, defpackage.kb4 r25, defpackage.kb4 r26, defpackage.kb4 r27, dd4 r28, int r29) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.n(java.util.List, pj7, ou6, kb4, kb4, kb4, dd4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0739  */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [int] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final defpackage.dhb r49, pj7 r50, ou6 r51, defpackage.bc4 r52, defpackage.kb4 r53, dd4 r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.o(dhb, pj7, ou6, bc4, kb4, dd4, int):void");
    }

    public static final void p(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(1054852708);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ehb ehbVar = (ehb) ((qtb) qx1.N(ug8.a(ehb.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(ehbVar.d, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = ehbVar.e;
            boolean zF = dd4Var.f(m8Var) | ((i3 & 14) == 4);
            Object objQ = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ == vl1.a) {
                objQ = new q51(m8Var, t27Var, jt1Var, 11);
                dd4Var.p0(objQ);
            }
            wx1.e(pp1Var, null, (zb4) objQ, dd4Var, 0);
            dd4Var2 = dd4Var;
            gx1.r(wn9.K((pv9) vt9.a.getValue(), dd4Var), null, G(-915445259, new oe9(t27Var, 28), dd4Var), null, G(-1500142873, new qs1(9, ehbVar, a07VarB), dd4Var), dd4Var2, 199680, 22);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 29, t27Var);
        }
    }

    public static final int q(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final co2 r(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            un2 un2VarL = kc5.l(context);
            long jA = vw1.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jE0 = un2VarL.E0(jA);
            return new co2((((long) ((int) Float.intBitsToFloat((int) (jE0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jE0 >> 32)))) << 32), jA);
        }
        a0c.a.getClass();
        b0c b0cVar = zzb.b;
        b0cVar.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i2 = Build.VERSION.SDK_INT;
        yzb yzbVarE = (i2 >= 34 ? rn2.b : i2 >= 30 ? kn0.b : wfc.A).e(contextWrapper2, b0cVar.b);
        long jHeight = (4294967295L & ((long) yzbVarE.a().height())) | (((long) yzbVarE.a().width()) << 32);
        return new co2(jHeight, kc5.l(baseContext).t(sw1.l0(jHeight)));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #2 {all -> 0x00e9, blocks: (B:43:0x00be, B:45:0x00c4), top: B:65:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(b39 r19, defpackage.gx3 r20, vv r21, defpackage.zn7 r22, boolean r23, defpackage.vc0 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf0.s(b39, gx3, vv, zn7, boolean, vc0):java.lang.Object");
    }

    public static final rj1 t(dd4 dd4Var, int i2, rl5 rl5Var) {
        rj1 rj1Var;
        dd4Var.c0(Integer.rotateLeft(i2, 1), h);
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            rj1Var = new rj1(rl5Var, true, i2);
            dd4Var.p0(rj1Var);
        } else {
            objQ.getClass();
            rj1Var = (rj1) objQ;
            rj1Var.n(rl5Var);
        }
        dd4Var.q(false);
        return rj1Var;
    }

    public static qx0 u(int i2) {
        oa4 oa4Var = oa4.k;
        float fH = t96.H((i2 >> 16) & 255);
        float fH2 = t96.H((i2 >> 8) & 255);
        float fH3 = t96.H(i2 & 255);
        double[][] dArr = t96.d;
        double d2 = fH;
        double[] dArr2 = dArr[0];
        double d3 = fH2;
        double d4 = fH3;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = t96.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = oa4Var.g;
        float f10 = oa4Var.e;
        float f11 = oa4Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = oa4Var.h;
        float fPow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f16 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f17 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * oa4Var.c) / f11, oa4Var.j * f10)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * oa4Var.f) * oa4Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, oa4Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f23 = oa4Var.i * fPow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f22;
        return new qx0(f21, fPow5, fPow4, f24, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    public static qx0 v(float f2, float f3, float f4) {
        float f5 = oa4.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new qx0(f4, f3, f2, f6, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static final boolean w(long j2) {
        return (lc1.f(j2) * 0.114f) + ((lc1.h(j2) * 0.587f) + (lc1.i(j2) * 0.299f)) < 0.5f;
    }

    public static final ArrayList x(List list, List list2, float f2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(new lc1(ah1.K(((lc1) list.get(Math.min(i2, list.size() - 1))).a, ((lc1) list2.get(Math.min(i2, list2.size() - 1))).a, f2)));
        }
        return arrayList;
    }

    public static final ArrayList y(List list, List list2, float f2) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(Float.valueOf(sw1.V(((Number) list.get(Math.min(i2, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i2, list2.size() - 1))).floatValue(), f2)));
        }
        return arrayList;
    }

    public static final long z(long j2, long j3, float f2) {
        return (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j3 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? qu1.i0(j2, j3, f2) : f2 < 0.5f ? j2 : j3;
    }
}
