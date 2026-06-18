package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vpa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hra b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpa(hra hraVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.b = hraVar;
        this.c = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        hra hraVar = this.b;
        switch (i) {
            case 0:
                return new vpa(hraVar, jt1Var, 0);
            case 1:
                return new vpa(hraVar, this.c, jt1Var);
            case 2:
                return new vpa(hraVar, jt1Var, 2);
            case 3:
                return new vpa(hraVar, jt1Var, 3);
            case 4:
                return new vpa(hraVar, jt1Var, 4);
            case 5:
                return new vpa(hraVar, jt1Var, 5);
            case 6:
                return new vpa(hraVar, jt1Var, 6);
            case 7:
                return new vpa(hraVar, jt1Var, 7);
            case 8:
                return new vpa(hraVar, jt1Var, 8);
            case 9:
                return new vpa(hraVar, jt1Var, 9);
            case 10:
                return new vpa(hraVar, jt1Var, 10);
            case 11:
                return new vpa(hraVar, jt1Var, 11);
            case 12:
                return new vpa(hraVar, jt1Var, 12);
            case 13:
                return new vpa(hraVar, jt1Var, 13);
            case 14:
                return new vpa(hraVar, jt1Var, 14);
            case 15:
                return new vpa(hraVar, jt1Var, 15);
            case 16:
                return new vpa(hraVar, jt1Var, 16);
            default:
                return new vpa(hraVar, jt1Var, 17);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 1:
                ((vpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 14:
                ((vpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 15:
                ((vpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return ((vpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0399, code lost:
    
        if (r11.H0(true, r45) != r10) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04dc, code lost:
    
        if (r0 == r10) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a5 A[LOOP:2: B:193:0x03a5->B:301:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpa(hra hraVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = hraVar;
    }
}
