package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e45 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i45 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e45(int i, jt1 jt1Var, i45 i45Var) {
        super(2, jt1Var);
        this.a = i;
        this.b = i45Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        i45 i45Var = this.b;
        switch (i) {
            case 0:
                return new e45(0, jt1Var, i45Var);
            case 1:
                return new e45(1, jt1Var, i45Var);
            default:
                return new e45(2, jt1Var, i45Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((e45) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((e45) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((e45) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e45.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
