package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vt extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt(zt ztVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ztVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        zt ztVar = this.c;
        switch (i) {
            case 0:
                return new vt(ztVar, jt1Var, 0);
            case 1:
                return new vt(ztVar, jt1Var, 1);
            case 2:
                vt vtVar = new vt(ztVar, jt1Var, 2);
                vtVar.b = ((Number) obj).intValue();
                return vtVar;
            case 3:
                vt vtVar2 = new vt(ztVar, jt1Var, 3);
                vtVar2.b = ((Number) obj).intValue();
                return vtVar2;
            default:
                vt vtVar3 = new vt(ztVar, jt1Var, 4);
                vtVar3.b = ((Number) obj).intValue();
                return vtVar3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((vt) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 3:
                ((vt) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
            default:
                ((vt) create(Integer.valueOf(((Number) obj).intValue()), (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
    
        if (r6 == r4) goto L48;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
