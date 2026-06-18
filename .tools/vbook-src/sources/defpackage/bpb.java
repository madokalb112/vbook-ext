package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bpb implements yb4 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ bpb(t61 t61Var, fv1 fv1Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var, a07 a07Var) {
        this.b = t61Var;
        this.c = fv1Var;
        this.s = ib4Var;
        this.t = ib4Var2;
        this.u = ib4Var3;
        this.d = ib4Var4;
        this.e = kb4Var;
        this.f = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i;
        t61 t61Var;
        int i2;
        int i3 = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj10;
                List list = (List) obj9;
                lnb lnbVar = (lnb) obj8;
                kb4 kb4Var = (kb4) obj7;
                ib4 ib4Var = (ib4) obj5;
                ib4 ib4Var2 = (ib4) obj4;
                ib4 ib4Var3 = (ib4) obj3;
                kb4 kb4Var2 = (kb4) obj6;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    fz1.H(str, list, lnbVar, kb4Var, yib.B(tg9.c, 3), null, null, ib4Var, ib4Var2, ib4Var3, kb4Var2, dd4Var, 0);
                }
                break;
            case 1:
                dsa dsaVar = (dsa) obj10;
                uf2 uf2Var = (uf2) obj9;
                c73 c73Var = (c73) obj8;
                t27 t27Var = (t27) obj7;
                rla rlaVar = (rla) obj6;
                u14 u14Var = (u14) obj5;
                cq9 cq9Var = (cq9) obj4;
                fq9 fq9Var = (fq9) obj3;
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean z = Settings.Secure.getInt(((Context) dd4Var2.j(he.b)).getContentResolver(), "navigation_mode", 0) == 2;
                    jj4 jj4Var = (jj4) dd4Var2.j(xm1.l);
                    int i4 = dsaVar.l;
                    boolean zG = dd4Var2.g(z) | dd4Var2.d(i4);
                    Object objQ = dd4Var2.Q();
                    Object obj11 = vl1.a;
                    if (zG || objQ == obj11) {
                        objQ = Boolean.valueOf((z || i4 == 3 || i4 == 0) ? false : true);
                        dd4Var2.p0(objQ);
                    }
                    boolean zBooleanValue = ((Boolean) objQ).booleanValue();
                    boolean zG2 = dd4Var2.g(z) | dd4Var2.d(i4);
                    Object objQ2 = dd4Var2.Q();
                    if (zG2 || objQ2 == obj11) {
                        objQ2 = Boolean.valueOf((z || i4 == 2 || i4 == 0) ? false : true);
                        dd4Var2.p0(objQ2);
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ2).booleanValue();
                    boolean zH = dd4Var2.h(jj4Var);
                    Object objQ3 = dd4Var2.Q();
                    if (zH || objQ3 == obj11) {
                        objQ3 = new ub(jj4Var, 11);
                        dd4Var2.p0(objQ3);
                    }
                    yn2.j(uf2Var, (ou6) null, zBooleanValue, zBooleanValue2, 0.0f, 0.0f, 0.0f, (ib4) objQ3, jf0.G(-763865353, new nt(dsaVar, c73Var, t27Var, rlaVar, u14Var, cq9Var, fq9Var, 0), dd4Var2), dd4Var2, 48);
                }
                break;
            case 2:
                t61 t61Var2 = (t61) obj10;
                fv1 fv1Var = (fv1) obj9;
                ib4 ib4Var4 = (ib4) obj5;
                ib4 ib4Var5 = (ib4) obj4;
                ib4 ib4Var6 = (ib4) obj3;
                ib4 ib4Var7 = (ib4) obj8;
                kb4 kb4Var3 = (kb4) obj7;
                a07 a07Var = (a07) obj6;
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    ou6 ou6VarM0 = gjb.m0(yib.E(tg9.f(lu6.a, 1.0f), 13), 16.0f, 8.0f);
                    ie1 ie1VarA = ge1.a(new mv(8.0f, true, new gp(5)), bv4.z, dd4Var3, 6);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ie1VarA);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                    fe.E(jf0.G(-615725766, new qz0(7, fv1Var, t61Var2), dd4Var3), dd4Var3, 6);
                    if (t61Var2.s || t61Var2.u || t61Var2.r) {
                        i = 0;
                        dd4Var3.f0(-1682022366);
                        t61Var = t61Var2;
                        i2 = 6;
                        fe.E(jf0.G(390056703, new sz0(t61Var, ib4Var4, ib4Var5, ib4Var6, ib4Var7), dd4Var3), dd4Var3, 6);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(-1680727899);
                        i = 0;
                        dd4Var3.q(false);
                        t61Var = t61Var2;
                        i2 = 6;
                    }
                    fe.E(jf0.G(1983858595, new c41(i, t61Var, kb4Var3, a07Var), dd4Var3), dd4Var3, i2);
                    dd4Var3.q(true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                m79.f((cm3) obj10, (ib4) obj5, (kb4) obj7, (kb4) obj6, (kb4) obj9, (kb4) obj8, (kb4) obj3, (ib4) obj4, (dd4) obj, qu1.x0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rj9.a((t27) obj10, (hra) obj9, (xga) obj8, (yba) obj7, (lra) obj6, (aoa) obj5, (pj7) obj4, (ou6) obj3, (dd4) obj, qu1.x0(12582913));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ bpb(cm3 cm3Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, ib4 ib4Var2, int i) {
        this.b = cm3Var;
        this.s = ib4Var;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.c = kb4Var3;
        this.d = kb4Var4;
        this.u = kb4Var5;
        this.t = ib4Var2;
    }

    public /* synthetic */ bpb(t27 t27Var, hra hraVar, xga xgaVar, yba ybaVar, lra lraVar, aoa aoaVar, pj7 pj7Var, ou6 ou6Var, int i) {
        this.b = t27Var;
        this.c = hraVar;
        this.d = xgaVar;
        this.e = ybaVar;
        this.f = lraVar;
        this.s = aoaVar;
        this.t = pj7Var;
        this.u = ou6Var;
    }

    public /* synthetic */ bpb(dsa dsaVar, uf2 uf2Var, c73 c73Var, t27 t27Var, rla rlaVar, u14 u14Var, cq9 cq9Var, fq9 fq9Var) {
        this.b = dsaVar;
        this.c = uf2Var;
        this.d = c73Var;
        this.e = t27Var;
        this.f = rlaVar;
        this.s = u14Var;
        this.t = cq9Var;
        this.u = fq9Var;
    }

    public /* synthetic */ bpb(String str, List list, lnb lnbVar, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, kb4 kb4Var2) {
        this.b = str;
        this.c = list;
        this.d = lnbVar;
        this.e = kb4Var;
        this.s = ib4Var;
        this.t = ib4Var2;
        this.u = ib4Var3;
        this.f = kb4Var2;
    }
}
