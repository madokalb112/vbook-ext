package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kp2 implements dp2 {
    public final m62 a;
    public final is4 b;
    public final sv8 c;
    public final rd8 d;
    public final iw0 e;

    public kp2(m62 m62Var, is4 is4Var, sv8 sv8Var, rd8 rd8Var) {
        this.a = m62Var;
        this.b = is4Var;
        this.c = sv8Var;
        this.d = rd8Var;
        aj2 aj2Var = rw2.a;
        this.e = wx1.b(nh2.c);
    }

    public final wa2 a(String str) {
        return (wa2) this.a.x.T(str).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r8, java.lang.String r9, defpackage.kt1 r10) throws defpackage.ap3 {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.fp2
            if (r0 == 0) goto L13
            r0 = r10
            fp2 r0 = (defpackage.fp2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fp2 r0 = new fp2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r10)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.e11.e0(r10)
            wa2 r8 = r7.a(r8)
            if (r8 == 0) goto L7a
            lm9 r10 = new lm9
            sv8 r7 = r7.c
            r10.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r10 = r10.b(r9, r0)
            xx1 r7 = defpackage.xx1.a
            if (r10 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r10, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()
            ll9 r9 = (defpackage.ll9) r9
            d21 r0 = new d21
            java.lang.String r1 = r9.a
            java.lang.String r2 = r9.b
            int r3 = r9.c
            java.lang.String r4 = r9.d
            boolean r5 = r9.e
            boolean r6 = r9.f
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.add(r0)
            goto L58
        L79:
            return r7
        L7a:
            ap3 r7 = new ap3
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.b(java.lang.String, java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, java.lang.String[] r8, defpackage.kt1 r9) throws defpackage.ap3 {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.gp2
            if (r0 == 0) goto L13
            r0 = r9
            gp2 r0 = (defpackage.gp2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gp2 r0 = new gp2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r9)
            goto L7e
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.e11.e0(r9)
            wa2 r7 = r6.a(r7)
            if (r7 == 0) goto Lb8
            lm9 r9 = new lm9
            sv8 r6 = r6.c
            r9.<init>(r7, r6)
            uf5 r6 = defpackage.xf5.a
            r7 = 0
            r7 = r8[r7]
            mf5 r6 = r6.c(r7)
            fg5 r6 = defpackage.nf5.f(r6)
            java.lang.Object r7 = defpackage.fw.p0(r2, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            java.lang.String r8 = "script"
            java.lang.Object r8 = defpackage.y86.G(r8, r6)
            mf5 r8 = (defpackage.mf5) r8
            jg5 r8 = defpackage.nf5.g(r8)
            java.lang.String r8 = r8.a()
            java.lang.String r1 = "input"
            java.lang.Object r6 = defpackage.y86.G(r1, r6)
            mf5 r6 = (defpackage.mf5) r6
            jg5 r6 = defpackage.nf5.g(r6)
            java.lang.String r6 = r6.a()
            r0.c = r2
            java.lang.Object r9 = r9.c(r8, r6, r7, r0)
            xx1 r6 = defpackage.xx1.a
            if (r9 != r6) goto L7e
            return r6
        L7e:
            dn9 r9 = (defpackage.dn9) r9
            java.util.List r6 = r9.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r6.next()
            ml9 r8 = (defpackage.ml9) r8
            zf1 r0 = new zf1
            java.lang.String r1 = r8.a
            java.lang.String r2 = r8.b
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            lc3 r5 = defpackage.lc3.a
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            cg1 r8 = new cg1
            r8.<init>(r6, r7)
            return r8
        Lb8:
            ap3 r6 = new ap3
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.c(java.lang.String, java.lang.String[], kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r32, java.lang.String r33, defpackage.kt1 r34) throws defpackage.ap3 {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.d(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r5, java.lang.String r6, defpackage.kt1 r7) throws defpackage.ap3 {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ip2
            if (r0 == 0) goto L13
            r0 = r7
            ip2 r0 = (defpackage.ip2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ip2 r0 = new ip2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r7)
            goto L47
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r7)
            wa2 r5 = r4.a(r5)
            if (r5 == 0) goto L6b
            lm9 r7 = new lm9
            sv8 r4 = r4.c
            r7.<init>(r5, r4)
            r0.c = r2
            java.lang.Object r7 = r7.k(r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L47
            return r4
        L47:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L58:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6a
            java.lang.Object r6 = r5.next()
            cn9 r6 = (defpackage.cn9) r6
            java.lang.String r6 = r6.a
            r4.add(r6)
            goto L58
        L6a:
            return r4
        L6b:
            ap3 r4 = new ap3
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.e(java.lang.String, java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r7, java.lang.String[] r8, defpackage.kt1 r9) throws defpackage.ap3 {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.jp2
            if (r0 == 0) goto L13
            r0 = r9
            jp2 r0 = (defpackage.jp2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jp2 r0 = new jp2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r9)
            goto L7e
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.e11.e0(r9)
            wa2 r7 = r6.a(r7)
            if (r7 == 0) goto Lb8
            lm9 r9 = new lm9
            sv8 r6 = r6.c
            r9.<init>(r7, r6)
            uf5 r6 = defpackage.xf5.a
            r7 = 0
            r7 = r8[r7]
            mf5 r6 = r6.c(r7)
            fg5 r6 = defpackage.nf5.f(r6)
            java.lang.Object r7 = defpackage.fw.p0(r2, r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            java.lang.String r8 = "script"
            java.lang.Object r8 = defpackage.y86.G(r8, r6)
            mf5 r8 = (defpackage.mf5) r8
            jg5 r8 = defpackage.nf5.g(r8)
            java.lang.String r8 = r8.a()
            java.lang.String r1 = "input"
            java.lang.Object r6 = defpackage.y86.G(r1, r6)
            mf5 r6 = (defpackage.mf5) r6
            jg5 r6 = defpackage.nf5.g(r6)
            java.lang.String r6 = r6.a()
            r0.c = r2
            java.lang.Object r9 = r9.i(r8, r6, r7, r0)
            xx1 r6 = defpackage.xx1.a
            if (r9 != r6) goto L7e
            return r6
        L7e:
            dn9 r9 = (defpackage.dn9) r9
            java.util.List r6 = r9.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r6.next()
            an9 r8 = (defpackage.an9) r8
            java.lang.String r1 = r8.a
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            java.lang.String r2 = r8.b
            java.lang.String r5 = r8.e
            h0a r0 = new h0a
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            j0a r8 = new j0a
            r8.<init>(r6, r7)
            return r8
        Lb8:
            ap3 r6 = new ap3
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.f(java.lang.String, java.lang.String[], kt1):java.lang.Object");
    }
}
