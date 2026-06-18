package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ah1 {
    public static final rj1 A;
    public static final s9b A0;
    public static final rj1 B;
    public static final s9b B0;
    public static final bd1 C;
    public static final bd1 D;
    public static final bd1 E;
    public static final x89 F;
    public static final bd1 G;
    public static final bd1 H;
    public static final bd1 I;
    public static final bd1 J;
    public static final bd1 K;
    public static final bd1 L;
    public static final bd1 M;
    public static final bd1 N;
    public static final bd1 O;
    public static final bd1 P;
    public static final bd1 Q;
    public static final bd1 R;
    public static final bd1 S;
    public static final bd1 T;
    public static final bd1 U;
    public static final bd1 V;
    public static final bd1 W;
    public static final bd1 X;
    public static final bd1 Y;
    public static final bd1 Z;
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final bd1 a0;
    public static final rj1 b;
    public static final bd1 b0;
    public static final rj1 c;
    public static final bd1 c0;
    public static final rj1 d;
    public static final ayb d0;
    public static final rj1 e;
    public static final ayb e0;
    public static final rj1 f;
    public static final ayb f0;
    public static final rj1 g;
    public static final ayb g0;
    public static final rj1 h;
    public static final float[] h0;
    public static final rj1 i;
    public static final wd1 i0;
    public static final rj1 j;
    public static final cd1 j0;
    public static final rj1 k;
    public static final cd1 k0;
    public static final rj1 l;
    public static final y89 l0;
    public static final rj1 m;
    public static final cd1 m0;
    public static final rj1 n;
    public static final cd1 n0;
    public static final rj1 o;
    public static final cd1 o0;
    public static final rj1 p;
    public static final float p0;
    public static final rj1 q;
    public static final ybb q0;
    public static final rj1 r;
    public static final mo8 r0;
    public static final rj1 s;
    public static final Object s0;
    public static final rj1 t;
    public static final s9b t0;
    public static final rj1 u;
    public static final s9b u0;
    public static final rj1 v;
    public static final s9b v0;
    public static final rj1 w;
    public static final s9b w0;
    public static final rj1 x;
    public static final s9b x0;
    public static final rj1 y;
    public static final s9b y0;
    public static final rj1 z;
    public static final s9b z0;

    static {
        int i2 = 14;
        int i3 = 13;
        int i4 = 0;
        new rj1(new k7(i3), false, 657782987);
        int i5 = 29;
        new rj1(new vj1(i5), false, -1270442071);
        int i6 = 17;
        new rj1(new k7(i6), false, 2094288676);
        b = new rj1(new uj1(i4), false, -1342205566);
        new rj1(new k7(i2), false, -1230986050);
        int i7 = 28;
        new rj1(new vj1(i7), false, 1921811868);
        int i8 = 15;
        c = new rj1(new k7(i8), false, -2101264077);
        d = new rj1(new k7(16), false, 37575796);
        e = new rj1(new vj1(6), false, 792427710);
        f = new rj1(new bk1(12), false, 1046545200);
        g = new rj1(new bk1(13), false, -3324839);
        h = new rj1(new bk1(14), false, 1977837240);
        i = new rj1(new bk1(15), false, -335967977);
        j = new rj1(new ck1(12), false, -1003952218);
        k = new rj1(new ck1(i3), false, 681947717);
        l = new rj1(new ck1(i2), false, -934249730);
        m = new rj1(new ck1(i8), false, 751650205);
        int i9 = 21;
        n = new rj1(new hk1(i9), false, 970505348);
        o = new rj1(new ik1(19), false, -889594496);
        int i10 = 20;
        p = new rj1(new ik1(i10), false, -1924794564);
        q = new rj1(new ik1(i9), false, -177702477);
        r = new rj1(new kk1(i9), false, 880562324);
        int i11 = 22;
        s = new rj1(new kk1(i11), false, -1131830889);
        t = new rj1(new jk1(i7), false, -661718501);
        u = new rj1(new jk1(i5), false, -1864828721);
        new rj1(new lk1(i5), false, 235719674);
        new rj1(new nk1(i4), false, 927470173);
        v = new rj1(new vj1(i9), false, 1672729776);
        w = new rj1(new vj1(i11), false, -1673747791);
        x = new rj1(new pk1(i6), false, -1426005477);
        y = new rj1(new pk1(18), false, -1910950726);
        z = new rj1(new qk1(i10), false, 2006391562);
        A = new rj1(new qk1(i9), false, -1410137419);
        B = new rj1(new qk1(i11), false, -1624902242);
        bd1 bd1Var = bd1.c;
        C = bd1Var;
        bd1 bd1Var2 = bd1.d;
        D = bd1Var2;
        E = bd1.e;
        F = x89.a;
        bd1 bd1Var3 = bd1.b;
        G = bd1Var3;
        H = bd1Var3;
        I = bd1Var3;
        J = bd1Var3;
        K = bd1Var3;
        L = bd1Var3;
        bd1 bd1Var4 = bd1.a;
        M = bd1Var4;
        N = bd1Var4;
        O = bd1Var4;
        P = bd1Var;
        Q = bd1Var4;
        R = bd1Var4;
        S = bd1Var2;
        T = bd1Var2;
        U = bd1Var;
        V = bd1Var;
        W = bd1Var;
        X = bd1Var3;
        Y = bd1Var;
        Z = bd1Var;
        a0 = bd1Var;
        b0 = bd1Var;
        c0 = bd1Var;
        d0 = new ayb(0.31006f, 0.31616f);
        e0 = new ayb(0.34567f, 0.3585f);
        f0 = new ayb(0.32168f, 0.33767f);
        g0 = new ayb(0.31271f, 0.32902f);
        h0 = new float[]{0.964212f, 1.0f, 0.825188f};
        i0 = new wd1();
        j0 = cd1.d;
        k0 = cd1.y;
        l0 = y89.c;
        m0 = cd1.x;
        cd1 cd1Var = cd1.f;
        n0 = cd1Var;
        o0 = cd1Var;
        p0 = 80.0f;
        q0 = ybb.c;
        r0 = new mo8();
        s0 = new Object();
        t0 = new s9b(new t3b(24), new elb(11));
        u0 = new s9b(new t3b(25), new t3b(26));
        v0 = new s9b(new t3b(27), new t3b(i7));
        w0 = new s9b(new t3b(i5), new elb(0));
        x0 = new s9b(new elb(1), new elb(2));
        y0 = new s9b(new elb(3), new elb(4));
        z0 = new s9b(new elb(5), new elb(6));
        A0 = new s9b(new elb(7), new elb(8));
        B0 = new s9b(new elb(9), new elb(10));
    }

    public static g71 A(dd4 dd4Var) {
        ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
        g71 g71Var = ad1Var.b0;
        if (g71Var != null) {
            return g71Var;
        }
        long jD = dd1.d(ad1Var, m71.e);
        long j2 = lc1.i;
        long jD2 = dd1.d(ad1Var, m71.d);
        cd1 cd1Var = m71.a;
        long jD3 = dd1.d(ad1Var, cd1Var);
        cd1 cd1Var2 = m71.b;
        long jD4 = dd1.d(ad1Var, cd1Var2);
        float f2 = m71.c;
        g71 g71Var2 = new g71(jD, j2, jD3, j2, lc1.c(f2, jD4), j2, lc1.c(f2, dd1.d(ad1Var, cd1Var2)), dd1.d(ad1Var, cd1Var), dd1.d(ad1Var, m71.i), lc1.c(f2, dd1.d(ad1Var, cd1Var2)), lc1.c(m71.g, dd1.d(ad1Var, m71.h)), lc1.c(f2, dd1.d(ad1Var, cd1Var2)), jD2);
        ad1Var.b0 = g71Var2;
        return g71Var2;
    }

    public static final long B(long j2, long j3) {
        float f2;
        float f3;
        long jB = lc1.b(j2, lc1.g(j3));
        float fE = lc1.e(j3);
        float fE2 = lc1.e(jB);
        float f4 = 1.0f - fE2;
        float f5 = (fE * f4) + fE2;
        float fI = lc1.i(jB);
        float fI2 = lc1.i(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fI2 * fE) * f4) + (fI * fE2)) / f5;
        }
        float fH = lc1.h(jB);
        float fH2 = lc1.h(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((fH2 * fE) * f4) + (fH * fE2)) / f5;
        }
        float f7 = lc1.f(jB);
        float f8 = lc1.f(j3);
        if (f5 != 0.0f) {
            f6 = (((f8 * fE) * f4) + (f7 * fE2)) / f5;
        }
        return s(f2, f3, f6, f5, lc1.g(j3));
    }

    public static boolean C(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = C(file2) && z2;
        }
        return z2;
    }

    public static void D(int i2, hn7 hn7Var) {
        hn7Var.J(7);
        byte[] bArr = hn7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static final ay0 E(jt1 jt1Var) {
        if (!(jt1Var instanceof kw2)) {
            return new ay0(1, jt1Var);
        }
        ay0 ay0VarM = ((kw2) jt1Var).m();
        if (ay0VarM != null) {
            if (!ay0VarM.C()) {
                ay0VarM = null;
            }
            if (ay0VarM != null) {
                return ay0VarM;
            }
        }
        return new ay0(2, jt1Var);
    }

    public static final ir9 F(hk9 hk9Var) {
        ir9 ir9Var = hk9Var.a;
        ir9Var.getClass();
        return vj9.t(ir9Var, hk9Var);
    }

    public static final int G(hk9 hk9Var) {
        ir9 ir9Var = hk9Var.a;
        ir9Var.getClass();
        return vj9.h(ir9Var).e;
    }

    public static c75 H(l63 l63Var, sj8 sj8Var, long j2, int i2) {
        if ((i2 & 2) != 0) {
            sj8Var = sj8.a;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        return new c75(l63Var, sj8Var, j2);
    }

    public static final oq9 I(vx1 vx1Var, jx1 jx1Var, zx1 zx1Var, yb4 yb4Var) {
        jx1 jx1VarQ0 = lx1.q0(vx1Var, jx1Var);
        zx1Var.getClass();
        oq9 vu5Var = zx1Var == zx1.b ? new vu5(jx1VarQ0, yb4Var) : new oq9(jx1VarQ0, true);
        vu5Var.r0(zx1Var, vu5Var, yb4Var);
        return vu5Var;
    }

    public static /* synthetic */ oq9 J(vx1 vx1Var, jx1 jx1Var, zx1 zx1Var, yb4 yb4Var, int i2) {
        if ((i2 & 1) != 0) {
            jx1Var = hc3.a;
        }
        if ((i2 & 2) != 0) {
            zx1Var = zx1.a;
        }
        return I(vx1Var, jx1Var, zx1Var, yb4Var);
    }

    public static final long K(long j2, long j3, float f2) {
        rc7 rc7Var = hd1.x;
        long jB = lc1.b(j2, rc7Var);
        long jB2 = lc1.b(j3, rc7Var);
        float fE = lc1.e(jB);
        float fI = lc1.i(jB);
        float fH = lc1.h(jB);
        float f3 = lc1.f(jB);
        float fE2 = lc1.e(jB2);
        float fI2 = lc1.i(jB2);
        float fH2 = lc1.h(jB2);
        float f4 = lc1.f(jB2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return lc1.b(s(sw1.V(fI, fI2, f2), sw1.V(fH, fH2, f2), sw1.V(f3, f4, f2), sw1.V(fE, fE2, f2), rc7Var), lc1.g(j3));
    }

    public static final boolean L(hk9 hk9Var, kb4 kb4Var) {
        int i2;
        o2 o2Var;
        Object objInvoke;
        oj9 oj9VarJ;
        boolean zY;
        do {
            synchronized (s0) {
                ir9 ir9Var = hk9Var.a;
                ir9Var.getClass();
                ir9 ir9VarH = vj9.h(ir9Var);
                i2 = ir9VarH.d;
                o2Var = ir9VarH.c;
            }
            o2Var.getClass();
            yr7 yr7VarF = o2Var.f();
            objInvoke = kb4Var.invoke(yr7VarF);
            o2 o2VarD = yr7VarF.d();
            if (lc5.Q(o2VarD, o2Var)) {
                break;
            }
            ir9 ir9Var2 = hk9Var.a;
            ir9Var2.getClass();
            synchronized (vj9.c) {
                oj9VarJ = vj9.j();
                zY = y(vj9.w(ir9Var2, hk9Var, oj9VarJ), i2, o2VarD, true);
            }
            vj9.n(oj9VarJ, hk9Var);
        } while (!zY);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void M(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new s61(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m3 N(y01 r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = defpackage.ah1.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            m3 r1 = new m3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.N(y01):m3");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static void O(y01 y01Var, l3 l3Var) throws qn7 {
        int iG = y01Var.g(5);
        y01Var.o(2);
        if (y01Var.f()) {
            y01Var.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            y01Var.n();
        }
        if (y01Var.f()) {
            int iG2 = y01Var.g(3);
            if (l3Var.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                l3Var.b = iG;
            }
            if (y01Var.f()) {
                V(y01Var);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static void P(y01 y01Var, l3 l3Var) throws qn7 {
        y01Var.o(2);
        boolean zF = y01Var.f();
        int iG = y01Var.g(8);
        for (int i2 = 0; i2 < iG; i2++) {
            y01Var.o(2);
            if (y01Var.f()) {
                y01Var.o(5);
            }
            if (zF) {
                y01Var.o(24);
            } else {
                if (y01Var.f()) {
                    if (!y01Var.f()) {
                        y01Var.o(4);
                    }
                    l3Var.c = y01Var.g(6) + 1;
                }
                y01Var.o(4);
            }
        }
        if (y01Var.f()) {
            y01Var.o(3);
            if (y01Var.f()) {
                V(y01Var);
            }
        }
    }

    public static final zg9 Q(sr1 sr1Var, dd4 dd4Var) {
        sr1Var.getClass();
        boolean zEquals = sr1Var.equals(ra1.u);
        boolean zG = dd4Var.g(zEquals);
        Object objQ = dd4Var.Q();
        if (zG || objQ == vl1.a) {
            objQ = zEquals ? zg9.p : new xp1();
            dd4Var.p0(objQ);
        }
        return (zg9) objQ;
    }

    public static final int R(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final Object S(jx1 jx1Var, yb4 yb4Var) throws Throwable {
        zg3 zg3VarA;
        jx1 jx1VarF0;
        long jO0;
        Thread threadCurrentThread = Thread.currentThread();
        ix1 ix1Var = g83.d;
        lt1 lt1Var = (lt1) jx1Var.get(ix1Var);
        hc3 hc3Var = hc3.a;
        if (lt1Var == null) {
            zg3VarA = isa.a();
            jx1VarF0 = lx1.f0(hc3Var, jx1Var.plus(zg3VarA), true);
            aj2 aj2Var = rw2.a;
            if (jx1VarF0 != aj2Var && jx1VarF0.get(ix1Var) == null) {
                jx1VarF0 = jx1VarF0.plus(aj2Var);
            }
        } else {
            zg3VarA = (zg3) isa.a.get();
            jx1VarF0 = lx1.f0(hc3Var, jx1Var, true);
            aj2 aj2Var2 = rw2.a;
            if (jx1VarF0 != aj2Var2 && jx1VarF0.get(ix1Var) == null) {
                jx1VarF0 = jx1VarF0.plus(aj2Var2);
            }
        }
        kh0 kh0Var = new kh0(jx1VarF0, threadCurrentThread, zg3VarA);
        kh0Var.r0(zx1.a, kh0Var, yb4Var);
        zg3 zg3Var = kh0Var.s;
        if (zg3Var != null) {
            int i2 = zg3.f;
            zg3Var.F0(false);
        }
        while (true) {
            if (zg3Var != null) {
                try {
                    jO0 = zg3Var.O0();
                } catch (Throwable th) {
                    if (zg3Var != null) {
                        int i3 = zg3.f;
                        zg3Var.p0(false);
                    }
                    throw th;
                }
            } else {
                jO0 = Long.MAX_VALUE;
            }
            if (kh0Var.M()) {
                break;
            }
            LockSupport.parkNanos(kh0Var, jO0);
            if (Thread.interrupted()) {
                kh0Var.r(new InterruptedException());
            }
        }
        if (zg3Var != null) {
            int i4 = zg3.f;
            zg3Var.p0(false);
        }
        Object objA = qe5.a(kh0Var.H());
        ei1 ei1Var = objA instanceof ei1 ? (ei1) objA : null;
        if (ei1Var == null) {
            return objA;
        }
        throw ei1Var.a;
    }

    public static final ou6 U(yb4 yb4Var) {
        return new tca(yb4Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static void V(y01 y01Var) throws qn7 {
        int iG = y01Var.g(6);
        if (iG < 2 || iG > 42) {
            throw qn7.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        y01Var.o(iG * 8);
    }

    public static kp9 W(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new kp9(f2, f3, obj);
    }

    public static final int X(long j2) {
        float[] fArr = hd1.a;
        return (int) (lc1.b(j2, hd1.e) >>> 32);
    }

    public static final String Y(byte b2) {
        char[] cArr = gc1.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String Z(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = gc1.b;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return iw9.y(cArr2, i3, 8);
    }

    public static final void a(boolean z2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        dd4Var.h0(-994057707);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(ib4Var2) ? 256 : Token.CASE) | (dd4Var.h(ib4Var3) ? 2048 : 1024) | (dd4Var.h(ib4Var4) ? 16384 : 8192);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            gx1.a(z2, null, 0L, null, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var, jf0.G(-1904639967, new sp2(ib4Var3, ib4Var2, ib4Var4, i4), dd4Var), dd4Var, (i3 & 14) | 12779520 | ((i3 << 15) & 3670016), 30);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp2(z2, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2, 1);
        }
    }

    public static p9b a0(int i2, int i3, a83 a83Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            a83Var = b83.a;
        }
        return new p9b(i2, i3, a83Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.t27 r27, pj7 r28, szb r29, java.lang.String r30, boolean r31, ou6 r32, dd4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.b(t27, pj7, szb, java.lang.String, boolean, ou6, dd4, int, int):void");
    }

    public static final Object b0(jx1 jx1Var, yb4 yb4Var, jt1 jt1Var) throws Throwable {
        jx1 context = jt1Var.getContext();
        byte b2 = 0;
        jx1 jx1VarPlus = !((Boolean) jx1Var.fold(Boolean.FALSE, new kx1(b2, b2))).booleanValue() ? context.plus(jx1Var) : lx1.f0(context, jx1Var, false);
        qx1.s(jx1VarPlus);
        if (jx1VarPlus == context) {
            fv8 fv8Var = new fv8(jt1Var, jx1VarPlus);
            return hn9.u(fv8Var, true, fv8Var, yb4Var);
        }
        g83 g83Var = g83.d;
        if (lc5.Q(jx1VarPlus.get(g83Var), context.get(g83Var))) {
            aeb aebVar = new aeb(jt1Var, jx1VarPlus);
            jx1 jx1Var2 = aebVar.e;
            Object objC = gsa.c(jx1Var2, null);
            try {
                return hn9.u(aebVar, true, aebVar, yb4Var);
            } finally {
                gsa.a(jx1Var2, objC);
            }
        }
        mw2 mw2Var = new mw2(jt1Var, jx1VarPlus);
        try {
            lw2.a(bx1.J(bx1.C(mw2Var, mw2Var, yb4Var)), heb.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = mw2.s;
            do {
                int i2 = atomicIntegerFieldUpdater.get(mw2Var);
                if (i2 != 0) {
                    if (i2 != 2) {
                        gp.j("Already suspended");
                        return null;
                    }
                    Object objA = qe5.a(mw2Var.H());
                    if (objA instanceof ei1) {
                        throw ((ei1) objA).a;
                    }
                    return objA;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(mw2Var, 0, 1));
            return xx1.a;
        } catch (Throwable th) {
            vo1.Q(mw2Var, th);
            throw null;
        }
    }

    public static final void c(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        String strK;
        String strK2;
        dd4Var.h0(66994602);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2 | (dd4Var.f(ou6Var) ? 32 : 16);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            p35 p35VarN0 = lx1.n0(dd4Var);
            if (z2) {
                dd4Var.f0(-1323427725);
                strK = wn9.K((pv9) eu9.A.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1323353294);
                strK = wn9.K((pv9) eu9.y.getValue(), dd4Var);
                dd4Var.q(false);
            }
            if (z2) {
                dd4Var.f0(-1323241849);
                strK2 = wn9.K((pv9) eu9.B.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1323155514);
                strK2 = wn9.K((pv9) eu9.z.getValue(), dd4Var);
                dd4Var.q(false);
            }
            bx1.d(p35VarN0, strK, strK2, ou6Var.e(tg9.c), (String) null, (ib4) null, dd4Var, 0, 48);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, i4);
        }
    }

    public static final Object c0(iy iyVar, byte[] bArr, kt1 kt1Var) {
        Object objF = iyVar.f(bArr, 0, bArr.length, kt1Var);
        return objF == xx1.a ? objF : heb.a;
    }

    public static final void d(wk0 wk0Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        ib4 ib4Var3;
        Object obj;
        iv ivVar;
        Object obj2;
        boolean z2;
        Object obj3;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        wf0 wf0Var = bv4.x;
        dd4Var2.h0(-1010705114);
        int i4 = i2 | (dd4Var2.h(wk0Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
            sgb sgbVar = wk0Var.g;
            List<String> list = wk0Var.i;
            String str = wk0Var.d;
            String str2 = wk0Var.b;
            sgb sgbVar2 = wk0Var.g;
            boolean zF = dd4Var2.f(sgbVar.f);
            Object objQ = dd4Var2.Q();
            Object obj4 = vl1.a;
            if (zF || objQ == obj4) {
                List list2 = sgbVar2.f;
                ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lc1(kf0.H((String) it.next())));
                    i4 = i4;
                }
                i3 = i4;
                dd4Var2.p0(arrayList);
                objQ = arrayList;
            } else {
                i3 = i4;
            }
            List list3 = (List) objQ;
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
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
            iv ivVar2 = pv.a;
            eq8 eq8VarA = dq8.a(ivVar2, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            String str3 = sgbVar2.c;
            qr1 qr1Var = ra1.d;
            int i5 = i3;
            w05.a(str3, qr1Var, false, null, null, fe.L(t96.w(tg9.n(lu6Var, 30.0f), tp8.a), s00.o(dd4Var2).a, lp4Var), null, dd4Var, 48, 444);
            un9.a(dd4Var, tg9.r(lu6Var, 10.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, bp5Var);
            dd4Var.j0();
            if (dd4Var.S) {
                ib4Var3 = ib4Var4;
                dd4Var.k(ib4Var3);
            } else {
                ib4Var3 = ib4Var4;
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ib4 ib4Var5 = ib4Var3;
            i12.c(sgbVar2.b, (ou6) null, list3, wn9.x(16), 0L, new vaa(5), 0L, 0, false, 1, 0, s00.q(dd4Var).h, dd4Var, 3072, 3072, 56818);
            un9.a(dd4Var, tg9.h(lu6Var, 2.0f));
            ri9.f(wk0Var.n, (ou6) null, false, s00.o(dd4Var).s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 0, 0, 131062);
            ky0.A(dd4Var, true, lu6Var, 12.0f, dd4Var);
            xv5.z(dd4Var, true, lu6Var, 14.0f, dd4Var);
            ou6 ou6VarH = ky0.h(dd4Var, 7.0f, t96.w(tg9.f(lu6Var, 1.0f), s00.p(dd4Var).c), lp4Var);
            boolean z3 = (i5 & 7168) == 2048;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj4) {
                m50 m50Var = new m50(1, ib4Var2);
                dd4Var.p0(m50Var);
                obj = m50Var;
            } else {
                obj = objQ2;
            }
            ou6 ou6VarL04 = gjb.l0(fw.J(null, (ib4) obj, ou6VarH, false, 15), 10.0f);
            eq8 eq8VarA2 = dq8.a(ivVar2, wf0Var, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL05);
            Object obj5 = obj4;
            w05.d(str2, wk0Var.c, wk0Var.e, qr1Var, t96.w(tg9.o(lu6Var, 48.0f, 72.0f), s00.p(dd4Var).b), dd4Var, 3072);
            un9.a(dd4Var, tg9.r(lu6Var, 12.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var2 = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL06 = s32.L0(dd4Var, bp5Var2);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL06);
            nha.c(str2, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var).i, dd4Var, 48, 24960, 109564);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            nha.c(str, tg9.f(lu6Var, 1.0f), s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 48, 24960, 109560);
            un9.a(dd4Var, xv5.g(dd4Var, true, true, lu6Var, 12.0f));
            nha.c(wk0Var.f, tg9.f(lu6Var, 1.0f), lc1.c(0.88f, s00.o(dd4Var).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 4, 0, (kb4) null, s00.q(dd4Var).j, dd4Var, 48, 24960, 109560);
            dd4 dd4Var3 = dd4Var;
            if (list.isEmpty()) {
                ivVar = ivVar2;
                obj2 = obj5;
                dd4Var3.f0(-1955145882);
                dd4Var3.q(false);
            } else {
                ky0.z(dd4Var3, -1955561034, lu6Var, 10.0f, dd4Var3);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                ivVar = ivVar2;
                eq8 eq8VarA3 = dq8.a(ivVar, bv4.w, dd4Var3, 0);
                int iHashCode6 = Long.hashCode(dd4Var3.T);
                lr7 lr7VarL6 = dd4Var3.l();
                ou6 ou6VarL07 = s32.L0(dd4Var3, ou6VarF2);
                dd4Var3.j0();
                if (dd4Var3.S) {
                    dd4Var3.k(ib4Var5);
                } else {
                    dd4Var3.s0();
                }
                un9.s(jmVar, dd4Var3, eq8VarA3);
                un9.s(jmVar2, dd4Var3, lr7VarL6);
                ky0.v(iHashCode6, dd4Var3, jmVar3, dd4Var3, kdVar);
                un9.s(jmVar4, dd4Var3, ou6VarL07);
                dd4Var3.f0(1708764907);
                for (String str4 : list) {
                    Object objQ3 = dd4Var3.Q();
                    Object obj6 = obj5;
                    if (objQ3 == obj6) {
                        objQ3 = new dh1(1);
                        dd4Var3.p0(objQ3);
                    }
                    fz1.F(str4, null, 0L, null, (ib4) objQ3, dd4Var, 24576);
                    dd4Var3 = dd4Var;
                    un9.a(dd4Var3, tg9.r(lu6Var, 6.0f));
                    obj5 = obj6;
                }
                obj2 = obj5;
                tw2.x(dd4Var3, false, true, false);
            }
            ou6 ou6VarH2 = xv5.h(lu6Var, 14.0f, dd4Var3, lu6Var, 1.0f);
            eq8 eq8VarA4 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
            int iHashCode7 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL7 = dd4Var3.l();
            ou6 ou6VarL08 = s32.L0(dd4Var3, ou6VarH2);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(ll1.f, dd4Var3, eq8VarA4);
            un9.s(ll1.e, dd4Var3, lr7VarL7);
            un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode7));
            un9.r(dd4Var3, ll1.h);
            un9.s(ll1.d, dd4Var3, ou6VarL08);
            h(String.valueOf(wk0Var.k), wk0Var.l ? (m53) h53.l.getValue() : (m53) h53.k.getValue(), wk0Var.l, ib4Var, dd4Var3, (i5 << 3) & 7168);
            un9.a(dd4Var3, tg9.r(lu6Var, 8.0f));
            String strValueOf = String.valueOf(wk0Var.m);
            m53 m53Var = (m53) a53.u.getValue();
            Object objQ4 = dd4Var3.Q();
            if (objQ4 == obj2) {
                z2 = true;
                dh1 dh1Var = new dh1(true ? 1 : 0);
                dd4Var3.p0(dh1Var);
                obj3 = dh1Var;
            } else {
                z2 = true;
                obj3 = objQ4;
            }
            h(strValueOf, m53Var, false, (ib4) obj3, dd4Var3, 3456);
            un9.a(dd4Var3, new bp5(1.0f, z2));
            un9.a(dd4Var3, tg9.r(lu6Var, 8.0f));
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            ur9 ur9Var = s96.a;
            nha.c(upperCase, gjb.m0(fe.L(t96.w(lu6Var, tp8.a), lc1.c(0.12f, ((q96) dd4Var3.j(ur9Var)).a.a), lp4Var), 10.0f, 6.0f), ((q96) dd4Var3.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.n, dd4Var, 0, 24960, 110584);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(wk0Var, ou6Var, ib4Var, ib4Var2, i2, 11);
        }
    }

    public static final void e(sl0 sl0Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        kb4 kb4Var4;
        kb4 kb4Var5;
        dd4Var.h0(-1636860607);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(sl0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var.f(szbVar2) ? 256 : Token.CASE;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var.h(kb4Var4) ? 8388608 : 4194304;
        } else {
            kb4Var4 = kb4Var2;
        }
        if ((100663296 & i2) == 0) {
            kb4Var5 = kb4Var3;
            i3 |= dd4Var.h(kb4Var5) ? 67108864 : 33554432;
        } else {
            kb4Var5 = kb4Var3;
        }
        int i5 = i3;
        if (dd4Var.V(i5 & 1, (38347923 & i5) != 38347922)) {
            g78 g78VarB = z68.b(dd4Var);
            uu5 uu5VarF0 = tw1.f0(dd4Var);
            int i6 = i5 >> 9;
            mt5.d(uu5VarF0, ib4Var2, dd4Var, i6 & 896);
            z68.a(sl0Var.a, ib4Var, ou6Var, g78VarB, (f9) null, jf0.G(-245254648, new c41(i4, g78VarB, sl0Var, pj7Var), dd4Var), false, 0.0f, jf0.G(1535211365, new el0(uu5VarF0, pj7Var, szbVar2, sl0Var, kb4Var4, kb4Var, kb4Var5, 0), dd4Var), dd4Var, (i6 & Token.ASSIGN_MOD) | 100859904 | ((i5 >> 3) & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(sl0Var, pj7Var, szbVar, ou6Var, ib4Var, ib4Var2, kb4Var, kb4Var2, kb4Var3, i2);
        }
    }

    public static final void f(pj7 pj7Var, szb szbVar, ou6 ou6Var, dd4 dd4Var, int i2) {
        pj7 pj7Var2;
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(753638155);
        if ((i2 & 6) == 0) {
            pj7Var2 = pj7Var;
            i3 = (dd4Var.f(pj7Var2) ? 4 : 2) | i2;
        } else {
            pj7Var2 = pj7Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(szbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            iq9 iq9Var = new iq9(320.0f);
            int i4 = i3;
            uu5 uu5VarF0 = tw1.f0(dd4Var);
            int i5 = 5;
            mv mvVar = new mv(6.0f, true, new gp(5));
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new vi0(i5);
                dd4Var.p0(objQ);
            }
            gx1.j(iq9Var, ou6Var2, uu5VarF0, pj7Var2, 6.0f, mvVar, null, false, 0L, 0L, szbVar, (kb4) objQ, dd4Var, ((i4 >> 3) & Token.ASSIGN_MOD) | 102432768 | ((i4 << 9) & 7168), (i4 & Token.ASSIGN_MOD) | 384, 1680);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yk0(pj7Var, szbVar, ou6Var, i2, 0);
        }
    }

    public static final void g(int i2, int i3, dd4 dd4Var, ou6 ou6Var) {
        int i4;
        ib4 ib4Var;
        dd4Var.h0(651635603);
        int i5 = i3 | (dd4Var.d(i2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i5 & 1, (i5 & 19) != 18)) {
            float f2 = i2 != 1 ? i2 != 2 ? 0.7f : 0.62f : 0.78f;
            float f3 = i2 != 1 ? i2 != 2 ? 0.35f : 0.42f : 0.28f;
            float f4 = i2 != 1 ? i2 != 2 ? 0.8f : 0.88f : 0.72f;
            float f5 = i2 != 1 ? i2 != 2 ? 0.44f : 0.36f : 0.52f;
            float f6 = i2 != 1 ? i2 != 2 ? 0.48f : 0.6f : 0.34f;
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var2 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var2);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            ou6 ou6Var2 = lu6.a;
            float f7 = f6;
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            wf0 wf0Var = bv4.x;
            float f8 = f5;
            iv ivVar = pv.a;
            float f9 = f4;
            float f10 = f3;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            float f11 = f2;
            if (dd4Var.S) {
                ib4Var = ib4Var2;
                dd4Var.k(ib4Var);
            } else {
                ib4Var = ib4Var2;
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ou6 ou6VarN = tg9.n(ou6Var2, 30.0f);
            rp8 rp8Var = tp8.a;
            q(null, t96.w(ou6VarN, rp8Var), dd4Var, 0, 1);
            un9.a(dd4Var, tg9.r(ou6Var2, 10.0f));
            hq8 hq8Var = hq8.a;
            ou6 ou6VarB = hq8Var.b(1.0f, ou6Var2, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarB);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            r(tg9.h(tg9.r(ou6Var2, 110.0f), 18.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(ou6Var2, 4.0f));
            r(tg9.h(tg9.r(ou6Var2, 72.0f), 12.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, xv5.g(dd4Var, true, true, ou6Var2, 14.0f));
            ou6 ou6VarF2 = tg9.f(ou6Var2, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL04 = gjb.l0(fe.L(t96.w(ou6VarF2, ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 7.0f), jf0.G), 10.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL05);
            q(null, t96.w(tg9.o(ou6Var2, 48.0f, 72.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd4Var, 0, 1);
            un9.a(dd4Var, tg9.r(ou6Var2, 12.0f));
            ou6 ou6VarB2 = hq8Var.b(1.0f, ou6Var2, true);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarB2);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL06);
            r(tg9.h(tg9.f(ou6Var2, f11), 16.0f), null, dd4Var, 0, 2);
            r(tg9.h(xv5.h(ou6Var2, 4.0f, dd4Var, ou6Var2, f10), 12.0f), null, dd4Var, 0, 2);
            un9.a(dd4Var, xv5.g(dd4Var, true, true, ou6Var2, 12.0f));
            r(tg9.h(tg9.f(ou6Var2, 1.0f), 14.0f), null, dd4Var, 6, 2);
            r(tg9.h(xv5.h(ou6Var2, 6.0f, dd4Var, ou6Var2, f9), 14.0f), null, dd4Var, 0, 2);
            r(tg9.h(xv5.h(ou6Var2, 6.0f, dd4Var, ou6Var2, f8), 14.0f), null, dd4Var, 0, 2);
            r(tg9.h(xv5.h(ou6Var2, 6.0f, dd4Var, ou6Var2, f7), 14.0f), null, dd4Var, 0, 2);
            ou6 ou6VarH = xv5.h(ou6Var2, 14.0f, dd4Var, ou6Var2, 1.0f);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode6 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL6 = dd4Var.l();
            ou6 ou6VarL07 = s32.L0(dd4Var, ou6VarH);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL6);
            ky0.v(iHashCode6, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL07);
            r(tg9.h(tg9.r(ou6Var2, 62.0f), 30.0f), rp8Var, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.r(ou6Var2, 8.0f));
            r(tg9.h(tg9.r(ou6Var2, 62.0f), 30.0f), rp8Var, dd4Var, 6, 0);
            i4 = 1;
            un9.a(dd4Var, hq8Var.b(1.0f, ou6Var2, true));
            r(tg9.h(tg9.r(ou6Var2, 58.0f), 28.0f), rp8Var, dd4Var, 6, 0);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            i4 = 1;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ue(i2, i3, i4, ou6Var);
        }
    }

    public static final void h(String str, m53 m53Var, boolean z2, ib4 ib4Var, dd4 dd4Var, int i2) {
        String str2;
        int i3;
        long jG;
        ou6 ou6VarG;
        long j2;
        long j3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-541199655);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (dd4Var2.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(m53Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
            rp8 rp8Var = tp8.a;
            ou6 ou6Var = lu6.a;
            ou6 ou6VarW = t96.w(ou6Var, rp8Var);
            if (z2) {
                dd4Var2.f0(428539116);
                jG = lc1.c(0.14f, ((q96) dd4Var2.j(s96.a)).a.a);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(428637386);
                jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 8.0f);
                dd4Var2.q(false);
            }
            ou6 ou6VarL = fe.L(ou6VarW, jG, jf0.G);
            if (z2) {
                dd4Var2.f0(428800849);
                ou6VarG = fw.G(ou6Var, 1.0f, lc1.c(0.18f, ((q96) dd4Var2.j(s96.a)).a.a), rp8Var);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(429046617);
                dd4Var2.q(false);
                ou6VarG = ou6Var;
            }
            ou6 ou6VarE = ou6VarL.e(ou6VarG);
            boolean z3 = (i4 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new m50(2, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.s(ou6VarE, false, 0.94f, (ib4) objQ, 1), 10.0f, 7.0f);
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
            p35 p35VarC = i25.c(m53Var, dd4Var2, (i4 >> 3) & 14);
            if (z2) {
                dd4Var2.f0(-69076484);
                j2 = ((q96) dd4Var2.j(s96.a)).a.a;
            } else {
                dd4Var2.f0(-69075227);
                j2 = ((q96) dd4Var2.j(s96.a)).a.s;
            }
            dd4Var2.q(false);
            mx4.a(p35VarC, (String) null, tg9.n(ou6Var, 16.0f), j2, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.r(ou6Var, 6.0f));
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.m;
            if (z2) {
                dd4Var2.f0(-69066372);
                j3 = ((q96) dd4Var2.j(ur9Var)).a.a;
            } else {
                dd4Var2.f0(-69065115);
                j3 = ((q96) dd4Var2.j(ur9Var)).a.s;
            }
            dd4Var2.q(false);
            nha.c(str2, (ou6) null, j3, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i4 & 14, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new al0(str, m53Var, z2, ib4Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r21, float r22, float r23, float r24, ed1 r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.i(float, float, float, float, ed1):long");
    }

    public static final long j(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = lc1.k;
        return j2;
    }

    public static final long k(int i2, int i3, int i4, int i5) {
        return j(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long l(long j2) {
        long j3 = j2 << 32;
        int i2 = lc1.k;
        return j3;
    }

    public static final void n(List list, pj7 pj7Var, ou6 ou6Var, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1885377413);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zF = dd4Var.f(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = dk9.x(list);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var, 14)), gjb.q(0.0f, 0.0f, 0.0f, 80.0f, 7));
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new xs1(a07Var, null, i4);
                dd4Var.p0(objQ2);
            }
            pj8 pj8VarU0 = lx1.u0(st5VarA, szbVarW, (ac4) objQ2, dd4Var);
            boolean zF3 = ((i3 & 7168) == 2048) | dd4Var.f(a07Var) | dd4Var.f(pj8VarU0) | ((57344 & i3) == 16384);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                um umVar = new um(a07Var, pj8VarU0, (ub4) yb4Var, kb4Var, 9);
                dd4Var.p0(umVar);
                objQ3 = umVar;
            }
            gx1.h(ou6Var, st5VarA, szbVarW, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) objQ3, dd4Var, (i3 >> 6) & 14, 0, 4088);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41((Object) list, (Object) pj7Var, ou6Var, (ub4) yb4Var, kb4Var, i2, 4);
        }
    }

    public static final void o(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        int i3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(926715325);
        int i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i4 & 1, (i4 & 19) != 18)) {
            ou6 ou6VarL0 = gjb.l0(ou6Var, 24.0f);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            nha.c(wn9.K((pv9) zt9.w0.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            i3 = 2;
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.f.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i4 << 21) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            i3 = 2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, i3);
        }
    }

    public static final void p(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(22396105);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            xz2 xz2Var = (xz2) ((qtb) qx1.N(ug8.a(xz2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(xz2Var.d, dd4Var);
            Object[] objArr = new Object[0];
            rt8 rt8Var = o83.e;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uj6(i4);
                dd4Var.p0(objQ);
            }
            o83 o83Var = (o83) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            int i5 = 11;
            if (objQ2 == obj) {
                objQ2 = new bs2(i5);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            ms7 ms7Var = new ms7(gc1.Y("json"));
            boolean zF = dd4Var.f(xz2Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new rz2(xz2Var, i4);
                dd4Var.p0(objQ3);
            }
            aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ3, dd4Var, 8);
            lva lvaVar = (lva) dd4Var.j(nva.a);
            pp1 pp1Var = xz2Var.e;
            boolean zF2 = dd4Var.f(lvaVar);
            Object objQ4 = dd4Var.Q();
            int i6 = 3;
            jt1 jt1Var = null;
            if (zF2 || objQ4 == obj) {
                objQ4 = new xa(lvaVar, jt1Var, i6);
                dd4Var.p0(objQ4);
            }
            wx1.e(pp1Var, null, (zb4) objQ4, dd4Var, 0);
            gx1.p(wn9.K((pv9) ru9.l.getValue(), dd4Var), tg9.c, false, jf0.G(2055847749, new q41(t27Var, 17), dd4Var), jf0.G(906391150, new c41(11, a07Var, (Object) xz2Var, (Object) aw3VarC0), dd4Var), jf0.G(-578385645, new ak0(i6, o83Var, xz2Var, a07VarB), dd4Var), dd4Var, 224304, 4);
            boolean zF3 = dd4Var.f(xz2Var);
            Object objQ5 = dd4Var.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new ah(xz2Var, 12);
                dd4Var.p0(objQ5);
            }
            e11.p(o83Var, (yb4) objQ5, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 18, t27Var);
        }
    }

    public static final void q(jd9 jd9Var, ou6 ou6Var, dd4 dd4Var, int i2, int i3) {
        dd4Var.h0(523799468);
        int i4 = (i2 & 6) == 0 ? i2 | 2 : i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                jd9Var = yn2.O(nd9.a, dd4Var);
                if (i5 != 0) {
                    ou6Var = lu6.a;
                }
            } else {
                dd4Var.Y();
            }
            dd4Var.r();
            ou6Var.getClass();
            ou6 ou6VarX = s32.X(ou6Var, new rt6(jd9Var, 9));
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarX);
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
            px3 px3Var = tg9.c;
            ur9 ur9Var = s96.a;
            pn0.a(fe.L(px3Var, lc1.c(0.1f, dd1.a(((q96) dd4Var.j(ur9Var)).a, ((q96) dd4Var.j(ur9Var)).a.p)), jf0.G), dd4Var, 0);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        jd9 jd9Var2 = jd9Var;
        ou6 ou6Var2 = ou6Var;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hx(jd9Var2, ou6Var2, i2, i3, 4);
        }
    }

    public static final void r(ou6 ou6Var, t89 t89Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        dd4Var.h0(1582646960);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ((i3 & 2) == 0 && dd4Var.f(t89Var)) ? 32 : 16;
        }
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            } else if ((i3 & 2) != 0) {
                t89Var = ((q96) dd4Var.j(s96.a)).c.b;
            }
            dd4Var.r();
            q(null, t96.w(ou6Var, t89Var), dd4Var, 0, 1);
        } else {
            dd4Var.Y();
        }
        t89 t89Var2 = t89Var;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hx(ou6Var, t89Var2, i2, i3, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long s(float r17, float r18, float r19, float r20, ed1 r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.s(float, float, float, float, ed1):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.ib4 r4, defpackage.yb4 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.oa
            if (r0 == 0) goto L13
            r0 = r6
            oa r0 = (defpackage.oa) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            oa r0 = new oa
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.e11.e0(r6)     // Catch: defpackage.ia -> L40
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2c:
            defpackage.e11.e0(r6)
            ua r6 = new ua     // Catch: defpackage.ia -> L40
            r1 = 0
            r6.<init>(r4, r5, r3, r1)     // Catch: defpackage.ia -> L40
            r0.b = r2     // Catch: defpackage.ia -> L40
            java.lang.Object r4 = defpackage.wx1.a0(r6, r0)     // Catch: defpackage.ia -> L40
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L40
            return r5
        L40:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.t(ib4, yb4, kt1):java.lang.Object");
    }

    public static final void u(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final Object v(ob obVar, Object obj, float f2, o1a o1aVar) {
        Object objB = obVar.b(obj, j07.a, new na(obVar, f2, null), o1aVar);
        return objB == xx1.a ? objB : heb.a;
    }

    public static final boolean w(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static nl2 x(vx1 vx1Var, jx1 jx1Var, yb4 yb4Var, int i2) {
        if ((i2 & 1) != 0) {
            jx1Var = hc3.a;
        }
        int i3 = i2 & 2;
        zx1 zx1Var = zx1.b;
        zx1 zx1Var2 = i3 != 0 ? zx1.a : zx1Var;
        jx1 jx1VarQ0 = lx1.q0(vx1Var, jx1Var);
        nl2 up5Var = zx1Var2 == zx1Var ? new up5(jx1VarQ0, yb4Var) : new nl2(jx1VarQ0, true);
        up5Var.r0(zx1Var2, up5Var, yb4Var);
        return up5Var;
    }

    public static final boolean y(ir9 ir9Var, int i2, o2 o2Var, boolean z2) {
        boolean z3;
        synchronized (s0) {
            try {
                int i3 = ir9Var.d;
                if (i3 == i2) {
                    ir9Var.c = o2Var;
                    z3 = true;
                    if (z2) {
                        ir9Var.e++;
                    }
                    ir9Var.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final void z(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder sbO = j39.o(j2, "size=", " offset=");
            sbO.append(j3);
            sbO.append(" byteCount=");
            sbO.append(j4);
            throw new ArrayIndexOutOfBoundsException(sbO.toString());
        }
    }
}
