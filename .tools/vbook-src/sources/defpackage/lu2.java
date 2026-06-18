package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lu2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(kb4 kb4Var, rd7 rd7Var, String str, lm8 lm8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.w = kb4Var;
        this.x = rd7Var;
        this.y = str;
        this.z = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                lu2 lu2Var = new lu2((nu2) obj2, jt1Var, 0);
                lu2Var.v = obj;
                return lu2Var;
            case 1:
                lu2 lu2Var2 = new lu2((kb4) this.w, (rd7) this.x, (String) this.y, (lm8) obj2, jt1Var);
                lu2Var2.s = obj;
                return lu2Var2;
            case 2:
                return new lu2((u98) obj2, jt1Var, 2);
            default:
                lu2 lu2Var3 = new lu2(jt1Var, (hra) obj2, (String) this.y);
                lu2Var3.s = obj;
                return lu2Var3;
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
        return ((lu2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x03a7 -> B:81:0x020e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0642 -> B:153:0x0645). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x07fe -> B:162:0x06b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fd -> B:233:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a5 -> B:41:0x0105). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 2162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(jt1 jt1Var, hra hraVar, String str) {
        super(2, jt1Var);
        this.a = 3;
        this.y = str;
        this.z = hraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu2(qtb qtbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.z = qtbVar;
    }
}
