package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o07 extends o1a implements yb4 {
    public r07 a;
    public Object b;
    public Object c;
    public p07 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ j07 s;
    public final /* synthetic */ p07 t;
    public final /* synthetic */ yb4 u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o07(j07 j07Var, p07 p07Var, yb4 yb4Var, Object obj, jt1 jt1Var) {
        super(2, jt1Var);
        this.s = j07Var;
        this.t = p07Var;
        this.u = yb4Var;
        this.v = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        o07 o07Var = new o07(this.s, this.t, this.u, this.v, jt1Var);
        o07Var.f = obj;
        return o07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((o07) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.vc0
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 2
            r2 = 1
            r3 = 0
            xx1 r4 = defpackage.xx1.a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.b
            p07 r0 = (p07) r0
            r07 r1 = r8.a
            java.lang.Object r8 = r8.f
            m07 r8 = (m07) r8
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r3
        L25:
            p07 r0 = r8.d
            java.lang.Object r2 = r8.c
            java.lang.Object r5 = r8.b
            yb4 r5 = (defpackage.yb4) r5
            r07 r6 = r8.a
            java.lang.Object r7 = r8.f
            m07 r7 = (m07) r7
            defpackage.e11.e0(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.e11.e0(r9)
            java.lang.Object r9 = r8.f
            vx1 r9 = (defpackage.vx1) r9
            m07 r0 = new m07
            jx1 r9 = r9.q()
            s00 r5 = defpackage.s00.s
            hx1 r9 = r9.get(r5)
            r9.getClass()
            yd5 r9 = (defpackage.yd5) r9
            j07 r5 = r8.s
            r0.<init>(r5, r9)
            p07 r9 = r8.t
            p07.a(r9, r0)
            t07 r5 = r9.b
            r8.f = r0
            r8.a = r5
            yb4 r6 = r8.u
            r8.b = r6
            java.lang.Object r7 = r8.v
            r8.c = r7
            r8.d = r9
            r8.e = r2
            java.lang.Object r2 = r5.p(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.f = r0     // Catch: java.lang.Throwable -> La5
            r8.a = r5     // Catch: java.lang.Throwable -> La5
            r8.b = r9     // Catch: java.lang.Throwable -> La5
            r8.c = r3     // Catch: java.lang.Throwable -> La5
            r8.d = r3     // Catch: java.lang.Throwable -> La5
            r8.e = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.q(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.q(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
