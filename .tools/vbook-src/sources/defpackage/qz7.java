package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qz7 extends om8 implements yb4 {
    public final /* synthetic */ int b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz7(long j, qg8 qg8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = 3;
        this.c = j;
        this.f = qg8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.b;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                qz7 qz7Var = new qz7((ux7) obj2, jt1Var, 0);
                qz7Var.e = obj;
                return qz7Var;
            case 1:
                qz7 qz7Var2 = new qz7((ux7) obj2, jt1Var, 1);
                qz7Var2.e = obj;
                return qz7Var2;
            case 2:
                qz7 qz7Var3 = new qz7((ux7) obj2, jt1Var, 2);
                qz7Var3.e = obj;
                return qz7Var3;
            default:
                qz7 qz7Var4 = new qz7(this.c, (qg8) obj2, jt1Var);
                qz7Var4.e = obj;
                return qz7Var4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        heb hebVar = heb.a;
        u1a u1aVar = (u1a) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((qz7) create(u1aVar, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a2 -> B:32:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e2 -> B:44:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0122 -> B:56:0x0126). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz7(ux7 ux7Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.f = ux7Var;
    }
}
