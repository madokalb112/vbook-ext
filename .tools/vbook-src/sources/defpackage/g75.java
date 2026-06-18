package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g75 implements il9 {
    public final ie8 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public g75(ie8 ie8Var, Inflater inflater) {
        this.a = ie8Var;
        this.b = inflater;
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) throws IOException {
        xq0Var.getClass();
        do {
            long jP = p(j, xq0Var);
            if (jP > 0) {
                return jP;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.k());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.a.a.l();
    }

    public final long p(long j, xq0 xq0Var) throws IOException {
        Inflater inflater = this.b;
        xq0Var.getClass();
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            gp.j("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                oz8 oz8VarA0 = xq0Var.A0(1);
                int iMin = (int) Math.min(j, 8192 - oz8VarA0.c);
                boolean zNeedsInput = inflater.needsInput();
                ie8 ie8Var = this.a;
                if (zNeedsInput && !ie8Var.k()) {
                    oz8 oz8Var = ie8Var.b.a;
                    oz8Var.getClass();
                    int i = oz8Var.c;
                    int i2 = oz8Var.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(oz8Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(oz8VarA0.a, oz8VarA0.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    ie8Var.skip(remaining);
                }
                if (iInflate > 0) {
                    oz8VarA0.c += iInflate;
                    long j2 = iInflate;
                    xq0Var.b += j2;
                    return j2;
                }
                if (oz8VarA0.b == oz8VarA0.c) {
                    xq0Var.a = oz8VarA0.a();
                    xz8.a(oz8VarA0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
