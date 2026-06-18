package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class laa {
    public final zj4 a;
    public zj4 b;
    public ArrayList c;
    public ArrayList d;
    public HashMap e;

    public laa(zj4 zj4Var) {
        this.a = zj4Var;
    }

    public final zj4 a() {
        return (zj4) c().get(0);
    }

    public final List b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            zj4 zj4Var = this.a;
            arrayList2.add(bx1.E(d, zj4Var.c, zj4Var.d));
        }
        ArrayList arrayListO = gc1.O(gc1.Y(arrayList2));
        this.d = arrayListO;
        return arrayListO;
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b());
        arrayList2.add(this.a);
        ic1.m0(new cw2(this, 8), arrayList2);
        this.c = arrayList2;
        return arrayList2;
    }

    public final double d(zj4 zj4Var) {
        zj4Var.getClass();
        Object obj = ((HashMap) e()).get(f());
        obj.getClass();
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) e()).get(a());
        obj2.getClass();
        double dDoubleValue2 = dDoubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) e()).get(zj4Var);
        obj3.getClass();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) e()).get(a());
        obj4.getClass();
        double dDoubleValue4 = dDoubleValue3 - ((Number) obj4).doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue4 / dDoubleValue2;
    }

    public final Map e() {
        HashMap map = this.e;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(b());
        arrayList.add(this.a);
        HashMap map2 = new HashMap();
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            int i2 = i + 1;
            zj4 zj4Var = (zj4) obj;
            zj4Var.getClass();
            int i3 = zj4Var.a;
            double dP0 = sdc.p0((i3 >> 16) & 255);
            double dP02 = sdc.p0((i3 >> 8) & 255);
            double dP03 = sdc.p0(i3 & 255);
            double[][] dArr = sdc.c;
            double[] dArr2 = dArr[c];
            double d = (dArr2[2] * dP03) + (dArr2[1] * dP02) + (dArr2[c] * dP0);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dP03) + (dArr3[1] * dP02) + (dArr3[c] * dP0);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dP03) + (dArr4[1] * dP02) + (dArr4[c] * dP0);
            double[] dArr5 = sdc.d;
            double d4 = d / dArr5[c];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dO0 = sdc.o0(d4);
            double dO02 = sdc.o0(d5);
            double d7 = (116.0d * dO02) - 16.0d;
            double d8 = (dO0 - dO02) * 500.0d;
            double dO03 = (dO02 - sdc.o0(d6)) * 200.0d;
            double[] dArr6 = new double[3];
            dArr6[c] = d7;
            dArr6[1] = d8;
            dArr6[2] = dO03;
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d9 = (dAtan2 - 50.0d) % 360.0d;
            if (d9 < 0.0d) {
                d9 += 360.0d;
            }
            map2.put(zj4Var, Double.valueOf((Math.cos(d9 * 0.017453292519943295d) * dPow) - 0.5d));
            i = i2;
            c = 0;
        }
        this.e = map2;
        return map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof laa) && this.a.equals(((laa) obj).a);
    }

    public final zj4 f() {
        return (zj4) c().get(c().size() - 1);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.a + ")";
    }
}
