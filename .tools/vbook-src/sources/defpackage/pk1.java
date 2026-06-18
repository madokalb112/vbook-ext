package defpackage;

import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pk1 implements zb4 {
    public final /* synthetic */ int a;

    public /* synthetic */ pk1(int i) {
        this.a = i;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        iv ivVar = pv.a;
        zn0 zn0Var = zn0.a;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.c0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262142);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nha.c(wn9.K((pv9) zt9.C0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 0, 0, 262142);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nha.c(wn9.K((pv9) vt9.c0.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var3, 0, 0, 262142);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 3:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    wn9.f(tg9.f(gjb.n0(lu6Var, 16.0f, 0.0f, 2), 1.0f), dd4Var4, 6);
                } else {
                    dd4Var4.Y();
                }
                return hebVar;
            case 4:
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String strK = wn9.K((pv9) zu9.E.getValue(), dd4Var5);
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2);
                    ur9 ur9Var = s96.a;
                    nha.c(strK, gjb.p0(fe.L(t96.w(ou6VarN0, uw1.d(((q96) dd4Var5.j(ur9Var)).c.d, new y13(0.0f), new y13(0.0f), (ax1) null, (ax1) null, 12)), dd1.g(((q96) dd4Var5.j(ur9Var)).a, 2.0f), jf0.G), 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var5, 0, 0, 261116);
                } else {
                    dd4Var5.Y();
                }
                return hebVar;
            case 5:
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL = dd4Var6.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var6, ou6VarN02);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var);
                    } else {
                        dd4Var6.s0();
                    }
                    un9.s(ll1.f, dd4Var6, ha6VarD);
                    un9.s(ll1.e, dd4Var6, lr7VarL);
                    un9.s(ll1.g, dd4Var6, Integer.valueOf(iHashCode));
                    un9.r(dd4Var6, ll1.h);
                    un9.s(ll1.d, dd4Var6, ou6VarL0);
                    sdc.y(tg9.n(gjb.n0(zn0Var.a(lu6Var, bv4.f), 0.0f, 12.0f, 1), 32.0f), 0L, null, dd4Var6, 0, 6);
                    dd4Var6.q(true);
                } else {
                    dd4Var6.Y();
                }
                return hebVar;
            case 6:
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var7.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    dd4Var7.Y();
                }
                return hebVar;
            case 7:
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var8.V(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    dd4Var8.Y();
                }
                return hebVar;
            case 8:
                dd4 dd4Var9 = (dd4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var9.V(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    dd4Var9.Y();
                }
                return hebVar;
            case 9:
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var10.V(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarL02 = gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var10.j(ur9Var2)).c.d), dd1.g(((q96) dd4Var10.j(ur9Var2)).a, 2.0f), jf0.G), 12.0f);
                    vf0 vf0Var = bv4.z;
                    jv jvVar = pv.c;
                    ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var10, 0);
                    int iHashCode2 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL2 = dd4Var10.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var10, ou6VarL02);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var2);
                    } else {
                        dd4Var10.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var10, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var10, lr7VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var10, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var10, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var10, ou6VarL03);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var10, 48);
                    int iHashCode3 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL3 = dd4Var10.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var10, lu6Var);
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var2);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(jmVar, dd4Var10, eq8VarA);
                    un9.s(jmVar2, dd4Var10, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var10, jmVar3, dd4Var10, kdVar);
                    un9.s(jmVar4, dd4Var10, ou6VarL04);
                    ah1.q(null, t96.w(tg9.n(lu6Var, 38.0f), tp8.a), dd4Var10, 0, 1);
                    un9.a(dd4Var10, tg9.r(lu6Var, 10.0f));
                    ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var10, 0);
                    int iHashCode4 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL4 = dd4Var10.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var10, lu6Var);
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var2);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(jmVar, dd4Var10, ie1VarA2);
                    un9.s(jmVar2, dd4Var10, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var10, jmVar3, dd4Var10, kdVar);
                    un9.s(jmVar4, dd4Var10, ou6VarL05);
                    ah1.r(tg9.h(tg9.r(lu6Var, 110.0f), 18.0f), null, dd4Var10, 6, 2);
                    un9.a(dd4Var10, tg9.h(lu6Var, 6.0f));
                    ah1.r(tg9.h(tg9.r(lu6Var, 56.0f), 12.0f), null, dd4Var10, 6, 2);
                    un9.a(dd4Var10, xv5.g(dd4Var10, true, true, lu6Var, 16.0f));
                    ah1.r(tg9.h(tg9.f(lu6Var, 0.82f), 24.0f), null, dd4Var10, 6, 2);
                    un9.a(dd4Var10, tg9.h(lu6Var, 10.0f));
                    dd4Var10.f0(-1358152532);
                    int i2 = 0;
                    while (i2 < 4) {
                        ah1.r(tg9.h(tg9.f(lu6Var, i2 == 3 ? 0.68f : 1.0f), 12.0f), null, dd4Var10, 0, 2);
                        un9.a(dd4Var10, tg9.h(lu6Var, 6.0f));
                        i2++;
                    }
                    dd4Var10.q(false);
                    un9.a(dd4Var10, tg9.h(lu6Var, 8.0f));
                    eq8 eq8VarA2 = dq8.a(new mv(8.0f, true, new gp(5)), bv4.w, dd4Var10, 6);
                    int iHashCode5 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL5 = dd4Var10.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var10, lu6Var);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var3);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(ll1.f, dd4Var10, eq8VarA2);
                    un9.s(ll1.e, dd4Var10, lr7VarL5);
                    un9.s(ll1.g, dd4Var10, Integer.valueOf(iHashCode5));
                    un9.r(dd4Var10, ll1.h);
                    un9.s(ll1.d, dd4Var10, ou6VarL06);
                    rp8 rp8Var = tp8.a;
                    ah1.r(tg9.h(tg9.r(lu6Var, 74.0f), 36.0f), rp8Var, dd4Var10, 6, 0);
                    ah1.r(tg9.h(tg9.r(lu6Var, 112.0f), 20.0f), rp8Var, dd4Var10, 6, 0);
                    dd4Var10.q(true);
                    dd4Var10.q(true);
                } else {
                    dd4Var10.Y();
                }
                return hebVar;
            case 10:
                dd4 dd4Var11 = (dd4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var11.V(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var3 = s96.a;
                    ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6VarF2, ((q96) dd4Var11.j(ur9Var3)).c.d), dd1.g(((q96) dd4Var11.j(ur9Var3)).a, 2.0f), jf0.G), 12.0f, 9.0f);
                    eq8 eq8VarA3 = dq8.a(ivVar, bv4.x, dd4Var11, 48);
                    int iHashCode6 = Long.hashCode(dd4Var11.T);
                    lr7 lr7VarL6 = dd4Var11.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var11, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var11.j0();
                    if (dd4Var11.S) {
                        dd4Var11.k(um1Var4);
                    } else {
                        dd4Var11.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var11, eq8VarA3);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var11, lr7VarL6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var11, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var11, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var11, ou6VarL07);
                    eq8 eq8VarA4 = dq8.a(new mv(-10.0f, true, new gp(5)), bv4.w, dd4Var11, 6);
                    int iHashCode7 = Long.hashCode(dd4Var11.T);
                    lr7 lr7VarL7 = dd4Var11.l();
                    ou6 ou6VarL08 = s32.L0(dd4Var11, lu6Var);
                    dd4Var11.j0();
                    if (dd4Var11.S) {
                        dd4Var11.k(um1Var4);
                    } else {
                        dd4Var11.s0();
                    }
                    un9.s(jmVar5, dd4Var11, eq8VarA4);
                    un9.s(jmVar6, dd4Var11, lr7VarL7);
                    ky0.v(iHashCode7, dd4Var11, jmVar7, dd4Var11, kdVar2);
                    un9.s(jmVar8, dd4Var11, ou6VarL08);
                    dd4Var11.f0(-818963706);
                    for (int i3 = 0; i3 < 3; i3++) {
                        ah1.q(null, t96.w(tg9.n(lu6Var, 28.0f), tp8.a), dd4Var11, 0, 1);
                    }
                    dd4Var11.q(false);
                    dd4Var11.q(true);
                    un9.a(dd4Var11, tg9.r(lu6Var, 12.0f));
                    ah1.r(tg9.h(tg9.r(lu6Var, 84.0f), 14.0f), null, dd4Var11, 6, 2);
                    un9.a(dd4Var11, tg9.r(lu6Var, 10.0f));
                    ah1.r(tg9.h(tg9.r(lu6Var, 94.0f), 14.0f), null, dd4Var11, 6, 2);
                    un9.a(dd4Var11, new bp5(1.0f, true));
                    ah1.r(tg9.h(tg9.r(lu6Var, 72.0f), 30.0f), tp8.a, dd4Var11, 6, 0);
                    dd4Var11.q(true);
                } else {
                    dd4Var11.Y();
                }
                return hebVar;
            case 11:
                dd4 dd4Var12 = (dd4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var12.V(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    p35 p35VarC = i25.c((m53) f53.J.getValue(), dd4Var12, 0);
                    Object objQ = dd4Var12.Q();
                    if (objQ == vl1.a) {
                        objQ = new dh1(1);
                        dd4Var12.p0(objQ);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var12, 3072, 6);
                } else {
                    dd4Var12.Y();
                }
                return hebVar;
            case 12:
                dd4 dd4Var13 = (dd4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var13.V(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    ou6 ou6VarN03 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 8.0f, 1);
                    xf0 xf0Var = bv4.f;
                    ha6 ha6VarD2 = pn0.d(xf0Var, false);
                    int iHashCode8 = Long.hashCode(dd4Var13.T);
                    lr7 lr7VarL8 = dd4Var13.l();
                    ou6 ou6VarL09 = s32.L0(dd4Var13, ou6VarN03);
                    ml1.k.getClass();
                    um1 um1Var5 = ll1.b;
                    dd4Var13.j0();
                    if (dd4Var13.S) {
                        dd4Var13.k(um1Var5);
                    } else {
                        dd4Var13.s0();
                    }
                    un9.s(ll1.f, dd4Var13, ha6VarD2);
                    un9.s(ll1.e, dd4Var13, lr7VarL8);
                    un9.s(ll1.g, dd4Var13, Integer.valueOf(iHashCode8));
                    un9.r(dd4Var13, ll1.h);
                    un9.s(ll1.d, dd4Var13, ou6VarL09);
                    sdc.y(zn0Var.a(tg9.n(lu6Var, 24.0f), xf0Var), ((q96) dd4Var13.j(s96.a)).a.b, null, dd4Var13, 0, 4);
                    dd4Var13.q(true);
                } else {
                    dd4Var13.Y();
                }
                return hebVar;
            case 13:
                dd4 dd4Var14 = (dd4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var14.V(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var14, 0);
                    ur9 ur9Var4 = s96.a;
                    mx4.a(p35VarC2, (String) null, tg9.n(lu6Var, 20.0f), ((q96) dd4Var14.j(ur9Var4)).a.w, dd4Var14, 432, 0);
                    un9.a(dd4Var14, tg9.n(lu6Var, 8.0f));
                    nha.c(wn9.K((pv9) zt9.b0.getValue(), dd4Var14), (ou6) null, ((q96) dd4Var14.j(ur9Var4)).a.w, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var14, 0, 0, 262138);
                } else {
                    dd4Var14.Y();
                }
                return hebVar;
            case 14:
                dd4 dd4Var15 = (dd4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var15.V(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    dd4Var15.Y();
                }
                return hebVar;
            case 15:
                dd4 dd4Var16 = (dd4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (dd4Var16.V(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    ou6 ou6VarN04 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                    ha6 ha6VarD3 = pn0.d(bv4.b, false);
                    int iHashCode9 = Long.hashCode(dd4Var16.T);
                    lr7 lr7VarL9 = dd4Var16.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var16, ou6VarN04);
                    ml1.k.getClass();
                    um1 um1Var6 = ll1.b;
                    dd4Var16.j0();
                    if (dd4Var16.S) {
                        dd4Var16.k(um1Var6);
                    } else {
                        dd4Var16.s0();
                    }
                    un9.s(ll1.f, dd4Var16, ha6VarD3);
                    un9.s(ll1.e, dd4Var16, lr7VarL9);
                    un9.s(ll1.g, dd4Var16, Integer.valueOf(iHashCode9));
                    un9.r(dd4Var16, ll1.h);
                    un9.s(ll1.d, dd4Var16, ou6VarL010);
                    l16.a(0.0f, 0, 3, 0L, dd4Var16, tg9.n(gjb.n0(zn0Var.a(lu6Var, bv4.f), 0.0f, 12.0f, 1), 24.0f));
                    dd4Var16.q(true);
                } else {
                    dd4Var16.Y();
                }
                return hebVar;
            case 16:
                dd4 dd4Var17 = (dd4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ii9) obj).getClass();
                if (dd4Var17.V(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    ou6 ou6VarN = tg9.n(lu6Var, 16.0f);
                    ha6 ha6VarD4 = pn0.d(bv4.f, false);
                    int iHashCode10 = Long.hashCode(dd4Var17.T);
                    lr7 lr7VarL10 = dd4Var17.l();
                    ou6 ou6VarL011 = s32.L0(dd4Var17, ou6VarN);
                    ml1.k.getClass();
                    um1 um1Var7 = ll1.b;
                    dd4Var17.j0();
                    if (dd4Var17.S) {
                        dd4Var17.k(um1Var7);
                    } else {
                        dd4Var17.s0();
                    }
                    un9.s(ll1.f, dd4Var17, ha6VarD4);
                    un9.s(ll1.e, dd4Var17, lr7VarL10);
                    un9.s(ll1.g, dd4Var17, Integer.valueOf(iHashCode10));
                    un9.r(dd4Var17, ll1.h);
                    un9.s(ll1.d, dd4Var17, ou6VarL011);
                    un9.a(dd4Var17, fe.L(tg9.n(lu6Var, 12.0f), ((q96) dd4Var17.j(s96.a)).a.q, tp8.a));
                    dd4Var17.q(true);
                } else {
                    dd4Var17.Y();
                }
                return hebVar;
            case 17:
                dd4 dd4Var18 = (dd4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var18.V(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    dd4Var18.Y();
                }
                return hebVar;
            case 18:
                dd4 dd4Var19 = (dd4) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var19.V(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    dd4Var19.Y();
                }
                return hebVar;
            case 19:
                ou6 ou6Var = (ou6) obj;
                dd4 dd4Var20 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ou6Var.getClass();
                dd4Var20.f0(125481379);
                ou6 ou6VarL = fe.L(ou6Var, lc1.c(0.2f, ((q96) dd4Var20.j(s96.a)).a.a), jf0.G);
                dd4Var20.q(false);
                return ou6VarL;
            case 20:
                Throwable th = (Throwable) obj3;
                ((ov4) obj).getClass();
                ((xu4) obj2).getClass();
                th.getClass();
                j00 j00Var = dv4.a;
                Throwable thN0 = ny1.n0(th);
                return Boolean.valueOf(((thN0 instanceof ev4) || (thN0 instanceof yn1) || (thN0 instanceof SocketTimeoutException) || (th instanceof CancellationException)) ? false : true);
            case 21:
                gv4 gv4Var = (gv4) obj3;
                ((ov4) obj).getClass();
                ((wu4) obj2).getClass();
                gv4Var.getClass();
                int i4 = gv4Var.e().a;
                return Boolean.valueOf(500 <= i4 && i4 < 600);
            case 22:
                float fFloatValue = ((Float) obj).floatValue();
                dd4 dd4Var21 = (dd4) obj2;
                ((Integer) obj3).intValue();
                dd4Var21.f0(-1824032304);
                String strI = tn9.i("%d", new Object[]{Integer.valueOf((int) fFloatValue)});
                dd4Var21.q(false);
                return strI;
            case 23:
                float fFloatValue2 = ((Float) obj).floatValue();
                dd4 dd4Var22 = (dd4) obj2;
                ((Integer) obj3).intValue();
                dd4Var22.f0(2013276167);
                String strI2 = tn9.i("%d", new Object[]{Integer.valueOf((int) fFloatValue2)});
                dd4Var22.q(false);
                return strI2;
            case 24:
                float fFloatValue3 = ((Float) obj).floatValue();
                dd4 dd4Var23 = (dd4) obj2;
                ((Integer) obj3).intValue();
                dd4Var23.f0(-996628600);
                String strI3 = tn9.i("%d", new Object[]{Integer.valueOf((int) fFloatValue3)});
                dd4Var23.q(false);
                return strI3;
            case 25:
                float fFloatValue4 = ((Float) obj).floatValue();
                dd4 dd4Var24 = (dd4) obj2;
                ((Integer) obj3).intValue();
                dd4Var24.f0(288433929);
                String strI4 = tn9.i("%d", new Object[]{Integer.valueOf((int) fFloatValue4)});
                dd4Var24.q(false);
                return strI4;
            case 26:
                float fFloatValue5 = ((Float) obj).floatValue();
                dd4 dd4Var25 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var25.f0(-619125104);
                String strL = wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (fFloatValue5 * 100.0f))}, dd4Var25);
                dd4Var25.q(false);
                return strL;
            case 27:
                float fFloatValue6 = ((Float) obj).floatValue();
                dd4 dd4Var26 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var26.f0(1523722873);
                String strL2 = wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (fFloatValue6 * 100.0f))}, dd4Var26);
                dd4Var26.q(false);
                return strL2;
            case 28:
                float fFloatValue7 = ((Float) obj).floatValue();
                dd4 dd4Var27 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var27.f0(635685336);
                String strL3 = wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (fFloatValue7 * 100.0f))}, dd4Var27);
                dd4Var27.q(false);
                return strL3;
            default:
                Float f = (Float) obj;
                f.floatValue();
                dd4 dd4Var28 = (dd4) obj2;
                ((Integer) obj3).intValue();
                dd4Var28.f0(-1525897854);
                String strI5 = tn9.i("%.1f", new Object[]{f});
                dd4Var28.q(false);
                return strI5;
        }
    }
}
