package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r extends t {
    @Override // defpackage.t
    public final Object h(Throwable th, Object obj) {
        dx dxVar = (dx) obj;
        ListenableFuture listenableFutureApply = dxVar.apply(th);
        fx1.M(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dxVar);
        return listenableFutureApply;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t
    public final void i(Object obj) {
        setFuture((ListenableFuture) obj);
    }
}
