package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class em extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ long c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em(long j, Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = j;
        this.d = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new em((gm) this.d, this.c, jt1Var, 0);
            case 1:
                em emVar = new em(this.c, jt1Var);
                emVar.d = obj;
                return emVar;
            case 2:
                return new em((gj8) this.d, this.c, jt1Var, 2);
            case 3:
                return new em((fo8) this.d, this.c, jt1Var, 3);
            case 4:
                return new em((ym) this.d, this.c, jt1Var, 4);
            case 5:
                return new em(this.c, (u1a) this.d, jt1Var, 5);
            case 6:
                return new em((c1b) this.d, this.c, jt1Var, 6);
            default:
                return new em(this.c, (zob) this.d, jt1Var, 7);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 1:
                ((em) create((o38) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((em) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01b7 -> B:86:0x019f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em(Object obj, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = j;
    }
}
