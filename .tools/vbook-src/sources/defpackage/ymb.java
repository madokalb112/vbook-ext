package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ymb implements ax {
    public static jnb i(ymb ymbVar, String str, boolean z, long j, long j2, int i, double d, double d2, double d3, int i2) {
        long j3 = (i2 & 16) != 0 ? -1L : j2;
        int i3 = (i2 & 32) != 0 ? 511 : i;
        double d4 = (i2 & 256) != 0 ? 0.0d : d;
        double d5 = (i2 & 512) != 0 ? 0.0d : d2;
        double d6 = (i2 & 1024) != 0 ? d5 : d3;
        ymbVar.getClass();
        str.getClass();
        return new jnb(ymbVar.k().b(str), true, z, j, -1L, j3, i3, "nobody", "nobody", d4, d5, d6, null, null, null);
    }

    public static jnb j(ymb ymbVar, String str) {
        ymbVar.getClass();
        str.getClass();
        return new jnb(ymbVar.k().b(str), false, false, 0L, -1L, -1L, 511, "nobody", "nobody", 0.0d, 0.0d, 0.0d, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ymb] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ax] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable p(defpackage.ymb r9, java.lang.String r10, defpackage.d66 r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof defpackage.xmb
            if (r0 == 0) goto L13
            r0 = r12
            xmb r0 = (defpackage.xmb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xmb r0 = new xmb
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L4d
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L34
            byte[] r9 = r0.b
            java.lang.Object r10 = r0.a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            defpackage.e11.e0(r12)
            goto L92
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r5
        L3a:
            java.lang.Object r9 = r0.a
            ax r9 = (defpackage.ax) r9
            defpackage.e11.e0(r12)     // Catch: java.lang.Throwable -> L42
            goto L7e
        L42:
            r10 = move-exception
            goto L82
        L44:
            java.lang.Object r9 = r0.a
            r11 = r9
            d66 r11 = (defpackage.d66) r11
            defpackage.e11.e0(r12)
            goto L5d
        L4d:
            defpackage.e11.e0(r12)
            inb r12 = defpackage.inb.READ
            r0.a = r11
            r0.e = r4
            java.lang.Object r12 = r9.n(r10, r12, r0)
            if (r12 != r6) goto L5d
            goto L90
        L5d:
            r9 = r12
            ax r9 = (defpackage.ax) r9
            r10 = r9
            yy r10 = (defpackage.yy) r10     // Catch: java.lang.Throwable -> L42
            long r7 = r11.a     // Catch: java.lang.Throwable -> L42
            r10.b = r7     // Catch: java.lang.Throwable -> L42
            long r11 = r11.b     // Catch: java.lang.Throwable -> L42
            long r11 = r11 - r7
            r7 = 2147483646(0x7ffffffe, double:1.0609978945E-314)
            long r11 = java.lang.Math.min(r7, r11)     // Catch: java.lang.Throwable -> L42
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L42
            int r11 = r11 + r4
            r0.a = r9     // Catch: java.lang.Throwable -> L42
            r0.e = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r12 = defpackage.ql9.A(r10, r11, r0)     // Catch: java.lang.Throwable -> L42
            if (r12 != r6) goto L7e
            goto L90
        L7e:
            byte[] r12 = (byte[]) r12     // Catch: java.lang.Throwable -> L42
            r10 = r5
            r5 = r12
        L82:
            if (r9 == 0) goto L93
            r0.a = r10
            r0.b = r5
            r0.e = r2
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r6) goto L91
        L90:
            return r6
        L91:
            r9 = r5
        L92:
            r5 = r9
        L93:
            if (r10 != 0) goto L96
            return r5
        L96:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymb.p(ymb, java.lang.String, d66, kt1):java.io.Serializable");
    }

    @Override // defpackage.ax
    public Object a(kt1 kt1Var) {
        return heb.a;
    }

    public final gnb k() {
        return new gnb(this, "");
    }

    public abstract Object l(String str, kt1 kt1Var);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r6, defpackage.kt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.wmb
            if (r0 == 0) goto L13
            r0 = r7
            wmb r0 = (defpackage.wmb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wmb r0 = new wmb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.e11.e0(r7)
            return r7
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L31:
            defpackage.e11.e0(r7)
            goto L41
        L35:
            defpackage.e11.e0(r7)
            r0.c = r3
            java.lang.Object r7 = r5.l(r6, r0)
            if (r7 != r4) goto L41
            goto L50
        L41:
            b24 r7 = (defpackage.b24) r7
            r0.c = r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r5 = defpackage.cx1.x0(r7, r5, r0)
            if (r5 != r4) goto L51
        L50:
            return r4
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymb.m(java.lang.String, kt1):java.lang.Object");
    }

    public abstract Object n(String str, inb inbVar, kt1 kt1Var);

    public Object o(String str, d66 d66Var, kt1 kt1Var) {
        return p(this, str, d66Var, kt1Var);
    }

    public abstract Object q(String str, kt1 kt1Var);

    public String toString() {
        return tu1.M(ug8.a(getClass())).getSimpleName();
    }
}
