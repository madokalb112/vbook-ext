package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vla extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fma c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vla(fma fmaVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = fmaVar;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        fma fmaVar = this.c;
        switch (i) {
            case 0:
                return new vla(fmaVar, str, jt1Var, 0);
            case 1:
                return new vla(fmaVar, str, jt1Var, 1);
            case 2:
                return new vla(fmaVar, str, jt1Var, 2);
            case 3:
                return new vla(fmaVar, str, jt1Var, 3);
            default:
                return new vla(fmaVar, str, jt1Var, 4);
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
        return ((vla) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a1, code lost:
    
        if (r15 != r12) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r13.t(r16) == r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r15 != r12) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
    
        if (r13.r(r16) != r12) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vla.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
