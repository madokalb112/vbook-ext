package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tl0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(int i, String str, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 11;
        this.b = i;
        this.d = str;
        this.c = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new tl0((ul0) obj2, this.c, jt1Var, 0);
            case 1:
                return new tl0((dw2) obj2, this.c, jt1Var, 1);
            case 2:
                return new tl0((sr3) obj2, this.c, jt1Var, 2);
            case 3:
                return new tl0((vo4) obj2, this.c, jt1Var, 3);
            case 4:
                return new tl0((i45) obj2, this.c, jt1Var, 4);
            case 5:
                return new tl0((ws5) obj2, this.c, jt1Var, 5);
            case 6:
                return new tl0((uu5) obj2, this.b, this.c, jt1Var);
            case 7:
                return new tl0((ww8) obj2, this.c, jt1Var, 7);
            case 8:
                return new tl0((kx8) obj2, this.c, jt1Var, 8);
            case 9:
                return new tl0((df9) obj2, jt1Var);
            case 10:
                return new tl0((t4b) obj2, this.c, jt1Var, 10);
            case 11:
                return new tl0(this.b, (String) obj2, this.c, jt1Var);
            default:
                return new tl0((h49) obj2, this.c, jt1Var, 12);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 6:
                ((tl0) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((tl0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(uu5 uu5Var, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 6;
        this.d = uu5Var;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl0(df9 df9Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 9;
        this.d = df9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl0(Object obj, int i, jt1 jt1Var, int i2) {
        super(2, jt1Var);
        this.a = i2;
        this.d = obj;
        this.c = i;
    }
}
