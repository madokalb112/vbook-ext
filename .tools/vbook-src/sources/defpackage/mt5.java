package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class mt5 {
    public static final /* synthetic */ int a = 0;

    static {
        new a22(0.5f, 0.5f, 1.0f, 0.25f);
    }

    public static final void a(final ou6 ou6Var, final int i, st5 st5Var, pj7 pj7Var, kv kvVar, wf0 wf0Var, s04 s04Var, boolean z, final kb4 kb4Var, dd4 dd4Var, final int i2, final int i3) {
        ou6 ou6Var2;
        int i4;
        kv kvVar2;
        final pj7 pj7Var2;
        final wf0 wf0Var2;
        final s04 s04Var2;
        final boolean z2;
        final kv kvVar3;
        final st5 st5Var2;
        kv kvVar4;
        s04 s04Var3;
        st5 st5Var3;
        wf0 wf0Var3;
        int i5;
        pj7 pj7Var3;
        boolean z3;
        int i6;
        kb4Var.getClass();
        dd4Var.h0(1060543493);
        if ((i2 & 6) == 0) {
            ou6Var2 = ou6Var;
            i4 = (dd4Var.f(ou6Var2) ? 4 : 2) | i2;
        } else {
            ou6Var2 = ou6Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= Token.CASE;
        }
        int i7 = i4 | 27648;
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                kvVar2 = kvVar;
                if (dd4Var.f(kvVar2)) {
                    i6 = 131072;
                }
                i7 |= i6;
            } else {
                kvVar2 = kvVar;
            }
            i6 = Parser.ARGC_LIMIT;
            i7 |= i6;
        } else {
            kvVar2 = kvVar;
        }
        int i8 = 1572864 | i7;
        if ((12582912 & i2) == 0) {
            i8 = 5767168 | i7;
        }
        int i9 = 100663296 | i8;
        if ((805306368 & i2) == 0) {
            i9 |= dd4Var.h(kb4Var) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i9 & 1, (306783379 & i9) != 306783378)) {
            dd4Var.a0();
            int i10 = i2 & 1;
            fu6 fu6Var = vl1.a;
            if (i10 == 0 || dd4Var.C()) {
                st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
                int i11 = i9 & (-897);
                pj7 rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
                if ((i3 & 32) != 0) {
                    i11 = i9 & (-459649);
                    kvVar4 = pv.a;
                } else {
                    kvVar4 = kvVar2;
                }
                wf0 wf0Var4 = bv4.w;
                od2 od2VarA = fp9.a(dd4Var);
                boolean zF = dd4Var.f(od2VarA);
                Object objQ = dd4Var.Q();
                if (zF || objQ == fu6Var) {
                    objQ = new ug2(od2VarA);
                    dd4Var.p0(objQ);
                }
                s04Var3 = (ug2) objQ;
                kvVar2 = kvVar4;
                st5Var3 = st5VarA;
                wf0Var3 = wf0Var4;
                i5 = i11 & (-29360129);
                pj7Var3 = rj7Var;
                z3 = true;
            } else {
                dd4Var.Y();
                int i12 = i9 & (-897);
                if ((i3 & 32) != 0) {
                    i12 = i9 & (-459649);
                }
                int i13 = i12 & (-29360129);
                pj7Var3 = pj7Var;
                wf0Var3 = wf0Var;
                s04Var3 = s04Var;
                z3 = z;
                i5 = i13;
                st5Var3 = st5Var;
            }
            dd4Var.r();
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            if (i > 0) {
                dd4Var.f0(872420814);
                Integer numValueOf = Integer.valueOf(i);
                boolean zF2 = dd4Var.f(st5Var3) | ((i5 & Token.ASSIGN_MOD) == 32);
                Object objQ3 = dd4Var.Q();
                if (zF2 || objQ3 == fu6Var) {
                    objQ3 = new pc(st5Var3, i, a07Var, (jt1) null, 8);
                    dd4Var.p0(objQ3);
                }
                lc5.u((yb4) objQ3, dd4Var, numValueOf);
                dd4Var.q(false);
            } else {
                dd4Var.f0(872681245);
                dd4Var.q(false);
            }
            int i14 = i5 >> 3;
            int i15 = (i5 & 14) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 29360128) | (1879048192 & i5);
            kv kvVar5 = kvVar2;
            boolean z4 = z3;
            rw1.k(ou6Var2, st5Var3, pj7Var3, false, kvVar5, wf0Var3, s04Var3, z4, null, kb4Var, dd4Var, i15, 256);
            st5Var2 = st5Var3;
            z2 = z4;
            s04Var2 = s04Var3;
            wf0Var2 = wf0Var3;
            kvVar3 = kvVar5;
            pj7Var2 = pj7Var3;
        } else {
            dd4Var.Y();
            pj7Var2 = pj7Var;
            wf0Var2 = wf0Var;
            s04Var2 = s04Var;
            z2 = z;
            kvVar3 = kvVar2;
            st5Var2 = st5Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ft5
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mt5.a(ou6Var, i, st5Var2, pj7Var2, kvVar3, wf0Var2, s04Var2, z2, kb4Var, (dd4) obj, qu1.x0(i2 | 1), i3);
                    return heb.a;
                }
            };
        }
    }

    public static final void b(wq5 wq5Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        wq5Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1793805503);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(wq5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.n(new br5(wq5Var, 4));
                dd4Var.p0(objQ);
            }
            br9 br9Var = (br9) objQ;
            a07 a07VarA = dk9.A(ib4Var, dd4Var);
            boolean zF = dd4Var.f(a07VarA);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ht5(br9Var, a07VarA, null, i4);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, br9Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) wq5Var, false, (Object) ib4Var, i, 12);
        }
    }

    public static final void c(st5 st5Var, int i, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        st5Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-232140567);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(st5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        int i6 = 0;
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            if (i5 != 0) {
                i = 0;
            }
            if (i < 0) {
                gp.k(dx1.f(i, "buffer cannot be negative, but was "));
                return;
            }
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.n(new ct5(st5Var, i, 0));
                dd4Var.p0(objQ);
            }
            br9 br9Var = (br9) objQ;
            a07 a07VarA = dk9.A(ib4Var, dd4Var);
            boolean zF = dd4Var.f(a07VarA);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ht5(br9Var, a07VarA, null, i6);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, br9Var);
        } else {
            dd4Var.Y();
        }
        int i7 = i;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iq2(st5Var, i7, ib4Var, i2, i3, 1);
        }
    }

    public static final void d(uu5 uu5Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        uu5Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-1501209385);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(uu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.n(new gt5(uu5Var, 0));
                dd4Var.p0(objQ);
            }
            br9 br9Var = (br9) objQ;
            a07 a07VarA = dk9.A(ib4Var, dd4Var);
            boolean zF = dd4Var.f(a07VarA);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ht5(br9Var, a07VarA, null, i3);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, br9Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) uu5Var, false, (Object) ib4Var, i, 11);
        }
    }

    public static final st5 e(int i, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        int i4 = i3 & 8;
        Object obj = vl1.a;
        if (i4 != 0) {
            Object objQ = dd4Var.Q();
            if (objQ == obj) {
                objQ = new ua5(23);
                dd4Var.p0(objQ);
            }
            ib4Var = (ib4) objQ;
        }
        a07 a07VarA = dk9.A(ib4Var, dd4Var);
        st5 st5VarA = ut5.a(i, dd4Var, i2 & Token.ELSE, 0);
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj) {
            objQ2 = dk9.n(new e51(st5VarA, 6));
            dd4Var.p0(objQ2);
        }
        br9 br9Var = (br9) objQ2;
        boolean zF = dd4Var.f(a07VarA);
        Object objQ3 = dd4Var.Q();
        if (zF || objQ3 == obj) {
            objQ3 = new ht5(br9Var, a07VarA, null, 3);
            dd4Var.p0(objQ3);
        }
        lc5.u((yb4) objQ3, dd4Var, br9Var);
        return st5VarA;
    }
}
