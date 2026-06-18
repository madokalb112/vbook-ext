package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class r21 {
    public int a;
    public int b;
    public int[] c = new int[0];
    public float d;

    public final float a() {
        int i;
        int i2 = this.b;
        if (i2 <= 0 || (i = this.a) <= 4) {
            return 0.01f;
        }
        if (i2 != i) {
            float f = i / ((i2 - i) * this.d);
            if (f < 0.99f) {
                return f;
            }
        }
        return 0.99f;
    }

    public abstract int b(int i, byte[] bArr);

    public final void c(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int iB = i2 == 2 ? b(i, bArr) : -1;
        if (iB >= 0) {
            this.b++;
            int[] iArr = this.c;
            if (iB >= iArr.length || 512 <= iArr[iB]) {
                return;
            }
            this.a++;
        }
    }

    public final void d() {
        this.b = 0;
        this.a = 0;
    }
}
