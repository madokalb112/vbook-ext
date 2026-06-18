package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b10 {
    public boolean a;
    public int b;
    public Object c;

    public b10(byte[] bArr, int i) {
        int length = (i & 2) != 0 ? bArr.length : 0;
        bArr.getClass();
        this.c = bArr;
        this.a = true;
        this.b = length;
    }

    public void a(int i, byte[] bArr) {
        bArr.getClass();
        c(this.b + i);
        fw.R(bArr, this.b, (byte[]) this.c, 0, i);
        this.b += i;
    }

    public void b(byte b) {
        c(this.b + 1);
        byte[] bArr = (byte[]) this.c;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public void c(int i) {
        byte[] bArr = (byte[]) this.c;
        if (bArr.length < i) {
            if (!this.a) {
                k27.i("ByteArrayBuffer configured to not grow!");
                return;
            }
            int length = (bArr.length + 7) * 5;
            int i2 = length < 0 ? 1073741823 : length;
            if (length >= 0 || i <= i2) {
                this.c = Arrays.copyOf(bArr, Math.max(i, i2));
            } else {
                gp.j("ByteArrayBuffer can't grow that much");
            }
        }
    }

    public byte[] d() {
        return Arrays.copyOf((byte[]) this.c, this.b);
    }

    public /* synthetic */ b10() {
        this(4096);
    }

    public b10(int i) {
        this(new byte[i], 4);
    }
}
