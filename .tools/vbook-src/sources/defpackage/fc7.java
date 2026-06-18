package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fc7 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public final /* synthetic */ Object v;
    public Object w;
    public final /* synthetic */ Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc7(hra hraVar, String str, String str2, String str3, bi5 bi5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = hraVar;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = bi5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.x;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fc7 fc7Var = new fc7((mr0) obj2, (jx1) this.t, (fx3) obj3, jt1Var);
                fc7Var.b = obj;
                return fc7Var;
            default:
                return new fc7((hra) this.u, (String) obj3, (String) this.w, (String) obj2, (bi5) this.y, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((fc7) create((i3c) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((fc7) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (((defpackage.xba) r0).n((java.lang.String) r2, (java.lang.String) r46.w, (java.lang.String) r1, r10, r46) == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a0, code lost:
    
        if (r14.c(r46) != r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:21:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a0 -> B:32:0x010b). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc7(mr0 mr0Var, jx1 jx1Var, fx3 fx3Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.x = mr0Var;
        this.t = jx1Var;
        this.v = fx3Var;
    }
}
