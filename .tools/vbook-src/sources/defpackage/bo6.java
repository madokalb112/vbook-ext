package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bo6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo6(int i, kb4 kb4Var, a07 a07Var) {
        this.a = 15;
        this.d = a07Var;
        this.c = i;
        this.b = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        heb hebVar;
        dd4 dd4Var;
        int i;
        yb4 yb4Var;
        boolean z;
        int i2 = this.a;
        lu6 lu6Var = lu6.a;
        boolean z2 = false;
        fu6 fu6Var = vl1.a;
        int i3 = this.c;
        heb hebVar2 = heb.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                List list = (List) obj4;
                a07 a07Var = (a07) obj3;
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qr1 qr1Var = ra1.e;
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    px3 px3Var = tg9.c;
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var2, px3Var);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD);
                    un9.s(ll1.e, dd4Var2, lr7VarL);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL0);
                    l46 l46VarP0 = cx1.p0(6, 4, dd4Var2);
                    o7c o7cVarN = mi9.n(l46VarP0, dd4Var2, 0);
                    bz9 bz9VarI = oh9.i(o7cVarN, dd4Var2);
                    boolean zF = dd4Var2.f(l46VarP0) | dd4Var2.f(o7cVarN) | dd4Var2.f(bz9VarI) | dd4Var2.f((Object) null);
                    Object objQ = dd4Var2.Q();
                    Object obj5 = objQ;
                    if (zF || objQ == fu6Var) {
                        ac1 ac1Var = new ac1(l46VarP0, o7cVarN, bz9VarI);
                        dd4Var2.p0(ac1Var);
                        obj5 = ac1Var;
                    }
                    ac1 ac1Var2 = (ac1) obj5;
                    Object objQ2 = dd4Var2.Q();
                    Object obj6 = objQ2;
                    if (objQ2 == fu6Var) {
                        cn7 cn7VarX = dk9.x(kx.a);
                        dd4Var2.p0(cn7VarX);
                        obj6 = cn7VarX;
                    }
                    a07 a07Var2 = (a07) obj6;
                    o7c o7cVar = ac1Var2.a;
                    boolean zF2 = dd4Var2.f(ac1Var2);
                    Object objQ3 = dd4Var2.Q();
                    Object obj7 = objQ3;
                    if (zF2 || objQ3 == fu6Var) {
                        ne0 ne0Var = new ne0(ac1Var2, z2 ? 1 : 0, 15);
                        dd4Var2.p0(ne0Var);
                        obj7 = ne0Var;
                    }
                    lc5.u((yb4) obj7, dd4Var2, o7cVar);
                    String str = (String) list.get(i3);
                    b15 b15Var = (b15) dd4Var2.j(w05.a);
                    Object objQ4 = dd4Var2.Q();
                    int i4 = 24;
                    Object obj8 = objQ4;
                    if (objQ4 == fu6Var) {
                        cl6 cl6Var = new cl6(a07Var, i4);
                        dd4Var2.p0(cl6Var);
                        obj8 = cl6Var;
                    }
                    ou6 ou6VarW = kl8.W(px3Var, (kb4) obj8);
                    Object objQ5 = dd4Var2.Q();
                    Object obj9 = objQ5;
                    if (objQ5 == fu6Var) {
                        cl6 cl6Var2 = new cl6(a07Var2, 25);
                        dd4Var2.p0(cl6Var2);
                        obj9 = cl6Var2;
                    }
                    kb4 kb4Var = (kb4) obj9;
                    Object objQ6 = dd4Var2.Q();
                    Object obj10 = objQ6;
                    if (objQ6 == fu6Var) {
                        cl6 cl6Var3 = new cl6(a07Var2, 26);
                        dd4Var2.p0(cl6Var3);
                        obj10 = cl6Var3;
                    }
                    kb4 kb4Var2 = (kb4) obj10;
                    b15Var.getClass();
                    xf0 xf0Var = bv4.f;
                    fw.d(new tx(str, (ix) dd4Var2.j(q16.a), b15Var), ou6VarW, px.H, (kb4Var == null && kb4Var2 == null) ? null : new sl1(kb4Var, kb4Var2, 0), xf0Var, qr1Var, ac1Var2, cw8.d, dd4Var2, 1573296, 0);
                    Object objQ7 = dd4Var2.Q();
                    Object obj11 = objQ7;
                    if (objQ7 == fu6Var) {
                        fo2 fo2VarN = dk9.n(new lz4(a07Var2, i4));
                        dd4Var2.p0(fo2VarN);
                        obj11 = fo2VarN;
                    }
                    if (((Boolean) ((br9) obj11).getValue()).booleanValue()) {
                        dd4Var2.f0(1241941129);
                        l16.a(3.0f, 54, 0, lc1.e, dd4Var2, tg9.n(zn0.a.a(lu6Var, xf0Var), 32.0f));
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1242328412);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                }
                break;
            case 1:
                ((Integer) obj2).intValue();
                ep.a((bp) obj3, (List) obj4, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fe.H((sgb) obj4, (ou6) obj3, i3, (dd4) obj, qu1.x0(393));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((rj1) obj4).b(obj3, (dd4) obj, qu1.x0(i3) | 1);
                break;
            case 4:
                ((Integer) obj2).intValue();
                jv3.e((p58) obj4, (yb4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                jv3.f((p58[]) obj4, (yb4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 6:
                String str2 = (String) obj4;
                a07 a07Var3 = (a07) obj3;
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    vv1.b(str2, ou6VarF, ((q96) dd4Var3.j(ur9Var)).b.j, ((q96) dd4Var3.j(ur9Var)).a.q, ((Boolean) a07Var3.getValue()).booleanValue(), this.c, jf0.G(1093258977, new kq2(a07Var3, 0), dd4Var3), (yb4) null, dd4Var3, 1572912, Token.CASE);
                }
                break;
            case 7:
                ((Integer) obj2).intValue();
                wz4.a((yn0) obj4, (h12) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((bq5) obj4).d(i3, obj3, (dd4) obj, qu1.x0(1));
                break;
            case 9:
                bs5 bs5Var = (bs5) obj4;
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    bs5Var.d(i3, obj3, dd4Var4, 0);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((bt5) obj4).d(i3, obj3, (dd4) obj, qu1.x0(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                mt5.d((uu5) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                mt5.b((wq5) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((fu5) obj4).d(i3, obj3, (dd4) obj, qu1.x0(1));
                break;
            case 14:
                a07 a07Var4 = (a07) obj3;
                a07 a07Var5 = (a07) obj4;
                dd4 dd4Var5 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pj4 pj4VarA = e36.a(dd4Var5);
                    if (pj4VarA == null) {
                        gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    } else {
                        a07 a07VarB = bx1.B(((vz0) ((qtb) qx1.N(ug8.a(vz0.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var5), null))).d, dd4Var5);
                        ou6 ou6VarF0 = h67.f0(kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var5), 14), null, 3);
                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var5, 0);
                        int iHashCode2 = Long.hashCode(dd4Var5.T);
                        lr7 lr7VarL2 = dd4Var5.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var5, ou6VarF0);
                        ml1.k.getClass();
                        um1 um1Var2 = ll1.b;
                        dd4Var5.j0();
                        if (dd4Var5.S) {
                            dd4Var5.k(um1Var2);
                        } else {
                            dd4Var5.s0();
                        }
                        yb4 yb4Var2 = ll1.f;
                        un9.s(yb4Var2, dd4Var5, ie1VarA);
                        jm jmVar = ll1.e;
                        un9.s(jmVar, dd4Var5, lr7VarL2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        jm jmVar2 = ll1.g;
                        un9.s(jmVar2, dd4Var5, numValueOf);
                        kd kdVar = ll1.h;
                        un9.r(dd4Var5, kdVar);
                        jm jmVar3 = ll1.d;
                        un9.s(jmVar3, dd4Var5, ou6VarL02);
                        if (((uz0) a07VarB.getValue()).a) {
                            dd4Var = dd4Var5;
                            i = i3;
                            hebVar = hebVar2;
                            yb4Var = yb4Var2;
                            z = false;
                            dd4Var.f0(-1042119723);
                            dd4Var.q(false);
                        } else {
                            dd4Var5.f0(-1043320012);
                            if (((uz0) a07VarB.getValue()).b.isEmpty()) {
                                dd4Var = dd4Var5;
                                i = i3;
                                hebVar = hebVar2;
                                yb4Var = yb4Var2;
                                z = false;
                                dd4Var.f0(-1042133611);
                                dd4Var.q(false);
                            } else {
                                dd4Var5.f0(-1043257981);
                                hebVar = hebVar2;
                                ou6 ou6VarM0 = gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 8.0f);
                                mv mvVar = new mv(8.0f, true, new gp(5));
                                i = i3;
                                mv mvVar2 = new mv(8.0f, true, new gp(5));
                                rj1 rj1VarG = jf0.G(1700962578, new zj0(a07VarB, a07Var4, 2), dd4Var5);
                                yb4Var = yb4Var2;
                                yn2.b(ou6VarM0, mvVar, mvVar2, (wf0) null, 0, 0, rj1VarG, dd4Var5, 1573302);
                                dd4Var = dd4Var5;
                                z = false;
                                dd4Var.q(false);
                            }
                            dd4Var.q(z);
                        }
                        ou6 ou6VarH = xv5.h(lu6Var, 12.0f, dd4Var, lu6Var, 1.0f);
                        Object objQ8 = dd4Var.Q();
                        Object obj12 = objQ8;
                        if (objQ8 == fu6Var) {
                            lz4 lz4Var = new lz4(a07Var5, 15);
                            dd4Var.p0(lz4Var);
                            obj12 = lz4Var;
                        }
                        ou6 ou6VarV = yn2.V(1, (ib4) obj12, dd4Var, ou6VarH, z);
                        eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                        int iHashCode3 = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL3 = dd4Var.l();
                        ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarV);
                        dd4Var.j0();
                        if (dd4Var.S) {
                            dd4Var.k(um1Var2);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(yb4Var, dd4Var, eq8VarA);
                        un9.s(jmVar, dd4Var, lr7VarL3);
                        ky0.v(iHashCode3, dd4Var, jmVar2, dd4Var, kdVar);
                        un9.s(jmVar3, dd4Var, ou6VarL03);
                        boolean zBooleanValue = ((Boolean) a07Var5.getValue()).booleanValue();
                        Object objQ9 = dd4Var.Q();
                        Object obj13 = objQ9;
                        if (objQ9 == fu6Var) {
                            ci6 ci6Var = new ci6(a07Var5, 4);
                            dd4Var.p0(ci6Var);
                            obj13 = ci6Var;
                        }
                        vo1.e(zBooleanValue, (kb4) obj13, null, false, null, dd4Var, 48);
                        nha.c(wn9.K(tw1.O(i), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, 0, 0, 131070);
                        un9.a(dd4Var, xv5.g(dd4Var, true, true, lu6Var, 12.0f));
                    }
                } else {
                    hebVar = hebVar2;
                    dd4Var5.Y();
                }
                break;
            case 15:
                a07 a07Var6 = (a07) obj3;
                kb4 kb4Var3 = (kb4) obj4;
                dd4 dd4Var6 = (dd4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    dd4Var6.Y();
                } else {
                    boolean zF3 = dd4Var6.f(a07Var6) | dd4Var6.d(i3) | dd4Var6.f(kb4Var3);
                    Object objQ10 = dd4Var6.Q();
                    Object obj14 = objQ10;
                    if (zF3 || objQ10 == fu6Var) {
                        jq6 jq6Var = new jq6(i3, kb4Var3, a07Var6);
                        dd4Var6.p0(jq6Var);
                        obj14 = jq6Var;
                    }
                    lc5.J((ib4) obj14, null, false, null, null, null, ah1.s, dd4Var6, 805306368, 510);
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                lx1.d((String) obj4, (String) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                lx1.a((String) obj3, (List) obj4, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((ok7) obj4).d(i3, obj3, (dd4) obj, qu1.x0(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                cx1.p((ib4) obj4, i3, (rj1) obj3, (dd4) obj, qu1.x0(391));
                break;
            case 20:
                ((Integer) obj2).intValue();
                tu1.f((st5) obj3, (List) obj4, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                vo1.l((t27) obj4, (m55) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ql9.c((zf1) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                mi9.a((cq9) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ri9.a((fq9) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                nha.a((uka) obj4, (yb4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                zma.a((p35) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                ((p3b) obj4).a(obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yn9.c((fxb) obj4, (ou6) obj3, (dd4) obj, qu1.x0(i3 | 1));
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ bo6(sgb sgbVar, ou6 ou6Var, int i, int i2) {
        this.a = 2;
        this.b = sgbVar;
        this.d = ou6Var;
        this.c = i;
    }

    public /* synthetic */ bo6(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    public /* synthetic */ bo6(Object obj, int i, Object obj2, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    public /* synthetic */ bo6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    public /* synthetic */ bo6(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
