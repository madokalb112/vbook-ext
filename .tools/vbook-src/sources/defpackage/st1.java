package defpackage;

import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class st1 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ st1(st5 st5Var, List list, br9 br9Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = 6;
        this.b = st5Var;
        this.c = list;
        this.d = br9Var;
        this.e = yb4Var;
        this.f = yb4Var2;
        this.s = zb4Var;
        this.u = ib4Var;
        this.v = kb4Var;
        this.w = kb4Var2;
        this.t = a07Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        String str;
        pj7 pj7Var;
        br9 br9Var;
        fu6 fu6Var;
        dd4 dd4Var;
        boolean z;
        String str2;
        z85 z85Var = (z85) this.b;
        bi6 bi6Var = (bi6) this.c;
        t27 t27Var = (t27) this.d;
        String str3 = (String) this.e;
        pj7 pj7Var2 = (pj7) this.f;
        br9 br9Var2 = (a07) this.s;
        br9 br9Var3 = (br9) this.t;
        br9 br9Var4 = (br9) this.u;
        a07 a07Var = (a07) this.v;
        br9 br9Var5 = (br9) this.w;
        co0 co0Var = (co0) obj;
        dd4 dd4Var2 = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        co0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
        }
        if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            kk kkVarJ = oh9.j(dd4Var2);
            pn2 pn2Var = (pn2) dd4Var2.j(xm1.h);
            WeakHashMap weakHashMap = pzb.w;
            z85 z85VarR = jv3.r(ju7.i(dd4Var2).b, dd4Var2);
            zm5 zm5Var = (zm5) dd4Var2.j(xm1.n);
            int i = iIntValue;
            Object[] objArr = {z85Var, pn2Var, kkVarJ, new x13(co0Var.d()), new x13(co0Var.c())};
            boolean zF = ((i & 14) == 4) | dd4Var2.f(z85Var) | dd4Var2.d(zm5Var.ordinal()) | dd4Var2.f(z85VarR) | dd4Var2.f(bi6Var) | dd4Var2.f(pn2Var) | dd4Var2.h(kkVarJ);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var2 = vl1.a;
            if (zF || objQ == fu6Var2) {
                str = str3;
                pj7Var = pj7Var2;
                br9Var = br9Var2;
                fu6Var = fu6Var2;
                dd4Var = dd4Var2;
                z = false;
                ux2 ux2Var = new ux2(z85Var, zm5Var, z85VarR, bi6Var, pn2Var, kkVarJ, co0Var, null, 4);
                dd4Var.p0(ux2Var);
                objQ = ux2Var;
            } else {
                str = str3;
                pj7Var = pj7Var2;
                br9Var = br9Var2;
                dd4Var = dd4Var2;
                z = false;
                fu6Var = fu6Var2;
            }
            lc5.x(objArr, (yb4) objQ, dd4Var);
            long j = ((lra) br9Var.getValue()).d;
            String str4 = ((lra) br9Var.getValue()).e;
            px3 px3Var = tg9.c;
            ym9.a(384, j, dd4Var, px3Var, str4);
            if (((ai6) br9Var3.getValue()).a) {
                dd4Var.f0(-1031174255);
                String str5 = ((ai6) br9Var3.getValue()).e;
                ou6 ou6VarL0 = gjb.l0(px3Var, 24.0f);
                boolean zF2 = dd4Var.f(t27Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == fu6Var) {
                    objQ2 = new zf3(t27Var, 27);
                    dd4Var.p0(objQ2);
                }
                jv3.j(48, (ib4) objQ2, dd4Var, ou6VarL0, str5);
                dd4Var.q(z);
            } else if (((ai6) br9Var3.getValue()).d) {
                dd4Var.f0(-1030748718);
                String str6 = ((ai6) br9Var3.getValue()).h;
                Object objQ3 = dd4Var.Q();
                if (objQ3 == fu6Var) {
                    objQ3 = new dh1(1);
                    dd4Var.p0(objQ3);
                }
                ib4 ib4Var = (ib4) objQ3;
                boolean zF3 = dd4Var.f(t27Var);
                Object objQ4 = dd4Var.Q();
                if (zF3 || objQ4 == fu6Var) {
                    objQ4 = new zf3(t27Var, 28);
                    dd4Var.p0(objQ4);
                }
                jv3.h(432, ib4Var, (ib4) objQ4, dd4Var, px3Var, str6);
                dd4Var.q(z);
            } else if (((ai6) br9Var3.getValue()).c) {
                dd4Var.f0(-1029472696);
                rj9.a(t27Var, bi6Var, (xga) br9Var4.getValue(), (yba) a07Var.getValue(), (lra) br9Var.getValue(), (aoa) br9Var5.getValue(), pj7Var, px3Var, dd4Var, 12582912);
                dd4Var.q(z);
            } else {
                dd4Var.f0(-1030249494);
                String str7 = ((ai6) br9Var3.getValue()).e;
                String str8 = ((ai6) br9Var3.getValue()).f;
                String str9 = ((ai6) br9Var3.getValue()).g;
                boolean z2 = ((ai6) br9Var3.getValue()).b;
                ou6 ou6VarK0 = gjb.k0(gjb.l0(px3Var, 24.0f), yib.e(dd4Var, 15));
                boolean zF4 = dd4Var.f(bi6Var);
                Object objQ5 = dd4Var.Q();
                if (zF4 || objQ5 == fu6Var) {
                    str2 = str9;
                    vx2 vx2Var = new vx2(4, bi6Var, bi6.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 5);
                    dd4Var.p0(vx2Var);
                    objQ5 = vx2Var;
                } else {
                    str2 = str9;
                }
                ac4 ac4Var = (ac4) ((ei5) objQ5);
                boolean zF5 = dd4Var.f(t27Var);
                Object objQ6 = dd4Var.Q();
                if (zF5 || objQ6 == fu6Var) {
                    objQ6 = new zf3(t27Var, 29);
                    dd4Var.p0(objQ6);
                }
                dd4 dd4Var3 = dd4Var;
                jv3.i(str, str7, str8, str2, ou6VarK0, z2, ac4Var, (ib4) objQ6, dd4Var3, 0);
                dd4Var3.q(z);
            }
        } else {
            dd4Var2.Y();
        }
        return heb.a;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        dd4 dd4Var;
        boolean z;
        Object obj4;
        dd4 dd4Var2;
        boolean z2;
        Object obj5;
        int i = this.a;
        heb hebVar = heb.a;
        fu6 fu6Var = vl1.a;
        Object obj6 = this.w;
        Object obj7 = this.v;
        Object obj8 = this.u;
        Object obj9 = this.t;
        Object obj10 = this.s;
        Object obj11 = this.f;
        Object obj12 = this.e;
        Object obj13 = this.d;
        Object obj14 = this.c;
        Object obj15 = this.b;
        switch (i) {
            case 0:
                sw8 sw8Var = (sw8) obj15;
                jka jkaVar = (jka) obj14;
                nca ncaVar = (nca) obj13;
                lra lraVar = (lra) obj12;
                aoa aoaVar = (aoa) obj11;
                zja zjaVar = (zja) obj10;
                kba kbaVar = (kba) obj9;
                ib4 ib4Var = (ib4) obj8;
                kb4 kb4Var = (kb4) obj7;
                kb4 kb4Var2 = (kb4) obj6;
                co0 co0Var = (co0) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var3.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var3.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var3.Y();
                } else {
                    px3 px3Var = tg9.c;
                    st5 st5VarI = sw8Var.i();
                    boolean z3 = jkaVar.d() == t19.a;
                    boolean zF = dd4Var3.f(ncaVar) | ((iIntValue & 14) == 4) | dd4Var3.f(lraVar) | dd4Var3.f(jkaVar) | dd4Var3.f(aoaVar) | dd4Var3.f(zjaVar) | dd4Var3.f(kbaVar) | dd4Var3.f(ib4Var) | dd4Var3.f(kb4Var) | dd4Var3.f(kb4Var2);
                    Object objQ = dd4Var3.Q();
                    if (zF || objQ == fu6Var) {
                        objQ = new fu1(ncaVar, co0Var, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, ib4Var, kb4Var, kb4Var2);
                        dd4Var3.p0(objQ);
                    }
                    rw1.j(px3Var, st5VarI, null, false, null, null, null, z3, null, (kb4) objQ, dd4Var3, 6, 380);
                }
                break;
            case 1:
                z85 z85Var = (z85) obj15;
                px2 px2Var = (px2) obj14;
                t27 t27Var = (t27) obj13;
                String str = (String) obj12;
                pj7 pj7Var = (pj7) obj11;
                a07 a07Var = (a07) obj10;
                br9 br9Var = (br9) obj9;
                br9 br9Var2 = (br9) obj8;
                a07 a07Var2 = (a07) obj7;
                br9 br9Var3 = (br9) obj6;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var4.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var4.Y();
                } else {
                    kk kkVarJ = oh9.j(dd4Var4);
                    pn2 pn2Var = (pn2) dd4Var4.j(xm1.h);
                    WeakHashMap weakHashMap = pzb.w;
                    z85 z85VarR = jv3.r(ju7.i(dd4Var4).b, dd4Var4);
                    zm5 zm5Var = (zm5) dd4Var4.j(xm1.n);
                    int i2 = iIntValue2;
                    Object[] objArr = {z85Var, pn2Var, kkVarJ, new x13(co0Var2.d()), new x13(co0Var2.c())};
                    boolean zF2 = ((i2 & 14) == 4) | dd4Var4.f(z85Var) | dd4Var4.d(zm5Var.ordinal()) | dd4Var4.f(z85VarR) | dd4Var4.f(px2Var) | dd4Var4.f(pn2Var) | dd4Var4.h(kkVarJ);
                    Object objQ2 = dd4Var4.Q();
                    if (zF2 || objQ2 == fu6Var) {
                        objQ2 = new ux2(z85Var, zm5Var, z85VarR, px2Var, pn2Var, kkVarJ, co0Var2, null, 0);
                        dd4Var4.p0(objQ2);
                    }
                    lc5.x(objArr, (yb4) objQ2, dd4Var4);
                    long j = ((lra) a07Var.getValue()).d;
                    String str2 = ((lra) a07Var.getValue()).e;
                    px3 px3Var2 = tg9.c;
                    ym9.a(384, j, dd4Var4, px3Var2, str2);
                    if (((nx2) br9Var.getValue()).a) {
                        dd4Var4.f0(208540459);
                        String str3 = ((nx2) br9Var.getValue()).e;
                        ou6 ou6VarL0 = gjb.l0(px3Var2, 24.0f);
                        boolean zF3 = dd4Var4.f(t27Var);
                        Object objQ3 = dd4Var4.Q();
                        Object obj16 = objQ3;
                        if (zF3 || objQ3 == fu6Var) {
                            z6 z6Var = new z6(t27Var, 22);
                            dd4Var4.p0(z6Var);
                            obj16 = z6Var;
                        }
                        kf0.k(48, (ib4) obj16, dd4Var4, ou6VarL0, str3);
                        dd4Var4.q(false);
                    } else if (((nx2) br9Var.getValue()).d) {
                        dd4Var4.f0(208870888);
                        String str4 = ((nx2) br9Var.getValue()).h;
                        Object objQ4 = dd4Var4.Q();
                        Object obj17 = objQ4;
                        if (objQ4 == fu6Var) {
                            dh1 dh1Var = new dh1(1);
                            dd4Var4.p0(dh1Var);
                            obj17 = dh1Var;
                        }
                        ib4 ib4Var2 = (ib4) obj17;
                        boolean zF4 = dd4Var4.f(t27Var);
                        Object objQ5 = dd4Var4.Q();
                        Object obj18 = objQ5;
                        if (zF4 || objQ5 == fu6Var) {
                            z6 z6Var2 = new z6(t27Var, 23);
                            dd4Var4.p0(z6Var2);
                            obj18 = z6Var2;
                        }
                        kf0.i(432, ib4Var2, (ib4) obj18, dd4Var4, px3Var2, str4);
                        dd4Var4.q(false);
                    } else if (!((nx2) br9Var.getValue()).c) {
                        dd4Var4.f0(209279654);
                        String str5 = ((nx2) br9Var.getValue()).e;
                        String str6 = ((nx2) br9Var.getValue()).f;
                        String str7 = ((nx2) br9Var.getValue()).g;
                        boolean z4 = ((nx2) br9Var.getValue()).b;
                        ou6 ou6VarK0 = gjb.k0(gjb.l0(px3Var2, 24.0f), yib.e(dd4Var4, 15));
                        boolean zF5 = dd4Var4.f(px2Var);
                        Object objQ6 = dd4Var4.Q();
                        if (zF5 || objQ6 == fu6Var) {
                            objQ6 = new vx2(4, px2Var, px2.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 0);
                            dd4Var4.p0(objQ6);
                        }
                        ac4 ac4Var = (ac4) ((ei5) objQ6);
                        boolean zF6 = dd4Var4.f(t27Var);
                        Object objQ7 = dd4Var4.Q();
                        Object obj19 = objQ7;
                        if (zF6 || objQ7 == fu6Var) {
                            z6 z6Var3 = new z6(t27Var, 24);
                            dd4Var4.p0(z6Var3);
                            obj19 = z6Var3;
                        }
                        kf0.j(str, str5, str6, str7, ou6VarK0, z4, ac4Var, (ib4) obj19, dd4Var4, 0);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(209993987);
                        rj9.a(t27Var, px2Var, (xga) br9Var2.getValue(), (yba) a07Var2.getValue(), (lra) a07Var.getValue(), (aoa) br9Var3.getValue(), pj7Var, px3Var2, dd4Var4, 12582912);
                        dd4Var4.q(false);
                    }
                }
                break;
            case 2:
                z85 z85Var2 = (z85) obj15;
                vf3 vf3Var = (vf3) obj14;
                t27 t27Var2 = (t27) obj13;
                String str8 = (String) obj12;
                pj7 pj7Var2 = (pj7) obj11;
                a07 a07Var3 = (a07) obj10;
                br9 br9Var4 = (br9) obj9;
                br9 br9Var5 = (br9) obj8;
                a07 a07Var4 = (a07) obj7;
                br9 br9Var6 = (br9) obj6;
                co0 co0Var3 = (co0) obj;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                co0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var5.f(co0Var3) ? 4 : 2;
                }
                if (!dd4Var5.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    dd4Var5.Y();
                } else {
                    kk kkVarJ2 = oh9.j(dd4Var5);
                    pn2 pn2Var2 = (pn2) dd4Var5.j(xm1.h);
                    WeakHashMap weakHashMap2 = pzb.w;
                    z85 z85VarR2 = jv3.r(ju7.i(dd4Var5).b, dd4Var5);
                    zm5 zm5Var2 = (zm5) dd4Var5.j(xm1.n);
                    Object[] objArr2 = {z85Var2, pn2Var2, kkVarJ2, new x13(co0Var3.d()), new x13(co0Var3.c())};
                    boolean zF7 = ((iIntValue3 & 14) == 4) | dd4Var5.f(z85Var2) | dd4Var5.d(zm5Var2.ordinal()) | dd4Var5.f(z85VarR2) | dd4Var5.f(vf3Var) | dd4Var5.f(pn2Var2) | dd4Var5.h(kkVarJ2);
                    Object objQ8 = dd4Var5.Q();
                    if (zF7 || objQ8 == fu6Var) {
                        dd4Var = dd4Var5;
                        ux2 ux2Var = new ux2(z85Var2, zm5Var2, z85VarR2, vf3Var, pn2Var2, kkVarJ2, co0Var3, null, 1);
                        dd4Var.p0(ux2Var);
                        objQ8 = ux2Var;
                    } else {
                        dd4Var = dd4Var5;
                    }
                    lc5.x(objArr2, (yb4) objQ8, dd4Var);
                    long j2 = ((lra) a07Var3.getValue()).d;
                    String str9 = ((lra) a07Var3.getValue()).e;
                    px3 px3Var3 = tg9.c;
                    dd4 dd4Var6 = dd4Var;
                    ym9.a(384, j2, dd4Var6, px3Var3, str9);
                    if (((sf3) br9Var4.getValue()).a) {
                        dd4Var6.f0(621892414);
                        String str10 = ((sf3) br9Var4.getValue()).e;
                        ou6 ou6VarL02 = gjb.l0(px3Var3, 24.0f);
                        boolean zF8 = dd4Var6.f(t27Var2);
                        Object objQ9 = dd4Var6.Q();
                        Object obj20 = objQ9;
                        if (zF8 || objQ9 == fu6Var) {
                            z6 z6Var4 = new z6(t27Var2, 28);
                            dd4Var6.p0(z6Var4);
                            obj20 = z6Var4;
                        }
                        vm7.p(48, (ib4) obj20, dd4Var6, ou6VarL02, str10);
                        dd4Var6.q(false);
                    } else if (((sf3) br9Var4.getValue()).d) {
                        dd4Var6.f0(622317951);
                        String str11 = ((sf3) br9Var4.getValue()).h;
                        Object objQ10 = dd4Var6.Q();
                        Object obj21 = objQ10;
                        if (objQ10 == fu6Var) {
                            dh1 dh1Var2 = new dh1(1);
                            dd4Var6.p0(dh1Var2);
                            obj21 = dh1Var2;
                        }
                        ib4 ib4Var3 = (ib4) obj21;
                        boolean zF9 = dd4Var6.f(t27Var2);
                        Object objQ11 = dd4Var6.Q();
                        Object obj22 = objQ11;
                        if (zF9 || objQ11 == fu6Var) {
                            z6 z6Var5 = new z6(t27Var2, 29);
                            dd4Var6.p0(z6Var5);
                            obj22 = z6Var5;
                        }
                        vm7.n(432, ib4Var3, (ib4) obj22, dd4Var6, px3Var3, str11);
                        dd4Var6.q(false);
                    } else if (!((sf3) br9Var4.getValue()).c) {
                        dd4Var6.f0(622817175);
                        String str12 = ((sf3) br9Var4.getValue()).e;
                        String str13 = ((sf3) br9Var4.getValue()).f;
                        String str14 = ((sf3) br9Var4.getValue()).g;
                        boolean z5 = ((sf3) br9Var4.getValue()).b;
                        ou6 ou6VarK02 = gjb.k0(gjb.l0(px3Var3, 24.0f), yib.e(dd4Var6, 15));
                        boolean zF10 = dd4Var6.f(vf3Var);
                        Object objQ12 = dd4Var6.Q();
                        if (zF10 || objQ12 == fu6Var) {
                            objQ12 = new vx2(4, vf3Var, vf3.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 2);
                            dd4Var6.p0(objQ12);
                        }
                        ac4 ac4Var2 = (ac4) ((ei5) objQ12);
                        boolean zF11 = dd4Var6.f(t27Var2);
                        Object objQ13 = dd4Var6.Q();
                        if (zF11 || objQ13 == fu6Var) {
                            z = false;
                            zf3 zf3Var = new zf3(t27Var2, false ? 1 : 0);
                            dd4Var6.p0(zf3Var);
                            obj4 = zf3Var;
                        } else {
                            z = false;
                            obj4 = objQ13;
                        }
                        vm7.o(str8, str12, str13, str14, ou6VarK02, z5, ac4Var2, (ib4) obj4, dd4Var6, 0);
                        dd4Var6.q(z);
                    } else {
                        dd4Var6.f0(623593973);
                        rj9.a(t27Var2, vf3Var, (xga) br9Var5.getValue(), (yba) a07Var4.getValue(), (lra) a07Var3.getValue(), (aoa) br9Var6.getValue(), pj7Var2, px3Var3, dd4Var6, 12582912);
                        dd4Var6.q(false);
                    }
                }
                break;
            case 3:
                z85 z85Var3 = (z85) obj15;
                ys3 ys3Var = (ys3) obj14;
                t27 t27Var3 = (t27) obj13;
                String str15 = (String) obj12;
                pj7 pj7Var3 = (pj7) obj11;
                a07 a07Var5 = (a07) obj10;
                br9 br9Var7 = (br9) obj9;
                br9 br9Var8 = (br9) obj8;
                a07 a07Var6 = (a07) obj7;
                br9 br9Var9 = (br9) obj6;
                co0 co0Var4 = (co0) obj;
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                co0Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= dd4Var7.f(co0Var4) ? 4 : 2;
                }
                if (!dd4Var7.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    dd4Var7.Y();
                } else {
                    kk kkVarJ3 = oh9.j(dd4Var7);
                    pn2 pn2Var3 = (pn2) dd4Var7.j(xm1.h);
                    WeakHashMap weakHashMap3 = pzb.w;
                    z85 z85VarR3 = jv3.r(ju7.i(dd4Var7).b, dd4Var7);
                    zm5 zm5Var3 = (zm5) dd4Var7.j(xm1.n);
                    int i3 = iIntValue4;
                    Object[] objArr3 = {z85Var3, pn2Var3, kkVarJ3, new x13(co0Var4.d()), new x13(co0Var4.c())};
                    boolean zF12 = ((i3 & 14) == 4) | dd4Var7.f(z85Var3) | dd4Var7.d(zm5Var3.ordinal()) | dd4Var7.f(z85VarR3) | dd4Var7.f(ys3Var) | dd4Var7.f(pn2Var3) | dd4Var7.h(kkVarJ3);
                    Object objQ14 = dd4Var7.Q();
                    if (zF12 || objQ14 == fu6Var) {
                        objQ14 = new ux2(z85Var3, zm5Var3, z85VarR3, ys3Var, pn2Var3, kkVarJ3, co0Var4, null, 2);
                        dd4Var7.p0(objQ14);
                    }
                    lc5.x(objArr3, (yb4) objQ14, dd4Var7);
                    long j3 = ((lra) a07Var5.getValue()).d;
                    String str16 = ((lra) a07Var5.getValue()).e;
                    px3 px3Var4 = tg9.c;
                    ym9.a(384, j3, dd4Var7, px3Var4, str16);
                    if (((xs3) br9Var7.getValue()).a) {
                        dd4Var7.f0(-183926198);
                        String str17 = ((xs3) br9Var7.getValue()).e;
                        ou6 ou6VarL03 = gjb.l0(px3Var4, 24.0f);
                        boolean zF13 = dd4Var7.f(t27Var3);
                        Object objQ15 = dd4Var7.Q();
                        Object obj23 = objQ15;
                        if (zF13 || objQ15 == fu6Var) {
                            zf3 zf3Var2 = new zf3(t27Var3, 8);
                            dd4Var7.p0(zf3Var2);
                            obj23 = zf3Var2;
                        }
                        fe.t(48, (ib4) obj23, dd4Var7, ou6VarL03, str17);
                        dd4Var7.q(false);
                    } else if (((xs3) br9Var7.getValue()).d) {
                        dd4Var7.f0(-183500661);
                        String str18 = ((xs3) br9Var7.getValue()).h;
                        Object objQ16 = dd4Var7.Q();
                        Object obj24 = objQ16;
                        if (objQ16 == fu6Var) {
                            dh1 dh1Var3 = new dh1(1);
                            dd4Var7.p0(dh1Var3);
                            obj24 = dh1Var3;
                        }
                        ib4 ib4Var4 = (ib4) obj24;
                        boolean zF14 = dd4Var7.f(t27Var3);
                        Object objQ17 = dd4Var7.Q();
                        Object obj25 = objQ17;
                        if (zF14 || objQ17 == fu6Var) {
                            zf3 zf3Var3 = new zf3(t27Var3, 9);
                            dd4Var7.p0(zf3Var3);
                            obj25 = zf3Var3;
                        }
                        fe.r(432, ib4Var4, (ib4) obj25, dd4Var7, px3Var4, str18);
                        dd4Var7.q(false);
                    } else if (!((xs3) br9Var7.getValue()).c) {
                        dd4Var7.f0(-183001437);
                        String str19 = ((xs3) br9Var7.getValue()).e;
                        String str20 = ((xs3) br9Var7.getValue()).f;
                        String str21 = ((xs3) br9Var7.getValue()).g;
                        boolean z6 = ((xs3) br9Var7.getValue()).b;
                        ou6 ou6VarK03 = gjb.k0(gjb.l0(px3Var4, 24.0f), yib.e(dd4Var7, 15));
                        boolean zF15 = dd4Var7.f(ys3Var);
                        Object objQ18 = dd4Var7.Q();
                        if (zF15 || objQ18 == fu6Var) {
                            objQ18 = new vx2(4, ys3Var, ys3.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 3);
                            dd4Var7.p0(objQ18);
                        }
                        ac4 ac4Var3 = (ac4) ((ei5) objQ18);
                        boolean zF16 = dd4Var7.f(t27Var3);
                        Object objQ19 = dd4Var7.Q();
                        Object obj26 = objQ19;
                        if (zF16 || objQ19 == fu6Var) {
                            zf3 zf3Var4 = new zf3(t27Var3, 10);
                            dd4Var7.p0(zf3Var4);
                            obj26 = zf3Var4;
                        }
                        fe.s(str15, str19, str20, str21, ou6VarK03, z6, ac4Var3, (ib4) obj26, dd4Var7, 0);
                        dd4Var7.q(false);
                    } else {
                        dd4Var7.f0(-182224639);
                        rj9.a(t27Var3, ys3Var, (xga) br9Var8.getValue(), (yba) a07Var6.getValue(), (lra) a07Var5.getValue(), (aoa) br9Var9.getValue(), pj7Var3, px3Var4, dd4Var7, 12582912);
                        dd4Var7.q(false);
                    }
                }
                break;
            case 4:
                z85 z85Var4 = (z85) obj15;
                xr4 xr4Var = (xr4) obj14;
                t27 t27Var4 = (t27) obj13;
                String str22 = (String) obj12;
                pj7 pj7Var4 = (pj7) obj11;
                a07 a07Var7 = (a07) obj10;
                br9 br9Var10 = (br9) obj9;
                br9 br9Var11 = (br9) obj8;
                a07 a07Var8 = (a07) obj7;
                br9 br9Var12 = (br9) obj6;
                co0 co0Var5 = (co0) obj;
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                co0Var5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= dd4Var8.f(co0Var5) ? 4 : 2;
                }
                if (!dd4Var8.V(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    dd4Var8.Y();
                } else {
                    kk kkVarJ4 = oh9.j(dd4Var8);
                    pn2 pn2Var4 = (pn2) dd4Var8.j(xm1.h);
                    WeakHashMap weakHashMap4 = pzb.w;
                    z85 z85VarR4 = jv3.r(ju7.i(dd4Var8).b, dd4Var8);
                    zm5 zm5Var4 = (zm5) dd4Var8.j(xm1.n);
                    Object[] objArr4 = {z85Var4, pn2Var4, kkVarJ4, new x13(co0Var5.d()), new x13(co0Var5.c())};
                    boolean zF17 = ((iIntValue5 & 14) == 4) | dd4Var8.f(z85Var4) | dd4Var8.d(zm5Var4.ordinal()) | dd4Var8.f(z85VarR4) | dd4Var8.f(xr4Var) | dd4Var8.f(pn2Var4) | dd4Var8.h(kkVarJ4);
                    Object objQ20 = dd4Var8.Q();
                    if (zF17 || objQ20 == fu6Var) {
                        dd4Var2 = dd4Var8;
                        ux2 ux2Var2 = new ux2(z85Var4, zm5Var4, z85VarR4, xr4Var, pn2Var4, kkVarJ4, co0Var5, null, 3);
                        dd4Var2.p0(ux2Var2);
                        objQ20 = ux2Var2;
                    } else {
                        dd4Var2 = dd4Var8;
                    }
                    lc5.x(objArr4, (yb4) objQ20, dd4Var2);
                    long j4 = ((lra) a07Var7.getValue()).d;
                    String str23 = ((lra) a07Var7.getValue()).e;
                    px3 px3Var5 = tg9.c;
                    dd4 dd4Var9 = dd4Var2;
                    ym9.a(384, j4, dd4Var9, px3Var5, str23);
                    if (((qq4) br9Var10.getValue()).a) {
                        dd4Var9.f0(733986135);
                        String str24 = ((qq4) br9Var10.getValue()).e;
                        ou6 ou6VarL04 = gjb.l0(px3Var5, 24.0f);
                        boolean zF18 = dd4Var9.f(t27Var4);
                        Object objQ21 = dd4Var9.Q();
                        Object obj27 = objQ21;
                        if (zF18 || objQ21 == fu6Var) {
                            zf3 zf3Var5 = new zf3(t27Var4, 18);
                            dd4Var9.p0(zf3Var5);
                            obj27 = zf3Var5;
                        }
                        yb0.p(48, (ib4) obj27, dd4Var9, ou6VarL04, str24);
                        dd4Var9.q(false);
                    } else if (((qq4) br9Var10.getValue()).d) {
                        dd4Var9.f0(734410773);
                        String str25 = ((qq4) br9Var10.getValue()).h;
                        Object objQ22 = dd4Var9.Q();
                        Object obj28 = objQ22;
                        if (objQ22 == fu6Var) {
                            dh1 dh1Var4 = new dh1(1);
                            dd4Var9.p0(dh1Var4);
                            obj28 = dh1Var4;
                        }
                        ib4 ib4Var5 = (ib4) obj28;
                        boolean zF19 = dd4Var9.f(t27Var4);
                        Object objQ23 = dd4Var9.Q();
                        Object obj29 = objQ23;
                        if (zF19 || objQ23 == fu6Var) {
                            zf3 zf3Var6 = new zf3(t27Var4, 19);
                            dd4Var9.p0(zf3Var6);
                            obj29 = zf3Var6;
                        }
                        yb0.n(432, ib4Var5, (ib4) obj29, dd4Var9, px3Var5, str25);
                        dd4Var9.q(false);
                    } else if (!((qq4) br9Var10.getValue()).c) {
                        dd4Var9.f0(734882128);
                        String str26 = ((qq4) br9Var10.getValue()).e;
                        String str27 = ((qq4) br9Var10.getValue()).f;
                        String str28 = ((qq4) br9Var10.getValue()).g;
                        boolean z7 = ((qq4) br9Var10.getValue()).b;
                        ou6 ou6VarK04 = gjb.k0(gjb.l0(px3Var5, 24.0f), yib.e(dd4Var9, 15));
                        boolean zF20 = dd4Var9.f(xr4Var);
                        Object objQ24 = dd4Var9.Q();
                        if (zF20 || objQ24 == fu6Var) {
                            objQ24 = new vx2(4, xr4Var, xr4.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 4);
                            dd4Var9.p0(objQ24);
                        }
                        ac4 ac4Var4 = (ac4) ((ei5) objQ24);
                        boolean zF21 = dd4Var9.f(t27Var4);
                        Object objQ25 = dd4Var9.Q();
                        Object obj30 = objQ25;
                        if (zF21 || objQ25 == fu6Var) {
                            zf3 zf3Var7 = new zf3(t27Var4, 20);
                            dd4Var9.p0(zf3Var7);
                            obj30 = zf3Var7;
                        }
                        yb0.o(str22, str26, str27, str28, ou6VarK04, z7, ac4Var4, (ib4) obj30, dd4Var9, 0);
                        dd4Var9.q(false);
                    } else {
                        dd4Var9.f0(735658926);
                        rj9.a(t27Var4, xr4Var, (xga) br9Var11.getValue(), (yba) a07Var8.getValue(), (lra) a07Var7.getValue(), (aoa) br9Var12.getValue(), pj7Var4, px3Var5, dd4Var9, 12582912);
                        dd4Var9.q(false);
                    }
                }
                break;
            case 5:
                break;
            case 6:
                st5 st5Var = (st5) obj15;
                List list = (List) obj14;
                br9 br9Var13 = (br9) obj13;
                yb4 yb4Var = (yb4) obj12;
                yb4 yb4Var2 = (yb4) obj11;
                zb4 zb4Var = (zb4) obj10;
                ib4 ib4Var6 = (ib4) obj8;
                kb4 kb4Var3 = (kb4) obj7;
                kb4 kb4Var4 = (kb4) obj6;
                a07 a07Var9 = (a07) obj9;
                co0 co0Var6 = (co0) obj;
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                co0Var6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= dd4Var10.f(co0Var6) ? 4 : 2;
                }
                if (!dd4Var10.V(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    dd4Var10.Y();
                } else {
                    px3 px3Var6 = tg9.c;
                    boolean zH = dd4Var10.h(list) | dd4Var10.f(br9Var13) | ((iIntValue6 & 14) == 4) | dd4Var10.f(yb4Var) | dd4Var10.f(yb4Var2) | dd4Var10.f(zb4Var) | dd4Var10.f(ib4Var6) | dd4Var10.f(kb4Var3) | dd4Var10.f(kb4Var4);
                    Object objQ26 = dd4Var10.Q();
                    if (zH || objQ26 == fu6Var) {
                        objQ26 = new jl7(list, co0Var6, yb4Var, yb4Var2, zb4Var, ib4Var6, kb4Var3, kb4Var4, br9Var13, a07Var9, 0);
                        dd4Var10.p0(objQ26);
                    }
                    y86.g(px3Var6, st5Var, null, null, null, null, false, (kb4) objQ26, dd4Var10, 6);
                }
                break;
            default:
                z85 z85Var5 = (z85) obj15;
                h5c h5cVar = (h5c) obj14;
                t27 t27Var5 = (t27) obj13;
                String str29 = (String) obj12;
                pj7 pj7Var5 = (pj7) obj11;
                a07 a07Var10 = (a07) obj10;
                br9 br9Var14 = (br9) obj9;
                br9 br9Var15 = (br9) obj8;
                a07 a07Var11 = (a07) obj7;
                br9 br9Var16 = (br9) obj6;
                co0 co0Var7 = (co0) obj;
                dd4 dd4Var11 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                co0Var7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= dd4Var11.f(co0Var7) ? 4 : 2;
                }
                if (!dd4Var11.V(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    dd4Var11.Y();
                } else {
                    kk kkVarJ5 = oh9.j(dd4Var11);
                    pn2 pn2Var5 = (pn2) dd4Var11.j(xm1.h);
                    WeakHashMap weakHashMap5 = pzb.w;
                    z85 z85VarR5 = jv3.r(ju7.i(dd4Var11).b, dd4Var11);
                    zm5 zm5Var5 = (zm5) dd4Var11.j(xm1.n);
                    Object[] objArr5 = {z85Var5, pn2Var5, kkVarJ5, new x13(co0Var7.d()), new x13(co0Var7.c())};
                    boolean zF22 = ((iIntValue7 & 14) == 4) | dd4Var11.f(z85Var5) | dd4Var11.d(zm5Var5.ordinal()) | dd4Var11.f(z85VarR5) | dd4Var11.f(h5cVar) | dd4Var11.f(pn2Var5) | dd4Var11.h(kkVarJ5);
                    Object objQ27 = dd4Var11.Q();
                    if (zF22 || objQ27 == fu6Var) {
                        objQ27 = new ux2(z85Var5, zm5Var5, z85VarR5, h5cVar, pn2Var5, kkVarJ5, co0Var7, null, 7);
                        dd4Var11.p0(objQ27);
                    }
                    lc5.x(objArr5, (yb4) objQ27, dd4Var11);
                    long j5 = ((lra) a07Var10.getValue()).d;
                    String str30 = ((lra) a07Var10.getValue()).e;
                    px3 px3Var7 = tg9.c;
                    ym9.a(384, j5, dd4Var11, px3Var7, str30);
                    if (((g5c) br9Var14.getValue()).a) {
                        dd4Var11.f0(-237583953);
                        String str31 = ((g5c) br9Var14.getValue()).e;
                        ou6 ou6VarL05 = gjb.l0(px3Var7, 24.0f);
                        boolean zF23 = dd4Var11.f(t27Var5);
                        Object objQ28 = dd4Var11.Q();
                        Object obj31 = objQ28;
                        if (zF23 || objQ28 == fu6Var) {
                            ne9 ne9Var = new ne9(t27Var5, 29);
                            dd4Var11.p0(ne9Var);
                            obj31 = ne9Var;
                        }
                        h67.u(48, (ib4) obj31, dd4Var11, ou6VarL05, str31);
                        dd4Var11.q(false);
                    } else if (((g5c) br9Var14.getValue()).d) {
                        dd4Var11.f0(-237158416);
                        String str32 = ((g5c) br9Var14.getValue()).h;
                        Object objQ29 = dd4Var11.Q();
                        Object obj32 = objQ29;
                        if (objQ29 == fu6Var) {
                            dh1 dh1Var5 = new dh1(1);
                            dd4Var11.p0(dh1Var5);
                            obj32 = dh1Var5;
                        }
                        ib4 ib4Var7 = (ib4) obj32;
                        boolean zF24 = dd4Var11.f(t27Var5);
                        Object objQ30 = dd4Var11.Q();
                        if (zF24 || objQ30 == fu6Var) {
                            z2 = false;
                            k5c k5cVar = new k5c(t27Var5, 0);
                            dd4Var11.p0(k5cVar);
                            obj5 = k5cVar;
                        } else {
                            z2 = false;
                            obj5 = objQ30;
                        }
                        h67.s(432, ib4Var7, (ib4) obj5, dd4Var11, px3Var7, str32);
                        dd4Var11.q(z2);
                    } else if (!((g5c) br9Var14.getValue()).c) {
                        dd4Var11.f0(-236659192);
                        String str33 = ((g5c) br9Var14.getValue()).e;
                        String str34 = ((g5c) br9Var14.getValue()).f;
                        String str35 = ((g5c) br9Var14.getValue()).g;
                        boolean z8 = ((g5c) br9Var14.getValue()).b;
                        ou6 ou6VarK05 = gjb.k0(gjb.l0(px3Var7, 24.0f), yib.e(dd4Var11, 15));
                        boolean zF25 = dd4Var11.f(h5cVar);
                        Object objQ31 = dd4Var11.Q();
                        if (zF25 || objQ31 == fu6Var) {
                            objQ31 = new vx2(4, h5cVar, h5c.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 7);
                            dd4Var11.p0(objQ31);
                        }
                        ac4 ac4Var5 = (ac4) ((ei5) objQ31);
                        boolean zF26 = dd4Var11.f(t27Var5);
                        Object objQ32 = dd4Var11.Q();
                        Object obj33 = objQ32;
                        if (zF26 || objQ32 == fu6Var) {
                            k5c k5cVar2 = new k5c(t27Var5, 1);
                            dd4Var11.p0(k5cVar2);
                            obj33 = k5cVar2;
                        }
                        h67.t(str29, str33, str34, str35, ou6VarK05, z8, ac4Var5, (ib4) obj33, dd4Var11, 0);
                        dd4Var11.q(false);
                    } else {
                        dd4Var11.f0(-235882394);
                        rj9.a(t27Var5, h5cVar, (xga) br9Var15.getValue(), (yba) a07Var11.getValue(), (lra) a07Var10.getValue(), (aoa) br9Var16.getValue(), pj7Var5, px3Var7, dd4Var11, 12582912);
                        dd4Var11.q(false);
                    }
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ st1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.s = obj6;
        this.t = obj7;
        this.u = obj8;
        this.v = obj9;
        this.w = obj10;
    }
}
