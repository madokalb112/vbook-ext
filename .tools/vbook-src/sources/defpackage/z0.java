package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z0 implements Runnable {
    public final j1 a;
    public final ListenableFuture b;

    public z0(j1 j1Var, ListenableFuture listenableFuture) {
        this.a = j1Var;
        this.b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.a;
        if (j1Var.value != this) {
            return;
        }
        if (j1.ATOMIC_HELPER.b(j1Var, this, j1.f(this.b))) {
            j1.c(j1Var, false);
        }
    }
}
