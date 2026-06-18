package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c2a implements wx {
    public final r5a a;

    public c2a(r5a r5aVar) {
        this.a = r5aVar;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        boolean zIsTerminated;
        Object obj = this.a;
        if (!(obj instanceof AutoCloseable)) {
            obj = null;
        }
        if (obj != null && !(obj instanceof AutoCloseable)) {
            if (!(obj instanceof ExecutorService)) {
                w58.p();
                return null;
            }
            ExecutorService executorService = (ExecutorService) obj;
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
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.b2a
            if (r0 == 0) goto L13
            r0 = r5
            b2a r0 = (defpackage.b2a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L1a
        L13:
            b2a r0 = new b2a
            kt1 r5 = (defpackage.kt1) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L35
            r4 = 1
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.e11.e0(r5)
            return r5
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L31:
            defpackage.e11.e0(r5)
            goto L42
        L35:
            defpackage.e11.e0(r5)
            r5a r4 = r4.a
            long r4 = r4.c
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r5 = r1
        L42:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L50
            long r4 = r5.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        L50:
            r0.c = r3
            xr0.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2a.c(jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.a2a
            if (r0 == 0) goto L13
            r0 = r5
            a2a r0 = (defpackage.a2a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            a2a r0 = new a2a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L33
            r4 = 1
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.e11.e0(r5)
            return r5
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2f:
            defpackage.e11.e0(r5)
            goto L47
        L33:
            defpackage.e11.e0(r5)
            r5a r4 = r4.a
            te6 r4 = r4.a
            java.lang.Object r4 = r4.c
            b10 r4 = (defpackage.b10) r4
            int r4 = r4.b
            long r4 = (long) r4
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r5 = r1
        L47:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L55
            long r4 = r5.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        L55:
            r0.c = r3
            xr0.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2a.e(kt1):java.lang.Object");
    }

    @Override // defpackage.vx
    public final Object g(byte[] bArr, int i, int i2, kt1 kt1Var) {
        return new Integer(this.a.read(bArr, i, i2));
    }

    @Override // defpackage.fx
    public final Object h(kt1 kt1Var) {
        return sdc.m0(this, kt1Var);
    }
}
