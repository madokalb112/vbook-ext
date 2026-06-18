package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bm7 {
    public final int a;
    public final int b;
    public final float[] c;

    public bm7(int i, int i2) {
        this.a = i;
        this.b = i2;
        float[] fArr = new float[3];
        lc5.Y((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        this.c = fArr;
    }
}
