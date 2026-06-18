package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class omb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pmb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omb(boolean z, pmb pmbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = z;
        this.d = pmbVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        pmb pmbVar = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                return new omb(z, pmbVar, jt1Var, 0);
            default:
                return new omb(z, pmbVar, jt1Var, 1);
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
        return ((omb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r0 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r0 == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r0 == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        if (r0 == r8) goto L37;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
