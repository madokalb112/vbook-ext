package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class to6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kb9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to6(boolean z, kb9 kb9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.d = kb9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new to6(this.c, this.d, jt1Var, 0);
            default:
                return new to6(this.c, this.d, jt1Var, 1);
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
        return ((to6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r11 == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r9.e(r11) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0079, code lost:
    
        if (r11 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
    
        if (r9.e(r11) == r6) goto L51;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.a
            lb9 r1 = defpackage.lb9.b
            lb9 r2 = defpackage.lb9.c
            boolean r3 = r11.c
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r6 = defpackage.xx1.a
            r7 = 1
            r8 = 2
            kb9 r9 = r11.d
            heb r10 = defpackage.heb.a
            switch(r0) {
                case 0: goto L52;
                default: goto L16;
            }
        L16:
            int r0 = r11.b
            if (r0 == 0) goto L27
            if (r0 == r7) goto L23
            if (r0 != r8) goto L1f
            goto L23
        L1f:
            gp.j(r5)
            goto L51
        L23:
            defpackage.e11.e0(r12)
            goto L50
        L27:
            defpackage.e11.e0(r12)
            if (r3 == 0) goto L40
            r11.b = r7
            boolean r12 = r9.c()
            if (r12 == 0) goto L35
            r1 = r2
        L35:
            java.lang.Object r11 = defpackage.kb9.a(r9, r1, r11)
            if (r11 != r6) goto L3c
            goto L3d
        L3c:
            r11 = r10
        L3d:
            if (r11 != r6) goto L50
            goto L4e
        L40:
            boolean r12 = r9.f()
            if (r12 == 0) goto L50
            r11.b = r8
            java.lang.Object r11 = r9.e(r11)
            if (r11 != r6) goto L50
        L4e:
            r4 = r6
            goto L51
        L50:
            r4 = r10
        L51:
            return r4
        L52:
            int r0 = r11.b
            if (r0 == 0) goto L63
            if (r0 == r7) goto L5f
            if (r0 != r8) goto L5b
            goto L5f
        L5b:
            gp.j(r5)
            goto L8d
        L5f:
            defpackage.e11.e0(r12)
            goto L8c
        L63:
            defpackage.e11.e0(r12)
            if (r3 == 0) goto L7c
            r11.b = r7
            boolean r12 = r9.c()
            if (r12 == 0) goto L71
            r1 = r2
        L71:
            java.lang.Object r11 = defpackage.kb9.a(r9, r1, r11)
            if (r11 != r6) goto L78
            goto L79
        L78:
            r11 = r10
        L79:
            if (r11 != r6) goto L8c
            goto L8a
        L7c:
            boolean r12 = r9.f()
            if (r12 == 0) goto L8c
            r11.b = r8
            java.lang.Object r11 = r9.e(r11)
            if (r11 != r6) goto L8c
        L8a:
            r4 = r6
            goto L8d
        L8c:
            r4 = r10
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
