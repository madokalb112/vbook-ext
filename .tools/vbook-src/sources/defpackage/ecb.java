package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ecb extends j28 {
    public byte[] a;
    public int b;

    @Override // defpackage.j28
    public final Object a() {
        return new dcb(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.j28
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.j28
    public final int d() {
        return this.b;
    }
}
