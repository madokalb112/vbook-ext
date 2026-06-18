package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class np3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ np3(List list, List list2, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        uw1 uw1VarD;
        uw1 uw1VarD2;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        lu6 lu6Var = lu6.a;
        List list = this.c;
        List list2 = this.b;
        kb4 kb4Var = this.d;
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
                    fr3 fr3Var = (fr3) list2.get(iIntValue);
                    dd4Var.f0(1848911488);
                    boolean z2 = iIntValue == 0;
                    z = iIntValue == gc1.S(list);
                    ou6 ou6VarA = dr5.a(dr5Var, tg9.f(lu6Var, 1.0f));
                    if (!z2 && !z) {
                        dd4Var.f0(1168031689);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                        dd4Var.q(false);
                    } else if (z2 && z) {
                        dd4Var.f0(1168034308);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.d;
                        dd4Var.q(false);
                    } else if (z2) {
                        dd4Var.f0(1849402062);
                        ur9 ur9Var = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var.j(ur9Var)).c.a.c, ((q96) dd4Var.j(ur9Var)).c.a.d, 3);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(1168045672);
                        ur9 ur9Var2 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var2)).c.d, ((q96) dd4Var.j(ur9Var2)).c.a.a, ((q96) dd4Var.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6VarA, uw1VarD), dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f), jf0.G), 16.0f, 12.0f);
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(fr3Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new e7(10, kb4Var, fr3Var);
                        dd4Var.p0(objQ);
                    }
                    sdc.O(fr3Var, ou6VarM0, (ib4) objQ, dd4Var, 0);
                    dd4Var.q(false);
                }
                break;
            default:
                dq5 dq5Var = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    ihb ihbVar = (ihb) list2.get(iIntValue3);
                    dd4Var2.f0(953940640);
                    boolean z3 = iIntValue3 == 0;
                    z = iIntValue3 == gc1.S(list);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    if (!z3 && !z) {
                        dd4Var2.f0(446424265);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.a;
                        dd4Var2.q(false);
                    } else if (z3 && z) {
                        dd4Var2.f0(446427012);
                        uw1VarD2 = ((q96) dd4Var2.j(s96.a)).c.d;
                        dd4Var2.q(false);
                    } else if (z3) {
                        dd4Var2.f0(954416706);
                        ur9 ur9Var3 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var3)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var2.j(ur9Var3)).c.a.c, ((q96) dd4Var2.j(ur9Var3)).c.a.d, 3);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(446439028);
                        ur9 ur9Var4 = s96.a;
                        uw1VarD2 = uw1.d(((q96) dd4Var2.j(ur9Var4)).c.d, ((q96) dd4Var2.j(ur9Var4)).c.a.a, ((q96) dd4Var2.j(ur9Var4)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var2.q(false);
                    }
                    ou6 ou6VarL = fe.L(t96.w(ou6VarF, uw1VarD2), dd1.g(((q96) dd4Var2.j(s96.a)).a, 1.0f), jf0.G);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.h(ihbVar);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new a1b(2, kb4Var, ihbVar);
                        dd4Var2.p0(objQ2);
                    }
                    kf0.r(ihbVar, gjb.m0(fw.J(null, (ib4) objQ2, ou6VarL, false, 15), 16.0f, 8.0f), dd4Var2, 8);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
