package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qt0 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(ut0 ut0Var, bv0 bv0Var, jt0 jt0Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = ut0Var;
        this.s = bv0Var;
        this.w = jt0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new qt0((ut0) this.u, (bv0) this.s, (jt0) obj2, jt1Var);
            case 1:
                qt0 qt0Var = new qt0((j07) this.u, (sb5) this.v, (kb4) obj2, jt1Var);
                qt0Var.t = obj;
                return qt0Var;
            default:
                return new qt0((rab) this.v, (Map) obj2, jt1Var);
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
        return ((qt0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:139|(1:207)|140|141|203|142|(6:156|145|157|158|123|(4:125|127|167|(0)(0))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:212|133|192|134|135|210|136|(7:139|207|140|141|203|142|(6:156|145|157|158|123|(4:125|127|167|(0)(0))(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0393, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0394, code lost:
    
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0399, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x039b, code lost:
    
        r6 = r3;
        r12 = r5;
        r15 = r13;
        r13 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        if (r1 != r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015f, code lost:
    
        if (r1 == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032c A[Catch: all -> 0x0320, TryCatch #1 {all -> 0x0320, blocks: (B:157:0x03af, B:123:0x0326, B:125:0x032c, B:127:0x0332, B:129:0x0338, B:132:0x034f, B:165:0x03bd, B:166:0x03c0, B:167:0x03c1, B:175:0x03e5, B:118:0x031a, B:163:0x03bb), top: B:194:0x02a5, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c1 A[Catch: all -> 0x0320, TRY_LEAVE, TryCatch #1 {all -> 0x0320, blocks: (B:157:0x03af, B:123:0x0326, B:125:0x032c, B:127:0x0332, B:129:0x0338, B:132:0x034f, B:165:0x03bd, B:166:0x03c0, B:167:0x03c1, B:175:0x03e5, B:118:0x031a, B:163:0x03bb), top: B:194:0x02a5, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e5 A[Catch: all -> 0x0320, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0320, blocks: (B:157:0x03af, B:123:0x0326, B:125:0x032c, B:127:0x0332, B:129:0x0338, B:132:0x034f, B:165:0x03bd, B:166:0x03c0, B:167:0x03c1, B:175:0x03e5, B:118:0x031a, B:163:0x03bb), top: B:194:0x02a5, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026c A[Catch: all -> 0x0278, TRY_LEAVE, TryCatch #9 {all -> 0x0278, blocks: (B:80:0x025e, B:82:0x026c, B:92:0x027d, B:94:0x028b, B:95:0x028e), top: B:209:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028b A[Catch: all -> 0x0278, TryCatch #9 {all -> 0x0278, blocks: (B:80:0x025e, B:82:0x026c, B:92:0x027d, B:94:0x028b, B:95:0x028e), top: B:209:0x0194 }] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int, r07] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(j07 j07Var, sb5 sb5Var, kb4 kb4Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.u = j07Var;
        this.v = sb5Var;
        this.w = kb4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(rab rabVar, Map map, jt1 jt1Var) {
        super(2, jt1Var);
        this.v = rabVar;
        this.w = map;
    }
}
