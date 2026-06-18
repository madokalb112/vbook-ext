package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ru1 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public ru1(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a(double d) {
        double d2;
        double d3;
        double d4 = this.a;
        if (d <= -1.0d) {
            return d4;
        }
        double d5 = this.b;
        if (d < 0.0d) {
            double d6 = (d - (-1.0d)) / 1.0d;
            d2 = (1.0d - d6) * d4;
            d3 = d6 * d5;
        } else {
            double d7 = this.c;
            if (d < 0.5d) {
                double d8 = (d - 0.0d) / 0.5d;
                d2 = (1.0d - d8) * d5;
                d3 = d8 * d7;
            } else {
                double d9 = this.d;
                if (d >= 1.0d) {
                    return d9;
                }
                double d10 = (d - 0.5d) / 0.5d;
                d2 = (1.0d - d10) * d7;
                d3 = d10 * d9;
            }
        }
        return d3 + d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru1)) {
            return false;
        }
        ru1 ru1Var = (ru1) obj;
        return Double.compare(this.a, ru1Var.a) == 0 && Double.compare(this.b, ru1Var.b) == 0 && Double.compare(this.c, ru1Var.c) == 0 && Double.compare(this.d, ru1Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.a + ", normal=" + this.b + ", medium=" + this.c + ", high=" + this.d + ")";
    }
}
