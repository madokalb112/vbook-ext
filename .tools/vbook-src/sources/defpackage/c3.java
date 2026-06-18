package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c3 extends e3 {
    @Override // defpackage.e3
    public final Object h(Object obj, Object obj2) {
        dx dxVar = (dx) obj;
        ListenableFuture listenableFutureApply = dxVar.apply(obj2);
        fx1.M(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dxVar);
        return listenableFutureApply;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e3
    public final void i(Object obj) {
        setFuture((ListenableFuture) obj);
    }
}
