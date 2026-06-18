package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fr8 extends kt1 implements c24 {
    public final c24 a;
    public final jx1 b;
    public final int c;
    public jx1 d;
    public jt1 e;

    public fr8(c24 c24Var, jx1 jx1Var) {
        super(di1.c, hc3.a);
        this.a = c24Var;
        this.b = jx1Var;
        this.c = ((Number) jx1Var.fold(0, new qp6(21))).intValue();
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        try {
            Object objM = m(jt1Var, obj);
            return objM == xx1.a ? objM : heb.a;
        } catch (Throwable th) {
            this.d = new w13(jt1Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.vc0, defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = this.e;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.kt1, defpackage.jt1
    public final jx1 getContext() {
        jx1 jx1Var = this.d;
        return jx1Var == null ? hc3.a : jx1Var;
    }

    @Override // defpackage.vc0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Throwable thA = qm8.a(obj);
        if (thA != null) {
            this.d = new w13(getContext(), thA);
        }
        jt1 jt1Var = this.e;
        if (jt1Var != null) {
            jt1Var.resumeWith(obj);
        }
        return xx1.a;
    }

    public final Object m(jt1 jt1Var, Object obj) {
        jx1 context = jt1Var.getContext();
        qx1.s(context);
        jx1 jx1Var = this.d;
        if (jx1Var != context) {
            if (jx1Var instanceof w13) {
                throw new IllegalStateException(cw9.t("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((w13) jx1Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new w27(this, 4))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = jt1Var;
        zb4 zb4Var = hr8.a;
        c24 c24Var = this.a;
        c24Var.getClass();
        Object objC = zb4Var.c(c24Var, obj, this);
        if (!lc5.Q(objC, xx1.a)) {
            this.e = null;
        }
        return objC;
    }
}
