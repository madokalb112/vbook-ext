package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aeb extends fv8 {
    public final ThreadLocal s;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public aeb(jt1 jt1Var, jx1 jx1Var) {
        ey0 ey0Var = ey0.c;
        super(jt1Var, jx1Var.get(ey0Var) == null ? jx1Var.plus(ey0Var) : jx1Var);
        this.s = new ThreadLocal();
        if (jt1Var.getContext().get(g83.d) instanceof nx1) {
            return;
        }
        Object objC = gsa.c(jx1Var, null);
        gsa.a(jx1Var, objC);
        v0(jx1Var, objC);
    }

    @Override // defpackage.fv8, defpackage.pe5
    public final void n(Object obj) {
        u0();
        Object objE0 = gc1.e0(obj);
        jt1 jt1Var = this.f;
        jx1 context = jt1Var.getContext();
        Object objC = gsa.c(context, null);
        aeb aebVarB0 = objC != gsa.a ? lx1.B0(jt1Var, context, objC) : null;
        try {
            jt1Var.resumeWith(objE0);
            if (aebVarB0 == null || aebVarB0.t0()) {
                gsa.a(context, objC);
            }
        } catch (Throwable th) {
            if (aebVarB0 == null || aebVarB0.t0()) {
                gsa.a(context, objC);
            }
            throw th;
        }
    }

    @Override // defpackage.fv8
    public final void s0() {
        u0();
    }

    public final boolean t0() {
        boolean z = this.threadLocalIsSet && this.s.get() == null;
        this.s.remove();
        return !z;
    }

    public final void u0() {
        if (this.threadLocalIsSet) {
            xl7 xl7Var = (xl7) this.s.get();
            if (xl7Var != null) {
                gsa.a((jx1) xl7Var.a, xl7Var.b);
            }
            this.s.remove();
        }
    }

    public final void v0(jx1 jx1Var, Object obj) {
        this.threadLocalIsSet = true;
        this.s.set(new xl7(jx1Var, obj));
    }
}
