package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h7c extends o1a implements yb4 {
    public float a;
    public long b;
    public int c;
    public final /* synthetic */ n7c d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7c(n7c n7cVar, float f, long j, float f2, float f3, long j2, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = n7cVar;
        this.e = f;
        this.f = j;
        this.s = f2;
        this.t = f3;
        this.u = j2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new h7c(this.d, this.e, this.f, this.s, this.t, this.u, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((h7c) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r10.f(r9, r3) != r4) goto L23;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 2
            r2 = 1
            n7c r3 = r9.d
            xx1 r4 = defpackage.xx1.a
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L13
            defpackage.e11.e0(r10)
            goto L89
        L13:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L1a:
            long r5 = r9.b
            float r0 = r9.a
            defpackage.e11.e0(r10)
            goto L6a
        L22:
            defpackage.e11.e0(r10)
            float r10 = r9.e
            r3.n(r10)
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r7 = r9.f
            boolean r0 = eb7.c(r7, r5)
            if (r0 != 0) goto L89
            r0 = 0
            float r5 = r9.s
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L42
            r10 = 1065353216(0x3f800000, float:1.0)
        L40:
            r0 = r10
            goto L47
        L42:
            float r0 = r9.t
            float r10 = r10 - r0
            float r10 = r10 / r5
            goto L40
        L47:
            long r5 = r9.u
            long r5 = defpackage.qu1.i0(r5, r7, r0)
            ym r10 = r3.i
            r7 = 32
            long r7 = r5 >> r7
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            r9.a = r0
            r9.b = r5
            r9.c = r2
            java.lang.Object r10 = r10.f(r9, r8)
            if (r10 != r4) goto L6a
            goto L88
        L6a:
            ym r10 = r3.j
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r9.a = r0
            r9.b = r5
            r9.c = r1
            java.lang.Object r9 = r10.f(r9, r3)
            if (r9 != r4) goto L89
        L88:
            return r4
        L89:
            heb r9 = defpackage.heb.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
