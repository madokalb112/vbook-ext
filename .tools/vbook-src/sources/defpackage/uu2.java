package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uu2 implements ou2 {
    public final m62 a;
    public final sv8 b;

    public uu2(m62 m62Var, sv8 sv8Var) {
        this.a = m62Var;
        this.b = sv8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, java.lang.String r9, defpackage.kt1 r10) throws defpackage.ap3 {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.pu2
            if (r0 == 0) goto L13
            r0 = r10
            pu2 r0 = (defpackage.pu2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pu2 r0 = new pu2
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r10)
            goto L55
        L25:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L2c:
            defpackage.e11.e0(r10)
            wa2 r7 = r6.b(r7)
            if (r7 == 0) goto L8f
            lm9 r10 = new lm9
            sv8 r6 = r6.b
            r10.<init>(r7, r6)
            java.util.Map r6 = r7.p
            java.lang.String r7 = "search"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L4a
            java.lang.String r6 = ""
        L4a:
            r0.c = r2
            java.lang.Object r10 = r10.i(r6, r8, r9, r0)
            xx1 r6 = defpackage.xx1.a
            if (r10 != r6) goto L55
            return r6
        L55:
            dn9 r10 = (defpackage.dn9) r10
            java.util.List r6 = r10.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r6.next()
            an9 r8 = (defpackage.an9) r8
            java.lang.String r1 = r8.a
            java.lang.String r3 = r8.c
            java.lang.String r4 = r8.d
            java.lang.String r2 = r8.b
            java.lang.String r5 = r8.e
            ji0 r0 = new ji0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L68
        L87:
            java.lang.String r6 = r10.b
            sk0 r8 = new sk0
            r8.<init>(r6, r7)
            return r8
        L8f:
            ap3 r6 = new ap3
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.a(java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final wa2 b(String str) {
        return (wa2) this.a.x.T(str).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, java.lang.String[] r8, defpackage.kt1 r9) throws defpackage.ap3 {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qu2
            if (r0 == 0) goto L13
            r0 = r9
            qu2 r0 = (defpackage.qu2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qu2 r0 = new qu2
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
            wa2 r7 = r6.b(r7)
            if (r7 == 0) goto Lb8
            lm9 r9 = new lm9
            sv8 r6 = r6.b
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
            ji0 r0 = new ji0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.add(r0)
            goto L91
        Lb0:
            java.lang.String r6 = r9.b
            sk0 r8 = new sk0
            r8.<init>(r6, r7)
            return r8
        Lb8:
            ap3 r6 = new ap3
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.c(java.lang.String, java.lang.String[], kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r8, defpackage.kt1 r9) throws defpackage.ap3 {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ru2
            if (r0 == 0) goto L13
            r0 = r9
            ru2 r0 = (defpackage.ru2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ru2 r0 = new ru2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r9)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.e11.e0(r9)
            wa2 r8 = r7.b(r8)
            if (r8 == 0) goto L9a
            lm9 r9 = new lm9
            sv8 r7 = r7.b
            r9.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r9 = r9.h(r0)
            xx1 r7 = defpackage.xx1.a
            if (r9 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            nm9 r9 = (defpackage.nm9) r9
            nz0 r0 = new nz0
            java.lang.String r1 = r9.a
            uf5 r3 = defpackage.xf5.a
            java.lang.String r4 = r9.c
            xl7 r5 = new xl7
            java.lang.String r6 = "script"
            r5.<init>(r6, r4)
            java.lang.String r9 = r9.b
            xl7 r4 = new xl7
            java.lang.String r6 = "input"
            r4.<init>(r6, r9)
            xl7[] r9 = new defpackage.xl7[]{r5, r4}
            java.util.Map r9 = defpackage.y86.P(r9)
            r3.getClass()
            sj4 r4 = new sj4
            tv9 r5 = defpackage.tv9.a
            r4.<init>(r5, r5, r2)
            java.lang.String r9 = r3.b(r4, r9)
            r0.<init>(r1, r9)
            r7.add(r0)
            goto L58
        L99:
            return r7
        L9a:
            ap3 r7 = new ap3
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.d(java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r24, defpackage.kt1 r25) throws defpackage.ap3 {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.e(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r8, defpackage.kt1 r9) throws defpackage.ap3 {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tu2
            if (r0 == 0) goto L13
            r0 = r9
            tu2 r0 = (defpackage.tu2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tu2 r0 = new tu2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r9)
            goto L47
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.e11.e0(r9)
            wa2 r8 = r7.b(r8)
            if (r8 == 0) goto L9a
            lm9 r9 = new lm9
            sv8 r7 = r7.b
            r9.<init>(r8, r7)
            r0.c = r2
            java.io.Serializable r9 = r9.g(r0)
            xx1 r7 = defpackage.xx1.a
            if (r9 != r7) goto L47
            return r7
        L47:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.gc1.M(r9, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        L58:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            um9 r9 = (defpackage.um9) r9
            ce4 r0 = new ce4
            java.lang.String r1 = r9.a
            uf5 r3 = defpackage.xf5.a
            java.lang.String r4 = r9.c
            xl7 r5 = new xl7
            java.lang.String r6 = "script"
            r5.<init>(r6, r4)
            java.lang.String r9 = r9.b
            xl7 r4 = new xl7
            java.lang.String r6 = "input"
            r4.<init>(r6, r9)
            xl7[] r9 = new defpackage.xl7[]{r5, r4}
            java.util.Map r9 = defpackage.y86.P(r9)
            r3.getClass()
            sj4 r4 = new sj4
            tv9 r5 = defpackage.tv9.a
            r4.<init>(r5, r5, r2)
            java.lang.String r9 = r3.b(r4, r9)
            r0.<init>(r1, r9)
            r7.add(r0)
            goto L58
        L99:
            return r7
        L9a:
            ap3 r7 = new ap3
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu2.f(java.lang.String, kt1):java.io.Serializable");
    }
}
