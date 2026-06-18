package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hib implements aib {
    public final qr a;
    public final yhb b;
    public final iw0 c;
    public final fr9 d;
    public final String e;

    public hib(qr qrVar, yhb yhbVar) {
        this.a = qrVar;
        this.b = yhbVar;
        aj2 aj2Var = rw2.a;
        iw0 iw0VarB = wx1.b(nh2.c);
        this.c = iw0VarB;
        this.d = gr9.a(null);
        ah1.J(iw0VarB, null, null, new dd9(this, (jt1) null, 23), 3);
        this.e = "purchased";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.hib r4, defpackage.qz3 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gib
            if (r0 == 0) goto L13
            r0 = r6
            gib r0 = (defpackage.gib) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gib r0 = new gib
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            hib r4 = r0.a
            defpackage.e11.e0(r6)     // Catch: java.lang.Throwable -> L6c
            goto L3f
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.e11.e0(r6)
            r0.a = r4     // Catch: java.lang.Throwable -> L6c
            r0.d = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r6 = r5.a(r3, r0)     // Catch: java.lang.Throwable -> L6c
            xx1 r5 = defpackage.xx1.a
            if (r6 != r5) goto L3f
            return r5
        L3f:
            c30 r6 = (defpackage.c30) r6     // Catch: java.lang.Throwable -> L6c
            ye4 r5 = r6.a     // Catch: java.lang.Throwable -> L6c
            java.util.Map r5 = r5.b     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = r4.e     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r5 = defpackage.bw9.A0(r5)     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L59
            boolean r3 = r5.booleanValue()     // Catch: java.lang.Throwable -> L6c
        L59:
            yhb r4 = r4.b     // Catch: java.lang.Throwable -> L6c
            km0 r4 = r4.g     // Catch: java.lang.Throwable -> L6c
            ni5[] r5 = defpackage.yhb.l     // Catch: java.lang.Throwable -> L6c
            r6 = 7
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6c
            r4.e(r5, r6)     // Catch: java.lang.Throwable -> L6c
            heb r4 = defpackage.heb.a     // Catch: java.lang.Throwable -> L6c
            return r4
        L6c:
            r4 = move-exception
            pm8 r5 = new pm8
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hib.a(hib, qz3, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(int r5, int r6, defpackage.kt1 r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cib
            if (r0 == 0) goto L13
            r0 = r7
            cib r0 = (defpackage.cib) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cib r0 = new cib
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.e11.e0(r7)
            goto L3e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2c:
            defpackage.e11.e0(r7)
            qr r4 = r4.a
            zq r4 = r4.d
            r0.c = r3
            java.lang.Object r7 = r4.j(r5, r6, r0, r8)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L3e
            return r4
        L3e:
            bm8 r7 = (defpackage.bm8) r7
            java.lang.Object r4 = r7.b
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L69
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r4.next()
            hhb r5 = (defpackage.hhb) r5
            sgb r5 = defpackage.oh9.m(r5)
            r2.add(r5)
            goto L55
        L69:
            if (r2 != 0) goto L6e
            lc3 r4 = defpackage.lc3.a
            return r4
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hib.b(int, int, kt1, java.lang.String):java.io.Serializable");
    }

    public final Object c(String str, hl2 hl2Var) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.getClass();
        ex1.z(str);
        v4 v4Var = new v4(new fu6(14));
        v4Var.u = 1;
        Task taskV = new jjc(firebaseAuth, str, v4Var, 2).v(firebaseAuth, firebaseAuth.i, firebaseAuth.k);
        taskV.getClass();
        Object objE = xg9.e(taskV, hl2Var);
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        if (objE != xx1Var) {
            objE = hebVar;
        }
        return objE == xx1Var ? objE : hebVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r12, java.lang.String r13, defpackage.kt1 r14) throws defpackage.d30, e20, defpackage.e30, defpackage.y20 {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hib.d(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0153 A[PHI: r0
  0x0153: PHI (r0v24 java.lang.Object) = (r0v23 java.lang.Object), (r0v1 java.lang.Object) binds: [B:95:0x0150, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    /* JADX WARN: Type inference failed for: r15v2, types: [ly3, sec] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.kt1 r20) throws defpackage.d30, e20, defpackage.e30, defpackage.y20 {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hib.e(java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final void f(mhb mhbVar) {
        String strB;
        yhb yhbVar = this.b;
        String str = mhbVar.a;
        str.getClass();
        da7 da7Var = yhbVar.a;
        ni5[] ni5VarArr = yhb.l;
        da7Var.e(ni5VarArr[0], str);
        yhb yhbVar2 = this.b;
        String str2 = mhbVar.c;
        str2.getClass();
        yhbVar2.b.e(ni5VarArr[1], str2);
        yhb yhbVar3 = this.b;
        String str3 = mhbVar.d;
        str3.getClass();
        yhbVar3.e.e(ni5VarArr[5], str3);
        yhb yhbVar4 = this.b;
        String str4 = mhbVar.b;
        str4.getClass();
        yhbVar4.f.e(ni5VarArr[6], str4);
        List listY = mhbVar.i;
        if (listY.isEmpty()) {
            listY = mhbVar.h.length() > 0 ? gc1.Y(mhbVar.h) : lc3.a;
        }
        List list = listY;
        yhb yhbVar5 = this.b;
        try {
            uf5 uf5Var = xf5.a;
            uf5Var.getClass();
            strB = uf5Var.b(new wv(tv9.a, 0), list);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (pu.a()) {
                e46 e46Var = e46.b;
                k89 k89Var = k89.c;
                if (e46Var.a.a.compareTo(k89Var) <= 0) {
                    e46Var.a(k89Var, "Log", message, (Throwable) null);
                }
            }
            strB = null;
        }
        String str5 = strB != null ? strB : "";
        da7 da7Var2 = yhbVar5.k;
        ni5[] ni5VarArr2 = yhb.l;
        da7Var2.e(ni5VarArr2[11], str5);
        fr9 fr9Var = this.d;
        yhb yhbVar6 = this.b;
        ihb ihbVar = new ihb((String) yhbVar6.a.c(ni5VarArr2[0], yhbVar6), mhbVar.b, mhbVar.c, mhbVar.d, mhbVar.e, mhbVar.f, true, list);
        fr9Var.getClass();
        fr9Var.l(null, ihbVar);
    }

    public final void g(xhb xhbVar) {
        this.b.b(xhbVar.b);
        yhb yhbVar = this.b;
        String str = xhbVar.c;
        str.getClass();
        yhbVar.d.e(yhb.l[4], str);
        String str2 = xhbVar.a.a;
        str2.getClass();
        try {
            if (s32.a == null) {
                synchronized (s32.b) {
                    if (s32.a == null) {
                        gy3 gy3VarC = gy3.c();
                        gy3VarC.a();
                        s32.a = FirebaseAnalytics.getInstance(gy3VarC.a);
                    }
                }
            }
            FirebaseAnalytics firebaseAnalytics = s32.a;
            firebaseAnalytics.getClass();
            firebaseAnalytics.a.zzo(str2);
        } catch (Throwable unused) {
        }
        f(xhbVar.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r0 == r11) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[PHI: r0
  0x0088: PHI (r0v9 java.lang.Object) = (r0v4 java.lang.Object), (r0v1 java.lang.Object) binds: [B:29:0x0085, B:18:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r13, java.lang.String r14, byte[] r15, java.lang.String r16, defpackage.kt1 r17) throws e20 {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.fib
            if (r1 == 0) goto L16
            r1 = r0
            fib r1 = (defpackage.fib) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            fib r1 = new fib
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.d
            int r1 = r7.f
            qr r2 = r12.a
            r8 = 3
            r9 = 2
            r3 = 1
            r10 = 0
            xx1 r11 = defpackage.xx1.a
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3e
            if (r1 == r9) goto L3a
            if (r1 != r8) goto L34
            defpackage.e11.e0(r0)
            return r0
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            return r10
        L3a:
            defpackage.e11.e0(r0)
            goto L88
        L3e:
            java.lang.String r13 = r7.c
            java.lang.String r14 = r7.b
            java.lang.String r1 = r7.a
            defpackage.e11.e0(r0)
            r4 = r13
            r13 = r1
            goto L68
        L4a:
            defpackage.e11.e0(r0)
            if (r15 == 0) goto L73
            zq r0 = r2.d
            java.lang.String r1 = defpackage.cx1.M(r15)
            r7.a = r13
            r7.b = r14
            r4 = r16
            r7.c = r4
            r7.f = r3
            java.lang.String r3 = "avatar.png"
            java.lang.Object r0 = r0.K(r3, r1, r7)
            if (r0 != r11) goto L68
            goto Lad
        L68:
            bm8 r0 = (defpackage.bm8) r0
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
        L6f:
            r3 = r13
            r5 = r4
            r4 = r14
            goto L77
        L73:
            r4 = r16
            r6 = r10
            goto L6f
        L77:
            zq r2 = r2.d
            r7.a = r10
            r7.b = r10
            r7.c = r10
            r7.f = r9
            java.lang.Object r0 = r2.H(r3, r4, r5, r6, r7)
            if (r0 != r11) goto L88
            goto Lad
        L88:
            bm8 r0 = (defpackage.bm8) r0
            java.lang.Object r13 = r0.b
            mhb r13 = (defpackage.mhb) r13
            if (r13 == 0) goto Laf
            r12.f(r13)
            fe8 r13 = new fe8
            fr9 r12 = r12.d
            r13.<init>(r12)
            u31 r12 = new u31
            r12.<init>(r13, r9)
            r7.a = r10
            r7.b = r10
            r7.c = r10
            r7.f = r8
            java.lang.Object r12 = defpackage.cx1.N(r12, r7)
            if (r12 != r11) goto Lae
        Lad:
            return r11
        Lae:
            return r12
        Laf:
            e20 r12 = new e20
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hib.h(java.lang.String, java.lang.String, byte[], java.lang.String, kt1):java.lang.Object");
    }
}
