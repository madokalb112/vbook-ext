package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fqa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hra b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqa(hra hraVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = hraVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        hra hraVar = this.b;
        switch (i) {
            case 0:
                return new fqa(hraVar, jt1Var, 0);
            case 1:
                return new fqa(hraVar, jt1Var, 1);
            case 2:
                return new fqa(hraVar, jt1Var, 2);
            case 3:
                return new fqa(hraVar, jt1Var, 3);
            default:
                return new fqa(hraVar, jt1Var, 4);
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
                break;
            case 1:
                ((fqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((fqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((fqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((fqa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
