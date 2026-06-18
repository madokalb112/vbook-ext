package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n42 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a52 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n42(a52 a52Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = a52Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a52 a52Var = this.c;
        switch (i) {
            case 0:
                return new n42(a52Var, jt1Var, 0);
            case 1:
                return new n42(a52Var, jt1Var, 1);
            default:
                return new n42(a52Var, jt1Var, 2);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((n42) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.a
            heb r1 = defpackage.heb.a
            r2 = -1
            r3 = 2
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r6 = defpackage.xx1.a
            a52 r7 = r9.c
            r8 = 1
            switch(r0) {
                case 0: goto L9f;
                case 1: goto L57;
                default: goto L11;
            }
        L11:
            zc r0 = r7.h
            int r1 = r9.b
            if (r1 == 0) goto L29
            if (r1 == r8) goto L23
            if (r1 != r3) goto L1f
            defpackage.e11.e0(r10)
            goto L4d
        L1f:
            gp.j(r5)
            goto L56
        L23:
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r9 = move-exception
            goto L51
        L29:
            defpackage.e11.e0(r10)
            ar9 r10 = r0.a()
            boolean r10 = r10 instanceof defpackage.wx3
            if (r10 == 0) goto L39
            ar9 r4 = r0.a()
            goto L56
        L39:
            r9.b = r8     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = a52.e(r7, r9)     // Catch: java.lang.Throwable -> L27
            if (r10 != r6) goto L42
            goto L4b
        L42:
            r9.b = r3
            r10 = 0
            java.lang.Object r10 = a52.f(r7, r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r4 = r6
            goto L56
        L4d:
            r4 = r10
            ar9 r4 = (defpackage.ar9) r4
            goto L56
        L51:
            nc8 r4 = new nc8
            r4.<init>(r2, r9)
        L56:
            return r4
        L57:
            int r0 = r9.b
            if (r0 == 0) goto L6c
            if (r0 == r8) goto L68
            if (r0 != r3) goto L63
            defpackage.e11.e0(r10)
            goto L9e
        L63:
            gp.j(r5)
            r1 = r4
            goto L9e
        L68:
            defpackage.e11.e0(r10)
            goto L82
        L6c:
            defpackage.e11.e0(r10)
            s16 r10 = r7.i
            r9.b = r8
            java.lang.Object r10 = r10.c
            bi1 r10 = (defpackage.bi1) r10
            java.lang.Object r10 = r10.o(r9)
            if (r10 != r6) goto L7e
            goto L7f
        L7e:
            r10 = r1
        L7f:
            if (r10 != r6) goto L82
            goto L9d
        L82:
            ra5 r10 = r7.h()
            b24 r10 = r10.e()
            b24 r10 = defpackage.cx1.y(r10, r2)
            sg r0 = new sg
            r2 = 8
            r0.<init>(r7, r2)
            r9.b = r3
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r6) goto L9e
        L9d:
            r1 = r6
        L9e:
            return r1
        L9f:
            int r0 = r9.b
            if (r0 == 0) goto Lae
            if (r0 != r8) goto La9
            defpackage.e11.e0(r10)
            goto Lba
        La9:
            gp.j(r5)
            r1 = r4
            goto Lba
        Lae:
            defpackage.e11.e0(r10)
            r9.b = r8
            java.lang.Object r9 = a52.d(r7, r9)
            if (r9 != r6) goto Lba
            r1 = r6
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
