package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dm2 {
    public int d;
    public final int[] f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public final int[] a = new int[1024];
    public final int[] b = new int[1024];
    public final int[] c = new int[1024];
    public int e = 1023;

    public dm2() {
        int[] iArr = new int[1024];
        for (int i = 0; i < 1024; i++) {
            iArr[i] = -1;
        }
        this.f = iArr;
        int[] iArr2 = new int[1024];
        for (int i2 = 0; i2 < 1024; i2++) {
            iArr2[i2] = 0;
        }
        this.g = iArr2;
        this.h = new int[17];
        this.i = new int[17];
        this.j = new int[17];
        this.k = new int[288];
    }

    public final int a(int i, int i2, int i3) {
        int i4 = this.d;
        this.d = i4 + 1;
        this.a[i4] = i;
        this.b[i4] = i2;
        this.c[i4] = i3;
        return i4;
    }

    public final void b(int i, int i2, int i3) {
        int i4 = this.a[i];
        if (i4 != -1) {
            e(i2, i3, i, i4);
        } else {
            if (i3 >= 10) {
                e(i2, i3, i, -2);
                return;
            }
            int i5 = i3 + 1;
            b(this.b[i], i2, i5);
            b(this.c[i], i2 | (1 << i3), i5);
        }
    }

    public final int c(lp8 lp8Var) {
        int[] iArr;
        lp8Var.getClass();
        qg0 qg0Var = (qg0) lp8Var.b;
        qg0Var.j(10);
        int i = this.e;
        int i2 = qg0Var.c;
        if (i2 >= 10) {
            int i3 = qg0Var.b;
            int i4 = i3 & 1023;
            int i5 = this.f[i4];
            short s = (short) i5;
            int i6 = i5 >> 16;
            if (i6 > 0) {
                qg0Var.b = i3 >>> i6;
                qg0Var.c = i2 - i6;
                if (s != -2) {
                    return s;
                }
                i = this.g[i4];
            }
        }
        do {
            i = qg0Var.o(1) != 0 ? this.c[i] : this.b[i];
            iArr = this.a;
            if (i == 1023) {
                break;
            }
        } while (iArr[i] == -1);
        return iArr[i];
    }

    public final void d(int[] iArr, int i, int i2) {
        int[] iArr2;
        int[] iArr3;
        int i3;
        int[] iArr4;
        int i4 = 0;
        this.d = 0;
        int[] iArr5 = this.h;
        fw.e0(0, 0, 6, iArr5);
        for (int i5 = i; i5 < i2; i5++) {
            int i6 = iArr[i5];
            if (i6 < 0 || i6 >= 17) {
                w58.f(i6, "Invalid HuffmanTree.codeLengths ");
                return;
            }
            iArr5[i6] = iArr5[i6] + 1;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            iArr2 = this.j;
            iArr3 = this.i;
            i3 = 16;
            if (i7 >= 16) {
                break;
            }
            int i9 = iArr5[i7];
            iArr3[i7] = i8;
            iArr2[i7] = i8;
            i8 += i9;
            i7++;
        }
        int i10 = i;
        while (true) {
            iArr4 = this.k;
            if (i10 >= i2) {
                break;
            }
            int i11 = iArr[i10];
            int i12 = iArr2[i11];
            iArr2[i11] = i12 + 1;
            iArr4[i12] = i10 - i;
            i10++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i3 > 0) {
            int i15 = this.d;
            int i16 = iArr3[i3];
            int i17 = iArr5[i3];
            for (int i18 = i4; i18 < i17; i18++) {
                a(iArr4[i16 + i18], 1023, 1023);
            }
            ga5 ga5VarQ0 = wx1.q0(wx1.s0(i4, i13), 2);
            int i19 = ga5VarQ0.a;
            int i20 = ga5VarQ0.b;
            int i21 = ga5VarQ0.c;
            if ((i21 > 0 && i19 <= i20) || (i21 < 0 && i20 <= i19)) {
                while (true) {
                    int i22 = i14 + i19;
                    a(-1, i22, i22 + 1);
                    if (i19 == i20) {
                        break;
                    } else {
                        i19 += i21;
                    }
                }
            }
            i13 = (i13 / 2) + i17;
            if (i13 >= 2 && i13 % 2 != 0) {
                w58.f(i13, "This canonical code does not represent a Huffman code tree: ");
                return;
            } else {
                i3--;
                i14 = i15;
                i4 = 0;
            }
        }
        if (i13 != 2) {
            gp.j("This canonical code does not represent a Huffman code tree");
            return;
        }
        int i23 = this.d;
        this.e = a(-1, i23 - 2, i23 - 1);
        fw.e0(-1, 0, 6, this.f);
        b(this.e, 0, 0);
    }

    public final void e(int i, int i2, int i3, int i4) {
        int i5 = (i4 & 65535) | (i2 << 16);
        int i6 = 1 << (10 - i2);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = (i7 << i2) | i;
            this.f[i8] = i5;
            this.g[i8] = i3;
        }
    }
}
