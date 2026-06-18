package okhttp3.internal.http2;

import defpackage.av0;
import defpackage.dx1;
import defpackage.fc1;
import defpackage.fw;
import defpackage.ie8;
import defpackage.il9;
import defpackage.mr0;
import defpackage.uua;
import defpackage.xq0;
import defpackage.xv5;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Http2Reader implements Closeable {
    public static final Logger d;
    public final mr0 a;
    public final ContinuationSource b;
    public final Hpack.Reader c;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
        public static int a(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            sy3.m(xv5.o("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        logger.getClass();
        d = logger;
    }

    public Http2Reader(mr0 mr0Var) {
        mr0Var.getClass();
        this.a = mr0Var;
        ContinuationSource continuationSource = new ContinuationSource(mr0Var);
        this.b = continuationSource;
        this.c = new Hpack.Reader(continuationSource);
    }

    public final void A(Http2Connection.ReaderRunnable readerRunnable, int i) {
        mr0 mr0Var = this.a;
        mr0Var.readInt();
        mr0Var.readByte();
        byte[] bArr = _UtilCommonKt.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f4, code lost:
    
        sy3.m(defpackage.dx1.f(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fd, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(boolean r18, okhttp3.internal.http2.Http2Connection.ReaderRunnable r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.p(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    public final List q(int i, int i2, int i3, int i4) throws IOException {
        ContinuationSource continuationSource = this.b;
        continuationSource.e = i;
        continuationSource.b = i;
        continuationSource.f = i2;
        continuationSource.c = i3;
        continuationSource.d = i4;
        Hpack.Reader reader = this.c;
        ie8 ie8Var = reader.c;
        ArrayList arrayList = reader.b;
        while (!ie8Var.k()) {
            byte b = ie8Var.readByte();
            byte[] bArr = _UtilCommonKt.a;
            int i5 = b & 255;
            if (i5 == 128) {
                sy3.m("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = reader.e(i5, Token.SWITCH);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    Header[] headerArr = Hpack.a;
                    if (i6 <= headerArr.length - 1) {
                        arrayList.add(headerArr[i6]);
                    }
                }
                int length = reader.e + 1 + (i6 - Hpack.a.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.d;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        header.getClass();
                        arrayList.add(header);
                    }
                }
                sy3.m(dx1.f(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                Header[] headerArr3 = Hpack.a;
                av0 av0VarD = reader.d();
                Hpack.a(av0VarD);
                reader.c(new Header(av0VarD, reader.d()));
            } else if ((b & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i5, 63) - 1), reader.d()));
            } else if ((b & 32) == 32) {
                int iE2 = reader.e(i5, 31);
                reader.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.a);
                }
                int i7 = reader.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        Header[] headerArr4 = reader.d;
                        fw.d0(0, headerArr4.length, null, headerArr4);
                        reader.e = reader.d.length - 1;
                        reader.f = 0;
                        reader.g = 0;
                    } else {
                        reader.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Header[] headerArr5 = Hpack.a;
                av0 av0VarD2 = reader.d();
                Hpack.a(av0VarD2);
                arrayList.add(new Header(av0VarD2, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i5, 15) - 1), reader.d()));
            }
        }
        List listZ0 = fc1.Z0(arrayList);
        arrayList.clear();
        return listZ0;
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class ContinuationSource implements il9 {
        public final mr0 a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public ContinuationSource(mr0 mr0Var) {
            mr0Var.getClass();
            this.a = mr0Var;
        }

        @Override // defpackage.il9
        public final long D0(long j, xq0 xq0Var) throws IOException {
            int i;
            int i2;
            xq0Var.getClass();
            do {
                int i3 = this.e;
                mr0 mr0Var = this.a;
                if (i3 == 0) {
                    mr0Var.skip(this.f);
                    this.f = 0;
                    if ((this.c & 4) == 0) {
                        i = this.d;
                        int iM = _UtilCommonKt.m(mr0Var);
                        this.e = iM;
                        this.b = iM;
                        int i4 = mr0Var.readByte() & 255;
                        this.c = mr0Var.readByte() & 255;
                        Logger logger = Http2Reader.d;
                        if (logger.isLoggable(Level.FINE)) {
                            av0 av0Var = Http2.a;
                            logger.fine(Http2.b(true, this.d, this.b, i4, this.c));
                        }
                        i2 = mr0Var.readInt() & Integer.MAX_VALUE;
                        this.d = i2;
                        if (i4 != 9) {
                            throw new IOException(i4 + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long jD0 = mr0Var.D0(Math.min(j, i3), xq0Var);
                    if (jD0 != -1) {
                        this.e -= (int) jD0;
                        return jD0;
                    }
                }
                return -1L;
            } while (i2 == i);
            sy3.m("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // defpackage.il9
        public final uua l() {
            return this.a.l();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
