package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class noa implements zb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ ib4 f;
    public final /* synthetic */ ib4 s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ ub4 v;
    public final /* synthetic */ Object w;

    public /* synthetic */ noa(ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, boolean z, kb4 kb4Var, ib4 ib4Var5, ib4 ib4Var6, String str, String str2) {
        this.e = ib4Var;
        this.f = ib4Var2;
        this.s = ib4Var3;
        this.t = ib4Var4;
        this.b = z;
        this.c = kb4Var;
        this.u = ib4Var5;
        this.v = ib4Var6;
        this.d = str;
        this.w = str2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        ib4 ib4Var;
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Object obj4 = this.w;
        ub4 ub4Var = this.v;
        Object obj5 = this.u;
        Object obj6 = this.t;
        switch (i) {
            case 0:
                ib4 ib4Var2 = (ib4) obj6;
                ib4 ib4Var3 = (ib4) obj5;
                ib4 ib4Var4 = (ib4) ub4Var;
                String str = (String) obj4;
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                vf0 vf0Var = bv4.z;
                jv jvVar = pv.c;
                ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
                ml1.k.getClass();
                ib4 ib4Var5 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(ib4Var5);
                } else {
                    dd4Var.s0();
                }
                jm jmVar = ll1.f;
                un9.s(jmVar, dd4Var, ie1VarA);
                jm jmVar2 = ll1.e;
                un9.s(jmVar2, dd4Var, lr7VarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jm jmVar3 = ll1.g;
                un9.s(jmVar3, dd4Var, numValueOf);
                kd kdVar = ll1.h;
                un9.r(dd4Var, kdVar);
                jm jmVar4 = ll1.d;
                un9.s(jmVar4, dd4Var, ou6VarL0);
                ou6 ou6VarY = yn2.y(dd4Var, tg9.f(lu6Var, 1.0f));
                ur9 ur9Var = s96.a;
                ou6 ou6VarL02 = gjb.l0(yib.B(fe.L(ou6VarY, lc1.c(0.95f, dd1.g(((q96) dd4Var.j(ur9Var)).a, 4.0f)), jf0.G), 7), 12.0f);
                ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL02);
                dd4Var.j0();
                if (dd4Var.S) {
                    ib4Var = ib4Var5;
                    dd4Var.k(ib4Var);
                } else {
                    ib4Var = ib4Var5;
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ie1VarA2);
                un9.s(jmVar2, dd4Var, lr7VarL2);
                dx1.r(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL03);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                wf0 wf0Var = bv4.w;
                iv ivVar = pv.a;
                eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 0);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF2);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(ib4Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA);
                un9.s(jmVar2, dd4Var, lr7VarL3);
                dx1.r(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL04);
                qn9.b(i25.c(a53.a(), dd4Var, 0), null, this.f, dd4Var, 0, 2);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                un9.a(dd4Var, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                qn9.b(i25.c((m53) f53.d0.getValue(), dd4Var, 0), null, this.s, dd4Var, 0, 2);
                un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
                ib4 ib4Var6 = ib4Var;
                qn9.b(i25.c((m53) h53.f.getValue(), dd4Var, 0), null, ib4Var2, dd4Var, 0, 2);
                un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
                boolean z = this.b;
                p35 p35VarC = i25.c(z ? (m53) a53.m.getValue() : (m53) a53.l.getValue(), dd4Var, 0);
                kb4 kb4Var = this.c;
                boolean zF = dd4Var.f(kb4Var) | dd4Var.g(z);
                Object objQ = dd4Var.Q();
                Object obj7 = vl1.a;
                if (zF || objQ == obj7) {
                    objQ = new ck0(20, kb4Var, z);
                    dd4Var.p0(objQ);
                }
                qn9.b(p35VarC, null, (ib4) objQ, dd4Var, 0, 2);
                un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c(f53.c(), dd4Var, 0), null, ib4Var3, dd4Var, 0, 2);
                un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) f53.J.getValue(), dd4Var, 0), null, ib4Var4, dd4Var, 0, 2);
                dd4Var.q(true);
                un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
                ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                ib4 ib4Var7 = this.e;
                boolean zF2 = dd4Var.f(ib4Var7);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj7) {
                    objQ2 = new oda(26, ib4Var7);
                    dd4Var.p0(objQ2);
                }
                ou6 ou6VarV = yn2.V(1, (ib4) objQ2, dd4Var, ou6VarF3, false);
                ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarV);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(ib4Var6);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ie1VarA3);
                un9.s(jmVar2, dd4Var, lr7VarL4);
                dx1.r(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL05);
                nha.c(this.d, (ou6) null, ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, wn9.x(16), (t74) null, a84.w, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, (uka) null, dd4Var, 1597440, 24960, 241578);
                ou6 ou6VarF4 = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
                int iHashCode5 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL5 = dd4Var.l();
                ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarF4);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(ib4Var6);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA2);
                un9.s(jmVar2, dd4Var, lr7VarL5);
                dx1.r(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL06);
                long jX = wn9.x(14);
                long j = ((q96) dd4Var.j(ur9Var)).a.q;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                nha.c(str, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var, 24576, 24960, 240616);
                mx4.a(i25.c(f53.a(), dd4Var, 0), (String) null, tg9.n(lu6Var, 16.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, 432, 0);
                tw2.x(dd4Var, true, true, true);
                y86.c(0.0f, 6, 2, dd1.g(((q96) dd4Var.j(ur9Var)).a, 4.0f), dd4Var, tg9.f(lu6Var, 1.0f));
                dd4Var.q(true);
                break;
            default:
                final List list = (List) obj6;
                final lnb lnbVar = (lnb) obj5;
                final kb4 kb4Var2 = (kb4) ub4Var;
                final kb4 kb4Var3 = (kb4) obj4;
                co0 co0Var = (co0) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var2.V(1 & iIntValue, (iIntValue & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    ou6 ou6VarH = tg9.h(lu6Var, (co0Var.c() * 2.0f) / 3.0f);
                    long j2 = ((q96) dd4Var2.j(s96.a)).a.p;
                    final String str2 = this.d;
                    final ib4 ib4Var8 = this.e;
                    final ib4 ib4Var9 = this.f;
                    final ib4 ib4Var10 = this.s;
                    fw.q(this.b, this.c, ou6VarH, true, null, null, j2, 0L, 0.0f, 0L, null, jf0.G(337775251, new zb4() { // from class: epb
                        @Override // defpackage.zb4
                        public final Object c(Object obj8, Object obj9, Object obj10) {
                            dd4 dd4Var3 = (dd4) obj9;
                            int iIntValue2 = ((Integer) obj10).intValue();
                            ((ke1) obj8).getClass();
                            if (dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                fz1.H(str2, list, lnbVar, kb4Var2, tg9.f(lu6.a, 1.0f), null, null, ib4Var8, ib4Var9, ib4Var10, kb4Var3, dd4Var3, 24576);
                            } else {
                                dd4Var3.Y();
                            }
                            return heb.a;
                        }
                    }, dd4Var2), dd4Var2, 3072, 48, 1968);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ noa(boolean z, kb4 kb4Var, String str, List list, lnb lnbVar, kb4 kb4Var2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, kb4 kb4Var3) {
        this.b = z;
        this.c = kb4Var;
        this.d = str;
        this.t = list;
        this.u = lnbVar;
        this.v = kb4Var2;
        this.e = ib4Var;
        this.f = ib4Var2;
        this.s = ib4Var3;
        this.w = kb4Var3;
    }
}
