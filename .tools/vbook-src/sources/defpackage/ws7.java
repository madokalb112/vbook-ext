package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ws7 extends o1a implements yb4 {
    public w29 a;
    public h11 b;
    public br0 c;
    public int d;
    public int e;
    public int f;
    public int s;
    public final /* synthetic */ ir0 t;
    public final /* synthetic */ w29 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws7(ir0 ir0Var, w29 w29Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = ir0Var;
        this.u = w29Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new ws7(this.t, this.u, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((ws7) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r9.g(r13, r10) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0019, B:19:0x004c, B:23:0x006a, B:25:0x0072, B:14:0x0039, B:18:0x0044), top: B:39:0x0007, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: eb1 -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {eb1 -> 0x00a7, blocks: (B:28:0x009d, B:32:0x00a3, B:33:0x00a6, B:17:0x0040, B:30:0x00a1, B:7:0x0019, B:19:0x004c, B:23:0x006a, B:25:0x0072, B:14:0x0039, B:18:0x0044), top: B:39:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009a -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.s
            r1 = 2
            r2 = 1
            r3 = 0
            xx1 r4 = defpackage.xx1.a
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L2d
            if (r0 != r1) goto L27
            int r0 = r13.f
            int r5 = r13.e
            int r6 = r13.d
            br0 r7 = r13.c
            h11 r8 = r13.b
            w29 r9 = r13.a
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> L24
        L1c:
            r14 = r7
            r7 = r0
            r0 = r14
            r14 = r6
            r6 = r5
            r5 = r14
            r14 = r9
            goto L4c
        L24:
            r13 = move-exception
            goto La1
        L27:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r3
        L2d:
            int r0 = r13.f
            int r5 = r13.e
            int r6 = r13.d
            br0 r7 = r13.c
            h11 r8 = r13.b
            w29 r9 = r13.a
            defpackage.e11.e0(r14)     // Catch: java.lang.Throwable -> L24
            goto L6a
        L3d:
            defpackage.e11.e0(r14)
            ir0 r8 = r13.t     // Catch: defpackage.eb1 -> La7
            w29 r14 = r13.u     // Catch: defpackage.eb1 -> La7
            br0 r0 = new br0     // Catch: java.lang.Throwable -> L24
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L24
            r5 = 0
            r6 = r5
            r7 = r6
        L4c:
            r13.a = r14     // Catch: java.lang.Throwable -> L24
            r13.b = r8     // Catch: java.lang.Throwable -> L24
            r13.c = r0     // Catch: java.lang.Throwable -> L24
            r13.d = r5     // Catch: java.lang.Throwable -> L24
            r13.e = r6     // Catch: java.lang.Throwable -> L24
            r13.f = r7     // Catch: java.lang.Throwable -> L24
            r13.s = r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r9 = r0.a(r13)     // Catch: java.lang.Throwable -> L24
            if (r9 != r4) goto L61
            goto L9c
        L61:
            r12 = r9
            r9 = r14
            r14 = r12
            r12 = r7
            r7 = r0
            r0 = r12
            r12 = r6
            r6 = r5
            r5 = r12
        L6a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L24
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r14 == 0) goto L9d
            java.lang.Object r14 = r7.c()     // Catch: java.lang.Throwable -> L24
            ka4 r14 = (defpackage.ka4) r14     // Catch: java.lang.Throwable -> L24
            k46 r10 = defpackage.kl2.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r11 = "Received ping message, sending pong message"
            r10.j(r11)     // Catch: java.lang.Throwable -> L24
            la4 r10 = new la4     // Catch: java.lang.Throwable -> L24
            byte[] r14 = r14.b     // Catch: java.lang.Throwable -> L24
            m77 r11 = defpackage.m77.a     // Catch: java.lang.Throwable -> L24
            r10.<init>(r14, r11)     // Catch: java.lang.Throwable -> L24
            r13.a = r9     // Catch: java.lang.Throwable -> L24
            r13.b = r8     // Catch: java.lang.Throwable -> L24
            r13.c = r7     // Catch: java.lang.Throwable -> L24
            r13.d = r6     // Catch: java.lang.Throwable -> L24
            r13.e = r5     // Catch: java.lang.Throwable -> L24
            r13.f = r0     // Catch: java.lang.Throwable -> L24
            r13.s = r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r14 = r9.g(r13, r10)     // Catch: java.lang.Throwable -> L24
            if (r14 != r4) goto L1c
        L9c:
            return r4
        L9d:
            r8.cancel(r3)     // Catch: defpackage.eb1 -> La7
            goto La7
        La1:
            throw r13     // Catch: java.lang.Throwable -> La2
        La2:
            r14 = move-exception
            defpackage.kl8.P(r8, r13)     // Catch: defpackage.eb1 -> La7
            throw r14     // Catch: defpackage.eb1 -> La7
        La7:
            heb r13 = defpackage.heb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
