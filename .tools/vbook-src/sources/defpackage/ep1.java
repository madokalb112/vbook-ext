package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ep1 {
    public final z81 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap j = new HashMap();
    public final HashMap k = new HashMap();
    public int i = 1;
    public byte[] l = new byte[256];
    public int h = 0;

    public ep1(z81 z81Var) {
        this.a = z81Var;
    }

    public static int l(int i, int i2, String str) {
        int i3 = 65535;
        if ((i2 - i) * 3 > 65535) {
            while (i != i2) {
                char cCharAt = str.charAt(i);
                i3 = (cCharAt == 0 || cCharAt > 127) ? cCharAt < 2047 ? i3 - 2 : i3 - 3 : i3 - 1;
                if (i3 < 0) {
                    return i;
                }
                i++;
            }
        }
        return i2;
    }

    public final short a(String str) {
        String str2;
        HashMap map = this.f;
        int iIntValue = ((Integer) map.getOrDefault(str, -1)).intValue();
        if (iIntValue == -1) {
            if (str.indexOf(46) > 0) {
                String strReplace = str.replace('.', '/');
                Integer num = (Integer) map.getOrDefault(strReplace, -1);
                int iIntValue2 = num.intValue();
                if (iIntValue2 != -1) {
                    map.put(str, num);
                }
                str2 = strReplace;
                iIntValue = iIntValue2;
            } else {
                str2 = str;
            }
            if (iIntValue == -1) {
                short sI = i(str2);
                j(3);
                byte[] bArr = this.l;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = 7;
                this.h = z81.I(bArr, sI, i2);
                iIntValue = this.i;
                this.i = iIntValue + 1;
                map.put(str2, Integer.valueOf(iIntValue));
                if (!str.equals(str2)) {
                    map.put(str, Integer.valueOf(iIntValue));
                }
            }
        }
        m(iIntValue, str);
        this.k.put(Integer.valueOf(iIntValue), (byte) 7);
        return (short) iIntValue;
    }

    public final int b(double d) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        this.h = i + 1;
        bArr[i] = 6;
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr2 = this.l;
        int i2 = (int) (jDoubleToLongBits >>> 32);
        this.h = z81.J(bArr2, (int) jDoubleToLongBits, z81.J(bArr2, i2, this.h));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 6);
        return i3;
    }

    public final int c(int i) {
        j(5);
        byte[] bArr = this.l;
        int i2 = this.h;
        int i3 = i2 + 1;
        this.h = i3;
        bArr[i2] = 3;
        this.h = z81.J(bArr, i, i3);
        this.k.put(Integer.valueOf(this.i), (byte) 3);
        int i4 = this.i;
        this.i = i4 + 1;
        return (short) i4;
    }

    public final int d(long j) {
        j(9);
        byte[] bArr = this.l;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = 5;
        this.h = z81.J(bArr, (int) j, z81.J(bArr, (int) (j >>> 32), i2));
        int i3 = this.i;
        this.i = i3 + 2;
        this.k.put(Integer.valueOf(i3), (byte) 5);
        return i3;
    }

    public final int e(String str) {
        int i = i(str) & 65535;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        int iIntValue = ((Integer) map.getOrDefault(numValueOf, -1)).intValue();
        if (iIntValue == -1) {
            iIntValue = this.i;
            this.i = iIntValue + 1;
            j(3);
            byte[] bArr = this.l;
            int i2 = this.h;
            int i3 = i2 + 1;
            this.h = i3;
            bArr[i2] = 8;
            this.h = z81.I(bArr, i, i3);
            map.put(Integer.valueOf(i), Integer.valueOf(iIntValue));
        }
        this.k.put(Integer.valueOf(iIntValue), (byte) 8);
        return iIntValue;
    }

    public final short f(x81 x81Var) {
        HashMap map = this.g;
        int iIntValue = ((Integer) map.getOrDefault(x81Var, -1)).intValue();
        if (iIntValue == -1) {
            x81Var.getClass();
            short sG = g("org.mozilla.javascript.optimizer.Bootstrapper", "bootstrap", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;");
            j(4);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 15;
            int i3 = i + 2;
            this.h = i3;
            bArr[i2] = 6;
            this.h = z81.I(bArr, sG, i3);
            iIntValue = this.i;
            this.i = iIntValue + 1;
            map.put(x81Var, Integer.valueOf(iIntValue));
            this.k.put(Integer.valueOf(iIntValue), (byte) 15);
        }
        return (short) iIntValue;
    }

    public final short g(String str, String str2, String str3) {
        tu3 tu3Var = new tu3(str, str2, str3);
        HashMap map = this.e;
        int iIntValue = ((Integer) map.getOrDefault(tu3Var, -1)).intValue();
        if (iIntValue == -1) {
            short sH = h(str2, str3);
            short sA = a(str);
            j(5);
            byte[] bArr = this.l;
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            bArr[i] = 10;
            int I = z81.I(bArr, sA, i2);
            this.h = I;
            this.h = z81.I(this.l, sH, I);
            iIntValue = this.i;
            this.i = iIntValue + 1;
            map.put(tu3Var, Integer.valueOf(iIntValue));
        }
        m(iIntValue, tu3Var);
        this.k.put(Integer.valueOf(iIntValue), (byte) 10);
        return (short) iIntValue;
    }

    public final short h(String str, String str2) {
        short sI = i(str);
        short sI2 = i(str2);
        j(5);
        byte[] bArr = this.l;
        int i = this.h;
        int i2 = i + 1;
        this.h = i2;
        bArr[i] = 12;
        int I = z81.I(bArr, sI, i2);
        this.h = I;
        this.h = z81.I(this.l, sI2, I);
        this.k.put(Integer.valueOf(this.i), (byte) 12);
        int i3 = this.i;
        this.i = i3 + 1;
        return (short) i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short i(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep1.i(java.lang.String):short");
    }

    public final void j(int i) {
        int i2 = this.h;
        int i3 = i2 + i;
        byte[] bArr = this.l;
        if (i3 > bArr.length) {
            int length = bArr.length * 2;
            if (i2 + i > length) {
                length = i2 + i;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.l = bArr2;
        }
    }

    public final Object k(int i) {
        return this.j.get(Integer.valueOf(i));
    }

    public final void m(int i, Object obj) {
        this.j.put(Integer.valueOf(i), obj);
    }
}
