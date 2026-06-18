package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ula extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fma c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ula(fma fmaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = fmaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        fma fmaVar = this.c;
        switch (i) {
            case 0:
                return new ula(fmaVar, jt1Var, 0);
            case 1:
                return new ula(fmaVar, jt1Var, 1);
            default:
                return new ula(fmaVar, jt1Var, 2);
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
        return ((ula) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r1.f(r21) == r5) goto L18;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.a
            heb r2 = defpackage.heb.a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r5 = defpackage.xx1.a
            fma r6 = r0.c
            r7 = 1
            switch(r1) {
                case 0: goto L9b;
                case 1: goto L7b;
                default: goto L11;
            }
        L11:
            int r1 = r0.b
            r8 = 2
            if (r1 == 0) goto L29
            if (r1 == r7) goto L23
            if (r1 != r8) goto L1e
            defpackage.e11.e0(r22)
            goto L4f
        L1e:
            gp.j(r4)
            r2 = r3
            goto L7a
        L23:
            defpackage.e11.e0(r22)
            r1 = r22
            goto L39
        L29:
            defpackage.e11.e0(r22)
            p8b r1 = r6.l()
            r0.b = r7
            java.lang.Object r1 = r1.d(r0)
            if (r1 != r5) goto L39
            goto L4d
        L39:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7a
            p8b r1 = r6.l()
            r0.b = r8
            java.lang.Object r0 = r1.f(r0)
            if (r0 != r5) goto L4f
        L4d:
            r2 = r5
            goto L7a
        L4f:
            fr9 r0 = r6.e
            if (r0 == 0) goto L7a
        L53:
            java.lang.Object r1 = r0.getValue()
            r3 = r1
            sla r3 = (sla) r3
            r19 = 0
            r20 = 32767(0x7fff, float:4.5916E-41)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            sla r3 = sla.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = r0.j(r1, r3)
            if (r1 == 0) goto L53
        L7a:
            return r2
        L7b:
            int r1 = r0.b
            if (r1 == 0) goto L8a
            if (r1 != r7) goto L85
            defpackage.e11.e0(r22)
            goto L9a
        L85:
            gp.j(r4)
            r2 = r3
            goto L9a
        L8a:
            defpackage.e11.e0(r22)
            p8b r1 = r6.l()
            r0.b = r7
            java.lang.Object r0 = r1.i(r0)
            if (r0 != r5) goto L9a
            r2 = r5
        L9a:
            return r2
        L9b:
            int r1 = r0.b
            if (r1 == 0) goto Laa
            if (r1 != r7) goto La5
            defpackage.e11.e0(r22)
            goto Lb6
        La5:
            gp.j(r4)
            r2 = r3
            goto Lb6
        Laa:
            defpackage.e11.e0(r22)
            r0.b = r7
            java.lang.Object r0 = defpackage.fma.j(r6, r0)
            if (r0 != r5) goto Lb6
            r2 = r5
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ula.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
