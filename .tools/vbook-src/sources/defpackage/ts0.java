package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ts0 {
    public final byte[] a;
    public int b;

    public ts0(byte[] bArr, int i, boolean z) {
        bArr.getClass();
        switch (i) {
            case 3:
                this.a = bArr;
                break;
            default:
                this.a = bArr;
                break;
        }
    }

    public byte a() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i < bArr.length) {
            this.b = i + 1;
            return bArr[i];
        }
        gp.j("Unexpected end of UMD stream");
        return (byte) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] b(int r7, int r8) {
        /*
            r6 = this;
            byte[] r0 = new byte[r8]
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r8) goto L18
            int r3 = r7 + r2
            if (r3 < 0) goto L12
            byte[] r4 = r6.a
            int r5 = r4.length
            if (r3 >= r5) goto L12
            r3 = r4[r3]
            goto L13
        L12:
            r3 = r1
        L13:
            r0[r2] = r3
            int r2 = r2 + 1
            goto L4
        L18:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts0.b(int, int):byte[]");
    }

    public byte[] c(int i) {
        if (i <= 0) {
            return new byte[0];
        }
        int i2 = this.b;
        int i3 = i2 + i;
        byte[] bArr = this.a;
        if (i3 > bArr.length) {
            gp.j("Unexpected end of UMD stream");
            return null;
        }
        byte[] bArrY = fw.Y(bArr, i2, i2 + i);
        this.b += i;
        return bArrY;
    }

    public int d() {
        int i = i();
        int i2 = i();
        return (i() << 24) | (i() << 16) | (i2 << 8) | i;
    }

    public String e(int i, int i2) {
        return iw9.z(b(i, i2));
    }

    public int f(int i) {
        return j(i + 1) | (j(i) << 8);
    }

    public int g() {
        int i = this.b;
        this.b = i + 4;
        return j(i + 3) | (j(i) << 24) | (j(i + 1) << 16) | (j(i + 2) << 8);
    }

    public int h(int i) {
        return j(i + 3) | (j(i) << 24) | (j(i + 1) << 16) | (j(i + 2) << 8);
    }

    public int i() {
        return a() & 255;
    }

    public int j(int i) {
        byte[] bArr = this.a;
        bArr.getClass();
        Byte bValueOf = (i < 0 || i >= bArr.length) ? null : Byte.valueOf(bArr[i]);
        return (bValueOf != null ? bValueOf.byteValue() : (byte) 0) & 255;
    }

    public String k(int i) {
        r31 r31Var = r31.a;
        return r31.c.a(c(i));
    }

    public void l(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = this.b;
        if (i2 + i <= this.a.length) {
            this.b = i2 + i;
        } else {
            gp.j("Unexpected end of UMD stream");
        }
    }

    public ts0(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public ts0(int i) {
        this.a = new byte[i];
    }
}
