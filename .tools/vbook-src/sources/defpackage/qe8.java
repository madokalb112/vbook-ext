package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qe8 implements bg9 {
    public final si7 a;
    public boolean b;
    public final wq0 c = new wq0();

    public qe8(si7 si7Var) {
        this.a = si7Var;
    }

    @Override // defpackage.bg9
    public final void C(short s) {
        if (this.b) {
            gp.j("Sink is closed.");
        } else {
            this.c.C(s);
            t0();
        }
    }

    @Override // defpackage.ic8
    public final void E0(wq0 wq0Var, long j) {
        if (this.b) {
            gp.j("Sink is closed.");
        } else if (j < 0) {
            gp.k(xv5.l(j, "byteCount: "));
        } else {
            this.c.E0(wq0Var, j);
            t0();
        }
    }

    @Override // defpackage.bg9
    public final void M(byte b) {
        if (this.b) {
            gp.j("Sink is closed.");
        } else {
            this.c.M(b);
            t0();
        }
    }

    @Override // defpackage.bg9
    public final wq0 b() {
        return this.c;
    }

    @Override // defpackage.bg9
    public final void b0(int i, byte[] bArr) {
        bArr.getClass();
        if (this.b) {
            gp.j("Sink is closed.");
            return;
        }
        kl8.Q(bArr.length, 0L, i);
        this.c.b0(i, bArr);
        t0();
    }

    @Override // defpackage.ic8, java.lang.AutoCloseable
    public final void close() throws Throwable {
        si7 si7Var = this.a;
        if (this.b) {
            return;
        }
        try {
            wq0 wq0Var = this.c;
            long j = wq0Var.c;
            if (j > 0) {
                si7Var.E0(wq0Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            si7Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.b) {
            gp.j("Sink is closed.");
            return;
        }
        wq0 wq0Var = this.c;
        long j = wq0Var.c;
        si7 si7Var = this.a;
        if (j > 0) {
            si7Var.E0(wq0Var, j);
        }
        si7Var.flush();
    }

    @Override // defpackage.bg9
    public final void q0(jl9 jl9Var, long j) throws EOFException {
        if (this.b) {
            gp.j("Sink is closed.");
            return;
        }
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount: "));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            long jK = jl9Var.K(this.c, j2);
            if (jK == -1) {
                throw new EOFException(xv5.n(j - j2, ").", j39.o(j, "Source exhausted before reading ", " bytes from it (number of bytes read: ")));
            }
            j2 -= jK;
            t0();
        }
    }

    @Override // defpackage.bg9
    public final void t0() {
        if (this.b) {
            gp.j("Sink is closed.");
            return;
        }
        wq0 wq0Var = this.c;
        long j = wq0Var.c;
        if (j == 0) {
            j = 0;
        } else {
            nz8 nz8Var = wq0Var.b;
            nz8Var.getClass();
            int i = nz8Var.c;
            if (i < 8192 && nz8Var.e) {
                j -= (long) (i - nz8Var.b);
            }
        }
        if (j > 0) {
            this.a.E0(wq0Var, j);
        }
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.bg9
    public final long u0(jc8 jc8Var) {
        jc8Var.getClass();
        long j = 0;
        if (this.b) {
            gp.j("Sink is closed.");
            return 0L;
        }
        while (true) {
            long jK = jc8Var.K(this.c, 8192L);
            if (jK == -1) {
                return j;
            }
            j += jK;
            t0();
        }
    }

    @Override // defpackage.bg9
    public final void writeInt(int i) {
        if (this.b) {
            gp.j("Sink is closed.");
        } else {
            this.c.writeInt(i);
            t0();
        }
    }
}
