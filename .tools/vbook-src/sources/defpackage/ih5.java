package defpackage;

import java.nio.channels.AsynchronousSocketChannel;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih5 implements vx, iy {
    public AsynchronousSocketChannel a;
    public final t07 b = u07.a();
    public final t07 c = u07.a();

    public ih5(AsynchronousSocketChannel asynchronousSocketChannel) {
        this.a = asynchronousSocketChannel;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        aj2 aj2Var = rw2.a;
        ah1.J(wx1.b(nh2.c), null, null, new eh5(this, null), 3);
        return heb.a;
    }

    @Override // defpackage.iy
    public final Object b(int i, jt1 jt1Var) {
        Object objZ = kf0.Z(this, i, (fm2) jt1Var);
        return objZ == xx1.a ? objZ : heb.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r10.p(r0) == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:25:0x0070, B:27:0x0076, B:30:0x0085), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r7, int r8, int r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.gh5
            if (r0 == 0) goto L13
            r0 = r10
            gh5 r0 = (defpackage.gh5) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            gh5 r0 = new gh5
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.t
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L51
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.lang.Object r6 = r0.c
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.b
            r07 r7 = (defpackage.r07) r7
            ih5 r8 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L35
            goto L70
        L35:
            r6 = move-exception
            goto L8d
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L3d:
            int r9 = r0.e
            int r8 = r0.d
            java.lang.Object r6 = r0.c
            r07 r6 = (defpackage.r07) r6
            java.lang.Object r7 = r0.b
            byte[] r7 = (byte[]) r7
            ih5 r1 = r0.a
            defpackage.e11.e0(r10)
            r10 = r6
            r6 = r1
            goto L69
        L51:
            defpackage.e11.e0(r10)
            r0.a = r6
            r0.b = r7
            t07 r10 = r6.c
            r0.c = r10
            r0.d = r8
            r0.e = r9
            r0.t = r3
            java.lang.Object r1 = r10.p(r0)
            if (r1 != r5) goto L69
            goto L84
        L69:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7, r8, r9)     // Catch: java.lang.Throwable -> L8b
            r8 = r6
            r6 = r7
            r7 = r10
        L70:
            boolean r9 = r6.hasRemaining()     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L85
            r0.a = r8     // Catch: java.lang.Throwable -> L35
            r0.b = r7     // Catch: java.lang.Throwable -> L35
            r0.c = r6     // Catch: java.lang.Throwable -> L35
            r0.t = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r8.i(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r9 != r5) goto L70
        L84:
            return r5
        L85:
            heb r6 = defpackage.heb.a     // Catch: java.lang.Throwable -> L35
            r7.q(r4)
            return r6
        L8b:
            r6 = move-exception
            r7 = r10
        L8d:
            r7.q(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih5.f(byte[], int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(final byte[] r8, final int r9, final int r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.fh5
            if (r0 == 0) goto L13
            r0 = r11
            fh5 r0 = (defpackage.fh5) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            fh5 r0 = new fh5
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f
            int r1 = r0.t
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.a
            r07 r7 = (defpackage.r07) r7
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r4
        L37:
            int r10 = r0.e
            int r9 = r0.d
            t07 r7 = r0.c
            byte[] r8 = r0.b
            java.lang.Object r1 = r0.a
            ih5 r1 = (defpackage.ih5) r1
            defpackage.e11.e0(r11)
            r11 = r7
            r7 = r1
            goto L61
        L49:
            defpackage.e11.e0(r11)
            r0.a = r7
            r0.b = r8
            t07 r11 = r7.b
            r0.c = r11
            r0.d = r9
            r0.e = r10
            r0.t = r3
            java.lang.Object r1 = r11.p(r0)
            if (r1 != r5) goto L61
            goto L74
        L61:
            ch5 r1 = new ch5     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r0.a = r11     // Catch: java.lang.Throwable -> L87
            r0.b = r4     // Catch: java.lang.Throwable -> L87
            r0.c = r4     // Catch: java.lang.Throwable -> L87
            r0.t = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = defpackage.y86.r(r1, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r5) goto L75
        L74:
            return r5
        L75:
            r6 = r11
            r11 = r7
            r7 = r6
        L78:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L2f
            int r8 = r11.intValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            r7.q(r4)
            return r9
        L87:
            r8 = move-exception
            r7 = r11
        L89:
            r7.q(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih5.g(byte[], int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(final java.nio.ByteBuffer r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.hh5
            if (r0 == 0) goto L13
            r0 = r6
            hh5 r0 = (defpackage.hh5) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hh5 r0 = new hh5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)     // Catch: java.lang.Throwable -> L5a
            goto L49
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            c00 r6 = defpackage.qy.a
            r6.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.c00.b
            r1.incrementAndGet(r6)
            dh5 r6 = new dh5     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            r0.c = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = defpackage.y86.r(r6, r0)     // Catch: java.lang.Throwable -> L5a
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L49
            return r4
        L49:
            r4 = r6
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L5a
            r4.intValue()     // Catch: java.lang.Throwable -> L5a
            c00 r4 = defpackage.qy.b     // Catch: java.lang.Throwable -> L5a
            r4.getClass()     // Catch: java.lang.Throwable -> L5a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.c00.b     // Catch: java.lang.Throwable -> L5a
            r5.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L5a
            return r6
        L5a:
            r4 = move-exception
            c00 r5 = defpackage.qy.c
            r5.getClass()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = defpackage.c00.b
            r6.incrementAndGet(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih5.i(java.nio.ByteBuffer, kt1):java.lang.Object");
    }
}
