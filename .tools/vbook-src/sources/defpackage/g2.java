package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g2 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(hra hraVar, String str, String str2, bi5 bi5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = hraVar;
        this.v = str;
        this.w = str2;
        this.x = bi5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                return new g2((nk3) obj3, (hgb) obj2, jt1Var);
            default:
                return new g2((hra) this.u, (String) this.v, (String) obj3, (bi5) obj2, jt1Var);
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
        return ((g2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a5, code lost:
    
        if (r8.p(r46) != r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (((defpackage.xba) r0).n(wm9.p(), (java.lang.String) r46.v, (java.lang.String) r2, (defpackage.bi5) r1, r46) == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x036d, code lost:
    
        if (r1.p(r46) == r7) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031c A[Catch: all -> 0x031f, TRY_LEAVE, TryCatch #12 {all -> 0x031f, blocks: (B:131:0x0318, B:133:0x031c), top: B:187:0x0318 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034a A[Catch: all -> 0x034d, TRY_LEAVE, TryCatch #3 {all -> 0x034d, blocks: (B:148:0x0346, B:150:0x034a), top: B:176:0x0346 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [r07] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [r07] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(nk3 nk3Var, hgb hgbVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.w = nk3Var;
        this.x = hgbVar;
    }
}
