package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vq0 implements Closeable {
    public xq0 a;
    public boolean b;
    public oz8 c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int s = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            gp.j("not attached to a buffer");
            return;
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.s = -1;
    }

    public final void p(long j) {
        xq0 xq0Var = this.a;
        if (xq0Var == null) {
            gp.j("not attached to a buffer");
            return;
        }
        if (!this.b) {
            gp.j("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = xq0Var.b;
        if (j <= j2) {
            if (j < 0) {
                gp.k(xv5.l(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                oz8 oz8Var = xq0Var.a;
                oz8Var.getClass();
                oz8 oz8Var2 = oz8Var.g;
                oz8Var2.getClass();
                int i = oz8Var2.c;
                long j4 = i - oz8Var2.b;
                if (j4 > j3) {
                    oz8Var2.c = i - ((int) j3);
                    break;
                } else {
                    xq0Var.a = oz8Var2.a();
                    xz8.a(oz8Var2);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.s = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                oz8 oz8VarA0 = xq0Var.A0(i2);
                int iMin = (int) Math.min(j5, 8192 - oz8VarA0.c);
                int i3 = oz8VarA0.c + iMin;
                oz8VarA0.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.c = oz8VarA0;
                    this.d = j2;
                    this.e = oz8VarA0.a;
                    this.f = i3 - iMin;
                    this.s = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        xq0Var.b = j;
    }

    public final int q(long j) {
        xq0 xq0Var = this.a;
        if (xq0Var == null) {
            gp.j("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = xq0Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.s = -1;
                    return -1;
                }
                oz8 oz8Var = xq0Var.a;
                oz8 oz8Var2 = this.c;
                long j3 = 0;
                if (oz8Var2 != null) {
                    long j4 = this.d - ((long) (this.f - oz8Var2.b));
                    if (j4 > j) {
                        oz8Var2 = oz8Var;
                        oz8Var = oz8Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    oz8Var2 = oz8Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        oz8Var2.getClass();
                        long j5 = ((long) (oz8Var2.c - oz8Var2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        oz8Var2 = oz8Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        oz8Var.getClass();
                        oz8Var = oz8Var.g;
                        oz8Var.getClass();
                        j2 -= (long) (oz8Var.c - oz8Var.b);
                    }
                    oz8Var2 = oz8Var;
                    j3 = j2;
                }
                if (this.b) {
                    oz8Var2.getClass();
                    if (oz8Var2.d) {
                        byte[] bArr = oz8Var2.a;
                        oz8 oz8Var3 = new oz8(Arrays.copyOf(bArr, bArr.length), oz8Var2.b, oz8Var2.c, false, true);
                        if (xq0Var.a == oz8Var2) {
                            xq0Var.a = oz8Var3;
                        }
                        oz8Var2.b(oz8Var3);
                        oz8 oz8Var4 = oz8Var3.g;
                        oz8Var4.getClass();
                        oz8Var4.a();
                        oz8Var2 = oz8Var3;
                    }
                }
                this.c = oz8Var2;
                this.d = j;
                oz8Var2.getClass();
                this.e = oz8Var2.a;
                int i = oz8Var2.b + ((int) (j - j3));
                this.f = i;
                int i2 = oz8Var2.c;
                this.s = i2;
                return i2 - i;
            }
        }
        StringBuilder sbO = j39.o(j, "offset=", " > size=");
        sbO.append(xq0Var.b);
        throw new ArrayIndexOutOfBoundsException(sbO.toString());
    }
}
