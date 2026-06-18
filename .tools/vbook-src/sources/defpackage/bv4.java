package defpackage;

import android.os.SystemClock;
import j$.time.LocalDateTime;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bv4 implements rr0, zm8, pm5, mb8, t91, ix1, ur1, vc3, ht3, nj4, fy1 {
    public final /* synthetic */ int a;
    public static final xf0 b = new xf0(-1.0f, -1.0f);
    public static final xf0 c = new xf0(0.0f, -1.0f);
    public static final xf0 d = new xf0(1.0f, -1.0f);
    public static final xf0 e = new xf0(-1.0f, 0.0f);
    public static final xf0 f = new xf0(0.0f, 0.0f);
    public static final xf0 s = new xf0(1.0f, 0.0f);
    public static final xf0 t = new xf0(-1.0f, 1.0f);
    public static final xf0 u = new xf0(0.0f, 1.0f);
    public static final xf0 v = new xf0(1.0f, 1.0f);
    public static final wf0 w = new wf0(-1.0f);
    public static final wf0 x = new wf0(0.0f);
    public static final wf0 y = new wf0(1.0f);
    public static final vf0 z = new vf0(-1.0f);
    public static final vf0 A = new vf0(0.0f);
    public static final vf0 B = new vf0(1.0f);
    public static final /* synthetic */ bv4 C = new bv4(2);
    public static final bv4 D = new bv4(3);
    public static final bv4 E = new bv4(4);
    public static final zm5 F = zm5.a;
    public static final sn2 G = new sn2(1.0f, 1.0f);
    public static final bv4 H = new bv4(5);
    public static final bv4 I = new bv4(6);
    public static final /* synthetic */ bv4 J = new bv4(7);
    public static final ji2 K = new ji2();
    public static final bv4 L = new bv4(8);
    public static final bv4 M = new bv4(9);
    public static final bv4 N = new bv4(10);
    public static final bv4 O = new bv4(11);
    public static final bv4 P = new bv4(12);
    public static final bv4 Q = new bv4(13);

    public /* synthetic */ bv4(int i) {
        this.a = i;
    }

    public static int m(h26 h26Var) {
        LocalDateTime localDateTime = h26Var.a;
        z72 z72VarA = new w16(localDateTime.getYear(), h26Var.b(), 1).a();
        z72VarA.getClass();
        return (localDateTime.getDayOfMonth() + z72VarA.ordinal()) / 7;
    }

    public static jfa n(dd4 dd4Var) {
        ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
        jfa jfaVar = ad1Var.i0;
        if (jfaVar == null) {
            dd4Var.f0(390452338);
            dd4Var.q(false);
            jfaVar = null;
        } else {
            long j = jfaVar.E;
            long j2 = jfaVar.D;
            long j3 = jfaVar.C;
            long j4 = jfaVar.B;
            long j5 = jfaVar.A;
            long j6 = jfaVar.z;
            long j7 = jfaVar.y;
            long j8 = jfaVar.x;
            long j9 = jfaVar.w;
            long j10 = jfaVar.v;
            long j11 = jfaVar.u;
            long j12 = jfaVar.t;
            long j13 = jfaVar.s;
            long j14 = jfaVar.r;
            long j15 = jfaVar.q;
            long j16 = jfaVar.p;
            long j17 = jfaVar.o;
            long j18 = jfaVar.n;
            long j19 = jfaVar.m;
            long j20 = jfaVar.l;
            cka ckaVar = jfaVar.k;
            dd4Var.f0(390452339);
            cka ckaVar2 = (cka) dd4Var.j(dka.a);
            if (!lc5.Q(ckaVar, ckaVar2)) {
                jfa jfaVar2 = new jfa(jfaVar.a, jfaVar.b, jfaVar.c, jfaVar.d, jfaVar.e, jfaVar.f, jfaVar.g, jfaVar.h, jfaVar.i, jfaVar.j, ckaVar2 == null ? ckaVar : ckaVar2, j20, j19, j18, j17, j16, j15, j14, j13, j12, j11, j10, j9, j8, j7, j6, j5, j4, j3, j2, j, jfaVar.F, jfaVar.G, jfaVar.H, jfaVar.I, jfaVar.J, jfaVar.K, jfaVar.L, jfaVar.M, jfaVar.N, jfaVar.O, jfaVar.P, jfaVar.Q);
                ad1Var.i0 = jfaVar2;
                jfaVar = jfaVar2;
            }
            dd4Var.q(false);
        }
        if (jfaVar != null) {
            dd4Var.f0(-1788515437);
            dd4Var.q(false);
            return jfaVar;
        }
        dd4Var.f0(-1788321191);
        long jD = dd1.d(ad1Var, fw.K);
        long jD2 = dd1.d(ad1Var, fw.Q);
        cd1 cd1Var = fw.x;
        long jC = lc1.c(0.38f, dd1.d(ad1Var, cd1Var));
        long jD3 = dd1.d(ad1Var, fw.E);
        long j21 = lc1.i;
        long jD4 = dd1.d(ad1Var, fw.v);
        long jD5 = dd1.d(ad1Var, fw.D);
        cka ckaVar3 = (cka) dd4Var.j(dka.a);
        long jD6 = dd1.d(ad1Var, fw.N);
        long jD7 = dd1.d(ad1Var, fw.W);
        long jC2 = lc1.c(0.12f, dd1.d(ad1Var, fw.A));
        long jD8 = dd1.d(ad1Var, fw.H);
        long jD9 = dd1.d(ad1Var, fw.M);
        long jD10 = dd1.d(ad1Var, fw.V);
        long jC3 = lc1.c(0.38f, dd1.d(ad1Var, fw.z));
        long jD11 = dd1.d(ad1Var, fw.G);
        long jD12 = dd1.d(ad1Var, fw.P);
        long jD13 = dd1.d(ad1Var, fw.Y);
        long jC4 = lc1.c(0.38f, dd1.d(ad1Var, fw.C));
        long jD14 = dd1.d(ad1Var, fw.J);
        long jD15 = dd1.d(ad1Var, fw.L);
        long jD16 = dd1.d(ad1Var, fw.U);
        long jC5 = lc1.c(0.38f, dd1.d(ad1Var, fw.y));
        long jD17 = dd1.d(ad1Var, fw.F);
        cd1 cd1Var2 = fw.R;
        long jD18 = dd1.d(ad1Var, cd1Var2);
        long jD19 = dd1.d(ad1Var, cd1Var2);
        long jC6 = lc1.c(0.38f, dd1.d(ad1Var, cd1Var));
        long jD20 = dd1.d(ad1Var, cd1Var2);
        long jD21 = dd1.d(ad1Var, fw.O);
        long jD22 = dd1.d(ad1Var, fw.X);
        long jC7 = lc1.c(0.38f, dd1.d(ad1Var, fw.B));
        long jD23 = dd1.d(ad1Var, fw.I);
        cd1 cd1Var3 = fw.S;
        long jD24 = dd1.d(ad1Var, cd1Var3);
        long jD25 = dd1.d(ad1Var, cd1Var3);
        long jC8 = lc1.c(0.38f, dd1.d(ad1Var, cd1Var3));
        long jD26 = dd1.d(ad1Var, cd1Var3);
        cd1 cd1Var4 = fw.T;
        jfa jfaVar3 = new jfa(jD, jD2, jC, jD3, j21, j21, j21, j21, jD4, jD5, ckaVar3, jD6, jD7, jC2, jD8, jD9, jD10, jC3, jD11, jD12, jD13, jC4, jD14, jD15, jD16, jC5, jD17, jD18, jD19, jC6, jD20, jD21, jD22, jC7, jD23, jD24, jD25, jC8, jD26, dd1.d(ad1Var, cd1Var4), dd1.d(ad1Var, cd1Var4), lc1.c(0.38f, dd1.d(ad1Var, cd1Var4)), dd1.d(ad1Var, cd1Var4));
        ad1Var.i0 = jfaVar3;
        dd4Var.q(false);
        return jfaVar3;
    }

    public static xr s(String str) {
        Object obj = null;
        String string = str != null ? bw9.B0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        le3 le3Var = xr.f;
        le3Var.getClass();
        n1 n1Var = new n1(le3Var, 0);
        while (true) {
            if (!n1Var.hasNext()) {
                break;
            }
            Object next = n1Var.next();
            if (((xr) next).a.equalsIgnoreCase(string)) {
                obj = next;
                break;
            }
        }
        xr xrVar = (xr) obj;
        return xrVar == null ? xr.c : xrVar;
    }

    public static String v(long j) {
        long j2 = j / 3600;
        long j3 = (j / 60) % 60;
        long j4 = j % 60;
        return j2 <= 0 ? tn9.i("%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j4)}) : j2 < 99 ? tn9.i("%02d:%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}) : tn9.i("%d:%02d:%02d", new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)});
    }

    public static Object w(long j, o1a o1aVar) {
        p95 p95Var = p95.c;
        p95 p95VarG = ny1.G(j);
        p95 p95VarK = r95.a.k();
        mua.Companion.getClass();
        h26 h26VarF = yib.F(p95VarK, lua.a());
        h26 h26VarF2 = yib.F(p95VarG, lua.a());
        LocalDateTime localDateTime = h26VarF.a;
        int dayOfYear = localDateTime.getDayOfYear();
        LocalDateTime localDateTime2 = h26VarF2.a;
        return (dayOfYear == localDateTime2.getDayOfYear() && localDateTime.getYear() == localDateTime2.getYear()) ? wn9.y((pv9) zu9.M.getValue(), o1aVar) : (h26VarF.b() == h26VarF2.b() && m(h26VarF) == m(h26VarF2)) ? zk4.i(j, "EEE") : zk4.i(j, "E, dd MMM");
    }

    public boolean a(eg9 eg9Var) {
        ws2 ws2Var = eg9Var.a;
        if ((ws2Var instanceof ws2 ? ws2Var.a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        ws2 ws2Var2 = eg9Var.b;
        return (ws2Var2 instanceof ws2 ? ws2Var2.a : Integer.MAX_VALUE) > 100;
    }

    public pn2 b() {
        return G;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(jh4 r8, defpackage.jt1 r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.qm5
            if (r0 == 0) goto L13
            r0 = r9
            qm5 r0 = (defpackage.qm5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            qm5 r0 = new qm5
            kt1 r9 = (defpackage.kt1) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r7 = r0.b
            int r9 = r0.d
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L33
            if (r9 != r1) goto L2d
            android.media.ImageReader r8 = r0.a
            defpackage.e11.e0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L9a
        L2a:
            r7 = move-exception
            goto Lac
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L33:
            defpackage.e11.e0(r7)
            long r3 = r8.u
            android.os.Looper r7 = android.os.Looper.myLooper()
            if (r7 != 0) goto L42
            android.os.Looper r7 = android.os.Looper.getMainLooper()
        L42:
            r9 = 32
            long r5 = r3 >> r9
            int r9 = (int) r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            android.media.ImageReader r9 = android.media.ImageReader.newInstance(r9, r3, r1, r1)
            r0.a = r9     // Catch: java.lang.Throwable -> La4
            r0.d = r1     // Catch: java.lang.Throwable -> La4
            ay0 r3 = new ay0     // Catch: java.lang.Throwable -> La4
            jt1 r0 = bx1.J(r0)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> La4
            r3.u()     // Catch: java.lang.Throwable -> La4
            rm5 r0 = new rm5     // Catch: java.lang.Throwable -> La4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La4
            android.os.Handler r7 = sw1.D(r7)     // Catch: java.lang.Throwable -> La4
            r9.setOnImageAvailableListener(r0, r7)     // Catch: java.lang.Throwable -> La4
            android.view.Surface r7 = r9.getSurface()     // Catch: java.lang.Throwable -> La4
            android.graphics.Canvas r0 = r7.lockHardwareCanvas()     // Catch: java.lang.Throwable -> La4
            long r4 = lc1.b     // Catch: java.lang.Throwable -> La7
            int r1 = defpackage.ah1.X(r4)     // Catch: java.lang.Throwable -> La7
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> La7
            r0.drawColor(r1, r4)     // Catch: java.lang.Throwable -> La7
            android.graphics.Canvas r1 = sc.a     // Catch: java.lang.Throwable -> La7
            rc r1 = new rc     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            r1.a = r0     // Catch: java.lang.Throwable -> La7
            r8.c(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> La4
            java.lang.Object r7 = r3.s()     // Catch: java.lang.Throwable -> La4
            xx1 r8 = defpackage.xx1.a
            if (r7 != r8) goto L99
            return r8
        L99:
            r8 = r9
        L9a:
            android.media.Image r7 = (android.media.Image) r7     // Catch: java.lang.Throwable -> L2a
            android.graphics.Bitmap r7 = defpackage.wx1.H(r7)     // Catch: java.lang.Throwable -> L2a
            defpackage.lc5.U(r8, r2)
            return r7
        La4:
            r7 = move-exception
            r8 = r9
            goto Lac
        La7:
            r8 = move-exception
            r7.unlockCanvasAndPost(r0)     // Catch: java.lang.Throwable -> La4
            throw r8     // Catch: java.lang.Throwable -> La4
        Lac:
            throw r7     // Catch: java.lang.Throwable -> Lad
        Lad:
            r9 = move-exception
            defpackage.lc5.U(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.d(jh4, jt1):java.lang.Object");
    }

    public boolean e() {
        boolean z2;
        synchronized (bv3.a) {
            try {
                int i = bv3.c;
                bv3.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > bv3.d + 30000) {
                    bv3.c = 0;
                    bv3.d = SystemClock.uptimeMillis();
                    String[] list = bv3.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    bv3.e = list.length < 800;
                }
                z2 = bv3.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public long f() {
        return 9205357640488583168L;
    }

    public long g(long j, long j2) {
        float fMin = Math.min(og9.b(j2) / og9.b(j), og9.a(j2) / og9.a(j));
        return fu8.a(fMin, fMin);
    }

    @Override // defpackage.r58
    public Object get() {
        return iua.a;
    }

    public zm5 getLayoutDirection() {
        return F;
    }

    @Override // defpackage.vc3
    public bv0 h(bv0 bv0Var, jx1 jx1Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(final boolean r25, final boolean r26, final defpackage.ta5 r27, ou6 r28, final defpackage.jfa r29, final t89 r30, float r31, float r32, dd4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.j(boolean, boolean, ta5, ou6, jfa, t89, float, float, dd4, int, int):void");
    }

    public void k(final String str, final yb4 yb4Var, final boolean z2, final boolean z3, final yub yubVar, final ta5 ta5Var, final boolean z4, final yb4 yb4Var2, final yb4 yb4Var3, final yb4 yb4Var4, final yb4 yb4Var5, final jfa jfaVar, pj7 pj7Var, final rj1 rj1Var, dd4 dd4Var, final int i) {
        int i2;
        boolean z5;
        boolean z6;
        final pj7 pj7Var2;
        pj7 rj7Var;
        int i3;
        String str2;
        rj1 rj1Var2;
        dd4Var.h0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(yb4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= dd4Var.g(z5) ? 256 : Token.CASE;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            z6 = z3;
            i2 |= dd4Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(yubVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.f(ta5Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= dd4Var.g(z4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= dd4Var.h(yb4Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= dd4Var.h(yb4Var3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= dd4Var.h(yb4Var4) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (dd4Var.h(yb4Var5) ? 4 : 2) | (dd4Var.h((Object) null) ? 32 : 16) | (dd4Var.h((Object) null) ? 256 : Token.CASE) | (dd4Var.h((Object) null) ? 2048 : 1024) | (dd4Var.f(jfaVar) ? 16384 : 8192) | Parser.ARGC_LIMIT;
        if (dd4Var.V(i2 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                rj7Var = new rj7(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i4 & (-458753);
            } else {
                dd4Var.Y();
                i3 = i4 & (-458753);
                rj7Var = pj7Var;
            }
            dd4Var.r();
            int i5 = i3;
            boolean z7 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objQ = dd4Var.Q();
            if (z7 || objQ == vl1.a) {
                objQ = yubVar.a(new bp(str));
                dd4Var.p0(objQ);
            }
            String str3 = ((i3b) objQ).a.b;
            wfa wfaVar = new wfa();
            if (yb4Var2 == null) {
                dd4Var.f0(1927042940);
                dd4Var.q(false);
                str2 = str3;
                rj1Var2 = null;
            } else {
                dd4Var.f0(1927042941);
                str2 = str3;
                rj1 rj1VarG = jf0.G(-1459717586, new ci7(0, yb4Var2), dd4Var);
                dd4Var.q(false);
                rj1Var2 = rj1VarG;
            }
            int i6 = i2 >> 9;
            int i7 = i5 << 21;
            wm9.a(str2, yb4Var, wfaVar, rj1Var2, yb4Var3, yb4Var4, yb4Var5, z6, z5, z4, ta5Var, rj7Var, jfaVar, rj1Var, dd4Var, ((i2 << 3) & 896) | 6 | (458752 & i6) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i5 >> 9) & 14) | ((i2 >> 6) & Token.ASSIGN_MOD) | (i2 & 896) | (i6 & 7168) | ((i2 >> 3) & 57344) | ((i5 << 6) & 3670016) | 12582912);
            pj7Var2 = rj7Var;
        } else {
            dd4Var.Y();
            pj7Var2 = pj7Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: di7
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i | 1);
                    this.a.k(str, yb4Var, z2, z3, yubVar, ta5Var, z4, yb4Var2, yb4Var3, yb4Var4, yb4Var5, jfaVar, pj7Var2, rj1Var, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.h85 r29, final long r30, final long r32, final defpackage.co8 r34, final boolean r35, final defpackage.rj1 r36, dd4 r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.l(h85, long, long, co8, boolean, rj1, dd4, int):void");
    }

    @Override // defpackage.vc3
    public ut0 q(ut0 ut0Var, jx1 jx1Var) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r7 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [az3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.az3 r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.k95
            if (r0 == 0) goto L13
            r0 = r9
            k95 r0 = (defpackage.k95) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            k95 r0 = new k95
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.b
            int r9 = r0.d
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            xx1 r5 = defpackage.xx1.a
            if (r9 == 0) goto L46
            if (r9 == r3) goto L3c
            if (r9 != r2) goto L35
            java.lang.Object r8 = r0.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.e11.e0(r7)     // Catch: java.lang.Exception -> L32
            goto L88
        L32:
            r7 = move-exception
            goto L8f
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r8 = r0.a
            az3 r8 = (defpackage.az3) r8
            defpackage.e11.e0(r7)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r7 = move-exception
            goto L6d
        L46:
            defpackage.e11.e0(r7)
            r7 = r8
            zy3 r7 = (defpackage.zy3) r7     // Catch: java.lang.Exception -> L44
            com.google.android.gms.tasks.Task r8 = r7.e()     // Catch: java.lang.Exception -> L44
            r8.getClass()     // Catch: java.lang.Exception -> L69
            r0.a = r7     // Catch: java.lang.Exception -> L69
            r0.d = r3     // Catch: java.lang.Exception -> L69
            java.lang.Object r8 = xg9.e(r8, r0)     // Catch: java.lang.Exception -> L69
            if (r8 != r5) goto L5e
            goto L87
        L5e:
            r6 = r8
            r8 = r7
            r7 = r6
        L61:
            i80 r7 = (defpackage.i80) r7     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r7.a     // Catch: java.lang.Exception -> L44
            r6 = r8
            r8 = r7
            r7 = r6
            goto L74
        L69:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L6d:
            java.lang.String r9 = "Error getting authentication token."
            android.util.Log.w(r1, r9, r7)
            r7 = r8
            r8 = r4
        L74:
            zy3 r7 = (defpackage.zy3) r7     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r7 = r7.c()     // Catch: java.lang.Exception -> L32
            r7.getClass()     // Catch: java.lang.Exception -> L32
            r0.a = r8     // Catch: java.lang.Exception -> L32
            r0.d = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = xg9.e(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r5) goto L88
        L87:
            return r5
        L88:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L8d
            goto L94
        L8d:
            r4 = r7
            goto L94
        L8f:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r1, r9, r7)
        L94:
            l95 r7 = new l95
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.r(az3, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        jt1 jt1Var = null;
        switch (this.a) {
            case 10:
                is4Var.getClass();
                uf4 uf4Var = new uf4("AfterState", 29);
                ru4 ru4Var = is4Var.s;
                ru4Var.f(ru4.h, uf4Var);
                ru4Var.g(uf4Var, new c8((zb4) o1aVar, jt1Var, 5));
                break;
            default:
                is4Var.getClass();
                is4Var.f.g(ru4.v, new c8((zb4) o1aVar, jt1Var, 7));
                break;
        }
    }

    @Override // defpackage.vc3
    public ut0 u(ut0 ut0Var, jx1 jx1Var) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0120, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0156, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bb, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0238, code lost:
    
        if (r10 == r5) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r11, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv4.x(long, kt1):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ey1 */
    public Object c(ey1 ey1Var) throws ey1 {
        throw ey1Var;
    }

    public float i(float f2) {
        return f2;
    }

    public float o(float f2) {
        return f2;
    }
}
