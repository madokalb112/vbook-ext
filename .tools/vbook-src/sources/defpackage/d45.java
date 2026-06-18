package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d45 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public double d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d45(i45 i45Var, b21 b21Var, String str, double d, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 1;
        this.c = i45Var;
        this.e = b21Var;
        this.f = str;
        this.d = d;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new d45((i45) obj2, jt1Var, 0);
            case 1:
                return new d45((i45) this.c, (b21) this.e, (String) obj2, this.d, jt1Var);
            case 2:
                d45 d45Var = new d45((hra) obj2, jt1Var, 2);
                d45Var.c = obj;
                return d45Var;
            case 3:
                return new d45((hra) this.e, (c21) this.c, (String) obj2, this.d, jt1Var, 3);
            default:
                return new d45((h49) this.e, (ne3) this.c, (String) obj2, this.d, jt1Var, 4);
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
        return ((d45) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037f A[LOOP:5: B:124:0x0379->B:126:0x037f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x046f A[LOOP:4: B:163:0x046f->B:179:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d A[LOOP:1: B:83:0x022d->B:86:0x0249, LOOP_START, PHI: r17
  0x022d: PHI (r17v4 boolean) = (r17v3 boolean), (r17v5 boolean) binds: [B:82:0x022b, B:86:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024c  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d45.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d45(qtb qtbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.f = qtbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d45(qtb qtbVar, Object obj, String str, double d, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = qtbVar;
        this.c = obj;
        this.f = str;
        this.d = d;
    }
}
