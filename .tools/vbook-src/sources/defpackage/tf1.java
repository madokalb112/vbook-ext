package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tf1 implements t25 {
    public final String a;
    public final m62 b;
    public final is4 c;
    public final e21 d;
    public final sv8 e;
    public final t07 f;
    public wa2 s;
    public a82 t;
    public lm9 u;

    public tf1(String str, m62 m62Var, is4 is4Var, e21 e21Var, sv8 sv8Var) {
        str.getClass();
        this.a = str;
        this.b = m62Var;
        this.c = is4Var;
        this.d = e21Var;
        this.e = sv8Var;
        this.f = u07.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.v25 E(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.E(java.lang.String):v25");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r10 == r6) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable A(java.lang.String r8, java.lang.String r9, defpackage.kt1 r10) {
        /*
            r7 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = r10 instanceof defpackage.rf1
            if (r1 == 0) goto L15
            r1 = r10
            rf1 r1 = (defpackage.rf1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            rf1 r1 = new rf1
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L2e
            goto L9f
        L2e:
            r7 = move-exception
            goto Lae
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r5
        L37:
            int r7 = r1.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L2e
            goto L75
        L3d:
            defpackage.e11.e0(r10)
            is4 r7 = r7.c     // Catch: java.lang.Throwable -> L2e
            xu4 r10 = new xu4     // Catch: java.lang.Throwable -> L2e
            r10.<init>()     // Catch: java.lang.Throwable -> L2e
            j00 r2 = defpackage.yu4.a     // Catch: java.lang.Throwable -> L2e
            r8.getClass()     // Catch: java.lang.Throwable -> L2e
            rcb r2 = r10.a     // Catch: java.lang.Throwable -> L2e
            defpackage.scb.b(r2, r8)     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L5f
            int r8 = r9.length()     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto L5a
            goto L5f
        L5a:
            java.lang.String r8 = "Referer"
            ym9.g(r10, r8, r9)     // Catch: java.lang.Throwable -> L2e
        L5f:
            gu4 r8 = defpackage.gu4.b     // Catch: java.lang.Throwable -> L2e
            r10.d(r8)     // Catch: java.lang.Throwable -> L2e
            rg2 r8 = new rg2     // Catch: java.lang.Throwable -> L2e
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r1.a = r7     // Catch: java.lang.Throwable -> L2e
            r1.d = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r8.H(r1)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r6) goto L75
            goto L9e
        L75:
            gv4 r10 = (defpackage.gv4) r10     // Catch: java.lang.Throwable -> L2e
            yv4 r8 = r10.e()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = defpackage.rw1.Q(r8)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto Lac
            ks4 r8 = r10.p0()     // Catch: java.lang.Throwable -> L2e
            a91 r9 = defpackage.ug8.a(r0)     // Catch: java.lang.Throwable -> L2e
            fbb r10 = defpackage.ug8.d(r0)     // Catch: java.lang.Throwable -> L8e
            goto L8f
        L8e:
            r10 = r5
        L8f:
            bbb r0 = new bbb     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L2e
            r1.a = r7     // Catch: java.lang.Throwable -> L2e
            r1.d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r8.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r6) goto L9f
        L9e:
            return r6
        L9f:
            if (r10 == 0) goto La4
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L2e
            goto Lb3
        La4:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.ByteArray"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r7     // Catch: java.lang.Throwable -> L2e
        Lac:
            r10 = r5
            goto Lb3
        Lae:
            pm8 r10 = new pm8
            r10.<init>(r7)
        Lb3:
            boolean r7 = r10 instanceof defpackage.pm8
            if (r7 == 0) goto Lb8
            goto Lb9
        Lb8:
            r5 = r10
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.A(java.lang.String, java.lang.String, kt1):java.io.Serializable");
    }

    @Override // defpackage.t25
    public final z25 f() {
        wa2 wa2Var = this.s;
        String str = wa2Var != null ? wa2Var.b : null;
        if (str == null) {
            str = "";
        }
        return new z25(str, true, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pf1
            if (r0 == 0) goto L13
            r0 = r5
            pf1 r0 = (defpackage.pf1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pf1 r0 = new pf1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            t07 r5 = r4.f
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            wa2 r5 = r4.q()     // Catch: java.lang.Throwable -> L53
            lm9 r1 = r4.u     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L55
            lm9 r1 = new lm9     // Catch: java.lang.Throwable -> L53
            sv8 r2 = r4.e     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L53
            r4.u = r1     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L59
        L55:
            r0.q(r3)
            return r1
        L59:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.p(kt1):java.lang.Object");
    }

    public final wa2 q() throws ap3 {
        if (this.s == null) {
            m62 m62Var = this.b;
            a82 a82Var = (a82) m62Var.b.T(this.a).d();
            this.t = a82Var;
            this.s = oo3.a(m62Var, a82Var.j, a82Var.l);
        }
        wa2 wa2Var = this.s;
        if (wa2Var != null) {
            return wa2Var;
        }
        throw new ap3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Serializable, java.lang.Object] */
    @Override // defpackage.t25
    public final Object s(String str, Map map, kt1 kt1Var) throws Throwable {
        Throwable th;
        ?? r5 = 0;
        Throwable th2 = null;
        r5 = 0;
        if (iw9.K(str, "http", false)) {
            String str2 = (String) map.get("script");
            String str3 = (String) map.get("Referer");
            xx1 xx1Var = xx1.a;
            if (str2 == null || str2.length() == 0) {
                ?? A = A(str, str3, kt1Var);
                return A == xx1Var ? A : (byte[]) A;
            }
            Object objB0 = ah1.b0(rw2.a, new y(this, str2, str, r5, 21), kt1Var);
            return objB0 == xx1Var ? objB0 : (byte[]) objB0;
        }
        oh5 oh5Var = gx3.a;
        zn7 zn7VarF = zn7.f(zn7.f(zn7.f(qu1.Z(oh5Var), this.a), "images"), str);
        if (!oh5Var.e0(zn7VarF)) {
            return null;
        }
        j85 j85VarK0 = tu1.k0(zn7VarF.toFile());
        xq0 xq0Var = new xq0();
        try {
            xq0Var.K0(j85VarK0);
            byte[] bArrE0 = xq0Var.e0(xq0Var.b);
            try {
                j85VarK0.close();
                xq0Var.p();
            } catch (Throwable th3) {
                th2 = th3;
            }
            Throwable th4 = th2;
            r5 = bArrE0;
            th = th4;
        } catch (Throwable th5) {
            th = th5;
            try {
                j85VarK0.close();
                xq0Var.p();
            } catch (Throwable th6) {
                i12.r(th, th6);
            }
        }
        if (th == null) {
            return r5;
        }
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r14, defpackage.jt1 r15, java.lang.String r16) {
        /*
            r13 = this;
            boolean r2 = r15 instanceof defpackage.of1
            if (r2 == 0) goto L13
            r2 = r15
            of1 r2 = (defpackage.of1) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.e = r3
            goto L1b
        L13:
            of1 r2 = new of1
            r1 = r15
            kt1 r1 = (defpackage.kt1) r1
            r2.<init>(r13, r1)
        L1b:
            java.lang.Object r1 = r2.c
            int r3 = r2.e
            r4 = 0
            r5 = 2
            r6 = 1
            xx1 r7 = defpackage.xx1.a
            if (r3 == 0) goto L42
            if (r3 == r6) goto L37
            if (r3 != r5) goto L31
            int r2 = r2.a
            defpackage.e11.e0(r1)
            r5 = r2
            goto L65
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            return r4
        L37:
            int r3 = r2.a
            java.lang.String r6 = r2.b
            defpackage.e11.e0(r1)
            r12 = r6
            r6 = r1
            r1 = r12
            goto L55
        L42:
            defpackage.e11.e0(r1)
            r1 = r16
            r2.b = r1
            r2.a = r14
            r2.e = r6
            java.lang.Object r6 = r13.p(r2)
            if (r6 != r7) goto L54
            goto L63
        L54:
            r3 = r14
        L55:
            lm9 r6 = (defpackage.lm9) r6
            r2.b = r4
            r2.a = r3
            r2.e = r5
            java.lang.Object r1 = r6.d(r1, r2)
            if (r1 != r7) goto L64
        L63:
            return r7
        L64:
            r5 = r3
        L65:
            zl9 r1 = (defpackage.zl9) r1
            java.lang.String r2 = r1.b
            v25 r2 = E(r2)
            qa1 r3 = defpackage.r95.a
            p95 r3 = r3.k()
            long r7 = r3.c()
            m62 r3 = r13.b
            b92 r4 = r3.f
            java.util.ArrayList r2 = r2.b
            int r2 = r2.size()
            java.lang.String r6 = r13.a
            r4.v0(r2, r5, r6)
            b92 r11 = r3.s
            z92 r2 = new z92
            java.lang.String r3 = "_"
            java.lang.String r3 = defpackage.dx1.g(r5, r6, r3)
            java.lang.String r4 = "raw"
            java.lang.String r1 = r1.b
            java.util.Map r6 = java.util.Collections.singletonMap(r4, r1)
            r6.getClass()
            java.lang.String r4 = r13.a
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r11.i0(r2)
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.t(int, jt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r15 == r8) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r12, java.lang.String r13, boolean r14, defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.u(int, java.lang.String, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:175)|71|72|173|73|(9:76|179|77|78|79|87|(1:89)|90|(2:97|(1:195)(7:100|101|96|102|(1:65)|67|(0)))(6:95|96|102|(0)|67|(0)))|26|99) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0200, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0201, code lost:
    
        r52 = r15;
        r15 = r2;
        r2 = r4;
        r4 = r52;
        r52 = r6;
        r6 = r3;
        r3 = r52;
        r52 = r11;
        r11 = r5;
        r5 = r7;
        r7 = r52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:65:0x019f, B:67:0x01a5], limit reached: 191 */
    /* JADX WARN: Path cross not found for [B:67:0x01a5, B:65:0x019f], limit reached: 191 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.lang.Object, tf1] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x027a -> B:101:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x018f -> B:64:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0230 -> B:96:0x023d). Please report as a decompilation issue!!! */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r54, defpackage.kt1 r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.w(boolean, kt1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
