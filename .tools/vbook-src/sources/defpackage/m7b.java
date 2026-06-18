package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m7b extends e44 implements RunnableFuture {
    public volatile xb5 b;

    public m7b(Callable callable) {
        this.b = new l7b(this, callable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void afterDone() {
        xb5 xb5Var;
        super/*j1*/.afterDone();
        if (wasInterrupted() && (xb5Var = this.b) != null) {
            xb5Var.c();
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String pendingToString() {
        xb5 xb5Var = this.b;
        if (xb5Var == null) {
            return super/*j1*/.pendingToString();
        }
        return "task=[" + xb5Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        xb5 xb5Var = this.b;
        if (xb5Var != null) {
            xb5Var.run();
        }
        this.b = null;
    }
}
