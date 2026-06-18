package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y0 extends t0 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.t0
    public final boolean a(j1 j1Var, x0 x0Var, x0 x0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, x0Var, x0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == x0Var);
        return false;
    }

    @Override // defpackage.t0
    public final boolean b(j1 j1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == obj);
        return false;
    }

    @Override // defpackage.t0
    public final boolean c(j1 j1Var, i1 i1Var, i1 i1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, i1Var, i1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == i1Var);
        return false;
    }

    @Override // defpackage.t0
    public final x0 d(j1 j1Var) {
        return (x0) this.d.getAndSet(j1Var, x0.d);
    }

    @Override // defpackage.t0
    public final i1 e(j1 j1Var) {
        return (i1) this.c.getAndSet(j1Var, i1.c);
    }

    @Override // defpackage.t0
    public final void f(i1 i1Var, i1 i1Var2) {
        this.b.lazySet(i1Var, i1Var2);
    }

    @Override // defpackage.t0
    public final void g(i1 i1Var, Thread thread) {
        this.a.lazySet(i1Var, thread);
    }
}
