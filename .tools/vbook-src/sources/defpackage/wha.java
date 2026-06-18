package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wha {
    public final cn7 a = dk9.x((Object) null);
    public bp b;
    public final hk9 c;

    public wha(bp bpVar) {
        h1a h1aVar = new h1a(29);
        bpVar.getClass();
        zo zoVar = new zo(bpVar);
        ArrayList arrayList = zoVar.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) h1aVar.invoke(((yo) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ap apVar = (ap) list.get(i2);
                Object obj = apVar.a;
                arrayList3.add(new yo(apVar.b, apVar.d, obj, apVar.c));
            }
            fc1.p0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = zoVar.l();
        this.c = new hk9();
    }

    public static ap c(ap apVar, qha qhaVar) {
        int iC = qhaVar.b.c(r3.f - 1, false);
        if (apVar.b < iC) {
            return ap.a(apVar, null, Math.min(apVar.c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void a(dd4 dd4Var, int i) {
        char c;
        boolean z;
        dd4Var.h0(1154651354);
        char c2 = 2;
        int i2 = (dd4Var.h(this) ? 4 : 2) | i;
        ?? r8 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            tl tlVar = (tl) dd4Var.j(xm1.s);
            bp bpVar = this.b;
            List listA = bpVar.a(bpVar.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                ap apVar = (ap) listA.get(i3);
                int i4 = apVar.b;
                Object obj = apVar.a;
                if (i4 != apVar.c) {
                    dd4Var.f0(725478935);
                    Object objQ = dd4Var.Q();
                    Object obj2 = vl1.a;
                    if (objQ == obj2) {
                        objQ = ky0.i(dd4Var);
                    }
                    yy6 yy6Var = (yy6) objQ;
                    c = c2;
                    ou6 ou6VarW = kl8.W(lu6.a, new k49(14, this, apVar));
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj2) {
                        objQ2 = new uha(r8);
                        dd4Var.p0(objQ2);
                    }
                    ou6 ou6VarV = gc1.V(a29.c(ou6VarW, (boolean) r8, (kb4) objQ2).e(new qja(new gj1(10, this, apVar))), yy6Var);
                    rx7.a.getClass();
                    ou6 ou6VarO = lw1.O(ou6VarV, t96.u);
                    boolean zH = dd4Var.h(this) | dd4Var.f(apVar) | dd4Var.h(tlVar);
                    Object objQ3 = dd4Var.Q();
                    if (zH || objQ3 == obj2) {
                        objQ3 = new nga(this, apVar, tlVar);
                        dd4Var.p0(objQ3);
                    }
                    pn0.a(fw.L(ou6VarO, yy6Var, null, (ib4) objQ3, 508), dd4Var, 0);
                    ty5 ty5Var = (ty5) obj;
                    xha xhaVarA = ty5Var.a();
                    if (xhaVarA == null || (xhaVarA.a == null && xhaVarA.b == null && xhaVarA.c == null && xhaVarA.d == null)) {
                        z = 0;
                        dd4Var.f0(728331710);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(726303039);
                        Object objQ4 = dd4Var.Q();
                        if (objQ4 == obj2) {
                            objQ4 = new uy5(yy6Var);
                            dd4Var.p0(objQ4);
                        }
                        uy5 uy5Var = (uy5) objQ4;
                        Object objQ5 = dd4Var.Q();
                        if (objQ5 == obj2) {
                            objQ5 = new dd9(uy5Var, (jt1) null, 9);
                            dd4Var.p0(objQ5);
                        }
                        lc5.u((yb4) objQ5, dd4Var, heb.a);
                        zm7 zm7Var = uy5Var.b;
                        zm7 zm7Var2 = uy5Var.b;
                        Boolean boolValueOf = Boolean.valueOf((zm7Var.h() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((zm7Var2.h() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((zm7Var2.h() & 4) != 0);
                        xha xhaVarA2 = ty5Var.a();
                        vn9 vn9Var = xhaVarA2 != null ? xhaVarA2.a : null;
                        xha xhaVarA3 = ty5Var.a();
                        vn9 vn9Var2 = xhaVarA3 != null ? xhaVarA3.b : null;
                        xha xhaVarA4 = ty5Var.a();
                        vn9 vn9Var3 = xhaVarA4 != null ? xhaVarA4.c : null;
                        xha xhaVarA5 = ty5Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, vn9Var, vn9Var2, vn9Var3, xhaVarA5 != null ? xhaVarA5.d : null};
                        boolean zH2 = dd4Var.h(this) | dd4Var.f(apVar);
                        Object objQ6 = dd4Var.Q();
                        if (zH2 || objQ6 == obj2) {
                            objQ6 = new k49(this, apVar, uy5Var);
                            dd4Var.p0(objQ6);
                        }
                        b(objArr, (kb4) objQ6, dd4Var, (i2 << 6) & 896);
                        z = 0;
                        dd4Var.q(false);
                    }
                    dd4Var.q(z);
                } else {
                    c = c2;
                    z = r8;
                    dd4Var.f0(728345598);
                    dd4Var.q(z);
                }
                i3++;
                r8 = z;
                c2 = c;
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new w27(this, i, 20);
        }
    }

    public final void b(Object[] objArr, kb4 kb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(-2083052099);
        int i2 = (i & 48) == 0 ? (dd4Var.h(kb4Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(this) ? 256 : Token.CASE;
        }
        dd4Var.c0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (dd4Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= dd4Var.h(obj) ? 4 : 0;
        }
        dd4Var.q(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            nu nuVar = new nu(2);
            ArrayList arrayList = nuVar.a;
            arrayList.add(kb4Var);
            nuVar.d(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = dd4Var.h(this) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new ve0(this, kb4Var, 1);
                dd4Var.p0(objQ);
            }
            lc5.l(array, (kb4) objQ, dd4Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(this, objArr, kb4Var, i, 21);
        }
    }
}
