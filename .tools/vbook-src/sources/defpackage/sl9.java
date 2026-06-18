package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sl9 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sl9(st5 st5Var, pj7 pj7Var, List list, boolean z) {
        this.a = 0;
        this.c = st5Var;
        this.d = pj7Var;
        this.e = list;
        this.b = z;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        dd4 dd4Var;
        je4 je4Var;
        ly5 ly5VarP;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        boolean z = this.b;
        heb hebVar = heb.a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                st5 st5Var = (st5) obj7;
                pj7 pj7Var = (pj7) obj6;
                List list = (List) obj5;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    px3 px3Var = tg9.c;
                    mv mvVar = new mv(8.0f, true, new gp(5));
                    boolean zH = dd4Var2.h(list) | dd4Var2.g(z);
                    Object objQ = dd4Var2.Q();
                    if (zH || objQ == obj4) {
                        objQ = new hb0(list, z, 4);
                        dd4Var2.p0(objQ);
                    }
                    rw1.j(px3Var, st5Var, pj7Var, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var2, 24582, 488);
                }
                break;
            case 1:
                ib4 ib4Var = (ib4) obj7;
                ib4 ib4Var2 = (ib4) obj6;
                ib4 ib4Var3 = (ib4) obj5;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    if (z) {
                        dd4Var3.f0(1376416297);
                        String strK = wn9.K((pv9) mu9.K.getValue(), dd4Var3);
                        rj1 rj1Var = kf0.h;
                        boolean zF = dd4Var3.f(ib4Var);
                        Object objQ2 = dd4Var3.Q();
                        if (zF || objQ2 == obj4) {
                            objQ2 = new mh1(25, ib4Var);
                            dd4Var3.p0(objQ2);
                        }
                        gx1.c(strK, null, rj1Var, null, null, (ib4) objQ2, dd4Var3, 384, 26);
                        dd4Var = dd4Var3;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var3;
                        dd4Var.f0(1376852622);
                        String strK2 = wn9.K((pv9) vt9.c0.getValue(), dd4Var);
                        rj1 rj1Var2 = kf0.i;
                        boolean zF2 = dd4Var.f(ib4Var2);
                        Object objQ3 = dd4Var.Q();
                        if (zF2 || objQ3 == obj4) {
                            objQ3 = new mh1(26, ib4Var2);
                            dd4Var.p0(objQ3);
                        }
                        gx1.c(strK2, null, rj1Var2, null, null, (ib4) objQ3, dd4Var, 384, 26);
                        dd4Var.q(false);
                    }
                    String strK3 = wn9.K((pv9) zt9.a0.getValue(), dd4Var);
                    rj1 rj1Var3 = kf0.j;
                    boolean zF3 = dd4Var.f(ib4Var3);
                    Object objQ4 = dd4Var.Q();
                    if (zF3 || objQ4 == obj4) {
                        objQ4 = new mh1(27, ib4Var3);
                        dd4Var.p0(objQ4);
                    }
                    gx1.c(strK3, null, rj1Var3, null, null, (ib4) objQ4, dd4Var, 384, 26);
                }
                break;
            case 2:
                kb4 kb4Var = (kb4) obj7;
                zy4 zy4Var = (zy4) obj6;
                i45 i45Var = (i45) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var4.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    dd4Var4.Y();
                } else {
                    fw.q(this.b, kb4Var, tg9.h(lu6Var, (co0Var.c() * 2.0f) / 3.0f), true, null, null, ((q96) dd4Var4.j(s96.a)).a.p, 0L, 0.0f, 0L, t96.l, jf0.G(-2040263820, new qz0(17, zy4Var, i45Var), dd4Var4), dd4Var4, 3072, 54, 944);
                }
                break;
            case 3:
                sgb sgbVar = (sgb) obj7;
                String str = (String) obj6;
                kb4 kb4Var2 = (kb4) obj5;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dd4Var5.Y();
                } else if (sgbVar != null) {
                    List list2 = sgbVar.f;
                    boolean zF4 = dd4Var5.f(list2);
                    Object objQ5 = dd4Var5.Q();
                    Object obj8 = objQ5;
                    if (zF4 || objQ5 == obj4) {
                        ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new lc1(kf0.H((String) it.next())));
                        }
                        dd4Var5.p0(arrayList);
                        obj8 = arrayList;
                    }
                    List list3 = (List) obj8;
                    boolean zQ = lc5.Q(sgbVar.a, str);
                    ou6 ou6VarM0 = gjb.m0(yib.E(tg9.f(lu6Var, 1.0f), 14), 16.0f, 8.0f);
                    ie1 ie1VarA = ge1.a(new mv(8.0f, true, new gp(5)), bv4.z, dd4Var5, 6);
                    int iHashCode = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL = dd4Var5.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var5, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var);
                    } else {
                        dd4Var5.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var5, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var5, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var5, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var5, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var5, ou6VarL0);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL02 = gjb.l0(fe.L(t96.w(ou6VarF, ((q96) dd4Var5.j(ur9Var)).c.d), dd1.g(((q96) dd4Var5.j(ur9Var)).a, 2.0f), jf0.G), 12.0f);
                    ie1 ie1VarA2 = ge1.a(new mv(12.0f, true, new gp(5)), bv4.A, dd4Var5, 54);
                    int iHashCode2 = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL2 = dd4Var5.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var5, ou6VarL02);
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(jmVar, dd4Var5, ie1VarA2);
                    un9.s(jmVar2, dd4Var5, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var5, jmVar3, dd4Var5, kdVar);
                    un9.s(jmVar4, dd4Var5, ou6VarL03);
                    sg9.a(sgbVar.c, sgbVar.b, tg9.n(lu6Var, 72.0f), (ib4) null, dd4Var5, 384, 8);
                    String str2 = sgbVar.b;
                    dd4Var5.f0(2114633342);
                    List listY = list3.isEmpty() ? gc1.Y(new lc1(((q96) dd4Var5.j(ur9Var)).a.a)) : list3;
                    dd4Var5.q(false);
                    i12.c(str2, tg9.f(lu6Var, 1.0f), listY, 0L, 0L, new vaa(3), 0L, 2, false, 2, 0, ((q96) dd4Var5.j(ur9Var)).b.g, dd4Var5, 48, 3120, 54776);
                    dd4Var5.q(true);
                    if (zQ) {
                        dd4Var5.f0(784836611);
                        dd4Var5.q(false);
                    } else {
                        dd4Var5.f0(783905929);
                        boolean z2 = !z;
                        ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                        boolean zF5 = dd4Var5.f(kb4Var2) | dd4Var5.h(sgbVar);
                        Object objQ6 = dd4Var5.Q();
                        if (zF5 || objQ6 == obj4) {
                            objQ6 = new vf6(26, kb4Var2, sgbVar);
                            dd4Var5.p0(objQ6);
                        }
                        lc5.d((ib4) objQ6, ou6VarF2, z2, null, null, null, null, null, jf0.G(1499439764, new a41(5, z), dd4Var5), dd4Var5, 805306416, 504);
                        dd4Var5.q(false);
                    }
                    dd4Var5.q(true);
                }
                break;
            default:
                hk9 hk9Var = (hk9) obj7;
                je4 je4Var2 = (je4) obj6;
                ym ymVar = (ym) obj5;
                dd4 dd4Var6 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                if (z) {
                    je4Var = je4Var2;
                    ly5VarP = js8.p(gc1.Z(new lc1(lc1.i), new lc1(lc1.c(0.3f, lc1.b))), 0.0f, 14);
                } else {
                    je4Var = je4Var2;
                    ly5VarP = js8.p(gc1.Z(new lc1(lc1.c(0.3f, lc1.b)), new lc1(lc1.i)), 0.0f, 14);
                }
                ou6 ou6VarM02 = gjb.m0(fe.K(tg9.c(lu6Var, 1.0f), ly5VarP), 32.0f, 16.0f);
                eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(5)), bv4.x, dd4Var6, 54);
                int iHashCode3 = Long.hashCode(dd4Var6.T);
                lr7 lr7VarL3 = dd4Var6.l();
                ou6 ou6VarL04 = s32.L0(dd4Var6, ou6VarM02);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var6.j0();
                if (dd4Var6.S) {
                    dd4Var6.k(um1Var2);
                } else {
                    dd4Var6.s0();
                }
                un9.s(ll1.f, dd4Var6, eq8VarA);
                un9.s(ll1.e, dd4Var6, lr7VarL3);
                un9.s(ll1.g, dd4Var6, Integer.valueOf(iHashCode3));
                un9.r(dd4Var6, ll1.h);
                un9.s(ll1.d, dd4Var6, ou6VarL04);
                Object objQ7 = dd4Var6.Q();
                if (objQ7 == obj4) {
                    objQ7 = new nx9(hk9Var, 15);
                    dd4Var6.p0(objQ7);
                }
                vo1.h(hk9Var, z, (kb4) objQ7, dd4Var6, 390);
                String str3 = z ? "+" : "-";
                String str4 = str3 + ((Number) je4Var.g.getValue()).intValue() + "s";
                long j = lc1.e;
                uka ukaVar = ((q96) dd4Var6.j(s96.a)).b.j;
                boolean zH2 = dd4Var6.h(ymVar);
                Object objQ8 = dd4Var6.Q();
                if (zH2 || objQ8 == obj4) {
                    objQ8 = new sf6(ymVar, 2);
                    dd4Var6.p0(objQ8);
                }
                nha.c(str4, kl8.W(lu6Var, (kb4) objQ8), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var6, 384, 0, 131064);
                dd4Var6.q(true);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ sl9(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ sl9(sgb sgbVar, String str, boolean z, kb4 kb4Var) {
        this.a = 3;
        this.c = sgbVar;
        this.d = str;
        this.b = z;
        this.e = kb4Var;
    }
}
