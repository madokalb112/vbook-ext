package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class mb0 {
    public static final ur9 a = new ur9(new qv(27));

    public static final void a(boolean z, ib4 ib4Var, dd4 dd4Var, int i, int i2) {
        int i3;
        boolean z2;
        ib4Var.getClass();
        dd4Var.h0(-1457805704);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (dd4Var.g(z) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z;
            uf2 uf2Var = (uf2) dd4Var.j(a);
            a07 a07VarA = dk9.A(ib4Var, dd4Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zF = dd4Var.f(a07VarA) | ((i3 & 14) == 4) | dd4Var.h(uf2Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new gb0(z3, uf2Var, a07VarA, i5);
                dd4Var.p0(objQ);
            }
            lc5.k(boolValueOf, uf2Var, (kb4) objQ, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new qv(26);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ2, dd4Var, 48);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new x6(a07Var, 3);
                dd4Var.p0(objQ3);
            }
            lx1.g(heb.a, null, (kb4) objQ3, dd4Var, 6);
            if (((Boolean) a07Var.getValue()).booleanValue()) {
                dd4Var.f0(1220253336);
                fw.z(z3, ib4Var, dd4Var, i3 & Token.ELSE);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1220301386);
                dd4Var.q(false);
            }
            z2 = z3;
        } else {
            dd4Var.Y();
            z2 = z;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ib0(z2, ib4Var, i, i2, 0);
        }
    }
}
