package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v6c extends om8 implements yb4 {
    public ux7 b;
    public qg8 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n7c f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ co6 t;
    public final /* synthetic */ nx9 u;
    public final /* synthetic */ b18 v;
    public final /* synthetic */ nga w;
    public final /* synthetic */ mob x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6c(n7c n7cVar, a07 a07Var, co6 co6Var, nx9 nx9Var, b18 b18Var, nga ngaVar, mob mobVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = n7cVar;
        this.s = a07Var;
        this.t = co6Var;
        this.u = nx9Var;
        this.v = b18Var;
        this.w = ngaVar;
        this.x = mobVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        v6c v6cVar = new v6c(this.f, this.s, this.t, this.u, this.v, this.w, this.x, jt1Var);
        v6cVar.e = obj;
        return v6cVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((v6c) create((u1a) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        if (r14 == r9) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
