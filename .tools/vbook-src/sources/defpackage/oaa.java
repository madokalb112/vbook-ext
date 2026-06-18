package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oaa {
    public final mq3 a;
    public final iw0 b;
    public final d6a c;
    public final t07 d;
    public oq9 e;

    public oaa(mq3 mq3Var, xn1 xn1Var, vw5 vw5Var) {
        this.a = mq3Var;
        aj2 aj2Var = rw2.a;
        this.b = wx1.b(nh2.c);
        this.c = new d6a(new o39(this, 15));
        this.d = u07.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:32:0x0092, B:34:0x0096, B:35:0x0099), top: B:40:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "http://"
            boolean r1 = r11 instanceof defpackage.maa
            if (r1 == 0) goto L15
            r1 = r11
            maa r1 = (defpackage.maa) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            maa r1 = new maa
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.f
            int r2 = r1.t
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            int r10 = r1.a
            java.lang.String r2 = r1.e
            java.lang.String r3 = r1.d
            r07 r1 = r1.c
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L35
            goto L92
        L35:
            r9 = move-exception
            goto Lbf
        L38:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r5
        L3e:
            int r10 = r1.b
            int r2 = r1.a
            r07 r4 = r1.c
            defpackage.e11.e0(r11)
            r11 = r2
            r2 = r10
            r10 = r11
            r11 = r4
            goto L61
        L4c:
            defpackage.e11.e0(r11)
            t07 r11 = r9.d
            r1.c = r11
            r1.a = r10
            r2 = 0
            r1.b = r2
            r1.t = r4
            java.lang.Object r4 = r11.p(r1)
            if (r4 != r6) goto L61
            goto L8e
        L61:
            java.lang.String r4 = defpackage.fw4.b()     // Catch: java.lang.Throwable -> L6e
            boolean r7 = defpackage.bw9.a0(r4)     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L71
            java.lang.String r4 = "127.0.0.1"
            goto L71
        L6e:
            r9 = move-exception
            r1 = r11
            goto Lbf
        L71:
            java.lang.String r7 = "0.0.0.0"
            d6a r8 = r9.c     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L6e
            ob5 r8 = (defpackage.ob5) r8     // Catch: java.lang.Throwable -> L6e
            r1.c = r11     // Catch: java.lang.Throwable -> L6e
            r1.d = r7     // Catch: java.lang.Throwable -> L6e
            r1.e = r4     // Catch: java.lang.Throwable -> L6e
            r1.a = r10     // Catch: java.lang.Throwable -> L6e
            r1.b = r2     // Catch: java.lang.Throwable -> L6e
            r1.t = r3     // Catch: java.lang.Throwable -> L6e
            r8.d()     // Catch: java.lang.Throwable -> L6e
            heb r1 = defpackage.heb.a     // Catch: java.lang.Throwable -> L6e
            if (r1 != r6) goto L8f
        L8e:
            return r6
        L8f:
            r1 = r11
            r2 = r4
            r3 = r7
        L92:
            oq9 r11 = r9.e     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto L99
            r11.cancel(r5)     // Catch: java.lang.Throwable -> L35
        L99:
            iw0 r11 = r9.b     // Catch: java.lang.Throwable -> L35
            j90 r4 = new j90     // Catch: java.lang.Throwable -> L35
            r4.<init>(r9, r10, r3, r5)     // Catch: java.lang.Throwable -> L35
            r3 = 3
            oq9 r11 = defpackage.ah1.J(r11, r5, r5, r4, r3)     // Catch: java.lang.Throwable -> L35
            r9.e = r11     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r9.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = ":"
            r9.append(r11)     // Catch: java.lang.Throwable -> L35
            r9.append(r10)     // Catch: java.lang.Throwable -> L35
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L35
            r1.q(r5)
            return r9
        Lbf:
            r1.q(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.a(int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:27:0x0068, B:29:0x006c, B:30:0x006f), top: B:39:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.naa
            if (r0 == 0) goto L13
            r0 = r8
            naa r0 = (defpackage.naa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            naa r0 = new naa
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            r07 r0 = r0.a
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L2f
            goto L68
        L2f:
            r7 = move-exception
            goto L77
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r5
        L37:
            int r1 = r0.b
            r07 r4 = r0.a
            defpackage.e11.e0(r8)
            r8 = r4
            goto L53
        L40:
            defpackage.e11.e0(r8)
            t07 r8 = r7.d
            r0.a = r8
            r1 = 0
            r0.b = r1
            r0.e = r4
            java.lang.Object r4 = r8.p(r0)
            if (r4 != r6) goto L53
            goto L66
        L53:
            d6a r4 = r7.c     // Catch: java.lang.Throwable -> L75
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L75
            ob5 r4 = (defpackage.ob5) r4     // Catch: java.lang.Throwable -> L75
            r0.a = r8     // Catch: java.lang.Throwable -> L75
            r0.b = r1     // Catch: java.lang.Throwable -> L75
            r0.e = r3     // Catch: java.lang.Throwable -> L75
            r4.d()     // Catch: java.lang.Throwable -> L75
            if (r2 != r6) goto L67
        L66:
            return r6
        L67:
            r0 = r8
        L68:
            oq9 r8 = r7.e     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L6f
            r8.cancel(r5)     // Catch: java.lang.Throwable -> L2f
        L6f:
            r7.e = r5     // Catch: java.lang.Throwable -> L2f
            r0.q(r5)
            return r2
        L75:
            r7 = move-exception
            r0 = r8
        L77:
            r0.q(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaa.b(kt1):java.lang.Object");
    }
}
