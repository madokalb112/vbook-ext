package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pqa extends o1a implements yb4 {
    public hra a;
    public String b;
    public b07 c;
    public Object d;
    public eda e;
    public int f;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public final /* synthetic */ hra w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqa(jt1 jt1Var, hra hraVar, String str) {
        super(2, jt1Var);
        this.w = hraVar;
        this.x = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new pqa(jt1Var, this.w, this.x);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((pqa) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (r14 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0083 -> B:14:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.v
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 != r1) goto L1d
            boolean r0 = r13.u
            boolean r2 = r13.t
            int r3 = r13.s
            int r4 = r13.f
            eda r5 = r13.e
            java.lang.Object r6 = r13.d
            b07 r7 = r13.c
            java.lang.String r8 = r13.b
            hra r9 = r13.a
            defpackage.e11.e0(r14)
            goto L86
        L1d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            r13 = 0
            return r13
        L24:
            defpackage.e11.e0(r14)
            hra r14 = r13.w
            fr9 r0 = r14.w0
            if (r0 == 0) goto Lb6
            r2 = 0
            java.lang.String r3 = r13.x
            r9 = r14
            r7 = r0
            r4 = r2
            r8 = r3
            r3 = r4
        L35:
            java.lang.Object r6 = r7.getValue()
            r5 = r6
            eda r5 = (defpackage.eda) r5
            qba r14 = r9.L
            r0 = r14
            xba r0 = (defpackage.xba) r0
            zia r0 = r0.a
            km0 r2 = r0.w
            ni5[] r10 = defpackage.zia.A
            r11 = 24
            r11 = r10[r11]
            java.lang.Object r0 = r2.c(r11, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            xba r14 = (defpackage.xba) r14
            zia r2 = r14.a
            km0 r11 = r2.x
            r12 = 25
            r10 = r10[r12]
            java.lang.Object r2 = r11.c(r10, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r13.a = r9
            r13.b = r8
            r13.c = r7
            r13.d = r6
            r13.e = r5
            r13.f = r4
            r13.s = r3
            r13.t = r2
            r13.u = r0
            r13.v = r1
            java.io.Serializable r14 = r14.c(r8, r13)
            xx1 r10 = defpackage.xx1.a
            if (r14 != r10) goto L86
            return r10
        L86:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r14 = r14.iterator()
        L91:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto La6
            java.lang.Object r11 = r14.next()
            r12 = r11
            js1 r12 = (defpackage.js1) r12
            boolean r12 = r12.d
            if (r12 == 0) goto L91
            r10.add(r11)
            goto L91
        La6:
            r5.getClass()
            eda r14 = new eda
            r14.<init>(r0, r2, r10)
            fr9 r7 = (defpackage.fr9) r7
            boolean r14 = r7.j(r6, r14)
            if (r14 == 0) goto L35
        Lb6:
            heb r13 = defpackage.heb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
