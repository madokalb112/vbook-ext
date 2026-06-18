package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class m85 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ m85(kb4 kb4Var, a07 a07Var, kb4 kb4Var2, z44 z44Var, uk9 uk9Var, a07 a07Var2) {
        this.a = 0;
        this.c = kb4Var;
        this.e = a07Var;
        this.d = kb4Var2;
        this.f = z44Var;
        this.s = uk9Var;
        this.b = a07Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.ArrayList] */
    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ?? S0;
        br9 br9Var;
        kb4 kb4Var;
        heb hebVar;
        a07 a07Var;
        boolean z;
        int i = this.a;
        iv ivVar = pv.a;
        jv jvVar = pv.c;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        Object obj5 = this.d;
        heb hebVar2 = heb.a;
        int i2 = 16;
        Object obj6 = this.e;
        Object obj7 = this.s;
        Object obj8 = this.b;
        Object obj9 = this.c;
        Object obj10 = this.f;
        switch (i) {
            case 0:
                kb4 kb4Var2 = (kb4) obj9;
                br9 br9Var2 = (br9) obj6;
                kb4 kb4Var3 = (kb4) obj5;
                z44 z44Var = (z44) obj10;
                uk9 uk9Var = (uk9) obj7;
                a07 a07Var2 = (a07) obj8;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ou6 ou6VarE = yn2.E(yib.E(yn2.y(dd4Var, fe.L(tg9.c, ((q96) dd4Var.j(s96.a)).a.p, jf0.G)), 15), dd4Var, 0);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var, ou6VarL0);
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var, 48);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarN0);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, eq8VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    un9.a(dd4Var, tg9.r(lu6Var, 6.0f));
                    p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
                    String strK = wn9.K((pv9) vt9.I.getValue(), dd4Var);
                    ou6 ou6VarW = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF = dd4Var.f(kb4Var3);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new b41(17, kb4Var3);
                        dd4Var.p0(objQ);
                    }
                    mx4.a(p35VarC, strK, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f), 0L, dd4Var, 0, 8);
                    String str = ((jq0) br9Var2.getValue()).a;
                    ou6 ou6VarL03 = gjb.l0(tg9.n(lu6Var, 24.0f), 2.0f);
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj4) {
                        objQ2 = new dh1(1);
                        dd4Var.p0(objQ2);
                    }
                    wx1.x(str, fw.J(null, (ib4) objQ2, ou6VarL03, false, 15), dd4Var, 0);
                    un9.a(dd4Var, tg9.r(lu6Var, 6.0f));
                    String strK2 = wn9.K((pv9) mu9.c0.getValue(), dd4Var);
                    wga wgaVar = (wga) a07Var2.getValue();
                    long j = lc1.i;
                    bp5 bp5Var = new bp5(1.0f, true);
                    Object objQ3 = dd4Var.Q();
                    if (objQ3 == obj4) {
                        objQ3 = new tn4(a07Var2, 18);
                        dd4Var.p0(objQ3);
                    }
                    kb4 kb4Var4 = (kb4) objQ3;
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.f(br9Var2) | dd4Var.f(uk9Var);
                    Object objQ4 = dd4Var.Q();
                    if (zF2 || objQ4 == obj4) {
                        objQ4 = new wp0(kb4Var2, uk9Var, a07Var2, br9Var2);
                        dd4Var.p0(objQ4);
                    }
                    e11.A(wgaVar, strK2, 0L, j, null, z44Var, bp5Var, kb4Var4, (ib4) objQ4, dd4Var, 12807168, 4);
                    dd4Var.q(true);
                    y86.c(0.0f, 6, 6, 0L, dd4Var, tg9.f(lu6Var, 1.0f));
                    String str2 = ((wga) a07Var2.getValue()).a.b;
                    List list = ((jq0) br9Var2.getValue()).c;
                    List list2 = ((jq0) br9Var2.getValue()).d;
                    bp5 bp5Var2 = new bp5(1.0f, true);
                    boolean zF3 = dd4Var.f(br9Var2) | dd4Var.f(kb4Var2);
                    Object objQ5 = dd4Var.Q();
                    if (zF3 || objQ5 == obj4) {
                        objQ5 = new ej4(8, kb4Var2, br9Var2);
                        dd4Var.p0(objQ5);
                    }
                    kb4 kb4Var5 = (kb4) objQ5;
                    Object objQ6 = dd4Var.Q();
                    if (objQ6 == obj4) {
                        objQ6 = new tn4(a07Var2, 19);
                        dd4Var.p0(objQ6);
                    }
                    kb4 kb4Var6 = (kb4) objQ6;
                    Object objQ7 = dd4Var.Q();
                    if (objQ7 == obj4) {
                        objQ7 = new fz4(9);
                        dd4Var.p0(objQ7);
                    }
                    kb4 kb4Var7 = (kb4) objQ7;
                    Object objQ8 = dd4Var.Q();
                    if (objQ8 == obj4) {
                        objQ8 = new fz4(10);
                        dd4Var.p0(objQ8);
                    }
                    wx1.A(str2, list, list2, bp5Var2, kb4Var2, kb4Var5, kb4Var6, kb4Var7, (kb4) objQ8, dd4Var, 114819072);
                    dd4Var.q(true);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                pj7 pj7Var = (pj7) obj9;
                szb szbVar = (szb) obj5;
                t27 t27Var = (t27) obj6;
                a07 a07Var3 = (a07) obj8;
                a07 a07Var4 = (a07) obj10;
                a07 a07Var5 = (a07) obj7;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mb9 mb9Var = (mb9) a07Var5.getValue();
                    int i3 = iIntValue2;
                    px3 px3Var = tg9.c;
                    boolean zF4 = dd4Var2.f(t27Var);
                    Object objQ9 = dd4Var2.Q();
                    if (zF4 || objQ9 == obj4) {
                        objQ9 = new cl0(t27Var, i2);
                        dd4Var2.p0(objQ9);
                    }
                    kb4 kb4Var8 = (kb4) objQ9;
                    boolean zF5 = dd4Var2.f(a07Var3) | dd4Var2.f(a07Var4);
                    Object objQ10 = dd4Var2.Q();
                    if (zF5 || objQ10 == obj4) {
                        objQ10 = new rl0(a07Var3, a07Var4, 25);
                        dd4Var2.p0(objQ10);
                    }
                    p7c.C(co0Var, mb9Var, pj7Var, szbVar, px3Var, kb4Var8, (kb4) objQ10, dd4Var2, (i3 & 14) | 24576);
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                wga wgaVar2 = (wga) obj6;
                kb4 kb4Var9 = (kb4) obj9;
                ib4 ib4Var = (ib4) obj10;
                t61 t61Var = (t61) obj7;
                st5 st5Var = (st5) obj8;
                kb4 kb4Var10 = (kb4) obj5;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strK3 = wn9.K((pv9) mu9.g0.getValue(), dd4Var3);
                    ur9 ur9Var = s96.a;
                    long jG = dd1.g(((q96) dd4Var3.j(ur9Var)).a, 4.0f);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF6 = dd4Var3.f(ib4Var);
                    Object objQ11 = dd4Var3.Q();
                    if (zF6 || objQ11 == obj4) {
                        objQ11 = new m50(21, ib4Var);
                        dd4Var3.p0(objQ11);
                    }
                    e11.A(wgaVar2, strK3, 0L, jG, null, null, ou6VarF, kb4Var9, (ib4) objQ11, dd4Var3, 1572864, 52);
                    nha.c(wn9.L((pv9) zt9.x.getValue(), new Object[]{Integer.valueOf(t61Var.z.size())}, dd4Var3), (ou6) null, ((q96) dd4Var3.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.l, dd4Var3, 0, 0, 131066);
                    ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 360.0f);
                    mv mvVar = new mv(6.0f, true, new gp(5));
                    boolean zF7 = dd4Var3.f(t61Var) | dd4Var3.f(kb4Var10);
                    Object objQ12 = dd4Var3.Q();
                    if (zF7 || objQ12 == obj4) {
                        objQ12 = new v(18, t61Var, kb4Var10);
                        dd4Var3.p0(objQ12);
                    }
                    rw1.j(ou6VarH, st5Var, null, false, mvVar, null, null, false, null, (kb4) objQ12, dd4Var3, 24582, 492);
                } else {
                    dd4Var3.Y();
                }
                break;
            case 3:
                Set set = (Set) obj9;
                Set set2 = (Set) obj6;
                a07 a07Var6 = (a07) obj8;
                List list3 = (List) obj10;
                c37 c37Var = (c37) obj7;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zH = dd4Var4.h(set);
                    Object obj11 = this.d;
                    boolean zH2 = dd4Var4.h(obj11) | zH | dd4Var4.h(set2) | dd4Var4.f(a07Var6);
                    Object objQ13 = dd4Var4.Q();
                    if (zH2 || objQ13 == obj4) {
                        um umVar = new um(set, obj11, set2, a07Var6, 7);
                        dd4Var4.p0(umVar);
                        objQ13 = umVar;
                    }
                    lc5.j(obj11, (kb4) objQ13, dd4Var4);
                    dd4Var4.f0(358947325);
                    if (list3 instanceof RandomAccess) {
                        uz6 uz6Var = new uz6(list3.size());
                        S0 = new ArrayList(list3.size());
                        int size = list3.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj12 = list3.get(i4);
                            if (uz6Var.a(obj12)) {
                                S0.add(obj12);
                            }
                        }
                    } else {
                        S0 = fc1.s0(list3);
                    }
                    if (!S0.isEmpty()) {
                        ListIterator listIterator = S0.listIterator(S0.size());
                        while (listIterator.hasPrevious()) {
                            c37Var = new c37(c37Var, jf0.G(-330823412, new qz0(10, (d37) listIterator.previous(), c37Var), dd4Var4));
                        }
                    }
                    dd4Var4.q(false);
                    c37Var.a(dd4Var4, 0);
                } else {
                    dd4Var4.Y();
                }
                break;
            case 4:
                rj7 rj7Var = (rj7) obj6;
                kr3 kr3Var = (kr3) obj10;
                kb4 kb4Var11 = (kb4) obj9;
                kb4 kb4Var12 = (kb4) obj5;
                kb4 kb4Var13 = (kb4) obj7;
                kb4 kb4Var14 = (kb4) obj8;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    rw1.c(kr3Var, gjb.k0(tg9.f(lu6Var, 1.0f), rj7Var), kb4Var11, kb4Var12, kb4Var13, kb4Var14, dd4Var5, 0);
                } else {
                    dd4Var5.Y();
                }
                break;
            default:
                mo4 mo4Var = (mo4) obj10;
                kb4 kb4Var15 = (kb4) obj9;
                kb4 kb4Var16 = (kb4) obj5;
                a07 a07Var7 = (a07) obj8;
                kb4 kb4Var17 = (kb4) obj7;
                br9 br9Var3 = (br9) obj6;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    uk9 uk9Var2 = (uk9) dd4Var6.j(xm1.q);
                    Object objQ14 = dd4Var6.Q();
                    if (objQ14 == obj4) {
                        objQ14 = ky0.f(dd4Var6);
                    }
                    z44 z44Var2 = (z44) objQ14;
                    Object objQ15 = dd4Var6.Q();
                    if (objQ15 == obj4) {
                        kb4Var = kb4Var16;
                        hebVar = hebVar2;
                        br9Var = br9Var3;
                        objQ15 = dk9.x(new wga("", zk9.h(0, 0), 4));
                        dd4Var6.p0(objQ15);
                    } else {
                        br9Var = br9Var3;
                        kb4Var = kb4Var16;
                        hebVar = hebVar2;
                    }
                    a07 a07Var8 = (a07) objQ15;
                    String str3 = ((wga) a07Var8.getValue()).a.b;
                    boolean zF8 = dd4Var6.f(mo4Var);
                    Object objQ16 = dd4Var6.Q();
                    if (zF8 || objQ16 == obj4) {
                        objQ16 = new fl6(mo4Var, a07Var8, null, 0);
                        dd4Var6.p0(objQ16);
                    }
                    lc5.u((yb4) objQ16, dd4Var6, str3);
                    boolean zF9 = dd4Var6.f(uk9Var2);
                    Object objQ17 = dd4Var6.Q();
                    if (zF9 || objQ17 == obj4) {
                        objQ17 = new gl6(z44Var2, uk9Var2, null, 0);
                        dd4Var6.p0(objQ17);
                    }
                    lc5.u((yb4) objQ17, dd4Var6, z44Var2);
                    ou6 ou6VarR = tg9.r(lu6Var, 360.0f);
                    ou6VarR.getClass();
                    ou6 ou6VarX = s32.X(ou6VarR, new tn8(7));
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarE2 = yn2.E(fe.L(t96.w(ou6VarX, ((q96) dd4Var6.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var6.j(ur9Var2)).a, 1.0f), jf0.G), dd4Var6, 0);
                    ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var6, 0);
                    int iHashCode3 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL3 = dd4Var6.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var6, ou6VarE2);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var2);
                    } else {
                        dd4Var6.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var6, ie1VarA2);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var6, lr7VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var6, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var6, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var6, ou6VarL04);
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var6, 48);
                    int iHashCode4 = Long.hashCode(dd4Var6.T);
                    lr7 lr7VarL4 = dd4Var6.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var6, ou6VarN02);
                    dd4Var6.j0();
                    if (dd4Var6.S) {
                        dd4Var6.k(um1Var2);
                    } else {
                        dd4Var6.s0();
                    }
                    un9.s(jmVar5, dd4Var6, eq8VarA2);
                    un9.s(jmVar6, dd4Var6, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var6, jmVar7, dd4Var6, kdVar2);
                    un9.s(jmVar8, dd4Var6, ou6VarL05);
                    un9.a(dd4Var6, tg9.r(lu6Var, 6.0f));
                    p35 p35VarC2 = i25.c((m53) a53.w.getValue(), dd4Var6, 0);
                    String strK4 = wn9.K((pv9) vt9.w0.getValue(), dd4Var6);
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF10 = dd4Var6.f(kb4Var17);
                    Object objQ18 = dd4Var6.Q();
                    if (zF10 || objQ18 == obj4) {
                        objQ18 = new tk6(2, kb4Var17);
                        dd4Var6.p0(objQ18);
                    }
                    mx4.a(p35VarC2, strK4, gjb.l0(fw.J(null, (ib4) objQ18, ou6VarW2, false, 15), 8.0f), 0L, dd4Var6, 0, 8);
                    String strK5 = wn9.K((pv9) mu9.c0.getValue(), dd4Var6);
                    wga wgaVar3 = (wga) a07Var8.getValue();
                    long j2 = lc1.i;
                    bp5 bp5Var3 = new bp5(1.0f, true);
                    Object objQ19 = dd4Var6.Q();
                    if (objQ19 == obj4) {
                        a07Var = a07Var8;
                        objQ19 = new ci6(a07Var, 27);
                        dd4Var6.p0(objQ19);
                    } else {
                        a07Var = a07Var8;
                    }
                    kb4 kb4Var18 = (kb4) objQ19;
                    boolean zF11 = dd4Var6.f(uk9Var2) | dd4Var6.f(mo4Var) | dd4Var6.f(a07Var7);
                    Object objQ20 = dd4Var6.Q();
                    if (zF11 || objQ20 == obj4) {
                        objQ20 = new zk6(uk9Var2, mo4Var, a07Var, a07Var7, 0);
                        dd4Var6.p0(objQ20);
                    }
                    e11.A(wgaVar3, strK5, 0L, j2, null, z44Var2, bp5Var3, kb4Var18, (ib4) objQ20, dd4Var6, 12807168, 4);
                    dd4Var6.q(true);
                    if (((ko4) br9Var.getValue()).a.isEmpty() && ((ko4) br9Var.getValue()).b.isEmpty()) {
                        dd4Var6.f0(1708800671);
                        dd4Var6.q(false);
                    } else {
                        dd4Var6.f0(1707819490);
                        y86.c(0.0f, 6, 6, 0L, dd4Var6, tg9.f(lu6Var, 1.0f));
                        String str4 = ((wga) a07Var.getValue()).a.b;
                        List list4 = ((ko4) br9Var.getValue()).a;
                        List list5 = ((ko4) br9Var.getValue()).b;
                        ou6 ou6VarN03 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                        boolean zF12 = dd4Var6.f(uk9Var2) | dd4Var6.f(mo4Var) | dd4Var6.f(a07Var7);
                        Object objQ21 = dd4Var6.Q();
                        if (zF12 || objQ21 == obj4) {
                            objQ21 = new al6(uk9Var2, mo4Var, a07Var7, 0);
                            dd4Var6.p0(objQ21);
                        }
                        kb4 kb4Var19 = (kb4) objQ21;
                        Object objQ22 = dd4Var6.Q();
                        if (objQ22 == obj4) {
                            objQ22 = new ci6(a07Var, 28);
                            dd4Var6.p0(objQ22);
                        }
                        kb4 kb4Var20 = (kb4) objQ22;
                        boolean zF13 = dd4Var6.f(mo4Var);
                        Object objQ23 = dd4Var6.Q();
                        if (zF13 || objQ23 == obj4) {
                            z = false;
                            objQ23 = new bl6(mo4Var, 0);
                            dd4Var6.p0(objQ23);
                        } else {
                            z = false;
                        }
                        t96.j(str4, list4, list5, ou6VarN03, kb4Var15, kb4Var, kb4Var19, kb4Var20, (kb4) objQ23, dd4Var6, 12585984);
                        dd4Var6.q(z);
                    }
                    dd4Var6.q(true);
                } else {
                    dd4Var6.Y();
                }
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ m85(mo4 mo4Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var, kb4 kb4Var3, a07 a07Var2) {
        this.a = 5;
        this.f = mo4Var;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.b = a07Var;
        this.s = kb4Var3;
        this.e = a07Var2;
    }

    public /* synthetic */ m85(rj7 rj7Var, kr3 kr3Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4) {
        this.a = 4;
        this.e = rj7Var;
        this.f = kr3Var;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.s = kb4Var3;
        this.b = kb4Var4;
    }

    public /* synthetic */ m85(wga wgaVar, kb4 kb4Var, ib4 ib4Var, t61 t61Var, st5 st5Var, kb4 kb4Var2) {
        this.a = 2;
        this.e = wgaVar;
        this.c = kb4Var;
        this.f = ib4Var;
        this.s = t61Var;
        this.b = st5Var;
        this.d = kb4Var2;
    }

    public /* synthetic */ m85(Object obj, Object obj2, Object obj3, a07 a07Var, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = a07Var;
        this.f = obj4;
        this.s = obj5;
    }
}
