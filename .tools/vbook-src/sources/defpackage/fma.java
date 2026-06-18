package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fma extends qtb {
    public final tna c;
    public final qp3 d;
    public final fr9 e;
    public final d6a f;

    public fma(tna tnaVar, qp3 qp3Var) {
        this.c = tnaVar;
        this.d = qp3Var;
        lc3 lc3Var = lc3.a;
        this.e = gr9.a(new sla(1.0f, 1.0f, "", lc3Var, "", lc3Var, "", lc3Var, "", 0, lc3Var, false, "", "", 0, false));
        this.f = new d6a(new nda(7));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new ula(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.fma r7, defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.j(fma, kt1):java.lang.Object");
    }

    public static final void k(fma fmaVar) {
        za1 za1VarA = vtb.a(fmaVar);
        aj2 aj2Var = rw2.a;
        fmaVar.g(za1VarA, nh2.c, new ula(fmaVar, null, 2));
    }

    public final void d() {
        qtb.h(this, utb.a(this), new ula(this, null, 1));
    }

    public final p8b l() {
        return (p8b) this.f.getValue();
    }

    public final void m() {
        Object value;
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, sla.a((sla) value, 0.0f, 0.0f, (String) null, (ArrayList) null, (String) null, (List) null, (String) null, (List) null, (String) null, 0, (List) null, false, fc1.D0(((zna) this.c).l(), null, null, null, new uha(10), 31), (String) null, 0, false, 61439)));
        }
    }

    public final void n() {
        Object value;
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, sla.a((sla) value, 0.0f, 0.0f, (String) null, (ArrayList) null, (String) null, (List) null, (String) null, (List) null, (String) null, ((zna) this.c).g(), (List) null, false, (String) null, (String) null, 0, false, 65023)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[LOOP:0: B:52:0x00d9->B:56:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.kt1 r24) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.o(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof defpackage.ama
            if (r2 == 0) goto L17
            r2 = r1
            ama r2 = (defpackage.ama) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            ama r2 = new ama
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.c
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L29
            defpackage.e11.e0(r1)
            goto L47
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L30:
            defpackage.e11.e0(r1)
            p8b r1 = r0.l()
            r2.c = r4
            dla r1 = r1.a
            r1.getClass()
            java.lang.Object r1 = r1.k(r2)
            xx1 r2 = defpackage.xx1.a
            if (r1 != r2) goto L47
            return r2
        L47:
            xka r1 = (defpackage.xka) r1
            fr9 r2 = r0.e
            if (r2 == 0) goto L8c
        L4d:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            sla r4 = (sla) r4
            boolean r5 = r1.i
            java.lang.String r6 = r1.j
            tna r7 = r0.c
            zna r7 = (defpackage.zna) r7
            int r7 = r7.f()
            int r8 = r1.c
            if (r7 >= 0) goto L67
            r19 = r8
            goto L6c
        L67:
            if (r7 <= r8) goto L6a
            r7 = r8
        L6a:
            r19 = r7
        L6c:
            r20 = 0
            r21 = 38911(0x97ff, float:5.4526E-41)
            r16 = r5
            r5 = 0
            r18 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            sla r4 = sla.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r3 = r2.j(r3, r4)
            if (r3 == 0) goto L4d
        L8c:
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.p(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[LOOP:0: B:78:0x0136->B:88:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.kt1 r28) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.q(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r1 == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.kt1 r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof defpackage.cma
            if (r2 == 0) goto L17
            r2 = r1
            cma r2 = (defpackage.cma) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            cma r2 = new cma
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.c
            heb r4 = defpackage.heb.a
            r5 = 2
            r6 = 1
            tna r7 = r0.c
            xx1 r8 = defpackage.xx1.a
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L39
            if (r3 != r5) goto L32
            defpackage.e11.e0(r1)
            goto L78
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L39:
            defpackage.e11.e0(r1)
            goto L5c
        L3d:
            defpackage.e11.e0(r1)
            p8b r1 = r0.l()
            r3 = r7
            zna r3 = (defpackage.zna) r3
            float r3 = r3.k()
            r2.c = r6
            dla r1 = r1.a
            if (r1 == 0) goto L58
            java.lang.Object r1 = r1.g(r3, r2)
            if (r1 != r8) goto L58
            goto L59
        L58:
            r1 = r4
        L59:
            if (r1 != r8) goto L5c
            goto L77
        L5c:
            p8b r1 = r0.l()
            r3 = r7
            zna r3 = (defpackage.zna) r3
            float r3 = r3.j()
            r2.c = r5
            dla r1 = r1.a
            if (r1 == 0) goto L74
            java.lang.Object r1 = r1.i(r3, r2)
            if (r1 != r8) goto L74
            goto L75
        L74:
            r1 = r4
        L75:
            if (r1 != r8) goto L78
        L77:
            return r8
        L78:
            fr9 r0 = r0.e
            if (r0 == 0) goto Lb2
        L7c:
            java.lang.Object r1 = r0.getValue()
            r8 = r1
            sla r8 = (sla) r8
            r2 = r7
            zna r2 = (defpackage.zna) r2
            float r9 = r2.k()
            float r10 = r2.j()
            r24 = 0
            r25 = 65532(0xfffc, float:9.183E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            sla r2 = sla.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r1 = r0.j(r1, r2)
            if (r1 == 0) goto L7c
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.r(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[LOOP:0: B:47:0x0106->B:52:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.kt1 r29) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.s(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb A[LOOP:0: B:52:0x00fb->B:56:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.kt1 r24) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fma.t(kt1):java.lang.Object");
    }
}
