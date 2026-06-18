package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j47 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j47(boolean z, int i, pn2 pn2Var, int i2, vx1 vx1Var, ww8 ww8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = z;
        this.b = i;
        this.e = pn2Var;
        this.d = i2;
        this.f = vx1Var;
        this.s = ww8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new j47(this.c, this.b, (pn2) this.e, this.d, (vx1) this.f, (ww8) this.s, jt1Var);
            default:
                return new j47(this.c, this.d, (a07) this.e, (a07) this.f, (a07) this.s, jt1Var);
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
                ((j47) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            default:
                return ((j47) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        if (defpackage.ym.b(r0, r2, r2, r3, r23, 4) == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011e, code lost:
    
        if (defpackage.ym.b(r0, r2, r2, r3, r23, 4) == r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015f, code lost:
    
        if (defpackage.ym.b(r0, r2, r3, r3, r23, 4) == r11) goto L34;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j47(boolean z, int i, a07 a07Var, a07 a07Var2, a07 a07Var3, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = z;
        this.d = i;
        this.e = a07Var;
        this.f = a07Var2;
        this.s = a07Var3;
    }
}
