package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c98 implements y78 {
    public final m62 a;
    public final is4 b;
    public final x78 c;
    public final dt d;
    public final rs2 e;
    public final x5b f;
    public final v98 g;

    public c98(m62 m62Var, is4 is4Var, x78 x78Var, dt dtVar, rs2 rs2Var, x5b x5bVar, v98 v98Var) {
        this.a = m62Var;
        this.b = is4Var;
        this.c = x78Var;
        this.d = dtVar;
        this.e = rs2Var;
        this.f = x5bVar;
        this.g = v98Var;
    }

    public static String U(String str, Map map) throws Throwable {
        oh5 oh5Var = gx3.a;
        zn7 zn7VarF = zn7.f(qu1.a0(oh5Var), "export_" + str + "_" + r95.a.k().c() + ".txt");
        he8 he8Var = new he8(oh5Var.O0(zn7VarF, false));
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                he8Var.d0(str2);
                he8Var.d0("=");
                he8Var.d0(iw9.I(str3, (char) 166, '|'));
                he8Var.d0("\n");
            }
            try {
                he8Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                he8Var.close();
            } catch (Throwable th3) {
                i12.r(th, th3);
            }
        }
        if (th == null) {
            return zn7VarF.a.s();
        }
        throw th;
    }

    public final n78 A() {
        x78 x78Var = this.c;
        m78 m78VarD = x78Var.d();
        if (m78VarD == null) {
            return null;
        }
        String str = m78VarD.a;
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7.f(qu1.d0(oh5Var), str))) {
            return new n78(str, m78VarD.b);
        }
        x78Var.n(null);
        return null;
    }

    public final n78 B() {
        x78 x78Var = this.c;
        m78 m78VarG = x78Var.g();
        if (m78VarG == null) {
            return null;
        }
        String str = m78VarG.a;
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7.f(qu1.d0(oh5Var), str))) {
            return new n78(str, m78VarG.b);
        }
        x78Var.o(null);
        return null;
    }

    public final n78 C() {
        x78 x78Var = this.c;
        m78 m78VarH = x78Var.h();
        if (m78VarH == null) {
            return null;
        }
        String str = m78VarH.a;
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7.f(qu1.d0(oh5Var), str))) {
            return new n78(str, m78VarH.b);
        }
        x78Var.p(null);
        return null;
    }

    public final n78 D() {
        x78 x78Var = this.c;
        m78 m78VarJ = x78Var.j();
        if (m78VarJ == null) {
            return null;
        }
        String str = m78VarJ.a;
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7.f(qu1.d0(oh5Var), str))) {
            return new n78(str, m78VarJ.b);
        }
        x78Var.q(null);
        return null;
    }

    public final kb3 E(String str) {
        str.getClass();
        pp1 pp1VarR = qx1.R(this.a.F.W(1, str));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 22);
    }

    public final kb3 F(String str) {
        str.getClass();
        pp1 pp1VarR = qx1.R(this.a.F.W(0, str));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable G(defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.G(kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.r88
            if (r0 == 0) goto L13
            r0 = r11
            r88 r0 = (defpackage.r88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            r88 r0 = new r88
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            x78 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            n78 r8 = r0.a
            defpackage.e11.e0(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L38:
            defpackage.e11.e0(r11)
            goto L61
        L3c:
            defpackage.e11.e0(r11)
            goto L54
        L40:
            defpackage.e11.e0(r11)
            m78 r11 = r2.a()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.Q(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "LuatNhan.dic"
            n78 r11 = defpackage.rs2.e(r9, r11)
            if (r11 != r7) goto L61
            goto L80
        L61:
            n78 r11 = (defpackage.n78) r11
            m78 r9 = new m78
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.m(r9)
            v98 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            rs2 r8 = r8.e
            java.lang.Object r8 = r8.q(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.H(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.s88
            if (r0 == 0) goto L13
            r0 = r11
            s88 r0 = (defpackage.s88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            s88 r0 = new s88
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            x78 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            n78 r8 = r0.a
            defpackage.e11.e0(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L38:
            defpackage.e11.e0(r11)
            goto L61
        L3c:
            defpackage.e11.e0(r11)
            goto L54
        L40:
            defpackage.e11.e0(r11)
            m78 r11 = r2.d()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "NE.dic"
            n78 r11 = defpackage.rs2.f(r9, r11)
            if (r11 != r7) goto L61
            goto L80
        L61:
            n78 r11 = (defpackage.n78) r11
            m78 r9 = new m78
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.n(r9)
            v98 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            rs2 r8 = r8.e
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.I(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(defpackage.bi5 r11, defpackage.lm8 r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.J(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.u88
            if (r0 == 0) goto L13
            r0 = r11
            u88 r0 = (defpackage.u88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            u88 r0 = new u88
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            x78 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            n78 r8 = r0.a
            defpackage.e11.e0(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L38:
            defpackage.e11.e0(r11)
            goto L61
        L3c:
            defpackage.e11.e0(r11)
            goto L54
        L40:
            defpackage.e11.e0(r11)
            m78 r11 = r2.g()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.Q(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "HV.dic"
            n78 r11 = defpackage.rs2.e(r9, r11)
            if (r11 != r7) goto L61
            goto L80
        L61:
            n78 r11 = (defpackage.n78) r11
            m78 r9 = new m78
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.o(r9)
            v98 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            rs2 r8 = r8.e
            java.lang.Object r8 = r8.s(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.K(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.v88
            if (r0 == 0) goto L13
            r0 = r11
            v88 r0 = (defpackage.v88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v88 r0 = new v88
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            x78 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            n78 r8 = r0.a
            defpackage.e11.e0(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L38:
            defpackage.e11.e0(r11)
            goto L61
        L3c:
            defpackage.e11.e0(r11)
            goto L54
        L40:
            defpackage.e11.e0(r11)
            m78 r11 = r2.h()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "Pronouns.dic"
            n78 r11 = defpackage.rs2.f(r9, r11)
            if (r11 != r7) goto L61
            goto L80
        L61:
            n78 r11 = (defpackage.n78) r11
            m78 r9 = new m78
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.p(r9)
            v98 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            rs2 r8 = r8.e
            java.lang.Object r8 = r8.t(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.L(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.w88
            if (r0 == 0) goto L13
            r0 = r11
            w88 r0 = (defpackage.w88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            w88 r0 = new w88
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            x78 r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            n78 r8 = r0.a
            defpackage.e11.e0(r11)
            return r8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L38:
            defpackage.e11.e0(r11)
            goto L61
        L3c:
            defpackage.e11.e0(r11)
            goto L54
        L40:
            defpackage.e11.e0(r11)
            m78 r11 = r2.j()
            if (r11 == 0) goto L4b
            java.lang.String r6 = r11.a
        L4b:
            r0.d = r5
            java.lang.Object r11 = r8.R(r6, r9, r10, r0)
            if (r11 != r7) goto L54
            goto L80
        L54:
            java.util.Map r11 = (java.util.Map) r11
            r0.d = r4
            java.lang.String r9 = "VP.dic"
            n78 r11 = defpackage.rs2.f(r9, r11)
            if (r11 != r7) goto L61
            goto L80
        L61:
            n78 r11 = (defpackage.n78) r11
            m78 r9 = new m78
            java.lang.String r10 = r11.a
            int r1 = r11.b
            r9.<init>(r10, r1)
            r2.q(r9)
            v98 r9 = r8.g
            r9.a()
            r0.a = r11
            r0.d = r3
            rs2 r8 = r8.e
            java.lang.Object r8 = r8.u(r0)
            if (r8 != r7) goto L81
        L80:
            return r7
        L81:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.M(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(defpackage.bi5 r11, defpackage.lm8 r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.N(bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r12, defpackage.bi5 r13, defpackage.lm8 r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.O(java.lang.String, bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(java.lang.String r12, defpackage.bi5 r13, defpackage.lm8 r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.P(java.lang.String, bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r7, defpackage.bi5 r8, defpackage.lm8 r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.a98
            if (r0 == 0) goto L13
            r0 = r10
            a98 r0 = (defpackage.a98) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            a98 r0 = new a98
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 2
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r3) goto L31
            java.util.Map r6 = r0.c
            java.util.Map r6 = (java.util.Map) r6
            lm8 r7 = r0.b
            defpackage.e11.e0(r10)
            goto L7a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L37:
            lm8 r9 = r0.b
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r10)
            goto L51
        L3f:
            defpackage.e11.e0(r10)
            r0.a = r7
            r0.b = r9
            r0.f = r2
            rs2 r6 = r6.e
            java.lang.Object r10 = r6.i(r8, r0)
            if (r10 != r5) goto L51
            goto L78
        L51:
            r6 = r10
            java.util.Map r6 = (java.util.Map) r6
            lm8 r8 = defpackage.lm8.a
            if (r9 != r8) goto L59
            return r6
        L59:
            if (r7 == 0) goto L66
            oh5 r8 = defpackage.gx3.a
            zn7 r8 = defpackage.qu1.d0(r8)
            zn7 r7 = defpackage.zn7.f(r8, r7)
            goto L67
        L66:
            r7 = r4
        L67:
            r0.a = r4
            r0.b = r9
            r8 = r6
            java.util.Map r8 = (java.util.Map) r8
            r0.c = r8
            r0.f = r3
            java.lang.Object r10 = defpackage.rs2.j(r7)
            if (r10 != r5) goto L79
        L78:
            return r5
        L79:
            r7 = r9
        L7a:
            java.util.Map r10 = (java.util.Map) r10
            int r7 = r7.ordinal()
            if (r7 == 0) goto L93
            if (r7 == r2) goto L8f
            if (r7 != r3) goto L8b
            java.util.LinkedHashMap r6 = defpackage.y86.V(r6, r10)
            return r6
        L8b:
            defpackage.mn5.g()
            return r4
        L8f:
            java.util.LinkedHashMap r6 = defpackage.y86.V(r10, r6)
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.Q(java.lang.String, bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(java.lang.String r7, defpackage.bi5 r8, defpackage.lm8 r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.b98
            if (r0 == 0) goto L13
            r0 = r10
            b98 r0 = (defpackage.b98) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            b98 r0 = new b98
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.d
            int r1 = r0.f
            r2 = 1
            r3 = 2
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r3) goto L31
            java.util.Map r6 = r0.c
            java.util.Map r6 = (java.util.Map) r6
            lm8 r7 = r0.b
            defpackage.e11.e0(r10)
            goto L7a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L37:
            lm8 r9 = r0.b
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r10)
            goto L51
        L3f:
            defpackage.e11.e0(r10)
            r0.a = r7
            r0.b = r9
            r0.f = r2
            rs2 r6 = r6.e
            java.io.Serializable r10 = r6.n(r8, r0)
            if (r10 != r5) goto L51
            goto L78
        L51:
            r6 = r10
            java.util.Map r6 = (java.util.Map) r6
            lm8 r8 = defpackage.lm8.a
            if (r9 != r8) goto L59
            return r6
        L59:
            if (r7 == 0) goto L66
            oh5 r8 = defpackage.gx3.a
            zn7 r8 = defpackage.qu1.d0(r8)
            zn7 r7 = defpackage.zn7.f(r8, r7)
            goto L67
        L66:
            r7 = r4
        L67:
            r0.a = r4
            r0.b = r9
            r8 = r6
            java.util.Map r8 = (java.util.Map) r8
            r0.c = r8
            r0.f = r3
            java.lang.Object r10 = defpackage.rs2.m(r7)
            if (r10 != r5) goto L79
        L78:
            return r5
        L79:
            r7 = r9
        L7a:
            java.util.Map r10 = (java.util.Map) r10
            int r7 = r7.ordinal()
            if (r7 == 0) goto L93
            if (r7 == r2) goto L8f
            if (r7 != r3) goto L8b
            java.util.LinkedHashMap r6 = defpackage.y86.V(r6, r10)
            return r6
        L8b:
            defpackage.mn5.g()
            return r4
        L8f:
            java.util.LinkedHashMap r6 = defpackage.y86.V(r10, r6)
        L93:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.R(java.lang.String, bi5, lm8, kt1):java.lang.Object");
    }

    public final void S() {
        this.g.a();
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.d.a();
            x78 x78Var = ca8Var.c;
            ca8Var.e = x78Var.b();
            ca8Var.f = x78Var.k();
            ca8Var.g = x78Var.f();
            ca8Var.h = x78Var.e();
            ca8Var.i = x78Var.c();
            ca8Var.j = x78Var.i();
            ca8Var.k = x78Var.l();
        }
    }

    public final void T(List list) {
        ArrayList arrayList = new ArrayList(gc1.M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o78 o78Var = (o78) it.next();
            arrayList.add(new r78(o78Var.a, o78Var.b, o78Var.c));
        }
        this.c.p.e(x78.q[15], arrayList);
    }

    public final void c(int i, String str, String str2) {
        String strP;
        as2 as2Var;
        as2 as2Var2;
        b92 b92Var = this.a.F;
        dc2 dc2Var = (dc2) b92Var.X(1, str, "general").e();
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            ca8 ca8Var = (ca8) obj;
            if (i == 0) {
                ca8Var.getClass();
                str2.getClass();
                ca8Var.d.a();
                ld4 ld4Var = ca8Var.m;
                if (ld4Var != null && (as2Var = ld4Var.e) != null) {
                }
            } else {
                ca8Var.getClass();
                ca8Var.d.a();
                ld4 ld4Var2 = ca8Var.m;
                if (ld4Var2 != null && (as2Var2 = ld4Var2.h) != null) {
                }
            }
        }
        if (dc2Var == null || (strP = dc2Var.a) == null) {
            strP = wm9.p();
        }
        b92Var.m0(new dc2(strP, "general", str, str2, 1, i, dc2Var != null ? dc2Var.g : r95.a.k().c(), r95.a.k().c()));
    }

    public final void d(Map map) {
        as2 as2Var;
        b92 b92Var = this.a.F;
        List listC = b92Var.W(1, "general").c();
        int iO = y86.O(gc1.M(listC, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listC) {
            linkedHashMap.put(((dc2) obj).c, obj);
        }
        ym9.l(b92Var, new a88(map, linkedHashMap, this, 0));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList arrayListB = this.f.b();
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListB.get(i);
                i++;
                ca8 ca8Var = (ca8) obj2;
                ca8Var.getClass();
                str.getClass();
                str2.getClass();
                ca8Var.d.a();
                ld4 ld4Var = ca8Var.m;
                if (ld4Var != null && (as2Var = ld4Var.e) != null) {
                }
            }
        }
    }

    public final void e(int i, String str, String str2) {
        String strP;
        as2 as2Var;
        b92 b92Var = this.a.F;
        int i2 = 0;
        dc2 dc2Var = (dc2) b92Var.X(0, str, "general").e();
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            ca8 ca8Var = (ca8) obj;
            if (i == 0) {
                ca8Var.A(str, str2);
            } else {
                ca8Var.getClass();
                ca8Var.d.a();
                ld4 ld4Var = ca8Var.m;
                if (ld4Var != null && (as2Var = ld4Var.g) != null) {
                }
            }
        }
        if (dc2Var == null || (strP = dc2Var.a) == null) {
            strP = wm9.p();
        }
        b92Var.m0(new dc2(strP, "general", str, str2, 0, i, dc2Var != null ? dc2Var.g : r95.a.k().c(), r95.a.k().c()));
    }

    public final void f(Map map) {
        b92 b92Var = this.a.F;
        List listC = b92Var.W(0, "general").c();
        int iO = y86.O(gc1.M(listC, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listC) {
            linkedHashMap.put(((dc2) obj).c, obj);
        }
        ym9.l(b92Var, new a88(map, linkedHashMap, this, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList arrayListB = this.f.b();
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListB.get(i);
                i++;
                ((ca8) obj2).A(str, str2);
            }
        }
    }

    public final void g(String str, String str2, String str3) {
        String strP;
        b92 b92Var = this.a.F;
        dc2 dc2Var = (dc2) b92Var.X(1, str2, str).e();
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ((ca8) obj).B(str, str2, str3);
        }
        if (dc2Var == null || (strP = dc2Var.a) == null) {
            strP = wm9.p();
        }
        b92Var.m0(new dc2(strP, str, str2, str3, 1, 0, dc2Var != null ? dc2Var.g : r95.a.k().c(), r95.a.k().c()));
    }

    public final void h(String str, Map map) {
        b92 b92Var = this.a.F;
        List listC = b92Var.W(1, str).c();
        int iO = y86.O(gc1.M(listC, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listC) {
            linkedHashMap.put(((dc2) obj).c, obj);
        }
        ym9.l(b92Var, new z78(map, linkedHashMap, this, str, 0));
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            ArrayList arrayListB = this.f.b();
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListB.get(i);
                i++;
                ((ca8) obj2).B(str, str2, str3);
            }
        }
    }

    public final void i(String str, String str2, String str3) {
        String strP;
        b92 b92Var = this.a.F;
        int i = 0;
        dc2 dc2Var = (dc2) b92Var.X(0, str2, str).e();
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ((ca8) obj).C(str, str2, str3);
        }
        if (dc2Var == null || (strP = dc2Var.a) == null) {
            strP = wm9.p();
        }
        b92Var.m0(new dc2(strP, str, str2, str3, 0, 0, dc2Var != null ? dc2Var.g : r95.a.k().c(), r95.a.k().c()));
    }

    public final void j(String str, Map map) {
        b92 b92Var = this.a.F;
        List listC = b92Var.W(0, str).c();
        int iO = y86.O(gc1.M(listC, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : listC) {
            linkedHashMap.put(((dc2) obj).c, obj);
        }
        ym9.l(b92Var, new z78(map, linkedHashMap, this, str, 1));
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            ArrayList arrayListB = this.f.b();
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListB.get(i);
                i++;
                ((ca8) obj2).C(str, str2, str3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.b88
            if (r0 == 0) goto L13
            r0 = r7
            b88 r0 = (defpackage.b88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            b88 r0 = new b88
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            x78 r2 = r6.c
            r3 = 1
            r4 = 0
            heb r5 = defpackage.heb.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            m78 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L32:
            defpackage.e11.e0(r7)
            m78 r7 = r2.a()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            v98 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            rs2 r6 = r6.e
            ld4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.i = r4
        L4d:
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            oh5 r7 = defpackage.gx3.a
            zn7 r0 = defpackage.qu1.d0(r7)
            java.lang.String r6 = r6.a
            zn7 r6 = defpackage.zn7.f(r0, r6)
            r0 = 0
            r7.R(r6, r0)
            r2.m(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.k(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.c88
            if (r0 == 0) goto L13
            r0 = r7
            c88 r0 = (defpackage.c88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            c88 r0 = new c88
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            x78 r2 = r6.c
            r3 = 1
            r4 = 0
            heb r5 = defpackage.heb.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            m78 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L32:
            defpackage.e11.e0(r7)
            m78 r7 = r2.d()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            v98 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            rs2 r6 = r6.e
            ld4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.b = r4
        L4d:
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            oh5 r7 = defpackage.gx3.a
            zn7 r0 = defpackage.qu1.d0(r7)
            java.lang.String r6 = r6.a
            zn7 r6 = defpackage.zn7.f(r0, r6)
            r0 = 0
            r7.R(r6, r0)
            r2.n(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.l(kt1):java.lang.Object");
    }

    public final void m() {
        this.a.F.Q(1, "general");
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.d.a();
            ld4 ld4Var = ca8Var.m;
            if (ld4Var != null) {
                as2 as2Var = ld4Var.e;
                if (as2Var != null) {
                    as2Var.clear();
                }
                as2 as2Var2 = ld4Var.h;
                if (as2Var2 != null) {
                    as2Var2.clear();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.d88
            if (r0 == 0) goto L13
            r0 = r7
            d88 r0 = (defpackage.d88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d88 r0 = new d88
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            x78 r2 = r6.c
            r3 = 1
            r4 = 0
            heb r5 = defpackage.heb.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            m78 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L32:
            defpackage.e11.e0(r7)
            m78 r7 = r2.g()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            v98 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            rs2 r6 = r6.e
            ld4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.d = r4
        L4d:
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            oh5 r7 = defpackage.gx3.a
            zn7 r0 = defpackage.qu1.d0(r7)
            java.lang.String r6 = r6.a
            zn7 r6 = defpackage.zn7.f(r0, r6)
            r0 = 0
            r7.R(r6, r0)
            r2.o(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.n(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.e88
            if (r0 == 0) goto L13
            r0 = r7
            e88 r0 = (defpackage.e88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            e88 r0 = new e88
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            x78 r2 = r6.c
            r3 = 1
            r4 = 0
            heb r5 = defpackage.heb.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            m78 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L4e
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L32:
            defpackage.e11.e0(r7)
            m78 r7 = r2.h()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            r0.a = r7
            r0.d = r3
            rs2 r6 = r6.e
            ld4 r6 = r6.e
            if (r6 == 0) goto L48
            r6.c = r4
        L48:
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L4d
            return r6
        L4d:
            r6 = r7
        L4e:
            oh5 r7 = defpackage.gx3.a
            zn7 r0 = defpackage.qu1.d0(r7)
            java.lang.String r6 = r6.a
            zn7 r6 = defpackage.zn7.f(r0, r6)
            r0 = 0
            r7.R(r6, r0)
            r2.p(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.o(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.f88
            if (r0 == 0) goto L13
            r0 = r7
            f88 r0 = (defpackage.f88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            f88 r0 = new f88
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            x78 r2 = r6.c
            r3 = 1
            r4 = 0
            heb r5 = defpackage.heb.a
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            m78 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L53
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L32:
            defpackage.e11.e0(r7)
            m78 r7 = r2.j()
            if (r7 != 0) goto L3c
            return r5
        L3c:
            v98 r1 = r6.g
            r1.a()
            r0.a = r7
            r0.d = r3
            rs2 r6 = r6.e
            ld4 r6 = r6.e
            if (r6 == 0) goto L4d
            r6.a = r4
        L4d:
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
        L53:
            oh5 r7 = defpackage.gx3.a
            zn7 r0 = defpackage.qu1.d0(r7)
            java.lang.String r6 = r6.a
            zn7 r6 = defpackage.zn7.f(r0, r6)
            r0 = 0
            r7.R(r6, r0)
            r2.q(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.p(kt1):java.lang.Object");
    }

    public final void q() {
        int i = 0;
        this.a.F.Q(0, "general");
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.d.a();
            ld4 ld4Var = ca8Var.m;
            if (ld4Var != null) {
                as2 as2Var = ld4Var.f;
                if (as2Var != null) {
                    as2Var.clear();
                }
                as2 as2Var2 = ld4Var.g;
                if (as2Var2 != null) {
                    as2Var2.clear();
                }
            }
        }
    }

    public final void r(String str, String str2) {
        y28 y28Var;
        b92 b92Var = this.a.F;
        b92Var.getClass();
        str2.getClass();
        str.getClass();
        ic2 ic2Var = ic2.a;
        dc2 dc2Var = (dc2) new ya2(b92Var, str2, str, new ec2(b92Var, 3)).e();
        if (dc2Var != null && dc2Var.e == 1) {
            b92Var.K(dc2Var.a);
        }
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.getClass();
            ca8Var.d.a();
            if (lc5.Q(ca8Var.a, str) && (y28Var = ca8Var.n) != null) {
                y28Var.b.c(str2);
            }
        }
    }

    public final void s(String str) {
        y28 y28Var;
        this.a.F.Q(1, str);
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.getClass();
            ca8Var.d.a();
            if (lc5.Q(ca8Var.a, str) && (y28Var = ca8Var.n) != null) {
                y28Var.b.clear();
            }
        }
    }

    public final void t(String str, String str2) {
        y28 y28Var;
        b92 b92Var = this.a.F;
        b92Var.getClass();
        str2.getClass();
        str.getClass();
        ic2 ic2Var = ic2.a;
        dc2 dc2Var = (dc2) new ya2(b92Var, str2, str, new ec2(b92Var, 3)).e();
        if (dc2Var != null && dc2Var.e == 0) {
            b92Var.K(dc2Var.a);
        }
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.getClass();
            ca8Var.d.a();
            if (lc5.Q(ca8Var.a, str) && (y28Var = ca8Var.n) != null) {
                y28Var.a.c(str2);
            }
        }
    }

    public final void u(String str) {
        y28 y28Var;
        int i = 0;
        this.a.F.Q(0, str);
        ArrayList arrayListB = this.f.b();
        int size = arrayListB.size();
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ca8 ca8Var = (ca8) obj;
            ca8Var.getClass();
            ca8Var.d.a();
            if (lc5.Q(ca8Var.a, str) && (y28Var = ca8Var.n) != null) {
                y28Var.a.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0288, code lost:
    
        if (r0 == r6) goto L114;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ff A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #3 {all -> 0x0099, blocks: (B:20:0x0094, B:42:0x0137, B:118:0x02ff, B:119:0x0306), top: B:133:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137 A[Catch: all -> 0x0099, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0099, blocks: (B:20:0x0094, B:42:0x0137, B:118:0x02ff, B:119:0x0306), top: B:133:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0288 -> B:101:0x028b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.b18 r17, defpackage.kt1 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.v(b18, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(3:13|55|56)(2:14|15))(2:16|(7:36|62|37|60|38|39|(4:48|(1:51)|(3:54|55|56)|53)(1:57))(2:58|59)))(1:17))(4:18|(1:20)|21|(1:23)(3:24|(1:27)|53))|28|66|29|32|(1:(0)(0))|53|(1:(1:65))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.w(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r6, java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.j88
            if (r0 == 0) goto L13
            r0 = r8
            j88 r0 = (defpackage.j88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            j88 r0 = new j88
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.b
            int r8 = r0.d
            r1 = 1
            r2 = 2
            r3 = 0
            xx1 r4 = defpackage.xx1.a
            if (r8 == 0) goto L37
            if (r8 == r1) goto L31
            if (r8 != r2) goto L2b
            defpackage.e11.e0(r5)
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r5)
            goto L58
        L37:
            defpackage.e11.e0(r5)
            if (r6 == 0) goto L6d
            int r5 = r6.length()
            if (r5 != 0) goto L43
            goto L6d
        L43:
            oh5 r5 = defpackage.gx3.a
            zn7 r5 = defpackage.qu1.d0(r5)
            zn7 r5 = defpackage.zn7.f(r5, r6)
            r0.a = r7
            r0.d = r1
            java.lang.Object r5 = defpackage.rs2.j(r5)
            if (r5 != r4) goto L58
            goto L6b
        L58:
            java.util.Map r5 = (java.util.Map) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L61
            goto L6d
        L61:
            r0.a = r3
            r0.d = r2
            java.lang.String r5 = U(r7, r5)
            if (r5 != r4) goto L6c
        L6b:
            return r4
        L6c:
            return r5
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.x(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r6, java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.k88
            if (r0 == 0) goto L13
            r0 = r8
            k88 r0 = (defpackage.k88) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k88 r0 = new k88
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.b
            int r8 = r0.d
            r1 = 1
            r2 = 2
            r3 = 0
            xx1 r4 = defpackage.xx1.a
            if (r8 == 0) goto L37
            if (r8 == r1) goto L31
            if (r8 != r2) goto L2b
            defpackage.e11.e0(r5)
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r5)
            goto L58
        L37:
            defpackage.e11.e0(r5)
            if (r6 == 0) goto L6d
            int r5 = r6.length()
            if (r5 != 0) goto L43
            goto L6d
        L43:
            oh5 r5 = defpackage.gx3.a
            zn7 r5 = defpackage.qu1.d0(r5)
            zn7 r5 = defpackage.zn7.f(r5, r6)
            r0.a = r7
            r0.d = r1
            java.lang.Object r5 = defpackage.rs2.m(r5)
            if (r5 != r4) goto L58
            goto L6b
        L58:
            java.util.Map r5 = (java.util.Map) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L61
            goto L6d
        L61:
            r0.a = r3
            r0.d = r2
            java.lang.String r5 = U(r7, r5)
            if (r5 != r4) goto L6c
        L6b:
            return r4
        L6c:
            return r5
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c98.y(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final n78 z() {
        x78 x78Var = this.c;
        m78 m78VarA = x78Var.a();
        if (m78VarA == null) {
            return null;
        }
        String str = m78VarA.a;
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7.f(qu1.d0(oh5Var), str))) {
            return new n78(str, m78VarA.b);
        }
        x78Var.m(null);
        return null;
    }
}
