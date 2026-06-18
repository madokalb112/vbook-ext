package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z42 extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z42(boolean z, pkb pkbVar, yn7 yn7Var, lm8 lm8Var, String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = z;
        this.e = pkbVar;
        this.f = yn7Var;
        this.s = lm8Var;
        this.t = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.t;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                z42 z42Var = new z42((pg8) obj3, (a52) obj2, this.s, this.d, jt1Var);
                z42Var.c = obj;
                return z42Var;
            default:
                z42 z42Var2 = new z42(this.d, (pkb) this.e, (yn7) obj3, (lm8) this.s, (String) obj2, jt1Var);
                z42Var2.c = obj;
                return z42Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((z42) create((h3c) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((z42) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z42(pg8 pg8Var, a52 a52Var, Object obj, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = pg8Var;
        this.t = a52Var;
        this.s = obj;
        this.d = z;
    }
}
