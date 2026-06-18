package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class he8 implements lr0 {
    public final ag9 a;
    public final xq0 b;
    public boolean c;

    public he8(ag9 ag9Var) {
        ag9Var.getClass();
        this.a = ag9Var;
        this.b = new xq0();
    }

    public final lr0 A(long j) {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.T0(j);
        p();
        return this;
    }

    @Override // defpackage.lr0
    public final lr0 Q0(av0 av0Var) {
        av0Var.getClass();
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.F0(av0Var);
        p();
        return this;
    }

    @Override // defpackage.lr0
    public final xq0 b() {
        return this.b;
    }

    @Override // defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ag9 ag9Var = this.a;
        if (this.c) {
            return;
        }
        try {
            xq0 xq0Var = this.b;
            long j = xq0Var.b;
            if (j > 0) {
                ag9Var.y0(j, xq0Var);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ag9Var.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.lr0
    public final lr0 d0(String str) {
        str.getClass();
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.X0(str);
        p();
        return this;
    }

    @Override // defpackage.lr0, defpackage.ag9, java.io.Flushable
    public final void flush() {
        if (this.c) {
            gp.j("closed");
            return;
        }
        xq0 xq0Var = this.b;
        long j = xq0Var.b;
        ag9 ag9Var = this.a;
        if (j > 0) {
            ag9Var.y0(j, xq0Var);
        }
        ag9Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.lr0
    public final lr0 k0(long j) {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.U0(j);
        p();
        return this;
    }

    @Override // defpackage.ag9
    public final uua l() {
        return this.a.l();
    }

    public final lr0 p() {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        xq0 xq0Var = this.b;
        long j = xq0Var.b;
        if (j == 0) {
            j = 0;
        } else {
            oz8 oz8Var = xq0Var.a;
            oz8Var.getClass();
            oz8 oz8Var2 = oz8Var.g;
            oz8Var2.getClass();
            int i = oz8Var2.c;
            if (i < 8192 && oz8Var2.e) {
                j -= (long) (i - oz8Var2.b);
            }
        }
        if (j > 0) {
            this.a.y0(j, xq0Var);
        }
        return this;
    }

    public final long q(il9 il9Var) {
        long j = 0;
        while (true) {
            long jD0 = il9Var.D0(8192L, this.b);
            if (jD0 == -1) {
                return j;
            }
            j += jD0;
            p();
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.lr0
    public final lr0 write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.write(bArr, 0, bArr.length);
        p();
        return this;
    }

    @Override // defpackage.lr0
    public final lr0 writeByte(int i) {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.O0(i);
        p();
        return this;
    }

    @Override // defpackage.lr0
    public final lr0 writeInt(int i) {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.m5writeInt(i);
        p();
        return this;
    }

    @Override // defpackage.lr0
    public final lr0 writeShort(int i) {
        if (this.c) {
            gp.j("closed");
            return null;
        }
        this.b.V0(i);
        p();
        return this;
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        if (this.c) {
            gp.j("closed");
        } else {
            this.b.y0(j, xq0Var);
            p();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int iWrite = this.b.write(byteBuffer);
            p();
            return iWrite;
        }
        gp.j("closed");
        return 0;
    }
}
