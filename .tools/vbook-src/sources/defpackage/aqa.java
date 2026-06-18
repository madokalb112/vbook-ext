package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aqa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public a64 b;
    public int c;
    public final /* synthetic */ hra d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aqa(hra hraVar, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = hraVar;
        this.e = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new aqa(this.d, this.e, jt1Var, 0);
            default:
                return new aqa(this.d, this.e, jt1Var, 1);
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
        return ((aqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
    
        if (r4 == r10) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5 A[LOOP:3: B:60:0x01d5->B:76:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2 A[LOOP:4: B:64:0x01f2->B:78:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
