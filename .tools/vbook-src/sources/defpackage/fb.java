package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fb extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new fb((ob) this.d, (zb4) obj, jt1Var, 0);
            case 1:
                return new fb((pb) this.d, (zb4) obj, jt1Var, 1);
            case 2:
                return new fb((gk) this.d, (rca) obj, jt1Var, 2);
            case 3:
                return new fb((qd0) this.d, (String) obj, jt1Var, 3);
            case 4:
                return new fb((re0) this.d, (qe0) obj, jt1Var, 4);
            case 5:
                return new fb((a52) obj, jt1Var, 5);
            case 6:
                return new fb((rw3) obj, jt1Var, 6);
            case 7:
                return new fb((c24) this.d, (rg8) obj, jt1Var, 7);
            case 8:
                return new fb((owb) this.d, (String) obj, jt1Var, 8);
            case 9:
                return new fb((yk4) this.d, (owb) obj, jt1Var, 9);
            case 10:
                return new fb((h28) this.d, (String) obj, jt1Var, 10);
            default:
                return new fb((lf2) this.d, (ql8) obj, jt1Var, 11);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((fb) create(jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:13:0x004a, B:15:0x0052, B:20:0x005a), top: B:291:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v21, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r4v0, types: [heb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.io.Closeable] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb(Object obj, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
