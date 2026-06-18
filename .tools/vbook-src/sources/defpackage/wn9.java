package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class wn9 {
    public static final boolean A(vn9 vn9Var, vn9 vn9Var2, boolean z) {
        vn9Var.getClass();
        jda jdaVar = vn9Var.m;
        if (vn9Var2 == null) {
            return false;
        }
        zga zgaVar = vn9Var2.a;
        jda jdaVar2 = vn9Var2.m;
        if (zgaVar.b() != 16 && !lc1.d(vn9Var.a.b(), zgaVar.b())) {
            return false;
        }
        c64 c64Var = vn9Var2.f;
        if (c64Var != null && !lc5.Q(vn9Var.f, c64Var)) {
            return false;
        }
        long j = vn9Var2.b;
        tpa[] tpaVarArr = spa.b;
        if ((j & 1095216660480L) != 0 && !spa.a(vn9Var.b, j)) {
            return false;
        }
        a84 a84Var = vn9Var2.c;
        if (a84Var != null && !lc5.Q(vn9Var.c, a84Var)) {
            return false;
        }
        t74 t74Var = vn9Var2.d;
        if (t74Var != null && !lc5.Q(vn9Var.d, t74Var)) {
            return false;
        }
        u74 u74Var = vn9Var2.e;
        if (u74Var != null && !lc5.Q(vn9Var.e, u74Var)) {
            return false;
        }
        String str = vn9Var2.g;
        if (str != null && !lc5.Q(vn9Var.g, str)) {
            return false;
        }
        long j2 = vn9Var2.h;
        if ((1095216660480L & j2) != 0 && !spa.a(vn9Var.h, j2)) {
            return false;
        }
        ge0 ge0Var = vn9Var2.i;
        if (ge0Var != null && !lc5.Q(vn9Var.i, ge0Var)) {
            return false;
        }
        aha ahaVar = vn9Var2.j;
        if (ahaVar != null && !lc5.Q(vn9Var.j, ahaVar)) {
            return false;
        }
        h36 h36Var = vn9Var2.k;
        if (h36Var != null && !lc5.Q(vn9Var.k, h36Var)) {
            return false;
        }
        long j3 = vn9Var2.l;
        if (j3 != 16 && !lc1.d(vn9Var.l, j3)) {
            return false;
        }
        if (z) {
            if (jdaVar2 != null && !lc5.Q(jdaVar, jdaVar2)) {
                return false;
            }
        } else {
            if (jdaVar2 != null && jdaVar == null) {
                return false;
            }
            if (jdaVar2 != null && jdaVar != null && !jdaVar.a(jdaVar2) && !jdaVar2.a(jdaVar)) {
                return false;
            }
        }
        o89 o89Var = vn9Var2.n;
        return o89Var == null || lc5.Q(vn9Var.n, o89Var);
    }

    public static final long B(long j, long j2, float f) {
        p(j, j2);
        return H(sw1.V(spa.c(j), spa.c(j2), f), 1095216660480L & j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.pv9 r4, defpackage.lf2 r5, defpackage.gl8 r6, defpackage.jt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qv9
            if (r0 == 0) goto L13
            r0 = r7
            qv9 r0 = (defpackage.qv9) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            qv9 r0 = new qv9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r7)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r7)
            ql8 r4 = defpackage.jl8.a(r4, r6)
            r0.b = r2
            java.lang.Object r7 = defpackage.sv9.a(r4, r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            r7.getClass()
            lv9 r7 = (defpackage.lv9) r7
            java.lang.String r4 = r7.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.C(pv9, lf2, gl8, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.pv9 r4, java.util.ArrayList r5, defpackage.lf2 r6, defpackage.gl8 r7, defpackage.jt1 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.rv9
            if (r0 == 0) goto L13
            r0 = r8
            rv9 r0 = (defpackage.rv9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            rv9 r0 = new rv9
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.ArrayList r5 = r0.a
            defpackage.e11.e0(r8)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r8)
            r0.a = r5
            r0.c = r2
            java.lang.Object r8 = C(r4, r6, r7, r0)
            xx1 r4 = defpackage.xx1.a
            if (r8 != r4) goto L3e
            return r4
        L3e:
            java.lang.String r8 = (java.lang.String) r8
            yg8 r4 = defpackage.sv9.a
            r8.getClass()
            r5.getClass()
            yg8 r4 = defpackage.sv9.a
            m41 r6 = new m41
            r7 = 5
            r6.<init>(r7, r5)
            java.lang.String r4 = r4.f(r6, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.D(pv9, java.util.ArrayList, lf2, gl8, jt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.yy r13, boolean r14, boolean r15, defpackage.yb4 r16, defpackage.kt1 r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof defpackage.u5c
            if (r1 == 0) goto L16
            r1 = r0
            u5c r1 = (defpackage.u5c) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.c = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            u5c r1 = new u5c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.b
            int r1 = r8.c
            r10 = 0
            r11 = 2
            r2 = 1
            xx1 r12 = defpackage.xx1.a
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L35
            if (r1 != r11) goto L2f
            defpackage.e11.e0(r0)
            return r0
        L2f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r10
        L35:
            o1a r13 = r8.a
            yb4 r13 = (defpackage.yb4) r13
            defpackage.e11.e0(r0)
            goto L59
        L3d:
            defpackage.e11.e0(r0)
            r0 = r16
            o1a r0 = (defpackage.o1a) r0
            r8.a = r0
            r8.c = r2
            r5 = 0
            r9 = 34
            r3 = 0
            r7 = 0
            r2 = r13
            r4 = r14
            r6 = r15
            java.lang.Object r0 = n(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r12) goto L57
            goto L65
        L57:
            r13 = r16
        L59:
            gnb r0 = (defpackage.gnb) r0
            r8.a = r10
            r8.c = r11
            java.lang.Object r13 = r13.invoke(r0, r8)
            if (r13 != r12) goto L66
        L65:
            return r12
        L66:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.E(yy, boolean, boolean, yb4, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [gnb] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [gnb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.gnb r8, boolean r9, boolean r10, defpackage.oc r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof defpackage.t5c
            if (r0 == 0) goto L13
            r0 = r12
            t5c r0 = (defpackage.t5c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            t5c r0 = new t5c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L57
            if (r1 == r5) goto L4e
            if (r1 == r4) goto L41
            if (r1 == r3) goto L3b
            if (r1 == r2) goto L33
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            r8 = 0
            return r8
        L33:
            java.lang.Object r8 = r0.a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.e11.e0(r12)
            goto L8e
        L3b:
            java.lang.Object r8 = r0.a
            defpackage.e11.e0(r12)
            return r8
        L41:
            java.lang.Object r8 = r0.a
            gnb r8 = (defpackage.gnb) r8
            defpackage.e11.e0(r12)     // Catch: java.lang.Throwable -> L49
            goto L73
        L49:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L81
        L4e:
            java.lang.Object r8 = r0.a
            r11 = r8
            yb4 r11 = (defpackage.yb4) r11
            defpackage.e11.e0(r12)
            goto L65
        L57:
            defpackage.e11.e0(r12)
            r0.a = r11
            r0.c = r5
            java.lang.Object r12 = G(r8, r9, r10, r0)
            if (r12 != r6) goto L65
            goto L8d
        L65:
            r8 = r12
            gnb r8 = (defpackage.gnb) r8
            r0.a = r8     // Catch: java.lang.Throwable -> L49
            r0.c = r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r12 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L49
            if (r12 != r6) goto L73
            goto L8d
        L73:
            ymb r8 = r8.b
            r0.a = r12
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r6) goto L80
            goto L8d
        L80:
            return r12
        L81:
            ymb r9 = r9.b
            r0.a = r8
            r0.c = r2
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r6) goto L8e
        L8d:
            return r6
        L8e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.F(gnb, boolean, boolean, oc, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.gnb r10, boolean r11, boolean r12, defpackage.kt1 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.s5c
            if (r0 == 0) goto L14
            r0 = r13
            s5c r0 = (defpackage.s5c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            s5c r0 = new s5c
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.d
            int r0 = r7.e
            r1 = 0
            r2 = 2
            r3 = 1
            xx1 r9 = defpackage.xx1.a
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L33
            if (r0 != r2) goto L2d
            defpackage.e11.e0(r13)
            return r13
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r1
        L33:
            boolean r12 = r7.c
            boolean r11 = r7.b
            gnb r10 = r7.a
            defpackage.e11.e0(r13)
        L3c:
            r3 = r11
            r5 = r12
            goto L53
        L3f:
            defpackage.e11.e0(r13)
            inb r13 = defpackage.inb.READ
            r7.a = r10
            r7.b = r11
            r7.c = r12
            r7.e = r3
            java.lang.Object r13 = r10.f(r13, r7)
            if (r13 != r9) goto L3c
            goto L65
        L53:
            yy r13 = (defpackage.yy) r13
            r7.a = r1
            r7.e = r2
            r4 = 1
            r6 = 0
            r8 = 32
            r2 = r10
            r1 = r13
            java.lang.Object r10 = n(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r9) goto L66
        L65:
            return r9
        L66:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.G(gnb, boolean, boolean, kt1):java.lang.Object");
    }

    public static final long H(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        tpa[] tpaVarArr = spa.b;
        return jFloatToRawIntBits;
    }

    public static final String I(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return iw9.A(0, bArr, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    gjb.X(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final fxb J(c85 c85Var, dd4 dd4Var, int i) {
        if ((i & 1) != 0) {
            c85Var = null;
        }
        Object[] objArr = new Object[0];
        rt8 rt8Var = fxb.m;
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new ttb(2);
            dd4Var.p0(objQ);
        }
        fxb fxbVar = (fxb) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
        fxbVar.k = c85Var;
        return fxbVar;
    }

    public static final String K(pv9 pv9Var, dd4 dd4Var) {
        pv9Var.getClass();
        lf2 lf2VarH0 = wx1.h0(tl8.a, dd4Var);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new dv9(9);
            dd4Var.p0(objQ);
        }
        ib4 ib4Var = (ib4) objQ;
        boolean zF = dd4Var.f(pv9Var) | dd4Var.h(lf2VarH0);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new lq8(pv9Var, lf2VarH0, (jt1) null, 12);
            dd4Var.p0(objQ2);
        }
        return (String) ny1.j0(pv9Var, ib4Var, (yb4) objQ2, dd4Var).getValue();
    }

    public static final String L(pv9 pv9Var, Object[] objArr, dd4 dd4Var) {
        Object ck7Var;
        pv9 pv9Var2;
        pv9Var.getClass();
        lf2 lf2VarH0 = wx1.h0(tl8.a, dd4Var);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (objQ == fu6Var) {
            objQ = new dv9(9);
            dd4Var.p0(objQ);
        }
        ib4 ib4Var = (ib4) objQ;
        boolean zF = dd4Var.f(pv9Var) | dd4Var.h(arrayList) | dd4Var.h(lf2VarH0);
        Object objQ2 = dd4Var.Q();
        jt1 jt1Var = null;
        if (zF || objQ2 == fu6Var) {
            pv9Var2 = pv9Var;
            ck7Var = new ck7(pv9Var2, arrayList, lf2VarH0, jt1Var, 10);
            dd4Var.p0(ck7Var);
        } else {
            ck7Var = objQ2;
            pv9Var2 = pv9Var;
        }
        yb4 yb4Var = (yb4) ck7Var;
        ib4Var.getClass();
        yb4Var.getClass();
        ((hl8) dd4Var.j(jl8.b)).getClass();
        gl8 gl8VarA = hl8.a(dd4Var);
        boolean zF2 = dd4Var.f(pv9Var2) | dd4Var.f(arrayList) | dd4Var.f(gl8VarA);
        Object objQ3 = dd4Var.Q();
        if (zF2 || objQ3 == fu6Var) {
            objQ3 = dk9.x(ah1.S(hc3.a, new ul8(yb4Var, gl8VarA, jt1Var, 1)));
            dd4Var.p0(objQ3);
        }
        return (String) ((a07) objQ3).getValue();
    }

    public static final void M(aq5 aq5Var, final wga wgaVar, final int i, final int i2, final boolean z, final boolean z2, List list, Set set, boolean z3, kb4 kb4Var, ib4 ib4Var, final kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var2, final kb4 kb4Var4) {
        int i3;
        bp bpVar;
        boolean z4;
        int i4;
        List list2 = list;
        Set set2 = set;
        aq5Var.getClass();
        wgaVar.getClass();
        bp bpVar2 = wgaVar.a;
        set2.getClass();
        ib4Var.getClass();
        kb4Var3.getClass();
        ib4Var2.getClass();
        int i5 = 4;
        if (list2 == null) {
            aq5.b0(aq5Var, "toc_loading", new h1a(7), vm7.p, 4);
            return;
        }
        int i6 = 10;
        if (list2.isEmpty() && bpVar2.b.length() == 0) {
            aq5.b0(aq5Var, "toc_error", new h1a(11), new rj1(new oa3(i6, ib4Var), true, -1268837290), 4);
            return;
        }
        boolean z5 = true;
        aq5.b0(aq5Var, "toc_header", new h1a(12), new rj1(new zb4() { // from class: g9a
            @Override // defpackage.zb4
            public final Object c(Object obj, Object obj2, Object obj3) {
                int i7;
                int i8;
                ou6 ou6Var;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ou6 ou6Var2 = lu6.a;
                    ou6 ou6VarN0 = gjb.n0(fe.L(t96.w(gjb.n0(tg9.f(ou6Var2, 1.0f), 16.0f, 0.0f, 2), uw1.d(s00.p(dd4Var).d, (ax1) null, (ax1) null, new y13(0.0f), new y13(0.0f), 3)), dd1.g(s00.o(dd4Var), 2.0f), jf0.G), 16.0f, 0.0f, 2);
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
                    ou6 ou6VarH = xv5.h(ou6Var2, 16.0f, dd4Var, ou6Var2, 1.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarH);
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
                    nha.c(wn9.K((pv9) zu9.D.getValue(), dd4Var), (ou6) null, s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).g, dd4Var, 0, 0, 131066);
                    dd4 dd4Var2 = dd4Var;
                    int i9 = i2;
                    int i10 = i;
                    if (z2) {
                        i7 = i9;
                        i8 = i10;
                        ou6Var = ou6Var2;
                        dd4Var2.f0(357035782);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(356558320);
                        i8 = i10;
                        ou6Var = ou6Var2;
                        i7 = i9;
                        nha.c(wn9.L(i9 == 4 ? (pv9) eu9.t.getValue() : (pv9) vt9.m0.getValue(), new Object[]{Integer.valueOf(i10)}, dd4Var2), gjb.p0(ou6Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var2, 48, 0, 131064);
                        dd4Var2 = dd4Var2;
                        dd4Var2.q(false);
                    }
                    un9.a(dd4Var2, new bp5(1.0f, true));
                    boolean z6 = z;
                    br9 br9VarB = an.b(z6 ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var2, 0, 30);
                    p35 p35VarC = i25.c((m53) h53.e.getValue(), dd4Var2, 0);
                    ou6 ou6Var3 = ou6Var;
                    ou6 ou6VarI0 = sw1.i0(tg9.n(ou6Var3, 24.0f), ((Number) br9VarB.getValue()).floatValue());
                    kb4 kb4Var5 = kb4Var2;
                    boolean zF = dd4Var2.f(kb4Var5) | dd4Var2.g(z6);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new ck0(17, kb4Var5, z6);
                        dd4Var2.p0(objQ);
                    }
                    mx4.a(p35VarC, (String) null, yn2.s(ou6VarI0, false, 0.0f, (ib4) objQ, 3), 0L, dd4Var2, 48, 8);
                    xv5.z(dd4Var2, true, ou6Var3, 12.0f, dd4Var2);
                    e11.A(wgaVar, wn9.L(i7 == 4 ? (pv9) mu9.a0.getValue() : (pv9) mu9.Y.getValue(), new Object[]{Integer.valueOf(i8)}, dd4Var2), 0L, dd1.g(s00.o(dd4Var2), 6.0f), null, null, gjb.n0(tg9.f(ou6Var3, 1.0f), 0.0f, 8.0f, 1), kb4Var4, null, dd4Var2, 1572864, 308);
                    xv5.A(ou6Var3, 8.0f, dd4Var2, true);
                } else {
                    dd4Var.Y();
                }
                return heb.a;
            }
        }, true, 328259382), 4);
        int size = list2.size();
        byte b = 0;
        int i7 = 0;
        while (i7 < size) {
            vq2 vq2Var = (vq2) list2.get(i7);
            List list3 = vq2Var.b;
            if (vq2Var.a.length() > 0) {
                aq5.b0(aq5Var, dx1.f(i7, "section_"), new h1a(13), new rj1(new mp6(kb4Var, i7, set2, vq2Var), z5, 1368268602), i5);
            }
            if (set2.contains(Integer.valueOf(i7))) {
                bpVar = bpVar2;
                z4 = z5;
                i4 = i7;
            } else {
                z4 = true;
                bpVar = bpVar2;
                i4 = i7;
                aq5Var.c0(list3.size(), new kt6(27, new e41(z, 7, b), list3), new bq0(6, new tn8(i5), list3), new js6(20, list3), new rj1(new h9a(list3, list3, i7, list2, kb4Var3), true, -1942245546));
            }
            i7 = i4 + 1;
            list2 = list;
            z5 = z4;
            bpVar2 = bpVar;
            i5 = 4;
            b = 0;
            set2 = set;
        }
        bp bpVar3 = bpVar2;
        boolean z6 = z5;
        if (bpVar3.b.length() <= 0 || !list.isEmpty()) {
            i3 = 4;
        } else {
            i3 = 4;
            aq5.b0(aq5Var, "search_empty", new h1a(8), vm7.q, 4);
        }
        int i8 = 9;
        if (z3) {
            aq5.b0(aq5Var, "loading_chapter", new h1a(9), vm7.r, i3);
        }
        if (z2 && bpVar3.b.length() == 0) {
            aq5.b0(aq5Var, "see_all_chapter", new h1a(10), new rj1(new oa3(i8, ib4Var2), z6, 3401667), 4);
        }
    }

    public static dgb N(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = zn7.b;
        String strH = !lc5.Q(str2, "/") ? iw9.H(str, false, str2, "/") : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strH.length()) {
            char cCharAt = strH.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strH.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strH.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strH.substring(0, i6);
            strSubstring = strH.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strH.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strH.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strH.substring(i2, strH.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strI = strSubstring2 != null ? I(strSubstring2, bArr) : null;
        String strI2 = strSubstring != null ? I(strSubstring, bArr) : null;
        String strI3 = strSubstring3 != null ? I(strSubstring3, bArr) : null;
        if (str3 != null) {
            I(str3, bArr);
        }
        if (strSubstring5 != null) {
            I(strSubstring5, bArr);
        }
        return new dgb(strH, str2, strI, strI2, strI3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [jda] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jda] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [jda] */
    /* JADX WARN: Type inference failed for: r2v5, types: [jda] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jda] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final vn9 O(vn9 vn9Var, vn9 vn9Var2) {
        ?? r25;
        vn9Var.getClass();
        ?? r2 = vn9Var.m;
        if (vn9Var2 == null) {
            return vn9Var;
        }
        ?? r3 = vn9Var2.m;
        long jB = vn9Var2.a.b() != 16 ? lc1.j : vn9Var.a.b();
        c64 c64Var = vn9Var2.f != null ? null : vn9Var.f;
        long j = vn9Var2.b;
        tpa[] tpaVarArr = spa.b;
        long j2 = (j & 1095216660480L) == 0 ? vn9Var.b : spa.c;
        a84 a84Var = vn9Var2.c != null ? null : vn9Var.c;
        t74 t74Var = vn9Var2.d != null ? null : vn9Var.d;
        u74 u74Var = vn9Var2.e != null ? null : vn9Var.e;
        String str = vn9Var2.g != null ? null : vn9Var.g;
        long j3 = (vn9Var2.h & 1095216660480L) == 0 ? vn9Var.h : spa.c;
        ge0 ge0Var = vn9Var2.i != null ? null : vn9Var.i;
        aha ahaVar = vn9Var2.j != null ? null : vn9Var.j;
        a84 a84Var2 = a84Var;
        h36 h36Var = vn9Var2.k != null ? null : vn9Var.k;
        String str2 = str;
        long j4 = vn9Var2.l != 16 ? lc1.j : vn9Var.l;
        if (r3 == 0 || !r3.equals(r2)) {
            if (r3 != 0 && r2 != 0 && r2.a(r3)) {
                r2 = (!r2.equals(r3) && r2.a(r3)) ? r3.a == 2 ? jda.c : jda.d : jda.b;
            }
            r25 = r2;
        } else {
            r25 = 0;
        }
        return new vn9(jB, j2, a84Var2, t74Var, u74Var, c64Var, str2, j3, ge0Var, ahaVar, h36Var, j4, (jda) r25, vn9Var2.n != null ? null : vn9Var.n, 49152);
    }

    public static String P(Context context, String str) {
        ex1.C(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = qn9.w(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String Q(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void a(qo2 qo2Var, ou6 ou6Var, dd4 dd4Var, int i) {
        qo2 qo2Var2;
        iv ivVar;
        yb4 yb4Var;
        yb4 yb4Var2;
        kd kdVar;
        jm jmVar;
        ib4 ib4Var;
        ou6 ou6Var2;
        char c;
        boolean z;
        ou6 ou6Var3;
        ?? r0;
        ou6 ou6Var4;
        dd4 dd4Var2 = dd4Var;
        String str = qo2Var.d;
        long j = qo2Var.e;
        dd4Var2.h0(-965591933);
        int i2 = i | (dd4Var2.f(qo2Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16);
        if (dd4Var2.V(i2 & 1, (i2 & 19) != 18)) {
            wf0 wf0Var = bv4.x;
            iv ivVar2 = pv.a;
            eq8 eq8VarA = dq8.a(ivVar2, wf0Var, dd4Var2, 48);
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
            yb4 yb4Var3 = ll1.f;
            un9.s(yb4Var3, dd4Var2, eq8VarA);
            yb4 yb4Var4 = ll1.e;
            un9.s(yb4Var4, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            jm jmVar3 = ll1.d;
            un9.s(jmVar3, dd4Var2, ou6VarL0);
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var3, dd4Var2, ie1VarA);
            un9.s(yb4Var4, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar2);
            un9.s(jmVar3, dd4Var2, ou6VarL02);
            ou6 ou6Var5 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var5, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar2, wf0Var, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var3, dd4Var2, eq8VarA2);
            un9.s(yb4Var4, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar2, dd4Var2, kdVar2);
            un9.s(jmVar3, dd4Var2, ou6VarL03);
            if (qo2Var.g) {
                dd4Var2.f0(1477736944);
                p35 p35VarC = i25.c((m53) f53.U.getValue(), dd4Var2, 0);
                long jC = lc1.c(j > 0 ? 0.8f : 1.0f, ((q96) dd4Var2.j(s96.a)).a.q);
                ou6Var2 = ou6Var5;
                ib4Var = ib4Var2;
                yb4Var = yb4Var3;
                ivVar = ivVar2;
                yb4Var2 = yb4Var4;
                jmVar = jmVar2;
                kdVar = kdVar2;
                mx4.a(p35VarC, (String) null, tg9.n(ou6Var2, 18.0f), jC, dd4Var2, 432, 0);
                c = 0;
                un9.a(dd4Var2, tg9.r(ou6Var2, 4.0f));
                z = false;
                dd4Var2.q(false);
            } else {
                ivVar = ivVar2;
                yb4Var = yb4Var3;
                yb4Var2 = yb4Var4;
                kdVar = kdVar2;
                jmVar = jmVar2;
                ib4Var = ib4Var2;
                ou6Var2 = ou6Var5;
                c = 0;
                z = false;
                dd4Var2.f0(1478153057);
                dd4Var2.q(false);
            }
            kd kdVar3 = kdVar;
            ou6 ou6Var6 = ou6Var2;
            yb4 yb4Var5 = yb4Var2;
            jm jmVar4 = jmVar;
            yb4 yb4Var6 = yb4Var;
            nha.c(qo2Var.b, tg9.f(ou6Var2, 1.0f), lc1.c(j > 0 ? 0.8f : 1.0f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(qo2Var.c == 0 ? 5 : 3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 48, 0, 261112);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            if (j > 0) {
                dd4Var2.f0(2006638863);
                ou6 ou6VarF2 = tg9.f(ou6Var6, 1.0f);
                eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                int iHashCode4 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL4 = dd4Var2.l();
                ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarF2);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(ib4Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var6, dd4Var2, eq8VarA3);
                un9.s(yb4Var5, dd4Var2, lr7VarL4);
                ky0.v(iHashCode4, dd4Var2, jmVar4, dd4Var2, kdVar3);
                un9.s(jmVar3, dd4Var2, ou6VarL04);
                mx4.a(i25.c((m53) f53.i.getValue(), dd4Var2, 0), (String) null, tg9.n(ou6Var6, 12.0f), lc1.c(0.5f, s00.o(dd4Var2).q), dd4Var2, 432, 0);
                un9.a(dd4Var2, tg9.r(ou6Var6, 2.0f));
                boolean zE = dd4Var2.e(j);
                Object objQ = dd4Var2.Q();
                if (zE || objQ == vl1.a) {
                    objQ = zk4.i(j, "HH:mm dd/MM/yyyy");
                    dd4Var2.p0(objQ);
                }
                ou6Var3 = ou6Var6;
                r0 = 0;
                nha.c((String) objQ, (ou6) null, lc1.c(0.5f, s00.o(dd4Var2).q), (g60) null, x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 1, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var, 24576, 24576, 113642);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                ou6Var3 = ou6Var6;
                r0 = 0;
                dd4Var2.f0(2007705573);
                dd4Var2.q(false);
            }
            if (str.length() > 0) {
                ou6 ou6Var7 = ou6Var3;
                ky0.z(dd4Var2, 2007767449, ou6Var7, 4.0f, dd4Var2);
                ou6Var4 = ou6Var7;
                nha.c(str, tg9.f(ou6Var7, 1.0f), lc1.c(0.5f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var, 48, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q((boolean) r0);
            } else {
                ou6Var4 = ou6Var3;
                dd4Var2.f0(2008117253);
                dd4Var2.q((boolean) r0);
            }
            dd4Var2.q(true);
            qo2Var2 = qo2Var;
            if (qo2Var2.f) {
                dd4Var2.f0(842426300);
                mx4.a(i25.c((m53) f53.D.getValue(), dd4Var2, r0), (String) null, tg9.n(ou6Var4, 24.0f), lc1.c(0.7f, s00.o(dd4Var2).q), dd4Var2, 432, 0);
                dd4Var2.q((boolean) r0);
            } else {
                dd4Var2.f0(842681275);
                dd4Var2.q((boolean) r0);
            }
            dd4Var2.q(true);
        } else {
            qo2Var2 = qo2Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(qo2Var2, ou6Var, i, 8);
        }
    }

    public static final void b(final ou6 ou6Var, final boolean z, final boolean z2, dd4 dd4Var, final int i) {
        boolean z3;
        dd4Var.h0(-30253805);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i | (dd4Var.g(z) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 48);
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
            bp5 bp5Var = new bp5(1.0f, true);
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
            un9.s(jmVar4, dd4Var, ou6VarL02);
            lu6 lu6Var = lu6.a;
            ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 20.0f), null, dd4Var, 6, 2);
            ou6 ou6VarH = xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarH);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ah1.r(tg9.n(lu6Var, 14.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            ah1.r(tg9.h(tg9.f(lu6Var, 0.5f), 16.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
            if (z) {
                ky0.z(dd4Var, -1378685078, lu6Var, 4.0f, dd4Var);
                ah1.r(tg9.h(tg9.f(lu6Var, 0.8f), 14.0f), null, dd4Var, 6, 2);
                z3 = false;
                dd4Var.q(false);
            } else {
                z3 = false;
                dd4Var.f0(-1378532279);
                dd4Var.q(false);
            }
            dd4Var.q(true);
            if (z2) {
                xv5.y(dd4Var, -1272192043, lu6Var, 12.0f, dd4Var);
                ah1.r(tg9.n(lu6Var, 24.0f), null, dd4Var, 6, 2);
                dd4Var.q(z3);
            } else {
                dd4Var.f0(-1272070957);
                dd4Var.q(z3);
            }
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(ou6Var, z, z2, i) { // from class: f9a
                public final /* synthetic */ ou6 a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    wn9.b(this.a, this.b, this.c, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void c(boolean z, String str, String str2, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        String str3;
        kb4Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(1708042964);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= dd4Var.f(str2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            if (xzb.a(dd4Var)) {
                dd4Var.f0(1830613904);
                d(z, str2, kb4Var, ib4Var, dd4Var, i3 & 65534);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1830871824);
                e(z, str2, kb4Var, ib4Var, dd4Var, i3 & 65534);
                dd4Var.q(false);
            }
            str3 = "";
        } else {
            dd4Var.Y();
            str3 = str;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(z, str3, str2, kb4Var, ib4Var, i);
        }
    }

    public static final void d(boolean z, String str, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        boolean z2;
        int i2;
        dd4Var.h0(194307062);
        int i3 = 4;
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (dd4Var.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(str) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            xf0 xf0Var = bv4.c;
            ou6 ou6VarL0 = gjb.l0(gjb.p0(yib.B(tg9.f(lu6.a, 1.0f), 15), 0.0f, 40.0f, 0.0f, 0.0f, 13), 24.0f);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new t3b(i3);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new t3b(5);
                dd4Var.p0(objQ2);
            }
            bx1.a(z2, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarL0, jf0.G(-1181519916, new x3b(str, kb4Var, ib4Var, 1), dd4Var), dd4Var, (i2 & 14) | 805531008 | ((i2 >> 6) & Token.ASSIGN_MOD), 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y3b(z, str, kb4Var, ib4Var, i, 1);
        }
    }

    public static final void e(boolean z, String str, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i) {
        boolean z2;
        int i2;
        dd4Var.h0(-198564594);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (dd4Var.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(str) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            xf0 xf0Var = bv4.d;
            ou6 ou6VarR = tg9.r(gjb.l0(gjb.p0(yib.B(lu6.a, 15), 0.0f, 30.0f, 40.0f, 0.0f, 9), 12.0f), 400.0f);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            int i3 = 6;
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new t3b(i3);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new t3b(7);
                dd4Var.p0(objQ2);
            }
            bx1.a(z2, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarR, jf0.G(-1574391572, new x3b(str, kb4Var, ib4Var, 0), dd4Var), dd4Var, (i2 & 14) | 805531008 | ((i2 >> 6) & Token.ASSIGN_MOD), 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y3b(z, str, kb4Var, ib4Var, i, 0);
        }
    }

    public static final void f(ou6 ou6Var, dd4 dd4Var, int i) {
        lp4 lp4Var = jf0.G;
        vf0 vf0Var = bv4.z;
        dd4Var.h0(-1895040672);
        if (dd4Var.V(i & 1, (i & 3) != 2)) {
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
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
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarN0 = gjb.n0(fe.L(t96.w(ou6VarF, uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, new y13(0.0f), new y13(0.0f), 3)), dd1.g(((q96) dd4Var.j(ur9Var)).a, 2.0f), lp4Var), 16.0f, 0.0f, 2);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            jv jvVar2 = jvVar;
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarN0);
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
            ou6 ou6VarH = xv5.h(ou6Var2, 16.0f, dd4Var, ou6Var2, 1.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarH);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ah1.r(tg9.o(ou6Var2, 150.0f, 30.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.r(ou6Var2, 12.0f));
            ah1.r(tg9.o(ou6Var2, 72.0f, 22.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, new bp5(1.0f, true));
            ah1.r(tg9.n(ou6Var2, 24.0f), null, dd4Var, 6, 2);
            xv5.z(dd4Var, true, ou6Var2, 12.0f, dd4Var);
            ah1.r(tg9.h(tg9.f(ou6Var2, 1.0f), 52.0f), null, dd4Var, 6, 2);
            float f = 8.0f;
            un9.a(dd4Var, tg9.h(ou6Var2, 8.0f));
            dd4Var.q(true);
            dd4Var.f0(859815679);
            int i2 = 0;
            while (i2 < 12) {
                boolean z = i2 == 11;
                ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
                jv jvVar3 = jvVar2;
                ie1 ie1VarA3 = ge1.a(jvVar3, vf0Var, dd4Var, 0);
                int i3 = i2;
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF2);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ie1VarA3);
                un9.s(ll1.e, dd4Var, lr7VarL4);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode4));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL04);
                ur9 ur9Var2 = s96.a;
                ou6 ou6Var3 = ou6Var2;
                y86.c(0.0f, 0, 2, dd1.g(((q96) dd4Var.j(ur9Var2)).a, f), dd4Var, gjb.n0(fe.L(ou6Var2, dd1.g(((q96) dd4Var.j(ur9Var2)).a, 2.0f), lp4Var), 16.0f, 0.0f, 2));
                b(gjb.m0(fe.L(qx1.z(tg9.f(ou6Var3, 1.0f), z, new tn8(5), dd4Var, 6), dd1.g(((q96) dd4Var.j(ur9Var2)).a, 2.0f), lp4Var), 16.0f, 8.0f), i3 % 3 == 0, i3 % 4 == 0, dd4Var, 0);
                dd4Var.q(true);
                int i4 = i3 + 1;
                ou6Var2 = ou6Var3;
                f = 8.0f;
                jvVar2 = jvVar3;
                i2 = i4;
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 23);
        }
    }

    public static final void g(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(609551011);
        int i2 = (dd4Var2.h(ib4Var) ? 32 : 16) | i;
        if (dd4Var2.V(i2 & 1, (i2 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 2.0f), jf0.G), 16.0f);
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
            nha.c(K((pv9) zu9.F.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i2 << 21) & 234881024, 252);
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0340 A[PHI: r12
  0x0340: PHI (r12v16 java.lang.String) = (r12v14 java.lang.String), (r12v19 java.lang.String) binds: [B:129:0x0351, B:123:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.u4b r35, boolean r36, ou6 r37, pj7 r38, final defpackage.ib4 r39, dd4 r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.h(u4b, boolean, ou6, pj7, ib4, dd4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04c1  */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.k4b r47, ou6 r48, defpackage.kb4 r49, defpackage.kb4 r50, defpackage.ib4 r51, dd4 r52, int r53) {
        /*
            Method dump skipped, instruction units count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.i(k4b, ou6, kb4, kb4, ib4, dd4, int):void");
    }

    public static final void j(String str, List list, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        Object next;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.b;
        dd4Var2.h0(-1654007714);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new gpa(a07Var, 16);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ2, dd4Var2, ou6Var, false);
            ha6 ha6VarD = pn0.d(xf0Var, false);
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
            zn0 zn0Var = zn0.a;
            xf0 xf0Var2 = bv4.f;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarA = zn0Var.a(lu6Var, xf0Var2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
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
            boolean zF = dd4Var2.f(list) | ((i2 & 14) == 4);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (lc5.Q(str, ((r5b) next).a)) {
                            break;
                        }
                    }
                }
                r5b r5bVar = (r5b) next;
                String str2 = r5bVar != null ? r5bVar.b : null;
                objQ3 = str2 == null ? "" : str2;
                dd4Var2.p0(objQ3);
            }
            String strK = (String) objQ3;
            ou6 ou6VarO = jv3.O(lu6Var, fc5.b);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarO);
            ml1.k.getClass();
            um1 um1Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL3);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode3));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL03);
            dd4Var2.f0(162133289);
            if (strK.length() == 0) {
                strK = K((pv9) vt9.H.getValue(), dd4Var2);
            }
            dd4Var2.q(false);
            ur9 ur9Var = s96.a;
            nha.c(strK, kf0.v(new bp5(1.0f, true)), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 0, 24576, 113656);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 16.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, 432, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            dd4Var.q(true);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new gpa(a07Var, 17);
                dd4Var.p0(objQ4);
            }
            gx1.a(zBooleanValue, xf0Var, 0L, lu6Var, 0.0f, null, (ib4) objQ4, jf0.G(-1184371292, new zs6(list, str, kb4Var, a07Var, 2), dd4Var), dd4Var, 14158896, 52);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cn3(i, 1, kb4Var, ou6Var, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(java.lang.String r57, java.lang.String r58, defpackage.ib4 r59, defpackage.ib4 r60, dd4 r61, int r62) {
        /*
            Method dump skipped, instruction units count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.k(java.lang.String, java.lang.String, ib4, ib4, dd4, int):void");
    }

    public static dgb l(String str) {
        String str2 = zn7.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new dgb(sb.toString(), str2, "file", null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.yy r7, defpackage.gnb r8, boolean r9, boolean r10, boolean r11, java.util.List r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.m(yy, gnb, boolean, boolean, boolean, java.util.List, kt1):java.lang.Object");
    }

    public static /* synthetic */ Object n(yy yyVar, gnb gnbVar, boolean z, boolean z2, boolean z3, List list, kt1 kt1Var, int i) {
        if ((i & 2) != 0) {
            gnbVar = null;
        }
        return m(yyVar, gnbVar, z, z2, z3, list, kt1Var);
    }

    public static final void o(long j) {
        tpa[] tpaVarArr = spa.b;
        if ((j & 1095216660480L) == 0) {
            s75.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void p(long j, long j2) {
        tpa[] tpaVarArr = spa.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            s75.a("Cannot perform operation for Unspecified type.");
        }
        if (tpa.a(spa.b(j), spa.b(j2))) {
            return;
        }
        s75.a("Cannot perform operation for " + ((Object) tpa.b(spa.b(j))) + " and " + ((Object) tpa.b(spa.b(j2))));
    }

    public static vn9 q(vn9 vn9Var, vn9 vn9Var2) {
        vn9Var.getClass();
        if (vn9Var2 == null) {
            return vn9Var;
        }
        jda jdaVar = vn9Var.m;
        jda jdaVar2 = vn9Var2.m;
        if (jdaVar == null || jdaVar2 == null || jdaVar.equals(jdaVar2)) {
            return vn9Var.d(vn9Var2);
        }
        List listZ = gc1.Z(jdaVar, jdaVar2);
        Integer numValueOf = 0;
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
            numValueOf = Integer.valueOf(numValueOf.intValue() | ((jda) listZ.get(i)).a);
        }
        return vn9Var.d(vn9.a(vn9Var2, new jda(numValueOf.intValue()), 61439));
    }

    public static final boolean r(long j, long j2) {
        return j == j2;
    }

    public static String s(yu0 yu0Var) {
        StringBuilder sb = new StringBuilder(yu0Var.size());
        for (int i = 0; i < yu0Var.size(); i++) {
            byte bA = yu0Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final long t(double d) {
        return H((float) d, 8589934592L);
    }

    public static final String u(dgb dgbVar) {
        List listV = v(dgbVar);
        String str = dgbVar.b;
        if (listV.isEmpty()) {
            return null;
        }
        String str2 = dgbVar.e;
        str2.getClass();
        if (!iw9.K(str2, str, false)) {
            str = "";
        }
        return fc1.D0(listV, dgbVar.b, str, null, null, 60);
    }

    public static final List v(dgb dgbVar) {
        String str = dgbVar.e;
        if (str == null) {
            return lc3.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iW = bw9.W(str, '/', i2, 4);
            if (iW == -1) {
                iW = str.length();
            }
            String strSubstring = str.substring(i2, iW);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iW;
        }
        return arrayList;
    }

    public static final long w(double d) {
        return H((float) d, 4294967296L);
    }

    public static final long x(int i) {
        return H(i, 4294967296L);
    }

    public static final Object y(pv9 pv9Var, jt1 jt1Var) {
        ur9 ur9Var = tl8.a;
        return C(pv9Var, lf2.a, (gl8) jl8.c.invoke(), jt1Var);
    }

    public static final Object z(pv9 pv9Var, Object[] objArr, jt1 jt1Var) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        ur9 ur9Var = tl8.a;
        return D(pv9Var, arrayList, lf2.a, (gl8) jl8.c.invoke(), jt1Var);
    }
}
