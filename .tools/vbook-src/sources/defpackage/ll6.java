package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ll6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll6(int i, List list, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
        this.d = obj;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zn0 zn0Var = zn0.a;
        Object obj4 = vl1.a;
        iv ivVar = pv.a;
        boolean z = true;
        float f = 1.0f;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Object obj5 = this.d;
        hk9 hk9Var = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                kb4 kb4Var = (kb4) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
                }
                if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.w, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
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
                    dd4Var.f0(155854091);
                    int i3 = 0;
                    for (Object obj6 : hk9Var) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj6;
                        ou6 ou6VarH = tg9.h(new bp5(1.0f, true), 36.0f);
                        ur9 ur9Var = s96.a;
                        ou6 ou6VarW = t96.w(ou6VarH, ((q96) dd4Var.j(ur9Var)).c.c);
                        boolean zF = dd4Var.f(kb4Var) | dd4Var.d(i3);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj4) {
                            objQ = new bk0(kb4Var, i3, 5);
                            dd4Var.p0(objQ);
                        }
                        ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
                        ha6 ha6VarD = pn0.d(bv4.b, false);
                        int iHashCode2 = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL2 = dd4Var.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarJ);
                        ml1.k.getClass();
                        um1 um1Var2 = ll1.b;
                        dd4Var.j0();
                        co0 co0Var2 = co0Var;
                        if (dd4Var.S) {
                            dd4Var.k(um1Var2);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(ll1.f, dd4Var, ha6VarD);
                        un9.s(ll1.e, dd4Var, lr7VarL2);
                        un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode2));
                        un9.r(dd4Var, ll1.h);
                        un9.s(ll1.d, dd4Var, ou6VarL02);
                        nha.c(str, zn0Var.a(lu6Var, bv4.f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 0, 0, 130044);
                        dd4Var.q(true);
                        co0Var = co0Var2;
                        i3 = i4;
                    }
                    co0 co0Var3 = co0Var;
                    dd4Var.q(false);
                    dd4Var.q(true);
                    ou6 ou6VarH2 = tg9.h(tg9.r(vm7.c0(lu6Var, ((x13) an.a((co0Var3.d() * i2) / hk9Var.size(), (by3) null, (String) null, dd4Var, 0, 14).getValue()).a), co0Var3.d() / hk9Var.size()), 36.0f);
                    ur9 ur9Var2 = s96.a;
                    pn0.a(fw.G(fe.L(ou6VarH2, lc1.c(0.2f, ((q96) dd4Var.j(ur9Var2)).a.a), ((q96) dd4Var.j(ur9Var2)).c.c), 1.0f, lc1.c(0.6f, ((q96) dd4Var.j(ur9Var2)).a.a), ((q96) dd4Var.j(ur9Var2)).c.c), dd4Var, 0);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                kb4 kb4Var2 = (kb4) obj5;
                co0 co0Var4 = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                co0Var4.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(co0Var4) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var2, 0);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF2);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var3);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, eq8VarA2);
                    un9.s(ll1.e, dd4Var2, lr7VarL3);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL03);
                    dd4Var2.f0(-1471636799);
                    int i5 = 0;
                    for (Object obj7 : hk9Var) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str2 = (String) obj7;
                        ou6 ou6VarH3 = tg9.h(new bp5(f, z), 36.0f);
                        ur9 ur9Var3 = s96.a;
                        ou6 ou6VarW2 = t96.w(ou6VarH3, ((q96) dd4Var2.j(ur9Var3)).c.c);
                        boolean zF2 = dd4Var2.f(kb4Var2) | dd4Var2.d(i5);
                        Object objQ2 = dd4Var2.Q();
                        if (zF2 || objQ2 == obj4) {
                            objQ2 = new bk0(kb4Var2, i5, 11);
                            dd4Var2.p0(objQ2);
                        }
                        ou6 ou6VarJ2 = fw.J(null, (ib4) objQ2, ou6VarW2, false, 15);
                        ha6 ha6VarD2 = pn0.d(bv4.b, false);
                        int iHashCode4 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL4 = dd4Var2.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarJ2);
                        ml1.k.getClass();
                        um1 um1Var4 = ll1.b;
                        dd4Var2.j0();
                        co0 co0Var5 = co0Var4;
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var4);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, ha6VarD2);
                        un9.s(ll1.e, dd4Var2, lr7VarL4);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode4));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL04);
                        dd4 dd4Var3 = dd4Var2;
                        nha.c(str2, zn0Var.a(lu6Var, bv4.f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var3)).b.k, dd4Var3, 0, 0, 130044);
                        dd4Var3.q(true);
                        dd4Var2 = dd4Var3;
                        z = true;
                        i5 = i6;
                        f = 1.0f;
                        co0Var4 = co0Var5;
                    }
                    co0 co0Var6 = co0Var4;
                    dd4 dd4Var4 = dd4Var2;
                    dd4Var4.q(false);
                    dd4Var4.q(z);
                    ou6 ou6VarH4 = tg9.h(tg9.r(vm7.c0(lu6Var, ((x13) an.a((co0Var6.d() * i2) / hk9Var.size(), (by3) null, (String) null, dd4Var4, 0, 14).getValue()).a), co0Var6.d() / hk9Var.size()), 36.0f);
                    ur9 ur9Var4 = s96.a;
                    pn0.a(fw.G(fe.L(ou6VarH4, lc1.c(0.2f, ((q96) dd4Var4.j(ur9Var4)).a.a), ((q96) dd4Var4.j(ur9Var4)).c.c), 1.0f, lc1.c(0.6f, ((q96) dd4Var4.j(ur9Var4)).a.a), ((q96) dd4Var4.j(ur9Var4)).c.c), dd4Var4, 0);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            default:
                List list = (List) obj;
                ((Integer) obj3).getClass();
                list.getClass();
                zk4 zk4Var = zk4.x;
                z8a z8aVar = (z8a) list.get(i2);
                float f2 = ((x13) hk9Var.get(i2)).a;
                z8aVar.getClass();
                zk4Var.b(s32.X(lu6Var, new h63(f2, 2, z8aVar)).e((ou6) obj5), 0.0f, 0L, (dd4) obj2, 0);
                return hebVar;
        }
    }
}
