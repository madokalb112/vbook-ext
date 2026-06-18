package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e11 {
    public final ah7 a = new ah7();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final wga r43, final java.lang.String r44, long r45, long r47, defpackage.yb4 r49, z44 r50, final ou6 r51, final defpackage.kb4 r52, defpackage.ib4 r53, dd4 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.A(wga, java.lang.String, long, long, yb4, z44, ou6, kb4, ib4, dd4, int, int):void");
    }

    public static final void B(sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        jy1 jy1Var;
        ye8 ye8VarU;
        dd4Var.h0(1299927555);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(sw8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            dk7 dk7VarF = sw8Var.f();
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new hf9();
                dd4Var.p0(objQ);
            }
            hf9 hf9Var = (hf9) objQ;
            int i4 = 3;
            if (((int) (sw8Var.j() >> 32)) == 0 || ((int) (sw8Var.j() & 4294967295L)) == 0) {
                ye8VarU = dd4Var.u();
                if (ye8VarU != null) {
                    jy1Var = new jy1(sw8Var, ou6Var, i, i4);
                    ye8VarU.d = jy1Var;
                }
                return;
            }
            boolean zH = dd4Var.h(hf9Var) | dd4Var.d(dk7VarF.ordinal()) | ((i2 & 14) == 4);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new fb3(28, hf9Var, dk7VarF, sw8Var);
                dd4Var.p0(objQ2);
            }
            s32.F(ou6Var, (kb4) objQ2, dd4Var, (i2 >> 3) & 14);
        } else {
            dd4Var.Y();
        }
        ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            jy1Var = new jy1(sw8Var, ou6Var, i, i3);
            ye8VarU.d = jy1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: ed5 -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {ed5 -> 0x01c4, blocks: (B:35:0x00c2, B:43:0x00eb, B:57:0x0115, B:59:0x012b, B:63:0x0140, B:67:0x0148), top: B:123:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0198 -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(nq5 r28, int r29, int r30, int r31, pn2 r32, defpackage.kt1 r33) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.C(nq5, int, int, int, pn2, kt1):java.lang.Object");
    }

    public static final boolean D(boolean z, nq5 nq5Var, int i, int i2) {
        if (z) {
            if (nq5Var.c() > i) {
                return true;
            }
            return nq5Var.c() == i && nq5Var.d() > i2;
        }
        if (nq5Var.c() < i) {
            return true;
        }
        return nq5Var.c() == i && nq5Var.d() < i2;
    }

    public static final kf8 E(ym5 ym5Var) {
        ym5 ym5VarG = ym5Var.G();
        return ym5VarG != null ? ym5VarG.O(ym5Var, true) : new kf8(0.0f, 0.0f, (int) (ym5Var.a() >> 32), (int) (ym5Var.a() & 4294967295L));
    }

    public static final kf8 F(ym5 ym5Var, boolean z) {
        ym5 ym5VarK = K(ym5Var);
        float fA = (int) (ym5VarK.a() >> 32);
        float fA2 = (int) (ym5VarK.a() & 4294967295L);
        kf8 kf8VarO = ym5VarK.O(ym5Var, z);
        float f = kf8VarO.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fA) {
                f = fA;
            }
        }
        float f2 = kf8VarO.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fA2) {
                f2 = fA2;
            }
        }
        float f3 = kf8VarO.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fA) {
                fA = f3;
            }
            f3 = fA;
        }
        float f4 = kf8VarO.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fA2) {
                fA2 = f5;
            }
            f4 = fA2;
        }
        if (f == f3 || f2 == f4) {
            return kf8.e;
        }
        long jE = ym5VarK.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jE2 = ym5VarK.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jE3 = ym5VarK.e((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jE4 = ym5VarK.e((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new kf8(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static k69 G(k69 k69Var) {
        f86 f86Var = k69Var.a;
        f86Var.c();
        return f86Var.u > 0 ? k69Var : k69.b;
    }

    public static final boolean H(h54 h54Var, boolean z) {
        int iOrdinal = h54Var.j1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                h54 h54VarE = i12.E(h54Var);
                if (!(h54VarE != null ? H(h54VarE, z) : true)) {
                    return false;
                }
                h54Var.f1(d54.b, d54.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                mn5.g();
                return false;
            }
        }
        return true;
    }

    public static final pm8 I(Throwable th) {
        th.getClass();
        return new pm8(th);
    }

    public static final ym5 K(ym5 ym5Var) {
        ym5 ym5Var2;
        ym5 ym5VarG = ym5Var.G();
        while (true) {
            ym5 ym5Var3 = ym5VarG;
            ym5Var2 = ym5Var;
            ym5Var = ym5Var3;
            if (ym5Var == null) {
                break;
            }
            ym5VarG = ym5Var.G();
        }
        x67 x67Var = ym5Var2 instanceof x67 ? (x67) ym5Var2 : null;
        if (x67Var == null) {
            return ym5Var2;
        }
        x67 x67Var2 = x67Var.E;
        while (true) {
            x67 x67Var3 = x67Var2;
            x67 x67Var4 = x67Var;
            x67Var = x67Var3;
            if (x67Var == null) {
                return x67Var4;
            }
            x67Var2 = x67Var.E;
        }
    }

    public static final ng L(ng ngVar) {
        Bitmap bitmap = ngVar.a;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMin = Math.min(200.0f / width, 200.0f / height);
        int i = (int) (width * fMin);
        int i2 = (int) (height * fMin);
        ng ngVarB = qx1.b(i, i2, 0, 28);
        fy0.m(fz1.f(ngVarB), ngVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L), 0L, (((long) i) << 32) | (((long) i2) & 4294967295L), fw.s(), 10);
        return ngVarB;
    }

    public static double M(zj4 zj4Var, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = zj4Var.b;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 < dArr[i] || d2 >= dArr[i + 1]) {
                i++;
            } else {
                d = dArr2[i] % 360.0d;
                if (d < 0.0d) {
                    d += 360.0d;
                }
            }
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x0079, B:29:0x0081, B:30:0x008c, B:37:0x009c, B:24:0x0068, B:39:0x009f, B:41:0x00a4, B:42:0x00a5, B:23:0x0062, B:31:0x008d, B:33:0x0093), top: B:57:0x0021, outer: #4, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00af, blocks: (B:43:0x00a6, B:50:0x00b3, B:51:0x00b6, B:12:0x002d, B:27:0x0079, B:29:0x0081, B:30:0x008c, B:37:0x009c, B:24:0x0068, B:39:0x009f, B:41:0x00a4, B:42:0x00a5, B:23:0x0062, B:31:0x008d, B:33:0x0093, B:48:0x00b1), top: B:57:0x0021, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:27:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.kt1 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.cg4
            if (r0 == 0) goto L13
            r0 = r10
            cg4 r0 = (defpackage.cg4) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cg4 r0 = new cg4
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            br0 r2 = r0.d
            h11 r6 = r0.c
            a09 r7 = r0.b
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.a
            e0(r10)     // Catch: java.lang.Throwable -> L31
            goto L79
        L31:
            r10 = move-exception
            goto Lb1
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r4
        L3a:
            e0(r10)
            r10 = 6
            ir0 r6 = defpackage.vm7.c(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            sh r2 = new sh
            r7 = 11
            r2.<init>(r7, r10, r6)
            java.lang.Object r7 = vj9.c
            monitor-enter(r7)
            java.util.List r8 = vj9.i     // Catch: java.lang.Throwable -> Lbb
            java.util.ArrayList r8 = defpackage.fc1.J0(r8, r2)     // Catch: java.lang.Throwable -> Lbb
            vj9.i = r8     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r7)
            vj9.a()
            a09 r7 = new a09
            r7.<init>(r2, r5)
            br0 r2 = new br0     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L68:
            r0.a = r8     // Catch: java.lang.Throwable -> L31
            r0.b = r7     // Catch: java.lang.Throwable -> L31
            r0.c = r6     // Catch: java.lang.Throwable -> L31
            r0.d = r2     // Catch: java.lang.Throwable -> L31
            r0.f = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L79
            return r1
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto La6
            java.lang.Object r10 = r2.c()     // Catch: java.lang.Throwable -> L31
            heb r10 = (defpackage.heb) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = vj9.c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            ag4 r9 = vj9.j     // Catch: java.lang.Throwable -> La3
            uz6 r9 = r9.h     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L9b
            boolean r9 = r9.h()     // Catch: java.lang.Throwable -> La3
            if (r9 != r5) goto L9b
            r9 = r5
            goto L9c
        L9b:
            r9 = r3
        L9c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L68
            vj9.a()     // Catch: java.lang.Throwable -> L31
            goto L68
        La3:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        La6:
            r6.cancel(r4)     // Catch: java.lang.Throwable -> Laf
            r7.a()
            heb r10 = defpackage.heb.a
            return r10
        Laf:
            r10 = move-exception
            goto Lb7
        Lb1:
            throw r10     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            defpackage.kl8.P(r6, r10)     // Catch: java.lang.Throwable -> Laf
            throw r0     // Catch: java.lang.Throwable -> Laf
        Lb7:
            r7.a()
            throw r10
        Lbb:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.N(kt1):java.lang.Object");
    }

    public static final boolean O(nq5 nq5Var, int i) {
        return i <= nq5Var.e() && nq5Var.c() <= i;
    }

    public static LinkedHashSet P(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && lc5.Q(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final void Q(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new nd8(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(defpackage.wh7 r7, defpackage.jt0 r8, defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.R(wh7, jt0, kt1):java.lang.Object");
    }

    public static yy S(byte[] bArr) {
        bArr.getClass();
        b10 b10Var = new b10(bArr, 2);
        oe6 oe6Var = new oe6();
        oe6Var.a = b10Var;
        return new yy(oe6Var, 0L);
    }

    public static final k22 T(h54 h54Var, int i) {
        int iOrdinal = h54Var.j1().ordinal();
        k22 k22Var = k22.a;
        if (iOrdinal != 0) {
            k22 k22Var2 = k22.b;
            if (iOrdinal == 1) {
                h54 h54VarE = i12.E(h54Var);
                if (h54VarE == null) {
                    gp.l("ActiveParent with no focused child");
                    return null;
                }
                k22 k22VarT = T(h54VarE, i);
                k22 k22Var3 = k22VarT != k22Var ? k22VarT : null;
                if (k22Var3 != null) {
                    return k22Var3;
                }
                if (h54Var.C) {
                    return k22Var;
                }
                h54Var.C = true;
                try {
                    x44 x44VarG1 = h54Var.g1();
                    wx0 wx0Var = new wx0(i);
                    v44 focusOwner = vw1.T(h54Var).getFocusOwner();
                    h54 h54VarF = focusOwner.f();
                    x44VarG1.k.invoke(wx0Var);
                    h54 h54VarF2 = focusOwner.f();
                    if (!wx0Var.b) {
                        return (h54VarF == h54VarF2 || h54VarF2 == null) ? k22Var : z44.d == z44.c ? k22Var2 : k22.c;
                    }
                    z44 z44Var = z44.b;
                    return k22Var2;
                } finally {
                    h54Var.C = false;
                }
            }
            if (iOrdinal == 2) {
                return k22Var2;
            }
            if (iOrdinal != 3) {
                mn5.g();
                return null;
            }
        }
        return k22Var;
    }

    public static final k22 U(h54 h54Var, int i) {
        if (!h54Var.D) {
            h54Var.D = true;
            try {
                x44 x44VarG1 = h54Var.g1();
                wx0 wx0Var = new wx0(i);
                v44 focusOwner = vw1.T(h54Var).getFocusOwner();
                h54 h54VarF = focusOwner.f();
                x44VarG1.j.invoke(wx0Var);
                h54 h54VarF2 = focusOwner.f();
                boolean z = wx0Var.b;
                k22 k22Var = k22.b;
                if (z) {
                    z44 z44Var = z44.b;
                    return k22Var;
                }
                if (h54VarF != h54VarF2 && h54VarF2 != null) {
                    return z44.d == z44.c ? k22Var : k22.c;
                }
            } finally {
                h54Var.D = false;
            }
        }
        return k22.a;
    }

    public static final k22 V(h54 h54Var, int i) {
        nu6 nu6VarT;
        z70 z70Var;
        int iOrdinal = h54Var.j1().ordinal();
        k22 k22Var = k22.a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                h54 h54VarE = i12.E(h54Var);
                if (h54VarE != null) {
                    return T(h54VarE, i);
                }
                gp.l("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    mn5.g();
                    return null;
                }
                if (!((nu6) h54Var).a.z) {
                    q75.c("visitAncestors called on an unattached node");
                }
                nu6 nu6Var = ((nu6) h54Var).a.e;
                sn5 sn5VarS = vw1.S(h54Var);
                loop0: while (true) {
                    if (sn5VarS == null) {
                        nu6VarT = null;
                        break;
                    }
                    if ((((nu6) sn5VarS.S.g).d & 1024) != 0) {
                        while (nu6Var != null) {
                            if ((nu6Var.c & 1024) != 0) {
                                nu6VarT = nu6Var;
                                g07 g07Var = null;
                                while (nu6VarT != null) {
                                    if (nu6VarT instanceof h54) {
                                        break loop0;
                                    }
                                    if ((nu6VarT.c & 1024) != 0 && (nu6VarT instanceof qm2)) {
                                        int i2 = 0;
                                        for (nu6 nu6Var2 = ((qm2) nu6VarT).B; nu6Var2 != null; nu6Var2 = nu6Var2.f) {
                                            if ((nu6Var2.c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nu6VarT = nu6Var2;
                                                } else {
                                                    if (g07Var == null) {
                                                        g07Var = new g07(new nu6[16]);
                                                    }
                                                    if (nu6VarT != null) {
                                                        g07Var.b(nu6VarT);
                                                        nu6VarT = null;
                                                    }
                                                    g07Var.b(nu6Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nu6VarT = vw1.t(g07Var);
                                }
                            }
                            nu6Var = nu6Var.e;
                        }
                    }
                    sn5VarS = sn5VarS.v();
                    nu6Var = (sn5VarS == null || (z70Var = sn5VarS.S) == null) ? null : (n9a) z70Var.f;
                }
                h54 h54Var2 = (h54) nu6VarT;
                if (h54Var2 == null) {
                    return k22Var;
                }
                int iOrdinal2 = h54Var2.j1().ordinal();
                if (iOrdinal2 == 0) {
                    return U(h54Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return V(h54Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return k22.b;
                }
                if (iOrdinal2 != 3) {
                    mn5.g();
                    return null;
                }
                k22 k22VarV = V(h54Var2, i);
                k22 k22Var2 = k22VarV != k22Var ? k22VarV : null;
                return k22Var2 == null ? U(h54Var2, i) : k22Var2;
            }
        }
        return k22Var;
    }

    public static final boolean W(h54 h54Var) {
        g07 g07Var;
        z70 z70Var;
        v44 v44Var;
        boolean z;
        int i;
        g07 g07Var2;
        int i2;
        int i3;
        z70 z70Var2;
        v44 focusOwner = vw1.T(h54Var).getFocusOwner();
        h54 h54VarF = focusOwner.f();
        d54 d54VarJ1 = h54Var.j1();
        if (h54VarF == h54Var) {
            h54Var.f1(d54VarJ1, d54VarJ1);
            return true;
        }
        if ((h54VarF == null || h54VarF.A) && !h54Var.A && !vw1.T(h54Var).getFocusOwner().a.I()) {
            return false;
        }
        if (h54VarF != null) {
            g07Var = new g07(new h54[16]);
            if (!((nu6) h54VarF).a.z) {
                q75.c("visitAncestors called on an unattached node");
            }
            nu6 nu6Var = ((nu6) h54VarF).a.e;
            sn5 sn5VarS = vw1.S(h54VarF);
            while (sn5VarS != null) {
                if ((((nu6) sn5VarS.S.g).d & 1024) != 0) {
                    while (nu6Var != null) {
                        if ((nu6Var.c & 1024) != 0) {
                            nu6 nu6VarT = nu6Var;
                            g07 g07Var3 = null;
                            while (nu6VarT != null) {
                                if (nu6VarT instanceof h54) {
                                    g07Var.b((h54) nu6VarT);
                                } else if ((nu6VarT.c & 1024) != 0 && (nu6VarT instanceof qm2)) {
                                    int i4 = 0;
                                    for (nu6 nu6Var2 = ((qm2) nu6VarT).B; nu6Var2 != null; nu6Var2 = nu6Var2.f) {
                                        if ((nu6Var2.c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                nu6VarT = nu6Var2;
                                            } else {
                                                if (g07Var3 == null) {
                                                    g07Var3 = new g07(new nu6[16]);
                                                }
                                                if (nu6VarT != null) {
                                                    g07Var3.b(nu6VarT);
                                                    nu6VarT = null;
                                                }
                                                g07Var3.b(nu6Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                nu6VarT = vw1.t(g07Var3);
                            }
                        }
                        nu6Var = nu6Var.e;
                    }
                }
                sn5VarS = sn5VarS.v();
                nu6Var = (sn5VarS == null || (z70Var2 = sn5VarS.S) == null) ? null : (n9a) z70Var2.f;
            }
        } else {
            g07Var = null;
        }
        Object[] objArr = new h54[16];
        Object[] objArr2 = new h54[16];
        if (!((nu6) h54Var).a.z) {
            q75.c("visitAncestors called on an unattached node");
        }
        nu6 nu6Var3 = ((nu6) h54Var).a.e;
        sn5 sn5VarS2 = vw1.S(h54Var);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (sn5VarS2 != null) {
            if ((((nu6) sn5VarS2.S.g).d & 1024) != 0) {
                while (nu6Var3 != null) {
                    if ((nu6Var3.c & 1024) != 0) {
                        nu6 nu6VarT2 = nu6Var3;
                        g07 g07Var4 = null;
                        while (nu6VarT2 != null) {
                            if (nu6VarT2 instanceof h54) {
                                h54 h54Var2 = (h54) nu6VarT2;
                                if (lc5.Q(g07Var != null ? Boolean.valueOf(g07Var.j(h54Var2)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (objArr.length < i7) {
                                        int length = objArr.length;
                                        v44Var = focusOwner;
                                        Object[] objArr3 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        v44Var = focusOwner;
                                        i3 = i7;
                                    }
                                    objArr[i5] = h54Var2;
                                    i5 = i3;
                                } else {
                                    v44Var = focusOwner;
                                    int i8 = i6 + 1;
                                    if (objArr2.length < i8) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i2 = i8;
                                    }
                                    objArr2[i6] = h54Var2;
                                    i6 = i2;
                                }
                                if (h54Var2 == h54VarF) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                v44Var = focusOwner;
                                z = true;
                            }
                            if (z && (nu6VarT2.c & 1024) != 0 && (nu6VarT2 instanceof qm2)) {
                                int i9 = 0;
                                for (nu6 nu6Var4 = ((qm2) nu6VarT2).B; nu6Var4 != null; nu6Var4 = nu6Var4.f) {
                                    if ((nu6Var4.c & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            nu6VarT2 = nu6Var4;
                                            i = i10;
                                        } else {
                                            if (g07Var4 == null) {
                                                i = i10;
                                                g07Var2 = new g07(new nu6[16]);
                                            } else {
                                                i = i10;
                                                g07Var2 = g07Var4;
                                            }
                                            if (nu6VarT2 != null) {
                                                g07Var2.b(nu6VarT2);
                                                nu6VarT2 = null;
                                            }
                                            g07Var2.b(nu6Var4);
                                            g07Var4 = g07Var2;
                                        }
                                        i9 = i;
                                    }
                                }
                                if (i9 == 1) {
                                    focusOwner = v44Var;
                                } else {
                                    nu6VarT2 = vw1.t(g07Var4);
                                    focusOwner = v44Var;
                                }
                            } else {
                                nu6VarT2 = vw1.t(g07Var4);
                                focusOwner = v44Var;
                            }
                        }
                    }
                    nu6Var3 = nu6Var3.e;
                    focusOwner = focusOwner;
                }
            }
            v44 v44Var2 = focusOwner;
            sn5VarS2 = sn5VarS2.v();
            nu6Var3 = (sn5VarS2 == null || (z70Var = sn5VarS2.S) == null) ? null : (n9a) z70Var.f;
            focusOwner = v44Var2;
        }
        v44 v44Var3 = focusOwner;
        if (z2 && h54VarF != null && !H(h54VarF, false)) {
            return false;
        }
        ny1.T(h54Var, new rh(h54Var, 6));
        int iOrdinal = h54Var.j1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vw1.T(h54Var).getFocusOwner().i(h54Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    mn5.g();
                    return false;
                }
                vw1.T(h54Var).getFocusOwner().i(h54Var);
            }
        }
        d54 d54Var = d54.c;
        d54 d54Var2 = d54.a;
        if (z2 && h54VarF != null) {
            h54VarF.f1(d54Var2, d54Var);
        }
        d54 d54Var3 = d54.b;
        if (g07Var != null) {
            int i11 = g07Var.c - 1;
            Object[] objArr5 = g07Var.a;
            if (i11 < objArr5.length) {
                while (i11 >= 0) {
                    h54 h54Var3 = (h54) objArr5[i11];
                    if (v44Var3.f() != h54Var) {
                        return false;
                    }
                    h54Var3.f1(d54Var3, d54Var);
                    i11--;
                }
            }
        }
        int i12 = i6 - 1;
        if (i12 < objArr2.length) {
            while (i12 >= 0) {
                h54 h54Var4 = (h54) objArr2[i12];
                if (v44Var3.f() != h54Var) {
                    return false;
                }
                h54Var4.f1(h54Var4 == h54VarF ? d54Var2 : d54Var, d54Var3);
                i12--;
            }
        }
        if (v44Var3.f() != h54Var) {
            return false;
        }
        h54Var.f1(d54VarJ1, d54Var2);
        return v44Var3.f() == h54Var;
    }

    public static LinkedHashSet X(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        fc1.p0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet Y(Set set, Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y86.O(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Executor Z(Executor executor, e44 e44Var) {
        executor.getClass();
        return executor == et2.a ? executor : new dv6(executor, e44Var, 0);
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final aw3 a0(qs7 qs7Var, kb4 kb4Var, dd4 dd4Var, int i) {
        lw3 hw3Var;
        qs7Var.getClass();
        kb4Var.getClass();
        a07 a07VarA = dk9.A(kb4Var, dd4Var);
        wv3 wv3Var = new wv3();
        if (qs7Var instanceof ms7) {
            List list = ((ms7) qs7Var).a;
            hw3Var = new hw3(list != null ? fc1.e1(list) : null);
        } else if (qs7Var.equals(ns7.a)) {
            hw3Var = iw3.a;
        } else if (qs7Var.equals(os7.a)) {
            hw3Var = jw3.a;
        } else if (qs7Var.equals(ps7.a)) {
            hw3Var = kw3.a;
        } else {
            if (!qs7Var.equals(ls7.a)) {
                mn5.g();
                return null;
            }
            hw3Var = new hw3(fc1.e1(gc1.Z("mp3", "wav", "m4a")));
        }
        boolean zF = dd4Var.f(a07VarA);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = new wf3(a07VarA, 23);
            dd4Var.p0(objQ);
        }
        ss7 ss7VarK = qx1.K(hw3Var, wv3Var, (kb4) objQ, dd4Var);
        boolean zF2 = dd4Var.f(ss7VarK);
        Object objQ2 = dd4Var.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new aw3(ss7VarK);
            dd4Var.p0(objQ2);
        }
        return (aw3) objQ2;
    }

    public static final void b(String str, String str2, t27 t27Var, dd4 dd4Var, int i) {
        t27 t27Var2;
        str.getClass();
        str2.getClass();
        t27Var.getClass();
        dd4Var.h0(1370682843);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(t27Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = dd4Var.Q();
            int i3 = 7;
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new wj0(str2, i3);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            jv2 jv2Var = (jv2) ((qtb) qx1.N(ug8.a(jv2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), ib4Var));
            a07 a07VarB = bx1.B(jv2Var.M, dd4Var);
            a07 a07VarB2 = bx1.B(jv2Var.d, dd4Var);
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 14) == 4;
            Object objQ2 = dd4Var.Q();
            int i4 = 6;
            if (z2 || objQ2 == obj) {
                objQ2 = new wj0(str, i4);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ2, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new bs2(i4);
                dd4Var.p0(objQ3);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ3, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new bs2(i3);
                dd4Var.p0(objQ4);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr3, (ib4) objQ4, dd4Var, 48);
            boolean zF = dd4Var.f(jv2Var);
            Object objQ5 = dd4Var.Q();
            if (zF || objQ5 == obj) {
                objQ5 = new rb2(jv2Var, 26);
                dd4Var.p0(objQ5);
            }
            lx1.g(jv2Var, null, (kb4) objQ5, dd4Var, 0);
            String str3 = (String) a07Var.getValue();
            boolean zF2 = dd4Var.f(jv2Var) | dd4Var.f(a07Var);
            Object objQ6 = dd4Var.Q();
            int i5 = 9;
            if (zF2 || objQ6 == obj) {
                objQ6 = new pg(jv2Var, a07Var, null, i5);
                dd4Var.p0(objQ6);
            }
            lc5.u((yb4) objQ6, dd4Var, str3);
            t27Var2 = t27Var;
            gx1.p(wn9.L((pv9) mu9.e0.getValue(), new Object[]{(String) a07Var.getValue()}, dd4Var), null, false, jf0.G(-587010217, new q41(t27Var, 15), dd4Var), jf0.G(826630848, new c41(i5, a07Var3, (Object) a07Var2, (Object) a07VarB2), dd4Var), jf0.G(-335841115, new w6(str2, t27Var, a07VarB, jv2Var, 1), dd4Var), dd4Var, 224256, 6);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            String str4 = (String) a07Var.getValue();
            String strK = wn9.K((pv9) mu9.c0.getValue(), dd4Var);
            boolean zF3 = dd4Var.f(a07Var2);
            Object objQ7 = dd4Var.Q();
            if (zF3 || objQ7 == obj) {
                objQ7 = new r02(a07Var2, 14);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var = (kb4) objQ7;
            boolean zF4 = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ8 = dd4Var.Q();
            if (zF4 || objQ8 == obj) {
                objQ8 = new rl0(a07Var2, a07Var, 4);
                dd4Var.p0(objQ8);
            }
            wx1.p(zBooleanValue, str4, strK, kb4Var, (kb4) objQ8, dd4Var, 0);
            boolean zBooleanValue2 = ((Boolean) a07Var3.getValue()).booleanValue();
            boolean zF5 = dd4Var.f(a07Var3);
            Object objQ9 = dd4Var.Q();
            if (zF5 || objQ9 == obj) {
                objQ9 = new r02(a07Var3, 15);
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var2 = (kb4) objQ9;
            boolean zF6 = dd4Var.f(a07Var3) | ((i2 & 896) == 256);
            Object objQ10 = dd4Var.Q();
            if (zF6 || objQ10 == obj) {
                objQ10 = new xj0(t27Var2, a07Var3, 9);
                dd4Var.p0(objQ10);
            }
            wn9.c(zBooleanValue2, null, str2, kb4Var2, (ib4) objQ10, dd4Var, (i2 << 3) & 896);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nq2(str, str2, t27Var2, i, 1);
        }
    }

    public static final f28 b0(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        rt8 rt8VarK0 = qu1.k0(new qp6(12), new ss6(28));
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new uj6(19);
            dd4Var.p0(objQ);
        }
        return (f28) ww1.d0(objArr, rt8VarK0, (ib4) objQ, dd4Var, 384);
    }

    public static final void c(List list, int i, wq5 wq5Var, boolean z, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-954224061);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.f(wq5Var) ? 256 : Token.CASE) | (dd4Var.g(z) ? 2048 : 1024) | (dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(pj7Var2) ? 1048576 : 524288) | (dd4Var.h(kb4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            yh4 yh4Var = new yh4(wx1.Q(i, 80, Context.VERSION_ES6));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hz5(0, kb4Var, list, z);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, pj7Var2, 0.0f, (kb4) objQ, dd4Var, (i3 & 896) | 1769520 | ((i3 >> 6) & 7168), (i3 >> 15) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iz5(list, i, wq5Var, z, ou6Var, pj7Var, pj7Var2, kb4Var, i2, 0);
        }
    }

    public static final aw3 c0(qs7 qs7Var, kb4 kb4Var, dd4 dd4Var, int i) {
        lw3 hw3Var;
        qs7Var.getClass();
        kb4Var.getClass();
        a07 a07VarA = dk9.A(kb4Var, dd4Var);
        if (qs7Var instanceof ms7) {
            List list = ((ms7) qs7Var).a;
            hw3Var = new hw3(list != null ? fc1.e1(list) : null);
        } else if (qs7Var.equals(ns7.a)) {
            hw3Var = iw3.a;
        } else if (qs7Var.equals(os7.a)) {
            hw3Var = jw3.a;
        } else if (qs7Var.equals(ps7.a)) {
            hw3Var = kw3.a;
        } else {
            if (!qs7Var.equals(ls7.a)) {
                mn5.g();
                return null;
            }
            hw3Var = new hw3(fc1.e1(gc1.Z("mp3", "wav", "m4a")));
        }
        boolean zF = dd4Var.f(a07VarA);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = new wf3(a07VarA, 22);
            dd4Var.p0(objQ);
        }
        ss7 ss7VarK = qx1.K(hw3Var, xv3.a, (kb4) objQ, dd4Var);
        boolean zF2 = dd4Var.f(ss7VarK);
        Object objQ2 = dd4Var.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new aw3(ss7VarK);
            dd4Var.p0(objQ2);
        }
        return (aw3) objQ2;
    }

    public static final void d(List list, int i, wq5 wq5Var, boolean z, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(731675874);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.f(wq5Var) ? 256 : Token.CASE) | (dd4Var.g(z) ? 2048 : 1024) | (dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(pj7Var2) ? 1048576 : 524288) | (dd4Var.h(kb4Var) ? 8388608 : 4194304);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            yh4 yh4Var = new yh4(wx1.Q(i, 80, Context.VERSION_ES6));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hz5(i4, kb4Var, list, z);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, pj7Var2, 0.0f, (kb4) objQ, dd4Var, (i3 & 896) | 1769520 | ((i3 >> 6) & 7168), (i3 >> 15) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iz5(list, i, wq5Var, z, ou6Var, pj7Var, pj7Var2, kb4Var, i2, 1);
        }
    }

    public static Set d0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final zk7 r27, final ou6 r28, pj7 r29, fk7 r30, int r31, float r32, wf0 r33, hj9 r34, boolean r35, n47 r36, mj9 r37, ag r38, final defpackage.rj1 r39, dd4 r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.e(zk7, ou6, pj7, fk7, int, float, wf0, hj9, boolean, n47, mj9, ag, rj1, dd4, int, int):void");
    }

    public static final void e0(Object obj) {
        if (obj instanceof pm8) {
            throw ((pm8) obj).a;
        }
    }

    public static uf5 f(kb4 kb4Var) {
        te5 te5Var = ue5.d;
        te5Var.getClass();
        af5 af5Var = new af5();
        cf5 cf5Var = te5Var.a;
        af5Var.a = cf5Var.a;
        af5Var.b = cf5Var.e;
        af5Var.c = cf5Var.b;
        af5Var.d = cf5Var.c;
        String str = cf5Var.f;
        af5Var.e = cf5Var.g;
        String str2 = cf5Var.h;
        s81 s81Var = cf5Var.l;
        boolean z = cf5Var.j;
        af5Var.f = cf5Var.k;
        af5Var.g = cf5Var.i;
        af5Var.h = cf5Var.d;
        q32 q32Var = te5Var.b;
        boolean z2 = cf5Var.m;
        kb4Var.invoke(af5Var);
        if (!lc5.Q(str, "    ")) {
            gp.l("Indent should not be specified when default printing mode is used");
            return null;
        }
        cf5 cf5Var2 = new cf5(af5Var.a, af5Var.c, af5Var.d, af5Var.h, af5Var.b, str, af5Var.e, str2, af5Var.g, z, af5Var.f, s81Var, z2);
        q32Var.getClass();
        uf5 uf5Var = new uf5(cf5Var2, q32Var);
        if (q32Var != a49.a) {
            q32Var.h(new a65(cf5Var2));
        }
        return uf5Var;
    }

    public static final long f0(xp4 xp4Var) {
        xp4Var.getClass();
        kb8 kb8VarB = new xi4(xp4Var.a, xp4Var.b, xp4Var.c, xp4Var.d).b();
        int iM = t96.M(kb8VarB.a * 255.0f);
        int iM2 = t96.M(kb8VarB.b * 255.0f);
        int iM3 = t96.M(kb8VarB.c * 255.0f);
        float f = kb8VarB.d;
        if (Float.isNaN(f)) {
            f = 1.0f;
        }
        return ah1.k(iM, iM2, iM3, t96.M(f * 255.0f));
    }

    public static final void g(List list, int i, wq5 wq5Var, boolean z, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-884521573);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.f(wq5Var) ? 256 : Token.CASE) | (dd4Var.g(z) ? 2048 : 1024) | (dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(pj7Var2) ? 1048576 : 524288) | (dd4Var.h(kb4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            yh4 yh4Var = new yh4(wx1.Q(i, 180, 400));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hz5(3, kb4Var, list, z);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, pj7Var2, 0.0f, (kb4) objQ, dd4Var, (i3 & 896) | 1769520 | ((i3 >> 6) & 7168), (i3 >> 15) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iz5(list, i, wq5Var, z, ou6Var, pj7Var, pj7Var2, kb4Var, i2, 3);
        }
    }

    public static final p95 g0(Instant instant) {
        p95 p95Var = p95.c;
        return ny1.H(instant.getEpochSecond(), instant.getNano());
    }

    public static final void h(List list, int i, wq5 wq5Var, boolean z, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(801378362);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.f(wq5Var) ? 256 : Token.CASE) | (dd4Var.g(z) ? 2048 : 1024) | (dd4Var.f(pj7Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(pj7Var2) ? 1048576 : 524288) | (dd4Var.h(kb4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            yh4 yh4Var = new yh4(wx1.Q(i, 150, 400));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hz5(2, kb4Var, list, z);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, pj7Var2, 0.0f, (kb4) objQ, dd4Var, (i3 & 896) | 1769520 | ((i3 >> 6) & 7168), (i3 >> 15) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iz5(list, i, wq5Var, z, ou6Var, pj7Var, pj7Var2, kb4Var, i2, 2);
        }
    }

    public static void h0(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        w0(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static final void i(lz5 lz5Var, wq5 wq5Var, pj7 pj7Var, pj7 pj7Var2, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        pj7 pj7Var3;
        kb4 kb4Var2;
        dd4Var.h0(-1671986475);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(lz5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(wq5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            pj7Var3 = pj7Var2;
            i2 |= dd4Var.f(pj7Var3) ? 2048 : 1024;
        } else {
            pj7Var3 = pj7Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            kb4Var2 = kb4Var;
            i2 |= dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var.h(ib4Var2) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (dd4Var.V(i3 & 1, (4793491 & i3) != 4793490)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            g78 g78VarB = z68.b(dd4Var);
            int i4 = i3 >> 15;
            mt5.b(wq5Var, ib4Var2, dd4Var, ((i3 >> 3) & 14) | (i4 & 896));
            z68.a(lz5Var.b, ib4Var, ou6Var, g78VarB, (f9) null, jf0.G(-1754563666, new c41(20, g78VarB, lz5Var, pj7Var), dd4Var), false, 0.0f, jf0.G(2100623921, new sz0(lz5Var, wq5Var, pj7Var, pj7Var3, kb4Var2), dd4Var), dd4Var, (i4 & Token.ASSIGN_MOD) | 100859904 | ((i3 >> 6) & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(lz5Var, wq5Var, pj7Var, pj7Var2, ou6Var, kb4Var, ib4Var, ib4Var2, i);
        }
    }

    public static void i0(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcel.writeBundle(bundle);
            y0(iX0, parcel);
        }
    }

    public static final void j(boolean z, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2041672283);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(ib4Var2) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 16.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
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
            p35 p35VarJ0 = lx1.j0(dd4Var2);
            lu6 lu6Var = lu6.a;
            i12.f(p35VarJ0, tg9.o(lu6Var, 250.0f, 200.0f), (gh0) null, dd4Var2, 432, 120);
            String strK = wn9.K((pv9) eu9.y.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, gjb.n0(lu6Var, 24.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.f, dd4Var, 48, 0, 130044);
            un9.a(dd4Var, tg9.h(lu6Var, 16.0f));
            nha.c(wn9.K((pv9) eu9.z.getValue(), dd4Var), gjb.n0(lu6Var, 12.0f, 0.0f, 2), ((q96) dd4Var.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 48, 0, 130040);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            kc5.n(null, wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, new rj7(32.0f, 8.0f, 32.0f, 8.0f), null, null, ib4Var, dd4Var2, ((i2 << 18) & 234881024) | 196608, 221);
            if (z) {
                dd4Var2.f0(430174074);
                un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
                rj7 rj7Var = new rj7(32.0f, 8.0f, 32.0f, 8.0f);
                String strK2 = wn9.K((pv9) mu9.z.getValue(), dd4Var2);
                boolean z2 = (i2 & 7168) == 2048;
                Object objQ = dd4Var2.Q();
                if (z2 || objQ == vl1.a) {
                    objQ = new i35(9, ib4Var2);
                    dd4Var2.p0(objQ);
                }
                kc5.n(null, strK2, false, null, null, rj7Var, null, null, (ib4) objQ, dd4Var2, 196608, 221);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(430463335);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nh1(z, ou6Var, ib4Var, ib4Var2, i, 1);
        }
    }

    public static void j0(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcel.writeByteArray(bArr);
            y0(iX0, parcel);
        }
    }

    public static final void k(String str, boolean z, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1986784643);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 16.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
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
            p35 p35VarK0 = lx1.k0(dd4Var2);
            lu6 lu6Var = lu6.a;
            i12.f(p35VarK0, tg9.o(lu6Var, 250.0f, 200.0f), (gh0) null, dd4Var2, 432, 120);
            String strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, gjb.n0(lu6Var, 24.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.f, dd4Var, 48, 0, 130044);
            un9.a(dd4Var, tg9.h(lu6Var, 16.0f));
            dd4Var.f0(-1406819220);
            String strK2 = str.length() == 0 ? wn9.K((pv9) eu9.F.getValue(), dd4Var) : str;
            dd4Var.q(false);
            nha.c(strK2, gjb.n0(lu6Var, 12.0f, 0.0f, 2), ((q96) dd4Var.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 48, 0, 130040);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            kc5.n(null, wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, new rj7(32.0f, 8.0f, 32.0f, 8.0f), null, null, ib4Var, dd4Var2, ((i3 << 15) & 234881024) | 196608, 221);
            if (z) {
                dd4Var2.f0(-661139314);
                un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
                rj7 rj7Var = new rj7(32.0f, 8.0f, 32.0f, 8.0f);
                String strK3 = wn9.K((pv9) mu9.z.getValue(), dd4Var2);
                boolean z2 = (i3 & 57344) == 16384;
                Object objQ = dd4Var2.Q();
                if (z2 || objQ == vl1.a) {
                    objQ = new i35(10, ib4Var2);
                    dd4Var2.p0(objQ);
                }
                kc5.n(null, strK3, false, null, null, rj7Var, null, null, (ib4) objQ, dd4Var2, 196608, 221);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-660850053);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(str, z, ou6Var, ib4Var, ib4Var2, i);
        }
    }

    public static void k0(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iX0 = x0(i, parcel);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        y0(iX0, parcel);
    }

    public static final void l(lz5 lz5Var, wq5 wq5Var, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        pj7 pj7Var3;
        dd4 dd4Var2 = dd4Var;
        lz5Var.getClass();
        List list = lz5Var.j;
        pj7Var.getClass();
        pj7Var2.getClass();
        kb4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        dd4Var2.h0(2115110874);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(lz5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(wq5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            ou6Var2 = ou6Var;
            i2 |= dd4Var2.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i & 3072) == 0) {
            pj7Var3 = pj7Var;
            i2 |= dd4Var2.f(pj7Var3) ? 2048 : 1024;
        } else {
            pj7Var3 = pj7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.f(pj7Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var2.h(ib4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var2.h(ib4Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= dd4Var2.h(ib4Var3) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i2 & 1, (38347923 & i2) != 38347922)) {
            dd4Var2.a0();
            if ((i & 1) != 0 && !dd4Var2.C()) {
                dd4Var2.Y();
            }
            dd4Var2.r();
            if (lz5Var.b && list.isEmpty()) {
                dd4Var2.f0(-196751295);
                int i3 = i2;
                m(lz5Var.f, lz5Var.g, pj7Var3, ou6Var2, dd4Var2, ((i3 << 3) & 7168) | ((i3 >> 3) & 896));
                dd4Var2.q(false);
            } else {
                int i4 = i2;
                if (lz5Var.h && list.isEmpty()) {
                    dd4Var2.f0(-196469009);
                    k(lz5Var.i, lz5Var.c, ou6Var, ib4Var2, ib4Var, dd4Var2, (i4 & 896) | ((i4 >> 12) & 7168) | (57344 & (i4 >> 6)));
                    dd4Var2 = dd4Var2;
                    dd4Var2.q(false);
                } else if (list.isEmpty()) {
                    dd4Var2.f0(-196157118);
                    j(lz5Var.c, ou6Var, ib4Var2, ib4Var, dd4Var2, ((i4 >> 3) & Token.ASSIGN_MOD) | ((i4 >> 15) & 896) | ((i4 >> 9) & 7168));
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-195906235);
                    boolean z = (458752 & i4) == 131072;
                    Object objQ = dd4Var2.Q();
                    if (z || objQ == vl1.a) {
                        objQ = new mj(8, kb4Var);
                        dd4Var2.p0(objQ);
                    }
                    int i5 = i4 >> 3;
                    i(lz5Var, wq5Var, pj7Var, pj7Var2, ou6Var, (kb4) objQ, ib4Var2, ib4Var3, dd4Var2, (i4 & Token.ELSE) | (i5 & 896) | (i5 & 7168) | (57344 & (i4 << 6)) | (3670016 & i5) | (29360128 & i5));
                    dd4Var2 = dd4Var2;
                    dd4Var2.q(false);
                }
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(lz5Var, wq5Var, ou6Var, pj7Var, pj7Var2, kb4Var, ib4Var, ib4Var2, ib4Var3, i);
        }
    }

    public static void l0(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        w0(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static final void m(int i, final int i2, final pj7 pj7Var, ou6 ou6Var, dd4 dd4Var, int i3) {
        int i4;
        dd4Var.h0(449923165);
        final int i5 = 2;
        if ((i3 & 6) == 0) {
            i4 = (dd4Var.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        final int i6 = 0;
        final int i7 = 1;
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            final int i8 = 3;
            if (i == 0) {
                dd4Var.f0(-931676376);
                sdc.e(ou6Var, null, jf0.G(-1808664789, new zb4() { // from class: gz5
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        int i9 = i8;
                        heb hebVar = heb.a;
                        Object obj4 = vl1.a;
                        int i10 = i2;
                        switch (i9) {
                            case 0:
                                co0 co0Var = (co0) obj;
                                dd4 dd4Var2 = (dd4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                co0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                                }
                                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    dd4Var2.Y();
                                } else {
                                    float fQ = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC = (int) ((co0Var.c() / fQ) * (co0Var.d() / fQ));
                                    yh4 yh4Var = new yh4(fQ);
                                    mv mvVar = new mv(8.0f, true, new gp(5));
                                    mv mvVar2 = new mv(8.0f, true, new gp(5));
                                    boolean zD = dd4Var2.d(iC);
                                    Object objQ = dd4Var2.Q();
                                    if (zD || objQ == obj4) {
                                        objQ = new vl0(iC, 9);
                                        dd4Var2.p0(objQ);
                                    }
                                    sw1.h(yh4Var, (ou6) null, (wq5) null, pj7Var, mvVar2, mvVar, (s04) null, false, (ag) null, (kb4) objQ, dd4Var2, 102432768, 0, 662);
                                }
                                break;
                            case 1:
                                co0 co0Var2 = (co0) obj;
                                dd4 dd4Var3 = (dd4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                co0Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                                }
                                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    dd4Var3.Y();
                                } else {
                                    float fQ2 = wx1.Q(i10, 180, 400);
                                    int iC2 = (int) ((co0Var2.c() / 90.0f) * (co0Var2.d() / fQ2));
                                    yh4 yh4Var2 = new yh4(fQ2);
                                    mv mvVar3 = new mv(8.0f, true, new gp(5));
                                    mv mvVar4 = new mv(8.0f, true, new gp(5));
                                    boolean zD2 = dd4Var3.d(iC2);
                                    Object objQ2 = dd4Var3.Q();
                                    if (zD2 || objQ2 == obj4) {
                                        objQ2 = new vl0(iC2, 8);
                                        dd4Var3.p0(objQ2);
                                    }
                                    sw1.h(yh4Var2, (ou6) null, (wq5) null, pj7Var, mvVar4, mvVar3, (s04) null, false, (ag) null, (kb4) objQ2, dd4Var3, 102432768, 0, 662);
                                }
                                break;
                            case 2:
                                co0 co0Var3 = (co0) obj;
                                dd4 dd4Var4 = (dd4) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                co0Var3.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= dd4Var4.f(co0Var3) ? 4 : 2;
                                }
                                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    dd4Var4.Y();
                                } else {
                                    float fQ3 = wx1.Q(i10, 150, 400);
                                    int iC3 = (int) ((co0Var3.c() / 80.0f) * (co0Var3.d() / fQ3));
                                    yh4 yh4Var3 = new yh4(fQ3);
                                    mv mvVar5 = new mv(8.0f, true, new gp(5));
                                    mv mvVar6 = new mv(8.0f, true, new gp(5));
                                    boolean zD3 = dd4Var4.d(iC3);
                                    Object objQ3 = dd4Var4.Q();
                                    if (zD3 || objQ3 == obj4) {
                                        objQ3 = new vl0(iC3, 11);
                                        dd4Var4.p0(objQ3);
                                    }
                                    sw1.h(yh4Var3, (ou6) null, (wq5) null, pj7Var, mvVar6, mvVar5, (s04) null, false, (ag) null, (kb4) objQ3, dd4Var4, 102432768, 0, 662);
                                }
                                break;
                            default:
                                co0 co0Var4 = (co0) obj;
                                dd4 dd4Var5 = (dd4) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                co0Var4.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= dd4Var5.f(co0Var4) ? 4 : 2;
                                }
                                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    dd4Var5.Y();
                                } else {
                                    float fQ4 = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC4 = (int) ((co0Var4.c() / fQ4) * (co0Var4.d() / fQ4));
                                    yh4 yh4Var4 = new yh4(fQ4);
                                    mv mvVar7 = new mv(8.0f, true, new gp(5));
                                    mv mvVar8 = new mv(8.0f, true, new gp(5));
                                    boolean zD4 = dd4Var5.d(iC4);
                                    Object objQ4 = dd4Var5.Q();
                                    if (zD4 || objQ4 == obj4) {
                                        objQ4 = new vl0(iC4, 10);
                                        dd4Var5.p0(objQ4);
                                    }
                                    sw1.h(yh4Var4, (ou6) null, (wq5) null, pj7Var, mvVar8, mvVar7, (s04) null, false, (ag) null, (kb4) objQ4, dd4Var5, 102432768, 0, 662);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var), dd4Var, ((i4 >> 9) & 14) | 3072, 6);
                dd4Var.q(false);
            } else if (i == 1) {
                dd4Var.f0(-930810360);
                sdc.e(ou6Var, null, jf0.G(623977876, new zb4() { // from class: gz5
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        int i9 = i6;
                        heb hebVar = heb.a;
                        Object obj4 = vl1.a;
                        int i10 = i2;
                        switch (i9) {
                            case 0:
                                co0 co0Var = (co0) obj;
                                dd4 dd4Var2 = (dd4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                co0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                                }
                                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    dd4Var2.Y();
                                } else {
                                    float fQ = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC = (int) ((co0Var.c() / fQ) * (co0Var.d() / fQ));
                                    yh4 yh4Var = new yh4(fQ);
                                    mv mvVar = new mv(8.0f, true, new gp(5));
                                    mv mvVar2 = new mv(8.0f, true, new gp(5));
                                    boolean zD = dd4Var2.d(iC);
                                    Object objQ = dd4Var2.Q();
                                    if (zD || objQ == obj4) {
                                        objQ = new vl0(iC, 9);
                                        dd4Var2.p0(objQ);
                                    }
                                    sw1.h(yh4Var, (ou6) null, (wq5) null, pj7Var, mvVar2, mvVar, (s04) null, false, (ag) null, (kb4) objQ, dd4Var2, 102432768, 0, 662);
                                }
                                break;
                            case 1:
                                co0 co0Var2 = (co0) obj;
                                dd4 dd4Var3 = (dd4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                co0Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                                }
                                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    dd4Var3.Y();
                                } else {
                                    float fQ2 = wx1.Q(i10, 180, 400);
                                    int iC2 = (int) ((co0Var2.c() / 90.0f) * (co0Var2.d() / fQ2));
                                    yh4 yh4Var2 = new yh4(fQ2);
                                    mv mvVar3 = new mv(8.0f, true, new gp(5));
                                    mv mvVar4 = new mv(8.0f, true, new gp(5));
                                    boolean zD2 = dd4Var3.d(iC2);
                                    Object objQ2 = dd4Var3.Q();
                                    if (zD2 || objQ2 == obj4) {
                                        objQ2 = new vl0(iC2, 8);
                                        dd4Var3.p0(objQ2);
                                    }
                                    sw1.h(yh4Var2, (ou6) null, (wq5) null, pj7Var, mvVar4, mvVar3, (s04) null, false, (ag) null, (kb4) objQ2, dd4Var3, 102432768, 0, 662);
                                }
                                break;
                            case 2:
                                co0 co0Var3 = (co0) obj;
                                dd4 dd4Var4 = (dd4) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                co0Var3.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= dd4Var4.f(co0Var3) ? 4 : 2;
                                }
                                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    dd4Var4.Y();
                                } else {
                                    float fQ3 = wx1.Q(i10, 150, 400);
                                    int iC3 = (int) ((co0Var3.c() / 80.0f) * (co0Var3.d() / fQ3));
                                    yh4 yh4Var3 = new yh4(fQ3);
                                    mv mvVar5 = new mv(8.0f, true, new gp(5));
                                    mv mvVar6 = new mv(8.0f, true, new gp(5));
                                    boolean zD3 = dd4Var4.d(iC3);
                                    Object objQ3 = dd4Var4.Q();
                                    if (zD3 || objQ3 == obj4) {
                                        objQ3 = new vl0(iC3, 11);
                                        dd4Var4.p0(objQ3);
                                    }
                                    sw1.h(yh4Var3, (ou6) null, (wq5) null, pj7Var, mvVar6, mvVar5, (s04) null, false, (ag) null, (kb4) objQ3, dd4Var4, 102432768, 0, 662);
                                }
                                break;
                            default:
                                co0 co0Var4 = (co0) obj;
                                dd4 dd4Var5 = (dd4) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                co0Var4.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= dd4Var5.f(co0Var4) ? 4 : 2;
                                }
                                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    dd4Var5.Y();
                                } else {
                                    float fQ4 = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC4 = (int) ((co0Var4.c() / fQ4) * (co0Var4.d() / fQ4));
                                    yh4 yh4Var4 = new yh4(fQ4);
                                    mv mvVar7 = new mv(8.0f, true, new gp(5));
                                    mv mvVar8 = new mv(8.0f, true, new gp(5));
                                    boolean zD4 = dd4Var5.d(iC4);
                                    Object objQ4 = dd4Var5.Q();
                                    if (zD4 || objQ4 == obj4) {
                                        objQ4 = new vl0(iC4, 10);
                                        dd4Var5.p0(objQ4);
                                    }
                                    sw1.h(yh4Var4, (ou6) null, (wq5) null, pj7Var, mvVar8, mvVar7, (s04) null, false, (ag) null, (kb4) objQ4, dd4Var5, 102432768, 0, 662);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var), dd4Var, ((i4 >> 9) & 14) | 3072, 6);
                dd4Var.q(false);
            } else if (i == 2) {
                dd4Var.f0(-929944468);
                sdc.e(ou6Var, null, jf0.G(-1689827341, new zb4() { // from class: gz5
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        int i9 = i7;
                        heb hebVar = heb.a;
                        Object obj4 = vl1.a;
                        int i10 = i2;
                        switch (i9) {
                            case 0:
                                co0 co0Var = (co0) obj;
                                dd4 dd4Var2 = (dd4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                co0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                                }
                                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    dd4Var2.Y();
                                } else {
                                    float fQ = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC = (int) ((co0Var.c() / fQ) * (co0Var.d() / fQ));
                                    yh4 yh4Var = new yh4(fQ);
                                    mv mvVar = new mv(8.0f, true, new gp(5));
                                    mv mvVar2 = new mv(8.0f, true, new gp(5));
                                    boolean zD = dd4Var2.d(iC);
                                    Object objQ = dd4Var2.Q();
                                    if (zD || objQ == obj4) {
                                        objQ = new vl0(iC, 9);
                                        dd4Var2.p0(objQ);
                                    }
                                    sw1.h(yh4Var, (ou6) null, (wq5) null, pj7Var, mvVar2, mvVar, (s04) null, false, (ag) null, (kb4) objQ, dd4Var2, 102432768, 0, 662);
                                }
                                break;
                            case 1:
                                co0 co0Var2 = (co0) obj;
                                dd4 dd4Var3 = (dd4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                co0Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                                }
                                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    dd4Var3.Y();
                                } else {
                                    float fQ2 = wx1.Q(i10, 180, 400);
                                    int iC2 = (int) ((co0Var2.c() / 90.0f) * (co0Var2.d() / fQ2));
                                    yh4 yh4Var2 = new yh4(fQ2);
                                    mv mvVar3 = new mv(8.0f, true, new gp(5));
                                    mv mvVar4 = new mv(8.0f, true, new gp(5));
                                    boolean zD2 = dd4Var3.d(iC2);
                                    Object objQ2 = dd4Var3.Q();
                                    if (zD2 || objQ2 == obj4) {
                                        objQ2 = new vl0(iC2, 8);
                                        dd4Var3.p0(objQ2);
                                    }
                                    sw1.h(yh4Var2, (ou6) null, (wq5) null, pj7Var, mvVar4, mvVar3, (s04) null, false, (ag) null, (kb4) objQ2, dd4Var3, 102432768, 0, 662);
                                }
                                break;
                            case 2:
                                co0 co0Var3 = (co0) obj;
                                dd4 dd4Var4 = (dd4) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                co0Var3.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= dd4Var4.f(co0Var3) ? 4 : 2;
                                }
                                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    dd4Var4.Y();
                                } else {
                                    float fQ3 = wx1.Q(i10, 150, 400);
                                    int iC3 = (int) ((co0Var3.c() / 80.0f) * (co0Var3.d() / fQ3));
                                    yh4 yh4Var3 = new yh4(fQ3);
                                    mv mvVar5 = new mv(8.0f, true, new gp(5));
                                    mv mvVar6 = new mv(8.0f, true, new gp(5));
                                    boolean zD3 = dd4Var4.d(iC3);
                                    Object objQ3 = dd4Var4.Q();
                                    if (zD3 || objQ3 == obj4) {
                                        objQ3 = new vl0(iC3, 11);
                                        dd4Var4.p0(objQ3);
                                    }
                                    sw1.h(yh4Var3, (ou6) null, (wq5) null, pj7Var, mvVar6, mvVar5, (s04) null, false, (ag) null, (kb4) objQ3, dd4Var4, 102432768, 0, 662);
                                }
                                break;
                            default:
                                co0 co0Var4 = (co0) obj;
                                dd4 dd4Var5 = (dd4) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                co0Var4.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= dd4Var5.f(co0Var4) ? 4 : 2;
                                }
                                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    dd4Var5.Y();
                                } else {
                                    float fQ4 = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC4 = (int) ((co0Var4.c() / fQ4) * (co0Var4.d() / fQ4));
                                    yh4 yh4Var4 = new yh4(fQ4);
                                    mv mvVar7 = new mv(8.0f, true, new gp(5));
                                    mv mvVar8 = new mv(8.0f, true, new gp(5));
                                    boolean zD4 = dd4Var5.d(iC4);
                                    Object objQ4 = dd4Var5.Q();
                                    if (zD4 || objQ4 == obj4) {
                                        objQ4 = new vl0(iC4, 10);
                                        dd4Var5.p0(objQ4);
                                    }
                                    sw1.h(yh4Var4, (ou6) null, (wq5) null, pj7Var, mvVar8, mvVar7, (s04) null, false, (ag) null, (kb4) objQ4, dd4Var5, 102432768, 0, 662);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var), dd4Var, ((i4 >> 9) & 14) | 3072, 6);
                dd4Var.q(false);
            } else if (i != 3) {
                dd4Var.f0(-928283643);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-929082420);
                sdc.e(ou6Var, null, jf0.G(291334738, new zb4() { // from class: gz5
                    @Override // defpackage.zb4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        int i9 = i5;
                        heb hebVar = heb.a;
                        Object obj4 = vl1.a;
                        int i10 = i2;
                        switch (i9) {
                            case 0:
                                co0 co0Var = (co0) obj;
                                dd4 dd4Var2 = (dd4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                co0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= dd4Var2.f(co0Var) ? 4 : 2;
                                }
                                if (!dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    dd4Var2.Y();
                                } else {
                                    float fQ = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC = (int) ((co0Var.c() / fQ) * (co0Var.d() / fQ));
                                    yh4 yh4Var = new yh4(fQ);
                                    mv mvVar = new mv(8.0f, true, new gp(5));
                                    mv mvVar2 = new mv(8.0f, true, new gp(5));
                                    boolean zD = dd4Var2.d(iC);
                                    Object objQ = dd4Var2.Q();
                                    if (zD || objQ == obj4) {
                                        objQ = new vl0(iC, 9);
                                        dd4Var2.p0(objQ);
                                    }
                                    sw1.h(yh4Var, (ou6) null, (wq5) null, pj7Var, mvVar2, mvVar, (s04) null, false, (ag) null, (kb4) objQ, dd4Var2, 102432768, 0, 662);
                                }
                                break;
                            case 1:
                                co0 co0Var2 = (co0) obj;
                                dd4 dd4Var3 = (dd4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                co0Var2.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= dd4Var3.f(co0Var2) ? 4 : 2;
                                }
                                if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    dd4Var3.Y();
                                } else {
                                    float fQ2 = wx1.Q(i10, 180, 400);
                                    int iC2 = (int) ((co0Var2.c() / 90.0f) * (co0Var2.d() / fQ2));
                                    yh4 yh4Var2 = new yh4(fQ2);
                                    mv mvVar3 = new mv(8.0f, true, new gp(5));
                                    mv mvVar4 = new mv(8.0f, true, new gp(5));
                                    boolean zD2 = dd4Var3.d(iC2);
                                    Object objQ2 = dd4Var3.Q();
                                    if (zD2 || objQ2 == obj4) {
                                        objQ2 = new vl0(iC2, 8);
                                        dd4Var3.p0(objQ2);
                                    }
                                    sw1.h(yh4Var2, (ou6) null, (wq5) null, pj7Var, mvVar4, mvVar3, (s04) null, false, (ag) null, (kb4) objQ2, dd4Var3, 102432768, 0, 662);
                                }
                                break;
                            case 2:
                                co0 co0Var3 = (co0) obj;
                                dd4 dd4Var4 = (dd4) obj2;
                                int iIntValue3 = ((Integer) obj3).intValue();
                                co0Var3.getClass();
                                if ((iIntValue3 & 6) == 0) {
                                    iIntValue3 |= dd4Var4.f(co0Var3) ? 4 : 2;
                                }
                                if (!dd4Var4.V(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                    dd4Var4.Y();
                                } else {
                                    float fQ3 = wx1.Q(i10, 150, 400);
                                    int iC3 = (int) ((co0Var3.c() / 80.0f) * (co0Var3.d() / fQ3));
                                    yh4 yh4Var3 = new yh4(fQ3);
                                    mv mvVar5 = new mv(8.0f, true, new gp(5));
                                    mv mvVar6 = new mv(8.0f, true, new gp(5));
                                    boolean zD3 = dd4Var4.d(iC3);
                                    Object objQ3 = dd4Var4.Q();
                                    if (zD3 || objQ3 == obj4) {
                                        objQ3 = new vl0(iC3, 11);
                                        dd4Var4.p0(objQ3);
                                    }
                                    sw1.h(yh4Var3, (ou6) null, (wq5) null, pj7Var, mvVar6, mvVar5, (s04) null, false, (ag) null, (kb4) objQ3, dd4Var4, 102432768, 0, 662);
                                }
                                break;
                            default:
                                co0 co0Var4 = (co0) obj;
                                dd4 dd4Var5 = (dd4) obj2;
                                int iIntValue4 = ((Integer) obj3).intValue();
                                co0Var4.getClass();
                                if ((iIntValue4 & 6) == 0) {
                                    iIntValue4 |= dd4Var5.f(co0Var4) ? 4 : 2;
                                }
                                if (!dd4Var5.V(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                    dd4Var5.Y();
                                } else {
                                    float fQ4 = wx1.Q(i10, 80, Context.VERSION_ES6);
                                    int iC4 = (int) ((co0Var4.c() / fQ4) * (co0Var4.d() / fQ4));
                                    yh4 yh4Var4 = new yh4(fQ4);
                                    mv mvVar7 = new mv(8.0f, true, new gp(5));
                                    mv mvVar8 = new mv(8.0f, true, new gp(5));
                                    boolean zD4 = dd4Var5.d(iC4);
                                    Object objQ4 = dd4Var5.Q();
                                    if (zD4 || objQ4 == obj4) {
                                        objQ4 = new vl0(iC4, 10);
                                        dd4Var5.p0(objQ4);
                                    }
                                    sw1.h(yh4Var4, (ou6) null, (wq5) null, pj7Var, mvVar8, mvVar7, (s04) null, false, (ag) null, (kb4) objQ4, dd4Var5, 102432768, 0, 662);
                                }
                                break;
                        }
                        return hebVar;
                    }
                }, dd4Var), dd4Var, ((i4 >> 9) & 14) | 3072, 6);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new iq2(i, i2, pj7Var, ou6Var, i3);
        }
    }

    public static void m0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iX0 = x0(i, parcel);
        parcel.writeStrongBinder(iBinder);
        y0(iX0, parcel);
    }

    public static final void n(rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(441837433);
        byte b = 0;
        if (dd4Var.V(i & 1, (i & 3) != 2)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = new s66();
                dd4Var.p0(objQ);
            }
            s66 s66Var = (s66) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = um1.G;
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var = (ib4) objQ2;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var);
            } else {
                dd4Var.s0();
            }
            if (dd4Var.S) {
                dd4Var.b(heb.a, new vw8(28, b));
            }
            un9.s(v05.z, dd4Var, s66Var);
            rj1Var.c(s66Var, dd4Var, 48);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t66(i, 0, rj1Var);
        }
    }

    public static void n0(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcel.writeIntArray(iArr);
            y0(iX0, parcel);
        }
    }

    public static final void o(boolean z, String str, String str2, qj5 qj5Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        int i2;
        xub xubVar = js8.y;
        nj5 nj5Var = nj5.c;
        dd4Var.h0(263665226);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(str2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(xubVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(qj5Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.f(nj5Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var.h(kb4Var2) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            boolean z2 = (i4 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                int length = str2.length();
                objQ = dk9.x(new wga(str2, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            z8.d(z, kb4Var, jf0.G(-859233890, new li6(2, kb4Var2, kb4Var, a07Var, str2), dd4Var), null, yib.E(lu6.a, 14), jf0.G(1473172257, new mi6(i3, kb4Var, a07Var, str2), dd4Var), jf0.G(-612670558, new z31(str, 23), dd4Var), null, 0L, 0L, 0.0f, false, false, jf0.G(-1362899466, new b18(a07Var, qj5Var), dd4Var), dd4Var, (i4 & 14) | 1769856 | ((i4 >> 15) & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k71(z, str, str2, qj5Var, kb4Var, kb4Var2, i);
        }
    }

    public static void o0(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        w0(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static final void p(o83 o83Var, yb4 yb4Var, dd4 dd4Var, int i) {
        o83Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(-550873260);
        int i2 = 2;
        int i3 = i | (dd4Var.f(o83Var) ? 4 : 2) | (dd4Var.h(yb4Var) ? 32 : 16);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) o83Var.a.getValue()).booleanValue();
            ou6 ou6VarE = yib.E(lu6.a, 14);
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new sj6(o83Var, 0);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(1161620392, new tj6(o83Var, yb4Var), dd4Var), null, ou6VarE, jf0.G(-236658453, new sz2(o83Var, i4), dd4Var), jf0.r, null, 0L, 0L, 0.0f, false, false, jf0.G(532284928, new sz2(o83Var, i2), dd4Var), dd4Var, 1769856, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tj6(o83Var, yb4Var, i);
        }
    }

    public static void p0(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        w0(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static final void q(f28 f28Var, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        f28Var.getClass();
        dd4Var.h0(-574747462);
        int i2 = 2;
        int i3 = (dd4Var.f(f28Var) ? 4 : 2) | i;
        if (!dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        } else if (((Boolean) f28Var.a.getValue()).booleanValue()) {
            dd4Var.f0(1733300784);
            Object[] objArr = new Object[0];
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new zn6(f28Var, 0);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            boolean zF = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new l12(a07Var, null, i2);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, heb.a);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new lz4(a07Var, 25);
                dd4Var.p0(objQ3);
            }
            dd4Var2 = dd4Var;
            z14.c((ib4) objQ3, false, false, jf0.G(1419426323, new qz0(i2, f28Var, a07Var), dd4Var), dd4Var2, 3072, 6);
            dd4Var2.q(false);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.f0(1740827336);
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uv2(f28Var, i);
        }
    }

    public static void q0(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcelable.writeToParcel(parcel, i2);
            y0(iX0, parcel);
        }
    }

    public static final void r(final p35 p35Var, final String str, final String str2, final ou6 ou6Var, long j, final ib4 ib4Var, dd4 dd4Var, final int i) {
        final long j2;
        long j3;
        int i2;
        dd4 dd4Var2 = dd4Var;
        p35Var.getClass();
        str.getClass();
        str2.getClass();
        ib4Var.getClass();
        dd4Var2.h0(944462630);
        int i3 = i | (dd4Var2.f(p35Var) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.f(str2) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024) | 8192;
        if ((i & 196608) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var2.V(i3 & 1, (74899 & i3) != 74898)) {
            dd4Var2.a0();
            if ((i & 1) == 0 || dd4Var2.C()) {
                j3 = ((q96) dd4Var2.j(s96.a)).a.q;
                i2 = i3 & (-57345);
            } else {
                dd4Var2.Y();
                i2 = i3 & (-57345);
                j3 = j;
            }
            dd4Var2.r();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE = fw.J(null, ib4Var, lu6Var, false, 15).e(ou6Var);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            long j4 = j3;
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
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
            int i4 = i2 >> 3;
            int i5 = i2;
            mx4.a(p35Var, (String) null, tg9.n(lu6Var, 24.0f), j4, dd4Var2, (i2 & 14) | 432, 0);
            un9.a(dd4Var2, tg9.r(lu6Var, 16.0f));
            ou6 ou6VarF = xv5.f(1.0f, tg9.f(lu6Var, 1.0f), true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
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
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            int i6 = i5 >> 6;
            nha.c(str, ou6VarF2, j4, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 2, 0, (kb4) null, uka.a(((q96) dd4Var2.j(ur9Var)).b.j, 0L, 0L, a84.u, (c64) null, 0L, 0L, (iy5) null, 16777211), dd4Var, (i4 & 14) | 48, 24576, 114680);
            dd4Var2 = dd4Var;
            if (str2.length() > 0) {
                dd4Var2.f0(-602467886);
                nha.c(str2, (ou6) null, lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, i6 & 14, 24960, 109562);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-602131102);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
            j2 = j4;
        } else {
            dd4Var2.Y();
            j2 = j;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: c18
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e11.r(p35Var, str, str2, ou6Var, j2, ib4Var, (dd4) obj, qu1.x0(i | 1));
                    return heb.a;
                }
            };
        }
    }

    public static void r0(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcel.writeString(str);
            y0(iX0, parcel);
        }
    }

    public static final void s(String str, String str2, ou6 ou6Var, boolean z, boolean z2, kb4 kb4Var, dd4 dd4Var, int i) {
        boolean z3;
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        kb4Var.getClass();
        dd4Var2.h0(-1367444156);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.g(z2) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var2.V(i2 & 1, (73875 & i2) != 73874)) {
            boolean z4 = ((458752 & i2) == 131072) | ((57344 & i2) == 16384);
            Object objQ = dd4Var2.Q();
            if (z4 || objQ == vl1.a) {
                objQ = new ck0(16, kb4Var, z2);
                dd4Var2.p0(objQ);
            }
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE = fw.J(null, (ib4) objQ, lu6Var, false, 15).e(ou6Var);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
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
            bp5 bp5VarG = ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5VarG);
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
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarF, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 2, 0, (kb4) null, uka.a(((q96) dd4Var2.j(ur9Var)).b.j, 0L, 0L, a84.u, (c64) null, 0L, 0L, (iy5) null, 16777211), dd4Var2, (i2 & 14) | 48, 24576, 114684);
            if (str2.length() > 0) {
                dd4Var2.f0(-1880926286);
                nha.c(str2, (ou6) null, lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, (i2 >> 3) & 14, 0, 131066);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1880705256);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
            dd4Var2 = dd4Var2;
            vo1.e(z2, null, null, false, null, dd4Var2, 48 | ((i2 >> 12) & 14));
            dd4Var2.q(true);
            z3 = true;
        } else {
            dd4Var2.Y();
            z3 = z;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(str, str2, ou6Var, z3, z2, kb4Var, i);
        }
    }

    public static void s0(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                w0(parcel, i, 0);
            }
        } else {
            int iX0 = x0(i, parcel);
            parcel.writeStringArray(strArr);
            y0(iX0, parcel);
        }
    }

    public static final void t(String str, List list, int i, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        list.getClass();
        kb4Var.getClass();
        dd4Var2.h0(-1064869317);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.d(i) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 16384 : 8192;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new bq6(a07Var, 21);
                dd4Var2.p0(objQ2);
            }
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE = fw.J(null, (ib4) objQ2, lu6Var, false, 15).e(ou6Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarE);
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
            int i4 = i3;
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
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
            bp5 bp5VarG = ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5VarG);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarF, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 2, 0, (kb4) null, uka.a(((q96) dd4Var2.j(ur9Var)).b.j, 0L, 0L, a84.u, (c64) null, 0L, 0L, (iy5) null, 16777211), dd4Var, (i4 & 14) | 48, 24576, 114684);
            nha.c((String) list.get(wx1.Q(i, 0, list.size() - 1)), (ou6) null, lc1.c(0.5f, ((lc1) dd4Var.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 0, 0, 131066);
            ky0.A(dd4Var, true, lu6Var, 8.0f, dd4Var);
            mx4.a(i25.c((m53) f53.t.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var, 432, 8);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ3 = dd4Var.Q();
            if (objQ3 == fu6Var) {
                objQ3 = new bq6(a07Var, 22);
                dd4Var.p0(objQ3);
            }
            gx1.a(zBooleanValue, null, 0L, lu6Var, 0.0f, null, (ib4) objQ3, jf0.G(708221237, new hq6(list, i, kb4Var, a07Var, 2), dd4Var), dd4Var, 14158848, 54);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tv2(i, i2, kb4Var, ou6Var, str, list);
        }
    }

    public static void t0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iX0 = x0(i, parcel);
        parcel.writeStringList(list);
        y0(iX0, parcel);
    }

    public static final void u(String str, String str2, yub yubVar, qj5 qj5Var, nj5 nj5Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        yub yubVar2;
        nj5 nj5Var2;
        str.getClass();
        str2.getClass();
        kb4Var.getClass();
        dd4Var.h0(-1485382870);
        int i2 = (dd4Var.f(str) ? 4 : 2) | i | (dd4Var.f(str2) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(qj5Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i4 = i3 | (dd4Var.h(kb4Var) ? 1048576 : 524288);
        if (dd4Var.V(i4 & 1, (599187 & i4) != 599186)) {
            xub xubVar = js8.y;
            nj5 nj5Var3 = nj5.c;
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new av6(13);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            dd4Var.f0(-1523780163);
            String strK = str2.length() == 0 ? wn9.K((pv9) zt9.Y.getValue(), dd4Var) : str2;
            dd4Var.q(false);
            boolean zF = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new bq6(a07Var, 20);
                dd4Var.p0(objQ2);
            }
            int i5 = i4 << 3;
            v(null, str, strK, ou6Var, (ib4) objQ2, dd4Var, (i5 & Token.ASSIGN_MOD) | ((i4 >> 6) & 7168), 1);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new wo6(a07Var, 24);
                dd4Var.p0(objQ3);
            }
            o(zBooleanValue, str, str2, qj5Var, (kb4) objQ3, kb4Var, dd4Var, i5 & 29884400);
            yubVar2 = xubVar;
            nj5Var2 = nj5Var3;
        } else {
            dd4Var.Y();
            yubVar2 = yubVar;
            nj5Var2 = nj5Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(str, str2, yubVar2, qj5Var, nj5Var2, ou6Var, kb4Var, i, 5);
        }
    }

    public static void u0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iX0 = x0(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        y0(iX0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(p35 r37, java.lang.String r38, java.lang.String r39, ou6 r40, defpackage.ib4 r41, dd4 r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.v(p35, java.lang.String, java.lang.String, ou6, ib4, dd4, int, int):void");
    }

    public static void v0(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                w0(parcel, i, 0);
                return;
            }
            return;
        }
        int iX0 = x0(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        y0(iX0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(java.lang.String r34, java.lang.String r35, ou6 r36, boolean r37, boolean r38, defpackage.kb4 r39, dd4 r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.w(java.lang.String, java.lang.String, ou6, boolean, boolean, kb4, dd4, int, int):void");
    }

    public static void w0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(p35 r36, java.lang.String r37, java.lang.String r38, ou6 r39, boolean r40, boolean r41, defpackage.kb4 r42, dd4 r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e11.x(p35, java.lang.String, java.lang.String, ou6, boolean, boolean, kb4, dd4, int, int):void");
    }

    public static int x0(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void y(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        rj1 rj1Var2;
        dd4Var.h0(790527681);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                cn7 cn7Var = new cn7((Object) null, s00.t);
                dd4Var.p0(cn7Var);
                objQ = cn7Var;
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new bq6(a07Var, 18);
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var = (ib4) objQ2;
            kz7 kz7Var = ak2.a;
            re0 re0VarN = fe.N(fw.b, dd4Var, 6);
            ou6Var2 = ou6Var;
            rj1Var2 = rj1Var;
            jv3.f(new p58[]{bda.b.a(sdc.t0(ib4Var, dd4Var, 2)), bda.a.a(re0VarN)}, jf0.G(1070596993, new uj0(ou6Var2, a07Var, rj1Var2, re0VarN, ib4Var), dd4Var), dd4Var, 56);
        } else {
            ou6Var2 = ou6Var;
            rj1Var2 = rj1Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hk(ou6Var2, rj1Var2, i, 5);
        }
    }

    public static void y0(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void z(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(155925518);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = dd4Var.j(bda.a) != null;
            boolean z2 = dd4Var.j(bda.b) != null;
            if (z && z2) {
                dd4Var.f0(-1977187922);
                ha6 ha6VarD = pn0.d(bv4.b, true);
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
                un9.s(ll1.f, dd4Var, ha6VarD);
                un9.s(ll1.e, dd4Var, lr7VarL);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL0);
                rj1Var.invoke(dd4Var, Integer.valueOf((i2 >> 3) & 14));
                dd4Var.q(true);
                dd4Var.q(false);
            } else if (z) {
                dd4Var.f0(-1976997706);
                sdc.K(ou6Var, rj1Var, dd4Var, i2 & Token.ELSE);
                dd4Var.q(false);
            } else if (z2) {
                dd4Var.f0(-1976846922);
                ak2.d(ou6Var, rj1Var, dd4Var, i2 & Token.ELSE);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1976716505);
                y(ou6Var, rj1Var, dd4Var, i2 & Token.ELSE);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hk(ou6Var, rj1Var, i, i3);
        }
    }

    public final void J(tu tuVar, si9 si9Var, uh8 uh8Var, zg7 zg7Var) {
        this.a.d0(tuVar, si9Var, uh8Var, zg7Var);
    }
}
