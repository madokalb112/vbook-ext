package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ap4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap4(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.t = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                ap4 ap4Var = new ap4((bp4) obj2, jt1Var, 0);
                ap4Var.s = obj;
                return ap4Var;
            default:
                ap4 ap4Var2 = new ap4((hk7) obj2, jt1Var, 1);
                ap4Var2.s = obj;
                return ap4Var2;
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
        return ((ap4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
    
        if (defpackage.pu1.q0(r3, r14, false, r25) == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b7, code lost:
    
        if (defpackage.pu1.q0(r3, r14, false, r25) == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02df, code lost:
    
        if (r7.l(false, r12) != r9) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02cb A[PHI: r0 r1 r2 r3 r5 r12 r19
  0x02cb: PHI (r0v3 vx1) = (r0v4 vx1), (r0v2 vx1) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r1v1 float) = (r1v3 float), (r1v9 float) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r2v2 float) = (r2v4 float), (r2v16 float) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r3v0 float) = (r3v2 float), (r3v15 float) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r5v1 float) = (r5v2 float), (r5v9 float) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r12v1 eb7) = (r12v2 eb7), (r12v8 eb7) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]
  0x02cb: PHI (r19v0 cn7) = (r19v1 cn7), (r19v3 cn7) binds: [B:81:0x02c8, B:61:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e8  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0101 -> B:31:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0119 -> B:31:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x019d -> B:47:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01b7 -> B:47:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x02df -> B:59:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x02e8 -> B:66:0x0226). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
