package okhttp3.internal.ws;

import defpackage.av0;
import defpackage.g75;
import defpackage.ie8;
import defpackage.mr0;
import defpackage.xq0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class WebSocketReader implements Closeable {
    public final mr0 a;
    public final FrameCallback b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public long s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final xq0 w;
    public final xq0 x;
    public MessageInflater y;
    public final byte[] z;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface FrameCallback {
        void c(av0 av0Var);

        void d(String str);

        void e(av0 av0Var);

        void g(av0 av0Var);

        void h(int i, String str);
    }

    public WebSocketReader(mr0 mr0Var, FrameCallback frameCallback, boolean z, boolean z2) {
        mr0Var.getClass();
        this.a = mr0Var;
        this.b = frameCallback;
        this.c = z;
        this.d = z2;
        this.w = new xq0();
        this.x = new xq0();
        this.z = null;
    }

    public final void A() throws ProtocolException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.e) {
            sy3.m("closed");
            return;
        }
        mr0 mr0Var = this.a;
        long jH = mr0Var.l().h();
        mr0Var.l().b();
        try {
            byte b = mr0Var.readByte();
            byte[] bArr = _UtilCommonKt.a;
            mr0Var.l().g(jH, timeUnit);
            int i = b & 15;
            this.f = i;
            boolean z2 = (b & 128) != 0;
            this.t = z2;
            boolean z3 = (b & 8) != 0;
            this.u = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.v = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = mr0Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.s = j;
            if (j == 126) {
                this.s = mr0Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = mr0Var.readLong();
                this.s = j2;
                if (j2 < 0) {
                    long j3 = this.s;
                    TimeZone timeZone = _UtilJvmKt.a;
                    String hexString = Long.toHexString(j3);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.u && this.s > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.z;
                bArr2.getClass();
                mr0Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            mr0Var.l().g(jH, timeUnit);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageInflater messageInflater = this.y;
        if (messageInflater != null) {
            _UtilCommonKt.b(messageInflater);
        }
        _UtilCommonKt.b(this.a);
    }

    public final void p() throws IOException {
        A();
        if (this.u) {
            q();
            return;
        }
        int i = this.f;
        if (i != 1 && i != 2) {
            TimeZone timeZone = _UtilJvmKt.a;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.e) {
            long j = this.s;
            xq0 xq0Var = this.x;
            if (j > 0) {
                this.a.X(j, xq0Var);
            }
            if (this.t) {
                if (this.v) {
                    MessageInflater messageInflater = this.y;
                    if (messageInflater == null) {
                        messageInflater = new MessageInflater(this.d);
                        this.y = messageInflater;
                    }
                    xq0 xq0Var2 = messageInflater.b;
                    if (xq0Var2.b != 0) {
                        gp.l("Failed requirement.");
                        return;
                    }
                    Inflater inflater = messageInflater.c;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        messageInflater.c = inflater;
                    }
                    g75 g75Var = messageInflater.d;
                    if (g75Var == null) {
                        g75Var = new g75(new ie8(xq0Var2), inflater);
                        messageInflater.d = g75Var;
                    }
                    if (messageInflater.a) {
                        inflater.reset();
                    }
                    xq0Var2.K0(xq0Var);
                    xq0Var2.m5writeInt(65535);
                    long bytesRead = inflater.getBytesRead() + xq0Var2.b;
                    do {
                        g75Var.p(Long.MAX_VALUE, xq0Var);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        xq0Var2.p();
                        g75Var.close();
                        messageInflater.d = null;
                        messageInflater.c = null;
                    }
                }
                FrameCallback frameCallback = this.b;
                if (i == 1) {
                    frameCallback.d(xq0Var.p0());
                    return;
                } else {
                    frameCallback.e(xq0Var.z(xq0Var.b));
                    return;
                }
            }
            while (!this.e) {
                A();
                if (!this.u) {
                    break;
                } else {
                    q();
                }
            }
            if (this.f != 0) {
                int i2 = this.f;
                TimeZone timeZone2 = _UtilJvmKt.a;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        sy3.m("closed");
    }

    public final void q() throws ProtocolException, EOFException {
        short s;
        String strP0;
        long j = this.s;
        xq0 xq0Var = this.w;
        if (j > 0) {
            this.a.X(j, xq0Var);
        }
        int i = this.f;
        FrameCallback frameCallback = this.b;
        switch (i) {
            case 8:
                long j2 = xq0Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = xq0Var.readShort();
                    strP0 = xq0Var.p0();
                    String strA = WebSocketProtocol.a(s);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s = 1005;
                    strP0 = "";
                }
                frameCallback.h(s, strP0);
                this.e = true;
                return;
            case 9:
                frameCallback.c(xq0Var.z(xq0Var.b));
                return;
            case 10:
                frameCallback.g(xq0Var.z(xq0Var.b));
                return;
            default:
                int i2 = this.f;
                TimeZone timeZone = _UtilJvmKt.a;
                String hexString = Integer.toHexString(i2);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }
}
