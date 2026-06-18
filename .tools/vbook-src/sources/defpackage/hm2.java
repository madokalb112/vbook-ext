package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hm2 implements ag9 {
    public final /* synthetic */ int a;
    public boolean b;
    public final ag9 c;
    public final Object d;

    public /* synthetic */ hm2(ag9 ag9Var, Object obj, int i) {
        this.a = i;
        this.c = ag9Var;
        this.d = obj;
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int i = this.a;
        Object obj = this.d;
        ag9 ag9Var = this.c;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    p(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((he8) ag9Var).close();
                    break;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                try {
                    ag9Var.close();
                    return;
                } catch (IOException e) {
                    this.b = true;
                    ((rb2) obj).invoke(e);
                    return;
                }
        }
    }

    @Override // defpackage.ag9, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.a;
        ag9 ag9Var = this.c;
        switch (i) {
            case 0:
                p(true);
                ((he8) ag9Var).flush();
                break;
            default:
                try {
                    ag9Var.flush();
                } catch (IOException e) {
                    this.b = true;
                    ((rb2) this.d).invoke(e);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.ag9
    public final uua l() {
        int i = this.a;
        ag9 ag9Var = this.c;
        switch (i) {
            case 0:
                return ((he8) ag9Var).a.l();
            default:
                return ag9Var.l();
        }
    }

    public void p(boolean z) throws IOException {
        oz8 oz8VarA0;
        int iDeflate;
        Deflater deflater = (Deflater) this.d;
        he8 he8Var = (he8) this.c;
        xq0 xq0Var = he8Var.b;
        while (true) {
            oz8VarA0 = xq0Var.A0(1);
            byte[] bArr = oz8VarA0.a;
            int i = oz8VarA0.c;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                oz8VarA0.c += iDeflate;
                xq0Var.b += (long) iDeflate;
                he8Var.p();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (oz8VarA0.b == oz8VarA0.c) {
            xq0Var.a = oz8VarA0.a();
            xz8.a(oz8VarA0);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((he8) this.c) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) throws IOException {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                ah1.z(xq0Var.b, 0L, j);
                while (j > 0) {
                    oz8 oz8Var = xq0Var.a;
                    oz8Var.getClass();
                    int iMin = (int) Math.min(j, oz8Var.c - oz8Var.b);
                    deflater.setInput(oz8Var.a, oz8Var.b, iMin);
                    p(false);
                    long j2 = iMin;
                    xq0Var.b -= j2;
                    int i2 = oz8Var.b + iMin;
                    oz8Var.b = i2;
                    if (i2 == oz8Var.c) {
                        xq0Var.a = oz8Var.a();
                        xz8.a(oz8Var);
                    }
                    j -= j2;
                }
                deflater.setInput(m79.h0, 0, 0);
                break;
            default:
                if (this.b) {
                    xq0Var.skip(j);
                } else {
                    try {
                        this.c.y0(j, xq0Var);
                    } catch (IOException e) {
                        this.b = true;
                        ((rb2) obj).invoke(e);
                    }
                }
                break;
        }
    }
}
