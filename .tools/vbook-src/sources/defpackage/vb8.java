package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vb8 {
    public static final ub8 a = new ub8();
    public static final p2 b;

    static {
        Integer num = kd5.a;
        b = (num == null || num.intValue() >= 34) ? new zu7() : new mt3();
    }

    public abstract int a(int i);

    public double b() {
        return ((((long) a(26)) << 27) + ((long) a(27))) / 9.007199254740992E15d;
    }

    public double c(double d) {
        double dB;
        if (d <= 0.0d) {
            gp.k(qx1.l(Double.valueOf(0.0d), Double.valueOf(d)));
            return 0.0d;
        }
        double d2 = d - 0.0d;
        if (!Double.isInfinite(d2) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(d) > Double.MAX_VALUE) {
            dB = 0.0d + (b() * d2);
        } else {
            double dB2 = ((d / 2.0d) - 0.0d) * b();
            dB = 0.0d + dB2 + dB2;
        }
        return dB >= d ? Math.nextAfter(d, Double.NEGATIVE_INFINITY) : dB;
    }

    public abstract int d();

    public long e() {
        return (((long) d()) << 32) + ((long) d());
    }

    public long f(long j, long j2) {
        long jE;
        long j3;
        long jA;
        int iD;
        if (j2 <= j) {
            gp.k(qx1.l(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iD = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iD = d();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) d()) & 4294967295L);
                }
                jA = ((long) iD) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j3 = jE % j4;
                } while ((j4 - 1) + (jE - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jE2 = e();
            if (j <= jE2 && jE2 < j2) {
                return jE2;
            }
        }
    }

    public long g() {
        return f(0L, 1000L);
    }
}
