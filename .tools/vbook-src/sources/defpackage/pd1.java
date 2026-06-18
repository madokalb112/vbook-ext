package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class pd1 {
    public static boolean n(g73 g73Var) {
        ykb ykbVar = g73Var.b;
        return ykbVar == ykb.f || ykbVar == ykb.s;
    }

    public z63 A() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_fixed";
        y63Var.b = new g41(20);
        y63Var.c = new g41(21);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 23);
        y63Var.h = new g41(22);
        y63Var.i = new jd1(this, 1);
        return y63Var.a();
    }

    public z63 B() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_fixed_dim";
        y63Var.b = new g41(6);
        y63Var.c = new g41(7);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 24);
        y63Var.h = new g41(8);
        y63Var.i = new jd1(this, 0);
        return y63Var.a();
    }

    public z63 a() {
        y63 y63Var = new y63();
        y63Var.a = "background";
        y63Var.b = new ld1(25);
        y63Var.c = new md1(6);
        y63Var.d = true;
        return y63Var.a();
    }

    public z63 b() {
        y63 y63Var = new y63();
        y63Var.a = "error";
        y63Var.b = new ld1(21);
        y63Var.c = new ld1(22);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 7);
        y63Var.h = new ld1(23);
        y63Var.i = new jd1(this, 7);
        return y63Var.a();
    }

    public z63 c() {
        y63 y63Var = new y63();
        y63Var.a = "error_container";
        y63Var.b = new md1(8);
        int i = 9;
        y63Var.c = new md1(i);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 8);
        y63Var.h = new md1(10);
        y63Var.i = new jd1(this, i);
        return y63Var.a();
    }

    public sza d(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        f73Var.getClass();
        switch (ykbVar.ordinal()) {
            default:
                mn5.g();
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
        }
    }

    public zj4 e(z63 z63Var, g73 g73Var) {
        g73Var.getClass();
        double dK = k(z63Var, g73Var);
        sza szaVar = (sza) z63Var.b.invoke(g73Var);
        return bx1.E(szaVar.a, szaVar.b, dK);
    }

    public sza f(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        switch (ykbVar.ordinal()) {
            case 0:
                return uj9.p(d2, 0.0d);
            case 1:
                return uj9.p(d2, 2.0d);
            case 2:
                return uj9.p(d2, 6.0d);
            case 3:
                return uj9.p(d2, 10.0d);
            case 4:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return uj9.p(d3, 8.0d);
            case 5:
            case 6:
                return uj9.p(d2, zj4Var.c / 8.0d);
            case 7:
                return uj9.p(d2, 0.0d);
            case 8:
                return uj9.p(d2, 10.0d);
            default:
                mn5.g();
                return null;
        }
    }

    public sza g(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.c;
        double d3 = zj4Var.b;
        f73Var.getClass();
        switch (ykbVar.ordinal()) {
            case 0:
                return uj9.p(d3, 0.0d);
            case 1:
                return uj9.p(d3, 2.0d);
            case 2:
                return uj9.p(d3, 8.0d);
            case 3:
                return uj9.p(d3, 12.0d);
            case 4:
                double d4 = (d3 + 15.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return uj9.p(d4, 12.0d);
            case 5:
                return uj9.p(d3, (d2 / 8.0d) + 4.0d);
            case 6:
                return uj9.p(d3, (d2 / 8.0d) + 4.0d);
            case 7:
                return uj9.p(d3, 0.0d);
            case 8:
                return uj9.p(d3, 16.0d);
            default:
                mn5.g();
                return null;
        }
    }

    public sza h(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        switch (ykbVar.ordinal()) {
            case 0:
                return uj9.p(d2, 0.0d);
            case 1:
                return uj9.p(d2, 12.0d);
            case 2:
                return uj9.p(d2, 36.0d);
            case 3:
                return uj9.p(d2, 200.0d);
            case 4:
                double d3 = (d2 + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return uj9.p(d3, 40.0d);
            case 5:
            case 6:
                return uj9.p(d2, zj4Var.c);
            case 7:
                return uj9.p(d2, 48.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return uj9.p(d4, 48.0d);
            default:
                mn5.g();
                return null;
        }
    }

    public sza i(ykb ykbVar, zj4 zj4Var, boolean z, f73 f73Var, double d) {
        double d2 = zj4Var.b;
        f73Var.getClass();
        switch (ykbVar.ordinal()) {
            case 0:
                return uj9.p(d2, 0.0d);
            case 1:
                return uj9.p(d2, 8.0d);
            case 2:
                return uj9.p(d2, 16.0d);
            case 3:
                return uj9.p(e11.M(zj4Var, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            case 4:
                return uj9.p(e11.M(zj4Var, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 5:
            case 6:
                double d3 = zj4Var.c;
                return uj9.p(d2, Math.max(d3 - 32.0d, d3 * 0.5d));
            case 7:
                return uj9.p(d2, 16.0d);
            case 8:
                double d4 = (d2 - 50.0d) % 360.0d;
                if (d4 < 0.0d) {
                    d4 += 360.0d;
                }
                return uj9.p(d4, 36.0d);
            default:
                mn5.g();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sza j(defpackage.ykb r26, defpackage.zj4 r27, boolean r28, defpackage.f73 r29, double r30) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd1.j(ykb, zj4, boolean, f73, double):sza");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double k(defpackage.z63 r32, defpackage.g73 r33) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd1.k(z63, g73):double");
    }

    public final z63 l(g73 g73Var) {
        g73Var.getClass();
        return g73Var.c ? w() : x();
    }

    public z63 m() {
        y63 y63Var = new y63();
        y63Var.a = "inverse_surface";
        y63Var.b = new nd1(26);
        y63Var.c = new od1(6);
        y63Var.d = true;
        return y63Var.a();
    }

    public z63 o() {
        y63 y63Var = new y63();
        y63Var.a = "primary";
        y63Var.b = new g41(24);
        y63Var.c = new g41(25);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 13);
        y63Var.h = new g41(26);
        y63Var.i = new jd1(this, 2);
        return y63Var.a();
    }

    public z63 p() {
        y63 y63Var = new y63();
        y63Var.a = "primary_container";
        y63Var.b = new g41(13);
        y63Var.c = new g41(this);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 14);
        y63Var.h = new kd1(3);
        y63Var.i = new jd1(this, 4);
        return y63Var.a();
    }

    public z63 q() {
        y63 y63Var = new y63();
        y63Var.a = "primary_fixed";
        y63Var.b = new kd1(1);
        y63Var.c = new kd1(2);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 15);
        y63Var.h = new kd1(4);
        y63Var.i = new jd1(this, 3);
        return y63Var.a();
    }

    public z63 r() {
        y63 y63Var = new y63();
        y63Var.a = "primary_fixed_dim";
        y63Var.b = new nd1(10);
        int i = 11;
        y63Var.c = new nd1(i);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 16);
        y63Var.h = new nd1(12);
        y63Var.i = new jd1(this, i);
        return y63Var.a();
    }

    public z63 s() {
        y63 y63Var = new y63();
        y63Var.a = "secondary";
        y63Var.b = new kd1(23);
        y63Var.c = new ld1(4);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 17);
        y63Var.h = new ld1(12);
        y63Var.i = new jd1(this, 6);
        return y63Var.a();
    }

    public z63 t() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_container";
        y63Var.b = new od1(2);
        y63Var.c = new od1(this);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 18);
        y63Var.h = new od1(4);
        y63Var.i = new jd1(this, 13);
        return y63Var.a();
    }

    public z63 u() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_fixed";
        y63Var.b = new md1(27);
        y63Var.c = new md1(28);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 19);
        y63Var.h = new md1(29);
        y63Var.i = new jd1(this, 10);
        return y63Var.a();
    }

    public z63 v() {
        y63 y63Var = new y63();
        y63Var.a = "secondary_fixed_dim";
        y63Var.b = new nd1(13);
        y63Var.c = new nd1(14);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 20);
        y63Var.h = new nd1(15);
        y63Var.i = new jd1(this, 12);
        return y63Var.a();
    }

    public z63 w() {
        y63 y63Var = new y63();
        y63Var.a = "surface_bright";
        y63Var.b = new kd1(18);
        y63Var.c = new kd1(19);
        y63Var.d = true;
        return y63Var.a();
    }

    public z63 x() {
        y63 y63Var = new y63();
        y63Var.a = "surface_dim";
        y63Var.b = new ld1(19);
        y63Var.c = new ld1(20);
        y63Var.d = true;
        return y63Var.a();
    }

    public z63 y() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary";
        y63Var.b = new md1(4);
        y63Var.c = new md1(5);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 21);
        y63Var.h = new md1(7);
        y63Var.i = new jd1(this, 8);
        return y63Var.a();
    }

    public z63 z() {
        y63 y63Var = new y63();
        y63Var.a = "tertiary_container";
        y63Var.b = new ld1(9);
        y63Var.c = new ld1(this);
        y63Var.d = true;
        y63Var.f = new x(1, this, pd1.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, 22);
        y63Var.h = new ld1(11);
        y63Var.i = new jd1(this, 5);
        return y63Var.a();
    }
}
