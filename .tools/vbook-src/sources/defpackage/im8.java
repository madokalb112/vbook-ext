package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class im8 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ gv4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im8(yb4 yb4Var, gv4 gv4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = yb4Var;
        this.e = gv4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                im8 im8Var = new im8(this.d, this.e, jt1Var, 0);
                im8Var.c = obj;
                return im8Var;
            default:
                im8 im8Var2 = new im8(this.d, this.e, jt1Var, 1);
                im8Var2.c = obj;
                return im8Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((im8) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r2.invoke(r6, r10) == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r11 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r4;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            heb r1 = defpackage.heb.a
            yb4 r2 = r10.d
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r4 = defpackage.xx1.a
            r5 = 1
            gv4 r6 = r10.e
            r7 = 0
            switch(r0) {
                case 0: goto L5a;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r10.c
            vx1 r0 = (defpackage.vx1) r0
            int r8 = r10.b
            r9 = 2
            if (r8 == 0) goto L2b
            if (r8 == r5) goto L27
            if (r8 != r9) goto L22
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L59
            goto L4e
        L22:
            gp.j(r3)
            r1 = r7
            goto L59
        L27:
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L39
            goto L39
        L2b:
            defpackage.e11.e0(r11)
            r10.c = r0     // Catch: java.lang.Throwable -> L39
            r10.b = r5     // Catch: java.lang.Throwable -> L39
            java.lang.Object r11 = r2.invoke(r6, r10)     // Catch: java.lang.Throwable -> L39
            if (r11 != r4) goto L39
            goto L4c
        L39:
            ut0 r11 = r6.b()     // Catch: java.lang.Throwable -> L59
            r10.c = r7     // Catch: java.lang.Throwable -> L59
            r10.b = r9     // Catch: java.lang.Throwable -> L59
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r11 = defpackage.m79.A(r11, r2, r10)     // Catch: java.lang.Throwable -> L59
            if (r11 != r4) goto L4e
        L4c:
            r1 = r4
            goto L59
        L4e:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L59
            long r10 = r11.longValue()     // Catch: java.lang.Throwable -> L59
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Throwable -> L59
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L59
        L59:
            return r1
        L5a:
            java.lang.Object r0 = r10.c
            vx1 r0 = (defpackage.vx1) r0
            int r0 = r10.b
            if (r0 == 0) goto L6d
            if (r0 != r5) goto L68
            defpackage.e11.e0(r11)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L68:
            gp.j(r3)
            r4 = r7
            goto L86
        L6d:
            defpackage.e11.e0(r11)
            r10.c = r7     // Catch: java.lang.Throwable -> L7b
            r10.b = r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r10 = r2.invoke(r6, r10)     // Catch: java.lang.Throwable -> L7b
            if (r10 != r4) goto L81
            goto L86
        L7b:
            r10 = move-exception
            pm8 r1 = new pm8
            r1.<init>(r10)
        L81:
            qm8 r4 = new qm8
            r4.<init>(r1)
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
