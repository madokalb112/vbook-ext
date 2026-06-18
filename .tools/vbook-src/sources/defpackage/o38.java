package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o38 extends m0 implements h11, w29 {
    public final ir0 f;

    public o38(jx1 jx1Var, ir0 ir0Var) {
        super(jx1Var, true);
        this.f = ir0Var;
    }

    @Override // defpackage.h11
    public final d09 b() {
        return this.f.b();
    }

    @Override // defpackage.h11
    public final d09 c() {
        return this.f.c();
    }

    @Override // defpackage.pe5, defpackage.yd5
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new zd5(this, u(), null);
        }
        s(cancellationException);
    }

    @Override // defpackage.h11
    public final Object e() {
        return this.f.e();
    }

    @Override // defpackage.h11
    public final Object f(qi qiVar) {
        ir0 ir0Var = this.f;
        ir0Var.getClass();
        return ir0.L(ir0Var, qiVar);
    }

    @Override // defpackage.w29
    public final Object g(jt1 jt1Var, Object obj) {
        return this.f.g(jt1Var, obj);
    }

    @Override // defpackage.w29
    public final boolean h(Throwable th) {
        return this.f.o(false, th);
    }

    @Override // defpackage.h11
    public final br0 iterator() {
        ir0 ir0Var = this.f;
        ir0Var.getClass();
        return new br0(ir0Var);
    }

    @Override // defpackage.h11
    public final Object j(o1a o1aVar) {
        ir0 ir0Var = this.f;
        ir0Var.getClass();
        return ir0.K(ir0Var, o1aVar);
    }

    @Override // defpackage.w29
    public final Object k(Object obj) {
        return this.f.k(obj);
    }

    @Override // defpackage.m0
    public final void o0(boolean z, Throwable th) {
        if (this.f.o(false, th) || z) {
            return;
        }
        qx1.y(this.e, th);
    }

    @Override // defpackage.m0
    public final void q0(Object obj) {
        this.f.h(null);
    }

    @Override // defpackage.pe5
    public final void s(CancellationException cancellationException) {
        CancellationException cancellationExceptionH0 = pe5.h0(this, cancellationException);
        this.f.o(true, cancellationExceptionH0);
        r(cancellationExceptionH0);
    }
}
