package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vj4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte[] d;
    public int e;
    public long f;

    public vj4(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = new byte[i];
    }

    public abstract void a(byte[] bArr);

    public abstract byte[] b(long j);

    public abstract void c();

    public abstract void d(byte[] bArr);

    public final qj4 e() {
        byte[] bArr = new byte[this.b];
        f(bArr);
        return new qj4(bArr);
    }

    public void f(byte[] bArr) {
        byte[] bArrB = b(this.f);
        int i = 0;
        while (i < bArrB.length) {
            int i2 = this.e;
            int i3 = (this.a - i2) + i;
            byte[] bArr2 = this.d;
            fw.R(bArrB, i2, bArr2, i, i3);
            d(bArr2);
            this.e = 0;
            i = i3;
        }
        a(bArr);
        c();
    }

    public vj4 g(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = i;
        while (i3 > 0) {
            int i4 = this.e;
            int i5 = this.a;
            int iMin = Math.min(i5 - i4, i3);
            int i6 = this.e;
            int i7 = i2 + iMin;
            byte[] bArr2 = this.d;
            fw.R(bArr, i6, bArr2, i2, i7);
            i3 -= iMin;
            int i8 = this.e + iMin;
            this.e = i8;
            if (i8 >= i5) {
                this.e = i8 - i5;
                d(bArr2);
            }
            i2 = i7;
        }
        this.f += (long) i;
        return this;
    }

    public final String toString() {
        return xv5.s(new StringBuilder("Hasher("), this.c, ')');
    }
}
