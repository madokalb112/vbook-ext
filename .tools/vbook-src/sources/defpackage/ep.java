package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ep {
    public static final xl7 a;

    static {
        lc3 lc3Var = lc3.a;
        a = new xl7(lc3Var, lc3Var);
    }

    public static final void a(bp bpVar, List list, dd4 dd4Var, int i) {
        dd4Var.h0(-1794596951);
        int i2 = (i & 6) == 0 ? (dd4Var.f(bpVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(list) ? 32 : 16;
        }
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ap apVar = (ap) list.get(i4);
                zb4 zb4Var = (zb4) apVar.a;
                int i5 = apVar.b;
                int i6 = apVar.c;
                Object objQ = dd4Var.Q();
                if (objQ == vl1.a) {
                    objQ = ef.d;
                    dd4Var.p0(objQ);
                }
                ha6 ha6Var = (ha6) objQ;
                int iHashCode = Long.hashCode(dd4Var.T);
                lr7 lr7VarL = dd4Var.l();
                ou6 ou6VarL0 = s32.L0(dd4Var, lu6.a);
                ml1.k.getClass();
                um1 um1Var = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, ha6Var);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                zb4Var.c(bpVar.i(i5, i6).b, dd4Var, 0);
                dd4Var.q(true);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6(bpVar, list, i, i3);
        }
    }
}
