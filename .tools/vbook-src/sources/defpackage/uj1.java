package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uj1 implements zb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ uj1(int i) {
        this.a = i;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zn0 zn0Var = zn0.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                }
                break;
            case 1:
                yb4 yb4Var = (yb4) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.h(yb4Var) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    yb4Var.invoke(dd4Var2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                yb4 yb4Var2 = (yb4) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var3.h(yb4Var2) ? 4 : 2;
                }
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    yb4Var2.invoke(dd4Var3, Integer.valueOf(iIntValue3 & 14));
                } else {
                    dd4Var3.Y();
                }
                break;
            case 3:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    fz1.e(wn9.K((pv9) vt9.b0.getValue(), dd4Var4), gjb.m0(lu6Var, 8.0f, 6.0f), dd4Var4, 48);
                } else {
                    dd4Var4.Y();
                }
                break;
            case 4:
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL = dd4Var5.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var5, ou6VarN0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(ll1.f, dd4Var5, ha6VarD);
                    un9.s(ll1.e, dd4Var5, lr7VarL);
                    un9.s(ll1.g, dd4Var5, Integer.valueOf(iHashCode));
                    un9.r(dd4Var5, ll1.h);
                    un9.s(ll1.d, dd4Var5, ou6VarL0);
                    l16.a(0.0f, 0, 2, ((q96) dd4Var5.j(s96.a)).a.a, dd4Var5, tg9.n(zn0Var.a(lu6Var, bv4.f), 24.0f));
                    dd4Var5.q(true);
                } else {
                    dd4Var5.Y();
                }
                break;
            case 5:
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    nha.c(wn9.K((pv9) zt9.f.getValue(), dd4Var6), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var6, 0, 0, 262142);
                } else {
                    dd4Var6.Y();
                }
                break;
            case 6:
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.c0.getValue(), dd4Var7), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var7, 0, 0, 262142);
                } else {
                    dd4Var7.Y();
                }
                break;
            case 7:
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var8.V(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode2 = Long.hashCode(dd4Var8.T);
                    lr7 lr7VarL2 = dd4Var8.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var8, ou6VarN02);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var8.j0();
                    if (dd4Var8.S) {
                        dd4Var8.k(um1Var2);
                    } else {
                        dd4Var8.s0();
                    }
                    un9.s(ll1.f, dd4Var8, ha6VarD2);
                    un9.s(ll1.e, dd4Var8, lr7VarL2);
                    un9.s(ll1.g, dd4Var8, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var8, ll1.h);
                    un9.s(ll1.d, dd4Var8, ou6VarL02);
                    l16.a(0.0f, 0, 3, 0L, dd4Var8, tg9.n(zn0Var.a(lu6Var, bv4.f), 24.0f));
                    dd4Var8.q(true);
                } else {
                    dd4Var8.Y();
                }
                break;
            case 8:
                ks1 ks1Var = (ks1) obj;
                dd4 dd4Var9 = (dd4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= dd4Var9.f(ks1Var) ? 4 : 2;
                }
                if (dd4Var9.V(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    pn0.a(fe.L(tg9.h(tg9.f(gjb.n0(lu6Var, 0.0f, ys1.g, 1), 1.0f), ys1.f), ks1Var.c, jf0.G), dd4Var9, 0);
                } else {
                    dd4Var9.Y();
                }
                break;
            case 9:
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var10.V(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    nha.c(wn9.K((pv9) mu9.U.getValue(), dd4Var10), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var10, 0, 0, 262142);
                } else {
                    dd4Var10.Y();
                }
                break;
            case 10:
                dd4 dd4Var11 = (dd4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var11.V(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ou6 ou6VarN03 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 20.0f, 1);
                    ha6 ha6VarD3 = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var11.T);
                    lr7 lr7VarL3 = dd4Var11.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var11, ou6VarN03);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var11.j0();
                    if (dd4Var11.S) {
                        dd4Var11.k(um1Var3);
                    } else {
                        dd4Var11.s0();
                    }
                    un9.s(ll1.f, dd4Var11, ha6VarD3);
                    un9.s(ll1.e, dd4Var11, lr7VarL3);
                    un9.s(ll1.g, dd4Var11, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var11, ll1.h);
                    un9.s(ll1.d, dd4Var11, ou6VarL03);
                    l16.a(0.0f, 0, 3, 0L, dd4Var11, tg9.n(zn0Var.a(lu6Var, bv4.f), 28.0f));
                    dd4Var11.q(true);
                } else {
                    dd4Var11.Y();
                }
                break;
            case 11:
                dd4 dd4Var12 = (dd4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var12.V(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    ou6 ou6VarN04 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                    ha6 ha6VarD4 = pn0.d(bv4.b, false);
                    int iHashCode4 = Long.hashCode(dd4Var12.T);
                    lr7 lr7VarL4 = dd4Var12.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var12, ou6VarN04);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var12.j0();
                    if (dd4Var12.S) {
                        dd4Var12.k(um1Var4);
                    } else {
                        dd4Var12.s0();
                    }
                    un9.s(ll1.f, dd4Var12, ha6VarD4);
                    un9.s(ll1.e, dd4Var12, lr7VarL4);
                    un9.s(ll1.g, dd4Var12, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var12, ll1.h);
                    un9.s(ll1.d, dd4Var12, ou6VarL04);
                    l16.a(0.0f, 0, 3, 0L, dd4Var12, tg9.n(zn0Var.a(lu6Var, bv4.f), 24.0f));
                    dd4Var12.q(true);
                } else {
                    dd4Var12.Y();
                }
                break;
            case 12:
                dd4 dd4Var13 = (dd4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var13.V(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.d0.getValue(), dd4Var13), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var13, 0, 0, 262142);
                } else {
                    dd4Var13.Y();
                }
                break;
            case 13:
                dd4 dd4Var14 = (dd4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var14.V(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    ah1.r(tg9.h(tg9.r(lu6Var, 100.0f), 30.0f), null, dd4Var14, 6, 2);
                    un9.a(dd4Var14, tg9.h(lu6Var, 24.0f));
                    dd4Var14.f0(-2143867952);
                    for (int i7 = 0; i7 < 4; i7++) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 16.0f), null, dd4Var14, 6, 2);
                        un9.a(dd4Var14, tg9.h(lu6Var, 4.0f));
                    }
                    dd4Var14.q(false);
                    ah1.r(tg9.h(tg9.r(lu6Var, 50.0f), 16.0f), null, dd4Var14, 6, 2);
                } else {
                    dd4Var14.Y();
                }
                break;
            case 14:
                dd4 dd4Var15 = (dd4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var15.V(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    int i8 = 6;
                    ah1.r(tg9.h(tg9.r(lu6Var, 140.0f), 30.0f), null, dd4Var15, 6, 2);
                    un9.a(dd4Var15, tg9.h(lu6Var, 24.0f));
                    while (i6 < 5) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 16.0f), null, dd4Var15, i8, 2);
                        ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var15, lu6Var, 0.65f), 16.0f), null, dd4Var15, i8, 2);
                        un9.a(dd4Var15, tg9.h(lu6Var, 16.0f));
                        i6++;
                        i8 = 6;
                    }
                } else {
                    dd4Var15.Y();
                }
                break;
            case 15:
                dd4 dd4Var16 = (dd4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var16.V(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    int i9 = 6;
                    ah1.r(tg9.h(tg9.r(lu6Var, 120.0f), 30.0f), null, dd4Var16, 6, 2);
                    ah1.r(tg9.h(xv5.h(lu6Var, 16.0f, dd4Var16, lu6Var, 1.0f), 52.0f), null, dd4Var16, 6, 2);
                    un9.a(dd4Var16, tg9.h(lu6Var, 8.0f));
                    while (i5 < 8) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 20.0f), null, dd4Var16, i9, 2);
                        ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var16, lu6Var, 0.45f), 14.0f), null, dd4Var16, i9, 2);
                        un9.a(dd4Var16, tg9.h(lu6Var, 12.0f));
                        i5++;
                        i9 = 6;
                    }
                } else {
                    dd4Var16.Y();
                }
                break;
            case 16:
                dd4 dd4Var17 = (dd4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var17.V(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ah1.r(tg9.h(tg9.r(lu6Var, 100.0f), 30.0f), null, dd4Var17, 6, 2);
                    un9.a(dd4Var17, tg9.h(lu6Var, 24.0f));
                    for (int i10 = 6; i4 < i10; i10 = 6) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 16.0f), null, dd4Var17, i10, 2);
                        ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var17, lu6Var, 0.75f), 16.0f), null, dd4Var17, i10, 2);
                        un9.a(dd4Var17, tg9.h(lu6Var, 12.0f));
                        i4++;
                    }
                } else {
                    dd4Var17.Y();
                }
                break;
            case 17:
                dd4 dd4Var18 = (dd4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var18.V(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    int i11 = 6;
                    ah1.r(tg9.h(tg9.r(lu6Var, 140.0f), 30.0f), null, dd4Var18, 6, 2);
                    un9.a(dd4Var18, tg9.h(lu6Var, 24.0f));
                    while (i3 < 7) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 16.0f), null, dd4Var18, i11, 2);
                        ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var18, lu6Var, 0.6f), 16.0f), null, dd4Var18, i11, 2);
                        un9.a(dd4Var18, tg9.h(lu6Var, 16.0f));
                        i3++;
                        i11 = 6;
                    }
                } else {
                    dd4Var18.Y();
                }
                break;
            case 18:
                dd4 dd4Var19 = (dd4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var19.V(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    int i12 = 6;
                    ah1.r(tg9.h(tg9.r(lu6Var, 100.0f), 30.0f), null, dd4Var19, 6, 2);
                    ah1.r(tg9.h(xv5.h(lu6Var, 16.0f, dd4Var19, lu6Var, 1.0f), 52.0f), null, dd4Var19, 6, 2);
                    un9.a(dd4Var19, tg9.h(lu6Var, 12.0f));
                    while (i2 < 14) {
                        ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 20.0f), null, dd4Var19, i12, 2);
                        ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var19, lu6Var, 0.6f), 16.0f), null, dd4Var19, i12, 2);
                        un9.a(dd4Var19, tg9.h(lu6Var, 12.0f));
                        i2++;
                        i12 = 6;
                    }
                } else {
                    dd4Var19.Y();
                }
                break;
            case 19:
                dd4 dd4Var20 = (dd4) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var20.V(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    Iterator it = gc1.Z(new x13(72.0f), new x13(56.0f), new x13(108.0f), new x13(84.0f), new x13(64.0f), new x13(132.0f)).iterator();
                    while (it.hasNext()) {
                        ah1.r(tg9.o(gjb.l0(lu6Var, 3.0f), ((x13) it.next()).a, 28.0f), tp8.a, dd4Var20, 0, 0);
                    }
                } else {
                    dd4Var20.Y();
                }
                break;
            case 20:
                dd4 dd4Var21 = (dd4) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var21.V(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    un9.a(dd4Var21, tg9.h(lu6Var, 16.0f));
                } else {
                    dd4Var21.Y();
                }
                break;
            case 21:
                dd4 dd4Var22 = (dd4) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var22.V(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    Iterator it2 = gc1.Z(new x13(84.0f), new x13(68.0f), new x13(96.0f), new x13(74.0f)).iterator();
                    while (it2.hasNext()) {
                        ah1.r(t96.w(tg9.r(tg9.h(lu6Var, 40.0f), ((x13) it2.next()).a), ((q96) dd4Var22.j(s96.a)).c.e), null, dd4Var22, 0, 2);
                    }
                } else {
                    dd4Var22.Y();
                }
                break;
            case 22:
                dd4 dd4Var23 = (dd4) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var23.V(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    nha.c(wn9.K((pv9) mu9.O.getValue(), dd4Var23), gjb.n0(lu6Var, 10.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var23, 48, 0, 262140);
                } else {
                    dd4Var23.Y();
                }
                break;
            case 23:
                dd4 dd4Var24 = (dd4) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var24.V(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    y86.c(0.0f, 6, 2, dd1.g(((q96) dd4Var24.j(s96.a)).a, 1.0f), dd4Var24, gjb.m0(lu6Var, 24.0f, 12.0f));
                } else {
                    dd4Var24.Y();
                }
                break;
            case 24:
                dd4 dd4Var25 = (dd4) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var25.V(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    nha.c(wn9.K((pv9) mu9.t.getValue(), dd4Var25), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var25, 0, 0, 262142);
                } else {
                    dd4Var25.Y();
                }
                break;
            case 25:
                dd4 dd4Var26 = (dd4) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var26.V(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.c0.getValue(), dd4Var26), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var26, 0, 0, 262142);
                } else {
                    dd4Var26.Y();
                }
                break;
            case 26:
                dd4 dd4Var27 = (dd4) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var27.V(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    un9.a(dd4Var27, tg9.h(lu6Var, 12.0f));
                } else {
                    dd4Var27.Y();
                }
                break;
            case 27:
                dd4 dd4Var28 = (dd4) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var28.V(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    nha.c(wn9.K((pv9) zt9.U.getValue(), dd4Var28), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var28, 0, 0, 262142);
                } else {
                    dd4Var28.Y();
                }
                break;
            case 28:
                dd4 dd4Var29 = (dd4) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var29.V(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.c0.getValue(), dd4Var29), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var29, 0, 0, 262142);
                } else {
                    dd4Var29.Y();
                }
                break;
            default:
                dd4 dd4Var30 = (dd4) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var30.V(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    un9.a(dd4Var30, tg9.r(lu6Var, 8.0f));
                } else {
                    dd4Var30.Y();
                }
                break;
        }
        return hebVar;
    }
}
