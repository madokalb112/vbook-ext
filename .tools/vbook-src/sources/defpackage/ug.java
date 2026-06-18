package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ug extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.s = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r10.f(r8, r11) == r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.b
            r1 = 2
            r2 = 1
            xx1 r3 = defpackage.xx1.a
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L18
            if (r0 != r1) goto L11
            defpackage.e11.e0(r11)
            r8 = r10
            goto L6e
        L11:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L18:
            defpackage.e11.e0(r11)
            r8 = r10
            goto L3e
        L1d:
            defpackage.e11.e0(r11)
            java.lang.Object r11 = r10.c
            r4 = r11
            ym r4 = (defpackage.ym) r4
            java.lang.Float r5 = new java.lang.Float
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r11)
            java.lang.Object r11 = r10.d
            r6 = r11
            kp9 r6 = (kp9) r6
            r10.b = r2
            r7 = 0
            r9 = 12
            r8 = r10
            java.lang.Object r11 = defpackage.ym.b(r4, r5, r6, r7, r8, r9)
            if (r11 != r3) goto L3e
            goto L6d
        L3e:
            io r11 = (io) r11
            go r10 = r11.b
            go r11 = go.b
            if (r10 != r11) goto L7f
            java.lang.Object r10 = r8.f
            zm7 r10 = (zm7) r10
            int r11 = r10.h()
            int r11 = r11 + r2
            java.lang.Object r0 = r8.e
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r11 = r11 % r0
            r10.i(r11)
            java.lang.Object r10 = r8.c
            ym r10 = (defpackage.ym) r10
            java.lang.Float r11 = new java.lang.Float
            r0 = 0
            r11.<init>(r0)
            r8.b = r1
            java.lang.Object r10 = r10.f(r8, r11)
            if (r10 != r3) goto L6e
        L6d:
            return r3
        L6e:
            java.lang.Object r10 = r8.s
            ym7 r10 = (ym7) r10
            float r11 = r10.h()
            r0 = 1119092736(0x42b40000, float:90.0)
            float r11 = r11 + r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r11 = r11 % r0
            r10.i(r11)
        L7f:
            heb r10 = defpackage.heb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        Charset charset;
        os4 os4Var = (os4) this.s;
        StringBuilder sb = (StringBuilder) this.f;
        int i = this.b;
        String strN = null;
        try {
            if (i == 0) {
                e11.e0(obj);
                try {
                    jt0 jt0Var = (jt0) this.d;
                    Charset charset2 = (Charset) this.e;
                    this.c = charset2;
                    this.b = 1;
                    obj = m79.Q(jt0Var, this);
                    xx1 xx1Var = xx1.a;
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                    charset = charset2;
                } catch (Throwable th) {
                    os4Var.c(sb.toString());
                    os4Var.a();
                    throw th;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                charset = (Charset) this.c;
                e11.e0(obj);
            }
            strN = sg9.n((jl9) obj, charset, 2);
        } catch (Throwable unused) {
        }
        if (strN == null) {
            strN = "[request body omitted]";
        }
        sb.append("BODY START");
        sb.append('\n');
        sb.append(strN);
        sb.append('\n');
        sb.append("BODY END");
        os4Var.c(sb.toString());
        os4Var.a();
        return heb.a;
    }

    private final Object p(Object obj) {
        ArrayList arrayList;
        Object value;
        boolean z;
        String str = (String) this.f;
        String str2 = (String) this.e;
        a76 a76Var = (a76) this.d;
        fr9 fr9Var = a76Var.d;
        int i = this.b;
        heb hebVar = heb.a;
        if (i == 0) {
            e11.e0(obj);
            ArrayList arrayListB1 = fc1.b1(((z66) fr9Var.getValue()).b);
            String str3 = (String) this.s;
            int size = arrayListB1.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                }
                Object obj2 = arrayListB1.get(i3);
                i3++;
                if (lc5.Q(((yha) obj2).a, str3)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                String str4 = ((yha) arrayListB1.get(i2)).a;
                str4.getClass();
                str2.getClass();
                str.getClass();
                arrayListB1.set(i2, new yha(str4, str2, str));
            } else {
                arrayListB1.add(new yha(wm9.p(), str2, str));
            }
            cia ciaVar = a76Var.c;
            this.c = arrayListB1;
            this.b = 1;
            ((eia) ciaVar).b(arrayListB1);
            xx1 xx1Var = xx1.a;
            if (hebVar == xx1Var) {
                return xx1Var;
            }
            arrayList = arrayListB1;
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.c;
            e11.e0(obj);
        }
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                z = ((z66) value).a;
                arrayList.getClass();
            } while (!fr9Var.j(value, new z66(arrayList, z)));
        }
        return hebVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        if (defpackage.rq7.B(r2, r6, r0, r7, r20) == r13) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b A[LOOP:0: B:49:0x017b->B:57:?, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        vx1 vx1Var = (vx1) this.c;
        int i = this.b;
        if (i == 0) {
            e11.e0(obj);
            b24 b24VarL = cx1.L(dk9.C(new e51((st5) this.d, 14)));
            oe0 oe0Var = new oe0((se6) this.e, (List) this.f, vx1Var, (a15) this.s, 6);
            this.c = null;
            this.b = 1;
            Object objA = b24VarL.a(oe0Var, this);
            xx1 xx1Var = xx1.a;
            if (objA == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return heb.a;
    }

    private final Object s(Object obj) {
        ArrayList arrayList;
        Object value;
        boolean z;
        String str = (String) this.f;
        String str2 = (String) this.e;
        t78 t78Var = (t78) this.d;
        fr9 fr9Var = t78Var.d;
        int i = this.b;
        heb hebVar = heb.a;
        if (i == 0) {
            e11.e0(obj);
            ArrayList arrayListB1 = fc1.b1(((s78) fr9Var.getValue()).b);
            String str3 = (String) this.s;
            int size = arrayListB1.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                }
                Object obj2 = arrayListB1.get(i3);
                i3++;
                if (lc5.Q(((o78) obj2).a, str3)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                String str4 = ((o78) arrayListB1.get(i2)).a;
                str4.getClass();
                str2.getClass();
                str.getClass();
                arrayListB1.set(i2, new o78(str4, str2, str));
            } else {
                arrayListB1.add(new o78(wm9.p(), str2, str));
            }
            y78 y78Var = t78Var.c;
            this.c = arrayListB1;
            this.b = 1;
            ((c98) y78Var).T(arrayListB1);
            xx1 xx1Var = xx1.a;
            if (hebVar == xx1Var) {
                return xx1Var;
            }
            arrayList = arrayListB1;
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.c;
            e11.e0(obj);
        }
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                z = ((s78) value).a;
                arrayList.getClass();
            } while (!fr9Var.j(value, new s78(arrayList, z)));
        }
        return hebVar;
    }

    private final Object t(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        a25 a25Var = (a25) this.c;
        hi2 hi2Var = new hi2(a25Var, ((ne8) this.d).c.a, 0, a25Var, (eg9) this.e, (yg3) this.f, ((jy4) this.s) != null);
        this.b = 1;
        Object objD = hi2Var.d(this);
        xx1 xx1Var = xx1.a;
        return objD == xx1Var ? xx1Var : objD;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.e
            r1 = r0
            px5 r1 = (px5) r1
            int r0 = r13.b
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 1
            if (r0 == 0) goto L26
            if (r0 != r4) goto L20
            java.lang.Object r0 = r13.d
            r4 = r0
            rg8 r4 = (defpackage.rg8) r4
            java.lang.Object r13 = r13.c
            rg8 r13 = (defpackage.rg8) r13
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> L1c
            goto L78
        L1c:
            r0 = move-exception
            r14 = r0
            goto L90
        L20:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r2
        L26:
            defpackage.e11.e0(r14)
            cx5 r14 = r1.h
            cx5 r0 = cx5.a
            if (r14 != r0) goto L30
            goto L8a
        L30:
            rg8 r7 = new rg8
            r7.<init>()
            rg8 r14 = new rg8
            r14.<init>()
            java.lang.Object r0 = r13.f     // Catch: java.lang.Throwable -> L8b
            r8 = r0
            vx1 r8 = (defpackage.vx1) r8     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r13.s     // Catch: java.lang.Throwable -> L8b
            r12 = r0
            yb4 r12 = (defpackage.yb4) r12     // Catch: java.lang.Throwable -> L8b
            r13.c = r7     // Catch: java.lang.Throwable -> L8b
            r13.d = r14     // Catch: java.lang.Throwable -> L8b
            r13.b = r4     // Catch: java.lang.Throwable -> L8b
            ay0 r10 = new ay0     // Catch: java.lang.Throwable -> L8b
            jt1 r13 = bx1.J(r13)     // Catch: java.lang.Throwable -> L8b
            r10.<init>(r4, r13)     // Catch: java.lang.Throwable -> L8b
            r10.u()     // Catch: java.lang.Throwable -> L8b
            zw5 r13 = bx5.Companion     // Catch: java.lang.Throwable -> L8b
            r13.getClass()     // Catch: java.lang.Throwable -> L8b
            bx5 r6 = bx5.ON_START     // Catch: java.lang.Throwable -> L8b
            bx5 r9 = bx5.ON_STOP     // Catch: java.lang.Throwable -> L8b
            t07 r11 = defpackage.u07.a()     // Catch: java.lang.Throwable -> L8b
            tj8 r5 = new tj8     // Catch: java.lang.Throwable -> L8b
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8b
            r14.a = r5     // Catch: java.lang.Throwable -> L8b
            r1.a(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r13 = r10.s()     // Catch: java.lang.Throwable -> L8b
            xx1 r0 = defpackage.xx1.a
            if (r13 != r0) goto L76
            return r0
        L76:
            r4 = r14
            r13 = r7
        L78:
            java.lang.Object r13 = r13.a
            yd5 r13 = (defpackage.yd5) r13
            if (r13 == 0) goto L81
            r13.cancel(r2)
        L81:
            java.lang.Object r13 = r4.a
            jx5 r13 = (jx5) r13
            if (r13 == 0) goto L8a
            r1.f(r13)
        L8a:
            return r3
        L8b:
            r0 = move-exception
            r13 = r0
            r4 = r14
            r14 = r13
            r13 = r7
        L90:
            java.lang.Object r13 = r13.a
            yd5 r13 = (defpackage.yd5) r13
            if (r13 == 0) goto L99
            r13.cancel(r2)
        L99:
            java.lang.Object r13 = r4.a
            jx5 r13 = (jx5) r13
            if (r13 == 0) goto La2
            r1.f(r13)
        La2:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        if (iz8.K(r3, r24) != r6) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.w(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        qe9 qe9Var = (qe9) this.d;
        pp1 pp1Var = qe9Var.e;
        fr9 fr9Var = qe9Var.d;
        int i = this.b;
        try {
            if (i == 0) {
                e11.e0(obj);
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.s;
                if (fr9Var != null) {
                    do {
                        value2 = fr9Var.getValue();
                        ((pe9) value2).getClass();
                    } while (!fr9Var.j(value2, new pe9(true)));
                }
                aib aibVar = qe9Var.c;
                this.c = null;
                this.b = 1;
                obj = ((hib) aibVar).e(str, str2, str3, this);
                xx1 xx1Var = xx1.a;
                if (obj == xx1Var) {
                    return xx1Var;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
            }
            pm8Var = (ihb) obj;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (!(pm8Var instanceof pm8)) {
            qe9Var.i(pp1Var, new ke9(((ihb) pm8Var).b));
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA != null) {
            if (fr9Var != null) {
                do {
                    value = fr9Var.getValue();
                    ((pe9) value).getClass();
                } while (!fr9Var.j(value, new pe9(false)));
            }
            qe9Var.i(pp1Var, new je9(thA));
        }
        return heb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0070, B:27:0x008b], limit reached: 41 */
    /* JADX WARN: Path cross not found for [B:27:0x008b, B:22:0x0070], limit reached: 41 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: all -> 0x0026, PHI: r1 r4 r7 r8
  0x0081: PHI (r1v3 java.lang.Object) = (r1v2 java.lang.Object), (r1v7 java.lang.Object) binds: [B:23:0x007e, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r4v7 ??) = (r4v12 ??), (r4v13 ??) binds: [B:23:0x007e, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r7v4 ??) = (r7v9 ??), (r7v10 ??) binds: [B:23:0x007e, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r8v3 c24) = (r8v2 c24), (r8v7 c24) binds: [B:23:0x007e, B:15:0x003d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0081, B:22:0x0070, B:27:0x008b, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0081, B:22:0x0070, B:27:0x008b, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [w29] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [h11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [pq7] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, pq7] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, pq7] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:22:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:22:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.s
            ib4 r0 = (defpackage.ib4) r0
            int r1 = r10.b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L41
            if (r1 == r4) goto L14
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
        L14:
            java.lang.Object r1 = r10.c
            java.lang.Object r4 = r10.e
            h11 r4 = (defpackage.h11) r4
            java.lang.Object r7 = r10.d
            pq7 r7 = (defpackage.pq7) r7
            java.lang.Object r8 = r10.f
            c24 r8 = (defpackage.c24) r8
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L26
            goto L70
        L26:
            r10 = move-exception
            goto La0
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r5
        L2f:
            java.lang.Object r1 = r10.c
            java.lang.Object r4 = r10.e
            h11 r4 = (defpackage.h11) r4
            java.lang.Object r7 = r10.d
            pq7 r7 = (defpackage.pq7) r7
            java.lang.Object r8 = r10.f
            c24 r8 = (defpackage.c24) r8
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L26
            goto L81
        L41:
            defpackage.e11.e0(r11)
            java.lang.Object r11 = r10.f
            r8 = r11
            c24 r8 = (defpackage.c24) r8
            pq7 r7 = new pq7
            r7.<init>()
            xf9 r11 = new xf9
            r11.<init>()
            r7.a = r11
            r11 = 6
            ir0 r11 = defpackage.vm7.c(r4, r11, r5)
            java.lang.Object r1 = r7.B(r11, r0)     // Catch: java.lang.Throwable -> L9e
            r10.f = r8     // Catch: java.lang.Throwable -> L9e
            r10.d = r7     // Catch: java.lang.Throwable -> L9e
            r10.e = r11     // Catch: java.lang.Throwable -> L9e
            r10.c = r1     // Catch: java.lang.Throwable -> L9e
            r10.b = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r4 = r8.b(r1, r10)     // Catch: java.lang.Throwable -> L9e
            if (r4 != r6) goto L6f
            goto L9b
        L6f:
            r4 = r11
        L70:
            r10.f = r8     // Catch: java.lang.Throwable -> L26
            r10.d = r7     // Catch: java.lang.Throwable -> L26
            r10.e = r4     // Catch: java.lang.Throwable -> L26
            r10.c = r1     // Catch: java.lang.Throwable -> L26
            r10.b = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r4.j(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r6) goto L81
            goto L9b
        L81:
            java.lang.Object r11 = r7.B(r4, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = defpackage.lc5.Q(r11, r1)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L70
            r10.f = r8     // Catch: java.lang.Throwable -> L26
            r10.d = r7     // Catch: java.lang.Throwable -> L26
            r10.e = r4     // Catch: java.lang.Throwable -> L26
            r10.c = r11     // Catch: java.lang.Throwable -> L26
            r10.b = r2     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r8.b(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r1 != r6) goto L9c
        L9b:
            return r6
        L9c:
            r1 = r11
            goto L70
        L9e:
            r10 = move-exception
            r4 = r11
        La0:
            java.lang.Object r11 = r7.a
            yf1 r11 = (yf1) r11
            if (r11 == 0) goto Lac
            r11.l(r4)
            r11.m()
        Lac:
            java.lang.Object r11 = r7.a
            yf1 r11 = (yf1) r11
            if (r11 == 0) goto Lb3
            goto Lb8
        Lb3:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            d08.b(r0)
        Lb8:
            r11.n()
            r7.a = r5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.y(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                ug ugVar = new ug((th) this.d, (kb4) this.e, (wg) this.f, (gv5) obj2, jt1Var, 0);
                ugVar.c = obj;
                return ugVar;
            case 1:
                return new ug((yy6) this.c, (pn2) this.d, (fo8) this.e, (rj7) this.f, (zm5) obj2, jt1Var, 1);
            case 2:
                ug ugVar2 = new ug((List) this.d, (zl0) this.e, (mc) this.f, (mc) obj2, jt1Var, 2);
                ugVar2.c = obj;
                return ugVar2;
            case 3:
                ug ugVar3 = new ug((ut0) this.e, (jt0) this.f, (jt0) obj2, jt1Var, 3);
                ugVar3.c = obj;
                return ugVar3;
            case 4:
                ug ugVar4 = new ug((vl2) this.f, (jt0) obj2, jt1Var, 4);
                ugVar4.c = obj;
                return ugVar4;
            case 5:
                ug ugVar5 = new ug((yb4) this.f, (jt0) obj2, jt1Var, 5);
                ugVar5.c = obj;
                return ugVar5;
            case 6:
                ug ugVar6 = new ug((q01) obj2, jt1Var, 6);
                ugVar6.f = obj;
                return ugVar6;
            case 7:
                return new ug((Context) this.c, (tx) this.d, (ac1) this.e, (ox) this.f, (a07) obj2, jt1Var, 7);
            case 8:
                return new ug((qv5) this.c, (a07) this.d, (fha) this.e, (kga) this.f, (l45) obj2, jt1Var, 8);
            case 9:
                return new ug((ko0) this.c, (wga) this.d, (qv5) this.e, (rha) this.f, (ob7) obj2, jt1Var, 9);
            case 10:
                ug ugVar7 = new ug((t02) this.d, (String) this.e, (s02) this.f, (bi5) obj2, jt1Var, 10);
                ugVar7.c = obj;
                return ugVar7;
            case 11:
                ug ugVar8 = new ug((g95) this.d, (String) this.e, (wl4) this.f, (wl4) obj2, jt1Var, 11);
                ugVar8.c = obj;
                return ugVar8;
            case 12:
                ug ugVar9 = new ug((i95) this.d, (String) this.e, (wl4) this.f, (wl4) obj2, jt1Var, 12);
                ugVar9.c = obj;
                return ugVar9;
            case 13:
                ug ugVar10 = new ug((List) this.e, (String) this.f, (Object[]) obj2, jt1Var, 13);
                ugVar10.c = obj;
                return ugVar10;
            case 14:
                ug ugVar11 = new ug((zk5) this.d, this.e, (oi5) this.f, (Charset) obj2, jt1Var, 14);
                ugVar11.c = obj;
                return ugVar11;
            case 15:
                return new ug((pz5) obj2, jt1Var, 15);
            case 16:
                return new ug((ym) this.c, (kp9) this.d, (List) this.e, (zm7) this.f, (ym7) obj2, jt1Var, 16);
            case 17:
                return new ug((jt0) this.d, (Charset) this.e, (StringBuilder) this.f, (os4) obj2, jt1Var, 17);
            case 18:
                return new ug((a76) this.d, (String) this.e, (String) this.f, (String) obj2, jt1Var, 18);
            case 19:
                return new ug((sw8) this.c, (nca) this.d, (a07) this.e, (a07) this.f, (a07) obj2, jt1Var, 19);
            case 20:
                ug ugVar12 = new ug((rq7) obj2, jt1Var, 20);
                ugVar12.f = obj;
                return ugVar12;
            case 21:
                ug ugVar13 = new ug((st5) this.d, (se6) this.e, (List) this.f, (a15) obj2, jt1Var, 21);
                ugVar13.c = obj;
                return ugVar13;
            case 22:
                return new ug((t78) this.d, (String) this.e, (String) this.f, (String) obj2, jt1Var, 22);
            case 23:
                return new ug((a25) this.c, (ne8) this.d, (eg9) this.e, (yg3) this.f, (jy4) obj2, jt1Var, 23);
            case 24:
                ug ugVar14 = new ug((ff8) this.e, (ef8) this.f, (wu6) obj2, jt1Var, 24);
                ugVar14.c = obj;
                return ugVar14;
            case 25:
                return new ug((px5) this.e, (vx1) this.f, (yb4) obj2, jt1Var, 25);
            case 26:
                return new ug((iz8) this.f, this.c, (p3b) obj2, jt1Var);
            case 27:
                ug ugVar15 = new ug((qe9) this.d, (String) this.e, (String) this.f, (String) obj2, jt1Var, 27);
                ugVar15.c = obj;
                return ugVar15;
            case 28:
                ug ugVar16 = new ug((ib4) obj2, jt1Var, 28);
                ugVar16.f = obj;
                return ugVar16;
            default:
                return new ug((ym7) this.e, (hk9) this.f, (ym7) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((ug) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                ((ug) create((c24) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((ug) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x054e, code lost:
    
        if (defpackage.q01.B(r6, r3, r0, r8, r30) == r9) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06b6, code lost:
    
        if (r6.g(r30) != r9) goto L469;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05a5 A[LOOP:4: B:251:0x05a5->B:487:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0647 A[Catch: all -> 0x0605, TRY_LEAVE, TryCatch #2 {all -> 0x0605, blocks: (B:269:0x0601, B:277:0x0636, B:279:0x0647, B:274:0x0617), top: B:443:0x05cd }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0663 A[Catch: all -> 0x06b9, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x06b9, blocks: (B:264:0x05ee, B:290:0x0688, B:283:0x0663), top: B:443:0x05cd }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07be A[Catch: all -> 0x0797, TRY_LEAVE, TryCatch #12 {all -> 0x0797, blocks: (B:345:0x0790, B:355:0x07b8, B:357:0x07be, B:351:0x07a6), top: B:461:0x0786 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07d4 A[Catch: all -> 0x0820, TRY_LEAVE, TryCatch #0 {all -> 0x0820, blocks: (B:360:0x07cc, B:362:0x07d4), top: B:439:0x07cc }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:534:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r0v24, types: [qs0, wi2] */
    /* JADX WARN: Type inference failed for: r0v31, types: [qs0, wi2] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r14v2, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r1v14, types: [qs0, wi2] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v34, types: [pe5, yd5] */
    /* JADX WARN: Type inference failed for: r3v36, types: [ae5, pe5] */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:369:0x0813 -> B:370:0x0814). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:377:0x0824 -> B:355:0x07b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0199 -> B:81:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x019c -> B:81:0x01a2). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(iz8 iz8Var, Object obj, p3b p3bVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 26;
        this.f = iz8Var;
        this.c = obj;
        this.s = p3bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.s = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.f = obj2;
        this.s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(Object obj, Object obj2, Object obj3, Object obj4, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.s = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug(yb4 yb4Var, jt0 jt0Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = yb4Var;
        this.s = jt0Var;
    }
}
