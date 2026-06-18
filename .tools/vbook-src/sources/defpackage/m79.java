package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class m79 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final cd1 E;
    public static final float F;
    public static final cd1 G;
    public static final float H;
    public static final cd1 I;
    public static final float J;
    public static final cd1 K;
    public static final float L;
    public static final cd1 M;
    public static final float N;
    public static final cd1 O;
    public static final cd1 P;
    public static final y89 Q;
    public static final float R;
    public static final cd1 S;
    public static final float T;
    public static final cd1 U;
    public static final cd1 V;
    public static final float W;
    public static final float X;
    public static final float Y;
    public static final y89 Z;
    public static final cd1 a;
    public static final float a0;
    public static final cd1 b;
    public static final cd1 b0;
    public static final cd1 c;
    public static final cd1 c0;
    public static final cd1 d;
    public static final float d0;
    public static final cd1 e;
    public static final cd1 e0;
    public static final cd1 f;
    public static final cd1 f0;
    public static final rj1 g;
    public static final y4 g0;
    public static final rj1 h;
    public static final byte[] h0;
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
    public static final k54 w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;

    static {
        cd1 cd1Var = cd1.z;
        a = cd1Var;
        cd1 cd1Var2 = cd1.e;
        b = cd1Var2;
        c = cd1.A;
        cd1 cd1Var3 = cd1.f;
        d = cd1Var3;
        e = cd1Var2;
        f = cd1Var3;
        g = new rj1(new uj1(9), false, 713089413);
        h = new rj1(new uj1(10), false, -73169428);
        i = new rj1(new uj1(11), false, -727054827);
        int i2 = 12;
        j = new rj1(new uj1(i2), false, -1018811013);
        int i3 = 25;
        k = new rj1(new k7(i3), false, 741776089);
        int i4 = 28;
        l = new rj1(new ak1(i4), false, 500214464);
        m = new rj1(new ak1(29), false, -1012572361);
        n = new rj1(new hk1(3), false, 1044111493);
        o = new rj1(new kk1(7), false, -692029410);
        p = new rj1(new jk1(i2), false, -221917022);
        q = new rj1(new kk1(8), false, -1895277434);
        r = new rj1(new mk1(0), false, 1606419940);
        s = new rj1(new nk1(i3), false, 242107287);
        t = new rj1(new nk1(26), false, 855325303);
        u = new rj1(new nk1(27), false, 41799840);
        v = new rj1(new nk1(i4), false, -1562204033);
        w = new k54(20);
        x = new byte[]{48, 49, 53, 0};
        y = new byte[]{48, 49, 48, 0};
        z = new byte[]{48, 48, 57, 0};
        A = new byte[]{48, 48, 53, 0};
        B = new byte[]{48, 48, 49, 0};
        C = new byte[]{48, 48, 49, 0};
        D = new byte[]{48, 48, 50, 0};
        E = cd1Var;
        F = 1.0f;
        G = cd1Var2;
        H = 0.38f;
        I = cd1Var2;
        J = 0.12f;
        K = cd1Var2;
        L = 0.38f;
        cd1 cd1Var4 = cd1.B;
        M = cd1Var4;
        N = 0.38f;
        O = cd1Var4;
        P = cd1Var2;
        y89 y89Var = y89.c;
        Q = y89Var;
        R = 28.0f;
        S = cd1.b;
        T = 24.0f;
        U = cd1.c;
        V = cd1.u;
        W = 40.0f;
        X = 32.0f;
        Y = 2.0f;
        Z = y89Var;
        a0 = 52.0f;
        cd1 cd1Var5 = cd1.s;
        b0 = cd1Var5;
        c0 = cd1Var5;
        d0 = 16.0f;
        e0 = cd1Var4;
        f0 = cd1Var4;
        g0 = new y4("android.widget.extra.CHECKED");
        h0 = new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:26:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0060 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.ut0 r8, long r9, defpackage.kt1 r11) throws java.io.EOFException {
        /*
            boolean r0 = r11 instanceof defpackage.yt0
            if (r0 == 0) goto L13
            r0 = r11
            yt0 r0 = (defpackage.yt0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yt0 r0 = new yt0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            long r8 = r0.c
            long r3 = r0.b
            ut0 r10 = r0.a
            defpackage.e11.e0(r11)
            goto L65
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            r8 = 0
            return r8
        L32:
            defpackage.e11.e0(r11)
            r11 = r0
            r0 = r9
        L37:
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 <= 0) goto L7f
            boolean r3 = r8.i()
            if (r3 != 0) goto L7f
            wq0 r3 = r8.h()
            r3.getClass()
            long r3 = r3.c
            int r3 = (int) r3
            if (r3 != 0) goto L6a
            r11.a = r8
            r11.b = r0
            r11.c = r9
            r11.e = r2
            java.lang.Object r3 = r8.e(r2, r11)
            xx1 r4 = defpackage.xx1.a
            if (r3 != r4) goto L60
            return r4
        L60:
            r3 = r9
            r10 = r8
            r8 = r3
            r3 = r0
            r0 = r11
        L65:
            r6 = r8
            r8 = r10
            r9 = r6
            r11 = r0
            r0 = r3
        L6a:
            wq0 r3 = r8.h()
            long r3 = defpackage.t1c.Z(r3)
            long r3 = java.lang.Math.min(r9, r3)
            wq0 r5 = r8.h()
            defpackage.t1c.T(r5, r3)
            long r9 = r9 - r3
            goto L37
        L7f:
            long r0 = r0 - r9
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.A(ut0, long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.ut0 r4, long r5, defpackage.kt1 r7) throws java.io.EOFException {
        /*
            boolean r0 = r7 instanceof defpackage.zt0
            if (r0 == 0) goto L13
            r0 = r7
            zt0 r0 = (defpackage.zt0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zt0 r0 = new zt0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            long r5 = r0.a
            defpackage.e11.e0(r7)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r7)
            r0.a = r5
            r0.c = r2
            java.lang.Object r7 = A(r4, r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4b
            heb r4 = defpackage.heb.a
            return r4
        L4b:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r7 = "Unable to discard "
            java.lang.String r0 = " bytes"
            java.lang.String r5 = defpackage.xv5.m(r5, r7, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.B(ut0, long, kt1):java.lang.Object");
    }

    public static final void C(gx6 gx6Var, fy0 fy0Var, sq0 sq0Var, float f2, o89 o89Var, jda jdaVar, s43 s43Var) {
        ArrayList arrayList = gx6Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gm7 gm7Var = (gm7) arrayList.get(i2);
            gm7Var.a.g(fy0Var, sq0Var, f2, o89Var, jdaVar, s43Var);
            fy0Var.p(0.0f, gm7Var.a.b());
        }
    }

    public static String D(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return tw2.r(new StringBuilder(String.valueOf(i2).length() + 21), "unknown status code: ", i2);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02a9 -> B:85:0x02ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.ut0 r35, defpackage.k21 r36, long r37, boolean r39, boolean r40, defpackage.kt1 r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.E(ut0, k21, long, boolean, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.jl9 r9, defpackage.ut0 r10, boolean r11, defpackage.kt1 r12) throws java.io.EOFException {
        /*
            boolean r0 = r12 instanceof defpackage.bu0
            if (r0 == 0) goto L13
            r0 = r12
            bu0 r0 = (defpackage.bu0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bu0 r0 = new bu0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            r2 = 1
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 != r6) goto L2d
            boolean r11 = r0.b
            jl9 r9 = r0.a
            defpackage.e11.e0(r12)
            goto L4f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L34:
            defpackage.e11.e0(r12)
            long r7 = defpackage.t1c.Z(r9)
            int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r12 >= 0) goto L57
            r0.a = r9
            r0.b = r11
            r0.d = r6
            r12 = 2
            java.lang.Object r12 = r10.e(r12, r0)
            xx1 r10 = defpackage.xx1.a
            if (r12 != r10) goto L4f
            return r10
        L4f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L69
        L57:
            wq0 r10 = r9.b()
            byte r10 = r10.p(r2)
            r12 = 10
            if (r10 != r12) goto L69
            defpackage.t1c.T(r9, r4)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L69:
            if (r11 == 0) goto L71
            defpackage.t1c.T(r9, r2)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L71:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.F(jl9, ut0, boolean, kt1):java.lang.Object");
    }

    public static final void G(jl9 jl9Var, Appendable appendable, qg8 qg8Var, long j2) throws IOException {
        if (j2 > 0) {
            jl9Var.getClass();
            jl9Var.v(j2);
            String strY = rj9.y(jl9Var.b(), j2);
            appendable.append(strY);
            qg8Var.a += (long) strY.length();
        }
    }

    public static final ou6 H(lr5 lr5Var, ho0 ho0Var, boolean z2, lh7 lh7Var) {
        return new hr5(lr5Var, ho0Var, z2, lh7Var);
    }

    public static final void I(t27 t27Var) {
        t27Var.getClass();
        t27Var.a(w79.INSTANCE);
    }

    public static final ou6 J(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new bf7(kb4Var));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    public static as1 K(String str) throws e20 {
        str.getClass();
        if (bw9.a0(str)) {
            return as1.e;
        }
        ak4 ak4Var = (ak4) fc1.E0(qu1.l0(str));
        String str2 = ak4Var.a;
        List list = ak4Var.b;
        int iW = bw9.W(str2, '/', 0, 6);
        if (iW == -1) {
            if (lc5.Q(bw9.B0(str2).toString(), "*")) {
                return as1.e;
            }
            throw new e20(str);
        }
        String string = bw9.B0(bw9.z0(iW, str2)).toString();
        if (string.length() == 0) {
            throw new e20(str);
        }
        String string2 = bw9.B0(str2.substring(iW + 1)).toString();
        if (bw9.P(string, ' ') || bw9.P(string2, ' ')) {
            throw new e20(str);
        }
        if (string2.length() == 0 || bw9.P(string2, '/')) {
            throw new e20(str);
        }
        return new as1(string, string2, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable L(defpackage.ut0 r4, int r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cu0
            if (r0 == 0) goto L13
            r0 = r6
            cu0 r0 = (defpackage.cu0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cu0 r0 = new cu0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            int r5 = r0.b
            ut0 r4 = r0.a
            defpackage.e11.e0(r6)
            goto L49
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L30:
            defpackage.e11.e0(r6)
            boolean r6 = r4.i()
            if (r6 == 0) goto L3a
            goto L51
        L3a:
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r6 = r4.e(r5, r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L49
            return r0
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L52
        L51:
            return r3
        L52:
            wq0 r4 = r4.h()
            se8 r4 = r4.peek()
            byte[] r4 = defpackage.qn9.s(r4, r5)
            zu0 r5 = new zu0
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.L(ut0, int, kt1):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(defpackage.ut0 r4, byte[] r5, int r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.du0
            if (r0 == 0) goto L13
            r0 = r7
            du0 r0 = (defpackage.du0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            du0 r0 = new du0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2c
            int r6 = r0.c
            byte[] r5 = r0.b
            ut0 r4 = r0.a
            defpackage.e11.e0(r7)
            goto L5d
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L33:
            defpackage.e11.e0(r7)
            boolean r7 = r4.i()
            if (r7 == 0) goto L42
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L42:
            wq0 r7 = r4.h()
            boolean r7 = r7.k()
            if (r7 == 0) goto L5d
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.e = r3
            java.lang.Object r7 = r4.e(r3, r0)
            xx1 r0 = defpackage.xx1.a
            if (r7 != r0) goto L5d
            return r0
        L5d:
            boolean r7 = r4.i()
            if (r7 == 0) goto L69
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            return r4
        L69:
            wq0 r4 = r4.h()
            r4.getClass()
            r5.getClass()
            r7 = 0
            int r4 = r4.q(r5, r7, r6)
            if (r4 != r2) goto L7b
            goto L7c
        L7b:
            r7 = r4
        L7c:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.M(ut0, byte[], int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.ut0 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.eu0
            if (r0 == 0) goto L13
            r0 = r5
            eu0 r0 = (defpackage.eu0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eu0 r0 = new eu0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            wq0 r4 = r0.b
            ut0 r1 = r0.a
            defpackage.e11.e0(r5)
            r5 = r4
            r4 = r1
            goto L3a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.e11.e0(r5)
            wq0 r5 = new wq0
            r5.<init>()
        L3a:
            boolean r1 = r4.i()
            if (r1 != 0) goto L56
            wq0 r1 = r4.h()
            r5.u0(r1)
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r1 = r4.e(r2, r0)
            xx1 r3 = defpackage.xx1.a
            if (r1 != r3) goto L3a
            return r3
        L56:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L5d
            return r5
        L5d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.N(ut0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:24:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:23:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.ut0 r10, int r11, defpackage.kt1 r12) throws java.io.EOFException {
        /*
            boolean r0 = r12 instanceof defpackage.fu0
            if (r0 == 0) goto L13
            r0 = r12
            fu0 r0 = (defpackage.fu0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            fu0 r0 = new fu0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r10 = r0.c
            wq0 r11 = r0.b
            ut0 r1 = r0.a
            defpackage.e11.e0(r12)
            goto L61
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L32:
            defpackage.e11.e0(r12)
            wq0 r12 = new wq0
            r12.<init>()
            r9 = r12
            r12 = r11
            r11 = r9
        L3d:
            long r3 = r11.c
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L93
            wq0 r1 = r10.h()
            boolean r1 = r1.k()
            if (r1 == 0) goto L63
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.e = r2
            java.lang.Object r1 = r10.e(r2, r0)
            xx1 r3 = defpackage.xx1.a
            if (r1 != r3) goto L5f
            return r3
        L5f:
            r1 = r10
            r10 = r12
        L61:
            r12 = r10
            r10 = r1
        L63:
            boolean r1 = r10.i()
            if (r1 != 0) goto L93
            wq0 r1 = r10.h()
            long r3 = defpackage.t1c.Z(r1)
            long r5 = (long) r12
            long r7 = r11.c
            long r7 = r5 - r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L85
            wq0 r1 = r10.h()
            long r3 = r11.c
            long r5 = r5 - r3
            r1.A(r11, r5)
            goto L3d
        L85:
            wq0 r1 = r10.h()
            long r3 = r1.R(r11)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            goto L3d
        L93:
            long r0 = r11.c
            long r2 = (long) r12
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L9b
            return r11
        L9b:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r12 = defpackage.xv5.u(r12, r0, r1)
            long r0 = r11.c
            java.lang.String r11 = " available"
            java.lang.String r11 = defpackage.xv5.n(r0, r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.O(ut0, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.ut0 r10, long r11, defpackage.kt1 r13) throws java.io.EOFException {
        /*
            boolean r0 = r13 instanceof defpackage.hu0
            if (r0 == 0) goto L13
            r0 = r13
            hu0 r0 = (defpackage.hu0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            hu0 r0 = new hu0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            long r10 = r0.d
            long r3 = r0.c
            bg9 r12 = r0.b
            ut0 r1 = r0.a
            defpackage.e11.e0(r13)
            r13 = r12
            r11 = r10
            r10 = r1
            r8 = r3
            r3 = r0
            r0 = r8
            goto L44
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L3a:
            defpackage.e11.e0(r13)
            wq0 r13 = new wq0
            r13.<init>()
            r3 = r0
            r0 = r11
        L44:
            boolean r4 = r10.i()
            if (r4 != 0) goto L90
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L90
            wq0 r6 = r10.h()
            long r6 = defpackage.t1c.Z(r6)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L74
            wq0 r4 = r10.h()
            long r4 = defpackage.t1c.Z(r4)
            long r4 = r11 - r4
            wq0 r11 = r10.h()
            long r11 = r11.R(r13)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r11)
            goto L7b
        L74:
            wq0 r6 = r10.h()
            r6.A(r13, r11)
        L7b:
            r3.a = r10
            r3.b = r13
            r3.c = r0
            r3.d = r4
            r3.f = r2
            java.lang.Object r11 = r10.e(r2, r3)
            xx1 r12 = defpackage.xx1.a
            if (r11 != r12) goto L8e
            return r12
        L8e:
            r11 = r4
            goto L44
        L90:
            wq0 r10 = r13.b()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.P(ut0, long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(defpackage.ut0 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.gu0
            if (r0 == 0) goto L13
            r0 = r5
            gu0 r0 = (defpackage.gu0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gu0 r0 = new gu0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            bg9 r4 = r0.b
            ut0 r1 = r0.a
            defpackage.e11.e0(r5)
            r5 = r4
            r4 = r1
            goto L3a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.e11.e0(r5)
            wq0 r5 = new wq0
            r5.<init>()
        L3a:
            boolean r1 = r4.i()
            if (r1 != 0) goto L56
            wq0 r1 = r4.h()
            r5.u0(r1)
            r0.a = r4
            r0.b = r5
            r0.d = r2
            java.lang.Object r1 = r4.e(r2, r0)
            xx1 r3 = defpackage.xx1.a
            if (r1 != r3) goto L3a
            return r3
        L56:
            java.lang.Throwable r4 = r4.b()
            if (r4 != 0) goto L61
            wq0 r4 = r5.b()
            return r4
        L61:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.Q(ut0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(defpackage.ut0 r4, defpackage.kt1 r5) throws java.io.EOFException {
        /*
            boolean r0 = r5 instanceof defpackage.iu0
            if (r0 == 0) goto L13
            r0 = r5
            iu0 r0 = (defpackage.iu0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iu0 r0 = new iu0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ut0 r4 = r0.a
            defpackage.e11.e0(r5)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            r0.a = r4
            r0.c = r2
            r5 = 2
            java.lang.Object r5 = x(r4, r5, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L3f
            return r0
        L3f:
            wq0 r4 = r4.h()
            short r4 = r4.readShort()
            java.lang.Short r5 = new java.lang.Short
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.R(ut0, kt1):java.lang.Object");
    }

    public static Uri S(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (A(r6, r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(defpackage.ut0 r6, defpackage.zu0 r7, defpackage.kt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ku0
            if (r0 == 0) goto L13
            r0 = r8
            ku0 r0 = (defpackage.ku0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ku0 r0 = new ku0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.e11.e0(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L31:
            zu0 r7 = r0.b
            ut0 r6 = r0.a
            defpackage.e11.e0(r8)
            goto L4c
        L39:
            defpackage.e11.e0(r8)
            byte[] r8 = r7.a
            int r8 = r8.length
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Comparable r8 = L(r6, r8, r0)
            if (r8 != r5) goto L4c
            goto L62
        L4c:
            boolean r8 = defpackage.lc5.Q(r8, r7)
            if (r8 == 0) goto L66
            byte[] r7 = r7.a
            int r7 = r7.length
            long r7 = (long) r7
            r0.a = r2
            r0.b = r2
            r0.d = r3
            java.lang.Object r6 = A(r6, r7, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.T(ut0, zu0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable U(defpackage.ut0 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.lu0
            if (r0 == 0) goto L13
            r0 = r5
            lu0 r0 = (defpackage.lu0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            lu0 r0 = new lu0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.b = r2
            java.lang.Object r5 = N(r4, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            wq0 r5 = (defpackage.wq0) r5
            long r0 = r5.c
            int r4 = (int) r0
            byte[] r4 = defpackage.qn9.s(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.U(ut0, kt1):java.io.Serializable");
    }

    public static char[] V(int i2) {
        int i3 = i2 >>> 16;
        if (i3 == 0) {
            return new char[]{(char) i2};
        }
        if (i3 < 17) {
            return new char[]{(char) ((i2 >>> 10) + 55232), (char) ((i2 & 1023) + 56320)};
        }
        gjb.X(16);
        String string = Integer.toString(i2, 16);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        gp.l("Not a valid Unicode code point: 0x".concat(upperCase));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.util.List r42, int r43, ou6 r44, defpackage.ib4 r45, dd4 r46, int r47) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.a(java.lang.String, java.lang.String, java.lang.String, java.util.List, int, ou6, ib4, dd4, int):void");
    }

    public static final void b(boolean z2, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-361453782);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ue7 ue7VarA = t26.a(dd4Var);
            if (ue7VarA == null) {
                dd4Var.f0(535274673);
                ue7VarA = (ue7) dd4Var.j(u26.a);
                if (ue7VarA == null) {
                    dd4Var.f0(1208426157);
                    View view = (View) dd4Var.j(he.f);
                    view.getClass();
                    while (true) {
                        if (view == null) {
                            ue7VarA = null;
                            break;
                        }
                        Object tag = view.getTag(2131362478);
                        ue7 ue7Var = tag instanceof ue7 ? (ue7) tag : null;
                        if (ue7Var != null) {
                            ue7VarA = ue7Var;
                            break;
                        } else {
                            Object objS = dk9.s(view);
                            view = objS instanceof View ? (View) objS : null;
                        }
                    }
                } else {
                    dd4Var.f0(1208423708);
                }
                dd4Var.q(false);
                if (ue7VarA == null) {
                    dd4Var.f0(1208428160);
                    q37 baseContext = (Context) dd4Var.j(he.b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof ue7) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    ue7VarA = (ue7) baseContext;
                } else {
                    dd4Var.f0(1208423789);
                }
                dd4Var.q(false);
            } else {
                dd4Var.f0(535271790);
            }
            dd4Var.q(false);
            if (ue7VarA == null) {
                gp.j("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = dd4Var.f(ue7VarA);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (zF || objQ == fu6Var) {
                q37 q37Var = ue7VarA instanceof q37 ? (q37) ue7VarA : null;
                s16 s16VarA = q37Var != null ? q37Var.a() : null;
                ue7 ue7Var2 = ue7VarA instanceof ue7 ? ue7VarA : null;
                eb0 eb0Var = new eb0(s16VarA, ue7Var2 != null ? ue7Var2.b() : null);
                dd4Var.p0(eb0Var);
                obj = eb0Var;
            }
            eb0 eb0Var2 = (eb0) obj;
            long j2 = dd4Var.T;
            boolean zF2 = dd4Var.f(eb0Var2) | dd4Var.e(j2);
            Object objQ2 = dd4Var.Q();
            Object obj2 = objQ2;
            if (zF2 || objQ2 == fu6Var) {
                uk1 uk1Var = new uk1(new fb0(ue7VarA, j2));
                uk1Var.c = new dh1(i);
                dd4Var.p0(uk1Var);
                obj2 = uk1Var;
            }
            uk1 uk1Var2 = (uk1) obj2;
            dd4Var.f0(-585307852);
            boolean zH = dd4Var.h(uk1Var2) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ3 = dd4Var.Q();
            Object obj3 = objQ3;
            if (zH || objQ3 == fu6Var) {
                y6 y6Var = new y6(9, uk1Var2, ib4Var);
                dd4Var.p0(y6Var);
                obj3 = y6Var;
            }
            lc5.H((ib4) obj3, dd4Var);
            int i5 = i3;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i6 = i5 & 14;
            int i7 = (dd4Var.h(uk1Var2) ? 1 : 0) | (i6 != 4 ? 0 : 1);
            Object objQ4 = dd4Var.Q();
            Object obj4 = objQ4;
            if (i7 != 0 || objQ4 == fu6Var) {
                hb0 hb0Var = new hb0(uk1Var2, z2, i4);
                dd4Var.p0(hb0Var);
                obj4 = hb0Var;
            }
            lx1.f(boolValueOf, uk1Var2, null, (kb4) obj4, dd4Var, i6);
            boolean zH2 = dd4Var.h(eb0Var2) | dd4Var.h(uk1Var2);
            Object objQ5 = dd4Var.Q();
            Object obj5 = objQ5;
            if (zH2 || objQ5 == fu6Var) {
                v vVar = new v(7, eb0Var2, uk1Var2);
                dd4Var.p0(vVar);
                obj5 = vVar;
            }
            lc5.k(eb0Var2, uk1Var2, (kb4) obj5, dd4Var);
            dd4Var.q(false);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jb0(z2, ib4Var, i2, i4);
        }
    }

    public static final void c(String str, final t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1034617446);
        int i3 = 4;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        int i5 = 1;
        final int i6 = 0;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean z2 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, i5);
                dd4Var.p0(objQ);
            }
            final a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new ag0(5);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            gx1.p(wn9.L((pv9) mu9.e0.getValue(), new Object[]{(String) a07Var.getValue()}, dd4Var), null, false, jf0.G(1809463266, new q41(t27Var, i3), dd4Var), jf0.G(1974936651, new nb0(a07Var2, i5), dd4Var), jf0.G(-140513488, new ac4() { // from class: ql0
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i7 = i6;
                    heb hebVar = heb.a;
                    a07 a07Var3 = a07Var;
                    switch (i7) {
                        case 0:
                            pj7 pj7Var = (pj7) obj3;
                            dd4 dd4Var2 = (dd4) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            ((yn0) obj2).getClass();
                            pj7Var.getClass();
                            if ((iIntValue & 48) == 0) {
                                iIntValue |= dd4Var2.f(pj7Var) ? 32 : 16;
                            }
                            int i8 = iIntValue;
                            if (!dd4Var2.V(i8 & 1, (i8 & Token.TARGET) != 144)) {
                                dd4Var2.Y();
                            } else {
                                szb szbVarW = yib.w(pj7Var, gjb.q(12.0f, 0.0f, 12.0f, 16.0f, 2));
                                ah1.b(t27Var, szbVarW, new szb(szbVarW, gjb.q(0.0f, 0.0f, 8.0f, 0.0f, 11), 0), (String) a07Var3.getValue(), true, tg9.c, dd4Var2, 221184, 0);
                            }
                            break;
                        default:
                            pj7 pj7Var2 = (pj7) obj3;
                            dd4 dd4Var3 = (dd4) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((yn0) obj2).getClass();
                            pj7Var2.getClass();
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= dd4Var3.f(pj7Var2) ? 32 : 16;
                            }
                            int i9 = iIntValue2;
                            if (!dd4Var3.V(i9 & 1, (i9 & Token.TARGET) != 144)) {
                                dd4Var3.Y();
                            } else {
                                szb szbVarW2 = yib.w(pj7Var2, gjb.q(12.0f, 0.0f, 12.0f, 16.0f, 2));
                                fe.h(t27Var, szbVarW2, new szb(szbVarW2, gjb.q(0.0f, 0.0f, 8.0f, 0.0f, 11), 0), (String) a07Var3.getValue(), true, tg9.c, dd4Var3, 221184, 0);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, 224256, 6);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            String str2 = (String) a07Var.getValue();
            String strK = wn9.K((pv9) mu9.c0.getValue(), dd4Var);
            boolean zF = dd4Var.f(a07Var2);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new x6(a07Var2, 10);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF2 = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new rl0(a07Var2, a07Var, i6);
                dd4Var.p0(objQ4);
            }
            wx1.p(zBooleanValue, str2, strK, kb4Var, (kb4) objQ4, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, i5);
        }
    }

    public static final void d(float f2, int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        int i3;
        ou6 ou6Var2;
        float f3;
        boolean z3;
        float f4;
        dd4Var.h0(232699765);
        if ((i2 & 6) == 0) {
            i3 = i2 | (dd4Var.f(ou6Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | 432;
        int i5 = 0;
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.a;
            long j3 = ((q96) dd4Var.j(ur9Var)).a.f;
            long j4 = ((q96) dd4Var.j(ur9Var)).a.j;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            nm7 nm7VarB0 = vo1.b0(((i4 >> 3) & 14) | 48, dd4Var, true);
            ym7 ym7VarA0 = vo1.a0(1.0f, dd4Var, (i4 >> 6) & 14);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = lc5.a(0.0f, 0.01f);
                dd4Var.p0(objQ2);
            }
            ym ymVar = (ym) objQ2;
            boolean zH = dd4Var.h(vx1Var) | dd4Var.h(ymVar);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new l81(vx1Var, ymVar, i5);
                dd4Var.p0(objQ3);
            }
            vo1.k((ib4) objQ3, dd4Var, 6);
            ou6Var2 = ou6Var;
            ou6 ou6VarE = ou6Var2.e(tg9.c);
            boolean zF = dd4Var.f(ym7VarA0) | dd4Var.f(nm7VarB0) | dd4Var.h(ymVar) | dd4Var.e(j2) | dd4Var.e(j4) | dd4Var.e(j3);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                f4 = 1.0f;
                m81 m81Var = new m81(ym7VarA0, nm7VarB0, ymVar, j2, j4, j3, 0);
                dd4Var.p0(m81Var);
                objQ4 = m81Var;
            } else {
                f4 = 1.0f;
            }
            s32.F(ou6VarE, (kb4) objQ4, dd4Var, 0);
            f3 = f4;
            z3 = true;
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
            f3 = f2;
            z3 = z2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n81(ou6Var2, z3, f3, i2, 0);
        }
    }

    public static final void e(cm3 cm3Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        yb4 yb4Var;
        kd kdVar;
        jm jmVar;
        ib4 ib4Var4;
        wf0 wf0Var;
        int i3;
        iv ivVar;
        dd4 dd4Var2;
        long jC;
        cm3 cm3Var2 = cm3Var;
        dd4 dd4Var3 = dd4Var;
        qr1 qr1Var = ra1.d;
        dd4Var3.h0(1404257847);
        int i4 = i2 | (dd4Var3.f(cm3Var2) ? 4 : 2) | (dd4Var3.h(ib4Var) ? 256 : Token.CASE) | (dd4Var3.h(ib4Var2) ? 2048 : 1024) | (dd4Var3.h(ib4Var3) ? 16384 : 8192);
        if (dd4Var3.V(i4 & 1, (i4 & 9363) != 9362)) {
            String str = cm3Var2.B;
            String str2 = cm3Var2.f;
            byte[] bArr = cm3Var2.D;
            if (bw9.a0(str)) {
                str = str2;
            }
            String str3 = cm3Var2.C;
            if (bw9.a0(str3)) {
                str3 = cm3Var2.h;
            }
            String str4 = str3;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(ou6Var, s00.p(dd4Var3).d), dd1.g(s00.o(dd4Var3), 1.0f), jf0.G), 12.0f);
            wf0 wf0Var2 = bv4.x;
            iv ivVar2 = pv.a;
            eq8 eq8VarA = dq8.a(ivVar2, wf0Var2, dd4Var3, 48);
            int iHashCode = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL = dd4Var3.l();
            ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarL0);
            ml1.k.getClass();
            ib4 ib4Var5 = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var5);
            } else {
                dd4Var3.s0();
            }
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var3, eq8VarA);
            jm jmVar3 = ll1.e;
            un9.s(jmVar3, dd4Var3, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar4 = ll1.g;
            un9.s(jmVar4, dd4Var3, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var3, kdVar2);
            yb4 yb4Var2 = ll1.d;
            un9.s(yb4Var2, dd4Var3, ou6VarL02);
            String str5 = str;
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarS = yn2.s(t96.w(tg9.h(tg9.r(ou6Var2, 72.0f), 108.0f), s00.p(dd4Var3).b), false, 0.0f, ib4Var3, 3);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL2 = dd4Var3.l();
            ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarS);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var5);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar2, dd4Var3, ha6VarD);
            un9.s(jmVar3, dd4Var3, lr7VarL2);
            ky0.v(iHashCode2, dd4Var3, jmVar4, dd4Var3, kdVar2);
            un9.s(yb4Var2, dd4Var3, ou6VarL03);
            if (bArr != null) {
                dd4Var3.f0(283697905);
                boolean zF = dd4Var3.f(bArr);
                Object objQ = dd4Var3.Q();
                if (zF || objQ == vl1.a) {
                    objQ = sw1.E(bArr);
                    dd4Var3.p0(objQ);
                }
                jmVar = jmVar4;
                yb4Var = yb4Var2;
                kdVar = kdVar2;
                i12.h((ky4) objQ, (String) null, tg9.c, dd4Var, 25008, 232);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
                i3 = 0;
                ib4Var4 = ib4Var5;
                wf0Var = wf0Var2;
                ivVar = ivVar2;
            } else {
                yb4Var = yb4Var2;
                kdVar = kdVar2;
                jmVar = jmVar4;
                dd4Var3.f0(284051491);
                ib4Var4 = ib4Var5;
                wf0Var = wf0Var2;
                i3 = 0;
                ivVar = ivVar2;
                w05.c(cm3Var2.e, str2, cm3Var2.j, cm3Var2.k, qr1Var, tg9.c, dd4Var, 221184);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            d6a d6aVar = a53.P;
            mx4.a(i25.c((m53) d6aVar.getValue(), dd4Var2, i3), wn9.K((pv9) eu9.M.getValue(), dd4Var2), tg9.n(gjb.l0(zn0.a.a(ou6Var2, bv4.v), 4.0f), 16.0f), s00.o(dd4Var2).b, dd4Var2, 0, 0);
            ky0.A(dd4Var2, true, ou6Var2, 16.0f, dd4Var2);
            hq8 hq8Var = hq8.a;
            ou6 ou6VarB = hq8Var.b(1.0f, ou6Var2, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarB);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, ie1VarA);
            un9.s(jmVar3, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL04);
            ou6 ou6VarS2 = yn2.s(ou6Var2, false, 0.0f, ib4Var, 3);
            wf0 wf0Var3 = wf0Var;
            iv ivVar3 = ivVar;
            eq8 eq8VarA2 = dq8.a(ivVar3, wf0Var3, dd4Var2, 48);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarS2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, eq8VarA2);
            un9.s(jmVar3, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL05);
            jm jmVar5 = jmVar;
            kd kdVar3 = kdVar;
            yb4 yb4Var3 = yb4Var;
            nha.c(str5, hq8Var.b(1.0f, ou6Var2, false), 0L, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).g, dd4Var, 1572864, 24960, 110524);
            un9.a(dd4Var, tg9.r(ou6Var2, 4.0f));
            mx4.a(i25.c((m53) d6aVar.getValue(), dd4Var, 0), (String) null, tg9.n(ou6Var2, 16.0f), s00.o(dd4Var).a, dd4Var, 432, 0);
            xv5.z(dd4Var, true, ou6Var2, 6.0f, dd4Var);
            ou6 ou6VarS3 = yn2.s(ou6Var2, false, 0.0f, ib4Var2, 3);
            eq8 eq8VarA3 = dq8.a(ivVar3, wf0Var3, dd4Var, 48);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarS3);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, eq8VarA3);
            un9.s(jmVar3, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar5, dd4Var, kdVar3);
            un9.s(yb4Var3, dd4Var, ou6VarL06);
            dd4Var.f0(-48996731);
            String strK = bw9.a0(str4) ? wn9.K((pv9) eu9.L.getValue(), dd4Var) : str4;
            dd4Var.q(false);
            uka ukaVar = s00.q(dd4Var).k;
            if (bw9.a0(str4)) {
                dd4Var.f0(-1518628432);
                jC = lc1.c(0.4f, s00.o(dd4Var).q);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1518715387);
                jC = s00.o(dd4Var).a;
                dd4Var.q(false);
            }
            nha.c(strK, hq8Var.b(1.0f, ou6Var2, false), jC, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24960, 110584);
            un9.a(dd4Var, tg9.r(ou6Var2, 4.0f));
            mx4.a(i25.c((m53) d6aVar.getValue(), dd4Var, 0), (String) null, tg9.n(ou6Var2, 16.0f), s00.o(dd4Var).a, dd4Var, 432, 0);
            xv5.z(dd4Var, true, ou6Var2, 6.0f, dd4Var);
            cm3Var2 = cm3Var;
            nha.c(wn9.L((pv9) vt9.m0.getValue(), new Object[]{Integer.valueOf(cm3Var2.o)}, dd4Var), (ou6) null, lc1.c(0.6f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 0, 131066);
            dd4Var3 = dd4Var;
            int i5 = cm3Var2.m;
            if (i5 == 10 || i5 == 20) {
                dd4Var3.f0(-1735604325);
                nha.c(wn9.K((pv9) vt9.N.getValue(), dd4Var3) + ": " + cm3Var2.p, (ou6) null, lc1.c(0.6f, s00.o(dd4Var3).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).l, dd4Var, 0, 0, 131066);
                dd4Var3 = dd4Var;
                dd4Var3.q(false);
            } else {
                dd4Var3.f0(-1735323279);
                dd4Var3.q(false);
            }
            dd4Var3.q(true);
            dd4Var3.q(true);
        } else {
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(cm3Var2, ou6Var, ib4Var, ib4Var2, ib4Var3, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.cm3 r23, defpackage.ib4 r24, defpackage.kb4 r25, defpackage.kb4 r26, defpackage.kb4 r27, defpackage.kb4 r28, defpackage.kb4 r29, defpackage.ib4 r30, dd4 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.f(cm3, ib4, kb4, kb4, kb4, kb4, kb4, ib4, dd4, int):void");
    }

    public static final void g(final cm3 cm3Var, ib4 ib4Var, final kb4 kb4Var, final zb4 zb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, final kb4 kb4Var9, kb4 kb4Var10, final ib4 ib4Var2, dd4 dd4Var, int i2) {
        a07 a07Var;
        a07 a07Var2;
        a07 a07Var3;
        aw3 aw3Var;
        a07 a07Var4;
        String strK;
        dd4Var.h0(-237674148);
        int i3 = i2 | (dd4Var.f(cm3Var) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(zb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192) | (dd4Var.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var4) ? 1048576 : 524288) | (dd4Var.h(kb4Var5) ? 8388608 : 4194304) | (dd4Var.h(kb4Var6) ? 67108864 : 33554432) | (dd4Var.h(kb4Var7) ? 536870912 : 268435456);
        int i4 = (dd4Var.h(kb4Var8) ? (char) 4 : (char) 2) | (dd4Var.h(kb4Var9) ? ' ' : (char) 16) | (dd4Var.h(kb4Var10) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new tl3(0);
                dd4Var.p0(objQ);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                a07Var = a07Var5;
                objQ2 = new tl3(1);
                dd4Var.p0(objQ2);
            } else {
                a07Var = a07Var5;
            }
            a07 a07Var6 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                a07Var2 = a07Var6;
                objQ3 = new tl3(2);
                dd4Var.p0(objQ3);
            } else {
                a07Var2 = a07Var6;
            }
            a07 a07Var7 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                a07Var3 = a07Var7;
                objQ4 = new tl3(3);
                dd4Var.p0(objQ4);
            } else {
                a07Var3 = a07Var7;
            }
            a07 a07Var8 = (a07) ww1.b0(objArr4, (ib4) objQ4, dd4Var, 48);
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = lc5.Z(dd4Var);
                dd4Var.p0(objQ5);
            }
            vx1 vx1Var = (vx1) objQ5;
            boolean zH = dd4Var.h(vx1Var) | ((i4 & 896) == 256);
            Object objQ6 = dd4Var.Q();
            if (zH || objQ6 == obj) {
                objQ6 = new n82(25, vx1Var, kb4Var10);
                dd4Var.p0(objQ6);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ6, dd4Var, 0);
            boolean z2 = cm3Var.b;
            om3 om3Var = cm3Var.c;
            if (z2) {
                dd4Var.f0(1851804401);
                switch (om3Var == null ? -1 : bm3.a[om3Var.ordinal()]) {
                    case -1:
                        dd4Var.f0(-771523507);
                        strK = wn9.K((pv9) eu9.f0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 0:
                    default:
                        throw j39.e(-771547894, dd4Var, false);
                    case 1:
                        dd4Var.f0(-771546451);
                        strK = wn9.K((pv9) eu9.f0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 2:
                        dd4Var.f0(-771543276);
                        strK = wn9.K((pv9) eu9.c0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 3:
                        dd4Var.f0(-771539983);
                        strK = wn9.K((pv9) eu9.h0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 4:
                        dd4Var.f0(-771536949);
                        strK = wn9.K((pv9) eu9.i0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 5:
                        dd4Var.f0(-771534134);
                        strK = wn9.K((pv9) eu9.g0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 6:
                        dd4Var.f0(-771531284);
                        strK = wn9.K((pv9) eu9.d0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 7:
                        dd4Var.f0(-771528339);
                        strK = wn9.K((pv9) eu9.e0.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                    case 8:
                        dd4Var.f0(-771525468);
                        strK = wn9.K((pv9) eu9.X.getValue(), dd4Var);
                        dd4Var.q(false);
                        break;
                }
                aw3Var = aw3VarC0;
                a07Var4 = a07Var8;
                if (fc1.r0(fw.Q0(new om3[]{om3.b, om3.c, om3.d, om3.e}), om3Var)) {
                    strK = strK + " " + wx1.Q(cm3Var.d, 0, 100) + "%";
                }
                dd4Var.q(false);
            } else {
                aw3Var = aw3VarC0;
                a07Var4 = a07Var8;
                dd4Var.f0(1852970187);
                strK = wn9.K((pv9) eu9.s0.getValue(), dd4Var);
                dd4Var.q(false);
            }
            final a07 a07Var9 = a07Var3;
            final a07 a07Var10 = a07Var4;
            final a07 a07Var11 = a07Var;
            final a07 a07Var12 = a07Var2;
            final aw3 aw3Var2 = aw3Var;
            final String str = strK;
            gx1.p(wn9.K((pv9) vt9.P.getValue(), dd4Var), null, false, jf0.G(106288224, new lo(1, ib4Var), dd4Var), null, jf0.G(1301544786, new ac4() { // from class: xl3
                /* JADX WARN: Removed duplicated region for block: B:100:0x044e  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0479  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x04ab  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x04bc  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x04ee  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x04ff  */
                @Override // defpackage.ac4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object g(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
                    /*
                        Method dump skipped, instruction units count: 1305
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.xl3.g(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, dd4Var), dd4Var, 199680, 22);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yl3(cm3Var, ib4Var, kb4Var, zb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, kb4Var10, ib4Var2, i2);
        }
    }

    public static final void h(String str, t27 t27Var, dd4 dd4Var, int i2) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1703793646);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(t27Var) ? 32 : 16);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, 22);
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
            a91 a91VarA = ug8.a(em3.class);
            em3 em3Var = (em3) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            a07 a07VarB = bx1.B(em3Var.s, dd4Var);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = em3Var.t;
            boolean zF = dd4Var.f(m8Var);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF || objQ2 == obj) {
                objQ2 = new xa(m8Var, jt1Var, 7);
                dd4Var.p0(objQ2);
            }
            wx1.e(pp1Var, null, (zb4) objQ2, dd4Var, 0);
            cm3 cm3Var = (cm3) a07VarB.getValue();
            boolean z3 = (i3 & Token.ASSIGN_MOD) == 32;
            Object objQ3 = dd4Var.Q();
            if (z3 || objQ3 == obj) {
                objQ3 = new zf3(t27Var, i4);
                dd4Var.p0(objQ3);
            }
            ib4 ib4Var2 = (ib4) objQ3;
            boolean zF2 = dd4Var.f(em3Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                qd2 qd2Var = new qd2(1, em3Var, em3.class, "changeFormat", "changeFormat(Lcom/reader/app/ui/screen/export/ExportEbookFormat;)V", 0, 5);
                dd4Var.p0(qd2Var);
                objQ4 = qd2Var;
            }
            kb4 kb4Var = (kb4) ((ei5) objQ4);
            boolean zF3 = dd4Var.f(em3Var);
            Object objQ5 = dd4Var.Q();
            if (zF3 || objQ5 == obj) {
                id idVar = new id(3, em3Var, em3.class, "changeScope", "changeScope(Lcom/reader/app/ui/screen/export/ExportEbookScope;Ljava/lang/String;Ljava/lang/String;)V", 0, 3);
                dd4Var.p0(idVar);
                objQ5 = idVar;
            }
            zb4 zb4Var = (zb4) ((ei5) objQ5);
            boolean zF4 = dd4Var.f(em3Var);
            Object objQ6 = dd4Var.Q();
            if (zF4 || objQ6 == obj) {
                qd2 qd2Var2 = new qd2(1, em3Var, em3.class, "changeIncludeIntroduction", "changeIncludeIntroduction(Z)V", 0, 6);
                dd4Var.p0(qd2Var2);
                objQ6 = qd2Var2;
            }
            kb4 kb4Var2 = (kb4) ((ei5) objQ6);
            boolean zF5 = dd4Var.f(em3Var);
            Object objQ7 = dd4Var.Q();
            if (zF5 || objQ7 == obj) {
                objQ7 = new qd2(1, em3Var, em3.class, "changeIncludeTableOfContent", "changeIncludeTableOfContent(Z)V", 0, 7);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var3 = (kb4) ((ei5) objQ7);
            boolean zF6 = dd4Var.f(em3Var);
            Object objQ8 = dd4Var.Q();
            if (zF6 || objQ8 == obj) {
                qd2 qd2Var3 = new qd2(1, em3Var, em3.class, "changeShowChapterTitle", "changeShowChapterTitle(Z)V", 0, 8);
                dd4Var.p0(qd2Var3);
                objQ8 = qd2Var3;
            }
            kb4 kb4Var4 = (kb4) ((ei5) objQ8);
            boolean zF7 = dd4Var.f(em3Var);
            Object objQ9 = dd4Var.Q();
            if (zF7 || objQ9 == obj) {
                qd2 qd2Var4 = new qd2(1, em3Var, em3.class, "changeMergeIntoSingleFile", "changeMergeIntoSingleFile(Z)V", 0, 9);
                dd4Var.p0(qd2Var4);
                objQ9 = qd2Var4;
            }
            kb4 kb4Var5 = (kb4) ((ei5) objQ9);
            boolean zF8 = dd4Var.f(em3Var);
            Object objQ10 = dd4Var.Q();
            if (zF8 || objQ10 == obj) {
                qd2 qd2Var5 = new qd2(1, em3Var, em3.class, "changeIncludeTranslateContent", "changeIncludeTranslateContent(Z)V", 0, 10);
                dd4Var.p0(qd2Var5);
                objQ10 = qd2Var5;
            }
            kb4 kb4Var6 = (kb4) ((ei5) objQ10);
            boolean zF9 = dd4Var.f(em3Var);
            Object objQ11 = dd4Var.Q();
            if (zF9 || objQ11 == obj) {
                qd2 qd2Var6 = new qd2(1, em3Var, em3.class, "changeIntroduction", "changeIntroduction(Ljava/lang/String;)V", 0, 1);
                dd4Var.p0(qd2Var6);
                objQ11 = qd2Var6;
            }
            kb4 kb4Var7 = (kb4) ((ei5) objQ11);
            boolean zF10 = dd4Var.f(em3Var);
            Object objQ12 = dd4Var.Q();
            if (zF10 || objQ12 == obj) {
                qd2 qd2Var7 = new qd2(1, em3Var, em3.class, "changeCustomName", "changeCustomName(Ljava/lang/String;)V", 0, 2);
                dd4Var.p0(qd2Var7);
                objQ12 = qd2Var7;
            }
            kb4 kb4Var8 = (kb4) ((ei5) objQ12);
            boolean zF11 = dd4Var.f(em3Var);
            Object objQ13 = dd4Var.Q();
            if (zF11 || objQ13 == obj) {
                qd2 qd2Var8 = new qd2(1, em3Var, em3.class, "changeCustomAuthor", "changeCustomAuthor(Ljava/lang/String;)V", 0, 3);
                dd4Var.p0(qd2Var8);
                objQ13 = qd2Var8;
            }
            kb4 kb4Var9 = (kb4) ((ei5) objQ13);
            boolean zF12 = dd4Var.f(em3Var);
            Object objQ14 = dd4Var.Q();
            if (zF12 || objQ14 == obj) {
                qd2 qd2Var9 = new qd2(1, em3Var, em3.class, "changeCustomCover", "changeCustomCover([B)V", 0, 4);
                dd4Var.p0(qd2Var9);
                objQ14 = qd2Var9;
            }
            kb4 kb4Var10 = (kb4) ((ei5) objQ14);
            boolean zF13 = dd4Var.f(em3Var);
            Object objQ15 = dd4Var.Q();
            if (zF13 || objQ15 == obj) {
                d7 d7Var = new d7(0, em3Var, em3.class, "startExport", "startExport()V", 0, 20);
                dd4Var.p0(d7Var);
                objQ15 = d7Var;
            }
            g(cm3Var, ib4Var2, kb4Var, zb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, kb4Var10, (ib4) ((ei5) objQ15), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, 6);
        }
    }

    public static final void i(ArrayList arrayList, rl3 rl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(553759465);
        int i3 = i2 | (dd4Var2.h(arrayList) ? 4 : 2) | (dd4Var2.d(rl3Var.ordinal()) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c((m53) f53.N.getValue(), dd4Var2, 0);
            String strK = wn9.K((pv9) eu9.p0.getValue(), dd4Var2);
            String str = rl3Var.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL02 = gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G), 16.0f);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new bv1(a07Var, 28);
                dd4Var2.p0(objQ2);
            }
            e11.v(p35VarC, strK, str, ou6VarL02, (ib4) objQ2, dd4Var2, 24576, 0);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == fu6Var) {
                objQ3 = new bv1(a07Var, 29);
                dd4Var2.p0(objQ3);
            }
            gx1.a(zBooleanValue, null, 0L, null, 0.0f, null, (ib4) objQ3, jf0.G(969389359, new hu2((Serializable) arrayList, (Object) rl3Var, kb4Var, (Object) a07Var, 8), dd4Var2), dd4Var2, 14155776, 62);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(arrayList, rl3Var, kb4Var, i2, 15);
        }
    }

    public static final void j(int i2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z2) {
        dd4Var.h0(975099832);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z3 = ((i3 & Token.ASSIGN_MOD) == 32) | (i4 == 4);
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = dk9.x(str);
                dd4Var.p0(objQ);
            }
            fw.q(z2, kb4Var, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1890258196, new c41(kb4Var2, kb4Var, (a07) objQ), dd4Var), dd4Var, i4 | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z2, str, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void k(boolean z2, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var;
        boolean z3;
        dd4Var.h0(1592704384);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.a), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G);
            int i4 = i3 & 14;
            boolean z4 = (i4 == 4) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            if (z4 || objQ == vl1.a) {
                objQ = new ck0(4, kb4Var, z2);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarL0 = gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 16.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
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
            un9.s(ll1.d, dd4Var, ou6VarL02);
            mx4.a(i25.c((m53) f53.o.getValue(), dd4Var, 0), (String) null, tg9.n(ou6Var2, 24.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, 432, 0);
            un9.a(dd4Var, tg9.r(ou6Var2, 16.0f));
            nha.c(wn9.K((pv9) eu9.Z.getValue(), dd4Var), new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 2, 0, (kb4) null, uka.a(((q96) dd4Var.j(ur9Var)).b.j, 0L, 0L, a84.u, (c64) null, 0L, 0L, (iy5) null, 16777211), dd4Var, 0, 24576, 114684);
            if (z2) {
                xv5.y(dd4Var, -2080248684, ou6Var2, 8.0f, dd4Var);
                ou6Var = ou6Var2;
                z3 = true;
                mx4.a(i25.c((m53) a53.P.getValue(), dd4Var, 0), wn9.K((pv9) eu9.N.getValue(), dd4Var), yn2.s(tg9.n(ou6Var2, 24.0f), false, 0.0f, ib4Var, 3), ((q96) dd4Var.j(ur9Var)).a.a, dd4Var, 0, 0);
                dd4Var.q(false);
            } else {
                ou6Var = ou6Var2;
                z3 = true;
                dd4Var.f0(-2079831610);
                dd4Var.q(false);
            }
            un9.a(dd4Var, tg9.r(ou6Var, 8.0f));
            z1a.a(z2, null, null, null, false, null, dd4Var, i4 | 48, Token.IMPORT);
            dd4Var.q(z3);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uu1(z2, kb4Var, ib4Var, i2, 2);
        }
    }

    public static final void l(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(-1154202632);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.a;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.h;
            ou6 ou6Var3 = lu6.a;
            nha.c(str, gjb.n0(ou6Var3, 0.0f, 12.0f, 1), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i3 & 14, 0, 131064);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(ou6 r23, boolean r24, float r25, dd4 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.m(ou6, boolean, float, dd4, int, int):void");
    }

    public static final void n(p35 p35Var, String str, int i2, ou6 ou6Var, dd4 dd4Var, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(42581922);
        int i8 = (dd4Var2.f(p35Var) ? 4 : 2) | i3 | (dd4Var2.f(str) ? 32 : 16);
        int i9 = i4 & 4;
        if (i9 != 0) {
            i6 = i8 | 384;
            i5 = i2;
        } else {
            i5 = i2;
            i6 = i8 | (dd4Var2.d(i5) ? 256 : Token.CASE);
        }
        if ((i3 & 3072) == 0) {
            i6 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i6 & 1, (i6 & 1171) != 1170)) {
            int i10 = i9 != 0 ? 0 : i5;
            ou6 ou6VarN0 = gjb.n0(ou6Var, 0.0f, 12.0f, 1);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            mx4.a(p35Var, (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var2, (i6 & 14) | 432, 8);
            int i11 = i10;
            nha.c(str, j39.f(lu6Var, 24.0f, dd4Var2, 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, (i6 >> 3) & 14, 0, 261116);
            dd4Var2 = dd4Var;
            if (i11 > 0) {
                dd4Var2.f0(1572797923);
                yb0.a(3072, 7, 0L, 0L, jf0.G(-1338754698, new i51(i11, 7), dd4Var2), dd4Var, null);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1572891140);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            i7 = i11;
        } else {
            dd4Var2.Y();
            i7 = i5;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cn0(p35Var, str, i7, ou6Var, i3, i4);
        }
    }

    public static final void o(boolean z2, String str, String str2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(1082730215);
        int i3 = 2;
        int i4 = 4;
        int i5 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        byte b2 = 0;
        if (dd4Var.V(i5 & 1, (i5 & 9363) != 9362)) {
            int i6 = i5 & 14;
            boolean z3 = ((i5 & 896) == 256) | (i6 == 4);
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = dk9.x(str2);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            z8.d(z2, kb4Var, jf0.G(2010214715, new ul3(b2, kb4Var2, kb4Var, a07Var), dd4Var), null, yib.E(lu6.a, 14), jf0.G(-114881282, new gs6(kb4Var, i4, b2), dd4Var), jf0.G(608409151, new z31(str, 7), dd4Var), null, 0L, 0L, 0.0f, false, false, jf0.G(1057595283, new kq2(a07Var, i3), dd4Var), dd4Var, 1769856 | i6 | ((i5 >> 6) & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(z2, str, str2, kb4Var, kb4Var2, i2, 3);
        }
    }

    public static final void p(boolean z2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, dd4 dd4Var, int i2) {
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        ib4Var5.getClass();
        ib4Var6.getClass();
        dd4Var.h0(971115168);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192) | (dd4Var.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var5) ? 1048576 : 524288) | (dd4Var.h(ib4Var6) ? 8388608 : 4194304);
        if (!dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-407430337);
            q(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, dd4Var, i3 & 33554430);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-407072225);
            r(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, dd4Var, i3 & 33554430);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nn6(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i2, 0);
        }
    }

    public static final void q(boolean z2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, dd4 dd4Var, int i2) {
        dd4Var.h0(-2058865214);
        int i3 = 4;
        int i4 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192) | (dd4Var.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var5) ? 1048576 : 524288) | (dd4Var.h(ib4Var6) ? 8388608 : 4194304);
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            xf0 xf0Var = bv4.c;
            ou6 ou6VarL0 = gjb.l0(gjb.p0(lc5.h0(tg9.f(lu6.a, 1.0f)), 0.0f, 50.0f, 0.0f, 0.0f, 13), 24.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new zm6(i3);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(5);
                dd4Var.p0(objQ2);
            }
            bx1.a(z2, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, 0L, false, false, ou6VarL0, jf0.G(1962444704, new pn6(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, 0), dd4Var), dd4Var, (i4 & Token.ASSIGN_MOD) | (i4 & 14) | 805334400, 224);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nn6(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i2, 1);
        }
    }

    public static final void r(boolean z2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, dd4 dd4Var, int i2) {
        dd4Var.h0(197688538);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192) | (dd4Var.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var5) ? 1048576 : 524288) | (dd4Var.h(ib4Var6) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            xf0 xf0Var = bv4.d;
            ou6 ou6VarR = tg9.r(gjb.l0(gjb.p0(lc5.h0(lu6.a), 0.0f, 0.0f, 40.0f, 0.0f, 11), 12.0f), 360.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new zm6(6);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(7);
                dd4Var.p0(objQ2);
            }
            bx1.a(z2, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, 0L, false, false, ou6VarR, jf0.G(-75968840, new pn6(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, 1), dd4Var), dd4Var, (i3 & Token.ASSIGN_MOD) | (i3 & 14) | 805334400, 224);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nn6(z2, kb4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, i2, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    public static final void s(boolean z2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, ib4 ib4Var7, dd4 dd4Var, int i2) {
        ib4 ib4Var8;
        ib4 ib4Var9;
        ib4 ib4Var10;
        float f2;
        float f3;
        ?? r1;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(205325773);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024) | (dd4Var2.h(ib4Var3) ? 16384 : 8192) | (dd4Var2.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var5) ? 1048576 : 524288) | (dd4Var2.h(ib4Var6) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var7) ? 67108864 : 33554432);
        if (dd4Var2.V(i3 & 1, (38347923 & i3) != 38347922)) {
            eub eubVarA = (eub) dd4Var2.j(utb.b);
            if (eubVarA == null) {
                dd4Var2.f0(1368428688);
                eubVarA = e36.a(dd4Var2);
            } else {
                dd4Var2.f0(1368426673);
            }
            dd4Var2.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            mib mibVar = (mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var2), null));
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zF = ((i3 & 14) == 4) | dd4Var2.f(mibVar);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            jt1 jt1Var = null;
            if (zF || objQ == obj) {
                objQ = new bm4(z2, mibVar, jt1Var, 2);
                dd4Var2.p0(objQ);
            }
            lc5.u((yb4) objQ, dd4Var2, boolValueOf);
            a07 a07VarB = bx1.B(mibVar.f, dd4Var2);
            ur9 ur9Var = s96.a;
            uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.e;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(lu6Var, uw1Var);
            long jG = dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6VarW, jG, lp4Var);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
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
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
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
            p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var2, 0);
            String strK = wn9.K((pv9) vt9.w0.getValue(), dd4Var2);
            ou6 ou6VarW2 = t96.w(tg9.n(gjb.l0(lu6Var, 12.0f), 40.0f), tp8.a);
            boolean z3 = (i3 & 896) == 256;
            Object objQ2 = dd4Var2.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new pm6(9, ib4Var);
                dd4Var2.p0(objQ2);
            }
            mx4.a(p35VarC, strK, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 8.0f), 0L, dd4Var, 0, 8);
            d6a d6aVar = vt9.a;
            nha.c(wn9.K((pv9) d6aVar.getValue(), dd4Var), zn0.a.a(lu6Var, bv4.f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.g, dd4Var, 0, 0, 131068);
            dd4Var.q(true);
            ou6 ou6VarQ = kc5.Q(fe.L(t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2), ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 10.0f), lp4Var), kc5.J(dd4Var), 14);
            int i4 = 0;
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            if (((iib) a07VarB.getValue()).a) {
                dd4Var.f0(351623622);
                String str = ((iib) a07VarB.getValue()).c;
                String str2 = ((iib) a07VarB.getValue()).h;
                String str3 = ((iib) a07VarB.getValue()).d;
                List list = ((iib) a07VarB.getValue()).e;
                int i5 = ((iib) a07VarB.getValue()).k + ((iib) a07VarB.getValue()).j;
                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 6.0f, 0.0f, 2);
                boolean zF2 = dd4Var.f(mibVar);
                Object objQ3 = dd4Var.Q();
                if (zF2 || objQ3 == obj) {
                    objQ3 = new on6(mibVar, i4);
                    dd4Var.p0(objQ3);
                }
                f2 = 6.0f;
                a(str, str2, str3, list, i5, ou6VarN0, (ib4) objQ3, dd4Var, 196608);
                dd4Var.q(false);
                f3 = 0.0f;
                r1 = 0;
            } else {
                f2 = 6.0f;
                dd4Var.f0(352139276);
                ou6 ou6VarL04 = gjb.l0(tg9.f(lu6Var, 1.0f), 12.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA);
                un9.s(jmVar2, dd4Var, lr7VarL4);
                ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL05);
                String strK2 = wn9.K((pv9) iu9.l0.getValue(), dd4Var);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                f3 = 0.0f;
                r1 = 0;
                kc5.n(null, strK2, false, null, gjb.n0(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 6.0f, 0.0f, 2), null, null, null, ib4Var2, dd4Var, (i3 << 15) & 234881024, 237);
                String strK3 = wn9.K((pv9) mu9.P.getValue(), dd4Var);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                kc5.n(null, strK3, false, null, gjb.n0(new bp5(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 6.0f, 0.0f, 2), null, null, null, ib4Var3, dd4Var, (i3 << 12) & 234881024, 237);
                dd4Var.q(true);
                dd4Var.q(false);
            }
            y86.c(0.0f, 0, 7, 0L, dd4Var, null);
            dd4Var2 = dd4Var;
            if (((iib) tw2.l(lu6Var, f2, dd4Var2, a07VarB)).a) {
                dd4Var2.f0(352969239);
                ib4Var10 = ib4Var4;
                n(i25.c((m53) f53.V.getValue(), dd4Var2, r1), wn9.K((pv9) d6aVar.getValue(), dd4Var2), 0, gjb.n0(fw.J(null, ib4Var10, tg9.f(lu6Var, 1.0f), r1, 15), 12.0f, f3, 2), dd4Var2, 0, 4);
                dd4Var2.q((boolean) r1);
            } else {
                ib4Var10 = ib4Var4;
                dd4Var2.f0(353317121);
                dd4Var2.q((boolean) r1);
            }
            ib4Var9 = ib4Var6;
            n(i25.c((m53) f53.O.getValue(), dd4Var2, r1), wn9.K((pv9) mu9.g.getValue(), dd4Var2), ((iib) a07VarB.getValue()).k, gjb.n0(fw.J(null, ib4Var9, tg9.f(lu6Var, 1.0f), r1, 15), 12.0f, f3, 2), dd4Var2, 0, 0);
            if (((iib) a07VarB.getValue()).a) {
                dd4Var2.f0(353761661);
                ib4Var8 = ib4Var5;
                n(i25.c((m53) a53.u.getValue(), dd4Var2, r1), wn9.K((pv9) iu9.x0.getValue(), dd4Var2), ((iib) a07VarB.getValue()).j, gjb.n0(fw.J(null, ib4Var8, tg9.f(lu6Var, 1.0f), r1, 15), 12.0f, f3, 2), dd4Var2, 0, 0);
                dd4Var2.q((boolean) r1);
            } else {
                ib4Var8 = ib4Var5;
                dd4Var2.f0(354165281);
                dd4Var2.q((boolean) r1);
            }
            if (((iib) a07VarB.getValue()).g == 3) {
                dd4Var2.f0(354228366);
                n(i25.c((m53) f53.G.getValue(), dd4Var2, r1), wn9.K((pv9) iu9.r0.getValue(), dd4Var2), 0, gjb.n0(fw.J(null, ib4Var7, tg9.f(lu6Var, 1.0f), r1, 15), 12.0f, f3, 2), dd4Var2, 0, 4);
                dd4Var2.q((boolean) r1);
            } else {
                dd4Var2.f0(354584897);
                dd4Var2.q((boolean) r1);
            }
            n(i25.c((m53) f53.p.getValue(), dd4Var2, r1), wn9.K((pv9) vu9.k0.getValue(), dd4Var2), 0, gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, f3, 2), dd4Var2, 3072, 4);
            xv5.A(lu6Var, f2, dd4Var2, true);
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            ib4Var8 = ib4Var5;
            ib4Var9 = ib4Var6;
            ib4Var10 = ib4Var4;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new st3(z2, ib4Var, ib4Var2, ib4Var3, ib4Var10, ib4Var8, ib4Var9, ib4Var7, i2);
        }
    }

    public static final void t(String str, String str2, boolean z2, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        dd4Var.h0(418675071);
        int i3 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var2 = dd4Var;
            sdc.e(tg9.n(ou6Var, z2 ? 132.0f : 112.0f), bv4.f, jf0.G(-475460651, new n79(z2, str, str2, 0), dd4Var), dd4Var2, 3120, 4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(str, str2, z2, ou6Var, i2, 14);
        }
    }

    public static final void u(t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        t27Var.getClass();
        dd4Var.h0(-594083339);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            eub eubVarA = (eub) dd4Var.j(utb.b);
            if (eubVarA == null) {
                dd4Var.f0(1368428688);
                eubVarA = e36.a(dd4Var);
            } else {
                dd4Var.f0(1368426673);
            }
            dd4Var.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            mib mibVar = (mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null));
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            b89 b89Var = (b89) ((qtb) qx1.N(ug8.a(b89.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            t27Var2 = t27Var;
            gx1.q(qn9.n(tg9.c), jf0.G(-589073897, new sz0(mibVar, bx1.B(mibVar.f, dd4Var), t27Var2, bx1.B(b89Var.d, dd4Var), b89Var, 3), dd4Var), dd4Var, 48, 0);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 27, t27Var2);
        }
    }

    public static final void v(iib iibVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        int i3;
        List list;
        ou6 ou6Var2;
        float f2;
        dd4 dd4Var2;
        dd4 dd4Var3 = dd4Var;
        lp4 lp4Var = jf0.G;
        vf0 vf0Var = bv4.A;
        dd4Var3.h0(1481152358);
        int i4 = i2 | (dd4Var3.h(iibVar) ? 4 : 2) | (dd4Var3.h(ib4Var) ? 256 : Token.CASE) | (dd4Var3.h(ib4Var2) ? 2048 : 1024) | (dd4Var3.h(ib4Var3) ? 16384 : 8192);
        if (dd4Var3.V(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z2 = iibVar.a;
            String str = iibVar.c;
            List list2 = iibVar.e;
            ou6 ou6Var3 = lu6.a;
            jv jvVar = pv.c;
            if (z2) {
                dd4Var3.f0(-1483840470);
                boolean zF = dd4Var3.f(list2);
                Object objQ = dd4Var3.Q();
                fu6 fu6Var = vl1.a;
                Object obj = objQ;
                if (zF || objQ == fu6Var) {
                    ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new lc1(kf0.H((String) it.next())));
                    }
                    dd4Var3.p0(arrayList);
                    obj = arrayList;
                }
                List list3 = (List) obj;
                ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var3, 48);
                int iHashCode = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL = dd4Var3.l();
                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6Var);
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
                float f3 = 12.0f;
                un9.a(dd4Var3, tg9.h(ou6Var3, 12.0f));
                String str2 = iibVar.h;
                boolean z3 = iibVar.f;
                Object objQ2 = dd4Var3.Q();
                if (objQ2 == fu6Var) {
                    i3 = 1;
                    objQ2 = new dh1(i3);
                    dd4Var3.p0(objQ2);
                } else {
                    i3 = 1;
                }
                t(str2, str, z3, fw.J(null, (ib4) objQ2, ou6Var3, false, 15), dd4Var3, 0);
                if (iibVar.f) {
                    ky0.z(dd4Var3, -2091253708, ou6Var3, 10.0f, dd4Var3);
                    uka ukaVar = ((q96) dd4Var3.j(s96.a)).b.n;
                    a84 a84Var = a84.y;
                    long jL = ah1.l(4285352991L);
                    rp8 rp8Var = tp8.a;
                    list = list3;
                    ou6 ou6VarM0 = gjb.m0(fw.G(fe.L(t96.w(ou6Var3, rp8Var), ah1.l(4294959234L), lp4Var), 1.0f, ah1.l(4294964164L), rp8Var), 14.0f, 5.0f);
                    ou6Var2 = ou6Var3;
                    f2 = 1.0f;
                    f3 = 12.0f;
                    nha.c("PREMIUM", ou6VarM0, jL, (g60) null, 0L, (t74) null, a84Var, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 1573254, 0, 131000);
                    dd4Var2 = dd4Var;
                    dd4Var2.q(false);
                } else {
                    list = list3;
                    ou6Var2 = ou6Var3;
                    f2 = 1.0f;
                    dd4Var2 = dd4Var3;
                    dd4Var2.f0(-2090553139);
                    dd4Var2.q(false);
                }
                un9.a(dd4Var2, tg9.h(ou6Var2, f3));
                i12.c(str, kf0.v(tg9.f(ou6Var2, f2)), list, 0L, 0L, new vaa(3), 0L, 0, false, 1, 0, s00.q(dd4Var2).e, dd4Var, 48, 3072, 56824);
                nha.c(iibVar.d, tg9.f(ou6Var2, f2), s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 48, 24576, 113656);
                un9.a(dd4Var, tg9.h(ou6Var2, 12.0f));
                String strK = wn9.K((pv9) vt9.b.getValue(), dd4Var);
                uka ukaVar2 = s00.q(dd4Var).k;
                long j2 = s00.o(dd4Var).s;
                rp8 rp8Var2 = tp8.a;
                nha.c(strK, gjb.m0(fw.G(fw.J(null, ib4Var3, t96.w(ou6Var2, rp8Var2), false, 15), f2, s00.o(dd4Var).s, rp8Var2), 16.0f, 6.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, ukaVar2, dd4Var, 0, 24576, 113656);
                dd4Var3 = dd4Var;
                dd4Var3.q(true);
                dd4Var3.q(false);
            } else {
                dd4Var3.f0(-1481161264);
                ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var3, 48);
                int iHashCode2 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL2 = dd4Var3.l();
                ou6 ou6VarL02 = s32.L0(dd4Var3, ou6Var);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var2);
                } else {
                    dd4Var3.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var3, ie1VarA2);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var3, lr7VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var3, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var3, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var3, ou6VarL02);
                un9.a(dd4Var3, tg9.h(ou6Var3, 12.0f));
                ou6 ou6VarL = fe.L(t96.w(tg9.n(ou6Var3, 80.0f), tp8.a), ((q96) dd4Var3.j(s96.a)).a.a, lp4Var);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode3 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL3 = dd4Var3.l();
                ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarL);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var2);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, ha6VarD);
                un9.s(jmVar2, dd4Var3, lr7VarL3);
                ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL03);
                i12.g(i25.b((m53) f53.z.getValue(), dd4Var3), (String) null, tg9.c, (f9) null, (sr1) null, 0.0f, (qc1) null, dd4Var, 440, 120);
                dd4Var3 = dd4Var;
                xv5.z(dd4Var3, true, ou6Var3, 12.0f, dd4Var3);
                ou6 ou6VarN0 = gjb.n0(tg9.f(ou6Var3, 1.0f), 16.0f, 0.0f, 2);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var3, 0);
                int iHashCode4 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL4 = dd4Var3.l();
                ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarN0);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(um1Var2);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA);
                un9.s(jmVar2, dd4Var3, lr7VarL4);
                ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL04);
                String strK2 = wn9.K((pv9) iu9.l0.getValue(), dd4Var3);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                kc5.n(null, strK2, false, null, gjb.n0(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 6.0f, 0.0f, 2), null, null, null, ib4Var, dd4Var3, (i4 << 18) & 234881024, 237);
                String strK3 = wn9.K((pv9) mu9.P.getValue(), dd4Var3);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                kc5.n(null, strK3, false, null, gjb.n0(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 6.0f, 0.0f, 2), null, null, null, ib4Var2, dd4Var3, (i4 << 15) & 234881024, 237);
                tw2.x(dd4Var3, true, true, false);
            }
        } else {
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(iibVar, ou6Var, ib4Var, ib4Var2, ib4Var3, i2, 21);
        }
    }

    public static final void w(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        fw.R(bArr, i3, bArr2, i2, i4 + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.ut0 r4, int r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.wt0
            if (r0 == 0) goto L13
            r0 = r6
            wt0 r0 = (defpackage.wt0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wt0 r0 = new wt0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            r0.b = r2
            java.lang.Object r6 = r4.e(r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3a
            return r4
        L3a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L45
            heb r4 = defpackage.heb.a
            return r4
        L45:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.x(ut0, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.e(r6, r13) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r0 != r8) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [bv0] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [bv0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bv0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cb -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.ut0 r17, defpackage.bv0 r18, long r19, defpackage.kt1 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m79.y(ut0, bv0, long, kt1):java.lang.Object");
    }

    public static Intent z(Context context, Class cls, int i2, py6 py6Var) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i2);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(py6Var.a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            y4 y4Var = (y4) entry.getKey();
            arrayList.add(new xl7(y4Var.a, entry.getValue()));
        }
        xl7[] xl7VarArr = (xl7[]) arrayList.toArray(new xl7[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", jv3.u((xl7[]) Arrays.copyOf(xl7VarArr, xl7VarArr.length)));
        return intentPutExtra;
    }
}
