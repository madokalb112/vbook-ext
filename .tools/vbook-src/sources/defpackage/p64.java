package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p64 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ p64(List list, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.s = obj5;
        this.t = obj6;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        uw1 uw1VarD;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = this.t;
        Object obj6 = this.s;
        List list = this.b;
        Object obj7 = vl1.a;
        Object obj8 = this.c;
        Object obj9 = this.f;
        Object obj10 = this.d;
        Object obj11 = this.e;
        int i2 = 1;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kb4 kb4Var = (kb4) obj5;
                kb4 kb4Var2 = (kb4) obj6;
                kb4 kb4Var3 = (kb4) obj9;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    a64 a64Var = (a64) list.get(iIntValue);
                    dd4Var.f0(-309392403);
                    boolean z = iIntValue == 0;
                    boolean z2 = iIntValue == gc1.S((List) obj8);
                    String str = a64Var.b;
                    String str2 = a64Var.c;
                    fv3 fv3Var = (fv3) obj10;
                    boolean zEquals = ((String) obj11).equals(str2);
                    boolean z3 = a64Var.d;
                    t13 t13Var = a64Var.e;
                    ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
                    if (!z && !z2) {
                        dd4Var.f0(-1949626205);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                        dd4Var.q(false);
                    } else if (z && z2) {
                        dd4Var.f0(-1949623586);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.d;
                        dd4Var.q(false);
                    } else if (z) {
                        dd4Var.f0(-308712140);
                        ur9 ur9Var = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, (ax1) null, (ax1) null, ((q96) dd4Var.j(ur9Var)).c.a.c, ((q96) dd4Var.j(ur9Var)).c.a.d, 3);
                        dd4Var.q(false);
                    } else if (z2) {
                        dd4Var.f0(-1949612094);
                        ur9 ur9Var2 = s96.a;
                        uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var2)).c.d, ((q96) dd4Var.j(ur9Var2)).c.a.a, ((q96) dd4Var.j(ur9Var2)).c.a.b, (ax1) null, (ax1) null, 12);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1949603965);
                        uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                        dd4Var.q(false);
                    }
                    ou6 ou6VarL = fe.L(t96.w(ou6VarF, uw1VarD), dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f), jf0.G);
                    boolean zF = dd4Var.f(kb4Var3) | dd4Var.f(a64Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj7) {
                        objQ = new o64(kb4Var3, a64Var, 0);
                        dd4Var.p0(objQ);
                    }
                    ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 16.0f, 8.0f);
                    boolean zF2 = dd4Var.f(kb4Var2) | dd4Var.f(a64Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj7) {
                        objQ2 = new o64(kb4Var2, a64Var, 1);
                        dd4Var.p0(objQ2);
                    }
                    ib4 ib4Var = (ib4) objQ2;
                    boolean zF3 = dd4Var.f(kb4Var) | dd4Var.f(a64Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF3 || objQ3 == obj7) {
                        objQ3 = new o64(kb4Var, a64Var, 2);
                        dd4Var.p0(objQ3);
                    }
                    t96.g(str, str2, fv3Var, zEquals, z3, t13Var, ou6VarM0, ib4Var, (ib4) objQ3, dd4Var, 512);
                    dd4Var.q(false);
                }
                break;
            default:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                gn2 gn2Var = (gn2) obj11;
                f28 f28Var = (f28) obj10;
                br9 br9Var = (br9) obj9;
                c1b c1bVar = (c1b) obj8;
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    bp2 bp2Var = (bp2) list.get(iIntValue3);
                    dd4Var2.f0(-1418484936);
                    String str3 = ((iib) br9Var.getValue()).b;
                    int i5 = ((iib) br9Var.getValue()).g;
                    boolean zF4 = dd4Var2.f(c1bVar);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj7) {
                        objQ4 = new vra(1, c1bVar, c1b.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 3);
                        dd4Var2.p0(objQ4);
                    }
                    ei5 ei5Var = (ei5) objQ4;
                    boolean zF5 = dd4Var2.f(c1bVar) | dd4Var2.h(bp2Var);
                    Object objQ5 = dd4Var2.Q();
                    if (zF5 || objQ5 == obj7) {
                        objQ5 = new a1b(0, c1bVar, bp2Var);
                        dd4Var2.p0(objQ5);
                    }
                    ib4 ib4Var2 = (ib4) objQ5;
                    kb4 kb4Var4 = (kb4) ei5Var;
                    boolean zF6 = dd4Var2.f(f28Var);
                    Object objQ6 = dd4Var2.Q();
                    if (zF6 || objQ6 == obj7) {
                        objQ6 = new yu1(f28Var, i2);
                        dd4Var2.p0(objQ6);
                    }
                    yb4 yb4Var = (yb4) objQ6;
                    Object objQ7 = dd4Var2.Q();
                    if (objQ7 == obj7) {
                        objQ7 = new x14((a07) obj6, (a07) obj5, 1);
                        dd4Var2.p0(objQ7);
                    }
                    kb4 kb4Var5 = (kb4) objQ7;
                    boolean zF7 = dd4Var2.f(gn2Var) | dd4Var2.h(bp2Var);
                    Object objQ8 = dd4Var2.Q();
                    if (zF7 || objQ8 == obj7) {
                        objQ8 = new a1b(1, gn2Var, bp2Var);
                        dd4Var2.p0(objQ8);
                    }
                    gjb.u(bp2Var, ib4Var2, null, str3, i5, kb4Var4, yb4Var, kb4Var5, (ib4) objQ8, dd4Var2, 12582920);
                    dd4Var2.q(false);
                }
                break;
        }
        return hebVar;
    }
}
