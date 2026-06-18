package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rd1 implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ rd1(int i) {
        this.a = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        double dZ;
        int i = this.a;
        double d = 98.0d;
        ykb ykbVar = ykb.e;
        ykb ykbVar2 = ykb.b;
        ykb ykbVar3 = ykb.d;
        ykb ykbVar4 = ykb.c;
        f73 f73Var = f73.c;
        switch (i) {
            case 0:
                g73 g73Var = (g73) obj;
                g73Var.getClass();
                sza szaVar = g73Var.g;
                boolean z = g73Var.c;
                f73 f73Var2 = g73Var.j;
                ykb ykbVar5 = g73Var.b;
                if (f73Var2 == f73.d) {
                    dZ = ykbVar5 == ykbVar4 ? lr3.z(szaVar, 0.0d, 90.0d) : lr3.z(szaVar, 0.0d, 100.0d);
                } else if (ykbVar5 == ykbVar || ykbVar5 == ykbVar3) {
                    dZ = lr3.z(szaVar, 0.0d, szaVar.c.a() ? 88 : z ? 98 : 100);
                } else {
                    dZ = z ? lr3.z(szaVar, 0.0d, 98.0d) : lr3.z(szaVar, 0.0d, 100.0d);
                }
                return Double.valueOf(dZ);
            case 1:
                g73 g73Var2 = (g73) obj;
                g73Var2.getClass();
                return g73Var2.j == f73Var ? lr3.m(4.5d) : lr3.m(7.0d);
            case 2:
                g73 g73Var3 = (g73) obj;
                g73Var3.getClass();
                return g73Var3.f;
            case 3:
                g73 g73Var4 = (g73) obj;
                g73Var4.getClass();
                return g73Var4.e;
            case 4:
                ((g73) obj).getClass();
                return lr3.m(7.0d);
            case 5:
                g73 g73Var5 = (g73) obj;
                g73Var5.getClass();
                return g73Var5.f;
            case 6:
                g73 g73Var6 = (g73) obj;
                g73Var6.getClass();
                if (g73Var6.j != f73Var || g73Var6.d <= 0.0d) {
                    return null;
                }
                return lr3.m(1.5d);
            case 7:
                g73 g73Var7 = (g73) obj;
                g73Var7.getClass();
                return g73Var7.k;
            case 8:
                wd1 wd1Var = ah1.i0;
                g73 g73Var8 = (g73) obj;
                g73Var8.getClass();
                return g73Var8.j == f73Var ? wd1Var.b() : wd1Var.C();
            case 9:
                g73 g73Var9 = (g73) obj;
                g73Var9.getClass();
                return g73Var9.j == f73Var ? lr3.m(6.0d) : lr3.m(7.0d);
            case 10:
                g73 g73Var10 = (g73) obj;
                g73Var10.getClass();
                return g73Var10.h;
            case 11:
                g73 g73Var11 = (g73) obj;
                g73Var11.getClass();
                return g73Var11.f;
            case 12:
                g73 g73Var12 = (g73) obj;
                g73Var12.getClass();
                if (g73Var12.j != f73Var) {
                    return Double.valueOf(1.0d);
                }
                ykb ykbVar6 = g73Var12.b;
                return Double.valueOf(ykbVar6 == ykbVar2 ? 2.2d : ykbVar6 == ykbVar4 ? 1.7d : ykbVar6 == ykbVar ? g73Var12.h.c.b() ? g73Var12.c ? 3.0d : 2.3d : 1.6d : ykbVar6 == ykbVar3 ? 1.29d : 1.0d);
            case 13:
                wd1 wd1Var2 = ah1.i0;
                g73 g73Var13 = (g73) obj;
                g73Var13.getClass();
                return g73Var13.j == f73Var ? g73Var13.c ? wd1Var2.w() : wd1Var2.x() : wd1Var2.H();
            case 14:
                g73 g73Var14 = (g73) obj;
                g73Var14.getClass();
                return g73Var14.j == f73Var ? lr3.m(1.5d) : lr3.m(3.0d);
            case 15:
                g73 g73Var15 = (g73) obj;
                g73Var15.getClass();
                return g73Var15.h;
            case 16:
                g73 g73Var16 = (g73) obj;
                g73Var16.getClass();
                if (g73Var16.c) {
                    d = 18.0d;
                } else if (g73Var16.h.c.b()) {
                    d = 99.0d;
                } else if (g73Var16.b == ykbVar3) {
                    d = 97.0d;
                }
                return Double.valueOf(d);
            case 17:
                g73 g73Var17 = (g73) obj;
                g73Var17.getClass();
                if (g73Var17.c) {
                    ykb ykbVar7 = g73Var17.b;
                    if (ykbVar7 == ykbVar2) {
                        return Double.valueOf(2.5d);
                    }
                    if (ykbVar7 == ykbVar4) {
                        return Double.valueOf(1.7d);
                    }
                    if (ykbVar7 == ykbVar) {
                        return g73Var17.h.c.b() ? Double.valueOf(2.7d) : Double.valueOf(1.75d);
                    }
                    if (ykbVar7 == ykbVar3) {
                        return Double.valueOf(1.36d);
                    }
                }
                return Double.valueOf(1.0d);
            case 18:
                g73 g73Var18 = (g73) obj;
                g73Var18.getClass();
                return g73Var18.g;
            case 19:
                wd1 wd1Var3 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var3.B();
            case 20:
                ((g73) obj).getClass();
                return lr3.m(4.5d);
            case 21:
                g73 g73Var19 = (g73) obj;
                g73Var19.getClass();
                return g73Var19.f;
            case 22:
                wd1 wd1Var4 = ah1.i0;
                g73 g73Var20 = (g73) obj;
                g73Var20.getClass();
                return g73Var20.j == f73Var ? wd1Var4.s() : wd1Var4.F();
            case 23:
                wd1 wd1Var5 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var5.v();
            case 24:
                ((g73) obj).getClass();
                return lr3.m(7.0d);
            case 25:
                g73 g73Var21 = (g73) obj;
                g73Var21.getClass();
                return g73Var21.f;
            case 26:
                g73 g73Var22 = (g73) obj;
                g73Var22.getClass();
                return Double.valueOf(g73Var22.b == ykbVar2 ? 85.0d : lr3.z(g73Var22.f, 0.0d, 90.0d));
            case 27:
                ((g73) obj).getClass();
                return lr3.m(4.5d);
            case 28:
                g73 g73Var23 = (g73) obj;
                g73Var23.getClass();
                return g73Var23.g;
            default:
                g73 g73Var24 = (g73) obj;
                g73Var24.getClass();
                ykb ykbVar8 = g73Var24.b;
                sza szaVar2 = g73Var24.g;
                return Double.valueOf(ykbVar8 == ykbVar4 ? lr3.z(szaVar2, 0.0d, 90.0d) : lr3.z(szaVar2, 0.0d, 100.0d));
        }
    }
}
