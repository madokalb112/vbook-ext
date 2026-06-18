package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(q31.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(xq0 xq0Var, av0 av0Var, long j, long j2, int i) {
        oz8 oz8Var;
        long j3 = j;
        long j4 = j2;
        av0Var.getClass();
        long j5 = i;
        ah1.z(av0Var.d(), 0L, j5);
        if (i <= 0) {
            gp.l("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            gp.k(xv5.l(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbO = j39.o(j3, "fromIndex > toIndex: ", " > ");
            sbO.append(j4);
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        long j6 = xq0Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (oz8Var = xq0Var.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                oz8Var = oz8Var.g;
                oz8Var.getClass();
                j6 -= (long) (oz8Var.c - oz8Var.b);
            }
            byte[] bArrH = av0Var.h();
            byte b2 = bArrH[0];
            long jMin = Math.min(j4, (xq0Var.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = oz8Var.a;
                int iMin = (int) Math.min(oz8Var.c, (((long) oz8Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) oz8Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(oz8Var, i2 + 1, bArrH, 1, i)) {
                        return ((long) (i2 - oz8Var.b)) + j6;
                    }
                }
                j6 += (long) (oz8Var.c - oz8Var.b);
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (oz8Var.c - oz8Var.b));
            if (j8 > j3) {
                break;
            }
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j7 = j8;
        }
        byte[] bArrH2 = av0Var.h();
        byte b3 = bArrH2[0];
        long jMin2 = Math.min(j4, (xq0Var.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = oz8Var.a;
            int iMin2 = (int) Math.min(oz8Var.c, (((long) oz8Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) oz8Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(oz8Var, i3 + 1, bArrH2, 1, i)) {
                    return ((long) (i3 - oz8Var.b)) + j7;
                }
            }
            j7 += (long) (oz8Var.c - oz8Var.b);
            oz8Var = oz8Var.f;
            oz8Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(oz8 oz8Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = oz8Var.c;
        byte[] bArr2 = oz8Var.a;
        while (i2 < i3) {
            if (i == i4) {
                oz8Var = oz8Var.f;
                oz8Var.getClass();
                byte[] bArr3 = oz8Var.a;
                bArr2 = bArr3;
                i = oz8Var.b;
                i4 = oz8Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(long j, xq0 xq0Var) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (xq0Var.E(j2) == 13) {
                String strJ0 = xq0Var.j0(j2, q31.a);
                xq0Var.skip(2L);
                return strJ0;
            }
        }
        String strJ02 = xq0Var.j0(j, q31.a);
        xq0Var.skip(1L);
        return strJ02;
    }
}
