package defpackage;

import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Layout;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.UUID;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ww1 {
    public static final int a = 9;
    public static final int b = 10;
    public static final int c = 12;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        br9 br9Var;
        br9 br9Var2;
        float f;
        br9 br9Var3;
        float f2;
        fma fmaVar;
        final int i3;
        final int i4;
        int i5;
        boolean z;
        final int i6;
        final int i7;
        final int i8;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1951248358);
        int i9 = ((i & 6) == 0 ? i | (dd4Var2.f(ou6Var) ? 4 : 2) : i) | (dd4Var2.h(kb4Var) ? 32 : 16);
        if (dd4Var2.V(i9 & 1, (i9 & 19) != 18)) {
            pj4 pj4VarA = e36.a(dd4Var2);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final fma fmaVar2 = (fma) ((qtb) qx1.N(ug8.a(fma.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var2), null));
            final br9 br9VarB = bx1.B(fmaVar2.e, dd4Var2);
            ou6 ou6VarF0 = h67.f0(ou6Var, null, 3);
            vf0 vf0Var = bv4.z;
            ie1 ie1VarA = ge1.a(pv.c, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarF0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            ou6 ou6VarQ = kc5.Q(ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true), kc5.J(dd4Var2), 14);
            int i10 = 6;
            ie1 ie1VarA2 = ge1.a(new mv(12.0f, true, new gp(5)), vf0Var, dd4Var2, 6);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarQ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            boolean zF = dd4Var2.f(((sla) br9VarB.getValue()).c) | dd4Var2.f(((sla) br9VarB.getValue()).d);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                Iterator it = ((sla) br9VarB.getValue()).d.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    } else if (((sla) br9VarB.getValue()).c.equals(((ala) it.next()).a)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(i11);
                if (i11 < 0) {
                    numValueOf2 = null;
                }
                objQ = Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : 0);
                dd4Var2.p0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            String strK = wn9.K((pv9) ev9.t.getValue(), dd4Var2);
            boolean zF2 = dd4Var2.f(((sla) br9VarB.getValue()).d);
            Object objQ2 = dd4Var2.Q();
            Object obj2 = objQ2;
            if (zF2 || objQ2 == obj) {
                List<ala> list = ((sla) br9VarB.getValue()).d;
                ArrayList arrayList = new ArrayList(gc1.M(list, 10));
                for (ala alaVar : list) {
                    String str = alaVar.b;
                    if (str.length() == 0) {
                        str = strK;
                    }
                    arrayList.add(new y71(2, str, alaVar.c));
                }
                dd4Var2.p0(arrayList);
                obj2 = arrayList;
            }
            List list2 = (List) obj2;
            String strK2 = wn9.K((pv9) ev9.O.getValue(), dd4Var2);
            boolean z2 = !((sla) br9VarB.getValue()).c.equals("system");
            lu6 lu6Var = lu6.a;
            ou6 ou6VarP0 = gjb.p0(lu6Var, 20.0f, 12.0f, 20.0f, 0.0f, 8);
            boolean zF3 = dd4Var2.f(fmaVar2) | dd4Var2.f(br9VarB);
            Object objQ3 = dd4Var2.Q();
            if (zF3 || objQ3 == obj) {
                final int i12 = 3;
                objQ3 = new kb4() { // from class: as6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj3) {
                        int i13 = i12;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        a07 a07Var = br9VarB;
                        fma fmaVar3 = fmaVar2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        switch (i13) {
                            case 0:
                                String str2 = ((wka) ((sla) a07Var.getValue()).f.get(iIntValue2)).a;
                                za1 za1VarA = vtb.a(fmaVar3);
                                aj2 aj2Var = rw2.a;
                                fmaVar3.g(za1VarA, nh2.c, new vla(fmaVar3, str2, jt1Var, 1));
                                break;
                            case 1:
                                String str3 = ((yka) ((sla) a07Var.getValue()).h.get(iIntValue2)).a;
                                za1 za1VarA2 = vtb.a(fmaVar3);
                                aj2 aj2Var2 = rw2.a;
                                fmaVar3.g(za1VarA2, nh2.c, new vla(fmaVar3, str3, jt1Var, 2));
                                break;
                            case 2:
                                String str4 = ((cla) ((sla) a07Var.getValue()).k.get(iIntValue2)).a;
                                za1 za1VarA3 = vtb.a(fmaVar3);
                                aj2 aj2Var3 = rw2.a;
                                fmaVar3.g(za1VarA3, nh2.c, new vla(fmaVar3, str4, jt1Var, 4));
                                break;
                            default:
                                String str5 = ((ala) ((sla) a07Var.getValue()).d.get(iIntValue2)).a;
                                str5.getClass();
                                za1 za1VarA4 = vtb.a(fmaVar3);
                                aj2 aj2Var4 = rw2.a;
                                fmaVar3.g(za1VarA4, nh2.c, new vla(fmaVar3, str5, jt1Var, 3));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ3);
            }
            kb4 kb4Var2 = (kb4) objQ3;
            boolean zF4 = ((i9 & Token.ASSIGN_MOD) == 32) | dd4Var2.f(br9VarB);
            Object objQ4 = dd4Var2.Q();
            if (zF4 || objQ4 == obj) {
                objQ4 = new l50(12, kb4Var, br9VarB);
                dd4Var2.p0(objQ4);
            }
            c(strK2, list2, iIntValue, ou6VarP0, z2, kb4Var2, (ib4) objQ4, dd4Var2, 0, 0);
            if (((sla) br9VarB.getValue()).f.isEmpty()) {
                br9Var = br9VarB;
                dd4Var2.f0(1987845128);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1986905270);
                boolean zF5 = dd4Var2.f(((sla) br9VarB.getValue()).e) | dd4Var2.f(((sla) br9VarB.getValue()).f);
                Object objQ5 = dd4Var2.Q();
                if (zF5 || objQ5 == obj) {
                    Iterator it2 = ((sla) br9VarB.getValue()).f.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i13 = -1;
                            break;
                        } else if (((sla) br9VarB.getValue()).e.equals(((wka) it2.next()).a)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    Integer numValueOf3 = Integer.valueOf(i13);
                    if (i13 < 0) {
                        numValueOf3 = null;
                    }
                    objQ5 = Integer.valueOf(numValueOf3 != null ? numValueOf3.intValue() : 0);
                    dd4Var2.p0(objQ5);
                }
                int iIntValue2 = ((Number) objQ5).intValue();
                boolean zF6 = dd4Var2.f(((sla) br9VarB.getValue()).f);
                Object objQ6 = dd4Var2.Q();
                Object obj3 = objQ6;
                if (zF6 || objQ6 == obj) {
                    List list3 = ((sla) br9VarB.getValue()).f;
                    ArrayList arrayList2 = new ArrayList(gc1.M(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new y71(i10, ((wka) it3.next()).b, false));
                    }
                    dd4Var2.p0(arrayList2);
                    obj3 = arrayList2;
                }
                List list4 = (List) obj3;
                String strK3 = wn9.K((pv9) ev9.u.getValue(), dd4Var2);
                ou6 ou6VarN0 = gjb.n0(lu6Var, 20.0f, 0.0f, 2);
                boolean zF7 = dd4Var2.f(fmaVar2) | dd4Var2.f(br9VarB);
                Object objQ7 = dd4Var2.Q();
                if (zF7 || objQ7 == obj) {
                    i8 = 0;
                    objQ7 = new kb4() { // from class: as6
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj32) {
                            int i132 = i8;
                            heb hebVar = heb.a;
                            jt1 jt1Var = null;
                            a07 a07Var = br9VarB;
                            fma fmaVar3 = fmaVar2;
                            int iIntValue22 = ((Integer) obj32).intValue();
                            switch (i132) {
                                case 0:
                                    String str2 = ((wka) ((sla) a07Var.getValue()).f.get(iIntValue22)).a;
                                    za1 za1VarA = vtb.a(fmaVar3);
                                    aj2 aj2Var = rw2.a;
                                    fmaVar3.g(za1VarA, nh2.c, new vla(fmaVar3, str2, jt1Var, 1));
                                    break;
                                case 1:
                                    String str3 = ((yka) ((sla) a07Var.getValue()).h.get(iIntValue22)).a;
                                    za1 za1VarA2 = vtb.a(fmaVar3);
                                    aj2 aj2Var2 = rw2.a;
                                    fmaVar3.g(za1VarA2, nh2.c, new vla(fmaVar3, str3, jt1Var, 2));
                                    break;
                                case 2:
                                    String str4 = ((cla) ((sla) a07Var.getValue()).k.get(iIntValue22)).a;
                                    za1 za1VarA3 = vtb.a(fmaVar3);
                                    aj2 aj2Var3 = rw2.a;
                                    fmaVar3.g(za1VarA3, nh2.c, new vla(fmaVar3, str4, jt1Var, 4));
                                    break;
                                default:
                                    String str5 = ((ala) ((sla) a07Var.getValue()).d.get(iIntValue22)).a;
                                    str5.getClass();
                                    za1 za1VarA4 = vtb.a(fmaVar3);
                                    aj2 aj2Var4 = rw2.a;
                                    fmaVar3.g(za1VarA4, nh2.c, new vla(fmaVar3, str5, jt1Var, 3));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ7);
                } else {
                    i8 = 0;
                }
                br9Var = br9VarB;
                c(strK3, list4, iIntValue2, ou6VarN0, false, (kb4) objQ7, null, dd4Var2, 3072, 80);
                dd4Var2.q(i8);
            }
            if (((sla) br9Var.getValue()).h.isEmpty()) {
                br9Var2 = br9Var;
                f = 0.0f;
                dd4Var2.f0(1988907560);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1987942716);
                boolean zF8 = dd4Var2.f(((sla) br9Var.getValue()).g) | dd4Var2.f(((sla) br9Var.getValue()).h);
                Object objQ8 = dd4Var2.Q();
                if (zF8 || objQ8 == obj) {
                    Iterator it4 = ((sla) br9Var.getValue()).h.iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i14 = -1;
                            break;
                        } else if (((sla) br9Var.getValue()).g.equals(((yka) it4.next()).a)) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    Integer numValueOf4 = Integer.valueOf(i14);
                    if (i14 < 0) {
                        numValueOf4 = null;
                    }
                    objQ8 = Integer.valueOf(numValueOf4 != null ? numValueOf4.intValue() : 0);
                    dd4Var2.p0(objQ8);
                }
                int iIntValue3 = ((Number) objQ8).intValue();
                boolean zF9 = dd4Var2.f(((sla) br9Var.getValue()).h);
                Object objQ9 = dd4Var2.Q();
                Object obj4 = objQ9;
                if (zF9 || objQ9 == obj) {
                    List list5 = ((sla) br9Var.getValue()).h;
                    ArrayList arrayList3 = new ArrayList(gc1.M(list5, 10));
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(new y71(6, ((yka) it5.next()).b, false));
                    }
                    dd4Var2.p0(arrayList3);
                    obj4 = arrayList3;
                }
                List list6 = (List) obj4;
                String strK4 = wn9.K((pv9) ev9.B.getValue(), dd4Var2);
                f = 0.0f;
                ou6 ou6VarN02 = gjb.n0(lu6Var, 20.0f, 0.0f, 2);
                final br9 br9Var4 = br9Var;
                boolean zF10 = dd4Var2.f(fmaVar2) | dd4Var2.f(br9Var4);
                Object objQ10 = dd4Var2.Q();
                if (zF10 || objQ10 == obj) {
                    i7 = 1;
                    objQ10 = new kb4() { // from class: as6
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj32) {
                            int i132 = i7;
                            heb hebVar = heb.a;
                            jt1 jt1Var = null;
                            a07 a07Var = br9Var4;
                            fma fmaVar3 = fmaVar2;
                            int iIntValue22 = ((Integer) obj32).intValue();
                            switch (i132) {
                                case 0:
                                    String str2 = ((wka) ((sla) a07Var.getValue()).f.get(iIntValue22)).a;
                                    za1 za1VarA = vtb.a(fmaVar3);
                                    aj2 aj2Var = rw2.a;
                                    fmaVar3.g(za1VarA, nh2.c, new vla(fmaVar3, str2, jt1Var, 1));
                                    break;
                                case 1:
                                    String str3 = ((yka) ((sla) a07Var.getValue()).h.get(iIntValue22)).a;
                                    za1 za1VarA2 = vtb.a(fmaVar3);
                                    aj2 aj2Var2 = rw2.a;
                                    fmaVar3.g(za1VarA2, nh2.c, new vla(fmaVar3, str3, jt1Var, 2));
                                    break;
                                case 2:
                                    String str4 = ((cla) ((sla) a07Var.getValue()).k.get(iIntValue22)).a;
                                    za1 za1VarA3 = vtb.a(fmaVar3);
                                    aj2 aj2Var3 = rw2.a;
                                    fmaVar3.g(za1VarA3, nh2.c, new vla(fmaVar3, str4, jt1Var, 4));
                                    break;
                                default:
                                    String str5 = ((ala) ((sla) a07Var.getValue()).d.get(iIntValue22)).a;
                                    str5.getClass();
                                    za1 za1VarA4 = vtb.a(fmaVar3);
                                    aj2 aj2Var4 = rw2.a;
                                    fmaVar3.g(za1VarA4, nh2.c, new vla(fmaVar3, str5, jt1Var, 3));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ10);
                } else {
                    i7 = 1;
                }
                br9Var2 = br9Var4;
                c(strK4, list6, iIntValue3, ou6VarN02, false, (kb4) objQ10, null, dd4Var2, 3072, 80);
                dd4Var2.q(false);
            }
            if (((sla) br9Var2.getValue()).k.isEmpty()) {
                br9Var3 = br9Var2;
                f2 = 20.0f;
                dd4Var2.f0(1990232872);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1989010480);
                boolean zF11 = dd4Var2.f(((sla) br9Var2.getValue()).i) | dd4Var2.f(((sla) br9Var2.getValue()).k);
                Object objQ11 = dd4Var2.Q();
                if (zF11 || objQ11 == obj) {
                    Iterator it6 = ((sla) br9Var2.getValue()).k.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i15 = -1;
                            break;
                        } else if (((sla) br9Var2.getValue()).i.equals(((cla) it6.next()).a)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    Integer numValueOf5 = Integer.valueOf(i15);
                    if (i15 < 0) {
                        numValueOf5 = null;
                    }
                    objQ11 = Integer.valueOf(numValueOf5 != null ? numValueOf5.intValue() : 0);
                    dd4Var2.p0(objQ11);
                }
                int iIntValue4 = ((Number) objQ11).intValue();
                String strK5 = wn9.K((pv9) ev9.P.getValue(), dd4Var2);
                boolean zF12 = dd4Var2.f(((sla) br9Var2.getValue()).k);
                Object objQ12 = dd4Var2.Q();
                Object obj5 = objQ12;
                if (zF12 || objQ12 == obj) {
                    List list7 = ((sla) br9Var2.getValue()).k;
                    ArrayList arrayList4 = new ArrayList(gc1.M(list7, 10));
                    int i16 = 0;
                    for (Object obj6 : list7) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        cla claVar = (cla) obj6;
                        String strG = claVar.b;
                        if (strG.length() == 0) {
                            strG = dx1.g(i17, strK5, " ");
                        }
                        arrayList4.add(new y71(strG, claVar.a, claVar.c));
                        i16 = i17;
                    }
                    dd4Var2.p0(arrayList4);
                    obj5 = arrayList4;
                }
                List list8 = (List) obj5;
                String strK6 = wn9.K((pv9) ev9.P.getValue(), dd4Var2);
                final int i18 = 2;
                ou6 ou6VarN03 = gjb.n0(lu6Var, 20.0f, f, 2);
                final br9 br9Var5 = br9Var2;
                boolean zF13 = dd4Var2.f(fmaVar2) | dd4Var2.f(br9Var5);
                Object objQ13 = dd4Var2.Q();
                if (zF13 || objQ13 == obj) {
                    objQ13 = new kb4() { // from class: as6
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj32) {
                            int i132 = i18;
                            heb hebVar = heb.a;
                            jt1 jt1Var = null;
                            a07 a07Var = br9Var5;
                            fma fmaVar3 = fmaVar2;
                            int iIntValue22 = ((Integer) obj32).intValue();
                            switch (i132) {
                                case 0:
                                    String str2 = ((wka) ((sla) a07Var.getValue()).f.get(iIntValue22)).a;
                                    za1 za1VarA = vtb.a(fmaVar3);
                                    aj2 aj2Var = rw2.a;
                                    fmaVar3.g(za1VarA, nh2.c, new vla(fmaVar3, str2, jt1Var, 1));
                                    break;
                                case 1:
                                    String str3 = ((yka) ((sla) a07Var.getValue()).h.get(iIntValue22)).a;
                                    za1 za1VarA2 = vtb.a(fmaVar3);
                                    aj2 aj2Var2 = rw2.a;
                                    fmaVar3.g(za1VarA2, nh2.c, new vla(fmaVar3, str3, jt1Var, 2));
                                    break;
                                case 2:
                                    String str4 = ((cla) ((sla) a07Var.getValue()).k.get(iIntValue22)).a;
                                    za1 za1VarA3 = vtb.a(fmaVar3);
                                    aj2 aj2Var3 = rw2.a;
                                    fmaVar3.g(za1VarA3, nh2.c, new vla(fmaVar3, str4, jt1Var, 4));
                                    break;
                                default:
                                    String str5 = ((ala) ((sla) a07Var.getValue()).d.get(iIntValue22)).a;
                                    str5.getClass();
                                    za1 za1VarA4 = vtb.a(fmaVar3);
                                    aj2 aj2Var4 = rw2.a;
                                    fmaVar3.g(za1VarA4, nh2.c, new vla(fmaVar3, str5, jt1Var, 3));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ13);
                }
                br9Var3 = br9Var5;
                f2 = 20.0f;
                c(strK6, list8, iIntValue4, ou6VarN03, false, (kb4) objQ13, null, dd4Var2, 3072, 80);
                dd4Var2.q(false);
            }
            if (((sla) br9Var3.getValue()).l) {
                dd4Var2.f0(1990311767);
                String strK7 = wn9.K((pv9) ev9.j.getValue(), dd4Var2);
                String str2 = ((sla) br9Var3.getValue()).m;
                ou6 ou6VarN04 = gjb.n0(lu6Var, f2, f, 2);
                boolean zF14 = dd4Var2.f(fmaVar2);
                Object objQ14 = dd4Var2.Q();
                if (zF14 || objQ14 == obj) {
                    i6 = 0;
                    objQ14 = new kb4() { // from class: bs6
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj7) {
                            int i19 = i6;
                            int i20 = 1;
                            int i21 = 0;
                            heb hebVar = heb.a;
                            jt1 jt1Var = null;
                            fma fmaVar3 = fmaVar2;
                            switch (i19) {
                                case 0:
                                    String str3 = (String) obj7;
                                    str3.getClass();
                                    za1 za1VarA = vtb.a(fmaVar3);
                                    aj2 aj2Var = rw2.a;
                                    fmaVar3.g(za1VarA, nh2.c, new vla(fmaVar3, str3, jt1Var, i21));
                                    break;
                                case 1:
                                    int iIntValue5 = ((Integer) obj7).intValue();
                                    za1 za1VarA2 = vtb.a(fmaVar3);
                                    aj2 aj2Var2 = rw2.a;
                                    fmaVar3.g(za1VarA2, nh2.c, new wla(fmaVar3, iIntValue5, jt1Var, i20));
                                    break;
                                case 2:
                                    String str4 = (String) obj7;
                                    str4.getClass();
                                    Integer numL = iw9.L(10, str4);
                                    int iIntValue6 = numL != null ? numL.intValue() : 0;
                                    za1 za1VarA3 = vtb.a(fmaVar3);
                                    aj2 aj2Var3 = rw2.a;
                                    fmaVar3.g(za1VarA3, nh2.c, new wla(fmaVar3, iIntValue6, jt1Var, i21));
                                    break;
                                case 3:
                                    float fFloatValue = ((Float) obj7).floatValue();
                                    za1 za1VarA4 = vtb.a(fmaVar3);
                                    aj2 aj2Var4 = rw2.a;
                                    fmaVar3.g(za1VarA4, nh2.c, new xla(fmaVar3, fFloatValue, jt1Var, i21));
                                    break;
                                default:
                                    float fFloatValue2 = ((Float) obj7).floatValue();
                                    za1 za1VarA5 = vtb.a(fmaVar3);
                                    aj2 aj2Var5 = rw2.a;
                                    fmaVar3.g(za1VarA5, nh2.c, new xla(fmaVar3, fFloatValue2, jt1Var, i20));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var2.p0(objQ14);
                } else {
                    i6 = 0;
                }
                fmaVar = fmaVar2;
                d(strK7, str2, false, 0, 5, null, ou6VarN04, (kb4) objQ14, dd4Var, 1597440, 44);
                dd4Var2 = dd4Var;
                dd4Var2.q(i6);
            } else {
                fmaVar = fmaVar2;
                dd4Var2.f0(1990680264);
                dd4Var2.q(false);
            }
            List listR = wm9.r((hv9) rv.F.getValue(), dd4Var2);
            String strK8 = wn9.K((pv9) ev9.J.getValue(), dd4Var2);
            boolean zF15 = dd4Var2.f(listR);
            Object objQ15 = dd4Var2.Q();
            Object obj7 = objQ15;
            if (zF15 || objQ15 == obj) {
                ArrayList arrayList5 = new ArrayList(gc1.M(listR, 10));
                Iterator it7 = listR.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(new y71(6, (String) it7.next(), false));
                }
                dd4Var2.p0(arrayList5);
                obj7 = arrayList5;
            }
            List list9 = (List) obj7;
            int i19 = ((sla) br9Var3.getValue()).j;
            ou6 ou6VarN05 = gjb.n0(lu6Var, f2, 0.0f, 2);
            final fma fmaVar3 = fmaVar;
            boolean zF16 = dd4Var2.f(fmaVar3);
            Object objQ16 = dd4Var2.Q();
            if (zF16 || objQ16 == obj) {
                i3 = 1;
                objQ16 = new kb4() { // from class: bs6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj72) {
                        int i192 = i3;
                        int i20 = 1;
                        int i21 = 0;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        fma fmaVar32 = fmaVar3;
                        switch (i192) {
                            case 0:
                                String str3 = (String) obj72;
                                str3.getClass();
                                za1 za1VarA = vtb.a(fmaVar32);
                                aj2 aj2Var = rw2.a;
                                fmaVar32.g(za1VarA, nh2.c, new vla(fmaVar32, str3, jt1Var, i21));
                                break;
                            case 1:
                                int iIntValue5 = ((Integer) obj72).intValue();
                                za1 za1VarA2 = vtb.a(fmaVar32);
                                aj2 aj2Var2 = rw2.a;
                                fmaVar32.g(za1VarA2, nh2.c, new wla(fmaVar32, iIntValue5, jt1Var, i20));
                                break;
                            case 2:
                                String str4 = (String) obj72;
                                str4.getClass();
                                Integer numL = iw9.L(10, str4);
                                int iIntValue6 = numL != null ? numL.intValue() : 0;
                                za1 za1VarA3 = vtb.a(fmaVar32);
                                aj2 aj2Var3 = rw2.a;
                                fmaVar32.g(za1VarA3, nh2.c, new wla(fmaVar32, iIntValue6, jt1Var, i21));
                                break;
                            case 3:
                                float fFloatValue = ((Float) obj72).floatValue();
                                za1 za1VarA4 = vtb.a(fmaVar32);
                                aj2 aj2Var4 = rw2.a;
                                fmaVar32.g(za1VarA4, nh2.c, new xla(fmaVar32, fFloatValue, jt1Var, i21));
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj72).floatValue();
                                za1 za1VarA5 = vtb.a(fmaVar32);
                                aj2 aj2Var5 = rw2.a;
                                fmaVar32.g(za1VarA5, nh2.c, new xla(fmaVar32, fFloatValue2, jt1Var, i20));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ16);
            } else {
                i3 = 1;
            }
            c(strK8, list9, i19, ou6VarN05, false, (kb4) objQ16, null, dd4Var2, 3072, 80);
            String strK9 = wn9.K((pv9) ev9.K.getValue(), dd4Var2);
            String strValueOf = String.valueOf(((sla) br9Var3.getValue()).o);
            ou6 ou6VarN06 = gjb.n0(lu6Var, f2, 0.0f, 2);
            qj5 qj5Var = new qj5(3, 0, Token.EXPORT);
            boolean zF17 = dd4Var2.f(fmaVar3);
            Object objQ17 = dd4Var2.Q();
            if (zF17 || objQ17 == obj) {
                i4 = 2;
                objQ17 = new kb4() { // from class: bs6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj72) {
                        int i192 = i4;
                        int i20 = 1;
                        int i21 = 0;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        fma fmaVar32 = fmaVar3;
                        switch (i192) {
                            case 0:
                                String str3 = (String) obj72;
                                str3.getClass();
                                za1 za1VarA = vtb.a(fmaVar32);
                                aj2 aj2Var = rw2.a;
                                fmaVar32.g(za1VarA, nh2.c, new vla(fmaVar32, str3, jt1Var, i21));
                                break;
                            case 1:
                                int iIntValue5 = ((Integer) obj72).intValue();
                                za1 za1VarA2 = vtb.a(fmaVar32);
                                aj2 aj2Var2 = rw2.a;
                                fmaVar32.g(za1VarA2, nh2.c, new wla(fmaVar32, iIntValue5, jt1Var, i20));
                                break;
                            case 2:
                                String str4 = (String) obj72;
                                str4.getClass();
                                Integer numL = iw9.L(10, str4);
                                int iIntValue6 = numL != null ? numL.intValue() : 0;
                                za1 za1VarA3 = vtb.a(fmaVar32);
                                aj2 aj2Var3 = rw2.a;
                                fmaVar32.g(za1VarA3, nh2.c, new wla(fmaVar32, iIntValue6, jt1Var, i21));
                                break;
                            case 3:
                                float fFloatValue = ((Float) obj72).floatValue();
                                za1 za1VarA4 = vtb.a(fmaVar32);
                                aj2 aj2Var4 = rw2.a;
                                fmaVar32.g(za1VarA4, nh2.c, new xla(fmaVar32, fFloatValue, jt1Var, i21));
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj72).floatValue();
                                za1 za1VarA5 = vtb.a(fmaVar32);
                                aj2 aj2Var5 = rw2.a;
                                fmaVar32.g(za1VarA5, nh2.c, new xla(fmaVar32, fFloatValue2, jt1Var, i20));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ17);
            } else {
                i4 = 2;
            }
            d(strK9, strValueOf, true, 0, 0, qj5Var, ou6VarN06, (kb4) objQ17, dd4Var, 1769856, 24);
            ou6 ou6VarW = t96.w(gjb.n0(lu6Var, f2, 0.0f, i4), s00.p(dd4Var).d);
            long jG = dd1.g(s00.o(dd4Var), 3.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarW, jG, lp4Var), 14.0f, 12.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarM0);
            ml1.k.getClass();
            um1 um1Var2 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var2);
            } else {
                dd4Var.s0();
            }
            jm jmVar5 = ll1.f;
            un9.s(jmVar5, dd4Var, ha6VarD);
            jm jmVar6 = ll1.e;
            un9.s(jmVar6, dd4Var, lr7VarL3);
            Integer numValueOf6 = Integer.valueOf(iHashCode3);
            jm jmVar7 = ll1.g;
            un9.s(jmVar7, dd4Var, numValueOf6);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var, kdVar2);
            jm jmVar8 = ll1.d;
            un9.s(jmVar8, dd4Var, ou6VarL03);
            float f3 = ((sla) br9Var3.getValue()).a;
            float f4 = ((sla) br9Var3.getValue()).b;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean zF18 = dd4Var.f(fmaVar3);
            Object objQ18 = dd4Var.Q();
            if (zF18 || objQ18 == obj) {
                final int i20 = 3;
                objQ18 = new kb4() { // from class: bs6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj72) {
                        int i192 = i20;
                        int i202 = 1;
                        int i21 = 0;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        fma fmaVar32 = fmaVar3;
                        switch (i192) {
                            case 0:
                                String str3 = (String) obj72;
                                str3.getClass();
                                za1 za1VarA = vtb.a(fmaVar32);
                                aj2 aj2Var = rw2.a;
                                fmaVar32.g(za1VarA, nh2.c, new vla(fmaVar32, str3, jt1Var, i21));
                                break;
                            case 1:
                                int iIntValue5 = ((Integer) obj72).intValue();
                                za1 za1VarA2 = vtb.a(fmaVar32);
                                aj2 aj2Var2 = rw2.a;
                                fmaVar32.g(za1VarA2, nh2.c, new wla(fmaVar32, iIntValue5, jt1Var, i202));
                                break;
                            case 2:
                                String str4 = (String) obj72;
                                str4.getClass();
                                Integer numL = iw9.L(10, str4);
                                int iIntValue6 = numL != null ? numL.intValue() : 0;
                                za1 za1VarA3 = vtb.a(fmaVar32);
                                aj2 aj2Var3 = rw2.a;
                                fmaVar32.g(za1VarA3, nh2.c, new wla(fmaVar32, iIntValue6, jt1Var, i21));
                                break;
                            case 3:
                                float fFloatValue = ((Float) obj72).floatValue();
                                za1 za1VarA4 = vtb.a(fmaVar32);
                                aj2 aj2Var4 = rw2.a;
                                fmaVar32.g(za1VarA4, nh2.c, new xla(fmaVar32, fFloatValue, jt1Var, i21));
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj72).floatValue();
                                za1 za1VarA5 = vtb.a(fmaVar32);
                                aj2 aj2Var5 = rw2.a;
                                fmaVar32.g(za1VarA5, nh2.c, new xla(fmaVar32, fFloatValue2, jt1Var, i202));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ18);
            }
            kb4 kb4Var3 = (kb4) objQ18;
            boolean zF19 = dd4Var.f(fmaVar3);
            Object objQ19 = dd4Var.Q();
            if (zF19 || objQ19 == obj) {
                final int i21 = 4;
                objQ19 = new kb4() { // from class: bs6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj72) {
                        int i192 = i21;
                        int i202 = 1;
                        int i212 = 0;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        fma fmaVar32 = fmaVar3;
                        switch (i192) {
                            case 0:
                                String str3 = (String) obj72;
                                str3.getClass();
                                za1 za1VarA = vtb.a(fmaVar32);
                                aj2 aj2Var = rw2.a;
                                fmaVar32.g(za1VarA, nh2.c, new vla(fmaVar32, str3, jt1Var, i212));
                                break;
                            case 1:
                                int iIntValue5 = ((Integer) obj72).intValue();
                                za1 za1VarA2 = vtb.a(fmaVar32);
                                aj2 aj2Var2 = rw2.a;
                                fmaVar32.g(za1VarA2, nh2.c, new wla(fmaVar32, iIntValue5, jt1Var, i202));
                                break;
                            case 2:
                                String str4 = (String) obj72;
                                str4.getClass();
                                Integer numL = iw9.L(10, str4);
                                int iIntValue6 = numL != null ? numL.intValue() : 0;
                                za1 za1VarA3 = vtb.a(fmaVar32);
                                aj2 aj2Var3 = rw2.a;
                                fmaVar32.g(za1VarA3, nh2.c, new wla(fmaVar32, iIntValue6, jt1Var, i212));
                                break;
                            case 3:
                                float fFloatValue = ((Float) obj72).floatValue();
                                za1 za1VarA4 = vtb.a(fmaVar32);
                                aj2 aj2Var4 = rw2.a;
                                fmaVar32.g(za1VarA4, nh2.c, new xla(fmaVar32, fFloatValue, jt1Var, i212));
                                break;
                            default:
                                float fFloatValue2 = ((Float) obj72).floatValue();
                                za1 za1VarA5 = vtb.a(fmaVar32);
                                aj2 aj2Var5 = rw2.a;
                                fmaVar32.g(za1VarA5, nh2.c, new xla(fmaVar32, fFloatValue2, jt1Var, i202));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ19);
            }
            bx1.u(f3, f4, ou6VarF, kb4Var3, (kb4) objQ19, dd4Var, 384);
            xv5.z(dd4Var, true, lu6Var, 24.0f, dd4Var);
            xv5.z(dd4Var, true, lu6Var, 8.0f, dd4Var);
            ou6 ou6VarL = fe.L(t96.w(tg9.h(gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 20.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7), 52.0f), s00.p(dd4Var).c), s00.o(dd4Var).c, lp4Var);
            boolean zF20 = dd4Var.f(fmaVar3);
            Object objQ20 = dd4Var.Q();
            if (zF20 || objQ20 == obj) {
                i5 = 2;
                objQ20 = new wn6(fmaVar3, i5);
                dd4Var.p0(objQ20);
            } else {
                i5 = 2;
            }
            ou6 ou6VarN07 = gjb.n0(fw.J(null, (ib4) objQ20, ou6VarL, false, 15), 20.0f, 0.0f, i5);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var, 54);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN07);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var2);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar5, dd4Var, eq8VarA);
            un9.s(jmVar6, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar7, dd4Var, kdVar2);
            un9.s(jmVar8, dd4Var, ou6VarL04);
            if (((sla) br9Var3.getValue()).p) {
                dd4Var.f0(649170676);
                z = true;
                sdc.y(tg9.n(lu6Var, 24.0f), s00.o(dd4Var).d, null, dd4Var, 6, 4);
                dd4Var.q(false);
                i2 = i;
                dd4Var2 = dd4Var;
            } else {
                dd4Var.f0(649368456);
                mx4.a(i25.c((m53) f53.g.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), s00.o(dd4Var).d, dd4Var, 432, 0);
                un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
                i2 = i;
                nha.c(wn9.K((pv9) ev9.N.getValue(), dd4Var), new bp5(1.0f, false), s00.o(dd4Var).d, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var, 0, 24960, 241656);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
                z = true;
            }
            dd4Var2.q(z);
            dd4Var2.q(z);
        } else {
            i2 = i;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i2, kb4Var, ou6Var, 5);
        }
    }

    public static Object B(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final int C(int i, g07 g07Var) {
        int i2 = g07Var.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = g07Var.a;
            int i5 = ((zb5) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((zb5) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final boolean D(j23 j23Var, long j) {
        if (!((nu6) j23Var).a.z) {
            return false;
        }
        x75 x75Var = (x75) vw1.S(j23Var).S.d;
        if (!((nu6) x75Var.g0).z) {
            return false;
        }
        long jP = x75Var.P(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L));
        long j2 = j23Var.D;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static byte[] E(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static hu8 F(iu8 iu8Var, long j, long j2, long j3, ur1 ur1Var, float f, float f2) {
        ur1Var.getClass();
        if ((f2 > 0.0f && f2 < f) || (f2 > 0.0f && f2 > f && f2 / f < 1.5f && Math.abs(f2 - f) < 1.5f)) {
            f = f2;
        }
        hu8 hu8VarL = iu8Var.l(j, j2, j3, ur1Var, f, f2);
        return new hu8(f, hu8VarL.b, hu8VarL.c);
    }

    public static final boolean G(kf8 kf8Var, float f, float f2) {
        float f3 = kf8Var.a;
        if (f > kf8Var.c || f3 > f) {
            return false;
        }
        return f2 <= kf8Var.d && kf8Var.b <= f2;
    }

    public static final mf4 H(mf4 mf4Var, float f) {
        return mf4Var.d(new xw1(new ts2(f)));
    }

    public static final float[] I(float f, float f2, float f3, float[] fArr) {
        return new float[]{(fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f), (fArr[5] * f3) + (fArr[4] * f2) + (fArr[3] * f), (fArr[8] * f3) + (fArr[7] * f2) + (fArr[6] * f)};
    }

    public static final float[] J(float f, float f2, float f3, float[] fArr) {
        fArr.getClass();
        return new float[]{fArr[0] * f, fArr[1] * f2, fArr[2] * f3, fArr[3] * f, fArr[4] * f2, fArr[5] * f3, fArr[6] * f, fArr[7] * f2, fArr[8] * f3};
    }

    public static final float K(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 * 3;
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + (fArr2[i] * fArr[i3]);
    }

    public static final String L(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final String M(gnb gnbVar) {
        gnbVar.getClass();
        String strReplace = gnbVar.a.replace('\\', '/');
        strReplace.getClass();
        return bw9.t0('/', strReplace, strReplace);
    }

    public static final float N(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = sha.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : c65.a[paragraphAlignment.ordinal()]) == 1) {
            return dx1.b(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float O(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = sha.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? c65.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static float[] Q(float[] fArr) {
        double d = fArr[0];
        double d2 = fArr[1];
        double d3 = fArr[2];
        double d4 = fArr[3];
        double d5 = fArr[4];
        double d6 = fArr[5];
        double d7 = fArr[6];
        double d8 = fArr[7];
        double d9 = fArr[8];
        double d10 = (d5 * d9) - (d8 * d6);
        double d11 = (d8 * d3) - (d2 * d9);
        double d12 = (d2 * d6) - (d5 * d3);
        double d13 = (d7 * d12) + (d4 * d11) + (d * d10);
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        fArrCopyOf[0] = (float) (d10 / d13);
        fArrCopyOf[3] = (float) tw2.a(d4, d9, d7 * d6, d13);
        fArrCopyOf[6] = (float) tw2.a(d7, d5, d4 * d8, d13);
        fArrCopyOf[1] = (float) (d11 / d13);
        fArrCopyOf[4] = (float) tw2.a(d7, d3, d * d9, d13);
        fArrCopyOf[7] = (float) tw2.a(d, d8, d7 * d2, d13);
        fArrCopyOf[2] = (float) (d12 / d13);
        fArrCopyOf[5] = (float) tw2.a(d, d6, d4 * d3, d13);
        fArrCopyOf[8] = (float) tw2.a(d4, d2, d * d5, d13);
        return fArrCopyOf;
    }

    public static final boolean R(dd4 dd4Var) {
        return (((Configuration) dd4Var.j(he.a)).uiMode & 48) == 32;
    }

    public static final boolean S(k46 k46Var) {
        k46Var.getClass();
        return k46Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T(java.lang.String r9) {
        /*
            r9.getClass()
            java.lang.String r0 = ":"
            r1 = 6
            r2 = 0
            int r0 = defpackage.bw9.X(r9, r0, r2, r2, r1)
            r1 = 1
            if (r0 < 0) goto L2d
            java.lang.String r3 = r9.substring(r0)
            java.lang.String r4 = "://"
            boolean r3 = defpackage.iw9.K(r3, r4, r2)
            if (r3 == 0) goto L1b
            r1 = 3
        L1b:
            int r0 = r0 + r1
            java.lang.String r1 = r9.substring(r2, r0)
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r9 = T(r9)
            java.lang.String r9 = r1.concat(r9)
            return r9
        L2d:
            r0 = 92
            r3 = 47
            java.lang.String r9 = r9.replace(r0, r3)
            r9.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "/"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r9 = defpackage.bw9.p0(r9, r0)
            r9.size()
        L4a:
            int r0 = r9.size()
            if (r2 >= r0) goto La1
            java.lang.Object r0 = r9.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r0.hashCode()
            if (r4 == 0) goto L88
            r5 = 46
            if (r4 == r5) goto L7f
            r5 = 1472(0x5c0, float:2.063E-42)
            if (r4 == r5) goto L65
            goto L90
        L65:
            java.lang.String r4 = ".."
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L6e
            goto L90
        L6e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9e
            if (r2 == r1) goto L9e
            int r0 = r3.size()
            int r0 = r0 - r1
            r3.remove(r0)
            goto L9e
        L7f:
            java.lang.String r4 = "."
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L9e
            goto L90
        L88:
            java.lang.String r4 = ""
            boolean r5 = r0.equals(r4)
            if (r5 != 0) goto L94
        L90:
            r3.add(r0)
            goto L9e
        L94:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L9b
            goto L9e
        L9b:
            r3.add(r4)
        L9e:
            int r2 = r2 + 1
            goto L4a
        La1:
            r7 = 0
            r8 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            java.lang.String r9 = defpackage.fc1.D0(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.T(java.lang.String):java.lang.String");
    }

    public static final int U(kq5 kq5Var, lh7 lh7Var) {
        return (int) (lh7Var == lh7.a ? kq5Var.u & 4294967295L : kq5Var.u >> 32);
    }

    public static uc6 X(byte[] bArr) {
        UUID[] uuidArr;
        hn7 hn7Var = new hn7(bArr);
        if (hn7Var.c < 32) {
            return null;
        }
        hn7Var.M(0);
        int iA = hn7Var.a();
        int iM = hn7Var.m();
        if (iM != iA) {
            fe.n0("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = hn7Var.m();
        if (iM2 != 1886614376) {
            dx1.s(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = xn0.e(hn7Var.m());
        if (iE > 1) {
            dx1.s(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(hn7Var.t(), hn7Var.t());
        if (iE == 1) {
            int iD = hn7Var.D();
            uuidArr = new UUID[iD];
            for (int i = 0; i < iD; i++) {
                uuidArr[i] = new UUID(hn7Var.t(), hn7Var.t());
            }
        } else {
            uuidArr = null;
        }
        int iD2 = hn7Var.D();
        int iA2 = hn7Var.a();
        if (iD2 == iA2) {
            byte[] bArr2 = new byte[iD2];
            hn7Var.k(bArr2, 0, iD2);
            return new uc6(uuid, iE, bArr2, uuidArr);
        }
        fe.n0("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v12 ne) = (r6v11 ne), (r6v13 ne) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v8 dwa) = (r21v7 dwa), (r21v9 dwa) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v5 bp) = (r22v4 bp), (r22v6 bp) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v5 fg) = (r23v4 fg), (r23v6 fg) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 bs1) = (r24v5 bs1), (r24v7 bs1) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v8 uo8) = (r26v7 uo8), (r26v9 uo8) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Y(android.view.ViewStructure r38, sn5 r39, android.view.autofill.AutofillId r40, java.lang.String r41, of8 r42) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.Y(android.view.ViewStructure, sn5, android.view.autofill.AutofillId, java.lang.String, of8):void");
    }

    public static final l7 Z(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        rt8 rt8Var = l7.i;
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new z16(26);
            dd4Var.p0(objQ);
        }
        return (l7) d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
    }

    public static final a07 a0(Object[] objArr, ib4 ib4Var, dd4 dd4Var, int i) {
        return (a07) c0(Arrays.copyOf(objArr, objArr.length), new rt8(new qp6(19), new f48(7)), ib4Var, dd4Var, ((i << 3) & 7168) | 384);
    }

    public static final Object b0(Object[] objArr, ib4 ib4Var, dd4 dd4Var, int i) {
        return c0(Arrays.copyOf(objArr, objArr.length), s32.R, ib4Var, dd4Var, ((i << 6) & 7168) | 384);
    }

    public static final void c(String str, List list, int i, ou6 ou6Var, boolean z, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        boolean z2;
        int i4;
        ib4 ib4Var2;
        int i5;
        boolean z3;
        ib4 ib4Var3;
        ib4 ib4Var4;
        ib4 ib4Var5;
        a07 a07Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(636504481);
        int i6 = (dd4Var2.f(str) ? 4 : 2) | i2 | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.d(i) ? 256 : Token.CASE);
        if ((i2 & 3072) == 0) {
            i6 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (dd4Var2.g(z2) ? 16384 : 8192);
        }
        int i8 = i4 | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT);
        int i9 = i3 & 64;
        if (i9 != 0) {
            i5 = i8 | 1572864;
            ib4Var2 = ib4Var;
        } else {
            ib4Var2 = ib4Var;
            i5 = i8 | (dd4Var2.h(ib4Var2) ? 1048576 : 524288);
        }
        int i10 = 1;
        if (dd4Var2.V(i5 & 1, (599187 & i5) != 599186)) {
            boolean z4 = i7 != 0 ? false : z2;
            Object obj = vl1.a;
            if (i9 != 0) {
                Object objQ = dd4Var2.Q();
                if (objQ == obj) {
                    objQ = new dh1(i10);
                    dd4Var2.p0(objQ);
                }
                ib4Var4 = (ib4) objQ;
            } else {
                ib4Var4 = ib4Var2;
            }
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ2);
            }
            a07 a07Var2 = (a07) objQ2;
            int i11 = i5 >> 9;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            int i12 = i5;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), jf0.G);
            boolean zH = dd4Var2.h(list);
            Object objQ3 = dd4Var2.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new vf6(24, list, a07Var2);
                dd4Var2.p0(objQ3);
            }
            ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ3, ou6VarL, false, 15), 14.0f, 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarM0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            bp5 bp5VarG = ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5VarG);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            y(str, null, dd4Var2, i12 & 14);
            y71 y71Var = (y71) fc1.A0(i, list);
            String str2 = y71Var != null ? y71Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            nha.c(str2, tg9.f(lu6Var, 1.0f), lc1.c(0.62f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 48, 24960, 109560);
            dd4Var.q(true);
            if (z4) {
                dd4Var.f0(-897473020);
                ib4 ib4Var6 = ib4Var4;
                sw1.r(i25.c((m53) f53.m0.getValue(), dd4Var, 0), (ou6) null, 0L, ib4Var6, dd4Var, i11 & 7168, 6);
                ib4Var5 = ib4Var6;
                dd4Var.q(false);
            } else {
                ib4Var5 = ib4Var4;
                dd4Var.f0(-897301001);
                dd4Var.q(false);
            }
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            mx4.a(i25.c((m53) f53.t.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 18.0f), lc1.c(0.6f, ((q96) dd4Var.j(ur9Var)).a.q), dd4Var, 432, 0);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            xf0 xf0Var = bv4.s;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                a07Var = a07Var2;
                objQ4 = new bq6(a07Var, 10);
                dd4Var.p0(objQ4);
            } else {
                a07Var = a07Var2;
            }
            gx1.a(zBooleanValue, xf0Var, 0L, lu6Var, 0.0f, null, (ib4) objQ4, jf0.G(303791771, new hq6(list, i, kb4Var, a07Var, 1), dd4Var), dd4Var, 14158896, 52);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            ib4Var3 = ib4Var5;
            z3 = z4;
        } else {
            dd4Var2.Y();
            z3 = z2;
            ib4Var3 = ib4Var2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ds6(str, list, i, ou6Var, z3, kb4Var, ib4Var3, i2, i3);
        }
    }

    public static final Object c0(Object[] objArr, qt8 qt8Var, ib4 ib4Var, dd4 dd4Var, int i) {
        Object[] objArr2;
        qt8 qt8Var2;
        Object obj;
        Object objE;
        long j = dd4Var.T;
        gjb.X(36);
        String string = Long.toString(j, 36);
        string.getClass();
        qt8Var.getClass();
        rs8 rs8Var = (rs8) dd4Var.j(ts8.a);
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (objQ == fu6Var) {
            Object objA = (rs8Var == null || (objE = rs8Var.e(string)) == null) ? null : qt8Var.a(objE);
            if (objA == null) {
                objA = ib4Var.invoke();
            }
            objArr2 = objArr;
            qt8Var2 = qt8Var;
            ms8 ms8Var = new ms8(qt8Var2, rs8Var, string, objA, objArr2);
            dd4Var.p0(ms8Var);
            objQ = ms8Var;
        } else {
            objArr2 = objArr;
            qt8Var2 = qt8Var;
        }
        ms8 ms8Var2 = (ms8) objQ;
        Object objInvoke = Arrays.equals(objArr2, ms8Var2.e) ? ms8Var2.d : null;
        if (objInvoke == null) {
            objInvoke = ib4Var.invoke();
        }
        boolean zH = dd4Var.h(ms8Var2) | ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.h(qt8Var2)) || (i & 48) == 32) | dd4Var.h(rs8Var) | dd4Var.f(string) | dd4Var.h(objInvoke) | dd4Var.h(objArr2);
        Object objQ2 = dd4Var.Q();
        if (zH || objQ2 == fu6Var) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            c51 c51Var = new c51(ms8Var2, qt8Var2, rs8Var, string, obj, objArr3, 3);
            dd4Var.p0(c51Var);
            objQ2 = c51Var;
        } else {
            obj = objInvoke;
        }
        lc5.H((ib4) objQ2, dd4Var);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r38, java.lang.String r39, boolean r40, int r41, int r42, qj5 r43, ou6 r44, defpackage.kb4 r45, dd4 r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.d(java.lang.String, java.lang.String, boolean, int, int, qj5, ou6, kb4, dd4, int, int):void");
    }

    public static final Object d0(Object[] objArr, qt8 qt8Var, ib4 ib4Var, dd4 dd4Var, int i) {
        return c0(Arrays.copyOf(objArr, objArr.length), qt8Var, ib4Var, dd4Var, ((i << 3) & 7168) | 384);
    }

    public static final View e0(lm2 lm2Var) {
        if (!((nu6) lm2Var).a.z) {
            q75.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return vn5.a(vw1.S(lm2Var));
    }

    public static final void f0(g18 g18Var, String str, String str2) throws Throwable {
        g18Var.getClass();
        str.getClass();
        str2.getClass();
        g18Var.j(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.ib4 r17, ou6 r18, t89 r19, long r20, long r22, defpackage.k14 r24, final defpackage.yb4 r25, dd4 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.g(ib4, ou6, t89, long, long, k14, yb4, dd4, int, int):void");
    }

    public static int i0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final void j(final ib4 ib4Var, final uka ukaVar, final float f, final ou6 ou6Var, final t89 t89Var, final long j, final long j2, final k14 k14Var, final yb4 yb4Var, dd4 dd4Var, final int i, final int i2) {
        int i3;
        yb4 yb4Var2;
        int i4;
        int i5;
        ou6 ou6Var2;
        dd4Var.h0(121669932);
        if ((i & 6) == 0) {
            i3 = (dd4Var.h(ib4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.f(ukaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dd4Var.c(f) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.c(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dd4Var.f(t89Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i3 |= dd4Var.e(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= dd4Var.e(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= dd4Var.f(k14Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= dd4Var.f((Object) null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            yb4Var2 = yb4Var;
            i4 = i2 | (dd4Var.h(yb4Var2) ? 4 : 2);
        } else {
            yb4Var2 = yb4Var;
            i4 = i2;
        }
        int i6 = 3;
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            dd4Var.f0(-282853233);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = ky0.i(dd4Var);
            }
            yy6 yy6Var = (yy6) objQ;
            dd4Var.q(false);
            Object objQ2 = dd4Var.Q();
            int i7 = 20;
            if (objQ2 == obj) {
                objQ2 = new se3(i7);
                dd4Var.p0(objQ2);
            }
            ou6 ou6VarC = a29.c(ou6Var, false, (kb4) objQ2);
            float f2 = k14Var.a;
            int i8 = i3 >> 21;
            int i9 = i8 & Token.ASSIGN_MOD;
            boolean zF = dd4Var.f(yy6Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                i5 = i3;
                ou6Var2 = ou6VarC;
                objQ3 = new n14(k14Var.a, k14Var.b, k14Var.d, k14Var.c);
                dd4Var.p0(objQ3);
            } else {
                i5 = i3;
                ou6Var2 = ou6VarC;
            }
            n14 n14Var = (n14) objQ3;
            boolean zH = dd4Var.h(n14Var) | (((i9 ^ 48) > 32 && dd4Var.f(k14Var)) || (i8 & 48) == 32);
            Object objQ4 = dd4Var.Q();
            if (zH || objQ4 == obj) {
                objQ4 = new yw3(n14Var, k14Var, (jt1) null, i6);
                dd4Var.p0(objQ4);
            }
            lc5.u((yb4) objQ4, dd4Var, k14Var);
            boolean zF2 = dd4Var.f(yy6Var) | dd4Var.h(n14Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new hl2(yy6Var, n14Var, null, 20);
                dd4Var.p0(objQ5);
            }
            lc5.u((yb4) objQ5, dd4Var, yy6Var);
            int i10 = i5 >> 6;
            j1a.b(ib4Var, ou6Var2, false, t89Var, j, j2, f2, ((x13) n14Var.e.c.b.getValue()).a, (wm0) null, yy6Var, jf0.G(-1779603465, new p14(j2, ukaVar, f, yb4Var2), dd4Var), dd4Var, (i5 & 14) | (i10 & 7168) | (57344 & i10) | (i10 & 458752), 260);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: q14
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i | 1);
                    int iX02 = qu1.x0(i2);
                    ww1.j(ib4Var, ukaVar, f, ou6Var, t89Var, j, j2, k14Var, yb4Var, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static int j0(Object obj) {
        return i0(obj == null ? 0 : obj.hashCode());
    }

    public static final void k(q55 q55Var, boolean z, lm8 lm8Var, kb4 kb4Var, dd4 dd4Var, int i) {
        q55 q55Var2;
        String str;
        boolean z2;
        String strK;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1262461770);
        int i2 = i | (dd4Var2.f(q55Var) ? 4 : 2) | (dd4Var2.d(lm8Var.ordinal()) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1155) != 1154)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(lm8Var);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            ou6 ou6VarF = tg9.f(kc5.D(), 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarF);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarM0 = gjb.m0(xv5.h(lu6Var, 12.0f, dd4Var2, lu6Var, 1.0f), 16.0f, 8.0f);
            boolean z3 = ((lm8) a07Var.getValue()) == lm8.a;
            String strK2 = wn9.K((pv9) vu9.j.getValue(), dd4Var2);
            String strK3 = wn9.K((pv9) vu9.k.getValue(), dd4Var2);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                str = strK3;
                objQ2 = new cl6(a07Var, 4);
                dd4Var2.p0(objQ2);
            } else {
                str = strK3;
            }
            e11.w(strK2, str, ou6VarM0, false, z3, (kb4) objQ2, dd4Var2, 196992, 8);
            ou6 ou6VarM02 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean z4 = ((lm8) a07Var.getValue()) == lm8.b;
            String strK4 = wn9.K((pv9) vu9.f.getValue(), dd4Var2);
            String strK5 = wn9.K((pv9) vu9.g.getValue(), dd4Var2);
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                objQ3 = new cl6(a07Var, 5);
                dd4Var2.p0(objQ3);
            }
            e11.w(strK4, strK5, ou6VarM02, false, z4, (kb4) objQ3, dd4Var2, 196992, 8);
            ou6 ou6VarM03 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
            boolean z5 = ((lm8) a07Var.getValue()) == lm8.c;
            String strK6 = wn9.K((pv9) vu9.h.getValue(), dd4Var2);
            String strK7 = wn9.K((pv9) vu9.i.getValue(), dd4Var2);
            Object objQ4 = dd4Var2.Q();
            int i3 = 6;
            if (objQ4 == obj) {
                objQ4 = new cl6(a07Var, i3);
                dd4Var2.p0(objQ4);
            }
            e11.w(strK6, strK7, ou6VarM03, false, z5, (kb4) objQ4, dd4Var2, 196992, 8);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            if (q55Var != null) {
                dd4Var2.f0(377939062);
                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2);
                eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, eq8VarA);
                un9.s(jmVar2, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL02);
                sdc.y(tg9.n(lu6Var, 28.0f), 0L, null, dd4Var, 6, 6);
                un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
                q55Var2 = q55Var;
                int iOrdinal = q55Var2.a.ordinal();
                if (iOrdinal != 0) {
                    z2 = true;
                    if (iOrdinal == 1) {
                        dd4Var.f0(1110149816);
                        strK = wn9.K((pv9) mu9.J0.getValue(), dd4Var);
                        dd4Var.q(false);
                    } else if (iOrdinal == 2) {
                        dd4Var.f0(1110153742);
                        pv9 pv9Var = (pv9) vu9.L.getValue();
                        String strK8 = wn9.K((pv9) mu9.H0.getValue(), dd4Var);
                        int i4 = q55Var2.c;
                        strK = wn9.L(pv9Var, new Object[]{strK8, Integer.valueOf(i4 > 0 ? (q55Var2.b * 100) / i4 : 0)}, dd4Var);
                        dd4Var.q(false);
                    } else if (iOrdinal == 3) {
                        dd4Var.f0(1110163095);
                        strK = wn9.K((pv9) mu9.F0.getValue(), dd4Var);
                        dd4Var.q(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw j39.e(1110144200, dd4Var, false);
                        }
                        dd4Var.f0(1110166808);
                        strK = wn9.K((pv9) mu9.G0.getValue(), dd4Var);
                        dd4Var.q(false);
                    }
                } else {
                    z2 = true;
                    dd4Var.f0(1110146072);
                    strK = wn9.K((pv9) mu9.I0.getValue(), dd4Var);
                    dd4Var.q(false);
                }
                nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, 0, 0, 131070);
                dd4Var2 = dd4Var;
                dd4Var2.q(z2);
                dd4Var2.q(false);
            } else {
                q55Var2 = q55Var;
                dd4Var2.f0(379238024);
                p35 p35VarC = i25.c((m53) h53.h.getValue(), dd4Var2, 0);
                String strK9 = wn9.K((pv9) vu9.P.getValue(), dd4Var2);
                ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2);
                boolean z6 = (i2 & 7168) == 2048;
                Object objQ5 = dd4Var2.Q();
                if (z6 || objQ5 == obj) {
                    objQ5 = new l50(6, kb4Var, a07Var);
                    dd4Var2.p0(objQ5);
                }
                z2 = true;
                kc5.n(p35VarC, strK9, false, null, ou6VarN02, null, null, null, (ib4) objQ5, dd4Var, 24576, 236);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            xv5.A(lu6Var, 8.0f, dd4Var2, z2);
        } else {
            q55Var2 = q55Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(q55Var2, z, lm8Var, kb4Var, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [lc3] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vm3 k0(defpackage.wa2 r38) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.k0(wa2):vm3");
    }

    public static final void l(l7 l7Var, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i) {
        l7Var.getClass();
        yb4Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(1585154504);
        int i2 = i | (dd4Var.f(l7Var) ? 4 : 2) | (dd4Var.h(yb4Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean zBooleanValue = ((Boolean) l7Var.a.getValue()).booleanValue();
            ou6 ou6VarE = yib.E(lu6.a, 14);
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new qi6(l7Var, i3);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(1244173300, new xp5(6, yb4Var, l7Var), dd4Var), null, ou6VarE, jf0.G(568121873, new ah(l7Var, 24), dd4Var), vm7.i, null, 0L, 0L, 0.0f, false, false, jf0.G(1527225500, new xp5(7, l7Var, kb4Var), dd4Var), dd4Var, 1769856, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(l7Var, yb4Var, kb4Var, i, 20);
        }
    }

    public static final to3 l0(wa2 wa2Var) {
        return m0(wa2Var.a, wa2Var.b, wa2Var.c, wa2Var.d, wa2Var.e, wa2Var.f, wa2Var.i, wa2Var.j, wa2Var.k, wa2Var.l, wa2Var.m, wa2Var.n, wa2Var.u, wa2Var.x);
    }

    public static final void m(boolean z, String str, String str2, String str3, boolean z2, int i, int i2, qj5 qj5Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i3) {
        int i4;
        String str4;
        String str5;
        dd4Var.h0(908330413);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.g(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.f(str2) ? 256 : Token.CASE;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= dd4Var.d(i) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i3) == 0) {
            i5 |= dd4Var.d(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= dd4Var.f(qj5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= dd4Var.h(kb4Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i5 |= dd4Var.h(kb4Var2) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if (dd4Var.V(i6 & 1, (306783379 & i6) != 306783378)) {
            dd4Var.a0();
            if ((i3 & 1) == 0 || dd4Var.C()) {
                str5 = "";
            } else {
                dd4Var.Y();
                str5 = str3;
            }
            dd4Var.r();
            boolean z3 = (i6 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                int length = str2.length();
                objQ = dk9.x(new wga(str2, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            String str6 = str5;
            z8.d(z, kb4Var, jf0.G(345588737, new li6(kb4Var, kb4Var2, a07Var, str2), dd4Var), null, yib.E(lu6.a, 14), jf0.G(-735790396, new mi6(1, kb4Var, a07Var, str2), dd4Var), jf0.G(-1096250107, new z31(str, 19), dd4Var), null, 0L, 0L, 0.0f, false, false, jf0.G(1481804377, new w71(a07Var, qj5Var, z2, i, i2, str6, str), dd4Var), dd4Var, (i6 & 14) | 1769856 | ((i6 >> 21) & Token.ASSIGN_MOD), 8072);
            str4 = str6;
        } else {
            dd4Var.Y();
            str4 = str3;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fs6(z, str, str2, str4, z2, i, i2, qj5Var, kb4Var, kb4Var2, i3);
        }
    }

    public static final to3 m0(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        Object pm8Var;
        f36 f36Var;
        str7.getClass();
        String strI = iw9.I(bw9.B0(str7).toString(), '_', '-');
        String str8 = null;
        if (strI.length() == 0 || strI.equalsIgnoreCase("und")) {
            strI = null;
        }
        if (strI == null) {
            f36Var = null;
        } else {
            try {
                pm8Var = new f36(tw1.n(strI));
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            if (pm8Var instanceof pm8) {
                pm8Var = null;
            }
            f36Var = (f36) pm8Var;
        }
        str4.getClass();
        String strE0 = iw9.K(str4, "https://", false) ? bw9.E0(bw9.k0(str4, "https://"), '/') : iw9.K(str4, "http://", false) ? bw9.E0(bw9.k0(str4, "http://"), '/') : bw9.E0(str4, '/');
        String strC = f36Var != null ? f36Var.c() : null;
        String str9 = strC == null ? "" : strC;
        if (f36Var != null) {
            String country = ((Locale) f36Var.a.b).getCountry();
            country.getClass();
            if (!country.equals("global")) {
                str8 = country;
            }
        }
        return new to3(str, str2, "", strE0, str4, str3, i, z, i2, str9, str8 == null ? "" : str8, str6, str5, z2, z3, true, j > 0, j2);
    }

    public static final void n(boolean z, String str, q5a q5aVar, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        str.getClass();
        q5aVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-1121275341);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.f(q5aVar) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            rj1 rj1VarG = jf0.G(1482928902, new z31(str, 13), dd4Var);
            q55 q55Var = q5aVar.f;
            z8.a(z, kb4Var, null, null, null, null, rj1VarG, null, 0L, 0L, 0.0f, null, null, null, q55Var == null, q55Var == null, jf0.G(1863284239, new xp5(11, q5aVar, kb4Var2), dd4Var), dd4Var, (i2 & 14) | 1572864 | ((i2 >> 6) & Token.ASSIGN_MOD), 1572864, 16316);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(z, str, q5aVar, kb4Var, kb4Var2, i, 5);
        }
    }

    public static final void o(boolean z, boolean z2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        kb4Var.getClass();
        dd4Var.h0(-1540348436);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9235) != 9234)) {
            if (z2) {
                dd4Var.f0(-1089443086);
                q(z, null, kb4Var, kb4Var2, dd4Var, (i2 & 14) | 384 | ((i2 >> 3) & 7168));
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1089242547);
                p(z, null, kb4Var, kb4Var2, dd4Var, (i2 & 14) | 384 | ((i2 >> 3) & 7168));
                dd4Var.q(false);
            }
            ou6Var2 = lu6.a;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tj0(z, z2, ou6Var2, kb4Var, kb4Var2, i, 2);
        }
    }

    public static final void p(boolean z, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2;
        ou6 ou6Var2;
        dd4Var.h0(-823268766);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6Var3 = lu6.a;
            dd4Var2 = dd4Var;
            sdc.e(ou6Var3, null, jf0.G(-1877116596, new n79(z, kb4Var, kb4Var2, 2), dd4Var), dd4Var2, ((i3 >> 3) & 14) | 3072, 6);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new es6(i, 0, kb4Var, kb4Var2, ou6Var2, z);
        }
    }

    public static final void q(boolean z, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        int i2;
        kb4 kb4Var3;
        ou6 ou6Var2;
        dd4Var.h0(-1783577193);
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 256 : Token.CASE;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            rj1 rj1VarG = jf0.G(1515835336, new gs6(kb4Var2, b2, b2), dd4Var);
            int i4 = (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD) | ((i3 << 3) & 896);
            ou6 ou6Var3 = lu6.a;
            fw.r(z, kb4Var3, ou6Var3, true, 0L, 0L, 0.0f, 0L, 0.0f, rj1VarG, dd4Var, i4, 496);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new es6(i, 1, kb4Var, kb4Var2, ou6Var2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0535 A[PHI: r8
  0x0535: PHI (r8v19 yb4) = (r8v15 yb4), (r8v20 yb4) binds: [B:224:0x0533, B:220:0x052c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x055a A[PHI: r10
  0x055a: PHI (r10v36 kb4) = (r10v32 kb4), (r10v37 kb4) binds: [B:234:0x0558, B:230:0x0551] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0581 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x063f  */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r9v23, types: [fz6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(defpackage.su8 r40, defpackage.y37 r41, ou6 r42, f9 r43, defpackage.kb4 r44, defpackage.kb4 r45, defpackage.yb4 r46, dd4 r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.r(su8, y37, ou6, f9, kb4, kb4, yb4, dd4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(ArrayList arrayList, ou6 ou6Var, f9 f9Var, List list, List list2, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, ib4 ib4Var, dd4 dd4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        List list3 = list;
        dd4Var.h0(-1914095277);
        int i6 = (i & 6) == 0 ? (dd4Var.h(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= dd4Var.f(f9Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i6 |= dd4Var.h(list3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= dd4Var.h(list2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= dd4Var.f((Object) null) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i6 |= dd4Var.h((Object) null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= dd4Var.h(kb4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= dd4Var.h(yb4Var) ? 536870912 : 268435456;
        }
        int i7 = (i2 & 6) == 0 ? i2 | (dd4Var.h(ib4Var) ? 4 : 2) : i2;
        if (dd4Var.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            if (arrayList.isEmpty()) {
                gp.l("NavDisplay entries cannot be empty");
                return;
            }
            int i8 = i6 >> 6;
            int i9 = (i8 & 896) | (i6 & 14) | (i8 & Token.ASSIGN_MOD) | (i8 & 7168) | ((i7 << 12) & 57344);
            dk9.A(ib4Var, dd4Var);
            dd4Var.f0(-984503628);
            dd4Var.q(false);
            fn1 fn1Var = ru8.a;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                i3 = i6;
                jk9 jk9Var = new jk9();
                i4 = i9;
                objQ = new qu8(new hy7(jk9Var, 13), new rj1(new rt6(jk9Var, 5), true, -1714993007));
                dd4Var.p0(objQ);
            } else {
                i3 = i6;
                i4 = i9;
            }
            ArrayList arrayListZ = y86.Z(arrayList, fw.i0(new d37[]{null, (qu8) objQ, new d37(new ss6(8), jf0.G(1077673004, new nb0(dk9.A(arrayList, dd4Var), 0), dd4Var))}), dd4Var, i4 & 14);
            boolean zF = dd4Var.f(fc1.Z0(list3)) | dd4Var.f(arrayListZ);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                ArrayList arrayListA0 = gc1.a0(bx1.N(arrayListZ, list3, list2));
                fc1.E0(arrayListA0);
                List listU0 = fc1.u0(arrayListA0);
                ArrayList arrayList2 = new ArrayList(listU0.size());
                int size = listU0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ui7 ui7Var = (mu8) listU0.get(i10);
                    ui7Var.getClass();
                    arrayList2.add(ui7Var);
                }
                mu8 mu8Var = (mu8) fc1.E0(arrayListA0);
                ArrayList arrayListA02 = gc1.a0(fc1.x0(arrayListA0));
                while (true) {
                    mu8 mu8Var2 = (mu8) fc1.z0(arrayListA02);
                    List listA = mu8Var2 != null ? mu8Var2.a() : null;
                    if (listA == null || listA.isEmpty()) {
                        i5 = 0;
                    } else {
                        mu8 mu8VarN = bx1.N(listA, list3, list2);
                        i5 = 0;
                        arrayListA02.add(0, mu8VarN);
                    }
                    if (listA == null || listA.isEmpty()) {
                        break;
                    } else {
                        list3 = list;
                    }
                }
                arrayListA02.remove(mu8Var);
                objQ2 = new su8(arrayListZ, arrayList2, mu8Var, arrayListA02);
                dd4Var.p0(objQ2);
            } else {
                i5 = 0;
            }
            su8 su8Var = (su8) objQ2;
            mu8 mu8Var3 = su8Var.c;
            nu8 nu8Var = new nu8(mu8Var3);
            ArrayList arrayList3 = su8Var.d;
            ArrayList arrayList4 = new ArrayList(gc1.M(arrayList3, 10));
            int size2 = arrayList3.size();
            while (i5 < size2) {
                arrayList4.add(new nu8((mu8) arrayList3.get(i5)));
                i5++;
            }
            Object objQ3 = dd4Var.Q();
            lc3 lc3Var = lc3.a;
            if (objQ3 == obj) {
                objQ3 = new y37(nu8Var, arrayList4, lc3Var);
                dd4Var.p0(objQ3);
            }
            y37 y37Var = (y37) objQ3;
            boolean zH = dd4Var.h(nu8Var) | dd4Var.h(arrayList4) | dd4Var.h(lc3Var);
            Object objQ4 = dd4Var.Q();
            if (zH || objQ4 == obj) {
                objQ4 = new wp0(y37Var, nu8Var, arrayList4, lc3Var, 13);
                dd4Var.p0(objQ4);
            }
            lc5.H((ib4) objQ4, dd4Var);
            boolean z = !mu8Var3.a().isEmpty();
            boolean zH2 = dd4Var.h(arrayList) | dd4Var.f(mu8Var3) | ((i7 & 14) == 4);
            Object objQ5 = dd4Var.Q();
            if (zH2 || objQ5 == obj) {
                objQ5 = new ma0(21, arrayList, mu8Var3, ib4Var);
                dd4Var.p0(objQ5);
            }
            bx1.l(y37Var, z, (ib4) null, (ib4) objQ5, dd4Var, 0);
            r(su8Var, y37Var, ou6Var, f9Var, kb4Var, kb4Var2, yb4Var, dd4Var, ((i3 << 3) & 8064) | (i8 & 57344) | (458752 & i8) | (3670016 & i8) | (i8 & 29360128));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new un6(arrayList, ou6Var, f9Var, list, list2, kb4Var, kb4Var2, yb4Var, ib4Var, i, i2);
        }
    }

    public static final void t(List list, ou6 ou6Var, f9 f9Var, ib4 ib4Var, List list2, List list3, List list4, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, rx2 rx2Var, dd4 dd4Var, int i) {
        f9 f9Var2;
        ib4 ib4Var2;
        List list5;
        List list6;
        List listY;
        int i2;
        List list7;
        ib4 ib4Var3;
        f9 f9Var3;
        ArrayList arrayList;
        dd4Var.h0(1398581072);
        int i3 = i | (dd4Var.h(list) ? 4 : 2) | 1408 | (dd4Var.h(list2) ? 16384 : 8192) | 114884608 | (dd4Var.h(kb4Var) ? 536870912 : 268435456);
        int i4 = (dd4Var.h(kb4Var2) ? 4 : 2) | (dd4Var.h(yb4Var) ? 32 : 16) | (dd4Var.h(rx2Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & Token.EXPR_VOID) == 146) ? false : true)) {
            dd4Var.a0();
            int i5 = i & 1;
            Object obj = vl1.a;
            int i6 = 6;
            if (i5 == 0 || dd4Var.C()) {
                f9 f9Var4 = bv4.b;
                boolean zH = dd4Var.h(list);
                Object objQ = dd4Var.Q();
                if (zH || objQ == obj) {
                    objQ = new fz0(i6, list);
                    dd4Var.p0(objQ);
                }
                ib4 ib4Var4 = (ib4) objQ;
                listY = gc1.Y(new nf9());
                i2 = i3 & (-465921);
                list7 = lc3.a;
                ib4Var3 = ib4Var4;
                f9Var3 = f9Var4;
            } else {
                dd4Var.Y();
                i2 = i3 & (-465921);
                f9Var3 = f9Var;
                ib4Var3 = ib4Var;
                listY = list3;
                list7 = list4;
            }
            dd4Var.r();
            if (list.isEmpty()) {
                gp.l("NavDisplay backstack cannot be empty");
                return;
            }
            int i7 = (i2 & 14) | ((i2 >> 9) & Token.ASSIGN_MOD) | (i4 & 896);
            boolean zF = dd4Var.f(fc1.Z0(list));
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                if (list instanceof RandomAccess) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i8 = 0;
                    while (i8 < size) {
                        arrayList.add((c37) rx2Var.invoke(list.get(i8)));
                        i8++;
                        i6 = i6;
                    }
                } else {
                    arrayList = new ArrayList(gc1.M(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((c37) rx2Var.invoke(it.next()));
                    }
                }
                objQ2 = arrayList;
                dd4Var.p0(objQ2);
            }
            int i9 = i4 << 24;
            s(y86.Z((List) objQ2, list2, dd4Var, i7 & Token.ASSIGN_MOD), ou6Var, f9Var3, listY, list7, kb4Var, kb4Var2, yb4Var, ib4Var3, dd4Var, ((i2 >> 6) & 29360128) | 1794480 | (234881024 & i9) | (i9 & 1879048192), 0);
            f9Var2 = f9Var3;
            list5 = listY;
            list6 = list7;
            ib4Var2 = ib4Var3;
        } else {
            dd4Var.Y();
            f9Var2 = f9Var;
            ib4Var2 = ib4Var;
            list5 = list3;
            list6 = list4;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ar6(list, ou6Var, f9Var2, ib4Var2, list2, list5, list6, kb4Var, kb4Var2, yb4Var, rx2Var, i);
        }
    }

    public static final uw1 u(float f) {
        return Build.VERSION.SDK_INT >= 29 ? vw1.p(f, f, f, f) : tp8.a(f);
    }

    public static final uw1 v(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 29) {
            return vw1.p(f, f2, f3, f4);
        }
        rp8 rp8Var = tp8.a;
        return new rp8(new y13(f), new y13(f2), new y13(f3), new y13(f4));
    }

    public static uw1 w(int i, float f) {
        float f2 = (i & 1) != 0 ? 0.0f : 8.0f;
        float f3 = (i & 2) != 0 ? 0.0f : 4.0f;
        float f4 = (i & 4) != 0 ? 0.0f : 8.0f;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        return v(f2, f3, f4, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d29 x(sn5 r8, boolean r9) {
        /*
            z70 r0 = r8.S
            java.lang.Object r0 = r0.g
            nu6 r0 = (nu6) r0
            int r1 = r0.d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L66
        Ld:
            if (r0 == 0) goto L66
            int r1 = r0.c
            r1 = r1 & 8
            if (r1 == 0) goto L5d
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5d
            boolean r4 = r1 instanceof b29
            if (r4 == 0) goto L1f
            r2 = r1
            goto L66
        L1f:
            int r4 = r1.c
            r4 = r4 & 8
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof qm2
            if (r4 == 0) goto L58
            r4 = r1
            qm2 r4 = (qm2) r4
            nu6 r4 = r4.B
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.c
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            g07 r3 = new g07
            r6 = 16
            nu6[] r6 = new nu6[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.b(r1)
            r1 = r2
        L4f:
            r3.b(r4)
        L52:
            nu6 r4 = r4.f
            goto L2f
        L55:
            if (r5 != r6) goto L58
            goto L17
        L58:
            nu6 r1 = defpackage.vw1.t(r3)
            goto L17
        L5d:
            int r1 = r0.d
            r1 = r1 & 8
            if (r1 == 0) goto L66
            nu6 r0 = r0.f
            goto Ld
        L66:
            r2.getClass()
            b29 r2 = (b29) r2
            nu6 r2 = (nu6) r2
            nu6 r0 = r2.a
            w19 r1 = r8.y()
            if (r1 != 0) goto L7a
            w19 r1 = new w19
            r1.<init>()
        L7a:
            d29 r2 = new d29
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww1.x(sn5, boolean):d29");
    }

    public static final void y(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        dd4Var.h0(-1195877089);
        if ((i & 6) == 0) {
            i2 = i | (dd4Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.j;
            long j = ((q96) dd4Var.j(ur9Var)).a.q;
            int i4 = i3 & Token.ELSE;
            ou6Var2 = lu6.a;
            nha.c(str, ou6Var2, j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, i4, 24960, 110584);
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l8(str, ou6Var2, i, 2);
        }
    }

    public static final void z(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1898322198);
        int i2 = i | (dd4Var.f(t27Var) ? 4 : 2) | (dd4Var.f(pj7Var) ? 256 : Token.CASE) | (dd4Var.f(szbVar) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            nb9 nb9Var = (nb9) ((qtb) qx1.N(ug8.a(nb9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            eub eubVarA = (eub) dd4Var.j(utb.b);
            if (eubVarA == null) {
                dd4Var.f0(1368428688);
                eubVarA = e36.a(dd4Var);
            } else {
                dd4Var.f0(1368426673);
            }
            dd4Var.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            a07 a07VarB = bx1.B(((mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null))).f, dd4Var);
            a07 a07VarB2 = bx1.B(nb9Var.e, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new aa9(1);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new aa9(2);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) b0(objArr2, (ib4) objQ2, dd4Var, 48);
            gd9 gd9Var = (gd9) a07VarB2.getValue();
            boolean z = ((iib) a07VarB.getValue()).i;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new cl0(t27Var, 12);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new rl0(a07Var2, a07Var, 21);
                dd4Var.p0(objQ4);
            }
            sdc.V(gd9Var, z, pj7Var, szbVar, ou6Var, kb4Var, (kb4) objQ4, ib4Var, dd4Var, (i2 & 8064) | 24576 | ((i2 << 9) & 29360128));
            String str = (String) a07Var2.getValue();
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            int i4 = 14;
            if (zF2 || objQ5 == obj) {
                objQ5 = new hp8(a07Var, i4);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var2 = (kb4) objQ5;
            boolean zF3 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new v03(t27Var, a07Var, 2);
                dd4Var.p0(objQ6);
            }
            yb4 yb4Var = (yb4) objQ6;
            boolean zF4 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new wt2(t27Var, a07Var, i4);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var3 = (kb4) objQ7;
            boolean zF5 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == obj) {
                objQ8 = new wt2(t27Var, a07Var, 15);
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var4 = (kb4) objQ8;
            boolean zF6 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ9 = dd4Var.Q();
            if (zF6 || objQ9 == obj) {
                objQ9 = new wt2(t27Var, a07Var, 16);
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var5 = (kb4) objQ9;
            boolean zF7 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == obj) {
                objQ10 = new wt2(t27Var, a07Var, 13);
                dd4Var.p0(objQ10);
            }
            qu1.g(zBooleanValue, str, kb4Var2, yb4Var, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ10, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, ou6Var, pj7Var, szbVar, ib4Var, i, 3);
        }
    }

    public abstract InputFilter[] P(InputFilter[] inputFilterArr);

    public abstract View V(int i);

    public abstract boolean W();

    public abstract void g0(boolean z);

    public abstract void h0(boolean z);
}
