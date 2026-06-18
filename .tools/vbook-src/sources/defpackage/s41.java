package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s41 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    public /* synthetic */ s41(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        uw1 uw1VarD;
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        List list = this.c;
        List list2 = this.b;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    ((Number) list2.get(iIntValue)).intValue();
                    dd4Var.f0(2018235496);
                    ou6 ou6VarW = t96.w(tg9.f(lu6Var, 1.0f), vm7.N(iIntValue, list.size(), dd4Var));
                    ur9 ur9Var = s96.a;
                    j1a.a(fe.L(ou6VarW, dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), (t89) null, lc1.c(0.0f, ((q96) dd4Var.j(ur9Var)).a.p), 0L, 0.0f, 0.0f, (wm0) null, lc5.o, dd4Var, 12582912, Token.FUNCTION);
                    dd4Var.q(false);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    ((Number) list2.get(iIntValue3)).intValue();
                    dd4Var2.f0(-283903236);
                    ou6 ou6VarW2 = t96.w(tg9.f(lu6Var, 1.0f), vm7.N(iIntValue3, list.size(), dd4Var2));
                    ur9 ur9Var2 = s96.a;
                    j1a.a(fe.L(ou6VarW2, dd1.g(((q96) dd4Var2.j(ur9Var2)).a, 1.0f), jf0.G), (t89) null, lc1.c(0.0f, ((q96) dd4Var2.j(ur9Var2)).a.p), 0L, 0.0f, 0.0f, (wm0) null, t1c.s, dd4Var2, 12582912, Token.FUNCTION);
                    dd4Var2.q(false);
                }
                break;
            default:
                dq5 dq5Var = (dq5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dq5Var) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    ((Number) list2.get(iIntValue5)).intValue();
                    dd4Var3.f0(207549207);
                    boolean z = iIntValue5 == 0;
                    boolean z2 = iIntValue5 == gc1.S(list);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    if (!z && !z2) {
                        dd4Var3.f0(422345797);
                        uw1VarD = ((q96) dd4Var3.j(s96.a)).c.a;
                        dd4Var3.q(false);
                    } else if (z && z2) {
                        dd4Var3.f0(422348544);
                        uw1VarD = ((q96) dd4Var3.j(s96.a)).c.d;
                        dd4Var3.q(false);
                    } else if (z) {
                        dd4Var3.f0(207984198);
                        ur9 ur9Var3 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var3.j(ur9Var3)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var3.j(ur9Var3)).c.a.c, ((q96) dd4Var3.j(ur9Var3)).c.a.d, 3);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(422360560);
                        ur9 ur9Var4 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var3.j(ur9Var4)).c.d, ((q96) dd4Var3.j(ur9Var4)).c.a.a, ((q96) dd4Var3.j(ur9Var4)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var3.q(false);
                    }
                    ou6 ou6VarW3 = t96.w(ou6VarF, uw1VarD);
                    ur9 ur9Var5 = s96.a;
                    ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW3, dd1.g(((q96) dd4Var3.j(ur9Var5)).a, 1.0f), jf0.G), 16.0f, 8.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
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
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var3, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var3, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var3, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var3, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var3, ou6VarL0);
                    ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var3, 48);
                    int iHashCode2 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL2 = dd4Var3.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarF2);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, eq8VarA);
                    un9.s(jmVar2, dd4Var3, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL02);
                    ah1.r(tg9.n(lu6Var, 30.0f), tp8.a, dd4Var3, 6, 0);
                    un9.a(dd4Var3, tg9.r(lu6Var, 8.0f));
                    ah1.r(tg9.h(tg9.f(lu6Var, 0.5f), 20.0f), ((q96) dd4Var3.j(ur9Var5)).c.b, dd4Var3, 6, 0);
                    xv5.z(dd4Var3, true, lu6Var, 6.0f, dd4Var3);
                    ah1.r(tg9.h(tg9.f(lu6Var, 0.8f), 16.0f), ((q96) dd4Var3.j(ur9Var5)).c.b, dd4Var3, 6, 0);
                    ah1.r(tg9.h(xv5.h(lu6Var, 6.0f, dd4Var3, lu6Var, 0.6f), 16.0f), ((q96) dd4Var3.j(ur9Var5)).c.b, dd4Var3, 6, 0);
                    dd4Var3.q(true);
                    dd4Var3.q(false);
                }
                break;
        }
        return hebVar;
    }
}
