package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h8 extends sdc {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicIntegerFieldUpdater B;

    public h8(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.A = atomicReferenceFieldUpdater;
        this.B = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.sdc
    public final void g0(ue1 ue1Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.A;
            if (atomicReferenceFieldUpdater.compareAndSet(ue1Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(ue1Var) == null);
    }

    @Override // defpackage.sdc
    public final int h0(ue1 ue1Var) {
        return this.B.decrementAndGet(ue1Var);
    }
}
