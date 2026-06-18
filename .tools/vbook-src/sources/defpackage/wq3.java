package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wq3 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ wq3(List list, Set set, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = set;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Set set = this.c;
        List list = this.b;
        kb4 kb4Var = this.d;
        Object obj5 = vl1.a;
        kb4 kb4Var2 = this.e;
        switch (i) {
            case 0:
                dq5 dq5Var = (dq5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dq5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    to3 to3Var = (to3) list.get(iIntValue);
                    dd4Var.f0(-842719754);
                    boolean zContains = set.contains(to3Var.a);
                    ou6 ou6VarA = dq5.a(dq5Var, lu6Var);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarW = t96.w(ou6VarA, ((q96) dd4Var.j(ur9Var)).c.a);
                    boolean z = to3Var.p;
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(to3Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        objQ = new gq0(kb4Var, to3Var, 3);
                        dd4Var.p0(objQ);
                    }
                    ou6 ou6VarM0 = gjb.m0(fe.L(fw.J(null, (ib4) objQ, ou6VarW, z, 14), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f, 8.0f);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.h(to3Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new gq0(kb4Var2, to3Var, 4);
                        dd4Var.p0(objQ2);
                    }
                    gc1.l(to3Var, wm3.a, zContains, ou6VarM0, (ib4) objQ2, dd4Var, 48, 0);
                    dd4Var.q(false);
                }
                break;
            default:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                int i4 = i3;
                if (!dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    to3 to3Var2 = (to3) list.get(iIntValue3);
                    dd4Var2.f0(997352399);
                    boolean zContains2 = set.contains(to3Var2.a);
                    ou6 ou6VarA2 = dq5.a(dq5Var2, lu6Var);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarW2 = t96.w(ou6VarA2, ((q96) dd4Var2.j(ur9Var2)).c.a);
                    boolean z2 = to3Var2.p;
                    boolean zF3 = dd4Var2.f(kb4Var) | dd4Var2.h(to3Var2);
                    Object objQ3 = dd4Var2.Q();
                    if (zF3 || objQ3 == obj5) {
                        objQ3 = new gq0(kb4Var, to3Var2, 5);
                        dd4Var2.p0(objQ3);
                    }
                    ou6 ou6VarM02 = gjb.m0(fe.L(fw.J(null, (ib4) objQ3, ou6VarW2, z2, 14), dd1.g(((q96) dd4Var2.j(ur9Var2)).a, 1.0f), jf0.G), 16.0f, 8.0f);
                    boolean zF4 = dd4Var2.f(kb4Var2) | dd4Var2.h(to3Var2);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new gq0(kb4Var2, to3Var2, 6);
                        dd4Var2.p0(objQ4);
                    }
                    gc1.l(to3Var2, wm3.c, zContains2, ou6VarM02, (ib4) objQ4, dd4Var2, 48, 0);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
