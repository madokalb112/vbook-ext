package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wd1 extends pd1 {
    @Override // defpackage.pd1
    public final z63 A() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_fixed";
        y63Var.b = new td1(4);
        y63Var.c = new qd1(this, 28);
        y63Var.d = true;
        y63Var.f = new qd1(this, 29);
        y63Var.h = new td1(6);
        return super.A().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 B() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_fixed_dim";
        y63Var.b = new od1(23);
        y63Var.c = new qd1(this, 0);
        y63Var.d = true;
        y63Var.i = new qd1(this, 1);
        return super.B().b().b(y63Var.a()).a();
    }

    public final z63 C() {
        y63 y63Var = new y63();
        y63Var.a = "error_dim";
        y63Var.b = new sd1(5);
        y63Var.c = new sd1(6);
        y63Var.d = true;
        y63Var.f = new qd1(this, 16);
        y63Var.h = new sd1(8);
        y63Var.i = new qd1(this, 17);
        return y63Var.a();
    }

    public final z63 D() {
        y63 y63Var = new y63();
        y63Var.a = "on_surface";
        y63Var.b = new sd1(23);
        int i = 25;
        y63Var.c = new qd1(this, i);
        y63Var.e = new sd1(24);
        y63Var.f = new qd1(this, 26);
        y63Var.h = new sd1(i);
        z63 z63VarA = y63Var.a();
        y63 y63Var2 = new y63();
        y63Var2.a = "on_surface";
        int i2 = 5;
        y63Var2.b = new od1(i2);
        y63Var2.c = new g41(4);
        y63Var2.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 9);
        y63Var2.h = new g41(i2);
        return y63Var2.a().b().b(z63VarA).a();
    }

    public final z63 E() {
        y63 y63Var = new y63();
        y63Var.a = "primary_dim";
        y63Var.b = new sd1(2);
        y63Var.c = new sd1(3);
        y63Var.d = true;
        y63Var.f = new qd1(this, 14);
        y63Var.h = new sd1(4);
        y63Var.i = new qd1(this, 15);
        return y63Var.a();
    }

    public final z63 F() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_dim";
        y63Var.b = new rd1(25);
        y63Var.c = new rd1(26);
        y63Var.d = true;
        y63Var.f = new qd1(this, 10);
        y63Var.h = new rd1(27);
        y63Var.i = new qd1(this, 11);
        return y63Var.a();
    }

    public final z63 G() {
        y63 y63Var = new y63();
        y63Var.a = "surface";
        y63Var.b = new sd1(12);
        y63Var.c = new sd1(13);
        y63Var.d = true;
        z63 z63VarA = y63Var.a();
        y63 y63Var2 = new y63();
        y63Var2.a = "surface";
        y63Var2.b = new g41(29);
        y63Var2.c = new kd1(0);
        y63Var2.d = true;
        return y63Var2.a().b().b(z63VarA).a();
    }

    public final z63 H() {
        y63 y63Var = new y63();
        y63Var.a = "surface_container_high";
        y63Var.b = new vd1(2);
        y63Var.c = new vd1(3);
        y63Var.d = true;
        y63Var.e = new vd1(4);
        z63 z63VarA = y63Var.a();
        y63 y63Var2 = new y63();
        y63Var2.a = "surface_container_high";
        y63Var2.b = new md1(20);
        y63Var2.c = new md1(21);
        y63Var2.d = true;
        return y63Var2.a().b().b(z63VarA).a();
    }

    public final z63 I() {
        y63 y63Var = new y63();
        y63Var.a = "surface_container_highest";
        y63Var.b = new td1(20);
        y63Var.c = new td1(21);
        y63Var.d = true;
        y63Var.e = new td1(22);
        z63 z63VarA = y63Var.a();
        y63 y63Var2 = new y63();
        y63Var2.a = "surface_container_highest";
        y63Var2.b = new od1(0);
        y63Var2.c = new od1(1);
        y63Var2.d = true;
        return y63Var2.a().b().b(z63VarA).a();
    }

    public final z63 J() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_dim";
        y63Var.b = new rd1(28);
        y63Var.c = new rd1(29);
        y63Var.d = true;
        y63Var.f = new qd1(this, 12);
        y63Var.h = new sd1(1);
        y63Var.i = new qd1(this, 13);
        return y63Var.a();
    }

    @Override // defpackage.pd1
    public final z63 a() {
        y63 y63VarB = G().b();
        y63VarB.a = "background";
        return super.a().b().b(y63VarB.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 b() {
        y63 y63Var = new y63();
        y63Var.a = "error";
        y63Var.b = new sd1(14);
        y63Var.c = new sd1(15);
        y63Var.d = true;
        y63Var.f = new qd1(this, 20);
        y63Var.h = new sd1(16);
        y63Var.i = new qd1(this, 21);
        return super.b().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 c() {
        y63 y63Var = new y63();
        y63Var.a = "error_container";
        y63Var.b = new od1(7);
        y63Var.c = new sd1(11);
        y63Var.d = true;
        y63Var.f = new qd1(this, 22);
        y63Var.i = new qd1(this, 27);
        y63Var.h = new td1(5);
        return super.c().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final sza d(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        f73Var.getClass();
        double[] dArr = {0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d};
        double[] dArr2 = {12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d};
        int iMin = Math.min(8, 8);
        double d2 = zj4Var.b;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                double d3 = dArr2[i] % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                d2 = d3;
            }
        }
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal == 1) {
            return uj9.p(d2, f73Var == f73Var2 ? 50.0d : 40.0d);
        }
        if (iOrdinal == 2) {
            return uj9.p(d2, f73Var == f73Var2 ? 60.0d : 48.0d);
        }
        if (iOrdinal == 3) {
            return uj9.p(d2, f73Var == f73Var2 ? 80.0d : 60.0d);
        }
        if (iOrdinal == 4) {
            return uj9.p(d2, f73Var == f73Var2 ? 64.0d : 48.0d);
        }
        super.d(ykbVar, zj4Var, z, f73Var, d);
        return null;
    }

    @Override // defpackage.pd1
    public final zj4 e(z63 z63Var, g73 g73Var) {
        Number number;
        g73Var.getClass();
        sza szaVar = (sza) z63Var.b.invoke(g73Var);
        double dK = k(z63Var, g73Var);
        double d = szaVar.a;
        kb4 kb4Var = z63Var.e;
        if (kb4Var == null || (number = (Double) kb4Var.invoke(g73Var)) == null) {
            number = 1;
        }
        return bx1.E(d, number.doubleValue() * szaVar.b, dK);
    }

    @Override // defpackage.pd1
    public final sza f(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal == 1) {
            return uj9.p(d2, f73Var == f73Var2 ? 1.4d : 6.0d);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? super.f(ykbVar, zj4Var, z, f73Var, d) : uj9.p(lr3.s(zj4Var), lr3.n(zj4Var, z, f73Var)) : uj9.p(lr3.u(zj4Var), lr3.o(zj4Var, f73Var));
        }
        return uj9.p(d2, f73Var == f73Var2 ? 5.0d : 10.0d);
    }

    @Override // defpackage.pd1
    public final sza g(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal == 1) {
            return uj9.p(d2, (f73Var == f73Var2 ? 1.4d : 6.0d) * 2.2d);
        }
        if (iOrdinal == 2) {
            return uj9.p(d2, (f73Var == f73Var2 ? 5.0d : 10.0d) * 1.7d);
        }
        if (iOrdinal == 3) {
            return uj9.p(lr3.u(zj4Var), lr3.o(zj4Var, f73Var) * 1.29d);
        }
        if (iOrdinal != 4) {
            return super.g(ykbVar, zj4Var, z, f73Var, d);
        }
        double dS = lr3.s(zj4Var);
        return uj9.p(dS, lr3.n(zj4Var, z, f73Var) * ((dS < 105.0d || dS >= 125.0d) ? 2.3d : 1.6d));
    }

    @Override // defpackage.pd1
    public final sza h(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return uj9.p(d2, (f73Var == f73Var2 && z) ? 26.0d : 32.0d);
            }
            if (iOrdinal == 3) {
                return uj9.p(d2, f73Var == f73Var2 ? 74.0d : 56.0d);
            }
            if (iOrdinal != 4) {
                return super.h(ykbVar, zj4Var, z, f73Var, d);
            }
            return uj9.p(d2, f73Var == f73Var2 ? z ? 36.0d : 48.0d : 40.0d);
        }
        double d3 = 12.0d;
        if (f73Var == f73Var2) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 8.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 16.0d;
        }
        return uj9.p(d2, d3);
    }

    @Override // defpackage.pd1
    public final sza i(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return uj9.p(d2, 16.0d);
            }
            if (iOrdinal == 3) {
                return uj9.p(e11.M(zj4Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d}), f73Var == f73Var2 ? 56.0d : 36.0d);
            }
            if (iOrdinal != 4) {
                return super.i(ykbVar, zj4Var, z, f73Var, d);
            }
            return uj9.p(e11.M(zj4Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-160.0d, 155.0d, -100.0d, 96.0d, -96.0d, -156.0d, -165.0d, -160.0d}), (f73Var == f73Var2 && z) ? 16.0d : 24.0d);
        }
        double d3 = 6.0d;
        if (f73Var == f73Var2) {
            if (d2 < 250.0d || d2 >= 270.0d) {
                d3 = 4.0d;
            }
        } else if (d2 >= 250.0d && d2 < 270.0d) {
            d3 = 10.0d;
        }
        return uj9.p(d2, d3);
    }

    @Override // defpackage.pd1
    public final sza j(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        f73Var.getClass();
        int iOrdinal = ykbVar.ordinal();
        f73 f73Var2 = f73.c;
        if (iOrdinal == 1) {
            return uj9.p(e11.M(zj4Var, new double[]{0.0d, 38.0d, 105.0d, 161.0d, 204.0d, 278.0d, 333.0d, 360.0d}, new double[]{-32.0d, 26.0d, 10.0d, -39.0d, 24.0d, -15.0d, -32.0d}), f73Var == f73Var2 ? 20.0d : 36.0d);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? super.j(ykbVar, zj4Var, z, f73Var, d) : uj9.p(e11.M(zj4Var, new double[]{0.0d, 105.0d, 140.0d, 204.0d, 253.0d, 278.0d, 300.0d, 333.0d, 360.0d}, new double[]{-165.0d, 160.0d, -105.0d, 101.0d, -101.0d, -160.0d, -170.0d, -165.0d}), 48.0d) : uj9.p(e11.M(zj4Var, new double[]{0.0d, 38.0d, 71.0d, 105.0d, 140.0d, 161.0d, 253.0d, 333.0d, 360.0d}, new double[]{-72.0d, 35.0d, 24.0d, -24.0d, 62.0d, 50.0d, 62.0d, -72.0d}), 56.0d);
        }
        return uj9.p(e11.M(zj4Var, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d}), f73Var == f73Var2 ? 28.0d : 32.0d);
    }

    @Override // defpackage.pd1
    public final double k(z63 z63Var, g73 g73Var) {
        z63 z63Var2;
        ru1 ru1Var;
        z63 z63Var3;
        double dO;
        g73Var.getClass();
        boolean z = g73Var.c;
        double d = g73Var.d;
        boolean z2 = z63Var.d;
        kb4 kb4Var = z63Var.f;
        kb4 kb4Var2 = z63Var.h;
        String str = z63Var.a;
        kb4 kb4Var3 = z63Var.i;
        Double dValueOf = null;
        vza vzaVar = kb4Var3 != null ? (vza) kb4Var3.invoke(g73Var) : null;
        if (vzaVar != null) {
            double d2 = vzaVar.c;
            z63 z63Var4 = vzaVar.a;
            z63 z63Var5 = vzaVar.b;
            wza wzaVar = vzaVar.d;
            uza uzaVar = vzaVar.f;
            if (wzaVar == wza.a || ((wzaVar == wza.d && z) || (wzaVar == wza.c && !z))) {
                d2 = -d2;
            }
            boolean zQ = lc5.Q(str, z63Var4.a);
            z63 z63Var6 = zQ ? z63Var4 : z63Var5;
            if (zQ) {
                z63Var4 = z63Var5;
            }
            double dDoubleValue = ((Number) z63Var6.c.invoke(g73Var)).doubleValue();
            double dA = z63Var4.a(g73Var);
            double d3 = d2 * ((double) (zQ ? 1 : -1));
            int iOrdinal = uzaVar.ordinal();
            if (iOrdinal == 0) {
                dO = wx1.O(dA + d3, 0.0d, 100.0d);
            } else if (iOrdinal == 1) {
                dO = d3 > 0.0d ? wx1.O(wx1.O(dDoubleValue, dA, dA + d3), 0.0d, 100.0d) : wx1.O(wx1.O(dDoubleValue, dA + d3, dA), 0.0d, 100.0d);
            } else {
                if (iOrdinal != 2) {
                    mn5.g();
                    return 0.0d;
                }
                dO = d3 > 0.0d ? wx1.O(dDoubleValue, dA + d3, 100.0d) : wx1.O(dDoubleValue, 0.0d, dA + d3);
            }
            if (kb4Var != null && kb4Var2 != null) {
                z63 z63Var7 = (z63) kb4Var.invoke(g73Var);
                ru1 ru1Var2 = (ru1) kb4Var2.invoke(g73Var);
                if (z63Var7 != null && ru1Var2 != null) {
                    double dA2 = z63Var7.a(g73Var);
                    double dA3 = ru1Var2.a(d);
                    if (qu1.n0(dA2, dO) < dA3 || d < 0.0d) {
                        dO = qx1.v(dA2, dA3);
                    }
                }
            }
            double d4 = dO;
            return (!z2 || iw9.C(str, "_fixed_dim", false)) ? d4 : d4 >= 57.0d ? wx1.O(d4, 65.0d, 100.0d) : wx1.O(d4, 0.0d, 49.0d);
        }
        double dDoubleValue2 = ((Number) z63Var.c.invoke(g73Var)).doubleValue();
        Double dValueOf2 = (kb4Var == null || (z63Var3 = (z63) kb4Var.invoke(g73Var)) == null) ? null : Double.valueOf(z63Var3.a(g73Var));
        if (kb4Var2 != null && (ru1Var = (ru1) kb4Var2.invoke(g73Var)) != null) {
            dValueOf = Double.valueOf(ru1Var.a(d));
        }
        if (dValueOf2 == null || dValueOf == null) {
            return dDoubleValue2;
        }
        if (qu1.n0(dValueOf2.doubleValue(), dDoubleValue2) < dValueOf.doubleValue() || d < 0.0d) {
            dDoubleValue2 = qx1.v(dValueOf2.doubleValue(), dValueOf.doubleValue());
        }
        double dO2 = dDoubleValue2;
        if (z2 && !iw9.C(str, "_fixed_dim", false)) {
            dO2 = dO2 >= 57.0d ? wx1.O(dO2, 65.0d, 100.0d) : wx1.O(dO2, 0.0d, 49.0d);
        }
        double d5 = dO2;
        kb4 kb4Var4 = z63Var.g;
        if (kb4Var4 != null && (z63Var2 = (z63) kb4Var4.invoke(g73Var)) != null) {
            double dA4 = z63Var2.a(g73Var);
            double dMax = Math.max(dValueOf2.doubleValue(), dA4);
            double dMin = Math.min(dValueOf2.doubleValue(), dA4);
            if (qu1.n0(dMax, d5) < dValueOf.doubleValue() || qu1.n0(dMin, d5) < dValueOf.doubleValue()) {
                double dJ0 = qu1.j0(dMax, dValueOf.doubleValue());
                double D = qu1.D(dMin, dValueOf.doubleValue());
                ArrayList arrayList = new ArrayList();
                if (dJ0 != -1.0d) {
                    arrayList.add(Double.valueOf(dJ0));
                }
                if (D != -1.0d) {
                    arrayList.add(Double.valueOf(D));
                }
                if (Math.rint(dValueOf2.doubleValue()) < 60.0d || Math.rint(dA4) < 60.0d) {
                    if (dJ0 < 0.0d) {
                        return 100.0d;
                    }
                    return dJ0;
                }
                if (arrayList.size() == 1) {
                    return ((Number) fc1.x0(arrayList)).doubleValue();
                }
                if (D < 0.0d) {
                    return 0.0d;
                }
                return D;
            }
        }
        return d5;
    }

    @Override // defpackage.pd1
    public final z63 m() {
        y63 y63Var = new y63();
        y63Var.a = "inverse_surface";
        y63Var.b = new vd1(0);
        y63Var.c = new vd1(1);
        y63Var.d = true;
        return super.m().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 o() {
        y63 y63Var = new y63();
        y63Var.a = "primary";
        y63Var.b = new sd1(7);
        y63Var.c = new sd1(9);
        y63Var.d = true;
        y63Var.f = new qd1(this, 18);
        y63Var.h = new sd1(10);
        y63Var.i = new qd1(this, 19);
        return super.o().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 p() {
        y63 y63Var = new y63();
        y63Var.a = "primary_container";
        y63Var.b = new td1(10);
        y63Var.c = new td1(11);
        y63Var.d = true;
        y63Var.f = new ud1(this, 0);
        y63Var.i = new ud1(this, 1);
        y63Var.h = new td1(13);
        return super.p().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 q() {
        y63 y63Var = new y63();
        y63Var.a = "primary_fixed";
        y63Var.b = new sd1(21);
        y63Var.c = new qd1(this, 23);
        y63Var.d = true;
        y63Var.f = new qd1(this, 24);
        y63Var.h = new sd1(22);
        return super.q().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 r() {
        y63 y63Var = new y63();
        y63Var.a = "primary_fixed_dim";
        y63Var.b = new rd1(3);
        y63Var.c = new qd1(this, 6);
        y63Var.d = true;
        y63Var.i = new qd1(this, 7);
        return super.r().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 s() {
        y63 y63Var = new y63();
        y63Var.a = "secondary";
        y63Var.b = new td1(12);
        y63Var.c = new td1(23);
        y63Var.d = true;
        y63Var.f = new ud1(this, 2);
        y63Var.h = new vd1(13);
        y63Var.i = new ud1(this, 7);
        return super.s().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 t() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_container";
        y63Var.b = new vd1(11);
        y63Var.c = new vd1(12);
        y63Var.d = true;
        y63Var.f = new ud1(this, 3);
        y63Var.i = new ud1(this, 4);
        y63Var.h = new vd1(14);
        return super.t().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 u() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_fixed";
        y63Var.b = new rd1(5);
        y63Var.c = new qd1(this, 8);
        y63Var.d = true;
        y63Var.f = new qd1(this, 9);
        y63Var.h = new rd1(6);
        return super.u().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 v() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_fixed_dim";
        y63Var.b = new rd1(2);
        y63Var.c = new qd1(this, 4);
        y63Var.d = true;
        y63Var.i = new qd1(this, 5);
        return super.v().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 w() {
        y63 y63Var = new y63();
        y63Var.a = "surface_bright";
        y63Var.b = new rd1(15);
        y63Var.c = new rd1(16);
        y63Var.d = true;
        y63Var.e = new rd1(17);
        return super.w().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 x() {
        y63 y63Var = new y63();
        y63Var.a = "surface_dim";
        y63Var.b = new td1(14);
        y63Var.c = new td1(15);
        y63Var.d = true;
        y63Var.e = new td1(16);
        return super.x().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 y() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary";
        y63Var.b = new od1(29);
        y63Var.c = new rd1(0);
        y63Var.d = true;
        y63Var.f = new qd1(this, 2);
        y63Var.h = new rd1(1);
        y63Var.i = new qd1(this, 3);
        return super.y().b().b(y63Var.a()).a();
    }

    @Override // defpackage.pd1
    public final z63 z() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_container";
        y63Var.b = new vd1(19);
        y63Var.c = new vd1(20);
        y63Var.d = true;
        y63Var.f = new ud1(this, 5);
        y63Var.i = new ud1(this, 6);
        y63Var.h = new od1(8);
        return super.z().b().b(y63Var.a()).a();
    }
}
