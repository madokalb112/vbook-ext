package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zs6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ zs6(List list, String str, kb4 kb4Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = kb4Var;
        this.e = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        zs6 zs6Var = this;
        int i3 = zs6Var.a;
        int i4 = 14;
        Object obj4 = vl1.a;
        heb hebVar = heb.a;
        ou6 ou6Var = lu6.a;
        boolean z = false;
        switch (i3) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ = dd4Var.Q();
                    if (objQ == obj4) {
                        objQ = new ko0();
                        dd4Var.p0(objQ);
                    }
                    ko0 ko0Var = (ko0) objQ;
                    dd4Var.f0(1451046208);
                    List list = zs6Var.b;
                    int size = list.size();
                    int i5 = 0;
                    while (i5 < size) {
                        p5b p5bVar = (p5b) list.get(i5);
                        boolean zEquals = p5bVar.a.equals(zs6Var.c);
                        String str = p5bVar.b;
                        ou6 ou6VarO = zEquals ? vo1.O(ou6Var, ko0Var) : ou6Var;
                        rj1 rj1VarG = jf0.G(1997908774, new bt6(p5bVar, 0), dd4Var);
                        Boolean boolValueOf = Boolean.valueOf(zEquals);
                        kb4 kb4Var = zs6Var.d;
                        boolean zF = dd4Var.f(kb4Var) | dd4Var.h(p5bVar);
                        Object objQ2 = dd4Var.Q();
                        if (zF || objQ2 == obj4) {
                            objQ2 = new ct6(kb4Var, p5bVar, zs6Var.e, 0);
                            dd4Var.p0(objQ2);
                        }
                        gx1.c(str, null, rj1VarG, boolValueOf, ou6VarO, (ib4) objQ2, dd4Var, 384, 2);
                        i5++;
                        zs6Var = this;
                    }
                    dd4Var.q(false);
                    boolean zH = dd4Var.h(ko0Var);
                    Object objQ3 = dd4Var.Q();
                    if (zH || objQ3 == obj4) {
                        objQ3 = new is6(ko0Var, null, 1);
                        dd4Var.p0(objQ3);
                    }
                    lc5.u((yb4) objQ3, dd4Var, hebVar);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final List list2 = zs6Var.b;
                    int size2 = list2.size();
                    final String str2 = zs6Var.c;
                    final kb4 kb4Var2 = zs6Var.d;
                    final a07 a07Var = zs6Var.e;
                    if (size2 > 10) {
                        dd4Var2.f0(-782955136);
                        Iterator it = list2.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                            } else if (lc5.Q(str2, ((r5b) it.next()).a)) {
                                i = i6;
                            } else {
                                i6++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i);
                        if (i < 0) {
                            numValueOf = null;
                        }
                        st5 st5VarE = mt5.e(numValueOf != null ? numValueOf.intValue() : 0, null, dd4Var2, 0, 14);
                        ou6 ou6VarH = tg9.h(tg9.r(ou6Var, 200.0f), ((x13) t1c.g0(new x13(oh9.h(dd4Var2).b), new x13(400.0f))).a);
                        boolean zH2 = dd4Var2.h(list2) | dd4Var2.f(str2) | dd4Var2.f(kb4Var2);
                        Object objQ4 = dd4Var2.Q();
                        if (zH2 || objQ4 == obj4) {
                            final int i7 = 0;
                            objQ4 = new kb4() { // from class: dt6
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj5) {
                                    int i8 = i7;
                                    heb hebVar2 = heb.a;
                                    at5 at5Var = (at5) obj5;
                                    switch (i8) {
                                        case 0:
                                            at5Var.getClass();
                                            List list3 = list2;
                                            at5Var.c0(list3.size(), (kb4) null, new js6(2, list3), new rj1(new ht6(list3, str2, kb4Var2, a07Var, 0), true, 802480018));
                                            break;
                                        default:
                                            at5Var.getClass();
                                            List list4 = list2;
                                            at5Var.c0(list4.size(), (kb4) null, new js6(27, list4), new rj1(new ht6(list4, str2, kb4Var2, a07Var, 1), true, 802480018));
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var2.p0(objQ4);
                        }
                        gx1.h(ou6VarH, st5VarE, null, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) objQ4, dd4Var2, 0, 0, 4092);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-781864587);
                        Object objQ5 = dd4Var2.Q();
                        if (objQ5 == obj4) {
                            objQ5 = new ko0();
                            dd4Var2.p0(objQ5);
                        }
                        ko0 ko0Var2 = (ko0) objQ5;
                        dd4Var2.f0(-717954789);
                        int size3 = list2.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            final r5b r5bVar = (r5b) list2.get(i8);
                            boolean zEquals2 = r5bVar.a.equals(str2);
                            dd4Var2.f0(-717948827);
                            String strK = r5bVar.b;
                            if (strK.length() == 0) {
                                strK = r5bVar.a;
                            }
                            if (strK.length() == 0) {
                                strK = wn9.K((pv9) vt9.H.getValue(), dd4Var2);
                            }
                            String str3 = strK;
                            dd4Var2.q(false);
                            ou6 ou6VarO2 = zEquals2 ? vo1.O(ou6Var, ko0Var2) : ou6Var;
                            Boolean boolValueOf2 = Boolean.valueOf(zEquals2);
                            boolean zF2 = dd4Var2.f(kb4Var2) | dd4Var2.h(r5bVar);
                            Object objQ6 = dd4Var2.Q();
                            if (zF2 || objQ6 == obj4) {
                                final int i9 = 0;
                                objQ6 = new ib4() { // from class: et6
                                    @Override // defpackage.ib4
                                    public final Object invoke() {
                                        int i10 = i9;
                                        heb hebVar2 = heb.a;
                                        a07 a07Var2 = a07Var;
                                        r5b r5bVar2 = r5bVar;
                                        kb4 kb4Var3 = kb4Var2;
                                        switch (i10) {
                                            case 0:
                                                a07Var2.setValue(Boolean.FALSE);
                                                kb4Var3.invoke(r5bVar2.a);
                                                break;
                                            default:
                                                a07Var2.setValue(Boolean.FALSE);
                                                kb4Var3.invoke(r5bVar2.a);
                                                break;
                                        }
                                        return hebVar2;
                                    }
                                };
                                dd4Var2.p0(objQ6);
                            }
                            gx1.c(str3, null, null, boolValueOf2, ou6VarO2, (ib4) objQ6, dd4Var2, 0, 6);
                        }
                        dd4Var2.q(false);
                        boolean zH3 = dd4Var2.h(ko0Var2);
                        Object objQ7 = dd4Var2.Q();
                        if (zH3 || objQ7 == obj4) {
                            objQ7 = new is6(ko0Var2, null, 2);
                            dd4Var2.p0(objQ7);
                        }
                        lc5.u((yb4) objQ7, dd4Var2, hebVar);
                        dd4Var2.q(false);
                    }
                } else {
                    dd4Var2.Y();
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    final List list3 = zs6Var.b;
                    int size4 = list3.size();
                    final String str4 = zs6Var.c;
                    final kb4 kb4Var3 = zs6Var.d;
                    final a07 a07Var2 = zs6Var.e;
                    if (size4 > 10) {
                        dd4Var3.f0(-448750666);
                        Iterator it2 = list3.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i2 = -1;
                            } else if (lc5.Q(str4, ((r5b) it2.next()).a)) {
                                i2 = i10;
                            } else {
                                i10++;
                            }
                        }
                        Integer numValueOf2 = Integer.valueOf(i2);
                        if (i2 < 0) {
                            numValueOf2 = null;
                        }
                        st5 st5VarE2 = mt5.e(numValueOf2 != null ? numValueOf2.intValue() : 0, null, dd4Var3, 0, 14);
                        ou6 ou6VarH2 = tg9.h(tg9.r(ou6Var, 200.0f), ((x13) t1c.g0(new x13(oh9.h(dd4Var3).b), new x13(400.0f))).a);
                        boolean zH4 = dd4Var3.h(list3) | dd4Var3.f(str4) | dd4Var3.f(kb4Var3);
                        Object objQ8 = dd4Var3.Q();
                        if (zH4 || objQ8 == obj4) {
                            final int i11 = 1;
                            kb4 kb4Var4 = new kb4() { // from class: dt6
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj5) {
                                    int i82 = i11;
                                    heb hebVar2 = heb.a;
                                    at5 at5Var = (at5) obj5;
                                    switch (i82) {
                                        case 0:
                                            at5Var.getClass();
                                            List list32 = list3;
                                            at5Var.c0(list32.size(), (kb4) null, new js6(2, list32), new rj1(new ht6(list32, str4, kb4Var3, a07Var2, 0), true, 802480018));
                                            break;
                                        default:
                                            at5Var.getClass();
                                            List list4 = list3;
                                            at5Var.c0(list4.size(), (kb4) null, new js6(27, list4), new rj1(new ht6(list4, str4, kb4Var3, a07Var2, 1), true, 802480018));
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var3.p0(kb4Var4);
                            objQ8 = kb4Var4;
                        }
                        gx1.h(ou6VarH2, st5VarE2, null, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) objQ8, dd4Var3, 0, 0, 4092);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(-447663217);
                        Object objQ9 = dd4Var3.Q();
                        if (objQ9 == obj4) {
                            objQ9 = new ko0();
                            dd4Var3.p0(objQ9);
                        }
                        ko0 ko0Var3 = (ko0) objQ9;
                        dd4Var3.f0(-14437439);
                        int size5 = list3.size();
                        int i12 = 0;
                        while (i12 < size5) {
                            final r5b r5bVar2 = (r5b) list3.get(i12);
                            boolean zEquals3 = r5bVar2.a.equals(str4);
                            dd4Var3.f0(-14431377);
                            String strK2 = r5bVar2.b;
                            if (strK2.length() == 0) {
                                strK2 = r5bVar2.a;
                            }
                            if (strK2.length() == 0) {
                                strK2 = wn9.K((pv9) vt9.H.getValue(), dd4Var3);
                            }
                            dd4Var3.q(z);
                            ou6 ou6VarZ = qx1.z(ou6Var, zEquals3, new rt6(ko0Var3, i4), dd4Var3, 6);
                            Boolean boolValueOf3 = Boolean.valueOf(zEquals3);
                            boolean zF3 = dd4Var3.f(kb4Var3) | dd4Var3.h(r5bVar2);
                            Object objQ10 = dd4Var3.Q();
                            if (zF3 || objQ10 == obj4) {
                                final int i13 = 1;
                                objQ10 = new ib4() { // from class: et6
                                    @Override // defpackage.ib4
                                    public final Object invoke() {
                                        int i102 = i13;
                                        heb hebVar2 = heb.a;
                                        a07 a07Var22 = a07Var2;
                                        r5b r5bVar22 = r5bVar2;
                                        kb4 kb4Var32 = kb4Var3;
                                        switch (i102) {
                                            case 0:
                                                a07Var22.setValue(Boolean.FALSE);
                                                kb4Var32.invoke(r5bVar22.a);
                                                break;
                                            default:
                                                a07Var22.setValue(Boolean.FALSE);
                                                kb4Var32.invoke(r5bVar22.a);
                                                break;
                                        }
                                        return hebVar2;
                                    }
                                };
                                dd4Var3.p0(objQ10);
                            }
                            gx1.c(strK2, null, null, boolValueOf3, ou6VarZ, (ib4) objQ10, dd4Var3, 0, 6);
                            i12++;
                            i4 = 14;
                            z = false;
                        }
                        dd4Var3.q(z);
                        boolean zH5 = dd4Var3.h(ko0Var3);
                        Object objQ11 = dd4Var3.Q();
                        if (zH5 || objQ11 == obj4) {
                            objQ11 = new is6(ko0Var3, null, 5);
                            dd4Var3.p0(objQ11);
                        }
                        lc5.u((yb4) objQ11, dd4Var3, hebVar);
                        dd4Var3.q(false);
                    }
                } else {
                    dd4Var3.Y();
                }
                break;
        }
        return hebVar;
    }
}
