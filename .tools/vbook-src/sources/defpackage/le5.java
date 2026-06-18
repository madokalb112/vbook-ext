package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class le5 extends om8 implements yb4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le5(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.e = obj;
        this.f = obj2;
        this.s = obj3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.b;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                le5 le5Var = new le5((pe5) obj2, jt1Var, 0);
                le5Var.d = obj;
                return le5Var;
            case 1:
                le5 le5Var2 = new le5((zk7) obj2, jt1Var, 1);
                le5Var2.d = obj;
                return le5Var2;
            case 2:
                le5 le5Var3 = new le5((vx1) this.e, (z6c) this.f, (z18) obj2, jt1Var, 2);
                le5Var3.d = obj;
                return le5Var3;
            case 3:
                le5 le5Var4 = new le5((og) this.e, (vv6) this.f, (tda) obj2, jt1Var, 3);
                le5Var4.d = obj;
                return le5Var4;
            case 4:
                le5 le5Var5 = new le5((qx9) obj2, jt1Var, 4);
                le5Var5.d = obj;
                return le5Var5;
            default:
                le5 le5Var6 = new le5((co6) this.e, (jca) this.f, (co6) obj2, jt1Var, 5);
                le5Var6.d = obj;
                return le5Var6;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((le5) create((u1a) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (sg9.d(r1, r20) == r13) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r2 != r13) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x031a, code lost:
    
        if (r4 != r13) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0411, code lost:
    
        if (defpackage.y86.R(r3, r2, r1, r5, r20) != r13) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0427, code lost:
    
        if (defpackage.y86.l0(r3, r11, r5, r20) == r13) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0433, code lost:
    
        if (defpackage.y86.s(r3, r11, r5, r1, r20) == r13) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04ca, code lost:
    
        if (r2 == r13) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04ec, code lost:
    
        if (r1 == r13) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0291, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        if (r5 == r13) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
    
        if (r5 == r13) goto L184;
     */
    /* JADX WARN: Path cross not found for [B:69:0x0170, B:75:0x0193], limit reached: 367 */
    /* JADX WARN: Path cross not found for [B:78:0x0198, B:79:0x019a], limit reached: 367 */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x058f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:18:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x031a -> B:185:0x031e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x04ec -> B:281:0x04f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:312:0x0591 -> B:297:0x0547). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01ac -> B:84:0x01b0). Please report as a decompilation issue!!! */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le5(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.b = i;
        this.s = obj;
    }
}
