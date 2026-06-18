package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rt6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rt6(t07 t07Var, s07 s07Var) {
        this.a = 2;
        this.b = t07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        String strK;
        int i = this.a;
        lu6 lu6Var = lu6.a;
        int i2 = 18;
        fu6 fu6Var = vl1.a;
        int i3 = 1;
        heb hebVar = heb.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ihb ihbVar = (ihb) obj4;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var.V(1 & iIntValue, (iIntValue & 17) != 16)) {
                    if (ihbVar.f) {
                        dd4Var.f0(273141397);
                        strK = wn9.K((pv9) vt9.B.getValue(), dd4Var);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(273240690);
                        strK = wn9.K((pv9) vt9.C.getValue(), dd4Var);
                        dd4Var.q(false);
                    }
                    nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262142);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                iw6 iw6Var = (iw6) obj4;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? dd4Var2.f(obj) : dd4Var2.h(obj) ? 4 : 2;
                }
                if (dd4Var2.V(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    dd4Var2.H(iw6Var, dd4Var2.l(), obj, false);
                } else {
                    dd4Var2.Y();
                }
                return hebVar;
            case 2:
                t07 t07Var = (t07) obj4;
                t07.v.set(t07Var, null);
                t07Var.q(null);
                return hebVar;
            case 3:
                t78 t78Var = (t78) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                za1 za1VarA = vtb.a(t78Var);
                aj2 aj2Var = rw2.a;
                t78Var.g(za1VarA, nh2.c, new ug(t78Var, str2, str3, str, null, 22));
                return hebVar;
            case 4:
                ns8 ns8Var = (ns8) obj4;
                c37 c37Var = (c37) obj;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= dd4Var3.f(c37Var) ? 4 : 2;
                }
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ns8Var.b(c37Var.b, jf0.G(121262920, new ob0(c37Var, 1), dd4Var3), dd4Var3, 48);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 5:
                jk9 jk9Var = (jk9) obj4;
                c37 c37Var2 = (c37) obj;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= dd4Var4.f(c37Var2) ? 4 : 2;
                }
                if (dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    Object obj5 = c37Var2.b;
                    if (((Set) dd4Var4.j(ru8.a)).contains(obj5)) {
                        dd4Var4.f0(1576267665);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(1574916499);
                        dd4Var4.c0(1159182959, obj5);
                        Object objQ = dd4Var4.Q();
                        Object obj6 = objQ;
                        if (objQ == fu6Var) {
                            Object obj7 = jk9Var.get(obj5);
                            Object obj8 = obj7;
                            if (obj7 == null) {
                                rj1 rj1Var = new rj1(new rt6(new iw6(), i3), true, 1032736913);
                                jk9Var.put(obj5, rj1Var);
                                obj8 = rj1Var;
                            }
                            zb4 zb4Var = (zb4) obj8;
                            dd4Var4.p0(zb4Var);
                            obj6 = zb4Var;
                        }
                        ((zb4) obj6).c(jf0.G(-804085656, new ob0(c37Var2, 2), dd4Var4), dd4Var4, 54);
                        dd4Var4.q(false);
                        dd4Var4.q(false);
                    }
                } else {
                    dd4Var4.Y();
                }
                return hebVar;
            case 6:
                o19 o19Var = (o19) obj4;
                ou6 ou6Var = (ou6) obj;
                dd4 dd4Var5 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var5.f0(-1914520728);
                pn2 pn2Var = (pn2) dd4Var5.j(xm1.h);
                Object objQ2 = dd4Var5.Q();
                Object obj9 = objQ2;
                if (objQ2 == fu6Var) {
                    cn7 cn7VarX = dk9.x(new na5(0L));
                    dd4Var5.p0(cn7VarX);
                    obj9 = cn7VarX;
                }
                a07 a07Var = (a07) obj9;
                boolean zH = dd4Var5.h(o19Var);
                Object objQ3 = dd4Var5.Q();
                Object obj10 = objQ3;
                if (zH || objQ3 == fu6Var) {
                    e67 e67Var = new e67(10, o19Var, a07Var);
                    dd4Var5.p0(e67Var);
                    obj10 = e67Var;
                }
                ib4 ib4Var = (ib4) obj10;
                boolean zF = dd4Var5.f(pn2Var);
                Object objQ4 = dd4Var5.Q();
                Object obj11 = objQ4;
                if (zF || objQ4 == fu6Var) {
                    bu1 bu1Var = new bu1(pn2Var, a07Var, 2);
                    dd4Var5.p0(bu1Var);
                    obj11 = bu1Var;
                }
                so soVar = m19.a;
                ou6 ou6VarX = s32.X(ou6Var, new n41(ib4Var, (kb4) obj11));
                dd4Var5.q(false);
                return ou6VarX;
            case 7:
                ((r29) obj4).c();
                return hebVar;
            case 8:
                ob9 ob9Var = (ob9) obj4;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    nha.c(String.valueOf(ob9Var.g), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var6, 0, 0, 262142);
                } else {
                    dd4Var6.Y();
                }
                return hebVar;
            case 9:
                jd9 jd9VarO = (jd9) obj4;
                dd4 dd4Var7 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((ou6) obj).getClass();
                dd4Var7.f0(-1321642976);
                if (jd9VarO == null) {
                    dd4Var7.f0(1211421155);
                    jd9VarO = yn2.O(md9.a, dd4Var7);
                } else {
                    dd4Var7.f0(1211420628);
                }
                dd4Var7.q(false);
                float fK0 = ((pn2) dd4Var7.j(xm1.h)).k0(400.0f);
                boolean zC = dd4Var7.c(fK0) | dd4Var7.c(15.0f);
                Object objQ5 = dd4Var7.Q();
                Object obj12 = objQ5;
                if (zC || objQ5 == fu6Var) {
                    kd9 kd9Var = new kd9(fK0);
                    dd4Var7.p0(kd9Var);
                    obj12 = kd9Var;
                }
                kd9 kd9Var2 = (kd9) obj12;
                boolean zH2 = dd4Var7.h(jd9VarO) | dd4Var7.h(kd9Var2);
                Object objQ6 = dd4Var7.Q();
                Object obj13 = objQ6;
                if (zH2 || objQ6 == fu6Var) {
                    b69 b69Var = new b69(jd9VarO, kd9Var2, null, 6);
                    dd4Var7.p0(b69Var);
                    obj13 = b69Var;
                }
                lc5.v(kd9Var2, jd9VarO, (yb4) obj13, dd4Var7);
                boolean zF2 = dd4Var7.f(kd9Var2) | dd4Var7.f(jd9VarO);
                Object objQ7 = dd4Var7.Q();
                Object obj14 = objQ7;
                if (zF2 || objQ7 == fu6Var) {
                    qd9 qd9Var = new qd9(kd9Var2, jd9VarO.b);
                    dd4Var7.p0(qd9Var);
                    obj14 = qd9Var;
                }
                qd9 qd9Var2 = (qd9) obj14;
                dd4Var7.q(false);
                return qd9Var2;
            case 10:
                ii9 ii9Var = (ii9) obj4;
                ja6 ja6Var = (ja6) obj;
                jt7 jt7VarC = ((ca6) obj2).C(((up1) obj3).a);
                int iW0 = x13.c(Float.NaN, Float.NaN) ? ii9Var.m == lh7.a ? jt7VarC.a / 2 : jt7VarC.b / 2 : ja6Var.w0(Float.NaN);
                int i4 = jt7VarC.a;
                int i5 = jt7VarC.b;
                Map mapSingletonMap = Collections.singletonMap(hi9.e, Integer.valueOf(iW0));
                mapSingletonMap.getClass();
                return ja6Var.R(i4, i5, mapSingletonMap, new l0(jt7VarC, 12));
            case 11:
                eq9 eq9Var = (eq9) obj4;
                dd4 dd4Var8 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                if (eq9Var != null) {
                    dd4Var8.f0(-134139239);
                    yib.h(384, eq9Var.b.a, dd4Var8, gjb.m0(lu6Var, 24.0f, 24.0f), eq9Var.a);
                    dd4Var8.q(false);
                } else {
                    dd4Var8.f0(-133902833);
                    dd4Var8.q(false);
                }
                return hebVar;
            case 12:
                h8a h8aVar = (h8a) obj4;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str4.getClass();
                str5.getClass();
                za1 za1VarA2 = vtb.a(h8aVar);
                aj2 aj2Var2 = rw2.a;
                h8aVar.g(za1VarA2, nh2.c, new vl2(h8aVar, str4, str5, zBooleanValue, (jt1) null));
                return hebVar;
            case 13:
                kga kgaVar = (kga) obj4;
                ou6 ou6Var2 = (ou6) obj;
                dd4 dd4Var9 = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var9.f0(1980580247);
                pn2 pn2Var2 = (pn2) dd4Var9.j(xm1.h);
                Object objQ8 = dd4Var9.Q();
                Object obj15 = objQ8;
                if (objQ8 == fu6Var) {
                    cn7 cn7VarX2 = dk9.x(new na5(0L));
                    dd4Var9.p0(cn7VarX2);
                    obj15 = cn7VarX2;
                }
                a07 a07Var2 = (a07) obj15;
                boolean zH3 = dd4Var9.h(kgaVar);
                Object objQ9 = dd4Var9.Q();
                Object obj16 = objQ9;
                if (zH3 || objQ9 == fu6Var) {
                    nga ngaVar = new nga(false ? 1 : 0, kgaVar, a07Var2);
                    dd4Var9.p0(ngaVar);
                    obj16 = ngaVar;
                }
                ib4 ib4Var2 = (ib4) obj16;
                boolean zF3 = dd4Var9.f(pn2Var2);
                Object objQ10 = dd4Var9.Q();
                Object obj17 = objQ10;
                if (zF3 || objQ10 == fu6Var) {
                    bu1 bu1Var2 = new bu1(pn2Var2, a07Var2, 4);
                    dd4Var9.p0(bu1Var2);
                    obj17 = bu1Var2;
                }
                so soVar2 = m19.a;
                ou6 ou6VarX2 = s32.X(ou6Var2, new n41(ib4Var2, (kb4) obj17));
                dd4Var9.q(false);
                return ou6VarX2;
            case 14:
                ou6 ou6Var3 = (ou6) obj;
                dd4 dd4Var10 = (dd4) obj2;
                ((Integer) obj3).intValue();
                ou6Var3.getClass();
                dd4Var10.f0(261024070);
                ou6 ou6VarO = vo1.O(ou6Var3, (ko0) obj4);
                dd4Var10.q(false);
                return ou6VarO;
            case 15:
                je4 je4Var = (je4) obj4;
                dd4 dd4Var11 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(lu6Var, ((q96) dd4Var11.j(s96.a)).c.c), lc1.c(0.7f, lc1.b), jf0.G), 20.0f, 14.0f);
                ie1 ie1VarA = ge1.a(new mv(10.0f, true, new gp(5)), bv4.A, dd4Var11, 54);
                int iHashCode = Long.hashCode(dd4Var11.T);
                lr7 lr7VarL = dd4Var11.l();
                ou6 ou6VarL0 = s32.L0(dd4Var11, ou6VarM0);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var11.j0();
                if (dd4Var11.S) {
                    dd4Var11.k(um1Var);
                } else {
                    dd4Var11.s0();
                }
                un9.s(ll1.f, dd4Var11, ie1VarA);
                un9.s(ll1.e, dd4Var11, lr7VarL);
                un9.s(ll1.g, dd4Var11, Integer.valueOf(iHashCode));
                un9.r(dd4Var11, ll1.h);
                un9.s(ll1.d, dd4Var11, ou6VarL0);
                ne4 ne4Var = (ne4) je4Var.a.getValue();
                ym7 ym7Var = je4Var.b;
                int iOrdinal = ne4Var.ordinal();
                m53 m53Var = (iOrdinal == 1 || iOrdinal != 2) ? (m53) a53.o.getValue() : ym7Var.h() > 0.0f ? (m53) h53.u.getValue() : (m53) h53.t.getValue();
                p35 p35VarC = i25.c(m53Var, dd4Var11, 0);
                long j = lc1.e;
                mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 28.0f), j, dd4Var11, 3504, 0);
                boolean zF4 = dd4Var11.f(je4Var);
                Object objQ11 = dd4Var11.Q();
                Object obj18 = objQ11;
                if (zF4 || objQ11 == fu6Var) {
                    o39 o39Var = new o39(je4Var, 28);
                    dd4Var11.p0(o39Var);
                    obj18 = o39Var;
                }
                ib4 ib4Var3 = (ib4) obj18;
                ou6 ou6VarH = tg9.h(tg9.r(lu6Var, 100.0f), 4.0f);
                long jC = lc1.c(0.3f, j);
                Object objQ12 = dd4Var11.Q();
                Object obj19 = objQ12;
                if (objQ12 == fu6Var) {
                    elb elbVar = new elb(15);
                    dd4Var11.p0(elbVar);
                    obj19 = elbVar;
                }
                h48.c(ib4Var3, ou6VarH, j, jC, 1, 0.0f, (kb4) obj19, dd4Var11, 1576368, 32);
                nha.c(((int) (ym7Var.h() * 100.0f)) + "%", (ou6) null, j, (g60) null, wn9.x(12), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var11, 24960, 0, 262122);
                dd4Var11.q(true);
                return hebVar;
            case 16:
                rh9 rh9Var = (rh9) obj4;
                ii9 ii9Var2 = (ii9) obj;
                dd4 dd4Var12 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ii9Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? dd4Var12.f(ii9Var2) : dd4Var12.h(ii9Var2) ? 4 : 2;
                }
                if (dd4Var12.V(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    vh9 vh9Var = vh9.a;
                    ou6 ou6VarH2 = tg9.h(lu6Var, 4.0f);
                    Object objQ13 = dd4Var12.Q();
                    Object obj20 = objQ13;
                    if (objQ13 == fu6Var) {
                        rhb rhbVar = new rhb(i3);
                        dd4Var12.p0(rhbVar);
                        obj20 = rhbVar;
                    }
                    vh9Var.a(ii9Var2, ou6VarH2, false, rh9Var, (yb4) obj20, (zb4) null, 2.0f, 0.0f, dd4Var12, 102260792 | (iIntValue6 & 14), Token.TO_DOUBLE);
                } else {
                    dd4Var12.Y();
                }
                return hebVar;
            case 17:
                lub lubVar = (lub) obj4;
                c37 c37Var3 = (c37) obj;
                dd4 dd4Var13 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= dd4Var13.f(c37Var3) ? 4 : 2;
                }
                if (dd4Var13.V(1 & iIntValue7, (iIntValue7 & 19) != 18)) {
                    Object obj21 = c37Var3.b;
                    mt8 mt8Var = (mt8) dd4Var13.j(x26.a);
                    boolean zF5 = dd4Var13.f(lubVar) | dd4Var13.f(obj21) | dd4Var13.f(mt8Var);
                    Object objQ14 = dd4Var13.Q();
                    if (zF5 || objQ14 == fu6Var) {
                        Bundle bundle = lubVar.c;
                        w02 w02Var = lubVar.d;
                        xtb xtbVar = lubVar.e;
                        bundle.getClass();
                        w02Var.getClass();
                        xtbVar.getClass();
                        tz6 tz6Var = ((kub) lubVar.f.getValue()).b;
                        Object objG = tz6Var.g(obj21);
                        Object obj22 = objG;
                        if (objG == null) {
                            jub jubVar = new jub(obj21);
                            tz6Var.n(obj21, jubVar);
                            obj22 = jubVar;
                        }
                        cub cubVar = ((jub) obj22).b;
                        if (mt8Var == null) {
                            cubVar.getClass();
                            objQ14 = new fub(cubVar, xtbVar, w02Var, bundle);
                        } else {
                            cubVar.getClass();
                            ab6 ab6VarH = mt8Var.h();
                            px5 px5VarI = mt8Var.i();
                            ab6VarH.getClass();
                            px5VarI.getClass();
                            objQ14 = new gub(ab6VarH, cubVar, px5VarI, xtbVar, w02Var, bundle);
                        }
                        dd4Var13.p0(objQ14);
                    }
                    eub eubVar = (eub) objQ14;
                    boolean zH4 = dd4Var13.h(lubVar) | dd4Var13.h(obj21);
                    Object objQ15 = dd4Var13.Q();
                    Object obj23 = objQ15;
                    if (zH4 || objQ15 == fu6Var) {
                        q57 q57Var = new q57(i2, lubVar, obj21);
                        dd4Var13.p0(q57Var);
                        obj23 = q57Var;
                    }
                    lc5.j(eubVar, (kb4) obj23, dd4Var13);
                    jv3.e(e36.a.a(eubVar), jf0.G(1108866301, new ob0(c37Var3, 3), dd4Var13), dd4Var13, 56);
                } else {
                    dd4Var13.Y();
                }
                return hebVar;
            default:
                n7c n7cVar = (n7c) obj4;
                ja6 ja6Var2 = (ja6) obj;
                ca6 ca6Var = (ca6) obj2;
                up1 up1Var = (up1) obj3;
                ja6Var2.getClass();
                ca6Var.getClass();
                int i6 = up1.i(up1Var.a);
                int iH = up1.h(up1Var.a);
                jt7 jt7VarC2 = ca6Var.C(vp1.b(0, t96.M(n7cVar.f() * i6), 0, t96.M(n7cVar.f() * iH), 5));
                long j2 = (((long) i6) << 32) | (((long) iH) & 4294967295L);
                if (!na5.b(n7cVar.j(), j2)) {
                    n7cVar.k.setValue(new na5(j2));
                    n7cVar.o();
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(jt7VarC2.b / n7cVar.f())) & 4294967295L) | (((long) Float.floatToRawIntBits(jt7VarC2.a / n7cVar.f())) << 32);
                if (!fg9.a(n7cVar.i(), jFloatToRawIntBits)) {
                    n7cVar.l.setValue(new fg9(jFloatToRawIntBits));
                    n7cVar.o();
                }
                return ja6Var2.R(i6, iH, mc3.a, new sbb(13, jt7VarC2, n7cVar));
        }
    }

    public /* synthetic */ rt6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
