package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lq8 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq8(qsb qsbVar, yb4 yb4Var, ib4 ib4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 6;
        this.c = qsbVar;
        this.e = yb4Var;
        this.d = ib4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                lq8 lq8Var = new lq8((bi1) this.d, (yb4) obj2, jt1Var, 0);
                lq8Var.c = obj;
                return lq8Var;
            case 1:
                return new lq8((fs8) this.c, (kb4) this.d, (ae5) obj2, jt1Var, 1);
            case 2:
                lq8 lq8Var2 = new lq8((r33) this.d, (gy8) obj2, jt1Var, 2);
                lq8Var2.c = obj;
                return lq8Var2;
            case 3:
                lq8 lq8Var3 = new lq8((gy8) this.d, (yb4) obj2, jt1Var, 3);
                lq8Var3.c = obj;
                return lq8Var3;
            case 4:
                lq8 lq8Var4 = new lq8((br9) this.d, (ym) obj2, jt1Var, 4);
                lq8Var4.c = obj;
                return lq8Var4;
            case 5:
                lq8 lq8Var5 = new lq8((h49) obj2, jt1Var);
                lq8Var5.c = obj;
                return lq8Var5;
            case 6:
                return new lq8((qsb) this.c, (yb4) obj2, (ib4) this.d, jt1Var);
            case 7:
                return new lq8((lva) this.d, (a07) obj2, jt1Var, 7);
            case 8:
                lq8 lq8Var6 = new lq8((yb9) this.d, (String) obj2, jt1Var, 8);
                lq8Var6.c = obj;
                return lq8Var6;
            case 9:
                return new lq8((zx7) this.c, (yy6) this.d, (ii9) obj2, jt1Var, 9);
            case 10:
                lq8 lq8Var7 = new lq8((jx1) this.d, (b24) obj2, jt1Var, 10);
                lq8Var7.c = obj;
                return lq8Var7;
            case 11:
                lq8 lq8Var8 = new lq8((hv9) this.d, (lf2) obj2, jt1Var, 11);
                lq8Var8.c = obj;
                return lq8Var8;
            case 12:
                lq8 lq8Var9 = new lq8((pv9) this.d, (lf2) obj2, jt1Var, 12);
                lq8Var9.c = obj;
                return lq8Var9;
            case 13:
                return new lq8((m8) this.d, (String) obj2, jt1Var, 13);
            case 14:
                lq8 lq8Var10 = new lq8((p5a) this.d, (vvb) obj2, jt1Var, 14);
                lq8Var10.c = obj;
                return lq8Var10;
            case 15:
                return new lq8((bga) this.c, (a28) this.d, (ux7) obj2, jt1Var, 15);
            case 16:
                lq8 lq8Var11 = new lq8((yd5) this.d, (yb4) obj2, jt1Var, 16);
                lq8Var11.c = obj;
                return lq8Var11;
            case 17:
                return new lq8((hda) this.d, (ada) obj2, jt1Var, 17);
            case 18:
                return new lq8((gja) this.c, (String) this.d, (String) obj2, jt1Var, 18);
            case 19:
                return new lq8((gja) this.c, (bi5) this.d, (lm8) obj2, jt1Var, 19);
            case 20:
                return new lq8((hja) this.c, (String) this.d, (String) obj2, jt1Var, 20);
            case 21:
                return new lq8((hja) this.c, (bi5) this.d, (lm8) obj2, jt1Var, 21);
            case 22:
                return new lq8((lja) this.c, (String) this.d, (String) obj2, jt1Var, 22);
            case 23:
                return new lq8((lja) this.c, (bi5) this.d, (lm8) obj2, jt1Var, 23);
            case 24:
                return new lq8((nja) this.c, (String) this.d, (String) obj2, jt1Var, 24);
            case 25:
                return new lq8((nja) this.c, (bi5) this.d, (lm8) obj2, jt1Var, 25);
            case 26:
                return new lq8((ym) this.c, (a07) this.d, (a07) obj2, jt1Var, 26);
            case 27:
                return new lq8((ec) this.d, (a07) obj2, jt1Var, 27);
            case 28:
                return new lq8((hra) this.c, (yia) this.d, (yia) obj2, jt1Var, 28);
            default:
                return new lq8((csa) this.d, (String) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 6:
                ((lq8) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
        }
        return ((lq8) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x071b, code lost:
    
        if (r0 == r10) goto L344;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq8(h49 h49Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.e = h49Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq8(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq8(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
