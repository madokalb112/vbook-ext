package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qq6 implements ac4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kb4 c;

    public qq6(kb4 kb4Var, List list, int i) {
        this.a = list;
        this.b = i;
        this.c = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        dd4 dd4Var;
        boolean z;
        dr5 dr5Var = (dr5) obj;
        int iIntValue = ((Number) obj2).intValue();
        dd4 dd4Var2 = (dd4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (dd4Var2.f(dr5Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= dd4Var2.d(iIntValue) ? 32 : 16;
        }
        if (dd4Var2.V(i & 1, (i & Token.EXPR_VOID) != 146)) {
            String str = (String) this.a.get(iIntValue);
            dd4Var2.f0(-1325648486);
            if (str.length() > 0) {
                dd4Var2.f0(-1325629267);
                boolean z2 = this.b == iIntValue;
                ou6 ou6VarH = tg9.h(lu6.a, 36.0f);
                rp8 rp8Var = tp8.a;
                ou6 ou6VarW = t96.w(ou6VarH, rp8Var);
                kb4 kb4Var = this.c;
                boolean zF = ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var2.d(iIntValue)) || (i & 48) == 32) | dd4Var2.f(kb4Var);
                Object objQ = dd4Var2.Q();
                if (zF || objQ == vl1.a) {
                    objQ = new pq6(iIntValue, kb4Var);
                    dd4Var2.p0(objQ);
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
                ur9 ur9Var = s96.a;
                ou6 ou6VarN0 = gjb.n0(fe.L(fw.G(ou6VarJ, 1.0f, lc1.c(z2 ? 0.6f : 0.1f, ((q96) dd4Var2.j(ur9Var)).a.a), rp8Var), lc1.c(z2 ? 0.3f : 0.1f, ((q96) dd4Var2.j(ur9Var)).a.a), jf0.G), 12.0f, 0.0f, 2);
                ha6 ha6VarD = pn0.d(bv4.f, false);
                int iHashCode = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL = dd4Var2.l();
                ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(ll1.f, dd4Var2, ha6VarD);
                un9.s(ll1.e, dd4Var2, lr7VarL);
                un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                un9.r(dd4Var2, ll1.h);
                un9.s(ll1.d, dd4Var2, ou6VarL0);
                z = false;
                nha.c(str, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, z2 ? a84.w : a84.t, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var2, 0, 24576, 114618);
                dd4Var = dd4Var2;
                dd4Var.q(true);
                dd4Var.q(false);
            } else {
                dd4Var = dd4Var2;
                z = false;
                dd4Var.f0(-1324445315);
                dd4Var.q(false);
            }
            dd4Var.q(z);
        } else {
            dd4Var2.Y();
        }
        return heb.a;
    }
}
