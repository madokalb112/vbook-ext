package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s00 implements un1, ix1, fj1, ck9, t91, mj9, wu0, h89, it3 {
    public static final s00 b = new s00(1);
    public static final s00 c = new s00(2);
    public static final /* synthetic */ s00 d = new s00(3);
    public static final s00 e = new s00(4);
    public static final s00 f = new s00(5);
    public static final /* synthetic */ s00 s = new s00(6);
    public static final s00 t = new s00(8);
    public static final /* synthetic */ s00 u = new s00(9);
    public static final s00 v = new s00(10);
    public static final s00 w = new s00(11);
    public static final s00 x = new s00(12);
    public static final s00 y = new s00(13);
    public static final d0c z = new d0c();
    public final /* synthetic */ int a;

    public s00(String str, float f2) {
        this.a = 18;
        str.getClass();
        if (0.0f <= f2) {
            return;
        }
        gp.l("min must be less than or equal to max");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.StringBuilder r4, nia r5) {
        /*
            z83 r0 = b93.u
            java.lang.String r0 = r5.G()
            b93 r1 = r5.a
            if (r1 == 0) goto L21
            r2 = 0
        Lb:
            j9a r3 = r1.e
            int r3 = r3.d
            r3 = r3 & 64
            if (r3 == 0) goto L14
            goto L25
        L14:
            b93 r1 = r1.a
            if (r1 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            int r2 = r2 + 1
            r3 = 6
            if (r2 >= r3) goto L21
            if (r1 != 0) goto Lb
        L21:
            boolean r5 = r5 instanceof hw0
            if (r5 == 0) goto L29
        L25:
            r4.append(r0)
            return
        L29:
            java.lang.String[] r5 = vv9.a
            int r5 = nia.e
            boolean r5 = defpackage.zib.h(r4)
            vv9.a(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.c(java.lang.StringBuilder, nia):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(java.io.FileOutputStream r11, defpackage.kt1 r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof defpackage.mx6
            if (r0 == 0) goto L13
            r0 = r12
            mx6 r0 = (defpackage.mx6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mx6 r0 = new mx6
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            long r3 = r0.b
            java.io.FileOutputStream r11 = r0.a
            defpackage.e11.e0(r12)
            r12 = r0
            goto L72
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            r11 = 0
            return r11
        L31:
            defpackage.e11.e0(r12)
            r3 = 10
            r12 = r0
        L37:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L77
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L52
            r0.getClass()     // Catch: java.io.IOException -> L52
            goto L8a
        L52:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L76
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.bw9.O(r1, r5, r6)
            if (r1 != r2) goto L76
            r12.a = r11
            r12.b = r3
            r12.d = r2
            java.lang.Object r0 = defpackage.tw1.H(r3, r12)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L72
            r0 = r1
            goto L8a
        L72:
            r0 = 2
            long r3 = r3 * r0
            goto L37
        L76:
            throw r0
        L77:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            r0.getClass()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.e(java.io.FileOutputStream, kt1):java.lang.Object");
    }

    public static final void f(s00 s00Var, kwa kwaVar, xq4 xq4Var, qza qzaVar) {
        zwa zwaVar;
        s00Var.getClass();
        if (qzaVar != null && (zwaVar = ((q6b) xq4Var).c) != null) {
            zwaVar.p(qzaVar);
        }
        xq4Var.m = xq4Var.l;
        xq4Var.l = wr4.u;
        xq4Var.R(kwaVar);
    }

    public static final boolean g(s00 s00Var, pwa pwaVar) {
        s00Var.getClass();
        if (pwaVar.a == mwa.e) {
            return vv9.e(((fwa) pwaVar).d.G());
        }
        return false;
    }

    public static final float h(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f5 = fArr2[0];
            f6 = f9;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f3 = fArr2[i2];
            f4 = f10;
            f5 = fArr2[i];
            f6 = f11;
        }
        return (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (fAbs - f4) / (f6 - f4)))) + f3) * fSignum;
    }

    public static final void i(boolean z2) {
        fr9 fr9Var = AndroidBookUpdateWorker.k;
        fr9 fr9Var2 = AndroidBookUpdateWorker.k;
        Boolean boolValueOf = Boolean.valueOf(z2);
        fr9Var2.getClass();
        fr9Var2.l(null, boolValueOf);
    }

    public static c89 n(am7 am7Var) {
        return new c89(System.currentTimeMillis() + 3600000, new cp4(8, 6), new i10(true, false, false), 10.0d, 1.2d, 60);
    }

    public static ad1 o(dd4 dd4Var) {
        return ((q96) dd4Var.j(s96.a)).a;
    }

    public static i99 p(dd4 dd4Var) {
        return ((q96) dd4Var.j(s96.a)).c;
    }

    public static xbb q(dd4 dd4Var) {
        return ((q96) dd4Var.j(s96.a)).b;
    }

    public static void s(kwa kwaVar, b93 b93Var) {
        kwaVar.getClass();
        l00 l00Var = ((lwa) kwaVar).g;
        if (l00Var != null) {
            l00Var.getClass();
            k00 k00Var = new k00(l00Var);
            while (k00Var.hasNext()) {
                i00 i00Var = (i00) k00Var.next();
                String str = i00Var.a;
                b93Var.getClass();
                l00 l00VarF = b93Var.f();
                if (!l00VarF.j(str)) {
                    l00 l00Var2 = i00Var.c;
                    if (l00Var2 == null) {
                        xb8 xb8Var = xb8.c;
                    } else {
                        str.getClass();
                        if (l00Var2.j(str)) {
                            Map mapE = fw.E(!l00Var2.j("/ksoup.userdata") ? null : l00Var2.r().get("ksoup.attrs"));
                            if (mapE == null || ((xb8) mapE.get(str)) == null) {
                                xb8 xb8Var2 = xb8.c;
                            }
                        } else {
                            xb8 xb8Var3 = xb8.c;
                        }
                    }
                    l00VarF.o(str, i00Var.a());
                    i00Var.c = l00VarF;
                }
            }
        }
    }

    public byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public int b(int i, int i2) {
        return 0;
    }

    public void configure(xc3 xc3Var) {
        d40 d40Var = d40.a;
        xc3Var.registerEncoder(zz1.class, d40Var);
        xc3Var.registerEncoder(n60.class, d40Var);
        j40 j40Var = j40.a;
        xc3Var.registerEncoder(yz1.class, j40Var);
        xc3Var.registerEncoder(w60.class, j40Var);
        g40 g40Var = g40.a;
        xc3Var.registerEncoder(gz1.class, g40Var);
        xc3Var.registerEncoder(x60.class, g40Var);
        h40 h40Var = h40.a;
        xc3Var.registerEncoder(fz1.class, h40Var);
        xc3Var.registerEncoder(y60.class, h40Var);
        z40 z40Var = z40.a;
        xc3Var.registerEncoder(xz1.class, z40Var);
        xc3Var.registerEncoder(w70.class, z40Var);
        y40 y40Var = y40.a;
        xc3Var.registerEncoder(wz1.class, y40Var);
        xc3Var.registerEncoder(v70.class, y40Var);
        i40 i40Var = i40.a;
        xc3Var.registerEncoder(hz1.class, i40Var);
        xc3Var.registerEncoder(a70.class, i40Var);
        t40 t40Var = t40.a;
        xc3Var.registerEncoder(vz1.class, t40Var);
        xc3Var.registerEncoder(c70.class, t40Var);
        k40 k40Var = k40.a;
        xc3Var.registerEncoder(pz1.class, k40Var);
        xc3Var.registerEncoder(d70.class, k40Var);
        m40 m40Var = m40.a;
        xc3Var.registerEncoder(nz1.class, m40Var);
        xc3Var.registerEncoder(e70.class, m40Var);
        p40 p40Var = p40.a;
        xc3Var.registerEncoder(mz1.class, p40Var);
        xc3Var.registerEncoder(i70.class, p40Var);
        q40 q40Var = q40.a;
        xc3Var.registerEncoder(lz1.class, q40Var);
        xc3Var.registerEncoder(k70.class, q40Var);
        n40 n40Var = n40.a;
        xc3Var.registerEncoder(jz1.class, n40Var);
        xc3Var.registerEncoder(g70.class, n40Var);
        b40 b40Var = b40.a;
        xc3Var.registerEncoder(bz1.class, b40Var);
        xc3Var.registerEncoder(q60.class, b40Var);
        a40 a40Var = a40.a;
        xc3Var.registerEncoder(az1.class, a40Var);
        xc3Var.registerEncoder(r60.class, a40Var);
        o40 o40Var = o40.a;
        xc3Var.registerEncoder(kz1.class, o40Var);
        xc3Var.registerEncoder(h70.class, o40Var);
        l40 l40Var = l40.a;
        xc3Var.registerEncoder(iz1.class, l40Var);
        xc3Var.registerEncoder(f70.class, l40Var);
        c40 c40Var = c40.a;
        xc3Var.registerEncoder(cz1.class, c40Var);
        xc3Var.registerEncoder(s60.class, c40Var);
        r40 r40Var = r40.a;
        xc3Var.registerEncoder(oz1.class, r40Var);
        xc3Var.registerEncoder(m70.class, r40Var);
        s40 s40Var = s40.a;
        xc3Var.registerEncoder(qz1.class, s40Var);
        xc3Var.registerEncoder(o70.class, s40Var);
        u40 u40Var = u40.a;
        xc3Var.registerEncoder(rz1.class, u40Var);
        xc3Var.registerEncoder(p70.class, u40Var);
        x40 x40Var = x40.a;
        xc3Var.registerEncoder(uz1.class, x40Var);
        xc3Var.registerEncoder(t70.class, x40Var);
        v40 v40Var = v40.a;
        xc3Var.registerEncoder(tz1.class, v40Var);
        xc3Var.registerEncoder(r70.class, v40Var);
        w40 w40Var = w40.a;
        xc3Var.registerEncoder(sz1.class, w40Var);
        xc3Var.registerEncoder(s70.class, w40Var);
        e40 e40Var = e40.a;
        xc3Var.registerEncoder(ez1.class, e40Var);
        xc3Var.registerEncoder(t60.class, e40Var);
        f40 f40Var = f40.a;
        xc3Var.registerEncoder(dz1.class, f40Var);
        xc3Var.registerEncoder(u60.class, f40Var);
    }

    public c89 d(am7 am7Var, JSONObject jSONObject) {
        return n(am7Var);
    }

    public Object get() {
        return new hj4(Executors.newSingleThreadExecutor(), 1);
    }

    public boolean j(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.fj1
    public Object k(ks ksVar) {
        Object objG = ksVar.g(new oa8(zx5.class, Executor.class));
        objG.getClass();
        return qu1.Y((Executor) objG);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(int r5, int r6, defpackage.kt1 r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ry
            if (r0 == 0) goto L13
            r0 = r7
            ry r0 = (defpackage.ry) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ry r0 = new ry
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 1
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L25
            defpackage.e11.e0(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r4)
            r0.c = r1
            java.lang.Object r4 = defpackage.fz1.d0(r5, r6, r0, r8)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            py r4 = (defpackage.py) r4
            sk9 r5 = new sk9
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.l(int, int, kt1, java.lang.String):java.lang.Object");
    }

    public zz5 m(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(zz5.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                zz5 zz5Var = (zz5) objNewInstance;
                if (!zz5Var.d) {
                    return zz5Var;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                cp4.k().j(j2c.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            cp4.k().j(j2c.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bj5 r(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.r(android.view.KeyEvent):bj5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t91
    public void t(is4 is4Var, o1a o1aVar) {
        jt1 jt1Var = null;
        switch (this.a) {
            case 10:
                is4Var.getClass();
                is4Var.s.g(ru4.h, new d8((yb4) o1aVar, jt1Var, 1));
                break;
            default:
                is4Var.getClass();
                is4Var.d.g(ru4.l, new lb((bc4) o1aVar, jt1Var, 9));
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "NeverEqualPolicy";
            case 12:
                return "Start";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s00(int i) {
        this.a = i;
    }
}
