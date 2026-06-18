package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class u97 implements zb4 {
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

    public /* synthetic */ u97(rj7 rj7Var, pj7 pj7Var, wq5 wq5Var, ho2 ho2Var, wq2 wq2Var, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, yb4 yb4Var2) {
        this.a = 2;
        this.b = rj7Var;
        this.d = pj7Var;
        this.v = wq5Var;
        this.c = ho2Var;
        this.e = wq2Var;
        this.t = kb4Var;
        this.f = yb4Var;
        this.s = kb4Var2;
        this.u = yb4Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        rab rabVar;
        dd4 dd4Var;
        int i;
        int i2 = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        Object obj5 = this.t;
        Object obj6 = this.e;
        Object obj7 = this.u;
        Object obj8 = this.s;
        Object obj9 = this.d;
        Object obj10 = this.v;
        Object obj11 = this.f;
        Object obj12 = this.c;
        Object obj13 = this.b;
        final int i3 = 0;
        switch (i2) {
            case 0:
                z85 z85Var = (z85) obj13;
                s97 s97Var = (s97) obj10;
                t27 t27Var = (t27) obj12;
                pj7 pj7Var = (pj7) obj9;
                a07 a07Var = (a07) obj6;
                br9 br9Var = (br9) obj11;
                br9 br9Var2 = (br9) obj8;
                a07 a07Var2 = (a07) obj5;
                br9 br9Var3 = (br9) obj7;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    kk kkVarJ = oh9.j(dd4Var2);
                    pn2 pn2Var = (pn2) dd4Var2.j(xm1.h);
                    WeakHashMap weakHashMap = pzb.w;
                    z85 z85VarR = jv3.r(ju7.i(dd4Var2).b, dd4Var2);
                    int i4 = iIntValue;
                    zm5 zm5Var = (zm5) dd4Var2.j(xm1.n);
                    Object[] objArr = {z85Var, pn2Var, kkVarJ, new x13(co0Var.d()), new x13(co0Var.c())};
                    boolean zF = ((i4 & 14) == 4) | dd4Var2.f(z85Var) | dd4Var2.d(zm5Var.ordinal()) | dd4Var2.f(z85VarR) | dd4Var2.f(s97Var) | dd4Var2.f(pn2Var) | dd4Var2.h(kkVarJ);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == obj4) {
                        objQ = new ux2(z85Var, zm5Var, z85VarR, s97Var, pn2Var, kkVarJ, co0Var, null, 5);
                        dd4Var2.p0(objQ);
                    }
                    lc5.x(objArr, (yb4) objQ, dd4Var2);
                    long j = ((lra) a07Var.getValue()).d;
                    String str = ((lra) a07Var.getValue()).e;
                    px3 px3Var = tg9.c;
                    ym9.a(384, j, dd4Var2, px3Var, str);
                    if (((j97) br9Var.getValue()).a) {
                        dd4Var2.f0(2116822795);
                        String str2 = ((j97) br9Var.getValue()).d;
                        ou6 ou6VarL0 = gjb.l0(px3Var, 24.0f);
                        boolean zF2 = dd4Var2.f(t27Var);
                        Object objQ2 = dd4Var2.Q();
                        if (zF2 || objQ2 == obj4) {
                            objQ2 = new y07(t27Var, 4);
                            dd4Var2.p0(objQ2);
                        }
                        h67.K(48, (ib4) objQ2, dd4Var2, ou6VarL0, str2);
                        dd4Var2.q(false);
                    } else if (!((j97) br9Var.getValue()).c) {
                        dd4Var2.f0(2117730692);
                        rj9.a(t27Var, s97Var, (xga) br9Var2.getValue(), (yba) a07Var2.getValue(), (lra) a07Var.getValue(), (aoa) br9Var3.getValue(), pj7Var, px3Var, dd4Var2, 12582912);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(2117251525);
                        String str3 = ((j97) br9Var.getValue()).e;
                        Object objQ3 = dd4Var2.Q();
                        if (objQ3 == obj4) {
                            objQ3 = new dh1(1);
                            dd4Var2.p0(objQ3);
                        }
                        ib4 ib4Var = (ib4) objQ3;
                        boolean zF3 = dd4Var2.f(t27Var);
                        Object objQ4 = dd4Var2.Q();
                        if (zF3 || objQ4 == obj4) {
                            objQ4 = new y07(t27Var, 5);
                            dd4Var2.p0(objQ4);
                        }
                        h67.J(432, ib4Var, (ib4) objQ4, dd4Var2, px3Var, str3);
                        dd4Var2.q(false);
                    }
                }
                break;
            case 1:
                z85 z85Var2 = (z85) obj13;
                rab rabVar2 = (rab) obj10;
                t27 t27Var2 = (t27) obj12;
                pj7 pj7Var2 = (pj7) obj9;
                a07 a07Var3 = (a07) obj6;
                br9 br9Var4 = (br9) obj11;
                br9 br9Var5 = (br9) obj8;
                a07 a07Var4 = (a07) obj5;
                br9 br9Var6 = (br9) obj7;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var3.Y();
                } else {
                    kk kkVarJ2 = oh9.j(dd4Var3);
                    pn2 pn2Var2 = (pn2) dd4Var3.j(xm1.h);
                    WeakHashMap weakHashMap2 = pzb.w;
                    z85 z85VarR2 = jv3.r(ju7.i(dd4Var3).b, dd4Var3);
                    zm5 zm5Var2 = (zm5) dd4Var3.j(xm1.n);
                    Object[] objArr2 = {z85Var2, pn2Var2, kkVarJ2, new x13(co0Var2.d()), new x13(co0Var2.c())};
                    boolean zF4 = dd4Var3.f(z85Var2) | dd4Var3.d(zm5Var2.ordinal()) | dd4Var3.f(z85VarR2) | dd4Var3.f(rabVar2) | dd4Var3.f(pn2Var2) | dd4Var3.h(kkVarJ2) | ((iIntValue2 & 14) == 4);
                    Object objQ5 = dd4Var3.Q();
                    if (zF4 || objQ5 == obj4) {
                        rabVar = rabVar2;
                        dd4Var = dd4Var3;
                        ux2 ux2Var = new ux2(z85Var2, zm5Var2, z85VarR2, rabVar, pn2Var2, kkVarJ2, co0Var2, null, 6);
                        dd4Var.p0(ux2Var);
                        objQ5 = ux2Var;
                    } else {
                        dd4Var = dd4Var3;
                        rabVar = rabVar2;
                    }
                    lc5.x(objArr2, (yb4) objQ5, dd4Var);
                    long j2 = ((lra) a07Var3.getValue()).d;
                    String str4 = ((lra) a07Var3.getValue()).e;
                    px3 px3Var2 = tg9.c;
                    ym9.a(384, j2, dd4Var, px3Var2, str4);
                    if (((mab) br9Var4.getValue()).a) {
                        dd4Var.f0(-668783962);
                        String str5 = ((mab) br9Var4.getValue()).f;
                        ou6 ou6VarL02 = gjb.l0(px3Var2, 24.0f);
                        boolean zF5 = dd4Var.f(t27Var2);
                        Object objQ6 = dd4Var.Q();
                        if (zF5 || objQ6 == obj4) {
                            objQ6 = new ne9(t27Var2, 23);
                            dd4Var.p0(objQ6);
                        }
                        yb0.D(48, (ib4) objQ6, dd4Var, ou6VarL02, str5);
                        dd4Var.q(false);
                    } else if (((mab) br9Var4.getValue()).e) {
                        dd4Var.f0(-668363664);
                        String str6 = ((mab) br9Var4.getValue()).l;
                        boolean zF6 = dd4Var.f(t27Var2);
                        Object objQ7 = dd4Var.Q();
                        if (zF6 || objQ7 == obj4) {
                            objQ7 = new ne9(t27Var2, 24);
                            dd4Var.p0(objQ7);
                        }
                        yb0.w(48, (ib4) objQ7, dd4Var, px3Var2, str6);
                        dd4Var.q(false);
                    } else if (!((mab) br9Var4.getValue()).c) {
                        dd4Var.f0(-667946993);
                        boolean zF7 = dd4Var.f(rabVar);
                        Object objQ8 = dd4Var.Q();
                        if (zF7 || objQ8 == obj4) {
                            objQ8 = new ne0(rabVar, null, 27);
                            dd4Var.p0(objQ8);
                        }
                        lc5.u((yb4) objQ8, dd4Var, hebVar);
                        String str7 = ((mab) br9Var4.getValue()).f;
                        String str8 = ((mab) br9Var4.getValue()).g;
                        String str9 = ((mab) br9Var4.getValue()).h;
                        List list = ((mab) br9Var4.getValue()).k;
                        int i5 = ((mab) br9Var4.getValue()).j;
                        boolean z = ((mab) br9Var4.getValue()).d;
                        boolean z2 = ((mab) br9Var4.getValue()).b;
                        ou6 ou6VarK0 = gjb.k0(gjb.l0(px3Var2, 24.0f), yib.e(dd4Var, 15));
                        boolean zF8 = dd4Var.f(rabVar);
                        Object objQ9 = dd4Var.Q();
                        if (zF8 || objQ9 == obj4) {
                            objQ9 = new vra(1, rabVar, rab.class, "checkChapters", "checkChapters(Ljava/util/Map;)V", 0, 13);
                            dd4Var.p0(objQ9);
                        }
                        ei5 ei5Var = (ei5) objQ9;
                        boolean zF9 = dd4Var.f(rabVar);
                        Object objQ10 = dd4Var.Q();
                        if (zF9 || objQ10 == obj4) {
                            objQ10 = new xab(5, 0, rab.class, rabVar, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;Ljava/util/List;)V");
                            dd4Var.p0(objQ10);
                        }
                        kb4 kb4Var = (kb4) ei5Var;
                        bc4 bc4Var = (bc4) ((ei5) objQ10);
                        boolean zF10 = dd4Var.f(t27Var2);
                        Object objQ11 = dd4Var.Q();
                        if (zF10 || objQ11 == obj4) {
                            objQ11 = new ne9(t27Var2, 25);
                            dd4Var.p0(objQ11);
                        }
                        ib4 ib4Var2 = (ib4) objQ11;
                        boolean zF11 = dd4Var.f(t27Var2);
                        Object objQ12 = dd4Var.Q();
                        if (zF11 || objQ12 == obj4) {
                            objQ12 = new ne9(t27Var2, 26);
                            dd4Var.p0(objQ12);
                        }
                        yb0.x(str7, str8, str9, ou6VarK0, i5, z, z2, list, kb4Var, bc4Var, ib4Var2, (ib4) objQ12, dd4Var, 0);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-666686533);
                        rj9.a(t27Var2, rabVar, (xga) br9Var5.getValue(), (yba) a07Var4.getValue(), (lra) a07Var3.getValue(), (aoa) br9Var6.getValue(), pj7Var2, px3Var2, dd4Var, 12582912);
                        dd4Var.q(false);
                    }
                }
                break;
            case 2:
                rj7 rj7Var = (rj7) obj13;
                pj7 pj7Var3 = (pj7) obj9;
                wq5 wq5Var = (wq5) obj10;
                ho2 ho2Var = (ho2) obj12;
                wq2 wq2Var = (wq2) obj6;
                kb4 kb4Var2 = (kb4) obj5;
                yb4 yb4Var = (yb4) obj11;
                kb4 kb4Var3 = (kb4) obj8;
                yb4 yb4Var2 = (yb4) obj7;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var4.Y();
                } else {
                    yh4 yh4Var = new yh4(160.0f);
                    ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
                    szb szbVarW = yib.w(rj7Var, yib.d(10, dd4Var4, false));
                    szb szbVarW2 = yib.w(yib.w(yib.w(rj7Var, yib.d(8, dd4Var4, false)), gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11)), pj7Var3);
                    boolean zH = dd4Var4.h(ho2Var) | dd4Var4.f(wq2Var) | dd4Var4.f(pj7Var3) | dd4Var4.f(kb4Var2) | dd4Var4.f(yb4Var) | dd4Var4.f(kb4Var3) | dd4Var4.f(yb4Var2);
                    Object objQ13 = dd4Var4.Q();
                    if (zH || objQ13 == obj4) {
                        objQ13 = new bq2(ho2Var, yb4Var, wq2Var, kb4Var3, yb4Var2, pj7Var3, kb4Var2);
                        dd4Var4.p0(objQ13);
                    }
                    gx1.i(yh4Var, ou6VarF, wq5Var, szbVarW, null, null, null, false, 0L, 0L, szbVarW2, 0.0f, (kb4) objQ13, dd4Var4, 48, 0, 6128);
                }
                break;
            default:
                final joa joaVar = (joa) obj13;
                t27 t27Var3 = (t27) obj12;
                final br9 br9Var7 = (br9) obj11;
                final za9 za9Var = (za9) obj10;
                final kb4 kb4Var4 = (kb4) obj9;
                final br9 br9Var8 = (br9) obj8;
                final br9 br9Var9 = (br9) obj7;
                final br9 br9Var10 = (br9) obj6;
                final br9 br9Var11 = (br9) obj5;
                co0 co0Var3 = (co0) obj;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                co0Var3.getClass();
                long j3 = co0Var3.b;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= dd4Var5.f(co0Var3) ? 4 : 2;
                }
                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    dd4Var5.Y();
                } else {
                    boolean z3 = up1.i(j3) > (up1.h(j3) * 3) / 4;
                    Object objQ14 = dd4Var5.Q();
                    if (objQ14 == obj4) {
                        objQ14 = dk9.x(Boolean.FALSE);
                        dd4Var5.p0(objQ14);
                    }
                    final a07 a07Var5 = (a07) objQ14;
                    Object objQ15 = dd4Var5.Q();
                    if (objQ15 == obj4) {
                        objQ15 = dk9.x(Boolean.FALSE);
                        dd4Var5.p0(objQ15);
                    }
                    final a07 a07Var6 = (a07) objQ15;
                    Object objQ16 = dd4Var5.Q();
                    if (objQ16 == obj4) {
                        objQ16 = dk9.x(Boolean.FALSE);
                        dd4Var5.p0(objQ16);
                    }
                    final a07 a07Var7 = (a07) objQ16;
                    Object objQ17 = dd4Var5.Q();
                    if (objQ17 == obj4) {
                        objQ17 = dk9.x(Boolean.FALSE);
                        dd4Var5.p0(objQ17);
                    }
                    final a07 a07Var8 = (a07) objQ17;
                    Object objQ18 = dd4Var5.Q();
                    if (objQ18 == obj4) {
                        objQ18 = dk9.x(Boolean.FALSE);
                        dd4Var5.p0(objQ18);
                    }
                    final a07 a07Var9 = (a07) objQ18;
                    boolean z4 = ((gna) br9Var7.getValue()).g && ((gna) br9Var7.getValue()).h;
                    be3 be3VarC = wd3.c(ah1.a0(300, 0, null, 6), 2);
                    p9b p9bVarA0 = ah1.a0(400, 0, null, 6);
                    Object objQ19 = dd4Var5.Q();
                    if (objQ19 == obj4) {
                        objQ19 = new e4(3);
                        dd4Var5.p0(objQ19);
                    }
                    be3 be3VarA = be3VarC.a(wd3.j(p9bVarA0, new vd3(1, (kb4) objQ19)));
                    cj3 cj3VarD = wd3.d(ah1.a0(300, 0, null, 6), 2);
                    p9b p9bVarA02 = ah1.a0(400, 0, null, 6);
                    Object objQ20 = dd4Var5.Q();
                    if (objQ20 == obj4) {
                        i = 3;
                        objQ20 = new e4(3);
                        dd4Var5.p0(objQ20);
                    } else {
                        i = 3;
                    }
                    final boolean z5 = z3;
                    kf0.d(z4, (ou6) null, be3VarA, cj3VarD.a(wd3.n(p9bVarA02, new vd3(i, (kb4) objQ20))), (String) null, jf0.G(678937800, new zb4() { // from class: hma
                        @Override // defpackage.zb4
                        public final Object c(Object obj14, Object obj15, Object obj16) {
                            float f;
                            boolean z6;
                            heb hebVar2;
                            ou6 ou6Var;
                            dd4 dd4Var6;
                            za9 za9Var2;
                            ou6 ou6Var2;
                            co coVar = (co) obj14;
                            dd4 dd4Var7 = (dd4) obj15;
                            int iIntValue5 = ((Integer) obj16).intValue();
                            coVar.getClass();
                            final joa joaVar2 = joaVar;
                            boolean zF12 = dd4Var7.f(joaVar2);
                            Object objQ21 = dd4Var7.Q();
                            Object obj17 = vl1.a;
                            if (zF12 || objQ21 == obj17) {
                                objQ21 = new jma(joaVar2, 0);
                                dd4Var7.p0(objQ21);
                            }
                            mb0.a(false, (ib4) objQ21, dd4Var7, 0, 1);
                            Object objQ22 = dd4Var7.Q();
                            if (objQ22 == obj17) {
                                objQ22 = new ym7(0.0f);
                                dd4Var7.p0(objQ22);
                            }
                            ym7 ym7Var = (ym7) objQ22;
                            Object objQ23 = dd4Var7.Q();
                            if (objQ23 == obj17) {
                                objQ23 = new ym7(1.0f);
                                dd4Var7.p0(objQ23);
                            }
                            ym7 ym7Var2 = (ym7) objQ23;
                            final br9 br9Var12 = br9Var7;
                            Boolean boolValueOf = Boolean.valueOf(((gna) br9Var12.getValue()).g);
                            Boolean boolValueOf2 = Boolean.valueOf(((gna) br9Var12.getValue()).h);
                            boolean zF13 = dd4Var7.f(br9Var12);
                            Object objQ24 = dd4Var7.Q();
                            if (zF13 || objQ24 == obj17) {
                                objQ24 = new c69(br9Var12, ym7Var, null, 7);
                                dd4Var7.p0(objQ24);
                            }
                            lc5.v(boolValueOf, boolValueOf2, (yb4) objQ24, dd4Var7);
                            float fP = wx1.P(ym7Var.h() / ym7Var2.h(), 0.0f, 1.0f);
                            float f2 = 1.0f - (0.2f * fP);
                            float fW0 = ((pn2) dd4Var7.j(xm1.h)).w0(24.0f) * fP;
                            ou6 ou6Var3 = tg9.c;
                            Object objQ25 = dd4Var7.Q();
                            if (objQ25 == obj17) {
                                f = 1.0f;
                                objQ25 = new lma(ym7Var2, 0);
                                dd4Var7.p0(objQ25);
                            } else {
                                f = 1.0f;
                            }
                            ou6 ou6VarY = yn2.y(dd4Var7, fe.L(m79.J(ou6Var3, (kb4) objQ25), lc1.c((f - fP) * 0.6f, ((q96) dd4Var7.j(s96.a)).a.C), jf0.G));
                            boolean zF14 = dd4Var7.f(joaVar2);
                            Object objQ26 = dd4Var7.Q();
                            if (zF14 || objQ26 == obj17) {
                                z6 = false;
                                objQ26 = new yma(0, joaVar2, ym7Var, ym7Var2);
                                dd4Var7.p0(objQ26);
                            } else {
                                z6 = false;
                            }
                            heb hebVar3 = heb.a;
                            ou6 ou6VarB = r1a.b(ou6VarY, hebVar3, (PointerInputEventHandler) objQ26);
                            xf0 xf0Var = bv4.b;
                            ha6 ha6VarD = pn0.d(xf0Var, z6);
                            int iHashCode = Long.hashCode(dd4Var7.T);
                            lr7 lr7VarL = dd4Var7.l();
                            ou6 ou6VarL03 = s32.L0(dd4Var7, ou6VarB);
                            ml1.k.getClass();
                            um1 um1Var = ll1.b;
                            dd4Var7.j0();
                            if (dd4Var7.S) {
                                dd4Var7.k(um1Var);
                            } else {
                                dd4Var7.s0();
                            }
                            jm jmVar = ll1.f;
                            un9.s(jmVar, dd4Var7, ha6VarD);
                            jm jmVar2 = ll1.e;
                            un9.s(jmVar2, dd4Var7, lr7VarL);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            jm jmVar3 = ll1.g;
                            un9.s(jmVar3, dd4Var7, numValueOf);
                            kd kdVar = ll1.h;
                            un9.r(dd4Var7, kdVar);
                            jm jmVar4 = ll1.d;
                            un9.s(jmVar4, dd4Var7, ou6VarL03);
                            boolean zC = dd4Var7.c(f2) | dd4Var7.c(fW0);
                            Object objQ27 = dd4Var7.Q();
                            if (zC || objQ27 == obj17) {
                                objQ27 = new h90(f2, fW0, ym7Var);
                                dd4Var7.p0(objQ27);
                            }
                            ou6 ou6VarW = kl8.W(ou6Var3, (kb4) objQ27);
                            ha6 ha6VarD2 = pn0.d(xf0Var, false);
                            int iHashCode2 = Long.hashCode(dd4Var7.T);
                            lr7 lr7VarL2 = dd4Var7.l();
                            ou6 ou6VarL04 = s32.L0(dd4Var7, ou6VarW);
                            dd4Var7.j0();
                            if (dd4Var7.S) {
                                dd4Var7.k(um1Var);
                            } else {
                                dd4Var7.s0();
                            }
                            un9.s(jmVar, dd4Var7, ha6VarD2);
                            un9.s(jmVar2, dd4Var7, lr7VarL2);
                            ky0.v(iHashCode2, dd4Var7, jmVar3, dd4Var7, kdVar);
                            un9.s(jmVar4, dd4Var7, ou6VarL04);
                            boolean z7 = z5;
                            za9 za9Var3 = za9Var;
                            final kb4 kb4Var5 = kb4Var4;
                            br9 br9Var13 = br9Var8;
                            br9 br9Var14 = br9Var9;
                            br9 br9Var15 = br9Var10;
                            a07 a07Var10 = a07Var8;
                            final a07 a07Var11 = a07Var5;
                            a07 a07Var12 = a07Var6;
                            a07 a07Var13 = a07Var9;
                            final a07 a07Var14 = a07Var7;
                            if (z7) {
                                dd4Var7.f0(179338262);
                                gna gnaVar = (gna) br9Var12.getValue();
                                tla tlaVar = (tla) br9Var13.getValue();
                                ana anaVar = (ana) br9Var14.getValue();
                                sna snaVar = (sna) br9Var15.getValue();
                                boa boaVar = (boa) br9Var11.getValue();
                                boolean zF15 = dd4Var7.f(joaVar2);
                                Object objQ28 = dd4Var7.Q();
                                if (zF15 || objQ28 == obj17) {
                                    za9Var2 = za9Var3;
                                    objQ28 = new jma(joaVar2, 13);
                                    dd4Var7.p0(objQ28);
                                } else {
                                    za9Var2 = za9Var3;
                                }
                                ib4 ib4Var3 = (ib4) objQ28;
                                boolean zF16 = dd4Var7.f(joaVar2);
                                Object objQ29 = dd4Var7.Q();
                                if (zF16 || objQ29 == obj17) {
                                    objQ29 = new jma(joaVar2, 14);
                                    dd4Var7.p0(objQ29);
                                }
                                ib4 ib4Var4 = (ib4) objQ29;
                                boolean zF17 = dd4Var7.f(joaVar2) | dd4Var7.f(kb4Var5) | dd4Var7.f(br9Var12);
                                Object objQ30 = dd4Var7.Q();
                                if (zF17 || objQ30 == obj17) {
                                    ou6Var2 = ou6Var3;
                                    final int i6 = 1;
                                    objQ30 = new ib4() { // from class: mma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i7 = i6;
                                            heb hebVar4 = heb.a;
                                            br9 br9Var16 = br9Var12;
                                            kb4 kb4Var6 = kb4Var5;
                                            joa joaVar3 = joaVar2;
                                            switch (i7) {
                                                case 0:
                                                    joaVar3.k();
                                                    kb4Var6.invoke(((gna) br9Var16.getValue()).a);
                                                    break;
                                                default:
                                                    joaVar3.k();
                                                    kb4Var6.invoke(((gna) br9Var16.getValue()).a);
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ30);
                                } else {
                                    ou6Var2 = ou6Var3;
                                }
                                ib4 ib4Var5 = (ib4) objQ30;
                                Object objQ31 = dd4Var7.Q();
                                if (objQ31 == obj17) {
                                    objQ31 = new vb9(a07Var10, 26);
                                    dd4Var7.p0(objQ31);
                                }
                                ib4 ib4Var6 = (ib4) objQ31;
                                boolean zF18 = dd4Var7.f(joaVar2);
                                Object objQ32 = dd4Var7.Q();
                                final int i7 = 3;
                                if (zF18 || objQ32 == obj17) {
                                    objQ32 = new ib4() { // from class: kma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i8 = i7;
                                            heb hebVar4 = heb.a;
                                            a07 a07Var15 = a07Var11;
                                            joa joaVar3 = joaVar2;
                                            switch (i8) {
                                                case 0:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 1:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 2:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                default:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ32);
                                }
                                ib4 ib4Var7 = (ib4) objQ32;
                                Object objQ33 = dd4Var7.Q();
                                if (objQ33 == obj17) {
                                    objQ33 = new vb9(a07Var12, 27);
                                    dd4Var7.p0(objQ33);
                                }
                                ib4 ib4Var8 = (ib4) objQ33;
                                Object objQ34 = dd4Var7.Q();
                                if (objQ34 == obj17) {
                                    objQ34 = new vb9(a07Var13, 28);
                                    dd4Var7.p0(objQ34);
                                }
                                ib4 ib4Var9 = (ib4) objQ34;
                                boolean zF19 = dd4Var7.f(joaVar2);
                                Object objQ35 = dd4Var7.Q();
                                if (zF19 || objQ35 == obj17) {
                                    final int i8 = 0;
                                    objQ35 = new ib4() { // from class: kma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i82 = i8;
                                            heb hebVar4 = heb.a;
                                            a07 a07Var15 = a07Var14;
                                            joa joaVar3 = joaVar2;
                                            switch (i82) {
                                                case 0:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 1:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 2:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                default:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ35);
                                }
                                ib4 ib4Var10 = (ib4) objQ35;
                                boolean zF20 = dd4Var7.f(joaVar2);
                                Object objQ36 = dd4Var7.Q();
                                if (zF20 || objQ36 == obj17) {
                                    objQ36 = new jma(joaVar2, 1);
                                    dd4Var7.p0(objQ36);
                                }
                                ib4 ib4Var11 = (ib4) objQ36;
                                boolean zF21 = dd4Var7.f(joaVar2);
                                Object objQ37 = dd4Var7.Q();
                                if (zF21 || objQ37 == obj17) {
                                    objQ37 = new jma(joaVar2, 2);
                                    dd4Var7.p0(objQ37);
                                }
                                ib4 ib4Var12 = (ib4) objQ37;
                                boolean zF22 = dd4Var7.f(joaVar2);
                                Object objQ38 = dd4Var7.Q();
                                if (zF22 || objQ38 == obj17) {
                                    objQ38 = new jma(joaVar2, 3);
                                    dd4Var7.p0(objQ38);
                                }
                                ib4 ib4Var13 = (ib4) objQ38;
                                boolean zF23 = dd4Var7.f(joaVar2);
                                Object objQ39 = dd4Var7.Q();
                                if (zF23 || objQ39 == obj17) {
                                    objQ39 = new jma(joaVar2, 4);
                                    dd4Var7.p0(objQ39);
                                }
                                ib4 ib4Var14 = (ib4) objQ39;
                                boolean zF24 = dd4Var7.f(joaVar2);
                                Object objQ40 = dd4Var7.Q();
                                if (zF24 || objQ40 == obj17) {
                                    objQ40 = new jma(joaVar2, 5);
                                    dd4Var7.p0(objQ40);
                                }
                                ib4 ib4Var15 = (ib4) objQ40;
                                boolean zF25 = dd4Var7.f(joaVar2);
                                Object objQ41 = dd4Var7.Q();
                                if (zF25 || objQ41 == obj17) {
                                    objQ41 = new ima(joaVar2, 3);
                                    dd4Var7.p0(objQ41);
                                }
                                kb4 kb4Var6 = (kb4) objQ41;
                                boolean zF26 = dd4Var7.f(joaVar2);
                                Object objQ42 = dd4Var7.Q();
                                if (zF26 || objQ42 == obj17) {
                                    objQ42 = new w27(joaVar2, 21);
                                    dd4Var7.p0(objQ42);
                                }
                                hebVar2 = hebVar3;
                                zma.n(gnaVar, anaVar, tlaVar, snaVar, boaVar, za9Var2, coVar, ou6Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, ib4Var14, ib4Var15, kb4Var6, (yb4) objQ42, dd4Var7, ((iIntValue5 << 18) & 3670016) | 12582912);
                                dd4Var6 = dd4Var7;
                                dd4Var6.q(false);
                            } else {
                                hebVar2 = hebVar3;
                                dd4Var7.f0(182137345);
                                gna gnaVar2 = (gna) br9Var12.getValue();
                                tla tlaVar2 = (tla) br9Var13.getValue();
                                ana anaVar2 = (ana) br9Var14.getValue();
                                sna snaVar2 = (sna) br9Var15.getValue();
                                boolean zF27 = dd4Var7.f(joaVar2);
                                Object objQ43 = dd4Var7.Q();
                                if (zF27 || objQ43 == obj17) {
                                    ou6Var = ou6Var3;
                                    objQ43 = new jma(joaVar2, 6);
                                    dd4Var7.p0(objQ43);
                                } else {
                                    ou6Var = ou6Var3;
                                }
                                ib4 ib4Var16 = (ib4) objQ43;
                                boolean zF28 = dd4Var7.f(joaVar2);
                                Object objQ44 = dd4Var7.Q();
                                if (zF28 || objQ44 == obj17) {
                                    objQ44 = new jma(joaVar2, 7);
                                    dd4Var7.p0(objQ44);
                                }
                                ib4 ib4Var17 = (ib4) objQ44;
                                boolean zF29 = dd4Var7.f(joaVar2) | dd4Var7.f(kb4Var5) | dd4Var7.f(br9Var12);
                                Object objQ45 = dd4Var7.Q();
                                if (zF29 || objQ45 == obj17) {
                                    final int i9 = 0;
                                    objQ45 = new ib4() { // from class: mma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i72 = i9;
                                            heb hebVar4 = heb.a;
                                            br9 br9Var16 = br9Var12;
                                            kb4 kb4Var62 = kb4Var5;
                                            joa joaVar3 = joaVar2;
                                            switch (i72) {
                                                case 0:
                                                    joaVar3.k();
                                                    kb4Var62.invoke(((gna) br9Var16.getValue()).a);
                                                    break;
                                                default:
                                                    joaVar3.k();
                                                    kb4Var62.invoke(((gna) br9Var16.getValue()).a);
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ45);
                                }
                                ib4 ib4Var18 = (ib4) objQ45;
                                Object objQ46 = dd4Var7.Q();
                                if (objQ46 == obj17) {
                                    objQ46 = new vb9(a07Var10, 23);
                                    dd4Var7.p0(objQ46);
                                }
                                ib4 ib4Var19 = (ib4) objQ46;
                                boolean zF30 = dd4Var7.f(joaVar2);
                                Object objQ47 = dd4Var7.Q();
                                if (zF30 || objQ47 == obj17) {
                                    final int i10 = 1;
                                    objQ47 = new ib4() { // from class: kma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i82 = i10;
                                            heb hebVar4 = heb.a;
                                            a07 a07Var15 = a07Var11;
                                            joa joaVar3 = joaVar2;
                                            switch (i82) {
                                                case 0:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 1:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 2:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                default:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ47);
                                }
                                ib4 ib4Var20 = (ib4) objQ47;
                                Object objQ48 = dd4Var7.Q();
                                if (objQ48 == obj17) {
                                    objQ48 = new vb9(a07Var13, 24);
                                    dd4Var7.p0(objQ48);
                                }
                                ib4 ib4Var21 = (ib4) objQ48;
                                Object objQ49 = dd4Var7.Q();
                                if (objQ49 == obj17) {
                                    objQ49 = new vb9(a07Var12, 25);
                                    dd4Var7.p0(objQ49);
                                }
                                ib4 ib4Var22 = (ib4) objQ49;
                                boolean zF31 = dd4Var7.f(joaVar2);
                                Object objQ50 = dd4Var7.Q();
                                if (zF31 || objQ50 == obj17) {
                                    final int i11 = 2;
                                    objQ50 = new ib4() { // from class: kma
                                        @Override // defpackage.ib4
                                        public final Object invoke() {
                                            int i82 = i11;
                                            heb hebVar4 = heb.a;
                                            a07 a07Var15 = a07Var14;
                                            joa joaVar3 = joaVar2;
                                            switch (i82) {
                                                case 0:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 1:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                case 2:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                                default:
                                                    a07Var15.setValue(Boolean.TRUE);
                                                    joaVar3.o();
                                                    break;
                                            }
                                            return hebVar4;
                                        }
                                    };
                                    dd4Var7.p0(objQ50);
                                }
                                ib4 ib4Var23 = (ib4) objQ50;
                                boolean zF32 = dd4Var7.f(joaVar2);
                                Object objQ51 = dd4Var7.Q();
                                if (zF32 || objQ51 == obj17) {
                                    objQ51 = new jma(joaVar2, 8);
                                    dd4Var7.p0(objQ51);
                                }
                                ib4 ib4Var24 = (ib4) objQ51;
                                boolean zF33 = dd4Var7.f(joaVar2);
                                Object objQ52 = dd4Var7.Q();
                                if (zF33 || objQ52 == obj17) {
                                    objQ52 = new jma(joaVar2, 9);
                                    dd4Var7.p0(objQ52);
                                }
                                ib4 ib4Var25 = (ib4) objQ52;
                                boolean zF34 = dd4Var7.f(joaVar2);
                                Object objQ53 = dd4Var7.Q();
                                if (zF34 || objQ53 == obj17) {
                                    objQ53 = new jma(joaVar2, 10);
                                    dd4Var7.p0(objQ53);
                                }
                                ib4 ib4Var26 = (ib4) objQ53;
                                boolean zF35 = dd4Var7.f(joaVar2);
                                Object objQ54 = dd4Var7.Q();
                                if (zF35 || objQ54 == obj17) {
                                    objQ54 = new jma(joaVar2, 11);
                                    dd4Var7.p0(objQ54);
                                }
                                ib4 ib4Var27 = (ib4) objQ54;
                                boolean zF36 = dd4Var7.f(joaVar2);
                                Object objQ55 = dd4Var7.Q();
                                if (zF36 || objQ55 == obj17) {
                                    objQ55 = new jma(joaVar2, 12);
                                    dd4Var7.p0(objQ55);
                                }
                                ib4 ib4Var28 = (ib4) objQ55;
                                boolean zF37 = dd4Var7.f(joaVar2);
                                Object objQ56 = dd4Var7.Q();
                                if (zF37 || objQ56 == obj17) {
                                    objQ56 = new ima(joaVar2, 4);
                                    dd4Var7.p0(objQ56);
                                }
                                zma.m(gnaVar2, anaVar2, tlaVar2, snaVar2, za9Var3, coVar, ou6Var, ib4Var16, ib4Var17, ib4Var18, ib4Var19, ib4Var20, ib4Var21, ib4Var22, ib4Var23, ib4Var24, ib4Var25, ib4Var26, ib4Var27, ib4Var28, (kb4) objQ56, dd4Var7, ((iIntValue5 << 15) & 458752) | 1572864);
                                dd4Var6 = dd4Var7;
                                dd4Var6.q(false);
                            }
                            dd4Var6.q(true);
                            dd4Var6.q(true);
                            return hebVar2;
                        }
                    }, dd4Var5), dd4Var5, 200064, 18);
                    boolean zBooleanValue = ((Boolean) a07Var5.getValue()).booleanValue();
                    float f = ((tla) br9Var8.getValue()).a;
                    float f2 = ((tla) br9Var8.getValue()).b;
                    Object objQ21 = dd4Var5.Q();
                    if (objQ21 == obj4) {
                        objQ21 = new qda(a07Var5, 9);
                        dd4Var5.p0(objQ21);
                    }
                    kb4 kb4Var5 = (kb4) objQ21;
                    boolean zF12 = dd4Var5.f(joaVar);
                    Object objQ22 = dd4Var5.Q();
                    if (zF12 || objQ22 == obj4) {
                        objQ22 = new ima(joaVar, i3);
                        dd4Var5.p0(objQ22);
                    }
                    kb4 kb4Var6 = (kb4) objQ22;
                    boolean zF13 = dd4Var5.f(joaVar);
                    Object objQ23 = dd4Var5.Q();
                    if (zF13 || objQ23 == obj4) {
                        objQ23 = new ima(joaVar, 1);
                        dd4Var5.p0(objQ23);
                    }
                    bx1.i(zBooleanValue, z5, f, f2, (ou6) null, kb4Var5, kb4Var6, (kb4) objQ23, dd4Var5, 196608);
                    boolean zBooleanValue2 = ((Boolean) a07Var6.getValue()).booleanValue();
                    long j4 = ((tla) br9Var8.getValue()).c;
                    boolean z6 = ((tla) br9Var8.getValue()).d;
                    Object objQ24 = dd4Var5.Q();
                    if (objQ24 == obj4) {
                        objQ24 = new qda(a07Var6, 10);
                        dd4Var5.p0(objQ24);
                    }
                    kb4 kb4Var7 = (kb4) objQ24;
                    boolean zF14 = dd4Var5.f(joaVar);
                    Object objQ25 = dd4Var5.Q();
                    if (zF14 || objQ25 == obj4) {
                        final int i6 = 1;
                        objQ25 = new yb4() { // from class: gma
                            @Override // defpackage.yb4
                            public final Object invoke(Object obj14, Object obj15) {
                                int i7 = i6;
                                heb hebVar2 = heb.a;
                                a07 a07Var10 = a07Var6;
                                switch (i7) {
                                    case 0:
                                        int iIntValue5 = ((Integer) obj14).intValue();
                                        ((Float) obj15).getClass();
                                        a07Var10.setValue(Boolean.FALSE);
                                        joa joaVar2 = joaVar;
                                        joaVar2.getClass();
                                        za1 za1VarA = vtb.a(joaVar2);
                                        aj2 aj2Var = rw2.a;
                                        joaVar2.g(za1VarA, nh2.c, new doa(joaVar2, iIntValue5, (jt1) null));
                                        break;
                                    default:
                                        long jLongValue = ((Long) obj14).longValue();
                                        boolean zBooleanValue3 = ((Boolean) obj15).booleanValue();
                                        joa joaVar3 = joaVar;
                                        joaVar3.getClass();
                                        za1 za1VarA2 = vtb.a(joaVar3);
                                        aj2 aj2Var2 = rw2.a;
                                        joaVar3.g(za1VarA2, nh2.c, new ioa(joaVar3, jLongValue, zBooleanValue3, null));
                                        a07Var10.setValue(Boolean.FALSE);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var5.p0(objQ25);
                    }
                    cx1.l(zBooleanValue2, z5, j4, z6, kb4Var7, (yb4) objQ25, dd4Var5, 24576);
                    boolean zBooleanValue3 = ((Boolean) a07Var9.getValue()).booleanValue();
                    boolean z7 = ((tla) br9Var8.getValue()).e;
                    float f3 = ((tla) br9Var8.getValue()).f;
                    List list2 = ((tla) br9Var8.getValue()).g;
                    Object objQ26 = dd4Var5.Q();
                    if (objQ26 == obj4) {
                        objQ26 = new qda(a07Var9, 11);
                        dd4Var5.p0(objQ26);
                    }
                    kb4 kb4Var8 = (kb4) objQ26;
                    boolean zF15 = dd4Var5.f(joaVar);
                    Object objQ27 = dd4Var5.Q();
                    if (zF15 || objQ27 == obj4) {
                        objQ27 = new ima(joaVar, 2);
                        dd4Var5.p0(objQ27);
                    }
                    kb4 kb4Var9 = (kb4) objQ27;
                    boolean zF16 = dd4Var5.f(joaVar);
                    Object objQ28 = dd4Var5.Q();
                    if (zF16 || objQ28 == obj4) {
                        objQ28 = new ima(joaVar, 5);
                        dd4Var5.p0(objQ28);
                    }
                    kb4 kb4Var10 = (kb4) objQ28;
                    boolean zF17 = dd4Var5.f(joaVar) | dd4Var5.f(t27Var3);
                    Object objQ29 = dd4Var5.Q();
                    if (zF17 || objQ29 == obj4) {
                        objQ29 = new ma0(24, joaVar, t27Var3, a07Var9);
                        dd4Var5.p0(objQ29);
                    }
                    vw1.k(zBooleanValue3, z5, z7, f3, list2, null, kb4Var8, kb4Var9, kb4Var10, (ib4) objQ29, dd4Var5, 1572864);
                    boolean zBooleanValue4 = ((Boolean) a07Var7.getValue()).booleanValue();
                    Object objQ30 = dd4Var5.Q();
                    if (objQ30 == obj4) {
                        objQ30 = new qda(a07Var7, 14);
                        dd4Var5.p0(objQ30);
                    }
                    kb4 kb4Var11 = (kb4) objQ30;
                    boolean zF18 = dd4Var5.f(joaVar) | dd4Var5.f(t27Var3);
                    Object objQ31 = dd4Var5.Q();
                    if (zF18 || objQ31 == obj4) {
                        objQ31 = new cba(6, joaVar, t27Var3, a07Var7);
                        dd4Var5.p0(objQ31);
                    }
                    ww1.o(zBooleanValue4, z5, null, kb4Var11, (kb4) objQ31, dd4Var5, 3072);
                    boolean zBooleanValue5 = ((Boolean) a07Var8.getValue()).booleanValue();
                    String str10 = ((boa) br9Var11.getValue()).a;
                    List list3 = ((boa) br9Var11.getValue()).b;
                    Object objQ32 = dd4Var5.Q();
                    if (objQ32 == obj4) {
                        objQ32 = new qda(a07Var8, 8);
                        dd4Var5.p0(objQ32);
                    }
                    kb4 kb4Var12 = (kb4) objQ32;
                    boolean zF19 = dd4Var5.f(joaVar);
                    Object objQ33 = dd4Var5.Q();
                    if (zF19 || objQ33 == obj4) {
                        objQ33 = new yb4() { // from class: gma
                            @Override // defpackage.yb4
                            public final Object invoke(Object obj14, Object obj15) {
                                int i7 = i3;
                                heb hebVar2 = heb.a;
                                a07 a07Var10 = a07Var8;
                                switch (i7) {
                                    case 0:
                                        int iIntValue5 = ((Integer) obj14).intValue();
                                        ((Float) obj15).getClass();
                                        a07Var10.setValue(Boolean.FALSE);
                                        joa joaVar2 = joaVar;
                                        joaVar2.getClass();
                                        za1 za1VarA = vtb.a(joaVar2);
                                        aj2 aj2Var = rw2.a;
                                        joaVar2.g(za1VarA, nh2.c, new doa(joaVar2, iIntValue5, (jt1) null));
                                        break;
                                    default:
                                        long jLongValue = ((Long) obj14).longValue();
                                        boolean zBooleanValue32 = ((Boolean) obj15).booleanValue();
                                        joa joaVar3 = joaVar;
                                        joaVar3.getClass();
                                        za1 za1VarA2 = vtb.a(joaVar3);
                                        aj2 aj2Var2 = rw2.a;
                                        joaVar3.g(za1VarA2, nh2.c, new ioa(joaVar3, jLongValue, zBooleanValue32, null));
                                        a07Var10.setValue(Boolean.FALSE);
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var5.p0(objQ33);
                    }
                    sdc.D(zBooleanValue5, z5, str10, list3, kb4Var12, (yb4) objQ33, dd4Var5, 24576);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ u97(z85 z85Var, hra hraVar, t27 t27Var, pj7 pj7Var, a07 a07Var, br9 br9Var, br9 br9Var2, a07 a07Var2, br9 br9Var3, int i) {
        this.a = i;
        this.b = z85Var;
        this.v = hraVar;
        this.c = t27Var;
        this.d = pj7Var;
        this.e = a07Var;
        this.f = br9Var;
        this.s = br9Var2;
        this.t = a07Var2;
        this.u = br9Var3;
    }

    public /* synthetic */ u97(joa joaVar, t27 t27Var, a07 a07Var, za9 za9Var, kb4 kb4Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, a07 a07Var5) {
        this.a = 3;
        this.b = joaVar;
        this.c = t27Var;
        this.f = a07Var;
        this.v = za9Var;
        this.d = kb4Var;
        this.s = a07Var2;
        this.u = a07Var3;
        this.e = a07Var4;
        this.t = a07Var5;
    }
}
