package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d04 implements iu8 {
    public final float a;

    public d04(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d04) && Float.compare(this.a, ((d04) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final hu8 j(long j, long j2, long j3, ur1 ur1Var, float f, float f2) {
        return ww1.F(this, j, j2, j3, ur1Var, f, f2);
    }

    public final hu8 l(long j, long j2, long j3, ur1 ur1Var, float f, float f2) {
        ur1Var.getClass();
        boolean zEquals = ur1Var.equals(tr1.g);
        float f3 = this.a;
        if (zEquals || f2 <= f) {
            f2 = f * f3;
        }
        return new hu8(f, f2, f3 * f2);
    }

    public final String toString() {
        return "FixedScalesCalculator(multiple=" + tw1.P(2, this.a) + ')';
    }
}
