package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xq0 implements mr0, lr0, Cloneable, ByteChannel {
    public oz8 a;
    public long b;

    public final void A(xq0 xq0Var, long j, long j2) {
        xq0Var.getClass();
        long j3 = j;
        ah1.z(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        xq0Var.b += j2;
        oz8 oz8Var = this.a;
        while (true) {
            oz8Var.getClass();
            long j4 = oz8Var.c - oz8Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            oz8Var = oz8Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            oz8Var.getClass();
            oz8 oz8VarC = oz8Var.c();
            int i = oz8VarC.b + ((int) j3);
            oz8VarC.b = i;
            oz8VarC.c = Math.min(i + ((int) j5), oz8VarC.c);
            oz8 oz8Var2 = xq0Var.a;
            if (oz8Var2 == null) {
                oz8VarC.g = oz8VarC;
                oz8VarC.f = oz8VarC;
                xq0Var.a = oz8VarC;
            } else {
                oz8 oz8Var3 = oz8Var2.g;
                oz8Var3.getClass();
                oz8Var3.b(oz8VarC);
            }
            j5 -= (long) (oz8VarC.c - oz8VarC.b);
            oz8Var = oz8Var.f;
            j3 = 0;
        }
    }

    public final oz8 A0(int i) {
        if (i < 1 || i > 8192) {
            gp.l("unexpected capacity");
            return null;
        }
        oz8 oz8Var = this.a;
        if (oz8Var == null) {
            oz8 oz8VarB = xz8.b();
            this.a = oz8VarB;
            oz8VarB.g = oz8VarB;
            oz8VarB.f = oz8VarB;
            return oz8VarB;
        }
        oz8 oz8Var2 = oz8Var.g;
        oz8Var2.getClass();
        if (oz8Var2.c + i <= 8192 && oz8Var2.e) {
            return oz8Var2;
        }
        oz8 oz8VarB2 = xz8.b();
        oz8Var2.b(oz8VarB2);
        return oz8VarB2;
    }

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        if (j < 0) {
            gp.k(xv5.l(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        xq0Var.y0(j, this);
        return j;
    }

    public final byte E(long j) {
        ah1.z(this.b, j, 1L);
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                oz8Var = oz8Var.g;
                oz8Var.getClass();
                j2 -= (long) (oz8Var.c - oz8Var.b);
            }
            return oz8Var.a[(int) ((((long) oz8Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = oz8Var.c;
            int i2 = oz8Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return oz8Var.a[(int) ((((long) i2) + j) - j3)];
            }
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j3 = j4;
        }
    }

    public final void F0(av0 av0Var) {
        av0Var.getClass();
        av0Var.t(this, av0Var.d());
    }

    @Override // defpackage.mr0
    public final boolean H(long j, av0 av0Var) {
        av0Var.getClass();
        return R(av0Var.d(), j, av0Var);
    }

    @Override // defpackage.mr0
    public final byte[] I() {
        return e0(this.b);
    }

    public final long K0(il9 il9Var) {
        il9Var.getClass();
        long j = 0;
        while (true) {
            long jD0 = il9Var.D0(8192L, this);
            if (jD0 == -1) {
                return j;
            }
            j += jD0;
        }
    }

    public final long N(byte b, long j, long j2) {
        oz8 oz8Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            dx1.z(sb, " fromIndex=", j3, " toIndex=");
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (oz8Var = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                oz8Var = oz8Var.g;
                oz8Var.getClass();
                j6 -= (long) (oz8Var.c - oz8Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = oz8Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(oz8Var.c, (((long) oz8Var.b) + j4) - j6);
                for (int i = (int) ((((long) oz8Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - oz8Var.b)) + j6;
                    }
                }
                j6 += (long) (oz8Var.c - oz8Var.b);
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (oz8Var.c - oz8Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = oz8Var.a;
            int iMin2 = (int) Math.min(oz8Var.c, (((long) oz8Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) oz8Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - oz8Var.b)) + j5;
                }
            }
            j5 += (long) (oz8Var.c - oz8Var.b);
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    @Override // defpackage.mr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N0() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            oz8 r6 = r14.a
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            xq0 r14 = new xq0
            r14.<init>()
            r14.U0(r4)
            r14.O0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.p0()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.ah1.Y(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            oz8 r7 = r6.a()
            r14.a = r7
            defpackage.xz8.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            oz8 r6 = r14.a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        L94:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq0.N0():long");
    }

    public final void O0(int i) {
        oz8 oz8VarA0 = A0(1);
        byte[] bArr = oz8VarA0.a;
        int i2 = oz8VarA0.c;
        oz8VarA0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final long P(av0 av0Var) {
        int i;
        int i2;
        av0Var.getClass();
        oz8 oz8Var = this.a;
        if (oz8Var == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                oz8Var = oz8Var.g;
                oz8Var.getClass();
                j -= (long) (oz8Var.c - oz8Var.b);
            }
            if (av0Var.d() == 2) {
                byte bI = av0Var.i(0);
                byte bI2 = av0Var.i(1);
                while (j < this.b) {
                    byte[] bArr = oz8Var.a;
                    i = (int) ((((long) oz8Var.b) + j2) - j);
                    int i3 = oz8Var.c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bI || b == bI2) {
                            i2 = oz8Var.b;
                        } else {
                            i++;
                        }
                    }
                    j2 = ((long) (oz8Var.c - oz8Var.b)) + j;
                    oz8Var = oz8Var.f;
                    oz8Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] bArrH = av0Var.h();
            while (j < this.b) {
                byte[] bArr2 = oz8Var.a;
                i = (int) ((((long) oz8Var.b) + j2) - j);
                int i4 = oz8Var.c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : bArrH) {
                        if (b2 == b3) {
                            i2 = oz8Var.b;
                        }
                    }
                    i++;
                }
                j2 = ((long) (oz8Var.c - oz8Var.b)) + j;
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (oz8Var.c - oz8Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j = j3;
        }
        if (av0Var.d() == 2) {
            byte bI3 = av0Var.i(0);
            byte bI4 = av0Var.i(1);
            while (j < this.b) {
                byte[] bArr3 = oz8Var.a;
                i = (int) ((((long) oz8Var.b) + j2) - j);
                int i5 = oz8Var.c;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 == bI3 || b4 == bI4) {
                        i2 = oz8Var.b;
                    } else {
                        i++;
                    }
                }
                j2 = ((long) (oz8Var.c - oz8Var.b)) + j;
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] bArrH2 = av0Var.h();
        while (j < this.b) {
            byte[] bArr4 = oz8Var.a;
            i = (int) ((((long) oz8Var.b) + j2) - j);
            int i6 = oz8Var.c;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : bArrH2) {
                    if (b5 == b6) {
                        i2 = oz8Var.b;
                    }
                }
                i++;
            }
            j2 = ((long) (oz8Var.c - oz8Var.b)) + j;
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j = j2;
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 Q0(av0 av0Var) {
        F0(av0Var);
        return this;
    }

    public final boolean R(int i, long j, av0 av0Var) {
        av0Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.b && i <= av0Var.d()) {
            return i == 0 || b.a(this, av0Var, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.mr0
    public final InputStream R0() {
        return new mh0(this, 1);
    }

    public final void T0(long j) {
        boolean z;
        if (j == 0) {
            O0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                X0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        oz8 oz8VarA0 = A0(i);
        byte[] bArr2 = oz8VarA0.a;
        int i2 = oz8VarA0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        oz8VarA0.c += i;
        this.b += (long) i;
    }

    public final void U0(long j) {
        if (j == 0) {
            O0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        oz8 oz8VarA0 = A0(i);
        byte[] bArr = oz8VarA0.a;
        int i2 = oz8VarA0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        oz8VarA0.c += i;
        this.b += (long) i;
    }

    public final void V0(int i) {
        oz8 oz8VarA0 = A0(2);
        byte[] bArr = oz8VarA0.a;
        int i2 = oz8VarA0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        oz8VarA0.c = i2 + 2;
        this.b += 2;
    }

    @Override // defpackage.mr0
    public final String W(long j) throws EOFException {
        if (j < 0) {
            gp.k(xv5.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jN = N((byte) 10, 0L, j2);
        if (jN != -1) {
            return b.c(jN, this);
        }
        if (j2 < this.b && E(j2 - 1) == 13 && E(j2) == 10) {
            return b.c(j2, this);
        }
        xq0 xq0Var = new xq0();
        A(xq0Var, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + xq0Var.z(xq0Var.b).e() + (char) 8230);
    }

    public final void W0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            gp.k(dx1.f(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            gp.k(xv5.o("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            gp.h(str.length(), xv5.u(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                oz8 oz8VarA0 = A0(1);
                byte[] bArr = oz8VarA0.a;
                int i3 = oz8VarA0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = oz8VarA0.c;
                int i6 = (i3 + i) - i5;
                oz8VarA0.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    oz8 oz8VarA02 = A0(2);
                    byte[] bArr2 = oz8VarA02.a;
                    int i7 = oz8VarA02.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | Token.CASE);
                    oz8VarA02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    oz8 oz8VarA03 = A0(3);
                    byte[] bArr3 = oz8VarA03.a;
                    int i8 = oz8VarA03.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | Token.CASE);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | Token.CASE);
                    oz8VarA03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        O0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + Parser.ARGC_LIMIT;
                        oz8 oz8VarA04 = A0(4);
                        byte[] bArr4 = oz8VarA04.a;
                        int i11 = oz8VarA04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | Token.CASE);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | Token.CASE);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | Token.CASE);
                        oz8VarA04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.mr0
    public final void X(long j, xq0 xq0Var) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            xq0Var.y0(j, this);
        } else {
            xq0Var.y0(j2, this);
            throw new EOFException();
        }
    }

    public final void X0(String str) {
        str.getClass();
        W0(0, str.length(), str);
    }

    public final void Y0(int i) {
        if (i < 128) {
            O0(i);
            return;
        }
        if (i < 2048) {
            oz8 oz8VarA0 = A0(2);
            byte[] bArr = oz8VarA0.a;
            int i2 = oz8VarA0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Token.CASE);
            oz8VarA0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            O0(63);
            return;
        }
        if (i < 65536) {
            oz8 oz8VarA02 = A0(3);
            byte[] bArr2 = oz8VarA02.a;
            int i3 = oz8VarA02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Token.CASE);
            bArr2[i3 + 2] = (byte) ((i & 63) | Token.CASE);
            oz8VarA02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            gp.l("Unexpected code point: 0x".concat(ah1.Z(i)));
            return;
        }
        oz8 oz8VarA03 = A0(4);
        byte[] bArr3 = oz8VarA03.a;
        int i4 = oz8VarA03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Token.CASE);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Token.CASE);
        bArr3[i4 + 3] = (byte) ((i & 63) | Token.CASE);
        oz8VarA03.c = i4 + 4;
        this.b += 4;
    }

    public final void a0(vq0 vq0Var) {
        vq0Var.getClass();
        byte[] bArr = b.a;
        if (vq0Var.a != null) {
            gp.j("already attached to a buffer");
        } else {
            vq0Var.a = this;
            vq0Var.b = true;
        }
    }

    public final Object clone() {
        xq0 xq0Var = new xq0();
        if (this.b == 0) {
            return xq0Var;
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        oz8 oz8VarC = oz8Var.c();
        xq0Var.a = oz8VarC;
        oz8VarC.g = oz8VarC;
        oz8VarC.f = oz8VarC;
        for (oz8 oz8Var2 = oz8Var.f; oz8Var2 != oz8Var; oz8Var2 = oz8Var2.f) {
            oz8 oz8Var3 = oz8VarC.g;
            oz8Var3.getClass();
            oz8Var2.getClass();
            oz8Var3.b(oz8Var2.c());
        }
        xq0Var.b = this.b;
        return xq0Var;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 d0(String str) {
        X0(str);
        return this;
    }

    public final byte[] e0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            gp.k(xv5.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq0)) {
            return false;
        }
        long j = this.b;
        xq0 xq0Var = (xq0) obj;
        if (j != xq0Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        oz8 oz8Var2 = xq0Var.a;
        oz8Var2.getClass();
        int i = oz8Var.b;
        int i2 = oz8Var2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(oz8Var.c - i, oz8Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (oz8Var.a[i] != oz8Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == oz8Var.c) {
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                i = oz8Var.b;
            }
            if (i2 == oz8Var2.c) {
                oz8Var2 = oz8Var2.f;
                oz8Var2.getClass();
                i2 = oz8Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final short g0() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final int hashCode() {
        oz8 oz8Var = this.a;
        if (oz8Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = oz8Var.c;
            for (int i3 = oz8Var.b; i3 < i2; i3++) {
                i = (i * 31) + oz8Var.a[i3];
            }
            oz8Var = oz8Var.f;
            oz8Var.getClass();
        } while (oz8Var != this.a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final String j0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            gp.k(xv5.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        int i = oz8Var.b;
        if (((long) i) + j > oz8Var.c) {
            return new String(e0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(oz8Var.a, i, i2, charset);
        int i3 = oz8Var.b + i2;
        oz8Var.b = i3;
        this.b -= j;
        if (i3 == oz8Var.c) {
            this.a = oz8Var.a();
            xz8.a(oz8Var);
        }
        return str;
    }

    @Override // defpackage.mr0
    public final boolean k() {
        return this.b == 0;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 k0(long j) {
        U0(j);
        return this;
    }

    @Override // defpackage.il9
    public final uua l() {
        return uua.d;
    }

    public final void p() throws EOFException {
        skip(this.b);
    }

    public final String p0() {
        return j0(this.b, q31.a);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ah1.z(bArr.length, i, i2);
        oz8 oz8Var = this.a;
        if (oz8Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, oz8Var.c - oz8Var.b);
        byte[] bArr2 = oz8Var.a;
        int i3 = oz8Var.b;
        fw.R(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = oz8Var.b + iMin;
        oz8Var.b = i4;
        this.b -= (long) iMin;
        if (i4 == oz8Var.c) {
            this.a = oz8Var.a();
            xz8.a(oz8Var);
        }
        return iMin;
    }

    @Override // defpackage.mr0
    public final byte readByte() throws EOFException {
        if (this.b == 0) {
            throw new EOFException();
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        int i = oz8Var.b;
        int i2 = oz8Var.c;
        int i3 = i + 1;
        byte b = oz8Var.a[i];
        this.b--;
        if (i3 != i2) {
            oz8Var.b = i3;
            return b;
        }
        this.a = oz8Var.a();
        xz8.a(oz8Var);
        return b;
    }

    @Override // defpackage.mr0
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.mr0
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        int i = oz8Var.b;
        int i2 = oz8Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = oz8Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            oz8Var.b = i5;
            return i6;
        }
        this.a = oz8Var.a();
        xz8.a(oz8Var);
        return i6;
    }

    @Override // defpackage.mr0
    public final long readLong() throws EOFException {
        if (this.b < 8) {
            throw new EOFException();
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        int i = oz8Var.b;
        int i2 = oz8Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = oz8Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.b -= 8;
        if (i4 != i2) {
            oz8Var.b = i4;
            return j2;
        }
        this.a = oz8Var.a();
        xz8.a(oz8Var);
        return j2;
    }

    @Override // defpackage.mr0
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        oz8 oz8Var = this.a;
        oz8Var.getClass();
        int i = oz8Var.b;
        int i2 = oz8Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = oz8Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = oz8Var.a();
            xz8.a(oz8Var);
        } else {
            oz8Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.mr0
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // defpackage.mr0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            oz8 oz8Var = this.a;
            if (oz8Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, oz8Var.c - oz8Var.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = oz8Var.b + iMin;
            oz8Var.b = i;
            if (i == oz8Var.c) {
                this.a = oz8Var.a();
                xz8.a(oz8Var);
            }
        }
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return x0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.mr0
    public final void v(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.mr0
    public final String v0() {
        return W(Long.MAX_VALUE);
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ah1.z(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            oz8 oz8VarA0 = A0(1);
            int iMin = Math.min(i3 - i, 8192 - oz8VarA0.c);
            int i4 = i + iMin;
            fw.R(bArr, oz8VarA0.c, oz8VarA0.a, i, i4);
            oz8VarA0.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 writeByte(int i) {
        O0(i);
        return this;
    }

    /* JADX INFO: renamed from: writeInt, reason: collision with other method in class */
    public final void m5writeInt(int i) {
        oz8 oz8VarA0 = A0(4);
        byte[] bArr = oz8VarA0.a;
        int i2 = oz8VarA0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        oz8VarA0.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 writeShort(int i) {
        V0(i);
        return this;
    }

    public final av0 x0(int i) {
        if (i == 0) {
            return av0.d;
        }
        ah1.z(this.b, 0L, i);
        oz8 oz8Var = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            oz8Var.getClass();
            int i5 = oz8Var.c;
            int i6 = oz8Var.b;
            if (i5 == i6) {
                gp.i("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            oz8Var = oz8Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        oz8 oz8Var2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            oz8Var2.getClass();
            bArr[i7] = oz8Var2.a;
            i2 += oz8Var2.c - oz8Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = oz8Var2.b;
            oz8Var2.d = true;
            i7++;
            oz8Var2 = oz8Var2.f;
        }
        return new zz8(bArr, iArr);
    }

    @Override // defpackage.ag9
    public final void y0(long j, xq0 xq0Var) {
        oz8 oz8VarB;
        xq0Var.getClass();
        if (xq0Var == this) {
            gp.l("source == this");
            return;
        }
        ah1.z(xq0Var.b, 0L, j);
        while (j > 0) {
            oz8 oz8Var = xq0Var.a;
            oz8Var.getClass();
            int i = oz8Var.c;
            oz8 oz8Var2 = xq0Var.a;
            oz8Var2.getClass();
            long j2 = i - oz8Var2.b;
            int i2 = 0;
            if (j < j2) {
                oz8 oz8Var3 = this.a;
                oz8 oz8Var4 = oz8Var3 != null ? oz8Var3.g : null;
                if (oz8Var4 != null && oz8Var4.e) {
                    if ((((long) oz8Var4.c) + j) - ((long) (oz8Var4.d ? 0 : oz8Var4.b)) <= 8192) {
                        oz8 oz8Var5 = xq0Var.a;
                        oz8Var5.getClass();
                        oz8Var5.d(oz8Var4, (int) j);
                        xq0Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                oz8 oz8Var6 = xq0Var.a;
                oz8Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > oz8Var6.c - oz8Var6.b) {
                    gp.l("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    oz8VarB = oz8Var6.c();
                } else {
                    oz8VarB = xz8.b();
                    byte[] bArr = oz8Var6.a;
                    byte[] bArr2 = oz8VarB.a;
                    int i4 = oz8Var6.b;
                    fw.W(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                oz8VarB.c = oz8VarB.b + i3;
                oz8Var6.b += i3;
                oz8 oz8Var7 = oz8Var6.g;
                oz8Var7.getClass();
                oz8Var7.b(oz8VarB);
                xq0Var.a = oz8VarB;
            }
            oz8 oz8Var8 = xq0Var.a;
            oz8Var8.getClass();
            long j3 = oz8Var8.c - oz8Var8.b;
            xq0Var.a = oz8Var8.a();
            oz8 oz8Var9 = this.a;
            if (oz8Var9 == null) {
                this.a = oz8Var8;
                oz8Var8.g = oz8Var8;
                oz8Var8.f = oz8Var8;
            } else {
                oz8 oz8Var10 = oz8Var9.g;
                oz8Var10.getClass();
                oz8Var10.b(oz8Var8);
                oz8 oz8Var11 = oz8Var8.g;
                if (oz8Var11 == oz8Var8) {
                    gp.j("cannot compact");
                    return;
                }
                oz8Var11.getClass();
                if (oz8Var11.e) {
                    int i5 = oz8Var8.c - oz8Var8.b;
                    oz8 oz8Var12 = oz8Var8.g;
                    oz8Var12.getClass();
                    int i6 = 8192 - oz8Var12.c;
                    oz8 oz8Var13 = oz8Var8.g;
                    oz8Var13.getClass();
                    if (!oz8Var13.d) {
                        oz8 oz8Var14 = oz8Var8.g;
                        oz8Var14.getClass();
                        i2 = oz8Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        oz8 oz8Var15 = oz8Var8.g;
                        oz8Var15.getClass();
                        oz8Var8.d(oz8Var15, i5);
                        oz8Var8.a();
                        xz8.a(oz8Var8);
                    }
                }
            }
            xq0Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.mr0
    public final av0 z(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            gp.k(xv5.l(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new av0(e0(j));
        }
        av0 av0VarX0 = x0((int) j);
        skip(j);
        return av0VarX0;
    }

    @Override // defpackage.mr0
    public final xq0 b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ag9
    public final void close() {
    }

    @Override // defpackage.lr0, defpackage.ag9, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            oz8 oz8VarA0 = A0(1);
            int iMin = Math.min(i, 8192 - oz8VarA0.c);
            byteBuffer.get(oz8VarA0.a, oz8VarA0.c, iMin);
            i -= iMin;
            oz8VarA0.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 writeInt(int i) {
        m5writeInt(i);
        return this;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m4write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
    }

    @Override // defpackage.lr0
    public final /* bridge */ /* synthetic */ lr0 write(byte[] bArr) {
        m4write(bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        oz8 oz8Var = this.a;
        if (oz8Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oz8Var.c - oz8Var.b);
        byteBuffer.put(oz8Var.a, oz8Var.b, iMin);
        int i = oz8Var.b + iMin;
        oz8Var.b = i;
        this.b -= (long) iMin;
        if (i == oz8Var.c) {
            this.a = oz8Var.a();
            xz8.a(oz8Var);
        }
        return iMin;
    }
}
