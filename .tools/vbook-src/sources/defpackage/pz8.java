package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class pz8 extends nn1 implements t77 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(pz8.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public pz8(long j, pz8 pz8Var, int i) {
        super(pz8Var);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.nn1
    public final boolean g() {
        return f.get(this) == l() && d() != null;
    }

    public final boolean k() {
        return f.addAndGet(this, -65536) == l() && d() != null;
    }

    public abstract int l();

    public abstract void m(int i, jx1 jx1Var);

    public final void n() {
        if (f.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, Parser.ARGC_LIMIT + i));
        return true;
    }
}
