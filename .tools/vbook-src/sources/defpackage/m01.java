package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m01 implements t25 {
    public final String a;
    public final t07 b;
    public gnb c;
    public boolean d;
    public final /* synthetic */ int e;
    public final String f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m01(String str, m62 m62Var, int i) {
        this(str, m62Var, (byte) 0);
        this.e = i;
        str.getClass();
        switch (i) {
            case 1:
                this(str, m62Var, (byte) 0);
                this.f = str;
                break;
            default:
                this.f = str;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p(defpackage.m01 r6, java.lang.String r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.kv3
            if (r0 == 0) goto L13
            r0 = r8
            kv3 r0 = (defpackage.kv3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kv3 r0 = new kv3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L49
        L37:
            defpackage.e11.e0(r8)
            boolean r8 = r6.d
            if (r8 != 0) goto L5b
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.q(r0)
            if (r8 != r5) goto L49
            goto L59
        L49:
            gnb r8 = (defpackage.gnb) r8
            gnb r6 = r8.b(r7)
            r0.a = r4
            r0.d = r2
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r5) goto L5a
        L59:
            return r5
        L5a:
            return r6
        L5b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.p(m01, java.lang.String, kt1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d = true;
        this.c = null;
    }

    @Override // defpackage.t25
    public final z25 f() {
        switch (this.e) {
            case 0:
                return new z25("CBZ", false, false, false);
            default:
                return new z25("ZIP", false, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.lv3
            if (r0 == 0) goto L13
            r0 = r10
            lv3 r0 = (defpackage.lv3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            lv3 r0 = new lv3
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 2
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            r07 r0 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L2d
            goto L82
        L2d:
            r9 = move-exception
            goto L8c
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r4
        L35:
            int r1 = r0.b
            r07 r6 = r0.a
            defpackage.e11.e0(r10)
            r10 = r6
            goto L56
        L3e:
            defpackage.e11.e0(r10)
            gnb r10 = r9.c
            if (r10 == 0) goto L46
            return r10
        L46:
            t07 r10 = r9.b
            r0.a = r10
            r1 = 0
            r0.b = r1
            r0.e = r2
            java.lang.Object r6 = r10.p(r0)
            if (r6 != r5) goto L56
            goto L7e
        L56:
            oh5 r6 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L8a
            zn7 r6 = defpackage.qu1.Z(r6)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r9.a     // Catch: java.lang.Throwable -> L8a
            zn7 r6 = defpackage.zn7.f(r6, r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = "data"
            zn7 r6 = defpackage.zn7.f(r6, r7)     // Catch: java.lang.Throwable -> L8a
            av0 r6 = r6.a     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.s()     // Catch: java.lang.Throwable -> L8a
            gnb r6 = defpackage.anb.b(r6)     // Catch: java.lang.Throwable -> L8a
            r0.a = r10     // Catch: java.lang.Throwable -> L8a
            r0.b = r1     // Catch: java.lang.Throwable -> L8a
            r0.e = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = defpackage.wn9.G(r6, r2, r2, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 != r5) goto L7f
        L7e:
            return r5
        L7f:
            r8 = r0
            r0 = r10
            r10 = r8
        L82:
            gnb r10 = (defpackage.gnb) r10     // Catch: java.lang.Throwable -> L2d
            r9.c = r10     // Catch: java.lang.Throwable -> L2d
            r0.q(r4)
            return r10
        L8a:
            r9 = move-exception
            r0 = r10
        L8c:
            r0.q(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.q(kt1):java.lang.Object");
    }

    @Override // defpackage.t25
    public final Object s(String str, Map map, kt1 kt1Var) {
        return p(this, str, kt1Var);
    }

    @Override // defpackage.t25
    public final Object t(int i, jt1 jt1Var, String str) {
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r15 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        if (r15 == r5) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r12, java.lang.String r13, boolean r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m01.u(int, java.lang.String, boolean, kt1):java.lang.Object");
    }

    @Override // defpackage.t25
    public final Object w(boolean z, kt1 kt1Var) {
        return new Integer(0);
    }

    public m01(String str, m62 m62Var, byte b) {
        str.getClass();
        this.a = str;
        this.b = u07.a();
    }
}
