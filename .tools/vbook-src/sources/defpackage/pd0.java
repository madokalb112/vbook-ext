package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pd0 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(ga1 ga1Var, String str, int i, int i2, lva lvaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = ga1Var;
        this.t = str;
        this.d = i;
        this.e = i2;
        this.s = lvaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                pd0 pd0Var = new pd0((qd0) this.s, (String) obj2, jt1Var);
                pd0Var.b = obj;
                return pd0Var;
            case 1:
                return new pd0((em5) obj2, jt1Var);
            default:
                return new pd0((ga1) this.b, (String) obj2, this.d, this.e, (lva) this.s, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((pd0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r1 == r6) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[LOOP:0: B:32:0x00c6->B:34:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:23:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ea -> B:85:0x01f0). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws defpackage.ab1 {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(qd0 qd0Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = qd0Var;
        this.t = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(em5 em5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = em5Var;
    }
}
