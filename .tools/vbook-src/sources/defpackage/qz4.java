package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qz4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st5 b;
    public int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz4(st5 st5Var, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.b = st5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        int i2 = this.d;
        st5 st5Var = this.b;
        switch (i) {
            case 0:
                return new qz4(st5Var, i2, jt1Var, 0);
            case 1:
                return new qz4(st5Var, this.c, i2, jt1Var);
            case 2:
                return new qz4(st5Var, i2, jt1Var, 2);
            case 3:
                return new qz4(st5Var, i2, jt1Var, 3);
            case 4:
                return new qz4(st5Var, i2, jt1Var, 4);
            default:
                return new qz4(st5Var, i2, jt1Var, 5);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 1:
                ((qz4) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((qz4) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (defpackage.pu1.v0(r9, r8, r11) == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        if (defpackage.pu1.v0(r9, r8, r11) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (defpackage.pu1.v0(r9, r8, r11) == r6) goto L62;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz4(st5 st5Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.b = st5Var;
        this.d = i;
    }
}
