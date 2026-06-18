package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hl2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl2(Object obj, Object obj2, Object obj3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public static final void m(AtomicBoolean atomicBoolean, rg8 rg8Var) {
        q5 q5Var;
        if (!atomicBoolean.compareAndSet(false, true) || (q5Var = (q5) rg8Var.a) == null) {
            return;
        }
        try {
            q5Var.b();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0039, B:19:0x0041, B:20:0x004f, B:26:0x005d, B:14:0x002c, B:28:0x0060, B:30:0x0065, B:31:0x0066, B:13:0x0026, B:21:0x0050, B:23:0x0056), top: B:40:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:17:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            xx1 r0 = defpackage.xx1.a
            int r1 = r7.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L18
            java.lang.Object r1 = r7.e
            br0 r1 = (defpackage.br0) r1
            java.lang.Object r4 = r7.d
            h11 r4 = (defpackage.h11) r4
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L16
            goto L39
        L16:
            r7 = move-exception
            goto L6d
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L1e:
            defpackage.e11.e0(r8)
            java.lang.Object r8 = r7.c
            r4 = r8
            ir0 r4 = (defpackage.ir0) r4
            br0 r8 = new br0     // Catch: java.lang.Throwable -> L16
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L16
            r1 = r8
        L2c:
            r7.d = r4     // Catch: java.lang.Throwable -> L16
            r7.e = r1     // Catch: java.lang.Throwable -> L16
            r7.b = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r1.a(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L39
            return r0
        L39:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L67
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L16
            heb r8 = (defpackage.heb) r8     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r8 = bg4.b     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = vj9.c     // Catch: java.lang.Throwable -> L16
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L16
            ag4 r6 = vj9.j     // Catch: java.lang.Throwable -> L64
            uz6 r6 = r6.h     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L5d
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L64
            if (r6 != r3) goto L5d
            r5 = r3
        L5d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L2c
            vj9.a()     // Catch: java.lang.Throwable -> L16
            goto L2c
        L64:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r7     // Catch: java.lang.Throwable -> L16
        L67:
            r4.cancel(r2)
            heb r7 = defpackage.heb.a
            return r7
        L6d:
            throw r7     // Catch: java.lang.Throwable -> L6e
        L6e:
            r8 = move-exception
            defpackage.kl8.P(r4, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl2.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        int i = this.b;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        owb owbVar = (owb) this.d;
        String str = (String) this.e;
        String str2 = (String) this.c;
        this.b = 1;
        owbVar.a.loadData(str, "text/html", str2);
        xx1 xx1Var = xx1.a;
        return hebVar == xx1Var ? xx1Var : hebVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new hl2((jl2) obj2, jt1Var, 0);
            case 1:
                return new hl2((oq9) this.d, (oq9) this.e, (jl2) obj2, jt1Var, 1);
            case 2:
                hl2 hl2Var = new hl2((xz2) this.e, (bi5) obj2, jt1Var, 2);
                hl2Var.d = obj;
                return hl2Var;
            case 3:
                return new hl2((xz2) this.d, (String) this.e, (String) obj2, jt1Var, 3);
            case 4:
                hl2 hl2Var2 = new hl2((r33) this.e, (j43) obj2, jt1Var, 4);
                hl2Var2.d = obj;
                return hl2Var2;
            case 5:
                hl2 hl2Var3 = new hl2((j43) this.e, (v23) obj2, jt1Var, 5);
                hl2Var3.d = obj;
                return hl2Var3;
            case 6:
                return new hl2((st5) this.d, (a07) this.e, (br9) obj2, jt1Var, 6);
            case 7:
                return new hl2((wq5) this.d, (a07) this.e, (String) obj2, jt1Var, 7);
            case 8:
                hl2 hl2Var4 = new hl2((za3) this.e, (String) obj2, jt1Var, 8);
                hl2Var4.d = obj;
                return hl2Var4;
            case 9:
                hl2 hl2Var5 = new hl2((zb4) this.e, obj2, jt1Var, 9);
                hl2Var5.d = obj;
                return hl2Var5;
            case 10:
                hl2 hl2Var6 = new hl2((b24) this.e, (zb4) obj2, jt1Var, 10);
                hl2Var6.d = obj;
                return hl2Var6;
            case 11:
                return new hl2((mx5) this.d, (b24) this.e, (zb4) obj2, jt1Var, 11);
            case 12:
                return new hl2((kb4) this.e, (bi5) obj2, jt1Var, 12);
            case 13:
                return new hl2((String) this.e, (a07) obj2, jt1Var, 13);
            case 14:
                hl2 hl2Var7 = new hl2((m8) obj2, jt1Var, 14);
                hl2Var7.e = obj;
                return hl2Var7;
            case 15:
                hl2 hl2Var8 = new hl2((pp3) this.e, (String) obj2, jt1Var, 15);
                hl2Var8.d = obj;
                return hl2Var8;
            case 16:
                hl2 hl2Var9 = new hl2((sr3) this.e, (bi5) obj2, jt1Var, 16);
                hl2Var9.d = obj;
                return hl2Var9;
            case 17:
                hl2 hl2Var10 = new hl2((sr3) this.e, (to3) obj2, jt1Var, 17);
                hl2Var10.d = obj;
                return hl2Var10;
            case 18:
                return new hl2((xi1) this.d, (k5) this.e, (l02) obj2, jt1Var, 18);
            case 19:
                return new hl2((wt7) this.e, (kb4) obj2, jt1Var, 19);
            case 20:
                hl2 hl2Var11 = new hl2((ta5) this.e, (n14) obj2, jt1Var, 20);
                hl2Var11.d = obj;
                return hl2Var11;
            case 21:
                hl2 hl2Var12 = new hl2((zb4) this.e, (c24) obj2, jt1Var, 21);
                hl2Var12.d = obj;
                return hl2Var12;
            case 22:
                hl2 hl2Var13 = new hl2((px5) this.e, (b24) obj2, jt1Var, 22);
                hl2Var13.d = obj;
                return hl2Var13;
            case 23:
                return new hl2((yy6) this.d, (sa5) this.e, (ax2) obj2, jt1Var, 23);
            case 24:
                return new hl2((r64) this.e, (String) obj2, jt1Var, 24);
            case 25:
                hl2 hl2Var14 = new hl2((m84) this.e, (String) obj2, jt1Var, 25);
                hl2Var14.d = obj;
                return hl2Var14;
            case 26:
                return new hl2((zx7) this.d, (y91) this.e, (rg8) obj2, jt1Var, 26);
            case 27:
                return new hl2((ir0) obj2, jt1Var, 27);
            case 28:
                return new hl2((owb) this.d, (String) this.e, (String) obj2, jt1Var, 28);
            default:
                return new hl2((ro4) this.d, (String) this.e, (String) obj2, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
        }
        return ((hl2) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0309, code lost:
    
        if (r2 == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03f1, code lost:
    
        if (((defpackage.cq3) r0).b(r4, r16) == r2) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x044a, code lost:
    
        if (defpackage.sr3.k(r0, r16) != r2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0541, code lost:
    
        if (r1 == r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0564, code lost:
    
        if (r1 == r2) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0786, code lost:
    
        if (defpackage.pu1.D(r1, r3 + 1, r16) == r0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0791, code lost:
    
        if (r1.f(0, 0, r16) == r0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0933, code lost:
    
        if (r1.join(r16) == r0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x09a3, code lost:
    
        if (r0 != r14) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x09eb, code lost:
    
        if (defpackage.qn9.j(r9, r16) == r14) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0a0f, code lost:
    
        if (defpackage.qn9.j(r9, r16) != r14) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0a2a, code lost:
    
        if (defpackage.qn9.j(r9, r16) != r14) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0a37, code lost:
    
        if (defpackage.qn9.j(r9, r16) != r14) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [jl2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v55, types: [ke4] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl2(Object obj, Object obj2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.e = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl2(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
