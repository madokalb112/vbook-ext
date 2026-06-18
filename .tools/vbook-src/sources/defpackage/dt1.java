package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dt1 extends o1a implements yb4 {
    public ft1 a;
    public b07 b;
    public Object c;
    public zs1 d;
    public int e;
    public int f;
    public boolean s;
    public boolean t;
    public int u;
    public final /* synthetic */ ft1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(ft1 ft1Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.v = ft1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new dt1(this.v, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((dt1) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (r13 == false) goto L11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:14:0x0081). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.u
            r1 = 1
            if (r0 == 0) goto L22
            if (r0 != r1) goto L1b
            boolean r0 = r12.t
            boolean r2 = r12.s
            int r3 = r12.f
            int r4 = r12.e
            zs1 r5 = r12.d
            java.lang.Object r6 = r12.c
            b07 r7 = r12.b
            ft1 r8 = r12.a
            defpackage.e11.e0(r13)
            goto L81
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            r12 = 0
            return r12
        L22:
            defpackage.e11.e0(r13)
            ft1 r13 = r12.v
            fr9 r0 = r13.d
            if (r0 == 0) goto L96
            r2 = 0
            r8 = r13
            r7 = r0
            r3 = r2
            r4 = r3
        L30:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            zs1 r5 = (defpackage.zs1) r5
            qba r13 = r8.c
            r0 = r13
            xba r0 = (defpackage.xba) r0
            zia r0 = r0.a
            km0 r2 = r0.w
            ni5[] r9 = defpackage.zia.A
            r10 = 24
            r10 = r9[r10]
            java.lang.Object r0 = r2.c(r10, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            xba r13 = (defpackage.xba) r13
            zia r2 = r13.a
            km0 r10 = r2.x
            r11 = 25
            r9 = r9[r11]
            java.lang.Object r2 = r10.c(r9, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r12.a = r8
            r12.b = r7
            r12.c = r6
            r12.d = r5
            r12.e = r4
            r12.f = r3
            r12.s = r2
            r12.t = r0
            r12.u = r1
            java.lang.String r9 = "abc"
            java.io.Serializable r13 = r13.c(r9, r12)
            xx1 r9 = defpackage.xx1.a
            if (r13 != r9) goto L81
            return r9
        L81:
            java.util.List r13 = (java.util.List) r13
            r5.getClass()
            r13.getClass()
            zs1 r5 = new zs1
            r5.<init>(r0, r2, r13)
            fr9 r7 = (defpackage.fr9) r7
            boolean r13 = r7.j(r6, r5)
            if (r13 == 0) goto L30
        L96:
            heb r12 = defpackage.heb.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
