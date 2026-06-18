package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zj4 {
    public final int a;
    public final double b;
    public final double c;
    public final double d;

    public zj4(int i) {
        double d;
        int i2;
        this.a = i;
        qub qubVar = qub.k;
        qubVar.getClass();
        int i3 = i & 255;
        double dP0 = sdc.p0((16711680 & i) >> 16);
        double dP02 = sdc.p0((65280 & i) >> 8);
        double dP03 = sdc.p0(i3);
        double d2 = (0.18051042d * dP03) + (0.35762064d * dP02) + (0.41233895d * dP0);
        double d3 = (0.0722d * dP03) + (0.7152d * dP02) + (0.2126d * dP0);
        double d4 = (dP03 * 0.95034478d) + (dP02 * 0.11916382d) + (dP0 * 0.01932141d);
        double d5 = qubVar.i;
        double d6 = qubVar.e;
        double d7 = qubVar.b;
        double[][] dArr = kc5.a;
        double[] dArr2 = dArr[0];
        double d8 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d9 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d10 = (d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]);
        double[] dArr5 = qubVar.g;
        double d11 = dArr5[0] * d8;
        double d12 = dArr5[1] * d9;
        double d13 = dArr5[2] * d10;
        double d14 = qubVar.h;
        double dPow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double d15 = ((((double) (d11 < 0.0d ? -1 : d11 == 0.0d ? 0 : 1)) * 400.0d) * dPow) / (dPow + 27.13d);
        if (d12 < 0.0d) {
            d = 0.0d;
            i2 = -1;
        } else if (d12 == 0.0d) {
            d = 0.0d;
            i2 = 0;
        } else {
            d = 0.0d;
            i2 = 1;
        }
        double d16 = ((((double) i2) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double d17 = ((((double) (d13 >= d ? d13 == d ? 0 : 1 : -1)) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d18 = ((((-12.0d) * d16) + (d15 * 11.0d)) + d17) / 11.0d;
        double dA = tw2.a(d17, 2.0d, d15 + d16, 9.0d);
        double d19 = d16 * 20.0d;
        double d20 = ((21.0d * d17) + ((d15 * 20.0d) + d19)) / 20.0d;
        double d21 = (((d15 * 40.0d) + d19) + d17) / 20.0d;
        double dAtan2 = (Math.atan2(dA, d18) * 57.29577951308232d) % 360.0d;
        dAtan2 = dAtan2 < d ? dAtan2 + 360.0d : dAtan2;
        double d22 = dAtan2 * 0.017453292519943295d;
        double dPow4 = (Math.pow((d21 * qubVar.c) / d7, qubVar.j * d6) * 100.0d) / 100.0d;
        Math.sqrt(dPow4);
        double d23 = d7 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d18, dA) * (((((Math.cos(((dAtan2 < 20.14d ? dAtan2 + 360.0d : dAtan2) * 0.017453292519943295d) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * qubVar.f) * qubVar.d)) / (d20 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, qubVar.a), 0.73d);
        double dSqrt = Math.sqrt(dPow4) * dPow5;
        Math.sqrt((dPow5 * d6) / d23);
        Math.log1p(dSqrt * d5 * 0.0228d);
        Math.cos(d22);
        Math.sin(d22);
        this.b = dAtan2;
        this.c = dSqrt;
        this.d = (sdc.o0(vw1.I(new double[]{sdc.p0((i >> 16) & 255), sdc.p0((i >> 8) & 255), sdc.p0(i3)}, sdc.c)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public final boolean a() {
        double d = this.b;
        return d >= 170.0d && d < 207.0d;
    }

    public final boolean b() {
        double d = this.b;
        return d >= 105.0d && d < 125.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj4) && this.a == ((zj4) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return xv5.k(this.a, "Hct(argb=", ")");
    }
}
