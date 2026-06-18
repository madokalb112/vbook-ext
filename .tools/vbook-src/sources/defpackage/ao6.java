package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ao6 implements ac4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ ao6(v54 v54Var, pj7 pj7Var, szb szbVar, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var) {
        this.b = v54Var;
        this.c = pj7Var;
        this.d = szbVar;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.s = ib4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        jt1 jt1Var;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = this.s;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                a07 a07Var = (a07) obj10;
                f28 f28Var = (f28) obj8;
                zk7 zk7Var = (zk7) obj7;
                a07 a07Var2 = (a07) obj9;
                vx1 vx1Var = (vx1) obj6;
                List list = (List) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                ((Integer) obj4).getClass();
                ((rk7) obj).getClass();
                ti7 ti7Var = new ti7();
                float f = (116 & 2) != 0 ? 4.0f : 1.0f;
                if ((116 & 8) != 0) {
                    ti7Var = null;
                }
                od2 od2VarA = fp9.a(dd4Var);
                boolean zF = dd4Var.f(od2VarA);
                Object objQ = dd4Var.Q();
                Object obj11 = vl1.a;
                if (zF || objQ == obj11) {
                    od2VarA.getClass();
                    objQ = qu1.k0(new rhb(3), new nx9(od2VarA, 23));
                    dd4Var.p0(objQ);
                }
                qt8 qt8Var = (qt8) objQ;
                Object[] objArr = {od2VarA};
                boolean zH = dd4Var.h(od2VarA) | dd4Var.c(1.0f) | dd4Var.c(0.0f) | dd4Var.c(0.0f);
                Object objQ2 = dd4Var.Q();
                if (zH || objQ2 == obj11) {
                    objQ2 = new iub(od2VarA, 3);
                    dd4Var.p0(objQ2);
                }
                n7c n7cVar = (n7c) ww1.d0(objArr, qt8Var, (ib4) objQ2, dd4Var, 0);
                if (n7cVar.b != 1.0f) {
                    n7cVar.b = 1.0f;
                    n7cVar.n(n7cVar.f());
                }
                if (n7cVar.c != f) {
                    n7cVar.c = f;
                    n7cVar.n(n7cVar.f());
                }
                n7cVar.e = 2.0f;
                n7cVar.d.setValue(ti7Var);
                Boolean bool = (Boolean) a07Var.getValue();
                bool.getClass();
                boolean zF2 = dd4Var.f(a07Var) | dd4Var.f(n7cVar) | dd4Var.f(f28Var);
                Object objQ3 = dd4Var.Q();
                if (zF2 || objQ3 == obj11) {
                    objQ3 = new mt4(n7cVar, f28Var, a07Var, null, 11);
                    jt1Var = null;
                    dd4Var.p0(objQ3);
                } else {
                    jt1Var = null;
                }
                lc5.u((yb4) objQ3, dd4Var, bool);
                boolean z = iIntValue == zk7Var.k();
                if (z) {
                    dd4Var.f0(155935016);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    boolean zF3 = dd4Var.f(n7cVar);
                    Object objQ4 = dd4Var.Q();
                    if (zF3 || objQ4 == obj11) {
                        objQ4 = new do6(n7cVar, a07Var2, jt1Var, 0);
                        dd4Var.p0(objQ4);
                    }
                    lc5.u((yb4) objQ4, dd4Var, boolValueOf);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(156280976);
                    dd4Var.q(false);
                }
                px3 px3Var = tg9.c;
                ou6 ou6VarY = yn2.y(dd4Var, px3Var);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarY);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                long j = lc1.b;
                long jC = lc1.c(((Number) a07Var2.getValue()).floatValue(), j);
                lp4 lp4Var = jf0.G;
                pn0.a(fe.L(px3Var, jC, lp4Var), dd4Var, 0);
                Object objQ5 = dd4Var.Q();
                if (objQ5 == obj11) {
                    objQ5 = new zm6(13);
                    dd4Var.p0(objQ5);
                }
                lu6 lu6Var = lu6.a;
                ou6 ou6VarW = kl8.W(lu6Var, (kb4) objQ5);
                boolean zF4 = dd4Var.f(f28Var);
                Object objQ6 = dd4Var.Q();
                if (zF4 || objQ6 == obj11) {
                    objQ6 = new zn6(f28Var, 1);
                    dd4Var.p0(objQ6);
                }
                sg9.c(ou6VarW, n7cVar, false, true, (ib4) objQ6, jf0.G(-1799875796, new bo6(list, iIntValue, a07Var2, 0), dd4Var), dd4Var, 1597446);
                p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var, 0);
                ou6 ou6VarW2 = t96.w(tg9.n(gjb.l0(yb0.I(lc5.h0(lu6Var), 0.0f), 24.0f), 32.0f), tp8.a);
                boolean zH2 = dd4Var.h(vx1Var) | dd4Var.f(n7cVar) | dd4Var.f(f28Var);
                Object objQ7 = dd4Var.Q();
                if (zH2 || objQ7 == obj11) {
                    objQ7 = new ma0(16, vx1Var, n7cVar, f28Var);
                    dd4Var.p0(objQ7);
                }
                mx4.a(p35VarC, (String) null, gjb.l0(fe.L(fw.J(null, (ib4) objQ7, ou6VarW2, false, 15), lc1.c(0.8f, j), lp4Var), 6.0f), lc1.e, dd4Var, 3120, 0);
                dd4Var.q(true);
                break;
            default:
                v54 v54Var = (v54) obj10;
                pj7 pj7Var = (pj7) obj9;
                szb szbVar = (szb) obj8;
                kb4 kb4Var = (kb4) obj7;
                kb4 kb4Var2 = (kb4) obj6;
                ib4 ib4Var = (ib4) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                ((Integer) obj4).getClass();
                ((rk7) obj).getClass();
                lc5.o(iIntValue2 == 0 ? v54Var.d : v54Var.e, yib.w(pj7Var, gjb.q(0.0f, 44.0f, 0.0f, 0.0f, 13)), yib.w(szbVar, gjb.q(0.0f, 44.0f, 0.0f, 0.0f, 13)), null, kb4Var, kb4Var2, ib4Var, dd4Var2, 0);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ao6(a07 a07Var, f28 f28Var, al7 al7Var, a07 a07Var2, vx1 vx1Var, List list) {
        this.b = a07Var;
        this.d = f28Var;
        this.e = al7Var;
        this.c = a07Var2;
        this.f = vx1Var;
        this.s = list;
    }
}
