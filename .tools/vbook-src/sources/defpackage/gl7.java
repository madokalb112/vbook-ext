package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gl7 implements zb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ib4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;
    public final /* synthetic */ ub4 t;
    public final /* synthetic */ ub4 u;
    public final /* synthetic */ ub4 v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ gl7(ib4 ib4Var, boolean z, kb4 kb4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, ib4 ib4Var5, ib4 ib4Var6, ib4 ib4Var7, String str, String str2) {
        this.b = ib4Var;
        this.c = z;
        this.d = kb4Var;
        this.e = ib4Var2;
        this.f = ib4Var3;
        this.s = ib4Var4;
        this.t = ib4Var5;
        this.u = ib4Var6;
        this.v = ib4Var7;
        this.w = str;
        this.x = str2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj4 = vl1.a;
        Object obj5 = this.x;
        Object obj6 = this.w;
        ub4 ub4Var = this.v;
        ub4 ub4Var2 = this.u;
        ub4 ub4Var3 = this.t;
        ub4 ub4Var4 = this.s;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                st5 st5Var = (st5) obj8;
                List list = (List) obj7;
                yb4 yb4Var = (yb4) ub4Var4;
                yb4 yb4Var2 = (yb4) ub4Var3;
                zb4 zb4Var = (zb4) ub4Var2;
                kb4 kb4Var = (kb4) ub4Var;
                a07 a07Var = (a07) obj6;
                br9 br9Var = (br9) obj5;
                co0 co0Var = (co0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    px3 px3Var = tg9.c;
                    boolean z = !((Boolean) a07Var.getValue()).booleanValue();
                    boolean zH = dd4Var.h(list) | ((iIntValue & 14) == 4) | dd4Var.f(yb4Var) | dd4Var.f(yb4Var2) | dd4Var.f(zb4Var);
                    ib4 ib4Var = this.b;
                    boolean zF = zH | dd4Var.f(ib4Var);
                    kb4 kb4Var2 = this.d;
                    boolean zF2 = zF | dd4Var.f(kb4Var2) | dd4Var.f(kb4Var);
                    Object objQ = dd4Var.Q();
                    if (zF2 || objQ == obj4) {
                        objQ = new jl7(list, co0Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var2, kb4Var, br9Var, a07Var, 1);
                        dd4Var.p0(objQ);
                    }
                    y86.h(px3Var, st5Var, null, this.c, null, null, null, z, (kb4) objQ, dd4Var, 6, Token.COLON);
                }
                break;
            default:
                ib4 ib4Var2 = (ib4) obj8;
                ib4 ib4Var3 = (ib4) obj7;
                ib4 ib4Var4 = (ib4) ub4Var4;
                ib4 ib4Var5 = (ib4) ub4Var3;
                ib4 ib4Var6 = (ib4) ub4Var2;
                ib4 ib4Var7 = (ib4) ub4Var;
                String str = (String) obj6;
                String str2 = (String) obj5;
                dd4 dd4Var2 = (dd4) obj2;
                ((Integer) obj3).getClass();
                ((co) obj).getClass();
                lu6 lu6Var = lu6.a;
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
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
                ou6 ou6VarY = yn2.y(dd4Var2, tg9.f(lu6Var, 1.0f));
                ur9 ur9Var = s96.a;
                ou6 ou6VarM0 = gjb.m0(yib.B(fe.L(ou6VarY, lc1.c(0.95f, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 4.0f)), jf0.G), 7), 12.0f, 6.0f);
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
                dx1.r(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL02);
                qn9.b(i25.c(a53.a(), dd4Var2, 0), null, this.b, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                boolean z2 = this.c;
                p35 p35VarC = i25.c(z2 ? (m53) a53.m.getValue() : (m53) a53.l.getValue(), dd4Var2, 0);
                kb4 kb4Var3 = this.d;
                boolean zF3 = dd4Var2.f(kb4Var3) | dd4Var2.g(z2);
                Object objQ2 = dd4Var2.Q();
                if (zF3 || objQ2 == obj4) {
                    objQ2 = new ck0(19, kb4Var3, z2);
                    dd4Var2.p0(objQ2);
                }
                qn9.b(p35VarC, null, (ib4) objQ2, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) h53.f.getValue(), dd4Var2, 0), null, ib4Var2, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), null, ib4Var3, dd4Var2, 0, 2);
                bp5 bp5Var = new bp5(1.0f, true);
                ie1 ie1VarA2 = ge1.a(pv.e, bv4.A, dd4Var2, 54);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, ie1VarA2);
                un9.s(jmVar2, dd4Var2, lr7VarL3);
                dx1.r(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL03);
                nha.c(str, tg9.f(lu6Var, 1.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, wn9.x(14), (t74) null, a84.w, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var2, 1597488, 24960, 240552);
                nha.c(str2, tg9.f(lu6Var, 1.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, wn9.x(12), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, (uka) null, dd4Var2, 24624, 24960, 240616);
                dd4Var2.q(true);
                qn9.b(i25.c(f53.c(), dd4Var2, 0), null, ib4Var4, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) f53.g.getValue(), dd4Var2, 0), null, ib4Var5, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) f53.m0.getValue(), dd4Var2, 0), null, ib4Var6, dd4Var2, 0, 2);
                un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
                qn9.b(i25.c((m53) f53.J.getValue(), dd4Var2, 0), null, ib4Var7, dd4Var2, 0, 2);
                dd4Var2.q(true);
                y86.c(0.0f, 6, 2, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f), dd4Var2, tg9.f(lu6Var, 1.0f));
                dd4Var2.q(true);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ gl7(st5 st5Var, boolean z, List list, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var, br9 br9Var) {
        this.e = st5Var;
        this.c = z;
        this.f = list;
        this.s = yb4Var;
        this.t = yb4Var2;
        this.u = zb4Var;
        this.b = ib4Var;
        this.d = kb4Var;
        this.v = kb4Var2;
        this.w = a07Var;
        this.x = br9Var;
    }
}
