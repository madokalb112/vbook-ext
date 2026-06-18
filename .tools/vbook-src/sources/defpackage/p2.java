package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p2 extends vb8 {
    @Override // defpackage.vb8
    public final int a(int i) {
        return (h().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.vb8
    public final double b() {
        return h().nextDouble();
    }

    @Override // defpackage.vb8
    public final int d() {
        return h().nextInt();
    }

    @Override // defpackage.vb8
    public final long e() {
        return h().nextLong();
    }

    public abstract Random h();
}
