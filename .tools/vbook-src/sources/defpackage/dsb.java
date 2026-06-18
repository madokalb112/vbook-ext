package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dsb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h49 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsb(h49 h49Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = h49Var;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        h49 h49Var = this.b;
        switch (i) {
            case 0:
                return new dsb(h49Var, this.c, jt1Var, 0);
            case 1:
                return new dsb(h49Var, this.c, jt1Var, 1);
            case 2:
                return new dsb(h49Var, this.c, jt1Var, 2);
            case 3:
                return new dsb(h49Var, this.c, jt1Var, 3);
            case 4:
                return new dsb(h49Var, this.c, jt1Var, 4);
            case 5:
                return new dsb(h49Var, jt1Var, 5);
            case 6:
                return new dsb(h49Var, jt1Var, 6);
            case 7:
                return new dsb(h49Var, jt1Var, 7);
            default:
                return new dsb(h49Var, jt1Var, 8);
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
                ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((dsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0276, code lost:
    
        if (r2.o(r4, false, r31) == r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
    
        if (((defpackage.b24) r2).a(r0, r31) != r7) goto L54;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsb(h49 h49Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = h49Var;
    }
}
