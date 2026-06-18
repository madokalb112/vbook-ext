package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bf9 {
    public final int a;
    public final int b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public bf9(int i) {
        int i2 = 1 << i;
        this.a = i2;
        this.b = i2 - 1;
        this.c = new byte[i2];
        this.f = i2;
    }

    public final void a(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f)) {
            gp.j("Try to write more than available");
            return;
        }
        this.e += i;
        this.g += i;
        this.f = i2 - i;
    }

    public final int b(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int iMin = Math.min(this.g, i2);
        int i3 = this.d;
        int i4 = 0;
        while (true) {
            int i5 = this.g;
            int i6 = this.d;
            int i7 = this.b;
            int iMin2 = Math.min(iMin, Math.min(i5, this.a - (i6 & i7)));
            if (iMin2 <= 0) {
                int iMin3 = Math.min(this.g, i4);
                this.d = (this.d + iMin3) & i7;
                this.f += iMin3;
                this.g -= iMin3;
                return iMin3;
            }
            m79.w(this.c, i3 & i7, bArr, i, iMin2);
            iMin -= iMin2;
            i += iMin2;
            i3 += iMin2;
            i4 += iMin2;
        }
    }

    public final int c() {
        int i = this.g;
        if (i <= 0) {
            return -1;
        }
        int i2 = this.d;
        int i3 = this.c[i2] & 255;
        this.d = (i2 + 1) & this.b;
        this.g = i - 1;
        this.f++;
        return i3;
    }

    public final int d(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int iMin = Math.min(this.f, i2);
        int i3 = 0;
        while (iMin > 0) {
            int i4 = this.f;
            int i5 = this.e;
            int i6 = this.b;
            int iMin2 = Math.min(iMin, Math.min(i4, this.a - (i5 & i6)));
            if (iMin2 <= 0) {
                break;
            }
            m79.w(bArr, i, this.c, this.e & i6, iMin2);
            a(iMin2);
            i += iMin2;
            iMin -= iMin2;
            i3 += iMin2;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bf9) {
            int i = this.g;
            bf9 bf9Var = (bf9) obj;
            if (i == bf9Var.g) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.c[(this.d + i2) & this.b] == bf9Var.c[(bf9Var.d + i2) & bf9Var.b]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) + this.c[(this.d + i3) & this.b];
        }
        return i2;
    }
}
