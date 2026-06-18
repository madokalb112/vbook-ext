package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qna {
    public final String a;
    public final m62 b;
    public final sv8 c;
    public k80 d;
    public Map e;
    public Map f;
    public hna g;
    public ArrayList h;
    public List i;
    public final t07 j;

    public qna(String str, m62 m62Var, sv8 sv8Var) {
        str.getClass();
        this.a = str;
        this.b = m62Var;
        this.c = sv8Var;
        this.j = u07.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.em8 g(defpackage.fg5 r5) {
        /*
            java.lang.String r0 = "code"
            java.lang.Object r0 = r5.get(r0)
            mf5 r0 = (defpackage.mf5) r0
            r1 = 0
            if (r0 == 0) goto L1e
            jg5 r0 = i12.L(r0)
            if (r0 == 0) goto L16
            java.lang.Integer r0 = defpackage.nf5.d(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            goto L1f
        L1e:
            r0 = 1
        L1f:
            java.lang.String r2 = "data"
            java.lang.Object r2 = r5.get(r2)
            mf5 r2 = (defpackage.mf5) r2
            if (r2 == 0) goto L2e
            java.lang.String r2 = i12.G(r2)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            r2 = r3
        L34:
            java.lang.String r4 = "data2"
            java.lang.Object r5 = r5.get(r4)
            mf5 r5 = (defpackage.mf5) r5
            if (r5 == 0) goto L42
            java.lang.String r1 = i12.G(r5)
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r1
        L46:
            em8 r5 = new em8
            r5.<init>(r0, r3, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.g(fg5):em8");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kna
            if (r0 == 0) goto L13
            r0 = r10
            kna r0 = (defpackage.kna) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kna r0 = new kna
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L41
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            r07 r9 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L2f
            goto L8c
        L2f:
            r10 = move-exception
            goto L97
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r5
        L38:
            int r1 = r0.b
            r07 r4 = r0.a
            defpackage.e11.e0(r10)
            r10 = r4
            goto L54
        L41:
            defpackage.e11.e0(r10)
            t07 r10 = r9.j
            r0.a = r10
            r1 = 0
            r0.b = r1
            r0.e = r4
            java.lang.Object r4 = r10.p(r0)
            if (r4 != r6) goto L54
            goto L8a
        L54:
            k80 r4 = r9.d     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L93
            m62 r4 = r9.b     // Catch: java.lang.Throwable -> L8e
            b92 r4 = r4.x     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = r9.a     // Catch: java.lang.Throwable -> L8e
            ra8 r4 = r4.T(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L8e
            wa2 r4 = (defpackage.wa2) r4     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L6e
            r10.q(r5)
            return r2
        L6e:
            java.util.Map r7 = r4.p     // Catch: java.lang.Throwable -> L8e
            r9.e = r7     // Catch: java.lang.Throwable -> L8e
            java.util.Map r7 = r4.q     // Catch: java.lang.Throwable -> L8e
            r9.f = r7     // Catch: java.lang.Throwable -> L8e
            sv8 r7 = r9.c     // Catch: java.lang.Throwable -> L8e
            k80 r4 = r7.a(r4)     // Catch: java.lang.Throwable -> L8e
            r9.d = r4     // Catch: java.lang.Throwable -> L8e
            r0.a = r10     // Catch: java.lang.Throwable -> L8e
            r0.b = r1     // Catch: java.lang.Throwable -> L8e
            r0.e = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r9 = r9.f(r0)     // Catch: java.lang.Throwable -> L8e
            if (r9 != r6) goto L8b
        L8a:
            return r6
        L8b:
            r9 = r10
        L8c:
            r10 = r9
            goto L93
        L8e:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
            goto L97
        L93:
            r10.q(r5)
            return r2
        L97:
            r9.q(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.a(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.lna
            if (r0 == 0) goto L13
            r0 = r12
            lna r0 = (defpackage.lna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lna r0 = new lna
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r12)
            goto L3a
        L25:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            r11 = 0
            return r11
        L2c:
            defpackage.e11.e0(r12)
            r0.c = r2
            java.lang.Object r12 = r11.a(r0)
            xx1 r0 = defpackage.xx1.a
            if (r12 != r0) goto L3a
            return r0
        L3a:
            hna r11 = r11.g
            r11.getClass()
            int r1 = r11.a
            boolean r2 = r11.b
            int r3 = r11.c
            boolean r9 = r11.d
            java.lang.String r10 = r11.e
            xka r0 = new xka
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = 1
            r4 = 1
            r5 = 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.b(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(defpackage.kt1 r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mna
            if (r0 == 0) goto L13
            r0 = r5
            mna r0 = (defpackage.mna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mna r0 = new mna
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.e11.e0(r5)
            goto L3a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2c:
            defpackage.e11.e0(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L3a
            return r0
        L3a:
            java.util.List r4 = r4.i
            if (r4 == 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L4d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r4.next()
            ina r5 = (defpackage.ina) r5
            yka r0 = new yka
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.b
            r0.<init>(r1, r5)
            r2.add(r0)
            goto L4d
        L66:
            if (r2 != 0) goto L6b
            lc3 r4 = defpackage.lc3.a
            return r4
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.c(kt1):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v20, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r8, java.lang.String r9, defpackage.kt1 r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.d(java.lang.String, java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ona
            if (r0 == 0) goto L13
            r0 = r8
            ona r0 = (defpackage.ona) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ona r0 = new ona
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L3e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L2e:
            defpackage.e11.e0(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r0)
            xx1 r0 = defpackage.xx1.a
            if (r8 != r0) goto L3e
            return r0
        L3e:
            java.util.ArrayList r6 = r6.h
            if (r6 == 0) goto L8a
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L4d:
            if (r2 >= r0) goto L64
            java.lang.Object r4 = r6.get(r2)
            int r2 = r2 + 1
            r5 = r4
            jna r5 = (defpackage.jna) r5
            java.lang.String r5 = r5.c
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L4d
            r8.add(r4)
            goto L4d
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.gc1.M(r8, r6)
            r2.<init>(r6)
            int r6 = r8.size()
        L73:
            if (r1 >= r6) goto L8a
            java.lang.Object r7 = r8.get(r1)
            int r1 = r1 + 1
            jna r7 = (defpackage.jna) r7
            cla r0 = new cla
            java.lang.String r4 = r7.a
            java.lang.String r7 = r7.b
            r0.<init>(r4, r7, r3)
            r2.add(r0)
            goto L73
        L8a:
            if (r2 != 0) goto L8f
            lc3 r6 = defpackage.lc3.a
            return r6
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.e(java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.f(kt1):java.lang.Object");
    }
}
