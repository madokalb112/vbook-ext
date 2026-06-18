package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kq2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ kq2(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        iv ivVar = pv.a;
        fu6 fu6Var = vl1.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        int i2 = 2;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    xo4 xo4Var = new xo4(bv4.A);
                    boolean zF = dd4Var.f(a07Var);
                    Object objQ = dd4Var.Q();
                    Object obj3 = objQ;
                    if (zF || objQ == fu6Var) {
                        bv1 bv1Var = new bv1(a07Var, 8);
                        dd4Var.p0(bv1Var);
                        obj3 = bv1Var;
                    }
                    ou6 ou6VarN0 = gjb.n0(yn2.V(1, (ib4) obj3, dd4Var, xo4Var, false), 0.0f, 6.0f, 1);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.w, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, eq8VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    String strK = wn9.K((pv9) mu9.k0.getValue(), dd4Var);
                    a84 a84Var = a84.w;
                    ur9 ur9Var = s96.a;
                    nha.c(strK, (ou6) null, ((q96) dd4Var.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, a84Var, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 1572864, 0, 262074);
                    un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
                    mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f).e(new hmb(bv4.x)), ((q96) dd4Var.j(ur9Var)).a.a, dd4Var, 48, 0);
                    dd4Var.q(true);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    Object objQ2 = dd4Var2.Q();
                    Object objF = objQ2;
                    if (objQ2 == fu6Var) {
                        objF = ky0.f(dd4Var2);
                    }
                    z44 z44Var = (z44) objF;
                    Object objQ3 = dd4Var2.Q();
                    Object obj4 = objQ3;
                    if (objQ3 == fu6Var) {
                        tb3 tb3Var = new tb3(z44Var, null, z ? 1 : 0);
                        dd4Var2.p0(tb3Var);
                        obj4 = tb3Var;
                    }
                    lc5.u((yb4) obj4, dd4Var2, z44Var);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL02);
                    String str = (String) a07Var.getValue();
                    uw1 uw1Var = ((q96) dd4Var2.j(s96.a)).c.b;
                    ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                    boolean zF2 = dd4Var2.f(a07Var);
                    Object objQ4 = dd4Var2.Q();
                    Object obj5 = objQ4;
                    if (zF2 || objQ4 == fu6Var) {
                        r02 r02Var = new r02(a07Var, 28);
                        dd4Var2.p0(r02Var);
                        obj5 = r02Var;
                    }
                    lx1.m(str, (kb4) obj5, ou6VarB, false, false, null, s32.j, null, null, null, false, null, null, null, false, 0, 0, uw1Var, null, dd4Var2, 1572864, 0, 6291384);
                    xv5.z(dd4Var2, true, lu6Var, 12.0f, dd4Var2);
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    Object objQ5 = dd4Var3.Q();
                    Object objF2 = objQ5;
                    if (objQ5 == fu6Var) {
                        objF2 = ky0.f(dd4Var3);
                    }
                    z44 z44Var2 = (z44) objF2;
                    String str2 = (String) a07Var.getValue();
                    uw1 uw1Var2 = ((q96) dd4Var3.j(s96.a)).c.b;
                    ou6 ou6VarN02 = gjb.n0(jv3.B(tg9.f(lu6Var, 1.0f), z44Var2), 8.0f, 0.0f, 2);
                    boolean zF3 = dd4Var3.f(a07Var);
                    Object objQ6 = dd4Var3.Q();
                    Object obj6 = objQ6;
                    if (zF3 || objQ6 == fu6Var) {
                        wf3 wf3Var = new wf3(a07Var, 9);
                        dd4Var3.p0(wf3Var);
                        obj6 = wf3Var;
                    }
                    lx1.m(str2, (kb4) obj6, ou6VarN02, false, false, null, null, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var3, 0, 0, 6291448);
                    Object objQ7 = dd4Var3.Q();
                    Object obj7 = objQ7;
                    if (objQ7 == fu6Var) {
                        am3 am3Var = new am3(z44Var2, null, z2 ? 1 : 0);
                        dd4Var3.p0(am3Var);
                        obj7 = am3Var;
                    }
                    lc5.u((yb4) obj7, dd4Var3, hebVar);
                    un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    Object objQ8 = dd4Var4.Q();
                    Object objF3 = objQ8;
                    if (objQ8 == fu6Var) {
                        objF3 = ky0.f(dd4Var4);
                    }
                    z44 z44Var3 = (z44) objF3;
                    Object objQ9 = dd4Var4.Q();
                    Object obj8 = objQ9;
                    if (objQ9 == fu6Var) {
                        tb3 tb3Var2 = new tb3(z44Var3, null, 1);
                        dd4Var4.p0(tb3Var2);
                        obj8 = tb3Var2;
                    }
                    lc5.u((yb4) obj8, dd4Var4, z44Var3);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL3 = dd4Var4.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var4, ou6VarF2);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var3);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(ll1.f, dd4Var4, ha6VarD2);
                    un9.s(ll1.e, dd4Var4, lr7VarL3);
                    un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var4, ll1.h);
                    un9.s(ll1.d, dd4Var4, ou6VarL03);
                    String str3 = (String) a07Var.getValue();
                    uw1 uw1Var3 = ((q96) dd4Var4.j(s96.a)).c.b;
                    ou6 ou6VarB2 = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var3);
                    boolean zF4 = dd4Var4.f(a07Var);
                    Object objQ10 = dd4Var4.Q();
                    Object obj9 = objQ10;
                    if (zF4 || objQ10 == fu6Var) {
                        wf3 wf3Var2 = new wf3(a07Var, 15);
                        dd4Var4.p0(wf3Var2);
                        obj9 = wf3Var2;
                    }
                    lx1.m(str3, (kb4) obj9, ou6VarB2, false, false, null, vm7.g, null, null, null, false, null, null, null, false, 0, 0, uw1Var3, null, dd4Var4, 1572864, 0, 6291384);
                    xv5.z(dd4Var4, true, lu6Var, 12.0f, dd4Var4);
                }
                break;
            case 4:
                uj7 uj7Var = (uj7) obj2;
                uj7Var.getClass();
                a07Var.setValue(uj7Var instanceof j15 ? (j15) uj7Var : null);
                break;
            case 5:
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dd4Var5.Y();
                } else {
                    p35 p35VarC = i25.c(((Boolean) a07Var.getValue()).booleanValue() ? (m53) h53.s.getValue() : (m53) h53.r.getValue(), dd4Var5, 0);
                    ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
                    boolean zF5 = dd4Var5.f(a07Var);
                    Object objQ11 = dd4Var5.Q();
                    Object obj10 = objQ11;
                    if (zF5 || objQ11 == fu6Var) {
                        lz4 lz4Var = new lz4(a07Var, 9);
                        dd4Var5.p0(lz4Var);
                        obj10 = lz4Var;
                    }
                    mx4.a(p35VarC, (String) null, fw.J(null, (ib4) obj10, ou6VarN, false, 15), 0L, dd4Var5, 48, 8);
                }
                break;
            case 6:
                dd4 dd4Var6 = (dd4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dd4Var6.Y();
                } else {
                    Object objQ12 = dd4Var6.Q();
                    Object objF4 = objQ12;
                    if (objQ12 == fu6Var) {
                        objF4 = ky0.f(dd4Var6);
                    }
                    z44 z44Var4 = (z44) objF4;
                    Object objQ13 = dd4Var6.Q();
                    Object obj11 = objQ13;
                    if (objQ13 == fu6Var) {
                        tb3 tb3Var3 = new tb3(z44Var4, null, i2);
                        dd4Var6.p0(tb3Var3);
                        obj11 = tb3Var3;
                    }
                    lc5.u((yb4) obj11, dd4Var6, z44Var4);
                    ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD3 = pn0.d(bv4.b, false);
                    int iHashCode4 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL4 = dd4Var6.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var6, ou6VarF3);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var4);
                    } else {
                        dd4Var6.s0();
                    }
                    un9.s(ll1.f, dd4Var6, ha6VarD3);
                    un9.s(ll1.e, dd4Var6, lr7VarL4);
                    un9.s(ll1.g, dd4Var6, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var6, ll1.h);
                    un9.s(ll1.d, dd4Var6, ou6VarL04);
                    wga wgaVar = (wga) a07Var.getValue();
                    uw1 uw1Var4 = ((q96) dd4Var6.j(s96.a)).c.b;
                    ou6 ou6VarB3 = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var4);
                    boolean zF6 = dd4Var6.f(a07Var);
                    Object objQ14 = dd4Var6.Q();
                    Object obj12 = objQ14;
                    if (zF6 || objQ14 == fu6Var) {
                        ci6 ci6Var = new ci6(a07Var, 5);
                        dd4Var6.p0(ci6Var);
                        obj12 = ci6Var;
                    }
                    lx1.l(wgaVar, (kb4) obj12, ou6VarB3, false, null, h67.e, null, null, false, null, null, null, false, 0, 0, uw1Var4, null, dd4Var6, 1572864, 0, 6291384);
                    xv5.z(dd4Var6, true, lu6Var, 12.0f, dd4Var6);
                }
                break;
            case 7:
                dd4 dd4Var7 = (dd4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dd4Var7.Y();
                } else {
                    Object objQ15 = dd4Var7.Q();
                    Object objF5 = objQ15;
                    if (objQ15 == fu6Var) {
                        objF5 = ky0.f(dd4Var7);
                    }
                    z44 z44Var5 = (z44) objF5;
                    ou6 ou6VarF4 = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD4 = pn0.d(bv4.b, false);
                    int iHashCode5 = Long.hashCode(dd4Var7.T);
                    lr7 lr7VarL5 = dd4Var7.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var7, ou6VarF4);
                    ml1.k.getClass();
                    um1 um1Var5 = ll1.b;
                    dd4Var7.j0();
                    if (dd4Var7.S) {
                        dd4Var7.k(um1Var5);
                    } else {
                        dd4Var7.s0();
                    }
                    un9.s(ll1.f, dd4Var7, ha6VarD4);
                    un9.s(ll1.e, dd4Var7, lr7VarL5);
                    un9.s(ll1.g, dd4Var7, Integer.valueOf(iHashCode5));
                    un9.r(dd4Var7, ll1.h);
                    un9.s(ll1.d, dd4Var7, ou6VarL05);
                    String str4 = (String) a07Var.getValue();
                    uw1 uw1Var5 = ((q96) dd4Var7.j(s96.a)).c.b;
                    ou6 ou6VarN03 = gjb.n0(jv3.B(tg9.f(lu6Var, 1.0f), z44Var5), 8.0f, 0.0f, 2);
                    boolean zF7 = dd4Var7.f(a07Var);
                    Object objQ16 = dd4Var7.Q();
                    Object obj13 = objQ16;
                    if (zF7 || objQ16 == fu6Var) {
                        ci6 ci6Var2 = new ci6(a07Var, 9);
                        dd4Var7.p0(ci6Var2);
                        obj13 = ci6Var2;
                    }
                    lx1.m(str4, (kb4) obj13, ou6VarN03, false, false, null, kl8.l, null, null, null, false, null, null, null, false, 0, 0, uw1Var5, null, dd4Var7, 1572864, 0, 6291384);
                    Object objQ17 = dd4Var7.Q();
                    Object obj14 = objQ17;
                    if (objQ17 == fu6Var) {
                        am3 am3Var2 = new am3(z44Var5, null, i2);
                        dd4Var7.p0(am3Var2);
                        obj14 = am3Var2;
                    }
                    lc5.u((yb4) obj14, dd4Var7, hebVar);
                    xv5.z(dd4Var7, true, lu6Var, 12.0f, dd4Var7);
                }
                break;
            case 8:
                dd4 dd4Var8 = (dd4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!dd4Var8.V(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    dd4Var8.Y();
                } else {
                    Object objQ18 = dd4Var8.Q();
                    Object objF6 = objQ18;
                    if (objQ18 == fu6Var) {
                        objF6 = ky0.f(dd4Var8);
                    }
                    z44 z44Var6 = (z44) objF6;
                    ou6 ou6VarF5 = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD5 = pn0.d(bv4.b, false);
                    int iHashCode6 = Long.hashCode(dd4Var8.T);
                    lr7 lr7VarL6 = dd4Var8.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var8, ou6VarF5);
                    ml1.k.getClass();
                    um1 um1Var6 = ll1.b;
                    dd4Var8.j0();
                    if (dd4Var8.S) {
                        dd4Var8.k(um1Var6);
                    } else {
                        dd4Var8.s0();
                    }
                    un9.s(ll1.f, dd4Var8, ha6VarD5);
                    un9.s(ll1.e, dd4Var8, lr7VarL6);
                    un9.s(ll1.g, dd4Var8, Integer.valueOf(iHashCode6));
                    un9.r(dd4Var8, ll1.h);
                    un9.s(ll1.d, dd4Var8, ou6VarL06);
                    String str5 = (String) a07Var.getValue();
                    uw1 uw1Var6 = ((q96) dd4Var8.j(s96.a)).c.b;
                    ou6 ou6VarN04 = gjb.n0(jv3.B(tg9.f(lu6Var, 1.0f), z44Var6), 8.0f, 0.0f, 2);
                    boolean zF8 = dd4Var8.f(a07Var);
                    Object objQ19 = dd4Var8.Q();
                    Object obj15 = objQ19;
                    if (zF8 || objQ19 == fu6Var) {
                        ci6 ci6Var3 = new ci6(a07Var, 20);
                        dd4Var8.p0(ci6Var3);
                        obj15 = ci6Var3;
                    }
                    lx1.m(str5, (kb4) obj15, ou6VarN04, false, false, null, yb0.m, null, null, null, false, null, null, null, false, 0, 4, uw1Var6, null, dd4Var8, 1572864, 805306368, 5767096);
                    Object objQ20 = dd4Var8.Q();
                    Object obj16 = objQ20;
                    if (objQ20 == fu6Var) {
                        am3 am3Var3 = new am3(z44Var6, null, 3);
                        dd4Var8.p0(am3Var3);
                        obj16 = am3Var3;
                    }
                    lc5.u((yb4) obj16, dd4Var8, hebVar);
                    xv5.z(dd4Var8, true, lu6Var, 12.0f, dd4Var8);
                }
                break;
            case 9:
                dd4 dd4Var9 = (dd4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!dd4Var9.V(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    dd4Var9.Y();
                } else {
                    Object objQ21 = dd4Var9.Q();
                    Object obj17 = objQ21;
                    if (objQ21 == fu6Var) {
                        List listZ = gc1.Z(r31.b, r31.c, r31.d, r31.e, r31.f, r31.g, r31.h, r31.i, r31.j, r31.k, r31.l, r31.m, r31.n, r31.o, r31.p, r31.q, r31.r, r31.s);
                        dd4Var9.p0(listZ);
                        obj17 = listZ;
                    }
                    yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(142670309, new ok6((List) obj17, a07Var, z3 ? 1 : 0), dd4Var9), dd4Var9, 1573302);
                }
                break;
            case 10:
                dd4 dd4Var10 = (dd4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!dd4Var10.V(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    dd4Var10.Y();
                } else {
                    Object[] objArr = new Object[0];
                    Object objQ22 = dd4Var10.Q();
                    Object obj18 = objQ22;
                    if (objQ22 == fu6Var) {
                        uj6 uj6Var = new uj6(10);
                        dd4Var10.p0(uj6Var);
                        obj18 = uj6Var;
                    }
                    a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) obj18, dd4Var10, 48);
                    Object objQ23 = dd4Var10.Q();
                    Object objF7 = objQ23;
                    if (objQ23 == fu6Var) {
                        objF7 = ky0.f(dd4Var10);
                    }
                    z44 z44Var7 = (z44) objF7;
                    ou6 ou6VarF6 = tg9.f(lu6Var, 1.0f);
                    ha6 ha6VarD6 = pn0.d(bv4.b, false);
                    int iHashCode7 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL7 = dd4Var10.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var10, ou6VarF6);
                    ml1.k.getClass();
                    um1 um1Var7 = ll1.b;
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var7);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(ll1.f, dd4Var10, ha6VarD6);
                    un9.s(ll1.e, dd4Var10, lr7VarL7);
                    un9.s(ll1.g, dd4Var10, Integer.valueOf(iHashCode7));
                    un9.r(dd4Var10, ll1.h);
                    un9.s(ll1.d, dd4Var10, ou6VarL07);
                    String str6 = (String) a07Var.getValue();
                    qj5 qj5Var = new qj5(7, 7, Token.HOOK);
                    yub wn7Var = ((Boolean) a07Var2.getValue()).booleanValue() ? js8.y : new wn7();
                    uw1 uw1Var7 = ((q96) dd4Var10.j(s96.a)).c.b;
                    ou6 ou6VarN05 = gjb.n0(jv3.B(tg9.f(lu6Var, 1.0f), z44Var7), 8.0f, 0.0f, 2);
                    boolean zF9 = dd4Var10.f(a07Var);
                    Object objQ24 = dd4Var10.Q();
                    Object obj19 = objQ24;
                    if (zF9 || objQ24 == fu6Var) {
                        cl6 cl6Var = new cl6(a07Var, 13);
                        dd4Var10.p0(cl6Var);
                        obj19 = cl6Var;
                    }
                    lx1.m(str6, (kb4) obj19, ou6VarN05, false, false, null, kl8.p, null, kl8.q, jf0.G(805818515, new kq2(a07Var2, 11), dd4Var10), false, wn7Var, qj5Var, null, false, 0, 0, uw1Var7, null, dd4Var10, 907542528, 196608, 6241464);
                    Object objQ25 = dd4Var10.Q();
                    Object obj20 = objQ25;
                    if (objQ25 == fu6Var) {
                        am3 am3Var4 = new am3(z44Var7, null, 4);
                        dd4Var10.p0(am3Var4);
                        obj20 = am3Var4;
                    }
                    lc5.u((yb4) obj20, dd4Var10, hebVar);
                    xv5.z(dd4Var10, true, lu6Var, 12.0f, dd4Var10);
                }
                break;
            case 11:
                dd4 dd4Var11 = (dd4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!dd4Var11.V(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    dd4Var11.Y();
                } else {
                    p35 p35VarC2 = i25.c(((Boolean) a07Var.getValue()).booleanValue() ? (m53) h53.s.getValue() : (m53) h53.r.getValue(), dd4Var11, 0);
                    ou6 ou6VarN2 = tg9.n(lu6Var, 24.0f);
                    boolean zF10 = dd4Var11.f(a07Var);
                    Object objQ26 = dd4Var11.Q();
                    Object obj21 = objQ26;
                    if (zF10 || objQ26 == fu6Var) {
                        lz4 lz4Var2 = new lz4(a07Var, 22);
                        dd4Var11.p0(lz4Var2);
                        obj21 = lz4Var2;
                    }
                    mx4.a(p35VarC2, (String) null, fw.J(null, (ib4) obj21, ou6VarN2, false, 15), 0L, dd4Var11, 48, 8);
                }
                break;
            case 12:
                dd4 dd4Var12 = (dd4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!dd4Var12.V(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    dd4Var12.Y();
                } else {
                    String strL = wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (((Number) a07Var.getValue()).floatValue() * 100.0f))}, dd4Var12);
                    ur9 ur9Var2 = s96.a;
                    nha.c(strL, (ou6) null, ((q96) dd4Var12.j(ur9Var2)).a.b, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var12.j(ur9Var2)).b.k, dd4Var12, 0, 0, 131066);
                }
                break;
            case 13:
                dd4 dd4Var13 = (dd4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!dd4Var13.V(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    dd4Var13.Y();
                } else {
                    p35 p35VarC3 = i25.c(((Boolean) a07Var.getValue()).booleanValue() ? (m53) h53.s.getValue() : (m53) h53.r.getValue(), dd4Var13, 0);
                    ou6 ou6VarN3 = tg9.n(lu6Var, 24.0f);
                    boolean zF11 = dd4Var13.f(a07Var);
                    Object objQ27 = dd4Var13.Q();
                    Object obj22 = objQ27;
                    if (zF11 || objQ27 == fu6Var) {
                        vb9 vb9Var = new vb9(a07Var, 2);
                        dd4Var13.p0(vb9Var);
                        obj22 = vb9Var;
                    }
                    mx4.a(p35VarC3, (String) null, fw.J(null, (ib4) obj22, ou6VarN3, false, 15), 0L, dd4Var13, 48, 8);
                }
                break;
            case 14:
                dd4 dd4Var14 = (dd4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!dd4Var14.V(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    dd4Var14.Y();
                } else {
                    boolean zF12 = dd4Var14.f(a07Var);
                    Object objQ28 = dd4Var14.Q();
                    Object obj23 = objQ28;
                    if (zF12 || objQ28 == fu6Var) {
                        vb9 vb9Var2 = new vb9(a07Var, 3);
                        dd4Var14.p0(vb9Var2);
                        obj23 = vb9Var2;
                    }
                    ou6 ou6VarP0 = gjb.p0(yn2.V(1, (ib4) obj23, dd4Var14, lu6Var, false), 0.0f, 6.0f, 0.0f, 0.0f, 13);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var14, 0);
                    int iHashCode8 = Long.hashCode(dd4Var14.T);
                    lr7 lr7VarL8 = dd4Var14.l();
                    ou6 ou6VarL08 = s32.L0(dd4Var14, ou6VarP0);
                    ml1.k.getClass();
                    um1 um1Var8 = ll1.b;
                    dd4Var14.j0();
                    if (dd4Var14.S) {
                        dd4Var14.k(um1Var8);
                    } else {
                        dd4Var14.s0();
                    }
                    un9.s(ll1.f, dd4Var14, eq8VarA2);
                    un9.s(ll1.e, dd4Var14, lr7VarL8);
                    un9.s(ll1.g, dd4Var14, Integer.valueOf(iHashCode8));
                    un9.r(dd4Var14, ll1.h);
                    un9.s(ll1.d, dd4Var14, ou6VarL08);
                    nha.c(wn9.K((pv9) mu9.k0.getValue(), dd4Var14), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var14.j(s96.a)).b.l, dd4Var14, 0, 0, 131070);
                    un9.a(dd4Var14, tg9.r(lu6Var, 4.0f));
                    mx4.a(i25.c((m53) f53.s.getValue(), dd4Var14, 0), (String) null, tg9.n(lu6Var, 20.0f).e(new hmb(bv4.x)), 0L, dd4Var14, 48, 8);
                    dd4Var14.q(true);
                }
                break;
            default:
                dd4 dd4Var15 = (dd4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!dd4Var15.V(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    dd4Var15.Y();
                } else {
                    p35 p35VarC4 = i25.c(((Boolean) a07Var.getValue()).booleanValue() ? (m53) h53.s.getValue() : (m53) h53.r.getValue(), dd4Var15, 0);
                    ou6 ou6VarN4 = tg9.n(lu6Var, 24.0f);
                    boolean zF13 = dd4Var15.f(a07Var);
                    Object objQ29 = dd4Var15.Q();
                    Object obj24 = objQ29;
                    if (zF13 || objQ29 == fu6Var) {
                        gpa gpaVar = new gpa(a07Var, 24);
                        dd4Var15.p0(gpaVar);
                        obj24 = gpaVar;
                    }
                    mx4.a(p35VarC4, (String) null, fw.J(null, (ib4) obj24, ou6VarN4, false, 15), 0L, dd4Var15, 48, 8);
                }
                break;
        }
        return hebVar;
    }
}
