package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class es0 extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ ym b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ fs0 e;
    public final /* synthetic */ sa5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(ym ymVar, float f, boolean z, fs0 fs0Var, sa5 sa5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = ymVar;
        this.c = f;
        this.d = z;
        this.e = fs0Var;
        this.f = sa5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new es0(this.b, this.c, this.d, this.e, this.f, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((es0) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r9.f(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (i93.a(r9, r4, r1, r8.f, r8) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return r5;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.a
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r1
        L12:
            defpackage.e11.e0(r9)
            goto L80
        L16:
            defpackage.e11.e0(r9)
            ym r9 = r8.b
            cn7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            x13 r0 = (defpackage.x13) r0
            float r0 = r0.a
            float r4 = r8.c
            boolean r0 = defpackage.x13.c(r0, r4)
            if (r0 != 0) goto L80
            boolean r0 = r8.d
            xx1 r5 = defpackage.xx1.a
            if (r0 != 0) goto L41
            x13 r0 = new x13
            r0.<init>(r4)
            r8.a = r3
            java.lang.Object r8 = r9.f(r8, r0)
            if (r8 != r5) goto L80
            goto L7f
        L41:
            cn7 r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            x13 r0 = (defpackage.x13) r0
            float r0 = r0.a
            r3 = 0
            boolean r6 = defpackage.x13.c(r0, r3)
            if (r6 == 0) goto L5a
            c28 r1 = new c28
            r6 = 0
            r1.<init>(r6)
            goto L75
        L5a:
            fs0 r6 = r8.e
            float r6 = r6.a
            boolean r6 = defpackage.x13.c(r0, r6)
            if (r6 == 0) goto L6a
            qp4 r1 = new qp4
            r1.<init>()
            goto L75
        L6a:
            boolean r0 = defpackage.x13.c(r0, r3)
            if (r0 == 0) goto L75
            o44 r1 = new o44
            r1.<init>()
        L75:
            r8.a = r2
            sa5 r0 = r8.f
            java.lang.Object r8 = i93.a(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L80
        L7f:
            return r5
        L80:
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
