package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ya8 extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ ab8 c;

    public ya8(ab8 ab8Var, xa8 xa8Var) {
        this.c = ab8Var;
        this.a = ab8Var.j0(xa8Var.b + 4);
        this.b = xa8Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            k27.n("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        ab8 ab8Var = this.c;
        ab8Var.a0(i4, bArr, i, i2);
        this.a = ab8Var.j0(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        ab8 ab8Var = this.c;
        RandomAccessFile randomAccessFile = ab8Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int i = randomAccessFile.read();
        this.a = ab8Var.j0(this.a + 1);
        this.b--;
        return i;
    }
}
