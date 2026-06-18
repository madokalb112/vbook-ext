package defpackage;

import android.graphics.Matrix;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class cx1 {
    public static p35 a;

    public static final lx0 A(yb4 yb4Var) {
        return new lx0(yb4Var, hc3.a, -2, ar0.a);
    }

    public static final q11 A0(b24 b24Var, zb4 zb4Var) {
        int i = d34.a;
        return new q11(zb4Var, b24Var, hc3.a, -2, ar0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable B(defpackage.b24 r4, defpackage.c24 r5, defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.s24
            if (r0 == 0) goto L13
            r0 = r6
            s24 r0 = (defpackage.s24) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s24 r0 = new s24
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            rg8 r4 = r0.a
            defpackage.e11.e0(r6)     // Catch: java.lang.Throwable -> L28
            goto L4a
        L28:
            r5 = move-exception
            goto L4d
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L30:
            defpackage.e11.e0(r6)
            rg8 r6 = new rg8
            r6.<init>()
            gx2 r1 = new gx2     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            r0.a = r6     // Catch: java.lang.Throwable -> L4b
            r0.c = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L4b
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L4a
            return r5
        L4a:
            return r2
        L4b:
            r5 = move-exception
            r4 = r6
        L4d:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L59
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7b
        L59:
            jx1 r6 = r0.getContext()
            s00 r0 = defpackage.s00.s
            hx1 r6 = r6.get(r0)
            yd5 r6 = (defpackage.yd5) r6
            if (r6 == 0) goto L7c
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6e
            goto L7c
        L6e:
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()
            if (r6 == 0) goto L7c
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7b
            goto L7c
        L7b:
            throw r5
        L7c:
            if (r4 != 0) goto L7f
            return r5
        L7f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L87
            i12.r(r4, r5)
            throw r4
        L87:
            i12.r(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.B(b24, c24, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer B0(java.lang.String r13) {
        /*
            r13.getClass()
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r13 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r13.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r2 = r13.length()
            if (r0 != r2) goto L1e
            goto La
        L1e:
            int r2 = r0 + 1
            char r3 = r13.charAt(r0)
            r4 = -1
            r5 = 128(0x80, float:1.8E-43)
            if (r3 >= r5) goto L2e
            byte[] r6 = defpackage.h66.a
            r3 = r6[r3]
            goto L31
        L2e:
            byte[] r3 = defpackage.h66.a
            r3 = r4
        L31:
            if (r3 < 0) goto La
            r6 = 10
            if (r3 < r6) goto L38
            goto La
        L38:
            int r3 = -r3
            long r7 = (long) r3
        L3a:
            int r3 = r13.length()
            r9 = -9223372036854775808
            if (r2 >= r3) goto L6d
            int r3 = r2 + 1
            char r2 = r13.charAt(r2)
            if (r2 >= r5) goto L4f
            byte[] r11 = defpackage.h66.a
            r2 = r11[r2]
            goto L52
        L4f:
            byte[] r2 = defpackage.h66.a
            r2 = r4
        L52:
            if (r2 < 0) goto La
            if (r2 >= r6) goto La
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L60
            goto La
        L60:
            r11 = 10
            long r7 = r7 * r11
            long r11 = (long) r2
            long r9 = r9 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto La
        L6a:
            long r7 = r7 - r11
            r2 = r3
            goto L3a
        L6d:
            if (r0 == 0) goto L74
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            goto L7e
        L74:
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L79
            goto La
        L79:
            long r2 = -r7
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L7e:
            if (r13 == 0) goto L97
            long r2 = r13.longValue()
            int r0 = r13.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            return r13
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.B0(java.lang.String):java.lang.Integer");
    }

    public static final boolean C(p65 p65Var) {
        return !p65Var.h && p65Var.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer C0(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case 115187:
                    if (lowerCase.equals("tts")) {
                        return 5;
                    }
                    break;
                case 93166550:
                    if (lowerCase.equals("audio")) {
                        return 3;
                    }
                    break;
                case 94843483:
                    if (lowerCase.equals("comic")) {
                        return 2;
                    }
                    break;
                case 105010748:
                    if (lowerCase.equals("novel")) {
                        return 1;
                    }
                    break;
                case 112202875:
                    if (lowerCase.equals("video")) {
                        return 4;
                    }
                    break;
                case 1052832078:
                    if (lowerCase.equals("translate")) {
                        return 6;
                    }
                    break;
            }
        }
        return null;
    }

    public static int D(long j) {
        int i = (int) j;
        fx1.E("Out of range: %s", j, ((long) i) == j);
        return i;
    }

    public static final Object F(b24 b24Var, jt1 jt1Var) {
        Object objA = b24Var.a(s77.a, jt1Var);
        return objA == xx1.a ? objA : heb.a;
    }

    public static final Object G(b24 b24Var, yb4 yb4Var, jt1 jt1Var) {
        int i = d34.a;
        Object objF = F(y(A0(b24Var, new xa(yb4Var, (jt1) null, 9)), 0), jt1Var);
        return objF == xx1.a ? objF : heb.a;
    }

    public static final tg3 H(b24 b24Var, b24 b24Var2, b24 b24Var3, b24 b24Var4, bc4 bc4Var) {
        return new tg3(6, new b24[]{b24Var, b24Var2, b24Var3, b24Var4}, bc4Var);
    }

    public static final tg3 I(b24 b24Var, b24 b24Var2, b24 b24Var3, ac4 ac4Var) {
        return new tg3(5, new b24[]{b24Var, b24Var2, b24Var3}, ac4Var);
    }

    public static final b24 J(b24 b24Var, long j) {
        if (j >= 0) {
            return j == 0 ? b24Var : new pp1(new rk2(new ve(j, 4), b24Var, null), 3);
        }
        gp.l("Debounce timeout should not be negative");
        return null;
    }

    public static final byte[] K(String str) {
        str.getClass();
        av0 av0Var = av0.d;
        av0 av0VarQ = ra1.q(str);
        if (av0VarQ != null) {
            return av0VarQ.r();
        }
        return null;
    }

    public static final b24 L(b24 b24Var) {
        return ((b24Var instanceof dr9) || (b24Var instanceof hx2)) ? b24Var : new hx2(b24Var);
    }

    public static final String M(byte[] bArr) {
        bArr.getClass();
        av0 av0Var = av0.d;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        return new av0(Arrays.copyOf(bArrCopyOf, bArrCopyOf.length)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.b24 r7, defpackage.jt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.h34
            if (r0 == 0) goto L13
            r0 = r8
            h34 r0 = (defpackage.h34) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h34 r0 = new h34
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            zy2 r3 = defpackage.y97.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            e34 r7 = r0.b
            rg8 r1 = r0.a
            defpackage.e11.e0(r8)     // Catch: defpackage.j -> L2c
            goto L62
        L2c:
            r8 = move-exception
            goto L57
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L34:
            defpackage.e11.e0(r8)
            rg8 r1 = new rg8
            r1.<init>()
            r1.a = r3
            e34 r8 = new e34
            r5 = 0
            r8.<init>(r5, r1)
            r0.a = r1     // Catch: defpackage.j -> L53
            r0.b = r8     // Catch: defpackage.j -> L53
            r0.d = r4     // Catch: defpackage.j -> L53
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: defpackage.j -> L53
            xx1 r8 = defpackage.xx1.a
            if (r7 != r8) goto L62
            return r8
        L53:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L57:
            java.lang.Object r4 = r8.a
            if (r4 != r7) goto L6d
            jx1 r7 = r0.getContext()
            defpackage.qx1.s(r7)
        L62:
            java.lang.Object r7 = r1.a
            if (r7 == r3) goto L67
            return r7
        L67:
            java.lang.String r7 = "Expected at least one element"
            so9.n(r7)
            return r2
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.N(b24, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.b24 r6, defpackage.yb4 r7, defpackage.kt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.i34
            if (r0 == 0) goto L13
            r0 = r8
            i34 r0 = (defpackage.i34) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i34 r0 = new i34
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            zy2 r3 = defpackage.y97.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            g34 r6 = r0.b
            rg8 r7 = r0.a
            defpackage.e11.e0(r8)     // Catch: defpackage.j -> L2c
            goto L64
        L2c:
            r8 = move-exception
            goto L59
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L34:
            defpackage.e11.e0(r8)
            rg8 r8 = new rg8
            r8.<init>()
            r8.a = r3
            g34 r1 = new g34
            r5 = 0
            r1.<init>(r7, r8, r5)
            r0.a = r8     // Catch: defpackage.j -> L55
            r0.b = r1     // Catch: defpackage.j -> L55
            r0.d = r4     // Catch: defpackage.j -> L55
            java.lang.Object r6 = r6.a(r1, r0)     // Catch: defpackage.j -> L55
            xx1 r7 = defpackage.xx1.a
            if (r6 != r7) goto L53
            return r7
        L53:
            r7 = r8
            goto L64
        L55:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r1
        L59:
            java.lang.Object r1 = r8.a
            if (r1 != r6) goto L6f
            jx1 r6 = r0.getContext()
            defpackage.qx1.s(r6)
        L64:
            java.lang.Object r6 = r7.a
            if (r6 == r3) goto L69
            return r6
        L69:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            so9.n(r6)
            return r2
        L6f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.O(b24, yb4, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.b24 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.k34
            if (r0 == 0) goto L13
            r0 = r6
            k34 r0 = (defpackage.k34) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k34 r0 = new k34
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            e34 r5 = r0.b
            rg8 r1 = r0.a
            defpackage.e11.e0(r6)     // Catch: defpackage.j -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L32:
            defpackage.e11.e0(r6)
            rg8 r1 = new rg8
            r1.<init>()
            e34 r6 = new e34
            r6.<init>(r2, r1)
            r0.a = r1     // Catch: defpackage.j -> L4e
            r0.b = r6     // Catch: defpackage.j -> L4e
            r0.d = r2     // Catch: defpackage.j -> L4e
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: defpackage.j -> L4e
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L5d
            return r6
        L4e:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L52:
            java.lang.Object r2 = r6.a
            if (r2 != r5) goto L60
            jx1 r5 = r0.getContext()
            defpackage.qx1.s(r5)
        L5d:
            java.lang.Object r5 = r1.a
            return r5
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.P(b24, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(defpackage.b24 r4, defpackage.yb4 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.l34
            if (r0 == 0) goto L13
            r0 = r6
            l34 r0 = (defpackage.l34) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            l34 r0 = new l34
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            g34 r4 = r0.b
            rg8 r5 = r0.a
            defpackage.e11.e0(r6)     // Catch: defpackage.j -> L29
            goto L5f
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.e11.e0(r6)
            rg8 r6 = new rg8
            r6.<init>()
            g34 r1 = new g34
            r1.<init>(r5, r6, r2)
            r0.a = r6     // Catch: defpackage.j -> L50
            r0.b = r1     // Catch: defpackage.j -> L50
            r0.d = r2     // Catch: defpackage.j -> L50
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: defpackage.j -> L50
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L4e
            return r5
        L4e:
            r5 = r6
            goto L5f
        L50:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L54:
            java.lang.Object r1 = r6.a
            if (r1 != r4) goto L62
            jx1 r4 = r0.getContext()
            defpackage.qx1.s(r4)
        L5f:
            java.lang.Object r4 = r5.a
            return r4
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.Q(b24, yb4, kt1):java.lang.Object");
    }

    public static final c14 R(g18 g18Var, String str, float f) {
        g18Var.getClass();
        return new c14(g18Var, str, f);
    }

    public static final b24 S(b24 b24Var, jx1 jx1Var) {
        if (jx1Var.get(s00.s) == null) {
            return jx1Var.equals(hc3.a) ? b24Var : b24Var instanceof mc4 ? ex1.Q((mc4) b24Var, jx1Var, 0, null, 6) : new n11(b24Var, jx1Var, 0, null, 12);
        }
        k27.k(jx1Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static n32 T(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            gp.j("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return n32.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            k27.g(dx1.f(s2, "Unsupported version number: "));
                        }
                    } else {
                        k27.g(dx1.f(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), U(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException e) {
            cp4.k().j(k62.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            cp4.k().j(k62.a, "Error in Data#fromByteArray: ", e2);
        }
        return new n32(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable U(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r02 = new Byte[i3];
            while (i < i3) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r03 = new Integer[i4];
            while (i < i4) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r04 = new Long[i5];
            while (i < i5) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r05 = new Float[i6];
            while (i < i6) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r06 = new Double[i7];
            while (i < i7) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b != 14) {
            gp.j(dx1.f(b, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r1 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (lc5.Q(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r1[i] = utf;
            i++;
        }
        return r1;
    }

    public static int V(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static final ArrayList W(dc5 dc5Var) {
        dc5Var.getClass();
        sn5 sn5VarH0 = ((k66) dc5Var).H0();
        boolean zE0 = e0(sn5VarH0);
        iz6 iz6VarP = sn5VarH0.p();
        g07 g07Var = (g07) iz6VarP.b;
        ArrayList arrayList = new ArrayList(g07Var.c);
        int i = g07Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            sn5 sn5Var = (sn5) iz6VarP.get(i2);
            arrayList.add(zE0 ? sn5Var.m() : sn5Var.n());
        }
        return arrayList;
    }

    public static long Y(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i4 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    public static final bq8 Z(ca6 ca6Var) {
        Object objF = ca6Var.F();
        if (objF instanceof bq8) {
            return (bq8) objF;
        }
        return null;
    }

    public static final void a(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        lc1 pm8Var;
        dd4Var.h0(1319969574);
        int i2 = (dd4Var.h(kb4Var2) ? 2048 : 1024) | i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16);
        byte b = 0;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = str.length();
                objQ = dk9.x(new wga(upperCase, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            boolean zF = dd4Var.f(((wga) a07Var.getValue()).a.b);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                try {
                    pm8Var = new lc1(kf0.H(((wga) a07Var.getValue()).a.b));
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                objQ2 = Boolean.valueOf(pm8Var instanceof pm8);
                dd4Var.p0(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            z8.d(z, kb4Var, jf0.G(7218002, new xi6(zBooleanValue, kb4Var2, a07Var, b), dd4Var), null, yib.E(lu6.a, 14), jf0.G(-1446248465, new gs6(kb4Var, 11, b), dd4Var), fw.h, null, 0L, 0L, 0.0f, false, false, jf0.G(540786682, new yi6(zBooleanValue, a07Var, b), dd4Var), dd4Var, (i2 & 14) | 1769904, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z, str, kb4Var, kb4Var2, i, 1);
        }
    }

    public static final Matrix a0(int i, int i2, float f, float f2, int i3, int i4) {
        if (i3 <= 0) {
            gp.l("Page width must be greater than 0");
            return null;
        }
        if (i4 <= 0) {
            gp.l("Page height must be greater than 0");
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f / i3, f2 / i4);
        matrix.postTranslate(-i, -i2);
        return matrix;
    }

    public static final void b(String str, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        boolean z;
        Object obj;
        boolean z2;
        Object obj2;
        a07 a07Var;
        Object obj3;
        dd4Var.h0(-200283908);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            boolean z3 = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj4 = objQ;
            if (z3 || objQ == fu6Var) {
                cn7 cn7VarX = dk9.x(ny1.F(kf0.H(str)));
                dd4Var.p0(cn7VarX);
                obj4 = cn7VarX;
            }
            a07 a07Var2 = (a07) obj4;
            boolean zF = dd4Var.f((xp4) a07Var2.getValue());
            Object objQ2 = dd4Var.Q();
            Object obj5 = objQ2;
            if (zF || objQ2 == fu6Var) {
                cn7 cn7VarX2 = dk9.x(new lc1(e11.f0((xp4) a07Var2.getValue())));
                dd4Var.p0(cn7VarX2);
                obj5 = cn7VarX2;
            }
            a07 a07Var3 = (a07) obj5;
            Object objQ3 = dd4Var.Q();
            Object obj6 = objQ3;
            if (objQ3 == fu6Var) {
                cn7 cn7VarX3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(cn7VarX3);
                obj6 = cn7VarX3;
            }
            a07 a07Var4 = (a07) obj6;
            Object objQ4 = dd4Var.Q();
            Object obj7 = objQ4;
            if (objQ4 == fu6Var) {
                b4c b4cVarI = qx1.i();
                dd4Var.p0(b4cVarI);
                obj7 = b4cVarI;
            }
            vb8 vb8Var = (vb8) obj7;
            ou6 ou6VarN0 = gjb.n0(ou6Var, 24.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
            wf0 wf0Var = bv4.w;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF);
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
            ou6 ou6VarN = tg9.n(lu6Var, 56.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarN, ((q96) dd4Var.j(ur9Var)).c.c);
            long j = ((lc1) a07Var3.getValue()).a;
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6VarW, j, lp4Var);
            boolean zF2 = dd4Var.f(a07Var2) | dd4Var.h(vb8Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == fu6Var) {
                z = false;
                bj6 bj6Var = new bj6(vb8Var, a07Var2, 0);
                dd4Var.p0(bj6Var);
                obj = bj6Var;
            } else {
                z = false;
                obj = objQ5;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) obj, ou6VarL, z, 15);
            ha6 ha6VarD = pn0.d(bv4.f, z);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarJ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            mx4.a(i25.c((m53) f53.n0.getValue(), dd4Var, 0), (String) null, (ou6) null, dd1.b(((lc1) a07Var3.getValue()).a, dd4Var), dd4Var, 48, 4);
            ky0.A(dd4Var, true, lu6Var, 16.0f, dd4Var);
            ga1 ga1Var = (ga1) dd4Var.j(xm1.f);
            Object objQ6 = dd4Var.Q();
            Object obj8 = objQ6;
            if (objQ6 == fu6Var) {
                vx1 vx1VarZ = lc5.Z(dd4Var);
                dd4Var.p0(vx1VarZ);
                obj8 = vx1VarZ;
            }
            vx1 vx1Var = (vx1) obj8;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarL2 = fe.L(t96.w(tg9.h(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 56.0f), ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), lp4Var);
            Object objQ7 = dd4Var.Q();
            Object obj9 = objQ7;
            if (objQ7 == fu6Var) {
                lz4 lz4Var = new lz4(a07Var4, 17);
                dd4Var.p0(lz4Var);
                obj9 = lz4Var;
            }
            ou6 ou6VarN02 = gjb.n0(fw.J(null, (ib4) obj9, ou6VarL2, false, 15), 12.0f, 0.0f, 2);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN02);
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
            boolean zE = dd4Var.e(((lc1) a07Var3.getValue()).a);
            Object objQ8 = dd4Var.Q();
            if (zE || objQ8 == fu6Var) {
                z2 = false;
                String upperCase = kf0.X(((lc1) a07Var3.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                dd4Var.p0(upperCase);
                obj2 = upperCase;
            } else {
                z2 = false;
                obj2 = objQ8;
            }
            String str2 = (String) obj2;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.h;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            boolean z4 = z2;
            nha.c(str2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131068);
            p35 p35VarC = i25.c((m53) a53.C.getValue(), dd4Var, z4 ? 1 : 0);
            ou6 ou6VarN2 = tg9.n(lu6Var, 44.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW2 = t96.w(ou6VarN2, rp8Var);
            boolean zH = dd4Var.h(vx1Var) | dd4Var.h(ga1Var) | dd4Var.f(a07Var3);
            Object objQ9 = dd4Var.Q();
            Object obj10 = objQ9;
            if (zH || objQ9 == fu6Var) {
                cj6 cj6Var = new cj6(vx1Var, ga1Var, a07Var3, z4 ? 1 : 0);
                dd4Var.p0(cj6Var);
                obj10 = cj6Var;
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) obj10, ou6VarW2, z4, 15), 10.0f), 0L, dd4Var, 48, 8);
            p35 p35VarC2 = i25.c((m53) f53.g0.getValue(), dd4Var, z4 ? 1 : 0);
            ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 44.0f), rp8Var);
            boolean zF3 = dd4Var.f(a07VarA) | dd4Var.f(a07Var3);
            Object objQ10 = dd4Var.Q();
            Object obj11 = objQ10;
            if (zF3 || objQ10 == fu6Var) {
                x41 x41Var = new x41(a07VarA, a07Var3, 12);
                dd4Var.p0(x41Var);
                obj11 = x41Var;
            }
            mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) obj11, ou6VarW3, z4, 15), 10.0f), 0L, dd4Var, 48, 8);
            un9.a(dd4Var, xv5.g(dd4Var, true, true, lu6Var, 16.0f));
            xp4 xp4Var = (xp4) a07Var2.getValue();
            ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 280.0f);
            boolean zF4 = dd4Var.f(a07Var3);
            Object objQ11 = dd4Var.Q();
            Object obj12 = objQ11;
            if (zF4 || objQ11 == fu6Var) {
                ci6 ci6Var = new ci6(a07Var3, 15);
                dd4Var.p0(ci6Var);
                obj12 = ci6Var;
            }
            lc5.f(ou6VarH, xp4Var, false, (kb4) obj12, dd4Var, 390);
            un9.a(dd4Var, tg9.h(lu6Var, 16.0f));
            String strK = wn9.K((pv9) mu9.U.getValue(), dd4Var);
            boolean zF5 = dd4Var.f(a07VarA) | dd4Var.f(a07Var3);
            Object objQ12 = dd4Var.Q();
            int i3 = 11;
            Object obj13 = objQ12;
            if (zF5 || objQ12 == fu6Var) {
                x41 x41Var2 = new x41(a07VarA, a07Var3, i3);
                dd4Var.p0(x41Var2);
                obj13 = x41Var2;
            }
            kc5.n(null, strK, false, null, null, null, null, null, (ib4) obj13, dd4Var, 0, 253);
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var4.getValue()).booleanValue();
            boolean zE2 = dd4Var.e(((lc1) a07Var3.getValue()).a);
            Object objQ13 = dd4Var.Q();
            Object obj14 = objQ13;
            if (zE2 || objQ13 == fu6Var) {
                String strX = kf0.X(((lc1) a07Var3.getValue()).a, true, z4);
                dd4Var.p0(strX);
                obj14 = strX;
            }
            String str3 = (String) obj14;
            Object objQ14 = dd4Var.Q();
            if (objQ14 == fu6Var) {
                a07Var = a07Var4;
                ci6 ci6Var2 = new ci6(a07Var, 11);
                dd4Var.p0(ci6Var2);
                obj3 = ci6Var2;
            } else {
                a07Var = a07Var4;
                obj3 = objQ14;
            }
            kb4 kb4Var2 = (kb4) obj3;
            boolean zF6 = dd4Var.f(a07Var2);
            Object objQ15 = dd4Var.Q();
            Object obj15 = objQ15;
            if (zF6 || objQ15 == fu6Var) {
                rl0 rl0Var = new rl0(a07Var2, a07Var, 15);
                dd4Var.p0(rl0Var);
                obj15 = rl0Var;
            }
            a(384, kb4Var2, (kb4) obj15, dd4Var, str3, zBooleanValue);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(str, ou6Var, kb4Var, i, 23);
        }
    }

    public static final float b0(bq8 bq8Var) {
        if (bq8Var != null) {
            return bq8Var.a;
        }
        return 0.0f;
    }

    public static final void c(List list, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        ib4 ib4Var2;
        Object x5Var;
        int i2;
        ou6 ou6Var2;
        Object obj;
        br9 br9Var;
        float f;
        boolean z;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(69106511);
        int i3 = i | (dd4Var2.h(list) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            pj4 pj4VarA = e36.a(dd4Var2);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            o55 o55Var = (o55) ((qtb) qx1.N(ug8.a(o55.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var2), null));
            a07 a07VarB = bx1.B(o55Var.e, dd4Var2);
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = dk9.x(list);
                dd4Var2.p0(objQ);
            }
            br9 br9Var2 = (a07) objQ;
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
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(ou6Var3, 1.0f), 12.0f, 0.0f, 2), 12.0f, 8.0f, 0.0f, 0.0f, 12);
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
            String strK = wn9.K((pv9) iu9.A.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, 0, 0, 131064);
            d6a d6aVar = a53.w;
            p35 p35VarC = i25.c((m53) d6aVar.getValue(), dd4Var, 0);
            long j = ((q96) dd4Var.j(ur9Var)).a.q;
            ou6 ou6VarW = t96.w(tg9.n(ou6Var3, 32.0f), tp8.a);
            int i4 = i3 & 7168;
            boolean z2 = i4 == 2048;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj2) {
                objQ2 = new pm6(1, ib4Var);
                dd4Var.p0(objQ2);
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW, false, 15), 6.0f), j, dd4Var, 48, 0);
            xv5.z(dd4Var, true, ou6Var3, 8.0f, dd4Var);
            ou6 ou6VarJ = tg9.j(ou6Var3, 0.0f, 400.0f, 1);
            boolean zH = dd4Var.h(list) | dd4Var.f(a07VarB) | ((i3 & 896) == 256) | (i4 == 2048);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == obj2) {
                i2 = i4;
                ou6Var2 = ou6Var3;
                obj = obj2;
                br9Var = br9Var2;
                f = 32.0f;
                x5Var = new x5((Object) list, (Object) kb4Var, (Object) ib4Var, (a07) br9Var, a07VarB, 8);
                dd4Var.p0(x5Var);
            } else {
                ou6Var2 = ou6Var3;
                obj = obj2;
                x5Var = objQ3;
                br9Var = br9Var2;
                f = 32.0f;
                i2 = i4;
            }
            int i5 = i2;
            float f2 = f;
            ou6 ou6Var4 = ou6Var2;
            Object obj3 = obj;
            rw1.j(ou6VarJ, null, null, false, null, null, null, false, null, (kb4) x5Var, dd4Var, 6, 510);
            dd4Var2 = dd4Var;
            if (!((r55) a07VarB.getValue()).a.isEmpty()) {
                dd4Var2.f0(2107960131);
                sdc.y(tg9.n(gjb.l0(new xo4(bv4.A), 24.0f), f2), 0L, null, dd4Var2, 0, 6);
                dd4Var2.q(false);
                ib4Var2 = ib4Var;
                z = true;
            } else if (((r55) a07VarB.getValue()).c.isEmpty() && ((r55) a07VarB.getValue()).b.isEmpty()) {
                dd4Var2.f0(2108587602);
                p35 p35VarC2 = i25.c((m53) a53.a.getValue(), dd4Var2, 0);
                String strL = wn9.L((pv9) iu9.w.getValue(), new Object[]{Integer.valueOf(((List) br9Var.getValue()).size())}, dd4Var2);
                boolean z3 = !((List) br9Var.getValue()).isEmpty();
                ou6 ou6VarF = tg9.f(gjb.l0(ou6Var4, 24.0f), 1.0f);
                boolean zF = dd4Var2.f(o55Var);
                Object objQ4 = dd4Var2.Q();
                if (zF || objQ4 == obj3) {
                    objQ4 = new vf6(16, o55Var, br9Var);
                    dd4Var2.p0(objQ4);
                }
                ib4Var2 = ib4Var;
                z = true;
                kc5.n(p35VarC2, strL, z3, null, ou6VarF, null, null, null, (ib4) objQ4, dd4Var, 24576, 232);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                ib4Var2 = ib4Var;
                z = true;
                dd4Var2.f0(2108257018);
                p35 p35VarC3 = i25.c((m53) d6aVar.getValue(), dd4Var2, 0);
                String strK2 = wn9.K((pv9) vt9.w0.getValue(), dd4Var2);
                ou6 ou6VarF2 = tg9.f(gjb.l0(ou6Var4, 24.0f), 1.0f);
                boolean z4 = i5 == 2048;
                Object objQ5 = dd4Var2.Q();
                if (z4 || objQ5 == obj3) {
                    objQ5 = new pm6(2, ib4Var2);
                    dd4Var2.p0(objQ5);
                }
                kc5.n(p35VarC3, strK2, false, null, ou6VarF2, null, null, null, (ib4) objQ5, dd4Var, 24576, 236);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(z);
        } else {
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(list, ou6Var, kb4Var, ib4Var2, i, 28);
        }
    }

    public static int c0(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final wq5 wq5Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, dd4 dd4Var, int i2, int i3) {
        int i4;
        int i5;
        br9 br9Var;
        ym7 ym7Var;
        br9 br9Var2;
        Object obj;
        ym7 ym7Var2;
        final br9 br9Var3;
        final float f3;
        br9 br9Var4;
        Object obj2;
        br9 br9Var5;
        int i6;
        br9 br9Var6;
        ym7 ym7Var3;
        br9 br9Var7;
        br9 br9Var8;
        wq5 wq5Var2;
        int i7;
        wq5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-1888260668);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(wq5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(lu6.a) ? 32 : 16;
        }
        int i8 = i2 & 384;
        int i9 = Token.CASE;
        if (i8 == 0) {
            i4 |= dd4Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.c(f) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.c(f2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.e(j2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.f(t89Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (dd4Var.d(ux8Var == null ? -1 : ux8Var.ordinal()) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.d(tx8Var != null ? tx8Var.ordinal() : -1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (dd4Var.d(i)) {
                i9 = 256;
            }
            i5 |= i9;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.h((Object) null) ? 2048 : 1024;
        }
        int i10 = i5;
        if (dd4Var.V(i4 & 1, ((306783379 & i4) == 306783378 && (i10 & 1171) == 1170) ? false : true)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj3 = vl1.a;
            if (objQ == obj3) {
                objQ = dk9.n(new br5(wq5Var, 0));
                dd4Var.p0(objQ);
            }
            br9 br9Var9 = (br9) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj3) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var = (vx1) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj3) {
                objQ3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ3);
            }
            br9 br9Var10 = (a07) objQ3;
            int i11 = i4;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj3) {
                br9Var = br9Var9;
                objQ4 = new ym7(0.0f);
                dd4Var.p0(objQ4);
            } else {
                br9Var = br9Var9;
            }
            ym7 ym7Var4 = (ym7) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj3) {
                ym7Var = ym7Var4;
                objQ5 = dk9.n(new br5(wq5Var, 1));
                dd4Var.p0(objQ5);
            } else {
                ym7Var = ym7Var4;
            }
            final br9 br9Var11 = (br9) objQ5;
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj3) {
                objQ6 = dk9.n(new br5(wq5Var, 2));
                dd4Var.p0(objQ6);
            }
            final br9 br9Var12 = (br9) objQ6;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj3) {
                objQ7 = dk9.n(new br5(wq5Var, 3));
                dd4Var.p0(objQ7);
            }
            br9 br9Var13 = (br9) objQ7;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj3) {
                br9Var2 = br9Var13;
                objQ8 = dk9.n(new al3(24, wq5Var, br9Var12));
                dd4Var.p0(objQ8);
            } else {
                br9Var2 = br9Var13;
            }
            br9 br9Var14 = (br9) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj3) {
                obj = obj3;
                ym7Var2 = ym7Var;
                br9Var3 = br9Var2;
                objQ9 = dk9.n(new wp0(wq5Var, br9Var12, br9Var3, br9Var14, 5));
                dd4Var.p0(objQ9);
            } else {
                obj = obj3;
                ym7Var2 = ym7Var;
                br9Var3 = br9Var2;
            }
            final br9 br9Var15 = (br9) objQ9;
            Object objQ10 = dd4Var.Q();
            if (objQ10 == obj) {
                f3 = f2;
                objQ10 = dk9.n(new jp5(f3, br9Var15, 1));
                dd4Var.p0(objQ10);
            } else {
                f3 = f2;
            }
            br9 br9Var16 = (br9) objQ10;
            Object objQ11 = dd4Var.Q();
            if (objQ11 == obj) {
                obj2 = obj;
                br9Var4 = br9Var16;
                br9Var5 = br9Var11;
                objQ11 = dk9.n(new ib4() { // from class: zq5
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        kq5 kq5Var;
                        wq5 wq5Var3 = wq5Var;
                        jq5 jq5VarJ = wq5Var3.j();
                        float f4 = 0.0f;
                        if (jq5VarJ.p != 0 && !jq5VarJ.m.isEmpty() && (kq5Var = (kq5) br9Var12.getValue()) != null) {
                            float fIntValue = kq5Var.a / ((Number) br9Var3.getValue()).intValue();
                            int i12 = wq5Var3.i();
                            int i13 = (int) (kq5Var.t & 4294967295L);
                            float fIntValue2 = ((i13 == 0 ? 0.0f : i12 / i13) + fIntValue) / (jq5VarJ.p / ((Number) r5.getValue()).intValue());
                            br9 br9Var17 = br9Var15;
                            float fP = wx1.P(1.0f - ((Number) br9Var17.getValue()).floatValue(), 0.0f, 1.0f);
                            float fFloatValue = ((Number) br9Var17.getValue()).floatValue();
                            float f5 = f3;
                            br9 br9Var18 = br9Var11;
                            if (fFloatValue >= f5) {
                                f4 = ((Boolean) br9Var18.getValue()).booleanValue() ? fP - fIntValue2 : fIntValue2;
                            } else {
                                float f6 = 1.0f - f5;
                                f4 = ((Boolean) br9Var18.getValue()).booleanValue() ? ((fP - fIntValue2) * f6) / fP : (fIntValue2 * f6) / fP;
                            }
                        }
                        return Float.valueOf(f4);
                    }
                });
                dd4Var.p0(objQ11);
            } else {
                br9Var4 = br9Var16;
                obj2 = obj;
                br9Var5 = br9Var11;
            }
            br9 br9Var17 = (br9) objQ11;
            Object objQ12 = dd4Var.Q();
            if (objQ12 == obj2) {
                i6 = 1;
                objQ12 = new lp5(br9Var4, ym7Var2, i6);
                dd4Var.p0(objQ12);
            } else {
                i6 = 1;
            }
            kb4 kb4Var = (kb4) objQ12;
            Object objQ13 = dd4Var.Q();
            if (objQ13 == obj2) {
                ym7Var3 = ym7Var2;
                br9Var6 = br9Var17;
                br9Var7 = br9Var10;
                br9Var8 = br9Var;
                i7 = i10;
                objQ13 = new ar5(kb4Var, wq5Var, vx1Var, br9Var3, ym7Var3, f2, br9Var15, br9Var12, 0);
                i6 = i6;
                kb4Var = kb4Var;
                wq5Var2 = wq5Var;
                dd4Var.p0(objQ13);
            } else {
                br9Var6 = br9Var17;
                ym7Var3 = ym7Var2;
                br9Var7 = br9Var10;
                br9Var8 = br9Var;
                wq5Var2 = wq5Var;
                i7 = i10;
            }
            kb4 kb4Var2 = (kb4) objQ13;
            Object objQ14 = dd4Var.Q();
            if (objQ14 == obj2) {
                objQ14 = new tn4(br9Var7, 22);
                dd4Var.p0(objQ14);
            }
            kb4 kb4Var3 = (kb4) objQ14;
            boolean z2 = (wq5Var2.h.a() || ((Boolean) br9Var7.getValue()).booleanValue()) ? i6 : 0;
            Object objQ15 = dd4Var.Q();
            if (objQ15 == obj2) {
                objQ15 = new op0(br9Var8, 8);
                dd4Var.p0(objQ15);
            }
            ib4 ib4Var = (ib4) objQ15;
            boolean zBooleanValue = ((Boolean) br9Var7.getValue()).booleanValue();
            float fH = ym7Var3.h();
            boolean zBooleanValue2 = ((Boolean) br9Var5.getValue()).booleanValue();
            Object objQ16 = dd4Var.Q();
            if (objQ16 == obj2) {
                objQ16 = new op0(br9Var4, 9);
                dd4Var.p0(objQ16);
            }
            ib4 ib4Var2 = (ib4) objQ16;
            Object objQ17 = dd4Var.Q();
            if (objQ17 == obj2) {
                objQ17 = new op0(br9Var6, 10);
                dd4Var.p0(objQ17);
            }
            int i12 = i11 >> 3;
            g(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, zBooleanValue, fH, zBooleanValue2, ib4Var2, (ib4) objQ17, z2, kb4Var, kb4Var2, kb4Var3, dd4Var, (i12 & 29360128) | (i12 & 14) | ((i11 >> 12) & Token.ASSIGN_MOD) | (i11 & 896) | ((i7 << 3) & 7168) | ((i11 >> 15) & 57344) | ((i11 << 3) & 458752) | (3670016 & i12) | ((i7 << 21) & 234881024) | ((i7 << 27) & 1879048192), ((i7 >> 9) & 14) | 907739184);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qp5(wq5Var, z, f, pj7Var, f2, j, j2, t89Var, ux8Var, tx8Var, i, i2, i3);
        }
    }

    public static final x95 d0(g18 g18Var, String str, int i) {
        g18Var.getClass();
        return new x95(g18Var, str, i);
    }

    public static final long e(int i) {
        long j = ((long) i) << 32;
        int i2 = aj5.R;
        return j;
    }

    public static final boolean e0(sn5 sn5Var) {
        int iOrdinal = sn5Var.T.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            mn5.g();
                            return false;
                        }
                        sn5 sn5VarV = sn5Var.v();
                        if (sn5VarV != null) {
                            return e0(sn5VarV);
                        }
                        gp.l("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void f(wq5 wq5Var, ou6 ou6Var, boolean z, float f, pj7 pj7Var, float f2, long j, long j2, t89 t89Var, ux8 ux8Var, tx8 tx8Var, int i, boolean z2, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        long j3;
        dd4 dd4Var2;
        boolean z3;
        float f3;
        t89 t89Var2;
        ux8 ux8Var2;
        tx8 tx8Var2;
        boolean z4;
        int i4;
        t89 t89Var3;
        float f4;
        ux8 ux8Var3;
        tx8 tx8Var3;
        boolean z5;
        boolean z6;
        wq5Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(1723628588);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(wq5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i5 |= dd4Var.c(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            pj7Var2 = pj7Var;
            i5 |= dd4Var.f(pj7Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            pj7Var2 = pj7Var;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            j3 = j;
            i6 |= dd4Var.e(j3) ? 8388608 : 4194304;
        } else {
            j3 = j;
        }
        if ((100663296 & i2) == 0) {
            i6 |= dd4Var.e(j2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= 268435456;
        }
        if (dd4Var.V(i6 & 1, (306783379 & i6) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                i4 = i6 & (-1879048193);
                t89Var3 = tp8.a;
                f4 = 0.1f;
                ux8Var3 = ux8.a;
                tx8Var3 = tx8.a;
                z5 = true;
                z6 = true;
            } else {
                dd4Var.Y();
                f4 = f2;
                t89Var3 = t89Var;
                ux8Var3 = ux8Var;
                tx8Var3 = tx8Var;
                z6 = z2;
                i4 = i6 & (-1879048193);
                z5 = z;
            }
            dd4Var.r();
            if (z6) {
                dd4Var.f0(-2008914131);
                ha6 ha6VarD = pn0.d(bv4.b, false);
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
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                rj1Var.invoke(dd4Var, 6);
                z3 = z5;
                d(wq5Var, z3, f, pj7Var2, f4, j3, j2, t89Var3, ux8Var3, tx8Var3, i, dd4Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), 3510);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                dd4Var.f0(-2008968195);
                rj1Var.invoke(dd4Var, 6);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
                z3 = z5;
            }
            f3 = f4;
            t89Var2 = t89Var3;
            ux8Var2 = ux8Var3;
            tx8Var2 = tx8Var3;
            z4 = z6;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            z3 = z;
            f3 = f2;
            t89Var2 = t89Var;
            ux8Var2 = ux8Var;
            tx8Var2 = tx8Var;
            z4 = z2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ip5(wq5Var, ou6Var, z3, f, pj7Var, f3, j, j2, t89Var2, ux8Var2, tx8Var2, i, z4, rj1Var, i2, 1);
        }
    }

    public static final void f0(v24 v24Var, vx1 vx1Var) {
        ah1.J(vx1Var, null, null, new rf(v24Var, null, 27), 3);
    }

    public static final void g(pj7 pj7Var, boolean z, int i, t89 t89Var, float f, long j, long j2, tx8 tx8Var, ux8 ux8Var, ib4 ib4Var, boolean z2, float f2, boolean z3, ib4 ib4Var2, ib4 ib4Var3, boolean z4, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2, int i3) {
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        float f3;
        dd4Var.h0(-1266139707);
        int i7 = i2 & 6;
        lu6 lu6Var = lu6.a;
        if (i7 == 0) {
            i4 = (dd4Var.f(lu6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z;
            i4 |= dd4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.f(t89Var) ? 16384 : 8192;
        }
        int i8 = i2 & 196608;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i4 |= dd4Var.c(f) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.e(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.d(tx8Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 = 805306368;
            i4 |= dd4Var.d(ux8Var.ordinal()) ? 536870912 : 268435456;
        } else {
            i5 = 805306368;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (dd4Var.h((Object) null) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z6 = z2;
            i6 |= dd4Var.g(z6) ? 256 : Token.CASE;
        } else {
            z6 = z2;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i6 |= dd4Var.c(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        int i10 = i4;
        if ((i3 & 24576) == 0) {
            i6 |= dd4Var.g(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.h(ib4Var2)) {
                i9 = 131072;
            }
            i6 |= i9;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= dd4Var.h(ib4Var3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= dd4Var.g(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= dd4Var.h(kb4Var) ? 67108864 : 33554432;
        }
        if ((i3 & i5) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i6 & 306783379) == 306783378) ? false : true)) {
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            int i11 = i10 & Token.ASSIGN_MOD;
            boolean z7 = i11 == 32;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z7 || objQ == obj) {
                objQ = new x13(pj7Var.d());
                dd4Var.p0(objQ);
            }
            float f4 = ((x13) objQ).a;
            boolean z8 = i11 == 32;
            Object objQ2 = dd4Var.Q();
            if (z8 || objQ2 == obj) {
                x13 x13Var = new x13(pj7Var.a());
                dd4Var.p0(x13Var);
                objQ2 = x13Var;
            }
            sdc.e(gjb.p0(ou6VarF, 0.0f, f4, 0.0f, ((x13) objQ2).a, 5), null, jf0.G(312797231, new np5(pj7Var, z5, z6, j2, j, i, t89Var, f, tx8Var, z3, kb4Var2, f3, ux8Var, ib4Var2, ib4Var3, z4, ib4Var, kb4Var, kb4Var3, 1), dd4Var), dd4Var, 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new op5(pj7Var, z, i, t89Var, f, j, j2, tx8Var, ux8Var, ib4Var, z2, f2, z3, ib4Var2, ib4Var3, z4, kb4Var, kb4Var2, kb4Var3, i2, i3, 1);
        }
    }

    public static final q56 g0(g18 g18Var, String str, long j) {
        g18Var.getClass();
        return new q56(g18Var, str, j);
    }

    public static final void h(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(418763505);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.f(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        int i3 = i2 | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        if (!dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-1496216915);
            i(i3 & 8190, kb4Var, kb4Var2, dd4Var, str, z);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1496111918);
            j(i3 & 8190, kb4Var, kb4Var2, dd4Var, str, z);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ui6(z, str, kb4Var, kb4Var2, i, 0);
        }
    }

    public static final u25 h0(u25 u25Var, boolean z) {
        if (!z) {
            return u25Var;
        }
        mr0 mr0VarI0 = u25Var.I0();
        return (mr0VarI0.H(0L, vd2.b) || mr0VarI0.H(0L, vd2.a)) ? y86.e(new ie8(new pa4(u25Var.I0())), u25Var.getFileSystem()) : u25Var;
    }

    public static final void i(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        kb4 kb4Var3;
        dd4Var.h0(-677582239);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.f(str) ? 32 : 16);
        if ((i & 384) == 0) {
            kb4Var3 = kb4Var;
            i2 |= dd4Var.h(kb4Var3) ? 256 : Token.CASE;
        } else {
            kb4Var3 = kb4Var;
        }
        int i3 = i2 | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            fw.q(z, kb4Var3, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-669576771, new aj6(i4, kb4Var2, str), dd4Var), dd4Var, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ui6(z, str, kb4Var, kb4Var2, i, 2);
        }
    }

    public static final String i0(byte[] bArr) {
        av0 av0Var = av0.d;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        return new av0(Arrays.copyOf(bArrCopyOf, bArrCopyOf.length)).c("MD5").e();
    }

    public static final void j(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        kb4 kb4Var3;
        dd4Var.h0(-573905662);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.f(str) ? 32 : 16);
        if ((i & 384) == 0) {
            kb4Var3 = kb4Var;
            i2 |= dd4Var.h(kb4Var3) ? 256 : Token.CASE;
        } else {
            kb4Var3 = kb4Var;
        }
        int i3 = i2 | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            fw.r(z, kb4Var3, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-243094095, new vi6(i4, kb4Var2, str), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ui6(z, str, kb4Var, kb4Var2, i, 1);
        }
    }

    public static final da7 j0(g18 g18Var, String str, oi5 oi5Var) {
        g18Var.getClass();
        oi5Var.getClass();
        return new da7(g18Var, str, oi5Var);
    }

    public static final void k(m55 m55Var, kb4 kb4Var, dd4 dd4Var, int i) {
        m55Var.getClass();
        dd4Var.h0(691716004);
        int i2 = i | (dd4Var.h(kb4Var) ? 32 : 16);
        int i3 = 18;
        int i4 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) m55Var.a.getValue()).booleanValue();
            xf0 xf0Var = bv4.f;
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new rv5(29);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new zm6(i4);
                dd4Var.p0(objQ2);
            }
            cj3 cj3VarA = cj3VarD.a(wd3.q((kb4) objQ2));
            ou6 ou6VarL0 = gjb.l0(yib.E(tg9.t(lu6.a, 0.0f, 400.0f, 1), 15), 24.0f);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new sn4(m55Var, 1);
                dd4Var.p0(objQ3);
            }
            bx1.a(zBooleanValue, (kb4) objQ3, be3VarA, cj3VarA, xf0Var, jC, false, false, ou6VarL0, jf0.G(-1759459834, new qz0(i3, m55Var, kb4Var), dd4Var), dd4Var, 818113920, 64);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xp5(m55Var, kb4Var, i, 13);
        }
    }

    public static void k0(kz9 kz9Var, int i, eq1 eq1Var) {
        long jE = kz9Var.e(i);
        List listM = kz9Var.m(jE);
        if (listM.isEmpty()) {
            return;
        }
        if (i == kz9Var.p() - 1) {
            j31.d();
            return;
        }
        long jE2 = kz9Var.e(i + 1) - kz9Var.e(i);
        if (jE2 > 0) {
            eq1Var.accept(new f22(jE, jE2, listM));
        }
    }

    public static final void l(final boolean z, final boolean z2, final long j, final boolean z3, final kb4 kb4Var, final yb4 yb4Var, dd4 dd4Var, final int i) {
        kb4Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(2015602500);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.e(j) ? 256 : Token.CASE) | (dd4Var.g(z3) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (!dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            dd4Var.Y();
        } else if (z2) {
            dd4Var.f0(-1123470440);
            int i3 = i2 >> 3;
            n(z, j, z3, null, kb4Var, yb4Var, dd4Var, (i2 & 14) | (i3 & Token.ASSIGN_MOD) | (i3 & 896) | 24576 | (i2 & 458752));
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1123236173);
            int i4 = i2 >> 3;
            m(z, j, z3, null, kb4Var, yb4Var, dd4Var, (i2 & 14) | (i4 & Token.ASSIGN_MOD) | (i4 & 896) | 24576 | (i2 & 458752));
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, j, z3, kb4Var, yb4Var, i) { // from class: ts6
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ yb4 f;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(24577);
                    cx1.l(this.a, this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final long l0(p65 p65Var, lh7 lh7Var, o65 o65Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = p65Var.g;
        if (lh7Var != null) {
            int i = o65Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (lh7Var == lh7.b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jG = eb7.g(m0(p65Var, lh7Var, o65Var), j2);
        if (z || !p65Var.i) {
            return jG;
        }
        return 0L;
    }

    public static final void m(boolean z, final long j, final boolean z2, ou6 ou6Var, kb4 kb4Var, final yb4 yb4Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4Var.h0(-221941169);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= dd4Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        int i3 = i2 | 3072 | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            ou6 ou6Var3 = lu6.a;
            fw.q(z, kb4Var, ou6Var3, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1339736747, new zb4() { // from class: vs6
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    dd4 dd4Var2 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ke1) obj).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        cx1.t(j, z2, gjb.p0(gjb.n0(yib.E(tg9.f(lu6.a, 1.0f), 14), 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), yb4Var, dd4Var2, 0, 0);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i3 & 14) | 3504, 48, 2032);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ws6(z, j, z2, ou6Var2, kb4Var, yb4Var, i, 0);
        }
    }

    public static final long m0(p65 p65Var, lh7 lh7Var, o65 o65Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (lh7Var == null) {
            return p65Var.c;
        }
        int i = o65Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (p65Var.c >> 32));
        } else {
            if (i != 2) {
                return p65Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (p65Var.c & 4294967295L));
        }
        if (lh7Var == lh7.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final void n(boolean z, long j, boolean z2, ou6 ou6Var, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4Var.h0(145945627);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= dd4Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        int i3 = i2 | 3072 | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            ou6 ou6Var3 = lu6.a;
            z8.d(z, kb4Var, null, ou6Var3, null, null, lc5.x, null, 0L, 0L, 0.0f, false, false, jf0.G(-1693198905, new no6(j, z2, yb4Var), dd4Var), dd4Var, (i3 & 14) | 1575984, 8116);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ws6(z, j, z2, ou6Var2, kb4Var, yb4Var, i, 1);
        }
    }

    public static final List n0(cr8 cr8Var) {
        int iT = wx1.T(cr8Var, "id");
        int iT2 = wx1.T(cr8Var, "seq");
        int iT3 = wx1.T(cr8Var, "from");
        int iT4 = wx1.T(cr8Var, "to");
        zy5 zy5VarN = gc1.N();
        while (cr8Var.J0()) {
            zy5VarN.add(new g84(cr8Var.m0(iT3), (int) cr8Var.getLong(iT), (int) cr8Var.getLong(iT2), cr8Var.m0(iT4)));
        }
        return fc1.Q0(gc1.J(zy5VarN));
    }

    public static final void o(sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(1187362963);
        int i2 = i & 1;
        int i3 = 1;
        if (!dd4Var.V(i2, i2 != 0)) {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy1(sw8Var, ou6Var, i, i3);
        }
    }

    public static final d9a o0(wq8 wq8Var, String str, boolean z) throws Exception {
        cr8 cr8VarP0 = wq8Var.P0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iT = wx1.T(cr8VarP0, "seqno");
            int iT2 = wx1.T(cr8VarP0, "cid");
            int iT3 = wx1.T(cr8VarP0, "name");
            int iT4 = wx1.T(cr8VarP0, "desc");
            if (iT != -1 && iT2 != -1 && iT3 != -1 && iT4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cr8VarP0.J0()) {
                    if (((int) cr8VarP0.getLong(iT2)) >= 0) {
                        int i = (int) cr8VarP0.getLong(iT);
                        String strM0 = cr8VarP0.m0(iT3);
                        String str2 = cr8VarP0.getLong(iT4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strM0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listR0 = fc1.R0(new zp4(17), linkedHashMap.entrySet());
                ArrayList arrayList = new ArrayList(gc1.M(listR0, 10));
                Iterator it = listR0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listZ0 = fc1.Z0(arrayList);
                List listR02 = fc1.R0(new zp4(18), linkedHashMap2.entrySet());
                ArrayList arrayList2 = new ArrayList(gc1.M(listR02, 10));
                Iterator it2 = listR02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                d9a d9aVar = new d9a(str, z, listZ0, fc1.Z0(arrayList2));
                lc5.U(cr8VarP0, null);
                return d9aVar;
            }
            lc5.U(cr8VarP0, null);
            return null;
        } finally {
        }
    }

    public static final void p(ib4 ib4Var, int i, rj1 rj1Var, dd4 dd4Var, int i2) {
        ib4Var.getClass();
        dd4Var.h0(837179611);
        if ((((dd4Var.d(i) ? 32 : 16) | i2) & Token.EXPR_VOID) == 146 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            dd4Var.f0(1849434622);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(new ea5(0L));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            dd4Var.q(false);
            boolean zBooleanValue = ((Boolean) dd4Var.j(ev1.a)).booleanValue();
            lz7 lz7Var = zBooleanValue ? lz7.a : lz7.c;
            dd4Var.f0(5004770);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new wo6(a07Var, 23);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var = (kb4) objQ2;
            dd4Var.q(false);
            kb4Var.getClass();
            ci.a(new ab6(18, lz7Var, kb4Var), ib4Var, (kz7) null, jf0.G(1150445561, new dz7(a07Var, zBooleanValue, i, rj1Var), dd4Var), dd4Var, 3120, 4);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6(ib4Var, i, rj1Var, i2, 19);
        }
    }

    public static final l46 p0(int i, int i2, dd4 dd4Var) {
        boolean z = true;
        String str = (i2 & 1) != 0 ? "ZoomImage" : "CoilZoomAsyncImage";
        if ((((i & 14) ^ 6) <= 4 || !dd4Var.f(str)) && (i & 6) != 4) {
            z = false;
        }
        Object objQ = dd4Var.Q();
        if (z || objQ == vl1.a) {
            objQ = new l46(str);
            dd4Var.p0(objQ);
        }
        return (l46) objQ;
    }

    public static final yn7 q(yn7 yn7Var, String... strArr) {
        yn7Var.getClass();
        return r(yn7Var.toString(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static int q0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final yn7 r(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                char c = gp7.a;
                if (!bw9.Q(sb, c)) {
                    sb.append(c);
                }
            }
            sb.append(str2);
        }
        return gp7.a(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r0(qg2 r12, boolean r13) {
        /*
            hn7 r0 = new hn7
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.J(r4)
            byte[] r5 = r0.a
            r6 = 0
            boolean r5 = r12.g(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.B()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.a
            boolean r7 = r12.g(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.F()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.J(r3)
            byte[] r4 = r0.a
            r12.g(r4, r6, r3, r6)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.a(r7, r6)
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L9
            r12.a(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.r0(qg2, boolean):boolean");
    }

    public static final void s(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(940315608);
        int i2 = i | (dd4Var.f(t27Var) ? 4 : 2) | (dd4Var.f(pj7Var) ? 256 : Token.CASE) | (dd4Var.f(szbVar) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            zb9 zb9Var = (zb9) ((qtb) qx1.N(ug8.a(zb9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
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
            a07 a07VarB = bx1.B(((mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null))).f, dd4Var);
            a07 a07VarB2 = bx1.B(zb9Var.e, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new aa9(9);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new aa9(10);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            gd9 gd9Var = (gd9) a07VarB2.getValue();
            boolean z = ((iib) a07VarB.getValue()).i;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new cl0(t27Var, 14);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            int i4 = 23;
            if (zF || objQ4 == obj) {
                objQ4 = new rl0(a07Var2, a07Var, i4);
                dd4Var.p0(objQ4);
            }
            sdc.V(gd9Var, z, pj7Var, szbVar, ou6Var, kb4Var, (kb4) objQ4, ib4Var, dd4Var, ((i2 << 9) & 29360128) | (i2 & 8064) | 24576);
            String str = (String) a07Var2.getValue();
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new hp8(a07Var, 19);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var2 = (kb4) objQ5;
            boolean zF3 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new v03(t27Var, a07Var, 4);
                dd4Var.p0(objQ6);
            }
            yb4 yb4Var = (yb4) objQ6;
            boolean zF4 = (i3 == 4) | dd4Var.f(a07Var);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new wt2(t27Var, a07Var, 21);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var3 = (kb4) objQ7;
            boolean zF5 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == obj) {
                objQ8 = new wt2(t27Var, a07Var, 22);
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var4 = (kb4) objQ8;
            boolean zF6 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ9 = dd4Var.Q();
            if (zF6 || objQ9 == obj) {
                objQ9 = new wt2(t27Var, a07Var, i4);
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var5 = (kb4) objQ9;
            boolean zF7 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == obj) {
                objQ10 = new wt2(t27Var, a07Var, 20);
                dd4Var.p0(objQ10);
            }
            qu1.g(zBooleanValue, str, kb4Var2, yb4Var, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ10, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, ou6Var, pj7Var, szbVar, ib4Var, i, 4);
        }
    }

    public static final fe8 s0(b24 b24Var, vx1 vx1Var, ib9 ib9Var, Object obj) {
        ab6 ab6Var;
        k11 k11Var;
        b24 b24VarH;
        h11.i.getClass();
        g11 g11Var = g11.a;
        if (!(b24Var instanceof k11) || (b24VarH = (k11Var = (k11) b24Var).h()) == null) {
            ab6Var = new ab6(27, b24Var, hc3.a);
        } else {
            if (k11Var.b != -3) {
            }
            ab6Var = new ab6(27, b24VarH, k11Var.a);
        }
        fr9 fr9VarA = gr9.a(obj);
        ah1.I(vx1Var, (jx1) ab6Var.c, ib9Var.equals(hb9.a) ? zx1.a : zx1.d, new vg(ib9Var, (b24) ab6Var.b, fr9VarA, obj, (jt1) null));
        return new fe8(fr9VarA);
    }

    public static final void t(long j, boolean z, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i, int i2) {
        ou6 ou6Var2;
        int i3;
        ou6 ou6Var3;
        jm jmVar;
        int i4;
        yb4 yb4Var2;
        a07 a07Var;
        ou6 ou6Var4;
        fu6 fu6Var;
        ib4 ib4Var;
        yb4 yb4Var3;
        yb4 yb4Var4;
        boolean z2;
        a07 a07Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1248428763);
        int i5 = i | (dd4Var2.e(j) ? 4 : 2) | (dd4Var2.g(z) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            ou6Var2 = ou6Var;
        } else {
            ou6Var2 = ou6Var;
            i3 = i5 | (dd4Var2.f(ou6Var2) ? 256 : Token.CASE);
        }
        int i7 = i3 | (dd4Var2.h(yb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i7 & 1, (i7 & 1171) != 1170)) {
            ou6 ou6Var5 = lu6.a;
            ou6 ou6Var6 = i6 != 0 ? ou6Var5 : ou6Var2;
            Object objQ = dd4Var2.Q();
            fu6 fu6Var2 = vl1.a;
            Object obj = objQ;
            if (objQ == fu6Var2) {
                Long[] lArr = {0L, 900L, 1800L, 3600L, 5400L};
                dd4Var2.p0(lArr);
                obj = lArr;
            }
            Long[] lArr2 = (Long[]) obj;
            boolean z3 = (i7 & 14) == 4;
            Object objQ2 = dd4Var2.Q();
            if (z3 || objQ2 == fu6Var2) {
                long j2 = j / 60;
                String strValueOf = String.valueOf(j2 >= 0 ? j2 : 0L);
                int length = strValueOf.length();
                objQ2 = dk9.x(new wga(strValueOf, zk9.h(length, length), 4));
                dd4Var2.p0(objQ2);
            }
            a07 a07Var3 = (a07) objQ2;
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == fu6Var2) {
                int iR0 = fw.r0(Long.valueOf(j), lArr2);
                Integer numValueOf = Integer.valueOf(iR0);
                if (iR0 == -1) {
                    numValueOf = null;
                }
                objQ3 = dk9.x(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 5));
                dd4Var2.p0(objQ3);
            }
            a07 a07Var4 = (a07) objQ3;
            Object objQ4 = dd4Var2.Q();
            if (objQ4 == fu6Var2) {
                objQ4 = dk9.x(Boolean.valueOf(z));
                dd4Var2.p0(objQ4);
            }
            a07 a07Var5 = (a07) objQ4;
            List listR = wm9.r((hv9) rv.G.getValue(), dd4Var2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var6);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var5 = ll1.f;
            un9.s(yb4Var5, dd4Var2, ie1VarA);
            yb4 yb4Var6 = ll1.e;
            un9.s(yb4Var6, dd4Var2, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf2);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            yb4 yb4Var7 = ll1.d;
            un9.s(yb4Var7, dd4Var2, ou6VarL0);
            ou6 ou6Var7 = ou6Var6;
            jt1 jt1Var = null;
            yn2.b(gjb.m0(tg9.f(ou6Var5, 1.0f), 12.0f, 12.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(-2112190218, new ok6(listR, a07Var4, 3), dd4Var2), dd4Var, 1573302);
            dd4 dd4Var3 = dd4Var;
            if (((Number) a07Var4.getValue()).intValue() == 5) {
                dd4Var3.f0(-551617898);
                Object objQ5 = dd4Var3.Q();
                if (objQ5 == fu6Var2) {
                    objQ5 = ky0.f(dd4Var3);
                }
                z44 z44Var = (z44) objQ5;
                Object objQ6 = dd4Var3.Q();
                if (objQ6 == fu6Var2) {
                    objQ6 = new am3(z44Var, jt1Var, 6);
                    dd4Var3.p0(objQ6);
                }
                lc5.u((yb4) objQ6, dd4Var3, heb.a);
                wga wgaVar = (wga) a07Var3.getValue();
                qj5 qj5Var = new qj5(3, 7, Token.HOOK);
                uw1 uw1Var = ((q96) dd4Var3.j(s96.a)).c.b;
                ou6 ou6VarN0 = gjb.n0(jv3.B(tg9.f(ou6Var5, 1.0f), z44Var), 12.0f, 0.0f, 2);
                boolean zF = dd4Var3.f(a07Var3);
                Object objQ7 = dd4Var3.Q();
                if (zF || objQ7 == fu6Var2) {
                    objQ7 = new wo6(a07Var3, 16);
                    dd4Var3.p0(objQ7);
                }
                jmVar = jmVar2;
                i4 = i7;
                yb4Var2 = yb4Var6;
                ou6Var4 = ou6Var5;
                yb4Var3 = yb4Var7;
                fu6Var = fu6Var2;
                a07Var = a07Var3;
                ib4Var = ib4Var2;
                yb4Var4 = yb4Var5;
                z2 = false;
                lx1.l(wgaVar, (kb4) objQ7, ou6VarN0, false, null, lc5.y, lc5.z, null, false, null, qj5Var, null, true, 0, 0, uw1Var, null, dd4Var, 102236160, 12779520, 6127288);
                dd4Var3 = dd4Var;
                dd4Var3.q(false);
            } else {
                jmVar = jmVar2;
                i4 = i7;
                yb4Var2 = yb4Var6;
                a07Var = a07Var3;
                ou6Var4 = ou6Var5;
                fu6Var = fu6Var2;
                ib4Var = ib4Var2;
                yb4Var3 = yb4Var7;
                yb4Var4 = yb4Var5;
                z2 = false;
                dd4Var3.f0(-550515631);
                dd4Var3.q(false);
            }
            ou6 ou6VarN02 = gjb.n0(tg9.f(ou6Var4, 1.0f), 4.0f, 0.0f, 2);
            Object objQ8 = dd4Var3.Q();
            if (objQ8 == fu6Var) {
                a07Var2 = a07Var5;
                objQ8 = new bq6(a07Var2, 11);
                dd4Var3.p0(objQ8);
            } else {
                a07Var2 = a07Var5;
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ8, dd4Var3, ou6VarN02, z2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var3, 48);
            int iHashCode2 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL2 = dd4Var3.l();
            ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarV);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(ib4Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(yb4Var4, dd4Var3, eq8VarA);
            un9.s(yb4Var2, dd4Var3, lr7VarL2);
            ky0.v(iHashCode2, dd4Var3, jmVar, dd4Var3, kdVar);
            un9.s(yb4Var3, dd4Var3, ou6VarL02);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            Object objQ9 = dd4Var3.Q();
            if (objQ9 == fu6Var) {
                objQ9 = new wo6(a07Var2, 17);
                dd4Var3.p0(objQ9);
            }
            vo1.e(zBooleanValue, (kb4) objQ9, null, false, null, dd4Var3, 48);
            a07 a07Var6 = a07Var2;
            nha.c(wn9.K((pv9) ev9.D.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(s96.a)).b.j, dd4Var, 0, 0, 131070);
            xv5.z(dd4Var, true, ou6Var4, 12.0f, dd4Var);
            p35 p35VarC = i25.c((m53) a53.v.getValue(), dd4Var, 0);
            String strK = wn9.K((pv9) mu9.U.getValue(), dd4Var);
            ou6 ou6VarN03 = gjb.n0(tg9.f(ou6Var4, 1.0f), 16.0f, 0.0f, 2);
            a07 a07Var7 = a07Var;
            boolean zF2 = dd4Var.f(a07Var7) | ((i4 & 7168) == 2048) | dd4Var.h(lArr2);
            Object objQ10 = dd4Var.Q();
            if (zF2 || objQ10 == fu6Var) {
                mm3 mm3Var = new mm3(yb4Var, lArr2, a07Var4, a07Var7, a07Var6, 2);
                dd4Var.p0(mm3Var);
                objQ10 = mm3Var;
            }
            kc5.n(p35VarC, strK, false, null, ou6VarN03, null, null, null, (ib4) objQ10, dd4Var, 24576, 236);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            ou6Var3 = ou6Var7;
        } else {
            dd4Var2.Y();
            ou6Var3 = ou6Var2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new us6(j, z, ou6Var3, yb4Var, i, i2);
        }
    }

    public static final da7 t0(g18 g18Var, String str, String str2) {
        g18Var.getClass();
        return new da7(g18Var, str, str2);
    }

    public static final void u(zlb zlbVar, p65 p65Var, lh7 lh7Var, o65 o65Var, ii1 ii1Var, long j) {
        float fIntBitsToFloat;
        kz6 kz6Var = (kz6) ii1Var.c;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (p65Var.c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (p65Var.c & 4294967295L));
        if (C(p65Var)) {
            ii1Var.b = 0;
            kz6Var.d();
        }
        if (!v(p65Var) && !C(p65Var)) {
            if (kz6Var.b == 3) {
                int i = ii1Var.b;
                ii1Var.b = i + 1;
                kz6Var.n(i, p65Var);
            } else {
                kz6Var.a(p65Var);
            }
            if (ii1Var.b == 3) {
                ii1Var.b = 0;
            }
            Object[] objArr = kz6Var.a;
            int i2 = kz6Var.b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((p65) objArr[i3]).c >> 32));
            }
            int i4 = kz6Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = kz6Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((p65) objArr2[i5]).c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / kz6Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (lh7Var != null) {
            int i6 = o65Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = lh7Var == lh7.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        zlbVar.a.a(p65Var.b, eb7.h(jFloatToRawIntBits, j));
    }

    public static int[] u0(Collection collection) {
        if (collection instanceof sc5) {
            sc5 sc5Var = (sc5) collection;
            return Arrays.copyOfRange(sc5Var.a, sc5Var.b, sc5Var.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final boolean v(p65 p65Var) {
        return p65Var.h && !p65Var.d;
    }

    public static byte[] v0(n32 n32Var) {
        n32Var.getClass();
        HashMap map = n32Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    w0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            cp4.k().j(k62.a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static List w(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new sc5(iArr, 0, iArr.length);
    }

    public static final void w0(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                j31.g(ug8.a(obj.getClass()).g(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            a91 a91VarA = ug8.a(objArr.getClass());
            if (a91VarA.equals(ug8.a(Boolean[].class))) {
                i = 8;
            } else if (a91VarA.equals(ug8.a(Byte[].class))) {
                i = 9;
            } else if (a91VarA.equals(ug8.a(Integer[].class))) {
                i = 10;
            } else if (a91VarA.equals(ug8.a(Long[].class))) {
                i = 11;
            } else if (a91VarA.equals(ug8.a(Float[].class))) {
                i = 12;
            } else if (a91VarA.equals(ug8.a(Double[].class))) {
                i = 13;
            } else {
                if (!a91VarA.equals(ug8.a(String[].class))) {
                    j31.g(ug8.a(objArr.getClass()).f(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final km0 x(g18 g18Var, String str, boolean z) {
        g18Var.getClass();
        return new km0(g18Var, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x0(defpackage.b24 r4, java.util.ArrayList r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.i24
            if (r0 == 0) goto L13
            r0 = r6
            i24 r0 = (defpackage.i24) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            i24 r0 = new i24
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r4 = r0.a
            defpackage.e11.e0(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            sg r6 = new sg
            r1 = 20
            r6.<init>(r5, r1)
            r0.a = r5
            r0.c = r2
            java.lang.Object r4 = r4.a(r6, r0)
            xx1 r6 = defpackage.xx1.a
            if (r4 != r6) goto L45
            return r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.x0(b24, java.util.ArrayList, kt1):java.lang.Object");
    }

    public static b24 y(b24 b24Var, int i) {
        ar0 ar0Var;
        if (i < 0 && i != -2 && i != -1) {
            gp.k(dx1.f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            ar0Var = ar0.b;
        } else {
            ar0Var = ar0.a;
        }
        int i2 = i;
        ar0 ar0Var2 = ar0Var;
        return b24Var instanceof mc4 ? ex1.Q((mc4) b24Var, null, i2, ar0Var2, 1) : new n11(b24Var, null, i2, ar0Var2, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y0(kz9 r12, a0a r13, eq1 r14) {
        /*
            long r0 = r13.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.b(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.p()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.e(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.p()
            if (r4 >= r2) goto L51
            java.util.List r11 = r12.m(r0)
            long r2 = r12.e(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L51
            long r7 = r13.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            f22 r6 = new f22
            long r9 = r2 - r7
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.p()
            if (r3 >= r6) goto L5f
            k0(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.a
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            k0(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            f22 r6 = new f22
            java.util.List r11 = r12.m(r0)
            long r7 = r12.e(r4)
            long r12 = r12.e(r4)
            long r9 = r0 - r12
            r6.<init>(r7, r9, r11)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx1.y0(kz9, a0a, eq1):void");
    }

    public static ArrayList z(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final da8 z0(dc2 dc2Var) {
        dc2Var.getClass();
        return new da8(dc2Var.a, dc2Var.b, dc2Var.c, dc2Var.d, dc2Var.e, dc2Var.f);
    }

    public abstract void X(g99 g99Var, float f, float f2);
}
