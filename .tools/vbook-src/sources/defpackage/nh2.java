package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nh2 extends ki3 implements Executor {
    public static final nh2 c = new nh2();
    public static final nx1 d;

    static {
        qeb qebVar = qeb.c;
        int i = f7a.a;
        if (64 >= i) {
            i = 64;
        }
        d = qebVar.e0(ym9.k(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        d.A(jx1Var, runnable);
    }

    @Override // defpackage.nx1
    public final void N(jx1 jx1Var, Runnable runnable) {
        d.N(jx1Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        return qeb.c.e0(i);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A(hc3.a, runnable);
    }

    @Override // defpackage.nx1
    public final String toString() {
        return "Dispatchers.IO";
    }
}
