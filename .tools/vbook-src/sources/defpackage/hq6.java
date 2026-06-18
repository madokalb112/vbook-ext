package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hq6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ hq6(List list, int i, kb4 kb4Var, a07 a07Var, int i2) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = kb4Var;
        this.e = a07Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Throwable] */
    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        boolean z = true;
        a07 a07Var = this.e;
        kb4 kb4Var = this.d;
        int i2 = this.c;
        List<asb> list = this.b;
        boolean z2 = false;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i3 = 0;
                    for (Object obj5 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj5;
                        Boolean boolValueOf = Boolean.valueOf(i2 == i3);
                        boolean zF = dd4Var.f(kb4Var) | dd4Var.d(i3);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj4) {
                            objQ = new jq6(kb4Var, i3, a07Var, 0);
                            dd4Var.p0(objQ);
                        }
                        gx1.c(str, null, null, boolValueOf, null, (ib4) objQ, dd4Var, 0, 22);
                        i3 = i4;
                    }
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    int size = list.size();
                    ou6 ou6Var = lu6.a;
                    if (size > 10) {
                        dd4Var2.f0(764622570);
                        st5 st5VarE = mt5.e(i2, null, dd4Var2, 0, 14);
                        ou6 ou6VarH = tg9.h(tg9.r(ou6Var, 250.0f), ((x13) t1c.g0(new x13(oh9.h(dd4Var2).b), new x13(400.0f))).a);
                        boolean zH = dd4Var2.h(list) | dd4Var2.d(i2) | dd4Var2.f(kb4Var);
                        Object objQ2 = dd4Var2.Q();
                        Object obj6 = objQ2;
                        if (zH || objQ2 == obj4) {
                            do2 do2Var = new do2(list, i2, kb4Var, a07Var);
                            dd4Var2.p0(do2Var);
                            obj6 = do2Var;
                        }
                        gx1.h(ou6VarH, st5VarE, null, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) obj6, dd4Var2, 0, 0, 4092);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(765611036);
                        Object objQ3 = dd4Var2.Q();
                        Object obj7 = objQ3;
                        if (objQ3 == obj4) {
                            ko0 ko0Var = new ko0();
                            dd4Var2.p0(ko0Var);
                            obj7 = ko0Var;
                        }
                        ko0 ko0Var2 = (ko0) obj7;
                        dd4Var2.f0(-113847016);
                        int i5 = 0;
                        for (Object obj8 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                ?? r22 = jt1Var;
                                gc1.i0();
                                throw r22;
                            }
                            y71 y71Var = (y71) obj8;
                            boolean z3 = i2 == i5 ? z : z2;
                            boolean z4 = y71Var.c;
                            boolean z5 = z;
                            String strN = y71Var.a;
                            if (z4) {
                                strN = tw2.n(strN, " (Online)");
                            }
                            String str2 = y71Var.b;
                            boolean z6 = i2 == i5 ? z5 : z2;
                            ou6 ou6VarO = z3 ? vo1.O(ou6Var, ko0Var2) : ou6Var;
                            Boolean boolValueOf2 = Boolean.valueOf(z6);
                            boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.d(i5);
                            jt1 jt1Var2 = jt1Var;
                            Object objQ4 = dd4Var2.Q();
                            if (zF2 || objQ4 == obj4) {
                                objQ4 = new jq6(kb4Var, i5, a07Var, 2);
                                dd4Var2.p0(objQ4);
                            }
                            gx1.c(strN, str2, null, boolValueOf2, ou6VarO, (ib4) objQ4, dd4Var2, 0, 4);
                            ou6Var = ou6Var;
                            i5 = i6;
                            z = z5;
                            jt1Var = jt1Var2;
                            z2 = false;
                        }
                        jt1 jt1Var3 = jt1Var;
                        boolean z7 = z2;
                        dd4Var2.q(z7);
                        boolean zH2 = dd4Var2.h(ko0Var2);
                        Object objQ5 = dd4Var2.Q();
                        Object obj9 = objQ5;
                        if (zH2 || objQ5 == obj4) {
                            is6 is6Var = new is6(ko0Var2, jt1Var3, z7 ? 1 : 0);
                            dd4Var2.p0(is6Var);
                            obj9 = is6Var;
                        }
                        lc5.u((yb4) obj9, dd4Var2, hebVar);
                        dd4Var2.q(z7);
                    }
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    int i7 = 0;
                    for (Object obj10 : list) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str3 = (String) obj10;
                        Boolean boolValueOf3 = Boolean.valueOf(i2 == i7);
                        boolean zF3 = dd4Var3.f(kb4Var) | dd4Var3.d(i7);
                        Object objQ6 = dd4Var3.Q();
                        if (zF3 || objQ6 == obj4) {
                            objQ6 = new jq6(kb4Var, i7, a07Var, 3);
                            dd4Var3.p0(objQ6);
                        }
                        dd4 dd4Var4 = dd4Var3;
                        gx1.c(str3, null, null, boolValueOf3, null, (ib4) objQ6, dd4Var4, 0, 22);
                        dd4Var3 = dd4Var4;
                        i7 = i8;
                    }
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            default:
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    for (asb asbVar : list) {
                        String str4 = asbVar.a;
                        Boolean boolValueOf4 = Boolean.valueOf(asbVar.b == i2);
                        boolean zF4 = dd4Var5.f(kb4Var) | dd4Var5.f(asbVar);
                        Object objQ7 = dd4Var5.Q();
                        if (zF4 || objQ7 == obj4) {
                            objQ7 = new ma0(29, kb4Var, asbVar, a07Var);
                            dd4Var5.p0(objQ7);
                        }
                        gx1.c(str4, null, null, boolValueOf4, null, (ib4) objQ7, dd4Var5, 0, 22);
                    }
                } else {
                    dd4Var5.Y();
                }
                return hebVar;
        }
    }
}
