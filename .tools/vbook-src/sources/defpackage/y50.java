package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class y50 {
    public static final List a = gc1.Z(new lc1(ah1.j(855638016)), new lc1(ah1.j(0)));
    public static final float b = 15.0f;

    public static final void a(z50 z50Var, sw8 sw8Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        ou6Var.getClass();
        dd4Var.h0(-1958290971);
        int i2 = i | (dd4Var.f(z50Var) ? 4 : 2) | (dd4Var.f(sw8Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        int i3 = 1;
        int i4 = 0;
        if (!dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            dd4Var.Y();
        } else if (((Boolean) z50Var.e.getValue()).booleanValue()) {
            dd4Var.f0(-905279617);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new qv(21);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new qv(23);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Boolean bool = (Boolean) a07Var.getValue();
            bool.booleanValue();
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new r50(a07Var2, a07Var, null, i4);
                dd4Var.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var, bool);
            px3 px3Var = tg9.c;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, px3Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            if (z50Var.d()) {
                dd4Var.f0(31204780);
                boolean zF2 = dd4Var.f(a07Var);
                Object objQ4 = dd4Var.Q();
                if (zF2 || objQ4 == obj) {
                    objQ4 = new ik(a07Var, i3);
                    dd4Var.p0(objQ4);
                }
                c(z50Var, ou6Var, (ib4) objQ4, dd4Var, (i2 & 14) | 48);
                dd4Var.q(false);
            } else {
                dd4Var.f0(31482323);
                boolean zF3 = dd4Var.f(a07Var);
                Object objQ5 = dd4Var.Q();
                if (zF3 || objQ5 == obj) {
                    objQ5 = new ik(a07Var, 3);
                    dd4Var.p0(objQ5);
                }
                b(z50Var, sw8Var, ou6Var, (ib4) objQ5, dd4Var, i2 & 1022);
                dd4Var.q(false);
            }
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zC = z50Var.c();
            float fFloatValue = ((Number) z50Var.h.getValue()).floatValue();
            ou6 ou6VarM0 = gjb.m0(tg9.t(yib.B(zn0.a.a(lu6.a, bv4.u), 15), 0.0f, 460.0f, 1), 24.0f, 12.0f);
            int i5 = i2 & 14;
            boolean z = (i5 == 4) | ((i2 & 7168) == 2048);
            Object objQ6 = dd4Var.Q();
            if (z || objQ6 == obj) {
                objQ6 = new v(4, z50Var, kb4Var);
                dd4Var.p0(objQ6);
            }
            kb4 kb4Var2 = (kb4) objQ6;
            boolean z2 = i5 == 4;
            Object objQ7 = dd4Var.Q();
            if (z2 || objQ7 == obj) {
                objQ7 = new p50(z50Var, 0);
                dd4Var.p0(objQ7);
            }
            ib4 ib4Var = (ib4) objQ7;
            boolean z3 = i5 == 4;
            Object objQ8 = dd4Var.Q();
            if (z3 || objQ8 == obj) {
                objQ8 = new p50(z50Var, 1);
                dd4Var.p0(objQ8);
            }
            ib4 ib4Var2 = (ib4) objQ8;
            boolean z4 = i5 == 4;
            Object objQ9 = dd4Var.Q();
            if (z4 || objQ9 == obj) {
                objQ9 = new p50(z50Var, 2);
                dd4Var.p0(objQ9);
            }
            t96.c(zBooleanValue, zC, fFloatValue, ou6VarM0, kb4Var2, ib4Var, ib4Var2, (ib4) objQ9, dd4Var, 0);
            dd4Var.q(true);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-903436419);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(z50Var, sw8Var, ou6Var, kb4Var, i, 7);
        }
    }

    public static final void b(z50 z50Var, sw8 sw8Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(1652548477);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(z50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(sw8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new e4(19);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarW = kl8.W(ou6Var, (kb4) objQ);
            boolean z = (i2 & 7168) == 2048;
            Object objQ2 = dd4Var.Q();
            if (z || objQ2 == obj) {
                objQ2 = new s50(1, ib4Var);
                dd4Var.p0(objQ2);
            }
            heb hebVar = heb.a;
            ou6 ou6VarB = r1a.b(ou6VarW, hebVar, (PointerInputEventHandler) objQ2);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new x50(z50Var, 0);
                dd4Var.p0(objQ3);
            }
            ou6 ou6VarB2 = r1a.b(ou6VarB, hebVar, (PointerInputEventHandler) objQ3);
            boolean z3 = (i3 == 4) | ((i2 & Token.ASSIGN_MOD) == 32);
            Object objQ4 = dd4Var.Q();
            if (z3 || objQ4 == obj) {
                objQ4 = new v(3, z50Var, sw8Var);
                dd4Var.p0(objQ4);
            }
            s32.F(ou6VarB2, (kb4) objQ4, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(z50Var, sw8Var, ou6Var, ib4Var, i, 0);
        }
    }

    public static final void c(z50 z50Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-1092499674);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(z50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new s50(3, ib4Var);
                dd4Var.p0(objQ);
            }
            heb hebVar = heb.a;
            ou6 ou6VarB = r1a.b(ou6Var, hebVar, (PointerInputEventHandler) objQ);
            boolean z2 = (i2 & 14) == 4;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new x50(z50Var, 1);
                dd4Var.p0(objQ2);
            }
            pn0.a(r1a.b(ou6VarB, hebVar, (PointerInputEventHandler) objQ2), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(z50Var, ou6Var, ib4Var, i, 1);
        }
    }

    public static final z50 d(boolean z, float f, st5 st5Var, sw8 sw8Var, dd4 dd4Var) {
        st5Var.getClass();
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = lc5.Z(dd4Var);
            dd4Var.p0(objQ);
        }
        vx1 vx1Var = (vx1) objQ;
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        if (z) {
            dd4Var.f0(538231492);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                vx1Var.getClass();
                pn2Var.getClass();
                objQ2 = new lmb(st5Var, vx1Var, pn2Var, 0);
                dd4Var.p0(objQ2);
            }
            lmb lmbVar = (lmb) objQ2;
            lmbVar.getClass();
            vx1Var.getClass();
            pn2Var.getClass();
            lmbVar.h.setValue(Float.valueOf(f));
            lmbVar.b = st5Var;
            lmbVar.c = vx1Var;
            lmbVar.d = pn2Var;
            dd4Var.q(false);
            return lmbVar;
        }
        dd4Var.f0(538542174);
        Object objQ3 = dd4Var.Q();
        Object obj2 = objQ3;
        if (objQ3 == obj) {
            vx1Var.getClass();
            pn2Var.getClass();
            bp4 bp4Var = new bp4(st5Var, vx1Var, pn2Var, 0);
            bp4Var.i = sw8Var;
            dd4Var.p0(bp4Var);
            obj2 = bp4Var;
        }
        bp4 bp4Var2 = (bp4) obj2;
        bp4Var2.getClass();
        vx1Var.getClass();
        pn2Var.getClass();
        bp4Var2.h.setValue(Float.valueOf(f));
        bp4Var2.b = st5Var;
        bp4Var2.i = sw8Var;
        bp4Var2.c = vx1Var;
        bp4Var2.d = pn2Var;
        dd4Var.q(false);
        return bp4Var2;
    }
}
