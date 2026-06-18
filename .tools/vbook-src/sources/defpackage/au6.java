package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class au6 {
    public static final List a = gc1.Z(4294967295L, 4294961979L, 4278248959L, 4294934699L, 4287349578L, 4294944550L);
    public static final List b = gc1.Z(0L, 4278190080L, 4282532418L, 4294967295L);

    public static final void a(int i, int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, List list) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        dd4Var2.h0(784395300);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), lp4Var), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.c0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, 0, 0, 131070);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) ev9.e0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131070);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            String strK = wn9.K((pv9) ev9.d0.getValue(), dd4Var2);
            boolean zF = dd4Var2.f(list) | dd4Var2.f(strK);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                zy5 zy5VarN = gc1.N();
                zy5VarN.add(strK);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zy5VarN.add(((knb) it.next()).c);
                }
                objQ = gc1.J(zy5VarN);
                dd4Var2.p0(objQ);
            }
            List list2 = (List) objQ;
            int iQ = wx1.Q(i + 1, 0, gc1.S(list2));
            boolean z = (i3 & 7168) == 2048;
            Object objQ2 = dd4Var2.Q();
            if (z || objQ2 == obj) {
                objQ2 = new mj(20, kb4Var);
                dd4Var2.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var2 = s96.a;
            rw1.C(iQ, 0, kb4Var2, dd4Var2, fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var2)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var2)).a, 6.0f), lp4Var), list2);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ml6(list, i, ou6Var, kb4Var, i2);
        }
    }

    public static final void b(final boolean z, final float f, final boolean z2, final float f2, final ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, dd4 dd4Var, final int i) {
        int i2;
        float f3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1400756653);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.g(z2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.c(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var4) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (dd4Var2.V(i3 & 1, (i3 & 38347923) != 38347922)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(h67.f0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), jf0.G), null, 3), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.k0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var2, 0, 0, 131070);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            int i4 = i3 >> 6;
            k((i3 & 14) | 384 | (i4 & 7168), kb4Var, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.f0.getValue(), dd4Var2), z);
            if (z) {
                f3 = 0.0f;
                dd4Var2.f0(784280569);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(783897130);
                f3 = 0.0f;
                g(wn9.K((pv9) ev9.j0.getValue(), dd4Var2), f, new bb1(0.0f, 1.0f), wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (f * 100.0f))}, dd4Var2), kb4Var2, tg9.f(lu6Var, 1.0f), dd4Var2, (i3 & Token.ASSIGN_MOD) | 196608 | (i4 & 57344));
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            int i5 = i3 >> 12;
            k((i4 & 14) | 384 | (i5 & 7168), kb4Var3, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.o0.getValue(), dd4Var2), z2);
            if (z2) {
                dd4Var2.f0(784963065);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(784587314);
                String strK = wn9.K((pv9) ev9.m0.getValue(), dd4Var2);
                bb1 bb1Var = new bb1(f3, 1.0f);
                String strL = wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf((int) (f2 * 100.0f))}, dd4Var2);
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                int i6 = (i4 & Token.ASSIGN_MOD) | 196608 | (i5 & 57344);
                dd4 dd4Var3 = dd4Var2;
                g(strK, f2, bb1Var, strL, kb4Var4, ou6VarF, dd4Var3, i6);
                dd4Var2 = dd4Var3;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: tt6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    au6.b(z, f, z2, f2, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void c(List list, long j, kb4 kb4Var, dd4 dd4Var, int i) {
        long jC;
        boolean z;
        dd4Var.h0(-1544580551);
        int i2 = i | (dd4Var.h(list) ? 4 : 2) | (dd4Var.e(j) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        boolean z2 = true;
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(new mv(10.0f, true, new gp(5)), bv4.w, dd4Var, 6);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            dd4Var.f0(-1393361874);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                boolean z3 = jLongValue == j ? z2 : false;
                long j2 = ah1.j((int) jLongValue);
                ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
                rp8 rp8Var = tp8.a;
                ou6 ou6VarL = fe.L(t96.w(ou6VarN, rp8Var), j2, jf0.G);
                float f = z3 ? 2.0f : 1.0f;
                if (z3) {
                    dd4Var.f0(-1198005713);
                    jC = ((q96) dd4Var.j(s96.a)).a.a;
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(-1197910822);
                    jC = lc1.c(0.3f, ((q96) dd4Var.j(s96.a)).a.q);
                    dd4Var.q(false);
                }
                ou6 ou6VarG = fw.G(ou6VarL, f, jC, rp8Var);
                boolean zE = dd4Var.e(jLongValue) | ((i2 & 896) == 256);
                Object objQ = dd4Var.Q();
                if (zE || objQ == vl1.a) {
                    z = true;
                    objQ = new jp6(kb4Var, jLongValue, 1);
                    dd4Var.p0(objQ);
                } else {
                    z = true;
                }
                pn0.a(fw.J(null, (ib4) objQ, ou6VarG, false, 15), dd4Var, 0);
                z2 = z;
            }
            dd4Var.q(false);
            dd4Var.q(z2);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kp6(list, j, kb4Var, i, 1);
        }
    }

    public static final void d(final onb onbVar, final List list, final int i, final ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, final kb4 kb4Var9, final kb4 kb4Var10, final kb4 kb4Var11, final kb4 kb4Var12, final kb4 kb4Var13, final kb4 kb4Var14, final kb4 kb4Var15, final kb4 kb4Var16, final kb4 kb4Var17, final kb4 kb4Var18, final kb4 kb4Var19, dd4 dd4Var, final int i2) {
        dd4 dd4Var2;
        dd4Var.h0(-1149285901);
        int i3 = i2 | (dd4Var.f(onbVar) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.d(i) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        boolean zH = dd4Var.h(kb4Var2);
        int i4 = Parser.ARGC_LIMIT;
        int i5 = i3 | (zH ? 131072 : 65536) | (dd4Var.h(kb4Var3) ? 1048576 : 524288) | (dd4Var.h(kb4Var4) ? 8388608 : 4194304) | (dd4Var.h(kb4Var5) ? 67108864 : 33554432) | (dd4Var.h(kb4Var6) ? 536870912 : 268435456);
        int i6 = (dd4Var.h(kb4Var7) ? 4 : 2) | (dd4Var.h(kb4Var8) ? 32 : 16) | (dd4Var.h(kb4Var9) ? 256 : Token.CASE) | (dd4Var.h(kb4Var10) ? 2048 : 1024) | (dd4Var.h(kb4Var11) ? 16384 : 8192);
        if (dd4Var.h(kb4Var12)) {
            i4 = 131072;
        }
        int i7 = i6 | i4 | (dd4Var.h(kb4Var13) ? 1048576 : 524288) | (dd4Var.h(kb4Var14) ? 8388608 : 4194304) | (dd4Var.h(kb4Var15) ? 67108864 : 33554432) | (dd4Var.h(kb4Var16) ? 536870912 : 268435456);
        int i8 = (dd4Var.h(kb4Var17) ? 4 : 2) | (dd4Var.h(kb4Var18) ? 32 : 16) | (dd4Var.h(kb4Var19) ? 256 : Token.CASE);
        if (dd4Var.V(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i8 & Token.EXPR_VOID) == 146) ? false : true)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 12.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
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
            boolean z = onbVar.d;
            boolean z2 = onbVar.e;
            boolean z3 = onbVar.f;
            int i9 = onbVar.q;
            int i10 = onbVar.r;
            lu6 lu6Var = lu6.a;
            int i11 = i5 << 6;
            i(z, z2, z3, i9, i10, tg9.f(lu6Var, 1.0f), kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, dd4Var, (i11 & 3670016) | 196608 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), (i5 >> 24) & 14);
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            f(onbVar.a, onbVar.s, tg9.f(lu6Var, 1.0f), kb4Var6, kb4Var7, dd4Var, ((i5 >> 18) & 7168) | 384 | ((i7 << 12) & 57344));
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            b(onbVar.t, onbVar.u, onbVar.n, onbVar.o, tg9.f(lu6Var, 1.0f), kb4Var16, kb4Var17, kb4Var19, kb4Var18, dd4Var, ((i7 >> 12) & 458752) | 24576 | ((i8 << 18) & 3670016) | ((i8 << 15) & 29360128) | ((i8 << 21) & 234881024));
            int i12 = i7 << 3;
            j(onbVar, xv5.h(lu6Var, 12.0f, dd4Var, lu6Var, 1.0f), kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, kb4Var13, kb4Var14, dd4Var, (458752 & i12) | (i5 & 14) | 48 | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024));
            dd4Var2 = dd4Var;
            if (list.isEmpty()) {
                dd4Var2.f0(775107205);
                dd4Var2.q(false);
            } else {
                ky0.z(dd4Var2, 774806412, lu6Var, 12.0f, dd4Var2);
                int i13 = i5 >> 3;
                a(i, ((i7 >> 15) & 7168) | (i13 & Token.ASSIGN_MOD) | (i13 & 14) | 384, kb4Var15, dd4Var2, tg9.f(lu6Var, 1.0f), list);
                dd4Var2.q(false);
            }
            xv5.A(lu6Var, 12.0f, dd4Var2, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(list, i, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, kb4Var13, kb4Var14, kb4Var15, kb4Var16, kb4Var17, kb4Var18, kb4Var19, i2) { // from class: xt6
                public final /* synthetic */ kb4 A;
                public final /* synthetic */ kb4 B;
                public final /* synthetic */ kb4 C;
                public final /* synthetic */ kb4 D;
                public final /* synthetic */ kb4 E;
                public final /* synthetic */ kb4 F;
                public final /* synthetic */ kb4 G;
                public final /* synthetic */ kb4 H;
                public final /* synthetic */ kb4 I;
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ kb4 t;
                public final /* synthetic */ kb4 u;
                public final /* synthetic */ kb4 v;
                public final /* synthetic */ kb4 w;
                public final /* synthetic */ kb4 x;
                public final /* synthetic */ kb4 y;
                public final /* synthetic */ kb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    au6.d(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void e(dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1132566466);
        if (dd4Var2.V(i & 1, i != 0)) {
            ou6 ou6VarL0 = gjb.l0(tg9.f(lu6.a, 1.0f), 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) mu9.o0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var, 0, 0, 131070);
            dd4Var2 = dd4Var;
            i2 = 1;
            dd4Var2.q(true);
        } else {
            i2 = 1;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qp6(i, i2);
        }
    }

    public static final void f(int i, boolean z, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(949116663);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 16384 : 8192;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = gc1.Z(0, 2, 1);
                dd4Var2.p0(objQ);
            }
            List list = (List) objQ;
            List listZ = gc1.Z(wn9.K((pv9) vt9.H.getValue(), dd4Var2), wn9.K((pv9) mu9.v.getValue(), dd4Var2), wn9.K((pv9) mu9.s.getValue(), dd4Var2));
            ou6 ou6VarW = t96.w(ou6Var, s00.p(dd4Var2).c);
            long jG = dd1.g(s00.o(dd4Var2), 3.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL0 = gjb.l0(fe.L(ou6VarW, jG, lp4Var), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.n0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 0, 0, 131070);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) ev9.l0.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).j, dd4Var, 0, 0, 131070);
            un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
            int iIndexOf = list.indexOf(Integer.valueOf(i));
            int i4 = iIndexOf < 0 ? 0 : iIndexOf;
            boolean zH = dd4Var.h(list) | ((i3 & 7168) == 2048);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new qp0(kb4Var, list, 8);
                dd4Var.p0(objQ2);
            }
            rw1.C(i4, 0, (kb4) objQ2, dd4Var, ky0.h(dd4Var, 6.0f, t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var).c), lp4Var), listZ);
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            int i5 = i3 >> 3;
            k((i5 & 14) | 384 | (i5 & 7168), kb4Var2, dd4Var, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.b0.getValue(), dd4Var), z);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nm3(i, i2, kb4Var, kb4Var2, ou6Var, z);
        }
    }

    public static final void g(final String str, final float f, final bb1 bb1Var, final String str2, final kb4 kb4Var, final ou6 ou6Var, dd4 dd4Var, final int i) {
        int i2;
        String str3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1288047156);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(bb1Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= dd4Var2.f(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var2.V(i2 & 1, (74899 & i2) != 74898)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
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
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL02 = s32.L0(dd4Var2, lu6Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            ur9 ur9Var = s96.a;
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, i3 & 14, 0, 131068);
            int i4 = i3 >> 9;
            nha.c(str3, (ou6) null, lc1.c(0.7f, ((q96) dd4Var.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, i4 & 14, 0, 131066);
            dd4Var.q(true);
            vh9 vh9Var = vh9.a;
            yb0.u(f, kb4Var, tg9.f(lu6Var, 1.0f), false, null, vh9.d(0L, 0L, lc1.c(0.2f, ((q96) dd4Var.j(ur9Var)).a.a), dd4Var, 1015), null, 0, null, null, bb1Var, dd4Var, ((i3 >> 3) & 14) | 384 | (i4 & Token.ASSIGN_MOD), (i3 >> 6) & 14, 984);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ut6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    au6.g(str, f, bb1Var, str2, kb4Var, ou6Var, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void h(final boolean z, final boolean z2, final onb onbVar, final List list, final int i, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, final kb4 kb4Var9, final kb4 kb4Var10, final kb4 kb4Var11, final kb4 kb4Var12, final kb4 kb4Var13, final kb4 kb4Var14, final kb4 kb4Var15, final kb4 kb4Var16, final kb4 kb4Var17, final kb4 kb4Var18, final kb4 kb4Var19, final kb4 kb4Var20, final kb4 kb4Var21, final kb4 kb4Var22, final kb4 kb4Var23, dd4 dd4Var, final int i2) {
        dd4 dd4Var2 = dd4Var;
        onbVar.getClass();
        list.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        kb4Var6.getClass();
        kb4Var7.getClass();
        kb4Var8.getClass();
        kb4Var9.getClass();
        kb4Var10.getClass();
        kb4Var11.getClass();
        kb4Var12.getClass();
        kb4Var13.getClass();
        kb4Var14.getClass();
        kb4Var15.getClass();
        kb4Var16.getClass();
        kb4Var17.getClass();
        kb4Var18.getClass();
        kb4Var19.getClass();
        kb4Var20.getClass();
        kb4Var21.getClass();
        kb4Var22.getClass();
        kb4Var23.getClass();
        dd4Var2.h0(880827131);
        int i3 = i2 | (dd4Var2.g(z) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.f(onbVar) ? 256 : Token.CASE) | (dd4Var2.h(list) ? 2048 : 1024) | (dd4Var2.d(i) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : 65536) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288) | (dd4Var2.h(kb4Var3) ? 8388608 : 4194304) | (dd4Var2.h(kb4Var4) ? 67108864 : 33554432) | (dd4Var2.h(kb4Var5) ? 536870912 : 268435456);
        boolean z3 = true;
        if (dd4Var2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((dd4Var2.h(kb4Var6) ? (char) 4 : (char) 2) | (dd4Var2.h(kb4Var8) ? (char) 256 : (char) 128)) | (dd4Var2.h(kb4Var10) ? 16384 : 8192)) | (dd4Var2.h(kb4Var11) ? 131072 : 65536)) | (dd4Var2.h(kb4Var12) ? 1048576 : 524288)) | (dd4Var2.h(kb4Var13) ? (char) 0 : (char) 0)) | (dd4Var2.h(kb4Var14) ? (char) 0 : (char) 0)) | (dd4Var2.h(kb4Var15) ? (char) 0 : (char) 0)) & 306782339) == 306782338 && ((((((((dd4Var2.h(kb4Var16) ? (char) 4 : (char) 2) | (dd4Var2.h(kb4Var17) ? ' ' : (char) 16)) | (dd4Var2.h(kb4Var18) ? 256 : Token.CASE)) | (dd4Var2.h(kb4Var19) ? 2048 : 1024)) | (dd4Var2.h(kb4Var20) ? (char) 16384 : (char) 8192)) | (dd4Var2.h(kb4Var21) ? (char) 0 : (char) 0)) | (dd4Var2.h(kb4Var22) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            if (z2) {
                dd4Var2.f0(-1527884342);
            } else {
                dd4Var2.f0(366355833);
                z3 = !xzb.a(dd4Var2);
            }
            dd4Var2.q(false);
            if (z3) {
                dd4Var2.f0(-1527777660);
                fw.r(z, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(621297031, new st6(onbVar, list, i, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var8, kb4Var10, kb4Var11, kb4Var12, kb4Var13, kb4Var14, kb4Var15, kb4Var16, kb4Var17, kb4Var18, kb4Var19, kb4Var20, kb4Var21, kb4Var22), dd4Var2), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 12) & Token.ASSIGN_MOD), 500);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
            } else {
                dd4Var2.f0(-1525753918);
                px3 px3Var = tg9.c;
                rj1 rj1VarG = jf0.G(-586329611, new zb4() { // from class: vt6
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        co0 co0Var = (co0) obj;
                        dd4 dd4Var3 = (dd4) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        co0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= dd4Var3.f(co0Var) ? 4 : 2;
                        }
                        if (dd4Var3.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ou6 ou6VarH = tg9.h(lu6.a, (co0Var.c() * 2.0f) / 3.0f);
                            long j = ((q96) dd4Var3.j(s96.a)).a.p;
                            rj1 rj1Var = kl8.r;
                            final onb onbVar2 = onbVar;
                            final List list2 = list;
                            final int i4 = i;
                            final kb4 kb4Var24 = kb4Var2;
                            final kb4 kb4Var25 = kb4Var3;
                            final kb4 kb4Var26 = kb4Var4;
                            final kb4 kb4Var27 = kb4Var5;
                            final kb4 kb4Var28 = kb4Var6;
                            final kb4 kb4Var29 = kb4Var8;
                            final kb4 kb4Var30 = kb4Var10;
                            final kb4 kb4Var31 = kb4Var11;
                            final kb4 kb4Var32 = kb4Var12;
                            final kb4 kb4Var33 = kb4Var13;
                            final kb4 kb4Var34 = kb4Var14;
                            final kb4 kb4Var35 = kb4Var15;
                            final kb4 kb4Var36 = kb4Var16;
                            final kb4 kb4Var37 = kb4Var17;
                            final kb4 kb4Var38 = kb4Var18;
                            final kb4 kb4Var39 = kb4Var19;
                            final kb4 kb4Var40 = kb4Var20;
                            final kb4 kb4Var41 = kb4Var21;
                            final kb4 kb4Var42 = kb4Var22;
                            fw.q(z, kb4Var, ou6VarH, true, null, null, j, 0L, 0.0f, 0L, rj1Var, jf0.G(-720952239, new zb4() { // from class: yt6
                                @Override // defpackage.zb4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    dd4 dd4Var4 = (dd4) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((ke1) obj4).getClass();
                                    if (dd4Var4.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lu6 lu6Var = lu6.a;
                                        ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var4), 14);
                                        ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var4, 0);
                                        int iHashCode = Long.hashCode(dd4Var4.T);
                                        lr7 lr7VarL = dd4Var4.l();
                                        ou6 ou6VarL0 = s32.L0(dd4Var4, ou6VarQ);
                                        ml1.k.getClass();
                                        um1 um1Var = ll1.b;
                                        dd4Var4.j0();
                                        if (dd4Var4.S) {
                                            dd4Var4.k(um1Var);
                                        } else {
                                            dd4Var4.s0();
                                        }
                                        un9.s(ll1.f, dd4Var4, ie1VarA);
                                        un9.s(ll1.e, dd4Var4, lr7VarL);
                                        un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode));
                                        un9.r(dd4Var4, ll1.h);
                                        un9.s(ll1.d, dd4Var4, ou6VarL0);
                                        au6.d(onbVar2, list2, i4, gjb.k0(tg9.f(lu6Var, 1.0f), yib.d(6, dd4Var4, false)), kb4Var24, kb4Var25, kb4Var26, kb4Var27, kb4Var28, kb4Var29, kb4Var30, kb4Var31, kb4Var32, kb4Var33, kb4Var34, kb4Var35, kb4Var36, kb4Var37, kb4Var38, kb4Var39, kb4Var40, kb4Var41, kb4Var42, dd4Var4, 0);
                                        un9.a(dd4Var4, tg9.h(lu6Var, yib.z(dd4Var4) + 8.0f));
                                        dd4Var4.q(true);
                                    } else {
                                        dd4Var4.Y();
                                    }
                                    return heb.a;
                                }
                            }, dd4Var3), dd4Var3, 3072, 54, 944);
                        } else {
                            dd4Var3.Y();
                        }
                        return heb.a;
                    }
                }, dd4Var2);
                dd4Var2 = dd4Var2;
                sdc.e(px3Var, null, rj1VarG, dd4Var2, 3078, 6);
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, z2, onbVar, list, i, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, kb4Var10, kb4Var11, kb4Var12, kb4Var13, kb4Var14, kb4Var15, kb4Var16, kb4Var17, kb4Var18, kb4Var19, kb4Var20, kb4Var21, kb4Var22, kb4Var23, i2) { // from class: wt6
                public final /* synthetic */ kb4 A;
                public final /* synthetic */ kb4 B;
                public final /* synthetic */ kb4 C;
                public final /* synthetic */ kb4 D;
                public final /* synthetic */ kb4 E;
                public final /* synthetic */ kb4 F;
                public final /* synthetic */ kb4 G;
                public final /* synthetic */ kb4 H;
                public final /* synthetic */ kb4 I;
                public final /* synthetic */ kb4 J;
                public final /* synthetic */ kb4 K;
                public final /* synthetic */ kb4 L;
                public final /* synthetic */ kb4 M;
                public final /* synthetic */ kb4 N;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ onb c;
                public final /* synthetic */ List d;
                public final /* synthetic */ int e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ kb4 t;
                public final /* synthetic */ kb4 u;
                public final /* synthetic */ kb4 v;
                public final /* synthetic */ kb4 w;
                public final /* synthetic */ kb4 x;
                public final /* synthetic */ kb4 y;
                public final /* synthetic */ kb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    au6.h(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void i(final boolean z, final boolean z2, final boolean z3, final int i, final int i2, final ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, final kb4 kb4Var5, dd4 dd4Var, final int i3, final int i4) {
        int i5;
        int i6;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(580543438);
        if ((i3 & 6) == 0) {
            i5 = (dd4Var2.g(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var2.g(z2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= dd4Var2.g(z3) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var2.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var2.d(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i3) == 0) {
            i5 |= dd4Var2.h(kb4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= dd4Var2.h(kb4Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= dd4Var2.h(kb4Var3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= dd4Var2.h(kb4Var4) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (dd4Var2.h(kb4Var5) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (dd4Var2.V(i7 & 1, ((i7 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = gc1.Z(5, 10, 15, 30);
                dd4Var2.p0(objQ);
            }
            List list = (List) objQ;
            dd4Var2.f0(-443487126);
            ArrayList arrayList = new ArrayList(gc1.M(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wn9.L((pv9) ev9.r0.getValue(), new Object[]{Integer.valueOf(((Number) it.next()).intValue())}, dd4Var2));
                list = list;
            }
            List list2 = list;
            dd4Var2.q(false);
            ou6 ou6VarW = t96.w(ou6Var, s00.p(dd4Var2).c);
            long jG = dd1.g(s00.o(dd4Var2), 3.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL0 = gjb.l0(fe.L(ou6VarW, jG, lp4Var), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.p0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var2, 0, 0, 131070);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            k((i7 & 14) | 384 | ((i7 >> 9) & 7168), kb4Var, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.h0.getValue(), dd4Var2), z);
            k(((i7 >> 3) & 14) | 384 | ((i7 >> 12) & 7168), kb4Var2, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.g0.getValue(), dd4Var2), z2);
            k(((i7 >> 6) & 14) | 384 | ((i7 >> 15) & 7168), kb4Var3, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.i0.getValue(), dd4Var2), z3);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) ev9.t0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 0, 0, 131070);
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            int iIndexOf = list2.indexOf(Integer.valueOf(i));
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            boolean zH = ((i7 & 1879048192) == 536870912) | dd4Var2.h(list2);
            Object objQ2 = dd4Var2.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new qp0(kb4Var4, list2, 6);
                dd4Var2.p0(objQ2);
            }
            rw1.C(iIndexOf, 0, (kb4) objQ2, dd4Var2, ky0.h(dd4Var2, 6.0f, t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var2).c), lp4Var), arrayList);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) ev9.s0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var2, 0, 0, 131070);
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            int iIndexOf2 = list2.indexOf(Integer.valueOf(i2));
            int i8 = iIndexOf2 < 0 ? 0 : iIndexOf2;
            boolean zH2 = ((i6 & 14) == 4) | dd4Var2.h(list2);
            Object objQ3 = dd4Var2.Q();
            if (zH2 || objQ3 == obj) {
                objQ3 = new qp0(kb4Var5, list2, 7);
                dd4Var2.p0(objQ3);
            }
            rw1.C(i8, 0, (kb4) objQ3, dd4Var2, ky0.h(dd4Var2, 6.0f, t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var2).c), lp4Var), arrayList);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: zt6
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i3 | 1);
                    int iX02 = qu1.x0(i4);
                    au6.i(z, z2, z3, i, i2, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void j(onb onbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, kb4 kb4Var7, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-327933443);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(onbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var7) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i2 & 1, (38347923 & i2) != 38347922)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(h67.f0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), jf0.G), null, 3), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            int i3 = i2;
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.w0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, 0, 0, 131070);
            dd4Var2 = dd4Var;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            int i4 = ((i3 << 3) & 7168) | 384;
            k(i4, kb4Var, dd4Var2, tg9.f(lu6Var, 1.0f), wn9.K((pv9) ev9.u0.getValue(), dd4Var2), onbVar.g);
            kf0.e(onbVar.g, (ou6) null, wd3.c((by3) null, 3).a(wd3.b()), wd3.d((by3) null, 3).a(wd3.i()), (String) null, jf0.G(-126925457, new el0(onbVar, kb4Var4, kb4Var5, kb4Var6, kb4Var2, kb4Var3, kb4Var7), dd4Var2), dd4Var2, 1600518, 18);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(onbVar, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, i);
        }
    }

    public static final void k(int i, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, String str, boolean z) {
        int i2;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1054914281);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new ck0(13, kb4Var, z);
                dd4Var2.p0(objQ);
            }
            ou6Var2 = ou6Var;
            ou6 ou6VarV = yn2.V(1, (ib4) objQ, dd4Var2, ou6Var2, false);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarV);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var, (i2 >> 3) & 14, 0, 131068);
            dd4Var2 = dd4Var;
            zk9.g(z, false, null, kb4Var, dd4Var2, i2 & 7182);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kl6(z, str, ou6Var2, kb4Var, i, 2);
        }
    }
}
