package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rz extends qd0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(defpackage.rz r6, java.lang.String r7, defpackage.inb r8, defpackage.kt1 r9) throws java.io.FileNotFoundException {
        /*
            boolean r0 = r9 instanceof defpackage.kz
            if (r0 == 0) goto L13
            r0 = r9
            kz r0 = (defpackage.kz) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kz r0 = new kz
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 3
            r4 = 2
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L48
            r6 = 1
            if (r1 == r6) goto L44
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            ax r6 = r0.a
            zy r6 = (defpackage.zy) r6
            defpackage.e11.e0(r9)
            goto L8c
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L38:
            inb r8 = r0.c
            java.lang.String r7 = r0.b
            ax r6 = r0.a
            rz r6 = (defpackage.rz) r6
            defpackage.e11.e0(r9)
            goto L69
        L44:
            defpackage.e11.e0(r9)
            return r9
        L48:
            defpackage.e11.e0(r9)
            jx1 r9 = r0.getContext()
            r9.getClass()
            s08 r1 = defpackage.t08.a
            hx1 r9 = r9.get(r1)
            if (r9 != 0) goto L9f
            r0.a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r6.s(r7, r8, r0)
            if (r9 != r5) goto L69
            goto L8a
        L69:
            java.nio.channels.AsynchronousFileChannel r9 = (java.nio.channels.AsynchronousFileChannel) r9
            nz r1 = new nz
            r1.<init>(r9, r6, r7)
            boolean r7 = r8.e
            if (r7 == 0) goto L94
            r0.a = r1
            r0.b = r2
            r0.c = r2
            r0.f = r3
            r6.getClass()
            qz r6 = new qz
            r6.<init>(r9, r2)
            java.lang.Object r9 = defpackage.pu1.n0(r6, r0)
            if (r9 != r5) goto L8b
        L8a:
            return r5
        L8b:
            r6 = r1
        L8c:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r1 = r6
            goto L96
        L94:
            r7 = 0
        L96:
            r1.getClass()
            yy r6 = new yy
            r6.<init>(r1, r7)
            return r6
        L9f:
            defpackage.j31.j()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.r(rz, java.lang.String, inb, kt1):java.lang.Object");
    }

    @Override // defpackage.qd0, defpackage.ymb
    public final Object n(String str, inb inbVar, kt1 kt1Var) {
        return r(this, str, inbVar, kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, defpackage.inb r6, defpackage.kt1 r7) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.oz
            if (r0 == 0) goto L13
            r0 = r7
            oz r0 = (defpackage.oz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oz r0 = new oz
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L2c
            if (r7 != r2) goto L26
            defpackage.e11.e0(r4)     // Catch: java.nio.file.NoSuchFileException -> L73
            goto L70
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r1
        L2c:
            defpackage.e11.e0(r4)
            zy5 r4 = defpackage.gc1.N()     // Catch: java.nio.file.NoSuchFileException -> L73
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
            boolean r7 = r6.b     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r7 == 0) goto L41
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.WRITE     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L41:
            boolean r7 = r6.c     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r7 == 0) goto L4a
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.CREATE     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L4a:
            inb r7 = defpackage.inb.CREATE_NEW     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r6 != r7) goto L53
            java.nio.file.StandardOpenOption r7 = java.nio.file.StandardOpenOption.CREATE_NEW     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r7)     // Catch: java.nio.file.NoSuchFileException -> L73
        L53:
            boolean r6 = r6.d     // Catch: java.nio.file.NoSuchFileException -> L73
            if (r6 == 0) goto L5c
            java.nio.file.StandardOpenOption r6 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L73
            r4.add(r6)     // Catch: java.nio.file.NoSuchFileException -> L73
        L5c:
            zy5 r4 = defpackage.gc1.J(r4)     // Catch: java.nio.file.NoSuchFileException -> L73
            pz r6 = new pz     // Catch: java.nio.file.NoSuchFileException -> L73
            r6.<init>(r5, r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L73
            r0.c = r2     // Catch: java.nio.file.NoSuchFileException -> L73
            java.lang.Object r4 = defpackage.pu1.n0(r6, r0)     // Catch: java.nio.file.NoSuchFileException -> L73
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L70
            return r5
        L70:
            java.nio.channels.AsynchronousFileChannel r4 = (java.nio.channels.AsynchronousFileChannel) r4     // Catch: java.nio.file.NoSuchFileException -> L73
            return r4
        L73:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz.s(java.lang.String, inb, kt1):java.lang.Object");
    }
}
