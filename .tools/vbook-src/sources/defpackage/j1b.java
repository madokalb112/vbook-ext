package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j1b implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;

    public /* synthetic */ j1b(int i, kb4 kb4Var) {
        this.a = i;
        this.b = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Integer) obj2).intValue();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        ((dr5) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= dd4Var.d(iIntValue) ? 32 : 16;
        }
        if (dd4Var.V(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
            boolean z = this.a == iIntValue;
            ou6 ou6VarE0 = sdc.e0(0.75f, tg9.c(gjb.l0(lu6.a, 4.0f), 1.0f), true);
            long j = s00.o(dd4Var).q;
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(fw.G(ou6VarE0, 1.0f, j, lp4Var), lc1.c(z ? 0.3f : 0.1f, s00.o(dd4Var).a), lp4Var);
            kb4 kb4Var = this.b;
            boolean zF = ((iIntValue2 & Token.ASSIGN_MOD) == 32) | dd4Var.f(kb4Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new bk0(kb4Var, iIntValue, 16);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarL, false, 15);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarJ);
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
            switch (iIntValue) {
                case 0:
                    dd4Var.f0(2114369479);
                    ql9.h(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 1:
                    dd4Var.f0(2114610535);
                    ql9.i(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 2:
                    dd4Var.f0(2114851591);
                    ql9.j(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 3:
                    dd4Var.f0(2115092647);
                    ql9.k(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 4:
                    dd4Var.f0(2115333703);
                    ql9.l(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 5:
                    dd4Var.f0(2115574759);
                    ql9.m(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 6:
                    dd4Var.f0(2115815815);
                    ql9.n(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                case 7:
                    dd4Var.f0(2116056871);
                    ql9.o(s00.o(dd4Var).q, tg9.c, dd4Var, 48);
                    dd4Var.q(false);
                    break;
                default:
                    dd4Var.f0(2116282303);
                    dd4Var.q(false);
                    break;
            }
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
