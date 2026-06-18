package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vd1 implements kb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ vd1(int i) {
        this.a = i;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        double dA;
        double dZ;
        wq1 wq1Var;
        float fFloatValue;
        int i = this.a;
        double d = 3.0d;
        f73 f73Var = f73.d;
        ykb ykbVar = ykb.d;
        ykb ykbVar2 = ykb.b;
        ykb ykbVar3 = ykb.c;
        int i2 = 5;
        ykb ykbVar4 = ykb.e;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        f73 f73Var2 = f73.c;
        switch (i) {
            case 0:
                g73 g73Var = (g73) obj;
                g73Var.getClass();
                return g73Var.h;
            case 1:
                g73 g73Var2 = (g73) obj;
                g73Var2.getClass();
                return Double.valueOf(g73Var2.c ? 98.0d : 4.0d);
            case 2:
                g73 g73Var3 = (g73) obj;
                g73Var3.getClass();
                return g73Var3.h;
            case 3:
                g73 g73Var4 = (g73) obj;
                g73Var4.getClass();
                return Double.valueOf(g73Var4.j == f73Var2 ? g73Var4.c ? 12.0d : g73Var4.h.c.b() ? 94.0d : g73Var4.b == ykbVar ? 90.0d : 92.0d : 25.0d);
            case 4:
                g73 g73Var5 = (g73) obj;
                g73Var5.getClass();
                if (g73Var5.j == f73Var2) {
                    ykb ykbVar5 = g73Var5.b;
                    if (ykbVar5 == ykbVar2) {
                        return Double.valueOf(1.9d);
                    }
                    if (ykbVar5 == ykbVar3) {
                        return Double.valueOf(1.5d);
                    }
                    if (ykbVar5 == ykbVar4) {
                        return g73Var5.h.c.b() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (ykbVar5 == ykbVar) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 5:
                g73 g73Var6 = (g73) obj;
                g73Var6.getClass();
                return g73Var6.f;
            case 6:
                wd1 wd1Var = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var.v();
            case 7:
                ((g73) obj).getClass();
                return lr3.m(4.5d);
            case 8:
                g73 g73Var7 = (g73) obj;
                g73Var7.getClass();
                return g73Var7.k;
            case 9:
                wd1 wd1Var2 = ah1.i0;
                ((g73) obj).getClass();
                return wd1Var2.c();
            case 10:
                g73 g73Var8 = (g73) obj;
                g73Var8.getClass();
                return g73Var8.j == f73Var2 ? lr3.m(4.5d) : lr3.m(7.0d);
            case 11:
                g73 g73Var9 = (g73) obj;
                g73Var9.getClass();
                return g73Var9.f;
            case 12:
                g73 g73Var10 = (g73) obj;
                g73Var10.getClass();
                sza szaVar = g73Var10.f;
                boolean z = g73Var10.c;
                if (g73Var10.j == f73Var) {
                    dA = 30.0d;
                } else {
                    ykb ykbVar6 = g73Var10.b;
                    dA = ykbVar6 == ykbVar ? z ? lr3.A(szaVar, 30.0d, 40.0d) : lr3.z(szaVar, 84.0d, 90.0d) : ykbVar6 == ykbVar4 ? z ? 15.0d : lr3.z(szaVar, 90.0d, 95.0d) : z ? 25.0d : 90.0d;
                }
                return Double.valueOf(dA);
            case 13:
                g73 g73Var11 = (g73) obj;
                g73Var11.getClass();
                return g73Var11.j == f73Var2 ? lr3.m(4.5d) : lr3.m(7.0d);
            case 14:
                g73 g73Var12 = (g73) obj;
                g73Var12.getClass();
                if (g73Var12.j != f73Var2 || g73Var12.d <= 0.0d) {
                    return null;
                }
                return lr3.m(1.5d);
            case 15:
                g73 g73Var13 = (g73) obj;
                g73Var13.getClass();
                return g73Var13.h;
            case 16:
                g73 g73Var14 = (g73) obj;
                g73Var14.getClass();
                if (g73Var14.j != f73Var2) {
                    return Double.valueOf(1.0d);
                }
                ykb ykbVar7 = g73Var14.b;
                if (ykbVar7 == ykbVar2) {
                    d = 2.2d;
                } else if (ykbVar7 == ykbVar3) {
                    d = 1.7d;
                } else if (ykbVar7 != ykbVar4) {
                    d = 1.0d;
                } else if (!g73Var14.h.c.b()) {
                    d = 1.6d;
                } else if (!g73Var14.c) {
                    d = 2.3d;
                }
                return Double.valueOf(d);
            case 17:
                wd1 wd1Var3 = ah1.i0;
                g73 g73Var15 = (g73) obj;
                g73Var15.getClass();
                return g73Var15.j == f73Var2 ? g73Var15.c ? wd1Var3.w() : wd1Var3.x() : wd1Var3.H();
            case 18:
                g73 g73Var16 = (g73) obj;
                g73Var16.getClass();
                return g73Var16.j == f73Var2 ? lr3.m(3.0d) : lr3.m(4.5d);
            case 19:
                g73 g73Var17 = (g73) obj;
                g73Var17.getClass();
                return g73Var17.g;
            case 20:
                g73 g73Var18 = (g73) obj;
                g73Var18.getClass();
                sza szaVar2 = g73Var18.g;
                boolean z2 = g73Var18.c;
                f73 f73Var3 = g73Var18.j;
                ykb ykbVar8 = g73Var18.b;
                if (f73Var3 == f73Var) {
                    dZ = ykbVar8 == ykbVar3 ? lr3.z(szaVar2, 0.0d, 90.0d) : lr3.z(szaVar2, 0.0d, 100.0d);
                } else if (ykbVar8 == ykbVar2) {
                    dZ = z2 ? lr3.z(szaVar2, 0.0d, 93.0d) : lr3.z(szaVar2, 0.0d, 96.0d);
                } else {
                    if (ykbVar8 == ykbVar3) {
                        dZ = lr3.z(szaVar2, 0.0d, z2 ? 93 : 100);
                    } else if (ykbVar8 == ykbVar4) {
                        if (szaVar2.c.a()) {
                            i = 88;
                        } else if (z2) {
                            i = 93;
                        }
                        dZ = lr3.z(szaVar2, 75.0d, i);
                    } else {
                        dZ = z2 ? lr3.z(szaVar2, 0.0d, 93.0d) : lr3.z(szaVar2, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dZ);
            case 21:
                vu6 vu6Var = (vu6) obj;
                vu6Var.getClass();
                xj1 xj1Var = new xj1(29);
                ov9 ov9Var = s16.t;
                a91 a91VarA = ug8.a(ul0.class);
                ck5 ck5Var = ck5.b;
                vu6Var.a(new jt3(new if0(ov9Var, a91VarA, xj1Var, ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(dw2.class), new zg1(0), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(c1b.class), new zg1(1), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(hk8.class), new zg1(2), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(e71.class), new zg1(3), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(phb.class), new zg1(4), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(v41.class), new zg1(i2), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(j7.class), new zg1(6), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(t02.class), new zg1(7), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(e68.class), new xj1(25), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(bc3.class), new xj1(26), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(za3.class), new xj1(27), ck5Var)));
                vu6Var.a(new jt3(new if0(ov9Var, ug8.a(h28.class), new xj1(28), ck5Var)));
                return hebVar;
            case 22:
                View view = ((oub) ((qm1) obj).m0(np4.a)).a;
                while (view != null) {
                    Object tag = view.getTag(2131362480);
                    if (tag != null) {
                        return tag;
                    }
                    Object objS = dk9.s(view);
                    view = objS instanceof View ? (View) objS : null;
                }
                return null;
            case 23:
                ((Integer) obj).getClass();
                return hebVar;
            case 24:
                x91 x91Var = (x91) obj;
                x91Var.getClass();
                yq1 yq1Var = (yq1) x91Var.b;
                mz0 mz0Var = yq1Var.a;
                mz0 mz0Var2 = yq1Var.b;
                xq1 xq1Var = yq1Var.c;
                StringBuilder sb = new StringBuilder();
                Iterator it = ((lz0) mz0Var.values()).iterator();
                while (true) {
                    iz0 iz0Var = (iz0) it;
                    if (!iz0Var.hasNext()) {
                        x91Var.a(zk4.v, new va(xq1Var, sb.toString(), null));
                        x91Var.a(lr3.b, new ar1(xq1Var, x91Var, mz0Var, null));
                        x91Var.a(s00.v, new ti(xq1Var, mz0Var, jt1Var, i2));
                        return hebVar;
                    }
                    wq1Var = (wq1) iz0Var.next();
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(wq1Var.getName());
                    Float f = (Float) mz0Var2.get(wq1Var.getName());
                    if (f != null) {
                        fFloatValue = f.floatValue();
                        double d2 = fFloatValue;
                        if (0.0d <= d2 && d2 <= 1.0d) {
                            sb.append(";q=".concat(bw9.z0(5, String.valueOf(fFloatValue))));
                        }
                    }
                }
                throw new IllegalStateException(("Invalid quality value: " + fFloatValue + " for encoder: " + wq1Var).toString());
            case 25:
                x91 x91Var2 = (x91) obj;
                x91Var2.getClass();
                hr1 hr1Var = (hr1) x91Var2.b;
                ArrayList arrayList = hr1Var.b;
                Set set = hr1Var.a;
                x91Var2.a(s00.y, new jr1(x91Var2, null, arrayList, set));
                x91Var2.a(ra1.F, new kr1(x91Var2, null, arrayList, set));
                return hebVar;
            case 26:
                gr1 gr1Var = (gr1) obj;
                gr1Var.getClass();
                return gr1Var.a.toString();
            case 27:
                uj7 uj7Var = (uj7) obj;
                uj7Var.getClass();
                return uj7Var.a;
            case 28:
                uj7 uj7Var2 = (uj7) obj;
                uj7Var2.getClass();
                return uj7Var2.a;
            default:
                tj7 tj7Var = (tj7) obj;
                tj7Var.getClass();
                return tj7Var.a;
        }
    }
}
