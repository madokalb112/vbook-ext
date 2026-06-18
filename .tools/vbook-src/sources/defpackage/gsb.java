package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gsb implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h49 b;

    public /* synthetic */ gsb(h49 h49Var, int i) {
        this.a = i;
        this.b = h49Var;
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        jt1 jt1Var2 = null;
        h49 h49Var = this.b;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                drb drbVar = (drb) obj;
                h49 h49Var2 = this.b;
                fr9 fr9Var = h49Var2.L;
                if (drbVar instanceof brb) {
                    if (fr9Var != null) {
                        do {
                            value3 = fr9Var.getValue();
                        } while (!fr9Var.j(value3, urb.a((urb) value3, true, false, null, null, 0, null, null, 0, null, 0, 1020)));
                    }
                } else if (drbVar instanceof crb) {
                    crb crbVar = (crb) drbVar;
                    w1b w1bVar = crbVar.a;
                    ArrayList arrayList = w1bVar.g;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!bw9.a0(((v1b) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(gc1.M(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        jt1 jt1Var3 = null;
                        if (i4 < size2) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                gc1.i0();
                                throw null;
                            }
                            v1b v1bVar = (v1b) obj3;
                            String str = v1bVar.a;
                            Map map = v1bVar.b;
                            String strF = v1bVar.d;
                            if (bw9.a0(strF)) {
                                strF = v1bVar.e;
                                if (bw9.a0(strF)) {
                                    strF = dx1.f(i5, "Audio ");
                                }
                            }
                            arrayList3.add(new knb(str, map, strF, v1bVar.e, v1bVar.c));
                            i3 = i5;
                        } else {
                            if (fr9Var != null) {
                                while (true) {
                                    Object value5 = fr9Var.getValue();
                                    ArrayList arrayList4 = arrayList3;
                                    if (!fr9Var.j(value5, urb.a((urb) value5, false, false, null, null, 0, crbVar.a, arrayList4, !arrayList3.isEmpty() ? 0 : -1, null, 0, 796))) {
                                        arrayList3 = arrayList4;
                                    }
                                }
                            }
                            ArrayList arrayList5 = w1bVar.h;
                            int i6 = 0;
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList5.size();
                            while (i6 < size3) {
                                Object obj4 = arrayList5.get(i6);
                                i6++;
                                if (!bw9.a0(((l2b) obj4).a)) {
                                    arrayList6.add(obj4);
                                }
                            }
                            if (!arrayList6.isEmpty()) {
                                za1 za1VarA = vtb.a(h49Var2);
                                aj2 aj2Var = rw2.a;
                                h49Var2.D = h49Var2.g(za1VarA, nh2.c, new bva(h49Var2, arrayList6, w1bVar, jt1Var3, 9));
                            } else if (fr9Var != null) {
                                do {
                                    value2 = fr9Var.getValue();
                                } while (!fr9Var.j(value2, urb.a((urb) value2, false, false, null, null, 0, null, null, 0, lc3.a, -1, 255)));
                            }
                        }
                    }
                } else {
                    if (!(drbVar instanceof arb)) {
                        mn5.g();
                        return null;
                    }
                    if (fr9Var != null) {
                        do {
                            value = fr9Var.getValue();
                        } while (!fr9Var.j(value, urb.a((urb) value, false, true, ((arb) drbVar).a.getMessage(), null, 0, null, null, 0, null, 0, 1016)));
                    }
                }
                return hebVar;
            case 1:
                ii0 ii0Var = (ii0) obj;
                fr9 fr9Var2 = h49Var.I;
                if (fr9Var2 != null) {
                    while (true) {
                        Object value6 = fr9Var2.getValue();
                        lnb lnbVar = (lnb) value6;
                        String str2 = ii0Var.d;
                        String str3 = ii0Var.e;
                        int i7 = ii0Var.f;
                        boolean z = ii0Var.j;
                        boolean z2 = ii0Var.k;
                        boolean z3 = ii0Var.l;
                        boolean z4 = ii0Var.m;
                        String str4 = lnbVar.a;
                        String str5 = lnbVar.b;
                        String str6 = lnbVar.c;
                        String str7 = lnbVar.g;
                        ii0 ii0Var2 = ii0Var;
                        boolean z5 = lnbVar.l;
                        boolean z6 = lnbVar.m;
                        boolean z7 = lnbVar.n;
                        boolean z8 = lnbVar.o;
                        j39.w(str4, str5, str6, str2, str3);
                        str7.getClass();
                        if (!fr9Var2.j(value6, new lnb(str4, str5, str6, str2, str3, i7, str7, z, z2, z3, z4, z5, z6, z7, z8))) {
                            ii0Var = ii0Var2;
                        }
                    }
                }
                return hebVar;
            default:
                xl7 xl7Var = (xl7) obj;
                Object obj5 = xl7Var.a;
                List list = (List) xl7Var.b;
                List list2 = (List) obj5;
                int iO = y86.O(gc1.M(list2, 10));
                if (iO < 16) {
                    iO = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                for (Object obj6 : list2) {
                    linkedHashMap.put(((ne3) obj6).c, obj6);
                }
                h49Var.y = linkedHashMap;
                int iO2 = y86.O(gc1.M(list, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iO2 >= 16 ? iO2 : 16);
                for (Object obj7 : list) {
                    linkedHashMap2.put(((pva) obj7).a, obj7);
                }
                h49Var.z = linkedHashMap2;
                fr9 fr9Var3 = h49Var.x;
                if (fr9Var3 != null) {
                    do {
                        value4 = fr9Var3.getValue();
                    } while (!fr9Var3.j(value4, list2));
                }
                za1 za1VarA2 = vtb.a(h49Var);
                aj2 aj2Var2 = rw2.a;
                h49Var.g(za1VarA2, nh2.c, new hsb(h49Var, jt1Var2, 2));
                return hebVar;
        }
    }
}
