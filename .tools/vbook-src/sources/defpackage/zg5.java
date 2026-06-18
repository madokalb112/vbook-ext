package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zg5 implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d = new ReentrantLock();
    public final RandomAccessFile e;

    public zg5(boolean z, RandomAccessFile randomAccessFile) {
        this.a = z;
        this.e = randomAccessFile;
    }

    public static hv3 p(zg5 zg5Var) {
        if (!zg5Var.a) {
            gp.j("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = zg5Var.d;
        reentrantLock.lock();
        try {
            if (zg5Var.b) {
                throw new IllegalStateException("closed");
            }
            zg5Var.c++;
            reentrantLock.unlock();
            return new hv3(zg5Var);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            synchronized (this) {
                this.e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.a) {
            gp.j("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final iv3 q(long j) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            this.c++;
            reentrantLock.unlock();
            return new iv3(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
