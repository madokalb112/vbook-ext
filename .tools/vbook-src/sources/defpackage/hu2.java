package defpackage;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class hu2 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hu2(yba ybaVar, List list, kb4 kb4Var, ib4 ib4Var) {
        this.a = 12;
        this.b = ybaVar;
        this.d = list;
        this.e = kb4Var;
        this.c = ib4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    private final Object a(Object obj, Object obj2, Object obj3) {
        ke1 ke1Var;
        vf0 vf0Var;
        ib4 ib4Var;
        ?? r5;
        xo3 xo3Var = (xo3) this.b;
        ib4 ib4Var2 = (ib4) this.c;
        yb4 yb4Var = (yb4) this.d;
        kb4 kb4Var = (kb4) this.e;
        ke1 ke1Var2 = (ke1) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        vf0 vf0Var2 = bv4.A;
        ke1Var2.getClass();
        int i = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(ke1Var2) ? 4 : 2;
        }
        boolean z = false;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zIsEmpty = xo3Var.a.isEmpty();
            lu6 lu6Var = lu6.a;
            if (zIsEmpty) {
                dd4Var.f0(1631373775);
                String strK = wn9.K((pv9) eu9.C0.getValue(), dd4Var);
                ur9 ur9Var = s96.a;
                nha.c(strK, ke1Var2.a(lu6Var, vf0Var2), lc1.c(0.8f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131064);
                dd4Var = dd4Var;
                dd4Var.q(false);
                ke1Var = ke1Var2;
                vf0Var = vf0Var2;
                r5 = 0;
                ib4Var = ib4Var2;
            } else {
                dd4Var.f0(1631754238);
                ArrayList arrayList = xo3Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    yo3 yo3Var = (yo3) arrayList.get(i2);
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    int i3 = i2;
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarW = t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var2)).c.c);
                    ib4 ib4Var3 = ib4Var2;
                    long jG = dd1.g(((q96) dd4Var.j(ur9Var2)).a, 6.0f);
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarL = fe.L(ou6VarW, jG, lp4Var);
                    boolean zF = dd4Var.f(yb4Var) | dd4Var.h(yo3Var);
                    Object objQ = dd4Var.Q();
                    Object obj4 = vl1.a;
                    if (zF || objQ == obj4) {
                        objQ = new al3(i, yb4Var, yo3Var);
                        dd4Var.p0(objQ);
                    }
                    ArrayList arrayList2 = arrayList;
                    ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 14.0f, 12.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    yb4 yb4Var2 = yb4Var;
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar4 = ll1.d;
                    ke1 ke1Var3 = ke1Var2;
                    int i4 = size;
                    bp5 bp5VarG = ky0.g(dd4Var, ou6VarL0, jmVar4, 1.0f, true);
                    vf0 vf0Var3 = vf0Var2;
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, bp5VarG);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ie1VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    dd4 dd4Var2 = dd4Var;
                    nha.c(yo3Var.a, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var2)).b.j, dd4Var2, 0, 24960, 110590);
                    nha.c(yo3Var.b, (ou6) null, lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var2)).b.l, dd4Var2, 0, 24960, 110586);
                    ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 32.0f), tp8.a);
                    long j = lc1.f;
                    ou6 ou6VarL2 = fe.L(ou6VarW2, lc1.c(0.12f, j), lp4Var);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.h(yo3Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new al3(5, kb4Var, yo3Var);
                        dd4Var2.p0(objQ2);
                    }
                    ou6 ou6VarL03 = gjb.l0(fw.J(null, (ib4) objQ2, ou6VarL2, false, 15), 6.0f);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarL03);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ha6VarD);
                    un9.s(jmVar2, dd4Var2, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL04);
                    mx4.a(i25.c((m53) a53.H.getValue(), dd4Var2, 0), (String) null, zn0.a.a(tg9.n(lu6Var, 20.0f), bv4.f), j, dd4Var2, 3120, 0);
                    dd4Var = dd4Var2;
                    un9.a(dd4Var, xv5.g(dd4Var, true, true, lu6Var, 8.0f));
                    i2 = i3 + 1;
                    ib4Var2 = ib4Var3;
                    arrayList = arrayList2;
                    yb4Var = yb4Var2;
                    size = i4;
                    vf0Var2 = vf0Var3;
                    i = 4;
                    z = false;
                    ke1Var2 = ke1Var3;
                }
                ke1Var = ke1Var2;
                vf0Var = vf0Var2;
                boolean z2 = z;
                ib4Var = ib4Var2;
                dd4Var.q(z2);
                r5 = z2;
            }
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var, r5), wn9.K((pv9) vt9.f.getValue(), dd4Var), false, null, ke1Var.a(lu6Var, vf0Var), null, null, null, ib4Var, dd4Var, 0, 236);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        yba ybaVar = (yba) this.b;
        List list = (List) this.d;
        kb4 kb4Var = (kb4) this.e;
        ib4 ib4Var = (ib4) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            gjb.J(ybaVar.a, list, gjb.m0(tg9.f(lu6.a, 1.0f), 12.0f, 8.0f), kb4Var, ib4Var, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        co0 co0Var = (co0) this.b;
        String str = (String) this.c;
        List list = (List) this.d;
        yb4 yb4Var = (yb4) this.e;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            sdc.a0(str, list, yib.e(dd4Var, 14), tg9.j(tg9.f(lu6.a, 1.0f), 0.0f, co0Var.c() * 0.8f, 1), yb4Var, dd4Var, 0, 0);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        zb4 zb4Var = (zb4) this.b;
        ac4 ac4Var = (ac4) this.c;
        a07 a07Var = (a07) this.d;
        a07 a07Var2 = (a07) this.e;
        String str = (String) obj;
        String str2 = (String) obj2;
        bi5 bi5Var = (bi5) obj3;
        str.getClass();
        str2.getClass();
        a07Var.setValue(Boolean.FALSE);
        if (((zd1) a07Var2.getValue()).a.length() == 0) {
            zb4Var.c(str, str2, bi5Var);
        } else {
            ac4Var.g(((zd1) a07Var2.getValue()).a, str, str2, bi5Var);
        }
        return heb.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ib4 ib4Var = (ib4) this.b;
        ib4 ib4Var2 = (ib4) this.c;
        ib4 ib4Var3 = (ib4) this.d;
        a07 a07Var = (a07) this.e;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        int i = 0;
        int i2 = 1;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strK = wn9.K((pv9) zu9.k0.getValue(), dd4Var);
            rj1 rj1Var = sdc.m;
            boolean zF = dd4Var.f(ib4Var);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = new w03(ib4Var, a07Var, 4);
                dd4Var.p0(objQ);
            }
            gx1.c(strK, null, rj1Var, null, null, (ib4) objQ, dd4Var, 384, 26);
            String strK2 = wn9.K((pv9) zu9.j0.getValue(), dd4Var);
            rj1 rj1Var2 = sdc.n;
            boolean zF2 = dd4Var.f(ib4Var2);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj4) {
                objQ2 = new w03(ib4Var2, a07Var, 5);
                dd4Var.p0(objQ2);
            }
            gx1.c(strK2, null, rj1Var2, null, null, (ib4) objQ2, dd4Var, 384, 26);
            long j = ((q96) dd4Var.j(s96.a)).a.w;
            rj1 rj1VarG = jf0.G(-1280377338, new i98(j, i), dd4Var);
            rj1 rj1VarG2 = jf0.G(-384146168, new i98(j, i2), dd4Var);
            boolean zF3 = dd4Var.f(ib4Var3);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj4) {
                objQ3 = new w03(ib4Var3, a07Var, 3);
                dd4Var.p0(objQ3);
            }
            gx1.b(rj1VarG, rj1VarG2, null, (ib4) objQ3, dd4Var, 390, 26);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        a07 a07Var = (a07) this.b;
        a07 a07Var2 = (a07) this.c;
        a07 a07Var3 = (a07) this.d;
        br9 br9Var = (br9) this.e;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fq8) obj).getClass();
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var, 0);
            boolean zF = dd4Var.f(a07Var);
            Object objQ = dd4Var.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                objQ = new bq6(a07Var, 29);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var, 0, 6);
            if (((gd9) br9Var.getValue()).b.isEmpty()) {
                dd4Var.f0(1865158468);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1864970112);
                p35 p35VarC2 = i25.c((m53) a53.a0.getValue(), dd4Var, 0);
                boolean zF2 = dd4Var.f(a07Var2);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj4) {
                    objQ2 = new vb9(a07Var2, 0);
                    dd4Var.p0(objQ2);
                }
                sw1.r(p35VarC2, (ou6) null, 0L, (ib4) objQ2, dd4Var, 0, 6);
                dd4Var.q(false);
            }
            p35 p35VarC3 = i25.c((m53) a53.H.getValue(), dd4Var, 0);
            long j = ((q96) dd4Var.j(s96.a)).a.w;
            boolean zF3 = dd4Var.f(a07Var3);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj4) {
                objQ3 = new vb9(a07Var3, 1);
                dd4Var.p0(objQ3);
            }
            sw1.r(p35VarC3, (ou6) null, j, (ib4) objQ3, dd4Var, 0, 2);
            un9.a(dd4Var, tg9.r(lu6.a, 8.0f));
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        hra hraVar = (hra) this.b;
        br9 br9Var = (br9) this.c;
        a07 a07Var = (a07) this.d;
        a07 a07Var2 = (a07) this.e;
        eb7 eb7Var = (eb7) obj;
        o9a o9aVar = (o9a) obj2;
        yia yiaVar = (yia) obj3;
        o9aVar.getClass();
        yiaVar.getClass();
        boolean zBooleanValue = ((Boolean) br9Var.getValue()).booleanValue();
        heb hebVar = heb.a;
        if (zBooleanValue) {
            rj9.c(a07Var, false);
            return hebVar;
        }
        if (((Boolean) a07Var2.getValue()).booleanValue()) {
            return hebVar;
        }
        long j = eb7Var.a;
        hraVar.getClass();
        za1 za1VarA = vtb.a(hraVar);
        aj2 aj2Var = rw2.a;
        hraVar.g(za1VarA, nh2.c, new uqa(hraVar, yiaVar, j, o9aVar, null));
        return hebVar;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ou6 ou6VarC;
        xk9 xk9Var = (xk9) this.b;
        qv5 qv5Var = (qv5) this.c;
        wga wgaVar = (wga) this.d;
        ob7 ob7Var = (ob7) this.e;
        ou6 ou6Var = (ou6) obj;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        dd4Var.f0(-84507373);
        boolean zBooleanValue = ((Boolean) dd4Var.j(xm1.x)).booleanValue();
        boolean zG = dd4Var.g(zBooleanValue);
        Object objQ = dd4Var.Q();
        Object obj4 = vl1.a;
        if (zG || objQ == obj4) {
            objQ = new j22(zBooleanValue);
            dd4Var.p0(objQ);
        }
        j22 j22Var = (j22) objQ;
        boolean z = xk9Var.a != 16;
        if (((Boolean) ((fyb) dd4Var.j(xm1.u)).c.getValue()).booleanValue() && qv5Var.b() && pja.d(wgaVar.b) && z) {
            dd4Var.f0(-707487962);
            bp bpVar = wgaVar.a;
            pja pjaVar = new pja(wgaVar.b);
            boolean zH = dd4Var.h(j22Var);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj4) {
                objQ2 = new dd9(j22Var, (jt1) null, 8);
                dd4Var.p0(objQ2);
            }
            lc5.v(bpVar, pjaVar, (yb4) objQ2, dd4Var);
            boolean zH2 = dd4Var.h(j22Var) | dd4Var.h(ob7Var) | dd4Var.f(wgaVar) | dd4Var.h(qv5Var) | dd4Var.f(xk9Var);
            Object objQ3 = dd4Var.Q();
            if (zH2 || objQ3 == obj4) {
                x5 x5Var = new x5(j22Var, ob7Var, wgaVar, qv5Var, xk9Var, 12);
                dd4Var.p0(x5Var);
                objQ3 = x5Var;
            }
            ou6VarC = md2.C(ou6Var, (kb4) objQ3);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-705473241);
            dd4Var.q(false);
            ou6VarC = lu6.a;
        }
        dd4Var.q(false);
        return ou6VarC;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        c1b c1bVar = (c1b) this.b;
        xq2 xq2Var = (xq2) this.c;
        t27 t27Var = (t27) this.d;
        f28 f28Var = (f28) this.e;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dr5) obj).getClass();
        byte b = 0;
        if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zF = dd4Var.f(c1bVar);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                vra vraVar = new vra(1, c1bVar, c1b.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 2);
                dd4Var.p0(vraVar);
                objQ = vraVar;
            }
            ei5 ei5Var = (ei5) objQ;
            boolean zF2 = dd4Var.f(c1bVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == fu6Var) {
                objQ2 = new n0b(0, c1bVar, c1b.class, "toggleLikeTopic", "toggleLikeTopic()V", 0, 6);
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var = (ib4) ((ei5) objQ2);
            boolean zF3 = dd4Var.f(t27Var);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == fu6Var) {
                objQ3 = new cl0(t27Var, 21);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            kb4 kb4Var2 = (kb4) ei5Var;
            boolean zF4 = dd4Var.f(f28Var);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == fu6Var) {
                objQ4 = new uv2(f28Var, 2, b);
                dd4Var.p0(objQ4);
            }
            gjb.M(xq2Var, ib4Var, null, kb4Var, kb4Var2, (yb4) objQ4, dd4Var, 8);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        List list = (List) this.d;
        k4b k4bVar = (k4b) this.b;
        kb4 kb4Var = (kb4) this.e;
        a07 a07Var = (a07) this.c;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ke1) obj).getClass();
        boolean z = true;
        boolean zV = dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16);
        heb hebVar = heb.a;
        if (!zV) {
            dd4Var.Y();
            return hebVar;
        }
        Object objQ = dd4Var.Q();
        Object obj4 = vl1.a;
        if (objQ == obj4) {
            objQ = new ko0();
            dd4Var.p0(objQ);
        }
        ko0 ko0Var = (ko0) objQ;
        dd4Var.f0(1445259210);
        int size = list.size();
        int i = 0;
        while (i < size) {
            xl7 xl7Var = (xl7) list.get(i);
            boolean z2 = k4bVar.h == ((Number) xl7Var.a).intValue() ? z : false;
            String strK = wn9.K((pv9) xl7Var.b, dd4Var);
            ou6 ou6VarO = lu6.a;
            if (z2) {
                ou6VarO = vo1.O(ou6VarO, ko0Var);
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zF = dd4Var.f(kb4Var) | dd4Var.f(xl7Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj4) {
                objQ2 = new ma0(28, kb4Var, xl7Var, a07Var);
                dd4Var.p0(objQ2);
            }
            gx1.c(strK, null, null, boolValueOf, ou6VarO, (ib4) objQ2, dd4Var, 0, 6);
            i++;
            obj4 = obj4;
            hebVar = hebVar;
            a07Var = a07Var;
            size = size;
            z = true;
        }
        heb hebVar2 = hebVar;
        Object obj5 = obj4;
        dd4Var.q(false);
        boolean zH = dd4Var.h(ko0Var);
        Object objQ3 = dd4Var.Q();
        if (zH || objQ3 == obj5) {
            objQ3 = new is6(ko0Var, null, 4);
            dd4Var.p0(objQ3);
        }
        lc5.u((yb4) objQ3, dd4Var, hebVar2);
        return hebVar2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long jG;
        ou6 ou6VarE;
        a07 a07Var;
        Object obj4;
        boolean z;
        Object obj5;
        kb4 kb4Var;
        Object obj6;
        boolean z2;
        Object obj7;
        boolean z3;
        int i = this.a;
        int i2 = 2;
        int i3 = 3;
        lu6 lu6Var = lu6.a;
        Object obj8 = vl1.a;
        heb hebVar = heb.a;
        Object obj9 = this.e;
        Object obj10 = this.c;
        Object obj11 = this.d;
        Object obj12 = this.b;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                pj7 pj7Var = (pj7) obj12;
                pj7 pj7Var2 = (pj7) obj10;
                List list = (List) obj11;
                kb4 kb4Var2 = (kb4) obj9;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    iq9 iq9Var = new iq9(100.0f);
                    px3 px3Var = tg9.c;
                    boolean zH = dd4Var.h(list) | dd4Var.f(kb4Var2);
                    Object objQ = dd4Var.Q();
                    Object obj13 = objQ;
                    if (zH || objQ == obj8) {
                        qp0 qp0Var = new qp0(list, kb4Var2, 1);
                        dd4Var.p0(qp0Var);
                        obj13 = qp0Var;
                    }
                    gx1.j(iq9Var, px3Var, null, pj7Var, 0.0f, null, null, false, 0L, 0L, pj7Var2, (kb4) obj13, dd4Var, 48, 0, 2036);
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 1:
                t27 t27Var = (t27) obj12;
                nv2 nv2Var = (nv2) obj10;
                br9 br9Var = (br9) obj11;
                br9 br9Var2 = (br9) obj9;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else if (((kv2) br9Var.getValue()).a) {
                    dd4Var2.f0(-533100504);
                    sdc.j(tg9.c, dd4Var2, 6);
                    dd4Var2.q(false);
                } else if (((kv2) br9Var.getValue()).b == null) {
                    dd4Var2.f0(-532882977);
                    p35 p35VarK0 = lx1.k0(dd4Var2);
                    String strK = wn9.K((pv9) eu9.i.getValue(), dd4Var2);
                    String strK2 = wn9.K((pv9) eu9.j.getValue(), dd4Var2);
                    String strK3 = wn9.K((pv9) vt9.n.getValue(), dd4Var2);
                    ou6 ou6VarN0 = gjb.n0(tg9.c, 12.0f, 0.0f, 2);
                    boolean zF = dd4Var2.f(t27Var);
                    Object objQ2 = dd4Var2.Q();
                    Object obj14 = objQ2;
                    if (zF || objQ2 == obj8) {
                        z6 z6Var = new z6(t27Var, 19);
                        dd4Var2.p0(z6Var);
                        obj14 = z6Var;
                    }
                    bx1.d(p35VarK0, strK, strK2, ou6VarN0, strK3, (ib4) obj14, dd4Var2, 3072, 0);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-532295527);
                    jv3.e(e36.a.a(nv2Var), jf0.G(601433046, new ev0(t27Var, nv2Var, br9Var2, br9Var), dd4Var2), dd4Var2, 56);
                    dd4Var2.q(false);
                }
                return hebVar;
            case 2:
                vx1 vx1Var = (vx1) obj12;
                wq5 wq5Var = (wq5) obj10;
                br9 br9Var3 = (br9) obj11;
                a07 a07Var2 = (a07) obj9;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ou6 ou6VarL0 = gjb.l0(tg9.n(lu6Var, 40.0f), 2.0f);
                    g83 g83Var = o96.a;
                    wp8 wp8VarB = o96.g;
                    if (wp8VarB == null) {
                        wp8VarB = g83.m(g83Var, gc1.Z(new n96((((long) Float.floatToRawIntBits(0.926f)) << 32) | (((long) Float.floatToRawIntBits(0.97f)) & 4294967295L), new yw1(0.189f, 0.811f)), new n96((((long) Float.floatToRawIntBits(-0.021f)) << 32) | (((long) Float.floatToRawIntBits(0.967f)) & 4294967295L), new yw1(0.187f, 0.057f))), 2, 12).b();
                        o96.g = wp8VarB;
                    }
                    ou6 ou6VarW = t96.w(ou6VarL0, rw1.k0(wp8VarB, dd4Var3));
                    if (((String) br9Var3.getValue()).length() == 0) {
                        dd4Var3.f0(224697228);
                        jG = dd1.g(((q96) dd4Var3.j(s96.a)).a, 4.0f);
                        dd4Var3.q(false);
                    } else {
                        dd4Var3.f0(224827986);
                        dd4Var3.q(false);
                        jG = lc1.i;
                    }
                    ou6 ou6VarL = fe.L(ou6VarW, jG, jf0.G);
                    boolean zH2 = dd4Var3.h(vx1Var) | dd4Var3.f(wq5Var);
                    Object objQ3 = dd4Var3.Q();
                    Object obj15 = objQ3;
                    if (zH2 || objQ3 == obj8) {
                        na3 na3Var = new na3(vx1Var, wq5Var, a07Var2);
                        dd4Var3.p0(na3Var);
                        obj15 = na3Var;
                    }
                    ou6 ou6VarL02 = gjb.l0(fw.J(null, (ib4) obj15, ou6VarL, false, 15), 6.0f);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarL02);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ha6VarD);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL03);
                    mx4.a(i25.c((m53) f53.i.getValue(), dd4Var3, 0), (String) null, tg9.c, 0L, dd4Var3, 432, 8);
                    dd4Var3.q(true);
                } else {
                    dd4Var3.Y();
                }
                return hebVar;
            case 3:
                ms5 ms5Var = (ms5) obj12;
                ou6 ou6Var = (ou6) obj10;
                cs5 cs5Var = (cs5) obj11;
                a07 a07Var3 = (a07) obj9;
                ns8 ns8Var = (ns8) obj;
                dd4 dd4Var4 = (dd4) obj2;
                ((Integer) obj3).getClass();
                Object objQ4 = dd4Var4.Q();
                Object obj16 = objQ4;
                if (objQ4 == obj8) {
                    as5 as5Var = new as5(ns8Var, new lz4(a07Var3, 5));
                    dd4Var4.p0(as5Var);
                    obj16 = as5Var;
                }
                as5 as5Var2 = (as5) obj16;
                Object objQ5 = dd4Var4.Q();
                Object obj17 = objQ5;
                if (objQ5 == obj8) {
                    by9 by9Var = new by9(new rg2(as5Var2));
                    dd4Var4.p0(by9Var);
                    obj17 = by9Var;
                }
                by9 by9Var2 = (by9) obj17;
                if (ms5Var != null) {
                    dd4Var4.f0(1743490539);
                    dd4Var4.f0(887527095);
                    Object obj18 = u18.a;
                    if (obj18 != null) {
                        dd4Var4.f0(1345554384);
                    } else {
                        dd4Var4.f0(1345603457);
                        View view = (View) dd4Var4.j(he.f);
                        boolean zF2 = dd4Var4.f(view);
                        Object objQ6 = dd4Var4.Q();
                        if (zF2 || objQ6 == obj8) {
                            Object tag = view.getTag(2131362013);
                            s18 s18Var = tag instanceof s18 ? (s18) tag : null;
                            if (s18Var == null) {
                                objQ6 = new ei(view);
                                view.setTag(2131362013, objQ6);
                            } else {
                                objQ6 = s18Var;
                            }
                            dd4Var4.p0(objQ6);
                        }
                        obj18 = (s18) objQ6;
                    }
                    dd4Var4.q(false);
                    Object obj19 = obj18;
                    dd4Var4.q(false);
                    Object[] objArr = {ms5Var, as5Var2, by9Var2, obj19};
                    boolean zF3 = dd4Var4.f(ms5Var) | dd4Var4.h(as5Var2) | dd4Var4.h(by9Var2) | dd4Var4.h(obj19);
                    Object objQ7 = dd4Var4.Q();
                    if (zF3 || objQ7 == obj8) {
                        um umVar = new um(ms5Var, as5Var2, by9Var2, obj19, 14);
                        dd4Var4.p0(umVar);
                        objQ7 = umVar;
                    }
                    lc5.l(objArr, (kb4) objQ7, dd4Var4);
                    dd4Var4.q(false);
                } else {
                    dd4Var4.f0(1744076749);
                    dd4Var4.q(false);
                }
                int i4 = ns5.a;
                if (ms5Var != null && (ou6VarE = ou6Var.e(new o6b(ms5Var))) != null) {
                    ou6Var = ou6VarE;
                }
                boolean zF4 = dd4Var4.f(as5Var2) | dd4Var4.f(cs5Var);
                Object objQ8 = dd4Var4.Q();
                Object obj20 = objQ8;
                if (zF4 || objQ8 == obj8) {
                    xp5 xp5Var = new xp5(i2, as5Var2, cs5Var);
                    dd4Var4.p0(xp5Var);
                    obj20 = xp5Var;
                }
                yx9.b(by9Var2, ou6Var, (yb4) obj20, dd4Var4, 8);
                return hebVar;
            case 4:
                kb4 kb4Var3 = (kb4) obj9;
                kb4 kb4Var4 = (kb4) obj12;
                a07 a07Var4 = (a07) obj10;
                kb4 kb4Var5 = (kb4) obj11;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pj4 pj4VarA = e36.a(dd4Var5);
                    if (pj4VarA == null) {
                        gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    mo4 mo4Var = (mo4) ((qtb) qx1.N(ug8.a(mo4.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var5), null));
                    a07 a07VarB = bx1.B(mo4Var.f, dd4Var5);
                    uk9 uk9Var = (uk9) dd4Var5.j(xm1.q);
                    Object objQ9 = dd4Var5.Q();
                    Object objF = objQ9;
                    if (objQ9 == obj8) {
                        objF = ky0.f(dd4Var5);
                    }
                    z44 z44Var = (z44) objF;
                    Object objQ10 = dd4Var5.Q();
                    Object obj21 = objQ10;
                    if (objQ10 == obj8) {
                        cn7 cn7VarX = dk9.x(new wga((String) null, 0L, 7));
                        dd4Var5.p0(cn7VarX);
                        obj21 = cn7VarX;
                    }
                    a07 a07Var5 = (a07) obj21;
                    String str = ((wga) a07Var5.getValue()).a.b;
                    boolean zF5 = dd4Var5.f(mo4Var);
                    Object objQ11 = dd4Var5.Q();
                    Object obj22 = objQ11;
                    if (zF5 || objQ11 == obj8) {
                        fl6 fl6Var = new fl6(mo4Var, a07Var5, null, 1);
                        dd4Var5.p0(fl6Var);
                        obj22 = fl6Var;
                    }
                    lc5.u((yb4) obj22, dd4Var5, str);
                    boolean zF6 = dd4Var5.f(uk9Var);
                    Object objQ12 = dd4Var5.Q();
                    Object obj23 = objQ12;
                    if (zF6 || objQ12 == obj8) {
                        n85 n85Var = new n85(z44Var, uk9Var, null, 3);
                        dd4Var5.p0(n85Var);
                        obj23 = n85Var;
                    }
                    lc5.u((yb4) obj23, dd4Var5, z44Var);
                    px3 px3Var2 = tg9.c;
                    ou6 ou6VarE2 = yn2.E(yib.E(fe.L(px3Var2, ((q96) dd4Var5.j(s96.a)).a.p, jf0.G), 15), dd4Var5, 0);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var5, 0);
                    int iHashCode2 = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL2 = dd4Var5.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var5, ou6VarE2);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var2);
                    } else {
                        dd4Var5.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var5, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var5, lr7VarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var5, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var5, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var5, ou6VarL04);
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var5, 48);
                    int iHashCode3 = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL3 = dd4Var5.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var5, ou6VarN02);
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var2);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(jmVar, dd4Var5, eq8VarA);
                    un9.s(jmVar2, dd4Var5, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var5, jmVar3, dd4Var5, kdVar);
                    un9.s(jmVar4, dd4Var5, ou6VarL05);
                    un9.a(dd4Var5, tg9.r(lu6Var, 6.0f));
                    p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var5, 0);
                    String strK4 = wn9.K((pv9) vt9.I.getValue(), dd4Var5);
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF7 = dd4Var5.f(kb4Var5);
                    Object objQ13 = dd4Var5.Q();
                    Object obj24 = objQ13;
                    if (zF7 || objQ13 == obj8) {
                        tk6 tk6Var = new tk6(3, kb4Var5);
                        dd4Var5.p0(tk6Var);
                        obj24 = tk6Var;
                    }
                    mx4.a(p35VarC, strK4, gjb.l0(fw.J(null, (ib4) obj24, ou6VarW2, false, 15), 8.0f), 0L, dd4Var5, 0, 8);
                    String strK5 = wn9.K((pv9) mu9.c0.getValue(), dd4Var5);
                    wga wgaVar = (wga) a07Var5.getValue();
                    long j = lc1.i;
                    bp5 bp5Var = new bp5(1.0f, true);
                    Object objQ14 = dd4Var5.Q();
                    if (objQ14 == obj8) {
                        a07Var = a07Var5;
                        ci6 ci6Var = new ci6(a07Var, 29);
                        dd4Var5.p0(ci6Var);
                        obj4 = ci6Var;
                    } else {
                        a07Var = a07Var5;
                        obj4 = objQ14;
                    }
                    kb4 kb4Var6 = (kb4) obj4;
                    boolean zF8 = dd4Var5.f(uk9Var) | dd4Var5.f(mo4Var) | dd4Var5.f(a07Var4);
                    Object objQ15 = dd4Var5.Q();
                    if (zF8 || objQ15 == obj8) {
                        objQ15 = new zk6(uk9Var, mo4Var, a07Var, a07Var4, 1);
                        dd4Var5.p0(objQ15);
                    }
                    e11.A(wgaVar, strK5, 0L, j, null, z44Var, bp5Var, kb4Var6, (ib4) objQ15, dd4Var5, 12807168, 4);
                    dd4Var5.q(true);
                    y86.c(0.0f, 6, 6, 0L, dd4Var5, tg9.f(lu6Var, 1.0f));
                    if (((ko4) a07VarB.getValue()).a.isEmpty() && ((ko4) a07VarB.getValue()).b.isEmpty()) {
                        dd4Var5.f0(1798079651);
                        dd4Var5.q(false);
                        z = true;
                    } else {
                        dd4Var5.f0(1797184526);
                        String str2 = ((wga) a07Var.getValue()).a.b;
                        List list2 = ((ko4) a07VarB.getValue()).a;
                        List list3 = ((ko4) a07VarB.getValue()).b;
                        ou6 ou6VarN03 = gjb.n0(px3Var2, 0.0f, 12.0f, 1);
                        boolean zF9 = dd4Var5.f(uk9Var) | dd4Var5.f(mo4Var) | dd4Var5.f(a07Var4);
                        Object objQ16 = dd4Var5.Q();
                        Object obj25 = objQ16;
                        if (zF9 || objQ16 == obj8) {
                            al6 al6Var = new al6(uk9Var, mo4Var, a07Var4, 1);
                            dd4Var5.p0(al6Var);
                            obj25 = al6Var;
                        }
                        kb4 kb4Var7 = (kb4) obj25;
                        Object objQ17 = dd4Var5.Q();
                        Object obj26 = objQ17;
                        if (objQ17 == obj8) {
                            cl6 cl6Var = new cl6(a07Var, 0);
                            dd4Var5.p0(cl6Var);
                            obj26 = cl6Var;
                        }
                        kb4 kb4Var8 = (kb4) obj26;
                        boolean zF10 = dd4Var5.f(mo4Var);
                        Object objQ18 = dd4Var5.Q();
                        if (zF10 || objQ18 == obj8) {
                            z = true;
                            bl6 bl6Var = new bl6(mo4Var, 1);
                            dd4Var5.p0(bl6Var);
                            obj5 = bl6Var;
                        } else {
                            z = true;
                            obj5 = objQ18;
                        }
                        t96.j(str2, list2, list3, ou6VarN03, kb4Var3, kb4Var4, kb4Var7, kb4Var8, (kb4) obj5, dd4Var5, 12585984);
                        dd4Var5.q(false);
                    }
                    dd4Var5.q(z);
                } else {
                    dd4Var5.Y();
                }
                return hebVar;
            case 5:
                bka bkaVar = (bka) obj12;
                kb4 kb4Var9 = (kb4) obj9;
                kb4 kb4Var10 = (kb4) obj10;
                kb4 kb4Var11 = (kb4) obj11;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dd4Var6.Y();
                    return hebVar;
                }
                uk9 uk9Var2 = (uk9) dd4Var6.j(xm1.q);
                Object objQ19 = dd4Var6.Q();
                Object objF2 = objQ19;
                if (objQ19 == obj8) {
                    objF2 = ky0.f(dd4Var6);
                }
                z44 z44Var2 = (z44) objF2;
                boolean zF11 = dd4Var6.f(bkaVar.c);
                Object objQ20 = dd4Var6.Q();
                if (zF11 || objQ20 == obj8) {
                    String str3 = bkaVar.c;
                    int length = str3.length();
                    kb4Var = kb4Var10;
                    cn7 cn7VarX2 = dk9.x(new wga(str3, zk9.h(length, length), 4));
                    dd4Var6.p0(cn7VarX2);
                    obj6 = cn7VarX2;
                } else {
                    kb4Var = kb4Var10;
                    obj6 = objQ20;
                }
                a07 a07Var6 = (a07) obj6;
                boolean zF12 = dd4Var6.f(uk9Var2);
                Object objQ21 = dd4Var6.Q();
                Object obj27 = objQ21;
                if (zF12 || objQ21 == obj8) {
                    gl6 gl6Var = new gl6(z44Var2, uk9Var2, jt1Var, true ? 1 : 0);
                    dd4Var6.p0(gl6Var);
                    obj27 = gl6Var;
                }
                lc5.u((yb4) obj27, dd4Var6, z44Var2);
                px3 px3Var3 = tg9.c;
                ur9 ur9Var = s96.a;
                ou6 ou6VarE3 = yn2.E(yib.B(fe.L(px3Var3, ((q96) dd4Var6.j(ur9Var)).a.p, jf0.G), 7), dd4Var6, 0);
                ie1 ie1VarA2 = ge1.a(pv.c, bv4.z, dd4Var6, 0);
                int iHashCode4 = Long.hashCode(dd4Var6.T);
                lr7 lr7VarL4 = dd4Var6.l();
                ou6 ou6VarL06 = s32.L0(dd4Var6, ou6VarE3);
                ml1.k.getClass();
                um1 um1Var3 = ll1.b;
                dd4Var6.j0();
                if (dd4Var6.S) {
                    dd4Var6.k(um1Var3);
                } else {
                    dd4Var6.s0();
                }
                jm jmVar5 = ll1.f;
                un9.s(jmVar5, dd4Var6, ie1VarA2);
                jm jmVar6 = ll1.e;
                un9.s(jmVar6, dd4Var6, lr7VarL4);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                jm jmVar7 = ll1.g;
                un9.s(jmVar7, dd4Var6, numValueOf2);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var6, kdVar2);
                jm jmVar8 = ll1.d;
                un9.s(jmVar8, dd4Var6, ou6VarL06);
                ou6 ou6VarN04 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                eq8 eq8VarA2 = dq8.a(pv.a, bv4.x, dd4Var6, 48);
                int iHashCode5 = Long.hashCode(dd4Var6.T);
                lr7 lr7VarL5 = dd4Var6.l();
                ou6 ou6VarL07 = s32.L0(dd4Var6, ou6VarN04);
                dd4Var6.j0();
                if (dd4Var6.S) {
                    dd4Var6.k(um1Var3);
                } else {
                    dd4Var6.s0();
                }
                un9.s(jmVar5, dd4Var6, eq8VarA2);
                un9.s(jmVar6, dd4Var6, lr7VarL5);
                ky0.v(iHashCode5, dd4Var6, jmVar7, dd4Var6, kdVar2);
                un9.s(jmVar8, dd4Var6, ou6VarL07);
                un9.a(dd4Var6, tg9.r(lu6Var, 6.0f));
                p35 p35VarC2 = i25.c((m53) a53.d.getValue(), dd4Var6, 0);
                String strK6 = wn9.K((pv9) vt9.I.getValue(), dd4Var6);
                long j2 = ((q96) dd4Var6.j(ur9Var)).a.q;
                ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                kb4 kb4Var12 = kb4Var;
                boolean zF13 = dd4Var6.f(kb4Var12);
                Object objQ22 = dd4Var6.Q();
                Object obj28 = objQ22;
                if (zF13 || objQ22 == obj8) {
                    ir6 ir6Var = new ir6(6, kb4Var12);
                    dd4Var6.p0(ir6Var);
                    obj28 = ir6Var;
                }
                mx4.a(p35VarC2, strK6, gjb.l0(fw.J(null, (ib4) obj28, ou6VarW3, false, 15), 8.0f), j2, dd4Var6, 0, 0);
                String strK7 = wn9.K((pv9) mu9.c0.getValue(), dd4Var6);
                wga wgaVar2 = (wga) a07Var6.getValue();
                long j3 = ((q96) dd4Var6.j(ur9Var)).a.q;
                long j4 = lc1.i;
                ou6 ou6VarF0 = h67.f0(new bp5(1.0f, true), null, 3);
                rj1 rj1VarG = jf0.G(2098672572, new tr6(bkaVar, 0), dd4Var6);
                boolean zF14 = dd4Var6.f(a07Var6);
                Object objQ23 = dd4Var6.Q();
                Object obj29 = objQ23;
                if (zF14 || objQ23 == obj8) {
                    wo6 wo6Var = new wo6(a07Var6, 12);
                    dd4Var6.p0(wo6Var);
                    obj29 = wo6Var;
                }
                kb4 kb4Var13 = (kb4) obj29;
                boolean zF15 = dd4Var6.f(uk9Var2) | dd4Var6.f(kb4Var11) | dd4Var6.f(a07Var6);
                Object objQ24 = dd4Var6.Q();
                if (zF15 || objQ24 == obj8) {
                    z2 = true;
                    sr6 sr6Var = new sr6(uk9Var2, kb4Var11, a07Var6, 1);
                    dd4Var6.p0(sr6Var);
                    obj7 = sr6Var;
                } else {
                    z2 = true;
                    obj7 = objQ24;
                }
                e11.A(wgaVar2, strK7, j3, j4, rj1VarG, z44Var2, ou6VarF0, kb4Var13, (ib4) obj7, dd4Var6, 224256, 0);
                dd4Var6.q(z2);
                y86.c(0.0f, 6, 2, lc1.c(0.2f, ((q96) dd4Var6.j(ur9Var)).a.q), dd4Var6, tg9.f(lu6Var, 1.0f));
                if (bkaVar.f.isEmpty()) {
                    z3 = true;
                    dd4Var6.f0(1041734246);
                    dd4Var6.q(false);
                } else {
                    dd4Var6.f0(1041276810);
                    z3 = true;
                    tw1.r(bkaVar, yib.e(dd4Var6, 8), xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true), kb4Var9, dd4Var6, 0, 0);
                    dd4Var6.q(false);
                }
                dd4Var6.q(z3);
                return hebVar;
            case 6:
                yb4 yb4Var = (yb4) obj12;
                os1 os1Var = (os1) obj10;
                zb4 zb4Var = (zb4) obj11;
                ib4 ib4Var = (ib4) obj9;
                ks1 ks1Var = (ks1) obj;
                dd4 dd4Var7 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= dd4Var7.f(ks1Var) ? 4 : 2;
                }
                if (dd4Var7.V(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    String str4 = (String) yb4Var.invoke(dd4Var7, 0);
                    if (bw9.a0(str4)) {
                        t75.c("Label must not be blank");
                    }
                    os1Var.getClass();
                    kl8.b.j(lu6.a, str4, Boolean.TRUE, ks1Var, zb4Var, ib4Var, dd4Var7, Integer.valueOf((iIntValue6 << 9) & 7168));
                } else {
                    dd4Var7.Y();
                }
                return hebVar;
            case 7:
                t02 t02Var = (t02) obj12;
                aw3 aw3Var = (aw3) obj10;
                br9 br9Var4 = (br9) obj11;
                a07 a07Var7 = (a07) obj9;
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var8.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    String str5 = ((s02) br9Var4.getValue()).f;
                    int size = ((s02) br9Var4.getValue()).h.size();
                    bi5 bi5Var = (bi5) a07Var7.getValue();
                    boolean z4 = ((s02) br9Var4.getValue()).e;
                    String str6 = ((s02) br9Var4.getValue()).g;
                    ou6 ou6VarP0 = gjb.p0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    boolean zF16 = dd4Var8.f(t02Var);
                    Object objQ25 = dd4Var8.Q();
                    if (zF16 || objQ25 == obj8) {
                        objQ25 = new x(1, t02Var, t02.class, "updateGroupName", "updateGroupName(Ljava/lang/String;)V", 0, 28);
                        dd4Var8.p0(objQ25);
                    }
                    kb4 kb4Var14 = (kb4) ((ei5) objQ25);
                    boolean zF17 = dd4Var8.f(aw3Var);
                    Object objQ26 = dd4Var8.Q();
                    Object obj30 = objQ26;
                    if (zF17 || objQ26 == obj8) {
                        k51 k51Var = new k51(aw3Var, 1);
                        dd4Var8.p0(k51Var);
                        obj30 = k51Var;
                    }
                    ib4 ib4Var2 = (ib4) obj30;
                    boolean zF18 = dd4Var8.f(t02Var);
                    Object objQ27 = dd4Var8.Q();
                    if (zF18 || objQ27 == obj8) {
                        objQ27 = new x(1, t02Var, t02.class, "updateVisibility", "updateVisibility(Ljava/lang/String;)V", 0, 29);
                        dd4Var8.p0(objQ27);
                    }
                    h67.o(str5, size, bi5Var, z4, str6, ou6VarP0, kb4Var14, ib4Var2, (kb4) ((ei5) objQ27), dd4Var8, 196608);
                } else {
                    dd4Var8.Y();
                }
                return hebVar;
            case 8:
                ArrayList arrayList = (ArrayList) obj12;
                rl3 rl3Var = (rl3) obj10;
                kb4 kb4Var15 = (kb4) obj9;
                a07 a07Var8 = (a07) obj11;
                dd4 dd4Var9 = (dd4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var9.V(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj31 = arrayList.get(i5);
                        i5++;
                        rl3 rl3Var2 = (rl3) obj31;
                        String str7 = rl3Var2.a;
                        Boolean boolValueOf = Boolean.valueOf(rl3Var == rl3Var2);
                        boolean zF19 = dd4Var9.f(kb4Var15) | dd4Var9.d(rl3Var2.ordinal());
                        Object objQ28 = dd4Var9.Q();
                        if (zF19 || objQ28 == obj8) {
                            objQ28 = new ma0(11, kb4Var15, rl3Var2, a07Var8);
                            dd4Var9.p0(objQ28);
                        }
                        gx1.c(str7, null, null, boolValueOf, null, (ib4) objQ28, dd4Var9, 0, 22);
                    }
                } else {
                    dd4Var9.Y();
                }
                return hebVar;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                to3 to3Var = (to3) obj12;
                t27 t27Var2 = (t27) obj10;
                fn2 fn2Var = (fn2) obj11;
                yn3 yn3Var = (yn3) obj9;
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (dd4Var10.V(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    boolean zF20 = dd4Var10.f(t27Var2) | dd4Var10.h(to3Var);
                    Object objQ29 = dd4Var10.Q();
                    Object obj32 = objQ29;
                    if (zF20 || objQ29 == obj8) {
                        al3 al3Var = new al3(true ? 1 : 0, t27Var2, to3Var);
                        dd4Var10.p0(al3Var);
                        obj32 = al3Var;
                    }
                    ib4 ib4Var3 = (ib4) obj32;
                    boolean zF21 = dd4Var10.f(fn2Var) | dd4Var10.h(to3Var);
                    Object objQ30 = dd4Var10.Q();
                    Object obj33 = objQ30;
                    if (zF21 || objQ30 == obj8) {
                        al3 al3Var2 = new al3(i2, fn2Var, to3Var);
                        dd4Var10.p0(al3Var2);
                        obj33 = al3Var2;
                    }
                    ib4 ib4Var4 = (ib4) obj33;
                    boolean zF22 = dd4Var10.f(yn3Var) | dd4Var10.h(to3Var);
                    Object objQ31 = dd4Var10.Q();
                    Object obj34 = objQ31;
                    if (zF22 || objQ31 == obj8) {
                        al3 al3Var3 = new al3(i3, yn3Var, to3Var);
                        dd4Var10.p0(al3Var3);
                        obj34 = al3Var3;
                    }
                    t1c.s(to3Var, ou6VarF, ib4Var3, ib4Var4, (ib4) obj34, dd4Var10, 48, 0);
                } else {
                    dd4Var10.Y();
                }
                return hebVar;
            case 11:
                xr xrVar = (xr) obj12;
                String str8 = (String) obj10;
                kb4 kb4Var16 = (kb4) obj9;
                kb4 kb4Var17 = (kb4) obj11;
                dd4 dd4Var11 = (dd4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var11.V(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    boolean zF23 = dd4Var11.f(kb4Var16) | dd4Var11.f(kb4Var17);
                    Object objQ32 = dd4Var11.Q();
                    Object obj35 = objQ32;
                    if (zF23 || objQ32 == obj8) {
                        sl1 sl1Var = new sl1(kb4Var16, kb4Var17, 3);
                        dd4Var11.p0(sl1Var);
                        obj35 = sl1Var;
                    }
                    lc5.b(xrVar, str8, (kb4) obj35, gjb.k0(tg9.f(lu6Var, 1.0f), yib.d(14, dd4Var11, false)), dd4Var11, 0);
                } else {
                    dd4Var11.Y();
                }
                return hebVar;
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return i(obj, obj2, obj3);
            case 16:
                return l(obj, obj2, obj3);
            case 17:
                return m(obj, obj2, obj3);
            case 18:
                return n(obj, obj2, obj3);
            case 19:
                return o(obj, obj2, obj3);
            case 20:
                return p(obj, obj2, obj3);
            default:
                String[] strArr = (String[]) obj12;
                List list4 = (List) obj11;
                a07 a07Var9 = (a07) obj10;
                a07 a07Var10 = (a07) obj9;
                dd4 dd4Var12 = (dd4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (dd4Var12.V(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    int iR0 = fw.r0((String) a07Var9.getValue(), strArr);
                    int i6 = 0;
                    for (Object obj36 : list4) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str9 = (String) obj36;
                        Boolean boolValueOf2 = Boolean.valueOf(iR0 == i6);
                        boolean zF24 = dd4Var12.f(a07Var10) | dd4Var12.f(a07Var9) | dd4Var12.h(strArr) | dd4Var12.d(i6);
                        Object objQ33 = dd4Var12.Q();
                        if (zF24 || objQ33 == obj8) {
                            objQ33 = new ga7(strArr, i6, a07Var10, a07Var9);
                            dd4Var12.p0(objQ33);
                        }
                        gx1.c(str9, null, null, boolValueOf2, null, (ib4) objQ33, dd4Var12, 0, 22);
                        i6 = i7;
                    }
                } else {
                    dd4Var12.Y();
                }
                return hebVar;
        }
    }

    public /* synthetic */ hu2(yb4 yb4Var, os1 os1Var, zb4 zb4Var, ib4 ib4Var) {
        this.a = 6;
        this.b = yb4Var;
        this.c = os1Var;
        this.d = zb4Var;
        this.e = ib4Var;
    }

    public /* synthetic */ hu2(kb4 kb4Var, kb4 kb4Var2, a07 a07Var, kb4 kb4Var3) {
        this.a = 4;
        this.e = kb4Var;
        this.b = kb4Var2;
        this.c = a07Var;
        this.d = kb4Var3;
    }

    public /* synthetic */ hu2(bka bkaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3) {
        this.a = 5;
        this.b = bkaVar;
        this.e = kb4Var;
        this.c = kb4Var2;
        this.d = kb4Var3;
    }

    public /* synthetic */ hu2(Serializable serializable, Object obj, kb4 kb4Var, Object obj2, int i) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.e = kb4Var;
        this.d = obj2;
    }

    public /* synthetic */ hu2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ hu2(List list, k4b k4bVar, kb4 kb4Var, a07 a07Var) {
        this.a = 20;
        this.d = list;
        this.b = k4bVar;
        this.e = kb4Var;
        this.c = a07Var;
    }

    public /* synthetic */ hu2(String[] strArr, List list, a07 a07Var, a07 a07Var2) {
        this.a = 21;
        this.b = strArr;
        this.d = list;
        this.c = a07Var;
        this.e = a07Var2;
    }
}
