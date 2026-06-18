package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ju0 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju0(Object obj, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ju0((oq9) obj, jt1Var, 0);
            case 1:
                return new ju0((ka9) obj, jt1Var, 1);
            case 2:
                return new ju0((x42) obj, jt1Var, 2);
            case 3:
                return new ju0((kb4) obj, jt1Var, 3);
            case 4:
                return new ju0((o19) obj, jt1Var, 4);
            default:
                return new ju0((kga) obj, jt1Var, 5);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((ju0) create(jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r10 == r3) goto L23;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
