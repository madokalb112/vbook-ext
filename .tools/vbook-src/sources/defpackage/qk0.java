package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qk0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(jt1 jt1Var, kb4 kb4Var, dp8 dp8Var, boolean z) {
        super(2, jt1Var);
        this.a = 1;
        this.d = dp8Var;
        this.c = z;
        this.e = kb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                qk0 qk0Var = new qk0((rk0) obj2, z, jt1Var, 0);
                qk0Var.d = obj;
                return qk0Var;
            case 1:
                return new qk0(jt1Var, (kb4) obj2, (dp8) this.d, z);
            case 2:
                return new qk0((rpa) this.d, this.c, (String) obj2, jt1Var, 2);
            case 3:
                return new qk0((hra) this.d, this.c, (String) obj2, jt1Var, 3);
            case 4:
                return new qk0((hra) obj2, z, jt1Var, 4);
            default:
                return new qk0(z, (a07) this.d, (rx8) obj2, jt1Var);
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
        return ((qk0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk0(qtb qtbVar, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = qtbVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qk0(qtb qtbVar, boolean z, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = qtbVar;
        this.e = str;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk0(boolean z, a07 a07Var, rx8 rx8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.c = z;
        this.d = a07Var;
        this.e = rx8Var;
    }
}
