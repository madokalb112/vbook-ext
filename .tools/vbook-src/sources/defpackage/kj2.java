package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kj2 implements ag9 {
    public final OutputStream a;
    public final tk9 b;
    public final /* synthetic */ s16 c;

    public kj2(s16 s16Var) {
        this.c = s16Var;
        Socket socket = (Socket) s16Var.b;
        this.a = socket.getOutputStream();
        this.b = new tk9(socket);
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.a;
        s16 s16Var = this.c;
        tk9 tk9Var = this.b;
        tk9Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) s16Var.c;
            Socket socket = (Socket) s16Var.b;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                if (tk9Var.j()) {
                    throw tk9Var.k(null);
                }
            }
        } catch (IOException e) {
            if (!tk9Var.j()) {
                throw e;
            }
            throw tk9Var.k(e);
        } finally {
            tk9Var.j();
        }
    }

    @Override // defpackage.ag9, java.io.Flushable
    public final void flush() throws IOException {
        tk9 tk9Var = this.b;
        tk9Var.i();
        try {
            this.a.flush();
            if (tk9Var.j()) {
                throw tk9Var.k(null);
            }
        } catch (IOException e) {
            if (!tk9Var.j()) {
                throw e;
            }
            throw tk9Var.k(e);
        } finally {
            tk9Var.j();
        }
    }

    @Override // defpackage.ag9
    public final uua l() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) throws IOException {
        ah1.z(xq0Var.b, 0L, j);
        while (j > 0) {
            tk9 tk9Var = this.b;
            tk9Var.f();
            oz8 oz8Var = xq0Var.a;
            oz8Var.getClass();
            int iMin = (int) Math.min(j, oz8Var.c - oz8Var.b);
            tk9Var.i();
            try {
                try {
                    this.a.write(oz8Var.a, oz8Var.b, iMin);
                    if (tk9Var.j()) {
                        throw tk9Var.k(null);
                    }
                    int i = oz8Var.b + iMin;
                    oz8Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    xq0Var.b -= j2;
                    if (i == oz8Var.c) {
                        xq0Var.a = oz8Var.a();
                        xz8.a(oz8Var);
                    }
                } catch (IOException e) {
                    if (!tk9Var.j()) {
                        throw e;
                    }
                    throw tk9Var.k(e);
                }
            } catch (Throwable th) {
                tk9Var.j();
                throw th;
            }
        }
    }
}
