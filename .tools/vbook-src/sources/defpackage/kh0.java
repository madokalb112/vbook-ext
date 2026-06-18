package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kh0 extends m0 {
    public final Thread f;
    public final zg3 s;

    public kh0(jx1 jx1Var, Thread thread, zg3 zg3Var) {
        super(jx1Var, true);
        this.f = thread;
        this.s = zg3Var;
    }

    @Override // defpackage.pe5
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f;
        if (lc5.Q(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
