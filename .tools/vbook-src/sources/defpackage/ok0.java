package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ok0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rk0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(rk0 rk0Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = rk0Var;
        this.e = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                ok0 ok0Var = new ok0(this.d, this.e, jt1Var, 0);
                ok0Var.c = obj;
                return ok0Var;
            default:
                ok0 ok0Var2 = new ok0(this.d, this.e, jt1Var, 1);
                ok0Var2.c = obj;
                return ok0Var2;
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
        return ((ok0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (defpackage.vm7.K(r5, r19) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014e, code lost:
    
        if (defpackage.vm7.K(r5, r19) == r6) goto L50;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
