package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pm0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ pm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.s = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v31, types: [mc3] */
    /* JADX WARN: Type inference failed for: r2v67 */
    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws Throwable {
        kb4 kb4Var;
        int i = this.a;
        int i2 = 27;
        Throwable th = null;
        heb hebVar = heb.a;
        Object obj2 = this.s;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        final int i3 = 1;
        final byte b = 0;
        int i4 = 0;
        switch (i) {
            case 0:
                np8 np8Var = (np8) obj6;
                og8 og8Var = (og8) obj5;
                rg8 rg8Var = (rg8) obj4;
                hh hhVar = (hh) obj3;
                sq0 sq0Var = (sq0) obj2;
                r43 r43Var = (r43) obj;
                kx9 kx9Var = (kx9) ((nc1) obj7).c;
                kx9Var.getClass();
                float fFloatValue = Float.valueOf(kx9Var.a).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                boolean z = 2.0f * fFloatValue > Math.min(Math.abs(np8Var.b()), Math.abs(np8Var.a()));
                if (og8Var.a != fFloatValue) {
                    hhVar.l();
                    hh.d(hhVar, np8Var);
                    if (!z) {
                        hh hhVarA = mh.a();
                        hh.d(hhVarA, new np8(np8Var.a + fFloatValue, np8Var.b + fFloatValue, np8Var.c - fFloatValue, np8Var.d - fFloatValue, gjb.s0(fFloatValue, np8Var.e), gjb.s0(fFloatValue, np8Var.f), gjb.s0(fFloatValue, np8Var.g), gjb.s0(fFloatValue, np8Var.h)));
                        hhVar.j(hhVar, hhVarA, 0);
                    }
                    rg8Var.a = hhVar;
                    og8Var.a = fFloatValue;
                }
                Object obj8 = rg8Var.a;
                obj8.getClass();
                r43.q(r43Var, (hh) obj8, sq0Var, 0.0f, (s43) null, (qc1) null, 0, 60);
                return hebVar;
            case 1:
                jt7[] jt7VarArr = (jt7[]) obj7;
                List list = (List) obj6;
                ja6 ja6Var = (ja6) obj5;
                pg8 pg8Var = (pg8) obj4;
                pg8 pg8Var2 = (pg8) obj3;
                rn0 rn0Var = (rn0) obj2;
                it7 it7Var = (it7) obj;
                int length = jt7VarArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    jt7 jt7Var = jt7VarArr[i5];
                    jt7Var.getClass();
                    pn0.b(it7Var, jt7Var, (ca6) list.get(i6), ja6Var.getLayoutDirection(), pg8Var.a, pg8Var2.a, rn0Var.a);
                    i5++;
                    jt7VarArr = jt7VarArr;
                    i6++;
                }
                return hebVar;
            case 2:
                kb4 kb4Var2 = (kb4) obj6;
                ox oxVar = (ox) obj;
                oxVar.getClass();
                aj2 aj2Var = rw2.a;
                ah1.J((vx1) obj7, r76.a.f, null, new ug((Context) obj5, (tx) obj4, (ac1) obj3, oxVar, (a07) obj2, null, 7), 2);
                if (kb4Var2 != null) {
                    kb4Var2.invoke(oxVar);
                }
                return hebVar;
            case 3:
                String str = (String) obj6;
                List list2 = (List) obj4;
                List list3 = (List) obj3;
                String str2 = (String) obj2;
                ((u2b) obj).getClass();
                m62 m62Var = ((kp2) obj7).a;
                m62Var.J.S(str);
                String str3 = "";
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                for (Object obj9 : (List) obj5) {
                    int i10 = i7 + 1;
                    if (i7 < 0) {
                        Throwable th2 = th;
                        gc1.i0();
                        throw th2;
                    }
                    d21 d21Var = (d21) obj9;
                    uc2 uc2Var = (uc2) fc1.A0(i7, list2);
                    d21 d21Var2 = (d21) list3.get(i7);
                    int i11 = d21Var.c == i3 ? i3 : b;
                    String strG = i11 != 0 ? dx1.g(i9, str, "_section_") : dx1.g(i8, str, "_");
                    b92 b92Var = m62Var.J;
                    Throwable th3 = th;
                    m62 m62Var2 = m62Var;
                    Map mapP = y86.P(new xl7("raw", d21Var.a), new xl7(str2, d21Var2.a));
                    ?? r2 = uc2Var != null ? uc2Var.c : th3;
                    if (r2 == 0) {
                        r2 = mc3.a;
                    }
                    LinkedHashMap linkedHashMapV = y86.V(mapP, r2);
                    String str4 = d21Var.b;
                    qa1 qa1Var = r95.a;
                    int i12 = i8;
                    b92Var.n0(new uc2(strG, str, linkedHashMapV, str4, str3, i12, qa1Var.k().c(), qa1Var.k().c()));
                    if (i11 != 0) {
                        i9++;
                        str3 = strG;
                        i8 = i12;
                    } else {
                        i8 = i12 + 1;
                    }
                    m62Var = m62Var2;
                    i7 = i10;
                    th = th3;
                    i3 = 1;
                    b = 0;
                }
                return hebVar;
            case 4:
                a07 a07Var = (a07) obj7;
                vx1 vx1Var = (vx1) obj6;
                wq5 wq5Var = (wq5) obj5;
                br9 br9Var = (br9) obj4;
                a07 a07Var2 = (a07) obj3;
                ib4 ib4Var = (ib4) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                if (!((ub3) a07Var.getValue()).b.isEmpty()) {
                    at5.b0(at5Var, (String) null, new rj1(new hu2(vx1Var, wq5Var, br9Var, a07Var2, 2), true, 1957979767), 3);
                }
                List list4 = ((ub3) a07Var.getValue()).c;
                at5Var.c0(list4.size(), new f7(19, new gq2(26), list4), new g7(21, list4), new rj1(new sa3(list4, vx1Var, wq5Var, br9Var, a07Var2, 0), true, 802480018));
                if (!((ub3) a07Var.getValue()).c.isEmpty()) {
                    at5.b0(at5Var, (String) null, new rj1(new oa3(b, ib4Var), true, 621622112), 3);
                }
                return hebVar;
            case 5:
                final kr3 kr3Var = (kr3) obj7;
                ib4 ib4Var2 = (ib4) obj6;
                Set set = (Set) obj5;
                kb4 kb4Var3 = (kb4) obj4;
                kb4 kb4Var4 = (kb4) obj3;
                kb4 kb4Var5 = (kb4) obj2;
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                List list5 = kr3Var.j;
                List list6 = kr3Var.l;
                List list7 = kr3Var.k;
                if (list5.isEmpty()) {
                    kb4Var = kb4Var3;
                } else {
                    aq5Var.a0("update_header", new se3(13), "update_header", new rj1(new qz0(kr3Var, ib4Var2, 12), true, 893085538));
                    List list8 = kr3Var.j;
                    kb4Var = kb4Var3;
                    aq5Var.c0(list8.size(), new f7(28, new kx1(23, b), list8), (yb4) null, new g7(28, list8), new rj1(new wq3(list8, set, kb4Var3, kb4Var4, 1), true, -1942245546));
                }
                if (!list7.isEmpty()) {
                    aq5Var.a0("installed_header", new se3(14), "installed_header", new rj1(new zb4() { // from class: vq3
                        @Override // defpackage.zb4
                        public final Object c(Object obj10, Object obj11, Object obj12) {
                            int i13 = b;
                            heb hebVar2 = heb.a;
                            kr3 kr3Var2 = kr3Var;
                            dq5 dq5Var = (dq5) obj10;
                            dd4 dd4Var = (dd4) obj11;
                            int iIntValue = ((Integer) obj12).intValue();
                            switch (i13) {
                                case 0:
                                    dq5Var.getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        gc1.r(kr3Var2.k.size(), 0, 12, null, dd4Var, null, wn9.K((pv9) iu9.S.getValue(), dd4Var));
                                    }
                                    break;
                                default:
                                    dq5Var.getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        gc1.r(kr3Var2.l.size(), 0, 12, null, dd4Var, null, wn9.K((pv9) vt9.E.getValue(), dd4Var));
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, 1628734681));
                    aq5Var.c0(list7.size(), new f7(29, new kx1(24, b), list7), (yb4) null, new hpb(1, list7), new rj1(new xq3(list7, kb4Var, kb4Var5, b), true, -1942245546));
                }
                if (!list6.isEmpty()) {
                    aq5Var.a0("all_header", new se3(15), "all_header", new rj1(new zb4() { // from class: vq3
                        @Override // defpackage.zb4
                        public final Object c(Object obj10, Object obj11, Object obj12) {
                            int i13 = i3;
                            heb hebVar2 = heb.a;
                            kr3 kr3Var2 = kr3Var;
                            dq5 dq5Var = (dq5) obj10;
                            dd4 dd4Var = (dd4) obj11;
                            int iIntValue = ((Integer) obj12).intValue();
                            switch (i13) {
                                case 0:
                                    dq5Var.getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        gc1.r(kr3Var2.k.size(), 0, 12, null, dd4Var, null, wn9.K((pv9) iu9.S.getValue(), dd4Var));
                                    }
                                    break;
                                default:
                                    dq5Var.getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        gc1.r(kr3Var2.l.size(), 0, 12, null, dd4Var, null, wn9.K((pv9) vt9.E.getValue(), dd4Var));
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, 1304726298));
                    aq5Var.c0(list6.size(), new yq3(b, new kx1(25, b), list6), (yb4) null, new g7(27, list6), new rj1(new wq3(list6, set, kb4Var, kb4Var4, 0), true, -1942245546));
                } else if (kr3Var.a) {
                    aq5.d0(aq5Var, 6, new se3(16), (kb4) null, kl8.g, 12);
                }
                return hebVar;
            case 6:
                u14 u14Var = (u14) obj7;
                String str5 = (String) obj6;
                ((yw2) obj).getClass();
                rj1 rj1Var = new rj1(new ev0((a07) obj5, (a07) obj4, (a07) obj3, (rj1) obj2, 3), true, -106026677);
                u14Var.getClass();
                str5.getClass();
                hk9 hk9Var = u14Var.a;
                ListIterator listIterator = hk9Var.listIterator();
                while (true) {
                    em4 em4Var = (em4) listIterator;
                    if (!em4Var.hasNext()) {
                        i4 = -1;
                    } else if (!lc5.Q(((s14) em4Var.next()).a, str5)) {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    hk9Var.add(new s14(str5, rj1Var));
                }
                return new kb0(2, u14Var, str5);
            case 7:
                List list9 = (List) obj7;
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                at5Var2.c0(list9.size(), new yq3(4, new kx1(i2, b), list9), new r54(1, list9), new rj1(new p64(list9, list9, (fv3) obj6, (String) obj5, (kb4) obj4, (kb4) obj3, (kb4) obj2, 0), true, 2039820996));
                return hebVar;
            default:
                jka jkaVar = (jka) obj7;
                st5 st5Var = (st5) obj6;
                nca ncaVar = (nca) obj5;
                a07 a07Var3 = (a07) obj4;
                a07 a07Var4 = (a07) obj3;
                a07 a07Var5 = (a07) obj2;
                eb7 eb7Var = (eb7) obj;
                if (jkaVar.d() != t19.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (eb7Var.a >> 32));
                    roa roaVar = yoa.a;
                    yia yiaVarB = yoa.b(fIntBitsToFloat - ((Number) a07Var3.getValue()).floatValue(), Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)) - ((Number) a07Var4.getValue()).floatValue(), ((Number) a07Var5.getValue()).intValue(), st5Var.j().k, st5Var.j().p, ncaVar.b);
                    int i13 = jkaVar.c().c;
                    int i14 = jkaVar.b().c;
                    int i15 = yiaVarB.c;
                    if (i13 > i15 || i15 > i14) {
                        jkaVar.a();
                    }
                }
                return hebVar;
        }
    }
}
