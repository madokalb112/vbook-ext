package defpackage;

import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r01 {
    public int a;
    public long b;
    public Object c;

    public r01(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.a     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r4.c     // Catch: java.lang.Throwable -> L1b
            jjb r0 = (defpackage.jjb) r0     // Catch: java.lang.Throwable -> L1b
            p38 r0 = r0.a     // Catch: java.lang.Throwable -> L1b
            r0.getClass()     // Catch: java.lang.Throwable -> L1b
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1b
            long r2 = r4.b     // Catch: java.lang.Throwable -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto L1d
        L19:
            r0 = 0
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 1
        L1e:
            monitor-exit(r4)
            return r0
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r01.a():boolean");
    }

    public synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.a = 0;
            }
            return;
        }
        this.a++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.a);
                ((jjb) this.c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((jjb) this.c).a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
