package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rqa extends o1a implements yb4 {
    public t07 a;
    public hra b;
    public int c;
    public int d;
    public int e;
    public final /* synthetic */ hra f;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqa(int i, int i2, jt1 jt1Var, hra hraVar) {
        super(2, jt1Var);
        this.f = hraVar;
        this.s = i;
        this.t = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new rqa(this.s, this.t, jt1Var, this.f);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((rqa) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:12:0x0039, B:14:0x004b, B:17:0x0058, B:20:0x0067, B:25:0x007d, B:27:0x0081, B:29:0x0085, B:31:0x00ab, B:33:0x00af, B:35:0x00b6, B:39:0x00be, B:42:0x00c8, B:72:0x011b, B:46:0x00d1, B:49:0x00d7, B:52:0x00de, B:54:0x00e1, B:57:0x00ea, B:59:0x00f6, B:60:0x00f8, B:63:0x0102, B:67:0x0109, B:70:0x010f, B:73:0x012c), top: B:78:0x0039 }] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
