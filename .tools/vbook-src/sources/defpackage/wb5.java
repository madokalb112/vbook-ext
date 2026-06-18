package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wb5 extends AbstractOwnableSynchronizer implements Runnable {
    public final xb5 a;

    public wb5(xb5 xb5Var) {
        this.a = xb5Var;
    }

    public static void a(wb5 wb5Var, Thread thread) {
        wb5Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
