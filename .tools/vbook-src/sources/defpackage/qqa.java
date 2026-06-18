package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qqa extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public final /* synthetic */ hra d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqa(int i, int i2, jt1 jt1Var, hra hraVar) {
        super(2, jt1Var);
        this.d = hraVar;
        this.c = i;
        this.e = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        int i2 = this.e;
        hra hraVar = this.d;
        switch (i) {
            case 0:
                return new qqa(this.c, i2, jt1Var, hraVar);
            default:
                return new qqa(hraVar, i2, jt1Var);
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
        return ((qqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r0 != r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        if (r0 == r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[PHI: r3
  0x00c6: PHI (r3v16 int) = (r3v15 int), (r3v22 int) binds: [B:27:0x00c3, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqa(hra hraVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = hraVar;
        this.e = i;
    }
}
