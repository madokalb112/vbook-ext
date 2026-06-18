package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class se8 implements jl9 {
    public final jc8 a;
    public boolean b;
    public final wq0 c = new wq0();

    public se8(jc8 jc8Var) {
        this.a = jc8Var;
    }

    @Override // defpackage.jc8
    public final long K(wq0 wq0Var, long j) {
        if (this.b) {
            gp.j("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount: "));
            return 0L;
        }
        wq0 wq0Var2 = this.c;
        if (wq0Var2.c == 0 && this.a.K(wq0Var2, 8192L) == -1) {
            return -1L;
        }
        return wq0Var2.K(wq0Var, Math.min(j, wq0Var2.c));
    }

    @Override // defpackage.jl9
    public final wq0 b() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.close();
        wq0 wq0Var = this.c;
        wq0Var.skip(wq0Var.c);
    }

    @Override // defpackage.jl9
    public final boolean k() {
        if (this.b) {
            gp.j("Source is closed.");
            return false;
        }
        wq0 wq0Var = this.c;
        return wq0Var.k() && this.a.K(wq0Var, 8192L) == -1;
    }

    @Override // defpackage.jl9
    public final se8 peek() {
        if (!this.b) {
            return new se8(new tq7(this));
        }
        gp.j("Source is closed.");
        return null;
    }

    @Override // defpackage.jl9
    public final byte readByte() throws EOFException {
        v(1L);
        return this.c.readByte();
    }

    @Override // defpackage.jl9
    public final boolean request(long j) {
        wq0 wq0Var;
        if (this.b) {
            gp.j("Source is closed.");
            return false;
        }
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount: "));
            return false;
        }
        do {
            wq0Var = this.c;
            if (wq0Var.c >= j) {
                return true;
            }
        } while (this.a.K(wq0Var, 8192L) != -1);
        return false;
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // defpackage.jl9
    public final void v(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException(xv5.m(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }
}
