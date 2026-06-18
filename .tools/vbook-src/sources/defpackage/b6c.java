package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b6c {
    public final float a;

    public b6c(long j, long j2) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j >> 32);
        int i4 = (int) (j & 4294967295L);
        if (i / i2 <= i3 / i4) {
            i2 = i3 >= i ? i3 : i;
        } else if (i4 >= i2) {
            i2 = i4;
        }
        this.a = i2 / 50.0f;
    }
}
