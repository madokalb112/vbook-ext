package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cf9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ df9 d;
    public final /* synthetic */ eb7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf9(boolean z, df9 df9Var, eb7 eb7Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.d = df9Var;
        this.e = eb7Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new cf9(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new cf9(this.c, this.d, this.e, jt1Var, 1);
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
        return ((cf9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r6.a(r14) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if (r6.a(r14) == r5) goto L51;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
