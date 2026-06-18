package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class im5 extends n31 {
    public static final byte[] e = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};
    public static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};
    public m31 b = m31.a;
    public byte c = 1;
    public final int[] d = new int[4];

    public im5() {
        d();
    }

    @Override // defpackage.n31
    public final String a() {
        return "WINDOWS-1252";
    }

    @Override // defpackage.n31
    public final float b() {
        if (this.b == m31.c) {
            return 0.01f;
        }
        int i = 0;
        for (int i2 : this.d) {
            i += i2;
        }
        if (i <= 0) {
            return 0.0f;
        }
        float f2 = i;
        float f3 = ((r4[3] * 1.0f) / f2) - ((r4[1] * 20.0f) / f2);
        return (f3 >= 0.0f ? f3 : 0.0f) * 0.5f;
    }

    @Override // defpackage.n31
    public final m31 c(int i, byte[] bArr) {
        int i2;
        ArrayList arrayList = new ArrayList(i);
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        while (i4 < i) {
            byte b = bArr[i4];
            if (b == 62) {
                z = false;
            } else if (b == 60) {
                z = true;
            }
            if ((b & 128) == 0 && ((i2 = b & 255) < 65 || ((i2 > 90 && i2 < 97) || i2 > 122))) {
                if (i4 > i5 && !z) {
                    while (i5 < i4) {
                        arrayList.add(Byte.valueOf(bArr[i5]));
                        i5++;
                    }
                    arrayList.add((byte) 32);
                }
                i5 = i4 + 1;
            }
            i4++;
        }
        if (!z && i4 > i5) {
            while (i5 < i4) {
                arrayList.add(Byte.valueOf(bArr[i5]));
                i5++;
            }
        }
        byte[] bArrU0 = fc1.U0(arrayList);
        int length = bArrU0.length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            byte b2 = e[bArrU0[i3] & 255];
            byte b3 = f[(this.c * 8) + b2];
            if (b3 == 0) {
                this.b = m31.c;
                break;
            }
            int[] iArr = this.d;
            iArr[b3] = iArr[b3] + 1;
            this.c = b2;
            i3++;
        }
        return this.b;
    }

    @Override // defpackage.n31
    public final void d() {
        this.b = m31.a;
        this.c = (byte) 1;
        fw.e0(0, 0, 6, this.d);
    }
}
