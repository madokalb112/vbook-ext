package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qt6 implements ac4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ kb4 d;

    public qt6(List list, String str, float f, kb4 kb4Var) {
        this.a = list;
        this.b = str;
        this.c = f;
        this.d = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        dr5 dr5Var = (dr5) obj;
        int iIntValue = ((Number) obj2).intValue();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dd4Var.f(dr5Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dd4Var.d(iIntValue) ? 32 : 16;
        }
        if (dd4Var.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            kra kraVar = (kra) this.a.get(iIntValue);
            dd4Var.f0(-886097280);
            boolean zQ = lc5.Q(kraVar.a, this.b);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarA = dr5.a(dr5Var, lu6Var);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarA);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            ou6 ou6VarN = tg9.n(lu6Var, this.c);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            kb4 kb4Var = this.d;
            boolean zF = dd4Var.f(kb4Var) | dd4Var.h(kraVar);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF || objQ == obj5) {
                z = zQ;
                objQ = new e7(22, kb4Var, kraVar);
                dd4Var.p0(objQ);
            } else {
                z = zQ;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            long jG = dd1.g(((q96) dd4Var.j(s96.a)).a, z ? 6.0f : 2.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarW2 = t96.w(gjb.l0(fe.L(ou6VarJ, jG, lp4Var), 6.0f), rp8Var);
            boolean zF2 = dd4Var.f(kraVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj5) {
                objQ2 = new lc1(kf0.H(kraVar.b));
                dd4Var.p0(objQ2);
            }
            ou6 ou6VarL = fe.L(ou6VarW2, ((lc1) objQ2).a, lp4Var);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            if (z) {
                dd4Var.f0(209001405);
                z2 = false;
                mx4.a(i25.c((m53) a53.v.getValue(), dd4Var, 0), (String) null, zn0.a.a(tg9.n(lu6Var, 24.0f), bv4.f), lc1.e, dd4Var, 3120, 0);
                dd4Var.q(false);
            } else {
                z2 = false;
                dd4Var.f0(209464700);
                dd4Var.q(false);
            }
            tw2.x(dd4Var, true, true, z2);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}
