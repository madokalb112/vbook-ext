package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ph1 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ ph1(int i, int i2, kb4 kb4Var, List list) {
        this.b = list;
        this.c = i;
        this.d = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        int i2 = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 2;
                if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i4 = 0;
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj3;
                        boolean z2 = i4 == i2;
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarW = t96.w(tg9.j(lu6Var, 40.0f, 0.0f, i3), tp8.a);
                        uo8 uo8Var = new uo8(4);
                        boolean zF = dd4Var.f(kb4Var) | dd4Var.d(i4);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == vl1.a) {
                            objQ = new bk0(kb4Var, i4, 1);
                            dd4Var.p0(objQ);
                        }
                        ou6 ou6VarN0 = gjb.n0(t96.P(ou6VarW, z2, uo8Var, (ib4) objQ), 16.0f, 0.0f, i3);
                        ha6 ha6VarD = pn0.d(bv4.b, false);
                        int iHashCode = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL = dd4Var.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
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
                        if (z2) {
                            dd4Var.f0(1684997882);
                            j = ((q96) dd4Var.j(s96.a)).a.a;
                            z = false;
                        } else {
                            z = false;
                            dd4Var.f0(1684999132);
                            j = ((q96) dd4Var.j(s96.a)).a.q;
                        }
                        dd4Var.q(z);
                        dd4 dd4Var2 = dd4Var;
                        nha.c(str, zn0.a.a(lu6Var, bv4.f), j, (g60) null, 0L, (t74) null, a84.u, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.i, dd4Var2, 1572864, 24576, 114616);
                        dd4Var2.q(true);
                        i3 = i3;
                        dd4Var = dd4Var2;
                        i4 = i5;
                    }
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            default:
                ((Integer) obj2).getClass();
                sp6.f(list, i2, kb4Var, (dd4) obj, qu1.x0(1));
                return hebVar;
        }
    }

    public /* synthetic */ ph1(kb4 kb4Var, List list, int i) {
        this.b = list;
        this.c = i;
        this.d = kb4Var;
    }
}
