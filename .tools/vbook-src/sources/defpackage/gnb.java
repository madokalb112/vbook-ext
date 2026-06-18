package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gnb {
    public final String a;
    public final ymb b;
    public final String c;

    public gnb(ymb ymbVar, String str) {
        this.a = str;
        this.b = ymbVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bnb
            if (r0 == 0) goto L13
            r0 = r5
            bnb r0 = (defpackage.bnb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bnb r0 = new bnb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.e11.e0(r5)     // Catch: java.lang.Throwable -> L46
            goto L3e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2c:
            defpackage.e11.e0(r5)
            ymb r5 = r4.b     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = r4.c     // Catch: java.lang.Throwable -> L46
            r0.c = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r5.q(r4, r0)     // Catch: java.lang.Throwable -> L46
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            jnb r5 = (defpackage.jnb) r5     // Catch: java.lang.Throwable -> L46
            boolean r4 = r5.b     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L46
        L46:
            if (r2 == 0) goto L4d
            boolean r4 = r2.booleanValue()
            goto L4e
        L4d:
            r4 = 0
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.a(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gnb b(java.lang.String r5) {
        /*
            r4 = this;
            r5.getClass()
            gnb r0 = new gnb
            int r1 = r5.length()
            r2 = 47
            if (r1 != 0) goto Le
            goto L2f
        Le:
            r1 = 92
            java.lang.String r1 = r5.replace(r1, r2)
            r1.getClass()
            java.lang.String r1 = defpackage.bw9.v0(r1, r2)
            int r3 = r1.length()
            if (r3 != 0) goto L22
            goto L2a
        L22:
            r3 = 58
            boolean r1 = defpackage.bw9.P(r1, r3)
            if (r1 == 0) goto L2f
        L2a:
            java.lang.String r5 = defpackage.ww1.T(r5)
            goto L47
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r4.c
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = defpackage.ww1.T(r5)
        L47:
            ymb r4 = r4.b
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.b(java.lang.String):gnb");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cnb
            if (r0 == 0) goto L13
            r0 = r5
            cnb r0 = (defpackage.cnb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnb r0 = new cnb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.c = r2
            ymb r5 = r4.b
            java.lang.String r4 = r4.c
            java.lang.Object r5 = r5.q(r4, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            jnb r5 = (defpackage.jnb) r5
            boolean r4 = r5.c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.c(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dnb
            if (r0 == 0) goto L13
            r0 = r5
            dnb r0 = (defpackage.dnb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnb r0 = new dnb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.c = r2
            java.lang.Object r5 = r4.e(r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.gc1.M(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r5.next()
            gnb r0 = (defpackage.gnb) r0
            java.lang.String r0 = defpackage.ww1.M(r0)
            r4.add(r0)
            goto L4b
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.d(kt1):java.io.Serializable");
    }

    public final Object e(kt1 kt1Var) {
        return this.b.m(this.c, kt1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnb)) {
            return false;
        }
        gnb gnbVar = (gnb) obj;
        return this.b.equals(gnbVar.b) && this.c.equals(gnbVar.c);
    }

    public final Object f(inb inbVar, kt1 kt1Var) {
        return this.b.n(this.c, inbVar, kt1Var);
    }

    public final Object g(kt1 kt1Var) {
        return this.b.o(this.c, hnb.a, kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.zcb r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.enb
            if (r0 == 0) goto L13
            r0 = r6
            enb r0 = (defpackage.enb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            enb r0 = new enb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zcb r5 = r0.a
            defpackage.e11.e0(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = r4.g(r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            byte[] r6 = (byte[]) r6
            java.lang.String r4 = defpackage.k31.b(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.h(zcb, kt1):java.lang.Object");
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fnb
            if (r0 == 0) goto L13
            r0 = r5
            fnb r0 = (defpackage.fnb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fnb r0 = new fnb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            r0.c = r2
            ymb r5 = r4.b
            java.lang.String r4 = r4.c
            java.lang.Object r5 = r5.q(r4, r0)
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            jnb r5 = (defpackage.jnb) r5
            long r4 = r5.d
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.i(kt1):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('[');
        return xv5.s(sb, this.c, ']');
    }
}
