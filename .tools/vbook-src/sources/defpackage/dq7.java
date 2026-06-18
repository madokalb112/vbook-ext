package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dq7 implements t25 {
    public final String a;
    public final t07 b;
    public tm c;
    public boolean d;

    public dq7(String str, m62 m62Var) {
        str.getClass();
        this.a = str;
        this.b = u07.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        this.d = true;
        AutoCloseable autoCloseable = this.c;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    w58.p();
                    return;
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        this.c = null;
    }

    @Override // defpackage.t25
    public final z25 f() {
        return new z25("PDF", false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cq7
            if (r0 == 0) goto L13
            r0 = r5
            cq7 r0 = (defpackage.cq7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cq7 r0 = new cq7
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
            t07 r5 = r4.b
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            tm r5 = r4.c     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L66
            oh5 r5 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L64
            zn7 r5 = defpackage.qu1.Z(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L64
            zn7 r5 = defpackage.zn7.f(r5, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "data"
            zn7 r5 = defpackage.zn7.f(r5, r1)     // Catch: java.lang.Throwable -> L64
            av0 r5 = r5.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.s()     // Catch: java.lang.Throwable -> L64
            tm r5 = ae9.a(r5)     // Catch: java.lang.Throwable -> L64
            r4.c = r5     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r4 = move-exception
            goto L6a
        L66:
            r0.q(r3)
            return r5
        L6a:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.p(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r6, java.util.Map r7, defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r7 = r8 instanceof defpackage.bq7
            if (r7 == 0) goto L13
            r7 = r8
            bq7 r7 = (defpackage.bq7) r7
            int r0 = r7.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.d = r0
            goto L18
        L13:
            bq7 r7 = new bq7
            r7.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r7.b
            int r0 = r7.d
            r1 = 2
            r2 = 1
            r3 = 0
            xx1 r4 = defpackage.xx1.a
            if (r0 == 0) goto L37
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2b
            defpackage.e11.e0(r8)
            return r8
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r3
        L31:
            java.lang.String r6 = r7.a
            defpackage.e11.e0(r8)
            goto L49
        L37:
            defpackage.e11.e0(r8)
            boolean r8 = r5.d
            if (r8 != 0) goto L60
            r7.a = r6
            r7.d = r2
            java.lang.Object r8 = r5.p(r7)
            if (r8 != r4) goto L49
            goto L5e
        L49:
            tm r8 = (defpackage.tm) r8
            aj2 r5 = defpackage.rw2.a
            mt4 r0 = new mt4
            r2 = 20
            r0.<init>(r6, r8, r3, r2)
            r7.a = r3
            r7.d = r1
            java.lang.Object r5 = defpackage.ah1.b0(r5, r0, r7)
            if (r5 != r4) goto L5f
        L5e:
            return r4
        L5f:
            return r5
        L60:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.s(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    @Override // defpackage.t25
    public final Object t(int i, jt1 jt1Var, String str) {
        return heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r10 == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r7, java.lang.String r8, boolean r9, defpackage.kt1 r10) {
        /*
            r6 = this;
            boolean r8 = r10 instanceof defpackage.aq7
            if (r8 == 0) goto L13
            r8 = r10
            aq7 r8 = (defpackage.aq7) r8
            int r0 = r8.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.e = r0
            goto L18
        L13:
            aq7 r8 = new aq7
            r8.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r8.c
            int r0 = r8.e
            r1 = 2
            r2 = 1
            xx1 r3 = defpackage.xx1.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2a
            defpackage.e11.e0(r10)
            goto L5c
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L31:
            boolean r9 = r8.b
            int r7 = r8.a
            defpackage.e11.e0(r10)
            goto L4d
        L39:
            defpackage.e11.e0(r10)
            boolean r10 = r6.d
            if (r10 != 0) goto L96
            r8.a = r7
            r8.b = r9
            r8.e = r2
            java.lang.Object r10 = r6.p(r8)
            if (r10 != r3) goto L4d
            goto L5b
        L4d:
            tm r10 = (defpackage.tm) r10
            r8.a = r7
            r8.b = r9
            r8.e = r1
            java.io.Serializable r10 = r10.A(r8)
            if (r10 != r3) goto L5c
        L5b:
            return r3
        L5c:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r10, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L6d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L90
            java.lang.Object r9 = r8.next()
            dj7 r9 = (defpackage.dj7) r9
            y25 r0 = new y25
            int r9 = r9.a
            java.lang.String r10 = ":"
            java.lang.String r1 = r6.a
            java.lang.String r1 = defpackage.dx1.g(r9, r1, r10)
            r3 = 0
            r4 = 0
            r2 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L6d
        L90:
            v25 r6 = new v25
            r6.<init>(r7)
            return r6
        L96:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq7.u(int, java.lang.String, boolean, kt1):java.lang.Object");
    }

    @Override // defpackage.t25
    public final Object w(boolean z, kt1 kt1Var) {
        return new Integer(0);
    }
}
