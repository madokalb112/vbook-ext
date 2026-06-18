package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gl9 {
    public static final void a(boolean z, final String str, final int i, final int i2, ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, dd4 dd4Var, int i3) {
        str.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        dd4Var.h0(-769320919);
        int i4 = i3 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.d(i) ? 256 : Token.CASE) | (dd4Var.d(i2) ? 2048 : 1024) | (dd4Var.f(ou6Var) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var2) ? 1048576 : 524288) | (dd4Var.h(ib4Var3) ? 8388608 : 4194304) | (dd4Var.h(ib4Var4) ? 67108864 : 33554432);
        if (dd4Var.V(i4 & 1, (38347923 & i4) != 38347922)) {
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uha(8);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            int i5 = 9;
            if (objQ2 == obj) {
                objQ2 = new uha(i5);
                dd4Var.p0(objQ2);
            }
            kf0.d(z, ou6Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-1501208495, new zb4() { // from class: aka
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    dd4 dd4Var2 = (dd4) obj3;
                    ((Integer) obj4).getClass();
                    ((co) obj2).getClass();
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarL0 = s32.L0(dd4Var2, lu6Var);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var2, ha6VarD);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var2, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var2, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var2, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var2, ou6VarL0);
                    ou6 ou6VarL02 = gjb.l0(fe.L(yn2.y(dd4Var2, t96.w(jv3.G(lu6Var, fc5.a), s00.p(dd4Var2).c)), lc1.c(0.95f, dd1.g(s00.o(dd4Var2), 4.0f)), jf0.G), 12.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarL02);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, eq8VarA);
                    un9.s(jmVar2, dd4Var2, lr7VarL2);
                    dx1.r(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL03);
                    bp5 bp5Var = new bp5(1.0f, true);
                    ib4 ib4Var5 = ib4Var3;
                    boolean zF = dd4Var2.f(ib4Var5);
                    Object objQ3 = dd4Var2.Q();
                    Object obj5 = vl1.a;
                    if (zF || objQ3 == obj5) {
                        objQ3 = new oda(9, ib4Var5);
                        dd4Var2.p0(objQ3);
                    }
                    nha.c(str, kf0.v(fw.J(null, (ib4) objQ3, bp5Var, false, 15)), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, (uka) null, dd4Var2, 0, 24576, 245752);
                    un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
                    int i6 = i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i6 + 1);
                    sb.append("/");
                    int i7 = i2;
                    sb.append(i7);
                    nha.c(sb.toString(), (ou6) null, s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 0, 0, 262138);
                    un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
                    y86.n(0.0f, 6, 6, 0L, dd4Var2, tg9.c(lu6Var, 1.0f));
                    un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
                    p35 p35VarC = i25.c((m53) f53.u.getValue(), dd4Var2, 0);
                    long j = s00.o(dd4Var2).q;
                    ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
                    rp8 rp8Var = tp8.a;
                    ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
                    boolean z2 = i6 > 0;
                    ib4 ib4Var6 = ib4Var2;
                    boolean zF2 = dd4Var2.f(ib4Var6);
                    Object objQ4 = dd4Var2.Q();
                    if (zF2 || objQ4 == obj5) {
                        objQ4 = new oda(10, ib4Var6);
                        dd4Var2.p0(objQ4);
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ4, ou6VarW, z2, 14), 4.0f), j, dd4Var2, 48, 0);
                    un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
                    p35 p35VarC2 = i25.c((m53) f53.s.getValue(), dd4Var2, 0);
                    long j2 = s00.o(dd4Var2).q;
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 32.0f), rp8Var);
                    boolean z3 = i6 < i7 + (-1);
                    ib4 ib4Var7 = ib4Var;
                    boolean zF3 = dd4Var2.f(ib4Var7);
                    Object objQ5 = dd4Var2.Q();
                    if (zF3 || objQ5 == obj5) {
                        objQ5 = new oda(11, ib4Var7);
                        dd4Var2.p0(objQ5);
                    }
                    mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) objQ5, ou6VarW2, z3, 14), 4.0f), j2, dd4Var2, 48, 0);
                    un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
                    p35 p35VarC3 = i25.c((m53) a53.w.getValue(), dd4Var2, 0);
                    long j3 = s00.o(dd4Var2).q;
                    ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 32.0f), rp8Var);
                    ib4 ib4Var8 = ib4Var4;
                    boolean zF4 = dd4Var2.f(ib4Var8);
                    Object objQ6 = dd4Var2.Q();
                    if (zF4 || objQ6 == obj5) {
                        objQ6 = new oda(12, ib4Var8);
                        dd4Var2.p0(objQ6);
                    }
                    mx4.a(p35VarC3, (String) null, gjb.l0(fw.J(null, (ib4) objQ6, ou6VarW3, false, 15), 4.0f), j3, dd4Var2, 48, 0);
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                    return heb.a;
                }
            }, dd4Var), dd4Var, ((i4 >> 9) & Token.ASSIGN_MOD) | (i4 & 14) | 200064, 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao4(z, str, i, i2, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i3);
        }
    }

    public static final void b(int i, t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        dd4 dd4Var2;
        jt1 jt1Var;
        vx1 vx1Var;
        List listR0;
        a07 a07Var;
        jt1 jt1Var2;
        gn2 gn2Var;
        st5 st5Var;
        vx1 vx1Var2;
        pp1 pp1Var;
        jt1 jt1Var3;
        final x31 x31Var;
        a07 a07Var2;
        a07 a07Var3;
        a07 a07Var4;
        a07 a07Var5;
        t27 t27Var3;
        ig4 ig4Var;
        mn8 mn8Var;
        st5 st5Var2;
        c1b c1bVar;
        t27Var.getClass();
        dd4Var.h0(1156914094);
        int i3 = i2 | (dd4Var.d(i) ? 4 : 2) | (dd4Var.f(t27Var) ? 32 : 16);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            String strValueOf = String.valueOf(i);
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new rma(i, i4);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(c1b.class);
            c1b c1bVar2 = (c1b) ((qtb) qx1.N(a91VarA, pj4VarA.f(), strValueOf != null ? dx1.h(a91VarA.f(), "-", strValueOf) : null, ry6VarD, ev8VarA, ib4Var));
            eub eubVarA = (eub) dd4Var.j(utb.b);
            if (eubVarA == null) {
                dd4Var.f0(1368428688);
                eubVarA = e36.a(dd4Var);
            } else {
                dd4Var.f0(1368426673);
            }
            dd4Var.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            mib mibVar = (mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null));
            final a07 a07VarB = bx1.B(c1bVar2.f, dd4Var);
            final a07 a07VarB2 = bx1.B(mibVar.f, dd4Var);
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var3 = (vx1) objQ2;
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            uk9 uk9Var = (uk9) dd4Var.j(xm1.q);
            ig4 ig4VarE0 = tw1.e0(dd4Var);
            final f28 f28VarB0 = e11.b0(dd4Var);
            Object[] objArr = new Object[0];
            rt8 rt8Var = gn2.c;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                jt1Var = null;
                objQ3 = new z16(29);
                dd4Var.p0(objQ3);
            } else {
                jt1Var = null;
            }
            gn2 gn2Var2 = (gn2) ww1.d0(objArr, rt8Var, (ib4) objQ3, dd4Var, 384);
            mn8 mn8VarF0 = tu1.f0(dd4Var);
            boolean zF = dd4Var.f(vx1Var3) | dd4Var.f(uk9Var) | dd4Var.f(pn2Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new x31(pn2Var.w0(240.0f), vx1Var3, uk9Var);
                dd4Var.p0(objQ4);
            }
            x31 x31Var2 = (x31) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = dk9.x(Boolean.TRUE);
                dd4Var.p0(objQ5);
            }
            final a07 a07Var6 = (a07) objQ5;
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj) {
                objQ6 = dk9.x(jt1Var);
                dd4Var.p0(objQ6);
            }
            a07 a07Var7 = (a07) objQ6;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj) {
                objQ7 = dk9.x(lc3.a);
                dd4Var.p0(objQ7);
            }
            a07 a07Var8 = (a07) objQ7;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj) {
                objQ8 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ8);
            }
            a07 a07Var9 = (a07) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj) {
                objQ9 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ9);
            }
            a07 a07Var10 = (a07) objQ9;
            boolean zF2 = dd4Var.f(st5VarA);
            Object objQ10 = dd4Var.Q();
            if (zF2 || objQ10 == obj) {
                objQ10 = dk9.n(new e51(st5VarA, 15));
                dd4Var.p0(objQ10);
            }
            final br9 br9Var = (br9) objQ10;
            boolean zF3 = dd4Var.f(((b1b) a07VarB.getValue()).g) | dd4Var.g(((Boolean) a07Var6.getValue()).booleanValue());
            Object objQ11 = dd4Var.Q();
            if (zF3 || objQ11 == obj) {
                if (((Boolean) a07Var6.getValue()).booleanValue()) {
                    vx1Var = vx1Var3;
                    listR0 = fc1.R0(new cd9(16), ((b1b) a07VarB.getValue()).g);
                } else {
                    vx1Var = vx1Var3;
                    listR0 = fc1.R0(new cd9(15), ((b1b) a07VarB.getValue()).g);
                }
                objQ11 = listR0;
                dd4Var.p0(objQ11);
            } else {
                vx1Var = vx1Var3;
            }
            final List list = (List) objQ11;
            boolean zF4 = dd4Var.f(c1bVar2);
            Object objQ12 = dd4Var.Q();
            if (zF4 || objQ12 == obj) {
                objQ12 = new ne0(c1bVar2, jt1Var, 25);
                dd4Var.p0(objQ12);
            }
            lc5.u((yb4) objQ12, dd4Var, c1bVar2);
            WeakHashMap weakHashMap = pzb.w;
            a07 a07VarA = dk9.A(Integer.valueOf(ju7.i(dd4Var).c.e().d), dd4Var);
            boolean zF5 = dd4Var.f(a07VarA) | dd4Var.f(x31Var2);
            Object objQ13 = dd4Var.Q();
            if (zF5 || objQ13 == obj) {
                a07Var = a07Var10;
                jt1Var2 = null;
                objQ13 = new o51(a07VarA, x31Var2, jt1Var2, 1);
                dd4Var.p0(objQ13);
            } else {
                a07Var = a07Var10;
                jt1Var2 = null;
            }
            lc5.u((yb4) objQ13, dd4Var, heb.a);
            pp1 pp1Var2 = c1bVar2.s;
            boolean zF6 = ((i3 & Token.ASSIGN_MOD) == 32) | dd4Var.f(ig4VarE0) | dd4Var.f(mn8VarF0) | dd4Var.f(x31Var2);
            Object objQ14 = dd4Var.Q();
            if (zF6 || objQ14 == obj) {
                gn2Var = gn2Var2;
                st5Var = st5VarA;
                vx1Var2 = vx1Var;
                pp1Var = pp1Var2;
                jt1Var3 = jt1Var2;
                a07 a07Var11 = a07Var;
                z0b z0bVar = new z0b(t27Var, ig4VarE0, mn8VarF0, x31Var2, a07Var8, a07Var7, a07Var9, a07Var11, null);
                x31Var = x31Var2;
                a07Var2 = a07Var8;
                a07Var3 = a07Var7;
                a07Var4 = a07Var9;
                a07Var5 = a07Var11;
                t27Var3 = t27Var;
                ig4Var = ig4VarE0;
                mn8Var = mn8VarF0;
                dd4Var.p0(z0bVar);
                objQ14 = z0bVar;
            } else {
                x31Var = x31Var2;
                ig4Var = ig4VarE0;
                a07Var2 = a07Var8;
                a07Var3 = a07Var7;
                a07Var4 = a07Var9;
                gn2Var = gn2Var2;
                st5Var = st5VarA;
                a07Var5 = a07Var;
                vx1Var2 = vx1Var;
                t27Var3 = t27Var;
                pp1Var = pp1Var2;
                mn8Var = mn8VarF0;
                jt1Var3 = jt1Var2;
            }
            wx1.e(pp1Var, jt1Var3, (zb4) objQ14, dd4Var, 0);
            boolean zF7 = dd4Var.f(c1bVar2);
            Object objQ15 = dd4Var.Q();
            if (zF7 || objQ15 == obj) {
                st5Var2 = st5Var;
                c1bVar = c1bVar2;
                n0b n0bVar = new n0b(0, c1bVar, c1b.class, "loadMore", "loadMore()V", 0, 4);
                dd4Var.p0(n0bVar);
                objQ15 = n0bVar;
            } else {
                st5Var2 = st5Var;
                c1bVar = c1bVar2;
            }
            final st5 st5Var3 = st5Var2;
            mt5.c(st5Var3, 2, (ib4) ((ei5) objQ15), dd4Var, 48, 0);
            rj1 rj1VarG = jf0.G(1084603434, new oe9(t27Var3, 23), dd4Var);
            rj1 rj1Var = gc1.n;
            dd4Var2 = dd4Var;
            final t27 t27Var4 = t27Var3;
            ig4 ig4Var2 = ig4Var;
            final mn8 mn8Var2 = mn8Var;
            final c1b c1bVar3 = c1bVar;
            final vx1 vx1Var4 = vx1Var2;
            final gn2 gn2Var3 = gn2Var;
            final a07 a07Var12 = a07Var3;
            final a07 a07Var13 = a07Var2;
            final a07 a07Var14 = a07Var4;
            final a07 a07Var15 = a07Var5;
            ac4 ac4Var = new ac4() { // from class: x0b
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    Object obj6;
                    c1b c1bVar4;
                    a07 a07Var16;
                    a07 a07Var17;
                    Object obj7;
                    int i5;
                    st5 st5Var4;
                    ou6 ou6Var;
                    zn0 zn0Var;
                    boolean z2;
                    a07 a07Var18;
                    a07 a07Var19;
                    ou6 ou6Var2;
                    x31 x31Var3;
                    kb4 kb4Var;
                    ib4 ib4Var2;
                    a07 a07Var20;
                    ou6 ou6Var3;
                    kb4 kb4Var2;
                    Object wp0Var;
                    mn8 mn8Var3;
                    boolean z3;
                    pj7 pj7Var = (pj7) obj3;
                    dd4 dd4Var3 = (dd4) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((yn0) obj2).getClass();
                    pj7Var.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= dd4Var3.f(pj7Var) ? 32 : 16;
                    }
                    boolean zV = dd4Var3.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144);
                    heb hebVar = heb.a;
                    if (!zV) {
                        dd4Var3.Y();
                        return hebVar;
                    }
                    final a07 a07Var21 = a07VarB;
                    xq2 xq2Var = ((b1b) a07Var21.getValue()).f;
                    if (xq2Var == null && ((b1b) a07Var21.getValue()).a) {
                        dd4Var3.f0(1128337729);
                        t1c.I(new rj7(16.0f, 8.0f, 16.0f, 116.0f), null, dd4Var3, 6);
                        dd4Var3.q(false);
                        return hebVar;
                    }
                    final c1b c1bVar5 = c1bVar3;
                    Object obj8 = vl1.a;
                    if (xq2Var == null && ((b1b) a07Var21.getValue()).c) {
                        dd4Var3.f0(1128692369);
                        p35 p35VarK0 = lx1.k0(dd4Var3);
                        String strK = wn9.K((pv9) eu9.E.getValue(), dd4Var3);
                        String strK2 = wn9.K((pv9) eu9.F.getValue(), dd4Var3);
                        String strK3 = wn9.K((pv9) mu9.Q.getValue(), dd4Var3);
                        px3 px3Var = tg9.c;
                        boolean zF8 = dd4Var3.f(c1bVar5);
                        Object objQ16 = dd4Var3.Q();
                        if (zF8 || objQ16 == obj8) {
                            n0b n0bVar2 = new n0b(0, c1bVar5, c1b.class, "reload", "reload()V", 0, 5);
                            dd4Var3.p0(n0bVar2);
                            objQ16 = n0bVar2;
                        }
                        bx1.d(p35VarK0, strK, strK2, px3Var, strK3, (ib4) ((ei5) objQ16), dd4Var3, 3072, 0);
                        dd4Var3.q(false);
                        return hebVar;
                    }
                    dd4Var3.f0(1129376818);
                    final xq2 xq2Var2 = ((b1b) a07Var21.getValue()).f;
                    if (xq2Var2 == null) {
                        dd4Var3.q(false);
                        return hebVar;
                    }
                    int i6 = xq2Var2.f;
                    px3 px3Var2 = tg9.c;
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, px3Var2);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ha6VarD);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                    final a07 a07Var22 = a07Var14;
                    final a07 a07Var23 = a07Var12;
                    a07 a07Var24 = a07Var13;
                    float f = 24.0f;
                    rj7 rj7Var = new rj7(16.0f, 8.0f, 16.0f, i6 == 1 ? 24.0f : (!((Boolean) a07Var22.getValue()).booleanValue() && ((wj8) a07Var23.getValue()) == null && ((List) a07Var24.getValue()).isEmpty()) ? 120.0f : 220.0f);
                    mv mvVar = new mv(14.0f, true, new gp(5));
                    boolean zF9 = dd4Var3.f(c1bVar5) | dd4Var3.h(xq2Var2);
                    final t27 t27Var5 = t27Var4;
                    boolean zF10 = zF9 | dd4Var3.f(t27Var5);
                    final f28 f28Var = f28VarB0;
                    boolean zF11 = zF10 | dd4Var3.f(f28Var);
                    final List list2 = list;
                    boolean zH = zF11 | dd4Var3.h(list2);
                    final br9 br9Var2 = a07VarB2;
                    boolean zF12 = zH | dd4Var3.f(br9Var2);
                    final gn2 gn2Var4 = gn2Var3;
                    boolean zF13 = zF12 | dd4Var3.f(gn2Var4) | dd4Var3.f(a07Var21);
                    Object objQ17 = dd4Var3.Q();
                    if (zF13 || objQ17 == obj8) {
                        final a07 a07Var25 = a07Var6;
                        obj6 = new kb4() { // from class: v0b
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj9) {
                                at5 at5Var = (at5) obj9;
                                at5Var.getClass();
                                c1b c1bVar6 = c1bVar5;
                                xq2 xq2Var3 = xq2Var2;
                                t27 t27Var6 = t27Var5;
                                f28 f28Var2 = f28Var;
                                at5.b0(at5Var, "topic", new rj1(new hu2(c1bVar6, xq2Var3, t27Var6, f28Var2, 19), true, 855966676), 2);
                                List list3 = list2;
                                int i7 = 4;
                                if (!list3.isEmpty()) {
                                    at5.b0(at5Var, "thread", new rj1(new pda(i7, a07Var25, (Object) xq2Var3, (Object) list3), true, 1209472943), 2);
                                }
                                uha uhaVar = new uha(24);
                                at5Var.c0(list3.size(), new cea(4, uhaVar, list3), new js6(26, list3), new rj1(new p64(list3, c1bVar6, f28Var2, gn2Var4, br9Var2, a07Var23, a07Var22, 1), true, 802480018));
                                if (((b1b) a07Var21.getValue()).b) {
                                    at5.b0(at5Var, "loading", gc1.o, 2);
                                }
                                return heb.a;
                            }
                        };
                        c1bVar4 = c1bVar5;
                        a07Var16 = a07Var23;
                        a07Var17 = a07Var22;
                        dd4Var3.p0(obj6);
                    } else {
                        obj6 = objQ17;
                        a07Var17 = a07Var22;
                        a07Var16 = a07Var23;
                        c1bVar4 = c1bVar5;
                    }
                    st5 st5Var5 = st5Var3;
                    c1b c1bVar6 = c1bVar4;
                    a07 a07Var26 = a07Var17;
                    rw1.j(px3Var2, st5Var5, rj7Var, false, mvVar, null, null, false, null, (kb4) obj6, dd4Var3, 24582, 488);
                    dd4 dd4Var4 = dd4Var3;
                    ou6 ou6Var4 = lu6.a;
                    zn0 zn0Var2 = zn0.a;
                    if (i6 == 1 || i6 == 2) {
                        obj7 = obj8;
                        i5 = i6;
                        st5Var4 = st5Var5;
                        ou6Var = ou6Var4;
                        zn0Var = zn0Var2;
                        z2 = false;
                        dd4Var4.f0(-1794183741);
                        dd4Var4.q(false);
                    } else {
                        dd4Var4.f0(-1796880307);
                        boolean zBooleanValue = ((Boolean) a07Var26.getValue()).booleanValue();
                        Object objQ18 = dd4Var4.Q();
                        a07 a07Var27 = a07Var15;
                        if (objQ18 == obj8) {
                            a07Var18 = a07Var16;
                            a07Var19 = a07Var26;
                            objQ18 = new iz4(a07Var19, a07Var27, a07Var18, 1);
                            dd4Var4.p0(objQ18);
                        } else {
                            a07Var18 = a07Var16;
                            a07Var19 = a07Var26;
                        }
                        mb0.a(zBooleanValue, (ib4) objQ18, dd4Var4, 48, 0);
                        String str = ((iib) br9Var2.getValue()).h;
                        String str2 = ((iib) br9Var2.getValue()).c;
                        boolean zBooleanValue2 = ((Boolean) a07Var19.getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) a07Var27.getValue()).booleanValue();
                        wj8 wj8Var = (wj8) a07Var18.getValue();
                        cp2 cp2Var = wj8Var != null ? wj8Var.b : null;
                        List list3 = (List) a07Var24.getValue();
                        ou6 ou6VarP0 = gjb.p0(gjb.m0(tg9.f(zn0Var2.a(ou6Var4, bv4.u), 1.0f), 12.0f, 10.0f), 0.0f, pj7Var.d(), 0.0f, 0.0f, 13);
                        boolean z4 = ((b1b) a07Var21.getValue()).e;
                        x31 x31Var4 = x31Var;
                        boolean zF14 = dd4Var4.f(x31Var4);
                        Object objQ19 = dd4Var4.Q();
                        if (zF14 || objQ19 == obj8) {
                            ou6Var2 = ou6Var4;
                            objQ19 = new y0b(x31Var4, a07Var19, a07Var27, a07Var18, 0);
                            x31Var3 = x31Var4;
                            dd4Var4.p0(objQ19);
                        } else {
                            ou6Var2 = ou6Var4;
                            x31Var3 = x31Var4;
                        }
                        kb4 kb4Var3 = (kb4) objQ19;
                        Object objQ20 = dd4Var4.Q();
                        if (objQ20 == obj8) {
                            kb4Var = kb4Var3;
                            objQ20 = new gpa(a07Var27, 9);
                            dd4Var4.p0(objQ20);
                        } else {
                            kb4Var = kb4Var3;
                        }
                        ib4 ib4Var3 = (ib4) objQ20;
                        Object objQ21 = dd4Var4.Q();
                        if (objQ21 == obj8) {
                            objQ21 = new gpa(a07Var18, 10);
                            dd4Var4.p0(objQ21);
                        }
                        ib4 ib4Var4 = (ib4) objQ21;
                        Object objQ22 = dd4Var4.Q();
                        if (objQ22 == obj8) {
                            ib4Var2 = ib4Var3;
                            a07Var20 = a07Var24;
                            ou6Var3 = ou6VarP0;
                            objQ22 = new w0b(a07Var20, 1);
                            dd4Var4.p0(objQ22);
                        } else {
                            ib4Var2 = ib4Var3;
                            a07Var20 = a07Var24;
                            ou6Var3 = ou6VarP0;
                        }
                        kb4 kb4Var4 = (kb4) objQ22;
                        Object objQ23 = dd4Var4.Q();
                        if (objQ23 == obj8) {
                            kb4Var2 = kb4Var4;
                            objQ23 = new w0b(a07Var20, 2);
                            dd4Var4.p0(objQ23);
                        } else {
                            kb4Var2 = kb4Var4;
                        }
                        kb4 kb4Var5 = (kb4) objQ23;
                        boolean zF15 = dd4Var4.f(x31Var3);
                        Object objQ24 = dd4Var4.Q();
                        if (zF15 || objQ24 == obj8) {
                            objQ24 = new b51(x31Var3, 1);
                            dd4Var4.p0(objQ24);
                        }
                        kb4 kb4Var6 = (kb4) objQ24;
                        boolean zF16 = dd4Var4.f(c1bVar6);
                        a07 a07Var28 = a07Var20;
                        mn8 mn8Var4 = mn8Var2;
                        boolean zF17 = zF16 | dd4Var4.f(mn8Var4);
                        Object objQ25 = dd4Var4.Q();
                        if (zF17 || objQ25 == obj8) {
                            mn8Var3 = mn8Var4;
                            a07 a07Var29 = a07Var18;
                            z3 = z4;
                            z2 = false;
                            wp0Var = new wp0((Object) c1bVar6, (Object) mn8Var3, a07Var29, a07Var28, 18);
                            dd4Var4.p0(wp0Var);
                        } else {
                            z3 = z4;
                            mn8Var3 = mn8Var4;
                            wp0Var = objQ25;
                            z2 = false;
                        }
                        zn0Var = zn0Var2;
                        obj7 = obj8;
                        mn8 mn8Var5 = mn8Var3;
                        st5Var4 = st5Var5;
                        cp2 cp2Var2 = cp2Var;
                        i5 = i6;
                        ou6Var = ou6Var2;
                        ou6 ou6Var5 = ou6Var3;
                        gjb.t(str, str2, x31Var3, mn8Var5, zBooleanValue2, zBooleanValue3, cp2Var2, list3, ou6Var5, null, z3, kb4Var, ib4Var2, ib4Var4, kb4Var2, kb4Var5, kb4Var6, null, (ib4) wp0Var, dd4Var4, 2097152, 224640, 131584);
                        dd4Var4 = dd4Var4;
                        dd4Var4.q(z2);
                    }
                    if (((Boolean) br9Var.getValue()).booleanValue()) {
                        dd4Var4.f0(-1794077070);
                        ou6 ou6VarB = yib.B(zn0Var.a(ou6Var, bv4.v), 14);
                        int i7 = i5;
                        if (i7 != 1 && i7 != 2) {
                            f = 90.0f;
                        }
                        ou6 ou6VarN = tg9.n(gjb.p0(ou6VarB, 0.0f, 0.0f, 16.0f, f, 3), 36.0f);
                        rp8 rp8Var = tp8.a;
                        vx1 vx1Var5 = vx1Var4;
                        st5 st5Var6 = st5Var4;
                        boolean zH2 = dd4Var4.h(vx1Var5) | dd4Var4.f(st5Var6);
                        Object objQ26 = dd4Var4.Q();
                        if (zH2 || objQ26 == obj7) {
                            objQ26 = new f51(vx1Var5, st5Var6, 1);
                            dd4Var4.p0(objQ26);
                        }
                        ww1.g((ib4) objQ26, ou6VarN, rp8Var, 0L, 0L, null, gc1.p, dd4Var4, 12582912, 120);
                        dd4Var4.q(z2);
                    } else {
                        dd4Var4.f0(-1792839581);
                        dd4Var4.q(z2);
                    }
                    dd4Var4.q(true);
                    dd4Var4.q(z2);
                    return hebVar;
                }
            };
            t27Var2 = t27Var4;
            gx1.p(null, null, false, rj1VarG, rj1Var, jf0.G(373005560, ac4Var, dd4Var2), dd4Var2, 224256, 7);
            boolean zF8 = dd4Var2.f(c1bVar3);
            Object objQ16 = dd4Var2.Q();
            if (zF8 || objQ16 == obj) {
                vra vraVar = new vra(1, c1bVar3, c1b.class, "deletePost", "deletePost(J)V", 0, 4);
                dd4Var2.p0(vraVar);
                objQ16 = vraVar;
            }
            qx1.f(gn2Var3, (kb4) ((ei5) objQ16), dd4Var2, 0);
            tw1.i(ig4Var2, dd4Var2, 0);
            e11.q(f28VarB0, dd4Var2, 0);
        } else {
            t27Var2 = t27Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sz4(i, i2, t27Var2);
        }
    }

    public static final ty6 c(float f, List list, boolean z) {
        int i = e14.a;
        ty6 ty6Var = new ty6(1);
        ty6Var.a(0.0f);
        if (f != 0.0f && !list.isEmpty()) {
            ha5 ha5VarS0 = wx1.s0(1, list.size());
            ArrayList arrayList = new ArrayList(gc1.M(ha5VarS0, 10));
            Iterator it = ha5VarS0.iterator();
            while (true) {
                w21 w21Var = (w21) it;
                if (!w21Var.d) {
                    break;
                }
                int iNextInt = w21Var.nextInt();
                int i2 = iNextInt - 1;
                xj5 xj5Var = (xj5) list.get(i2);
                xj5 xj5Var2 = (xj5) list.get(iNextInt);
                ty6Var.a(iNextInt == list.size() - 1 ? 1.0f : ty6Var.b(i2) + ((z ? ((wj5) fc1.x0(xj5Var2)).c - ((wj5) fc1.x0(xj5Var)).c : ((wj5) fc1.E0(xj5Var)).c - ((wj5) fc1.E0(xj5Var2)).c) / f));
                arrayList.add(Boolean.TRUE);
            }
        }
        return ty6Var;
    }

    public static long d(boolean z, int i, hc0 hc0Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        hc0Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = hc0Var == hc0.b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static tcb e(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((('A' > cCharAt || cCharAt >= '[') ? (cCharAt < 0 || cCharAt >= 128) ? Character.toLowerCase(cCharAt) : cCharAt : (char) (cCharAt + ' ')) != cCharAt) {
                break;
            }
            i++;
        }
        if (i != -1) {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append((CharSequence) str, 0, i);
            int length2 = str.length() - 1;
            if (i <= length2) {
                while (true) {
                    char cCharAt2 = str.charAt(i);
                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                        cCharAt2 = (char) (cCharAt2 + ' ');
                    } else if (cCharAt2 < 0 || cCharAt2 >= 128) {
                        cCharAt2 = Character.toLowerCase(cCharAt2);
                    }
                    sb.append(cCharAt2);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
            str = sb.toString();
        }
        tcb tcbVar = (tcb) tcb.e.get(str);
        return tcbVar == null ? new tcb(str, 0) : tcbVar;
    }

    public static final xj5 f(xj5 xj5Var, float f, float f2, float f3, wj5 wj5Var, int i) {
        ArrayList arrayList = new ArrayList(xj5Var.a.size());
        List list = xj5Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            wj5 wj5VarA = xj5Var.get(i2);
            if (!wj5VarA.e) {
                arrayList.add(wj5VarA);
            }
        }
        float size2 = f3 / arrayList.size();
        float f4 = (wj5Var.b - (size2 / 2.0f)) + f3;
        ArrayList arrayList2 = new ArrayList();
        int size3 = list.size();
        float f5 = 0.0f;
        int iS = -1;
        for (int i3 = 0; i3 < size3; i3++) {
            wj5 wj5VarA2 = xj5Var.get(i3);
            float fAbs = wj5VarA2.a - Math.abs(size2);
            arrayList2.add(new yj5(fAbs, wj5VarA2.e));
            if (fAbs > f5) {
                iS = gc1.S(arrayList2);
                f5 = fAbs;
            }
        }
        int i4 = iS;
        while (i4 < gc1.S(arrayList2)) {
            int i5 = i4 + 1;
            if (((yj5) arrayList2.get(i5)).a != f5) {
                break;
            }
            i4 = i5;
        }
        ArrayList arrayListB = zj5.b(i, f4, iS, i4, f5, f, f2, arrayList2);
        xj5 xj5Var2 = new xj5(arrayListB);
        ArrayList arrayList3 = new ArrayList(arrayListB.size());
        int size4 = arrayListB.size();
        for (int i6 = 0; i6 < size4; i6++) {
            wj5 wj5VarA3 = xj5Var2.get(i6);
            arrayList3.add(new wj5(wj5VarA3.a, wj5VarA3.b, xj5Var.get(i6).c, wj5VarA3.d, wj5VarA3.e, wj5VarA3.f, wj5VarA3.g));
        }
        return new xj5(arrayList3);
    }

    public static final mt8 g(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131362479);
            mt8 mt8Var = tag instanceof mt8 ? (mt8) tag : null;
            if (mt8Var != null) {
                return mt8Var;
            }
            Object objS = dk9.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static boolean h(Comparator comparator, Collection collection) {
        r27 r27VarComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            r27VarComparator = ((SortedSet) collection).comparator();
            if (r27VarComparator == null) {
                r27VarComparator = r27.b;
            }
        } else {
            if (!(collection instanceof i55)) {
                return false;
            }
            r27VarComparator = ((i55) collection).d;
        }
        return comparator.equals(r27VarComparator);
    }

    public static final float i(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : sw1.V(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static final long j(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : lc1.c(lc1.e(j) * f, j);
    }

    public static final xj5 k(xj5 xj5Var, int i, int i2, float f, float f2) {
        int i3 = i > i2 ? 1 : -1;
        float f3 = ((xj5Var.get(i).a - xj5Var.get(i).g) + f2) * i3;
        int i4 = xj5Var.b;
        int i5 = i4 + i3;
        float f4 = xj5Var.get(i4).b + f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListB1 = fc1.b1(xj5Var);
        wj5 wj5Var = (wj5) arrayListB1.get(i);
        arrayListB1.remove(i);
        arrayListB1.add(i2, wj5Var);
        int size = arrayListB1.size();
        float f5 = 0.0f;
        int iS = -1;
        for (int i6 = 0; i6 < size; i6++) {
            wj5 wj5Var2 = (wj5) arrayListB1.get(i6);
            float f6 = wj5Var2.a;
            arrayList.add(new yj5(f6, wj5Var2.e));
            if (f6 > f5) {
                iS = gc1.S(arrayList);
                f5 = f6;
            }
        }
        int i7 = iS;
        while (i7 < gc1.S(arrayList)) {
            int i8 = i7 + 1;
            if (((yj5) arrayList.get(i8)).a != f5) {
                break;
            }
            i7 = i8;
        }
        return new xj5(zj5.b(i5, f4, iS, i7, f5, f, f2, arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.gl5 r6, defpackage.kt1 r7) throws java.lang.Exception {
        /*
            boolean r0 = r7 instanceof defpackage.njb
            if (r0 == 0) goto L13
            r0 = r7
            njb r0 = (defpackage.njb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            njb r0 = new njb
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            xq0 r6 = r0.b
            gl5 r0 = r0.a
            defpackage.e11.e0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L2a:
            r6 = move-exception
            goto L64
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r3
        L32:
            defpackage.e11.e0(r7)
            xq0 r7 = new xq0     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            r0.a = r6     // Catch: java.lang.Throwable -> L62
            r0.b = r7     // Catch: java.lang.Throwable -> L62
            r0.d = r2     // Catch: java.lang.Throwable -> L62
            ut0 r1 = r6.a     // Catch: java.lang.Throwable -> L62
            heb r2 = defpackage.heb.a     // Catch: java.lang.Throwable -> L62
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r0 = defpackage.fw.b0(r1, r7, r4, r0)     // Catch: java.lang.Throwable -> L62
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L52
            goto L53
        L52:
            r0 = r2
        L53:
            if (r0 != r1) goto L56
            r2 = r0
        L56:
            if (r2 != r1) goto L59
            return r1
        L59:
            r0 = r6
            r6 = r7
        L5b:
            defpackage.lc5.U(r0, r3)
            return r6
        L5f:
            r0 = r6
            r6 = r7
            goto L64
        L62:
            r7 = move-exception
            goto L5f
        L64:
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r7 = move-exception
            defpackage.lc5.U(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl9.l(gl5, kt1):java.lang.Object");
    }

    public static final int m(r5a r5aVar) {
        r5aVar.getClass();
        return p(r5aVar) | (p(r5aVar) << 24) | (p(r5aVar) << 16) | (p(r5aVar) << 8);
    }

    public static final int n(r5a r5aVar) {
        r5aVar.getClass();
        return (p(r5aVar) << 24) | p(r5aVar) | (p(r5aVar) << 8) | (p(r5aVar) << 16);
    }

    public static final int o(r5a r5aVar) {
        r5aVar.getClass();
        return (p(r5aVar) << 8) | p(r5aVar);
    }

    public static final int p(r5a r5aVar) {
        r5aVar.getClass();
        byte[] bArr = r5aVar.b;
        if (r5aVar.read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public static Status q(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, (String) null, (PendingIntent) null, (go1) null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? r((String) listAsList.get(0), (String) listAsList.get(1)) : r((String) listAsList.get(0), null);
    }

    public static Status r(String str, String str2) {
        int i;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i = 17038;
                break;
            case "INVALID_OOB_CODE":
                i = 17030;
                break;
            case "MISSING_EMAIL":
                i = 17034;
                break;
            case "INVALID_CODE":
                i = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i = 17214;
                break;
            case "TOKEN_EXPIRED":
                i = 17021;
                break;
            case "INVALID_TENANT_ID":
                i = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i = 17094;
                break;
            case "INVALID_CERT_HASH":
                i = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i = 17084;
                break;
            case "MISSING_PASSWORD":
                i = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i = 17056;
                break;
            case "WEAK_PASSWORD":
                i = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i = 17089;
                break;
            case "INVALID_SENDER":
                i = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i = 17095;
                break;
            case "EMAIL_EXISTS":
                i = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i = 17000;
                break;
            case "INVALID_PASSWORD":
                i = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i = 17202;
                break;
            case "SESSION_EXPIRED":
                i = 17051;
                break;
            case "MISSING_CODE":
                i = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i = 17201;
                break;
            case "USER_DISABLED":
                i = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        return i == 17499 ? str2 != null ? new Status(i, dx1.h(str, ":", str2), (PendingIntent) null, (go1) null) : new Status(i, str, (PendingIntent) null, (go1) null) : new Status(i, str2, (PendingIntent) null, (go1) null);
    }
}
