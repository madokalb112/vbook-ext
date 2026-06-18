package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u13 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ v13 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u13(v13 v13Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = v13Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        v13 v13Var = this.c;
        switch (i) {
            case 0:
                return new u13(v13Var, str, jt1Var, 0);
            case 1:
                return new u13(v13Var, str, jt1Var, 1);
            case 2:
                return new u13(v13Var, str, jt1Var, 2);
            case 3:
                return new u13(v13Var, str, jt1Var, 3);
            default:
                return new u13(v13Var, str, jt1Var, 4);
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
        return ((u13) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
