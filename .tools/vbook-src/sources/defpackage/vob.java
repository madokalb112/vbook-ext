package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vob extends om8 implements yb4 {
    public ux7 b;
    public ng8 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ je4 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ a07 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vob(je4 je4Var, a07 a07Var, kb4 kb4Var, kb4 kb4Var2, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = je4Var;
        this.s = a07Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        vob vobVar = new vob(this.f, this.s, this.t, this.u, this.v, jt1Var);
        vobVar.e = obj;
        return vobVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((vob) create((u1a) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        if (m33.j(r2, r10, r15, r14) == r9) goto L36;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vob.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
