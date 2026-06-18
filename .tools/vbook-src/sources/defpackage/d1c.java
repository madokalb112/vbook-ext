package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d1c implements t0c {
    public final m62 a;

    public d1c(m62 m62Var) {
        this.a = m62Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r14 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r13, defpackage.kt1 r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.v0c
            if (r0 == 0) goto L13
            r0 = r14
            v0c r0 = (defpackage.v0c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            v0c r0 = new v0c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L36
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2b
            defpackage.e11.e0(r14)
            goto L9d
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            r12 = 0
            return r12
        L32:
            defpackage.e11.e0(r14)
            goto L46
        L36:
            defpackage.e11.e0(r14)
            y0c r12 = r12.d(r13, r2)
            r0.c = r4
            java.lang.Object r14 = defpackage.cx1.N(r12, r0)
            if (r14 != r5) goto L46
            goto L9c
        L46:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.gc1.M(r14, r13)
            r12.<init>(r13)
            java.util.Iterator r13 = r14.iterator()
        L57:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L72
            java.lang.Object r14 = r13.next()
            p17 r14 = (defpackage.p17) r14
            s17 r1 = new s17
            java.lang.String r6 = r14.c
            java.lang.String r7 = r14.d
            boolean r14 = r14.e
            r1.<init>(r6, r7, r14)
            r12.add(r1)
            goto L57
        L72:
            long r13 = defpackage.zk4.j()
            java.lang.String r1 = "yyyyMMdd_HHmmss"
            java.lang.String r13 = defpackage.zk4.i(r13, r1)
            java.lang.String r14 = "NameWords_"
            java.lang.String r7 = r14.concat(r13)
            mz2 r9 = new mz2
            r10 = 0
            r9.<init>(r12, r10, r3)
            r0.c = r3
            aj2 r12 = defpackage.rw2.a
            fj4 r12 = defpackage.r76.a
            xw3 r6 = new xw3
            r11 = 0
            java.lang.String r8 = "json"
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r14 = defpackage.ah1.b0(r12, r6, r0)
            if (r14 != r5) goto L9d
        L9c:
            return r5
        L9d:
            if (r14 == 0) goto La0
            r2 = r4
        La0:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.b(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r12 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.w0c
            if (r0 == 0) goto L13
            r0 = r12
            w0c r0 = (defpackage.w0c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w0c r0 = new w0c
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.e11.e0(r12)
            goto L9b
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            r11 = 0
            return r11
        L31:
            defpackage.e11.e0(r12)
            goto L45
        L35:
            defpackage.e11.e0(r12)
            y0c r11 = r11.e()
            r0.c = r3
            java.lang.Object r12 = defpackage.cx1.N(r11, r0)
            if (r12 != r4) goto L45
            goto L9a
        L45:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.gc1.M(r12, r1)
            r11.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L56:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r12.next()
            i6b r1 = (defpackage.i6b) r1
            l6b r5 = new l6b
            java.lang.String r6 = r1.c
            boolean r1 = r1.d
            r5.<init>(r6, r1)
            r11.add(r5)
            goto L56
        L6f:
            long r5 = defpackage.zk4.j()
            java.lang.String r12 = "yyyyMMdd_HHmmss"
            java.lang.String r12 = defpackage.zk4.i(r5, r12)
            java.lang.String r1 = "TrashWords_"
            java.lang.String r6 = r1.concat(r12)
            mz2 r8 = new mz2
            r12 = 3
            r9 = 0
            r8.<init>(r11, r9, r12)
            r0.c = r2
            aj2 r11 = defpackage.rw2.a
            fj4 r11 = defpackage.r76.a
            xw3 r5 = new xw3
            r10 = 0
            java.lang.String r7 = "json"
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = defpackage.ah1.b0(r11, r5, r0)
            if (r12 != r4) goto L9b
        L9a:
            return r4
        L9b:
            if (r12 == 0) goto L9e
            goto L9f
        L9e:
            r3 = 0
        L9f:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.c(kt1):java.lang.Object");
    }

    public final y0c d(String str, boolean z) {
        ra8 ra8VarQ;
        str.getClass();
        m62 m62Var = this.a;
        if (z) {
            n92 n92Var = m62Var.A;
            n92Var.getClass();
            tb2 tb2Var = tb2.a;
            ra8VarQ = new qb2(n92Var, str, new pb2(2), (byte) 0);
        } else {
            ra8VarQ = m62Var.A.Q(str);
        }
        pp1 pp1VarR = qx1.R(ra8VarQ);
        aj2 aj2Var = rw2.a;
        return new y0c(qx1.E(pp1VarR, nh2.c), 1);
    }

    public final y0c e() {
        b92 b92Var = this.a.K;
        b92Var.getClass();
        hd2 hd2Var = hd2.a;
        qj qjVar = (qj) ((yf1) b92Var).a;
        bd2 bd2Var = new bd2(b92Var, 1);
        qjVar.getClass();
        pp1 pp1VarR = qx1.R(new af9(-2129834739, new String[]{"DbTrash"}, qjVar, "DbTrash.sq", "getTextWords", "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nWHERE type = 0\nORDER BY createAt ASC", bd2Var));
        aj2 aj2Var = rw2.a;
        return new y0c(qx1.E(pp1VarR, nh2.c), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r12, defpackage.bi5 r13, defpackage.lm8 r14, defpackage.kt1 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.b1c
            if (r0 == 0) goto L13
            r0 = r15
            b1c r0 = (defpackage.b1c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            b1c r0 = new b1c
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.c
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            lm8 r14 = r0.b
            java.lang.String r12 = r0.a
            defpackage.e11.e0(r15)
        L2b:
            r8 = r12
            r6 = r14
            goto L44
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            return r4
        L34:
            defpackage.e11.e0(r15)
            r0.a = r12
            r0.b = r14
            r0.e = r3
            java.lang.Object r15 = r13.a(r0)
            if (r15 != r1) goto L2b
            return r1
        L44:
            byte[] r15 = (byte[]) r15
            java.lang.String r12 = defpackage.iw9.z(r15)
            uf5 r13 = defpackage.xf5.a     // Catch: java.lang.Exception -> L66
            r13.getClass()     // Catch: java.lang.Exception -> L66
            wv r14 = new wv     // Catch: java.lang.Exception -> L66
            r17 r15 = defpackage.s17.Companion     // Catch: java.lang.Exception -> L66
            oi5 r15 = r15.serializer()     // Catch: java.lang.Exception -> L66
            r0 = 0
            r14.<init>(r15, r0)     // Catch: java.lang.Exception -> L66
            oi5 r14 = defpackage.s32.J0(r14)     // Catch: java.lang.Exception -> L66
            oi5 r14 = (defpackage.oi5) r14     // Catch: java.lang.Exception -> L66
            java.lang.Object r4 = r13.a(r14, r12)     // Catch: java.lang.Exception -> L66
            goto L89
        L66:
            r0 = move-exception
            r12 = r0
            java.lang.String r12 = r12.getMessage()
            if (r12 != 0) goto L70
            java.lang.String r12 = ""
        L70:
            boolean r13 = defpackage.pu.a()
            if (r13 == 0) goto L89
            e46 r13 = e46.b
            k89 r14 = k89.c
            bh5 r15 = r13.a
            k89 r15 = r15.a
            int r15 = r15.compareTo(r14)
            if (r15 > 0) goto L89
            java.lang.String r15 = "Log"
            r13.a(r14, r15, r12, r4)
        L89:
            r9 = r4
            java.util.List r9 = (java.util.List) r9
            m62 r12 = r11.a
            b92 r12 = r12.K
            y0b r5 = new y0b
            r10 = 2
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            ym9.l(r12, r5)
            heb r11 = defpackage.heb.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.f(java.lang.String, bi5, lm8, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.bi5 r6, defpackage.lm8 r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.c1c
            if (r0 == 0) goto L13
            r0 = r8
            c1c r0 = (defpackage.c1c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            c1c r0 = new c1c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            lm8 r7 = r0.a
            defpackage.e11.e0(r8)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r4
        L30:
            defpackage.e11.e0(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            byte[] r8 = (byte[]) r8
            java.lang.String r6 = defpackage.iw9.z(r8)
            uf5 r8 = defpackage.xf5.a     // Catch: java.lang.Exception -> L60
            r8.getClass()     // Catch: java.lang.Exception -> L60
            wv r0 = new wv     // Catch: java.lang.Exception -> L60
            k6b r1 = defpackage.l6b.Companion     // Catch: java.lang.Exception -> L60
            oi5 r1 = r1.serializer()     // Catch: java.lang.Exception -> L60
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L60
            oi5 r0 = defpackage.s32.J0(r0)     // Catch: java.lang.Exception -> L60
            oi5 r0 = (defpackage.oi5) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = r8.a(r0, r6)     // Catch: java.lang.Exception -> L60
            goto L82
        L60:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L69
            java.lang.String r6 = ""
        L69:
            boolean r8 = defpackage.pu.a()
            if (r8 == 0) goto L82
            e46 r8 = e46.b
            k89 r0 = k89.c
            bh5 r1 = r8.a
            k89 r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L82
            java.lang.String r1 = "Log"
            r8.a(r0, r1, r6, r4)
        L82:
            java.util.List r4 = (java.util.List) r4
            m62 r6 = r5.a
            b92 r6 = r6.K
            cba r8 = new cba
            r0 = 13
            r8.<init>(r0, r7, r5, r4)
            ym9.l(r6, r8)
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.g(bi5, lm8, kt1):java.lang.Object");
    }
}
