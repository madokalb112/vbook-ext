package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ea9 extends a3 implements xz6, b24, mc4 {
    public final int e;
    public final int f;
    public final ar0 s;
    public Object[] t;
    public long u;
    public long v;
    public int w;
    public int x;

    public ea9(int i, int i2, ar0 ar0Var) {
        this.e = i;
        this.f = i2;
        this.s = ar0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|51|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|53|25|26))(1:29)|55|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [c24] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [a3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ea9] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [c24] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [b3] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [ga9] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [ga9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(defpackage.ea9 r8, defpackage.c24 r9, defpackage.jt1 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.da9
            if (r0 == 0) goto L13
            r0 = r10
            da9 r0 = (defpackage.da9) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            da9 r0 = new da9
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.s
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            yd5 r8 = r0.d
            ga9 r9 = r0.c
            c24 r1 = r0.b
            ea9 r4 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return
        L3f:
            yd5 r8 = r0.d
            ga9 r9 = r0.c
            c24 r1 = r0.b
            ea9 r4 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            ga9 r9 = r0.c
            c24 r8 = r0.b
            ea9 r1 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            defpackage.e11.e0(r10)
            b3 r10 = r8.d()
            ga9 r10 = (defpackage.ga9) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            jx1 r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            s00 r4 = defpackage.s00.s     // Catch: java.lang.Throwable -> Laf
            hx1 r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Laf
            yd5 r1 = (defpackage.yd5) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            zy2 r5 = defpackage.fa9.a     // Catch: java.lang.Throwable -> L36
            xx1 r6 = defpackage.xx1.a
            if (r10 != r5) goto L90
            r0.a = r4     // Catch: java.lang.Throwable -> L36
            r0.b = r1     // Catch: java.lang.Throwable -> L36
            r0.c = r9     // Catch: java.lang.Throwable -> L36
            r0.d = r8     // Catch: java.lang.Throwable -> L36
            r0.s = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.j(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.isActive()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.a = r4     // Catch: java.lang.Throwable -> L36
            r0.b = r1     // Catch: java.lang.Throwable -> L36
            r0.c = r9     // Catch: java.lang.Throwable -> L36
            r0.d = r8     // Catch: java.lang.Throwable -> L36
            r0.s = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.h(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea9.l(ea9, c24, jt1):void");
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) throws Throwable {
        l(this, c24Var, jt1Var);
        return xx1.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    @Override // defpackage.xz6, defpackage.c24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8, defpackage.jt1 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.f(r8)
            if (r0 == 0) goto L9
            heb r7 = defpackage.heb.a
            return r7
        L9:
            ay0 r5 = new ay0
            jt1 r9 = bx1.J(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.u()
            jt1[] r9 = defpackage.jf0.a
            monitor-enter(r7)
            boolean r0 = r7.r(r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L30
            heb r8 = defpackage.heb.a     // Catch: java.lang.Throwable -> L2b
            r5.resumeWith(r8)     // Catch: java.lang.Throwable -> L2b
            jt1[] r8 = r7.o(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8e
        L30:
            ca9 r0 = new ca9     // Catch: java.lang.Throwable -> L8b
            long r1 = r7.p()     // Catch: java.lang.Throwable -> L8b
            int r3 = r7.w     // Catch: java.lang.Throwable -> L86
            int r4 = r7.x     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.n(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.x     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.x = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.f     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            jt1[] r9 = r1.o(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8e
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L65
            ux0 r7 = new ux0
            r0 = 2
            r7.<init>(r9, r0)
            r5.x(r7)
        L65:
            int r7 = r8.length
            r9 = 0
        L67:
            if (r9 >= r7) goto L75
            r0 = r8[r9]
            if (r0 == 0) goto L72
            heb r1 = defpackage.heb.a
            r0.resumeWith(r1)
        L72:
            int r9 = r9 + 1
            goto L67
        L75:
            java.lang.Object r7 = r5.s()
            xx1 r8 = defpackage.xx1.a
            if (r7 != r8) goto L7e
            goto L80
        L7e:
            heb r7 = defpackage.heb.a
        L80:
            if (r7 != r8) goto L83
            return r7
        L83:
            heb r7 = defpackage.heb.a
            return r7
        L86:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8e
        L8b:
            r0 = move-exception
            r1 = r7
            goto L55
        L8e:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea9.b(java.lang.Object, jt1):java.lang.Object");
    }

    @Override // defpackage.mc4
    public final b24 c(jx1 jx1Var, int i, ar0 ar0Var) {
        return ((i == 0 || i == -3) && ar0Var == ar0.a) ? this : new n11(this, jx1Var, i, ar0Var);
    }

    @Override // defpackage.a3
    public final b3 e() {
        ga9 ga9Var = new ga9();
        ga9Var.a = -1L;
        return ga9Var;
    }

    @Override // defpackage.xz6
    public final boolean f(Object obj) {
        int i;
        boolean z;
        jt1[] jt1VarArrO = jf0.a;
        synchronized (this) {
            if (r(obj)) {
                jt1VarArrO = o(jt1VarArrO);
                z = true;
            } else {
                z = false;
            }
        }
        for (jt1 jt1Var : jt1VarArrO) {
            if (jt1Var != null) {
                jt1Var.resumeWith(heb.a);
            }
        }
        return z;
    }

    @Override // defpackage.a3
    public final b3[] g() {
        return new ga9[2];
    }

    public final Object j(ga9 ga9Var, da9 da9Var) {
        ay0 ay0Var = new ay0(1, bx1.J(da9Var));
        ay0Var.u();
        synchronized (this) {
            try {
                if (s(ga9Var) < 0) {
                    ga9Var.b = ay0Var;
                } else {
                    ay0Var.resumeWith(heb.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objS = ay0Var.s();
        return objS == xx1.a ? objS : heb.a;
    }

    public final void k() {
        if (this.f != 0 || this.x > 1) {
            Object[] objArr = this.t;
            objArr.getClass();
            while (this.x > 0) {
                long jP = p();
                int i = this.w;
                int i2 = this.x;
                if (objArr[((int) ((jP + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != fa9.a) {
                    return;
                }
                this.x = i2 - 1;
                fa9.b(objArr, p() + ((long) (this.w + this.x)), null);
            }
        }
    }

    public final void m() {
        b3[] b3VarArr;
        Object[] objArr = this.t;
        objArr.getClass();
        fa9.b(objArr, p(), null);
        this.w--;
        long jP = p() + 1;
        if (this.u < jP) {
            this.u = jP;
        }
        if (this.v < jP) {
            if (this.b != 0 && (b3VarArr = this.a) != null) {
                for (b3 b3Var : b3VarArr) {
                    if (b3Var != null) {
                        ga9 ga9Var = (ga9) b3Var;
                        long j = ga9Var.a;
                        if (j >= 0 && j < jP) {
                            ga9Var.a = jP;
                        }
                    }
                }
            }
            this.v = jP;
        }
    }

    public final void n(Object obj) {
        int i = this.w + this.x;
        Object[] objArrQ = this.t;
        if (objArrQ == null) {
            objArrQ = q(null, 0, 2);
        } else if (i >= objArrQ.length) {
            objArrQ = q(objArrQ, i, objArrQ.length * 2);
        }
        fa9.b(objArrQ, p() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [jt1[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final jt1[] o(jt1[] jt1VarArr) {
        b3[] b3VarArr;
        ga9 ga9Var;
        ay0 ay0Var;
        int length = jt1VarArr.length;
        if (this.b != 0 && (b3VarArr = this.a) != null) {
            int length2 = b3VarArr.length;
            int i = 0;
            jt1VarArr = jt1VarArr;
            while (i < length2) {
                b3 b3Var = b3VarArr[i];
                if (b3Var != null && (ay0Var = (ga9Var = (ga9) b3Var).b) != null && s(ga9Var) >= 0) {
                    int length3 = jt1VarArr.length;
                    jt1VarArr = jt1VarArr;
                    if (length >= length3) {
                        jt1VarArr = Arrays.copyOf((Object[]) jt1VarArr, Math.max(2, jt1VarArr.length * 2));
                    }
                    ((jt1[]) jt1VarArr)[length] = ay0Var;
                    ga9Var.b = null;
                    length++;
                }
                i++;
                jt1VarArr = jt1VarArr;
            }
        }
        return (jt1[]) jt1VarArr;
    }

    public final long p() {
        return Math.min(this.v, this.u);
    }

    public final Object[] q(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            gp.j("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.t = objArr2;
        if (objArr != null) {
            long jP = p();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jP;
                fa9.b(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.b
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.n(r13)
            int r1 = r12.w
            int r1 = r1 + r9
            r12.w = r1
            if (r1 <= r2) goto L18
            r12.m()
        L18:
            long r1 = r12.p()
            int r3 = r12.w
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.v = r1
            return r9
        L23:
            int r1 = r12.w
            int r3 = r12.f
            if (r1 < r3) goto L46
            long r4 = r12.v
            long r6 = r12.u
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            ar0 r1 = r12.s
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            defpackage.mn5.g()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.n(r13)
            int r1 = r12.w
            int r1 = r1 + r9
            r12.w = r1
            if (r1 <= r3) goto L53
            r12.m()
        L53:
            long r3 = r12.p()
            int r1 = r12.w
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.u
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.v
            long r5 = r12.p()
            int r7 = r12.w
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.p()
            int r10 = r12.w
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.x
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea9.r(java.lang.Object):boolean");
    }

    public final long s(ga9 ga9Var) {
        long j = ga9Var.a;
        if (j >= p() + ((long) this.w) && (this.f > 0 || j > p() || this.x == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(ga9 ga9Var) {
        Object obj;
        jt1[] jt1VarArrV = jf0.a;
        synchronized (this) {
            try {
                long jS = s(ga9Var);
                if (jS < 0) {
                    obj = fa9.a;
                } else {
                    long j = ga9Var.a;
                    Object[] objArr = this.t;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof ca9) {
                        obj2 = ((ca9) obj2).c;
                    }
                    ga9Var.a = jS + 1;
                    Object obj3 = obj2;
                    jt1VarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (jt1 jt1Var : jt1VarArrV) {
            if (jt1Var != null) {
                jt1Var.resumeWith(heb.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jP = p(); jP < jMin; jP++) {
            Object[] objArr = this.t;
            objArr.getClass();
            fa9.b(objArr, jP, null);
        }
        this.u = j;
        this.v = j2;
        this.w = (int) (j3 - jMin);
        this.x = (int) (j4 - j3);
    }

    public final jt1[] v(long j) {
        long j2;
        long j3;
        long j4;
        jt1[] jt1VarArr;
        jt1[] jt1VarArr2;
        b3[] b3VarArr;
        jt1[] jt1VarArr3 = jf0.a;
        if (j <= this.v) {
            long jP = p();
            long j5 = ((long) this.w) + jP;
            int i = this.f;
            if (i == 0 && this.x > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.b != 0 && (b3VarArr = this.a) != null) {
                for (b3 b3Var : b3VarArr) {
                    if (b3Var != null) {
                        long j6 = ((ga9) b3Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.v) {
                long jP2 = p() + ((long) this.w);
                int i3 = this.b;
                int iMin = this.x;
                if (i3 > 0) {
                    iMin = Math.min(iMin, i - ((int) (jP2 - j5)));
                }
                long j7 = ((long) this.x) + jP2;
                zy2 zy2Var = fa9.a;
                if (iMin > 0) {
                    j4 = 1;
                    Object[] objArr = this.t;
                    objArr.getClass();
                    j2 = jP;
                    jt1[] jt1VarArr4 = new jt1[iMin];
                    long j8 = jP2;
                    while (true) {
                        if (jP2 >= j7) {
                            jt1VarArr2 = jt1VarArr4;
                            j3 = j5;
                            break;
                        }
                        jt1VarArr2 = jt1VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jP2)];
                        if (obj != zy2Var) {
                            obj.getClass();
                            ca9 ca9Var = (ca9) obj;
                            int i4 = i2 + 1;
                            j3 = j5;
                            jt1VarArr2[i2] = ca9Var.d;
                            fa9.b(objArr, jP2, zy2Var);
                            fa9.b(objArr, j8, ca9Var.c);
                            j8++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j3 = j5;
                        }
                        jP2++;
                        jt1VarArr4 = jt1VarArr2;
                        j5 = j3;
                    }
                    jP2 = j8;
                    jt1VarArr = jt1VarArr2;
                } else {
                    j2 = jP;
                    j3 = j5;
                    j4 = 1;
                    jt1VarArr = jt1VarArr3;
                }
                int i5 = (int) (jP2 - j2);
                long j9 = this.b == 0 ? jP2 : j3;
                long jMax = Math.max(this.u, jP2 - ((long) Math.min(this.e, i5)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.t;
                    objArr2.getClass();
                    if (lc5.Q(objArr2[((int) jMax) & (objArr2.length - 1)], zy2Var)) {
                        jP2 += j4;
                        jMax += j4;
                    }
                }
                u(jMax, j9, jP2, j7);
                k();
                return jt1VarArr.length == 0 ? jt1VarArr : o(jt1VarArr);
            }
        }
        return jt1VarArr3;
    }
}
