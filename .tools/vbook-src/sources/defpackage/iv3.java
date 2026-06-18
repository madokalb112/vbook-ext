package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iv3 implements il9 {
    public final zg5 a;
    public long b;
    public boolean c;

    public iv3(zg5 zg5Var, long j) {
        this.a = zg5Var;
        this.b = j;
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        long j2;
        long j3;
        int i;
        xq0Var.getClass();
        if (this.c) {
            gp.j("closed");
            return 0L;
        }
        zg5 zg5Var = this.a;
        long j4 = this.b;
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            oz8 oz8VarA0 = xq0Var.A0(1);
            byte[] bArr = oz8VarA0.a;
            int i2 = oz8VarA0.c;
            j2 = -1;
            int iMin = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (zg5Var) {
                bArr.getClass();
                zg5Var.e.seek(j6);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i3 = zg5Var.e.read(bArr, i2, iMin - i);
                    if (i3 != -1) {
                        i += i3;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (oz8VarA0.b == oz8VarA0.c) {
                    xq0Var.a = oz8VarA0.a();
                    xz8.a(oz8VarA0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                oz8VarA0.c += i;
                long j7 = i;
                j6 += j7;
                xq0Var.b += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.il9
    public final uua l() {
        return uua.d;
    }
}
