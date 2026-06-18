package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e73 implements iu8 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e73) && Float.compare(3.0f, 3.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(3.0f);
    }

    public final hu8 j(long j, long j2, long j3, ur1 ur1Var, float f, float f2) {
        return ww1.F(this, j, j2, j3, ur1Var, f, f2);
    }

    public final hu8 l(long j, long j2, long j3, ur1 ur1Var, float f, float f2) {
        float fMax;
        float fMax2;
        ur1Var.getClass();
        float f3 = f * 3.0f;
        if (ur1Var.equals(tr1.g)) {
            fMax2 = 3.0f * f3;
        } else {
            if (rw1.P(j3)) {
                int i = oa5.c;
                fMax = Math.max(((int) (j3 >> 32)) / ((int) (j2 >> 32)), ((int) (j3 & 4294967295L)) / ((int) (j2 & 4294967295L)));
            } else {
                fMax = 1.0f;
            }
            if (f2 <= f) {
                int i2 = oa5.c;
                f2 = Math.max(f3, Math.max(Math.max(((int) (j >> 32)) / ((int) (j2 >> 32)), ((int) (j & 4294967295L)) / ((int) (j2 & 4294967295L))), fMax));
            }
            fMax2 = Math.max(3.0f * f2, fMax);
            f3 = f2;
        }
        return new hu8(f, f3, fMax2);
    }

    public final String toString() {
        return "DynamicScalesCalculator(multiple=" + tw1.P(2, 3.0f) + ')';
    }
}
