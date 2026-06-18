package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hf1 extends o1a implements yb4 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(og ogVar, int i, nf1 nf1Var, lm9 lm9Var, v92 v92Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = ogVar;
        this.c = i;
        this.f = nf1Var;
        this.s = lm9Var;
        this.t = v92Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                hf1 hf1Var = new hf1((og) this.e, this.c, (nf1) this.f, (lm9) this.s, (v92) obj2, jt1Var);
                hf1Var.d = obj;
                return hf1Var;
            case 1:
                hf1 hf1Var2 = new hf1((cs3) obj2, jt1Var);
                hf1Var2.d = obj;
                return hf1Var2;
            default:
                hf1 hf1Var3 = new hf1((bh8) this.e, (ja5) this.f, this.c, (kta) this.s, (lta) obj2, jt1Var);
                hf1Var3.d = obj;
                return hf1Var3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((hf1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:24:0x0089, B:29:0x009b, B:82:0x01bc, B:84:0x01c2, B:32:0x00aa, B:79:0x019b, B:35:0x00b9, B:76:0x0184, B:38:0x00c8, B:73:0x016d, B:41:0x00db, B:59:0x012b, B:61:0x0130, B:63:0x0137, B:64:0x013c, B:65:0x0141, B:66:0x0142, B:68:0x0148, B:69:0x014f, B:55:0x0111), top: B:146:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:24:0x0089, B:29:0x009b, B:82:0x01bc, B:84:0x01c2, B:32:0x00aa, B:79:0x019b, B:35:0x00b9, B:76:0x0184, B:38:0x00c8, B:73:0x016d, B:41:0x00db, B:59:0x012b, B:61:0x0130, B:63:0x0137, B:64:0x013c, B:65:0x0141, B:66:0x0142, B:68:0x0148, B:69:0x014f, B:55:0x0111), top: B:146:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:24:0x0089, B:29:0x009b, B:82:0x01bc, B:84:0x01c2, B:32:0x00aa, B:79:0x019b, B:35:0x00b9, B:76:0x0184, B:38:0x00c8, B:73:0x016d, B:41:0x00db, B:59:0x012b, B:61:0x0130, B:63:0x0137, B:64:0x013c, B:65:0x0141, B:66:0x0142, B:68:0x0148, B:69:0x014f, B:55:0x0111), top: B:146:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(cs3 cs3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.t = cs3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(bh8 bh8Var, ja5 ja5Var, int i, kta ktaVar, lta ltaVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = bh8Var;
        this.f = ja5Var;
        this.c = i;
        this.s = ktaVar;
        this.t = ltaVar;
    }
}
