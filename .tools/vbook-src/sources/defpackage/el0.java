package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class el0 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ el0(t61 t61Var, ib4 ib4Var, wga wgaVar, kb4 kb4Var, ib4 ib4Var2, st5 st5Var, kb4 kb4Var2) {
        this.a = 3;
        this.b = t61Var;
        this.c = ib4Var;
        this.d = wgaVar;
        this.e = kb4Var;
        this.s = ib4Var2;
        this.t = st5Var;
        this.f = kb4Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        onb onbVar = (onb) this.b;
        kb4 kb4Var = (kb4) this.e;
        kb4 kb4Var2 = (kb4) this.f;
        kb4 kb4Var3 = (kb4) this.t;
        kb4 kb4Var4 = (kb4) this.c;
        kb4 kb4Var5 = (kb4) this.d;
        kb4 kb4Var6 = (kb4) this.s;
        dd4 dd4Var = (dd4) obj2;
        ((Integer) obj3).getClass();
        ((co) obj).getClass();
        lu6 lu6Var = lu6.a;
        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
        int iHashCode = Long.hashCode(dd4Var.T);
        lr7 lr7VarL = dd4Var.l();
        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
        ml1.k.getClass();
        um1 um1Var = ll1.b;
        dd4Var.j0();
        if (dd4Var.S) {
            dd4Var.k(um1Var);
        } else {
            dd4Var.s0();
        }
        un9.s(ll1.f, dd4Var, ie1VarA);
        un9.s(ll1.e, dd4Var, lr7VarL);
        un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
        un9.r(dd4Var, ll1.h);
        un9.s(ll1.d, dd4Var, ou6VarL0);
        un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
        String strK = wn9.K((pv9) ev9.F0.getValue(), dd4Var);
        ur9 ur9Var = s96.a;
        nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131070);
        un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
        au6.c(au6.a, onbVar.j, kb4Var, dd4Var, 0);
        un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
        nha.c(wn9.K((pv9) ev9.x0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131070);
        un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
        au6.c(au6.b, onbVar.k, kb4Var2, dd4Var, 0);
        un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
        nha.c(wn9.K((pv9) ev9.C0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131070);
        un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
        Object objQ = dd4Var.Q();
        Object obj4 = vl1.a;
        if (objQ == obj4) {
            objQ = gc1.Z(0, 1, 2);
            dd4Var.p0(objQ);
        }
        List list = (List) objQ;
        List listZ = gc1.Z(wn9.K((pv9) ev9.B0.getValue(), dd4Var), wn9.K((pv9) ev9.A0.getValue(), dd4Var), wn9.K((pv9) ev9.z0.getValue(), dd4Var));
        int iIndexOf = list.indexOf(Integer.valueOf(onbVar.l));
        int i = iIndexOf < 0 ? 0 : iIndexOf;
        boolean zF = dd4Var.f(kb4Var3) | dd4Var.h(list);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj4) {
            objQ2 = new qp0(kb4Var3, list, 5);
            dd4Var.p0(objQ2);
        }
        rw1.C(i, 0, (kb4) objQ2, dd4Var, fe.L(t96.w(tg9.f(lu6Var, 1.0f), ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), jf0.G), listZ);
        un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
        String strK2 = wn9.K((pv9) ev9.G0.getValue(), dd4Var);
        float f = onbVar.h;
        au6.g(strK2, f, new bb1(0.5f, 2.5f), ((int) (f * 100.0f)) + "%", kb4Var4, tg9.f(lu6Var, 1.0f), dd4Var, 196608);
        un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
        au6.g(wn9.K((pv9) ev9.y0.getValue(), dd4Var), onbVar.i, new bb1(0.0f, 1.0f), wn9.L(mu9.a(), new Object[]{Integer.valueOf((int) (onbVar.i * 100.0f))}, dd4Var), kb4Var5, tg9.f(lu6Var, 1.0f), dd4Var, 196608);
        un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
        String strK3 = wn9.K((pv9) ev9.E0.getValue(), dd4Var);
        float f2 = onbVar.m;
        au6.g(strK3, f2, new bb1(0.0f, 120.0f), ((int) f2) + "dp", kb4Var6, tg9.f(lu6Var, 1.0f), dd4Var, 196608);
        dd4Var.q(true);
        return heb.a;
    }

    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v17 */
    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ?? r15;
        br9 br9Var;
        a07 a07Var;
        heb hebVar;
        final a07 a07Var2;
        final a07 a07Var3;
        joa joaVar;
        br9 br9Var2;
        a07 a07Var4;
        vx1 vx1Var;
        int i;
        a07 a07Var5;
        a07 a07Var6;
        qr1 qr1Var;
        joa joaVar2;
        dd4 dd4Var;
        boolean z;
        int i2 = this.a;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        heb hebVar2 = heb.a;
        Object obj5 = this.t;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.s;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (i2) {
            case 0:
                uu5 uu5Var = (uu5) obj11;
                pj7 pj7Var = (pj7) obj10;
                szb szbVar = (szb) obj9;
                sl0 sl0Var = (sl0) obj8;
                kb4 kb4Var = (kb4) obj7;
                kb4 kb4Var2 = (kb4) obj6;
                kb4 kb4Var3 = (kb4) obj5;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    iq9 iq9Var = new iq9(320.0f);
                    px3 px3Var = tg9.c;
                    mv mvVar = new mv(6.0f, true, new gp(5));
                    boolean zF = dd4Var2.f(sl0Var) | dd4Var2.f(kb4Var) | dd4Var2.f(kb4Var2) | dd4Var2.f(kb4Var3);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == obj4) {
                        objQ = new um((Object) sl0Var, kb4Var, (ub4) kb4Var2, (ub4) kb4Var3, 1);
                        dd4Var2.p0(objQ);
                    }
                    gx1.j(iq9Var, px3Var, uu5Var, pj7Var, 6.0f, mvVar, null, false, 0L, 0L, szbVar, (kb4) objQ, dd4Var2, 1769520, 0, 1936);
                }
                break;
            case 1:
                uu5 uu5Var2 = (uu5) obj11;
                pj7 pj7Var2 = (pj7) obj10;
                szb szbVar2 = (szb) obj9;
                bw2 bw2Var = (bw2) obj8;
                kb4 kb4Var4 = (kb4) obj7;
                kb4 kb4Var5 = (kb4) obj6;
                yb4 yb4Var = (yb4) obj5;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    iq9 iq9Var2 = new iq9(320.0f);
                    px3 px3Var2 = tg9.c;
                    mv mvVar2 = new mv(6.0f, true, new gp(5));
                    boolean zF2 = dd4Var3.f(bw2Var) | dd4Var3.f(kb4Var4) | dd4Var3.f(kb4Var5) | dd4Var3.f(yb4Var);
                    Object objQ2 = dd4Var3.Q();
                    if (zF2 || objQ2 == obj4) {
                        objQ2 = new um((Object) bw2Var, kb4Var4, (ub4) kb4Var5, (ub4) yb4Var, 8);
                        dd4Var3.p0(objQ2);
                    }
                    gx1.j(iq9Var2, px3Var2, uu5Var2, pj7Var2, 6.0f, mvVar2, null, false, 0L, 0L, szbVar2, (kb4) objQ2, dd4Var3, 1769520, 0, 1936);
                }
                break;
            case 2:
                zk7 zk7Var = (zk7) obj11;
                v54 v54Var = (v54) obj8;
                pj7 pj7Var3 = (pj7) obj10;
                szb szbVar3 = (szb) obj9;
                kb4 kb4Var6 = (kb4) obj7;
                kb4 kb4Var7 = (kb4) obj6;
                ib4 ib4Var = (ib4) obj5;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yn0) obj).getClass();
                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var4.Y();
                } else {
                    e11.e(zk7Var, tg9.c, null, null, 0, 0.0f, null, null, false, null, null, null, jf0.G(1264944373, new ao6(v54Var, pj7Var3, szbVar3, kb4Var6, kb4Var7, ib4Var), dd4Var4), dd4Var4, 100663344, 16124);
                }
                break;
            case 3:
                t61 t61Var = (t61) obj11;
                ib4 ib4Var2 = (ib4) obj10;
                wga wgaVar = (wga) obj9;
                kb4 kb4Var8 = (kb4) obj7;
                ib4 ib4Var3 = (ib4) obj8;
                st5 st5Var = (st5) obj5;
                kb4 kb4Var9 = (kb4) obj6;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dd4Var5.Y();
                } else {
                    ou6 ou6VarM0 = gjb.m0(yib.E(tg9.f(lu6Var, 1.0f), 14), 16.0f, 8.0f);
                    ie1 ie1VarA = ge1.a(new mv(8.0f, true, new gp(5)), bv4.z, dd4Var5, 6);
                    int iHashCode = Long.hashCode(dd4Var5.T);
                    lr7 lr7VarL = dd4Var5.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var5, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var5.j0();
                    if (dd4Var5.S) {
                        dd4Var5.k(um1Var);
                    } else {
                        dd4Var5.s0();
                    }
                    un9.s(ll1.f, dd4Var5, ie1VarA);
                    un9.s(ll1.e, dd4Var5, lr7VarL);
                    un9.s(ll1.g, dd4Var5, Integer.valueOf(iHashCode));
                    un9.r(dd4Var5, ll1.h);
                    un9.s(ll1.d, dd4Var5, ou6VarL0);
                    fe.E(jf0.G(240857188, new m85(wgaVar, kb4Var8, ib4Var3, t61Var, st5Var, kb4Var9), dd4Var5), dd4Var5, 6);
                    lc5.d(ib4Var2, tg9.f(lu6Var, 1.0f), (t61Var.z.isEmpty() || t61Var.v) ? false : true, null, null, null, null, null, kc5.d, dd4Var5, 805306416, 504);
                    dd4Var5.q(true);
                }
                break;
            case 4:
                pn2 pn2Var = (pn2) obj11;
                m6a m6aVar = (m6a) obj10;
                a07 a07Var7 = (a07) obj9;
                a07 a07Var8 = (a07) obj8;
                a07 a07Var9 = (a07) obj7;
                a07 a07Var10 = (a07) obj6;
                rj1 rj1Var = (rj1) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= dd4Var6.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var6.V(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    dd4Var6.Y();
                } else {
                    jv3.f(new p58[]{xm1.h.a(pn2Var), b73.b.a(m6aVar), b73.a.a((c73) a07Var7.getValue())}, jf0.G(970232694, new uj0(a07Var8, a07Var9, a07Var10, rj1Var, co0Var, 9), dd4Var6), dd4Var6, 56);
                }
                break;
            case 5:
                ib4 ib4Var4 = (ib4) obj11;
                ib4 ib4Var5 = (ib4) obj10;
                ib4 ib4Var6 = (ib4) obj9;
                ib4 ib4Var7 = (ib4) obj8;
                ib4 ib4Var8 = (ib4) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                dd4 dd4Var7 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                vf0 vf0Var = bv4.z;
                jv jvVar = pv.c;
                ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var7, 0);
                int iHashCode2 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL2 = dd4Var7.l();
                ou6 ou6VarL02 = s32.L0(dd4Var7, ou6VarF);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var2);
                } else {
                    dd4Var7.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var7, ie1VarA2);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var7, lr7VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var7, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var7, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var7, ou6VarL02);
                ou6 ou6VarY = yn2.y(dd4Var7, tg9.f(lu6Var, 1.0f));
                ur9 ur9Var = s96.a;
                ou6 ou6VarL03 = gjb.l0(yib.B(fe.L(ou6VarY, lc1.c(0.95f, dd1.g(((q96) dd4Var7.j(ur9Var)).a, 4.0f)), jf0.G), 7), 12.0f);
                ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var7, 0);
                int iHashCode3 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL3 = dd4Var7.l();
                ou6 ou6VarL04 = s32.L0(dd4Var7, ou6VarL03);
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var2);
                } else {
                    dd4Var7.s0();
                }
                un9.s(jmVar, dd4Var7, ie1VarA3);
                un9.s(jmVar2, dd4Var7, lr7VarL3);
                dx1.r(iHashCode3, dd4Var7, jmVar3, dd4Var7, kdVar);
                un9.s(jmVar4, dd4Var7, ou6VarL04);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                wf0 wf0Var = bv4.w;
                iv ivVar = pv.a;
                eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var7, 0);
                int iHashCode4 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL4 = dd4Var7.l();
                ou6 ou6VarL05 = s32.L0(dd4Var7, ou6VarF2);
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var2);
                } else {
                    dd4Var7.s0();
                }
                un9.s(jmVar, dd4Var7, eq8VarA);
                un9.s(jmVar2, dd4Var7, lr7VarL4);
                dx1.r(iHashCode4, dd4Var7, jmVar3, dd4Var7, kdVar);
                un9.s(jmVar4, dd4Var7, ou6VarL05);
                tu1.a(i25.c((m53) a53.w.getValue(), dd4Var7, 0), null, ib4Var5, dd4Var7, 0, 2);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                un9.a(dd4Var7, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                tu1.a(i25.c((m53) f53.d0.getValue(), dd4Var7, 0), null, ib4Var6, dd4Var7, 0, 2);
                un9.a(dd4Var7, tg9.r(lu6Var, 12.0f));
                tu1.a(i25.c((m53) h53.f.getValue(), dd4Var7, 0), null, ib4Var7, dd4Var7, 0, 2);
                un9.a(dd4Var7, tg9.r(lu6Var, 12.0f));
                tu1.a(i25.c((m53) f53.J.getValue(), dd4Var7, 0), null, ib4Var8, dd4Var7, 0, 2);
                dd4Var7.q(true);
                un9.a(dd4Var7, tg9.h(lu6Var, 12.0f));
                ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                boolean zF3 = dd4Var7.f(ib4Var4);
                Object objQ3 = dd4Var7.Q();
                if (zF3 || objQ3 == obj4) {
                    r15 = 0;
                    objQ3 = new i35(0, ib4Var4);
                    dd4Var7.p0(objQ3);
                } else {
                    r15 = 0;
                }
                ou6 ou6VarV = yn2.V(1, (ib4) objQ3, dd4Var7, ou6VarF3, (boolean) r15);
                ie1 ie1VarA4 = ge1.a(jvVar, vf0Var, dd4Var7, (int) r15);
                int iHashCode5 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL5 = dd4Var7.l();
                ou6 ou6VarL06 = s32.L0(dd4Var7, ou6VarV);
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var2);
                } else {
                    dd4Var7.s0();
                }
                un9.s(jmVar, dd4Var7, ie1VarA4);
                un9.s(jmVar2, dd4Var7, lr7VarL5);
                dx1.r(iHashCode5, dd4Var7, jmVar3, dd4Var7, kdVar);
                un9.s(jmVar4, dd4Var7, ou6VarL06);
                nha.c(str, (ou6) null, ((q96) dd4Var7.j(ur9Var)).a.q, (g60) null, wn9.x(16), (t74) null, a84.w, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, (uka) null, dd4Var7, 1597440, 24960, 241578);
                ou6 ou6VarF4 = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var7, 48);
                int iHashCode6 = Long.hashCode(dd4Var7.T);
                lr7 lr7VarL6 = dd4Var7.l();
                ou6 ou6VarL07 = s32.L0(dd4Var7, ou6VarF4);
                dd4Var7.j0();
                if (dd4Var7.S) {
                    dd4Var7.k(um1Var2);
                } else {
                    dd4Var7.s0();
                }
                un9.s(jmVar, dd4Var7, eq8VarA2);
                un9.s(jmVar2, dd4Var7, lr7VarL6);
                dx1.r(iHashCode6, dd4Var7, jmVar3, dd4Var7, kdVar);
                un9.s(jmVar4, dd4Var7, ou6VarL07);
                long jX = wn9.x(14);
                long j = ((q96) dd4Var7.j(ur9Var)).a.q;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                nha.c(str2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var7, 24576, 24960, 240616);
                mx4.a(i25.c((m53) f53.s.getValue(), dd4Var7, 0), (String) null, tg9.n(lu6Var, 16.0f), ((q96) dd4Var7.j(ur9Var)).a.q, dd4Var7, 432, 0);
                tw2.x(dd4Var7, true, true, true);
                y86.c(0.0f, 6, 2, dd1.g(((q96) dd4Var7.j(ur9Var)).a, 4.0f), dd4Var7, tg9.f(lu6Var, 1.0f));
                dd4Var7.q(true);
                break;
            case 6:
                String str3 = (String) obj11;
                kb4 kb4Var10 = (kb4) obj7;
                yb4 yb4Var2 = (yb4) obj10;
                kb4 kb4Var11 = (kb4) obj6;
                kb4 kb4Var12 = (kb4) obj5;
                kb4 kb4Var13 = (kb4) obj9;
                kb4 kb4Var14 = (kb4) obj8;
                dd4 dd4Var8 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var8.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dd4Var8.Y();
                } else {
                    ou6 ou6VarB = yib.B(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), 14);
                    boolean zF4 = dd4Var8.f(kb4Var10);
                    Object objQ4 = dd4Var8.Q();
                    if (zF4 || objQ4 == obj4) {
                        objQ4 = new tk6(20, kb4Var10);
                        dd4Var8.p0(objQ4);
                    }
                    ib4 ib4Var9 = (ib4) objQ4;
                    boolean zF5 = dd4Var8.f(kb4Var10);
                    Object objQ5 = dd4Var8.Q();
                    if (zF5 || objQ5 == obj4) {
                        objQ5 = new tk6(21, kb4Var10);
                        dd4Var8.p0(objQ5);
                    }
                    qu1.p(str3, ou6VarB, ib4Var9, yb4Var2, kb4Var11, kb4Var12, kb4Var13, kb4Var14, (ib4) objQ5, dd4Var8, 0);
                }
                break;
            case 7:
                break;
            case 8:
                co coVar = (co) obj;
                dd4 dd4Var9 = (dd4) obj2;
                ((Integer) obj3).getClass();
                coVar.getClass();
                sdc.e(yib.B((ou6) obj11, 15), null, jf0.G(2057284603, new el0((a07) obj10, (a07) obj9, (a07) obj8, (joa) obj7, (za9) obj6, coVar, (a07) obj5, 9), dd4Var9), dd4Var9, 3072, 6);
                break;
            default:
                final a07 a07Var11 = (a07) obj11;
                a07 a07Var12 = (a07) obj10;
                a07 a07Var13 = (a07) obj9;
                joa joaVar3 = (joa) obj8;
                za9 za9Var = (za9) obj7;
                co coVar2 = (co) obj6;
                br9 br9Var3 = (a07) obj5;
                co0 co0Var2 = (co0) obj;
                dd4 dd4Var10 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                co0Var2.getClass();
                long j2 = co0Var2.b;
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= dd4Var10.f(co0Var2) ? 4 : 2;
                }
                if (!dd4Var10.V(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    dd4Var10.Y();
                } else {
                    final int i3 = up1.i(j2);
                    int iH = up1.h(j2);
                    Object objQ6 = dd4Var10.Q();
                    if (objQ6 == obj4) {
                        br9Var = br9Var3;
                        objQ6 = dk9.x(new na5(0L));
                        dd4Var10.p0(objQ6);
                    } else {
                        br9Var = br9Var3;
                    }
                    a07 a07Var14 = (a07) objQ6;
                    Object objQ7 = dd4Var10.Q();
                    if (objQ7 == obj4) {
                        objQ7 = lc5.Z(dd4Var10);
                        dd4Var10.p0(objQ7);
                    }
                    final vx1 vx1Var2 = (vx1) objQ7;
                    Object objQ8 = dd4Var10.Q();
                    if (objQ8 == obj4) {
                        objQ8 = new zlb();
                        dd4Var10.p0(objQ8);
                    }
                    zlb zlbVar = (zlb) objQ8;
                    WeakHashMap weakHashMap = pzb.w;
                    nm nmVar = ju7.i(dd4Var10).c;
                    int i4 = nmVar.e().d;
                    boolean zF6 = dd4Var10.f(a07Var11) | dd4Var10.d(i3) | dd4Var10.d(iH) | dd4Var10.d(i4) | dd4Var10.f(a07Var12);
                    Object objQ9 = dd4Var10.Q();
                    if (zF6 || objQ9 == obj4) {
                        objQ9 = new ei9(i3, iH, i4, a07Var11, a07Var14, a07Var12);
                        a07Var = a07Var14;
                        dd4Var10.p0(objQ9);
                    } else {
                        a07Var = a07Var14;
                    }
                    ou6 ou6VarB0 = vm7.b0(lu6Var, (kb4) objQ9);
                    Object objQ10 = dd4Var10.Q();
                    if (objQ10 == obj4) {
                        hebVar = hebVar2;
                        objQ10 = new qda(a07Var, 12);
                        dd4Var10.p0(objQ10);
                    } else {
                        hebVar = hebVar2;
                    }
                    ou6 ou6VarL08 = gjb.l0(m79.J(ou6VarB0, (kb4) objQ10), 16.0f);
                    rp8 rp8Var = tp8.a;
                    ur9 ur9Var2 = s96.a;
                    a07 a07Var15 = a07Var;
                    ou6 ou6VarE = ou6VarL08.e(new xe9(rp8Var, new n89(lc1.c(0.1f, ((q96) dd4Var10.j(ur9Var2)).a.q), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(3.0f)) & 4294967295L))));
                    Object objQ11 = dd4Var10.Q();
                    if (objQ11 == obj4) {
                        objQ11 = new qda(a07Var13, 13);
                        dd4Var10.p0(objQ11);
                    }
                    ou6 ou6VarW = kl8.W(ou6VarE, (kb4) objQ11);
                    ou6VarW.getClass();
                    ou6 ou6VarI0 = t1c.i0(ou6VarW);
                    Integer numValueOf2 = Integer.valueOf(i3);
                    Integer numValueOf3 = Integer.valueOf(iH);
                    boolean zH = dd4Var10.h(zlbVar) | dd4Var10.h(vx1Var2) | dd4Var10.f(a07Var11) | dd4Var10.d(i3) | dd4Var10.f(a07Var12) | dd4Var10.d(iH);
                    Object objQ12 = dd4Var10.Q();
                    if (zH || objQ12 == obj4) {
                        a07Var2 = a07Var13;
                        a07Var3 = a07Var15;
                        objQ12 = new wma(zlbVar, a07Var2, vx1Var2, i3, a07Var11, a07Var3, iH, a07Var12);
                        dd4Var10.p0(objQ12);
                    } else {
                        a07Var2 = a07Var13;
                        a07Var3 = a07Var15;
                    }
                    ou6 ou6VarC = r1a.c(ou6VarI0, numValueOf2, numValueOf3, (PointerInputEventHandler) objQ12);
                    xf0 xf0Var = bv4.b;
                    ha6 ha6VarD = pn0.d(xf0Var, false);
                    int iHashCode7 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL7 = dd4Var10.l();
                    ou6 ou6VarL09 = s32.L0(dd4Var10, ou6VarC);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var3);
                    } else {
                        dd4Var10.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var10, ha6VarD);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var10, lr7VarL7);
                    Integer numValueOf4 = Integer.valueOf(iHashCode7);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var10, numValueOf4);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var10, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var10, ou6VarL09);
                    br9 br9VarB = bx1.B(joaVar3.w, dd4Var10);
                    a07 a07VarB = bx1.B(joaVar3.y, dd4Var10);
                    Object objQ13 = dd4Var10.Q();
                    if (objQ13 == obj4) {
                        objQ13 = dk9.x(Float.valueOf(0.0f));
                        dd4Var10.p0(objQ13);
                    }
                    a07 a07Var16 = (a07) objQ13;
                    boolean zG = dd4Var10.g(((ana) br9VarB.getValue()).b);
                    Object objQ14 = dd4Var10.Q();
                    if (zG || objQ14 == obj4) {
                        joaVar = joaVar3;
                        objQ14 = lc5.a(((Number) a07Var16.getValue()).floatValue(), 0.01f);
                        dd4Var10.p0(objQ14);
                    } else {
                        joaVar = joaVar3;
                    }
                    ym ymVar = (ym) objQ14;
                    Boolean boolValueOf = Boolean.valueOf(((ana) br9VarB.getValue()).b);
                    boolean zF7 = dd4Var10.f(br9VarB) | dd4Var10.h(ymVar);
                    Object objQ15 = dd4Var10.Q();
                    jt1 jt1Var = null;
                    if (zF7 || objQ15 == obj4) {
                        br9Var2 = br9VarB;
                        objQ15 = new lq8(ymVar, br9Var2, a07Var16, jt1Var, 26);
                        dd4Var10.p0(objQ15);
                    } else {
                        br9Var2 = br9VarB;
                    }
                    lc5.u((yb4) objQ15, dd4Var10, boolValueOf);
                    wf0 wf0Var2 = bv4.x;
                    dd4Var10.f0(1419539757);
                    za9Var.getClass();
                    ou6 ou6VarW2 = t96.w(za9.e(za9Var, lu6Var, za9.d("tts_container", dd4Var10), coVar2), rp8Var);
                    long j3 = ((q96) dd4Var10.j(ur9Var2)).a.p;
                    lp4 lp4Var = jf0.G;
                    ou6 ou6VarW3 = t96.w(gjb.l0(fe.L(ou6VarW2, j3, lp4Var), 3.0f), rp8Var);
                    dd4Var10.q(false);
                    eq8 eq8VarA3 = dq8.a(pv.a, wf0Var2, dd4Var10, 48);
                    int iHashCode8 = Long.hashCode(dd4Var10.T);
                    lr7 lr7VarL8 = dd4Var10.l();
                    ou6 ou6VarL010 = s32.L0(dd4Var10, ou6VarW3);
                    dd4Var10.j0();
                    if (dd4Var10.S) {
                        dd4Var10.k(um1Var3);
                    } else {
                        dd4Var10.s0();
                    }
                    un9.s(jmVar5, dd4Var10, eq8VarA3);
                    un9.s(jmVar6, dd4Var10, lr7VarL8);
                    ky0.v(iHashCode8, dd4Var10, jmVar7, dd4Var10, kdVar2);
                    un9.s(jmVar8, dd4Var10, ou6VarL010);
                    dd4Var10.f0(-242680069);
                    String str4 = ((gna) br9Var.getValue()).a;
                    String str5 = ((gna) br9Var.getValue()).b;
                    String str6 = ((gna) br9Var.getValue()).f;
                    String str7 = ((gna) br9Var.getValue()).e;
                    qr1 qr1Var2 = ra1.d;
                    ou6 ou6VarI02 = sw1.i0(t96.w(za9.f(za9Var, tg9.n(lu6Var, 44.0f), za9.d("tts_cover", dd4Var10), coVar2), rp8Var), ((Number) ymVar.d()).floatValue());
                    final joa joaVar4 = joaVar;
                    boolean zH2 = dd4Var10.h(vx1Var2) | dd4Var10.f(a07Var11) | dd4Var10.d(i3) | dd4Var10.f(joaVar4);
                    Object objQ16 = dd4Var10.Q();
                    if (zH2 || objQ16 == obj4) {
                        final int i5 = 0;
                        objQ16 = new ib4() { // from class: nma
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i6 = i5;
                                heb hebVar3 = heb.a;
                                vx1 vx1Var3 = vx1Var2;
                                joa joaVar5 = joaVar4;
                                switch (i6) {
                                    case 0:
                                        a07 a07Var17 = a07Var2;
                                        if (!((Boolean) a07Var17.getValue()).booleanValue()) {
                                            joaVar5.getClass();
                                            qtb.h(joaVar5, vtb.a(joaVar5), new eoa(joaVar5, null, 3));
                                        } else {
                                            ah1.J(vx1Var3, null, null, new j47(false, i3, a07Var11, a07Var3, a07Var17, null), 3);
                                        }
                                        break;
                                    default:
                                        a07 a07Var18 = a07Var2;
                                        if (!((Boolean) a07Var18.getValue()).booleanValue()) {
                                            joaVar5.getClass();
                                            qtb.h(joaVar5, vtb.a(joaVar5), new eoa(joaVar5, null, 3));
                                        } else {
                                            ah1.J(vx1Var3, null, null, new j47(false, i3, a07Var11, a07Var3, a07Var18, null), 3);
                                        }
                                        break;
                                }
                                return hebVar3;
                            }
                        };
                        a07Var4 = a07Var2;
                        vx1Var = vx1Var2;
                        i = i3;
                        a07Var5 = a07Var11;
                        a07Var6 = a07Var3;
                        qr1Var = qr1Var2;
                        joaVar2 = joaVar4;
                        dd4Var10.p0(objQ16);
                    } else {
                        a07Var5 = a07Var11;
                        a07Var4 = a07Var2;
                        vx1Var = vx1Var2;
                        i = i3;
                        a07Var6 = a07Var3;
                        qr1Var = qr1Var2;
                        joaVar2 = joaVar4;
                    }
                    final vx1 vx1Var3 = vx1Var;
                    w05.c(str4, str5, str6, str7, qr1Var, fw.J(null, (ib4) objQ16, ou6VarI02, false, 15), dd4Var10, 24576);
                    qr1 qr1Var3 = qr1Var;
                    ky0.A(dd4Var10, false, lu6Var, 4.0f, dd4Var10);
                    dd4Var10.f0(-242640123);
                    boolean z2 = ((ana) br9Var2.getValue()).a;
                    boolean z3 = ((ana) br9Var2.getValue()).b;
                    boolean z4 = ((ana) br9Var2.getValue()).c;
                    int i6 = ((sna) a07VarB.getValue()).a;
                    ou6 ou6VarW4 = t96.w(za9.f(za9Var, tg9.n(lu6Var, 40.0f), za9.d("tts_play", dd4Var10), coVar2), rp8Var);
                    boolean zF8 = dd4Var10.f(joaVar2);
                    Object objQ17 = dd4Var10.Q();
                    if (zF8 || objQ17 == obj4) {
                        objQ17 = new jma(joaVar2, 15);
                        dd4Var10.p0(objQ17);
                    }
                    zma.e(z2, z3, z4, i6, ou6VarW4, (ib4) objQ17, dd4Var10, 0);
                    ky0.A(dd4Var10, false, lu6Var, 2.0f, dd4Var10);
                    p35 p35VarC = i25.c((m53) a53.W.getValue(), dd4Var10, 0);
                    long j4 = ((q96) dd4Var10.j(ur9Var2)).a.q;
                    ou6 ou6VarW5 = t96.w(tg9.n(lu6Var, 36.0f), rp8Var);
                    boolean zF9 = dd4Var10.f(joaVar2);
                    Object objQ18 = dd4Var10.Q();
                    if (zF9 || objQ18 == obj4) {
                        objQ18 = new jma(joaVar2, 16);
                        dd4Var10.p0(objQ18);
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ18, ou6VarW5, false, 15), 4.0f), j4, dd4Var10, 48, 0);
                    un9.a(dd4Var10, tg9.r(lu6Var, 2.0f));
                    p35 p35VarC2 = i25.c((m53) a53.w.getValue(), dd4Var10, 0);
                    long j5 = ((q96) dd4Var10.j(ur9Var2)).a.q;
                    ou6 ou6VarW6 = t96.w(tg9.n(lu6Var, 32.0f), rp8Var);
                    boolean zF10 = dd4Var10.f(joaVar2);
                    Object objQ19 = dd4Var10.Q();
                    if (zF10 || objQ19 == obj4) {
                        objQ19 = new jma(joaVar2, 17);
                        dd4Var10.p0(objQ19);
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ19, ou6VarW6, false, 15), 4.0f), j5, dd4Var10, 48, 0);
                    un9.a(dd4Var10, tg9.r(lu6Var, 4.0f));
                    dd4Var10.q(true);
                    if (((Boolean) a07Var4.getValue()).booleanValue()) {
                        dd4Var10.f0(1059978064);
                        ou6 ou6VarW7 = t96.w(zn0.a.a(gjb.l0(fe.L(t96.w(lu6Var, rp8Var), ((q96) dd4Var10.j(ur9Var2)).a.p, lp4Var), 3.0f), zma.j(a07Var5) < 0.0f ? bv4.s : bv4.e), rp8Var);
                        ha6 ha6VarD2 = pn0.d(xf0Var, false);
                        int iHashCode9 = Long.hashCode(dd4Var10.T);
                        lr7 lr7VarL9 = dd4Var10.l();
                        ou6 ou6VarL011 = s32.L0(dd4Var10, ou6VarW7);
                        dd4Var10.j0();
                        if (dd4Var10.S) {
                            dd4Var10.k(um1Var3);
                        } else {
                            dd4Var10.s0();
                        }
                        un9.s(jmVar5, dd4Var10, ha6VarD2);
                        un9.s(jmVar6, dd4Var10, lr7VarL9);
                        ky0.v(iHashCode9, dd4Var10, jmVar7, dd4Var10, kdVar2);
                        un9.s(jmVar8, dd4Var10, ou6VarL011);
                        String str8 = ((gna) br9Var.getValue()).a;
                        String str9 = ((gna) br9Var.getValue()).b;
                        String str10 = ((gna) br9Var.getValue()).f;
                        String str11 = ((gna) br9Var.getValue()).e;
                        ou6 ou6VarI03 = sw1.i0(t96.w(tg9.n(lu6Var, 44.0f), rp8Var), ((Number) ymVar.d()).floatValue());
                        final a07 a07Var17 = a07Var5;
                        final int i7 = i;
                        boolean zH3 = dd4Var10.h(vx1Var3) | dd4Var10.f(a07Var17) | dd4Var10.d(i7) | dd4Var10.f(joaVar2);
                        Object objQ20 = dd4Var10.Q();
                        if (zH3 || objQ20 == obj4) {
                            final int i8 = 1;
                            final joa joaVar5 = joaVar2;
                            final a07 a07Var18 = a07Var4;
                            final a07 a07Var19 = a07Var6;
                            objQ20 = new ib4() { // from class: nma
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i62 = i8;
                                    heb hebVar3 = heb.a;
                                    vx1 vx1Var32 = vx1Var3;
                                    joa joaVar52 = joaVar5;
                                    switch (i62) {
                                        case 0:
                                            a07 a07Var172 = a07Var18;
                                            if (!((Boolean) a07Var172.getValue()).booleanValue()) {
                                                joaVar52.getClass();
                                                qtb.h(joaVar52, vtb.a(joaVar52), new eoa(joaVar52, null, 3));
                                            } else {
                                                ah1.J(vx1Var32, null, null, new j47(false, i7, a07Var17, a07Var19, a07Var172, null), 3);
                                            }
                                            break;
                                        default:
                                            a07 a07Var182 = a07Var18;
                                            if (!((Boolean) a07Var182.getValue()).booleanValue()) {
                                                joaVar52.getClass();
                                                qtb.h(joaVar52, vtb.a(joaVar52), new eoa(joaVar52, null, 3));
                                            } else {
                                                ah1.J(vx1Var32, null, null, new j47(false, i7, a07Var17, a07Var19, a07Var182, null), 3);
                                            }
                                            break;
                                    }
                                    return hebVar3;
                                }
                            };
                            dd4Var10.p0(objQ20);
                        }
                        w05.c(str8, str9, str10, str11, qr1Var3, fw.J(null, (ib4) objQ20, ou6VarI03, false, 15), dd4Var10, 24576);
                        dd4Var = dd4Var10;
                        z = true;
                        dd4Var.q(true);
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var10;
                        z = true;
                        dd4Var.f0(1061224481);
                        dd4Var.q(false);
                    }
                    dd4Var.q(z);
                }
                break;
        }
        return hebVar2;
    }

    public /* synthetic */ el0(pi2 pi2Var, v54 v54Var, pj7 pj7Var, szb szbVar, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var) {
        this.a = 2;
        this.b = pi2Var;
        this.s = v54Var;
        this.c = pj7Var;
        this.d = szbVar;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.t = ib4Var;
    }

    public /* synthetic */ el0(onb onbVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6) {
        this.a = 7;
        this.b = onbVar;
        this.e = kb4Var;
        this.f = kb4Var2;
        this.t = kb4Var3;
        this.c = kb4Var4;
        this.d = kb4Var5;
        this.s = kb4Var6;
    }

    public /* synthetic */ el0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.s = obj4;
        this.e = obj5;
        this.f = obj6;
        this.t = obj7;
    }

    public /* synthetic */ el0(String str, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5) {
        this.a = 6;
        this.b = str;
        this.e = kb4Var;
        this.c = yb4Var;
        this.f = kb4Var2;
        this.t = kb4Var3;
        this.d = kb4Var4;
        this.s = kb4Var5;
    }
}
