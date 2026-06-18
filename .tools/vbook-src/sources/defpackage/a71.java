package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a71 extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object s;
    public Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(hra hraVar, int i, String str, String str2, String str3, int i2, int i3, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = hraVar;
        this.d = i;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                a71 a71Var = new a71(this.f, (e71) obj2, jt1Var);
                a71Var.s = obj;
                return a71Var;
            case 1:
                return new a71((ir2) obj2, jt1Var);
            case 2:
                return new a71((bp) this.b, (uka) this.s, (kk) this.t, (List) obj2, this.d, this.e, this.f, jt1Var);
            default:
                return new a71((hra) this.b, this.d, (String) this.s, (String) this.t, (String) obj2, this.e, this.f, jt1Var);
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
        return ((a71) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r6 == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r2 == r8) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d7 A[LOOP:0: B:121:0x02d7->B:137:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9 A[PHI: r10
  0x00f9: PHI (r10v9 vm3) = (r10v6 vm3), (r10v12 vm3) binds: [B:39:0x00e6, B:43:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [int] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013d -> B:55:0x0141). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a71.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(bp bpVar, uka ukaVar, kk kkVar, List list, int i, int i2, int i3, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = bpVar;
        this.s = ukaVar;
        this.t = kkVar;
        this.u = list;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(ir2 ir2Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = ir2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(int i, e71 e71Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = e71Var;
        this.f = i;
    }
}
