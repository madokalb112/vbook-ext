package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wn3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yn3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn3(yn3 yn3Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = yn3Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        yn3 yn3Var = this.c;
        switch (i) {
            case 0:
                return new wn3(yn3Var, jt1Var, 0);
            case 1:
                return new wn3(yn3Var, jt1Var, 1);
            default:
                return new wn3(yn3Var, jt1Var, 2);
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
        return ((wn3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (((defpackage.b24) r11).a(r0, r10) == r5) goto L27;
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
            r1 = 0
            yn3 r2 = r10.c
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r5 = defpackage.xx1.a
            heb r6 = defpackage.heb.a
            r7 = 1
            switch(r0) {
                case 0: goto L91;
                case 1: goto L31;
                default: goto L10;
            }
        L10:
            int r0 = r10.b
            if (r0 == 0) goto L1f
            if (r0 != r7) goto L1b
            defpackage.e11.e0(r11)
        L19:
            r3 = r6
            goto L30
        L1b:
            gp.j(r4)
            goto L30
        L1f:
            defpackage.e11.e0(r11)
            qp3 r11 = r2.d
            java.lang.String r0 = r2.c
            r10.b = r7
            cq3 r11 = (defpackage.cq3) r11
            r11.a(r0)
            if (r6 != r5) goto L19
            r3 = r5
        L30:
            return r3
        L31:
            int r0 = r10.b
            r8 = 2
            if (r0 == 0) goto L46
            if (r0 == r7) goto L42
            if (r0 != r8) goto L3e
            defpackage.e11.e0(r11)
            goto L8f
        L3e:
            gp.j(r4)
            goto L90
        L42:
            defpackage.e11.e0(r11)
            goto L7e
        L46:
            defpackage.e11.e0(r11)
            qp3 r11 = r2.d
            java.lang.String r0 = r2.c
            r10.b = r7
            cq3 r11 = (defpackage.cq3) r11
            m62 r11 = r11.a
            n92 r11 = r11.y
            r11.getClass()
            r0.getClass()
            ab2 r3 = defpackage.ab2.a
            g82 r3 = new g82
            sa2 r4 = new sa2
            r9 = 9
            r4.<init>(r9)
            r3.<init>(r11, r0, r4, r1)
            pp1 r11 = defpackage.qx1.R(r3)
            aj2 r0 = defpackage.rw2.a
            nh2 r0 = defpackage.nh2.c
            y34 r11 = defpackage.qx1.E(r11, r0)
            kb3 r0 = new kb3
            r0.<init>(r11, r7)
            if (r0 != r5) goto L7d
            goto L8d
        L7d:
            r11 = r0
        L7e:
            b24 r11 = (defpackage.b24) r11
            vn3 r0 = new vn3
            r0.<init>(r2, r7)
            r10.b = r8
            java.lang.Object r10 = r11.a(r0, r10)
            if (r10 != r5) goto L8f
        L8d:
            r3 = r5
            goto L90
        L8f:
            r3 = r6
        L90:
            return r3
        L91:
            int r0 = r10.b
            if (r0 == 0) goto L9f
            if (r0 != r7) goto L9b
            defpackage.e11.e0(r11)
            goto Lbb
        L9b:
            gp.j(r4)
            goto Lbc
        L9f:
            defpackage.e11.e0(r11)
            qp3 r11 = r2.d
            java.lang.String r0 = r2.c
            cq3 r11 = (defpackage.cq3) r11
            wp3 r11 = r11.e(r0)
            vn3 r0 = new vn3
            r0.<init>(r2, r1)
            r10.b = r7
            java.lang.Object r10 = r11.a(r0, r10)
            if (r10 != r5) goto Lbb
            r3 = r5
            goto Lbc
        Lbb:
            r3 = r6
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
