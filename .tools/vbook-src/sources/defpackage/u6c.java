package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u6c extends om8 implements yb4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ sbb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6c(sbb sbbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.e = sbbVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.b;
        sbb sbbVar = this.e;
        switch (i) {
            case 0:
                u6c u6cVar = new u6c(sbbVar, jt1Var, 0);
                u6cVar.d = obj;
                return u6cVar;
            default:
                u6c u6cVar2 = new u6c(sbbVar, jt1Var, 1);
                u6cVar2.d = obj;
                return u6cVar2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        heb hebVar = heb.a;
        u1a u1aVar = (u1a) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((u6c) create(u1aVar, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: ox7 -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {ox7 -> 0x009c, blocks: (B:10:0x0022, B:33:0x0083), top: B:51:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
