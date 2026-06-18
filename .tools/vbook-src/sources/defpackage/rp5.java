package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rp5 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ br9 d;
    public float e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp5(jx8 jx8Var, int i, br9 br9Var, float f, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.f = jx8Var;
        this.c = i;
        this.d = br9Var;
        this.e = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new rp5((st5) this.f, this.c, this.d, this.e, jt1Var, 0);
            case 1:
                return new rp5((wq5) this.f, this.c, this.d, this.e, jt1Var, 1);
            case 2:
                return new rp5((uu5) this.f, this.c, this.d, this.e, jt1Var, 2);
            default:
                return new rp5((ym) this.f, this.d, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                return ((rp5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 1:
                return ((rp5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 2:
                return ((rp5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            default:
                ((rp5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e1 -> B:28:0x00e4). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp5(ym ymVar, a07 a07Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.f = ymVar;
        this.d = a07Var;
    }
}
