package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lj2 implements il9 {
    public final InputStream a;
    public final tk9 b;
    public final /* synthetic */ s16 c;

    public lj2(s16 s16Var) {
        this.c = s16Var;
        Socket socket = (Socket) s16Var.b;
        this.a = socket.getInputStream();
        this.b = new tk9(socket);
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws IOException {
        xq0Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        tk9 tk9Var = this.b;
        tk9Var.f();
        oz8 oz8VarA0 = xq0Var.A0(1);
        int iMin = (int) Math.min(j, 8192 - oz8VarA0.c);
        try {
            tk9Var.i();
            try {
                int i = this.a.read(oz8VarA0.a, oz8VarA0.c, iMin);
                if (tk9Var.j()) {
                    throw tk9Var.k(null);
                }
                if (i != -1) {
                    oz8VarA0.c += i;
                    long j2 = i;
                    xq0Var.b += j2;
                    return j2;
                }
                if (oz8VarA0.b != oz8VarA0.c) {
                    return -1L;
                }
                xq0Var.a = oz8VarA0.a();
                xz8.a(oz8VarA0);
                return -1L;
            } catch (IOException e) {
                if (tk9Var.j()) {
                    throw tk9Var.k(e);
                }
                throw e;
            } finally {
                tk9Var.j();
            }
        } catch (AssertionError e2) {
            if (q7c.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        s16 s16Var = this.c;
        tk9 tk9Var = this.b;
        tk9Var.i();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) s16Var.c;
            Socket socket = (Socket) s16Var.b;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
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

    @Override // defpackage.il9
    public final uua l() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
