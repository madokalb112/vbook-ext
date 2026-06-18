package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fz1 {
    public static final rj1 E;
    public static final rj1 a;
    public static final rj1 d;
    public static final rj1 e;
    public static final rj1 f;
    public static final rj1 g;
    public static final rj1 h;
    public static final rj1 i;
    public static final rj1 m;
    public static final rj1 n;
    public static final rj1 p;
    public static final rj1 q;
    public static final rj1 w;
    public static final rj1 b = new rj1(new uj1(2), false, 486633673);
    public static final rj1 c = new rj1(new vj1(7), false, -1955791546);
    public static final rj1 j = new rj1(new ik1(26), false, 448752757);
    public static final rj1 k = new rj1(new ik1(27), false, 1706480684);
    public static final rj1 l = new rj1(new ik1(28), false, -425184403);
    public static final rj1 o = new rj1(new mk1(21), false, -1606818763);
    public static final rj1 r = new rj1(new mk1(9), false, -120362433);
    public static final rj1 s = new rj1(new mk1(10), false, -904884170);
    public static final rj1 t = new rj1(new mk1(11), false, 1350619639);
    public static final rj1 u = new rj1(new mk1(12), false, -688843848);
    public static final rj1 v = new rj1(new mk1(13), false, 1349470343);
    public static final rj1 x = new rj1(new mk1(15), false, 971135039);
    public static final rj1 y = new rj1(new mk1(16), false, -834368256);
    public static final rj1 z = new rj1(new mk1(17), false, 2051404936);
    public static final rj1 A = new rj1(new mk1(18), false, -816394369);
    public static final rj1 B = new rj1(new mk1(19), false, 1673069632);
    public static final rj1 C = new rj1(new mk1(20), false, -132433663);
    public static final rj1 D = new rj1(new qk1(24), false, -1643121069);
    public static final cd1 F = cd1.B;
    public static final cd1 G = cd1.C;
    public static final float H = 0.38f;
    public static final float I = 6.0f;
    public static final float J = 1.0f;
    public static final float K = 80.0f;
    public static final StackTraceElement[] L = new StackTraceElement[0];
    public static final Object M = new Object();

    static {
        int i2 = 1;
        a = new rj1(new uj1(i2), false, 759698998);
        int i3 = 22;
        d = new rj1(new uj1(i3), false, -918233786);
        int i4 = 23;
        e = new rj1(new uj1(i4), false, 1000985808);
        int i5 = 8;
        f = new rj1(new vj1(i5), false, -1187632722);
        int i6 = 14;
        g = new rj1(new dk1(i6), false, 2029649145);
        h = new rj1(new hk1(i4), false, 1224853437);
        int i7 = 25;
        i = new rj1(new ik1(i7), false, 232674745);
        m = new rj1(new lk1(i2), false, -1972256487);
        n = new rj1(new mk1(i5), false, -822297026);
        p = new rj1(new mk1(i3), false, 648685046);
        q = new rj1(new mk1(i4), false, -1390778441);
        w = new rj1(new mk1(i6), false, -1518328962);
        E = new rj1(new qk1(i7), false, 687314762);
    }

    public static final void A(fxb fxbVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        Object obj;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-500102111);
        int i3 = i2 | (dd4Var2.h(fxbVar) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024) | (dd4Var2.h(ib4Var3) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6Var, rp8Var);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(ou6VarW, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 4.0f), jf0.G);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarL);
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
            boolean z2 = (57344 & i3) == 16384;
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (z2 || objQ == obj2) {
                objQ = new m50(8, ib4Var3);
                dd4Var2.p0(objQ);
            }
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6Var3, false, 15), 12.0f, 6.0f);
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
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            un9.a(dd4Var2, tg9.r(ou6Var3, 24.0f));
            dd4Var2.f0(-211720594);
            String strK = (String) fxbVar.e.getValue();
            if (strK.length() == 0) {
                strK = wn9.K((pv9) iu9.P.getValue(), dd4Var2);
            }
            dd4Var2.q(false);
            nha.c(strK, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var2, 0, 24960, 109560);
            dd4Var2 = dd4Var2;
            if (fxbVar.d() != null) {
                dd4Var2.f0(2027031389);
                p35 p35VarC = i25.c(fxbVar.h() ? (m53) a53.w.getValue() : (m53) f53.a0.getValue(), dd4Var2, 0);
                long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
                ou6Var2 = ou6Var3;
                ou6 ou6VarW2 = t96.w(tg9.n(ou6Var2, 24.0f), rp8Var);
                boolean z3 = ((i3 & 896) == 256) | ((i3 & 14) == 4 || dd4Var2.h(fxbVar)) | ((i3 & 7168) == 2048);
                Object objQ2 = dd4Var2.Q();
                if (z3) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objQ2 == obj) {
                    }
                    mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 2.0f), j2, dd4Var, 48, 0);
                    dd4Var2 = dd4Var;
                    dd4Var2.q(false);
                }
                objQ2 = new ma0(4, fxbVar, ib4Var2, ib4Var);
                dd4Var2.p0(objQ2);
                mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 2.0f), j2, dd4Var, 48, 0);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                obj = obj2;
                ou6Var2 = ou6Var3;
                xv5.y(dd4Var2, 2027558947, ou6Var2, 24.0f, dd4Var2);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            if (fxbVar.h()) {
                dd4Var2.f0(-1248704336);
                br9 br9VarB = an.b(fxbVar.h.h(), (ko) null, (String) null, dd4Var2, 0, 30);
                ou6 ou6VarH = tg9.h(gjb.n0(zn0.a.a(tg9.f(ou6Var2, 1.0f), bv4.u), 12.0f, 0.0f, 2), 2.0f);
                boolean zF = dd4Var2.f(br9VarB);
                Object objQ3 = dd4Var2.Q();
                if (zF || objQ3 == obj) {
                    objQ3 = new op0(br9VarB, 0);
                    dd4Var2.p0(objQ3);
                }
                ib4 ib4Var4 = (ib4) objQ3;
                Object objQ4 = dd4Var2.Q();
                if (objQ4 == obj) {
                    objQ4 = new vi0(9);
                    dd4Var2.p0(objQ4);
                }
                h48.c(ib4Var4, ou6VarH, 0L, 0L, 0, 0.0f, (kb4) objQ4, dd4Var, 1572864, 60);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1248190201);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(fxbVar, ou6Var, ib4Var, ib4Var2, ib4Var3, i2, 1);
        }
    }

    public static final void B(ou6 ou6Var, xp4 xp4Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        long j2;
        xp4Var.getClass();
        float f2 = xp4Var.a;
        yb4Var.getClass();
        dd4Var.h0(363121565);
        int i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var.f(xp4Var) ? 32 : 16) | (dd4Var.h(yb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                j2 = 4294967295L;
                objQ = js8.x(gc1.Z(new lc1(ah1.l(4294967295L)), new lc1(ah1.l(4278190080L))), 0.0f, 14);
                dd4Var.p0(objQ);
            } else {
                j2 = 4294967295L;
            }
            sq0 sq0Var = (sq0) objQ;
            boolean zC = dd4Var.c(f2);
            Object objQ2 = dd4Var.Q();
            if (zC || objQ2 == obj) {
                kb8 kb8VarB = new xi4(f2, 1.0f, 1.0f, 1.0f).b();
                lc1 lc1Var = new lc1(ah1.l(j2));
                int iM = t96.M(kb8VarB.a * 255.0f);
                int iM2 = t96.M(kb8VarB.b * 255.0f);
                int iM3 = t96.M(kb8VarB.c * 255.0f);
                float f3 = kb8VarB.d;
                objQ2 = js8.p(gc1.Z(lc1Var, new lc1(ah1.k(iM, iM2, iM3, t96.M((Float.isNaN(f3) ? 1.0f : f3) * 255.0f)))), 0.0f, 14);
                dd4Var.p0(objQ2);
            }
            sq0 sq0Var2 = (sq0) objQ2;
            ou6 ou6VarE = ou6Var.e(tg9.c);
            boolean z2 = (i3 & 896) == 256;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new zf(yb4Var, 5);
                dd4Var.p0(objQ3);
            }
            ou6 ou6VarB = r1a.b(ou6VarE, heb.a, (PointerInputEventHandler) objQ3);
            boolean zF = dd4Var.f(sq0Var2) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new fb3(21, sq0Var, sq0Var2, xp4Var);
                dd4Var.p0(objQ4);
            }
            s32.F(ou6VarB, (kb4) objQ4, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f47(ou6Var, xp4Var, yb4Var, i2);
        }
    }

    public static final void C(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t89 t89Var, uka ukaVar, String str, boolean z2) {
        int i3;
        ou6 ou6Var2;
        t89 t89Var2;
        uka ukaVar2;
        int i4;
        uka ukaVar3;
        ou6 ou6Var3;
        str.getClass();
        dd4Var.h0(501766555);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var.V(i5 & 1, (74899 & i5) != 74898)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                ur9 ur9Var = s96.a;
                uka ukaVar4 = ((q96) dd4Var.j(ur9Var)).b.j;
                t89Var2 = ((q96) dd4Var.j(ur9Var)).c.b;
                i4 = i5 & (-8065);
                ukaVar3 = ukaVar4;
                ou6Var3 = lu6.a;
            } else {
                dd4Var.Y();
                i4 = i5 & (-8065);
                ou6Var3 = ou6Var;
                t89Var2 = t89Var;
                ukaVar3 = ukaVar;
            }
            dd4Var.r();
            rj1 rj1VarG = jf0.G(1064481900, new i41(z2, str, ukaVar3), dd4Var);
            int i6 = (i4 & Token.ASSIGN_MOD) | 6;
            int i7 = i4 >> 3;
            D(rj1VarG, z2, t89Var2, ou6Var3, ib4Var, dd4Var, (i7 & 57344) | i6 | (i7 & 7168), 0);
            ou6Var2 = ou6Var3;
            ukaVar2 = ukaVar3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            t89Var2 = t89Var;
            ukaVar2 = ukaVar;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k71(i2, ib4Var, ou6Var2, t89Var2, ukaVar2, str, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(defpackage.rj1 r14, boolean r15, t89 r16, ou6 r17, defpackage.ib4 r18, dd4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.D(rj1, boolean, t89, ou6, ib4, dd4, int, int):void");
    }

    public static final void E(int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, String str, boolean z2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-118381471);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new ck0(1, kb4Var, z2);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ, dd4Var2, ou6Var, false);
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
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var2, (i3 >> 3) & 14, 0, 131068);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.r(lu6.a, 12.0f));
            zk9.g(z2, false, null, kb4Var, dd4Var2, i3 & 7182);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z2, str, ou6Var, kb4Var, i2, 1);
        }
    }

    public static final void F(final String str, uka ukaVar, long j2, ou6 ou6Var, final ib4 ib4Var, dd4 dd4Var, final int i2) {
        final uka ukaVar2;
        final long j3;
        final ou6 ou6Var2;
        long j4;
        ou6 ou6Var3;
        uka ukaVar3;
        str.getClass();
        ib4Var.getClass();
        dd4Var.h0(-717110371);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | 3216;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.a0();
            int i4 = i2 & 1;
            ou6 ou6Var4 = lu6.a;
            if (i4 == 0 || dd4Var.C()) {
                ur9 ur9Var = s96.a;
                uka ukaVar4 = ((q96) dd4Var.j(ur9Var)).b.n;
                j4 = ((q96) dd4Var.j(ur9Var)).a.a;
                ou6Var3 = ou6Var4;
                ukaVar3 = ukaVar4;
            } else {
                dd4Var.Y();
                ukaVar3 = ukaVar;
                j4 = j2;
                ou6Var3 = ou6Var;
            }
            dd4Var.r();
            String strConcat = "# ".concat(str);
            ou6 ou6VarL = fe.L(t96.w(ou6Var4, tp8.a), lc1.c(0.2f, j4), jf0.G);
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new m50(27, ib4Var);
                dd4Var.p0(objQ);
            }
            long j5 = j4;
            ou6 ou6Var5 = ou6Var3;
            nha.c(strConcat, gjb.m0(yn2.s(ou6VarL, false, 0.0f, (ib4) objQ, 3), 8.0f, 3.0f).e(ou6Var3), j5, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar3, dd4Var, 0, 0, 131064);
            j3 = j5;
            ukaVar2 = ukaVar3;
            ou6Var2 = ou6Var5;
        } else {
            dd4Var.Y();
            ukaVar2 = ukaVar;
            j3 = j2;
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(str, ukaVar2, j3, ou6Var2, ib4Var, i2) { // from class: x71
                public final /* synthetic */ String a;
                public final /* synthetic */ uka b;
                public final /* synthetic */ long c;
                public final /* synthetic */ ou6 d;
                public final /* synthetic */ ib4 e;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(24577);
                    fz1.F(this.a, this.b, this.c, this.d, this.e, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v27 */
    public static final void G(lnb lnbVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var2;
        ib4 ib4Var5;
        ib4 ib4Var6;
        ?? r3;
        lnb lnbVar2 = lnbVar;
        ib4 ib4Var7 = ib4Var4;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1831659051);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(lnbVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var7) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 1048576 : 524288;
        }
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = i3 >> 3;
            wf0 wf0Var = bv4.w;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 0);
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
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            String str = lnbVar2.a;
            String str2 = lnbVar2.b;
            String str3 = lnbVar2.d;
            String str4 = lnbVar2.e;
            qr1 qr1Var = ra1.d;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarH = tg9.h(tg9.r(lu6Var, 40.0f), 60.0f);
            boolean z2 = lnbVar2.l;
            int i5 = i3;
            boolean z3 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new hpa(27, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarS = yn2.s(ou6VarH, z2, 0.0f, (ib4) objQ, 2);
            ur9 ur9Var = s96.a;
            w05.c(str, str2, str3, str4, qr1Var, t96.w(ou6VarS, ((q96) dd4Var2.j(ur9Var)).c.a), dd4Var2, 24576);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.e, bv4.z, dd4Var2, 6);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            float f2 = 1.0f;
            nha.c(lnbVar2.b, tg9.f(lu6Var, 1.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 24960, 109560);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            lnbVar2 = lnbVar;
            String str5 = lnbVar2.c;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.q;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.l;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            nha.c(str5, yb0.I(new bp5(f2, true), 0.8f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24960, 109560);
            dd4Var2 = dd4Var;
            if (lnbVar2.n) {
                dd4Var2.f0(596228515);
                r3 = 0;
                ib4Var6 = ib4Var2;
                n(i25.c((m53) f53.a0.getValue(), dd4Var2, 0), null, ib4Var6, dd4Var2, i4 & 896);
                dd4Var2.q(false);
            } else {
                ib4Var6 = ib4Var2;
                r3 = 0;
                dd4Var2.f0(596424559);
                dd4Var2.q(false);
            }
            if (lnbVar2.j) {
                ib4Var7 = ib4Var4;
                dd4Var2.f0(596670575);
                dd4Var2.q((boolean) r3);
            } else {
                dd4Var2.f0(596474531);
                ib4Var7 = ib4Var4;
                n(i25.c((m53) f53.Z.getValue(), dd4Var2, r3), null, ib4Var7, dd4Var2, (i5 >> 9) & 896);
                dd4Var2.q((boolean) r3);
            }
            if (lnbVar2.i) {
                dd4Var2.f0(596725011);
                p35 p35VarC = i25.c(lnbVar2.k ? (m53) f53.P.getValue() : (m53) f53.Q.getValue(), dd4Var2, r3);
                int i6 = ((i5 & 14) == 4 ? 1 : r3) | ((i5 & 3670016) == 1048576 ? 1 : r3);
                Object objQ2 = dd4Var2.Q();
                if (i6 != 0 || objQ2 == obj) {
                    kb4Var2 = kb4Var;
                    objQ2 = new nga(10, kb4Var2, lnbVar2);
                    dd4Var2.p0(objQ2);
                } else {
                    kb4Var2 = kb4Var;
                }
                n(p35VarC, null, (ib4) objQ2, dd4Var2, r3);
                dd4Var2.q((boolean) r3);
            } else {
                kb4Var2 = kb4Var;
                dd4Var2.f0(597090191);
                dd4Var2.q((boolean) r3);
            }
            if (lnbVar2.m) {
                dd4Var2.f0(597147355);
                ib4Var5 = ib4Var3;
                n(i25.c((m53) a53.x.getValue(), dd4Var2, r3), null, ib4Var5, dd4Var2, (i5 >> 6) & 896);
                dd4Var2.q((boolean) r3);
            } else {
                ib4Var5 = ib4Var3;
                dd4Var2.f0(597351087);
                dd4Var2.q((boolean) r3);
            }
            tw2.x(dd4Var2, true, true, true);
        } else {
            kb4Var2 = kb4Var;
            ib4Var5 = ib4Var3;
            ib4Var6 = ib4Var2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(lnbVar2, ou6Var, ib4Var, ib4Var6, ib4Var5, ib4Var7, kb4Var2, i2, 10);
        }
    }

    public static final void H(String str, List list, lnb lnbVar, kb4 kb4Var, ou6 ou6Var, pj7 pj7Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var2, dd4 dd4Var, int i2) {
        pj7 pj7Var2;
        ib4 ib4Var5;
        ib4 ib4Var6;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        pj7 pj7Var3;
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        lnbVar.getClass();
        kb4Var.getClass();
        dd4Var2.h0(-2084890563);
        int i5 = (dd4Var2.f(str) ? 4 : 2) | i2 | (dd4Var2.h(list) ? 32 : 16) | (dd4Var2.f(lnbVar) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i5 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        int i6 = i5 | 1769472 | (dd4Var2.h(ib4Var2) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var3) ? 67108864 : 33554432) | (dd4Var2.h(ib4Var4) ? 536870912 : 268435456);
        int i7 = dd4Var2.h(kb4Var2) ? 4 : 2;
        if (dd4Var2.V(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            pj7 rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new dh1(1);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var7 = (ib4) objQ;
            boolean zF = dd4Var2.f(list) | ((i6 & 14) == 4);
            Object objQ2 = dd4Var2.Q();
            if (zF || objQ2 == obj) {
                Iterator it = list.iterator();
                int i8 = 0;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        ib4Var6 = ib4Var7;
                        i3 = -1;
                        break;
                    }
                    Iterator it2 = it;
                    ArrayList arrayList = ((erb) it.next()).b;
                    if (arrayList.isEmpty()) {
                        i4 = i8;
                        ib4Var6 = ib4Var7;
                    } else {
                        i4 = i8;
                        int size = arrayList.size();
                        ib4Var6 = ib4Var7;
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = arrayList.get(i9);
                            i9++;
                            ArrayList arrayList2 = arrayList;
                            if (lc5.Q(((zrb) obj2).a, str)) {
                                i3 = i4;
                                break loop0;
                            }
                            arrayList = arrayList2;
                        }
                    }
                    i8 = i4 + 1;
                    it = it2;
                    ib4Var7 = ib4Var6;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                objQ2 = Integer.valueOf(i3);
                dd4Var2.p0(objQ2);
            } else {
                ib4Var6 = ib4Var7;
            }
            int iIntValue = ((Number) objQ2).intValue();
            boolean zH = dd4Var2.h(list);
            Object objQ3 = dd4Var2.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new fz0(12, list);
                dd4Var2.p0(objQ3);
            }
            pi2 pi2VarB = cl7.b(iIntValue, (ib4) objQ3, dd4Var2, 0, 2);
            int i10 = i6 >> 12;
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            dd4Var2.f0(1625525920);
            lu6 lu6Var = lu6.a;
            ib4 ib4Var8 = ib4Var6;
            G(lnbVar, gjb.m0(gjb.k0(tg9.f(lu6Var, 1.0f), rj7Var), 16.0f, 12.0f), ib4Var8, ib4Var2, ib4Var3, ib4Var4, kb4Var2, dd4Var2, (i10 & 458752) | ((i6 >> 6) & 14) | 384 | (i10 & 7168) | (57344 & i10) | ((i7 << 18) & 3670016));
            if (list.size() > 1) {
                dd4Var2.f0(1625945938);
                K(pi2VarB, list, gjb.m0(tg9.f(lu6Var, 1.0f), 18.0f, 8.0f), dd4Var2, (i6 & Token.ASSIGN_MOD) | 384);
                z2 = false;
                dd4Var2.q(false);
            } else {
                z2 = false;
                dd4Var2.f0(1626189071);
                dd4Var2.q(false);
            }
            if (list.isEmpty()) {
                dd4Var2.q(z2);
                pj7Var3 = rj7Var;
                z3 = true;
            } else {
                z3 = true;
                pj7Var3 = rj7Var;
                e11.e(pi2VarB, xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true), null, null, 0, 0.0f, null, null, false, null, null, null, jf0.G(-1140654668, new ak0(21, str, list, kb4Var), dd4Var2), dd4Var, 0, 16380);
                dd4Var2 = dd4Var;
                dd4Var2.q(z2);
            }
            dd4Var2.q(z3);
            pj7Var2 = pj7Var3;
            ib4Var5 = ib4Var8;
        } else {
            dd4Var2.Y();
            pj7Var2 = pj7Var;
            ib4Var5 = ib4Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new u03(str, list, lnbVar, kb4Var, ou6Var, pj7Var2, ib4Var5, ib4Var2, ib4Var3, ib4Var4, kb4Var2, i2);
        }
    }

    public static final void I(String str, ArrayList arrayList, kb4 kb4Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        kb4 kb4Var2;
        String str2;
        a07 a07Var;
        char c2;
        br9 br9Var;
        br9 br9Var2;
        ArrayList arrayList2;
        Object gpbVar;
        int i3;
        Object[] objArr;
        br9 br9Var3;
        wq5 wq5Var;
        a07 a07Var2;
        kd kdVar;
        br9 br9Var4;
        jm jmVar;
        yb4 yb4Var;
        pj7 pj7Var;
        ou6 ou6Var2;
        Object obj;
        ib4 ib4Var;
        yb4 yb4Var2;
        yb4 yb4Var3;
        boolean z2;
        float f2;
        int i4;
        boolean z3;
        br9 br9Var5;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1900146157);
        int i5 = 2;
        int i6 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(arrayList) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i6 & 1, (i6 & 1171) != 1170)) {
            Object[] objArr2 = new Object[0];
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = new wab(28);
                dd4Var2.p0(objQ);
            }
            a07 a07VarA0 = ww1.a0(objArr2, (ib4) objQ, dd4Var2, 384);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ2);
            }
            br9 br9Var6 = (a07) objQ2;
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj2) {
                objQ3 = dk9.x(arrayList);
                dd4Var2.p0(objQ3);
            }
            br9 br9Var7 = (a07) objQ3;
            Object objQ4 = dd4Var2.Q();
            if (objQ4 == obj2) {
                objQ4 = dk9.x(-1);
                dd4Var2.p0(objQ4);
            }
            a07 a07Var3 = (a07) objQ4;
            wq5 wq5VarA = yq5.a(dd4Var2);
            Object objQ5 = dd4Var2.Q();
            if (objQ5 == obj2) {
                objQ5 = lc5.Z(dd4Var2);
                dd4Var2.p0(objQ5);
            }
            vx1 vx1Var = (vx1) objQ5;
            Object objQ6 = dd4Var2.Q();
            if (objQ6 == obj2) {
                objQ6 = dk9.n(new br5(wq5VarA, 5));
                dd4Var2.p0(objQ6);
            }
            br9 br9Var8 = (br9) objQ6;
            Object objQ7 = dd4Var2.Q();
            if (objQ7 == obj2) {
                objQ7 = dk9.n(new br5(wq5VarA, 6));
                dd4Var2.p0(objQ7);
            }
            br9 br9Var9 = (br9) objQ7;
            Object objQ8 = dd4Var2.Q();
            if (objQ8 == obj2) {
                a07Var = a07VarA0;
                objQ8 = dk9.n(new am6(a07VarA0, a07Var3, br9Var9, br9Var8, 2));
                dd4Var2.p0(objQ8);
            } else {
                a07Var = a07VarA0;
            }
            br9 br9Var10 = (br9) objQ8;
            Object objQ9 = dd4Var2.Q();
            if (objQ9 == obj2) {
                objQ9 = dk9.n(new bm6(2, a07Var, br9Var8));
                dd4Var2.p0(objQ9);
            }
            br9 br9Var11 = (br9) objQ9;
            Object objQ10 = dd4Var2.Q();
            if (objQ10 == obj2) {
                objQ10 = dk9.n(new cm6(a07Var, br9Var7, br9Var9, i5));
                dd4Var2.p0(objQ10);
            }
            br9 br9Var12 = (br9) objQ10;
            Object objQ11 = dd4Var2.Q();
            if (objQ11 == obj2) {
                objQ11 = dk9.n(new x41(br9Var7, a07Var3, 27));
                dd4Var2.p0(objQ11);
            }
            br9 br9Var13 = (br9) objQ11;
            Boolean bool = (Boolean) br9Var6.getValue();
            bool.getClass();
            boolean zF = dd4Var2.f(a07Var) | dd4Var2.h(arrayList);
            Object objQ12 = dd4Var2.Q();
            if (zF || objQ12 == obj2) {
                a07 a07Var4 = a07Var;
                c2 = 5;
                ck7 ck7Var = new ck7(a07Var4, arrayList, (a07) br9Var6, (a07) br9Var7, (jt1) null);
                a07Var = a07Var4;
                br9Var = br9Var6;
                br9Var2 = br9Var7;
                arrayList2 = arrayList;
                dd4Var2.p0(ck7Var);
                objQ12 = ck7Var;
            } else {
                br9Var = br9Var6;
                br9Var2 = br9Var7;
                c2 = 5;
                arrayList2 = arrayList;
            }
            lc5.v(bool, arrayList2, (yb4) objQ12, dd4Var2);
            Integer numValueOf = Integer.valueOf(((List) br9Var2.getValue()).size());
            zrb zrbVar = (zrb) fc1.z0((List) br9Var2.getValue());
            String str3 = zrbVar != null ? zrbVar.a : null;
            Boolean bool2 = (Boolean) br9Var.getValue();
            bool2.getClass();
            Object[] objArr3 = {str, numValueOf, str3, bool2};
            int i7 = i6 & 14;
            boolean zF2 = (i7 == 4) | dd4Var2.f(wq5VarA);
            Object objQ13 = dd4Var2.Q();
            if (zF2 || objQ13 == obj2) {
                i3 = i7;
                objArr = objArr3;
                br9Var3 = br9Var2;
                gpbVar = new gpb(wq5VarA, (a07) br9Var3, str, a07Var3, (jt1) null);
                wq5Var = wq5VarA;
                a07Var2 = a07Var3;
                dd4Var2.p0(gpbVar);
            } else {
                wq5Var = wq5VarA;
                a07Var2 = a07Var3;
                gpbVar = objQ13;
                objArr = objArr3;
                br9Var3 = br9Var2;
                i3 = i7;
            }
            lc5.x(objArr, (yb4) gpbVar, dd4Var2);
            pj7 pj7VarE = yib.e(dd4Var2, 8);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var4 = ll1.f;
            un9.s(yb4Var4, dd4Var2, ie1VarA);
            yb4 yb4Var5 = ll1.e;
            un9.s(yb4Var5, dd4Var2, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf2);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var6 = ll1.d;
            un9.s(yb4Var6, dd4Var2, ou6VarL0);
            int size = arrayList2.size();
            ou6 ou6Var3 = lu6.a;
            int i8 = i3;
            if (size > 10) {
                dd4Var2.f0(892544807);
                br9Var4 = br9Var3;
                kdVar = kdVar2;
                br9 br9VarB = an.b(((Boolean) br9Var.getValue()).booleanValue() ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var2, 0, 30);
                wga wgaVar = (wga) a07Var.getValue();
                String strL = wn9.L((pv9) mu9.a0.getValue(), new Object[]{Integer.valueOf(arrayList2.size())}, dd4Var2);
                long jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f);
                rj1 rj1VarG = jf0.G(2142187590, new lt(4, br9Var, br9VarB), dd4Var2);
                ou6 ou6VarM0 = gjb.m0(tg9.f(ou6Var3, 1.0f), 16.0f, 8.0f);
                boolean zF3 = dd4Var2.f(a07Var);
                Object objQ14 = dd4Var2.Q();
                if (zF3 || objQ14 == obj2) {
                    objQ14 = new w0b(a07Var, 20);
                    dd4Var2.p0(objQ14);
                }
                yb4Var = yb4Var4;
                obj = obj2;
                ib4Var = ib4Var2;
                yb4Var2 = yb4Var5;
                yb4Var3 = yb4Var6;
                i4 = i6;
                z2 = false;
                pj7Var = pj7VarE;
                f2 = 1.0f;
                jmVar = jmVar2;
                ou6Var2 = ou6Var3;
                e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6VarM0, (kb4) objQ14, null, dd4Var2, 1597440, 292);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                kdVar = kdVar2;
                br9Var4 = br9Var3;
                jmVar = jmVar2;
                yb4Var = yb4Var4;
                pj7Var = pj7VarE;
                ou6Var2 = ou6Var3;
                obj = obj2;
                ib4Var = ib4Var2;
                yb4Var2 = yb4Var5;
                yb4Var3 = yb4Var6;
                z2 = false;
                f2 = 1.0f;
                i4 = i6;
                dd4Var2.f0(893496197);
                dd4Var2.q(false);
            }
            ou6 ou6VarF = xv5.f(f2, tg9.f(ou6Var2, f2), true);
            ha6 ha6VarD = pn0.d(bv4.b, z2);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var, dd4Var2, ha6VarD);
            un9.s(yb4Var2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var3, dd4Var2, ou6VarL02);
            yh4 yh4Var = new yh4(100.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            szb szbVarW = yib.w(yib.w(new rj7(16.0f, 8.0f, 16.0f, 8.0f), pj7Var), gjb.q(0.0f, 0.0f, 0.0f, 24.0f, 7));
            ou6 ou6VarF2 = tg9.f(ou6Var2, f2);
            boolean z4 = (i8 == 4 ? true : z2) | ((i4 & 896) == 256 ? true : z2);
            Object objQ15 = dd4Var2.Q();
            if (z4 || objQ15 == obj) {
                str2 = str;
                z3 = z2;
                br9Var5 = br9Var4;
                kb4Var2 = kb4Var;
                objQ15 = new cba(12, br9Var5, str2, kb4Var2);
                dd4Var2.p0(objQ15);
            } else {
                str2 = str;
                z3 = z2;
                br9Var5 = br9Var4;
                kb4Var2 = kb4Var;
            }
            br9 br9Var14 = br9Var5;
            wq5 wq5Var2 = wq5Var;
            pu1.n(yh4Var, ou6VarF2, wq5Var2, szbVarW, mvVar, mvVar2, null, false, (kb4) objQ15, dd4Var, 1769520);
            boolean zBooleanValue = ((Boolean) br9Var10.getValue()).booleanValue();
            xf0 xf0Var = bv4.t;
            zn0 zn0Var = zn0.a;
            kf0.d(zBooleanValue, gjb.p0(gjb.k0(zn0Var.a(ou6Var2, xf0Var), pj7Var), 16.0f, 0.0f, 72.0f, 8.0f, 2), wd3.c((by3) null, 3).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, 3).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(-2089107905, new sz0(vx1Var, wq5Var2, a07Var2, (a07) br9Var14, br9Var13), dd4Var), dd4Var, 200064, 16);
            dd4Var2 = dd4Var;
            kf0.d((((Boolean) br9Var11.getValue()).booleanValue() || ((Boolean) br9Var12.getValue()).booleanValue()) ? true : z3, gjb.p0(gjb.k0(zn0Var.a(ou6Var2, bv4.v), pj7Var), 0.0f, 0.0f, 16.0f, 8.0f, 3), wd3.c((by3) null, 3).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, 3).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(1396994600, new sz0(vx1Var, wq5Var2, br9Var11, br9Var14, br9Var12, 12), dd4Var), dd4Var2, 200064, 16);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            kb4Var2 = kb4Var;
            str2 = str;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yn6(str2, arrayList, kb4Var2, ou6Var, i2);
        }
    }

    public static final void J(vx1 vx1Var, a07 a07Var, wq5 wq5Var, int i2) {
        if (i2 < 0 || i2 >= ((List) a07Var.getValue()).size()) {
            return;
        }
        ah1.J(vx1Var, null, null, new vq5(wq5Var, i2, (jt1) null), 3);
    }

    public static final void K(zk7 zk7Var, List list, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(1941250441);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(zk7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 16;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            qx8.d(zk7Var.k(), ou6Var2, lc1.i, 0L, 0.0f, jf0.G(-1189787479, new oh1(zk7Var, 6), dd4Var), ah1.z, jf0.G(-1238706519, new f47(i4, list, zk7Var, (vx1) objQ), dd4Var), dd4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 14377344, 8);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mx8(zk7Var, list, ou6Var, i2, 1);
        }
    }

    public static final xl7 L(long j2, long j3) {
        long jL0 = sw1.l0(j3);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL0 >> 32));
        int i2 = (int) (jL0 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fP = wx1.P(Float.intBitsToFloat((int) (j2 >> 32)), 0.0f, fIntBitsToFloat);
        float fP2 = wx1.P(Float.intBitsToFloat((int) (j2 & 4294967295L)), 0.0f, Float.intBitsToFloat(i2));
        Float fValueOf = Float.valueOf(wx1.P((1.0f / fIntBitsToFloat) * fP, 0.0f, 1.0f));
        Float fValueOf2 = Float.valueOf(wx1.P(1.0f - ((1.0f / fIntBitsToFloat2) * fP2), 0.0f, 1.0f));
        return new xl7(Float.valueOf(fValueOf.floatValue()), Float.valueOf(fValueOf2.floatValue()));
    }

    public static final void M(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) ((i3 >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i3 >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i3 >> 8) & 255);
        bArr[i2 + 3] = (byte) (i3 & 255);
    }

    public static final void N(b4 b4Var, d29 d29Var) {
        if (md2.p(d29Var)) {
            w19 w19Var = d29Var.d;
            Object objG = w19Var.a.g(u19.i);
            if (objG == null) {
                objG = null;
            }
            n3 n3Var = (n3) objG;
            if (n3Var != null) {
                b4Var.b(new x3(R.id.accessibilityActionSetProgress, n3Var.a));
            }
        }
    }

    public static final ou6 O(ou6 ou6Var, yb4 yb4Var) {
        return ou6Var.e(new n7(yb4Var));
    }

    public static final boolean P(pr9 pr9Var, int i2, ur7 ur7Var) {
        boolean z2;
        synchronized (M) {
            int i3 = pr9Var.d;
            if (i3 == i2) {
                pr9Var.c = ur7Var;
                z2 = true;
                pr9Var.d = i3 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static qo Q(qo qoVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) qoVar.b.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = qoVar.c.a;
        }
        return new qo(qoVar.a, Float.valueOf(f2), new ro(f3), qoVar.d, qoVar.e, qoVar.f);
    }

    public static final String R(String str, yd2 yd2Var) {
        yd2Var.getClass();
        return "Cannot deserialize " + str + " with '" + ug8.a(yd2Var.getClass()).g() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final ou6 S(ou6 ou6Var, kb4 kb4Var, jp8 jp8Var) {
        return ou6Var.e(new b63(kb4Var, jp8Var));
    }

    public static final void T(r43 r43Var) {
        int i2;
        int i3;
        long j2;
        long j3 = lc1.d;
        long j4 = lc1.e;
        r43 r43Var2 = r43Var;
        float fK0 = r43Var2.k0(8.0f);
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (r43Var2.f() >> 32)) / fK0);
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L)) / fK0);
        int i4 = 0;
        while (i4 < iCeil) {
            int i5 = 0;
            while (i5 < iCeil2) {
                if ((i4 + i5) % 2 == 0) {
                    i2 = iCeil;
                    i3 = iCeil2;
                    j2 = j3;
                } else {
                    i2 = iCeil;
                    i3 = iCeil2;
                    j2 = j4;
                }
                long j5 = j3;
                r43.J(r43Var2, j2, (((long) Float.floatToRawIntBits(i4 * fK0)) << 32) | (((long) Float.floatToRawIntBits(i5 * fK0)) & 4294967295L), (((long) Float.floatToRawIntBits(fK0)) & 4294967295L) | (Float.floatToRawIntBits(fK0) << 32), 0.0f, (jw9) null, 120);
                i5++;
                r43Var2 = r43Var;
                iCeil = i2;
                iCeil2 = i3;
                j3 = j5;
                i4 = i4;
            }
            i4++;
            r43Var2 = r43Var;
            j3 = j3;
        }
    }

    public static final String U(String str, md2 md2Var) {
        md2Var.getClass();
        return "Cannot serialize " + str + " with '" + ug8.a(md2Var.getClass()).g() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final float V(float f2, float f3, float f4, float f5, float f6) {
        float f7 = (((f3 - f4) * 3.0f) + f5) - f2;
        return (((((f7 * f6) + (((f4 - (2.0f * f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }

    public static final float W(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        double d2 = f2;
        double d3 = ((d2 - (((double) f3) * 2.0d)) + ((double) f4)) * 3.0d;
        double d4 = ((double) (f3 - f2)) * 3.0d;
        double d5 = (((double) (f3 - f4)) * 3.0d) + ((double) (-f2)) + ((double) f5);
        if (Math.abs(d5 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d3 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f8 = (float) ((-d2) / d4);
                f6 = f8 >= 0.0f ? f8 : 0.0f;
                f7 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f7 - f8) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f7;
            }
            double dSqrt = Math.sqrt((d4 * d4) - ((4.0d * d3) * d2));
            double d6 = d3 * 2.0d;
            float f9 = (float) ((dSqrt - d4) / d6);
            float f10 = f9 < 0.0f ? 0.0f : f9;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (Math.abs(f10 - f9) > 1.05E-6f) {
                f10 = Float.NaN;
            }
            if (!Float.isNaN(f10)) {
                return f10;
            }
            float f11 = (float) (((-d4) - dSqrt) / d6);
            f6 = f11 >= 0.0f ? f11 : 0.0f;
            f7 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f7 - f11) > 1.05E-6f) {
                return Float.NaN;
            }
            return f7;
        }
        double d7 = d3 / d5;
        double d8 = d4 / d5;
        double d9 = d2 / d5;
        double dA = tw2.a(d7, d7, d8 * 3.0d, 9.0d);
        double d10 = ((d9 * 27.0d) + ((((d7 * 2.0d) * d7) * d7) - ((d7 * 9.0d) * d8))) / 54.0d;
        double d11 = dA * dA * dA;
        double d12 = (d10 * d10) + d11;
        double d13 = d7 / 3.0d;
        if (d12 >= 0.0d) {
            if (d12 != 0.0d) {
                double dSqrt2 = Math.sqrt(d12);
                float fJ = (float) (((double) (sw1.J((float) ((-d10) + dSqrt2)) - sw1.J((float) (d10 + dSqrt2)))) - d13);
                f6 = fJ >= 0.0f ? fJ : 0.0f;
                f7 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f7 - fJ) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f7;
            }
            float f12 = -sw1.J((float) d10);
            float f13 = (float) d13;
            float f14 = (2.0f * f12) - f13;
            float f15 = f14 < 0.0f ? 0.0f : f14;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (Math.abs(f15 - f14) > 1.05E-6f) {
                f15 = Float.NaN;
            }
            if (!Float.isNaN(f15)) {
                return f15;
            }
            float f16 = (-f12) - f13;
            f6 = f16 >= 0.0f ? f16 : 0.0f;
            f7 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f7 - f16) > 1.05E-6f) {
                return Float.NaN;
            }
            return f7;
        }
        double dSqrt3 = Math.sqrt(-d11);
        double d14 = (-d10) / dSqrt3;
        if (d14 < -1.0d) {
            d14 = -1.0d;
        }
        if (d14 > 1.0d) {
            d14 = 1.0d;
        }
        double dAcos = Math.acos(d14);
        double dJ = sw1.J((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dJ) - d13);
        float f17 = fCos < 0.0f ? 0.0f : fCos;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - fCos) > 1.05E-6f) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dJ) - d13);
        float f18 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (Math.abs(f18 - fCos2) > 1.05E-6f) {
            f18 = Float.NaN;
        }
        if (!Float.isNaN(f18)) {
            return f18;
        }
        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dJ) - d13);
        f6 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f7 = f6 <= 1.0f ? f6 : 1.0f;
        if (Math.abs(f7 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f7;
    }

    public static final int X(float f2, float f3, float f4, float[] fArr) {
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        if (d6 == 0.0d) {
            if (d3 == d4) {
                return 0;
            }
            return f0((float) ((d5 - d4) / (d5 - (d4 * 2.0d))), fArr, 0);
        }
        double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
        double d8 = (-d2) + d3;
        int iF0 = f0((float) ((-(d7 + d8)) / d6), fArr, 0);
        int iF02 = f0((float) ((d7 - d8) / d6), fArr, iF0) + iF0;
        if (iF02 <= 1) {
            return iF02;
        }
        float f5 = fArr[0];
        float f6 = fArr[1];
        if (f5 <= f6) {
            return f5 == f6 ? iF02 - 1 : iF02;
        }
        fArr[0] = f6;
        fArr[1] = f5;
        return iF02;
    }

    public static final float Y(int i2, float f2) {
        if (Float.isNaN(f2)) {
            return f2;
        }
        double dPow = Math.pow(10.0d, i2);
        return (float) (Math.rint(((double) f2) * dPow) / dPow);
    }

    public static long Z(Context context, int i2) {
        return ah1.j(context.getResources().getColor(i2, context.getTheme()));
    }

    public static final void a(ou6 ou6Var, xp4 xp4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        xp4Var.getClass();
        kb4Var.getClass();
        dd4Var.h0(-2059683852);
        int i3 = i2 | (dd4Var.f(xp4Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            int i4 = i3 & Token.ASSIGN_MOD;
            boolean z2 = i4 == 32;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = js8.p(gc1.Z(new lc1(e11.f0(xp4.a(xp4Var, 0.0f, 0.0f, 0.0f, 1.0f, 7))), new lc1(ah1.j(16777215))), 0.0f, 14);
                dd4Var.p0(objQ);
            }
            sq0 sq0Var = (sq0) objQ;
            ou6 ou6VarE = ou6Var.e(tg9.c);
            boolean z3 = (i3 & 896) == 256;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new t9(0, kb4Var);
                dd4Var.p0(objQ2);
            }
            ou6 ou6VarB = r1a.b(ou6VarE, heb.a, (PointerInputEventHandler) objQ2);
            boolean zF = dd4Var.f(sq0Var) | (i4 == 32);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new p9(sq0Var, xp4Var, 0);
                dd4Var.p0(objQ3);
            }
            s32.F(ou6VarB, (kb4) objQ3, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q9(ou6Var, xp4Var, kb4Var, i2, 0);
        }
    }

    public static final float a0(dp7 dp7Var) {
        float[] fArr = dp7Var.b;
        int iOrdinal = dp7Var.a.ordinal();
        return fArr[iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? (char) 4 : iOrdinal != 4 ? (char) 0 : (char) 6 : (char) 2];
    }

    public static qo b(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new qo(ah1.t0, Float.valueOf(f2), new ro(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final int b0(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static final void c(List list, List list2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(374695177);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.h(list2) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            yh4 yh4Var = new yh4(64.0f);
            rj7 rj7VarO = gjb.o(2, 20.0f);
            rj7 rj7VarQ = gjb.q(0.0f, 0.0f, 12.0f, 0.0f, 11);
            boolean zH = dd4Var.h(list) | ((i3 & 7168) == 2048) | dd4Var.h(list2);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new v6(8, list, list2, kb4Var);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, null, rj7VarO, null, null, null, false, 0L, 0L, rj7VarQ, 0.0f, (kb4) objQ, dd4Var, 3120, 48, 6132);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(list, list2, ou6Var, kb4Var, i2, 12);
        }
    }

    public static final pr9 c0(mk9 mk9Var) {
        pr9 pr9Var = mk9Var.a;
        pr9Var.getClass();
        return vj9.t(pr9Var, mk9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038c  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r62, final defpackage.t27 r63, dd4 r64, int r65) {
        /*
            Method dump skipped, instruction units count: 2456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.d(java.lang.String, t27, dd4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d0(int r4, int r5, defpackage.kt1 r6, java.lang.String r7) {
        /*
            boolean r0 = r6 instanceof defpackage.ty
            if (r0 == 0) goto L13
            r0 = r6
            ty r0 = (defpackage.ty) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ty r0 = new ty
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 2
            if (r1 == 0) goto L3b
            r4 = 1
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2c
            py r4 = r0.a
            nh5 r4 = (defpackage.nh5) r4
            defpackage.e11.e0(r6)
            return r4
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L33:
            py r4 = r0.a
            wg5 r4 = (defpackage.wg5) r4
            defpackage.e11.e0(r6)
            return r4
        L3b:
            defpackage.e11.e0(r6)
            nh5 r6 = new nh5
            r6.<init>(r4, r7, r5)
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = r6.i(r0)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L50
            return r5
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.d0(int, int, kt1, java.lang.String):java.lang.Object");
    }

    public static final void e(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-322879745);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            nha.c(str, gjb.m0(fe.L(t96.w(tg9.f(ou6Var, 1.0f), ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f, 12.0f), ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.h, dd4Var, i3 & 14, 0, 130040);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var, i2, 1);
        }
    }

    public static final void e0(fy0 fy0Var, float f2, float f3, float f4) {
        if (f2 == 0.0f) {
            return;
        }
        fy0Var.p(f3, f4);
        fy0Var.d(f2);
        fy0Var.p(-f3, -f4);
    }

    public static final rc f(ng ngVar) {
        Canvas canvas = sc.a;
        rc rcVar = new rc();
        rcVar.a = new Canvas(q95.a(ngVar));
        return rcVar;
    }

    public static final int f0(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void g(boolean z2, zrb zrbVar, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        long jG;
        long j2;
        long j3;
        long j4;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-257227393);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.f(zrbVar) ? 32 : 16) | 384 | (dd4Var2.h(ib4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            uw1 uw1Var = s00.p(dd4Var2).c;
            ou6Var2 = lu6.a;
            ou6 ou6VarJ = fw.J(null, ib4Var, t96.w(ou6Var2, uw1Var), !z2, 14);
            if (z2) {
                dd4Var2.f0(-839268262);
                jG = s00.o(dd4Var2).a;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-839189212);
                jG = dd1.g(s00.o(dd4Var2), 3.0f);
                dd4Var2.q(false);
            }
            ou6 ou6VarM0 = gjb.m0(fe.L(ou6VarJ, jG, jf0.G), 8.0f, 16.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
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
            if (z2) {
                dd4Var2.f0(-982851915);
                if (z2) {
                    dd4Var2.f0(-982775748);
                    j4 = s00.o(dd4Var2).b;
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-982695396);
                    j4 = s00.o(dd4Var2).q;
                    dd4Var2.q(false);
                }
                ym9.b(j4, 2.0f, 0, tg9.h(ou6Var2, 14.0f), dd4Var2, 3120, 4);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-982529484);
                p35 p35VarC = i25.c((m53) f53.K.getValue(), dd4Var2, 0);
                ou6 ou6VarN = tg9.n(ou6Var2, 14.0f);
                if (z2) {
                    dd4Var2.f0(-982319428);
                    j2 = s00.o(dd4Var2).b;
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-982239076);
                    j2 = s00.o(dd4Var2).q;
                    dd4Var2.q(false);
                }
                mx4.a(p35VarC, (String) null, ou6VarN, j2, dd4Var2, 432, 0);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.r(ou6Var2, 8.0f));
            String str = zrbVar.b;
            if (z2) {
                dd4Var2.f0(-982007196);
                j3 = s00.o(dd4Var2).b;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-981934780);
                j3 = s00.o(dd4Var2).q;
                dd4Var2.q(false);
            }
            nha.c(str, (ou6) null, j3, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z2, zrbVar, ou6Var2, ib4Var, i2, 15);
        }
    }

    public static final void h(int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var, List list) {
        ou6 ou6Var2;
        dd4Var.h0(-1140282736);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | 384;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            wq5 wq5VarA = yq5.a(dd4Var);
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            e(wn9.K((pv9) vt9.a0.getValue(), dd4Var), gjb.m0(ou6Var3, 8.0f, 6.0f), dd4Var, 48);
            zh4 zh4Var = new zh4();
            ou6 ou6VarH = tg9.h(tg9.f(ou6Var3, 1.0f), 320.0f);
            rj7 rj7Var = new rj7(8.0f, 4.0f, 8.0f, 4.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = ((i3 & Token.ASSIGN_MOD) == 32) | dd4Var.h(list);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new qp0(list, kb4Var, 0);
                dd4Var.p0(objQ);
            }
            sw1.g(zh4Var, ou6VarH, wq5VarA, rj7Var, mvVar, mvVar2, (s04) null, false, (ag) null, (kb4) objQ, dd4Var, 1772592);
            dd4Var.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(list, kb4Var, ou6Var2, i2, 9);
        }
    }

    public static final void i(to3 to3Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1994638551);
        int i3 = i2 | (dd4Var2.f(to3Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G), 10.0f, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
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
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            po3 po3Var = new po3(to3Var.r, to3Var.a, to3Var.c);
            qr1 qr1Var = ra1.d;
            lu6 lu6Var = lu6.a;
            w05.a(po3Var, qr1Var, false, null, jv3.c, t96.w(tg9.n(lu6Var, 48.0f), ((q96) dd4Var2.j(ur9Var)).c.c), null, dd4Var2, 196656, 412);
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            nha.c(to3Var.b, tg9.f(lu6Var, 1.0f), lc1.c(0.8f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(to3Var, ou6Var, i2, 9);
        }
    }

    public static final void j(String str, String str2, String str3, String str4, String str5, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        str2.getClass();
        str5.getClass();
        ib4Var.getClass();
        dd4Var2.h0(1846701278);
        int i4 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.f(str3) ? 256 : Token.CASE) | (dd4Var2.f(str4) ? 2048 : 1024) | (dd4Var2.f(str5) ? 16384 : 8192) | (dd4Var2.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i4 & 1, (599187 & i4) != 599186)) {
            boolean z3 = (3670016 & i4) == 1048576;
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new i35(1, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarS = yn2.s(ou6Var, false, 0.0f, (ib4) objQ, 3);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarS);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE0 = sdc.e0(0.6666667f, t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var2).b), false);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            int i5 = i4 & 14;
            int i6 = i4 >> 6;
            w05.d(str, str2, str5, ra1.d, tg9.c, dd4Var2, i5 | 27648 | (i4 & Token.ASSIGN_MOD) | (i6 & 896));
            if (str4.length() > 0) {
                dd4Var2.f0(-2045867743);
                i3 = i6;
                int i7 = ((i4 >> 9) & 14) | 24960;
                z2 = true;
                nha.c(str4, zn0.a.a(gjb.m0(fe.L(gjb.l0(lu6Var, 4.0f), lc1.c(0.8f, lc1.b), s00.p(dd4Var2).a), 4.0f, 2.0f), xf0Var), lc1.e, (g60) null, wn9.x(10), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var2, i7, 0, 130024);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                i3 = i6;
                z2 = true;
                dd4Var2.f0(-2045232088);
                dd4Var2.q(false);
            }
            xv5.z(dd4Var2, z2, lu6Var, 2.0f, dd4Var2);
            nha.c(str, tg9.f(lu6Var, 1.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, i5 | 48, 24960, 109560);
            nha.c(str3, tg9.f(lu6Var, 1.0f), lc1.c(0.6f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, (i3 & 14) | 48, 24960, 109560);
            dd4Var2 = dd4Var;
            xv5.A(lu6Var, 12.0f, dd4Var2, z2);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(str, str2, str3, str4, str5, ou6Var, ib4Var, i2, 3);
        }
    }

    public static final void k(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-13406421);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            lu6 lu6Var = lu6.a;
            ah1.r(sdc.e0(0.6666667f, tg9.f(lu6Var, 1.0f), false), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            vf0 vf0Var = bv4.A;
            ah1.r(tg9.h(tg9.f(new xo4(vf0Var), 1.0f), 20.0f), null, dd4Var, 0, 2);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            ah1.r(tg9.h(tg9.f(new xo4(vf0Var), 0.8f), 20.0f), null, dd4Var, 0, 2);
            xv5.A(lu6Var, 12.0f, dd4Var, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 9);
        }
    }

    public static final void l(ji0 ji0Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        String str;
        zn0 zn0Var;
        n58 n58Var;
        float f2;
        dd4 dd4Var2 = dd4Var;
        ji0Var.getClass();
        String str2 = ji0Var.e;
        String str3 = ji0Var.a;
        ib4Var.getClass();
        dd4Var2.h0(-1100506809);
        int i3 = i2 | (dd4Var2.f(ji0Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new i35(3, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarS = yn2.s(ou6Var, false, 0.0f, (ib4) objQ, 3);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarS);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            n58 n58Var2 = s96.a;
            ou6 ou6VarE0 = sdc.e0(0.6666667f, t96.w(ou6VarF, ((q96) dd4Var2.j(n58Var2)).c.b), false);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            w05.d(str3, ji0Var.b, ji0Var.c, ra1.d, tg9.c, dd4Var2, 27648);
            int length = str2.length();
            zn0 zn0Var2 = zn0.a;
            if (length > 0) {
                dd4Var2.f0(-112458445);
                f2 = 0.0f;
                str = str3;
                n58Var = n58Var2;
                zn0Var = zn0Var2;
                nha.c(str2, zn0Var2.a(gjb.m0(fe.L(gjb.l0(lu6Var, 4.0f), lc1.c(0.8f, lc1.b), ((q96) dd4Var2.j(n58Var2)).c.a), 4.0f, 2.0f), xf0Var), lc1.e, (g60) null, wn9.x(10), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(n58Var2)).b.l, dd4Var, 24960, 0, 130024);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                str = str3;
                zn0Var = zn0Var2;
                n58Var = n58Var2;
                f2 = 0.0f;
                dd4Var2.f0(-111817985);
                dd4Var2.q(false);
            }
            long j2 = lc1.e;
            uka ukaVar = ((q96) dd4Var2.j(n58Var)).b.l;
            ou6 ou6VarA = zn0Var.a(tg9.f(lu6Var, 1.0f), bv4.u);
            Float fValueOf = Float.valueOf(f2);
            long j3 = lc1.b;
            nha.c(str, gjb.l0(fe.K(ou6VarA, js8.y(new xl7[]{new xl7(fValueOf, new lc1(lc1.c(f2, j3))), new xl7(Float.valueOf(0.4f), new lc1(lc1.c(0.6f, j3))), new xl7(Float.valueOf(1.0f), new lc1(lc1.c(1.0f, j3)))})), 4.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 2, 0, (kb4) null, ukaVar, dd4Var, 384, 24960, 109560);
            dd4Var2 = dd4Var;
            xv5.z(dd4Var2, true, lu6Var, 12.0f, dd4Var2);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new h75(ji0Var, ou6Var, ib4Var, i2, 1);
        }
    }

    public static final void m(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(126380);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            lu6 lu6Var = lu6.a;
            ah1.r(sdc.e0(0.6666667f, tg9.f(lu6Var, 1.0f), false), null, dd4Var, 6, 2);
            xv5.A(lu6Var, 12.0f, dd4Var, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 6);
        }
    }

    public static final void n(p35 p35Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(1177215240);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(p35Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(gjb.l0(tg9.n(ou6Var3, 36.0f), 4.0f), tp8.a);
            boolean z2 = (i4 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new hpa(28, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            ur9 ur9Var = s96.a;
            mx4.a(p35Var, (String) null, gjb.l0(fe.L(ou6VarJ, lc1.c(0.1f, ((q96) dd4Var.j(ur9Var)).a.q), jf0.G), 4.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, (i4 & 14) | 48, 0);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(p35Var, ou6Var2, ib4Var, i2, 24);
        }
    }

    public static final void o(bp0 bp0Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        lu6 lu6Var;
        bp0 bp0Var2 = bp0Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-228606651);
        int i3 = i2 | (dd4Var2.f(bp0Var2) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarL0 = gjb.l0(fe.L(t96.w(ou6Var, s00.p(dd4Var2).c), dd1.g(s00.o(dd4Var2), 1.0f), jf0.G), 16.0f);
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
            int length = bp0Var2.a.length();
            lu6 lu6Var2 = lu6.a;
            if (length > 0) {
                dd4Var2.f0(-784391292);
                lu6Var = lu6Var2;
                nha.c(bp0Var2.a, tg9.f(lu6Var2, 1.0f), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var).j, dd4Var, 48, 24960, 110584);
                xv5.A(lu6Var, 8.0f, dd4Var, false);
            } else {
                lu6Var = lu6Var2;
                dd4Var2.f0(-784019385);
                dd4Var2.q(false);
            }
            bp0Var2 = bp0Var;
            nha.c(bp0Var2.b, tg9.f(lu6Var, 1.0f), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 48, 24960, 110584);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(bp0Var2, ou6Var, i2, 8);
        }
    }

    public static final void p(ji0 ji0Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        yb4 yb4Var;
        yb4 yb4Var2;
        jm jmVar;
        kd kdVar;
        ib4 ib4Var2;
        ou6 ou6Var2;
        int i3;
        ji0 ji0Var2 = ji0Var;
        dd4 dd4Var2 = dd4Var;
        ji0Var2.getClass();
        String str = ji0Var2.e;
        String str2 = ji0Var2.a;
        ib4Var.getClass();
        dd4Var2.h0(1142614730);
        int i4 = i2 | (dd4Var2.f(ji0Var2) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarL = fe.L(t96.w(ou6Var, s00.p(dd4Var2).d), dd1.g(s00.o(dd4Var2), 1.0f), jf0.G);
            boolean z2 = (i4 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new i35(2, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.s(ou6VarL, false, 0.0f, (ib4) objQ, 3), 12.0f, 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
            ml1.k.getClass();
            ib4 ib4Var3 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var3);
            } else {
                dd4Var2.s0();
            }
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var2, eq8VarA);
            yb4 yb4Var3 = ll1.e;
            un9.s(yb4Var3, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var4 = ll1.d;
            un9.s(yb4Var4, dd4Var2, ou6VarL0);
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarE0 = sdc.e0(0.6666667f, t96.w(tg9.r(ou6Var3, 56.0f), s00.p(dd4Var2).b), false);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var3);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, ha6VarD);
            un9.s(yb4Var3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar2);
            un9.s(yb4Var4, dd4Var2, ou6VarL02);
            w05.d(str2, ji0Var2.b, ji0Var2.c, ra1.d, tg9.c, dd4Var2, 27648);
            if (str.length() > 0) {
                dd4Var2.f0(1217778819);
                jmVar = jmVar3;
                kdVar = kdVar2;
                ib4Var2 = ib4Var3;
                i3 = 0;
                yb4Var2 = yb4Var4;
                yb4Var = yb4Var3;
                ou6Var2 = ou6Var3;
                nha.c(str, zn0.a.a(gjb.m0(fe.L(gjb.l0(ou6Var3, 4.0f), lc1.c(0.8f, lc1.b), s00.p(dd4Var2).a), 4.0f, 2.0f), xf0Var), lc1.e, (g60) null, wn9.x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var, 24960, 0, 130024);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                yb4Var = yb4Var3;
                yb4Var2 = yb4Var4;
                jmVar = jmVar3;
                kdVar = kdVar2;
                ib4Var2 = ib4Var3;
                ou6Var2 = ou6Var3;
                i3 = 0;
                dd4Var2.f0(1218418318);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(ou6Var2, 14.0f));
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, i3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, ie1VarA);
            un9.s(yb4Var, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var2, dd4Var2, ou6VarL03);
            nha.c(str2, tg9.f(ou6Var2, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).i, dd4Var, 48, 24960, 109564);
            un9.a(dd4Var, tg9.h(ou6Var2, 6.0f));
            ji0Var2 = ji0Var;
            nha.c(ji0Var2.d, tg9.f(ou6Var2, 1.0f), lc1.c(0.5f, ((lc1) dd4Var.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 48, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new h75(ji0Var2, ou6Var, ib4Var, i2, 0);
        }
    }

    public static final void q(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-277581265);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 12.0f, 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM0);
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
            un9.s(jmVar4, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ah1.r(sdc.e0(0.6666667f, t96.w(tg9.r(lu6Var, 56.0f), ((q96) dd4Var.j(ur9Var)).c.b), false), null, dd4Var, 0, 2);
            bp5 bp5VarF = j39.f(lu6Var, 14.0f, dd4Var, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, bp5VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ah1.r(tg9.h(tg9.f(lu6Var, 0.9f), 18.0f), null, dd4Var, 6, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 6.0f, dd4Var, lu6Var, 1.0f), 14.0f), null, dd4Var, 6, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 0.6f), 14.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 7);
        }
    }

    public static final void r(ji0 ji0Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        ji0Var.getClass();
        ib4Var.getClass();
        dd4Var2.h0(757247947);
        int i3 = i2 | (dd4Var2.f(ji0Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new i35(4, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.s(ou6VarL, false, 0.0f, (ib4) objQ, 3), 12.0f, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
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
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            String str = ji0Var.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.i;
            lu6 lu6Var = lu6.a;
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ukaVar, dd4Var2, 48, 24960, 109564);
            un9.a(dd4Var2, tg9.h(lu6Var, 6.0f));
            nha.c(ji0Var.d, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, 48, 24960, 109560);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new h75(ji0Var, ou6Var, ib4Var, i2, 2);
        }
    }

    public static final void s(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-806500304);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 12.0f, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM0);
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
            lu6 lu6Var = lu6.a;
            ah1.r(tg9.h(tg9.f(lu6Var, 0.92f), 18.0f), null, dd4Var, 6, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 6.0f, dd4Var, lu6Var, 1.0f), 14.0f), null, dd4Var, 6, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 0.7f), 14.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(ou6 r29, boolean r30, float r31, dd4 r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.t(ou6, boolean, float, dd4, int, int):void");
    }

    public static final long u(float f2, float f3, float f4, float f5, float f6, float f7, bf6 bf6Var) {
        float f8 = bf6Var.a;
        float f9 = bf6Var.b;
        float f10 = f8 + f9;
        float f11 = (0.4f * f10) + 0.8f;
        float f12 = f10 * 1.5f * 3.1415927f;
        float fSin = (bf6Var.c * ((float) Math.sin((((f8 * 0.5f) + 1.0f) * f2) + (2.0f * f8 * 3.1415927f)))) + f8;
        float fCos = (bf6Var.d * ((float) Math.cos((((0.6f * f9) + 1.2f) * f2) + (3.0f * f9 * 3.1415927f)))) + f9;
        float f13 = bf6Var.a - 0.5f;
        float f14 = f9 - 0.5f;
        float fSqrt = ((f3 * 1.6f) - (((float) Math.sqrt((f14 * f14) + (f13 * f13))) * ((float) Math.sqrt(2.0d)))) / 0.25f;
        float fB = 0.0f;
        if (f3 > 0.0f && 0.0f <= fSqrt && fSqrt <= 1.0f) {
            fB = tw2.b(f3, 0.5f, 1.0f, ((float) Math.sin(fSqrt * 3.1415927f)) * 0.35f);
        }
        float fSin2 = (bf6Var.f * ((float) Math.sin((f2 * f11) + f12))) + fB;
        float f15 = (fCos - 0.5f) * 2.8f;
        float fCos2 = (((float) Math.cos(0.1745329350233078d)) * f15) - (((float) Math.sin(0.1745329350233078d)) * fSin2);
        float fCos3 = (fSin2 * ((float) Math.cos(0.1745329350233078d))) + (f15 * ((float) Math.sin(0.1745329350233078d)));
        float f16 = bf6Var.e * 60.0f;
        float f17 = 1.6f / (1.6f - fCos3);
        float f18 = f5 * f16;
        return (((long) Float.floatToRawIntBits((f16 * f7) + (f6 * 0.5f) + (fCos2 * f17 * f6 * 0.48f))) & 4294967295L) | (Float.floatToRawIntBits(f18 + ((f4 * 0.5f) + (((((fSin - 0.5f) * 3.8f) * f17) * f4) * 0.48f))) << 32);
    }

    public static final void v(final boolean z2, final boolean z3, final String str, final List list, final lnb lnbVar, final kb4 kb4Var, final kb4 kb4Var2, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final kb4 kb4Var3, dd4 dd4Var, final int i2) {
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        lnbVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-2020880195);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.g(z3) ? 32 : 16) | (dd4Var2.f(str) ? 256 : Token.CASE) | (dd4Var2.h(list) ? 2048 : 1024) | (dd4Var2.f(lnbVar) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288) | (dd4Var2.h(ib4Var) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var2) ? 67108864 : 33554432) | (dd4Var2.h(ib4Var3) ? 536870912 : 268435456);
        if (!dd4Var2.V(i3 & 1, ((306783379 & i3) == 306783378 && ((dd4Var2.h(kb4Var3) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            dd4Var2.Y();
        } else if (z3) {
            dd4Var2.f0(-1484868854);
            fw.r(z2, kb4Var, null, false, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-405177271, new bpb(str, list, lnbVar, kb4Var2, ib4Var, ib4Var2, ib4Var3, kb4Var3), dd4Var2), dd4Var, (i3 & 14) | 805306368 | ((i3 >> 12) & Token.ASSIGN_MOD), 508);
            dd4Var.q(false);
            dd4Var2 = dd4Var;
        } else {
            dd4Var2.f0(-1484225201);
            px3 px3Var = tg9.c;
            rj1 rj1VarG = jf0.G(1582175031, new noa(z2, kb4Var, str, list, lnbVar, kb4Var2, ib4Var, ib4Var2, ib4Var3, kb4Var3), dd4Var2);
            dd4Var2 = dd4Var2;
            sdc.e(px3Var, null, rj1VarG, dd4Var2, 3078, 6);
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z2, z3, str, list, lnbVar, kb4Var, kb4Var2, ib4Var, ib4Var2, ib4Var3, kb4Var3, i2) { // from class: cpb
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ List d;
                public final /* synthetic */ lnb e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ ib4 t;
                public final /* synthetic */ ib4 u;
                public final /* synthetic */ ib4 v;
                public final /* synthetic */ kb4 w;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    fz1.v(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void w(boolean z2, boolean z3, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1980498286);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.g(z3) ? 32 : 16) | (dd4Var.f(ou6Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            tw1.m(0L, tg9.n(ou6Var, 200.0f), jf0.G(-1376679390, new rp0(z2, kb4Var, z3, kb4Var2, ib4Var), dd4Var), dd4Var, 384, 1);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(z2, z3, ou6Var, kb4Var, kb4Var2, ib4Var, i2);
        }
    }

    public static final void x(boolean z2, final ib4 ib4Var, final boolean z3, final boolean z4, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, final ib4 ib4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(-95198439);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.g(z3) ? 256 : Token.CASE) | (dd4Var.g(z4) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(kb4Var2) ? 1048576 : 524288) | (dd4Var.h(ib4Var2) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            kf0.d(z2, ou6Var, wd3.c((by3) null, 3), wd3.d((by3) null, 3), (String) null, jf0.G(-1880644799, new zb4() { // from class: yp0
                @Override // defpackage.zb4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    dd4 dd4Var2 = (dd4) obj2;
                    ((Integer) obj3).getClass();
                    ((co) obj).getClass();
                    ou6 ou6VarL = fe.L(tg9.c, lc1.c(0.1f, lc1.b), jf0.G);
                    ib4 ib4Var3 = ib4Var;
                    boolean zF = dd4Var2.f(ib4Var3);
                    Object objQ = dd4Var2.Q();
                    if (zF || objQ == vl1.a) {
                        objQ = new m50(10, ib4Var3);
                        dd4Var2.p0(objQ);
                    }
                    ou6 ou6VarV = yn2.V(1, (ib4) objQ, dd4Var2, ou6VarL, false);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
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
                    un9.s(ll1.f, dd4Var2, ha6VarD);
                    un9.s(ll1.e, dd4Var2, lr7VarL);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL0);
                    boolean zA = xzb.a(dd4Var2);
                    boolean z5 = z3;
                    boolean z6 = z4;
                    kb4 kb4Var3 = kb4Var;
                    kb4 kb4Var4 = kb4Var2;
                    ib4 ib4Var4 = ib4Var2;
                    lu6 lu6Var = lu6.a;
                    zn0 zn0Var = zn0.a;
                    if (zA) {
                        dd4Var2.f0(108920880);
                        fz1.w(z5, z6, yn2.y(dd4Var2, t96.w(gjb.p0(gjb.l0(zn0Var.a(lu6Var, bv4.v), 24.0f), 0.0f, 0.0f, 0.0f, 52.0f, 7), ((q96) dd4Var2.j(s96.a)).c.b)), kb4Var3, kb4Var4, ib4Var4, dd4Var2, 0);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(109489110);
                        fz1.w(z5, z6, yn2.y(dd4Var2, t96.w(gjb.p0(gjb.l0(zn0Var.a(lu6Var, bv4.d), 24.0f), 0.0f, 64.0f, 0.0f, 0.0f, 13), ((q96) dd4Var2.j(s96.a)).c.b)), kb4Var3, kb4Var4, ib4Var4, dd4Var2, 0);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i3 & 14) | 200112, 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zp0(z2, ib4Var, z3, z4, ou6Var, kb4Var, kb4Var2, ib4Var2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final boolean r35, final boolean r36, final boolean r37, ou6 r38, defpackage.ib4 r39, defpackage.ib4 r40, defpackage.ib4 r41, defpackage.ib4 r42, defpackage.ib4 r43, dd4 r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.y(boolean, boolean, boolean, ou6, ib4, ib4, ib4, ib4, ib4, dd4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x061f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final boolean r51, final boolean r52, final boolean r53, final boolean r54, final java.lang.String r55, final java.lang.String r56, ou6 r57, defpackage.ib4 r58, defpackage.ib4 r59, defpackage.ib4 r60, defpackage.ib4 r61, defpackage.ib4 r62, defpackage.ib4 r63, defpackage.ib4 r64, defpackage.ib4 r65, dd4 r66, final int r67, final int r68) {
        /*
            Method dump skipped, instruction units count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.z(boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, ou6, ib4, ib4, ib4, ib4, ib4, ib4, ib4, ib4, dd4, int, int):void");
    }
}
