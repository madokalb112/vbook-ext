package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ee4 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ yb4 c;

    public /* synthetic */ ee4(int i, yb4 yb4Var, List list) {
        this.a = i;
        this.b = list;
        this.c = yb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 2;
        float f = 0.0f;
        lu6 lu6Var = lu6.a;
        boolean z = false;
        yb4 yb4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((dq5) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
                    un9.s(ll1.f, dd4Var, ie1VarA);
                    un9.s(ll1.e, dd4Var, lr7VarL);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL0);
                    lx1.c(list, gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), yb4Var, dd4Var, 48);
                    dd4Var.q(true);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        de4 de4Var = (de4) list.get(i3);
                        ou6 ou6VarL02 = gjb.l0(lu6Var, 3.0f);
                        boolean z2 = de4Var.b.length() > 0 ? true : z;
                        boolean zF = dd4Var2.f(yb4Var) | dd4Var2.h(de4Var);
                        Object objQ = dd4Var2.Q();
                        if (zF || objQ == vl1.a) {
                            objQ = new al3(12, yb4Var, de4Var);
                            dd4Var2.p0(objQ);
                        }
                        ou6 ou6VarW = t96.w(yn2.s(ou6VarL02, z2, f, (ib4) objQ, i2), tp8.a);
                        ur9 ur9Var = s96.a;
                        ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f), jf0.G), 12.0f, 4.0f);
                        ha6 ha6VarD = pn0.d(bv4.b, z);
                        int iHashCode2 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL2 = dd4Var2.l();
                        ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarM0);
                        ml1.k.getClass();
                        um1 um1Var2 = ll1.b;
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var2);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(ll1.f, dd4Var2, ha6VarD);
                        un9.s(ll1.e, dd4Var2, lr7VarL2);
                        un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                        un9.r(dd4Var2, ll1.h);
                        un9.s(ll1.d, dd4Var2, ou6VarL03);
                        dd4 dd4Var3 = dd4Var2;
                        nha.c(de4Var.a, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.n, dd4Var3, 0, 0, 131066);
                        dd4Var3.q(true);
                        i3++;
                        dd4Var2 = dd4Var3;
                        i2 = 2;
                        f = 0.0f;
                        z = false;
                    }
                }
                break;
        }
        return hebVar;
    }
}
