package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class is4 implements vx1, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(is4.class, "closed");
    public final dc7 a;
    public final ae5 b;
    public final jx1 c;
    private volatile /* synthetic */ int closed = 0;
    public final ru4 d;
    public final ru4 e;
    public final ru4 f;
    public final ru4 s;
    public final on1 t;
    public final gi8 u;
    public final ps4 v;

    public is4(dc7 dc7Var, ps4 ps4Var) {
        this.a = dc7Var;
        jx1 jx1Var = dc7Var.t;
        s00 s00Var = s00.s;
        ae5 ae5Var = new ae5((yd5) jx1Var.get(s00Var));
        this.b = ae5Var;
        this.c = dc7Var.t.plus(ae5Var);
        this.d = new ru4(1);
        this.e = new ru4(2);
        ru4 ru4Var = new ru4(3);
        this.f = ru4Var;
        this.s = new ru4(0);
        this.t = new on1();
        this.u = new gi8(16, false);
        ps4 ps4Var2 = new ps4();
        this.v = ps4Var2;
        jt1 jt1Var = null;
        ru4Var.g(ru4.w, new dk0(this, dc7Var, null));
        ru4Var.g(ru4.x, new xa(this, jt1Var, 17));
        int i = 14;
        ps4Var2.a(zu4.b, new xl4(i));
        ps4Var2.a(fi0.c, new xl4(i));
        ps4Var2.a(n03.d, new xl4(i));
        if (ps4Var.f) {
            ps4Var2.c.put("DefaultTransformers", new xl4(12));
        }
        ps4Var2.a(tv4.b, new xl4(i));
        y91 y91Var = gs4.b;
        ps4Var2.a(y91Var, new xl4(i));
        if (ps4Var.e) {
            ps4Var2.a(vu4.d, new xl4(i));
        }
        ps4Var2.e = ps4Var.e;
        ps4Var2.f = ps4Var.f;
        ps4Var2.a.putAll(ps4Var.a);
        ps4Var2.b.putAll(ps4Var.b);
        ps4Var2.c.putAll(ps4Var.c);
        if (ps4Var.f) {
            ps4Var2.a(pu4.b, new xl4(i));
        }
        j00 j00Var = xi2.a;
        ps4Var2.a(y91Var, new oc2(ps4Var2));
        Iterator it = ps4Var2.a.values().iterator();
        while (it.hasNext()) {
            ((kb4) it.next()).invoke(this);
        }
        Iterator it2 = ps4Var2.c.values().iterator();
        while (it2.hasNext()) {
            ((kb4) it2.next()).invoke(this);
        }
        this.e.g(ru4.o, new lb(this, jt1Var, 6));
        ts4.d.incrementAndGet(dc7Var);
        hx1 hx1Var = this.c.get(s00Var);
        hx1Var.getClass();
        ((yd5) hx1Var).invokeOnCompletion(new rx2(dc7Var, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(defpackage.xu4 r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hs4
            if (r0 == 0) goto L13
            r0 = r6
            hs4 r0 = (defpackage.hs4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hs4 r0 = new hs4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L45
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            gi8 r6 = r4.u
            js8 r1 = defpackage.s91.a
            r6.l(r1)
            java.lang.Object r6 = r5.d
            r0.c = r2
            ru4 r4 = r4.d
            java.lang.Object r6 = r4.a(r5, r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L45
            return r4
        L45:
            r6.getClass()
            ks4 r6 = (defpackage.ks4) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is4.E(xu4, kt1):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        if (w.compareAndSet(this, 0, 1)) {
            on1 on1Var = (on1) this.t.c(bt4.a);
            for (j00 j00Var : fc1.Z0(on1Var.d().keySet())) {
                j00Var.getClass();
                Object objC = on1Var.c(j00Var);
                if (objC instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) objC;
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
            }
            this.b.o0();
        }
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.c;
    }

    public final String toString() {
        return "HttpClient[" + this.a + ']';
    }
}
