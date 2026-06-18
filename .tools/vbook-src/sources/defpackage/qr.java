package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qr {
    public final yhb a;
    public final t07 b = u07.a();
    public final zq c;
    public final zq d;

    public qr(yhb yhbVar) {
        this.a = yhbVar;
        int i = 11;
        this.c = new zq(fw4.a(new e4(i)));
        is4 is4VarA = fw4.a(new e4(i));
        tv4 tv4Var = (tv4) bt4.a(is4VarA, tv4.b);
        tv4Var.a.add(new xa(this, (jt1) null, 1));
        this.d = new zq(is4VarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:70:0x01a2, B:75:0x01f1, B:64:0x017a, B:66:0x0182, B:55:0x0148, B:60:0x0159, B:58:0x0153, B:79:0x0219), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10, types: [ks4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13, types: [ks4] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r18v0, types: [qr] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ks4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r07] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ks4] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [ks4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qr r18, defpackage.y29 r19, defpackage.xu4 r20, defpackage.ks4 r21, defpackage.kt1 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.a(qr, y29, xu4, ks4, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.or
            if (r0 == 0) goto L13
            r0 = r6
            or r0 = (defpackage.or) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            or r0 = new or
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            yhb r2 = r5.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.e11.e0(r6)     // Catch: java.lang.Exception -> L64
            goto L54
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.e11.e0(r6)
            da7 r6 = r2.d     // Catch: java.lang.Exception -> L64
            ni5[] r1 = defpackage.yhb.l     // Catch: java.lang.Exception -> L64
            r4 = 4
            r1 = r1[r4]     // Catch: java.lang.Exception -> L64
            java.lang.Object r6 = r6.c(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L64
            int r1 = r6.length()     // Catch: java.lang.Exception -> L64
            if (r1 != 0) goto L47
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L64
            return r5
        L47:
            zq r5 = r5.c     // Catch: java.lang.Exception -> L64
            r0.c = r3     // Catch: java.lang.Exception -> L64
            java.lang.Object r6 = r5.F(r6, r0)     // Catch: java.lang.Exception -> L64
            xx1 r5 = defpackage.xx1.a
            if (r6 != r5) goto L54
            return r5
        L54:
            bm8 r6 = (defpackage.bm8) r6     // Catch: java.lang.Exception -> L64
            java.lang.Object r5 = r6.b     // Catch: java.lang.Exception -> L64
            if (r5 == 0) goto L64
            vwa r5 = (defpackage.vwa) r5     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L64
            r2.b(r5)     // Catch: java.lang.Exception -> L64
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L64
            return r5
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.b(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r11 != r9) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r11) {
        /*
            r10 = this;
            yhb r0 = r10.a
            boolean r1 = r11 instanceof defpackage.pr
            if (r1 == 0) goto L16
            r1 = r11
            pr r1 = (defpackage.pr) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.c = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            pr r1 = new pr
            r1.<init>(r10, r11)
            goto L14
        L1c:
            java.lang.Object r11 = r8.a
            int r1 = r8.c
            r2 = 2
            r3 = 0
            r4 = 1
            xx1 r9 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2f
            defpackage.e11.e0(r11)     // Catch: java.lang.Exception -> La7
            goto L81
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r3
        L35:
            defpackage.e11.e0(r11)     // Catch: java.lang.Exception -> La7
            goto L59
        L39:
            defpackage.e11.e0(r11)
            com.google.firebase.auth.FirebaseAuth r11 = com.google.firebase.auth.FirebaseAuth.getInstance()     // Catch: java.lang.Exception -> La7
            r11.getClass()     // Catch: java.lang.Exception -> La7
            rz3 r11 = r11.f     // Catch: java.lang.Exception -> La7
            if (r11 == 0) goto L4d
            qz3 r1 = new qz3     // Catch: java.lang.Exception -> La7
            r1.<init>(r11)     // Catch: java.lang.Exception -> La7
            goto L4e
        L4d:
            r1 = r3
        L4e:
            if (r1 == 0) goto L61
            r8.c = r4     // Catch: java.lang.Exception -> La7
            java.lang.Object r11 = r1.a(r4, r8)     // Catch: java.lang.Exception -> La7
            if (r11 != r9) goto L59
            goto L80
        L59:
            c30 r11 = (defpackage.c30) r11     // Catch: java.lang.Exception -> La7
            if (r11 == 0) goto L61
            ye4 r11 = r11.a     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = r11.a     // Catch: java.lang.Exception -> La7
        L61:
            if (r3 == 0) goto La4
            int r11 = r3.length()     // Catch: java.lang.Exception -> La7
            if (r11 != 0) goto L6a
            goto La4
        L6a:
            zq r10 = r10.c     // Catch: java.lang.Exception -> La7
            java.lang.String r4 = defpackage.kr2.b()     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = defpackage.kr2.c()     // Catch: java.lang.Exception -> La7
            java.lang.String r7 = ""
            r8.c = r2     // Catch: java.lang.Exception -> La7
            r6 = 1
            r2 = r10
            java.lang.Object r11 = r2.E(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> La7
            if (r11 != r9) goto L81
        L80:
            return r9
        L81:
            bm8 r11 = (defpackage.bm8) r11     // Catch: java.lang.Exception -> La7
            java.lang.Object r10 = r11.b     // Catch: java.lang.Exception -> La7
            if (r10 == 0) goto La7
            xhb r10 = (defpackage.xhb) r10     // Catch: java.lang.Exception -> La7
            java.lang.String r10 = r10.b     // Catch: java.lang.Exception -> La7
            r0.b(r10)     // Catch: java.lang.Exception -> La7
            java.lang.Object r10 = r11.b     // Catch: java.lang.Exception -> La7
            xhb r10 = (defpackage.xhb) r10     // Catch: java.lang.Exception -> La7
            java.lang.String r10 = r10.c     // Catch: java.lang.Exception -> La7
            r10.getClass()     // Catch: java.lang.Exception -> La7
            da7 r11 = r0.d     // Catch: java.lang.Exception -> La7
            ni5[] r0 = defpackage.yhb.l     // Catch: java.lang.Exception -> La7
            r1 = 4
            r0 = r0[r1]     // Catch: java.lang.Exception -> La7
            r11.e(r0, r10)     // Catch: java.lang.Exception -> La7
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> La7
            return r10
        La4:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> La7
            return r10
        La7:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.c(kt1):java.lang.Object");
    }
}
