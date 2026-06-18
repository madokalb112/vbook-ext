package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eq0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fxb c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq0(fxb fxbVar, a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = fxbVar;
        this.d = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.d;
        fxb fxbVar = this.c;
        switch (i) {
            case 0:
                return new eq0(fxbVar, a07Var, jt1Var, 0);
            default:
                return new eq0(fxbVar, a07Var, jt1Var, 1);
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
        return ((eq0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r7.n(r9) == r5) goto L18;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            heb r1 = defpackage.heb.a
            a07 r2 = r9.d
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r5 = defpackage.xx1.a
            r6 = 1
            fxb r7 = r9.c
            switch(r0) {
                case 0: goto L54;
                default: goto L11;
            }
        L11:
            int r0 = r9.b
            r8 = 2
            if (r0 == 0) goto L27
            if (r0 == r6) goto L23
            if (r0 != r8) goto L1e
            defpackage.e11.e0(r10)
            goto L4b
        L1e:
            gp.j(r4)
            r1 = r3
            goto L53
        L23:
            defpackage.e11.e0(r10)
            goto L53
        L27:
            defpackage.e11.e0(r10)
            cn7 r10 = r7.b
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L41
            r9.b = r6
            java.lang.Object r9 = r7.f(r9)
            if (r9 != r5) goto L53
            goto L49
        L41:
            r9.b = r8
            java.lang.Object r9 = r7.n(r9)
            if (r9 != r5) goto L4b
        L49:
            r1 = r5
            goto L53
        L4b:
            r7.c()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r2.setValue(r9)
        L53:
            return r1
        L54:
            int r0 = r9.b
            if (r0 == 0) goto L63
            if (r0 != r6) goto L5e
            defpackage.e11.e0(r10)
            goto La5
        L5e:
            gp.j(r4)
            r1 = r3
            goto La5
        L63:
            defpackage.e11.e0(r10)
            java.lang.Object r10 = r2.getValue()
            iq0 r10 = (defpackage.iq0) r10
            boolean r10 = r10.c
            if (r10 == 0) goto L73
            java.lang.String r10 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36"
            goto L9c
        L73:
            d6a r10 = defpackage.kr2.a
            java.lang.Object r10 = r10.getValue()
            ph r10 = (defpackage.ph) r10
            r10.getClass()
            defpackage.kr2.d()
            defpackage.kr2.a()
            java.lang.String r10 = android.os.Build.VERSION.RELEASE
            r10.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Mozilla/5.0 (Linux; Android "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L9c:
            r9.b = r6
            java.lang.Object r9 = r7.b(r10, r9)
            if (r9 != r5) goto La5
            r1 = r5
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
