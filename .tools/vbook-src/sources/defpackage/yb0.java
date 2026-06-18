package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yb0 {
    public static final rj1 A;
    public static final rj1 B;
    public static final rj1 C;
    public static final rj1 D;
    public static final rj1 E;
    public static final Class[] F;
    public static final y89 G;
    public static final float H;
    public static final Object I;
    public static final String[] J;
    public static final int[] K;
    public static final int[] L;
    public static final int[] M;
    public static final int[] N;
    public static final int[] O;
    public static final int[] P;
    public static final hp Q;
    public static final hp R;
    public static final hp S;
    public static final hp T;
    public static ExecutorService a;
    public static final rj1 j;
    public static final rj1 k;
    public static final rj1 n;
    public static final rj1 p;
    public static final rj1 q;
    public static final rj1 r;
    public static final rj1 s;
    public static final rj1 u;
    public static final rj1 v;
    public static final rj1 w;
    public static final rj1 x;
    public static final rj1 y;
    public static final rj1 z;
    public static final uf0 b = new uf0(-1.0f);
    public static final uf0 c = new uf0(1.0f);
    public static final fp4 d = new fp4(0, (yb4) null);
    public static final fp4 e = new fp4(1, (yb4) null);
    public static final rj1 f = new rj1(new ak1(3), false, 1937612688);
    public static final rj1 g = new rj1(new ak1(4), false, 1888813113);
    public static final rj1 h = new rj1(new dk1(8), false, 1239523763);
    public static final rj1 i = new rj1(new dk1(9), false, -849669014);
    public static final rj1 l = new rj1(new ik1(11), false, 917903060);
    public static final rj1 m = new rj1(new ik1(12), false, 369952416);
    public static final rj1 o = new rj1(new jk1(22), false, 1152858937);
    public static final rj1 t = new rj1(new kk1(20), false, 425654941);

    static {
        int i2 = 17;
        j = new rj1(new hk1(i2), false, -1515209349);
        int i3 = 18;
        k = new rj1(new hk1(i3), false, 1862854360);
        int i4 = 19;
        n = new rj1(new vj1(i4), false, -103819633);
        p = new rj1(new kk1(i2), false, -1554261322);
        q = new rj1(new kk1(i3), false, 1561709139);
        int i5 = 23;
        r = new rj1(new jk1(i5), false, 1183190351);
        s = new rj1(new kk1(i4), false, -984436710);
        int i6 = 24;
        u = new rj1(new jk1(i6), false, -473090783);
        new rj1(new lk1(i5), false, -39202156);
        v = new rj1(new lk1(i6), false, 1582488484);
        w = new rj1(new lk1(25), false, 414328099);
        x = new rj1(new lk1(26), false, -1514016380);
        int i7 = 13;
        y = new rj1(new qk1(i7), false, -1381350708);
        z = new rj1(new qk1(14), false, 1069980878);
        A = new rj1(new qk1(15), false, 2142683317);
        B = new rj1(new qk1(16), false, -64708041);
        C = new rj1(new qk1(i2), false, -1493901100);
        D = new rj1(new qk1(i3), false, 593674838);
        E = new rj1(new pk1(i7), false, -166484791);
        F = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        G = y89.d;
        H = 56.0f;
        I = new Object();
        J = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        K = new int[]{44100, 48000, 32000};
        L = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
        M = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
        N = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
        O = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
        P = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
        Q = new hp(5);
        R = new hp(2);
        S = new hp(0);
        T = new hp(3);
    }

    public static final boolean A(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final boolean B(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }

    public static final String C(a07 a07Var) {
        return (String) a07Var.getValue();
    }

    public static final void D(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-794557938);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130040);
            sdc.y(tg9.n(lu6Var, 48.0f), ((q96) dd4Var.j(ur9Var)).a.q, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new hpa(22, ib4Var);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var, 0, 4);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 15);
        }
    }

    public static final void E(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1613263548);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new ho4(str, 20);
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
            a91 a91VarA = ug8.a(rab.class);
            rab rabVar = (rab) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(rabVar);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new nx9(rabVar, 13);
                dd4Var.p0(objQ2);
            }
            lx1.g(rabVar, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(rabVar.j0, dd4Var);
            a07 a07VarB2 = bx1.B(rabVar.V0, dd4Var);
            ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
            boolean zF2 = dd4Var.f((yba) a07VarB.getValue()) | dd4Var.f(ad1Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                boolean z3 = ((yba) a07VarB.getValue()).a.length() == 0;
                objQ3 = dk9.x(new lra(z3, ((yba) a07VarB.getValue()).g, z3 ? ad1Var.q : kf0.H(((yba) a07VarB.getValue()).d), z3 ? ad1Var.p : kf0.H(((yba) a07VarB.getValue()).e), ((yba) a07VarB.getValue()).f, qu1.X(((yba) a07VarB.getValue()).h)));
                dd4Var.p0(objQ3);
            }
            a07 a07Var = (a07) objQ3;
            a07 a07VarB3 = bx1.B(rabVar.p0, dd4Var);
            WeakHashMap weakHashMap = pzb.w;
            z85 z85VarR = jv3.r(ju7.i(dd4Var).b, dd4Var);
            boolean zF3 = dd4Var.f((yba) a07VarB.getValue());
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                rj7 rj7Var = new rj7(((yba) a07VarB.getValue()).D, ((yba) a07VarB.getValue()).F, ((yba) a07VarB.getValue()).E, ((yba) a07VarB.getValue()).G);
                dd4Var.p0(rj7Var);
                objQ4 = rj7Var;
            }
            a07 a07VarB4 = bx1.B(rabVar.q0, dd4Var);
            fx1.p(((yba) a07VarB.getValue()).o, ((yba) a07VarB.getValue()).r, ((yba) a07VarB.getValue()).p, ((yba) a07VarB.getValue()).q, dd4Var, 0);
            dd4Var2 = dd4Var;
            hn9.h((lra) a07Var.getValue(), jf0.G(-1249657236, new sab(rabVar, ou6Var, z85VarR, t27Var, (pj7) objQ4, a07Var, a07VarB2, a07VarB3, a07VarB, a07VarB4), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(float r34, float r35, float r36, int r37, ou6 r38, defpackage.kb4 r39, defpackage.ib4 r40, dd4 r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.F(float, float, float, int, ou6, kb4, ib4, dd4, int, int):void");
    }

    public static final int G(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final ArrayList H(List list, ib4 ib4Var) {
        ub7 ub7Var;
        if (!((Boolean) ib4Var.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ca6 ca6Var = (ca6) list.get(i2);
            Object objF = ca6Var.F();
            objF.getClass();
            gj1 gj1Var = ((qja) objF).a;
            wha whaVar = (wha) gj1Var.b;
            ap apVar = (ap) gj1Var.c;
            qha qhaVar = (qha) whaVar.a.getValue();
            if (qhaVar == null) {
                ub7Var = new ub7(0, new nda(4), 0);
            } else {
                ap apVarC = wha.c(apVar, qhaVar);
                if (apVarC == null) {
                    ub7Var = new ub7(0, new nda(5), 0);
                } else {
                    ia5 ia5VarR = lw1.R(qhaVar.i(apVarC.b, apVarC.c).g());
                    ub7Var = new ub7(ia5VarR.e(), new o39(ia5VarR, 21), ia5VarR.b());
                }
            }
            int i3 = ub7Var.a;
            int i4 = ub7Var.b;
            arrayList.add(new xl7(ca6Var.C(t96.C(i3, i3, i4, i4)), (ib4) ub7Var.c));
        }
        return arrayList;
    }

    public static final ou6 I(ou6 ou6Var, float f2) {
        return f2 == 1.0f ? ou6Var : kl8.X(ou6Var, 0.0f, 0.0f, f2, 0.0f, 0.0f, null, true, 520187);
    }

    public static final List J(si9 si9Var, Integer num, int i2, Integer num2) {
        int iG;
        int iS;
        kz6 kz6Var;
        if (si9Var.w || si9Var.p() == 0) {
            return lc3.a;
        }
        be8 be8Var = new be8(si9Var);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = si9Var.v;
            if (iG < 0) {
                iG = si9Var.G(i2, si9Var.b);
            }
        }
        if (num == null) {
            int iP = si9Var.i - si9Var.P(si9Var.r(i2), si9Var.b);
            wy6 wy6Var = si9Var.s;
            num = Integer.valueOf(iP + ((wy6Var == null || (kz6Var = (kz6) wy6Var.b(i2)) == null) ? 0 : kz6Var.b));
        }
        int iR = si9Var.r(i2) * 5;
        int[] iArr = si9Var.b;
        if (iR < iArr.length) {
            iS = si9Var.s(i2);
        } else {
            int iG2 = iG >= 0 ? si9Var.G(iG, iArr) : iG;
            iS = si9Var.s(iG);
            int i3 = iG;
            iG = iG2;
            i2 = i3;
        }
        while (i2 >= 0) {
            be8Var.y(iS, (si9Var.b[(si9Var.r(i2) * 5) + 1] & 536870912) != 0 ? si9Var.t(i2) : vl1.a, si9Var.Q(i2), num);
            num = si9Var.b(i2);
            if (iG >= 0) {
                int iG3 = si9Var.G(iG, si9Var.b);
                iS = si9Var.s(iG);
                int i4 = iG;
                iG = iG3;
                i2 = i4;
            } else {
                i2 = iG;
            }
        }
        return (ArrayList) ((yf1) be8Var).a;
    }

    public static final boolean K(Object obj) {
        if (obj instanceof ak9) {
            ak9 ak9Var = (ak9) obj;
            if (ak9Var.d() == s00.t || ak9Var.d() == lr3.B || ak9Var.d() == ra1.C) {
                Object value = ak9Var.getValue();
                if (value == null) {
                    return true;
                }
                return K(value);
            }
        } else if (!(obj instanceof ub4) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (F[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static g93 L(qg3 qg3Var, b93 b93Var) {
        vx3 vx3Var;
        if (qg3Var.f()) {
            a91 a91VarA = ug8.a(b93.class);
            qg3Var.e();
            vx3Var = new vx3(f39.n0(new c77(b93Var, a91VarA)), true, new gg3(qg3Var, b93Var, 0));
        } else {
            qg3Var.e();
            vx3Var = new vx3(f39.n0(new c77(b93Var, ug8.a(b93.class))), true, new gg3(qg3Var, b93Var, 1));
        }
        g93 g93Var = new g93();
        Iterator it = vx3Var.iterator();
        while (true) {
            ux3 ux3Var = (ux3) it;
            if (!ux3Var.hasNext()) {
                qg3Var.e();
                return g93Var;
            }
            g93Var.add(ux3Var.next());
        }
    }

    public static final Integer M(ni9 ni9Var, km1 km1Var, int i2, int i3) {
        Integer numM;
        int[] iArr = ni9Var.b;
        while (true) {
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (ni9Var.j(i2) && ni9Var.i(i2) == 206 && lc5.Q(ni9Var.p(i2, iArr), zl1.e)) {
                Object objH = ni9Var.h(i2, 0);
                hd4 hd4Var = objH instanceof hd4 ? (hd4) objH : null;
                wh8 wh8Var = hd4Var != null ? hd4Var.a : null;
                ad4 ad4Var = wh8Var instanceof ad4 ? (ad4) wh8Var : null;
                if (ad4Var != null && ad4Var.a == km1Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (ni9Var.d(i2) && (numM = M(ni9Var, km1Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(numM.intValue());
            }
            i2 = i4;
        }
    }

    public static synchronized Executor N() {
        try {
            if (a == null) {
                final String str = "ExoPlayer:BackgroundExecutor";
                String str2 = hjb.a;
                final int i2 = 1;
                a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: jn1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i3 = i2;
                        String str3 = str;
                        switch (i3) {
                            case 0:
                                Thread thread = new Thread(runnable, str3);
                                thread.setPriority(10);
                                return thread;
                            default:
                                return new Thread(runnable, str3);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.wx r8, defpackage.kt1 r9) {
        /*
            boolean r0 = r9 instanceof xx
            if (r0 == 0) goto L13
            r0 = r9
            xx r0 = (xx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xx r0 = new xx
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            long r0 = r0.b
            defpackage.e11.e0(r9)
            goto L5b
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L33:
            wx r8 = r0.a
            defpackage.e11.e0(r9)
            goto L47
        L39:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r8.e(r0)
            if (r9 != r5) goto L47
            goto L59
        L47:
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            r0.a = r2
            r0.b = r6
            r0.d = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r5) goto L5a
        L59:
            return r5
        L5a:
            r0 = r6
        L5b:
            java.lang.Number r9 = (java.lang.Number) r9
            long r8 = r9.longValue()
            long r0 = r0 - r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.O(wx, kt1):java.lang.Object");
    }

    public static int P(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = K[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? L[i5 - 1] : M[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? N[i5 - 1] : O[i5 - 1] : P[i5 - 1];
        int i10 = Token.LABEL;
        if (i3 == 3) {
            return xv5.a(i9, Token.LABEL, i7, i8);
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return xv5.a(i10, i9, i7, i8);
    }

    public static px0 Q(nx0 nx0Var) {
        mx0 mx0Var = new mx0();
        mx0Var.c = new zk8();
        px0 px0Var = new px0(mx0Var);
        mx0Var.b = px0Var;
        mx0Var.a = nx0Var.getClass();
        try {
            Object objD = nx0Var.d(mx0Var);
            if (objD == null) {
                return px0Var;
            }
            mx0Var.a = objD;
            return px0Var;
        } catch (Exception e2) {
            px0Var.b.j(e2);
            return px0Var;
        }
    }

    public static byte[] R(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoC = d3c.a(context).c(64, str);
        Signature[] signatureArr = packageInfoC.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i2++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoC.signatures[0].toByteArray());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(defpackage.qg0 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof yx
            if (r0 == 0) goto L13
            r0 = r5
            yx r0 = (yx) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            yx r0 = new yx
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.b = r2
            java.lang.Object r5 = O(r4, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.S(qg0, kt1):java.lang.Object");
    }

    public static final void T(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new mp0(str));
    }

    public static final ou6 U(ou6 ou6Var, String str) {
        return ou6Var.e(new raa(str));
    }

    public static final ou6 V(ou6 ou6Var, bp bpVar, uka ukaVar, kb4 kb4Var, int i2, boolean z2, int i3, int i4, b64 b64Var, List list, kb4 kb4Var2, z09 z09Var, kb4 kb4Var3, g60 g60Var) {
        if (z09Var == null) {
            return ou6Var.e(lu6.a).e(new yaa(bpVar, ukaVar, b64Var, kb4Var, i2, z2, i3, i4, list, kb4Var2, g60Var, kb4Var3));
        }
        return ou6Var.e(z09Var.f).e(new m09(bpVar, ukaVar, b64Var, kb4Var, i2, z2, i3, i4, list, kb4Var2, z09Var, g60Var));
    }

    public static final cf6 W(jf6 jf6Var) {
        Integer numI;
        Integer numI2;
        mf5 mf5VarC = ue5.d.c(jf6Var.b);
        long j2 = jf6Var.a;
        mf5 mf5Var = (mf5) nf5.f(mf5VarC).get("url");
        String strG = mf5Var != null ? i12.G(mf5Var) : null;
        if (strG == null) {
            strG = "";
        }
        mf5 mf5Var2 = (mf5) nf5.f(mf5VarC).get("width");
        int iIntValue = 0;
        int iIntValue2 = (mf5Var2 == null || (numI2 = i12.I(mf5Var2)) == null) ? 0 : numI2.intValue();
        mf5 mf5Var3 = (mf5) nf5.f(mf5VarC).get("height");
        if (mf5Var3 != null && (numI = i12.I(mf5Var3)) != null) {
            iIntValue = numI.intValue();
        }
        sgb sgbVarM = oh9.m(jf6Var.d);
        jf6 jf6Var2 = jf6Var.e;
        return new cf6(j2, strG, iIntValue2, iIntValue, sgbVarM, jf6Var2 != null ? X(jf6Var2) : null, jf6Var.g, jf6Var.h);
    }

    public static final gf6 X(jf6 jf6Var) {
        Object pm8Var;
        jf6Var.getClass();
        int i2 = jf6Var.c;
        if (i2 == 1) {
            try {
                pm8Var = W(jf6Var);
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            cf6 cf6Var = (cf6) (pm8Var instanceof pm8 ? null : pm8Var);
            return cf6Var != null ? cf6Var : Y(jf6Var);
        }
        switch (i2) {
            case 100:
            case Token.ASSIGN_LOGICAL_OR /* 101 */:
            case Token.ASSIGN_BITXOR /* 102 */:
            case Token.ASSIGN_BITAND /* 103 */:
            case Token.ASSIGN_LOGICAL_AND /* 104 */:
                long j2 = jf6Var.a;
                gf6 gf6VarX = null;
                String str = jf6Var.b;
                sgb sgbVarM = oh9.m(jf6Var.d);
                jf6 jf6Var2 = jf6Var.e;
                if (jf6Var2 != null) {
                    gf6VarX = X(jf6Var2);
                }
                return new df6(j2, str, i2, sgbVarM, gf6VarX, jf6Var.g, jf6Var.h);
            default:
                return Y(jf6Var);
        }
    }

    public static final ef6 Y(jf6 jf6Var) {
        long j2 = jf6Var.a;
        aq4 aq4Var = aq4.a;
        bp bpVarG = aq4.g(aq4.d(jf6Var.b));
        zo zoVar = new zo();
        String str = bpVarG.b;
        zoVar.f(str);
        for (ap apVar : bpVarG.c()) {
            zoVar.c((vn9) apVar.a, apVar.b, apVar.c);
        }
        for (ap apVar2 : bpVarG.d(0, zoVar.a.length())) {
            zoVar.a(apVar2.d, apVar2.b, apVar2.c, (String) apVar2.a);
        }
        yd4 yd4Var = new yd4(yg8.a(new yg8("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,})"), str));
        while (yd4Var.hasNext()) {
            k96 k96Var = (k96) yd4Var.next();
            String strGroup = k96Var.a.group();
            strGroup.getClass();
            zoVar.a("androidx.compose.foundation.text.linkContent", k96Var.b().a, k96Var.b().b + 1, strGroup);
            zoVar.c(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, jda.c, (o89) null, 61439), k96Var.b().a, k96Var.b().b + 1);
        }
        bp bpVarL = zoVar.l();
        sgb sgbVarM = oh9.m(jf6Var.d);
        jf6 jf6Var2 = jf6Var.e;
        return new ef6(j2, bpVarL, sgbVarM, jf6Var2 != null ? X(jf6Var2) : null, jf6Var.g, jf6Var.h);
    }

    public static final ArrayList Z(ni9 ni9Var, int i2, Integer num) {
        be8 be8Var = new be8(ni9Var);
        int iQ = ni9Var.q(i2);
        Integer numA = ni9Var.a(i2);
        while (i2 >= 0) {
            be8Var.y(ni9Var.i(i2), ni9Var.k(i2) ? ni9Var.p(i2, ni9Var.b) : vl1.a, ni9Var.a.i(i2), num);
            if (iQ >= 0) {
                Integer num2 = numA;
                numA = ni9Var.a(iQ);
                i2 = iQ;
                iQ = ni9Var.q(iQ);
                num = num2;
            } else {
                i2 = iQ;
                num = numA;
            }
        }
        return (ArrayList) ((yf1) be8Var).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r18, int r19, long r20, long r22, defpackage.zb4 r24, dd4 r25, ou6 r26) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.a(int, int, long, long, zb4, dd4, ou6):void");
    }

    public static final void b(rj1 rj1Var, ou6 ou6Var, rj1 rj1Var2, dd4 dd4Var, int i2) {
        rj1 rj1Var3;
        rj1 rj1Var4;
        ou6 ou6Var2;
        dd4Var.h0(-1693825945);
        int i3 = i2 | 48;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = ef.e;
                dd4Var.p0(objQ);
            }
            ha6 ha6Var = (ha6) objQ;
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var3);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6Var);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            ou6 ou6VarX0 = h67.x0(ou6Var3, "anchor");
            ha6 ha6VarD = pn0.d(bv4.f, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarX0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            zn0 zn0Var = zn0.a;
            rj1Var4 = rj1Var2;
            rj1Var4.c(zn0Var, dd4Var, 54);
            dd4Var.q(true);
            ou6 ou6VarX02 = h67.x0(ou6Var3, "badge");
            ha6 ha6VarD2 = pn0.d(bv4.b, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarX02);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            rj1Var3 = rj1Var;
            rj1Var3.c(zn0Var, dd4Var, 54);
            dd4Var.q(true);
            dd4Var.q(true);
            ou6Var2 = ou6Var3;
        } else {
            rj1Var3 = rj1Var;
            rj1Var4 = rj1Var2;
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(rj1Var3, ou6Var2, rj1Var4, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(bp r25, ou6 r26, uka r27, defpackage.kb4 r28, int r29, boolean r30, int r31, int r32, java.util.Map r33, dd4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.c(bp, ou6, uka, kb4, int, boolean, int, int, java.util.Map, dd4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r25, ou6 r26, uka r27, defpackage.kb4 r28, int r29, boolean r30, int r31, int r32, g60 r33, dd4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.d(java.lang.String, ou6, uka, kb4, int, boolean, int, int, g60, dd4, int, int):void");
    }

    public static final void e(String str, String str2, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1782487975);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.h(yb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            ur9 ur9Var = s96.a;
            uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.b;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i4 = i3 & 7168;
            boolean z2 = ((i3 & Token.ASSIGN_MOD) == 32) | (i4 == 2048);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new fi6(yb4Var, str2, 4);
                dd4Var2.p0(objQ);
            }
            int i5 = i3 & 14;
            lx1.m(str, (kb4) objQ, bp5Var, false, false, null, null, null, null, null, false, null, null, null, true, 0, 0, uw1Var, null, dd4Var, i5, 12582912, 6160376);
            un9.a(dd4Var, tg9.r(lu6.a, 12.0f));
            qj5 qj5Var = new qj5(3, 0, Token.EXPORT);
            uw1 uw1Var2 = ((q96) dd4Var.j(ur9Var)).c.b;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var2 = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new fi6(yb4Var, str, 5);
                dd4Var.p0(objQ2);
            }
            lx1.m(str2, (kb4) objQ2, bp5Var2, false, false, null, null, null, null, null, false, null, qj5Var, null, true, 0, 0, uw1Var2, null, dd4Var, (i3 >> 3) & 14, 12779520, 6127608);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gi6(str, str2, ou6Var, yb4Var, i2, 1);
        }
    }

    public static final void f(yu3 yu3Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(390836397);
        int i3 = i2 | (dd4Var2.f(yu3Var) ? 4 : 2);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
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
            String str = yu3Var.a;
            ur9 ur9Var = s96.a;
            nha.c(str, (ou6) null, ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 0, 0, 131066);
            un9.a(dd4Var, tg9.h(lu6.a, 6.0f));
            int i4 = yu3Var.b;
            nha.c(xv5.o("Offset ", i4, yu3Var.c + i4, "->"), (ou6) null, ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, 0, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(yu3Var, ou6Var, i2, 21);
        }
    }

    public static final void g(float f2, bb1 bb1Var, boolean z2, rj1 rj1Var, float f3, float f4, long j2, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        boolean z3;
        float f5;
        float f6;
        float f7;
        boolean z4;
        float f8;
        kb4Var.getClass();
        dd4Var.h0(1697730154);
        int i3 = i2 | (dd4Var.c(f2) ? 4 : 2) | (dd4Var.f(bb1Var) ? 32 : 16) | 1794432 | (dd4Var.e(j2) ? 8388608 : 4194304) | (dd4Var.f(ou6Var) ? 67108864 : 33554432) | (dd4Var.h(ib4Var) ? 536870912 : 268435456);
        if (dd4Var.V(i3 & 1, ((306783379 & i3) == 306783378 && ((dd4Var.h(kb4Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                f7 = 2.0f;
                z4 = true;
                f8 = 40.0f;
            } else {
                dd4Var.Y();
                z4 = z2;
                f8 = f3;
                f7 = f4;
            }
            dd4Var.r();
            sdc.e(ou6Var, null, jf0.G(-1080067116, new ci9(f2, kb4Var, z4, ib4Var, bb1Var, f8, j2, f7, rj1Var), dd4Var), dd4Var, ((i3 >> 24) & 14) | 3072, 6);
            z3 = z4;
            f5 = f8;
            f6 = f7;
        } else {
            dd4Var.Y();
            z3 = z2;
            f5 = f3;
            f6 = f4;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xh9(f2, bb1Var, z3, rj1Var, f5, f6, j2, ou6Var, ib4Var, kb4Var, i2);
        }
    }

    public static final void h(String str, int i2, ib4 ib4Var, dd4 dd4Var, int i3) {
        int i4;
        String str2;
        ou6 ou6Var;
        dd4Var.h0(1160995565);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarN = tg9.n(ou6Var2, 40.0f);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN);
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
            px3 px3Var = tg9.c;
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(px3Var, 6.0f), tp8.a), ((q96) dd4Var.j(s96.a)).a.a, jf0.G);
            boolean z2 = (i4 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new mh1(1, ib4Var);
                dd4Var.p0(objQ);
            }
            int i5 = i4;
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarL, false, 15);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarJ);
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
            if (str.length() > 0) {
                dd4Var.f0(-259432588);
                ou6Var = ou6Var2;
                w05.a(str, ra1.d, false, null, null, px3Var, null, dd4Var, (i5 & 14) | 1572912, 444);
                str2 = str;
                dd4Var.q(false);
            } else {
                str2 = str;
                ou6Var = ou6Var2;
                dd4Var.f0(-259235583);
                dd4Var.q(false);
            }
            dd4Var.q(true);
            if (i2 > 0) {
                dd4Var.f0(-1430397395);
                a(3072, 6, 0L, 0L, jf0.G(-928158113, new i51(i2, 2), dd4Var), dd4Var, zn0.a.a(ou6Var, bv4.d));
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1430260933);
                dd4Var.q(false);
            }
            dd4Var.q(true);
        } else {
            str2 = str;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hx(i2, i3, ib4Var, str2);
        }
    }

    public static final void i(zk7 zk7Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(-734202561);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(zk7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 32 : 16;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            int iK = zk7Var.k();
            List listS0 = fc1.S0(wm9.r((hv9) rv.a.getValue(), dd4Var), 2);
            long j2 = lc1.i;
            qx8.d(iK, ou6Var2, j2, j2, 0.0f, jf0.G(71748703, new oh1(zk7Var, i4), dd4Var), vm7.b, jf0.G(985750111, new ph1(kb4Var, listS0, iK), dd4Var), dd4Var, (i3 & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(zk7Var, ou6Var, kb4Var, i2, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public static final void j(boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        boolean z3;
        ?? r14;
        dd4Var.h0(-1211871949);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.d(0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 16384 : 8192;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var, 54);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarH);
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
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z4 = (i4 & 7168) == 2048;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z4 || objQ == obj) {
                objQ = new m50(29, ib4Var);
                dd4Var.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f), 0L, dd4Var, 48, 8);
            if (z2) {
                xv5.y(dd4Var, -18941791, lu6Var, 8.0f, dd4Var);
                ha6 ha6VarD = pn0.d(bv4.b, false);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL02 = s32.L0(dd4Var, lu6Var);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD);
                un9.s(jmVar2, dd4Var, lr7VarL2);
                ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL02);
                ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
                boolean z5 = (57344 & i4) == 16384;
                Object objQ2 = dd4Var.Q();
                if (z5 || objQ2 == obj) {
                    r14 = 0;
                    objQ2 = new mh1(0, ib4Var2);
                    dd4Var.p0(objQ2);
                } else {
                    r14 = 0;
                }
                mx4.a(i25.c((m53) f53.a.getValue(), dd4Var, r14), (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, r14, 15), 8.0f), 0L, dd4Var, 48, 8);
                dd4Var.f0(231158154);
                dd4Var.q((boolean) r14);
                z3 = true;
                dd4Var.q(true);
                dd4Var.q((boolean) r14);
            } else {
                z3 = true;
                dd4Var.f0(-18286389);
                dd4Var.q(false);
            }
            dd4Var.q(z3);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nh1(z2, ou6Var, ib4Var, ib4Var2, i2, 0);
        }
    }

    public static final void k(String str, int i2, boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i3) {
        int i4;
        f9 f9Var;
        yb4 yb4Var;
        yb4 yb4Var2;
        jm jmVar;
        kd kdVar;
        yb4 yb4Var3;
        t89 t89Var;
        fu6 fu6Var;
        boolean z3;
        boolean z4;
        boolean z5;
        fu6 fu6Var2;
        fu6 fu6Var3;
        int i5 = i2;
        dd4 dd4Var2 = dd4Var;
        f9 f9Var2 = bv4.d;
        xf0 xf0Var = bv4.b;
        dd4Var2.h0(187395681);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var2.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var2.d(i5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var2.d(0) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var2.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 8388608 : 4194304;
        }
        int i6 = i4;
        if (dd4Var2.V(i6 & 1, (i6 & 4793491) != 4793490)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarH);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var4 = ll1.f;
            un9.s(yb4Var4, dd4Var2, eq8VarA);
            yb4 yb4Var5 = ll1.e;
            un9.s(yb4Var5, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var6 = ll1.d;
            un9.s(yb4Var6, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            t89 t89Var2 = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, t89Var2);
            boolean z6 = (i6 & 458752) == 131072;
            Object objQ = dd4Var2.Q();
            fu6 fu6Var4 = vl1.a;
            if (z6 || objQ == fu6Var4) {
                objQ = new mh1(2, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f), 0L, dd4Var2, 48, 8);
            if (z2) {
                xv5.y(dd4Var2, -1470163173, lu6Var, 8.0f, dd4Var2);
                ha6 ha6VarD = pn0.d(xf0Var, false);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, lu6Var);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var4, dd4Var2, ha6VarD);
                un9.s(yb4Var5, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar2);
                un9.s(yb4Var6, dd4Var2, ou6VarL02);
                yb4Var3 = yb4Var6;
                ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), t89Var2);
                boolean z7 = (i6 & 3670016) == 1048576;
                Object objQ2 = dd4Var2.Q();
                if (z7) {
                    fu6Var2 = fu6Var4;
                } else {
                    fu6Var2 = fu6Var4;
                    if (objQ2 != fu6Var2) {
                        fu6Var3 = fu6Var2;
                    }
                    ou6 ou6VarL03 = gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 8.0f);
                    f9Var = f9Var2;
                    yb4Var2 = yb4Var5;
                    z3 = false;
                    fu6Var = fu6Var3;
                    t89Var = t89Var2;
                    jmVar = jmVar2;
                    kdVar = kdVar2;
                    yb4Var = yb4Var4;
                    mx4.a(i25.c((m53) f53.a.getValue(), dd4Var2, 0), (String) null, ou6VarL03, 0L, dd4Var2, 48, 8);
                    dd4Var2.f0(-352424314);
                    dd4Var2.q(false);
                    z4 = true;
                    dd4Var2.q(true);
                    dd4Var2.q(false);
                }
                fu6Var3 = fu6Var2;
                objQ2 = new mh1(3, ib4Var2);
                dd4Var2.p0(objQ2);
                ou6 ou6VarL032 = gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 8.0f);
                f9Var = f9Var2;
                yb4Var2 = yb4Var5;
                z3 = false;
                fu6Var = fu6Var3;
                t89Var = t89Var2;
                jmVar = jmVar2;
                kdVar = kdVar2;
                yb4Var = yb4Var4;
                mx4.a(i25.c((m53) f53.a.getValue(), dd4Var2, 0), (String) null, ou6VarL032, 0L, dd4Var2, 48, 8);
                dd4Var2.f0(-352424314);
                dd4Var2.q(false);
                z4 = true;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                f9Var = f9Var2;
                yb4Var = yb4Var4;
                yb4Var2 = yb4Var5;
                jmVar = jmVar2;
                kdVar = kdVar2;
                yb4Var3 = yb4Var6;
                t89Var = t89Var2;
                fu6Var = fu6Var4;
                z3 = false;
                z4 = true;
                dd4Var2.f0(-1469507771);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
            ha6 ha6VarD2 = pn0.d(xf0Var, z3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarN2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var, dd4Var2, ha6VarD2);
            un9.s(yb4Var2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar, dd4Var2, kdVar);
            yb4 yb4Var7 = yb4Var3;
            un9.s(yb4Var7, dd4Var2, ou6VarL04);
            px3 px3Var = tg9.c;
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(px3Var, 6.0f), t89Var), ((q96) dd4Var2.j(s96.a)).a.a, jf0.G);
            boolean z8 = (i6 & 29360128) == 8388608 ? z4 : false;
            Object objQ3 = dd4Var2.Q();
            if (z8 || objQ3 == fu6Var) {
                objQ3 = new mh1(4, ib4Var3);
                dd4Var2.p0(objQ3);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ3, ou6VarL, false, 15);
            ha6 ha6VarD3 = pn0.d(xf0Var, false);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var, dd4Var2, ha6VarD3);
            un9.s(yb4Var2, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var7, dd4Var2, ou6VarL05);
            if (str.length() > 0) {
                dd4Var2.f0(-1793519796);
                z5 = true;
                w05.a(str, ra1.d, false, null, null, px3Var, null, dd4Var, (i6 & 14) | 1572912, 444);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                z5 = true;
                dd4Var2.f0(-1793299727);
                dd4Var2.q(false);
            }
            dd4Var2.q(z5);
            if (i2 > 0) {
                dd4Var2.f0(-63610937);
                i5 = i2;
                a(3072, 6, 0L, 0L, jf0.G(545740143, new i51(i5, 3), dd4Var2), dd4Var, zn0.a.a(lu6Var, f9Var));
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                i5 = i2;
                dd4Var2.f0(-63453333);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, z5, lu6Var, 8.0f, dd4Var2);
            dd4Var2.q(z5);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qh1(str, i5, z2, ou6Var, ib4Var, ib4Var2, ib4Var3, i3);
        }
    }

    public static final void l(String str, int i2, boolean z2, zk7 zk7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, ib4 ib4Var3, dd4 dd4Var, int i3) {
        zk7 zk7Var2;
        boolean z3;
        dd4 dd4Var2 = dd4Var;
        zk7Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        kb4Var.getClass();
        ib4Var3.getClass();
        dd4Var2.h0(1375190978);
        int i4 = i3 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.d(i2) ? 32 : 16) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.f(zk7Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var2) ? 1048576 : 524288) | (dd4Var2.h(kb4Var) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var3) ? 67108864 : 33554432);
        if (dd4Var2.V(i4 & 1, (38347923 & i4) != 38347922)) {
            ou6 ou6VarY = yn2.y(dd4Var2, tg9.f(ou6Var, 1.0f));
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarY);
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
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6Var, 1.0f), 1), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 8.0f, 5);
            wf0 wf0Var = bv4.x;
            eq8 eq8VarA = dq8.a(pv.a, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP0);
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
            String strK = wn9.K((pv9) vt9.z0.getValue(), dd4Var2);
            uka ukaVar = ((q96) dd4Var2.j(s96.a)).b.g;
            ou6 ou6VarP02 = gjb.p0(lu6Var, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(strK, ou6VarP02.e(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var2, 0, 24576, 114684);
            h(str, i2, ib4Var3, dd4Var2, (i4 & Token.ELSE) | ((i4 >> 18) & 896));
            dd4Var2.q(true);
            ou6 ou6VarP03 = gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 6.0f, 7);
            eq8 eq8VarA2 = dq8.a(new mv(8.0f, true, new gp(5)), wf0Var, dd4Var2, 54);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarP03);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            if (z2) {
                dd4Var2.f0(-1199058758);
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                z3 = true;
                zk7Var2 = zk7Var;
                i(zk7Var2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kb4Var, dd4Var2, ((i4 >> 9) & 14) | ((i4 >> 15) & 896));
                dd4Var2.q(false);
            } else {
                zk7Var2 = zk7Var;
                z3 = true;
                dd4Var2.f0(-1198869007);
                dd4Var2.q(false);
            }
            int i5 = i4 >> 6;
            dd4Var2 = dd4Var2;
            j(z2, lu6Var, ib4Var, ib4Var2, dd4Var2, ((i4 >> 3) & Token.ASSIGN_MOD) | 390 | (i5 & 7168) | (i5 & 57344));
            dd4Var2.q(z3);
            dd4Var2.q(z3);
        } else {
            zk7Var2 = zk7Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lh1(str, i2, z2, zk7Var2, ou6Var, ib4Var, ib4Var2, kb4Var, ib4Var3, i3, 1);
        }
    }

    public static final void m(String str, int i2, boolean z2, zk7 zk7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, ib4 ib4Var3, dd4 dd4Var, int i3) {
        int i4;
        boolean z3;
        zk7Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        kb4Var.getClass();
        ib4Var3.getClass();
        dd4Var.h0(2098877310);
        int i5 = i3 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE) | (dd4Var.f(zk7Var) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var2) ? 1048576 : 524288) | (dd4Var.h(kb4Var) ? 8388608 : 4194304) | (dd4Var.h(ib4Var3) ? 67108864 : 33554432);
        if (dd4Var.V(i5 & 1, (38347923 & i5) != 38347922)) {
            ou6 ou6VarN0 = gjb.n0(yib.B(yn2.y(dd4Var, ou6Var), 1), 0.0f, 8.0f, 1);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var, 54);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            if (z2) {
                dd4Var.f0(264339617);
                i4 = i5;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                i(zk7Var, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), kb4Var, dd4Var, ((i4 >> 9) & 14) | ((i4 >> 15) & 896));
                dd4Var.q(false);
                z3 = true;
            } else {
                i4 = i5;
                dd4Var.f0(264536653);
                String strK = wn9.K((pv9) vt9.z0.getValue(), dd4Var);
                uka ukaVar = ((q96) dd4Var.j(s96.a)).b.g;
                if (1.0f <= 0.0d) {
                    o75.a("invalid weight; must be greater than zero");
                }
                z3 = true;
                nha.c(strK, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24576, 114684);
                dd4Var.q(false);
            }
            k(str, i2, z2, gjb.n0(lu6.a, 12.0f, 0.0f, 2), ib4Var, ib4Var2, ib4Var3, dd4Var, (i4 & 14) | 24960 | (i4 & Token.ASSIGN_MOD) | ((i4 << 3) & 7168) | (i4 & 458752) | (i4 & 3670016) | (29360128 & (i4 >> 3)));
            dd4Var.q(z3);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lh1(str, i2, z2, zk7Var, ou6Var, ib4Var, ib4Var2, kb4Var, ib4Var3, i3, 0);
        }
    }

    public static final void n(int i2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2057220715);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            dd4Var2.f0(-253473145);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            boolean z2 = false;
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 261118);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, 100663296, 252);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            }
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(23, ib4Var2);
                dd4Var2.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var2, 0, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ou6Var, ib4Var, ib4Var2, i2, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v48 */
    public static final void o(String str, String str2, String str3, String str4, ou6 ou6Var, boolean z2, ac4 ac4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        ib4 ib4Var2;
        lu6 lu6Var;
        kd kdVar;
        br9 br9Var;
        int i3;
        ib4 ib4Var3;
        boolean z3;
        yb4 yb4Var;
        br9 br9Var2;
        Object obj;
        a07 a07Var;
        aw3 aw3Var;
        yb4 yb4Var2;
        a07 a07Var2;
        dd4 dd4Var3;
        ?? r7;
        p35 p35Var;
        String str5;
        br9 br9Var3;
        Object obj2;
        int i4;
        qr1 qr1Var = ra1.d;
        dd4Var.h0(-669477987);
        int i5 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(str4) ? 2048 : 1024) | (dd4Var.f(ou6Var) ? 16384 : 8192) | (dd4Var.g(z2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ac4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i5 & 1, (i5 & 4793491) != 4793490)) {
            Object[] objArr = new Object[0];
            int i6 = i5 & Token.ASSIGN_MOD;
            boolean z4 = i6 == 32;
            Object objQ = dd4Var.Q();
            Object obj3 = vl1.a;
            if (z4 || objQ == obj3) {
                objQ = new ho4(str2, 2);
                dd4Var.p0(objQ);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            boolean z5 = (i5 & 896) == 256;
            Object objQ2 = dd4Var.Q();
            if (z5 || objQ2 == obj3) {
                objQ2 = new ho4(str3, 3);
                dd4Var.p0(objQ2);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 0);
            Object[] objArr3 = new Object[0];
            boolean z6 = (i5 & 7168) == 2048;
            Object objQ3 = dd4Var.Q();
            if (z6 || objQ3 == obj3) {
                objQ3 = new ho4(str4, 4);
                dd4Var.p0(objQ3);
            }
            br9 br9Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 0);
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj3) {
                objQ4 = dk9.x((Object) null);
                dd4Var.p0(objQ4);
            }
            br9 br9Var5 = (a07) objQ4;
            Object objQ5 = dd4Var.Q();
            int i7 = 8;
            if (objQ5 == obj3) {
                objQ5 = new tn4(br9Var5, i7);
                dd4Var.p0(objQ5);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ5, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj3) {
                objQ6 = new un4(7);
                dd4Var.p0(objQ6);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr4, (ib4) objQ6, dd4Var, 48);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            yb4 yb4Var3 = ll1.f;
            un9.s(yb4Var3, dd4Var, ha6VarD);
            yb4 yb4Var4 = ll1.e;
            un9.s(yb4Var4, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar = ll1.g;
            un9.s(jmVar, dd4Var, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var, kdVar2);
            jm jmVar2 = ll1.d;
            un9.s(jmVar2, dd4Var, ou6VarL0);
            lu6 lu6Var2 = lu6.a;
            ou6 ou6VarQ = kc5.Q(yn2.E(zn0.a.a(tg9.c(lu6Var2, 1.0f), bv4.c), dd4Var, 0), kc5.J(dd4Var), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ie1VarA);
            un9.s(yb4Var4, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL02);
            un9.a(dd4Var, tg9.h(lu6Var2, 44.0f));
            ou6 ou6VarW = t96.w(tg9.o(lu6Var2, 120.0f, 180.0f), s00.p(dd4Var).b);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ha6VarD2);
            un9.s(yb4Var4, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL03);
            if (((bi5) br9Var5.getValue()) == null) {
                dd4Var.f0(626340390);
                lu6Var = lu6Var2;
                kdVar = kdVar2;
                br9Var = br9Var5;
                i3 = i5;
                w05.c(str, str2, "", "", qr1Var, tg9.c, dd4Var, (i5 & 14) | 224640 | i6);
                dd4Var.q(false);
                r7 = 0;
                yb4Var = yb4Var3;
                ib4Var3 = ib4Var4;
                br9Var2 = br9Var4;
                obj = obj3;
                a07Var = a07Var3;
                aw3Var = aw3VarC0;
                a07Var2 = a07Var4;
                dd4Var3 = dd4Var;
                yb4Var2 = yb4Var4;
            } else {
                lu6Var = lu6Var2;
                kdVar = kdVar2;
                br9Var = br9Var5;
                i3 = i5;
                dd4Var.f0(626722310);
                bi5 bi5Var = (bi5) br9Var.getValue();
                if (bi5Var == null) {
                    dd4Var.f0(626722309);
                    dd4Var.q(false);
                    z3 = false;
                    yb4Var = yb4Var3;
                    ib4Var3 = ib4Var4;
                    br9Var2 = br9Var4;
                    obj = obj3;
                    a07Var = a07Var3;
                    aw3Var = aw3VarC0;
                    a07Var2 = a07Var4;
                    dd4Var3 = dd4Var;
                    yb4Var2 = yb4Var4;
                } else {
                    dd4Var.f0(626722310);
                    ib4Var3 = ib4Var4;
                    z3 = false;
                    yb4Var = yb4Var3;
                    br9Var2 = br9Var4;
                    obj = obj3;
                    a07Var = a07Var3;
                    aw3Var = aw3VarC0;
                    yb4Var2 = yb4Var4;
                    a07Var2 = a07Var4;
                    w05.a(bi5Var, qr1Var, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
                    dd4Var3 = dd4Var;
                    dd4Var3.q(false);
                }
                dd4Var3.q(z3);
                r7 = z3;
            }
            xv5.z(dd4Var3, true, lu6Var, 8.0f, dd4Var3);
            p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var3, r7);
            String strK = wn9.K((pv9) vt9.d0.getValue(), dd4Var3);
            boolean zF = dd4Var3.f(aw3Var);
            Object objQ7 = dd4Var3.Q();
            if (zF || objQ7 == obj) {
                p35Var = p35VarC;
                objQ7 = new k51(aw3Var, 8);
                dd4Var3.p0(objQ7);
            } else {
                p35Var = p35VarC;
            }
            kc5.n(p35Var, strK, false, null, null, null, null, null, (ib4) objQ7, dd4Var, 0, 252);
            String str6 = (String) tw2.l(lu6Var, 12.0f, dd4Var, a07Var);
            uw1 uw1Var = s00.p(dd4Var).b;
            ou6 ou6VarN0 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ8 = dd4Var.Q();
            if (zF2 || objQ8 == obj) {
                objQ8 = new tn4(a07Var, 9);
                dd4Var.p0(objQ8);
            }
            lx1.m(str6, (kb4) objQ8, ou6VarN0, false, false, null, h, null, null, null, false, null, null, null, false, 0, 0, uw1Var, null, dd4Var, 1573248, 0, 6291384);
            String str7 = (String) tw2.l(lu6Var, 12.0f, dd4Var, a07Var2);
            uw1 uw1Var2 = s00.p(dd4Var).b;
            a07 a07Var6 = a07Var;
            ou6 ou6VarN02 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF3 = dd4Var.f(a07Var2);
            Object objQ9 = dd4Var.Q();
            if (zF3 || objQ9 == obj) {
                objQ9 = new tn4(a07Var2, 10);
                dd4Var.p0(objQ9);
            }
            lx1.m(str7, (kb4) objQ9, ou6VarN02, false, false, null, i, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var, 1573248, 0, 6291384);
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            nha.c(wn9.K((pv9) iu9.g0.getValue(), dd4Var), (ou6) null, s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).i, dd4Var, 0, 0, 131066);
            un9.a(dd4Var, tg9.h(lu6Var, 6.0f));
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(tg9.t(tg9.h(lu6Var, 56.0f), 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2), s00.p(dd4Var).b);
            boolean zF4 = dd4Var.f(a07Var5);
            Object objQ10 = dd4Var.Q();
            if (zF4 || objQ10 == obj) {
                objQ10 = new zl3(a07Var5, 23);
                dd4Var.p0(objQ10);
            }
            a07 a07Var7 = a07Var2;
            ou6 ou6VarN03 = gjb.n0(fw.G(fw.J(null, (ib4) objQ10, ou6VarW2, false, 15), 1.5f, s00.o(dd4Var).A, s00.p(dd4Var).b), 12.0f, 0.0f, 2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN03);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var3);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var, dd4Var, eq8VarA);
            un9.s(yb4Var2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar, dd4Var, kdVar);
            un9.s(jmVar2, dd4Var, ou6VarL04);
            boolean zF5 = dd4Var.f((String) br9Var2.getValue());
            Object objQ11 = dd4Var.Q();
            Object obj4 = objQ11;
            if (zF5 || objQ11 == obj) {
                str5 = "";
                String strA = str5;
                if (((String) br9Var2.getValue()).length() != 0) {
                    f36 f36VarL = sw1.L((String) br9Var2.getValue());
                    String strB = f36VarL != null ? f36VarL.b(sw1.N()) : null;
                    strA = j39.A(strB != null ? strB : "", " (", (String) br9Var2.getValue(), ")");
                }
                dd4Var.p0(strA);
                obj4 = strA;
            }
            String strK2 = (String) obj4;
            dd4Var.f0(1335119413);
            if (strK2.length() == 0) {
                strK2 = wn9.K((pv9) eu9.n.getValue(), dd4Var);
            }
            dd4Var.q(false);
            nha.c(strK2, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262140);
            Object obj5 = obj;
            br9 br9Var6 = br9Var2;
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, 0), (String) null, gjb.p0(lu6Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, dd4Var, 432, 8);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            if (z2) {
                dd4Var.f0(865706247);
                sdc.y(tg9.n(lu6Var, 28.0f), s00.o(dd4Var).d, null, dd4Var, 6, 4);
                dd4Var.q(false);
                br9Var3 = br9Var6;
                obj2 = obj5;
                i4 = 8388608;
                dd4Var2 = dd4Var;
            } else {
                dd4Var.f0(865897083);
                p35 p35VarC2 = i25.c((m53) f53.g0.getValue(), dd4Var, 0);
                String strK3 = wn9.K((pv9) iu9.v.getValue(), dd4Var);
                boolean z7 = ((String) a07Var6.getValue()).length() > 0 && ((String) br9Var6.getValue()).length() > 0;
                ou6 ou6VarN04 = gjb.n0(tg9.f(tg9.t(lu6Var, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
                boolean zF6 = ((i3 & 3670016) == 1048576) | dd4Var.f(a07Var6) | dd4Var.f(a07Var7) | dd4Var.f(br9Var6);
                Object objQ12 = dd4Var.Q();
                if (zF6 || objQ12 == obj5) {
                    objQ12 = new sx2(ac4Var, a07Var6, a07Var7, br9Var6, br9Var, 4);
                    br9Var3 = br9Var6;
                    dd4Var.p0(objQ12);
                } else {
                    br9Var3 = br9Var6;
                }
                obj2 = obj5;
                i4 = 8388608;
                kc5.n(p35VarC2, strK3, z7, null, ou6VarN04, null, null, null, (ib4) objQ12, dd4Var, 24576, 232);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            boolean zBooleanValue = ((Boolean) a07Var5.getValue()).booleanValue();
            boolean zF7 = dd4Var2.f(a07Var5);
            Object objQ13 = dd4Var2.Q();
            if (zF7 || objQ13 == obj2) {
                objQ13 = new tn4(a07Var5, 7);
                dd4Var2.p0(objQ13);
            }
            kb4 kb4Var = (kb4) objQ13;
            boolean zF8 = dd4Var2.f(br9Var3) | dd4Var2.f(a07Var5);
            Object objQ14 = dd4Var2.Q();
            if (zF8 || objQ14 == obj2) {
                objQ14 = new rl0(br9Var3, a07Var5, 13);
                dd4Var2.p0(objQ14);
            }
            kl8.y(zBooleanValue, kb4Var, (kb4) objQ14, dd4Var2, 0);
            p35 p35VarC3 = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            boolean z8 = (i3 & 29360128) == i4;
            Object objQ15 = dd4Var2.Q();
            if (z8 || objQ15 == obj2) {
                ib4Var2 = ib4Var;
                objQ15 = new xf3(22, ib4Var2);
                dd4Var2.p0(objQ15);
            } else {
                ib4Var2 = ib4Var;
            }
            sw1.r(p35VarC3, lu6Var, 0L, (ib4) objQ15, dd4Var2, 48, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qx2(str, str2, str3, str4, ou6Var, z2, ac4Var, ib4Var2, i2, 3);
        }
    }

    public static final void p(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(829320125);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130040);
            sdc.y(tg9.n(lu6Var, 48.0f), ((q96) dd4Var.j(ur9Var)).a.q, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(21, ib4Var);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var, 0, 4);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 8);
        }
    }

    public static final void q(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1121700523);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new ho4(str, 1);
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
            a91 a91VarA = ug8.a(xr4.class);
            xr4 xr4Var = (xr4) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(xr4Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new rx2(xr4Var, 17);
                dd4Var.p0(objQ2);
            }
            lx1.g(xr4Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(xr4Var.j0, dd4Var);
            a07 a07VarB2 = bx1.B(xr4Var.U0, dd4Var);
            ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
            boolean zF2 = dd4Var.f((yba) a07VarB.getValue()) | dd4Var.f(ad1Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                boolean z3 = ((yba) a07VarB.getValue()).a.length() == 0;
                objQ3 = dk9.x(new lra(z3, ((yba) a07VarB.getValue()).g, z3 ? ad1Var.q : kf0.H(((yba) a07VarB.getValue()).d), z3 ? ad1Var.p : kf0.H(((yba) a07VarB.getValue()).e), ((yba) a07VarB.getValue()).f, qu1.X(((yba) a07VarB.getValue()).h)));
                dd4Var.p0(objQ3);
            }
            a07 a07Var = (a07) objQ3;
            a07 a07VarB3 = bx1.B(xr4Var.p0, dd4Var);
            WeakHashMap weakHashMap = pzb.w;
            z85 z85VarR = jv3.r(ju7.i(dd4Var).b, dd4Var);
            boolean zF3 = dd4Var.f((yba) a07VarB.getValue());
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                rj7 rj7Var = new rj7(((yba) a07VarB.getValue()).D, ((yba) a07VarB.getValue()).F, ((yba) a07VarB.getValue()).E, ((yba) a07VarB.getValue()).G);
                dd4Var.p0(rj7Var);
                objQ4 = rj7Var;
            }
            a07 a07VarB4 = bx1.B(xr4Var.q0, dd4Var);
            fx1.p(((yba) a07VarB.getValue()).o, ((yba) a07VarB.getValue()).r, ((yba) a07VarB.getValue()).p, ((yba) a07VarB.getValue()).q, dd4Var, 0);
            lra lraVar = (lra) a07Var.getValue();
            dd4Var2 = dd4Var;
            hn9.h(lraVar, jf0.G(1309188347, new yr4(xr4Var, ou6Var, z85VarR, t27Var, str, (pj7) objQ4, a07Var, a07VarB2, a07VarB3, a07VarB, a07VarB4), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final ou6 r28, bp r29, final defpackage.kb4 r30, final boolean r31, final java.util.Map r32, final uka r33, final int r34, final boolean r35, final int r36, final int r37, final b64 r38, final z09 r39, final defpackage.kb4 r40, dd4 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.r(ou6, bp, kb4, boolean, java.util.Map, uka, int, boolean, int, int, b64, z09, kb4, dd4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.ud8 r52, pj7 r53, ou6 r54, defpackage.kb4 r55, defpackage.kb4 r56, defpackage.kb4 r57, defpackage.kb4 r58, defpackage.ib4 r59, defpackage.ib4 r60, defpackage.kb4 r61, defpackage.ib4 r62, defpackage.ib4 r63, defpackage.ib4 r64, defpackage.ib4 r65, defpackage.ib4 r66, dd4 r67, int r68) {
        /*
            Method dump skipped, instruction units count: 2306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.s(ud8, pj7, ou6, kb4, kb4, kb4, kb4, ib4, ib4, kb4, ib4, ib4, ib4, ib4, ib4, dd4, int):void");
    }

    public static final void t(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(-513038314);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            vd8 vd8Var = (vd8) ((qtb) qx1.N(ug8.a(vd8.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.f0.getValue(), dd4Var), tg9.c, false, jf0.G(1216493458, new n74(t27Var, 25), dd4Var), null, jf0.G(-1273629728, new ak0(11, vd8Var, t27Var, bx1.B(vd8Var.d, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 26, t27Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(float r23, defpackage.kb4 r24, ou6 r25, boolean r26, defpackage.ib4 r27, rh9 r28, defpackage.yy6 r29, int r30, defpackage.zb4 r31, defpackage.zb4 r32, defpackage.bb1 r33, dd4 r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.u(float, kb4, ou6, boolean, ib4, rh9, yy6, int, zb4, zb4, bb1, dd4, int, int, int):void");
    }

    public static final void v(yy6 yy6Var, ou6 ou6Var, rh9 rh9Var, boolean z2, long j2, dd4 dd4Var, int i2) {
        long j3;
        long jA;
        long jFloatToRawIntBits;
        dd4Var.h0(-124153292);
        int i3 = i2 | (dd4Var.f(yy6Var) ? 4 : 2) | 48 | (dd4Var.f(rh9Var) ? 256 : Token.CASE) | (dd4Var.g(z2) ? 2048 : 1024) | 24576;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                jA = vw1.a(4.0f, 16.0f);
                ou6Var = lu6.a;
            } else {
                dd4Var.Y();
                jA = j2;
            }
            dd4Var.r();
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new hk9();
                dd4Var.p0(objQ);
            }
            hk9 hk9Var = (hk9) objQ;
            boolean z3 = (i3 & 14) == 4;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new b69(yy6Var, hk9Var, null, 8);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, yy6Var);
            if (hk9Var.isEmpty()) {
                jFloatToRawIntBits = jA;
            } else {
                float fB = a23.b(jA) / 2.0f;
                if ((2 & 1) != 0) {
                    fB = a23.b(jA);
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits((2 & 2) != 0 ? a23.a(jA) : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32);
            }
            px3 px3Var = tg9.a;
            un9.a(dd4Var, fe.L(gc1.V(tg9.o(ou6Var, a23.b(jFloatToRawIntBits), a23.a(jFloatToRawIntBits)), yy6Var), z2 ? rh9Var.a : rh9Var.f, tp8.a));
            j3 = jA;
        } else {
            dd4Var.Y();
            j3 = j2;
        }
        ou6 ou6Var2 = ou6Var;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bj(yy6Var, ou6Var2, rh9Var, z2, j3, i2);
        }
    }

    public static final void w(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        ib4 ib4Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1021514662);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            dd4Var2.f0(22089876);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 261118);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            ib4Var2 = ib4Var;
            kc5.n(i25.c((m53) a53.w.getValue(), dd4Var, 0), wn9.K((pv9) vt9.w0.getValue(), dd4Var), false, null, null, null, null, null, ib4Var2, dd4Var, (i3 << 18) & 234881024, 252);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new hpa(19, ib4Var2);
                dd4Var2.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var2, 0, 4);
            dd4Var2.q(true);
        } else {
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var2, i2, 14);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:272:0x105d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1061  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x1313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(java.lang.String r70, java.lang.String r71, java.lang.String r72, ou6 r73, int r74, boolean r75, boolean r76, java.util.List r77, final defpackage.kb4 r78, defpackage.bc4 r79, defpackage.ib4 r80, defpackage.ib4 r81, dd4 r82, int r83) {
        /*
            Method dump skipped, instruction units count: 5192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb0.x(java.lang.String, java.lang.String, java.lang.String, ou6, int, boolean, boolean, java.util.List, kb4, bc4, ib4, ib4, dd4, int):void");
    }

    public static final String y(a07 a07Var) {
        return (String) a07Var.getValue();
    }

    public static final boolean z(a07 a07Var) {
        return ((Boolean) a07Var.getValue()).booleanValue();
    }
}
