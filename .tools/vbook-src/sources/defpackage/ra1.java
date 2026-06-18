package defpackage;

import android.content.ContextWrapper;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ra1 implements t91, qn2, fj1, cs1, nk9, ck9, en0, z54, ur1, zz9, ix1 {
    public final /* synthetic */ int a;
    public static final ra1 b = new ra1(1);
    public static final ra1 c = new ra1(2);
    public static final qr1 d = new qr1(0);
    public static final qr1 e = new qr1(4);
    public static final qr1 f = new qr1(2);
    public static final qr1 s = new qr1(3);
    public static final qr1 t = new qr1(5);
    public static final c04 u = new c04();
    public static final qr1 v = new qr1(1);
    public static final ra1 w = new ra1(4);
    public static final ra1 x = new ra1(5);
    public static final ra1 y = new ra1(6);
    public static final /* synthetic */ ra1 z = new ra1(7);
    public static final ra1 A = new ra1(8);
    public static final /* synthetic */ ra1 B = new ra1(9);
    public static final ra1 C = new ra1(10);
    public static final ra1 D = new ra1(11);
    public static final w58 E = new w58(28);
    public static final ra1 F = new ra1(13);
    public static final ra1 G = new ra1(14);

    public /* synthetic */ ra1(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:66:0x0155, B:82:0x014f], limit reached: 80 */
    /* JADX WARN: Path cross not found for [B:82:0x014f, B:66:0x0155], limit reached: 80 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb A[LOOP:0: B:50:0x00f5->B:52:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18, types: [lr0] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0110 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0113 -> B:23:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0145 -> B:60:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x015c -> B:67:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0161 -> B:67:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.gnb r10, java.lang.String r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.h(gnb, java.lang.String, kt1):java.lang.Object");
    }

    public static final void l(hz hzVar) {
        ii1 ii1Var = hz.h;
        if (hz.i == null) {
            hz.i = new hz();
            gz gzVar = new gz("Okio Watchdog");
            gzVar.setDaemon(true);
            gzVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = hzVar.c;
        boolean z2 = hzVar.a;
        if (j != 0 && z2) {
            hzVar.g = Math.min(j, hzVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            hzVar.g = jNanoTime + j;
        } else {
            if (!z2) {
                w58.a();
                return;
            }
            hzVar.g = hzVar.c();
        }
        ii1 ii1Var2 = hz.h;
        int i = ii1Var2.b + 1;
        ii1Var2.b = i;
        hz[] hzVarArr = (hz[]) ii1Var2.c;
        if (i == hzVarArr.length) {
            hz[] hzVarArr2 = new hz[i * 2];
            fw.X(hzVarArr, 0, hzVarArr2, 0, 14);
            ii1Var2.c = hzVarArr2;
        }
        ii1Var2.i(i, hzVar);
        if (hzVar.f == 1) {
            hz.k.signal();
        }
    }

    public static Object m(yy yyVar, t4c t4cVar, o5c o5cVar) {
        b10 b10Var = new b10(4096);
        r5a r5aVarJ = i12.j(b10Var);
        ql9.I(r5aVarJ, "PK\u0001\u0002");
        ql9.F(r5aVarJ, 788);
        ql9.F(r5aVarJ, 20);
        ql9.F(r5aVarJ, t4cVar.b);
        ql9.F(r5aVarJ, 8);
        ql9.F(r5aVarJ, 0);
        ql9.F(r5aVarJ, 0);
        ql9.G(r5aVarJ, t4cVar.c);
        ql9.G(r5aVarJ, t4cVar.d);
        ql9.G(r5aVarJ, t4cVar.e);
        byte[] bArr = t4cVar.f;
        ql9.F(r5aVarJ, bArr.length);
        byte[] bArr2 = t4cVar.g;
        ql9.F(r5aVarJ, bArr2.length);
        byte[] bArr3 = t4cVar.h;
        ql9.F(r5aVarJ, 0);
        ql9.F(r5aVarJ, 0);
        ql9.F(r5aVarJ, 0);
        ql9.G(r5aVarJ, 0);
        ql9.G(r5aVarJ, (int) t4cVar.a);
        r5aVarJ.write(bArr, 0, bArr.length);
        r5aVarJ.write(bArr2, 0, bArr2.length);
        r5aVarJ.write(bArr3, 0, 0);
        Object objC0 = ah1.c0(yyVar, b10Var.d(), o5cVar);
        return objC0 == xx1.a ? objC0 : heb.a;
    }

    public static hz o() throws InterruptedException {
        ii1 ii1Var = hz.h;
        hz hzVar = ((hz[]) ii1Var.c)[1];
        if (hzVar == null) {
            long jNanoTime = System.nanoTime();
            hz.k.await(hz.l, TimeUnit.MILLISECONDS);
            if (((hz[]) ii1Var.c)[1] != null || System.nanoTime() - jNanoTime < hz.m) {
                return null;
            }
            return hz.i;
        }
        long jNanoTime2 = hzVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            hz.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        ii1Var.l(hzVar);
        hzVar.e = 2;
        return hzVar;
    }

    public static av0 q(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArrCopyOf[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArrCopyOf[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new av0(bArrCopyOf);
        }
        return null;
    }

    public static av0 r(String str) {
        if (str.length() % 2 != 0) {
            gp.k("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (yb0.G(str.charAt(i2 + 1)) + (yb0.G(str.charAt(i2)) << 4));
        }
        return new av0(bArr);
    }

    public static av0 s(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(q31.a);
        bytes.getClass();
        av0 av0Var = new av0(bytes);
        av0Var.c = str;
        return av0Var;
    }

    public static rm3 u(String str) {
        str.getClass();
        return new rm3(om3.t, 0, 0, pm3.c, str, 38);
    }

    public static void v(int i, int i2, int i3, int[] iArr) {
        iArr.getClass();
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    public static int w(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public static av0 x(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        ah1.z(bArr.length, 0L, length);
        return new av0(fw.Y(bArr, 0, length));
    }

    public static Object z(String str, String str2, int i, zb4 zb4Var, kt1 kt1Var, int i2) throws Throwable {
        if ((i2 & 8) != 0) {
            i = 9;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            zb4Var = null;
        }
        zb4 zb4Var2 = zb4Var;
        String str3 = zn7.b;
        zn7 zn7VarB = xn7.b(str2, false);
        oh5 oh5Var = gx3.a;
        if (oh5Var.e0(zn7VarB)) {
            oh5Var.R(zn7VarB, false);
        }
        Object objY = G.y(anb.b(str), anb.b(str2), false, i3, zb4Var2, kt1Var);
        return objY == xx1.a ? objY : heb.a;
    }

    public float a(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    public boolean b(q84 q84Var) {
        String str = q84Var.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public void c(ou6 ou6Var, float f2, float f3, t89 t89Var, long j, dd4 dd4Var, final int i) {
        final ou6 ou6Var2;
        final float f4;
        final float f5;
        final t89 t89Var2;
        final long j2;
        t89 t89Var3;
        long jC;
        ou6 ou6Var3;
        final float f6;
        final float f7;
        dd4Var.h0(-731969307);
        int i2 = i | 9654;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                ur9 ur9Var = s96.a;
                t89Var3 = ((q96) dd4Var.j(ur9Var)).c.e;
                jC = lc1.c(0.4f, ((q96) dd4Var.j(ur9Var)).a.s);
                ou6Var3 = lu6.a;
                f6 = 32.0f;
                f7 = 3.0f;
            } else {
                dd4Var.Y();
                ou6Var3 = ou6Var;
                f6 = f2;
                f7 = f3;
                t89Var3 = t89Var;
                jC = j;
            }
            dd4Var.r();
            long j3 = jC;
            j1a.a(gjb.n0(ou6Var3, 0.0f, 12.0f, 1), t89Var3, j3, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-560808726, new yb4() { // from class: zm0
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    dd4 dd4Var2 = (dd4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        pn0.a(tg9.o(lu6.a, f6, f7), dd4Var2, 0);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, 12582912, 120);
            t89Var2 = t89Var3;
            j2 = j3;
            ou6Var2 = ou6Var3;
            f4 = f6;
            f5 = f7;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            f4 = f2;
            f5 = f3;
            t89Var2 = t89Var;
            j2 = j;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(ou6Var2, f4, f5, t89Var2, j2, i) { // from class: an0
                public final /* synthetic */ ou6 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ t89 e;
                public final /* synthetic */ long f;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(196609);
                    this.a.c(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    @Override // defpackage.cs1
    public boolean d(as1 as1Var) {
        as1Var.getClass();
        if (!as1Var.a(wr1.a)) {
            if (!as1Var.b.isEmpty()) {
                as1Var = new as1(as1Var.c, as1Var.d, lc3.a);
            }
            String string = as1Var.toString();
            if (!bw9.q0(string, "application/", true) || !iw9.C(string, "+json", true)) {
                return false;
            }
        }
        return true;
    }

    public b0a e(q84 q84Var) {
        String str = q84Var.o;
        List list = q84Var.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new oj1(list);
                case "application/pgs":
                    return new s16(18);
                case "application/x-mp4-vtt":
                    return new uc6(1);
                case "text/vtt":
                    return new wxb();
                case "application/x-quicktime-tx3g":
                    return new t9b(list);
                case "text/x-ssa":
                    return new np9(list);
                case "application/vobsub":
                    return new avb(list);
                case "application/x-subrip":
                    return new fy9();
                case "application/ttml+xml":
                    return new u7b();
            }
        }
        gp.l(ky0.r("Unsupported MIME type: ", str));
        return null;
    }

    public int f(q84 q84Var) {
        String str = q84Var.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        gp.l(ky0.r("Unsupported MIME type: ", str));
        return 0;
    }

    public long g(long j, long j2) {
        float fMax = Math.max(og9.b(j2) / og9.b(j), og9.a(j2) / og9.a(j));
        return fu8.a(fMax, fMax);
    }

    @Override // defpackage.en0
    public long i(j09 j09Var, int i) {
        String str = j09Var.f.a.a.b;
        return zk9.h(ym9.f(str, i), ym9.e(str, i));
    }

    public boolean j(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.fj1
    public Object k(ks ksVar) {
        Object objG = ksVar.g(new oa8(jh0.class, Executor.class));
        objG.getClass();
        return qu1.Y((Executor) objG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[PHI: r0 r3 r5 r7 r9 r11 r13 r14 r15
  0x0093: PHI (r0v12 byte[]) = (r0v9 byte[]), (r0v14 byte[]) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r3v16 int) = (r3v13 int), (r3v17 int) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r5v11 int) = (r5v9 int), (r5v14 int) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r7v10 int) = (r7v8 int), (r7v12 int) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r9v15 long) = (r9v13 long), (r9v16 long) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r11v9 long) = (r11v7 long), (r11v10 long) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r13v7 i02) = (r13v5 i02), (r13v8 i02) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r14v5 byte[]) = (r14v3 byte[]), (r14v6 byte[]) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x0093: PHI (r15v8 yy) = (r15v6 yy), (r15v9 yy) binds: [B:38:0x01de, B:18:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025c  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11, types: [yy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.yy r28, defpackage.gnb r29, java.lang.String r30, int r31, defpackage.kt1 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.n(yy, gnb, java.lang.String, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0099 -> B:29:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ce -> B:17:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(defpackage.gnb r10, java.lang.String r11, defpackage.kt1 r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.p(gnb, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        jt1 jt1Var = null;
        switch (this.a) {
            case 1:
                is4Var.getClass();
                is4Var.s.g(ru4.i, new c8((zb4) o1aVar, jt1Var, 0));
                break;
            default:
                is4Var.getClass();
                is4Var.e.g(ru4.q, new xa((bc4) o1aVar, jt1Var, 27));
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "NoDeclaredBrand";
            case 9:
            default:
                return super.toString();
            case 10:
                return "ReferentialEqualityPolicy";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0333 A[Catch: all -> 0x03ff, TRY_LEAVE, TryCatch #15 {all -> 0x03ff, blocks: (B:101:0x0327, B:102:0x032b, B:105:0x0333), top: B:166:0x0210 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0353 A[Catch: all -> 0x0386, TryCatch #5 {all -> 0x0386, blocks: (B:107:0x034d, B:109:0x0353, B:114:0x038b), top: B:146:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0447 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0212 A[Catch: all -> 0x032c, TRY_LEAVE, TryCatch #7 {all -> 0x032c, blocks: (B:62:0x020c, B:64:0x0212), top: B:150:0x020c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028e A[Catch: all -> 0x02ed, TRY_LEAVE, TryCatch #8 {all -> 0x02ed, blocks: (B:77:0x0289, B:79:0x028e), top: B:152:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f6  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [kt1, o5c] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r12v10, types: [zb4] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [zb4] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v22, types: [int] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [kt1, o5c] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, o5c] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5, types: [o5c] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [ra1] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [gnb] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9, types: [kt1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r9v35, types: [ax] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02d4 -> B:84:0x02df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x02f6 -> B:85:0x02e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(defpackage.gnb r21, defpackage.gnb r22, boolean r23, int r24, defpackage.zb4 r25, defpackage.kt1 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.y(gnb, gnb, boolean, int, zb4, kt1):java.lang.Object");
    }
}
