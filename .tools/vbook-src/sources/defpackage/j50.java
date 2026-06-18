package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class j50 implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;

    public /* synthetic */ j50(boolean z, float f, List list, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var) {
        this.b = z;
        this.c = f;
        this.f = list;
        this.d = kb4Var;
        this.s = kb4Var2;
        this.e = ib4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        boolean z;
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.s;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ib4 ib4Var = (ib4) obj4;
                ib4 ib4Var2 = (ib4) ub4Var;
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                wf0 wf0Var = bv4.x;
                rp8 rp8Var = tp8.a;
                lu6 lu6Var = lu6.a;
                ou6 ou6VarL0 = gjb.l0(yn2.y(dd4Var, t96.w(lu6Var, rp8Var)), 4.0f);
                iv ivVar = pv.a;
                eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 48);
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
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
                un9.s(jmVar4, dd4Var, ou6VarL02);
                boolean z2 = this.b;
                p35 p35VarC = i25.c(z2 ? (m53) f53.T.getValue() : (m53) f53.X.getValue(), dd4Var, 0);
                ou6 ou6VarW = t96.w(tg9.n(lu6Var, 32.0f), rp8Var);
                long jC = lc1.c(0.95f, dd1.g(s00.o(dd4Var), 4.0f));
                lp4 lp4Var = jf0.G;
                ou6 ou6VarL = fe.L(ou6VarW, jC, lp4Var);
                boolean zG = dd4Var.g(z2);
                ib4 ib4Var3 = this.e;
                boolean zF = zG | dd4Var.f(ib4Var3) | dd4Var.f(ib4Var);
                Object objQ = dd4Var.Q();
                Object obj5 = vl1.a;
                if (zF || objQ == obj5) {
                    objQ = new no(z2, ib4Var3, ib4Var, 1);
                    dd4Var.p0(objQ);
                }
                mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 6.0f), s00.o(dd4Var).q, dd4Var, 48, 0);
                un9.a(dd4Var, tg9.r(lu6Var, 6.0f));
                float f3 = this.c;
                boolean zC = dd4Var.c(f3);
                Object objQ2 = dd4Var.Q();
                if (zC || objQ2 == obj5) {
                    objQ2 = dk9.x(Float.valueOf(f3));
                    dd4Var.p0(objQ2);
                }
                a07 a07Var = (a07) objQ2;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                    f = Float.MAX_VALUE;
                } else {
                    f = Float.MAX_VALUE;
                    f2 = 1.0f;
                }
                ou6 ou6VarL2 = fe.L(new bp5(f2, true), lc1.c(0.95f, dd1.g(s00.o(dd4Var), 4.0f)), rp8Var);
                eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarL2);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA2);
                un9.s(jmVar2, dd4Var, lr7VarL2);
                dx1.r(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL03);
                ou6 ou6VarH = tg9.h(t96.w(lu6Var, rp8Var), 32.0f);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                ou6 ou6VarN0 = gjb.n0(ou6VarH.e(new bp5(1.0f > f ? f : 1.0f, true)), 8.0f, 0.0f, 2);
                vh9 vh9Var = vh9.a;
                rh9 rh9VarD = vh9.d(s00.o(dd4Var).q, s00.o(dd4Var).q, lc1.c(0.2f, s00.o(dd4Var).q), dd4Var, 1012);
                float fFloatValue = ((Number) a07Var.getValue()).floatValue();
                bb1 bb1Var = new bb1(0.1f, 5.0f);
                boolean zF2 = dd4Var.f(a07Var);
                Object objQ3 = dd4Var.Q();
                if (zF2 || objQ3 == obj5) {
                    objQ3 = new x6(a07Var, 2);
                    dd4Var.p0(objQ3);
                }
                kb4 kb4Var = (kb4) objQ3;
                kb4 kb4Var2 = this.d;
                boolean zF3 = dd4Var.f(kb4Var2) | dd4Var.f(a07Var);
                Object objQ4 = dd4Var.Q();
                if (zF3 || objQ4 == obj5) {
                    objQ4 = new l50(0, kb4Var2, a07Var);
                    dd4Var.p0(objQ4);
                }
                yb0.u(fFloatValue, kb4Var, ou6VarN0, false, (ib4) objQ4, rh9VarD, null, 0, null, null, bb1Var, dd4Var, 0, 0, 968);
                nha.c(tn9.i("%.1f", new Object[]{Float.valueOf(((Number) a07Var.getValue()).floatValue())}), gjb.p0(lu6Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 48, 0, 131064);
                dd4Var.q(true);
                un9.a(dd4Var, tg9.r(lu6Var, 6.0f));
                p35 p35VarC2 = i25.c((m53) a53.w.getValue(), dd4Var, 0);
                ou6 ou6VarL3 = fe.L(t96.w(tg9.n(lu6Var, 32.0f), rp8Var), lc1.c(0.95f, dd1.g(s00.o(dd4Var), 4.0f)), lp4Var);
                boolean zF4 = dd4Var.f(ib4Var2);
                Object objQ5 = dd4Var.Q();
                if (zF4 || objQ5 == obj5) {
                    z = false;
                    objQ5 = new m50(0, ib4Var2);
                    dd4Var.p0(objQ5);
                } else {
                    z = false;
                }
                mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ5, ou6VarL3, z, 15), 6.0f), s00.o(dd4Var).q, dd4Var, 48, 0);
                dd4Var.q(true);
                break;
            default:
                List list = (List) obj4;
                kb4 kb4Var3 = (kb4) ub4Var;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    vw1.q(this.b, this.c, list, gjb.l0(yib.B(tg9.f(lu6.a, 1.0f), 14), 24.0f), this.d, kb4Var3, this.e, dd4Var2, 0);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ j50(boolean z, ib4 ib4Var, ib4 ib4Var2, float f, ib4 ib4Var3, kb4 kb4Var) {
        this.b = z;
        this.e = ib4Var;
        this.f = ib4Var2;
        this.c = f;
        this.s = ib4Var3;
        this.d = kb4Var;
    }
}
