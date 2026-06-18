package okhttp3.internal.http2;

import defpackage.dx1;
import defpackage.fw;
import defpackage.lr0;
import defpackage.xq0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2Writer implements Closeable, Lockable {
    public static final Logger f = Logger.getLogger(Http2.class.getName());
    public final lr0 a;
    public final xq0 b;
    public int c;
    public boolean d;
    public final Hpack.Writer e;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public Http2Writer(lr0 lr0Var) {
        lr0Var.getClass();
        this.a = lr0Var;
        xq0 xq0Var = new xq0();
        this.b = xq0Var;
        this.c = 16384;
        this.e = new Hpack.Writer(xq0Var);
    }

    public final void A(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(Http2.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            gp.k(dx1.f(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = _UtilCommonKt.a;
        lr0 lr0Var = this.a;
        lr0Var.getClass();
        lr0Var.writeByte((i2 >>> 16) & 255);
        lr0Var.writeByte((i2 >>> 8) & 255);
        lr0Var.writeByte(i2 & 255);
        lr0Var.writeByte(i3 & 255);
        lr0Var.writeByte(i4 & 255);
        lr0Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final void E(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            A(0, bArr.length + 8, 7, 0);
            this.a.writeInt(i);
            this.a.writeInt(errorCode.a);
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public final void N(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long jMin = Math.min(this.c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            A(i, (int) jMin, 1, i2);
            this.a.y0(jMin, this.b);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.c, j2);
                    j2 -= jMin2;
                    A(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.a.y0(jMin2, this.b);
                }
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            A(0, 8, 6, z ? 1 : 0);
            this.a.writeInt(i);
            this.a.writeInt(i2);
            this.a.flush();
        }
    }

    public final void R(int i, ErrorCode errorCode) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            A(i, 4, 3, 0);
            this.a.writeInt(errorCode.a);
            this.a.flush();
        }
    }

    public final void a0(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.c(i, j, 4, false));
                }
                A(i, 4, 8, 0);
                this.a.writeInt((int) j);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void p(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = settings.a;
                if ((i2 & 32) != 0) {
                    i = settings.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? settings.b[1] : -1) != -1) {
                    Hpack.Writer writer = this.e;
                    int i3 = (i2 & 2) != 0 ? settings.b[1] : -1;
                    writer.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = writer.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            writer.b = Math.min(writer.b, iMin);
                        }
                        writer.c = true;
                        writer.d = iMin;
                        int i5 = writer.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                Header[] headerArr = writer.e;
                                fw.d0(0, headerArr.length, null, headerArr);
                                writer.f = writer.e.length - 1;
                                writer.g = 0;
                                writer.h = 0;
                            } else {
                                writer.a(i5 - iMin);
                            }
                        }
                    }
                }
                A(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(boolean z, int i, xq0 xq0Var, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            A(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                lr0 lr0Var = this.a;
                xq0Var.getClass();
                lr0Var.y0(i2, xq0Var);
            }
        }
    }
}
