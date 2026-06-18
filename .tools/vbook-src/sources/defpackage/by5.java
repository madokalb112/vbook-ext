package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class by5 extends nx1 implements im2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(by5.class, "runningWorkers$volatile");
    public final /* synthetic */ im2 c;
    public final nx1 d;
    public final int e;
    public final o36 f;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final Object s;

    /* JADX WARN: Multi-variable type inference failed */
    public by5(nx1 nx1Var, int i) {
        im2 im2Var = nx1Var instanceof im2 ? (im2) nx1Var : null;
        this.c = im2Var == null ? pg2.a : im2Var;
        this.d = nx1Var;
        this.e = i;
        this.f = new o36();
        this.s = new Object();
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        Runnable runnableP0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !x0() || (runnableP0 = p0()) == null) {
            return;
        }
        try {
            lw2.b(this.d, this, new oc4(this, false, runnableP0, 4));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.nx1
    public final void N(jx1 jx1Var, Runnable runnable) {
        Runnable runnableP0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !x0() || (runnableP0 = p0()) == null) {
            return;
        }
        try {
            this.d.N(this, new oc4(this, false, runnableP0, 4));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        qx1.r(i);
        return i >= this.e ? this : super.e0(i);
    }

    @Override // defpackage.im2
    public final ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        return this.c.p(j, runnable, jx1Var);
    }

    public final Runnable p0() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.im2
    public final void q(long j, ay0 ay0Var) {
        this.c.q(j, ay0Var);
    }

    @Override // defpackage.nx1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return tw2.p(sb, this.e, ')');
    }

    public final boolean x0() {
        synchronized (this.s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
