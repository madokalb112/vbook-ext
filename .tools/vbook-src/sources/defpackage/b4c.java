package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b4c extends vb8 implements Serializable {
    public int c;
    public int d;
    public int e;
    public int f;
    public int s;
    public int t;

    @Override // defpackage.vb8
    public final int a(int i) {
        return (d() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.vb8
    public final int d() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.s;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.s = i4;
        int i5 = this.t + 362437;
        this.t = i5;
        return i4 + i5;
    }
}
