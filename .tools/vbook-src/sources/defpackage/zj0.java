package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zj0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ zj0(a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        final a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        int i2 = 16;
        final int i3 = 0;
        final int i4 = 1;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p35 p35VarC = i25.c((m53) f53.i0.getValue(), dd4Var, 0);
                    boolean zF = dd4Var.f(a07Var2);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj4) {
                        objQ = new ik(a07Var2, 8);
                        dd4Var.p0(objQ);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var, 0, 6);
                    p35 p35VarC2 = i25.c((m53) a53.a.getValue(), dd4Var, 0);
                    boolean zF2 = dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new ik(a07Var, 9);
                        dd4Var.p0(objQ2);
                    }
                    sw1.r(p35VarC2, (ou6) null, 0L, (ib4) objQ2, dd4Var, 0, 6);
                } else {
                    dd4Var.Y();
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    List list = ((uz0) a07Var2.getValue()).b;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        final oz0 oz0Var = (oz0) list.get(i5);
                        String str = oz0Var.b;
                        List list2 = (List) a07Var.getValue();
                        boolean z = list2 != null && list2.contains(oz0Var.a);
                        boolean zH = dd4Var2.h(oz0Var);
                        Object objQ3 = dd4Var2.Q();
                        if (zH || objQ3 == obj4) {
                            objQ3 = new ib4() { // from class: hi6
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    ArrayList arrayListJ0;
                                    ArrayList arrayListJ02;
                                    int i6 = i3;
                                    heb hebVar2 = heb.a;
                                    a07 a07Var3 = a07Var;
                                    oz0 oz0Var2 = oz0Var;
                                    switch (i6) {
                                        case 0:
                                            String str2 = oz0Var2.a;
                                            List list3 = (List) a07Var3.getValue();
                                            if (list3 == null || !list3.contains(str2)) {
                                                Collection collection = (List) a07Var3.getValue();
                                                if (collection == null) {
                                                    collection = lc3.a;
                                                }
                                                arrayListJ0 = fc1.J0(collection, str2);
                                            } else {
                                                List list4 = (List) a07Var3.getValue();
                                                if (list4 != null) {
                                                    arrayListJ0 = new ArrayList();
                                                    for (Object obj5 : list4) {
                                                        if (!lc5.Q((String) obj5, str2)) {
                                                            arrayListJ0.add(obj5);
                                                        }
                                                    }
                                                } else {
                                                    arrayListJ0 = null;
                                                }
                                            }
                                            a07Var3.setValue(arrayListJ0);
                                            break;
                                        default:
                                            List list5 = (List) a07Var3.getValue();
                                            String str3 = oz0Var2.a;
                                            if (list5.contains(str3)) {
                                                List list6 = (List) a07Var3.getValue();
                                                arrayListJ02 = new ArrayList();
                                                for (Object obj6 : list6) {
                                                    if (!lc5.Q((String) obj6, str3)) {
                                                        arrayListJ02.add(obj6);
                                                    }
                                                }
                                            } else {
                                                arrayListJ02 = fc1.J0((List) a07Var3.getValue(), str3);
                                            }
                                            a07Var3.setValue(arrayListJ02);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var2.p0(objQ3);
                        }
                        fz1.C(0, (ib4) objQ3, dd4Var2, null, null, null, str, z);
                    }
                } else {
                    dd4Var2.Y();
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c44) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    List list3 = ((uz0) a07Var2.getValue()).b;
                    int size2 = list3.size();
                    while (i3 < size2) {
                        final oz0 oz0Var2 = (oz0) list3.get(i3);
                        String str2 = oz0Var2.b;
                        boolean zContains = ((List) a07Var.getValue()).contains(oz0Var2.a);
                        boolean zH2 = dd4Var3.h(oz0Var2);
                        Object objQ4 = dd4Var3.Q();
                        if (zH2 || objQ4 == obj4) {
                            objQ4 = new ib4() { // from class: hi6
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    ArrayList arrayListJ0;
                                    ArrayList arrayListJ02;
                                    int i6 = i4;
                                    heb hebVar2 = heb.a;
                                    a07 a07Var3 = a07Var;
                                    oz0 oz0Var22 = oz0Var2;
                                    switch (i6) {
                                        case 0:
                                            String str22 = oz0Var22.a;
                                            List list32 = (List) a07Var3.getValue();
                                            if (list32 == null || !list32.contains(str22)) {
                                                Collection collection = (List) a07Var3.getValue();
                                                if (collection == null) {
                                                    collection = lc3.a;
                                                }
                                                arrayListJ0 = fc1.J0(collection, str22);
                                            } else {
                                                List list4 = (List) a07Var3.getValue();
                                                if (list4 != null) {
                                                    arrayListJ0 = new ArrayList();
                                                    for (Object obj5 : list4) {
                                                        if (!lc5.Q((String) obj5, str22)) {
                                                            arrayListJ0.add(obj5);
                                                        }
                                                    }
                                                } else {
                                                    arrayListJ0 = null;
                                                }
                                            }
                                            a07Var3.setValue(arrayListJ0);
                                            break;
                                        default:
                                            List list5 = (List) a07Var3.getValue();
                                            String str3 = oz0Var22.a;
                                            if (list5.contains(str3)) {
                                                List list6 = (List) a07Var3.getValue();
                                                arrayListJ02 = new ArrayList();
                                                for (Object obj6 : list6) {
                                                    if (!lc5.Q((String) obj6, str3)) {
                                                        arrayListJ02.add(obj6);
                                                    }
                                                }
                                            } else {
                                                arrayListJ02 = fc1.J0((List) a07Var3.getValue(), str3);
                                            }
                                            a07Var3.setValue(arrayListJ02);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var3.p0(objQ4);
                        }
                        fz1.C(0, (ib4) objQ4, dd4Var3, null, null, null, str2, zContains);
                        i3++;
                    }
                } else {
                    dd4Var3.Y();
                }
                break;
            default:
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarO = tg9.o(gjb.l0(lu6Var, 2.0f), 100.0f, 60.0f);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(fw.G(t96.w(ou6VarO, ((q96) dd4Var4.j(ur9Var)).c.a), 1.0f, lc1.c(0.1f, ((q96) dd4Var4.j(ur9Var)).a.a), ((q96) dd4Var4.j(ur9Var)).c.a), lc1.c(0.1f, ((q96) dd4Var4.j(ur9Var)).a.a), jf0.G);
                    boolean zF3 = dd4Var4.f(a07Var2);
                    Object objQ5 = dd4Var4.Q();
                    if (zF3 || objQ5 == obj4) {
                        objQ5 = new x41(a07Var, a07Var2, i2);
                        dd4Var4.p0(objQ5);
                    }
                    ou6 ou6VarS = yn2.s(ou6VarL, false, 0.0f, (ib4) objQ5, 3);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL = dd4Var4.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var4, ou6VarS);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(ll1.f, dd4Var4, ha6VarD);
                    un9.s(ll1.e, dd4Var4, lr7VarL);
                    un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode));
                    un9.r(dd4Var4, ll1.h);
                    un9.s(ll1.d, dd4Var4, ou6VarL0);
                    nha.c(wn9.K((pv9) vt9.f.getValue(), dd4Var4), zn0.a.a(lu6Var, bv4.f), ((q96) dd4Var4.j(ur9Var)).a.q, (g60) null, wn9.x(16), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var4, 24576, 0, 262120);
                    dd4Var4.q(true);
                } else {
                    dd4Var4.Y();
                }
                break;
        }
        return hebVar;
    }
}
