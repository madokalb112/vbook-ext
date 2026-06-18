package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wsa extends ul7 {
    public final float f = 100.0f;
    public final float s = 100.0f;
    public final float t;
    public final float u;

    public wsa(float f, float f2) {
        this.t = f;
        this.u = f2;
    }

    public final long i() {
        float f = this.f;
        if (f <= 0.0f) {
            return 0L;
        }
        float f2 = this.s;
        if (f2 <= 0.0f) {
            return 0L;
        }
        float f3 = this.t;
        if (f3 <= 0.0f) {
            return 0L;
        }
        float f4 = this.u;
        if (f4 <= 0.0f) {
            return 0L;
        }
        float fMin = Math.min(1.0f, Math.min(f / f3, f2 / f4));
        float f5 = f4 * fMin;
        return (((long) Float.floatToRawIntBits(f3 * fMin)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    public final void j(un5 un5Var) {
    }
}
