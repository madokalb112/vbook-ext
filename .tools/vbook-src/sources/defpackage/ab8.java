package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ab8 implements Closeable {
    public static final Logger s = Logger.getLogger(ab8.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public xa8 d;
    public xa8 e;
    public final byte[] f;

    public ab8(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    x0(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    sy3.m("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iP = P(0, bArr);
        this.b = iP;
        if (iP <= randomAccessFile2.length()) {
            this.c = P(4, bArr);
            int iP2 = P(8, bArr);
            int iP3 = P(12, bArr);
            this.d = N(iP2);
            this.e = N(iP3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int P(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void x0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void A(za8 za8Var) {
        int iJ0 = this.d.b;
        for (int i = 0; i < this.c; i++) {
            xa8 xa8VarN = N(iJ0);
            za8Var.b(new ya8(this, xa8VarN), xa8VarN.c);
            iJ0 = j0(xa8VarN.b + 4 + xa8VarN.c);
        }
    }

    public final synchronized boolean E() {
        return this.c == 0;
    }

    public final xa8 N(int i) throws IOException {
        if (i == 0) {
            return xa8.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new xa8(i, randomAccessFile.readInt(), 0);
    }

    public final synchronized void R() {
        if (E()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                p0(4096, 0, 0, 0);
                this.c = 0;
                xa8 xa8Var = xa8.d;
                this.d = xa8Var;
                this.e = xa8Var;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            xa8 xa8Var2 = this.d;
            int iJ0 = j0(xa8Var2.b + 4 + xa8Var2.c);
            a0(iJ0, this.f, 0, 4);
            int iP = P(0, this.f);
            p0(this.b, this.c - 1, iJ0, this.e.b);
            this.c--;
            this.d = new xa8(iJ0, iP, 0);
        }
    }

    public final void a0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iJ0 = j0(i);
        int i4 = iJ0 + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iJ0);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iJ0;
        randomAccessFile.seek(iJ0);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final void e0(byte[] bArr, int i, int i2) throws IOException {
        int iJ0 = j0(i);
        int i3 = iJ0 + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(iJ0);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iJ0;
        randomAccessFile.seek(iJ0);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int g0() {
        if (this.c == 0) {
            return 16;
        }
        xa8 xa8Var = this.e;
        int i = xa8Var.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + xa8Var.c + 16 : (((i + 4) + xa8Var.c) + this.b) - i2;
    }

    public final int j0(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void p(byte[] bArr) {
        int iJ0;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    q(length);
                    boolean zE = E();
                    if (zE) {
                        iJ0 = 16;
                    } else {
                        xa8 xa8Var = this.e;
                        iJ0 = j0(xa8Var.b + 4 + xa8Var.c);
                    }
                    xa8 xa8Var2 = new xa8(iJ0, length, 0);
                    x0(this.f, 0, length);
                    e0(this.f, iJ0, 4);
                    e0(bArr, iJ0 + 4, length);
                    p0(this.b, this.c + 1, zE ? iJ0 : this.d.b, iJ0);
                    this.e = xa8Var2;
                    this.c++;
                    if (zE) {
                        this.d = xa8Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void p0(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                x0(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final void q(int i) throws IOException {
        int i2 = i + 4;
        int iG0 = this.b - g0();
        if (iG0 >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iG0 += i3;
            i3 <<= 1;
        } while (iG0 < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        xa8 xa8Var = this.e;
        int iJ0 = j0(xa8Var.b + 4 + xa8Var.c);
        if (iJ0 < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iJ0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                gp.i("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            p0(i3, this.c, i5, i6);
            this.e = new xa8(i6, this.e.c, 0);
        } else {
            p0(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ab8.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            A(new a81(sb, 4));
        } catch (IOException e) {
            s.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
