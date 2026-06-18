package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class nw2 extends eaa {
    public int c;

    public nw2(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract jt1 e();

    public Throwable f(Object obj) {
        ei1 ei1Var = obj instanceof ei1 ? (ei1) obj : null;
        if (ei1Var != null) {
            return ei1Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        qx1.y(e().getContext(), new cy1("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            jt1 jt1VarE = e();
            jt1VarE.getClass();
            kw2 kw2Var = (kw2) jt1VarE;
            kt1 kt1Var = kw2Var.e;
            Object obj = kw2Var.s;
            jx1 context = kt1Var.getContext();
            Object objC = gsa.c(context, obj);
            yd5 yd5Var = null;
            aeb aebVarB0 = objC != gsa.a ? lx1.B0(kt1Var, context, objC) : null;
            try {
                jx1 context2 = kt1Var.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        yd5Var = (yd5) context2.get(s00.s);
                    }
                }
                if (yd5Var != null && !yd5Var.isActive()) {
                    CancellationException cancellationException = yd5Var.getCancellationException();
                    c(cancellationException);
                    kt1Var.resumeWith(e11.I(cancellationException));
                } else if (thF != null) {
                    kt1Var.resumeWith(new pm8(thF));
                } else {
                    kt1Var.resumeWith(g(objJ));
                }
                if (aebVarB0 == null || aebVarB0.t0()) {
                    gsa.a(context, objC);
                }
            } catch (Throwable th) {
                if (aebVarB0 == null || aebVarB0.t0()) {
                    gsa.a(context, objC);
                }
                throw th;
            }
        } catch (jw2 e) {
            qx1.y(e().getContext(), e.a);
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
