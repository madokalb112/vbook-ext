package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v42 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public /* synthetic */ Object d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(r13 r13Var, String str, int i, int i2, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 3;
        this.f = r13Var;
        this.d = str;
        this.b = i;
        this.e = i2;
        this.c = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                v42 v42Var = new v42((a52) this.d, this.e, jt1Var, 0);
                v42Var.c = ((Boolean) obj).booleanValue();
                return v42Var;
            case 1:
                v42 v42Var2 = new v42((a52) this.d, this.e, jt1Var, 1);
                v42Var2.c = ((Boolean) obj).booleanValue();
                return v42Var2;
            case 2:
                v42 v42Var3 = new v42(2, jt1Var);
                v42Var3.d = obj;
                return v42Var3;
            default:
                return new v42((r13) this.f, (String) this.d, this.b, this.e, this.c, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((v42) create(bool, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((v42) create(bool2, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((v42) create((gv4) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                ((v42) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(1:(1:(8:10|104|11|32|36|(2:41|(1:(1:50)(1:49))(1:45))(1:40)|51|52)(2:13|53))(1:14))(2:15|(2:17|110)(2:18|(1:113)(4:23|(1:26)|30|112)))|27|108|28|(6:31|32|36|(2:41|(1:(2:47|50)(0))(0))(0)|51|52)|30|112) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
    
        r12 = r13;
        r2 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(a52 a52Var, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.d = a52Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(int i, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = 2;
    }
}
