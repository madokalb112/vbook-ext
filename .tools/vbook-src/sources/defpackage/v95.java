package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v95 extends j28 {
    public int[] a;
    public int b;

    @Override // defpackage.j28
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.j28
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.j28
    public final int d() {
        return this.b;
    }
}
