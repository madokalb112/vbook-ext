package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d extends om8 implements yb4 {
    public final /* synthetic */ int b;
    public int c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.b;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                d dVar = new d((gx3) this.e, (zn7) obj2, jt1Var, 0);
                dVar.d = obj;
                return dVar;
            case 1:
                d dVar2 = new d((jx1) this.e, (yb4) obj2, jt1Var, 1);
                dVar2.d = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((rg8) this.e, (y91) obj2, jt1Var, 2);
                dVar3.d = obj;
                return dVar3;
            case 3:
                d dVar4 = new d((tda) obj2, jt1Var, 3);
                dVar4.d = obj;
                return dVar4;
            case 4:
                d dVar5 = new d((a07) obj2, jt1Var, 4);
                dVar5.d = obj;
                return dVar5;
            case 5:
                d dVar6 = new d((ib4) obj2, jt1Var, 5);
                dVar6.e = obj;
                return dVar6;
            case 6:
                d dVar7 = new d((o19) this.e, (t09) obj2, jt1Var, 6);
                dVar7.d = obj;
                return dVar7;
            case 7:
                d dVar8 = new d((nx7) this.e, (rg8) obj2, jt1Var, 7);
                dVar8.d = obj;
                return dVar8;
            default:
                d dVar9 = new d((woa) obj2, jt1Var, 8);
                dVar9.d = obj;
                return dVar9;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((d) create((u1a) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0462 A[Catch: CancellationException -> 0x0449, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0449, blocks: (B:221:0x0462, B:224:0x0471, B:210:0x0445, B:215:0x0450), top: B:246:0x042a }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x048e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0212 -> B:102:0x0213). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x02c5 -> B:141:0x02c8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x035a -> B:168:0x035e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0479 -> B:219:0x045c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x048a -> B:219:0x045c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0144 -> B:58:0x0147). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.f = obj;
    }
}
