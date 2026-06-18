package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b45 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ qtb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b45(qtb qtbVar, int i, float f, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.f = qtbVar;
        this.d = i;
        this.e = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new b45((i45) this.f, this.d, this.e, jt1Var, 0);
            default:
                return new b45((hra) this.f, this.d, this.e, jt1Var, 1);
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
        return ((b45) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r0 != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
    
        if (r0 != r6) goto L67;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b45.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
