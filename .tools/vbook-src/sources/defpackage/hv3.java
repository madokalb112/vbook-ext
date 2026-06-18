package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hv3 implements ag9 {
    public final zg5 a;
    public long b;
    public boolean c;

    public hv3(zg5 zg5Var) {
        zg5Var.getClass();
        this.a = zg5Var;
        this.b = 0L;
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zg5 zg5Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = zg5Var.d;
        reentrantLock.lock();
        try {
            int i = zg5Var.c - 1;
            zg5Var.c = i;
            if (i == 0) {
                if (zg5Var.b) {
                    synchronized (zg5Var) {
                        zg5Var.e.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.ag9, java.io.Flushable
    public final void flush() {
        if (this.c) {
            gp.j("closed");
            return;
        }
        zg5 zg5Var = this.a;
        synchronized (zg5Var) {
            zg5Var.e.getFD().sync();
        }
    }

    @Override // defpackage.ag9
    public final uua l() {
        return uua.d;
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) {
        if (this.c) {
            gp.j("closed");
            return;
        }
        zg5 zg5Var = this.a;
        long j2 = this.b;
        zg5Var.getClass();
        ah1.z(xq0Var.b, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            oz8 oz8Var = xq0Var.a;
            oz8Var.getClass();
            int iMin = (int) Math.min(j3 - j2, oz8Var.c - oz8Var.b);
            byte[] bArr = oz8Var.a;
            int i = oz8Var.b;
            synchronized (zg5Var) {
                bArr.getClass();
                zg5Var.e.seek(j2);
                zg5Var.e.write(bArr, i, iMin);
            }
            int i2 = oz8Var.b + iMin;
            oz8Var.b = i2;
            long j4 = iMin;
            j2 += j4;
            xq0Var.b -= j4;
            if (i2 == oz8Var.c) {
                xq0Var.a = oz8Var.a();
                xz8.a(oz8Var);
            }
        }
        this.b += j;
    }
}
