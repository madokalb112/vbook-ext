package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class is0 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ is0(gd9 gd9Var, boolean z, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, int i) {
        this.a = 6;
        this.f = gd9Var;
        this.c = z;
        this.s = pj7Var;
        this.t = szbVar;
        this.d = ou6Var;
        this.u = kb4Var;
        this.v = kb4Var2;
        this.e = ib4Var;
        this.b = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        heb hebVar;
        dd4 dd4Var;
        yb4 yb4Var;
        br9 br9Var;
        wf0 wf0Var;
        ib4 ib4Var;
        lu6 lu6Var;
        float f;
        dd4 dd4Var2;
        boolean z;
        lu6 lu6Var2;
        boolean z2;
        int i = this.a;
        int i2 = this.b;
        heb hebVar2 = heb.a;
        Object obj3 = this.e;
        Object obj4 = this.v;
        Object obj5 = this.u;
        Object obj6 = this.d;
        Object obj7 = this.t;
        Object obj8 = this.s;
        Object obj9 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kc5.o(this.c, (bs0) obj9, (ou6) obj6, (pj7) obj8, (t89) obj7, (yb4) obj5, (yb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 1:
                ((Integer) obj2).getClass();
                h67.o((String) obj9, this.b, (bi5) obj8, this.c, (String) obj7, (ou6) obj6, (kb4) obj5, (ib4) obj3, (kb4) obj4, (dd4) obj, qu1.x0(196609));
                return hebVar2;
            case 2:
                ((Integer) obj2).getClass();
                t1c.i((String) obj9, (zk7) obj7, (List) obj5, this.c, (pj7) obj8, (szb) obj4, (t27) obj3, (ou6) obj6, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 3:
                ((Integer) obj2).getClass();
                s32.Q(this.c, (ef6) obj9, (dg6) obj8, (ou6) obj6, (kb4) obj7, (kb4) obj5, (ib4) obj3, (kb4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 4:
                ((Integer) obj2).getClass();
                s32.H(this.c, (cf6) obj9, (dg6) obj8, (ou6) obj6, (kb4) obj7, (kb4) obj5, (ib4) obj3, (kb4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
            case 5:
                a07 a07Var = (a07) obj9;
                a07 a07Var2 = (a07) obj6;
                a07 a07Var3 = (a07) obj8;
                a07 a07Var4 = (a07) obj7;
                br9 br9Var2 = (a07) obj5;
                a07 a07Var5 = (a07) obj4;
                a07 a07Var6 = (a07) obj3;
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                wf0 wf0Var2 = bv4.x;
                if (dd4Var3.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pj4 pj4VarA = e36.a(dd4Var3);
                    if (pj4VarA == null) {
                        gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    a07 a07VarB = bx1.B(((vz0) ((qtb) qx1.N(ug8.a(vz0.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var3), null))).d, dd4Var3);
                    lu6 lu6Var3 = lu6.a;
                    ou6 ou6VarF0 = h67.f0(kc5.Q(tg9.f(lu6Var3, 1.0f), kc5.J(dd4Var3), 14), null, 3);
                    hebVar = hebVar2;
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarF0);
                    ml1.k.getClass();
                    ib4 ib4Var2 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(ib4Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var3, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var3, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var3, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var3, kdVar);
                    yb4 yb4Var2 = ll1.d;
                    un9.s(yb4Var2, dd4Var3, ou6VarL0);
                    boolean z3 = this.c;
                    iv ivVar = pv.a;
                    Object obj10 = vl1.a;
                    if (z3) {
                        dd4Var = dd4Var3;
                        yb4Var = yb4Var2;
                        br9Var = br9Var2;
                        wf0Var = wf0Var2;
                        ib4Var = ib4Var2;
                        lu6Var = lu6Var3;
                        f = 12.0f;
                        dd4Var.f0(-1551983915);
                        dd4Var.q(false);
                    } else {
                        dd4Var3.f0(-1554754478);
                        br9Var = br9Var2;
                        ou6 ou6VarF = tg9.f(lu6Var3, 1.0f);
                        boolean zF = dd4Var3.f(a07Var);
                        Object objQ = dd4Var3.Q();
                        if (zF || objQ == obj10) {
                            lu6Var2 = lu6Var3;
                            objQ = new lz4(a07Var, 12);
                            dd4Var3.p0(objQ);
                        } else {
                            lu6Var2 = lu6Var3;
                        }
                        ou6 ou6VarV = yn2.V(1, (ib4) objQ, dd4Var3, ou6VarF, false);
                        eq8 eq8VarA = dq8.a(ivVar, wf0Var2, dd4Var3, 48);
                        int iHashCode2 = Long.hashCode(dd4Var3.T);
                        lr7 lr7VarL2 = dd4Var3.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarV);
                        dd4Var3.j0();
                        if (dd4Var3.S) {
                            dd4Var3.k(ib4Var2);
                        } else {
                            dd4Var3.s0();
                        }
                        un9.s(jmVar, dd4Var3, eq8VarA);
                        un9.s(jmVar2, dd4Var3, lr7VarL2);
                        ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                        un9.s(yb4Var2, dd4Var3, ou6VarL02);
                        boolean zL = sw1.l(a07Var);
                        boolean zF2 = dd4Var3.f(a07Var);
                        Object objQ2 = dd4Var3.Q();
                        if (zF2 || objQ2 == obj10) {
                            objQ2 = new ci6(a07Var, 1);
                            dd4Var3.p0(objQ2);
                        }
                        kb4 kb4Var = (kb4) objQ2;
                        lu6Var = lu6Var2;
                        wf0Var = wf0Var2;
                        ib4Var = ib4Var2;
                        vo1.e(zL, kb4Var, null, false, null, dd4Var3, 0);
                        String strK = wn9.K((pv9) zt9.y0.getValue(), dd4Var3);
                        ur9 ur9Var = s96.a;
                        nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.j, dd4Var3, 0, 0, 131070);
                        dd4Var = dd4Var3;
                        dd4Var.q(true);
                        if (!((Boolean) a07Var.getValue()).booleanValue() || ((uz0) a07VarB.getValue()).a || ((uz0) a07VarB.getValue()).b.isEmpty()) {
                            yb4Var = yb4Var2;
                            z2 = false;
                            dd4Var.f0(-1552055339);
                            dd4Var.q(false);
                        } else {
                            dd4Var.f0(-1553926406);
                            yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(57607122, new zj0(a07VarB, a07Var4, 1), dd4Var), dd4Var, 1573302);
                            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                            boolean zF3 = dd4Var.f(a07Var2);
                            Object objQ3 = dd4Var.Q();
                            if (zF3 || objQ3 == obj10) {
                                objQ3 = new lz4(a07Var2, 13);
                                dd4Var.p0(objQ3);
                            }
                            ou6 ou6VarV2 = yn2.V(1, (ib4) objQ3, dd4Var, ou6VarF2, false);
                            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
                            int iHashCode3 = Long.hashCode(dd4Var.T);
                            lr7 lr7VarL3 = dd4Var.l();
                            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarV2);
                            dd4Var.j0();
                            if (dd4Var.S) {
                                dd4Var.k(ib4Var);
                            } else {
                                dd4Var.s0();
                            }
                            un9.s(jmVar, dd4Var, eq8VarA2);
                            un9.s(jmVar2, dd4Var, lr7VarL3);
                            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                            yb4Var = yb4Var2;
                            un9.s(yb4Var, dd4Var, ou6VarL03);
                            boolean zJ = sw1.j(a07Var2);
                            boolean zF4 = dd4Var.f(a07Var2);
                            Object objQ4 = dd4Var.Q();
                            if (zF4 || objQ4 == obj10) {
                                objQ4 = new ci6(a07Var2, 2);
                                dd4Var.p0(objQ4);
                            }
                            vo1.e(zJ, (kb4) objQ4, null, false, null, dd4Var, 0);
                            nha.c(wn9.K(tw1.O(i2), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131070);
                            dd4Var = dd4Var;
                            dd4Var.q(true);
                            z2 = false;
                            dd4Var.q(false);
                        }
                        f = 12.0f;
                        xv5.A(lu6Var, 12.0f, dd4Var, z2);
                    }
                    dd4 dd4Var4 = dd4Var;
                    yn2.b(gjb.m0(tg9.f(lu6Var, 1.0f), f, 8.0f), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, jf0.G(-89108600, new nb0(br9Var, 6), dd4Var), dd4Var4, 1573302);
                    if (((Number) br9Var.getValue()).intValue() == 4) {
                        dd4Var4.f0(-1551238024);
                        String str = (String) a07Var5.getValue();
                        String str2 = (String) a07Var6.getValue();
                        ou6 ou6VarM0 = gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f);
                        Object objQ5 = dd4Var4.Q();
                        if (objQ5 == obj10) {
                            objQ5 = new i91(a07Var5, a07Var6, 2);
                            dd4Var4.p0(objQ5);
                        }
                        sw1.t(str, str2, ou6VarM0, (yb4) objQ5, dd4Var4, 3456);
                        dd4Var2 = dd4Var4;
                        dd4Var2.q(false);
                        z = true;
                    } else {
                        dd4Var4.f0(-1550829878);
                        ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                        boolean zF5 = dd4Var4.f(a07Var3);
                        Object objQ6 = dd4Var4.Q();
                        if (zF5 || objQ6 == obj10) {
                            objQ6 = new lz4(a07Var3, 14);
                            dd4Var4.p0(objQ6);
                        }
                        ou6 ou6VarV3 = yn2.V(1, (ib4) objQ6, dd4Var4, ou6VarF3, false);
                        eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var4, 48);
                        int iHashCode4 = Long.hashCode(dd4Var4.T);
                        lr7 lr7VarL4 = dd4Var4.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var4, ou6VarV3);
                        dd4Var4.j0();
                        if (dd4Var4.S) {
                            dd4Var4.k(ib4Var);
                        } else {
                            dd4Var4.s0();
                        }
                        un9.s(jmVar, dd4Var4, eq8VarA3);
                        un9.s(jmVar2, dd4Var4, lr7VarL4);
                        ky0.v(iHashCode4, dd4Var4, jmVar3, dd4Var4, kdVar);
                        un9.s(yb4Var, dd4Var4, ou6VarL04);
                        boolean zK = sw1.k(a07Var3);
                        boolean zF6 = dd4Var4.f(a07Var3);
                        Object objQ7 = dd4Var4.Q();
                        if (zF6 || objQ7 == obj10) {
                            objQ7 = new ci6(a07Var3, 3);
                            dd4Var4.p0(objQ7);
                        }
                        vo1.e(zK, (kb4) objQ7, null, false, null, dd4Var4, 0);
                        nha.c(wn9.K((pv9) zt9.z0.getValue(), dd4Var4), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(s96.a)).b.j, dd4Var4, 0, 0, 131070);
                        dd4Var2 = dd4Var4;
                        z = true;
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(z);
                } else {
                    hebVar = hebVar2;
                    dd4Var3.Y();
                }
                return hebVar;
            default:
                ((Integer) obj2).getClass();
                sdc.V((gd9) obj9, this.c, (pj7) obj8, (szb) obj7, (ou6) obj6, (kb4) obj5, (kb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar2;
        }
    }

    public /* synthetic */ is0(String str, int i, bi5 bi5Var, boolean z, String str2, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, kb4 kb4Var2, int i2) {
        this.a = 1;
        this.f = str;
        this.b = i;
        this.s = bi5Var;
        this.c = z;
        this.t = str2;
        this.d = ou6Var;
        this.u = kb4Var;
        this.e = ib4Var;
        this.v = kb4Var2;
    }

    public /* synthetic */ is0(String str, zk7 zk7Var, List list, boolean z, pj7 pj7Var, szb szbVar, t27 t27Var, ou6 ou6Var, int i) {
        this.a = 2;
        this.f = str;
        this.t = zk7Var;
        this.u = list;
        this.c = z;
        this.s = pj7Var;
        this.v = szbVar;
        this.e = t27Var;
        this.d = ou6Var;
        this.b = i;
    }

    public /* synthetic */ is0(boolean z, bs0 bs0Var, ou6 ou6Var, pj7 pj7Var, t89 t89Var, yb4 yb4Var, yb4 yb4Var2, ib4 ib4Var, int i) {
        this.a = 0;
        this.c = z;
        this.f = bs0Var;
        this.d = ou6Var;
        this.s = pj7Var;
        this.t = t89Var;
        this.u = yb4Var;
        this.v = yb4Var2;
        this.e = ib4Var;
        this.b = i;
    }

    public /* synthetic */ is0(boolean z, gf6 gf6Var, dg6 dg6Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, kb4 kb4Var3, int i, int i2) {
        this.a = i2;
        this.c = z;
        this.f = gf6Var;
        this.s = dg6Var;
        this.d = ou6Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.e = ib4Var;
        this.v = kb4Var3;
        this.b = i;
    }

    public /* synthetic */ is0(boolean z, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4, int i, a07 a07Var5, a07 a07Var6, a07 a07Var7) {
        this.a = 5;
        this.c = z;
        this.f = a07Var;
        this.d = a07Var2;
        this.s = a07Var3;
        this.t = a07Var4;
        this.b = i;
        this.u = a07Var5;
        this.v = a07Var6;
        this.e = a07Var7;
    }
}
