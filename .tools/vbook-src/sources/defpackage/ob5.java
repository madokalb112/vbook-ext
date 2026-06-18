package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ob5 {
    public final yp8 a;
    public AutoCloseable b;

    public ob5(yp8 yp8Var) {
        this.a = yp8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /* JADX WARN: Type inference failed for: r0v54, types: [ww] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [ww] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v13, types: [int] */
    /* JADX WARN: Type inference failed for: r12v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [ww] */
    /* JADX WARN: Type inference failed for: r13v13, types: [fv4, hu4, java.lang.String, java.util.LinkedHashMap, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [ww] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r20v0, types: [ob5] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [ww] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ww] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [ww] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v36, types: [fv4, hu4, java.lang.String, java.util.LinkedHashMap, java.util.List, qk9, ww] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r9v14, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02fd -> B:114:0x02ff). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ob5 r20, defpackage.qk9 r21, defpackage.kt1 r22) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob5.a(ob5, qk9, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0 A[LOOP:0: B:35:0x009a->B:37:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ww r8, int r9, defpackage.kt1 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.lb5
            if (r0 == 0) goto L13
            r0 = r10
            lb5 r0 = (defpackage.lb5) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            lb5 r0 = new lb5
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r7 = r0.f
            int r10 = r0.t
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L37
            if (r10 != r2) goto L30
            int r8 = r0.e
            int r9 = r0.d
            int r10 = r0.c
            java.util.List r3 = r0.b
            ww r4 = r0.a
            defpackage.e11.e0(r7)
            goto L6a
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L37:
            defpackage.e11.e0(r7)
            if (r9 > 0) goto L3f
            byte[] r7 = new byte[r1]
            return r7
        L3f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3 = r7
            r7 = r9
            r10 = r1
        L47:
            if (r9 <= 0) goto L7f
            r4 = 1024(0x400, float:1.435E-42)
            int r4 = java.lang.Math.min(r4, r9)
            r0.a = r8
            r0.b = r3
            r0.c = r7
            r0.d = r10
            r0.e = r9
            r0.t = r2
            java.io.Serializable r4 = defpackage.jf0.B(r8, r4, r0)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L64
            return r5
        L64:
            r6 = r10
            r10 = r7
            r7 = r4
            r4 = r8
            r8 = r9
            r9 = r6
        L6a:
            byte[] r7 = (byte[]) r7
            int r5 = r7.length
            if (r5 != 0) goto L71
            r10 = r9
            goto L7f
        L71:
            r3.add(r7)
            int r5 = r7.length
            int r9 = r9 + r5
            int r7 = r7.length
            int r7 = r8 - r7
            r8 = r9
            r9 = r7
            r7 = r10
            r10 = r8
            r8 = r4
            goto L47
        L7f:
            int r7 = r3.size()
            if (r7 != r2) goto L93
            java.lang.Object r7 = defpackage.fc1.x0(r3)
            byte[] r7 = (byte[]) r7
            int r7 = r7.length
            if (r10 != r7) goto L93
            java.lang.Object r7 = defpackage.fc1.x0(r3)
            return r7
        L93:
            byte[] r7 = new byte[r10]
            java.util.Iterator r8 = r3.iterator()
            r2 = r1
        L9a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lb3
            java.lang.Object r9 = r8.next()
            r0 = r9
            byte[] r0 = (byte[]) r0
            r4 = 0
            r5 = 12
            r3 = 0
            r1 = r7
            defpackage.fw.W(r0, r1, r2, r3, r4, r5)
            int r7 = r0.length
            int r2 = r2 + r7
            r7 = r1
            goto L9a
        Lb3:
            r1 = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob5.b(ww, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r7, defpackage.kt1 r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mb5
            if (r0 == 0) goto L13
            r0 = r8
            mb5 r0 = (defpackage.mb5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            mb5 r0 = new mb5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            ob5 r6 = r0.b
            defpackage.e11.e0(r8)
            goto L7f
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L33:
            int r7 = r0.a
            defpackage.e11.e0(r8)
            goto L4b
        L39:
            defpackage.e11.e0(r8)
            r0.a = r7
            r0.e = r3
            r8 = 511(0x1ff, float:7.16E-43)
            s00 r1 = defpackage.sy.a
            java.lang.Object r8 = r1.l(r7, r8, r0, r9)
            if (r8 != r5) goto L4b
            goto L7d
        L4b:
            sk9 r8 = (defpackage.sk9) r8
            mt4 r9 = new mt4
            r1 = 3
            r9.<init>(r6, r4, r1)
            r0.b = r6
            r0.a = r7
            r0.e = r2
            r8.getClass()
            jx1 r7 = r0.getContext()
            iw0 r7 = defpackage.wx1.b(r7)
            y r0 = new y
            r2 = 11
            r0.<init>(r8, r9, r4, r2)
            oq9 r7 = defpackage.ah1.J(r7, r4, r4, r0, r1)
            ub r8 = new ub
            r9 = 13
            r8.<init>(r7, r9)
            xwa r7 = new xwa
            r7.<init>(r8)
            if (r7 != r5) goto L7e
        L7d:
            return r5
        L7e:
            r8 = r7
        L7f:
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8
            r6.b = r8
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob5.c(int, kt1, java.lang.String):java.lang.Object");
    }

    public final void d() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = this.b;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    w58.p();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.qk9 r11, java.lang.String r12, defpackage.fv4 r13, defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob5.e(qk9, java.lang.String, fv4, kt1):java.lang.Object");
    }
}
