package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ld1 implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ld1(pd1 pd1Var) {
        this.a = 10;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        int i = this.a;
        ykb ykbVar = ykb.a;
        switch (i) {
            case 0:
                g73 g73Var = (g73) obj;
                g73Var.getClass();
                return g73Var.i;
            case 1:
                g73 g73Var2 = (g73) obj;
                g73Var2.getClass();
                return Double.valueOf(g73Var2.c ? 80.0d : 30.0d);
            case 2:
                ((g73) obj).getClass();
                return new ru1(3.0d, 4.5d, 7.0d, 11.0d);
            case 3:
                g73 g73Var3 = (g73) obj;
                g73Var3.getClass();
                return g73Var3.e;
            case 4:
                g73 g73Var4 = (g73) obj;
                g73Var4.getClass();
                return Double.valueOf(g73Var4.c ? 80.0d : 40.0d);
            case 5:
                g73 g73Var5 = (g73) obj;
                g73Var5.getClass();
                return Double.valueOf(g73Var5.b == ykbVar ? 100.0d : 10.0d);
            case 6:
                wd1 wd1Var = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var.r();
            case 7:
                wd1 wd1Var2 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var2.q();
            case 8:
                ((g73) obj).getClass();
                return new ru1(4.5d, 7.0d, 11.0d, 21.0d);
            case 9:
                g73 g73Var6 = (g73) obj;
                g73Var6.getClass();
                return g73Var6.g;
            case 10:
                g73 g73Var7 = (g73) obj;
                g73Var7.getClass();
                boolean z = g73Var7.c;
                if (g73Var7.b == ykbVar) {
                    d = z ? 60.0d : 49.0d;
                } else if (pd1.n(g73Var7)) {
                    sza szaVar = g73Var7.g;
                    d = pu1.e0(bx1.E(szaVar.a, szaVar.b, g73Var7.a.d)).d;
                } else if (!z) {
                    d = 90.0d;
                }
                return Double.valueOf(d);
            case 11:
                ((g73) obj).getClass();
                return new ru1(1.0d, 1.0d, 3.0d, 4.5d);
            case 12:
                ((g73) obj).getClass();
                return new ru1(3.0d, 4.5d, 7.0d, 7.0d);
            case 13:
                g73 g73Var8 = (g73) obj;
                g73Var8.getClass();
                return g73Var8.i;
            case 14:
                g73 g73Var9 = (g73) obj;
                g73Var9.getClass();
                return Double.valueOf(g73Var9.c ? 30.0d : 80.0d);
            case 15:
                ((g73) obj).getClass();
                return Double.valueOf(0.0d);
            case 16:
                ((g73) obj).getClass();
                return new ru1(1.0d, 1.0d, 3.0d, 4.5d);
            case 17:
                g73 g73Var10 = (g73) obj;
                g73Var10.getClass();
                return g73Var10.h;
            case 18:
                g73 g73Var11 = (g73) obj;
                g73Var11.getClass();
                if (g73Var11.c) {
                    double d6 = g73Var11.d;
                    if (d6 <= -1.0d) {
                        d = 4.0d;
                    } else {
                        if (d6 < 0.0d) {
                            double d7 = (d6 - (-1.0d)) / 1.0d;
                            d = (1.0d - d7) * 4.0d;
                            d2 = d7 * 4.0d;
                        } else if (d6 < 0.5d) {
                            double d8 = (d6 - 0.0d) / 0.5d;
                            d = (1.0d - d8) * 4.0d;
                            d2 = d8 * 2.0d;
                        } else if (d6 < 1.0d) {
                            double d9 = (d6 - 0.5d) / 0.5d;
                            d = (1.0d - d9) * 2.0d;
                            d2 = d9 * 0.0d;
                        } else {
                            d = 0.0d;
                        }
                        d = d2 + d;
                    }
                }
                return Double.valueOf(d);
            case 19:
                g73 g73Var12 = (g73) obj;
                g73Var12.getClass();
                return g73Var12.h;
            case 20:
                g73 g73Var13 = (g73) obj;
                g73Var13.getClass();
                if (g73Var13.c) {
                    d3 = 6.0d;
                } else {
                    double d10 = g73Var13.d;
                    if (d10 <= -1.0d) {
                        d3 = 87.0d;
                    } else {
                        if (d10 < 0.0d) {
                            double d11 = (d10 - (-1.0d)) / 1.0d;
                            d4 = (1.0d - d11) * 87.0d;
                            d5 = d11 * 87.0d;
                        } else if (d10 < 0.5d) {
                            double d12 = (d10 - 0.0d) / 0.5d;
                            d4 = (1.0d - d12) * 87.0d;
                            d5 = d12 * 80.0d;
                        } else if (d10 < 1.0d) {
                            double d13 = (d10 - 0.5d) / 0.5d;
                            d4 = (1.0d - d13) * 80.0d;
                            d5 = d13 * 75.0d;
                        } else {
                            d3 = 75.0d;
                        }
                        d3 = d5 + d4;
                    }
                }
                return Double.valueOf(d3);
            case 21:
                g73 g73Var14 = (g73) obj;
                g73Var14.getClass();
                return g73Var14.k;
            case 22:
                g73 g73Var15 = (g73) obj;
                g73Var15.getClass();
                return Double.valueOf(g73Var15.c ? 80.0d : 40.0d);
            case 23:
                ((g73) obj).getClass();
                return new ru1(3.0d, 4.5d, 7.0d, 7.0d);
            case 24:
                g73 g73Var16 = (g73) obj;
                g73Var16.getClass();
                return g73Var16.f;
            case 25:
                g73 g73Var17 = (g73) obj;
                g73Var17.getClass();
                return g73Var17.h;
            case 26:
                ((g73) obj).getClass();
                return Double.valueOf(10.0d);
            case 27:
                wd1 wd1Var3 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var3.v();
            case 28:
                wd1 wd1Var4 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var4.u();
            default:
                ((g73) obj).getClass();
                return new ru1(4.5d, 7.0d, 11.0d, 21.0d);
        }
    }

    public /* synthetic */ ld1(int i) {
        this.a = i;
    }
}
