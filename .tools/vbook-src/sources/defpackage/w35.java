package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w35 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public long b;
    public int c;
    public /* synthetic */ long d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w35(Object obj, long j, long j2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.b = j;
        this.d = j2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new w35((i45) obj2, this.b, this.d, jt1Var, 0);
            case 1:
                w35 w35Var = new w35((gy8) obj2, jt1Var);
                w35Var.d = ((wlb) obj).a;
                return w35Var;
            case 2:
                return new w35((hra) obj2, this.b, this.d, jt1Var, 2);
            case 3:
                return new w35((k9b) obj2, this.b, this.d, jt1Var, 3);
            default:
                return new w35((h49) obj2, this.b, this.d, jt1Var, 4);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 1:
                long j = ((wlb) obj).a;
                w35 w35Var = new w35((gy8) this.e, (jt1) obj2);
                w35Var.d = j;
                break;
        }
        return ((w35) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w35.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w35(gy8 gy8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.e = gy8Var;
    }
}
