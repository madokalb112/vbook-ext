package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mh0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return (int) Math.min(((xq0) obj).b, 2147483647L);
            case 2:
                return ((mh0) obj).available();
            case 3:
                ie8 ie8Var = (ie8) obj;
                if (!ie8Var.c) {
                    return (int) Math.min(ie8Var.b.b, 2147483647L);
                }
                sy3.m("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kl8.O((ut0) obj);
                break;
            case 1:
                break;
            case 2:
                super.close();
                ((mh0) obj).close();
                break;
            default:
                ((ie8) obj).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        int i3 = this.a;
        Object obj = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ut0 ut0Var = (ut0) obj;
                if (!ut0Var.i()) {
                    if (ut0Var.h().k()) {
                        ah1.S(hc3.a, new rf(ut0Var, null, 3));
                    }
                    wq0 wq0VarH = ut0Var.h();
                    wq0VarH.getClass();
                    int iQ = ut0Var.h().q(bArr, i, Math.min((int) wq0VarH.c, i2) + i);
                    if (iQ >= 0) {
                        return iQ;
                    }
                    if (!ut0Var.i()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                return ((xq0) obj).read(bArr, i, i2);
            case 2:
                return ((mh0) obj).read(bArr, i, i2);
            default:
                ie8 ie8Var = (ie8) obj;
                xq0 xq0Var = ie8Var.b;
                if (ie8Var.c) {
                    sy3.m("closed");
                    return 0;
                }
                ah1.z(bArr.length, i, i2);
                if (xq0Var.b == 0 && ie8Var.a.D0(8192L, xq0Var) == -1) {
                    return -1;
                }
                return xq0Var.read(bArr, i, i2);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return ((xq0) obj) + ".inputStream()";
            case 2:
            default:
                return super.toString();
            case 3:
                return ((ie8) obj) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.a) {
            case 3:
                outputStream.getClass();
                ie8 ie8Var = (ie8) this.b;
                xq0 xq0Var = ie8Var.b;
                if (ie8Var.c) {
                    sy3.m("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (xq0Var.b == 0 && ie8Var.a.D0(8192L, xq0Var) == -1) {
                        return j;
                    }
                    long j2 = xq0Var.b;
                    j += j2;
                    ah1.z(j2, 0L, j2);
                    oz8 oz8Var = xq0Var.a;
                    while (j2 > 0) {
                        oz8Var.getClass();
                        int iMin = (int) Math.min(j2, oz8Var.c - oz8Var.b);
                        outputStream.write(oz8Var.a, oz8Var.b, iMin);
                        int i = oz8Var.b + iMin;
                        oz8Var.b = i;
                        long j3 = iMin;
                        xq0Var.b -= j3;
                        j2 -= j3;
                        if (i == oz8Var.c) {
                            oz8 oz8VarA = oz8Var.a();
                            xq0Var.a = oz8VarA;
                            xz8.a(oz8Var);
                            oz8Var = oz8VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void p() {
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ut0 ut0Var = (ut0) obj;
                if (ut0Var.i()) {
                    return -1;
                }
                if (ut0Var.h().k()) {
                    ah1.S(hc3.a, new rf(ut0Var, null, 3));
                }
                if (ut0Var.i()) {
                    return -1;
                }
                return ut0Var.h().readByte() & 255;
            case 1:
                xq0 xq0Var = (xq0) obj;
                if (xq0Var.b > 0) {
                    return xq0Var.readByte() & 255;
                }
                return -1;
            case 2:
                return ((mh0) obj).read();
            default:
                ie8 ie8Var = (ie8) obj;
                xq0 xq0Var2 = ie8Var.b;
                if (ie8Var.c) {
                    sy3.m("closed");
                    return 0;
                }
                if (xq0Var2.b == 0 && ie8Var.a.D0(8192L, xq0Var2) == -1) {
                    return -1;
                }
                return xq0Var2.readByte() & 255;
        }
    }
}
