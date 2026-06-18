package defpackage;

import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zcb extends t1c {
    @Override // defpackage.t1c
    public final int S(StringBuilder sb, byte[] bArr, int i) {
        bArr.getClass();
        if (bArr.length < 0 || i < 0 || i > bArr.length) {
            gp.j("Out of bounds");
            return 0;
        }
        int i2 = 0;
        while (i2 < i) {
            byte b = bArr[i2];
            int i3 = b & 255;
            int i4 = i3 >> 4;
            if (i4 < 0 || i4 >= 8) {
                if (12 <= i4 && i4 < 14) {
                    int i5 = i2 + 1;
                    if (i5 >= i) {
                        break;
                    }
                    int i6 = ((b & 31) << 6) | (bArr[i5] & 63);
                    if ((55296 > i6 || i6 >= 57344) && i6 <= 65535) {
                        sb.append((char) i6);
                    } else {
                        int i7 = i6 - Parser.ARGC_LIMIT;
                        int iQ = yib.q(i7, 10, 10);
                        int iQ2 = yib.q(i7, 0, 10);
                        sb.append((char) (iQ | 55296));
                        sb.append((char) (iQ2 | 56320));
                    }
                    i2 += 2;
                } else if (i4 == 14) {
                    int i8 = i2 + 2;
                    if (i8 >= i) {
                        break;
                    }
                    int i9 = ((b & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i8] & 63);
                    if ((55296 > i9 || i9 >= 57344) && i9 <= 65535) {
                        sb.append((char) i9);
                    } else {
                        int i10 = i9 - Parser.ARGC_LIMIT;
                        int iQ3 = yib.q(i10, 10, 10);
                        int iQ4 = yib.q(i10, 0, 10);
                        sb.append((char) (iQ3 | 55296));
                        sb.append((char) (iQ4 | 56320));
                    }
                    i2 += 3;
                } else if (i4 == 15) {
                    int i11 = i2 + 3;
                    if (i11 >= i) {
                        break;
                    }
                    int iT = yib.t(yib.t(yib.t(yib.t(0, yib.q(b, 0, 3), 18, 3), yib.q(bArr[i2 + 1], 0, 6), 12, 6), yib.q(bArr[i2 + 2], 0, 6), 6, 6), yib.q(bArr[i11], 0, 6), 0, 6);
                    if ((55296 > iT || iT >= 57344) && iT <= 65535) {
                        sb.append((char) iT);
                    } else {
                        int i12 = iT - Parser.ARGC_LIMIT;
                        int iQ5 = yib.q(i12, 10, 10);
                        int iQ6 = yib.q(i12, 0, 10);
                        sb.append((char) (iQ5 | 55296));
                        sb.append((char) (iQ6 | 56320));
                    }
                    i2 += 4;
                } else {
                    sb.append((char) 65533);
                }
            } else if ((55296 > i3 || i3 >= 57344) && i3 <= 65535) {
                sb.append((char) i3);
            } else {
                int i13 = i3 - Parser.ARGC_LIMIT;
                int iQ7 = yib.q(i13, 10, 10);
                int iQ8 = yib.q(i13, 0, 10);
                sb.append((char) (iQ7 | 55296));
                sb.append((char) (iQ8 | 56320));
            }
            i2++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // defpackage.t1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(defpackage.b10 r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r6.getClass()
            r4 = 0
            r0 = r4
        L5:
            if (r4 >= r7) goto L97
            char r1 = r6.charAt(r4)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r2 > r1) goto L36
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r2) goto L36
            r2 = 10
            r3 = 6
            int r2 = yib.q(r1, r2, r3)
            r3 = 54
            if (r2 == r3) goto L33
            r3 = 55
            if (r2 != r3) goto L2d
            int r2 = r0 << 10
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 + r2
            goto L36
        L2d:
            java.lang.String r4 = "Unknown "
            defpackage.w58.f(r1, r4)
            return
        L33:
            r0 = r1 & 1023(0x3ff, float:1.434E-42)
            goto L93
        L36:
            r2 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 != 0) goto L3f
            byte r1 = (byte) r1
            r5.b(r1)
            goto L93
        L3f:
            r2 = r1 & (-2048(0xfffffffffffff800, float:NaN))
            if (r2 != 0) goto L4e
            int r2 = r1 >> 6
            r2 = r2 & 31
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            r5.b(r2)
            goto L8b
        L4e:
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r1
            if (r2 != 0) goto L68
            int r2 = r1 >> 12
            r2 = r2 & 15
            r2 = r2 | 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r2
            r5.b(r2)
            int r2 = r1 >> 6
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r5.b(r2)
            goto L8b
        L68:
            r2 = -2097152(0xffffffffffe00000, float:NaN)
            r2 = r2 & r1
            if (r2 != 0) goto L8b
            int r2 = r1 >> 18
            r2 = r2 & 7
            r2 = r2 | 240(0xf0, float:3.36E-43)
            byte r2 = (byte) r2
            r5.b(r2)
            int r2 = r1 >> 12
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r5.b(r2)
            int r2 = r1 >> 6
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r5.b(r2)
        L8b:
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r5.b(r1)
        L93:
            int r4 = r4 + 1
            goto L5
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcb.V(b10, java.lang.String, int):void");
    }

    @Override // defpackage.t1c
    public final int X(int i) {
        return i * 2;
    }

    @Override // defpackage.t1c
    public final int Y(int i) {
        return i * 2;
    }
}
