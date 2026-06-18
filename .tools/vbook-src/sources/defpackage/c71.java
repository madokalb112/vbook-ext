package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c71 extends o1a implements yb4 {
    public Object a;
    public e71 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e71 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String s;
    public final /* synthetic */ bi5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c71(e71 e71Var, long j, String str, bi5 bi5Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = e71Var;
        this.f = j;
        this.s = str;
        this.t = bi5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        c71 c71Var = new c71(this.e, this.f, this.s, this.t, jt1Var);
        c71Var.d = obj;
        return c71Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((c71) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (defpackage.e71.k(r6, (defpackage.fv1) r0, r43) == r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
